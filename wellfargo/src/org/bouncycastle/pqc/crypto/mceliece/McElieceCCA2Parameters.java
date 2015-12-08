// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.pqc.crypto.mceliece;

import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.digests.SHA256Digest;

// Referenced classes of package org.bouncycastle.pqc.crypto.mceliece:
//            McElieceParameters

public class McElieceCCA2Parameters extends McElieceParameters
{

    public Digest digest;

    public McElieceCCA2Parameters()
    {
        digest = new SHA256Digest();
    }

    public McElieceCCA2Parameters(int i, int j)
    {
        super(i, j);
        digest = new SHA256Digest();
    }

    public McElieceCCA2Parameters(Digest digest1)
    {
        digest = digest1;
    }

    public Digest getDigest()
    {
        return digest;
    }
}
