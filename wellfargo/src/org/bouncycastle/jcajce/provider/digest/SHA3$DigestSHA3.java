// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jcajce.provider.digest;

import org.bouncycastle.crypto.digests.SHA3Digest;

// Referenced classes of package org.bouncycastle.jcajce.provider.digest:
//            BCMessageDigest

public class <init> extends BCMessageDigest
    implements Cloneable
{

    public Object clone()
    {
        BCMessageDigest bcmessagedigest = (BCMessageDigest)super.clone();
        bcmessagedigest.digest = new SHA3Digest((SHA3Digest)digest);
        return bcmessagedigest;
    }

    public (int i)
    {
        super(new SHA3Digest(i));
    }
}
