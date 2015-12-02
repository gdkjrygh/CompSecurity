// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.app.Activity;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;

// Referenced classes of package com.whatsapp:
//            cq, a1g, App

class bp
    implements android.view.ViewTreeObserver.OnGlobalLayoutListener
{

    final cq a;

    bp(cq cq1)
    {
        a = cq1;
        super();
    }

    public void onGlobalLayout()
    {
        if (cq.d(a) == null) goto _L2; else goto _L1
_L1:
        int i;
        i = cq.d(a).getHeight();
        int ai[] = new int[2];
        cq.d(a).getLocationOnScreen(ai);
        int j = ai[1] + i;
        Display display = cq.b(a).getWindowManager().getDefaultDisplay();
        int k = display.getWidth();
        a1g a1g1 = a1g.a();
        if ((float)(display.getHeight() - j) < a1g1.g * 128F)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (i == 0) goto _L4; else goto _L3
_L3:
        a.dismiss();
        if (App.am == 0) goto _L5; else goto _L4
_L4:
        i = display.getHeight() - j;
        cq.a(a, i);
_L7:
        a.update(0, j, k, i, true);
_L2:
        return;
_L5:
        i = 0;
        if (true) goto _L7; else goto _L6
_L6:
    }
}
