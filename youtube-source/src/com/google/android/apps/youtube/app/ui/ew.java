// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui;

import android.app.Activity;
import com.google.android.apps.youtube.app.remote.YouTubeTvScreen;
import com.google.android.apps.youtube.app.remote.an;
import com.google.android.apps.youtube.common.a.a;
import com.google.android.apps.youtube.common.a.b;
import com.google.android.apps.youtube.core.Analytics;
import com.google.android.apps.youtube.core.aw;
import com.google.android.youtube.p;

// Referenced classes of package com.google.android.apps.youtube.app.ui:
//            ex, fg, ev

final class ew
    implements b
{

    final Analytics a;
    final an b;
    final Activity c;
    final fg d;
    final aw e;
    final ev f;

    ew(ev ev, Analytics analytics, an an1, Activity activity, fg fg, aw aw1)
    {
        f = ev;
        a = analytics;
        b = an1;
        c = activity;
        d = fg;
        e = aw1;
        super();
    }

    public final volatile void a(Object obj, Exception exception)
    {
        a.a("RemoteError", "INVALID_PAIRING_CODE");
        e.a(p.bp);
    }

    public final void a(Object obj, Object obj1)
    {
        obj = (YouTubeTvScreen)obj1;
        a.b("RemoteControlPaired");
        b.a(((YouTubeTvScreen) (obj)), com.google.android.apps.youtube.common.a.a.a(c, new ex(this, ((YouTubeTvScreen) (obj)))));
    }
}
