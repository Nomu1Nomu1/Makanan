package com.example.makanan.models;

import com.example.makanan.models.image_model.RootImageModel;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class RecipeModel {
    private String label;
    private String image;
    private String source;
    private float yield;
    private float calories;
    private float totalWeigth;
    @SerializedName("IMAGE")
    @Expose()
    private RootImageModel rootImageModel;

    public RecipeModel() {
        new RecipeModel(label, image, source, yield, calories, totalWeigth, rootImageModel);
    }

    public RecipeModel(String label, String image, String source, float yield, float calories, float totalWeigth, RootImageModel rootImageModel) {
        this.label = label;
        this.image = image;
        this.source = source;
        this.yield = yield;
        this.calories = calories;
        this.totalWeigth = totalWeigth;
        this.rootImageModel = rootImageModel;
    }

    public String getLabel() {
        return label;
    }

    public String getImage() {
        return image;
    }

    public String getSource() {
        return source;
    }

    public float getYield() {
        return yield;
    }

    public float getCalories() {
        return calories;
    }

    public float getTotalWeigth() {
        return totalWeigth;
    }

    public RootImageModel getRootImageModel() {
        return rootImageModel;
    }
}
