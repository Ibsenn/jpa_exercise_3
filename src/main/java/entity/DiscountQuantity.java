/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author madsr
 */
@Entity
public class DiscountQuantity extends DiscountType
{
    
    
    int quantityForDiscount = 3; 
    double discount = 0.2; //20% on all if quantity is 3 or more

    @Override
    public double calcDiscount(double priceItem, int quantity)
    {
        return quantity >= quantityForDiscount ? priceItem * quantity * discount : 0;
    }

    public int getQuantityForDiscount()
    {
        return quantityForDiscount;
    }

    public void setQuantityForDiscount(int quantityForDiscount)
    {
        this.quantityForDiscount = quantityForDiscount;
    }
}
