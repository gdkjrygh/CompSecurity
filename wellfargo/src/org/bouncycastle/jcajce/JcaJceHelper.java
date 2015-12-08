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

public interface JcaJceHelper
{

    public abstract AlgorithmParameterGenerator createAlgorithmParameterGenerator(String s);

    public abstract AlgorithmParameters createAlgorithmParameters(String s);

    public abstract CertificateFactory createCertificateFactory(String s);

    public abstract Cipher createCipher(String s);

    public abstract MessageDigest createDigest(String s);

    public abstract KeyAgreement createKeyAgreement(String s);

    public abstract KeyFactory createKeyFactory(String s);

    public abstract KeyGenerator createKeyGenerator(String s);

    public abstract KeyPairGenerator createKeyPairGenerator(String s);

    public abstract Mac createMac(String s);

    public abstract SecretKeyFactory createSecretKeyFactory(String s);

    public abstract Signature createSignature(String s);
}
