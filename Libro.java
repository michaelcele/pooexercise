public class Libro {
        private int isbn;
        private String titulo;
        private String autor;
        private int numeroDePaginas;

        public Libro(int isbn, String titulo, String autor, int numeroDePaginas){
                this.isbn = isbn;
                this.titulo = titulo;
                this.autor = autor;
                this.numeroDePaginas = numeroDePaginas;
        }

                public void SetIsbn(int isbn) {
                       this.isbn = isbn; 
                }

                public int GetIsbn() {
                        return isbn;
                }
                public void SetTitulo(String titulo) {
                       this.titulo = titulo; 
                }

                public String GetTitulo() {
                        return titulo;
                }
                public void SetAutor(String autor) {
                       this.autor = autor; 
                }

                public String GetAutor() {
                        return autor;
                }
                public void SetNumeroDePaginas(int numeroDePaginas) {
                       this.numeroDePaginas = numeroDePaginas; 
                }

                public int GetNumeroDePaginas() {
                        return numeroDePaginas;
                }

                public String toString() {
                        return "El libro " + GetTitulo() + " con ISBN " + GetIsbn() + " creado por el autor " + GetAutor() + " tiene " + GetNumeroDePaginas() + " paginas.";
                }
}

