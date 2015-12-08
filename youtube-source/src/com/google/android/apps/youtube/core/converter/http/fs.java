// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.converter.http;

import com.google.android.apps.youtube.common.e.l;
import com.google.android.apps.youtube.core.converter.o;
import java.util.Map;
import org.xml.sax.Attributes;

// Referenced classes of package com.google.android.apps.youtube.core.converter.http:
//            fp

final class fs extends o
{

    fs()
    {
    }

    public final void a(l l1, Attributes attributes)
    {
        com.google.android.apps.youtube.datalib.model.gdata.Video.Builder builder = (com.google.android.apps.youtube.datalib.model.gdata.Video.Builder)l1.a(com/google/android/apps/youtube/datalib/model/gdata/Video$Builder);
        String s = attributes.getValue("reasonCode");
        l1 = s;
        if (s == null)
        {
            l1 = attributes.getValue("name");
        }
        builder.state((com.google.android.apps.youtube.datalib.model.gdata.Video.State)fp.a().get(l1));
    }
}
