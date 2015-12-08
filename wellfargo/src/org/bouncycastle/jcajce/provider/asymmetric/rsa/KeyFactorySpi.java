// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jcajce.provider.asymmetric.rsa;

import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.RSAPrivateCrtKeySpec;
import java.security.spec.RSAPrivateKeySpec;
import java.security.spec.RSAPublicKeySpec;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.asn1.pkcs.RSAPrivateKey;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.jcajce.provider.asymmetric.util.BaseKeyFactorySpi;
import org.bouncycastle.jcajce.provider.asymmetric.util.ExtendedInvalidKeySpecException;

// Referenced classes of package org.bouncycastle.jcajce.provider.asymmetric.rsa:
//            BCRSAPrivateCrtKey, BCRSAPrivateKey, BCRSAPublicKey, RSAUtil

public class KeyFactorySpi extends BaseKeyFactorySpi
{

    public KeyFactorySpi()
    {
    }

    protected PrivateKey engineGeneratePrivate(KeySpec keyspec)
    {
        if (keyspec instanceof PKCS8EncodedKeySpec)
        {
            PrivateKey privatekey;
            try
            {
                privatekey = generatePrivate(PrivateKeyInfo.getInstance(((PKCS8EncodedKeySpec)keyspec).getEncoded()));
            }
            catch (Exception exception)
            {
                try
                {
                    keyspec = new BCRSAPrivateCrtKey(RSAPrivateKey.getInstance(((PKCS8EncodedKeySpec)keyspec).getEncoded()));
                }
                // Misplaced declaration of an exception variable
                catch (KeySpec keyspec)
                {
                    throw new ExtendedInvalidKeySpecException((new StringBuilder()).append("unable to process key spec: ").append(exception.toString()).toString(), exception);
                }
                return keyspec;
            }
            return privatekey;
        }
        if (keyspec instanceof RSAPrivateCrtKeySpec)
        {
            return new BCRSAPrivateCrtKey((RSAPrivateCrtKeySpec)keyspec);
        }
        if (keyspec instanceof RSAPrivateKeySpec)
        {
            return new BCRSAPrivateKey((RSAPrivateKeySpec)keyspec);
        } else
        {
            throw new InvalidKeySpecException((new StringBuilder()).append("Unknown KeySpec type: ").append(keyspec.getClass().getName()).toString());
        }
    }

    protected PublicKey engineGeneratePublic(KeySpec keyspec)
    {
        if (keyspec instanceof RSAPublicKeySpec)
        {
            return new BCRSAPublicKey((RSAPublicKeySpec)keyspec);
        } else
        {
            return super.engineGeneratePublic(keyspec);
        }
    }

    protected KeySpec engineGetKeySpec(Key key, Class class1)
    {
        if (class1.isAssignableFrom(java/security/spec/RSAPublicKeySpec) && (key instanceof RSAPublicKey))
        {
            key = (RSAPublicKey)key;
            return new RSAPublicKeySpec(key.getModulus(), key.getPublicExponent());
        }
        if (class1.isAssignableFrom(java/security/spec/RSAPrivateKeySpec) && (key instanceof java.security.interfaces.RSAPrivateKey))
        {
            key = (java.security.interfaces.RSAPrivateKey)key;
            return new RSAPrivateKeySpec(key.getModulus(), key.getPrivateExponent());
        }
        if (class1.isAssignableFrom(java/security/spec/RSAPrivateCrtKeySpec) && (key instanceof RSAPrivateCrtKey))
        {
            key = (RSAPrivateCrtKey)key;
            return new RSAPrivateCrtKeySpec(key.getModulus(), key.getPublicExponent(), key.getPrivateExponent(), key.getPrimeP(), key.getPrimeQ(), key.getPrimeExponentP(), key.getPrimeExponentQ(), key.getCrtCoefficient());
        } else
        {
            return super.engineGetKeySpec(key, class1);
        }
    }

    protected Key engineTranslateKey(Key key)
    {
        if (key instanceof RSAPublicKey)
        {
            return new BCRSAPublicKey((RSAPublicKey)key);
        }
        if (key instanceof RSAPrivateCrtKey)
        {
            return new BCRSAPrivateCrtKey((RSAPrivateCrtKey)key);
        }
        if (key instanceof java.security.interfaces.RSAPrivateKey)
        {
            return new BCRSAPrivateKey((java.security.interfaces.RSAPrivateKey)key);
        } else
        {
            throw new InvalidKeyException("key type unknown");
        }
    }

    public PrivateKey generatePrivate(PrivateKeyInfo privatekeyinfo)
    {
        org.bouncycastle.asn1.ASN1ObjectIdentifier asn1objectidentifier = privatekeyinfo.getPrivateKeyAlgorithm().getAlgorithm();
        if (RSAUtil.isRsaOid(asn1objectidentifier))
        {
            return new BCRSAPrivateCrtKey(privatekeyinfo);
        } else
        {
            throw new IOException((new StringBuilder()).append("algorithm identifier ").append(asn1objectidentifier).append(" in key not recognised").toString());
        }
    }

    public PublicKey generatePublic(SubjectPublicKeyInfo subjectpublickeyinfo)
    {
        org.bouncycastle.asn1.ASN1ObjectIdentifier asn1objectidentifier = subjectpublickeyinfo.getAlgorithm().getAlgorithm();
        if (RSAUtil.isRsaOid(asn1objectidentifier))
        {
            return new BCRSAPublicKey(subjectpublickeyinfo);
        } else
        {
            throw new IOException((new StringBuilder()).append("algorithm identifier ").append(asn1objectidentifier).append(" in key not recognised").toString());
        }
    }
}
