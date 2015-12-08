// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.converter.http;

import com.google.android.apps.youtube.common.L;
import com.google.android.apps.youtube.common.e.l;
import com.google.android.apps.youtube.common.e.p;
import com.google.android.apps.youtube.core.converter.o;
import com.google.android.apps.youtube.datalib.legacy.model.bj;
import java.net.MalformedURLException;
import org.xml.sax.Attributes;

// Referenced classes of package com.google.android.apps.youtube.core.converter.http:
//            gt

final class gw extends o
{

    gw()
    {
    }

    public final void a(l l1, Attributes attributes, String s)
    {
        l1 = (bj)l1.a(com/google/android/apps/youtube/datalib/legacy/model/bj);
        attributes = gt.b(attributes.getValue("event"));
        if (attributes == null)
        {
            return;
        }
        try
        {
            l1.a(attributes, p.b(s.trim()));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (l l1)
        {
            L.c("Badly formed AdBreak tracking uri - ignoring");
        }
    }
}
