// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.converter.http;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.apps.youtube.common.L;
import com.google.android.apps.youtube.common.e.l;
import com.google.android.apps.youtube.common.e.m;
import com.google.android.apps.youtube.common.e.p;
import com.google.android.apps.youtube.core.converter.o;
import com.google.android.apps.youtube.core.utils.ag;
import com.google.android.apps.youtube.datalib.legacy.model.ba;
import java.net.MalformedURLException;
import org.xml.sax.Attributes;

final class fd extends o
{

    fd()
    {
    }

    private static com.google.android.apps.youtube.datalib.legacy.model.VastAd.ProgressPing a(String s, Uri uri)
    {
        if (!TextUtils.isEmpty(s)) goto _L2; else goto _L1
_L1:
        L.c("Badly formed progress tracking event (missing offset attribute) - ignoring");
_L4:
        return null;
_L2:
        if (s.endsWith("%"))
        {
            int i = m.b(s.substring(0, s.length() - 1), -1);
            if (i >= 0 && i <= 100)
            {
                return new com.google.android.apps.youtube.datalib.legacy.model.VastAd.ProgressPing(i, true, uri);
            }
            L.c("Badly formed progress tracking event (invalid offset percentage) - ignoring");
            continue; /* Loop/switch isn't completed */
        }
        s = new com.google.android.apps.youtube.datalib.legacy.model.VastAd.ProgressPing(ag.a(s), false, uri);
        return s;
        s;
        L.c("Badly formed progress tracking event (invalid offset format) - ignoring");
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final void a(l l1, Attributes attributes, String s)
    {
        String s1;
        l1 = (ba)l1.a(com/google/android/apps/youtube/datalib/legacy/model/ba);
        s1 = attributes.getValue("event");
        if (s1 != null) goto _L2; else goto _L1
_L1:
        L.c("Badly formed tracking event - ignoring");
_L4:
        return;
_L2:
        try
        {
            s = p.b(s.trim());
            if ("start".equals(s1))
            {
                l1.b(s);
                return;
            }
        }
        // Misplaced declaration of an exception variable
        catch (l l1)
        {
            L.c("Badly formed tracking uri - ignoring");
            return;
        }
        if ("creativeView".equals(s1))
        {
            l1.b(s);
            return;
        }
        if ("firstQuartile".equals(s1))
        {
            l1.c(s);
            return;
        }
        if ("midpoint".equals(s1))
        {
            l1.d(s);
            return;
        }
        if ("thirdQuartile".equals(s1))
        {
            l1.e(s);
            return;
        }
        if ("complete".equals(s1))
        {
            l1.i(s);
            return;
        }
        if ("pause".equals(s1))
        {
            l1.k(s);
            return;
        }
        if ("resume".equals(s1))
        {
            l1.l(s);
            return;
        }
        if ("mute".equals(s1))
        {
            l1.m(s);
            return;
        }
        if ("fullscreen".equals(s1))
        {
            l1.n(s);
            return;
        }
        if ("close".equals(s1))
        {
            l1.j(s);
            return;
        }
        if ("skip".equals(s1) && ((ba) (l1)).a >= 3)
        {
            l1.f(s);
            return;
        }
        if (!"progress".equals(s1) || ((ba) (l1)).a < 3) goto _L4; else goto _L3
_L3:
        attributes = a(attributes.getValue("offset"), ((Uri) (s)));
        if (attributes == null) goto _L4; else goto _L5
_L5:
        l1.a(attributes);
        return;
    }
}
