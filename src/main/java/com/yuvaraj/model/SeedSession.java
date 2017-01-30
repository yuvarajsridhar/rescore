package com.yuvaraj.model;

import java.time.LocalTime;

import lombok.Data;

@Data
public class SeedSession {
  private int id;
   private String session;
   private LocalTime startTime;
   private LocalTime endTime;
   
}
