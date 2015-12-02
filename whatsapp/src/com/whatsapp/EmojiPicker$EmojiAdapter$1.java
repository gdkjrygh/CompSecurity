// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;

// Referenced classes of package com.whatsapp:
//            App, _p, afn

class a extends LinearLayout
{

    final _p a;

    protected void onLayout(boolean flag, int i, int j, int k, int l)
    {
        int i1 = App.am;
        float f = (float)(k - i) / (float)afn.i(a.a);
        k = getChildCount();
        i = 0;
        do
        {
            if (i >= k)
            {
                break;
            }
            float f1 = (float)i * f;
            getChildAt(i).layout((int)f1, 0, (int)(f1 + f), l - j);
            i++;
        } while (i1 == 0);
    }

    (_p _pp, Context context)
    {
        a = _pp;
        super(context);
    }
}
