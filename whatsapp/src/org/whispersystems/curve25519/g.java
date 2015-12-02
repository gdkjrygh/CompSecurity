// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.whispersystems.curve25519;


public class g extends RuntimeException
{

    public static boolean a;
    private final Throwable b;

    public g(String s)
    {
        super(s);
        b = null;
    }

    public g(Throwable throwable)
    {
        b = throwable;
    }

    public Throwable a()
    {
        return b;
    }
}
