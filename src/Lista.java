public class Lista {
    private int[] array = new int[100];
    private int cantElementos = 0;

    public void agregar(int elemento) {
        if(cantElementos == array.length){
            int[] arrayTemp = new int[array.length+100];
            for(int i = 0; i < array.length;i++){
                arrayTemp[i] = array[i];
            }
            this.array=arrayTemp;
        }
            this.array[cantElementos] = elemento;
            cantElementos += 1;

    }

    public int dameValor(int posicion) {
        if (posicion < cantElementos) {
            return array[posicion];
        } else {
            System.out.println("error");
            return -1;
        }
    }

    public void setValor(int posicion, int valor) {
        array[posicion] = valor;
    }

    public int dameTamanio() {
        return cantElementos;
    }
}
