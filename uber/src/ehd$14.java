// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class ng.Object
    implements hst
{

    final ehe a;
    final ehd b;

    private cyh b()
    {
        cyh cyh = ehe.a(a).B();
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

    ct(ehd ehd1, ehe ehe1)
    {
        b = ehd1;
        a = ehe1;
        super();
    }
}
