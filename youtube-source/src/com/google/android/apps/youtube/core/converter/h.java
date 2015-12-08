// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.converter;

import android.net.Uri;
import com.google.android.apps.youtube.common.e.l;
import java.util.Set;
import org.xml.sax.Attributes;

// Referenced classes of package com.google.android.apps.youtube.core.converter:
//            o, g

final class h extends o
{

    h()
    {
    }

    public final void a(l l1, Attributes attributes)
    {
        String s = attributes.getValue("rel");
        if (g.b().contains(s))
        {
            l1 = (com.google.android.apps.youtube.datalib.legacy.model.Page.Builder)l1.a(com/google/android/apps/youtube/datalib/legacy/model/Page$Builder);
            attributes = Uri.parse(attributes.getValue("href"));
            if ("next".equals(s))
            {
                l1.nextUri(attributes);
            } else
            if ("previous".equals(s))
            {
                l1.previousUri(attributes);
                return;
            }
        }
    }
}
