// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk.onetouch.core;

import java.security.GeneralSecurityException;
import org.apache.http.conn.ssl.SSLSocketFactory;

// Referenced classes of package com.paypal.android.sdk.onetouch.core:
//            bl, bk, bx

public class bh
{

    private static final String a = com/paypal/android/sdk/onetouch/core/bh.getSimpleName();

    public bh()
    {
    }

    public static bl a(int i, boolean flag, boolean flag1, String s)
    {
        bl bl1;
        (new StringBuilder("Creating async client.  networkTimeout=")).append(i).append(", isTrustAll=").append(flag).append(", useSslPinning=").append(flag1).append(", userAgent=").append(s);
        bl1 = new bl();
        bl1.a(i);
        bl1.a(s);
        if (flag)
        {
            try
            {
                bl1.a(new bk());
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw new RuntimeException(s);
            }
            return bl1;
        }
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_110;
        }
        bl1.a(new bx());
        return bl1;
        bl1.a(SSLSocketFactory.getSocketFactory());
        return bl1;
    }

}
