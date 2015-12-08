// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.ListPreference;
import android.util.AttributeSet;
import com.google.android.youtube.l;

// Referenced classes of package com.google.android.apps.youtube.app.ui:
//            gk

public class SubtitlesColorListPreference extends ListPreference
{

    private Context a;
    private int b[];

    public SubtitlesColorListPreference(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a = context;
    }

    static Context a(SubtitlesColorListPreference subtitlescolorlistpreference)
    {
        return subtitlescolorlistpreference.a;
    }

    static int[] b(SubtitlesColorListPreference subtitlescolorlistpreference)
    {
        return subtitlescolorlistpreference.b;
    }

    public final void a(int ai[])
    {
        b = ai;
    }

    protected void onPrepareDialogBuilder(android.app.AlertDialog.Builder builder)
    {
        int i = findIndexOfValue(getSharedPreferences().getString(getKey(), Integer.toString(0)));
        builder.setAdapter(new gk(this, getContext(), l.bi, getEntries(), i), this);
        super.onPrepareDialogBuilder(builder);
    }
}
