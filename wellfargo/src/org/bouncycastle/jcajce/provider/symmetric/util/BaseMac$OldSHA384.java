// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jcajce.provider.symmetric.util;

import org.bouncycastle.crypto.digests.SHA384Digest;
import org.bouncycastle.crypto.macs.OldHMac;

// Referenced classes of package org.bouncycastle.jcajce.provider.symmetric.util:
//            BaseMac

public class  extends BaseMac
{

    public ()
    {
        super(new OldHMac(new SHA384Digest()));
    }
}
