// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.service.error.a;

import android.content.Context;
import android.text.format.Time;
import com.gau.go.launcherex.gowidget.service.error.model.LocationErrorBean;

// Referenced classes of package com.gau.go.launcherex.gowidget.service.error.a:
//            b

public class a
{

    private Context a;

    public a(Context context)
    {
        a = context;
    }

    static Context a(a a1)
    {
        return a1.a;
    }

    private String a()
    {
        Time time = new Time("Asia/Shanghai");
        time.setToNow();
        return time.format("%Y/%m/%d");
    }

    static String b(a a1)
    {
        return a1.a();
    }

    public void a(LocationErrorBean locationerrorbean)
    {
        (new b(this)).execute(new LocationErrorBean[] {
            locationerrorbean
        });
    }
}
