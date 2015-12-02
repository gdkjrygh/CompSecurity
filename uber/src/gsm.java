// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.Base64;
import java.nio.charset.Charset;
import java.security.KeyFactory;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.Cipher;

public final class gsm
    implements gsj
{

    private final Cipher a;

    public gsm(String s, String s1)
    {
        a = a(s, s1);
    }

    private static Cipher a(String s, String s1)
    {
        try
        {
            s = Base64.decode(s, 0);
            s = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(s));
            s1 = Cipher.getInstance(s1);
            s1.init(1, s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return null;
        }
        return s1;
    }

    public final volatile Object a(Object obj)
    {
        return a((byte[])obj);
    }

    public final String a(String s)
    {
        try
        {
            s = Base64.encodeToString(a(s.getBytes(Charset.forName("UTF-8"))), 0);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return null;
        }
        return s;
    }

    public final byte[] a(byte abyte0[])
    {
        byte abyte1[] = null;
        if (a != null)
        {
            try
            {
                abyte1 = a.doFinal(abyte0);
            }
            // Misplaced declaration of an exception variable
            catch (byte abyte0[])
            {
                return null;
            }
        }
        return abyte1;
    }
}
