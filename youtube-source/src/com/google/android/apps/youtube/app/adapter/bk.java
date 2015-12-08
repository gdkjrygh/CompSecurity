// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.adapter;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.youtube.common.e.m;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.datalib.model.gdata.Video;
import com.google.android.youtube.j;

// Referenced classes of package com.google.android.apps.youtube.app.adapter:
//            ae

abstract class bk
    implements ae
{

    protected final Context a;
    protected final Resources b;
    protected final View c;
    protected final TextView d;
    protected final TextView e;

    private bk(Context context, View view)
    {
        a = (Context)com.google.android.apps.youtube.common.fromguava.c.a(context);
        b = context.getResources();
        c = view;
        d = (TextView)com.google.android.apps.youtube.common.fromguava.c.a((TextView)c.findViewById(j.fF));
        e = (TextView)com.google.android.apps.youtube.common.fromguava.c.a((TextView)c.findViewById(j.aP));
    }

    bk(Context context, View view, ViewGroup viewgroup)
    {
        this(context, view);
    }

    public View a(int i, Video video)
    {
        d.setText(video.title);
        e.setText(m.a(video.duration, 3));
        return c;
    }

    public volatile View a(int i, Object obj)
    {
        return a(i, (Video)obj);
    }
}
