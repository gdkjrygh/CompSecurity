// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class czx extends czs
{

    private final chp a;
    private final cyz b;

    public czx(chp chp1, cyz cyz1)
    {
        a = chp1;
        b = cyz1;
    }

    private void c()
    {
        cic cic = b.a();
        if (cic == null)
        {
            throw new RuntimeException("Events must be specified for every dialog fragment. If no impression events are desired, return RiderDialogFragment#NO_DIALOG_IMPRESSION");
        }
        if (cic != cyz.e)
        {
            a.a(cic);
        }
    }

    public final void a()
    {
        c();
    }
}
