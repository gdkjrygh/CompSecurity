// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.systemwidget;

import android.content.AsyncQueryHandler;
import android.content.ContentResolver;
import android.database.Cursor;
import com.gau.go.launcherex.gowidget.weather.provider.WeatherContentProvider;
import java.lang.ref.SoftReference;

// Referenced classes of package com.gau.go.launcherex.gowidget.weather.systemwidget:
//            e

class g extends AsyncQueryHandler
{

    private SoftReference a;

    public g(ContentResolver contentresolver, e e1)
    {
        super(contentresolver);
        a = new SoftReference(e1);
    }

    protected void onQueryComplete(int i, Object obj, Cursor cursor)
    {
        if (cursor == null || a == null) goto _L2; else goto _L1
_L1:
        e e1 = (e)a.get();
        if (e1 != null) goto _L3; else goto _L2
_L2:
        return;
_L3:
        switch (i)
        {
        default:
            return;

        case 1: // '\001'
            e.a(e1, cursor);
            if (obj == null)
            {
                obj = "";
            } else
            {
                obj = (String)obj;
            }
            if (((String) (obj)).equals("need_query_setting"))
            {
                e.a(e1).startQuery(2, null, WeatherContentProvider.g, new String[] {
                    "setting_key", "setting_value"
                }, "setting_key in ('tempUnit', 'calendarType', 'festival', 'dateStyle', 'world_clock', 'windUnit', 'widgt_calendar', 'widgt_clock', 'auto_location', 'app_widget_theme')", null, null);
                return;
            }
            if (((String) (obj)).equals("need_notify_widget"))
            {
                e.b(e1, "Google_play_billing");
                return;
            }
            break;

        case 2: // '\002'
            e.b(e1, cursor);
            e.a(e1, false);
            e1.a = true;
            e.b(e1, "");
            return;

        case 3: // '\003'
            e.a(e1, (String)obj, cursor);
            return;
        }
        if (true) goto _L2; else goto _L4
_L4:
    }
}
