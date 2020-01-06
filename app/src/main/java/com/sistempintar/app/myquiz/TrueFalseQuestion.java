package com.sistempintar.app.myquiz;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;

public class TrueFalseQuestion {

    int id;
    String trueStatement;
    String falseStatement, falseStatement2, falseStatement3, soal;
    String explanation;

    public static ArrayList<TrueFalseQuestion> parseJSONArray(String jsonObjectArray)
    {
        System.out.println(jsonObjectArray);
        ArrayList<TrueFalseQuestion> questions = new ArrayList<TrueFalseQuestion>();

        catch(Exception e)
        {
            System.out.println(e);
        }

        return questions;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
