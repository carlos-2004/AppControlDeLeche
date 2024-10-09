package com.proyectocontrolleche;

public class cLeche {

    private Integer ID;
    private String NombreCompletoProductor;
    private String Telefono;
    private String Direccion;
    private String Email;
    private String Password;
    private String Mes;
    private Float Dia;
    private String Año;
    private Float CantidadLechelitrosManana;
    private Float CantidadLechelitrosTarde;
    private Float CantidadLechelitrosTotal;

    public cLeche(Integer id, String nombre, String apellido, String email,String telefono) {
        this.ID = ID;
        this.NombreCompletoProductor = NombreCompletoProductor;
        this.Telefono = Telefono;
        this.Direccion = Direccion;
        this.Email = Email;
        this.Password = Password;
        this.Mes = Mes;
        this.Año = Año;
        this.Dia = Dia;
        this.CantidadLechelitrosManana = CantidadLechelitrosManana;
        this.CantidadLechelitrosTarde = CantidadLechelitrosTarde;
        this.CantidadLechelitrosTotal = CantidadLechelitrosTotal;

    }
    public cLeche(){

    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getNombreCompletoProductor() {
        return NombreCompletoProductor;
    }

    public void setNombreCompletoProductor(String nombreCompletoProductor) {
        NombreCompletoProductor = nombreCompletoProductor;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String telefono) {
        Telefono = telefono;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String direccion) {
        Direccion = direccion;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getMes() {
        return Mes;
    }

    public void setMes(String mes) {
        Mes = mes;
    }

    public Float getDia() {
        return Dia;
    }

    public void setDia(Float dia) {
        Dia = dia;
    }

    public String getAño() {
        return Año;
    }

    public void setAño(String año) {
        Año = año;
    }

    public Float getCantidadLechelitrosManana() {
        return CantidadLechelitrosManana;
    }

    public void setCantidadLechelitrosManana(Float cantidadLechelitrosManana) {
        CantidadLechelitrosManana = cantidadLechelitrosManana;
    }

    public Float getCantidadLechelitrosTarde() {
        return CantidadLechelitrosTarde;
    }

    public void setCantidadLechelitrosTarde(Float cantidadLechelitrosTarde) {
        CantidadLechelitrosTarde = cantidadLechelitrosTarde;
    }

    public Float getCantidadLechelitrosTotal() {
        return CantidadLechelitrosTotal;
    }

    public void setCantidadLechelitrosTotal(Float cantidadLechelitrosTotal) {
        CantidadLechelitrosTotal = cantidadLechelitrosTotal;
    }
}

