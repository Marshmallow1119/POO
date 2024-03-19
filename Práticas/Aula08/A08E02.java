package Aula08;

public class A08E02 {

    public static void main(String[] args) {
        Ementa ementa = new Ementa("Especial Primavera", "Snack da UA");
        prato[] pratos = new prato[7];
        for (int i = 0; i < pratos.length; i++) {
            pratos[i] = randPrato(i + 1);
            System.out.println("A sair .. " + pratos[i].toString());

            // Adiciona 2 ingredientes a cada prato
            int ingred = 1;
            do {
                alimento alimen = randAlimento();
                if (pratos[i].addIngrediente(alimen)) {
                    System.out.println("\tIngrediente " + ingred + " adicionado: " + alimen);
                    ingred++;
                }else
                    System.out.println("\tERRO: não é possível adicionar Ingrediente " + ingred + ": " + alimen);
            } while (ingred < 3);

            ementa.addPrato(pratos[i]);
        }
        System.out.println("\nEmenta final\n--------------------");
        System.out.println(ementa);
    }

    public static alimento randAlimento() {
        alimento res = null;
        switch ((int)(Math.random() *4+1)) {
            case 0:
                res = new peixe(variedadePeixe.congelado, 31.3, 25.3, 200);
                break;
            case 1:
                res = new peixe(variedadePeixe.congelado, 31.3, 25.3, 200);
                break;
            case 2:
                res = new Carne(variedadeCarne.frango, 22.3, 345.3, 300);
                break;
            case 3:
                res = new legume("Couve Flor", 21.3, 22.4, 150);
                break;
            case 4:
                res = new cereal("Milho", 19.3, 32.4, 110);
                break;
        }
        return res;
    }

    public static prato randPrato(int i) {
        prato res = null;
        switch ((int)(Math.random()*3+1)) {
            case 0:
                res = new prato("combinado n." + i);
                break;
            case 1:
                res=new prato("combinado n." + i);
                break;
            case 2:
                res = new praatovegetariano("combinado n." + i);
                break;
            case 3:
                res = new pratoDieta("combinado n." + i, 90.8);
                break;
        }
        return res;
    }

}
