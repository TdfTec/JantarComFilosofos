package jantarcomfilosofos;

import java.util.logging.Logger;
import java.util.Random;
import java.util.logging.Level;
public class Filosofos {

    public void SorteioDireita() {

        int garfoDireita;
        Random d = new Random();
        garfoDireita = d.nextInt(5);

        System.out.println("O garfo da direita sorteado:  " + garfoDireita);

    }

    private void SorteioEsquerda() {

        int garfoEsquerda;
        Random d = new Random();
        garfoEsquerda = d.nextInt(5);

        System.out.println("O garfo da esquerda sorteado:  " + garfoEsquerda);
    }

    public class Garfos extends Thread {

        private final int garfoEsquerda;
        private final int garfoDireita;

        public Garfos(int garfoEsquerda, int garfoDireita) {

            this.garfoDireita = garfoDireita;
            this.garfoEsquerda = garfoEsquerda;
        }
    }

    public void run() {
        while (true) {
            try {
                SorteioDireita();
                SorteioEsquerda();
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                System.out.println(ex);
            }
        }
    }

    public class Filosofo extends Thread {

        String nome;
        Garfos garfos;
        int lugarNaMesa;

        public Filosofo(String nome, Garfos garfos, int lugarNaMesa) {
            this.nome = nome;
            this.garfos = garfos;
            this.lugarNaMesa = lugarNaMesa;

            System.out.println("O filosofo " + nome + " sentou na mesa.");

        }

        public void Pensar() throws InterruptedException {
            System.out.println("O filosofo " + nome + " está pensando .");
            Thread.sleep(1000);
        }

        @Override
        public void run() {

            while (true) {
                if (garfos.garfoDireita == 5) {
                    System.out.println("O filósofo " + nome + " pegou o garfo. " + garfos.garfoDireita);
                    if (garfos.garfoEsquerda == 1) {
                        System.out.println("O filósofo " + nome + " pegou o garfo. " + garfos.garfoEsquerda);
                        System.out.println("O filósofo " + nome + " está comendo. ");
                        System.out.println("O filósofo " + nome + " largou garfo da direita");
                        System.out.println("O filósofo " + nome + " largou garfo da esquerda");
                    } else {
                        System.out.println("O filósofo " + nome + " pegou o garfo. " + garfos.garfoDireita);
                    }
                } else {
                    try {
                        Pensar();
                    } catch (InterruptedException ex) {
                        System.out.println(ex);
                    }
                }

                if (garfos.garfoDireita == 1) {

                    System.out.println("O filósofo " + nome + " pegou o garfo. " + garfos.garfoDireita);
                    if (garfos.garfoEsquerda == 2) {
                        System.out.println("O filósofo " + nome + " pegou o garfo. " + garfos.garfoEsquerda);
                        System.out.println("O filósofo " + nome + " está comendo. ");
                        System.out.println("O filósofo " + nome + " largou garfo da direita");
                        System.out.println("O filósofo " + nome + " largou garfo da esquerda");
                    } else {
                        System.out.println("O filósofo " + nome + " Largou o garfo. " + garfos.garfoDireita);
                    }
                } else {
                    try {
                        Pensar();
                    } catch (InterruptedException ex) {
                        System.out.println(ex);
                    }
                }
                if (garfos.garfoDireita == 2) {

                    System.out.println("O filósofo " + nome + " pegou o garfo. " + garfos.garfoDireita);
                    if (garfos.garfoEsquerda == 3) {
                        System.out.println("O filósofo " + nome + " pegou o garfo. " + garfos.garfoEsquerda);
                        System.out.println("O filósofo " + nome + " está comendo. ");
                        System.out.println("O filósofo " + nome + " largou garfo da direita");
                        System.out.println("O filósofo " + nome + " largou garfo da esquerda");
                    } else {
                        System.out.println("O filósofo " + nome + " Largou o garfo. " + garfos.garfoDireita);
                    }
                } else {
                    try {
                        Pensar();
                    } catch (InterruptedException ex) {
                        System.out.println(ex);
                    }
                }

                if (garfos.garfoDireita == 3) {

                    System.out.println("O filósofo " + nome + " pegou o garfo. " + garfos.garfoDireita);
                    if (garfos.garfoEsquerda == 4) {
                        System.out.println("O filósofo " + nome + " pegou o garfo. " + garfos.garfoEsquerda);
                        System.out.println("O filósofo " + nome + " está comendo. ");
                        System.out.println("O filósofo " + nome + " largou garfo da direita");
                        System.out.println("O filósofo " + nome + " largou garfo da esquerda");
                    } else {
                        System.out.println("O filósofo " + nome + " Largou o garfo. " + garfos.garfoDireita);
                    }
                } else {
                    try {
                        Pensar();
                    } catch (InterruptedException ex) {
                        System.out.println(ex);
                    }

                }

                if (garfos.garfoDireita == 4) {

                    System.out.println("O filósofo " + nome + " pegou o garfo. " + garfos.garfoDireita);
                    if (garfos.garfoEsquerda == 5) {
                        System.out.println("O filósofo " + nome + " pegou o garfo. " + garfos.garfoEsquerda);
                        System.out.println("O filósofo " + nome + " está comendo. ");
                        System.out.println("O filósofo " + nome + " largou garfo da direita");
                        System.out.println("O filósofo " + nome + " largou garfo da esquerda");
                    } else {
                        System.out.println("O filósofo " + nome + " Largou o garfo. " + garfos.garfoDireita);
                    }
                } else {
                    try {
                        Pensar();
                    } catch (InterruptedException ex) {
                        System.out.println(ex);
                    }

                }
            }
        }

    }

    public void comer() {
        // instancias de garfos

        Garfos g1 = new Garfos(1, 5);
        Garfos g2 = new Garfos(2, 1);
        Garfos g3 = new Garfos(3, 2);
        Garfos g4 = new Garfos(4, 3);
        Garfos g5 = new Garfos(5, 4);

        //instancia de filosofos
        Filosofo filosofo1 = new Filosofo("Platão", g1, 1);
        Filosofo filosofo2 = new Filosofo("Aristótoles", g2, 2);
        Filosofo filosofo3 = new Filosofo("Socrátis", g3, 3);
        Filosofo filosofo4 = new Filosofo("Descartes", g4, 4);
        Filosofo filosofo5 = new Filosofo("Euclides", g5, 5);
 
        // prioridades dos filosofos
        filosofo1.setPriority(Thread.NORM_PRIORITY);
        filosofo2.setPriority(Thread.MIN_PRIORITY);
        filosofo3.setPriority(Thread.MIN_PRIORITY);
        filosofo4.setPriority(Thread.MAX_PRIORITY);
        filosofo5.setPriority(Thread.NORM_PRIORITY);

        // startando threads
        new Thread(filosofo1).start();
        new Thread(filosofo2).start();
        new Thread(filosofo3).start();
        new Thread(filosofo4).start();
        new Thread(filosofo5).start();

    }
}
