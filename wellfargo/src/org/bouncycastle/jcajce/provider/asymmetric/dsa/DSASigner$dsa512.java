// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jcajce.provider.asymmetric.dsa;

import org.bouncycastle.crypto.digests.SHA512Digest;
import org.bouncycastle.crypto.signers.DSASigner;

// Referenced classes of package org.bouncycastle.jcajce.provider.asymmetric.dsa:
//            DSASigner

public class  extends org.bouncycastle.jcajce.provider.asymmetric.dsa.DSASigner
{

    public ()
    {
        super(new SHA512Digest(), new DSASigner());
    }
}
