// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jcajce.provider.digest;

import org.bouncycastle.crypto.digests.TigerDigest;

// Referenced classes of package org.bouncycastle.jcajce.provider.digest:
//            BCMessageDigest

public class st extends BCMessageDigest
    implements Cloneable
{

    public Object clone()
    {
        st st = (st)super.clone();
        st.digest = new TigerDigest((TigerDigest)digest);
        return st;
    }

    public st()
    {
        super(new TigerDigest());
    }
}
