// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.adapter;

import android.content.Context;
import android.net.Uri;
import com.google.android.apps.youtube.common.network.h;
import com.google.android.apps.youtube.core.client.bj;
import com.google.android.apps.youtube.datalib.legacy.model.Playlist;

// Referenced classes of package com.google.android.apps.youtube.app.adapter:
//            ThumbnailRendererFactory, aq

final class ar extends ThumbnailRendererFactory
{

    final aq a;

    ar(aq aq, Context context, bj bj, h h, ThumbnailRendererFactory.ThumbnailSize thumbnailsize)
    {
        a = aq;
        super(context, bj, h, thumbnailsize);
    }

    protected final volatile Uri a(Object obj)
    {
        return ((Playlist)obj).thumbnailUri;
    }

    protected final volatile Uri b(Object obj)
    {
        return ((Playlist)obj).sdThumbnailUri;
    }

    protected final volatile Uri c(Object obj)
    {
        return ((Playlist)obj).hqThumbnailUri;
    }

    protected final volatile Uri d(Object obj)
    {
        return ((Playlist)obj).hqThumbnailUri;
    }
}
