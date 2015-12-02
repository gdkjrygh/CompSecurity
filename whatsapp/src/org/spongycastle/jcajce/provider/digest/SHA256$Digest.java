// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.jcajce.provider.digest;

import org.spongycastle.crypto.digests.SHA256Digest;

// Referenced classes of package org.spongycastle.jcajce.provider.digest:
//            BCMessageDigest

public class t extends BCMessageDigest
    implements Cloneable
{

    public Object clone()
    {
        t t = (t)super.clone();
        t.digest = new SHA256Digest((SHA256Digest)digest);
        return t;
    }

    public t()
    {
        super(new SHA256Digest());
    }
}
