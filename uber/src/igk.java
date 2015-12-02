// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class igk
    implements icc
{

    private final ici a;
    private final Object b;

    igk(ici ici1, Object obj)
    {
        a = ici1;
        b = obj;
    }

    private void a(ick ick1)
    {
        icj icj1 = a.a();
        ick1.a(icj1);
        icj1.a(new igl(ick1, b, (byte)0));
    }

    public final void call(Object obj)
    {
        a((ick)obj);
    }
}
