// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package RLSDK;


public abstract class w
{

    private final int a;
    private final int b;

    protected w(int i, int j)
    {
        a = i;
        b = j;
    }

    public abstract byte[] a();

    public abstract byte[] a(int i, byte abyte0[]);

    public final int b()
    {
        return a;
    }

    public final int c()
    {
        return b;
    }
}
