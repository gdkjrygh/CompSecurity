// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jcajce;

import java.security.AlgorithmParameterGenerator;
import java.security.AlgorithmParameters;
import java.security.KeyFactory;
import java.security.KeyPairGenerator;
import java.security.MessageDigest;
import java.security.Signature;
import java.security.cert.CertificateFactory;
import javax.crypto.Cipher;
import javax.crypto.KeyAgreement;
import javax.crypto.KeyGenerator;
import javax.crypto.Mac;
import javax.crypto.SecretKeyFactory;

// Referenced classes of package org.bouncycastle.jcajce:
//            JcaJceHelper

public class DefaultJcaJceHelper
    implements JcaJceHelper
{

    public DefaultJcaJceHelper()
    {
    }

    public AlgorithmParameterGenerator createAlgorithmParameterGenerator(String s)
    {
        return AlgorithmParameterGenerator.getInstance(s);
    }

    public AlgorithmParameters createAlgorithmParameters(String s)
    {
        return AlgorithmParameters.getInstance(s);
    }

    public CertificateFactory createCertificateFactory(String s)
    {
        return CertificateFactory.getInstance(s);
    }

    public Cipher createCipher(String s)
    {
        return Cipher.getInstance(s);
    }

    public MessageDigest createDigest(String s)
    {
        return MessageDigest.getInstance(s);
    }

    public KeyAgreement createKeyAgreement(String s)
    {
        return KeyAgreement.getInstance(s);
    }

    public KeyFactory createKeyFactory(String s)
    {
        return KeyFactory.getInstance(s);
    }

    public KeyGenerator createKeyGenerator(String s)
    {
        return KeyGenerator.getInstance(s);
    }

    public KeyPairGenerator createKeyPairGenerator(String s)
    {
        return KeyPairGenerator.getInstance(s);
    }

    public Mac createMac(String s)
    {
        return Mac.getInstance(s);
    }

    public SecretKeyFactory createSecretKeyFactory(String s)
    {
        return SecretKeyFactory.getInstance(s);
    }

    public Signature createSignature(String s)
    {
        return Signature.getInstance(s);
    }
}
