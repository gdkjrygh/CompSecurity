// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class nit> extends edo
{

    final edv a;

    public final void onLocationEvent(ciy ciy1)
    {
        if (a() != null)
        {
            a().a(ciy1.a());
        }
    }

    public final void onNoLocationEvent(ciz ciz)
    {
        if (a() != null)
        {
            a().a(null);
        }
    }

    (edv edv1, cev cev)
    {
        a = edv1;
        super(cev);
    }
}
