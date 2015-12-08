// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.commerce.ad.url;

import android.content.Context;
import android.text.TextUtils;
import android.widget.Toast;
import com.jiubang.commerce.ad.f;
import com.jiubang.commerce.utils.g;
import com.jiubang.commerce.utils.j;

// Referenced classes of package com.jiubang.commerce.ad.url:
//            c, j, l

final class m
    implements c
{

    m()
    {
    }

    public void a(Context context, int i, String s, String s1, String s2, String s3, long l1, boolean flag)
    {
        if (j.a)
        {
            j.a("Ad_SDK", (new StringBuilder()).append("AppDetailsJumpUtil.onExecuteTaskComplete(").append(i).append(", ").append(s1).append(", ").append(s3).append(", ").append(l1).append(", ").append(flag).append(")").toString());
        }
        j.a(context).a(s, s2, s1);
        if (i == 18)
        {
            Toast.makeText(context, f.a(context).e("desksetting_net_error"), 1).show();
        } else
        if (System.currentTimeMillis() - l1 <= l.a)
        {
            if (i == 16 && !TextUtils.isEmpty(s1))
            {
                g.a(context, s1, true, flag);
                return;
            }
            if (!TextUtils.isEmpty(s2))
            {
                s3 = s2;
            }
            l.a(context, s3, flag);
            return;
        }
    }

    public void a(Context context, String s, String s1, boolean flag)
    {
        if (j.a)
        {
            j.a("Ad_SDK", (new StringBuilder()).append("AppDetailsJumpUtil.onRequestTimeOut(").append(context).append(", ").append(s).append(", ").append(s1).append(", ").append(flag).append(")").toString());
        }
        if (!TextUtils.isEmpty(s1))
        {
            s = s1;
        }
        l.a(context, s, flag);
    }
}
