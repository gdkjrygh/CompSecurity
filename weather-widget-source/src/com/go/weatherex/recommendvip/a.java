// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.recommendvip;

import android.os.Handler;
import android.os.Message;

// Referenced classes of package com.go.weatherex.recommendvip:
//            RecommendVipActivity

class a extends Handler
{

    final RecommendVipActivity a;

    a(RecommendVipActivity recommendvipactivity)
    {
        a = recommendvipactivity;
        super();
    }

    public void handleMessage(Message message)
    {
        if (message.what == 1)
        {
            RecommendVipActivity.a(a, null, a.getString(0x7f08033c));
        }
    }
}
