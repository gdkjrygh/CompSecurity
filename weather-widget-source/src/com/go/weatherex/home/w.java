// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.home;

import android.app.Activity;
import android.widget.Toast;
import com.gau.go.launcherex.gowidget.weather.globalview.c;

// Referenced classes of package com.go.weatherex.home:
//            v

class w
    implements c
{

    final Activity a;
    final String b;
    final v c;

    w(v v1, Activity activity, String s)
    {
        c = v1;
        a = activity;
        b = s;
        super();
    }

    public void a(boolean flag)
    {
label0:
        {
label1:
            {
                if (flag)
                {
                    if (!com.gau.go.launcherex.gowidget.statistics.w.f(a).equals("200"))
                    {
                        break label0;
                    }
                    String as[];
                    try
                    {
                        as = b.split("\\|\\|");
                    }
                    catch (Exception exception)
                    {
                        exception.printStackTrace();
                        exception = null;
                    }
                    if (as != null && as.length == 2)
                    {
                        if (!com.gau.go.launcherex.gowidget.statistics.w.s(a))
                        {
                            break label1;
                        }
                        v.a(c, a, as[0]);
                    }
                }
                return;
            }
            v.b(c, a, b);
            Toast.makeText(a, 0x7f08026a, 0).show();
            return;
        }
        v.b(c, a, b);
        Toast.makeText(a.getApplicationContext(), 0x7f08026a, 0).show();
    }
}
