// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.player.a;

import android.content.Context;
import android.net.Uri;
import com.google.android.apps.youtube.common.e.p;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.player.j;
import com.google.android.apps.youtube.datalib.innertube.model.media.FormatStream;
import com.google.android.apps.youtube.medialib.player.n;
import java.util.Map;

// Referenced classes of package com.google.android.apps.youtube.core.player.a:
//            l

public final class g extends j
{

    private final l b;
    private final FormatStream c;

    public g(n n, l l1, FormatStream formatstream)
    {
        super(n);
        b = (l)com.google.android.apps.youtube.common.fromguava.c.a(l1);
        c = formatstream;
    }

    public final void a(Context context, Uri uri, Map map)
    {
        Uri uri1;
        boolean flag;
        if (p.b(uri) && uri.getPath().equalsIgnoreCase("/pudl"))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        uri1 = uri;
        if (!flag)
        {
            uri1 = b.a(uri, c.getVideoId(), c.getItag(), c.getContentLength(), c.getLastModified());
        }
        super.a(context, uri1, map);
    }
}
