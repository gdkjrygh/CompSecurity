// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.converter.http;

import android.text.TextUtils;
import com.google.android.apps.youtube.common.e.l;
import com.google.android.apps.youtube.core.converter.o;
import org.xml.sax.Attributes;

final class gf extends o
{

    gf()
    {
    }

    public final void a(l l1, Attributes attributes, String s)
    {
        l1 = (com.google.android.apps.youtube.datalib.model.gdata.Video.Builder)l1.a(com/google/android/apps/youtube/datalib/model/gdata/Video$Builder);
        if ("uploader".equals(attributes.getValue("role")))
        {
            l1.owner(s);
            attributes = attributes.getValue("yt:display");
            if (!TextUtils.isEmpty(attributes))
            {
                l1.ownerDisplayName(attributes);
            }
        }
    }
}
