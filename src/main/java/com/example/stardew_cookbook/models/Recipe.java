package com.example.stardew_cookbook.models;

import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "recipes")
public class Recipe extends Ingredient{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private String name;

    // many to many relationship
    private List<Ingredient> ingredients;

    // CONSTRUCTOR
    public Recipe(){}

    public Recipe(String name, List<Ingredient> ingredients){
        super(name);
        this.ingredients = ingredients;
    }

    // GETTERS & SETTERS

    public long getId(){
        return id;
    }

    public void setId(long id){
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public List<Ingredient> getIngredients(){
        return ingredients;
    }

    public void setIngredients(List<Ingredient> ingredients){
        this.ingredients = ingredients;
    }

}