// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class iec
    implements icc
{

    final idh a;

    public iec(idh idh1)
    {
        a = idh1;
    }

    private void a(ick ick1)
    {
        ica ica1;
        try
        {
            ica1 = (ica)a.call();
        }
        catch (Throwable throwable)
        {
            ick1.a(throwable);
            return;
        }
        ica1.a(ihw.a(ick1));
    }

    public final void call(Object obj)
    {
        a((ick)obj);
    }
}
