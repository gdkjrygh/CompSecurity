// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.converter.http;

import android.text.TextUtils;
import com.google.android.apps.youtube.common.L;
import com.google.android.apps.youtube.common.e.p;
import com.google.android.apps.youtube.core.converter.o;
import com.google.android.apps.youtube.datalib.legacy.model.l;
import java.net.MalformedURLException;
import org.xml.sax.Attributes;

final class bc extends o
{

    bc()
    {
    }

    public final void a(com.google.android.apps.youtube.common.e.l l1, Attributes attributes, String s)
    {
        s = attributes.getValue("image_url");
        if (TextUtils.isEmpty(s))
        {
            attributes = attributes.getValue("thumbnail_url");
        } else
        {
            attributes = s;
        }
        if (TextUtils.isEmpty(attributes))
        {
            break MISSING_BLOCK_LABEL_54;
        }
        l1 = (l)l1.a(com/google/android/apps/youtube/datalib/legacy/model/l);
        l1.b(p.b(attributes.trim()));
        return;
        l1;
        L.c("Badly formed app icon - ignoring");
        return;
    }
}
