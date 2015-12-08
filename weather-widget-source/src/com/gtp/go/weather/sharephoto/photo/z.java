// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.go.weather.sharephoto.photo;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.gau.go.launcherex.gowidget.weather.model.WeatherBean;
import com.gau.go.launcherex.gowidget.weather.util.f;
import com.gtp.go.weather.sharephoto.b.g;
import com.jiubang.pla.a.b;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.gtp.go.weather.sharephoto.photo:
//            PhotoActivity, ab, aa, l

class z extends BroadcastReceiver
{

    final PhotoActivity a;

    private z(PhotoActivity photoactivity)
    {
        a = photoactivity;
        super();
    }

    z(PhotoActivity photoactivity, l l)
    {
        this(photoactivity);
    }

    public void onReceive(Context context, Intent intent)
    {
        boolean flag1;
        flag1 = true;
        context = intent.getAction();
        if (!context.equals("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_CHANGE_FAVOUR_OR_BACKCOUNT")) goto _L2; else goto _L1
_L1:
        int i = intent.getIntExtra("extra_change_type", 0);
        if (i != 1) goto _L4; else goto _L3
_L3:
label0:
        {
            long l = intent.getLongExtra("extra_change_photo_id", 0L);
            i = intent.getIntExtra("extra_change_value", 0);
            if (l == 0L || i == 0)
            {
                break label0;
            }
            context = PhotoActivity.o(a).iterator();
            do
            {
                if (!context.hasNext())
                {
                    break label0;
                }
                intent = (g)context.next();
            } while (intent == null || intent.a() != l);
            boolean flag2 = intent.h();
            boolean flag;
            if (i == 1)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag2 != flag)
            {
                if (i == 1)
                {
                    flag = flag1;
                } else
                {
                    flag = false;
                }
                intent.a(flag);
                intent.a(intent.c() + i);
                a.a.notifyDataSetChanged();
            }
        }
_L6:
        return;
_L4:
        if (i == 2)
        {
            return;
        }
        continue; /* Loop/switch isn't completed */
_L2:
        if (context.equals("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_DATA_READY"))
        {
            com.gtp.go.weather.sharephoto.photo.PhotoActivity.f(a).clear();
            context = f.a(a.getApplicationContext()).d();
            intent = new ab(a, null);
            intent.a = a.e().getString(0x7f08047e);
            com.gtp.go.weather.sharephoto.photo.PhotoActivity.f(a).add(intent);
            context = context.iterator();
            do
            {
                if (!context.hasNext())
                {
                    break;
                }
                intent = (WeatherBean)context.next();
                if (intent != null)
                {
                    ab ab1 = new ab(a, null);
                    ab1.a = intent.d();
                    ab1.b = intent.c();
                    com.gtp.go.weather.sharephoto.photo.PhotoActivity.f(a).add(ab1);
                }
            } while (true);
            PhotoActivity.p(a).notifyDataSetChanged();
            return;
        }
        if (!context.equals("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_DELETE_USER_PHOTO") || PhotoActivity.i(a) != 2)
        {
            continue; /* Loop/switch isn't completed */
        }
        long l1 = intent.getLongExtra("extra_delete_photo_id", 0L);
        if (l1 == 0L)
        {
            continue; /* Loop/switch isn't completed */
        }
        context = PhotoActivity.o(a).iterator();
        do
        {
            if (!context.hasNext())
            {
                continue; /* Loop/switch isn't completed */
            }
            intent = (g)context.next();
        } while (intent == null || intent.a() != l1 || intent.g() != 1);
        break; /* Loop/switch isn't completed */
        if (true) goto _L6; else goto _L5
_L5:
        PhotoActivity.o(a).remove(intent);
        a.a.notifyDataSetChanged();
        return;
    }
}
