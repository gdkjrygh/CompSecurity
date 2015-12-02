// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class ang.Object
    implements hst
{

    final fgt a;
    final fgs b;

    private dqt b()
    {
        dqt dqt = fgt.a(a).aM();
        if (dqt == null)
        {
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        } else
        {
            return dqt;
        }
    }

    public final Object a()
    {
        return b();
    }

    (fgs fgs1, fgt fgt1)
    {
        b = fgs1;
        a = fgt1;
        super();
    }
}
