// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class czz extends czt
{

    private final chp a;
    private final czb b;

    public czz(chp chp1, czb czb1)
    {
        a = chp1;
        b = czb1;
    }

    private void c()
    {
        cic cic = b.f();
        if (cic == null)
        {
            throw new RuntimeException("Events must be specified for every activity. If no impression events are desired, return RiderActivity#NO_ACTIVITY_IMPRESSION");
        }
        if (cic != czb.a)
        {
            a.a(cic);
        }
    }

    public final void a()
    {
        c();
    }
}
