// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app;

import android.os.AsyncTask;
import android.widget.ListView;
import android.widget.TextView;
import java.util.List;

// Referenced classes of package com.google.android.apps.youtube.app:
//            DebugOfflineAdActivity

final class h extends AsyncTask
{

    final DebugOfflineAdActivity a;

    private h(DebugOfflineAdActivity debugofflineadactivity)
    {
        a = debugofflineadactivity;
        super();
    }

    h(DebugOfflineAdActivity debugofflineadactivity, byte byte0)
    {
        this(debugofflineadactivity);
    }

    protected final Object doInBackground(Object aobj[])
    {
        return DebugOfflineAdActivity.c(a);
    }

    protected final void onPostExecute(Object obj)
    {
        obj = (List)obj;
        if (((List) (obj)).isEmpty())
        {
            DebugOfflineAdActivity.d(a).setText("No offline videos");
            DebugOfflineAdActivity.d(a).setVisibility(0);
            DebugOfflineAdActivity.e(a).setVisibility(8);
            return;
        } else
        {
            DebugOfflineAdActivity.d(a).setVisibility(8);
            DebugOfflineAdActivity.f(a).b();
            DebugOfflineAdActivity.f(a).a(((java.util.Collection) (obj)));
            DebugOfflineAdActivity.f(a).notifyDataSetChanged();
            return;
        }
    }
}
