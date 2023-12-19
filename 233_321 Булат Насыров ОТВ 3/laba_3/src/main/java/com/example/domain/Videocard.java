package com.example.domain;

public class Videocard extends Hardware {

    private final String model;

    private final String series;

    public Videocard (long id, String name, double cost, String model, String series) {
        super(id, name, cost);
        this.model = model;
        this.series = series;
    }

    public String getModel() {
        return model;
    }

    public String getSeries() {
        return series;
    }
}
