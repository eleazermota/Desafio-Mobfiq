/* Copyright 2017 freecodeformat.com */
package com.example.eleazer.desafiomobfiq.modelos;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Sellers implements Serializable {

    @SerializedName("Id")
    private String id;
    @SerializedName("Name")
    private String name;
    @SerializedName("Quantity")
    private int quantity;
    @SerializedName("Price")
    private double price;
    @SerializedName("ListPrice")
    private double listprice;
    @SerializedName("BestInstallment")
    private Bestinstallment bestinstallment;
    @SerializedName("Offer")
    private String offer;
    public void setId(String id) {
         this.id = id;
     }
     public String getId() {
         return id;
     }

    public void setName(String name) {
         this.name = name;
     }
     public String getName() {
         return name;
     }

    public void setQuantity(int quantity) {
         this.quantity = quantity;
     }
     public int getQuantity() {
         return quantity;
     }

    public void setPrice(double price) {
         this.price = price;
     }
     public Double getPrice() {
         return price;
     }

    public void setListprice(double listprice) {
         this.listprice = listprice;
     }
     public double getListprice() {
         return listprice;
     }

    public void setBestinstallment(Bestinstallment bestinstallment) {
         this.bestinstallment = bestinstallment;
     }
     public Bestinstallment getBestinstallment() {
         return bestinstallment;
     }

    public void setOffer(String offer) {
         this.offer = offer;
     }
     public String getOffer() {
         return offer;
     }

}