// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.converter.http;

import com.google.android.apps.youtube.common.e.l;
import com.google.android.apps.youtube.core.converter.o;
import com.google.android.apps.youtube.core.utils.Util;
import org.xml.sax.Attributes;

final class br extends o
{

    br()
    {
    }

    public final void a(l l1, Attributes attributes, String s)
    {
        l1 = (com.google.android.apps.youtube.datalib.legacy.model.LiveEvent.Builder)l1.a(com/google/android/apps/youtube/datalib/legacy/model/LiveEvent$Builder);
        l1.start(Util.a(attributes.getValue("start")));
        attributes = attributes.getValue("end");
        if (attributes != null)
        {
            l1.end(Util.a(attributes));
        }
    }
}
