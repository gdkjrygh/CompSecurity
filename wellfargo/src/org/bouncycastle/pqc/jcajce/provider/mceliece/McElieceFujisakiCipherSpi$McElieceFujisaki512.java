// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.pqc.jcajce.provider.mceliece;

import org.bouncycastle.crypto.digests.SHA512Digest;
import org.bouncycastle.pqc.crypto.mceliece.McElieceFujisakiCipher;

// Referenced classes of package org.bouncycastle.pqc.jcajce.provider.mceliece:
//            McElieceFujisakiCipherSpi

public class a extends McElieceFujisakiCipherSpi
{

    public a()
    {
        super(new SHA512Digest(), new McElieceFujisakiCipher());
    }
}
