// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile.webview.a;

import android.content.Intent;
import com.wf.wellsfargomobile.BaseWebViewActivity;

// Referenced classes of package com.wf.wellsfargomobile.webview.a:
//            c, b

public class d extends c
{

    public d()
    {
    }

    public int a()
    {
        return 10;
    }

    public b a(int i, int j, Intent intent, BaseWebViewActivity basewebviewactivity)
    {
        b b1 = new b();
        j;
        JVM INSTR lookupswitch 5: default 60
    //                   1: 133
    //                   3: 63
    //                   4: 77
    //                   14: 215
    //                   15: 98;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
        return b1;
_L3:
        b1.a(false);
        basewebviewactivity.signOff();
        return b1;
_L4:
        b1.a(false);
        basewebviewactivity.setResult(4, null);
        basewebviewactivity.finish();
        return b1;
_L6:
        b1.a(false);
        intent = intent.getStringExtra("returnToUrl");
        if (intent != null && !"".equals(intent))
        {
            basewebviewactivity.loadAbsoluteURL(intent);
            return b1;
        }
          goto _L1
_L2:
        b1.a(false);
        String s = intent.getStringExtra("error_title");
        String s1 = intent.getStringExtra("error_msg");
        j = intent.getIntExtra("message_type", 0x7f0200f9);
        if (i == 10)
        {
            basewebviewactivity.returnWithErrorWithIcon(s, s1, j);
            return b1;
        }
        if (i == 15)
        {
            basewebviewactivity.showDialogBox(s, s1, j);
            return b1;
        } else
        {
            basewebviewactivity.returnWithErrorWithIcon(s, s1, j);
            return b1;
        }
_L5:
        b1.a(false);
        basewebviewactivity.setResult(14, intent);
        basewebviewactivity.finish();
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
