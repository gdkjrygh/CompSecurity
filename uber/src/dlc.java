// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;

public final class dlc extends dky
{

    private boolean a;
    private String b;
    private ArrayList c;

    dlc()
    {
    }

    final dky a(String s)
    {
        b = s;
        return this;
    }

    final dky a(ArrayList arraylist)
    {
        c = arraylist;
        return this;
    }

    final dky a(boolean flag)
    {
        a = flag;
        return this;
    }

    public final boolean a()
    {
        return a;
    }

    public final String b()
    {
        return b;
    }

    public final ArrayList c()
    {
        return c;
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (dky)obj;
            if (((dky) (obj)).a() != a())
            {
                return false;
            }
            if (((dky) (obj)).b() == null ? b() != null : !((dky) (obj)).b().equals(b()))
            {
                return false;
            }
            if (((dky) (obj)).c() == null ? c() != null : !((dky) (obj)).c().equals(c()))
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        int j = 0;
        char c1;
        int i;
        if (a)
        {
            c1 = '\u04CF';
        } else
        {
            c1 = '\u04D5';
        }
        if (b == null)
        {
            i = 0;
        } else
        {
            i = b.hashCode();
        }
        if (c != null)
        {
            j = c.hashCode();
        }
        return (i ^ (c1 ^ 0xf4243) * 0xf4243) * 0xf4243 ^ j;
    }

    public final String toString()
    {
        return (new StringBuilder("AcceptFareSplitResponseEvent{success=")).append(a).append(", errorMessage=").append(b).append(", unpaidBills=").append(c).append("}").toString();
    }
}
