// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.converter.http;

import android.text.TextUtils;
import com.google.android.apps.youtube.common.e.l;
import com.google.android.apps.youtube.core.converter.o;
import org.xml.sax.Attributes;

final class du extends o
{

    du()
    {
    }

    public final void a(l l1, Attributes attributes, String s)
    {
        l1 = (com.google.android.apps.youtube.core.identity.UserProfile.Builder)l1.peek();
        if (!TextUtils.isEmpty(s))
        {
            l1.displayUsername(s);
        }
    }
}
