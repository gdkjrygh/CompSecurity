// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.nextlauncher.widget.weatherwidget;

import android.content.ContentResolver;
import android.database.Cursor;
import com.gau.go.launcherex.gowidget.weather.provider.WeatherContentProvider;
import com.jiubang.core.c.j;

// Referenced classes of package com.gtp.nextlauncher.widget.weatherwidget:
//            ClearManager

class c extends j
{

    final ClearManager a;

    public c(ClearManager clearmanager, ContentResolver contentresolver)
    {
        a = clearmanager;
        super(contentresolver);
    }

    protected void a(int i, Object obj, Cursor cursor)
    {
        super.a(i, obj, cursor);
        if (cursor != null && cursor.getCount() > 0)
        {
            for (; cursor.moveToNext(); cursor.getString(0)) { }
        }
    }

    protected void b(int i, Object obj, int k)
    {
        super.b(i, obj, k);
        ClearManager.a(a).a(-1, null, WeatherContentProvider.E, new String[] {
            "city_id"
        }, null, null, null);
    }
}
