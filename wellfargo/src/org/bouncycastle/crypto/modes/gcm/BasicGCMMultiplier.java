// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.modes.gcm;

import org.bouncycastle.util.Arrays;

// Referenced classes of package org.bouncycastle.crypto.modes.gcm:
//            GCMMultiplier, GCMUtil

public class BasicGCMMultiplier
    implements GCMMultiplier
{

    private byte H[];

    public BasicGCMMultiplier()
    {
    }

    public void init(byte abyte0[])
    {
        H = Arrays.clone(abyte0);
    }

    public void multiplyH(byte abyte0[])
    {
        GCMUtil.multiply(abyte0, H);
    }
}
