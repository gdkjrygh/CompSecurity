// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.converter.http;

import android.net.Uri;
import com.google.android.apps.youtube.common.e.l;
import com.google.android.apps.youtube.core.converter.o;
import org.xml.sax.Attributes;

final class cq extends o
{

    cq()
    {
    }

    public final void a(l l1, Attributes attributes)
    {
        if ("http://schemas.google.com/g/2005#feed".equals(attributes.getValue("rel")))
        {
            ((com.google.android.apps.youtube.datalib.legacy.model.Playlist.Builder)l1.a(com/google/android/apps/youtube/datalib/legacy/model/Playlist$Builder)).contentUri(Uri.parse(attributes.getValue("href")));
        } else
        if ("http://schemas.google.com/g/2005#post".equals(attributes.getValue("rel")))
        {
            ((com.google.android.apps.youtube.datalib.legacy.model.Playlist.Builder)l1.a(com/google/android/apps/youtube/datalib/legacy/model/Playlist$Builder)).postUri(Uri.parse(attributes.getValue("href")));
            return;
        }
    }
}
