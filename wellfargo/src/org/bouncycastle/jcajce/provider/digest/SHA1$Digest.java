// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jcajce.provider.digest;

import org.bouncycastle.crypto.digests.SHA1Digest;

// Referenced classes of package org.bouncycastle.jcajce.provider.digest:
//            BCMessageDigest

public class est extends BCMessageDigest
    implements Cloneable
{

    public Object clone()
    {
        est est = (est)super.clone();
        est.digest = new SHA1Digest((SHA1Digest)digest);
        return est;
    }

    public est()
    {
        super(new SHA1Digest());
    }
}
