// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class ng.Object
    implements hst
{

    final fhp a;
    final fho b;

    private cyh b()
    {
        cyh cyh = fhp.a(a).B();
        if (cyh == null)
        {
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        } else
        {
            return cyh;
        }
    }

    public final Object a()
    {
        return b();
    }

    ct(fho fho1, fhp fhp1)
    {
        b = fho1;
        a = fhp1;
        super();
    }
}
