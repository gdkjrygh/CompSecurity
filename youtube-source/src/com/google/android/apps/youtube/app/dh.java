// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app;

import android.content.Context;
import com.google.android.apps.youtube.common.e.f;
import com.google.android.apps.youtube.datalib.innertube.c;
import com.google.android.apps.youtube.datalib.innertube.h;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.apps.youtube.app:
//            ax

final class dh extends f
{

    final ax a;

    dh(ax ax1)
    {
        a = ax1;
        super();
    }

    public final Object a()
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(a.aS());
        arraylist.add(new h(ax.e(a), com.google.android.apps.youtube.app.ax.f(a).getPackageManager(), a.b()));
        arraylist.add(new c(a.H()));
        return arraylist;
    }
}
