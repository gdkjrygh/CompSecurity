// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.app.Activity;
import android.content.Context;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.RelativeLayout;

// Referenced classes of package com.whatsapp:
//            fe, rl

class b extends RelativeLayout
{

    final fe a;
    int b;

    protected void onLayout(boolean flag, int i, int j, int k, int l)
    {
        super.onLayout(flag, i, j, k, l);
        i = fe.a(a).getWindowManager().getDefaultDisplay().getOrientation();
        if (b != -1 && b != i)
        {
            fe.b(a).post(new rl(this));
        }
        b = i;
    }

    (fe fe1, Context context)
    {
        a = fe1;
        super(context);
        b = -1;
    }
}
