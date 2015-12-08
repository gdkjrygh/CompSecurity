// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jcajce.provider.asymmetric.rsa;

import java.io.ByteArrayOutputStream;
import org.bouncycastle.crypto.Digest;

// Referenced classes of package org.bouncycastle.jcajce.provider.asymmetric.rsa:
//            PSSSignatureSpi

class baseDigest
    implements Digest
{

    private ByteArrayOutputStream bOut;
    private Digest baseDigest;
    private boolean oddTime;
    final PSSSignatureSpi this$0;

    public int doFinal(byte abyte0[], int i)
    {
        boolean flag = false;
        byte abyte1[] = bOut.toByteArray();
        if (oddTime)
        {
            System.arraycopy(abyte1, 0, abyte0, i, abyte1.length);
        } else
        {
            baseDigest.update(abyte1, 0, abyte1.length);
            baseDigest.doFinal(abyte0, i);
        }
        reset();
        if (!oddTime)
        {
            flag = true;
        }
        oddTime = flag;
        return abyte1.length;
    }

    public String getAlgorithmName()
    {
        return "NULL";
    }

    public int getByteLength()
    {
        return 0;
    }

    public int getDigestSize()
    {
        return baseDigest.getDigestSize();
    }

    public void reset()
    {
        bOut.reset();
        baseDigest.reset();
    }

    public void update(byte byte0)
    {
        bOut.write(byte0);
    }

    public void update(byte abyte0[], int i, int j)
    {
        bOut.write(abyte0, i, j);
    }

    public (Digest digest)
    {
        this$0 = PSSSignatureSpi.this;
        super();
        bOut = new ByteArrayOutputStream();
        oddTime = true;
        baseDigest = digest;
    }
}
