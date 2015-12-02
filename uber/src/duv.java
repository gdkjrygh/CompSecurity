// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class duv
    implements Comparable
{

    final dut a;
    private Comparable b;

    private duv(dut dut, Comparable comparable)
    {
        a = dut;
        super();
        b = comparable;
    }

    duv(dut dut, Comparable comparable, byte byte0)
    {
        this(dut, comparable);
    }

    private int a(duv duv1)
    {
        boolean flag = false;
        if (duv1 == this)
        {
            return 0;
        }
        if (b.compareTo(duv1.b) == 0)
        {
            flag = true;
        }
        if (flag)
        {
            return 1;
        } else
        {
            return b.compareTo(duv1.b);
        }
    }

    public final Comparable a()
    {
        return b;
    }

    public final int compareTo(Object obj)
    {
        return a((duv)obj);
    }
}
