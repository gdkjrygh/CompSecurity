// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;


public class i2
{

    public String a;
    public int b;
    public int c;
    public int d;
    public String e;

    public i2()
    {
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null)
            {
                return false;
            }
            if (getClass() != obj.getClass())
            {
                return false;
            }
            obj = (i2)obj;
            if (a == null)
            {
                if (((i2) (obj)).a != null)
                {
                    return false;
                }
            } else
            {
                return a.equals(((i2) (obj)).a);
            }
        }
        return true;
    }
}
