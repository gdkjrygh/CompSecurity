// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.ads;

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

// Referenced classes of package com.google.android.ads:
//            u

public final class Obfuscator
{

    private final u a;
    private final SecureRandom b = null;

    public Obfuscator(u u1, SecureRandom securerandom)
    {
        a = u1;
    }

    public final byte[] a(String s)
    {
        int i;
        i = 0;
        try
        {
            s = a.a(s, false);
            if (s.length != 32)
            {
                throw new ObfuscatorException();
            }
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new ObfuscatorException(s);
        }
        byte abyte0[];
        s = ByteBuffer.wrap(s, 4, 16);
        abyte0 = new byte[16];
        s.get(abyte0);
        for (; i < abyte0.length; i++)
        {
            abyte0[i] = (byte)(abyte0[i] ^ 0x44);
        }

        return abyte0;
    }

    public final byte[] a(byte abyte0[], String s)
    {
        if (abyte0.length != 16)
        {
            throw new ObfuscatorException();
        }
        byte abyte1[];
        Object obj;
        try
        {
            abyte1 = a.a(s, false);
            if (abyte1.length <= 16)
            {
                throw new ObfuscatorException();
            }
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new ObfuscatorException(abyte0);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new ObfuscatorException(abyte0);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new ObfuscatorException(abyte0);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new ObfuscatorException(abyte0);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new ObfuscatorException(abyte0);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new ObfuscatorException(abyte0);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new ObfuscatorException(abyte0);
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

    private class ObfuscatorException extends Exception
    {

        final Obfuscator this$0;

        public ObfuscatorException()
        {
            this$0 = Obfuscator.this;
            super();
        }

        public ObfuscatorException(Throwable throwable)
        {
            this$0 = Obfuscator.this;
            super(throwable);
        }
    }

}
