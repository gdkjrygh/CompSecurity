// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class ang.Object
    implements hst
{

    final fjl a;
    final fjk b;

    private dkn b()
    {
        dkn dkn = fjl.a(a).k();
        if (dkn == null)
        {
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        } else
        {
            return dkn;
        }
    }

    public final Object a()
    {
        return b();
    }

    (fjk fjk1, fjl fjl1)
    {
        b = fjk1;
        a = fjl1;
        super();
    }
}
