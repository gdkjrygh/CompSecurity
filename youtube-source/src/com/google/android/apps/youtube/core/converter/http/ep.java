// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.converter.http;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.apps.youtube.common.L;
import com.google.android.apps.youtube.common.e.l;
import com.google.android.apps.youtube.common.e.p;
import com.google.android.apps.youtube.core.converter.o;
import com.google.android.apps.youtube.datalib.legacy.model.ba;
import java.net.MalformedURLException;
import org.xml.sax.Attributes;

final class ep extends o
{

    ep()
    {
    }

    public final void a(l l1, Attributes attributes, String s)
    {
        ba ba1;
        ba1 = (ba)l1.a(com/google/android/apps/youtube/datalib/legacy/model/ba);
        attributes = attributes.getValue("event");
        if (attributes != null) goto _L2; else goto _L1
_L1:
        L.c("Custom tracking tag missing event attribute - ignoring");
_L5:
        return;
_L2:
        if (!TextUtils.isEmpty(s.trim()))
        {
            break MISSING_BLOCK_LABEL_68;
        }
        l1 = Uri.EMPTY;
_L3:
        if ("skip".equals(attributes))
        {
            ba1.f(l1);
            return;
        }
        break MISSING_BLOCK_LABEL_79;
        try
        {
            l1 = p.b(s.trim());
        }
        // Misplaced declaration of an exception variable
        catch (l l1)
        {
            L.c("Badly formed custom tracking uri - ignoring");
            return;
        }
          goto _L3
        if ("engagedView".equals(attributes))
        {
            ba1.h(l1);
            return;
        }
        if ("skipShown".equals(attributes))
        {
            ba1.g(l1);
            return;
        }
        if ("videoTitleClicked".equals(attributes))
        {
            ba1.p(l1);
            return;
        }
        if (!"vast2tracking".equals(attributes)) goto _L5; else goto _L4
_L4:
        ba1.u(l1);
        return;
    }
}
