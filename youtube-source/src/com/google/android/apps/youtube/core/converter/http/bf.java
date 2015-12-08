// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.converter.http;

import com.google.android.apps.youtube.common.L;
import com.google.android.apps.youtube.common.e.l;
import com.google.android.apps.youtube.common.e.p;
import com.google.android.apps.youtube.core.converter.o;
import com.google.android.apps.youtube.datalib.legacy.model.i;
import java.net.MalformedURLException;
import org.xml.sax.Attributes;

final class bf extends o
{

    bf()
    {
    }

    public final void a(l l1, Attributes attributes)
    {
        l1 = (i)l1.a(com/google/android/apps/youtube/datalib/legacy/model/i);
        attributes = attributes.getValue("base_url");
        if (attributes == null)
        {
            break MISSING_BLOCK_LABEL_35;
        }
        l1.a(p.b(attributes.trim()));
        return;
        l1;
        L.c("Badly formed action's event uri - ignoring event");
        return;
    }
}
