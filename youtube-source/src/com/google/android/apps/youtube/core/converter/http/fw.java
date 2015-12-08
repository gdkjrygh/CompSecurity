// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.converter.http;

import com.google.android.apps.youtube.common.e.l;
import com.google.android.apps.youtube.core.converter.o;
import java.util.Collections;
import java.util.HashSet;
import java.util.Locale;
import org.xml.sax.Attributes;

final class fw extends o
{

    fw()
    {
    }

    public final void a(l l1, Attributes attributes, String s)
    {
        com.google.android.apps.youtube.datalib.model.gdata.Video.Builder builder;
        String s1;
        String s2;
        s1 = attributes.getValue("action");
        s2 = attributes.getValue("permission");
        builder = (com.google.android.apps.youtube.datalib.model.gdata.Video.Builder)l1.a(com/google/android/apps/youtube/datalib/model/gdata/Video$Builder);
        builder.accessControl(s1, s2);
        if (!"monetize".equals(s1)) goto _L2; else goto _L1
_L1:
        if (!"country".equals(attributes.getValue("type"))) goto _L4; else goto _L3
_L3:
        l1 = new HashSet();
        Collections.addAll(l1, s.trim().toLowerCase(Locale.US).split(" "));
        builder.monetizeExceptionCountries(l1);
_L6:
        return;
_L4:
        builder.monetize("allowed".equals(s2));
        return;
_L2:
        if ("list".equals(s1))
        {
            if ("allowed".equals(s2))
            {
                l1 = com.google.android.apps.youtube.datalib.model.gdata.Video.Privacy.PUBLIC;
            } else
            {
                l1 = com.google.android.apps.youtube.datalib.model.gdata.Video.Privacy.UNLISTED;
            }
            builder.privacy(l1);
            return;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }
}
