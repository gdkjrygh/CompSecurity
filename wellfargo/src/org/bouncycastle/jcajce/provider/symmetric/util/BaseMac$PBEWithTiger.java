// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jcajce.provider.symmetric.util;

import org.bouncycastle.crypto.digests.TigerDigest;
import org.bouncycastle.crypto.macs.HMac;

// Referenced classes of package org.bouncycastle.jcajce.provider.symmetric.util:
//            BaseMac

public class  extends BaseMac
{

    public ()
    {
        super(new HMac(new TigerDigest()), 2, 3, 192);
    }
}
