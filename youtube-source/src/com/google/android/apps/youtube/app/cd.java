// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app;

import android.content.Context;
import com.android.volley.l;
import com.google.android.apps.youtube.common.e.f;
import com.google.android.apps.youtube.core.client.DeviceClassification;
import com.google.android.apps.youtube.core.client.a.h;
import com.google.android.apps.youtube.core.utils.PackageUtil;
import com.google.android.apps.youtube.datalib.b.c;
import com.google.android.apps.youtube.datalib.b.e;

// Referenced classes of package com.google.android.apps.youtube.app:
//            ax, aw

final class cd extends f
{

    final ax a;

    cd(ax ax1)
    {
        a = ax1;
        super();
    }

    public final Object a()
    {
        String s = PackageUtil.f(ax.w(a));
        Object obj;
        if (a.b().c(ax.x(a)))
        {
            obj = new c(ax.y(a).getPackageName(), s, (l)ax.j(a).b(), a.aX(), (DeviceClassification)ax.z(a).b());
        } else
        {
            obj = new e();
        }
        return h.a(a.bf(), a.aT(), ax.A(a).getPackageName(), s, a.b().E(), a.aX(), a.aP(), ((com.google.android.apps.common.csi.lib.Sender) (obj)));
    }
}
