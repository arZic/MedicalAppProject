package com.btssio.leroybenjamin.medicalappproject;

import com.orm.SugarRecord;

import java.io.Serializable;
import java.text.DateFormat;
import java.util.Date;

/**
 * Created by leroy.benjamin on 06/12/2017.
 */

public class Patient extends SugarRecord implements Serializable {
    public String get_nom() {
        return _nom;
    }

    public String get_prenom() {
        return _prenom;
    }

    public String get_dateNaissance() {
        return _dateNaissance;
    }

    public String get_motif() {
        return _motif;
    }

    private String _nom;
    private String _prenom;
    private String _dateNaissance;
    private String _motif;
    private int _image;

    public Patient (String unNom, String unPrenom, String uneDateNaissance, String unMotif, int uneImage){
        _nom = unNom;
        _prenom = unPrenom;
        _dateNaissance = uneDateNaissance;
        _motif = unMotif;
        _image = uneImage;
    }


}
