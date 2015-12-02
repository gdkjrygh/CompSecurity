// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class fud extends ftu
{

    private String a;
    private String b;
    private String c;
    private String d;

    fud()
    {
    }

    public final void a(String s)
    {
        a = s;
    }

    public final String b()
    {
        return a;
    }

    public final void b(String s)
    {
        c = s;
    }

    public final String c()
    {
        return b;
    }

    public final void c(String s)
    {
        b = s;
    }

    public final String d()
    {
        return c;
    }

    public final String e()
    {
        return d;
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (ftu)obj;
            if (((ftu) (obj)).b() == null ? b() != null : !((ftu) (obj)).b().equals(b()))
            {
                return false;
            }
            if (((ftu) (obj)).c() == null ? c() != null : !((ftu) (obj)).c().equals(c()))
            {
                return false;
            }
            if (((ftu) (obj)).d() == null ? d() != null : !((ftu) (obj)).d().equals(d()))
            {
                return false;
            }
            if (((ftu) (obj)).e() == null ? e() != null : !((ftu) (obj)).e().equals(e()))
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        int l = 0;
        int i;
        int j;
        int k;
        if (a == null)
        {
            i = 0;
        } else
        {
            i = a.hashCode();
        }
        if (b == null)
        {
            j = 0;
        } else
        {
            j = b.hashCode();
        }
        if (c == null)
        {
            k = 0;
        } else
        {
            k = c.hashCode();
        }
        if (d != null)
        {
            l = d.hashCode();
        }
        return (k ^ (j ^ (i ^ 0xf4243) * 0xf4243) * 0xf4243) * 0xf4243 ^ l;
    }

    public final String toString()
    {
        return (new StringBuilder("AddressProperties{displayText=")).append(a).append(", prefillText=").append(b).append(", hintText=").append(c).append(", labelText=").append(d).append("}").toString();
    }
}
