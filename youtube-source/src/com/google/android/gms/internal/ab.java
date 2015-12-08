// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.content.res.Resources;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            y, dn, do, db, 
//            bp, bt

public final class ab
    implements y
{

    public ab()
    {
    }

    private static int a(DisplayMetrics displaymetrics, Map map, String s, int i)
    {
        map = (String)map.get(s);
        int j = i;
        if (map != null)
        {
            try
            {
                j = dn.a(displaymetrics, Integer.parseInt(map));
            }
            // Misplaced declaration of an exception variable
            catch (DisplayMetrics displaymetrics)
            {
                com.google.android.gms.internal.do.d((new StringBuilder("Could not parse ")).append(s).append(" in a video GMSG: ").append(map).toString());
                return i;
            }
        }
        return j;
    }

    public final void a(db db1, Map map)
    {
        String s = (String)map.get("action");
        if (s == null)
        {
            com.google.android.gms.internal.do.d("Action missing from video GMSG.");
            return;
        }
        Object obj = db1.c();
        if (obj == null)
        {
            com.google.android.gms.internal.do.d("Could not get ad overlay for a video GMSG.");
            return;
        }
        boolean flag = "new".equalsIgnoreCase(s);
        boolean flag1 = "position".equalsIgnoreCase(s);
        if (flag || flag1)
        {
            db1 = db1.getContext().getResources().getDisplayMetrics();
            int i = a(((DisplayMetrics) (db1)), map, "x", 0);
            int k = a(((DisplayMetrics) (db1)), map, "y", 0);
            int i1 = a(((DisplayMetrics) (db1)), map, "w", -1);
            int j1 = a(((DisplayMetrics) (db1)), map, "h", -1);
            if (flag && ((bp) (obj)).b() == null)
            {
                ((bp) (obj)).b(i, k, i1, j1);
                return;
            } else
            {
                ((bp) (obj)).a(i, k, i1, j1);
                return;
            }
        }
        obj = ((bp) (obj)).b();
        if (obj == null)
        {
            bt.a(db1, "no_video_view", null);
            return;
        }
        if ("click".equalsIgnoreCase(s))
        {
            db1 = db1.getContext().getResources().getDisplayMetrics();
            int j = a(((DisplayMetrics) (db1)), map, "x", 0);
            int l = a(((DisplayMetrics) (db1)), map, "y", 0);
            long l1 = SystemClock.uptimeMillis();
            db1 = MotionEvent.obtain(l1, l1, 0, j, l, 0);
            ((bt) (obj)).a(db1);
            db1.recycle();
            return;
        }
        if ("controls".equalsIgnoreCase(s))
        {
            db1 = (String)map.get("enabled");
            if (db1 == null)
            {
                com.google.android.gms.internal.do.d("Enabled parameter missing from controls video GMSG.");
                return;
            } else
            {
                ((bt) (obj)).a(Boolean.parseBoolean(db1));
                return;
            }
        }
        if ("currentTime".equalsIgnoreCase(s))
        {
            db1 = (String)map.get("time");
            if (db1 == null)
            {
                com.google.android.gms.internal.do.d("Time parameter missing from currentTime video GMSG.");
                return;
            }
            try
            {
                ((bt) (obj)).a((int)(Float.parseFloat(db1) * 1000F));
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Map map)
            {
                com.google.android.gms.internal.do.d((new StringBuilder("Could not parse time parameter from currentTime video GMSG: ")).append(db1).toString());
            }
            return;
        }
        if ("hide".equalsIgnoreCase(s))
        {
            ((bt) (obj)).setVisibility(4);
            return;
        }
        if ("load".equalsIgnoreCase(s))
        {
            ((bt) (obj)).b();
            return;
        }
        if ("pause".equalsIgnoreCase(s))
        {
            ((bt) (obj)).c();
            return;
        }
        if ("play".equalsIgnoreCase(s))
        {
            ((bt) (obj)).d();
            return;
        }
        if ("show".equalsIgnoreCase(s))
        {
            ((bt) (obj)).setVisibility(0);
            return;
        }
        if ("src".equalsIgnoreCase(s))
        {
            ((bt) (obj)).a((String)map.get("src"));
            return;
        } else
        {
            com.google.android.gms.internal.do.d((new StringBuilder("Unknown video action: ")).append(s).toString());
            return;
        }
    }
}
