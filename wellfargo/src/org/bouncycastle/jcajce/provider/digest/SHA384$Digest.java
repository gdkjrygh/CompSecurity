// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jcajce.provider.digest;

import org.bouncycastle.crypto.digests.SHA384Digest;

// Referenced classes of package org.bouncycastle.jcajce.provider.digest:
//            BCMessageDigest

public class t extends BCMessageDigest
    implements Cloneable
{

    public Object clone()
    {
        t t = (t)super.clone();
        t.digest = new SHA384Digest((SHA384Digest)digest);
        return t;
    }

    public t()
    {
        super(new SHA384Digest());
    }
}
