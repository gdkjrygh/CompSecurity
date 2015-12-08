// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.commerce.ad.url;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import android.widget.Toast;
import com.jiubang.commerce.ad.f;
import com.jiubang.commerce.utils.j;

// Referenced classes of package com.jiubang.commerce.ad.url:
//            c, j, AdUrlPreParseLoadingActivity

class g
    implements c
{

    final AdUrlPreParseLoadingActivity a;

    g(AdUrlPreParseLoadingActivity adurlpreparseloadingactivity)
    {
        a = adurlpreparseloadingactivity;
        super();
    }

    public void a(Context context, int i, String s, String s1, String s2, String s3, long l, boolean flag)
    {
        if (j.a)
        {
            j.a("Ad_SDK", (new StringBuilder()).append("AdRedirectLoadingActivity.onExecuteTaskComplete(").append(i).append(", ").append(s1).append(", ").append(s3).append(", ").append(l).append(", ").append(flag).append(")").toString());
        }
        j.a(context).a(AdUrlPreParseLoadingActivity.c(a), AdUrlPreParseLoadingActivity.d(a), s1);
        if (AdUrlPreParseLoadingActivity.a(a) == null || a.isFinishing())
        {
            a.finish();
            return;
        }
        AdUrlPreParseLoadingActivity.a(a).removeCallbacks(AdUrlPreParseLoadingActivity.e(a));
        if (i == 18)
        {
            Toast.makeText(context, f.a(context).e("desksetting_net_error"), 1).show();
        } else
        if (i == 16 && !TextUtils.isEmpty(s1))
        {
            com.jiubang.commerce.utils.g.a(a, s1, com.jiubang.commerce.ad.url.AdUrlPreParseLoadingActivity.f(a), flag);
        } else
        {
            AdUrlPreParseLoadingActivity.b(a);
        }
        a.finish();
    }

    public void a(Context context, String s, String s1, boolean flag)
    {
        if (j.a)
        {
            j.a("Ad_SDK", (new StringBuilder()).append("AdRedirectLoadingActivity.onRequestTimeOut(").append(context).append(", ").append(s).append(", ").append(flag).append(")").toString());
        }
        AdUrlPreParseLoadingActivity.b(a);
    }
}
