// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.converter.http;

import com.google.android.apps.youtube.common.L;
import com.google.android.apps.youtube.common.e.l;
import com.google.android.apps.youtube.common.e.p;
import com.google.android.apps.youtube.core.converter.o;
import com.google.android.apps.youtube.datalib.legacy.model.f;
import com.google.android.apps.youtube.datalib.legacy.model.i;
import java.net.MalformedURLException;
import org.xml.sax.Attributes;

// Referenced classes of package com.google.android.apps.youtube.core.converter.http:
//            bb

final class bg extends o
{

    bg()
    {
    }

    public final void a(l l1, Attributes attributes)
    {
        Object obj;
        int j;
        j = bb.a(attributes.getValue("type"), bb.b(), 0);
        obj = attributes.getValue("link_url");
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_62;
        }
        obj = p.b(((String) (obj)).trim());
_L1:
        l1.offer(new i(j, ((android.net.Uri) (obj)), attributes.getValue("title")));
        return;
        obj = null;
          goto _L1
        l1;
        L.c("Badly formed action uri - ignoring action");
        return;
    }

    public final void a(l l1, Attributes attributes, String s)
    {
        attributes = ((i)l1.b(com/google/android/apps/youtube/datalib/legacy/model/i)).a();
        ((f)l1.a(com/google/android/apps/youtube/datalib/legacy/model/f)).a(attributes);
    }
}
