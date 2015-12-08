// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.x509;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PrivateKey;
import java.security.Provider;
import java.security.SecureRandom;
import java.security.Security;
import java.security.Signature;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.security.auth.x500.X500Principal;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.DERNull;
import org.bouncycastle.asn1.DERObjectIdentifier;
import org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;
import org.bouncycastle.asn1.oiw.OIWObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.RSASSAPSSparams;
import org.bouncycastle.asn1.teletrust.TeleTrusTObjectIdentifiers;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x9.X9ObjectIdentifiers;
import org.bouncycastle.jce.X509Principal;
import org.bouncycastle.util.Strings;

class X509Util
{

    private static Hashtable algorithms;
    private static Set noParams;
    private static Hashtable params;

    X509Util()
    {
    }

    static byte[] calculateSignature(DERObjectIdentifier derobjectidentifier, String s, String s1, PrivateKey privatekey, SecureRandom securerandom, ASN1Encodable asn1encodable)
    {
        if (derobjectidentifier == null)
        {
            throw new IllegalStateException("no signature algorithm specified");
        }
        derobjectidentifier = getSignatureInstance(s, s1);
        if (securerandom != null)
        {
            derobjectidentifier.initSign(privatekey, securerandom);
        } else
        {
            derobjectidentifier.initSign(privatekey);
        }
        derobjectidentifier.update(asn1encodable.toASN1Primitive().getEncoded("DER"));
        return derobjectidentifier.sign();
    }

    static byte[] calculateSignature(DERObjectIdentifier derobjectidentifier, String s, PrivateKey privatekey, SecureRandom securerandom, ASN1Encodable asn1encodable)
    {
        if (derobjectidentifier == null)
        {
            throw new IllegalStateException("no signature algorithm specified");
        }
        derobjectidentifier = getSignatureInstance(s);
        if (securerandom != null)
        {
            derobjectidentifier.initSign(privatekey, securerandom);
        } else
        {
            derobjectidentifier.initSign(privatekey);
        }
        derobjectidentifier.update(asn1encodable.toASN1Primitive().getEncoded("DER"));
        return derobjectidentifier.sign();
    }

    static X509Principal convertPrincipal(X500Principal x500principal)
    {
        try
        {
            x500principal = new X509Principal(x500principal.getEncoded());
        }
        // Misplaced declaration of an exception variable
        catch (X500Principal x500principal)
        {
            throw new IllegalArgumentException("cannot convert principal");
        }
        return x500principal;
    }

    private static RSASSAPSSparams creatPSSParams(AlgorithmIdentifier algorithmidentifier, int i)
    {
        return new RSASSAPSSparams(algorithmidentifier, new AlgorithmIdentifier(PKCSObjectIdentifiers.id_mgf1, algorithmidentifier), new ASN1Integer(i), new ASN1Integer(1L));
    }

    static Iterator getAlgNames()
    {
        Enumeration enumeration = algorithms.keys();
        ArrayList arraylist = new ArrayList();
        for (; enumeration.hasMoreElements(); arraylist.add(enumeration.nextElement())) { }
        return arraylist.iterator();
    }

    static DERObjectIdentifier getAlgorithmOID(String s)
    {
        s = Strings.toUpperCase(s);
        if (algorithms.containsKey(s))
        {
            return (DERObjectIdentifier)algorithms.get(s);
        } else
        {
            return new DERObjectIdentifier(s);
        }
    }

    static Implementation getImplementation(String s, String s1)
    {
        Provider aprovider[] = Security.getProviders();
        int i = 0;
        while (i != aprovider.length) 
        {
            Implementation implementation = getImplementation(s, Strings.toUpperCase(s1), aprovider[i]);
            if (implementation != null)
            {
                return implementation;
            }
            try
            {
                getImplementation(s, s1, aprovider[i]);
            }
            catch (NoSuchAlgorithmException nosuchalgorithmexception) { }
            i++;
        }
        throw new NoSuchAlgorithmException((new StringBuilder()).append("cannot find implementation ").append(s1).toString());
    }

    static Implementation getImplementation(String s, String s1, Provider provider)
    {
        String s3;
        s1 = Strings.toUpperCase(s1);
        do
        {
            String s2 = provider.getProperty((new StringBuilder()).append("Alg.Alias.").append(s).append(".").append(s1).toString());
            if (s2 == null)
            {
                break;
            }
            s1 = s2;
        } while (true);
        s3 = provider.getProperty((new StringBuilder()).append(s).append(".").append(s1).toString());
        if (s3 == null) goto _L2; else goto _L1
_L1:
        try
        {
            s = provider.getClass().getClassLoader();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new IllegalStateException((new StringBuilder()).append("algorithm ").append(s1).append(" in provider ").append(provider.getName()).append(" but no class \"").append(s3).append("\" found!").toString());
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new IllegalStateException((new StringBuilder()).append("algorithm ").append(s1).append(" in provider ").append(provider.getName()).append(" but class \"").append(s3).append("\" inaccessible!").toString());
        }
        if (s == null) goto _L4; else goto _L3
_L3:
        s = s.loadClass(s3);
_L5:
        return new Implementation(s.newInstance(), provider);
_L4:
        s = Class.forName(s3);
        if (true) goto _L5; else goto _L2
_L2:
        throw new NoSuchAlgorithmException((new StringBuilder()).append("cannot find implementation ").append(s1).append(" for provider ").append(provider.getName()).toString());
    }

    static Provider getProvider(String s)
    {
        Provider provider = Security.getProvider(s);
        if (provider == null)
        {
            throw new NoSuchProviderException((new StringBuilder()).append("Provider ").append(s).append(" not found").toString());
        } else
        {
            return provider;
        }
    }

