package com.yuvaraj.model;

import lombok.Data;

@Data
public class FoodOrdered {
        private int orderId;
        private SeedFood foodId;
        private int quantity;
        private int price;
        
}
