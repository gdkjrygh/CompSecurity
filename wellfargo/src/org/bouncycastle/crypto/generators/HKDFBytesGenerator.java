// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.generators;

import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.DerivationFunction;
import org.bouncycastle.crypto.DerivationParameters;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.macs.HMac;
import org.bouncycastle.crypto.params.HKDFParameters;
import org.bouncycastle.crypto.params.KeyParameter;

public class HKDFBytesGenerator
    implements DerivationFunction
{

    private byte currentT[];
    private int generatedBytes;
    private HMac hMacHash;
    private int hashLen;
    private byte info[];

    public HKDFBytesGenerator(Digest digest)
    {
        hMacHash = new HMac(digest);
        hashLen = digest.getDigestSize();
    }

    private void expandNext()
    {
        int i = generatedBytes / hashLen + 1;
        if (i >= 256)
        {
            throw new DataLengthException("HKDF cannot generate more than 255 blocks of HashLen size");
        }
        if (generatedBytes != 0)
        {
            hMacHash.update(currentT, 0, hashLen);
        }
        hMacHash.update(info, 0, info.length);
        hMacHash.update((byte)i);
        hMacHash.doFinal(currentT, 0);
    }

    private KeyParameter extract(byte abyte0[], byte abyte1[])
    {
        hMacHash.init(new KeyParameter(abyte1));
        if (abyte0 == null)
        {
            hMacHash.init(new KeyParameter(new byte[hashLen]));
        } else
        {
            hMacHash.init(new KeyParameter(abyte0));
        }
        hMacHash.update(abyte1, 0, abyte1.length);
        abyte0 = new byte[hashLen];
        hMacHash.doFinal(abyte0, 0);
        return new KeyParameter(abyte0);
    }

    public int generateBytes(byte abyte0[], int i, int j)
    {
        if (generatedBytes + j > hashLen * 255)
        {
            throw new DataLengthException("HKDF may only be used for 255 * HashLen bytes of output");
        }
        if (generatedBytes % hashLen == 0)
        {
            expandNext();
        }
        int k = generatedBytes;
        int i1 = hashLen;
        int l = Math.min(hashLen - generatedBytes % hashLen, j);
        System.arraycopy(currentT, k % i1, abyte0, i, l);
        generatedBytes = generatedBytes + l;
        k = j - l;
        for (i = l + i; k > 0; i += l)
        {
            expandNext();
            l = Math.min(hashLen, k);
            System.arraycopy(currentT, 0, abyte0, i, l);
            generatedBytes = generatedBytes + l;
            k -= l;
        }

        return j;
    }

    public Digest getDigest()
    {
        return hMacHash.getUnderlyingDigest();
    }

    public void init(DerivationParameters derivationparameters)
    {
        if (!(derivationparameters instanceof HKDFParameters))
        {
            throw new IllegalArgumentException("HKDF parameters required for HKDFBytesGenerator");
        }
        derivationparameters = (HKDFParameters)derivationparameters;
        if (derivationparameters.skipExtract())
        {
            hMacHash.init(new KeyParameter(derivationparameters.getIKM()));
        } else
        {
            hMacHash.init(extract(derivationparameters.getSalt(), derivationparameters.getIKM()));
        }
        info = derivationparameters.getInfo();
        generatedBytes = 0;
        currentT = new byte[hashLen];
    }
}
