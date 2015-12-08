// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jcajce.provider.asymmetric;

import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.oiw.OIWObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.teletrust.TeleTrusTObjectIdentifiers;
import org.bouncycastle.asn1.x509.X509ObjectIdentifiers;
import org.bouncycastle.jcajce.provider.asymmetric.rsa.KeyFactorySpi;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.util.AsymmetricAlgorithmProvider;

public class der extends AsymmetricAlgorithmProvider
{

    private void addDigestSignature(ConfigurableProvider configurableprovider, String s, String s1, ASN1ObjectIdentifier asn1objectidentifier)
    {
        String s2 = (new StringBuilder()).append(s).append("WITHRSA").toString();
        String s3 = (new StringBuilder()).append(s).append("withRSA").toString();
        String s4 = (new StringBuilder()).append(s).append("WithRSA").toString();
        String s5 = (new StringBuilder()).append(s).append("/").append("RSA").toString();
        String s6 = (new StringBuilder()).append(s).append("WITHRSAENCRYPTION").toString();
        String s7 = (new StringBuilder()).append(s).append("withRSAEncryption").toString();
        s = (new StringBuilder()).append(s).append("WithRSAEncryption").toString();
        configurableprovider.addAlgorithm((new StringBuilder()).append("Signature.").append(s2).toString(), s1);
        configurableprovider.addAlgorithm((new StringBuilder()).append("Alg.Alias.Signature.").append(s3).toString(), s2);
        configurableprovider.addAlgorithm((new StringBuilder()).append("Alg.Alias.Signature.").append(s4).toString(), s2);
        configurableprovider.addAlgorithm((new StringBuilder()).append("Alg.Alias.Signature.").append(s6).toString(), s2);
        configurableprovider.addAlgorithm((new StringBuilder()).append("Alg.Alias.Signature.").append(s7).toString(), s2);
        configurableprovider.addAlgorithm((new StringBuilder()).append("Alg.Alias.Signature.").append(s).toString(), s2);
        configurableprovider.addAlgorithm((new StringBuilder()).append("Alg.Alias.Signature.").append(s5).toString(), s2);
        if (asn1objectidentifier != null)
        {
            configurableprovider.addAlgorithm((new StringBuilder()).append("Alg.Alias.Signature.").append(asn1objectidentifier).toString(), s2);
            configurableprovider.addAlgorithm((new StringBuilder()).append("Alg.Alias.Signature.OID.").append(asn1objectidentifier).toString(), s2);
        }
    }

