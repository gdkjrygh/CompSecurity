// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk.onetouch.core;

import java.security.cert.Certificate;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

// Referenced classes of package com.paypal.android.sdk.onetouch.core:
//            dd, de

public class df
{

    public df()
    {
    }

    public static byte[] a()
    {
        return dd.a(32);
    }

    public static byte[] a(byte abyte0[], Certificate certificate)
    {
        if (abyte0.length > 256)
        {
            throw new de();
        } else
        {
            certificate = certificate.getPublicKey();
            Cipher cipher = Cipher.getInstance("RSA/ECB/OAEPWithSHA1AndMGF1Padding");
            cipher.init(1, certificate);
            return cipher.doFinal(abyte0);
        }
    }

    public final byte[] a(byte abyte0[], byte abyte1[])
    {
        if (abyte0.length < 48)
        {
            throw new de();
        }
        byte abyte2[] = new byte[16];
        System.arraycopy(abyte1, 0, abyte2, 0, 16);
        byte abyte3[] = new byte[16];
        System.arraycopy(abyte1, 16, abyte3, 0, 16);
        byte abyte4[] = new byte[32];
        System.arraycopy(abyte0, 0, abyte4, 0, 32);
        abyte1 = new byte[abyte0.length - 32];
        System.arraycopy(abyte0, 32, abyte1, 0, abyte0.length - 32);
        abyte0 = Mac.getInstance("HmacSHA256");
        abyte0.init(new SecretKeySpec(abyte3, "HmacSHA256"));
        if (!dd.a(abyte0.doFinal(abyte1), abyte4))
        {
            throw new IllegalArgumentException("Signature mismatch");
        } else
        {
            abyte0 = new byte[16];
            System.arraycopy(abyte1, 0, abyte0, 0, 16);
            abyte0 = new IvParameterSpec(abyte0);
            SecretKeySpec secretkeyspec = new SecretKeySpec(abyte2, "AES");
            Cipher cipher = Cipher.getInstance("AES/CTR/NoPadding");
            cipher.init(2, secretkeyspec, abyte0);
            return cipher.doFinal(abyte1, 16, abyte1.length - 16);
        }
    }

    static 
    {
        com/paypal/android/sdk/onetouch/core/df.getSimpleName();
    }
}
