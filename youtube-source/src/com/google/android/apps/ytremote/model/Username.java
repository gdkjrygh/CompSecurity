// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.ytremote.model;

import java.io.Serializable;

public class Username
    implements Serializable
{

    public static final Username LOGGED_IN = new Username("default");
    public static final Username UNLINKED_GAIA_USER = new Username("123UnlinkedGaiaUser");
    private final String name;

    public Username(String s)
    {
        name = s;
    }

    public boolean equals(Object obj)
    {
        if (!(obj instanceof Username))
        {
            return false;
        } else
        {
            obj = (Username)obj;
            return name.equalsIgnoreCase(((Username) (obj)).name);
        }
    }

    public int hashCode()
    {
        return name.toLowerCase().hashCode();
    }

    public String toLowerCaseString()
    {
        return name.toLowerCase();
    }

    public String toString()
    {
        return name;
    }

    public String toUpperCaseString()
    {
        return name.toUpperCase();
    }

}
