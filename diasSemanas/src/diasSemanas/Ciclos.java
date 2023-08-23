package diasSemanas;

public class Ciclos {
Integer numeroMes = 11;
String estacion = "";
String mes = "";

public void estacionMes() {
	
	switch (numeroMes) { 
    case 1 :
    	estacion = "Invierno";
        mes = "Enero";
        break;
    case 2 :
    	estacion = "Invierno";
        mes = "Febrero";
        break;
    case 3 :
    	estacion = "Primavera";
        mes = "Marzo";
        break;
    case 4 :
    	estacion = "Primavera";
        mes = "Abril";
        break;
    case 5 :
    	estacion = "Primavera";
        mes = "Mayo";
        break;
    case 6 :
    	estacion = "Verano";
        mes = "Junio";
        break;
    case 7 :
    	estacion = "Verano";
        mes = "Julio";
        break;
    case 8 :
    	estacion = "Verano";
        mes = "Agosto";
        break;
    case 9 :
    	estacion = "Otoño";
    	mes = "Septiembre";
     break;
    case 10 :
    	estacion = "Otoño";
        mes = "Octubre";
     break;
    case 11 :
    	estacion = "Otoño";
        mes = "Noviembre";
     break;
    
    case 12 :
    	estacion = "Invierno";
        mes = "Diciembre";
        break;

    default:
    	estacion = "No hay";
        mes = "El mes no coincide";
  }
	
	System.out.println(estacion +" "+ mes);
}

public void prueba() {
	int i = 2;

	switch(i) {
	  case 0:
	  case 1:
	  case 2:
	  case 3:
	  case 4:
	    System.out.println("i es menor que cinco");
	    break;
	  case 5:
	    System.out.println("i es cinco");
	    break;
	  case 6:
	  case 7:
	  case 8:
	  case 9:
	    System.out.println("i es menor que diez y mayor a cinco");
	    break;
	  default:
	    System.out.println("i es diez o mayor a diez");
	}
}
}
