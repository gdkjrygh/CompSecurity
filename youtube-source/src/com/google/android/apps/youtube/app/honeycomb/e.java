// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.honeycomb;

import android.content.DialogInterface;
import com.google.android.apps.youtube.app.ax;
import com.google.android.apps.youtube.core.suggest.a;

// Referenced classes of package com.google.android.apps.youtube.app.honeycomb:
//            SettingsActivity

final class e
    implements android.content.DialogInterface.OnClickListener
{

    final SettingsActivity a;

    e(SettingsActivity settingsactivity)
    {
        a = settingsactivity;
        super();
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        com.google.android.apps.youtube.app.honeycomb.SettingsActivity.a(a).ae().b();
    }
}
