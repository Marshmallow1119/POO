package Aula07;

public abstract class forma {
       
        private String cor;

        public forma(String cor) {
            this.cor = cor;
        }
        public String getCor() {
            return cor;
        }
        public void setCor(String cor) {
            this.cor = cor;
        }
        public abstract double area();
        public abstract double perimetro();

        public boolean equals(forma f){
            if(f==this)
                return true;
            if(this.cor.equals(f.cor)){
                return true;
            }
            return false;
            
        }
}

