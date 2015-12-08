// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.converter.http;

import com.google.android.apps.youtube.common.e.l;
import com.google.android.apps.youtube.core.converter.o;
import com.google.android.apps.youtube.datalib.legacy.model.ba;
import org.xml.sax.Attributes;

// Referenced classes of package com.google.android.apps.youtube.core.converter.http:
//            bi

final class et extends o
{

    et()
    {
    }

    public final void a(l l1, Attributes attributes)
    {
        if ("InfoCards".equals(attributes.getValue("type")))
        {
            l1.offer(new bi());
        }
    }

    public final void a(l l1, Attributes attributes, String s)
    {
        if ("InfoCards".equals(attributes.getValue("type")))
        {
            attributes = ((bi)l1.b(com/google/android/apps/youtube/core/converter/http/bi)).a();
            ((ba)l1.a(com/google/android/apps/youtube/datalib/legacy/model/ba)).u(attributes);
        }
    }
}
