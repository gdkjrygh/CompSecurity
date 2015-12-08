// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.util.io.pem;


public class PemHeader
{

    private String name;
    private String value;

    public PemHeader(String s, String s1)
    {
        name = s;
        value = s1;
    }

    private int getHashCode(String s)
    {
        if (s == null)
        {
            return 1;
        } else
        {
            return s.hashCode();
        }
    }

    private boolean isEqual(String s, String s1)
    {
        if (s == s1)
        {
            return true;
        }
        if (s == null || s1 == null)
        {
            return false;
        } else
        {
            return s.equals(s1);
        }
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof PemHeader)
        {
            if ((obj = (PemHeader)obj) == this || isEqual(name, ((PemHeader) (obj)).name) && isEqual(value, ((PemHeader) (obj)).value))
            {
                return true;
            }
        }
        return false;
    }

    public String getName()
    {
        return name;
    }

    public String getValue()
    {
        return value;
    }

    public int hashCode()
    {
        return getHashCode(name) + getHashCode(value) * 31;
    }
}
