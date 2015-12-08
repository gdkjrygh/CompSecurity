// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.utils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

final class aj
{

    public static MessageDigest a;

    private aj()
    {
    }

    static 
    {
        try
        {
            a = MessageDigest.getInstance("SHA1");
        }
        catch (NoSuchAlgorithmException nosuchalgorithmexception)
        {
            throw new RuntimeException("Fatal error: system missing SHA1 implementation.");
        }
    }
}
