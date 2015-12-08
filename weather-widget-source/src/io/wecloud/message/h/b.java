// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.wecloud.message.h;

import android.util.Base64;
import java.io.ByteArrayOutputStream;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;

public class b
{

    public static String a(String s, String s1)
    {
        try
        {
            s1 = Base64.encodeToString(a(s.getBytes("utf-8"), s1), 2);
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            s1.printStackTrace();
            return s;
        }
        return s1;
    }

    public static byte[] a(byte abyte0[], String s)
    {
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
        s = SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(s.getBytes()));
        Cipher cipher = Cipher.getInstance("DES");
        cipher.init(1, s);
        abyte0 = cipher.doFinal(abyte0);
        bytearrayoutputstream.close();
        return abyte0;
        abyte0;
        throw abyte0;
        abyte0;
        bytearrayoutputstream.close();
        throw abyte0;
    }
}
