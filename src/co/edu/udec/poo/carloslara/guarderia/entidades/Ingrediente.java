package co.edu.udec.poo.carloslara.guarderia.entidades;

import java.util.List;

public class Ingrediente  {
    String proteina;
    String carbohidrato;
    String ensalada;
    public Ingrediente() {
    }


    public Ingrediente(String proteina, String carbohidrato, String ensalada) {
        this.proteina = proteina;
        this.carbohidrato = carbohidrato;
        this.ensalada = ensalada;
    }

    public String getProteina() {
        return proteina;
    }

    public void setProteina(String proteina) {
        this.proteina = proteina;
    }

    public String getCarbohidrato() {
        return carbohidrato;
    }

    public void setCarbohidrato(String carbohidrato) {
        this.carbohidrato = carbohidrato;
    }

    public String getEnsalada() {
        return ensalada;
    }

    public void setEnsalada(String ensalada) {
        this.ensalada = ensalada;
    }

    @Override
    public String toString() {
        return "Ingrediente{" +
                "proteina='" + proteina + '\'' +
                ", carbohidrato='" + carbohidrato + '\'' +
                ", ensalada='" + ensalada + '\'' +
                '}';
    }
}
