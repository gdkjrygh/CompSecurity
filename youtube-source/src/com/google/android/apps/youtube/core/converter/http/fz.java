// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.converter.http;

import android.net.Uri;
import com.google.android.apps.youtube.common.e.l;
import com.google.android.apps.youtube.core.converter.o;
import java.util.Set;
import org.xml.sax.Attributes;

// Referenced classes of package com.google.android.apps.youtube.core.converter.http:
//            fp

final class fz extends o
{

    fz()
    {
    }

    public final void a(l l1, Attributes attributes)
    {
        String s;
        l1 = (com.google.android.apps.youtube.datalib.model.gdata.Video.Builder)l1.a(com/google/android/apps/youtube/datalib/model/gdata/Video$Builder);
        s = attributes.getValue("rel");
        if (!fp.b().contains(s)) goto _L2; else goto _L1
_L1:
        Uri uri = Uri.parse(attributes.getValue("href"));
        if (!"edit".equals(s)) goto _L4; else goto _L3
_L3:
        l1.editUri(uri);
_L2:
        return;
_L4:
        if (!"http://gdata.youtube.com/schemas/2007#video.captionTracks".equals(s))
        {
            continue; /* Loop/switch isn't completed */
        }
        if (!"true".equals(attributes.getValue("yt:hasEntries"))) goto _L2; else goto _L5
_L5:
        l1.captionTracksUri(uri);
        return;
        if (!"http://gdata.youtube.com/schemas/2007#live.event".equals(s)) goto _L2; else goto _L6
_L6:
        l1.liveEventUri(uri);
        return;
    }
}
