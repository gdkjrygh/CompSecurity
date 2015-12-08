// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.utils;

import com.google.android.apps.youtube.common.e.l;
import com.google.android.apps.youtube.common.e.m;
import com.google.android.apps.youtube.core.converter.o;
import com.google.android.apps.youtube.datalib.legacy.model.SubtitleWindowSettings;
import com.google.android.apps.youtube.datalib.legacy.model.an;
import org.xml.sax.Attributes;

// Referenced classes of package com.google.android.apps.youtube.core.utils:
//            aa

final class ae extends o
{

    ae()
    {
    }

    public final void a(l l1, Attributes attributes, String s)
    {
        boolean flag1 = true;
        l1 = (an)l1.a(com/google/android/apps/youtube/datalib/legacy/model/an);
        int i1 = m.b(aa.a(attributes, new String[] {
            "w", "win", "id"
        }), 0);
        int j1 = Integer.valueOf(aa.a(attributes, new String[] {
            "t", "start"
        })).intValue();
        s = attributes.getValue("op");
        if (s != null && s.equals("define"))
        {
            int i = 34;
            int j = 50;
            int k = 95;
            s = aa.a(attributes, new String[] {
                "ap"
            });
            if (s != null)
            {
                i = aa.a(Integer.valueOf(s).intValue());
            }
            s = aa.a(attributes, new String[] {
                "ah"
            });
            if (s != null)
            {
                j = Math.max(0, Math.min(Integer.valueOf(s).intValue(), 100));
            }
            s = aa.a(attributes, new String[] {
                "av"
            });
            if (s != null)
            {
                k = Math.max(0, Math.min(Integer.valueOf(s).intValue(), 100));
            }
            s = aa.a(attributes, new String[] {
                "vs"
            });
            boolean flag;
            if (s != null)
            {
                flag = Boolean.valueOf(s).booleanValue();
            } else
            {
                flag = true;
            }
            if (aa.a(attributes, new String[] {
    "sd"
}) == null)
            {
                flag1 = false;
            }
            l1.a(i1, j1, new SubtitleWindowSettings(i, j, k, flag, flag1));
        }
    }
}
