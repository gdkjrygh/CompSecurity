// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.honeycomb.ui;

import android.content.SharedPreferences;
import com.google.android.apps.youtube.app.ui.gz;

// Referenced classes of package com.google.android.apps.youtube.app.honeycomb.ui:
//            g

final class h
    implements gz
{

    final g a;

    h(g g1)
    {
        a = g1;
        super();
    }

    public final void a()
    {
        g.a(a).edit().putBoolean("show_dial_screen_tutorial", false).apply();
    }
}
