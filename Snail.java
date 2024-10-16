//Tenemos un caracol que sube una columna de dia y de noche se duerme y baja. Dados los numeros generamos un programa que pueda calcular en cuantos días llega a la cima

public class Snail {
    public static int snail(int column, int day, int night) {
      int i = 0;
      while (column > 0 ){
      i++;
      column = column - day;
        if (column <= 0){
          break;
        }
        else{
          column = column + night;
        }
    }
      return i;
  }
}
