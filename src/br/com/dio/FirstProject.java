package br.com.dio;

import br.com.dio.model.gato;
import sun.security.mscapi.CPublicKey;

public class FirstProject {
    public static void main(String[] args) {
        gato gato = new gato();
        livro livro1 = new livro("Victor Hugo", "1500");
        System.out.println(gato);
        System.out.println(livro1);
        /*int a,b;
        a=5;
        b=3;
        System.out.println("hello world !!" + (a+b)); ctrl shift /
*/

    }

    public static class livro {
        private String autor;
        private String npag;

        public livro(String autor, String npag) {
            this.autor = autor;
            this.npag = npag;
        }

        public String getAutor() {
            return autor;
        }

        public void setAutor(String autor) {
            this.autor = autor;
        }

        public String getNpag() {
            return npag;
        }

        public void setNpag(String npag) {
            this.npag = npag;
        }

        @Override
        public String toString() {
            return "livro{" +
                    "autor='" + autor + '\'' +
                    ", npag=" + npag +
                    '}';
        }
    }
}



