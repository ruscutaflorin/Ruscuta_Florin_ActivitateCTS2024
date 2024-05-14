package cts.ruscuta.florin.g1095.model;

public class Facade {
    private Medic medic;
    private Salon salon;

    public Facade(Medic medic, Salon salon) {
        this.medic = medic;
        this.salon = salon;
    }

    public boolean internarePacient(Pacient pacient){
        return medic.verificaInternare(pacient, salon);
    }
}
