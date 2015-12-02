// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.List;

public final class dyn extends dym
{

    private List a;
    private int b;
    private int c;

    dyn()
    {
    }

    final dym a(int i)
    {
        b = i;
        return this;
    }

    final dym a(List list)
    {
        a = list;
        return this;
    }

    public final List a()
    {
        return a;
    }

    public final int b()
    {
        return b;
    }

    final dym b(int i)
    {
        c = i;
        return this;
    }

    public final int c()
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
            obj = (dym)obj;
            if (((dym) (obj)).a() == null ? a() != null : !((dym) (obj)).a().equals(a()))
            {
                return false;
            }
            if (((dym) (obj)).b() != b())
            {
                return false;
            }
            if (((dym) (obj)).c() != c())
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        int i;
        if (a == null)
        {
            i = 0;
        } else
        {
            i = a.hashCode();
        }
        return ((i ^ 0xf4243) * 0xf4243 ^ b) * 0xf4243 ^ c;
    }

    public final String toString()
    {
        return (new StringBuilder("FetchedContacts{fetchedContacts=")).append(a).append(", totalContactsOnDevice=").append(b).append(", totalValidContactsOnDevice=").append(c).append("}").toString();
    }
}
