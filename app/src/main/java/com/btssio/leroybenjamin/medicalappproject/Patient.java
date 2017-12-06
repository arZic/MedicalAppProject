package com.btssio.leroybenjamin.medicalappproject;

import java.io.Serializable;
import java.text.DateFormat;
import java.util.Date;

/**
 * Created by leroy.benjamin on 06/12/2017.
 */

public class Patient implements Serializable{
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

    private String _nom;
    private String _prenom;
    private Date _dateNaissance;
    private String _motif;

    public Patient (String unNom, String unPrenom, Date uneDateNaissance, String unMotif){
        _nom = unNom;
        _prenom = unPrenom;
        _dateNaissance = uneDateNaissance;
        _motif = unMotif;
    }


}
