// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.common.network.h;
import com.google.android.apps.youtube.core.client.bj;

// Referenced classes of package com.google.android.apps.youtube.app.adapter:
//            g, ar, as, ThumbnailRendererFactory, 
//            ae

public final class aq extends g
{

    private final ThumbnailRendererFactory a;

    private aq(Context context, bj bj, h h, ThumbnailRendererFactory.ThumbnailSize thumbnailsize)
    {
        a = new ar(this, context, bj, null, thumbnailsize);
    }

    static ThumbnailRendererFactory a(aq aq1)
    {
        return aq1.a;
    }

    public static aq a(Context context, bj bj, ThumbnailRendererFactory.ThumbnailSize thumbnailsize)
    {
        c.a(thumbnailsize);
        return new aq(context, bj, null, thumbnailsize);
    }

    public final ae a(View view, ViewGroup viewgroup)
    {
        return new as(this, view, viewgroup);
    }
}
