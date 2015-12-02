// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import java.util.Arrays;

final class uw
{

    private final String a;
    private final byte b[];

    public uw(String s, byte abyte0[])
    {
        a = s;
        b = abyte0;
    }

    public boolean equals(Object obj)
    {
        if (this != obj) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        if (obj == null)
        {
            return false;
        }
        if (getClass() != obj.getClass())
        {
            return false;
        }
        obj = (uw)obj;
        if (!Arrays.equals(b, ((uw) (obj)).b))
        {
            return false;
        }
        if (a != null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (((uw) (obj)).a == null) goto _L1; else goto _L3
_L3:
        return false;
        if (a.equals(((uw) (obj)).a)) goto _L1; else goto _L4
_L4:
        return false;
    }

    public int hashCode()
    {
        int j = Arrays.hashCode(b);
        int i;
        if (a == null)
        {
            i = 0;
        } else
        {
            i = a.hashCode();
        }
        return i + (j + 31) * 31;
    }
}
