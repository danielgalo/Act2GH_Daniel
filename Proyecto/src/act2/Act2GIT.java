package act2;

public class Act2GIT {

  public static void main(String[] args) {

    final int INICIO_ARRAY = 1;
    final int FIN_ARRAY = 10;
    final int LONGITUD_ARRAY = 20;
    int[] numeros = new int [LONGITUD_ARRAY];
    int i;
    
    for (i = 0; i < LONGITUD_ARRAY; i++) {
      numeros[i] = (int) (Math.random() * (FIN_ARRAY - INICIO_ARRAY + 1) + INICIO_ARRAY);
   
    }

  }

}
