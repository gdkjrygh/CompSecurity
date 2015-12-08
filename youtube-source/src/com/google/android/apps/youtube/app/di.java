// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app;

import com.google.android.apps.youtube.common.e.f;
import com.google.android.apps.youtube.core.utils.PackageUtil;
import com.google.android.apps.youtube.datalib.innertube.aj;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.apps.youtube.app:
//            ax

final class di extends f
{

    final ax a;

    di(ax ax1)
    {
        a = ax1;
        super();
    }

    public final Object a()
    {
        ArrayList arraylist = new ArrayList(a.at());
        boolean flag = PackageUtil.a(ax.g(a));
        arraylist.add(new aj(a.aP(), flag));
        return arraylist;
    }
}
