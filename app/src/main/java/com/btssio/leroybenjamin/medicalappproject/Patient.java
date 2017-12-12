package com.btssio.leroybenjamin.medicalappproject;

import com.orm.SugarRecord;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by leroy.benjamin on 06/12/2017.
 */

public class Patient extends SugarRecord implements Serializable {

    SimpleDateFormat dt = new SimpleDateFormat("yyyyy-mm-dd");

    public String get_nom() {
        return _nom;
    }

    public String get_prenom() {
        return _prenom;
    }

    public Date get_dateNaissance() {
        return _dateNaissance;
    }

    public String get_motif() {
        return _motif;
    }

    public String get_chambre() {
        return _chambre;
    }
    public int get_image() {
        return _image;
    }
    public String get_libelle() {
        return _nom + " " + _prenom;
    }

    private String _nom;
    private String _prenom;
    private Date _dateNaissance;
    private String _chambre;
    private String _motif;
    private int _image;

    public Patient (String unNom, String unPrenom, Date uneDateNaissance, String uneChambre, int uneImage, String unMotif){
        _nom = unNom;
        _prenom = unPrenom;
        _dateNaissance = uneDateNaissance;
        _motif = unMotif;
        _chambre = uneChambre;
        _image = uneImage;
    }


}
