// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jce;

import java.io.IOException;
import java.security.AlgorithmParameters;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PSSParameterSpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Set;
import javax.security.auth.x500.X500Principal;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1InputStream;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1Set;
import org.bouncycastle.asn1.DERBitString;
import org.bouncycastle.asn1.DERNull;
import org.bouncycastle.asn1.DERObjectIdentifier;
import org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;
import org.bouncycastle.asn1.oiw.OIWObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.CertificationRequest;
import org.bouncycastle.asn1.pkcs.CertificationRequestInfo;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.RSASSAPSSparams;
import org.bouncycastle.asn1.teletrust.TeleTrusTObjectIdentifiers;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.asn1.x509.X509Name;
import org.bouncycastle.asn1.x9.X9ObjectIdentifiers;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.util.Strings;

// Referenced classes of package org.bouncycastle.jce:
//            X509Principal

public class PKCS10CertificationRequest extends CertificationRequest
{

    private static Hashtable algorithms;
    private static Hashtable keyAlgorithms;
    private static Set noParams;
    private static Hashtable oids;
    private static Hashtable params;

    public PKCS10CertificationRequest(String s, X500Principal x500principal, PublicKey publickey, ASN1Set asn1set, PrivateKey privatekey)
    {
        this(s, convertName(x500principal), publickey, asn1set, privatekey, BouncyCastleProvider.PROVIDER_NAME);
    }

    public PKCS10CertificationRequest(String s, X500Principal x500principal, PublicKey publickey, ASN1Set asn1set, PrivateKey privatekey, String s1)
    {
        this(s, convertName(x500principal), publickey, asn1set, privatekey, s1);
    }

    public PKCS10CertificationRequest(String s, X509Name x509name, PublicKey publickey, ASN1Set asn1set, PrivateKey privatekey)
    {
        this(s, x509name, publickey, asn1set, privatekey, BouncyCastleProvider.PROVIDER_NAME);
    }

