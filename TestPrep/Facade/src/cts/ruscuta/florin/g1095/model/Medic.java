package cts.ruscuta.florin.g1095.model;

public class Medic {
    public boolean verificaInternare(Pacient pacient, Salon salon){
        if(!pacient.getStare().equals("grav")){
            return false;
        }
        if(!salon.verificaDisponibilitatePat()){
            return false;
        }
        salon.ocupaPat();
        return true;
    }
}
