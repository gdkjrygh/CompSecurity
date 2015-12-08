// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.util;

import android.content.Context;
import android.content.Intent;
import com.gtp.go.weather.sharephoto.photo.a;
import java.util.ArrayList;

// Referenced classes of package com.gau.go.launcherex.gowidget.weather.util:
//            f

class h
    implements a
{

    final ArrayList a;
    final int b;
    final String c;
    final f d;

    h(f f1, ArrayList arraylist, int i, String s)
    {
        d = f1;
        a = arraylist;
        b = i;
        c = s;
        super();
    }

    public void a(Integer integer, Object obj)
    {
        integer = new Intent("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_DELETE_CITY");
        integer.putStringArrayListExtra("city_code_list", a);
        integer.putExtra("city_index", b);
        integer.putExtra("city_code", c);
        f.b(d).sendBroadcast(integer);
    }

    public volatile void a(Object obj, Object obj1)
    {
        a((Integer)obj, obj1);
    }
}
