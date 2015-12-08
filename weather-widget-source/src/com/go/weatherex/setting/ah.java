// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.setting;

import android.app.ProgressDialog;
import android.content.SharedPreferences;
import android.os.AsyncTask;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.widget.Toast;
import com.gau.go.launcherex.gowidget.statistics.w;
import com.gau.go.launcherex.gowidget.statistics.x;
import com.gau.go.launcherex.gowidget.weather.b.ab;

// Referenced classes of package com.go.weatherex.setting:
//            ad, ae

class ah extends AsyncTask
{

    String a;
    String b;
    int c;
    final ad d;

    private ah(ad ad1)
    {
        d = ad1;
        super();
        a = "";
        c = 1;
    }

    ah(ad ad1, ae ae)
    {
        this(ad1);
    }

    protected transient String a(String as[])
    {
        a = d.c();
        c = d.d();
        return ab.a(d.getActivity().getApplicationContext()).a(2, a, c, 2);
    }

    protected void a(String s)
    {
label0:
        {
label1:
            {
                super.onPostExecute(s);
                if (!ad.a(d) && ad.b(d) != null)
                {
                    ad.b(d).dismiss();
                }
                if (ad.c(d) && !ad.a(d))
                {
                    if (s == null)
                    {
                        break label0;
                    }
                    s = x.a(s);
                    if (((x) (s)).a != -1)
                    {
                        break label1;
                    }
                    Toast.makeText(d.getActivity(), 0x7f080268, 0).show();
                }
                return;
            }
            if (((x) (s)).a == 2 || ((x) (s)).a == 3 && ((x) (s)).g > 0 && ((x) (s)).g != w.e(d.getActivity()))
            {
                b = ((x) (s)).c;
                ad.a(d, ((x) (s)).b, b);
                ad.d(d).edit().putBoolean("key_has_new_version", true).commit();
                ad.e(d).setVisibility(0);
                return;
            } else
            {
                ad.d(d).edit().putBoolean("key_has_new_version", false).commit();
                ad.e(d).setVisibility(4);
                Toast.makeText(d.getActivity(), 0x7f080269, 0).show();
                return;
            }
        }
        Toast.makeText(d.getActivity(), 0x7f080268, 0).show();
    }

    protected Object doInBackground(Object aobj[])
    {
        return a((String[])aobj);
    }

    protected void onPostExecute(Object obj)
    {
        a((String)obj);
    }

    protected void onPreExecute()
    {
        super.onPreExecute();
        ad.a(d, true);
        if (!ad.a(d) && ad.b(d) != null)
        {
            ad.b(d).show();
        }
    }
}
