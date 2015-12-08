// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.digests;

import org.bouncycastle.crypto.util.Pack;

// Referenced classes of package org.bouncycastle.crypto.digests:
//            LongDigest

public class SHA512Digest extends LongDigest
{

    private static final int DIGEST_LENGTH = 64;

    public SHA512Digest()
    {
    }

    public SHA512Digest(SHA512Digest sha512digest)
    {
        super(sha512digest);
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
        return "SHA-512";
    }

    public int getDigestSize()
    {
        return 64;
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
}
