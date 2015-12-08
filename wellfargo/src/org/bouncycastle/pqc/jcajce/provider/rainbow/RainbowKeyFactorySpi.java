// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.pqc.jcajce.provider.rainbow;

import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyFactorySpi;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter;
import org.bouncycastle.pqc.asn1.RainbowPrivateKey;
import org.bouncycastle.pqc.asn1.RainbowPublicKey;
import org.bouncycastle.pqc.jcajce.spec.RainbowPrivateKeySpec;
import org.bouncycastle.pqc.jcajce.spec.RainbowPublicKeySpec;

// Referenced classes of package org.bouncycastle.pqc.jcajce.provider.rainbow:
//            BCRainbowPrivateKey, BCRainbowPublicKey

public class RainbowKeyFactorySpi extends KeyFactorySpi
    implements AsymmetricKeyInfoConverter
{

    public RainbowKeyFactorySpi()
    {
    }

    public PrivateKey engineGeneratePrivate(KeySpec keyspec)
    {
        if (keyspec instanceof RainbowPrivateKeySpec)
        {
            return new BCRainbowPrivateKey((RainbowPrivateKeySpec)keyspec);
        }
        if (keyspec instanceof PKCS8EncodedKeySpec)
        {
            keyspec = ((PKCS8EncodedKeySpec)keyspec).getEncoded();
            try
            {
                keyspec = generatePrivate(PrivateKeyInfo.getInstance(ASN1Primitive.fromByteArray(keyspec)));
            }
            // Misplaced declaration of an exception variable
            catch (KeySpec keyspec)
            {
                throw new InvalidKeySpecException(keyspec.toString());
            }
            return keyspec;
        } else
        {
            throw new InvalidKeySpecException((new StringBuilder()).append("Unsupported key specification: ").append(keyspec.getClass()).append(".").toString());
        }
    }

    public PublicKey engineGeneratePublic(KeySpec keyspec)
    {
        if (keyspec instanceof RainbowPublicKeySpec)
        {
            return new BCRainbowPublicKey((RainbowPublicKeySpec)keyspec);
        }
        if (keyspec instanceof X509EncodedKeySpec)
        {
            keyspec = ((X509EncodedKeySpec)keyspec).getEncoded();
            try
            {
                keyspec = generatePublic(SubjectPublicKeyInfo.getInstance(keyspec));
            }
            // Misplaced declaration of an exception variable
            catch (KeySpec keyspec)
            {
                throw new InvalidKeySpecException(keyspec.toString());
            }
            return keyspec;
        } else
        {
            throw new InvalidKeySpecException((new StringBuilder()).append("Unknown key specification: ").append(keyspec).append(".").toString());
        }
    }

    public final KeySpec engineGetKeySpec(Key key, Class class1)
    {
        if (key instanceof BCRainbowPrivateKey)
        {
            if (java/security/spec/PKCS8EncodedKeySpec.isAssignableFrom(class1))
            {
                return new PKCS8EncodedKeySpec(key.getEncoded());
            }
            if (org/bouncycastle/pqc/jcajce/spec/RainbowPrivateKeySpec.isAssignableFrom(class1))
            {
                key = (BCRainbowPrivateKey)key;
                return new RainbowPrivateKeySpec(key.getInvA1(), key.getB1(), key.getInvA2(), key.getB2(), key.getVi(), key.getLayers());
            }
        } else
        if (key instanceof BCRainbowPublicKey)
        {
            if (java/security/spec/X509EncodedKeySpec.isAssignableFrom(class1))
            {
                return new X509EncodedKeySpec(key.getEncoded());
            }
            if (org/bouncycastle/pqc/jcajce/spec/RainbowPublicKeySpec.isAssignableFrom(class1))
            {
                key = (BCRainbowPublicKey)key;
                return new RainbowPublicKeySpec(key.getDocLength(), key.getCoeffQuadratic(), key.getCoeffSingular(), key.getCoeffScalar());
            }
        } else
        {
            throw new InvalidKeySpecException((new StringBuilder()).append("Unsupported key type: ").append(key.getClass()).append(".").toString());
        }
        throw new InvalidKeySpecException((new StringBuilder()).append("Unknown key specification: ").append(class1).append(".").toString());
    }

    public final Key engineTranslateKey(Key key)
    {
        if ((key instanceof BCRainbowPrivateKey) || (key instanceof BCRainbowPublicKey))
        {
            return key;
        } else
        {
            throw new InvalidKeyException("Unsupported key type");
        }
    }

    public PrivateKey generatePrivate(PrivateKeyInfo privatekeyinfo)
    {
        privatekeyinfo = RainbowPrivateKey.getInstance(privatekeyinfo.parsePrivateKey());
        return new BCRainbowPrivateKey(privatekeyinfo.getInvA1(), privatekeyinfo.getB1(), privatekeyinfo.getInvA2(), privatekeyinfo.getB2(), privatekeyinfo.getVi(), privatekeyinfo.getLayers());
    }

    public PublicKey generatePublic(SubjectPublicKeyInfo subjectpublickeyinfo)
    {
        subjectpublickeyinfo = RainbowPublicKey.getInstance(subjectpublickeyinfo.parsePublicKey());
        return new BCRainbowPublicKey(subjectpublickeyinfo.getDocLength(), subjectpublickeyinfo.getCoeffQuadratic(), subjectpublickeyinfo.getCoeffSingular(), subjectpublickeyinfo.getCoeffScalar());
    }
}
