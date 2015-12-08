// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.recommendvip;

import android.app.Dialog;

// Referenced classes of package com.go.weatherex.recommendvip:
//            RecommendVipActivity

class f
    implements Runnable
{

    final RecommendVipActivity a;

    f(RecommendVipActivity recommendvipactivity)
    {
        a = recommendvipactivity;
        super();
    }

    public void run()
    {
        if (!a.isFinishing())
        {
            RecommendVipActivity.g(a).dismiss();
        }
    }
}
