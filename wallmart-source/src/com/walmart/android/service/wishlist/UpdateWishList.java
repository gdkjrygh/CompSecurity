// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.service.wishlist;


public class UpdateWishList
{
    public static class Registrant
    {

        public String firstName;
        public String lastName;

        public Registrant(String s, String s1)
        {
            firstName = s;
            lastName = s1;
        }
    }


    public String access;
    public Registrant coRegistrant;
    public String name;
    public Registrant registrant;
    public String state;
    public final int storeId = 7;

    public UpdateWishList(String s, String s1)
    {
        name = s;
        access = s1;
    }

    public void setCoRegistrant(String s, String s1)
    {
        coRegistrant = new Registrant(s, s1);
    }

    public void setRegistrant(String s, String s1)
    {
        registrant = new Registrant(s, s1);
    }
}
