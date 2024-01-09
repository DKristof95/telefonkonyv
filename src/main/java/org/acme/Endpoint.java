package org.acme;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Entity;

@Entity
public class Endpoint extends PanacheEntity{
    public String name;
    public String SIP_URI;
    public int ZIP;
    public String city;
    public String coordinates;
    public Type type;
}


