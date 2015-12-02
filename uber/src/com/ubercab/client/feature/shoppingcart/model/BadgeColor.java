// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.shoppingcart.model;


public class BadgeColor
{

    float alpha;
    String color;

    public BadgeColor(float f, String s)
    {
        alpha = f;
        color = s;
    }

    public float getAlpha()
    {
        return alpha;
    }

    public String getColor()
    {
        return color;
    }

    public void setAlpha(float f)
    {
        alpha = f;
    }

    public void setColor(String s)
    {
        color = s;
    }
}
