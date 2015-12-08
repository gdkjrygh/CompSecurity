// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jcajce.provider.asymmetric.gost;

import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.KeySpec;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.jcajce.provider.asymmetric.util.BaseKeyFactorySpi;
import org.bouncycastle.jce.interfaces.GOST3410Params;
import org.bouncycastle.jce.interfaces.GOST3410PrivateKey;
import org.bouncycastle.jce.interfaces.GOST3410PublicKey;
import org.bouncycastle.jce.spec.GOST3410PrivateKeySpec;
import org.bouncycastle.jce.spec.GOST3410PublicKeyParameterSetSpec;
import org.bouncycastle.jce.spec.GOST3410PublicKeySpec;

// Referenced classes of package org.bouncycastle.jcajce.provider.asymmetric.gost:
//            BCGOST3410PrivateKey, BCGOST3410PublicKey

public class KeyFactorySpi extends BaseKeyFactorySpi
{

    public KeyFactorySpi()
    {
    }

    protected PrivateKey engineGeneratePrivate(KeySpec keyspec)
    {
        if (keyspec instanceof GOST3410PrivateKeySpec)
        {
            return new BCGOST3410PrivateKey((GOST3410PrivateKeySpec)keyspec);
        } else
        {
            return super.engineGeneratePrivate(keyspec);
        }
    }

    protected PublicKey engineGeneratePublic(KeySpec keyspec)
    {
        if (keyspec instanceof GOST3410PublicKeySpec)
        {
            return new BCGOST3410PublicKey((GOST3410PublicKeySpec)keyspec);
        } else
        {
            return super.engineGeneratePublic(keyspec);
        }
    }

    protected KeySpec engineGetKeySpec(Key key, Class class1)
    {
        if (class1.isAssignableFrom(org/bouncycastle/jce/spec/GOST3410PublicKeySpec) && (key instanceof GOST3410PublicKey))
        {
            key = (GOST3410PublicKey)key;
            class1 = key.getParameters().getPublicKeyParameters();
            return new GOST3410PublicKeySpec(key.getY(), class1.getP(), class1.getQ(), class1.getA());
        }
        if (class1.isAssignableFrom(org/bouncycastle/jce/spec/GOST3410PrivateKeySpec) && (key instanceof GOST3410PrivateKey))
        {
            key = (GOST3410PrivateKey)key;
            class1 = key.getParameters().getPublicKeyParameters();
            return new GOST3410PrivateKeySpec(key.getX(), class1.getP(), class1.getQ(), class1.getA());
        } else
        {
            return super.engineGetKeySpec(key, class1);
        }
    }

    protected Key engineTranslateKey(Key key)
    {
        if (key instanceof GOST3410PublicKey)
        {
            return new BCGOST3410PublicKey((GOST3410PublicKey)key);
        }
        if (key instanceof GOST3410PrivateKey)
        {
            return new BCGOST3410PrivateKey((GOST3410PrivateKey)key);
        } else
        {
            throw new InvalidKeyException("key type unknown");
        }
    }

    public PrivateKey generatePrivate(PrivateKeyInfo privatekeyinfo)
    {
        ASN1ObjectIdentifier asn1objectidentifier = privatekeyinfo.getPrivateKeyAlgorithm().getAlgorithm();
        if (asn1objectidentifier.equals(CryptoProObjectIdentifiers.gostR3410_94))
        {
            return new BCGOST3410PrivateKey(privatekeyinfo);
        } else
        {
            throw new IOException((new StringBuilder()).append("algorithm identifier ").append(asn1objectidentifier).append(" in key not recognised").toString());
        }
    }

    public PublicKey generatePublic(SubjectPublicKeyInfo subjectpublickeyinfo)
    {
        ASN1ObjectIdentifier asn1objectidentifier = subjectpublickeyinfo.getAlgorithm().getAlgorithm();
        if (asn1objectidentifier.equals(CryptoProObjectIdentifiers.gostR3410_94))
        {
            return new BCGOST3410PublicKey(subjectpublickeyinfo);
        } else
        {
            throw new IOException((new StringBuilder()).append("algorithm identifier ").append(asn1objectidentifier).append(" in key not recognised").toString());
        }
    }
}
