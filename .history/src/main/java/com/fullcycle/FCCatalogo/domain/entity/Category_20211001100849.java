package com.fullcycle.FCCatalogo.domain.entity;

import java.util.UUID;

public class Category {
    
    private UUID id;
    private String name;

    public Category() {}
    public Category(String name) {}
    public Category(UUID id, String name) {}
}