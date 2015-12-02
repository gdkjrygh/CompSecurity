// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.crypto.modes.gcm;

import org.spongycastle.util.Arrays;

// Referenced classes of package org.spongycastle.crypto.modes.gcm:
//            GCMExponentiator, GCMUtil

public class BasicGCMExponentiator
    implements GCMExponentiator
{

    private int x[];

    public BasicGCMExponentiator()
    {
    }

    public void exponentiateX(long l, byte abyte0[])
    {
        int ai[] = GCMUtil.oneAsInts();
        if (l > 0L)
        {
            int ai1[] = Arrays.clone(x);
            long l1;
            do
            {
                if ((1L & l) != 0L)
                {
                    GCMUtil.multiply(ai, ai1);
                }
                GCMUtil.multiply(ai1, ai1);
                l1 = l >>> 1;
                l = l1;
            } while (l1 > 0L);
        }
        GCMUtil.asBytes(ai, abyte0);
    }

    public void init(byte abyte0[])
    {
        x = GCMUtil.asInts(abyte0);
    }
}
