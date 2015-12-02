// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class ang.Object
    implements hst
{

    final fhp a;
    final fho b;

    private czf b()
    {
        czf czf = fhp.a(a).am();
        if (czf == null)
        {
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        } else
        {
            return czf;
        }
    }

    public final Object a()
    {
        return b();
    }

    (fho fho1, fhp fhp1)
    {
        b = fho1;
        a = fhp1;
        super();
    }
}
