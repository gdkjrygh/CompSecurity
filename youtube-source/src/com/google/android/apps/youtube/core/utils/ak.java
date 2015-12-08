// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.utils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

final class ak
{

    public static MessageDigest a;

    private ak()
    {
    }

    static 
    {
        try
        {
            MessageDigest messagedigest = MessageDigest.getInstance("SHA-256");
            a = messagedigest;
            messagedigest.reset();
        }
        catch (NoSuchAlgorithmException nosuchalgorithmexception)
        {
            throw new RuntimeException("Fatal error: system missing SHA-256 implementation.");
        }
    }
}
