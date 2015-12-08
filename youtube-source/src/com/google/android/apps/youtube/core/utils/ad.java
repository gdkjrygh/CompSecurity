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

final class ad extends o
{

    ad()
    {
    }

    public final void a(l l1, Attributes attributes, String s)
    {
        l1 = (an)l1.a(com/google/android/apps/youtube/datalib/legacy/model/an);
        int i = m.b(aa.a(attributes, new String[] {
            "w", "win"
        }), 0);
        int j = Integer.valueOf(aa.a(attributes, new String[] {
            "t", "start"
        })).intValue();
        int k = m.b(aa.a(attributes, new String[] {
            "d", "dur"
        }), 0);
        s = s.replaceAll("\n", "<br/>");
        if (aa.a(attributes, new String[] {
    "append"
}) == null)
        {
            l1.a(i, s, j, k + j);
            return;
        } else
        {
            l1.b(i, s, j, k + j);
            return;
        }
    }
}
