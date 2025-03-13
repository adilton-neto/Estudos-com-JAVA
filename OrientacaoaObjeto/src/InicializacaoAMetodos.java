public class InicializacaoAMetodos {
        public static void main(String[] args) {
            //Metodos servem para criar blocos de codigos para função especifica dentro da minha classe.

            //criando um objeto para referenciar o metodo Carro;
            InicializacaoAMetodos var = new InicializacaoAMetodos();
            var.carro();
            //ja aqui não precisa pois o metodo pessoa já é estatico "static";
            pessoa();
            //metodos
            var.metodos();


        }
        // Sem static
        public void carro(){
            System.out.println("Primeiro metodo");

        }
        //metodo com static
        public static void pessoa(){
            System.out.println("Segundno metodo - de maneira static");
        }
        public void metodos(){
            System.out.println("   4 - tipos de metodos:");
            System.out.println("1. metodo sem retorno e sem parametro, \n" +
                    "2. metodo sem retorno e com parametro, \n" +
                    "3. metodo com retorno e sem parametro, \n" +
                    "4. metodo com retorno e com parametro; ");

        }

    }

