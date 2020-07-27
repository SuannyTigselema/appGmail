package com.example.gmail.Models;

public class mensaje {
public int imgPerfil;
    public String asunto;
    public String mensaje;
    public String hora;

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String origen;

    public mensaje(int imgPerfil, String asunto, String mensaje, String hora, String origen) {
        this.imgPerfil = imgPerfil;
        this.asunto = asunto;
        this.mensaje = mensaje;
        this.hora = hora;
        this.origen = origen;
    }



    public int getImgPerfil() {
        return imgPerfil;
    }

    public void setImgPerfil(int imgPerfil) {
        this.imgPerfil = imgPerfil;
    }

    public String getAsunto() {
        return asunto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }
}
