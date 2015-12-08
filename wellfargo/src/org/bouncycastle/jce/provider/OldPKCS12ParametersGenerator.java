// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jce.provider;

import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.PBEParametersGenerator;
import org.bouncycastle.crypto.digests.MD5Digest;
import org.bouncycastle.crypto.digests.RIPEMD160Digest;
import org.bouncycastle.crypto.digests.SHA1Digest;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;

class OldPKCS12ParametersGenerator extends PBEParametersGenerator
{

    public static final int IV_MATERIAL = 2;
    public static final int KEY_MATERIAL = 1;
    public static final int MAC_MATERIAL = 3;
    private Digest digest;
    private int u;
    private int v;

    public OldPKCS12ParametersGenerator(Digest digest1)
    {
        digest = digest1;
        if (digest1 instanceof MD5Digest)
        {
            u = 16;
            v = 64;
            return;
        }
        if (digest1 instanceof SHA1Digest)
        {
            u = 20;
            v = 64;
            return;
        }
        if (digest1 instanceof RIPEMD160Digest)
        {
            u = 20;
            v = 64;
            return;
        } else
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Digest ").append(digest1.getAlgorithmName()).append(" unsupported").toString());
        }
    }

    private void adjust(byte abyte0[], int i, byte abyte1[])
    {
        int j = (abyte1[abyte1.length - 1] & 0xff) + (abyte0[(abyte1.length + i) - 1] & 0xff) + 1;
        abyte0[(abyte1.length + i) - 1] = (byte)j;
        int l = j >>> 8;
        for (int k = abyte1.length - 2; k >= 0; k--)
        {
            l += (abyte1[k] & 0xff) + (abyte0[i + k] & 0xff);
            abyte0[i + k] = (byte)l;
            l >>>= 8;
        }

    }

    private byte[] generateDerivedKey(int i, int j)
    {
        byte abyte2[] = new byte[v];
        byte abyte3[] = new byte[j];
        for (int k = 0; k != abyte2.length; k++)
        {
            abyte2[k] = (byte)i;
        }

        byte abyte0[];
        byte abyte1[];
        if (salt != null && salt.length != 0)
        {
            abyte0 = new byte[v * (((salt.length + v) - 1) / v)];
            for (i = 0; i != abyte0.length; i++)
            {
                abyte0[i] = salt[i % salt.length];
            }

        } else
        {
            abyte0 = new byte[0];
        }
        byte abyte4[];
        int l;
        if (password != null && password.length != 0)
        {
            abyte1 = new byte[v * (((password.length + v) - 1) / v)];
            for (i = 0; i != abyte1.length; i++)
            {
                abyte1[i] = password[i % password.length];
            }

        } else
        {
            abyte1 = new byte[0];
        }
        abyte4 = new byte[abyte0.length + abyte1.length];
        System.arraycopy(abyte0, 0, abyte4, 0, abyte0.length);
        System.arraycopy(abyte1, 0, abyte4, abyte0.length, abyte1.length);
        abyte0 = new byte[v];
        l = ((u + j) - 1) / u;
        i = 1;
        while (i <= l) 
        {
            abyte1 = new byte[u];
            digest.update(abyte2, 0, abyte2.length);
            digest.update(abyte4, 0, abyte4.length);
            digest.doFinal(abyte1, 0);
            for (j = 1; j != iterationCount; j++)
            {
                digest.update(abyte1, 0, abyte1.length);
                digest.doFinal(abyte1, 0);
            }

            for (j = 0; j != abyte0.length; j++)
            {
                abyte0[i] = abyte1[j % abyte1.length];
            }

            for (j = 0; j != abyte4.length / v; j++)
            {
                adjust(abyte4, v * j, abyte0);
            }

            if (i == l)
            {
                System.arraycopy(abyte1, 0, abyte3, (i - 1) * u, abyte3.length - (i - 1) * u);
            } else
            {
                System.arraycopy(abyte1, 0, abyte3, (i - 1) * u, abyte1.length);
            }
            i++;
        }
        return abyte3;
    }

    public CipherParameters generateDerivedMacParameters(int i)
    {
        i /= 8;
        return new KeyParameter(generateDerivedKey(3, i), 0, i);
    }

    public CipherParameters generateDerivedParameters(int i)
    {
        i /= 8;
        return new KeyParameter(generateDerivedKey(1, i), 0, i);
    }

    public CipherParameters generateDerivedParameters(int i, int j)
    {
        i /= 8;
        j /= 8;
        byte abyte0[] = generateDerivedKey(1, i);
        byte abyte1[] = generateDerivedKey(2, j);
        return new ParametersWithIV(new KeyParameter(abyte0, 0, i), abyte1, 0, j);
    }
}
