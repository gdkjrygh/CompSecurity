// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.converter.http;

import android.net.Uri;
import com.google.android.apps.youtube.common.e.l;
import com.google.android.apps.youtube.core.converter.o;
import org.xml.sax.Attributes;

final class ce extends o
{

    ce()
    {
    }

    public final void a(l l1, Attributes attributes)
    {
        Uri uri = Uri.parse(attributes.getValue("url"));
        attributes = attributes.getValue("yt:name");
        if ("default".equals(attributes))
        {
            ((com.google.android.apps.youtube.datalib.legacy.model.Playlist.Builder)l1.a(com/google/android/apps/youtube/datalib/legacy/model/Playlist$Builder)).thumbnailUri(uri);
        } else
        {
            if ("hqdefault".equals(attributes))
            {
                ((com.google.android.apps.youtube.datalib.legacy.model.Playlist.Builder)l1.a(com/google/android/apps/youtube/datalib/legacy/model/Playlist$Builder)).hqThumbnailUri(uri);
                return;
            }
            if ("sddefault".equals(attributes))
            {
                ((com.google.android.apps.youtube.datalib.legacy.model.Playlist.Builder)l1.a(com/google/android/apps/youtube/datalib/legacy/model/Playlist$Builder)).sdThumbnailUri(uri);
                return;
            }
        }
    }
}
