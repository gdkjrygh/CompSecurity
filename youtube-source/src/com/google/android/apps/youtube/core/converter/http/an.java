// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.converter.http;

import com.google.android.apps.youtube.common.e.l;
import com.google.android.apps.youtube.core.converter.o;
import org.xml.sax.Attributes;

// Referenced classes of package com.google.android.apps.youtube.core.converter.http:
//            ae

final class an extends o
{

    final ae a;

    an(ae ae)
    {
        a = ae;
        super();
    }

    public final void a(l l1, Attributes attributes)
    {
        if ("http://gdata.youtube.com/schemas/2007#video".equals(attributes.getValue("rel")))
        {
            l1.offer(new com.google.android.apps.youtube.datalib.model.gdata.Video.Builder());
        }
    }

    public final void a(l l1, Attributes attributes, String s)
    {
        if ("http://gdata.youtube.com/schemas/2007#video".equals(attributes.getValue("rel")))
        {
            attributes = ((com.google.android.apps.youtube.datalib.model.gdata.Video.Builder)l1.b(com/google/android/apps/youtube/datalib/model/gdata/Video$Builder)).build();
            ((com.google.android.apps.youtube.datalib.legacy.model.Event.Builder)l1.a(com/google/android/apps/youtube/datalib/legacy/model/Event$Builder)).targetVideo(attributes);
        }
    }
}
