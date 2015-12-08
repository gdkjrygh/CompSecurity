// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.c;

import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;

final class d
{

    public static final Mac a;

    static 
    {
        try
        {
            a = Mac.getInstance("HmacSHA1");
        }
        catch (NoSuchAlgorithmException nosuchalgorithmexception)
        {
            throw new RuntimeException("Fatal error: system missing standard encryption algorithm.");
        }
    }
}
