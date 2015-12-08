// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.photo.util;

import android.util.Base64;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class PhotoCipherUtils
{
    public static class CryptoException extends Exception
    {

        public CryptoException(String s, Exception exception)
        {
            super(s, exception);
        }
    }


    private static final String CIPHER_ALGORITHM = "AES/CBC/PKCS5Padding";
    private static final byte IV_BYTES[] = {
        -96, 11, -52, -43, -34, -121, 77, -89, -12, 80, 
        -41, -81, 32, -58, -101, 119
    };
    private static final String KEY_ALGORITHM = "AES";
    private static final byte KEY_BYTES[] = {
        -103, -53, 27, 21, -15, -127, -78, 2, 91, 88, 
        31, -58, -78, 31, 95, 1, -105, 58, 0, -43, 
        13, -70, 27, 101, 61, 90, 42, 47, -97, 8, 
        -61, -44
    };

    public PhotoCipherUtils()
    {
    }

    public static String decrypt(String s)
        throws CryptoException
    {
        return new String(decrypt(Base64.decode(s, 0)));
    }

    public static byte[] decrypt(byte abyte0[])
        throws CryptoException
    {
        try
        {
            Cipher cipher = getCipher();
            cipher.init(2, getKeySpec(), getIv());
            abyte0 = cipher.doFinal(abyte0);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new CryptoException("Decryption failed: ", abyte0);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new CryptoException("Decryption failed: ", abyte0);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new CryptoException("Decryption failed: ", abyte0);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new CryptoException("Decryption failed: ", abyte0);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new CryptoException("Decryption failed: ", abyte0);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new CryptoException("Decryption failed: ", abyte0);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new CryptoException("Decryption failed: ", abyte0);
        }
        return abyte0;
    }

    public static String encrypt(String s)
        throws CryptoException
    {
        return Base64.encodeToString(encrypt(s.getBytes()), 0);
    }

    public static byte[] encrypt(byte abyte0[])
        throws CryptoException
    {
        try
        {
            Cipher cipher = getCipher();
            cipher.init(1, getKeySpec(), getIv());
            abyte0 = cipher.doFinal(abyte0);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new CryptoException("Encryption failed: ", abyte0);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new CryptoException("Encryption failed: ", abyte0);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new CryptoException("Encryption failed: ", abyte0);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new CryptoException("Encryption failed: ", abyte0);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new CryptoException("Encryption failed: ", abyte0);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new CryptoException("Encryption failed: ", abyte0);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new CryptoException("Decryption failed: ", abyte0);
        }
        return abyte0;
    }

    private static Cipher getCipher()
        throws NoSuchAlgorithmException, NoSuchPaddingException
    {
        return Cipher.getInstance("AES/CBC/PKCS5Padding");
    }

    private static IvParameterSpec getIv()
    {
        return new IvParameterSpec(IV_BYTES);
    }

    private static SecretKeySpec getKeySpec()
    {
        return new SecretKeySpec(KEY_BYTES, "AES");
    }

}
