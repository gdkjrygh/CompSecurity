// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.converter.http;

import com.google.android.apps.youtube.common.L;
import com.google.android.apps.youtube.common.e.l;
import com.google.android.apps.youtube.core.converter.o;
import java.util.Locale;
import org.xml.sax.Attributes;

final class bq extends o
{

    bq()
    {
    }

    public final void a(l l1, Attributes attributes, String s)
    {
        attributes = s.toUpperCase(Locale.US);
        try
        {
            ((com.google.android.apps.youtube.datalib.legacy.model.LiveEvent.Builder)l1.a(com/google/android/apps/youtube/datalib/legacy/model/LiveEvent$Builder)).status(com.google.android.apps.youtube.datalib.legacy.model.LiveEvent.Status.valueOf(attributes));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (l l1)
        {
            L.c((new StringBuilder("Unexpected status ")).append(attributes).toString());
        }
    }
}
