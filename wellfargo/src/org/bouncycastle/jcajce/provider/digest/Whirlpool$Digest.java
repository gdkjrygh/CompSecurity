// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jcajce.provider.digest;

import org.bouncycastle.crypto.digests.WhirlpoolDigest;

// Referenced classes of package org.bouncycastle.jcajce.provider.digest:
//            BCMessageDigest

public class init> extends BCMessageDigest
    implements Cloneable
{

    public Object clone()
    {
        init> init> = (init>)super.clone();
        init>.digest = new WhirlpoolDigest((WhirlpoolDigest)digest);
        return init>;
    }

    public ()
    {
        super(new WhirlpoolDigest());
    }
}
