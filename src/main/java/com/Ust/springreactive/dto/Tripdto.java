package com.Ust.springreactive.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Tripdto {
    public String id;
    public String name;
    public String destination;
    public String duration;
    public double price;
    public int rating;
    public String description;
    public String status;
}
