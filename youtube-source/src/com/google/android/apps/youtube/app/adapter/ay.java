// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.youtube.app.ui.v;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.datalib.model.transfer.Transfer;
import java.util.WeakHashMap;

// Referenced classes of package com.google.android.apps.youtube.app.adapter:
//            g, az, ae

public final class ay extends g
{

    private final Context a;
    private final v b;
    private final WeakHashMap c = new WeakHashMap();

    public ay(Context context, v v1)
    {
        a = (Context)com.google.android.apps.youtube.common.fromguava.c.a(context);
        b = (v)com.google.android.apps.youtube.common.fromguava.c.a(v1);
    }

    static WeakHashMap a(ay ay1)
    {
        return ay1.c;
    }

    static v b(ay ay1)
    {
        return ay1.b;
    }

    static Context c(ay ay1)
    {
        return ay1.a;
    }

    public final ae a(View view, ViewGroup viewgroup)
    {
        return new az(this, view, viewgroup);
    }

    public final boolean a(Transfer transfer)
    {
        if (transfer.c != com.google.android.apps.youtube.datalib.model.transfer.Transfer.Status.RUNNING)
        {
            return false;
        }
        az az1 = (az)c.get(transfer);
        if (az1 != null)
        {
            az1.a(transfer);
            return true;
        } else
        {
            return false;
        }
    }
}
