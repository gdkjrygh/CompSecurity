// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.view;

import android.content.ContentResolver;
import com.jiubang.core.c.j;
import java.lang.ref.WeakReference;

// Referenced classes of package com.gau.go.launcherex.gowidget.weather.view:
//            AppListActivity

class o extends j
{

    private WeakReference a;

    public o(ContentResolver contentresolver, AppListActivity applistactivity)
    {
        super(contentresolver);
        a = new WeakReference(applistactivity);
    }

    protected void a(int i, Object obj, int k)
    {
        AppListActivity applistactivity = (AppListActivity)a.get();
        if (applistactivity != null)
        {
            AppListActivity.a(applistactivity, i, obj, k);
        }
    }
}
