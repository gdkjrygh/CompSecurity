// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.pqc.jcajce.provider.mceliece;

import org.bouncycastle.crypto.digests.SHA224Digest;
import org.bouncycastle.pqc.crypto.mceliece.McElieceKobaraImaiCipher;

// Referenced classes of package org.bouncycastle.pqc.jcajce.provider.mceliece:
//            McElieceKobaraImaiCipherSpi

public class  extends McElieceKobaraImaiCipherSpi
{

    public ()
    {
        super(new SHA224Digest(), new McElieceKobaraImaiCipher());
    }
}
