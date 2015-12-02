// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class ang.Object
    implements hst
{

    final ded a;
    final dec b;

    private ici b()
    {
        ici ici = ded.d(a).d();
        if (ici == null)
        {
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        } else
        {
            return ici;
        }
    }

    public final Object a()
    {
        return b();
    }

    (dec dec1, ded ded1)
    {
        b = dec1;
        a = ded1;
        super();
    }
}
