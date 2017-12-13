package com.btssio.leroybenjamin.medicalappproject;

import com.orm.SugarRecord;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by leroy.benjamin on 12/12/2017.
 */

public class Motif extends SugarRecord implements Serializable {

    private int _id;
    private String _libelle;

    public Motif (int unId,String unLibelle)
    {
        this._id = unId;
        this._libelle = unLibelle;
    }

    public int get_id() {
        return _id;
    }

    public String get_libelle() {
        return _libelle;
    }
}
