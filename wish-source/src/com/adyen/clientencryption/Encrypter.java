// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adyen.clientencryption;

import android.util.Base64;
import java.math.BigInteger;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.RSAPublicKeySpec;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;

// Referenced classes of package com.adyen.clientencryption:
//            EncrypterException

public class Encrypter
{

    private static final String PREFIX = "adyenan";
    private static final String SEPARATOR = "$";
    private static final String VERSION = "0_1_1";
    private Cipher aesCipher;
    private PublicKey pubKey;
    private Cipher rsaCipher;
    private SecureRandom srandom;

    public Encrypter(String s)
        throws EncrypterException
    {
        srandom = new SecureRandom();
        String as[] = s.split("\\|");
        KeyFactory keyfactory;
        RSAPublicKeySpec rsapublickeyspec;
        try
        {
            keyfactory = KeyFactory.getInstance("RSA");
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
            return;
        }
        rsapublickeyspec = new RSAPublicKeySpec(new BigInteger(as[1].toLowerCase(), 16), new BigInteger(as[0].toLowerCase(), 16));
        try
        {
            pubKey = keyfactory.generatePublic(rsapublickeyspec);
        }
        catch (InvalidKeySpecException invalidkeyspecexception)
        {
            throw new EncrypterException((new StringBuilder()).append("Problem reading public key: ").append(s).toString(), invalidkeyspecexception);
        }
        try
        {
            aesCipher = Cipher.getInstance("AES/CCM/NoPadding");
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new EncrypterException("Problem instantiation AES Cipher Algorithm", s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new EncrypterException("Problem instantiation AES Cipher Padding", s);
        }
        try
        {
            rsaCipher = Cipher.getInstance("RSA/None/PKCS1Padding");
            rsaCipher.init(1, pubKey);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new EncrypterException("Problem instantiation RSA Cipher Algorithm", s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new EncrypterException("Problem instantiation RSA Cipher Padding", s);
        }
        catch (InvalidKeyException invalidkeyexception)
        {
            throw new EncrypterException((new StringBuilder()).append("Invalid public key: ").append(s).toString(), invalidkeyexception);
        }
    }

    private SecretKey generateAESKey(int i)
        throws EncrypterException
    {
        KeyGenerator keygenerator;
        try
        {
            keygenerator = KeyGenerator.getInstance("AES");
        }
        catch (NoSuchAlgorithmException nosuchalgorithmexception)
        {
            throw new EncrypterException("Unable to get AES algorithm", nosuchalgorithmexception);
        }
        keygenerator.init(i);
        return keygenerator.generateKey();
    }

    private byte[] generateIV(int i)
    {
        this;
        JVM INSTR monitorenter ;
        byte abyte0[];
        abyte0 = new byte[i];
        srandom.nextBytes(abyte0);
        this;
        JVM INSTR monitorexit ;
        return abyte0;
        Exception exception;
        exception;
        throw exception;
    }

    public String encrypt(String s)
        throws EncrypterException
    {
        SecretKey secretkey = generateAESKey(256);
        byte abyte1[] = generateIV(12);
        byte abyte2[];
        try
        {
            aesCipher.init(1, secretkey, new IvParameterSpec(abyte1));
            abyte2 = aesCipher.doFinal(s.getBytes());
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new EncrypterException("Incorrect AES Block Size", s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new EncrypterException("Incorrect AES Padding", s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new EncrypterException("Invalid AES Key", s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new EncrypterException("Invalid AES Parameters", s);
        }
        s = new byte[abyte1.length + abyte2.length];
        System.arraycopy(abyte1, 0, s, 0, abyte1.length);
        System.arraycopy(abyte2, 0, s, abyte1.length, abyte2.length);
        try
        {
            byte abyte0[] = rsaCipher.doFinal(secretkey.getEncoded());
            s = (new StringBuilder()).append("adyenan0_1_1$").append(Base64.encodeToString(abyte0, 2)).append("$").append(Base64.encodeToString(s, 2)).toString();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new EncrypterException("Incorrect RSA Block Size", s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new EncrypterException("Incorrect RSA Padding", s);
        }
        return s;
    }
}
