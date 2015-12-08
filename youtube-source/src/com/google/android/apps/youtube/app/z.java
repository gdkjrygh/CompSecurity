// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app;

import android.os.AsyncTask;
import android.widget.TextView;
import com.google.android.apps.youtube.uilib.a.h;
import java.util.List;

// Referenced classes of package com.google.android.apps.youtube.app:
//            DebugShowOfflineQueueActivity

final class z extends AsyncTask
{

    final DebugShowOfflineQueueActivity a;

    z(DebugShowOfflineQueueActivity debugshowofflinequeueactivity)
    {
        a = debugshowofflinequeueactivity;
        super();
    }

    protected final Object doInBackground(Object aobj[])
    {
        return DebugShowOfflineQueueActivity.a(a, DebugShowOfflineQueueActivity.a(a));
    }

    protected final void onPostExecute(Object obj)
    {
        obj = (List)obj;
        if (((List) (obj)).isEmpty())
        {
            DebugShowOfflineQueueActivity.b(a).setText("Queue is empty");
            return;
        } else
        {
            DebugShowOfflineQueueActivity.b(a).setVisibility(8);
            DebugShowOfflineQueueActivity.c(a).a(((java.util.Collection) (obj)));
            DebugShowOfflineQueueActivity.c(a).notifyDataSetChanged();
            return;
        }
    }
}
