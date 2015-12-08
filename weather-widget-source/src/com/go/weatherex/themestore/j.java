// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.themestore;

import android.os.AsyncTask;
import com.gau.go.launcherex.gowidget.weather.globaltheme.a.d;
import java.util.List;

// Referenced classes of package com.go.weatherex.themestore:
//            i, k

class j extends AsyncTask
{

    final i a;

    j(i l)
    {
        a = l;
        super();
    }

    protected transient Object doInBackground(Object aobj[])
    {
        List list = (List)aobj[0];
        aobj = (List)aobj[1];
        List list1 = i.a(a, "key_record_widget_theme_package_names");
        List list2 = i.a(a, "key_record_background_theme_package_names");
        int l;
        boolean flag;
        boolean flag1;
        if (list1 != null && list2 != null)
        {
            l = i.a(a, list, list1);
            int i1 = i.a(a, ((List) (aobj)), list2);
            flag1 = i.b(a, list, list1);
            flag = i.b(a, ((List) (aobj)), list2);
            l += i1;
        } else
        {
            flag = false;
            flag1 = false;
            l = 0;
        }
        return ((Object) (new Object[] {
            Boolean.valueOf(flag1), Boolean.valueOf(flag), Integer.valueOf(l)
        }));
    }

    protected void onPostExecute(Object obj)
    {
        obj = ((Object) ((Object[])(Object[])obj));
        boolean flag = ((Boolean)obj[0]).booleanValue();
        boolean flag1 = ((Boolean)obj[1]).booleanValue();
        int l = ((Integer)obj[2]).intValue();
        d.a(l);
        if (i.a(a) != null)
        {
            i.a(a).a(((Boolean)obj[0]).booleanValue(), ((Boolean)obj[1]).booleanValue(), l);
        }
        i.b(a);
        if (!flag && !flag1)
        {
            i.a(a, i.a(a, 1), "key_record_widget_theme_package_names");
            i.a(a, i.a(a, 3), "key_record_background_theme_package_names");
        }
    }
}
