// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org;


public class Y extends RuntimeException
{

    public static boolean a = false;
    private static final long serialVersionUID = 0x4d34eff601f4aca2L;

    public Y(String s)
    {
        super(s);
    }

    public Y(String s, Throwable throwable)
    {
        super(s, throwable);
    }

    public Throwable a()
    {
        return super.getCause();
    }
}
