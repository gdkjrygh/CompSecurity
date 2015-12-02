// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import java.util.Date;
import org.whispersystems.ae;

public final class uc
{

    private final ae a;
    private final Date b;

    public uc(ae ae1, Date date)
    {
        a = ae1;
        b = date;
    }

    public Date a()
    {
        return b;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (uc)obj;
            if (b == null ? ((uc) (obj)).b != null : !b.equals(((uc) (obj)).b))
            {
                return false;
            }
            if (a == null ? ((uc) (obj)).a != null : !a.equals(((uc) (obj)).a))
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        int j = 0;
        int i;
        if (a != null)
        {
            i = a.hashCode();
        } else
        {
            i = 0;
        }
        if (b != null)
        {
            j = b.hashCode();
        }
        return i * 31 + j;
    }
}
