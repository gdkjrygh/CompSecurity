// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.converter.http;

import com.google.android.apps.youtube.common.e.l;
import com.google.android.apps.youtube.core.converter.o;
import com.google.android.apps.youtube.datalib.legacy.model.d;
import java.util.ArrayList;
import org.xml.sax.Attributes;

final class au extends o
{

    au()
    {
    }

    public final void a(l l1, Attributes attributes)
    {
        l1.offer(new d());
    }

    public final void a(l l1, Attributes attributes, String s)
    {
        attributes = ((d)l1.b(com/google/android/apps/youtube/datalib/legacy/model/d)).a();
        ((ArrayList)l1.a(java/util/ArrayList)).add(attributes);
    }
}
