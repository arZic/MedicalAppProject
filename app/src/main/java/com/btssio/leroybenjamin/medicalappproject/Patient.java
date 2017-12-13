package com.btssio.leroybenjamin.medicalappproject;

import com.orm.SugarRecord;
import com.orm.dsl.Unique;

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

    public Date get_dateNaissance() {
        return _dateNaissance;
    }

    public String get_motif() {
        return _motif;
    }

    public int get_id() {
        return id;
    }

    @Unique
    private int id;
    private static int compteObjets = 1;
    private String _nom;
    private String _prenom;
    private Date _dateNaissance;

    public void set_motif(String monMotif) {
        this._motif = monMotif;
    }

    private String _motif;

    public Patient()
    {

    }

    public Patient (String unNom, String unPrenom, Date uneDateNaissance, String unMotif){
        id = compteObjets;
        compteObjets++;
        _nom = unNom;
        _prenom = unPrenom;
        _dateNaissance = uneDateNaissance;
        _motif = unMotif;
    }


}
