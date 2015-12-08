// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.converter.http;

import com.google.android.apps.youtube.common.e.l;
import com.google.android.apps.youtube.common.e.m;
import com.google.android.apps.youtube.core.converter.o;
import org.xml.sax.Attributes;

// Referenced classes of package com.google.android.apps.youtube.core.converter.http:
//            fk, fl

final class fb extends o
{

    final fl a;

    fb(fl fl1)
    {
        a = fl1;
        super();
    }

    public final void a(l l1, Attributes attributes)
    {
        l1.offer(new fk((int)m.a(attributes.getValue("version"), 2.0F)));
    }

    public final void a(l l1, Attributes attributes, String s)
    {
        attributes = (fk)l1.b(com/google/android/apps/youtube/core/converter/http/fk);
        if (a != null)
        {
            a.a(l1, attributes.a());
        }
    }
}
