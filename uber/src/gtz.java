// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class gtz
    implements gud, hrt
{

    private final gtg a;
    private final Object b;

    public gtz(gtg gtg1, Object obj)
    {
        a = gtg1;
        b = obj;
    }

    private Object b(hsf hsf1)
    {
        if (hsf1.b() != null)
        {
            if (gti.b(gti.a(a.a()), ((CharSequence)hsf1.b()).toString()))
            {
                return null;
            } else
            {
                return b;
            }
        } else
        {
            return b;
        }
    }

    public final Object a(Object obj)
    {
        return b((hsf)obj);
    }

    public final boolean a(hsf hsf1)
    {
        String s = gti.a(a.a());
        return b(hsf1) == null && ((CharSequence)hsf1.b()).length() >= gti.b(s);
    }

    public final boolean b(Object obj)
    {
        return a((hsf)obj);
    }
}
