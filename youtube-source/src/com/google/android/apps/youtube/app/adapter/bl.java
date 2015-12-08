// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.adapter;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.youtube.core.utils.ag;
import com.google.android.apps.youtube.datalib.model.gdata.Video;
import com.google.android.youtube.f;
import com.google.android.youtube.j;
import com.google.android.youtube.o;

// Referenced classes of package com.google.android.apps.youtube.app.adapter:
//            bk

final class bl extends bk
{

    private final TextView f;
    private final TextView g;
    private final View h;
    private final TextView i;

    private bl(Context context, View view, ViewGroup viewgroup)
    {
        super(context, view, viewgroup);
        f = (TextView)c.findViewById(j.y);
        g = (TextView)c.findViewById(j.aK);
        h = c.findViewById(j.eu);
        i = (TextView)c.findViewById(j.aP);
    }

    bl(Context context, View view, ViewGroup viewgroup, byte byte0)
    {
        this(context, view, viewgroup);
    }

    public final View a(int k, Video video)
    {
        f.setText(video.ownerDisplayName);
        int l;
        if (h != null)
        {
            if (k == 0)
            {
                h.setVisibility(8);
            } else
            {
                h.setVisibility(0);
            }
        }
        if (video.state == com.google.android.apps.youtube.datalib.model.gdata.Video.State.PLAYABLE || video.state == com.google.android.apps.youtube.datalib.model.gdata.Video.State.PROCESSING && video.isLive())
        {
            l = 1;
        } else
        {
            l = 0;
        }
        if (l != 0)
        {
            d.setMaxLines(2);
            i.setVisibility(0);
            g.setTypeface(g.getTypeface(), 0);
            g.setMaxLines(1);
            String s = ag.a(video.uploadedDate, b);
            TextView textview = g;
            Resources resources = b;
            l = o.a;
            int i1 = (int)video.viewCount;
            if (s == null)
            {
                s = "";
            }
            textview.setText(resources.getQuantityString(l, i1, new Object[] {
                s, Long.valueOf(video.viewCount)
            }));
            d.setTextColor(b.getColor(f.r));
            g.setTextColor(b.getColor(f.s));
        } else
        {
            d.setMaxLines(1);
            i.setVisibility(8);
            g.setTypeface(g.getTypeface(), 2);
            g.setText(b.getString(video.state.explanationId));
            g.setMaxLines(2);
            d.setTextColor(b.getColor(f.s));
            g.setTextColor(b.getColor(f.r));
        }
        return super.a(k, video);
    }

    public final volatile View a(int k, Object obj)
    {
        return a(k, (Video)obj);
    }
}
