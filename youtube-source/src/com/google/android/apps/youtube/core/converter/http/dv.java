// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.converter.http;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.apps.youtube.common.e.l;
import com.google.android.apps.youtube.core.converter.o;
import org.xml.sax.Attributes;

final class dv extends o
{

    dv()
    {
    }

    public final void a(l l1, Attributes attributes)
    {
        l1 = (com.google.android.apps.youtube.core.identity.UserProfile.Builder)l1.peek();
        String s = attributes.getValue("rel");
        attributes = attributes.getValue("href");
        if (!TextUtils.isEmpty(attributes))
        {
            if ("self".equals(s))
            {
                l1.selfUri(Uri.parse(attributes));
            } else
            if ("alternate".equals(s))
            {
                l1.alternateUri(Uri.parse(attributes));
                return;
            }
        }
    }
}
