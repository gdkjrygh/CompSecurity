// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google;


// Referenced classes of package com.google:
//            bM

class gp
    implements java.util.Map.Entry, Comparable
{

    private Object a;
    private final Comparable b;
    final bM c;

    gp(bM bm, Comparable comparable, Object obj)
    {
        c = bm;
        super();
        b = comparable;
        a = obj;
    }

    gp(bM bm, java.util.Map.Entry entry)
    {
        this(bm, (Comparable)entry.getKey(), entry.getValue());
    }

    private boolean a(Object obj, Object obj1)
    {
        if (obj == null)
        {
            return obj1 == null;
        } else
        {
            return obj.equals(obj1);
        }
    }

    public int a(gp gp1)
    {
        return a().compareTo(gp1.a());
    }

    public Comparable a()
    {
        return b;
    }

    public int compareTo(Object obj)
    {
        return a((gp)obj);
    }

    public boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof java.util.Map.Entry))
            {
                return false;
            }
            obj = (java.util.Map.Entry)obj;
            if (!a(b, ((java.util.Map.Entry) (obj)).getKey()) || !a(a, ((java.util.Map.Entry) (obj)).getValue()))
            {
                return false;
            }
        }
        return true;
    }

    public Object getKey()
    {
        return a();
    }

    public Object getValue()
    {
        return a;
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
        return i ^ j;
    }

    public Object setValue(Object obj)
    {
        bM.a(c);
        Object obj1 = a;
        a = obj;
        return obj1;
    }

    public String toString()
    {
        return (new StringBuilder()).append(b).append("=").append(a).toString();
    }
}
