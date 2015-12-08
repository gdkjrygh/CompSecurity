// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.generators;

import org.bouncycastle.crypto.Digest;

// Referenced classes of package org.bouncycastle.crypto.generators:
//            BaseKDFBytesGenerator

public class KDF2BytesGenerator extends BaseKDFBytesGenerator
{

    public KDF2BytesGenerator(Digest digest)
    {
        super(1, digest);
    }
}
