// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app;

import android.view.View;
import com.google.android.apps.youtube.common.e.b;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.apps.youtube.app:
//            p, DebugOfflineAdActivity

final class d
    implements android.view.View.OnClickListener
{

    final DebugOfflineAdActivity a;

    d(DebugOfflineAdActivity debugofflineadactivity)
    {
        a = debugofflineadactivity;
        super();
    }

    public final void onClick(View view)
    {
        (new p(a, (byte)0)).execute(new Long[] {
            Long.valueOf(DebugOfflineAdActivity.a(a).a() + TimeUnit.HOURS.toMillis(6L))
        });
    }
}
