// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public abstract class gjy
{

    gjy()
    {
    }

    public static gjy b(Object obj)
    {
        return new gkb(gjz.a(obj));
    }

    public static gjy c(Object obj)
    {
        if (obj == null)
        {
            return e();
        } else
        {
            return new gkb(obj);
        }
    }

    public static gjy e()
    {
        return gjt.a();
    }

    public abstract gjy a(gjy gjy1);

    public abstract Object a(Object obj);

    public abstract boolean b();

    public abstract Object c();

    public abstract Object d();
}
