// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.recommendvip;

import android.app.Dialog;
import android.view.View;

// Referenced classes of package com.go.weatherex.recommendvip:
//            RecommendVipActivity

class c
    implements android.view.View.OnClickListener
{

    final RecommendVipActivity a;

    c(RecommendVipActivity recommendvipactivity)
    {
        a = recommendvipactivity;
        super();
    }

    public void onClick(View view)
    {
        RecommendVipActivity.c(a).dismiss();
    }
}
