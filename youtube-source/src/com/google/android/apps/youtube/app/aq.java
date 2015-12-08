// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app;

import android.content.SharedPreferences;
import com.google.android.apps.youtube.app.honeycomb.ui.g;
import com.google.android.apps.youtube.app.ui.iu;

// Referenced classes of package com.google.android.apps.youtube.app:
//            WatchWhileActivity

final class aq
    implements iu
{

    final WatchWhileActivity a;

    aq(WatchWhileActivity watchwhileactivity)
    {
        a = watchwhileactivity;
        super();
    }

    public final void a()
    {
        WatchWhileActivity.a(a).edit().putInt("watch_while_tutorial_views_remaining", 0).apply();
        WatchWhileActivity.a(a, false);
        a.S().b(false);
        a.S().b();
    }

    public final void b()
    {
        int i = WatchWhileActivity.a(a).getInt("watch_while_tutorial_views_remaining", 3);
        Object obj = WatchWhileActivity.a(a).edit();
        i--;
        ((android.content.SharedPreferences.Editor) (obj)).putInt("watch_while_tutorial_views_remaining", i).apply();
        obj = a;
        boolean flag;
        if (i > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        WatchWhileActivity.a(((WatchWhileActivity) (obj)), flag);
        a.S().b(false);
        a.S().b();
    }
}
