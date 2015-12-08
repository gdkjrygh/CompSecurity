// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.utils;

import com.google.android.apps.youtube.common.e.l;
import com.google.android.apps.youtube.common.e.m;
import com.google.android.apps.youtube.core.converter.o;
import com.google.android.apps.youtube.datalib.legacy.model.an;
import org.xml.sax.Attributes;

// Referenced classes of package com.google.android.apps.youtube.core.utils:
//            aa

final class ab extends o
{

    ab()
    {
    }

    public final void a(l l1, Attributes attributes, String s)
    {
        l1 = (an)l1.a(com/google/android/apps/youtube/datalib/legacy/model/an);
        int i = aa.a(Float.parseFloat(aa.a(attributes, new String[] {
            "start"
        })));
        int j = aa.a(m.a(aa.a(attributes, new String[] {
            "dur"
        }), 5F));
        l1.a(0, s.replaceAll("\n", "<br/>"), i, j + i);
    }
}
