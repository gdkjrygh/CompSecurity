// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.service.cart;


public class Location
{

    public String country;
    public String postalCode;
    public String state;

    public Location(String s, String s1, String s2)
    {
        postalCode = s;
        state = s1;
        country = s2;
    }
}
