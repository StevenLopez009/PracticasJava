public class EjemploAutomovil {
    public static void main(String[] args) {
        Rueda[] ruedasSub = new Rueda[4];
        for(int i = 0; i<ruedasSub.length; i++){
            ruedasSub[i]= new Rueda("Yokohama", 16, 7.5);
        }
        Persona conductorMazda = new Persona("Lucy", "Martinez");

        Automovil mazda = new Automovil("Mazda", "BT-50");
        mazda.setMotor(new Motor(2.0, TipoMotor.GASOLINA));
        mazda.setTanque(new Tanque(50));
        mazda.setColor(Color.NARANJA);
        System.out.println(mazda.acelerar(340));
        mazda.setTipo(TipoAutomovil.HATCHBACK);
        mazda.setConductor(conductorMazda);
        mazda.setRuedas(ruedasSub);
        mazda.detalle();

        System.out.println("Velocidad maxima ciudad "+ Automovil.VELOCIDAD_MAXIMA );

    }
}
