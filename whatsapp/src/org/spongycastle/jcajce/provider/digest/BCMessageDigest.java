// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.jcajce.provider.digest;

import java.security.MessageDigest;
import org.spongycastle.crypto.Digest;

public class BCMessageDigest extends MessageDigest
{

    public static int a;
    protected Digest digest;

    protected BCMessageDigest(Digest digest1)
    {
        super(digest1.getAlgorithmName());
        digest = digest1;
    }

    public byte[] engineDigest()
    {
        byte abyte0[] = new byte[digest.getDigestSize()];
        digest.doFinal(abyte0, 0);
        return abyte0;
    }

    public void engineReset()
    {
        digest.reset();
    }

    public void engineUpdate(byte byte0)
    {
        digest.update(byte0);
    }

    public void engineUpdate(byte abyte0[], int i, int j)
    {
        digest.update(abyte0, i, j);
    }
}
