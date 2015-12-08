// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jcajce.provider.asymmetric.ec;

import org.bouncycastle.crypto.digests.SHA224Digest;
import org.bouncycastle.crypto.signers.ECNRSigner;

// Referenced classes of package org.bouncycastle.jcajce.provider.asymmetric.ec:
//            SignatureSpi

public class coder extends SignatureSpi
{

    public coder()
    {
        super(new SHA224Digest(), new ECNRSigner(), new coder(null));
    }
}
