// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.generators;

import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.Mac;
import org.bouncycastle.crypto.PBEParametersGenerator;
import org.bouncycastle.crypto.digests.SHA1Digest;
import org.bouncycastle.crypto.macs.HMac;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;

public class PKCS5S2ParametersGenerator extends PBEParametersGenerator
{

    private Mac hMac;

    public PKCS5S2ParametersGenerator()
    {
        this(((Digest) (new SHA1Digest())));
    }

    public PKCS5S2ParametersGenerator(Digest digest)
    {
        hMac = new HMac(digest);
    }

    private void F(byte abyte0[], byte abyte1[], int i, byte abyte2[], byte abyte3[], int j)
    {
        byte abyte4[] = new byte[hMac.getMacSize()];
        abyte0 = new KeyParameter(abyte0);
        hMac.init(abyte0);
        if (abyte1 != null)
        {
            hMac.update(abyte1, 0, abyte1.length);
        }
        hMac.update(abyte2, 0, abyte2.length);
        hMac.doFinal(abyte4, 0);
        System.arraycopy(abyte4, 0, abyte3, j, abyte4.length);
        if (i == 0)
        {
            throw new IllegalArgumentException("iteration count must be at least 1.");
        }
        for (int k = 1; k < i; k++)
        {
            hMac.init(abyte0);
            hMac.update(abyte4, 0, abyte4.length);
            hMac.doFinal(abyte4, 0);
            for (int l = 0; l != abyte4.length; l++)
            {
                int i1 = j + l;
                abyte3[i1] = (byte)(abyte3[i1] ^ abyte4[l]);
            }

        }

    }

    private byte[] generateDerivedKey(int i)
    {
        int j = hMac.getMacSize();
        int k = ((i + j) - 1) / j;
        byte abyte0[] = new byte[4];
        byte abyte1[] = new byte[k * j];
        for (i = 1; i <= k; i++)
        {
            intToOctet(abyte0, i);
            F(password, salt, iterationCount, abyte0, abyte1, (i - 1) * j);
        }

        return abyte1;
    }

    private void intToOctet(byte abyte0[], int i)
    {
        abyte0[0] = (byte)(i >>> 24);
        abyte0[1] = (byte)(i >>> 16);
        abyte0[2] = (byte)(i >>> 8);
        abyte0[3] = (byte)i;
    }

    public CipherParameters generateDerivedMacParameters(int i)
    {
        return generateDerivedParameters(i);
    }

    public CipherParameters generateDerivedParameters(int i)
    {
        i /= 8;
        return new KeyParameter(generateDerivedKey(i), 0, i);
    }

    public CipherParameters generateDerivedParameters(int i, int j)
    {
        i /= 8;
        j /= 8;
        byte abyte0[] = generateDerivedKey(i + j);
        return new ParametersWithIV(new KeyParameter(abyte0, 0, i), abyte0, i, j);
    }
}
