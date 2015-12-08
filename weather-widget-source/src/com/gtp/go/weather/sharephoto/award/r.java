// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.go.weather.sharephoto.award;

import android.app.Activity;
import android.content.SharedPreferences;
import com.gau.go.launcherex.gowidget.framework.GoWidgetApplication;
import com.gtp.go.weather.sharephoto.b.d;
import com.jiubang.core.b.a;
import java.util.List;

// Referenced classes of package com.gtp.go.weather.sharephoto.award:
//            s, k, c, o

public class r
{

    private Activity a;
    private SharedPreferences b;
    private List c;
    private d d;
    private k e;
    private boolean f;
    private final o g = new s(this);

    public r(Activity activity, k k1)
    {
        f = false;
        a = activity;
        e = k1;
        e.a(g);
        b = GoWidgetApplication.c(a.getApplicationContext()).a();
    }

    static d a(r r1, d d1)
    {
        r1.d = d1;
        return d1;
    }

    static void a(r r1)
    {
        r1.d();
    }

    static void a(r r1, List list)
    {
        r1.a(list);
    }

    private void a(List list)
    {
        if (list != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        int i = list.size() - 1;
_L5:
        d d1;
        if (i < 0)
        {
            break MISSING_BLOCK_LABEL_66;
        }
        d1 = (d)list.get(i);
        if (d1.j() != 0) goto _L4; else goto _L3
_L3:
        list = d1;
_L6:
        if (list != null && e != null)
        {
            e.a(true, list);
            return;
        }
          goto _L1
_L4:
        i--;
          goto _L5
        list = null;
          goto _L6
    }

    static List b(r r1, List list)
    {
        r1.c = list;
        return list;
    }

    private void d()
    {
        if (!f && d != null && c != null)
        {
            String s1 = (new StringBuilder()).append("key_prefix_notice_user_award_by_dialog").append(d.a()).toString();
            if (!b.getBoolean(s1, false))
            {
                android.content.SharedPreferences.Editor editor = b.edit();
                editor.putBoolean(s1, true);
                editor.commit();
                (new c(a)).a(d, c);
                return;
            }
        }
    }

    public void a()
    {
        f = true;
    }

    public void b()
    {
        f = false;
        d();
    }

    public void c()
    {
        e = null;
    }
}
