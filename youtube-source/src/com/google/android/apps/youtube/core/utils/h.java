// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.utils;

import android.content.SharedPreferences;
import android.util.Base64;
import com.google.android.apps.youtube.common.L;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.Key;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class h
{

    private static Key a()
    {
        Object obj;
        try
        {
            obj = KeyGenerator.getInstance("AES");
            ((KeyGenerator) (obj)).init(128, new SecureRandom());
            obj = ((KeyGenerator) (obj)).generateKey();
        }
        catch (NoSuchAlgorithmException nosuchalgorithmexception)
        {
            L.a("AES not recognized as a supported algorithm", nosuchalgorithmexception);
            return null;
        }
        return ((Key) (obj));
    }

    public static Key a(SharedPreferences sharedpreferences)
    {
        if (!sharedpreferences.contains("downloads_encryption_key"))
        {
            sharedpreferences.edit().putString("downloads_encryption_key", Base64.encodeToString(a().getEncoded(), 0)).apply();
        }
        return new SecretKeySpec(Base64.decode(sharedpreferences.getString("downloads_encryption_key", null), 0), "AES");
    }

    public static IvParameterSpec a(String s)
    {
        MessageDigest messagedigest = null;
        MessageDigest messagedigest1 = MessageDigest.getInstance("MD5");
        messagedigest = messagedigest1;
_L2:
        return new IvParameterSpec(messagedigest.digest(s.getBytes()));
        NoSuchAlgorithmException nosuchalgorithmexception;
        nosuchalgorithmexception;
        L.a("MD5 not recognized as a supported algorithm", nosuchalgorithmexception);
        if (true) goto _L2; else goto _L1
_L1:
    }

    private static void a(byte abyte0[], int i, int j, Key key, IvParameterSpec ivparameterspec, int k, long l)
    {
        long l1 = l / 16L;
        int j1 = (int)(l % 16L);
        byte abyte1[] = new byte[j1 + j];
        for (int i1 = 0; i1 < j; i1++)
        {
            abyte1[j1 + i1] = abyte0[i + i1];
        }

        Cipher cipher = Cipher.getInstance("AES/CTR/NoPadding");
        ivparameterspec = ByteBuffer.wrap(ivparameterspec.getIV());
        ivparameterspec.order(ByteOrder.BIG_ENDIAN);
        ivparameterspec.putLong(8, l1 + ivparameterspec.getLong(8));
        cipher.init(k, key, new IvParameterSpec(ivparameterspec.array()));
        key = cipher.doFinal(abyte1);
        for (k = 0; k < j; k++)
        {
            abyte0[i + k] = key[j1 + k];
        }

    }

    public static void a(byte abyte0[], int i, int j, Key key, IvParameterSpec ivparameterspec, long l)
    {
        a(abyte0, 0, j, key, ivparameterspec, 1, l);
    }

    public static void b(byte abyte0[], int i, int j, Key key, IvParameterSpec ivparameterspec, long l)
    {
        a(abyte0, i, j, key, ivparameterspec, 2, l);
    }
}
