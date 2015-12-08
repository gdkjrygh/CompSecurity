// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.legacy.model;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.apps.youtube.datalib.legacy.model:
//            r, ad, Subtitles, SubtitleWindowSettings

public final class an
    implements r
{

    private final SparseArray a = new SparseArray();

    public an()
    {
    }

    private ad a(int i)
    {
        ad ad2 = (ad)a.get(i);
        ad ad1 = ad2;
        if (ad2 == null)
        {
            ad1 = new ad(i);
            a.put(i, ad1);
        }
        return ad1;
    }

    public final an a(int i, int j, SubtitleWindowSettings subtitlewindowsettings)
    {
        a(i).a(j, subtitlewindowsettings);
        return this;
    }

    public final an a(int i, String s, int j, int k)
    {
        a(i).a(s, j, k);
        return this;
    }

    public final an b(int i, String s, int j, int k)
    {
        a(i).b(s, j, k);
        return this;
    }

    public final Object build()
    {
        ArrayList arraylist = new ArrayList();
        for (int i = 0; i < a.size(); i++)
        {
            arraylist.add(((ad)a.valueAt(i)).a());
        }

        return new Subtitles(arraylist, null);
    }
}
