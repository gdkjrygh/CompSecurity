// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jcajce.provider.digest;

import org.bouncycastle.crypto.digests.GOST3411Digest;

// Referenced classes of package org.bouncycastle.jcajce.provider.digest:
//            BCMessageDigest

public class <init> extends BCMessageDigest
    implements Cloneable
{

    public Object clone()
    {
        <init> <init>1 = (<init>)super.clone();
        <init>1.digest = new GOST3411Digest((GOST3411Digest)digest);
        return <init>1;
    }

    public ()
    {
        super(new GOST3411Digest());
    }
}
