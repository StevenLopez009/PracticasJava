public class MatrizSimetrica {
    public static void main(String[] args) {
        boolean simetrica = true;
        int[][] matrizSimetrica ={
                {1,2,3,4},
                {2,1,0,5},
                {3,0,1,6},
                {4,5,6,7}
        };
        int i,j;
        i=0;
        salir:while(i<matrizSimetrica.length && simetrica){
            j=0;
            while(j<i && simetrica) {
                if(matrizSimetrica[i][j] != matrizSimetrica[j][i]){
                    simetrica = false;
                    break salir;
                }
                j++;
            }
            i++;
        }
    }
}
