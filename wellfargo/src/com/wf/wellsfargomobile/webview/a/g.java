// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile.webview.a;

import android.content.Intent;
import com.wf.wellsfargomobile.BaseWebViewActivity;
import com.wf.wellsfargomobile.WFApp;

// Referenced classes of package com.wf.wellsfargomobile.webview.a:
//            c, b

public class g extends c
{

    public g()
    {
    }

    public int a()
    {
        return 30;
    }

    public b a(int i, int j, Intent intent, BaseWebViewActivity basewebviewactivity)
    {
        intent = new b();
        switch (j)
        {
        case 7: // '\007'
        case 8: // '\b'
        case 9: // '\t'
        default:
            return intent;

        case 11: // '\013'
            intent.a(false);
            return intent;

        case 10: // '\n'
            intent.a(false);
            WFApp.i();
            basewebviewactivity.depositCheck();
            return intent;

        case 6: // '\006'
            intent.a(false);
            WFApp.i();
            basewebviewactivity.depositCheck();
            return intent;
        }
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
