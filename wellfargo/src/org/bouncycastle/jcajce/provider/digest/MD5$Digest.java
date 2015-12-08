// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jcajce.provider.digest;

import org.bouncycastle.crypto.digests.MD5Digest;

// Referenced classes of package org.bouncycastle.jcajce.provider.digest:
//            BCMessageDigest

public class gest extends BCMessageDigest
    implements Cloneable
{

    public Object clone()
    {
        gest gest = (gest)super.clone();
        gest.digest = new MD5Digest((MD5Digest)digest);
        return gest;
    }

    public gest()
    {
        super(new MD5Digest());
    }
}
