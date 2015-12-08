// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jcajce.provider.asymmetric.x509;

import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyFactorySpi;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.jce.provider.BouncyCastleProvider;

public class KeyFactory extends KeyFactorySpi
{

    public KeyFactory()
    {
    }

    protected PrivateKey engineGeneratePrivate(KeySpec keyspec)
    {
        if (!(keyspec instanceof PKCS8EncodedKeySpec))
        {
            break MISSING_BLOCK_LABEL_75;
        }
        PrivateKey privatekey;
        try
        {
            keyspec = PrivateKeyInfo.getInstance(((PKCS8EncodedKeySpec)keyspec).getEncoded());
            privatekey = BouncyCastleProvider.getPrivateKey(keyspec);
        }
        // Misplaced declaration of an exception variable
        catch (KeySpec keyspec)
        {
            throw new InvalidKeySpecException(keyspec.toString());
        }
        if (privatekey != null)
        {
            return privatekey;
        }
        throw new InvalidKeySpecException((new StringBuilder()).append("no factory found for OID: ").append(keyspec.getPrivateKeyAlgorithm().getAlgorithm()).toString());
        throw new InvalidKeySpecException((new StringBuilder()).append("Unknown KeySpec type: ").append(keyspec.getClass().getName()).toString());
    }

    protected PublicKey engineGeneratePublic(KeySpec keyspec)
    {
        if (!(keyspec instanceof X509EncodedKeySpec))
        {
            break MISSING_BLOCK_LABEL_75;
        }
        PublicKey publickey;
        try
        {
            keyspec = SubjectPublicKeyInfo.getInstance(((X509EncodedKeySpec)keyspec).getEncoded());
            publickey = BouncyCastleProvider.getPublicKey(keyspec);
        }
        // Misplaced declaration of an exception variable
        catch (KeySpec keyspec)
        {
            throw new InvalidKeySpecException(keyspec.toString());
        }
        if (publickey != null)
        {
            return publickey;
        }
        throw new InvalidKeySpecException((new StringBuilder()).append("no factory found for OID: ").append(keyspec.getAlgorithm().getAlgorithm()).toString());
        throw new InvalidKeySpecException((new StringBuilder()).append("Unknown KeySpec type: ").append(keyspec.getClass().getName()).toString());
    }

    protected KeySpec engineGetKeySpec(Key key, Class class1)
    {
        if (class1.isAssignableFrom(java/security/spec/PKCS8EncodedKeySpec) && key.getFormat().equals("PKCS#8"))
        {
            return new PKCS8EncodedKeySpec(key.getEncoded());
        }
        if (class1.isAssignableFrom(java/security/spec/X509EncodedKeySpec) && key.getFormat().equals("X.509"))
        {
            return new X509EncodedKeySpec(key.getEncoded());
        } else
        {
            throw new InvalidKeySpecException((new StringBuilder()).append("not implemented yet ").append(key).append(" ").append(class1).toString());
        }
    }

    protected Key engineTranslateKey(Key key)
    {
        throw new InvalidKeyException((new StringBuilder()).append("not implemented yet ").append(key).toString());
    }
}
