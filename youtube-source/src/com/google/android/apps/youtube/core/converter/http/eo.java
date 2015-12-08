// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.converter.http;

import com.google.android.apps.youtube.common.L;
import com.google.android.apps.youtube.common.e.l;
import com.google.android.apps.youtube.common.e.p;
import com.google.android.apps.youtube.core.converter.o;
import com.google.android.apps.youtube.datalib.legacy.model.ba;
import java.net.MalformedURLException;
import org.xml.sax.Attributes;

final class eo extends o
{

    eo()
    {
    }

    public final void a(l l1, Attributes attributes, String s)
    {
        l1 = (ba)l1.a(com/google/android/apps/youtube/datalib/legacy/model/ba);
        try
        {
            l1.v(p.b(s.trim()));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (l l1)
        {
            L.c("Badly formed ConversionUrl uri - ignoring");
        }
    }
}
