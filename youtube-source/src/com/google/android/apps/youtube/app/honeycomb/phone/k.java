// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.honeycomb.phone;

import android.content.Context;
import android.net.Uri;
import com.google.android.apps.youtube.app.adapter.ThumbnailRendererFactory;
import com.google.android.apps.youtube.common.network.h;
import com.google.android.apps.youtube.core.client.bj;
import com.google.android.apps.youtube.datalib.model.gdata.Video;

// Referenced classes of package com.google.android.apps.youtube.app.honeycomb.phone:
//            PostPairingActivity

final class k extends ThumbnailRendererFactory
{

    final PostPairingActivity a;

    k(PostPairingActivity postpairingactivity, Context context, bj bj, h h, com.google.android.apps.youtube.app.adapter.ThumbnailRendererFactory.ThumbnailSize thumbnailsize)
    {
        a = postpairingactivity;
        super(context, bj, h, null);
    }

    protected final volatile Uri a(Object obj)
    {
        return ((Video)obj).defaultThumbnailUri;
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
