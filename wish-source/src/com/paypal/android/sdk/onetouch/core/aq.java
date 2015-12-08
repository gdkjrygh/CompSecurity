// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk.onetouch.core;


// Referenced classes of package com.paypal.android.sdk.onetouch.core:
//            as, ar

public class aq
{

    public static final aq a = new aq();
    private static final String b = com/paypal/android/sdk/onetouch/core/aq.getSimpleName();
    private byte c[];

    private aq()
    {
        c = null;
        c = null;
    }

    public aq(String s)
    {
        c = null;
        int j;
        c = new byte[(s.length() + 1) / 2];
        j = s.length();
        int i;
        i = 0;
        j--;
          goto _L1
_L5:
        int k;
        c[i] = (byte)Integer.parseInt(s.substring(k, j + 1), 16);
        j -= 2;
        i++;
          goto _L1
        s;
        as.a(b, "PPRiskDataBitSet initialize failed", s);
        c = null;
_L3:
        return;
_L1:
        if (j < 0) goto _L3; else goto _L2
_L2:
        int l = j - 1;
        k = l;
        if (l < 0)
        {
            k = 0;
        }
        if (true) goto _L5; else goto _L4
_L4:
    }

    public final boolean a(ar ar1)
    {
        int i = ar1.a() / 8;
        if (c != null && i <= c.length)
        {
            i = c[i];
            byte byte0 = (byte)(1 << ar1.a() % 8);
            if ((i & byte0) != byte0)
            {
                return false;
            }
        }
        return true;
    }

}
