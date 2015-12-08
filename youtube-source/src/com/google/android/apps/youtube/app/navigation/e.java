// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.navigation;

import android.app.Activity;
import android.content.Intent;
import com.google.android.apps.youtube.app.WatchWhileActivity;
import com.google.android.apps.youtube.app.fragments.navigation.WatchDescriptor;
import com.google.android.apps.youtube.common.fromguava.c;

// Referenced classes of package com.google.android.apps.youtube.app.navigation:
//            b

public final class e
    implements b
{

    private final Activity a;
    private final WatchDescriptor b;

    public e(Activity activity, WatchDescriptor watchdescriptor)
    {
        a = (Activity)c.a(activity);
        b = (WatchDescriptor)c.a(watchdescriptor);
    }

    public final void a()
    {
        if (a instanceof WatchWhileActivity)
        {
            ((WatchWhileActivity)a).a(b);
            return;
        } else
        {
            Intent intent = new Intent(a, com/google/android/apps/youtube/app/WatchWhileActivity);
            intent.setFlags(0x4000000);
            intent.putExtra("watch", b);
            a.startActivity(intent);
            return;
        }
    }
}
