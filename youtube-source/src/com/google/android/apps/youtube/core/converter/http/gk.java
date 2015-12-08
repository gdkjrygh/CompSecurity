// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.converter.http;

import android.net.Uri;
import com.google.android.apps.youtube.common.e.l;
import com.google.android.apps.youtube.core.converter.o;
import org.xml.sax.Attributes;

final class gk extends o
{

    gk()
    {
    }

    public final void a(l l1, Attributes attributes)
    {
        l1 = (com.google.android.apps.youtube.datalib.model.gdata.Video.Builder)l1.a(com/google/android/apps/youtube/datalib/model/gdata/Video$Builder);
        String s = attributes.getValue("yt:name");
        attributes = Uri.parse(attributes.getValue("url"));
        if ("default".equals(s))
        {
            l1.defaultThumbnailUri(attributes);
        } else
        {
            if ("mqdefault".equals(s))
            {
                l1.mqThumbnailUri(attributes);
                return;
            }
            if ("hqdefault".equals(s))
            {
                l1.hqThumbnailUri(attributes);
                return;
            }
            if ("sddefault".equals(s))
            {
                l1.sdThumbnailUri(attributes);
                return;
            }
        }
    }
}
