// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.player.sequencer;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.apps.youtube.common.a.b;
import com.google.android.apps.youtube.core.Analytics;
import com.google.android.apps.youtube.core.async.GDataRequest;
import com.google.android.apps.youtube.core.aw;
import com.google.android.apps.youtube.core.player.event.PlaybackServiceException;
import com.google.android.apps.youtube.datalib.legacy.model.Page;
import com.google.android.apps.youtube.datalib.model.gdata.Video;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.apps.youtube.core.player.sequencer:
//            h

final class i
    implements b
{

    final h a;

    private i(h h1)
    {
        a = h1;
        super();
    }

    i(h h1, byte byte0)
    {
        this(h1);
    }

    public final void a(Object obj, Exception exception)
    {
        h.a(a, null);
        a.a(new PlaybackServiceException(com.google.android.apps.youtube.core.player.event.PlaybackServiceException.ErrorReason.REQUEST_FAILED, true, a.e.a(exception), exception));
        a.p = a.q;
    }

    public final void a(Object obj, Object obj1)
    {
        obj = (GDataRequest)obj;
        obj1 = (Page)obj1;
        h.a(a, null);
        int j = a.l.length;
        a.l = (String[])Arrays.copyOf(a.l, a.l.length + ((Page) (obj1)).entries.size());
        for (Iterator iterator = ((Page) (obj1)).entries.iterator(); iterator.hasNext();)
        {
            Video video = (Video)iterator.next();
            if (TextUtils.isEmpty(video.id))
            {
                a.d.a("PlaybackError - GData: NoVideoIdPage", ((GDataRequest) (obj)).a.toString());
            }
            a.l[j] = video.id;
            j++;
        }

        if (((Page) (obj1)).entries.isEmpty() || ((Page) (obj1)).nextUri == null)
        {
            h.a(a, null);
        } else
        {
            h.a(a, GDataRequest.a(((Page) (obj1)).nextUri, h.a(a)));
        }
        if (a.q >= a.l.length && h.a(a) != null)
        {
            com.google.android.apps.youtube.core.player.sequencer.h.b(a);
            return;
        } else
        {
            h.c(a);
            return;
        }
    }
}
