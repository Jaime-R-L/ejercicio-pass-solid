package org.example.entities;

import java.util.Objects;

public class contrasenya {
    private String pass;
    private Integer fortaleza;

    public contrasenya(String pass, Integer fortaleza) {
        this.pass = pass;
        this.fortaleza = fortaleza;
    }

    public contrasenya() {
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public Integer getFortaleza() {
        return fortaleza;
    }

    public void setFortaleza(Integer fortaleza) {
        this.fortaleza = fortaleza;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        contrasenya that = (contrasenya) o;
        return Objects.equals(pass, that.pass) && Objects.equals(fortaleza, that.fortaleza);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pass, fortaleza);
    }

    @Override
    public String toString() {
        return "contrasenya{" +
                "pass='" + pass + '\'' +
                ", fortaleza=" + fortaleza +
                '}';
    }
}
