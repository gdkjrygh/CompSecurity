// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.converter.http;

import com.google.android.apps.youtube.common.e.l;
import com.google.android.apps.youtube.core.converter.o;
import com.google.android.apps.youtube.datalib.legacy.model.LiveEvent;
import com.google.android.apps.youtube.datalib.model.gdata.Stream;
import com.google.android.apps.youtube.datalib.model.gdata.Video;
import java.util.Iterator;
import java.util.Set;
import org.xml.sax.Attributes;

final class bn extends o
{

    bn()
    {
    }

    public final void a(l l1, Attributes attributes)
    {
        l1.offer(new com.google.android.apps.youtube.datalib.legacy.model.LiveEvent.Builder());
    }

    public final void a(l l1, Attributes attributes, String s)
    {
        attributes = ((com.google.android.apps.youtube.datalib.legacy.model.LiveEvent.Builder)l1.b(com/google/android/apps/youtube/datalib/legacy/model/LiveEvent$Builder)).build();
        l1 = (com.google.android.apps.youtube.datalib.legacy.model.Page.Builder)l1.a(com/google/android/apps/youtube/datalib/legacy/model/Page$Builder);
        if (!attributes.isLiveNow()) goto _L2; else goto _L1
_L1:
        s = ((LiveEvent) (attributes)).video.streams.iterator();
_L6:
        if (!s.hasNext()) goto _L4; else goto _L3
_L3:
        if (!((Stream)s.next()).isHls()) goto _L6; else goto _L5
_L5:
        boolean flag = true;
_L9:
        if (!flag) goto _L7; else goto _L2
_L2:
        l1.addEntry(attributes);
_L7:
        return;
_L4:
        flag = false;
        if (true) goto _L9; else goto _L8
_L8:
    }
}
