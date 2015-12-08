// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.a.a;

import java.nio.ByteBuffer;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

// Referenced classes of package com.google.a.a:
//            i

public class k
{
    public class a extends Exception
    {

        final k a;

        public a()
        {
            a = k.this;
            super();
        }

        public a(Throwable throwable)
        {
            a = k.this;
            super(throwable);
        }
    }


    private final i a;
    private final SecureRandom b;

    public k(i j, SecureRandom securerandom)
    {
        a = j;
        b = securerandom;
    }

    static void a(byte abyte0[])
    {
        for (int j = 0; j < abyte0.length; j++)
        {
            abyte0[j] = (byte)(abyte0[j] ^ 0x44);
        }

    }

    public byte[] a(String s)
        throws a
    {
        try
        {
            s = a.a(s, false);
            if (s.length != 32)
            {
                throw new a();
            }
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new a(s);
        }
        byte abyte0[];
        s = ByteBuffer.wrap(s, 4, 16);
        abyte0 = new byte[16];
        s.get(abyte0);
        a(abyte0);
        return abyte0;
    }

    public byte[] a(byte abyte0[], String s)
        throws a
    {
        if (abyte0.length != 16)
        {
            throw new a();
        }
        byte abyte1[];
        Object obj;
        try
        {
            abyte1 = a.a(s, false);
            if (abyte1.length <= 16)
            {
                throw new a();
            }
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new a(abyte0);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new a(abyte0);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new a(abyte0);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new a(abyte0);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new a(abyte0);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new a(abyte0);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new a(abyte0);
        }
        obj = ByteBuffer.allocate(abyte1.length);
        ((ByteBuffer) (obj)).put(abyte1);
        ((ByteBuffer) (obj)).flip();
        s = new byte[16];
        abyte1 = new byte[abyte1.length - 16];
        ((ByteBuffer) (obj)).get(s);
        ((ByteBuffer) (obj)).get(abyte1);
        abyte0 = new SecretKeySpec(abyte0, "AES");
        obj = Cipher.getInstance("AES/CBC/PKCS5Padding");
        ((Cipher) (obj)).init(2, abyte0, new IvParameterSpec(s));
        abyte0 = ((Cipher) (obj)).doFinal(abyte1);
        return abyte0;
    }
}
