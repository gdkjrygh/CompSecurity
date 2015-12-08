// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.converter.http;

import com.google.android.apps.youtube.common.e.l;
import com.google.android.apps.youtube.core.converter.o;
import com.google.android.apps.youtube.datalib.legacy.model.ba;
import org.xml.sax.Attributes;

final class ev extends o
{

    ev()
    {
    }

    public final void a(l l1, Attributes attributes, String s)
    {
        l1 = (ba)l1.a(com/google/android/apps/youtube/datalib/legacy/model/ba);
        attributes = s.split(",");
        int j = attributes.length;
        int i = 0;
        while (i < j) 
        {
            s = attributes[i];
            if ("rm=true".equals(s))
            {
                l1.b(true);
            } else
            if ("blockAllAds=true".equals(s))
            {
                l1.b(false);
            }
            i++;
        }
    }
}
