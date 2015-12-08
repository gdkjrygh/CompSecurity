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

public class NamedJcaJceHelper
    implements JcaJceHelper
{

    protected final String providerName;

    public NamedJcaJceHelper(String s)
    {
        providerName = s;
    }

    public AlgorithmParameterGenerator createAlgorithmParameterGenerator(String s)
    {
        return AlgorithmParameterGenerator.getInstance(s, providerName);
    }

    public AlgorithmParameters createAlgorithmParameters(String s)
    {
        return AlgorithmParameters.getInstance(s, providerName);
    }

    public CertificateFactory createCertificateFactory(String s)
    {
        return CertificateFactory.getInstance(s, providerName);
    }

    public Cipher createCipher(String s)
    {
        return Cipher.getInstance(s, providerName);
    }

    public MessageDigest createDigest(String s)
    {
        return MessageDigest.getInstance(s, providerName);
    }

    public KeyAgreement createKeyAgreement(String s)
    {
        return KeyAgreement.getInstance(s, providerName);
    }

    public KeyFactory createKeyFactory(String s)
    {
        return KeyFactory.getInstance(s, providerName);
    }

    public KeyGenerator createKeyGenerator(String s)
    {
        return KeyGenerator.getInstance(s, providerName);
    }

    public KeyPairGenerator createKeyPairGenerator(String s)
    {
        return KeyPairGenerator.getInstance(s, providerName);
    }

    public Mac createMac(String s)
    {
        return Mac.getInstance(s, providerName);
    }

    public SecretKeyFactory createSecretKeyFactory(String s)
    {
        return SecretKeyFactory.getInstance(s, providerName);
    }

    public Signature createSignature(String s)
    {
        return Signature.getInstance(s, providerName);
    }
}
