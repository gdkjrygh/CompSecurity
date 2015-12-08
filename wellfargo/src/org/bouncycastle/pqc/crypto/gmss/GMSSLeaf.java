// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.pqc.crypto.gmss;

import org.bouncycastle.crypto.Digest;
import org.bouncycastle.pqc.crypto.gmss.util.GMSSRandom;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.encoders.Hex;

public class GMSSLeaf
{

    private byte concHashs[];
    private GMSSRandom gmssRandom;
    private int i;
    private int j;
    private int keysize;
    private byte leaf[];
    private int mdsize;
    private Digest messDigestOTS;
    byte privateKeyOTS[];
    private byte seed[];
    private int steps;
    private int two_power_w;
    private int w;

    public GMSSLeaf(Digest digest, int k, int l)
    {
        w = k;
        messDigestOTS = digest;
        gmssRandom = new GMSSRandom(messDigestOTS);
        mdsize = messDigestOTS.getDigestSize();
        int i1 = (int)Math.ceil((double)(mdsize << 3) / (double)k);
        keysize = i1 + (int)Math.ceil((double)getLog((i1 << k) + 1) / (double)k);
        two_power_w = 1 << k;
        steps = (int)Math.ceil((double)(((1 << k) - 1) * keysize + 1 + keysize) / (double)l);
        seed = new byte[mdsize];
        leaf = new byte[mdsize];
        privateKeyOTS = new byte[mdsize];
        concHashs = new byte[mdsize * keysize];
    }

    public GMSSLeaf(Digest digest, byte abyte0[][], int ai[])
    {
        i = ai[0];
        j = ai[1];
        steps = ai[2];
        w = ai[3];
        messDigestOTS = digest;
        gmssRandom = new GMSSRandom(messDigestOTS);
        mdsize = messDigestOTS.getDigestSize();
        int k = (int)Math.ceil((double)(mdsize << 3) / (double)w);
        keysize = k + (int)Math.ceil((double)getLog((k << w) + 1) / (double)w);
        two_power_w = 1 << w;
        privateKeyOTS = abyte0[0];
        seed = abyte0[1];
        concHashs = abyte0[2];
        leaf = abyte0[3];
    }

    private int getLog(int k)
    {
        int l = 1;
        for (int i1 = 2; i1 < k;)
        {
            i1 <<= 1;
            l++;
        }

        return l;
    }

    public byte[] getLeaf()
    {
        return Arrays.clone(leaf);
    }

    public byte[][] getStatByte()
    {
        byte abyte0[][] = new byte[4][];
        abyte0[0] = new byte[mdsize];
        abyte0[1] = new byte[mdsize];
        abyte0[2] = new byte[mdsize * keysize];
        abyte0[3] = new byte[mdsize];
        abyte0[0] = privateKeyOTS;
        abyte0[1] = seed;
        abyte0[2] = concHashs;
        abyte0[3] = leaf;
        return abyte0;
    }

    public int[] getStatInt()
    {
        return (new int[] {
            i, j, steps, w
        });
    }

    public void initLeafCalc(byte abyte0[])
    {
        i = 0;
        j = 0;
        byte abyte1[] = new byte[mdsize];
        System.arraycopy(abyte0, 0, abyte1, 0, seed.length);
        seed = gmssRandom.nextSeed(abyte1);
    }

    public String toString()
    {
        String s = "";
        for (int k = 0; k < 4; k++)
        {
            s = (new StringBuilder()).append(s).append(getStatInt()[k]).append(" ").toString();
        }

        s = (new StringBuilder()).append(s).append(" ").append(mdsize).append(" ").append(keysize).append(" ").append(two_power_w).append(" ").toString();
        byte abyte0[][] = getStatByte();
        int l = 0;
        while (l < 4) 
        {
            if (abyte0[l] != null)
            {
                s = (new StringBuilder()).append(s).append(new String(Hex.encode(abyte0[l]))).append(" ").toString();
            } else
            {
                s = (new StringBuilder()).append(s).append("null ").toString();
            }
            l++;
        }
        return s;
    }

    public boolean updateLeafCalc()
    {
        int k;
        boolean flag1;
        flag1 = false;
        k = 0;
_L2:
label0:
        {
            boolean flag = flag1;
            if (k < steps)
            {
                if (i != keysize || j != two_power_w - 1)
                {
                    break label0;
                }
                messDigestOTS.update(concHashs, 0, concHashs.length);
                leaf = new byte[messDigestOTS.getDigestSize()];
                messDigestOTS.doFinal(leaf, 0);
                flag = true;
            }
            return flag;
        }
        if (i != 0 && j != two_power_w - 1)
        {
            break; /* Loop/switch isn't completed */
        }
        i = i + 1;
        j = 0;
        privateKeyOTS = gmssRandom.nextSeed(seed);
_L3:
        k++;
        if (true) goto _L2; else goto _L1
_L1:
        messDigestOTS.update(privateKeyOTS, 0, privateKeyOTS.length);
        privateKeyOTS = new byte[messDigestOTS.getDigestSize()];
        messDigestOTS.doFinal(privateKeyOTS, 0);
        j = j + 1;
        if (j == two_power_w - 1)
        {
            System.arraycopy(privateKeyOTS, 0, concHashs, mdsize * (i - 1), mdsize);
        }
          goto _L3
        if (true) goto _L2; else goto _L4
_L4:
    }
}
