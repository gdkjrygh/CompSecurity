// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class ang.Object
    implements hst
{

    final fkz a;
    final fky b;

    private eqm b()
    {
        eqm eqm = fkz.a(a).q();
        if (eqm == null)
        {
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        } else
        {
            return eqm;
        }
    }

    public final Object a()
    {
        return b();
    }

    (fky fky1, fkz fkz1)
    {
        b = fky1;
        a = fkz1;
        super();
    }
}
