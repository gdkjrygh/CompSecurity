// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class dpb
{

    final ica a;
    final ica b;

    public dpb(iir iir1, iir iir2)
    {
        a = iir1.c();
        b = iir2.c();
    }

    public final ica a()
    {
        return a;
    }

    public final ica b()
    {
        return b;
    }
}
