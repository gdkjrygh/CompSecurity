// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.converter.http;

import android.net.Uri;
import com.google.android.apps.youtube.common.e.l;
import com.google.android.apps.youtube.common.e.m;
import com.google.android.apps.youtube.core.converter.o;
import org.xml.sax.Attributes;

final class gl extends o
{

    gl()
    {
    }

    public final void a(l l1, Attributes attributes)
    {
        l1 = (com.google.android.apps.youtube.datalib.model.gdata.Video.Builder)l1.a(com/google/android/apps/youtube/datalib/model/gdata/Video$Builder);
        com.google.android.apps.youtube.datalib.model.gdata.Stream.Builder builder = new com.google.android.apps.youtube.datalib.model.gdata.Stream.Builder();
        builder.mimeType(attributes.getValue("type"));
        builder.uri(Uri.parse(attributes.getValue("url")));
        builder.legacyGdataFormat(m.b(attributes.getValue("yt:format"), -1));
        l1.addStream(builder.build());
    }
}
