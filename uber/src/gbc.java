// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class gbc
{

    private final fte a;
    private final evt b;
    private final hsq c;
    private final hsq d;
    private final hsq e;

    public gbc(fte fte1, evt evt1, hsq hsq1, hsq hsq2, hsq hsq3)
    {
        a = fte1;
        b = evt1;
        c = hsq1;
        d = hsq2;
        e = hsq3;
    }

    final gbb a(cjg cjg1)
    {
        int i = a.g();
        boolean flag = a.p();
        if (b.e() != evv.a || cjg1 == null || !flag || cjg1.d() < 14F || !b.a(i))
        {
            return (gbb)e.a();
        }
        switch (i)
        {
        case 1: // '\001'
        default:
            return (gbb)e.a();

        case 0: // '\0'
        case 3: // '\003'
            return (gbb)c.a();

        case 2: // '\002'
            return (gbb)d.a();
        }
    }
}
