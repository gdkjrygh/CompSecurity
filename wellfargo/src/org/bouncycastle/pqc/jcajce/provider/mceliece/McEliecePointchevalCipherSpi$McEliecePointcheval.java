// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.pqc.jcajce.provider.mceliece;

import org.bouncycastle.crypto.digests.SHA1Digest;
import org.bouncycastle.pqc.crypto.mceliece.McEliecePointchevalCipher;

// Referenced classes of package org.bouncycastle.pqc.jcajce.provider.mceliece:
//            McEliecePointchevalCipherSpi

public class  extends McEliecePointchevalCipherSpi
{

    public ()
    {
        super(new SHA1Digest(), new McEliecePointchevalCipher());
    }
}
