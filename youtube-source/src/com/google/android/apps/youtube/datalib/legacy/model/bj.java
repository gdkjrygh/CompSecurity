// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.legacy.model;

import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.apps.youtube.common.fromguava.c;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.apps.youtube.datalib.legacy.model:
//            r, VmapAdBreak, bi, TrackingPingAuthenticationSettings, 
//            VastAd

public class bj
    implements r
{

    private String a;
    private VmapAdBreak.OffsetType b;
    private int c;
    private boolean d;
    private boolean e;
    private boolean f;
    private String g;
    private List h;
    private List i;
    private List j;
    private List k;
    private TrackingPingAuthenticationSettings l;
    private boolean m;

    public bj()
    {
        b = VmapAdBreak.OffsetType.PRE_ROLL;
        c = 0;
        d = false;
        e = false;
        f = false;
        g = null;
        h = null;
        i = null;
        j = null;
        k = null;
        l = null;
        m = false;
    }

    static List a(bj bj1, List list)
    {
        bj1.i = list;
        return list;
    }

    static List b(bj bj1, List list)
    {
        bj1.j = list;
        return list;
    }

    static List c(bj bj1, List list)
    {
        bj1.k = list;
        return list;
    }

    public final VmapAdBreak a()
    {
        String s;
        String s1;
        VmapAdBreak.OffsetType offsettype;
        int i1;
        boolean flag;
        boolean flag1;
        boolean flag2;
        if (!TextUtils.isEmpty(a))
        {
            s = a;
        } else
        {
            s = (new StringBuilder("_INTERNAL_")).append(String.valueOf(SystemClock.currentThreadTimeMillis())).toString();
        }
        offsettype = b;
        i1 = c;
        flag = d;
        flag1 = e;
        flag2 = f;
        if (g == null)
        {
            s1 = "";
        } else
        {
            s1 = g;
        }
        return new VmapAdBreak(offsettype, i1, flag, flag1, flag2, s, s1, h, i, j, k, l, m, null);
    }

    public final bj a(int i1)
    {
        c = i1;
        return this;
    }

    public final bj a(TrackingPingAuthenticationSettings trackingpingauthenticationsettings)
    {
        l = trackingpingauthenticationsettings;
        return this;
    }

    public final bj a(VastAd vastad)
    {
        if (h == null)
        {
            h = new ArrayList();
        }
        h.add(vastad);
        return this;
    }

    public final bj a(VmapAdBreak.OffsetType offsettype)
    {
        b = offsettype;
        return this;
    }

    public final bj a(VmapAdBreak.TrackingEventType trackingeventtype, Uri uri)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(trackingeventtype);
        com.google.android.apps.youtube.common.fromguava.c.a(uri);
        switch (bi.a[trackingeventtype.ordinal()])
        {
        default:
            return this;

        case 1: // '\001'
            if (i == null)
            {
                i = new ArrayList();
            }
            i.add(uri);
            return this;

        case 2: // '\002'
            if (j == null)
            {
                j = new ArrayList();
            }
            j.add(uri);
            return this;

        case 3: // '\003'
            break;
        }
        if (k == null)
        {
            k = new ArrayList();
        }
        k.add(uri);
        return this;
    }

    public final bj a(String s)
    {
        a = s;
        return this;
    }

    public final bj a(List list)
    {
        h = list;
        return this;
    }

    public final bj a(boolean flag)
    {
        d = flag;
        return this;
    }

    public final bj b(String s)
    {
        g = s;
        return this;
    }

    public final bj b(boolean flag)
    {
        e = flag;
        return this;
    }

    public Object build()
    {
        return a();
    }

    public final bj c(boolean flag)
    {
        f = flag;
        return this;
    }

    public final bj d(boolean flag)
    {
        m = flag;
        return this;
    }
}
