// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jcajce.provider.symmetric.util;

import java.lang.reflect.Constructor;
import java.security.InvalidKeyException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactorySpi;
import javax.crypto.spec.SecretKeySpec;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;

// Referenced classes of package org.bouncycastle.jcajce.provider.symmetric.util:
//            PBE

public class BaseSecretKeyFactory extends SecretKeyFactorySpi
    implements PBE
{

    protected String algName;
    protected ASN1ObjectIdentifier algOid;

    protected BaseSecretKeyFactory(String s, ASN1ObjectIdentifier asn1objectidentifier)
    {
        algName = s;
        algOid = asn1objectidentifier;
    }

    protected SecretKey engineGenerateSecret(KeySpec keyspec)
    {
        if (keyspec instanceof SecretKeySpec)
        {
            return (SecretKey)keyspec;
        } else
        {
            throw new InvalidKeySpecException("Invalid KeySpec");
        }
    }

    protected KeySpec engineGetKeySpec(SecretKey secretkey, Class class1)
    {
        if (class1 == null)
        {
            throw new InvalidKeySpecException("keySpec parameter is null");
        }
        if (secretkey == null)
        {
            throw new InvalidKeySpecException("key parameter is null");
        }
        if (javax/crypto/spec/SecretKeySpec.isAssignableFrom(class1))
        {
            return new SecretKeySpec(secretkey.getEncoded(), algName);
        }
        try
        {
            secretkey = (KeySpec)class1.getConstructor(new Class[] {
                [B
            }).newInstance(new Object[] {
                secretkey.getEncoded()
            });
        }
        // Misplaced declaration of an exception variable
        catch (SecretKey secretkey)
        {
            throw new InvalidKeySpecException(secretkey.toString());
        }
        return secretkey;
    }

    protected SecretKey engineTranslateKey(SecretKey secretkey)
    {
        if (secretkey == null)
        {
            throw new InvalidKeyException("key parameter is null");
        }
        if (!secretkey.getAlgorithm().equalsIgnoreCase(algName))
        {
            throw new InvalidKeyException((new StringBuilder()).append("Key not of type ").append(algName).append(".").toString());
        } else
        {
            return new SecretKeySpec(secretkey.getEncoded(), algName);
        }
    }
}
