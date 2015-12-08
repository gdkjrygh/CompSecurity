// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.go.weather.coupon.view;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.gtp.go.weather.coupon.b.b;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.gtp.go.weather.coupon.view:
//            CouponsActivity, k

class q extends BroadcastReceiver
{

    final CouponsActivity a;

    q(CouponsActivity couponsactivity)
    {
        a = couponsactivity;
        super();
    }

    public void onReceive(Context context, Intent intent)
    {
        int i;
        i = 0;
        if (intent != null)
        {
            context = intent.getAction();
        } else
        {
            context = null;
        }
        break MISSING_BLOCK_LABEL_12;
        boolean flag;
        while (!flag) 
        {
            do
            {
                return;
            } while (TextUtils.isEmpty(context) || !context.equals("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_COUPON_DELETE"));
            context = intent.getLongArrayExtra("extra_coupon_delete_id");
            flag = i;
            if (context == null)
            {
                continue;
            }
            flag = i;
            if (context.length <= 0)
            {
                continue;
            }
            i = 0;
            boolean flag1;
            for (flag = false; i < context.length; flag = flag1)
            {
                long l = context[i];
                intent = CouponsActivity.c(a).iterator();
                do
                {
                    flag1 = flag;
                    if (!intent.hasNext())
                    {
                        break;
                    }
                    b b1 = (b)intent.next();
                    if (l != b1.b())
                    {
                        continue;
                    }
                    b1.c(false);
                    flag1 = true;
                    break;
                } while (true);
                i++;
            }

        }
        CouponsActivity.g(a).notifyDataSetChanged();
        return;
    }
}
