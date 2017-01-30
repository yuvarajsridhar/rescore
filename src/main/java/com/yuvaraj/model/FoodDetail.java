package com.yuvaraj.model;

import lombok.Data;

@Data
public class FoodDetail {
   private int id;
   private SeedFood foodId;
   private SeedSession sessionId;
   private int quantity;
 
 
}
