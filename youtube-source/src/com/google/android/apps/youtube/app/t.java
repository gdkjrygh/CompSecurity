// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app;

import android.os.AsyncTask;
import com.google.android.apps.youtube.app.offline.sync.b;
import com.google.android.apps.youtube.core.utils.ah;

// Referenced classes of package com.google.android.apps.youtube.app:
//            DebugOfflineResyncActivity, YouTubeApplication

final class t extends AsyncTask
{

    final DebugOfflineResyncActivity a;

    t(DebugOfflineResyncActivity debugofflineresyncactivity)
    {
        a = debugofflineresyncactivity;
        super();
    }

    protected final Object doInBackground(Object aobj[])
    {
        ((YouTubeApplication)a.getApplication()).h().a();
        return null;
    }

    protected final void onPostExecute(Object obj)
    {
        ah.b(a, "OfflineSyncController.performSync() called!", 1);
    }
}
