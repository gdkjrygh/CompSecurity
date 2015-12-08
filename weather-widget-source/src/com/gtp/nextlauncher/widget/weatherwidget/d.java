// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.nextlauncher.widget.weatherwidget;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.gau.go.launcherex.gowidget.weather.util.a;
import com.gau.go.launcherex.gowidget.weather.util.r;
import com.gau.go.launcherex.gowidget.weather.view.AppListActivity;
import java.util.ArrayList;
import java.util.Iterator;

public class d
{

    private String a;
    private a b;

    public d()
    {
        b = null;
        b = new a();
    }

    private void a(Context context, int i)
    {
        Intent intent = new Intent(context, com/gau/go/launcherex/gowidget/weather/view/AppListActivity);
        intent.putExtra("calendar_clock_binding_app", i);
        intent.addFlags(0x10000000);
        try
        {
            context.startActivity(intent);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context.printStackTrace();
        }
    }

    void a(Context context)
    {
        if (TextUtils.isEmpty(a)) goto _L2; else goto _L1
_L1:
        Object obj;
        String as[] = a.split("#");
        obj = r.a(context, as[0], as[1]);
        if (obj == null) goto _L2; else goto _L3
_L3:
        context.startActivity(((Intent) (obj)));
_L5:
        return;
        Object obj1;
        obj1;
        ((ActivityNotFoundException) (obj1)).printStackTrace();
_L2:
        obj1 = b.a.iterator();
_L6:
        a a1;
        if (!((Iterator) (obj1)).hasNext())
        {
            break MISSING_BLOCK_LABEL_169;
        }
        a1 = (a)((Iterator) (obj1)).next();
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.setClassName(a1.a(), a1.c());
        if (a1.b())
        {
            intent.addCategory("android.intent.category.LAUNCHER");
        }
        intent.setFlags(0x10000000);
        context.startActivity(intent);
        boolean flag = true;
_L7:
        if (flag) goto _L5; else goto _L4
_L4:
        a(context, 2);
        return;
        obj1;
        ((SecurityException) (obj1)).printStackTrace();
          goto _L2
        Object obj2;
        obj2;
        ((ActivityNotFoundException) (obj2)).printStackTrace();
          goto _L6
        obj2;
        ((SecurityException) (obj2)).printStackTrace();
          goto _L6
        flag = false;
          goto _L7
    }

    public void a(String s)
    {
        a = s;
    }
}
