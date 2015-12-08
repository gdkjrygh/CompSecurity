// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.legacy.model;

import com.google.android.apps.youtube.common.L;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.apps.youtube.datalib.legacy.model:
//            r, SubtitleWindowTextTimeline

public final class al
    implements r
{

    private final List a = new ArrayList();
    private final List b = new ArrayList();
    private final List c = new ArrayList();

    public al()
    {
    }

    public final SubtitleWindowTextTimeline a()
    {
        return new SubtitleWindowTextTimeline(a, b, c, null);
    }

    public final al a(String s, int i, int j)
    {
        if (!a.isEmpty() && i < ((Integer)a.get(a.size() - 1)).intValue())
        {
            L.c("subtitles are not given in non-decreasing start time order");
        }
        a.add(Integer.valueOf(i));
        b.add(Integer.valueOf(j));
        c.add(s);
        return this;
    }

    public final al b(String s, int i, int j)
    {
        String s1 = s;
        if (!c.isEmpty())
        {
            s1 = (new StringBuilder()).append((String)c.get(c.size() - 1)).append(s).toString();
        }
        int k = j;
        if (j == i)
        {
            k = j;
            if (!b.isEmpty())
            {
                k = ((Integer)b.get(b.size() - 1)).intValue();
            }
        }
        return a(s1, i, k);
    }

    public final Object build()
    {
        return a();
    }
}
