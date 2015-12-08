// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jcajce.provider.asymmetric.elgamal;

import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.KeySpec;
import javax.crypto.interfaces.DHPrivateKey;
import javax.crypto.interfaces.DHPublicKey;
import javax.crypto.spec.DHParameterSpec;
import javax.crypto.spec.DHPrivateKeySpec;
import javax.crypto.spec.DHPublicKeySpec;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.oiw.OIWObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.asn1.x9.X9ObjectIdentifiers;
import org.bouncycastle.jcajce.provider.asymmetric.util.BaseKeyFactorySpi;
import org.bouncycastle.jce.interfaces.ElGamalPrivateKey;
import org.bouncycastle.jce.interfaces.ElGamalPublicKey;
import org.bouncycastle.jce.spec.ElGamalPrivateKeySpec;
import org.bouncycastle.jce.spec.ElGamalPublicKeySpec;

// Referenced classes of package org.bouncycastle.jcajce.provider.asymmetric.elgamal:
//            BCElGamalPrivateKey, BCElGamalPublicKey

public class KeyFactorySpi extends BaseKeyFactorySpi
{

    public KeyFactorySpi()
    {
    }

    protected PrivateKey engineGeneratePrivate(KeySpec keyspec)
    {
        if (keyspec instanceof ElGamalPrivateKeySpec)
        {
            return new BCElGamalPrivateKey((ElGamalPrivateKeySpec)keyspec);
        }
        if (keyspec instanceof DHPrivateKeySpec)
        {
            return new BCElGamalPrivateKey((DHPrivateKeySpec)keyspec);
        } else
        {
            return super.engineGeneratePrivate(keyspec);
        }
    }

    protected PublicKey engineGeneratePublic(KeySpec keyspec)
    {
        if (keyspec instanceof ElGamalPublicKeySpec)
        {
            return new BCElGamalPublicKey((ElGamalPublicKeySpec)keyspec);
        }
        if (keyspec instanceof DHPublicKeySpec)
        {
            return new BCElGamalPublicKey((DHPublicKeySpec)keyspec);
        } else
        {
            return super.engineGeneratePublic(keyspec);
        }
    }

    protected KeySpec engineGetKeySpec(Key key, Class class1)
    {
        if (class1.isAssignableFrom(javax/crypto/spec/DHPrivateKeySpec) && (key instanceof DHPrivateKey))
        {
            key = (DHPrivateKey)key;
            return new DHPrivateKeySpec(key.getX(), key.getParams().getP(), key.getParams().getG());
        }
        if (class1.isAssignableFrom(javax/crypto/spec/DHPublicKeySpec) && (key instanceof DHPublicKey))
        {
            key = (DHPublicKey)key;
            return new DHPublicKeySpec(key.getY(), key.getParams().getP(), key.getParams().getG());
        } else
        {
            return super.engineGetKeySpec(key, class1);
        }
    }

    protected Key engineTranslateKey(Key key)
    {
        if (key instanceof DHPublicKey)
        {
            return new BCElGamalPublicKey((DHPublicKey)key);
        }
        if (key instanceof DHPrivateKey)
        {
            return new BCElGamalPrivateKey((DHPrivateKey)key);
        }
        if (key instanceof ElGamalPublicKey)
        {
            return new BCElGamalPublicKey((ElGamalPublicKey)key);
        }
        if (key instanceof ElGamalPrivateKey)
        {
            return new BCElGamalPrivateKey((ElGamalPrivateKey)key);
        } else
        {
            throw new InvalidKeyException("key type unknown");
        }
    }

    public PrivateKey generatePrivate(PrivateKeyInfo privatekeyinfo)
    {
        ASN1ObjectIdentifier asn1objectidentifier = privatekeyinfo.getPrivateKeyAlgorithm().getAlgorithm();
        if (asn1objectidentifier.equals(PKCSObjectIdentifiers.dhKeyAgreement))
        {
            return new BCElGamalPrivateKey(privatekeyinfo);
        }
        if (asn1objectidentifier.equals(X9ObjectIdentifiers.dhpublicnumber))
        {
            return new BCElGamalPrivateKey(privatekeyinfo);
        }
        if (asn1objectidentifier.equals(OIWObjectIdentifiers.elGamalAlgorithm))
        {
            return new BCElGamalPrivateKey(privatekeyinfo);
        } else
        {
            throw new IOException((new StringBuilder()).append("algorithm identifier ").append(asn1objectidentifier).append(" in key not recognised").toString());
        }
    }

    public PublicKey generatePublic(SubjectPublicKeyInfo subjectpublickeyinfo)
    {
        ASN1ObjectIdentifier asn1objectidentifier = subjectpublickeyinfo.getAlgorithm().getAlgorithm();
        if (asn1objectidentifier.equals(PKCSObjectIdentifiers.dhKeyAgreement))
        {
            return new BCElGamalPublicKey(subjectpublickeyinfo);
        }
        if (asn1objectidentifier.equals(X9ObjectIdentifiers.dhpublicnumber))
        {
            return new BCElGamalPublicKey(subjectpublickeyinfo);
        }
        if (asn1objectidentifier.equals(OIWObjectIdentifiers.elGamalAlgorithm))
        {
            return new BCElGamalPublicKey(subjectpublickeyinfo);
        } else
        {
            throw new IOException((new StringBuilder()).append("algorithm identifier ").append(asn1objectidentifier).append(" in key not recognised").toString());
        }
    }
}
