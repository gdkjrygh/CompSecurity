// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jcajce.provider.asymmetric.dsa;

import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.interfaces.DSAParams;
import java.security.interfaces.DSAPrivateKey;
import java.security.interfaces.DSAPublicKey;
import java.security.spec.DSAPrivateKeySpec;
import java.security.spec.DSAPublicKeySpec;
import java.security.spec.KeySpec;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.jcajce.provider.asymmetric.util.BaseKeyFactorySpi;

// Referenced classes of package org.bouncycastle.jcajce.provider.asymmetric.dsa:
//            BCDSAPrivateKey, BCDSAPublicKey, DSAUtil

public class KeyFactorySpi extends BaseKeyFactorySpi
{

    public KeyFactorySpi()
    {
    }

    protected PrivateKey engineGeneratePrivate(KeySpec keyspec)
    {
        if (keyspec instanceof DSAPrivateKeySpec)
        {
            return new BCDSAPrivateKey((DSAPrivateKeySpec)keyspec);
        } else
        {
            return super.engineGeneratePrivate(keyspec);
        }
    }

    protected PublicKey engineGeneratePublic(KeySpec keyspec)
    {
        if (keyspec instanceof DSAPublicKeySpec)
        {
            return new BCDSAPublicKey((DSAPublicKeySpec)keyspec);
        } else
        {
            return super.engineGeneratePublic(keyspec);
        }
    }

    protected KeySpec engineGetKeySpec(Key key, Class class1)
    {
        if (class1.isAssignableFrom(java/security/spec/DSAPublicKeySpec) && (key instanceof DSAPublicKey))
        {
            key = (DSAPublicKey)key;
            return new DSAPublicKeySpec(key.getY(), key.getParams().getP(), key.getParams().getQ(), key.getParams().getG());
        }
        if (class1.isAssignableFrom(java/security/spec/DSAPrivateKeySpec) && (key instanceof DSAPrivateKey))
        {
            key = (DSAPrivateKey)key;
            return new DSAPrivateKeySpec(key.getX(), key.getParams().getP(), key.getParams().getQ(), key.getParams().getG());
        } else
        {
            return super.engineGetKeySpec(key, class1);
        }
    }

    protected Key engineTranslateKey(Key key)
    {
        if (key instanceof DSAPublicKey)
        {
            return new BCDSAPublicKey((DSAPublicKey)key);
        }
        if (key instanceof DSAPrivateKey)
        {
            return new BCDSAPrivateKey((DSAPrivateKey)key);
        } else
        {
            throw new InvalidKeyException("key type unknown");
        }
    }

    public PrivateKey generatePrivate(PrivateKeyInfo privatekeyinfo)
    {
        org.bouncycastle.asn1.ASN1ObjectIdentifier asn1objectidentifier = privatekeyinfo.getPrivateKeyAlgorithm().getAlgorithm();
        if (DSAUtil.isDsaOid(asn1objectidentifier))
        {
            return new BCDSAPrivateKey(privatekeyinfo);
        } else
        {
            throw new IOException((new StringBuilder()).append("algorithm identifier ").append(asn1objectidentifier).append(" in key not recognised").toString());
        }
    }

    public PublicKey generatePublic(SubjectPublicKeyInfo subjectpublickeyinfo)
    {
        org.bouncycastle.asn1.ASN1ObjectIdentifier asn1objectidentifier = subjectpublickeyinfo.getAlgorithm().getAlgorithm();
        if (DSAUtil.isDsaOid(asn1objectidentifier))
        {
            return new BCDSAPublicKey(subjectpublickeyinfo);
        } else
        {
            throw new IOException((new StringBuilder()).append("algorithm identifier ").append(asn1objectidentifier).append(" in key not recognised").toString());
        }
    }
}
