// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.honeycomb.phone;

import android.support.v4.app.FragmentActivity;
import com.google.android.apps.youtube.app.remote.YouTubeTvScreen;
import com.google.android.apps.youtube.app.remote.YouTubeTvScreensMonitor;
import com.google.android.apps.youtube.common.a.a;
import com.google.android.apps.youtube.common.a.b;
import com.google.android.apps.youtube.core.utils.ah;
import com.google.android.youtube.p;
import java.util.List;

// Referenced classes of package com.google.android.apps.youtube.app.honeycomb.phone:
//            ScreenManagementActivity, y, x

final class ab
    implements b
{

    private final String a;
    private final YouTubeTvScreen b;
    private final YouTubeTvScreensMonitor c;
    private final FragmentActivity d;
    private final x e;

    private ab(String s, YouTubeTvScreen youtubetvscreen, x x, YouTubeTvScreensMonitor youtubetvscreensmonitor, FragmentActivity fragmentactivity)
    {
        a = s;
        b = youtubetvscreen;
        e = x;
        c = youtubetvscreensmonitor;
        d = fragmentactivity;
    }

    ab(String s, YouTubeTvScreen youtubetvscreen, x x, YouTubeTvScreensMonitor youtubetvscreensmonitor, FragmentActivity fragmentactivity, byte byte0)
    {
        this(s, youtubetvscreen, x, youtubetvscreensmonitor, fragmentactivity);
    }

    public final void a(Object obj, Exception exception)
    {
        obj = d.getString(p.bv);
        ah.b(d, ((CharSequence) (obj)), 1);
    }

    public final void a(Object obj, Object obj1)
    {
        obj = (List)obj1;
        if (com.google.android.apps.youtube.app.honeycomb.phone.ScreenManagementActivity.a(a, ((List) (obj))))
        {
            com.google.android.apps.youtube.app.honeycomb.phone.ScreenManagementActivity.a(a, d);
            return;
        } else
        {
            obj = com.google.android.apps.youtube.common.a.a.a(d, new y(e, d));
            c.a(b, a, ((b) (obj)));
            return;
        }
    }
}
