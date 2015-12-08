// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.ytremote.backend.browserchannel;

import android.util.Log;

// Referenced classes of package com.google.android.apps.ytremote.backend.browserchannel:
//            i, a

final class b
    implements i
{

    final boolean a[];
    final a b;
    private long c;

    b(a a1, boolean aflag[])
    {
        b = a1;
        a = aflag;
        super();
    }

    public final void a(int j)
    {
    }

    public final void a(byte abyte0[], int j, int k)
    {
        try
        {
            abyte0 = new String(abyte0, j, k, "UTF-8");
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new AssertionError(abyte0);
        }
        if ("11111".equals(abyte0))
        {
            c = System.currentTimeMillis();
            return;
        }
        if ("2".equals(abyte0))
        {
            abyte0 = a;
            byte byte0;
            if (System.currentTimeMillis() - c < 200L)
            {
                byte0 = 1;
            } else
            {
                byte0 = 0;
            }
            abyte0[0] = byte0;
            return;
        } else
        {
            Log.w(com.google.android.apps.ytremote.backend.browserchannel.a.c(), (new StringBuilder("Unexpected test response: ")).append(abyte0).toString());
            return;
        }
    }
}
