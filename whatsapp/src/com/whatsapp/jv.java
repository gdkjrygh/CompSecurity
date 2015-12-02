// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.text.TextPaint;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.TextView;

// Referenced classes of package com.whatsapp:
//            App, ak8

class jv
    implements android.view.ViewTreeObserver.OnPreDrawListener
{

    final TextView a;
    final int b;
    final ak8 c;
    final View d;

    jv(ak8 ak8, View view, int i, TextView textview)
    {
        c = ak8;
        d = view;
        b = i;
        a = textview;
        super();
    }

    public boolean onPreDraw()
    {
        int i = App.am;
        int j = d.getWidth();
        if (j > 0)
        {
            d.getViewTreeObserver().removeOnPreDrawListener(this);
            int k = b;
            String s = a.getText().toString();
            float f = a.getTextSize();
            do
            {
                if (f <= 1.0F || a.getPaint().measureText(s) < (float)(j - k * 2) && i == 0)
                {
                    break;
                }
                f--;
                a.setTextSize(f);
            } while (i == 0);
        }
        return true;
    }
}
