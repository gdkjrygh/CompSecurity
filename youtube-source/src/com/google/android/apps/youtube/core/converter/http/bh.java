// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.converter.http;

import com.google.android.apps.youtube.common.e.l;
import com.google.android.apps.youtube.core.converter.o;
import com.google.android.apps.youtube.datalib.legacy.model.f;
import org.xml.sax.Attributes;

// Referenced classes of package com.google.android.apps.youtube.core.converter.http:
//            bb, bi

final class bh extends o
{

    bh()
    {
    }

    public final void a(l l1, Attributes attributes)
    {
        l1.offer(new f(bb.a(attributes.getValue("type"), bb.c(), 0)));
    }

    public final void a(l l1, Attributes attributes, String s)
    {
        attributes = ((f)l1.b(com/google/android/apps/youtube/datalib/legacy/model/f)).a();
        ((bi)l1.a(com/google/android/apps/youtube/core/converter/http/bi)).a(attributes);
    }
}
