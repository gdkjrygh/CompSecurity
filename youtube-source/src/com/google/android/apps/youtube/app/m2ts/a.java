// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.m2ts;

import android.content.DialogInterface;
import android.content.SharedPreferences;

// Referenced classes of package com.google.android.apps.youtube.app.m2ts:
//            BackgroundPlaybackDialogs

final class a
    implements android.content.DialogInterface.OnClickListener
{

    final BackgroundPlaybackDialogs a;

    a(BackgroundPlaybackDialogs backgroundplaybackdialogs)
    {
        a = backgroundplaybackdialogs;
        super();
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        BackgroundPlaybackDialogs.a(a).edit().putBoolean("background_audio_enabled", false).apply();
    }
}
