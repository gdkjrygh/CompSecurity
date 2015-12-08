// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.statistics;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.gau.go.launcherex.gowidget.weather.model.FeedbackBean;
import com.gau.go.launcherex.gowidget.weather.service.NotifyService;

// Referenced classes of package com.gau.go.launcherex.gowidget.statistics:
//            e, f

public class c
{

    private final Context a;

    public c(Context context)
    {
        a = context.getApplicationContext();
    }

    static Context a(c c1)
    {
        return c1.a;
    }

    public static void a(Context context, int i, Bundle bundle)
    {
        Intent intent = new Intent(context, com/gau/go/launcherex/gowidget/weather/service/NotifyService);
        Bundle bundle1 = new Bundle();
        bundle1.putInt("notify_request", 36);
        bundle1.putInt("key_intent_code", i);
        if (bundle != null)
        {
            bundle1.putBundle("key_intent_extras", bundle);
        }
        intent.putExtras(bundle1);
        context.startService(intent);
    }

    public void a(Intent intent)
    {
        intent = intent.getExtras();
        switch (intent.getInt("key_intent_code", -1))
        {
        default:
            return;

        case 1: // '\001'
            (new e(this, null)).execute(new Void[0]);
            return;

        case 2: // '\002'
            intent = (FeedbackBean)intent.getBundle("key_intent_extras").getParcelable("upload_statistics_data_file_2_extra_feedback_bean");
            break;
        }
        (new f(this, null)).execute(new FeedbackBean[] {
            intent
        });
    }
}