    public void configure(ConfigurableProvider configurableprovider)
    {
        configurableprovider.addAlgorithm("AlgorithmParameters.OAEP", "org.bouncycastle.jcajce.provider.asymmetric.rsa.AlgorithmParametersSpi$OAEP");
        configurableprovider.addAlgorithm("AlgorithmParameters.PSS", "org.bouncycastle.jcajce.provider.asymmetric.rsa.AlgorithmParametersSpi$PSS");
        configurableprovider.addAlgorithm("Alg.Alias.AlgorithmParameters.RSAPSS", "PSS");
        configurableprovider.addAlgorithm("Alg.Alias.AlgorithmParameters.RSASSA-PSS", "PSS");
        configurableprovider.addAlgorithm("Alg.Alias.AlgorithmParameters.SHA224withRSA/PSS", "PSS");
        configurableprovider.addAlgorithm("Alg.Alias.AlgorithmParameters.SHA256withRSA/PSS", "PSS");
        configurableprovider.addAlgorithm("Alg.Alias.AlgorithmParameters.SHA384withRSA/PSS", "PSS");
        configurableprovider.addAlgorithm("Alg.Alias.AlgorithmParameters.SHA512withRSA/PSS", "PSS");
        configurableprovider.addAlgorithm("Alg.Alias.AlgorithmParameters.SHA224WITHRSAANDMGF1", "PSS");
        configurableprovider.addAlgorithm("Alg.Alias.AlgorithmParameters.SHA256WITHRSAANDMGF1", "PSS");
        configurableprovider.addAlgorithm("Alg.Alias.AlgorithmParameters.SHA384WITHRSAANDMGF1", "PSS");
        configurableprovider.addAlgorithm("Alg.Alias.AlgorithmParameters.SHA512WITHRSAANDMGF1", "PSS");
        configurableprovider.addAlgorithm("Alg.Alias.AlgorithmParameters.RAWRSAPSS", "PSS");
        configurableprovider.addAlgorithm("Alg.Alias.AlgorithmParameters.NONEWITHRSAPSS", "PSS");
        configurableprovider.addAlgorithm("Alg.Alias.AlgorithmParameters.NONEWITHRSASSA-PSS", "PSS");
        configurableprovider.addAlgorithm("Alg.Alias.AlgorithmParameters.NONEWITHRSAANDMGF1", "PSS");
        configurableprovider.addAlgorithm("Cipher.RSA", "org.bouncycastle.jcajce.provider.asymmetric.rsa.CipherSpi$NoPadding");
        configurableprovider.addAlgorithm("Cipher.RSA/RAW", "org.bouncycastle.jcajce.provider.asymmetric.rsa.CipherSpi$NoPadding");
        configurableprovider.addAlgorithm("Cipher.RSA/PKCS1", "org.bouncycastle.jcajce.provider.asymmetric.rsa.CipherSpi$PKCS1v1_5Padding");
        configurableprovider.addAlgorithm("Cipher.1.2.840.113549.1.1.1", "org.bouncycastle.jcajce.provider.asymmetric.rsa.CipherSpi$PKCS1v1_5Padding");
        configurableprovider.addAlgorithm("Cipher.2.5.8.1.1", "org.bouncycastle.jcajce.provider.asymmetric.rsa.CipherSpi$PKCS1v1_5Padding");
        configurableprovider.addAlgorithm("Cipher.RSA/1", "org.bouncycastle.jcajce.provider.asymmetric.rsa.CipherSpi$PKCS1v1_5Padding_PrivateOnly");
        configurableprovider.addAlgorithm("Cipher.RSA/2", "org.bouncycastle.jcajce.provider.asymmetric.rsa.CipherSpi$PKCS1v1_5Padding_PublicOnly");
        configurableprovider.addAlgorithm("Cipher.RSA/OAEP", "org.bouncycastle.jcajce.provider.asymmetric.rsa.CipherSpi$OAEPPadding");
        configurableprovider.addAlgorithm((new StringBuilder()).append("Cipher.").append(PKCSObjectIdentifiers.id_RSAES_OAEP).toString(), "org.bouncycastle.jcajce.provider.asymmetric.rsa.CipherSpi$OAEPPadding");
        configurableprovider.addAlgorithm("Cipher.RSA/ISO9796-1", "org.bouncycastle.jcajce.provider.asymmetric.rsa.CipherSpi$ISO9796d1Padding");
        configurableprovider.addAlgorithm("Alg.Alias.Cipher.RSA//RAW", "RSA");
        configurableprovider.addAlgorithm("Alg.Alias.Cipher.RSA//NOPADDING", "RSA");
        configurableprovider.addAlgorithm("Alg.Alias.Cipher.RSA//PKCS1PADDING", "RSA/PKCS1");
        configurableprovider.addAlgorithm("Alg.Alias.Cipher.RSA//OAEPPADDING", "RSA/OAEP");
        configurableprovider.addAlgorithm("Alg.Alias.Cipher.RSA//ISO9796-1PADDING", "RSA/ISO9796-1");
        configurableprovider.addAlgorithm("KeyFactory.RSA", "org.bouncycastle.jcajce.provider.asymmetric.rsa.KeyFactorySpi");
        configurableprovider.addAlgorithm("KeyPairGenerator.RSA", "org.bouncycastle.jcajce.provider.asymmetric.rsa.KeyPairGeneratorSpi");
        KeyFactorySpi keyfactoryspi = new KeyFactorySpi();
        registerOid(configurableprovider, PKCSObjectIdentifiers.rsaEncryption, "RSA", keyfactoryspi);
        registerOid(configurableprovider, X509ObjectIdentifiers.id_ea_rsa, "RSA", keyfactoryspi);
        registerOid(configurableprovider, PKCSObjectIdentifiers.id_RSAES_OAEP, "RSA", keyfactoryspi);
        registerOid(configurableprovider, PKCSObjectIdentifiers.id_RSASSA_PSS, "RSA", keyfactoryspi);
        registerOidAlgorithmParameters(configurableprovider, PKCSObjectIdentifiers.rsaEncryption, "RSA");
        registerOidAlgorithmParameters(configurableprovider, X509ObjectIdentifiers.id_ea_rsa, "RSA");
        registerOidAlgorithmParameters(configurableprovider, PKCSObjectIdentifiers.id_RSAES_OAEP, "OAEP");
        registerOidAlgorithmParameters(configurableprovider, PKCSObjectIdentifiers.id_RSASSA_PSS, "PSS");
        configurableprovider.addAlgorithm("Signature.RSASSA-PSS", "org.bouncycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi$PSSwithRSA");
        configurableprovider.addAlgorithm((new StringBuilder()).append("Signature.").append(PKCSObjectIdentifiers.id_RSASSA_PSS).toString(), "org.bouncycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi$PSSwithRSA");
        configurableprovider.addAlgorithm((new StringBuilder()).append("Signature.OID.").append(PKCSObjectIdentifiers.id_RSASSA_PSS).toString(), "org.bouncycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi$PSSwithRSA");
        configurableprovider.addAlgorithm("Signature.SHA224withRSA/PSS", "org.bouncycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi$SHA224withRSA");
        configurableprovider.addAlgorithm("Signature.SHA256withRSA/PSS", "org.bouncycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi$SHA256withRSA");
        configurableprovider.addAlgorithm("Signature.SHA384withRSA/PSS", "org.bouncycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi$SHA384withRSA");
        configurableprovider.addAlgorithm("Signature.SHA512withRSA/PSS", "org.bouncycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi$SHA512withRSA");
        configurableprovider.addAlgorithm("Signature.RSA", "org.bouncycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi$noneRSA");
        configurableprovider.addAlgorithm("Signature.RAWRSASSA-PSS", "org.bouncycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi$nonePSS");
        configurableprovider.addAlgorithm("Alg.Alias.Signature.RAWRSA", "RSA");
        configurableprovider.addAlgorithm("Alg.Alias.Signature.NONEWITHRSA", "RSA");
        configurableprovider.addAlgorithm("Alg.Alias.Signature.RAWRSAPSS", "RAWRSASSA-PSS");
        configurableprovider.addAlgorithm("Alg.Alias.Signature.NONEWITHRSAPSS", "RAWRSASSA-PSS");
        configurableprovider.addAlgorithm("Alg.Alias.Signature.NONEWITHRSASSA-PSS", "RAWRSASSA-PSS");
        configurableprovider.addAlgorithm("Alg.Alias.Signature.NONEWITHRSAANDMGF1", "RAWRSASSA-PSS");
        configurableprovider.addAlgorithm("Alg.Alias.Signature.RSAPSS", "RSASSA-PSS");
        configurableprovider.addAlgorithm("Alg.Alias.Signature.SHA224withRSAandMGF1", "SHA224withRSA/PSS");
        configurableprovider.addAlgorithm("Alg.Alias.Signature.SHA256withRSAandMGF1", "SHA256withRSA/PSS");
        configurableprovider.addAlgorithm("Alg.Alias.Signature.SHA384withRSAandMGF1", "SHA384withRSA/PSS");
        configurableprovider.addAlgorithm("Alg.Alias.Signature.SHA512withRSAandMGF1", "SHA512withRSA/PSS");
        configurableprovider.addAlgorithm("Alg.Alias.Signature.SHA224WITHRSAANDMGF1", "SHA224withRSA/PSS");
        configurableprovider.addAlgorithm("Alg.Alias.Signature.SHA256WITHRSAANDMGF1", "SHA256withRSA/PSS");
        configurableprovider.addAlgorithm("Alg.Alias.Signature.SHA384WITHRSAANDMGF1", "SHA384withRSA/PSS");
        configurableprovider.addAlgorithm("Alg.Alias.Signature.SHA512WITHRSAANDMGF1", "SHA512withRSA/PSS");
        if (configurableprovider.hasAlgorithm("MessageDigest", "MD2"))
        {
            addDigestSignature(configurableprovider, "MD2", "org.bouncycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi$MD2", PKCSObjectIdentifiers.md2WithRSAEncryption);
        }
        if (configurableprovider.hasAlgorithm("MessageDigest", "MD4"))
        {
            addDigestSignature(configurableprovider, "MD4", "org.bouncycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi$MD4", PKCSObjectIdentifiers.md4WithRSAEncryption);
        }
        if (configurableprovider.hasAlgorithm("MessageDigest", "MD5"))
        {
            addDigestSignature(configurableprovider, "MD5", "org.bouncycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi$MD5", PKCSObjectIdentifiers.md5WithRSAEncryption);
            configurableprovider.addAlgorithm("Signature.MD5withRSA/ISO9796-2", "org.bouncycastle.jcajce.provider.asymmetric.rsa.ISOSignatureSpi$MD5WithRSAEncryption");
            configurableprovider.addAlgorithm("Alg.Alias.Signature.MD5WithRSA/ISO9796-2", "MD5withRSA/ISO9796-2");
        }
        if (configurableprovider.hasAlgorithm("MessageDigest", "SHA1"))
        {
            configurableprovider.addAlgorithm("Alg.Alias.AlgorithmParameters.SHA1withRSA/PSS", "PSS");
            configurableprovider.addAlgorithm("Alg.Alias.AlgorithmParameters.SHA1WITHRSAANDMGF1", "PSS");
            configurableprovider.addAlgorithm("Signature.SHA1withRSA/PSS", "org.bouncycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi$SHA1withRSA");
            configurableprovider.addAlgorithm("Alg.Alias.Signature.SHA1withRSAandMGF1", "SHA1withRSA/PSS");
            configurableprovider.addAlgorithm("Alg.Alias.Signature.SHA1WITHRSAANDMGF1", "SHA1withRSA/PSS");
            addDigestSignature(configurableprovider, "SHA1", "org.bouncycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi$SHA1", PKCSObjectIdentifiers.sha1WithRSAEncryption);
            configurableprovider.addAlgorithm("Alg.Alias.Signature.SHA1WithRSA/ISO9796-2", "SHA1withRSA/ISO9796-2");
            configurableprovider.addAlgorithm("Signature.SHA1withRSA/ISO9796-2", "org.bouncycastle.jcajce.provider.asymmetric.rsa.ISOSignatureSpi$SHA1WithRSAEncryption");
            configurableprovider.addAlgorithm((new StringBuilder()).append("Alg.Alias.Signature.").append(OIWObjectIdentifiers.sha1WithRSA).toString(), "SHA1WITHRSA");
            configurableprovider.addAlgorithm((new StringBuilder()).append("Alg.Alias.Signature.OID.").append(OIWObjectIdentifiers.sha1WithRSA).toString(), "SHA1WITHRSA");
        }
        addDigestSignature(configurableprovider, "SHA224", "org.bouncycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi$SHA224", PKCSObjectIdentifiers.sha224WithRSAEncryption);
        addDigestSignature(configurableprovider, "SHA256", "org.bouncycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi$SHA256", PKCSObjectIdentifiers.sha256WithRSAEncryption);
        addDigestSignature(configurableprovider, "SHA384", "org.bouncycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi$SHA384", PKCSObjectIdentifiers.sha384WithRSAEncryption);
        addDigestSignature(configurableprovider, "SHA512", "org.bouncycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi$SHA512", PKCSObjectIdentifiers.sha512WithRSAEncryption);
        if (configurableprovider.hasAlgorithm("MessageDigest", "RIPEMD128"))
        {
            addDigestSignature(configurableprovider, "RIPEMD128", "org.bouncycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi$RIPEMD128", TeleTrusTObjectIdentifiers.rsaSignatureWithripemd128);
            addDigestSignature(configurableprovider, "RMD128", "org.bouncycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi$RIPEMD128", null);
        }
        if (configurableprovider.hasAlgorithm("MessageDigest", "RIPEMD160"))
        {
            addDigestSignature(configurableprovider, "RIPEMD160", "org.bouncycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi$RIPEMD160", TeleTrusTObjectIdentifiers.rsaSignatureWithripemd160);
            addDigestSignature(configurableprovider, "RMD160", "org.bouncycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi$RIPEMD160", null);
            configurableprovider.addAlgorithm("Alg.Alias.Signature.RIPEMD160WithRSA/ISO9796-2", "RIPEMD160withRSA/ISO9796-2");
            configurableprovider.addAlgorithm("Signature.RIPEMD160withRSA/ISO9796-2", "org.bouncycastle.jcajce.provider.asymmetric.rsa.ISOSignatureSpi$RIPEMD160WithRSAEncryption");
        }
        if (configurableprovider.hasAlgorithm("MessageDigest", "RIPEMD256"))
        {
            addDigestSignature(configurableprovider, "RIPEMD256", "org.bouncycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi$RIPEMD256", TeleTrusTObjectIdentifiers.rsaSignatureWithripemd256);
            addDigestSignature(configurableprovider, "RMD256", "org.bouncycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi$RIPEMD256", null);
        }
    }

    public der()
    {
    }
}
