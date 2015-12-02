// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class daz extends gme
    implements dam
{

    private String a;

    public daz(dal dal1)
    {
        String s = dal1.z();
        if (s == null || s.length() <= 0)
        {
            s = null;
        }
        a = s;
        dal1.a(this);
    }

    private void b(String s)
    {
        boolean flag;
        if (!gjx.a(s, a))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = s;
        if (flag)
        {
            b();
        }
    }

    private String d()
    {
        return a;
    }

    public final Object a()
    {
        return d();
    }

    public final void a(String s)
    {
        b(s);
    }

    public final void c()
    {
        b(null);
    }
}
