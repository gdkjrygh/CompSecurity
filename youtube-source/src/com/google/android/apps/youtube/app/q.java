// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app;

import android.os.AsyncTask;
import android.view.View;

// Referenced classes of package com.google.android.apps.youtube.app:
//            DebugOfflineResyncActivity

final class q
    implements android.view.View.OnClickListener
{

    final DebugOfflineResyncActivity a;

    q(DebugOfflineResyncActivity debugofflineresyncactivity)
    {
        a = debugofflineresyncactivity;
        super();
    }

    public final void onClick(View view)
    {
        DebugOfflineResyncActivity.a(a).execute(new Void[] {
            null
        });
    }
}
