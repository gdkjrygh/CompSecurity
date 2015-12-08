// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.pqc.jcajce.provider.mceliece;

import org.bouncycastle.crypto.digests.SHA384Digest;
import org.bouncycastle.pqc.crypto.mceliece.McEliecePKCSCipher;

// Referenced classes of package org.bouncycastle.pqc.jcajce.provider.mceliece:
//            McEliecePKCSCipherSpi

public class Y extends McEliecePKCSCipherSpi
{

    public Y()
    {
        super(new SHA384Digest(), new McEliecePKCSCipher());
    }
}
