// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app;

import android.content.Context;
import com.google.android.apps.youtube.common.e.f;
import com.google.android.apps.youtube.core.client.DeviceClassification;
import com.google.android.apps.youtube.core.utils.PackageUtil;

// Referenced classes of package com.google.android.apps.youtube.app:
//            ax

final class cq extends f
{

    final ax a;

    cq(ax ax1)
    {
        a = ax1;
        super();
    }

    public final Object a()
    {
        return new DeviceClassification(ax.I(a).getPackageName(), PackageUtil.f(ax.J(a)), com.google.android.apps.youtube.core.client.DeviceClassification.Platform.fromContext(ax.K(a)), com.google.android.apps.youtube.core.client.DeviceClassification.SoftwareInterface.ANDROID);
    }
}
