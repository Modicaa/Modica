package com.example.asd.instafood.models;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.PrimaryKey;
import android.arch.persistence.room.TypeConverters;
import android.support.annotation.NonNull;

import com.example.asd.instafood.database.TimestampConverter;

import java.util.Date;

@Entity(
        foreignKeys =
                {
                        @ForeignKey(entity = Usuario.class, parentColumns = "email", childColumns = "usuarioEmail"),
                        @ForeignKey(entity = Restaurante.class, parentColumns = "restauranteId",childColumns = "restaurante")
                }

)
public class Calificacion
{
    @NonNull
    @PrimaryKey(autoGenerate = true)
    private int idCalificacion;

    //Llave foranea
    private int restaurante;
    private String usuarioEmai;

    @TypeConverters({TimestampConverter.class})
    private Date fechaCalificacion;

    private int puntuacionAtencion;
    private int puntuacionHigiene;
    private int puntuacionTiempo;
    private int puntuacionComida;
    private int puntuacionPrecios;

    public Calificacion(@NonNull int idCalificacion, int restaurante, String usuarioEmai,
                        Date fechaCalificacion, int puntuacionAtencion, int puntuacionHigiene,
                        int puntuacionTiempo, int puntuacionComida, int puntuacionPrecios) {
        this.idCalificacion = idCalificacion;
        this.restaurante = restaurante;
        this.usuarioEmai = usuarioEmai;
        this.fechaCalificacion = fechaCalificacion;
        this.puntuacionAtencion = puntuacionAtencion;
        this.puntuacionHigiene = puntuacionHigiene;
        this.puntuacionTiempo = puntuacionTiempo;
        this.puntuacionComida = puntuacionComida;
        this.puntuacionPrecios = puntuacionPrecios;
    }

    @NonNull
    public int getIdCalificacion() {
        return idCalificacion;
    }

    public void setIdCalificacion(@NonNull int idCalificacion) {
        this.idCalificacion = idCalificacion;
    }

    public int getRestaurante() {
        return restaurante;
    }

    public void setRestaurante(int restaurante) {
        this.restaurante = restaurante;
    }

    public String getUsuarioEmai() {
        return usuarioEmai;
    }

    public void setUsuarioEmai(String usuarioEmai) {
        this.usuarioEmai = usuarioEmai;
    }

    public Date getFechaCalificacion() {
        return fechaCalificacion;
    }

    public void setFechaCalificacion(Date fechaCalificacion) {
        this.fechaCalificacion = fechaCalificacion;
    }

    public int getPuntuacionAtencion() {
        return puntuacionAtencion;
    }

    public void setPuntuacionAtencion(int puntuacionAtencion) {
        this.puntuacionAtencion = puntuacionAtencion;
    }

    public int getPuntuacionHigiene() {
        return puntuacionHigiene;
    }

    public void setPuntuacionHigiene(int puntuacionHigiene) {
        this.puntuacionHigiene = puntuacionHigiene;
    }

    public int getPuntuacionTiempo() {
        return puntuacionTiempo;
    }

    public void setPuntuacionTiempo(int puntuacionTiempo) {
        this.puntuacionTiempo = puntuacionTiempo;
    }

    public int getPuntuacionComida() {
        return puntuacionComida;
    }

    public void setPuntuacionComida(int puntuacionComida) {
        this.puntuacionComida = puntuacionComida;
    }

    public int getPuntuacionPrecios() {
        return puntuacionPrecios;
    }

    public void setPuntuacionPrecios(int puntuacionPrecios) {
        this.puntuacionPrecios = puntuacionPrecios;
    }
}
