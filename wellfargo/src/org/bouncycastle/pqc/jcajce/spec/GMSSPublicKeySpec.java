// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.pqc.jcajce.spec;

import org.bouncycastle.pqc.crypto.gmss.GMSSParameters;

// Referenced classes of package org.bouncycastle.pqc.jcajce.spec:
//            GMSSKeySpec

public class GMSSPublicKeySpec extends GMSSKeySpec
{

    private byte gmssPublicKey[];

    public GMSSPublicKeySpec(byte abyte0[], GMSSParameters gmssparameters)
    {
        super(gmssparameters);
        gmssPublicKey = abyte0;
    }

    public byte[] getPublicKey()
    {
        return gmssPublicKey;
    }
}
