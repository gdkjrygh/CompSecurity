// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app;

import android.os.AsyncTask;
import android.view.View;
import com.google.android.apps.youtube.core.utils.ah;

// Referenced classes of package com.google.android.apps.youtube.app:
//            DebugOfflineResyncActivity

final class r
    implements android.view.View.OnClickListener
{

    final DebugOfflineResyncActivity a;

    r(DebugOfflineResyncActivity debugofflineresyncactivity)
    {
        a = debugofflineresyncactivity;
        super();
    }

    public final void onClick(View view)
    {
        ah.b(a, "Expiring all offline videos...", 1);
        DebugOfflineResyncActivity.b(a).execute(new Void[] {
            null
        });
    }
}
