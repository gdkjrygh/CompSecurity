// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.converter.http;

import com.google.android.apps.youtube.common.L;
import com.google.android.apps.youtube.common.e.l;
import com.google.android.apps.youtube.common.e.p;
import com.google.android.apps.youtube.core.converter.o;
import com.google.android.apps.youtube.datalib.legacy.model.f;
import java.net.MalformedURLException;
import org.xml.sax.Attributes;

// Referenced classes of package com.google.android.apps.youtube.core.converter.http:
//            bb

final class be extends o
{

    be()
    {
    }

    public final void a(l l1, Attributes attributes)
    {
        int i;
        i = bb.a(attributes.getValue("type"), bb.a(), 0);
        l1 = (f)l1.a(com/google/android/apps/youtube/datalib/legacy/model/f);
        attributes = attributes.getValue("base_url");
        if (attributes == null)
        {
            break MISSING_BLOCK_LABEL_59;
        }
        l1.a(new com.google.android.apps.youtube.datalib.legacy.model.InfoCard.InfoCardTrackingEvent(i, p.b(attributes.trim())));
        return;
        l1;
        L.c("Badly formed event's uri - ignoring event");
        return;
    }
}
