// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jce.provider;

import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import javax.crypto.SecretKey;
import javax.crypto.spec.PBEKeySpec;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.jcajce.provider.symmetric.util.BCPBEKey;

// Referenced classes of package org.bouncycastle.jce.provider:
//            JCESecretKeyFactory

public class ivSize extends JCESecretKeyFactory
{

    private int digest;
    private boolean forCipher;
    private int ivSize;
    private int keySize;
    private int scheme;

    protected SecretKey engineGenerateSecret(KeySpec keyspec)
    {
        if (keyspec instanceof PBEKeySpec)
        {
            PBEKeySpec pbekeyspec = (PBEKeySpec)keyspec;
            if (pbekeyspec.getSalt() == null)
            {
                return new BCPBEKey(algName, algOid, scheme, digest, keySize, ivSize, pbekeyspec, null);
            }
            if (forCipher)
            {
                keyspec = org.bouncycastle.jcajce.provider.symmetric.util.(pbekeyspec, scheme, digest, keySize, ivSize);
            } else
            {
                keyspec = org.bouncycastle.jcajce.provider.symmetric.util._11__08_Y(pbekeyspec, scheme, digest, keySize);
            }
            return new BCPBEKey(algName, algOid, scheme, digest, keySize, ivSize, pbekeyspec, keyspec);
        } else
        {
            throw new InvalidKeySpecException("Invalid KeySpec");
        }
    }

    public (String s, ASN1ObjectIdentifier asn1objectidentifier, boolean flag, int i, int j, int k, int l)
    {
        super(s, asn1objectidentifier);
        forCipher = flag;
        scheme = i;
        digest = j;
        keySize = k;
        ivSize = l;
    }
}
