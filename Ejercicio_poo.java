public class Ejercicio_poo {

        public static void main(String[] args) {
                
                Libro libro1 = new Libro(23344565, "La oyetas mamor", "Jose Celeita", 140);
                Libro libro2 = new Libro(23448780, "El mundo de los perros", "Camila Bohorquez", 230);


                System.out.println(libro1.toString());
                System.out.println(libro2.toString());

                if(libro1.GetNumeroDePaginas() > libro2.GetNumeroDePaginas()) {
                        System.out.println("El libro que tiene mas paginas es: " + libro1.GetTitulo());
                }else {
                        System.out.println("El libro que tiene mas paginas es:" + libro2.GetTitulo());
                }
        }
}
