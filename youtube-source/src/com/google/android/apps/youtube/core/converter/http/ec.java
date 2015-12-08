// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.converter.http;

import com.google.android.apps.youtube.common.e.l;
import com.google.android.apps.youtube.core.converter.o;
import org.xml.sax.Attributes;

final class ec extends o
{

    ec()
    {
    }

    public final void a(l l1, Attributes attributes)
    {
        l1 = (com.google.android.apps.youtube.core.identity.UserProfile.Builder)l1.peek();
        l1.channelViewsCount(Long.parseLong(attributes.getValue("viewCount")));
        l1.uploadViewsCount(Long.parseLong(attributes.getValue("totalUploadViews")));
        l1.subscribersCount(Integer.parseInt(attributes.getValue("subscriberCount")));
    }
}
