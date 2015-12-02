// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;


class ex
{

    String a;
    String b;

    ex(String s, String s1)
    {
        b = s;
        a = s1;
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
        if (!(obj instanceof ex))
        {
            return false;
        }
        obj = (ex)obj;
        if (b == null)
        {
            if (((ex) (obj)).b != null)
            {
                return false;
            }
        } else
        if (!b.equals(((ex) (obj)).b))
        {
            return false;
        }
        if (a != null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (((ex) (obj)).a == null) goto _L1; else goto _L3
_L3:
        return false;
        if (a.equals(((ex) (obj)).a)) goto _L1; else goto _L4
_L4:
        return false;
    }

    public int hashCode()
    {
        int j = 0;
        int i;
        if (b == null)
        {
            i = 0;
        } else
        {
            i = b.hashCode();
        }
        if (a != null)
        {
            j = a.hashCode();
        }
        return (i + 31) * 31 + j;
    }
}
