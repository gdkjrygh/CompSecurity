// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.converter.http;

import com.google.a.a.a.a.fj;
import com.google.android.apps.youtube.common.e.b;
import com.google.android.apps.youtube.common.e.l;
import com.google.android.apps.youtube.core.converter.o;
import com.google.android.apps.youtube.datalib.legacy.model.ba;
import org.xml.sax.Attributes;

// Referenced classes of package com.google.android.apps.youtube.core.converter.http:
//            em

final class ew extends o
{

    final b a;

    ew(b b1)
    {
        a = b1;
        super();
    }

    public final void a(l l1, Attributes attributes, String s)
    {
        l1 = (ba)l1.a(com/google/android/apps/youtube/datalib/legacy/model/ba);
        fj fj1 = new fj();
        fj1.c = s.trim();
        fj1.f = attributes.getValue("type");
        fj1.i = em.a(attributes.getValue("height"), 0);
        l1.a(a.b()).a(fj1);
    }
}
