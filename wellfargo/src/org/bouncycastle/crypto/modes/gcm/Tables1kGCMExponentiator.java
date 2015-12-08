// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.modes.gcm;

import java.util.Vector;
import org.bouncycastle.util.Arrays;

// Referenced classes of package org.bouncycastle.crypto.modes.gcm:
//            GCMExponentiator, GCMUtil

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
            byte abyte0[] = (byte[])(byte[])lookupPowX2.elementAt(j - 1);
            int k;
            do
            {
                abyte0 = Arrays.clone(abyte0);
                GCMUtil.multiply(abyte0, abyte0);
                lookupPowX2.addElement(abyte0);
                k = j + 1;
                j = k;
            } while (k <= i);
        }
    }

    public void exponentiateX(long l, byte abyte0[])
    {
        byte abyte1[] = GCMUtil.oneAsBytes();
        for (int i = 0; l > 0L; i++)
        {
            if ((1L & l) != 0L)
            {
                ensureAvailable(i);
                GCMUtil.multiply(abyte1, (byte[])(byte[])lookupPowX2.elementAt(i));
            }
            l >>>= 1;
        }

        System.arraycopy(abyte1, 0, abyte0, 0, 16);
    }

    public void init(byte abyte0[])
    {
        if (lookupPowX2 != null && Arrays.areEqual(abyte0, (byte[])(byte[])lookupPowX2.elementAt(0)))
        {
            return;
        } else
        {
            lookupPowX2 = new Vector(8);
            lookupPowX2.addElement(Arrays.clone(abyte0));
            return;
        }
    }
}
