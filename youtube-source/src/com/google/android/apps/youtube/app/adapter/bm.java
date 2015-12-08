// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.adapter;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.youtube.datalib.model.gdata.Video;
import com.google.android.youtube.j;
import com.google.android.youtube.o;

// Referenced classes of package com.google.android.apps.youtube.app.adapter:
//            bk

final class bm extends bk
{

    private final TextView f;
    private final int g;

    private bm(Context context, View view, ViewGroup viewgroup, int i)
    {
        super(context, view, viewgroup);
        f = (TextView)c.findViewById(j.z);
        g = i;
    }

    bm(Context context, View view, ViewGroup viewgroup, int i, byte byte0)
    {
        this(context, view, viewgroup, i);
    }

    public final View a(int i, Video video)
    {
        if (g > 0)
        {
            d.setLines(g);
        }
        f.setText(b.getQuantityString(o.b, (int)video.viewCount, new Object[] {
            video.ownerDisplayName, Long.valueOf(video.viewCount)
        }));
        return super.a(i, video);
    }

    public final volatile View a(int i, Object obj)
    {
        return a(i, (Video)obj);
    }
}
