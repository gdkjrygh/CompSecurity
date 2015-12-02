// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.metrics.analytics.model;


public class Product
{

    Double eta;
    String id;
    Long ncars;
    Double surge;

    public Product()
    {
    }

    public Double getEta()
    {
        return eta;
    }

    public String getId()
    {
        return id;
    }

    public Long getNcars()
    {
        return ncars;
    }

    public Double getSurge()
    {
        return surge;
    }

    public void setEta(Double double1)
    {
        eta = double1;
    }

    public void setId(String s)
    {
        id = s;
    }

    public void setNcars(Long long1)
    {
        ncars = long1;
    }

    public void setSurge(Double double1)
    {
        surge = double1;
    }
}
