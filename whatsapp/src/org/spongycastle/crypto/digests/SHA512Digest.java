// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.crypto.digests;

import org.spongycastle.util.Memoable;
import org.spongycastle.util.Pack;

// Referenced classes of package org.spongycastle.crypto.digests:
//            LongDigest

public class SHA512Digest extends LongDigest
{

    private static final int DIGEST_LENGTH = 64;
    private static final String z;

    public SHA512Digest()
    {
    }

    public SHA512Digest(SHA512Digest sha512digest)
    {
        super(sha512digest);
    }

    public SHA512Digest(byte abyte0[])
    {
        restoreState(abyte0);
    }

    public Memoable copy()
    {
        return new SHA512Digest(this);
    }

    public int doFinal(byte abyte0[], int i)
    {
        finish();
        Pack.longToBigEndian(H1, abyte0, i);
        Pack.longToBigEndian(H2, abyte0, i + 8);
        Pack.longToBigEndian(H3, abyte0, i + 16);
        Pack.longToBigEndian(H4, abyte0, i + 24);
        Pack.longToBigEndian(H5, abyte0, i + 32);
        Pack.longToBigEndian(H6, abyte0, i + 40);
        Pack.longToBigEndian(H7, abyte0, i + 48);
        Pack.longToBigEndian(H8, abyte0, i + 56);
        reset();
        return 64;
    }

    public String getAlgorithmName()
    {
        return z;
    }

    public int getDigestSize()
    {
        return 64;
    }

    public byte[] getEncodedState()
    {
        byte abyte0[] = new byte[getEncodedStateSize()];
        super.populateState(abyte0);
        return abyte0;
    }

    public void reset()
    {
        super.reset();
        H1 = 0x6a09e667f3bcc908L;
        H2 = 0xbb67ae8584caa73bL;
        H3 = 0x3c6ef372fe94f82bL;
        H4 = 0xa54ff53a5f1d36f1L;
        H5 = 0x510e527fade682d1L;
        H6 = 0x9b05688c2b3e6c1fL;
        H7 = 0x1f83d9abfb41bd6bL;
        H8 = 0x5be0cd19137e2179L;
    }

    public void reset(Memoable memoable)
    {
        copyIn((SHA512Digest)memoable);
    }

    static 
    {
        char ac[];
        int i;
        int j;
        ac = "c\0242QG\001n".toCharArray();
        j = ac.length;
        i = 0;
_L7:
        char c;
        if (j <= i)
        {
            z = (new String(ac)).intern();
            return;
        }
        c = ac[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 68
    //                   0 86
    //                   1 92
    //                   2 98
    //                   3 104;
           goto _L1 _L2 _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_104;
_L2:
        break; /* Loop/switch isn't completed */
_L1:
        byte byte0 = 114;
_L8:
        ac[i] = (char)(byte0 ^ c);
        i++;
        if (true) goto _L7; else goto _L6
_L6:
        byte0 = 48;
          goto _L8
_L3:
        byte0 = 92;
          goto _L8
_L4:
        byte0 = 115;
          goto _L8
        byte0 = 124;
          goto _L8
    }
}
