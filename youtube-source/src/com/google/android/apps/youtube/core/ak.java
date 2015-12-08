// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core;

import android.content.res.Resources;
import com.google.android.apps.youtube.common.e.f;
import com.google.android.apps.youtube.core.client.ah;
import com.google.android.apps.youtube.core.client.ai;
import com.google.android.apps.youtube.core.utils.Util;
import com.google.android.youtube.g;
import java.io.File;

// Referenced classes of package com.google.android.apps.youtube.core:
//            a

final class ak extends f
{

    final a a;

    ak(a a1)
    {
        a = a1;
        super();
    }

    public final Object a()
    {
        int i = a.b.getDimensionPixelSize(g.ad);
        int j = a.b.getDimensionPixelSize(g.M);
        int k = a.b.getDimensionPixelSize(g.e);
        ai ai1;
        boolean flag;
        if (android.os.Build.VERSION.SDK_INT > 10)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ai1 = new ai(i, j, k, flag, true);
        return ah.a(a.aJ(), a.aK(), a.aL(), a.av().getAbsolutePath(), a.aG(), ai1, Util.d(a.a));
    }
}
