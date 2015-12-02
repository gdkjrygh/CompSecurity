// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public class gfk
{

    private int a;
    private gdq b;
    private float c;
    private boolean d;

    public gfk()
    {
    }

    final gfk a()
    {
        d = false;
        return this;
    }

    final gfk a(gdq gdq, float f, int i, boolean flag)
    {
        b = gdq;
        c = f;
        a = i;
        d = flag;
        return this;
    }

    public final gdq b()
    {
        return b;
    }

    final float c()
    {
        return c;
    }

    final int d()
    {
        return a;
    }

    final boolean e()
    {
        return d;
    }

    public String toString()
    {
        return String.format("{ %s %.2f (%d) (%s) }", new Object[] {
            b, Float.valueOf(c), Integer.valueOf(a), Boolean.valueOf(d)
        });
    }
}
