// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jcajce.provider.symmetric.util;

import java.security.spec.KeySpec;
import javax.crypto.SecretKey;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.SecretKeySpec;

// Referenced classes of package org.bouncycastle.jcajce.provider.symmetric.util:
//            BaseSecretKeyFactory

public class t> extends BaseSecretKeyFactory
{

    protected SecretKey engineGenerateSecret(KeySpec keyspec)
    {
        if (keyspec instanceof DESKeySpec)
        {
            return new SecretKeySpec(((DESKeySpec)keyspec).getKey(), "DES");
        } else
        {
            return super.engineGenerateSecret(keyspec);
        }
    }

    public ()
    {
        super("DES", null);
    }
}
