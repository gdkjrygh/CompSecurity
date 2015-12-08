// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.converter.http;

import com.google.android.apps.youtube.common.e.l;
import com.google.android.apps.youtube.common.e.m;
import com.google.android.apps.youtube.core.converter.o;
import org.xml.sax.Attributes;

final class gn extends o
{

    gn()
    {
    }

    public final void a(l l1, Attributes attributes, String s)
    {
        s = (com.google.android.apps.youtube.datalib.model.gdata.Video.Builder)l1.b(com/google/android/apps/youtube/datalib/model/gdata/Video$Builder);
        ((com.google.android.apps.youtube.datalib.legacy.model.BatchEntry.Builder)l1.a(com/google/android/apps/youtube/datalib/legacy/model/BatchEntry$Builder)).setStatusCode(m.b(attributes.getValue("code"), 0));
        l1.offer(s);
    }
}
