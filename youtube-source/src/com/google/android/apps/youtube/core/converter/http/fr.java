// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.converter.http;

import com.google.android.apps.youtube.common.e.l;
import com.google.android.apps.youtube.core.converter.o;
import com.google.android.apps.youtube.core.utils.Util;
import org.xml.sax.Attributes;

final class fr extends o
{

    fr()
    {
    }

    public final void a(l l1, Attributes attributes, String s)
    {
        attributes = Util.a(s);
        l1 = (com.google.android.apps.youtube.datalib.model.gdata.Video.Builder)l1.a(com/google/android/apps/youtube/datalib/model/gdata/Video$Builder);
        l1.publishedDate(attributes);
        if (l1.getUploadedDate() == null)
        {
            l1.uploadedDate(attributes);
        }
    }
}
