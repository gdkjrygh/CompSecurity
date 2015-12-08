// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.converter.http;

import android.text.TextUtils;
import com.google.android.apps.youtube.common.L;
import com.google.android.apps.youtube.common.e.l;
import com.google.android.apps.youtube.common.e.p;
import com.google.android.apps.youtube.core.converter.o;
import com.google.android.apps.youtube.datalib.legacy.model.ba;
import java.net.MalformedURLException;
import org.xml.sax.Attributes;

final class fh extends o
{

    fh()
    {
    }

    public final void a(l l1, Attributes attributes, String s)
    {
        l1 = (ba)l1.a(com/google/android/apps/youtube/datalib/legacy/model/ba);
        attributes = attributes.getValue("id");
        if ("engagedView".equals(attributes))
        {
            l1.h(p.b(s.trim()));
            l1.a(true);
            return;
        }
        try
        {
            if (s.toUpperCase().contains("SKIPPABLE_AD"))
            {
                l1.a(true);
                l1.a();
                attributes = s.split("(?i)SKIPPABLE_AD");
                if (attributes.length >= 2)
                {
                    attributes = attributes[1].trim();
                    if (!TextUtils.isEmpty(attributes))
                    {
                        l1.f(p.b(attributes));
                        return;
                    }
                }
            }
        }
        // Misplaced declaration of an exception variable
        catch (l l1)
        {
            L.c("Badly formed custom click tracking uri - ignoring");
        }
        return;
    }
}
