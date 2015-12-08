// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.converter.http;

import com.google.android.apps.youtube.common.e.l;
import com.google.android.apps.youtube.core.converter.o;
import com.google.android.apps.youtube.datalib.legacy.model.p;
import org.xml.sax.Attributes;

final class gm extends o
{

    gm()
    {
    }

    public final void a(l l1, Attributes attributes)
    {
        l1.offer(new com.google.android.apps.youtube.datalib.legacy.model.BatchEntry.Builder());
        l1.offer(new com.google.android.apps.youtube.datalib.model.gdata.Video.Builder());
    }

    public final void a(l l1, Attributes attributes, String s)
    {
        attributes = (com.google.android.apps.youtube.datalib.model.gdata.Video.Builder)l1.b(com/google/android/apps/youtube/datalib/model/gdata/Video$Builder);
        s = (com.google.android.apps.youtube.datalib.legacy.model.BatchEntry.Builder)l1.b(com/google/android/apps/youtube/datalib/legacy/model/BatchEntry$Builder);
        if (s.getStatusCode() == 200)
        {
            s.setResult(attributes.build());
        }
        ((p)l1.a(com/google/android/apps/youtube/datalib/legacy/model/p)).a(s.build());
    }
}