    static AlgorithmIdentifier getSigAlgID(DERObjectIdentifier derobjectidentifier, String s)
    {
        if (noParams.contains(derobjectidentifier))
        {
            return new AlgorithmIdentifier(derobjectidentifier);
        }
        s = Strings.toUpperCase(s);
        if (params.containsKey(s))
        {
            return new AlgorithmIdentifier(derobjectidentifier, (ASN1Encodable)params.get(s));
        } else
        {
            return new AlgorithmIdentifier(derobjectidentifier, DERNull.INSTANCE);
        }
    }

    static Signature getSignatureInstance(String s)
    {
        return Signature.getInstance(s);
    }

    static Signature getSignatureInstance(String s, String s1)
    {
        if (s1 != null)
        {
            return Signature.getInstance(s, s1);
        } else
        {
            return Signature.getInstance(s);
        }
    }

    static 
    {
        algorithms = new Hashtable();
        params = new Hashtable();
        noParams = new HashSet();
        algorithms.put("MD2WITHRSAENCRYPTION", PKCSObjectIdentifiers.md2WithRSAEncryption);
        algorithms.put("MD2WITHRSA", PKCSObjectIdentifiers.md2WithRSAEncryption);
        algorithms.put("MD5WITHRSAENCRYPTION", PKCSObjectIdentifiers.md5WithRSAEncryption);
        algorithms.put("MD5WITHRSA", PKCSObjectIdentifiers.md5WithRSAEncryption);
        algorithms.put("SHA1WITHRSAENCRYPTION", PKCSObjectIdentifiers.sha1WithRSAEncryption);
        algorithms.put("SHA1WITHRSA", PKCSObjectIdentifiers.sha1WithRSAEncryption);
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
        algorithms.put("RIPEMD160WITHRSAENCRYPTION", TeleTrusTObjectIdentifiers.rsaSignatureWithripemd160);
        algorithms.put("RIPEMD160WITHRSA", TeleTrusTObjectIdentifiers.rsaSignatureWithripemd160);
        algorithms.put("RIPEMD128WITHRSAENCRYPTION", TeleTrusTObjectIdentifiers.rsaSignatureWithripemd128);
        algorithms.put("RIPEMD128WITHRSA", TeleTrusTObjectIdentifiers.rsaSignatureWithripemd128);
        algorithms.put("RIPEMD256WITHRSAENCRYPTION", TeleTrusTObjectIdentifiers.rsaSignatureWithripemd256);
        algorithms.put("RIPEMD256WITHRSA", TeleTrusTObjectIdentifiers.rsaSignatureWithripemd256);
        algorithms.put("SHA1WITHDSA", X9ObjectIdentifiers.id_dsa_with_sha1);
        algorithms.put("DSAWITHSHA1", X9ObjectIdentifiers.id_dsa_with_sha1);
        algorithms.put("SHA224WITHDSA", NISTObjectIdentifiers.dsa_with_sha224);
        algorithms.put("SHA256WITHDSA", NISTObjectIdentifiers.dsa_with_sha256);
        algorithms.put("SHA384WITHDSA", NISTObjectIdentifiers.dsa_with_sha384);
        algorithms.put("SHA512WITHDSA", NISTObjectIdentifiers.dsa_with_sha512);
        algorithms.put("SHA1WITHECDSA", X9ObjectIdentifiers.ecdsa_with_SHA1);
        algorithms.put("ECDSAWITHSHA1", X9ObjectIdentifiers.ecdsa_with_SHA1);
        algorithms.put("SHA224WITHECDSA", X9ObjectIdentifiers.ecdsa_with_SHA224);
        algorithms.put("SHA256WITHECDSA", X9ObjectIdentifiers.ecdsa_with_SHA256);
        algorithms.put("SHA384WITHECDSA", X9ObjectIdentifiers.ecdsa_with_SHA384);
        algorithms.put("SHA512WITHECDSA", X9ObjectIdentifiers.ecdsa_with_SHA512);
        algorithms.put("GOST3411WITHGOST3410", CryptoProObjectIdentifiers.gostR3411_94_with_gostR3410_94);
        algorithms.put("GOST3411WITHGOST3410-94", CryptoProObjectIdentifiers.gostR3411_94_with_gostR3410_94);
        algorithms.put("GOST3411WITHECGOST3410", CryptoProObjectIdentifiers.gostR3411_94_with_gostR3410_2001);
        algorithms.put("GOST3411WITHECGOST3410-2001", CryptoProObjectIdentifiers.gostR3411_94_with_gostR3410_2001);
        algorithms.put("GOST3411WITHGOST3410-2001", CryptoProObjectIdentifiers.gostR3411_94_with_gostR3410_2001);
        noParams.add(X9ObjectIdentifiers.ecdsa_with_SHA1);
        noParams.add(X9ObjectIdentifiers.ecdsa_with_SHA224);
        noParams.add(X9ObjectIdentifiers.ecdsa_with_SHA256);
        noParams.add(X9ObjectIdentifiers.ecdsa_with_SHA384);
        noParams.add(X9ObjectIdentifiers.ecdsa_with_SHA512);
        noParams.add(X9ObjectIdentifiers.id_dsa_with_sha1);
        noParams.add(NISTObjectIdentifiers.dsa_with_sha224);
        noParams.add(NISTObjectIdentifiers.dsa_with_sha256);
        noParams.add(NISTObjectIdentifiers.dsa_with_sha384);
        noParams.add(NISTObjectIdentifiers.dsa_with_sha512);
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

    private class Implementation
    {

        Object engine;
        Provider provider;

        Object getEngine()
        {
            return engine;
        }

        Provider getProvider()
        {
            return provider;
        }

        Implementation(Object obj, Provider provider1)
        {
            engine = obj;
            provider = provider1;
        }
    }

}
