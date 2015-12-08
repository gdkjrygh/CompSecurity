// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.adapter;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import com.google.android.apps.youtube.common.a.b;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.common.network.h;
import com.google.android.apps.youtube.core.client.bc;
import com.google.android.apps.youtube.core.client.bj;
import com.google.android.apps.youtube.datalib.model.gdata.Video;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.google.android.apps.youtube.app.adapter:
//            bq, am, an

public final class al extends bq
{

    private final bc a;
    private final bj b;
    private final Map c = new HashMap();

    private al(Context context, bj bj1, h h, ThumbnailRendererFactory.ThumbnailSize thumbnailsize, bc bc1)
    {
        super(context, bj1, h, null);
        a = (bc)com.google.android.apps.youtube.common.fromguava.c.a(bc1);
        b = (bj)com.google.android.apps.youtube.common.fromguava.c.a(bj1);
    }

    public static al a(Context context, bj bj1, h h, bc bc1)
    {
        return new al(context, bj1, h, null, bc1);
    }

    static Map a(al al1)
    {
        return al1.c;
    }

    static bc b(al al1)
    {
        return al1.a;
    }

    static bj c(al al1)
    {
        return al1.b;
    }

    protected final void a(Video video, View view, b b1)
    {
        Uri uri = (Uri)c.get(video.id);
        view = uri;
        if (uri == null)
        {
            if (video.mqThumbnailUri != null)
            {
                view = video.mqThumbnailUri;
            } else
            {
                view = video.defaultThumbnailUri;
            }
        }
        if (video.state != com.google.android.apps.youtube.datalib.model.gdata.Video.State.PLAYABLE && (video.state != com.google.android.apps.youtube.datalib.model.gdata.Video.State.PROCESSING || !video.isLive()))
        {
            b1.a(view, null);
            return;
        }
        if (view != null)
        {
            b.a(view, new am(this, video, b1));
            return;
        } else
        {
            a.a(video.ownerUri, new an(this, video, b1));
            return;
        }
    }

    protected final volatile void a(Object obj, View view, b b1)
    {
        a((Video)obj, view, b1);
    }
}
