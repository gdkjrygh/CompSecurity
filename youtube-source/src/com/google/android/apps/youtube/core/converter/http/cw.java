// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.converter.http;

import com.google.android.apps.youtube.common.L;
import com.google.android.apps.youtube.common.e.l;
import com.google.android.apps.youtube.core.converter.o;
import java.util.Locale;
import org.xml.sax.Attributes;

final class cw extends o
{

    cw()
    {
    }

    public final void a(l l1, Attributes attributes)
    {
        l1 = (com.google.android.apps.youtube.datalib.legacy.model.Subscription.Builder)l1.a(com/google/android/apps/youtube/datalib/legacy/model/Subscription$Builder);
        if (!"http://gdata.youtube.com/schemas/2007/subscriptiontypes.cat".equals(attributes.getValue("scheme")))
        {
            break MISSING_BLOCK_LABEL_50;
        }
        attributes = attributes.getValue("term").toUpperCase(Locale.US);
        l1.type(com.google.android.apps.youtube.datalib.legacy.model.Subscription.Type.valueOf(attributes));
        return;
        IllegalArgumentException illegalargumentexception;
        illegalargumentexception;
        L.c((new StringBuilder("Unexpected subscription type ")).append(attributes).toString());
        l1.type(com.google.android.apps.youtube.datalib.legacy.model.Subscription.Type.UNKNOWN);
        return;
    }
}
