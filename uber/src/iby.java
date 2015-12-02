// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class iby
{

    private static final iby d;
    private final ibz a;
    private final Throwable b;
    private final Object c = null;

    private iby(ibz ibz1, Throwable throwable)
    {
        b = throwable;
        a = ibz1;
    }

    public static iby a()
    {
        return new iby(ibz.a, null);
    }

    public static iby a(Throwable throwable)
    {
        return new iby(ibz.b, throwable);
    }

    public static iby b()
    {
        return d;
    }

    private Object f()
    {
        return c;
    }

    private boolean g()
    {
        return j() && c != null;
    }

    private boolean h()
    {
        return d() && b != null;
    }

    private ibz i()
    {
        return a;
    }

    private boolean j()
    {
        return i() == ibz.a;
    }

    public final Throwable c()
    {
        return b;
    }

    public final boolean d()
    {
        return i() == ibz.b;
    }

    public final boolean e()
    {
        return i() == ibz.c;
    }

    public final boolean equals(Object obj)
    {
        if (obj != null)
        {
            if (this == obj)
            {
                return true;
            }
            if (obj.getClass() == getClass())
            {
                obj = (iby)obj;
                if (((iby) (obj)).i() == i() && (!g() || f().equals(((iby) (obj)).f())) && (!h() || c().equals(((iby) (obj)).c())))
                {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode()
    {
        int l = i().hashCode();
        int k = l;
        if (g())
        {
            k = l * 31 + f().hashCode();
        }
        l = k;
        if (h())
        {
            l = k * 31 + c().hashCode();
        }
        return l;
    }

    public final String toString()
    {
        StringBuilder stringbuilder = (new StringBuilder("[")).append(super.toString()).append(" ").append(i());
        if (g())
        {
            stringbuilder.append(" ").append(f());
        }
        if (h())
        {
            stringbuilder.append(" ").append(c().getMessage());
        }
        stringbuilder.append("]");
        return stringbuilder.toString();
    }

    static 
    {
        d = new iby(ibz.c, null);
    }
}
