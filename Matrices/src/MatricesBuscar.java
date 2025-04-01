public class MatricesBuscar {
    public static void main(String[] args) {
        int [][] matrizEnteros ={
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
        };
        int elementoBuscar= 23;
        boolean existe=false;

        buscar: for(int i=0;i<matrizEnteros.length;i++){
            for(int j=0;j<matrizEnteros[i].length;j++){
                if(matrizEnteros[i][j]==elementoBuscar){
                    existe=true;
                    break buscar;
                }
            }
        }
    }
}
