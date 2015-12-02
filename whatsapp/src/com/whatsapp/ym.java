// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import java.util.Arrays;

public class ym
{

    private String a;
    private byte b[];
    private byte c[];

    public ym(String s, byte abyte0[], byte abyte1[])
    {
        a = s;
        b = abyte0;
        c = abyte1;
    }

    static byte[] a(ym ym1)
    {
        return ym1.b;
    }

    static String b(ym ym1)
    {
        return ym1.a;
    }

    static byte[] c(ym ym1)
    {
        return ym1.c;
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
        obj = (ym)obj;
        if (!Arrays.equals(c, ((ym) (obj)).c))
        {
            return false;
        }
        if (!Arrays.equals(b, ((ym) (obj)).b))
        {
            return false;
        }
        if (a != null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (((ym) (obj)).a == null) goto _L1; else goto _L3
_L3:
        return false;
        if (a.equals(((ym) (obj)).a)) goto _L1; else goto _L4
_L4:
        return false;
    }

    public int hashCode()
    {
        int j = Arrays.hashCode(c);
        int k = Arrays.hashCode(b);
        int i;
        if (a == null)
        {
            i = 0;
        } else
        {
            i = a.hashCode();
        }
        return i + ((j + 31) * 31 + k) * 31;
    }
}
