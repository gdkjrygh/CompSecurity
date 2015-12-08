// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk.onetouch.core;

import java.util.HashSet;

// Referenced classes of package com.paypal.android.sdk.onetouch.core:
//            j

final class k extends HashSet
{

    k()
    {
        j aj[] = j.values();
        int l = aj.length;
        for (int i = 0; i < l; i++)
        {
            j j1 = aj[i];
            if (j.a(j1))
            {
                add(j1.a());
            }
        }

    }
}
