/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assigment01.entity;

/**
 *
 * @author nghin
 */
public class Book {
    private String bcode;
    private String title;
    private int quantity;
    private int lended;
    private double price;

    public Book ( String bcode, String title, int quantity, double price) {

         if (bcode == null || bcode.isEmpty()) {
            throw new IllegalArgumentException("Bcode must not be empty.");
        }
        if (quantity < 0) {
            throw new IllegalArgumentException("Quantity must be non-negative.");
        }
        if (price < 0) {
            throw new IllegalArgumentException("Price must be non-negative.");
        }
        
        this.bcode = bcode;
        this. title = title;
        this.quantity = quantity;
        this.lended = 0;
        this.price = price; 
    }
    
}
