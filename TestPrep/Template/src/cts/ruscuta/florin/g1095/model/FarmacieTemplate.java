package cts.ruscuta.florin.g1095.model;

public abstract class FarmacieTemplate {
    public final void procesAchizitieMedicamente(Reteta reteta) {
        primesteReteta(reteta);
        if (verificaStoc(reteta)) {
            aduceMedicamente();
            incaseazaBanii();
            scadeDinStoc(reteta);
            emiteBon();
        } else {
            refuzaAchizitia();
        }
    }

    protected abstract void primesteReteta(Reteta reteta);
    protected abstract boolean verificaStoc(Reteta reteta);
    protected abstract void aduceMedicamente();
    protected abstract void incaseazaBanii();
    protected abstract void scadeDinStoc(Reteta reteta);
    protected abstract void emiteBon();
    protected abstract void refuzaAchizitia();
}
