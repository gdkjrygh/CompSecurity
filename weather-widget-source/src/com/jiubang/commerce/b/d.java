// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.commerce.b;

import android.content.Context;
import android.text.TextUtils;
import com.jiubang.commerce.ad.e.t;

// Referenced classes of package com.jiubang.commerce.b:
//            a, e

public class d extends a
{

    protected static void a(Context context, int i, String s, String s1, int j, String s2, String s3, String s4, 
            String s5, String s6)
    {
        if (TextUtils.isEmpty(s1))
        {
            return;
        } else
        {
            (new Thread(new e(t.i(), i, s, s1, j, s2, s3, s4, s5, s6, context))).start();
            return;
        }
    }
}
