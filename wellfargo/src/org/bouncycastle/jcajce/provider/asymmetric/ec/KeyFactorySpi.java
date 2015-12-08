// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jcajce.provider.asymmetric.ec;

import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.KeySpec;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.asn1.x9.X9ObjectIdentifiers;
import org.bouncycastle.jcajce.provider.asymmetric.util.BaseKeyFactorySpi;
import org.bouncycastle.jcajce.provider.config.ProviderConfiguration;
import org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.jce.spec.ECParameterSpec;
import org.bouncycastle.jce.spec.ECPrivateKeySpec;
import org.bouncycastle.jce.spec.ECPublicKeySpec;

// Referenced classes of package org.bouncycastle.jcajce.provider.asymmetric.ec:
//            BCECPrivateKey, BCECPublicKey, EC5Util

public class KeyFactorySpi extends BaseKeyFactorySpi
    implements AsymmetricKeyInfoConverter
{

    String algorithm;
    ProviderConfiguration configuration;

    KeyFactorySpi(String s, ProviderConfiguration providerconfiguration)
    {
        algorithm = s;
        configuration = providerconfiguration;
    }

    protected PrivateKey engineGeneratePrivate(KeySpec keyspec)
    {
        if (keyspec instanceof ECPrivateKeySpec)
        {
            return new BCECPrivateKey(algorithm, (ECPrivateKeySpec)keyspec, configuration);
        }
        if (keyspec instanceof java.security.spec.ECPrivateKeySpec)
        {
            return new BCECPrivateKey(algorithm, (java.security.spec.ECPrivateKeySpec)keyspec, configuration);
        } else
        {
            return super.engineGeneratePrivate(keyspec);
        }
    }

    protected PublicKey engineGeneratePublic(KeySpec keyspec)
    {
        if (keyspec instanceof ECPublicKeySpec)
        {
            return new BCECPublicKey(algorithm, (ECPublicKeySpec)keyspec, configuration);
        }
        if (keyspec instanceof java.security.spec.ECPublicKeySpec)
        {
            return new BCECPublicKey(algorithm, (java.security.spec.ECPublicKeySpec)keyspec, configuration);
        } else
        {
            return super.engineGeneratePublic(keyspec);
        }
    }

    protected KeySpec engineGetKeySpec(Key key, Class class1)
    {
        if (class1.isAssignableFrom(java/security/spec/ECPublicKeySpec) && (key instanceof ECPublicKey))
        {
            key = (ECPublicKey)key;
            if (key.getParams() != null)
            {
                return new java.security.spec.ECPublicKeySpec(key.getW(), key.getParams());
            } else
            {
                class1 = BouncyCastleProvider.CONFIGURATION.getEcImplicitlyCa();
                return new java.security.spec.ECPublicKeySpec(key.getW(), EC5Util.convertSpec(EC5Util.convertCurve(class1.getCurve(), class1.getSeed()), class1));
            }
        }
        if (class1.isAssignableFrom(java/security/spec/ECPrivateKeySpec) && (key instanceof ECPrivateKey))
        {
            key = (ECPrivateKey)key;
            if (key.getParams() != null)
            {
                return new java.security.spec.ECPrivateKeySpec(key.getS(), key.getParams());
            } else
            {
                class1 = BouncyCastleProvider.CONFIGURATION.getEcImplicitlyCa();
                return new java.security.spec.ECPrivateKeySpec(key.getS(), EC5Util.convertSpec(EC5Util.convertCurve(class1.getCurve(), class1.getSeed()), class1));
            }
        }
        if (class1.isAssignableFrom(org/bouncycastle/jce/spec/ECPublicKeySpec) && (key instanceof ECPublicKey))
        {
            key = (ECPublicKey)key;
            if (key.getParams() != null)
            {
                return new ECPublicKeySpec(EC5Util.convertPoint(key.getParams(), key.getW(), false), EC5Util.convertSpec(key.getParams(), false));
            } else
            {
                class1 = BouncyCastleProvider.CONFIGURATION.getEcImplicitlyCa();
                return new ECPublicKeySpec(EC5Util.convertPoint(key.getParams(), key.getW(), false), class1);
            }
        }
        if (class1.isAssignableFrom(org/bouncycastle/jce/spec/ECPrivateKeySpec) && (key instanceof ECPrivateKey))
        {
            key = (ECPrivateKey)key;
            if (key.getParams() != null)
            {
                return new ECPrivateKeySpec(key.getS(), EC5Util.convertSpec(key.getParams(), false));
            } else
            {
                class1 = BouncyCastleProvider.CONFIGURATION.getEcImplicitlyCa();
                return new ECPrivateKeySpec(key.getS(), class1);
            }
        } else
        {
            return super.engineGetKeySpec(key, class1);
        }
    }

    protected Key engineTranslateKey(Key key)
    {
        if (key instanceof ECPublicKey)
        {
            return new BCECPublicKey((ECPublicKey)key, configuration);
        }
        if (key instanceof ECPrivateKey)
        {
            return new BCECPrivateKey((ECPrivateKey)key, configuration);
        } else
        {
            throw new InvalidKeyException("key type unknown");
        }
    }

    public PrivateKey generatePrivate(PrivateKeyInfo privatekeyinfo)
    {
        ASN1ObjectIdentifier asn1objectidentifier = privatekeyinfo.getPrivateKeyAlgorithm().getAlgorithm();
        if (asn1objectidentifier.equals(X9ObjectIdentifiers.id_ecPublicKey))
        {
            return new BCECPrivateKey(algorithm, privatekeyinfo, configuration);
        } else
        {
            throw new IOException((new StringBuilder()).append("algorithm identifier ").append(asn1objectidentifier).append(" in key not recognised").toString());
        }
    }

    public PublicKey generatePublic(SubjectPublicKeyInfo subjectpublickeyinfo)
    {
        ASN1ObjectIdentifier asn1objectidentifier = subjectpublickeyinfo.getAlgorithm().getAlgorithm();
        if (asn1objectidentifier.equals(X9ObjectIdentifiers.id_ecPublicKey))
        {
            return new BCECPublicKey(algorithm, subjectpublickeyinfo, configuration);
        } else
        {
            throw new IOException((new StringBuilder()).append("algorithm identifier ").append(asn1objectidentifier).append(" in key not recognised").toString());
        }
    }
}
