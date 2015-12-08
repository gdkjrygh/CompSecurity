// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckedTextView;
import com.google.android.youtube.h;
import com.google.android.youtube.j;
import com.google.android.youtube.l;

// Referenced classes of package com.google.android.apps.youtube.app.ui:
//            SubtitlesColorListPreference

public final class gk extends ArrayAdapter
{

    final SubtitlesColorListPreference a;
    private int b;

    public gk(SubtitlesColorListPreference subtitlescolorlistpreference, Context context, int i, CharSequence acharsequence[], int k)
    {
        a = subtitlescolorlistpreference;
        super(context, i, acharsequence);
        b = 0;
        b = k;
    }

    public final View getView(int i, View view, ViewGroup viewgroup)
    {
        view = LayoutInflater.from(SubtitlesColorListPreference.a(a)).inflate(l.bi, viewgroup, false);
        if (SubtitlesColorListPreference.b(a) != null && SubtitlesColorListPreference.b(a).length > i)
        {
            if (SubtitlesColorListPreference.b(a)[i] == 0)
            {
                view.findViewById(j.dL).setBackgroundResource(h.av);
            } else
            {
                view.findViewById(j.dL).setBackgroundColor(SubtitlesColorListPreference.b(a)[i]);
            }
        }
        viewgroup = (CheckedTextView)view.findViewById(j.at);
        viewgroup.setText((CharSequence)getItem(i));
        if (i == b)
        {
            viewgroup.setChecked(true);
        }
        return view;
    }
}
