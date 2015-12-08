// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.urbanairship.util;


public class UAHttpStatusUtil
{

    public UAHttpStatusUtil()
    {
    }

    public static boolean inClientErrorRange(int i)
    {
        return i / 100 == 4;
    }

    public static boolean inRedirectionRange(int i)
    {
        return i / 100 == 3;
    }

    public static boolean inServerErrorRange(int i)
    {
        return i / 100 == 5;
    }

    public static boolean inSuccessRange(int i)
    {
        return i / 100 == 2;
    }
}
