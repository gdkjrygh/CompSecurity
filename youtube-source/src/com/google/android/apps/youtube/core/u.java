// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core;

import android.content.Context;
import com.google.android.apps.youtube.common.e.f;
import com.google.android.apps.youtube.core.utils.l;
import com.google.android.apps.youtube.medialib.a;

// Referenced classes of package com.google.android.apps.youtube.core:
//            a, au

final class u extends f
{

    final com.google.android.apps.youtube.core.a a;

    u(com.google.android.apps.youtube.core.a a1)
    {
        a = a1;
        super();
    }

    public final Object a()
    {
        boolean flag = true;
        android.os.Handler handler = a.aH();
        String s = a.aZ();
        com.google.android.apps.youtube.common.network.h h = a.aX();
        boolean flag1 = l.a(a.a, a.au());
        if (com.google.android.gsf.f.a(a.a.getContentResolver(), "youtube:device_lowend", 2) != 1)
        {
            flag = false;
        }
        return new a(handler, s, h, flag1, flag, a.au().G(), a.aF());
    }
}