    public PKCS10CertificationRequest(String s, X509Name x509name, PublicKey publickey, ASN1Set asn1set, PrivateKey privatekey, String s1)
    {
        String s2 = Strings.toUpperCase(s);
        DERObjectIdentifier derobjectidentifier = (DERObjectIdentifier)algorithms.get(s2);
        if (derobjectidentifier == null)
        {
            try
            {
                derobjectidentifier = new DERObjectIdentifier(s2);
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw new IllegalArgumentException("Unknown signature type requested");
            }
        }
        if (x509name == null)
        {
            throw new IllegalArgumentException("subject must not be null");
        }
        if (publickey == null)
        {
            throw new IllegalArgumentException("public key must not be null");
        }
        if (noParams.contains(derobjectidentifier))
        {
            sigAlgId = new AlgorithmIdentifier(derobjectidentifier);
        } else
        if (params.containsKey(s2))
        {
            sigAlgId = new AlgorithmIdentifier(derobjectidentifier, (ASN1Encodable)params.get(s2));
        } else
        {
            sigAlgId = new AlgorithmIdentifier(derobjectidentifier, DERNull.INSTANCE);
        }
        try
        {
            reqInfo = new CertificationRequestInfo(x509name, new SubjectPublicKeyInfo((ASN1Sequence)ASN1Primitive.fromByteArray(publickey.getEncoded())), asn1set);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new IllegalArgumentException("can't encode public key");
        }
        if (s1 == null)
        {
            s = Signature.getInstance(s);
        } else
        {
            s = Signature.getInstance(s, s1);
        }
        s.initSign(privatekey);
        try
        {
            s.update(reqInfo.getEncoded("DER"));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("exception encoding TBS cert request - ").append(s).toString());
        }
        sigBits = new DERBitString(s.sign());
    }

    public PKCS10CertificationRequest(ASN1Sequence asn1sequence)
    {
        super(asn1sequence);
    }

    public PKCS10CertificationRequest(byte abyte0[])
    {
        super(toDERSequence(abyte0));
    }

    private static X509Name convertName(X500Principal x500principal)
    {
        try
        {
            x500principal = new X509Principal(x500principal.getEncoded());
        }
        // Misplaced declaration of an exception variable
        catch (X500Principal x500principal)
        {
            throw new IllegalArgumentException("can't convert name");
        }
        return x500principal;
    }

    private static RSASSAPSSparams creatPSSParams(AlgorithmIdentifier algorithmidentifier, int i)
    {
        return new RSASSAPSSparams(algorithmidentifier, new AlgorithmIdentifier(PKCSObjectIdentifiers.id_mgf1, algorithmidentifier), new ASN1Integer(i), new ASN1Integer(1L));
    }

    private static String getDigestAlgName(DERObjectIdentifier derobjectidentifier)
    {
        if (PKCSObjectIdentifiers.md5.equals(derobjectidentifier))
        {
            return "MD5";
        }
        if (OIWObjectIdentifiers.idSHA1.equals(derobjectidentifier))
        {
            return "SHA1";
        }
        if (NISTObjectIdentifiers.id_sha224.equals(derobjectidentifier))
        {
            return "SHA224";
        }
        if (NISTObjectIdentifiers.id_sha256.equals(derobjectidentifier))
        {
            return "SHA256";
        }
        if (NISTObjectIdentifiers.id_sha384.equals(derobjectidentifier))
        {
            return "SHA384";
        }
        if (NISTObjectIdentifiers.id_sha512.equals(derobjectidentifier))
        {
            return "SHA512";
        }
        if (TeleTrusTObjectIdentifiers.ripemd128.equals(derobjectidentifier))
        {
            return "RIPEMD128";
        }
        if (TeleTrusTObjectIdentifiers.ripemd160.equals(derobjectidentifier))
        {
            return "RIPEMD160";
        }
        if (TeleTrusTObjectIdentifiers.ripemd256.equals(derobjectidentifier))
        {
            return "RIPEMD256";
        }
        if (CryptoProObjectIdentifiers.gostR3411.equals(derobjectidentifier))
        {
            return "GOST3411";
        } else
        {
            return derobjectidentifier.getId();
        }
    }

    static String getSignatureName(AlgorithmIdentifier algorithmidentifier)
    {
        ASN1Encodable asn1encodable = algorithmidentifier.getParameters();
        if (asn1encodable != null && !DERNull.INSTANCE.equals(asn1encodable) && algorithmidentifier.getObjectId().equals(PKCSObjectIdentifiers.id_RSASSA_PSS))
        {
            algorithmidentifier = RSASSAPSSparams.getInstance(asn1encodable);
            return (new StringBuilder()).append(getDigestAlgName(algorithmidentifier.getHashAlgorithm().getObjectId())).append("withRSAandMGF1").toString();
        } else
        {
            return algorithmidentifier.getObjectId().getId();
        }
    }

    private void setSignatureParameters(Signature signature, ASN1Encodable asn1encodable)
    {
        if (asn1encodable == null || DERNull.INSTANCE.equals(asn1encodable))
        {
            break MISSING_BLOCK_LABEL_66;
        }
        AlgorithmParameters algorithmparameters = AlgorithmParameters.getInstance(signature.getAlgorithm(), signature.getProvider());
        try
        {
            algorithmparameters.init(asn1encodable.toASN1Primitive().getEncoded("DER"));
        }
        // Misplaced declaration of an exception variable
        catch (Signature signature)
        {
            throw new SignatureException((new StringBuilder()).append("IOException decoding parameters: ").append(signature.getMessage()).toString());
        }
        if (!signature.getAlgorithm().endsWith("MGF1"))
        {
            break MISSING_BLOCK_LABEL_66;
        }
        signature.setParameter(algorithmparameters.getParameterSpec(java/security/spec/PSSParameterSpec));
        return;
        signature;
        throw new SignatureException((new StringBuilder()).append("Exception extracting parameters: ").append(signature.getMessage()).toString());
    }

    private static ASN1Sequence toDERSequence(byte abyte0[])
    {
        try
        {
            abyte0 = (ASN1Sequence)(new ASN1InputStream(abyte0)).readObject();
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new IllegalArgumentException("badly encoded request");
        }
        return abyte0;
    }

    public byte[] getEncoded()
    {
        byte abyte0[];
        try
        {
            abyte0 = getEncoded("DER");
        }
        catch (IOException ioexception)
        {
            throw new RuntimeException(ioexception.toString());
        }
        return abyte0;
    }

    public PublicKey getPublicKey()
    {
        return getPublicKey(BouncyCastleProvider.PROVIDER_NAME);
    }

    public PublicKey getPublicKey(String s)
    {
        Object obj = reqInfo.getSubjectPublicKeyInfo();
        X509EncodedKeySpec x509encodedkeyspec;
        PublicKey publickey;
        NoSuchAlgorithmException nosuchalgorithmexception;
        try
        {
            x509encodedkeyspec = new X509EncodedKeySpec((new DERBitString(((ASN1Encodable) (obj)))).getBytes());
            obj = ((SubjectPublicKeyInfo) (obj)).getAlgorithm();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new InvalidKeyException("error decoding public key");
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new InvalidKeyException("error decoding public key");
        }
        if (s != null)
        {
            break MISSING_BLOCK_LABEL_51;
        }
        return KeyFactory.getInstance(((AlgorithmIdentifier) (obj)).getAlgorithm().getId()).generatePublic(x509encodedkeyspec);
        publickey = KeyFactory.getInstance(((AlgorithmIdentifier) (obj)).getAlgorithm().getId(), s).generatePublic(x509encodedkeyspec);
        return publickey;
        nosuchalgorithmexception;
        if (keyAlgorithms.get(((AlgorithmIdentifier) (obj)).getObjectId()) == null)
        {
            break MISSING_BLOCK_LABEL_123;
        }
        obj = (String)keyAlgorithms.get(((AlgorithmIdentifier) (obj)).getObjectId());
        if (s != null)
        {
            break MISSING_BLOCK_LABEL_113;
        }
        return KeyFactory.getInstance(((String) (obj))).generatePublic(x509encodedkeyspec);
        return KeyFactory.getInstance(((String) (obj)), s).generatePublic(x509encodedkeyspec);
        throw nosuchalgorithmexception;
    }

    public boolean verify()
    {
        return verify(BouncyCastleProvider.PROVIDER_NAME);
    }

    public boolean verify(String s)
    {
        return verify(getPublicKey(s), s);
    }

    public boolean verify(PublicKey publickey, String s)
    {
        if (s != null) goto _L2; else goto _L1
_L1:
        Signature signature = Signature.getInstance(getSignatureName(sigAlgId));
        s = signature;
_L3:
        setSignatureParameters(s, sigAlgId.getParameters());
        s.initVerify(publickey);
        Signature signature1;
        Object obj;
        try
        {
            s.update(reqInfo.getEncoded("DER"));
        }
        // Misplaced declaration of an exception variable
        catch (PublicKey publickey)
        {
            throw new SignatureException((new StringBuilder()).append("exception encoding TBS cert request - ").append(publickey).toString());
        }
        return s.verify(sigBits.getBytes());
_L2:
        signature1 = Signature.getInstance(getSignatureName(sigAlgId), s);
        s = signature1;
          goto _L3
        obj;
        if (oids.get(sigAlgId.getObjectId()) != null)
        {
            obj = (String)oids.get(sigAlgId.getObjectId());
            if (s == null)
            {
                s = Signature.getInstance(((String) (obj)));
            } else
            {
                s = Signature.getInstance(((String) (obj)), s);
            }
        } else
        {
            throw obj;
        }
          goto _L3
    }

    static 
    {
        algorithms = new Hashtable();
        params = new Hashtable();
        keyAlgorithms = new Hashtable();
        oids = new Hashtable();
        noParams = new HashSet();
        algorithms.put("MD2WITHRSAENCRYPTION", new DERObjectIdentifier("1.2.840.113549.1.1.2"));
        algorithms.put("MD2WITHRSA", new DERObjectIdentifier("1.2.840.113549.1.1.2"));
        algorithms.put("MD5WITHRSAENCRYPTION", new DERObjectIdentifier("1.2.840.113549.1.1.4"));
        algorithms.put("MD5WITHRSA", new DERObjectIdentifier("1.2.840.113549.1.1.4"));
        algorithms.put("RSAWITHMD5", new DERObjectIdentifier("1.2.840.113549.1.1.4"));
        algorithms.put("SHA1WITHRSAENCRYPTION", new DERObjectIdentifier("1.2.840.113549.1.1.5"));
        algorithms.put("SHA1WITHRSA", new DERObjectIdentifier("1.2.840.113549.1.1.5"));
        algorithms.put("SHA224WITHRSAENCRYPTION", PKCSObjectIdentifiers.sha224WithRSAEncryption);
        algorithms.put("SHA224WITHRSA", PKCSObjectIdentifiers.sha224WithRSAEncryption);
        algorithms.put("SHA256WITHRSAENCRYPTION", PKCSObjectIdentifiers.sha256WithRSAEncryption);
        algorithms.put("SHA256WITHRSA", PKCSObjectIdentifiers.sha256WithRSAEncryption);
        algorithms.put("SHA384WITHRSAENCRYPTION", PKCSObjectIdentifiers.sha384WithRSAEncryption);
        algorithms.put("SHA384WITHRSA", PKCSObjectIdentifiers.sha384WithRSAEncryption);
        algorithms.put("SHA512WITHRSAENCRYPTION", PKCSObjectIdentifiers.sha512WithRSAEncryption);
        algorithms.put("SHA512WITHRSA", PKCSObjectIdentifiers.sha512WithRSAEncryption);
        algorithms.put("SHA1WITHRSAANDMGF1", PKCSObjectIdentifiers.id_RSASSA_PSS);
        algorithms.put("SHA224WITHRSAANDMGF1", PKCSObjectIdentifiers.id_RSASSA_PSS);
        algorithms.put("SHA256WITHRSAANDMGF1", PKCSObjectIdentifiers.id_RSASSA_PSS);
        algorithms.put("SHA384WITHRSAANDMGF1", PKCSObjectIdentifiers.id_RSASSA_PSS);
        algorithms.put("SHA512WITHRSAANDMGF1", PKCSObjectIdentifiers.id_RSASSA_PSS);
        algorithms.put("RSAWITHSHA1", new DERObjectIdentifier("1.2.840.113549.1.1.5"));
        algorithms.put("RIPEMD128WITHRSAENCRYPTION", TeleTrusTObjectIdentifiers.rsaSignatureWithripemd128);
        algorithms.put("RIPEMD128WITHRSA", TeleTrusTObjectIdentifiers.rsaSignatureWithripemd128);
        algorithms.put("RIPEMD160WITHRSAENCRYPTION", TeleTrusTObjectIdentifiers.rsaSignatureWithripemd160);
        algorithms.put("RIPEMD160WITHRSA", TeleTrusTObjectIdentifiers.rsaSignatureWithripemd160);
        algorithms.put("RIPEMD256WITHRSAENCRYPTION", TeleTrusTObjectIdentifiers.rsaSignatureWithripemd256);
        algorithms.put("RIPEMD256WITHRSA", TeleTrusTObjectIdentifiers.rsaSignatureWithripemd256);
        algorithms.put("SHA1WITHDSA", new DERObjectIdentifier("1.2.840.10040.4.3"));
        algorithms.put("DSAWITHSHA1", new DERObjectIdentifier("1.2.840.10040.4.3"));
        algorithms.put("SHA224WITHDSA", NISTObjectIdentifiers.dsa_with_sha224);
        algorithms.put("SHA256WITHDSA", NISTObjectIdentifiers.dsa_with_sha256);
        algorithms.put("SHA384WITHDSA", NISTObjectIdentifiers.dsa_with_sha384);
        algorithms.put("SHA512WITHDSA", NISTObjectIdentifiers.dsa_with_sha512);
        algorithms.put("SHA1WITHECDSA", X9ObjectIdentifiers.ecdsa_with_SHA1);
        algorithms.put("SHA224WITHECDSA", X9ObjectIdentifiers.ecdsa_with_SHA224);
        algorithms.put("SHA256WITHECDSA", X9ObjectIdentifiers.ecdsa_with_SHA256);
        algorithms.put("SHA384WITHECDSA", X9ObjectIdentifiers.ecdsa_with_SHA384);
        algorithms.put("SHA512WITHECDSA", X9ObjectIdentifiers.ecdsa_with_SHA512);
        algorithms.put("ECDSAWITHSHA1", X9ObjectIdentifiers.ecdsa_with_SHA1);
        algorithms.put("GOST3411WITHGOST3410", CryptoProObjectIdentifiers.gostR3411_94_with_gostR3410_94);
        algorithms.put("GOST3410WITHGOST3411", CryptoProObjectIdentifiers.gostR3411_94_with_gostR3410_94);
        algorithms.put("GOST3411WITHECGOST3410", CryptoProObjectIdentifiers.gostR3411_94_with_gostR3410_2001);
        algorithms.put("GOST3411WITHECGOST3410-2001", CryptoProObjectIdentifiers.gostR3411_94_with_gostR3410_2001);
        algorithms.put("GOST3411WITHGOST3410-2001", CryptoProObjectIdentifiers.gostR3411_94_with_gostR3410_2001);
        oids.put(new DERObjectIdentifier("1.2.840.113549.1.1.5"), "SHA1WITHRSA");
        oids.put(PKCSObjectIdentifiers.sha224WithRSAEncryption, "SHA224WITHRSA");
        oids.put(PKCSObjectIdentifiers.sha256WithRSAEncryption, "SHA256WITHRSA");
        oids.put(PKCSObjectIdentifiers.sha384WithRSAEncryption, "SHA384WITHRSA");
        oids.put(PKCSObjectIdentifiers.sha512WithRSAEncryption, "SHA512WITHRSA");
        oids.put(CryptoProObjectIdentifiers.gostR3411_94_with_gostR3410_94, "GOST3411WITHGOST3410");
        oids.put(CryptoProObjectIdentifiers.gostR3411_94_with_gostR3410_2001, "GOST3411WITHECGOST3410");
        oids.put(new DERObjectIdentifier("1.2.840.113549.1.1.4"), "MD5WITHRSA");
        oids.put(new DERObjectIdentifier("1.2.840.113549.1.1.2"), "MD2WITHRSA");
        oids.put(new DERObjectIdentifier("1.2.840.10040.4.3"), "SHA1WITHDSA");
        oids.put(X9ObjectIdentifiers.ecdsa_with_SHA1, "SHA1WITHECDSA");
        oids.put(X9ObjectIdentifiers.ecdsa_with_SHA224, "SHA224WITHECDSA");
        oids.put(X9ObjectIdentifiers.ecdsa_with_SHA256, "SHA256WITHECDSA");
        oids.put(X9ObjectIdentifiers.ecdsa_with_SHA384, "SHA384WITHECDSA");
        oids.put(X9ObjectIdentifiers.ecdsa_with_SHA512, "SHA512WITHECDSA");
        oids.put(OIWObjectIdentifiers.sha1WithRSA, "SHA1WITHRSA");
        oids.put(OIWObjectIdentifiers.dsaWithSHA1, "SHA1WITHDSA");
        oids.put(NISTObjectIdentifiers.dsa_with_sha224, "SHA224WITHDSA");
        oids.put(NISTObjectIdentifiers.dsa_with_sha256, "SHA256WITHDSA");
        keyAlgorithms.put(PKCSObjectIdentifiers.rsaEncryption, "RSA");
        keyAlgorithms.put(X9ObjectIdentifiers.id_dsa, "DSA");
        noParams.add(X9ObjectIdentifiers.ecdsa_with_SHA1);
        noParams.add(X9ObjectIdentifiers.ecdsa_with_SHA224);
        noParams.add(X9ObjectIdentifiers.ecdsa_with_SHA256);
        noParams.add(X9ObjectIdentifiers.ecdsa_with_SHA384);
        noParams.add(X9ObjectIdentifiers.ecdsa_with_SHA512);
        noParams.add(X9ObjectIdentifiers.id_dsa_with_sha1);
        noParams.add(NISTObjectIdentifiers.dsa_with_sha224);
        noParams.add(NISTObjectIdentifiers.dsa_with_sha256);
        noParams.add(CryptoProObjectIdentifiers.gostR3411_94_with_gostR3410_94);
        noParams.add(CryptoProObjectIdentifiers.gostR3411_94_with_gostR3410_2001);
        AlgorithmIdentifier algorithmidentifier = new AlgorithmIdentifier(OIWObjectIdentifiers.idSHA1, DERNull.INSTANCE);
        params.put("SHA1WITHRSAANDMGF1", creatPSSParams(algorithmidentifier, 20));
        algorithmidentifier = new AlgorithmIdentifier(NISTObjectIdentifiers.id_sha224, DERNull.INSTANCE);
        params.put("SHA224WITHRSAANDMGF1", creatPSSParams(algorithmidentifier, 28));
        algorithmidentifier = new AlgorithmIdentifier(NISTObjectIdentifiers.id_sha256, DERNull.INSTANCE);
        params.put("SHA256WITHRSAANDMGF1", creatPSSParams(algorithmidentifier, 32));
        algorithmidentifier = new AlgorithmIdentifier(NISTObjectIdentifiers.id_sha384, DERNull.INSTANCE);
        params.put("SHA384WITHRSAANDMGF1", creatPSSParams(algorithmidentifier, 48));
        algorithmidentifier = new AlgorithmIdentifier(NISTObjectIdentifiers.id_sha512, DERNull.INSTANCE);
        params.put("SHA512WITHRSAANDMGF1", creatPSSParams(algorithmidentifier, 64));
    }
}
