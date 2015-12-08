// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.setting;

import android.widget.Toast;
import com.gau.go.launcherex.gowidget.statistics.w;
import com.gau.go.launcherex.gowidget.weather.globalview.c;

// Referenced classes of package com.go.weatherex.setting:
//            ad

class af
    implements c
{

    final String a;
    final ad b;

    af(ad ad1, String s)
    {
        b = ad1;
        a = s;
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
                    if (!w.f(b.getActivity()).equals("200"))
                    {
                        break label0;
                    }
                    String as[];
                    try
                    {
                        as = a.split("\\|\\|");
                    }
                    catch (Exception exception)
                    {
                        exception.printStackTrace();
                        exception = null;
                    }
                    if (as != null && as.length == 2)
                    {
                        if (!w.s(b.getActivity()))
                        {
                            break label1;
                        }
                        ad.a(b, as[0]);
                    }
                }
                return;
            }
            ad.b(b, a);
            Toast.makeText(b.getActivity(), 0x7f08026a, 0).show();
            return;
        }
        ad.b(b, a);
        Toast.makeText(b.getActivity(), 0x7f08026a, 0).show();
    }
}
