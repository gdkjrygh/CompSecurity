// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.converter.http;

import com.google.android.apps.youtube.common.e.l;
import com.google.android.apps.youtube.core.converter.o;
import com.google.android.apps.youtube.datalib.legacy.model.TrackingPingAuthenticationSettings;
import com.google.android.apps.youtube.datalib.legacy.model.bg;
import org.xml.sax.Attributes;

final class gx extends o
{

    gx()
    {
    }

    public final void a(l l1, Attributes attributes)
    {
        l1 = (bg)l1.a(com/google/android/apps/youtube/datalib/legacy/model/bg);
        String s = attributes.getValue("headers");
        attributes = attributes.getValue("match");
        if (s != null && attributes != null)
        {
            l1.a(new TrackingPingAuthenticationSettings(attributes, s.contains("device"), s.contains("user")));
        }
    }
}
