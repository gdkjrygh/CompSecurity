// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class ang.Object
    implements hst
{

    final fgr a;
    final fgq b;

    private cys b()
    {
        cys cys = fgr.a(a).X();
        if (cys == null)
        {
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        } else
        {
            return cys;
        }
    }

    public final Object a()
    {
        return b();
    }

    (fgq fgq1, fgr fgr1)
    {
        b = fgq1;
        a = fgr1;
        super();
    }
}
