// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jcajce.provider.symmetric.util;

import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.MacSpi;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEParameterSpec;
import org.bouncycastle.crypto.Mac;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;

// Referenced classes of package org.bouncycastle.jcajce.provider.symmetric.util:
//            PBE, BCPBEKey

public class BaseMac extends MacSpi
    implements PBE
{

    private int keySize;
    private Mac macEngine;
    private int pbeHash;
    private int pbeType;

    protected BaseMac(Mac mac)
    {
        pbeType = 2;
        pbeHash = 1;
        keySize = 160;
        macEngine = mac;
    }

    protected BaseMac(Mac mac, int i, int j, int k)
    {
        pbeType = 2;
        pbeHash = 1;
        keySize = 160;
        macEngine = mac;
        pbeType = i;
        pbeHash = j;
        keySize = k;
    }

    protected byte[] engineDoFinal()
    {
        byte abyte0[] = new byte[engineGetMacLength()];
        macEngine.doFinal(abyte0, 0);
        return abyte0;
    }

    protected int engineGetMacLength()
    {
        return macEngine.getMacSize();
    }

    protected void engineInit(Key key, AlgorithmParameterSpec algorithmparameterspec)
    {
        if (key == null)
        {
            throw new InvalidKeyException("key is null");
        }
        if (key instanceof BCPBEKey)
        {
            key = (BCPBEKey)key;
            if (key.getParam() != null)
            {
                key = key.getParam();
            } else
            if (algorithmparameterspec instanceof PBEParameterSpec)
            {
                key = PBE.Util.makePBEMacParameters(key, algorithmparameterspec);
            } else
            {
                throw new InvalidAlgorithmParameterException("PBE requires PBE parameters to be set.");
            }
        } else
        if (algorithmparameterspec instanceof IvParameterSpec)
        {
            key = new ParametersWithIV(new KeyParameter(key.getEncoded()), ((IvParameterSpec)algorithmparameterspec).getIV());
        } else
        if (algorithmparameterspec == null)
        {
            key = new KeyParameter(key.getEncoded());
        } else
        {
            throw new InvalidAlgorithmParameterException("unknown parameter type.");
        }
        macEngine.init(key);
    }

    protected void engineReset()
    {
        macEngine.reset();
    }

    protected void engineUpdate(byte byte0)
    {
        macEngine.update(byte0);
    }

    protected void engineUpdate(byte abyte0[], int i, int j)
    {
        macEngine.update(abyte0, i, j);
    }
}
