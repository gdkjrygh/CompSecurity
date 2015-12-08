// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile.webview.a;

import android.content.Intent;
import com.wf.wellsfargomobile.BaseWebViewActivity;
import com.wf.wellsfargomobile.mrdc.e;

// Referenced classes of package com.wf.wellsfargomobile.webview.a:
//            c, b

public class f extends c
{

    public f()
    {
    }

    public int a()
    {
        return 20;
    }

    public b a(int i, int j, Intent intent, BaseWebViewActivity basewebviewactivity)
    {
        b b1 = new b();
        boolean flag;
        if (!e.a(i, j, intent, basewebviewactivity))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        b1.a(flag);
        return b1;
    }

    public int[] b()
    {
        return new int[0];
    }

    public int[] c()
    {
        return new int[0];
    }
}
