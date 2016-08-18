package com.epsilon.pokemongo.model;

import java.util.List;

/**
 * Created by John on 8/18/2016.
 */
public class Pokemon {

    public String id;
    public String name;

    public List<Type> type;

    public float weight;
    public float height;

    public long stardust;
    public long candy;

    public int cp;
    public int stardustToPowerup;
    public int candyToPowerup;
    public int stardustToevolve;

    List<String> skills;

}
