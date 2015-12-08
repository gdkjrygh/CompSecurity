// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.converter.http;

import android.net.Uri;
import com.google.android.apps.youtube.common.e.l;
import com.google.android.apps.youtube.core.converter.o;
import org.xml.sax.Attributes;

final class db extends o
{

    db()
    {
    }

    public final void a(l l1, Attributes attributes)
    {
        String s = attributes.getValue("rel");
        if (s.equals("edit"))
        {
            attributes = Uri.parse(attributes.getValue("href"));
            ((com.google.android.apps.youtube.datalib.legacy.model.Subscription.Builder)l1.a(com/google/android/apps/youtube/datalib/legacy/model/Subscription$Builder)).editUri(attributes);
        } else
        if (s.equals("related"))
        {
            attributes = Uri.parse(attributes.getValue("href"));
            ((com.google.android.apps.youtube.datalib.legacy.model.Subscription.Builder)l1.a(com/google/android/apps/youtube/datalib/legacy/model/Subscription$Builder)).channelUri(attributes);
            return;
        }
    }
}
