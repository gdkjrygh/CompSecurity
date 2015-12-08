// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.dal2.ups;


public class UserDetails
{

    private final String email;
    private final String firstName;
    private final String lastName;
    private final String userId;

    public UserDetails(String s, String s1, String s2, String s3)
    {
        userId = s;
        firstName = s1;
        lastName = s2;
        email = s3;
    }

    public String getEmail()
    {
        return email;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public String getLastName()
    {
        if (lastName == null)
        {
            return "";
        } else
        {
            return lastName;
        }
    }

    public String getUserId()
    {
        return userId;
    }
}
