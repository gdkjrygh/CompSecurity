// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jcajce.provider.symmetric.util;

import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import javax.crypto.SecretKey;
import javax.crypto.spec.PBEKeySpec;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;

// Referenced classes of package org.bouncycastle.jcajce.provider.symmetric.util:
//            BaseSecretKeyFactory, PBE, BCPBEKey

public class PBESecretKeyFactory extends BaseSecretKeyFactory
    implements PBE
{

    private int digest;
    private boolean forCipher;
    private int ivSize;
    private int keySize;
    private int scheme;

    public PBESecretKeyFactory(String s, ASN1ObjectIdentifier asn1objectidentifier, boolean flag, int i, int j, int k, int l)
    {
        super(s, asn1objectidentifier);
        forCipher = flag;
        scheme = i;
        digest = j;
        keySize = k;
        ivSize = l;
    }

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
                keyspec = PBE.Util.makePBEParameters(pbekeyspec, scheme, digest, keySize, ivSize);
            } else
            {
                keyspec = PBE.Util.makePBEMacParameters(pbekeyspec, scheme, digest, keySize);
            }
            return new BCPBEKey(algName, algOid, scheme, digest, keySize, ivSize, pbekeyspec, keyspec);
        } else
        {
            throw new InvalidKeySpecException("Invalid KeySpec");
        }
    }
}
