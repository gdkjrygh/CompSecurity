// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.commerce.ad.g;

import android.content.Context;
import android.text.TextUtils;
import com.jiubang.commerce.database.a.e;
import com.jiubang.commerce.utils.j;
import java.util.ArrayList;
import java.util.List;

public class a
{

    public static void a(Context context, String s)
    {
        if (context != null && !TextUtils.isEmpty(s))
        {
            ArrayList arraylist = new ArrayList();
            arraylist.add(new e(s, System.currentTimeMillis()));
            boolean flag = com.jiubang.commerce.database.b.e.a(context).a(arraylist);
            if (j.a)
            {
                j.a("Ad_SDK", (new StringBuilder()).append("ActivationGuideNotification.saveToWaitActivationList(").append(flag).append(", ").append(s).append(")").toString());
                return;
            }
        }
    }
}
