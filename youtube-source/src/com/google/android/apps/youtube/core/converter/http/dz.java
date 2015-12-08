// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.converter.http;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.apps.youtube.common.e.l;
import com.google.android.apps.youtube.common.e.m;
import com.google.android.apps.youtube.core.converter.o;
import java.util.Set;
import org.xml.sax.Attributes;

// Referenced classes of package com.google.android.apps.youtube.core.converter.http:
//            dy

final class dz extends o
{

    dz()
    {
    }

    public final void a(l l1, Attributes attributes)
    {
        com.google.android.apps.youtube.core.identity.UserProfile.Builder builder = (com.google.android.apps.youtube.core.identity.UserProfile.Builder)l1.peek();
        String s = attributes.getValue("rel");
        if (dy.a().contains(s))
        {
            l1 = attributes.getValue("href");
            int i;
            if (TextUtils.isEmpty(l1))
            {
                l1 = null;
            } else
            {
                l1 = Uri.parse(l1);
            }
            i = m.b(attributes.getValue("countHint"), -1);
            if ("http://gdata.youtube.com/schemas/2007#user.uploads".equals(s))
            {
                builder.uploadsUri(l1);
                builder.uploadedCount(i);
            } else
            {
                if ("http://gdata.youtube.com/schemas/2007#user.favorites".equals(s))
                {
                    builder.favoritesUri(l1);
                    builder.favoritesCount(i);
                    return;
                }
                if ("http://gdata.youtube.com/schemas/2007#user.subscriptions".equals(s))
                {
                    builder.subscriptionsUri(l1);
                    builder.subscriptionsCount(i);
                    return;
                }
                if ("http://gdata.youtube.com/schemas/2007#user.watchhistory".equals(s))
                {
                    builder.watchHistoryUri(l1);
                    return;
                }
                if ("http://gdata.youtube.com/schemas/2007#user.watchlater".equals(s))
                {
                    builder.watchLaterUri(l1);
                    return;
                }
                if ("http://gdata.youtube.com/schemas/2007#user.playlists".equals(s))
                {
                    builder.playlistsUri(l1);
                    return;
                }
                if ("http://gdata.youtube.com/schemas/2007#user.recentactivity".equals(s))
                {
                    builder.activityUri(l1);
                    return;
                }
            }
        }
    }
}
