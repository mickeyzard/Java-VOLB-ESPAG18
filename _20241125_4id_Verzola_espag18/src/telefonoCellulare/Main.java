package telefonoCellulare;

public class Main {
	    public static void main(String[] args) {
	    	
	        TelefonoCellulare telefono = new TelefonoCellulare("Redmi", "Xiaomi 14T", 128, 599);
	        System.out.println(telefono.toString());
	        telefono.accendi();
	        telefono.chiama("842179121");
	        telefono.inviaSMS("842179121.");
	        telefono.spegni();
	    }

}
