// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.globaltheme.view.a;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import com.gau.go.launcherex.gowidget.weather.globaltheme.a;
import com.gau.go.launcherex.gowidget.weather.globalview.d;

// Referenced classes of package com.gau.go.launcherex.gowidget.weather.globaltheme.view.a:
//            q

class s
    implements d
{

    final int a;
    final q b;

    s(q q1, int i)
    {
        b = q1;
        a = i;
        super();
    }

    public void a(boolean flag, boolean flag1)
    {
        if (!flag) goto _L2; else goto _L1
_L1:
        a;
        JVM INSTR tableswitch 3 4: default 32
    //                   3 67
    //                   4 77;
           goto _L3 _L4 _L5
_L3:
        if (flag1)
        {
            android.content.SharedPreferences.Editor editor = q.c(b).edit();
            editor.putBoolean("show_widget_tip_dialog", false);
            editor.commit();
        }
        return;
_L4:
        com.gau.go.launcherex.gowidget.weather.globaltheme.view.a.q.a(b);
        continue; /* Loop/switch isn't completed */
_L5:
        q.b(b);
        continue; /* Loop/switch isn't completed */
_L2:
        if (a == 3 && com.gau.go.launcherex.gowidget.weather.globaltheme.a.a(b.a))
        {
            Intent intent = new Intent("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_THEME_SCROLL_CHANGE");
            intent.putExtra("extra_theme_change_type", 2);
            b.a.sendBroadcast(intent);
        }
        if (true) goto _L3; else goto _L6
_L6:
    }
}
