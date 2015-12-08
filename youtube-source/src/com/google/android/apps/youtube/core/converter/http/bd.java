// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.converter.http;

import com.google.android.apps.youtube.common.L;
import com.google.android.apps.youtube.common.e.m;
import com.google.android.apps.youtube.common.e.p;
import com.google.android.apps.youtube.core.converter.o;
import com.google.android.apps.youtube.datalib.legacy.model.f;
import com.google.android.apps.youtube.datalib.legacy.model.l;
import java.net.MalformedURLException;
import org.xml.sax.Attributes;

final class bd extends o
{

    bd()
    {
    }

    public final void a(com.google.android.apps.youtube.common.e.l l1, Attributes attributes)
    {
        int i = m.b(attributes.getValue("review_count"), 0);
        l l2 = (new l(attributes.getValue("app_name"), attributes.getValue("price"))).a(i);
        l2.a(Math.max(0.0F, Math.min(5F, m.a(attributes.getValue("rating"), 0.0F))));
        attributes = attributes.getValue("rating_image");
        if (attributes != null)
        {
            try
            {
                l2.a(p.b(attributes.trim()));
            }
            // Misplaced declaration of an exception variable
            catch (Attributes attributes)
            {
                L.c("Badly formed rating image uri - ignoring");
            }
        }
        l1.offer(l2);
    }

    public final void a(com.google.android.apps.youtube.common.e.l l1, Attributes attributes, String s)
    {
        attributes = ((l)l1.b(com/google/android/apps/youtube/datalib/legacy/model/l)).a();
        ((f)l1.a(com/google/android/apps/youtube/datalib/legacy/model/f)).a(attributes);
    }
}
