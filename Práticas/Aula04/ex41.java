package Aula04;

import utils.UserInput;

public class ex41 {
    public static void main(String[] args){
      int indice=0;
      int op;
      Object[] obj=new Object[10];

      
      /*  circulo[] circulo= new circulo[3];
     circulo[0]=new circulo(3);
     circulo[1]=new circulo(4);
     circulo[2]=new circulo(4);
     for(int i=0;i<circulo.length;i++){
        System.out.println(circulo[i].toString());
        System.out.println(circulo[i].equals(circulo[2]));
     }
     retangulo[] retangulo=new retangulo[3];
     retangulo[0]=new retangulo(3,2);
     retangulo[1]=new retangulo(4,4);
     retangulo[2]=new retangulo(4,1);
     for(int i=0;i<retangulo.length;i++){
        System.out.println(retangulo[i].toString());
        System.out.println(retangulo[i].equals(retangulo[2]));
     }

     triangulo[] t=new triangulo[3];
     t[0]=new triangulo(3,2,1);
     t[1]=new triangulo(4,3,5);
     t[2]=new triangulo(4,5,9);
     for(int i=0;i<triangulo.length;i++){
        System.out.println(t[i].toString());
        System.out.println(t[i].equals(t[2]));
     }*/


   do{
      System.out.println("      Menu      ");
      System.out.println("1-Criar circulo");
      System.out.println("2-Criar triângulo");
      System.out.println("3-Criar retângulo");
      System.out.println("4-Comparar figuras");
      System.out.println("5-Listar figuras");
      System.out.println("6-Sair");
      
      op=UserInput.Validar(1, 6);

      switch(op){
      case 1:
      System.out.println("    Raio  ");
      double raio=UserInput.isPositiveDouble();
      circulo c=new circulo(raio);
      obj[indice++]=c;
      System.out.println(c.toString());
      break;

      case 2:
      System.out.println("    Lado1  ");
      double lado1=UserInput.isPositiveDouble();
      System.out.println("    Lado2  ");
      double lado2=UserInput.isPositiveDouble();
      System.out.println("    Lado3  ");
      double lado3=UserInput.isPositiveDouble();
      triangulo t=new triangulo(lado1,lado2,lado3);
      obj[indice++]=t;
      System.out.println(t.toString());
      break;

      case 3:
      System.out.println("    Comprimento  ");
      double comprimento=UserInput.isPositiveDouble();
      System.out.println("    Altura  ");
      double altura=UserInput.isPositiveDouble();
      
      retangulo r=new retangulo(comprimento,altura);
      obj[indice++]=r;
      System.out.println(r.toString());
      break;

      case 4:
         System.out.println();
         int input1 = UserInput.isPositive();
         int input2 = UserInput.isPositive();
         System.out.println();
         if (obj[input1].equals(obj[input2]))
             System.out.println("Os objetos são iguais!");
         else
             System.out.println("Os objetos são diferentes!");
         System.out.println();
         break;

      case 5:
      for(int i=0;i<=obj.length;i++){
         if(obj[i]==null){
            break;
         }
         System.out.println(i+" - "+obj[i]);
      }
      break;
   }
}while(op!=6);
      System.out.println("THANK YOU");
      
   }
}
 