// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.converter.http;

import android.util.Pair;
import com.google.android.apps.youtube.common.e.l;
import com.google.android.apps.youtube.core.converter.o;
import com.google.android.apps.youtube.datalib.legacy.model.bg;
import com.google.android.apps.youtube.datalib.legacy.model.bj;
import org.xml.sax.Attributes;

// Referenced classes of package com.google.android.apps.youtube.core.converter.http:
//            gt

final class gv extends o
{

    gv()
    {
    }

    public final void a(l l1, Attributes attributes)
    {
        bj bj1 = new bj();
        Pair pair = gt.a(attributes.getValue("timeOffset"));
        bj1.a((com.google.android.apps.youtube.datalib.legacy.model.VmapAdBreak.OffsetType)pair.first);
        bj1.a(((Integer)pair.second).intValue());
        gt.a(attributes.getValue("breakType"), bj1);
        bj1.a(attributes.getValue("breakId"));
        l1.offer(bj1);
    }

    public final void a(l l1, Attributes attributes, String s)
    {
        attributes = (bj)l1.b(com/google/android/apps/youtube/datalib/legacy/model/bj);
        l1 = (bg)l1.a(com/google/android/apps/youtube/datalib/legacy/model/bg);
        if (attributes == null || l1 == null)
        {
            return;
        } else
        {
            l1.a(attributes.a());
            return;
        }
    }
}
