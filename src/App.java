public class App {
    public static void main(String[] args) throws Exception {
        int[] listaInicial = new int[5];
        listaInicial[0] = 1;
        listaInicial[1] = 2;
        listaInicial[2] = 3;
        listaInicial[3] = 4;
        listaInicial[4] = 5;

        int[] listaAlterada = pop(listaInicial, 4);
        
        for(int i = 0; i < listaAlterada.length; i ++){
            System.out.println(listaAlterada[i]);
        }
        

    }

    public static int[] pop(int[] array){
        int[] listaAlterada = new int[array.length - 1];
        System.out.println("Ultimo item da lista: " + array[array.length - 1]);

        for(int i = 0; i < array.length - 1; i++){
            listaAlterada[i] = array[i];
        }

        return listaAlterada;
    }

    public static int[] pop(int [] array, int indice){
        System.out.println("Elemento a ser removido: " + array[indice]);
        int[] listaAlterada = new int[array.length];

        for(int i = 0; i < array.length; i ++){
            if(i != indice){
                listaAlterada[i] = array[i]; 
            } 
        }

        int[] listaAlteradaConcluida = new int[listaAlterada.length - 1];

        int iParalelo = 0;

        for (int i = 0; i < listaAlterada.length; i++) {
            if (i != indice) {
                listaAlteradaConcluida[iParalelo] = listaAlterada[i];
                iParalelo++;
            }
        }


        return listaAlteradaConcluida;
    }
}
