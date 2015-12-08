// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.adapter;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.youtube.core.utils.l;
import com.google.android.apps.youtube.datalib.model.gdata.Video;
import com.google.android.youtube.j;
import com.google.android.youtube.o;

// Referenced classes of package com.google.android.apps.youtube.app.adapter:
//            bk

final class bn extends bk
{

    private final TextView f;

    private bn(Context context, View view, ViewGroup viewgroup)
    {
        super(context, view, viewgroup);
        f = (TextView)c.findViewById(j.z);
    }

    bn(Context context, View view, ViewGroup viewgroup, byte byte0)
    {
        this(context, view, viewgroup);
    }

    public final View a(int i, Video video)
    {
        boolean flag1 = true;
        boolean flag = false;
        if (b.getConfiguration().orientation == 2 || l.b(a))
        {
            d.setLines(2);
        }
        f.setText(b.getQuantityString(o.b, (int)video.viewCount, new Object[] {
            video.ownerDisplayName, Long.valueOf(video.viewCount)
        }));
        int k = ((flag1) ? 1 : 0);
        View view;
        if (video.state != com.google.android.apps.youtube.datalib.model.gdata.Video.State.PLAYABLE)
        {
            if (video.state == com.google.android.apps.youtube.datalib.model.gdata.Video.State.PROCESSING && video.isLive())
            {
                k = ((flag1) ? 1 : 0);
            } else
            {
                k = 0;
            }
        }
        view = c.findViewById(j.aP);
        if (k != 0)
        {
            k = ((flag) ? 1 : 0);
        } else
        {
            k = 8;
        }
        view.setVisibility(k);
        return super.a(i, video);
    }

    public final volatile View a(int i, Object obj)
    {
        return a(i, (Video)obj);
    }
}
