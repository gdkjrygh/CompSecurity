// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class gje
    implements hsr
{

    static final boolean a;
    private final hzb b;

    private gje(hzb hzb1)
    {
        if (!a && hzb1 == null)
        {
            throw new AssertionError();
        } else
        {
            b = hzb1;
            return;
        }
    }

    public static hsr a(hzb hzb1)
    {
        return new gje(hzb1);
    }

    private void a(gjd gjd1)
    {
        if (gjd1 == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            gjd1.b = (giz)b.a();
            return;
        }
    }

    public final void injectMembers(Object obj)
    {
        a((gjd)obj);
    }

    static 
    {
        boolean flag;
        if (!gje.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
