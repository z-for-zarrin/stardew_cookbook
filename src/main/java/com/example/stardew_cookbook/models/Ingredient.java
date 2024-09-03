package com.example.stardew_cookbook.models;

import jakarta.persistence.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "ingredients")
public class Ingredient{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private String name;

    // many to many relationship
    @JsonIgnoreProperties({"recipes"})
    @ManyToMany(mappedBy = "ingredients")
    private List<Recipe> recipes;

    // CONSTRUCTORS
    
    public Ingredient(){}

    public Ingredient(String name){
        this.name = name;
    }

    // GETTERS & SETTERS

    public long getId(){
        return id;
    }

    public void setId(long id){
        this.id = id;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public List<Recipe> getRecipes(){
        return recipes;
    }

    public void setRecipes(List<Recipes> recipes){
        this.recipes = recipes;
    }
}