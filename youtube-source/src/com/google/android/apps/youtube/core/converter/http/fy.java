// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.converter.http;

import com.google.android.apps.youtube.common.e.l;
import com.google.android.apps.youtube.core.converter.o;
import org.xml.sax.Attributes;

final class fy extends o
{

    fy()
    {
    }

    public final void a(l l1, Attributes attributes)
    {
        l1 = (com.google.android.apps.youtube.datalib.model.gdata.Video.Builder)l1.a(com/google/android/apps/youtube/datalib/model/gdata/Video$Builder);
        if ("http://gdata.youtube.com/schemas/2007/categories.cat".equals(attributes.getValue("scheme")))
        {
            l1.categoryLabel(attributes.getValue("label"));
            l1.categoryTerm(attributes.getValue("term"));
        }
    }
}
