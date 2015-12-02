// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class igy
{

    public static int a(int i)
    {
        return 1 << 32 - Integer.numberOfLeadingZeros(i - 1);
    }
}
