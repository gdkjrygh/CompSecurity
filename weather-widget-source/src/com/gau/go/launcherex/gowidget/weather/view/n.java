// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.view;

import android.os.AsyncTask;
import android.view.View;
import android.widget.BaseAdapter;
import android.widget.ListView;

// Referenced classes of package com.gau.go.launcherex.gowidget.weather.view:
//            AppListActivity, l, j

class n extends AsyncTask
{

    final AppListActivity a;

    private n(AppListActivity applistactivity)
    {
        a = applistactivity;
        super();
    }

    n(AppListActivity applistactivity, j j)
    {
        this(applistactivity);
    }

    protected transient BaseAdapter a(String as[])
    {
        AppListActivity.a(a);
        AppListActivity.a(a, new l(a, AppListActivity.b(a)));
        return AppListActivity.c(a);
    }

    protected void a(BaseAdapter baseadapter)
    {
        if (!a.isFinishing())
        {
            AppListActivity.d(a).setVisibility(8);
            AppListActivity.e(a).setAdapter(baseadapter);
        }
    }

    protected Object doInBackground(Object aobj[])
    {
        return a((String[])aobj);
    }

    protected void onPostExecute(Object obj)
    {
        a((BaseAdapter)obj);
    }
}
