// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class ang.Object
    implements hst
{

    final eev a;
    final eeu b;

    private efa b()
    {
        efa efa = eev.a(a).T();
        if (efa == null)
        {
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        } else
        {
            return efa;
        }
    }

    public final Object a()
    {
        return b();
    }

    (eeu eeu1, eev eev1)
    {
        b = eeu1;
        a = eev1;
        super();
    }
}
