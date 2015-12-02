// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.crypto.modes.gcm;

import java.util.Vector;
import org.spongycastle.util.Arrays;

// Referenced classes of package org.spongycastle.crypto.modes.gcm:
//            GCMExponentiator, GCMUtil, Tables8kGCMMultiplier

public class Tables1kGCMExponentiator
    implements GCMExponentiator
{

    private Vector lookupPowX2;

    public Tables1kGCMExponentiator()
    {
    }

    private void ensureAvailable(int i)
    {
        int j = lookupPowX2.size();
        if (j <= i)
        {
            int ai[] = (int[])(int[])lookupPowX2.elementAt(j - 1);
            int k;
            do
            {
                ai = Arrays.clone(ai);
                GCMUtil.multiply(ai, ai);
                lookupPowX2.addElement(ai);
                k = j + 1;
                j = k;
            } while (k <= i);
        }
    }

    public void exponentiateX(long l, byte abyte0[])
    {
        boolean flag = Tables8kGCMMultiplier.a;
        int ai[] = GCMUtil.oneAsInts();
        int i = 0;
        do
        {
label0:
            {
                if (l > 0L)
                {
                    if ((1L & l) != 0L)
                    {
                        ensureAvailable(i);
                        GCMUtil.multiply(ai, (int[])(int[])lookupPowX2.elementAt(i));
                    }
                    l >>>= 1;
                    if (!flag)
                    {
                        break label0;
                    }
                }
                GCMUtil.asBytes(ai, abyte0);
                return;
            }
            i++;
        } while (true);
    }

    public void init(byte abyte0[])
    {
        abyte0 = GCMUtil.asInts(abyte0);
        if (lookupPowX2 != null && Arrays.areEqual(abyte0, (int[])(int[])lookupPowX2.elementAt(0)))
        {
            return;
        } else
        {
            lookupPowX2 = new Vector(8);
            lookupPowX2.addElement(abyte0);
            return;
        }
    }
}
