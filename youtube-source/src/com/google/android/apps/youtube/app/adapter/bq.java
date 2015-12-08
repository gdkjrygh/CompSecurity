// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.adapter;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.youtube.common.a.b;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.common.network.h;
import com.google.android.apps.youtube.core.client.bj;
import com.google.android.apps.youtube.datalib.model.gdata.Video;

// Referenced classes of package com.google.android.apps.youtube.app.adapter:
//            ThumbnailRendererFactory, bo, h, ae

public class bq extends ThumbnailRendererFactory
{

    protected bq(Context context, bj bj, h h1, ThumbnailRendererFactory.ThumbnailSize thumbnailsize)
    {
        super(context, bj, h1, thumbnailsize);
    }

    public static bq a(Context context, bj bj, ThumbnailRendererFactory.ThumbnailSize thumbnailsize)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(thumbnailsize);
        return new bq(context, bj, null, thumbnailsize);
    }

    protected final volatile Uri a(Object obj)
    {
        return ((Video)obj).defaultThumbnailUri;
    }

    public final ae a(View view, ViewGroup viewgroup)
    {
        return new bo((com.google.android.apps.youtube.app.adapter.h)super.a(view, viewgroup), view);
    }

    protected final void a(Uri uri, b b1)
    {
        super.a(uri, b1);
    }

    protected void a(Video video, View view, b b1)
    {
        boolean flag;
        if (video.state == com.google.android.apps.youtube.datalib.model.gdata.Video.State.PLAYABLE || video.state == com.google.android.apps.youtube.datalib.model.gdata.Video.State.PROCESSING && video.isLive())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag)
        {
            if (video.mqThumbnailUri != null)
            {
                video = video.mqThumbnailUri;
            } else
            {
                video = video.defaultThumbnailUri;
            }
            b1.a(video, null);
            return;
        } else
        {
            super.a(video, view, b1);
            return;
        }
    }

    protected volatile void a(Object obj, View view, b b1)
    {
        a((Video)obj, view, b1);
    }

    protected final volatile Uri b(Object obj)
    {
        return ((Video)obj).sdThumbnailUri;
    }

    protected final volatile Uri c(Object obj)
    {
        return ((Video)obj).hqThumbnailUri;
    }

    protected final volatile Uri d(Object obj)
    {
        return ((Video)obj).mqThumbnailUri;
    }
}
