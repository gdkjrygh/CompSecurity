// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.push.internal.vendor.baidu;

import android.content.Context;
import android.content.Intent;
import android.support.v4.content.LocalBroadcastManager;
import android.text.TextUtils;
import com.baidu.android.pushservice.PushMessageReceiver;
import hbb;
import hbd;
import java.util.List;

// Referenced classes of package com.ubercab.push.internal.vendor.baidu:
//            BaiduIntentService

public class BaiduPushMessageReceiver extends PushMessageReceiver
{

    public BaiduPushMessageReceiver()
    {
    }

    private static void a(Context context, String s)
    {
        context.startService(BaiduIntentService.a(context, s));
    }

    public void onBind(Context context, int i, String s, String s1, String s2, String s3)
    {
        if (i != 0)
        {
            s2 = null;
        }
        s = hbd.a(s2);
        LocalBroadcastManager.getInstance(context).sendBroadcast(s);
    }

    public void onDelTags(Context context, int i, List list, List list1, String s)
    {
    }

    public void onListTags(Context context, int i, List list, String s)
    {
    }

    public void onMessage(Context context, String s, String s1)
    {
        if (!TextUtils.isEmpty(s1))
        {
            s = s1;
        }
        a(context, s);
    }

    public void onNotificationArrived(Context context, String s, String s1, String s2)
    {
        a(context, s2);
    }

    public void onNotificationClicked(Context context, String s, String s1, String s2)
    {
        s = new Intent("com.ubercab.push.ACTION_CLICK");
        s1 = hbb.a(s2);
        if (s1 != null)
        {
            s.putExtras(s1);
        }
        context.sendBroadcast(s);
    }

    public void onSetTags(Context context, int i, List list, List list1, String s)
    {
    }

    public void onUnbind(Context context, int i, String s)
    {
        boolean flag;
        if (i == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        s = hbd.a(flag);
        LocalBroadcastManager.getInstance(context).sendBroadcast(s);
    }
}
