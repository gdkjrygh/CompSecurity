// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.util;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.view.View;

// Referenced classes of package com.whatsapp.util:
//            Log

public class b6
    implements android.text.style.LeadingMarginSpan.LeadingMarginSpan2
{

    private int a;
    private View b;
    private int c;

    public b6(int i, int j, View view)
    {
        a = j;
        c = i;
        b = view;
    }

    public void drawLeadingMargin(Canvas canvas, Paint paint, int i, int j, int k, int l, int i1, 
            CharSequence charsequence, int j1, int k1, boolean flag, Layout layout)
    {
label0:
        {
            if (j < 0)
            {
                canvas = (android.widget.RelativeLayout.LayoutParams)b.getLayoutParams();
                paint = canvas.getRules();
                if (paint[11] != -1 || paint[9] != 0)
                {
                    canvas.addRule(11);
                    canvas.addRule(9, 0);
                    b.requestLayout();
                }
                if (!Log.f)
                {
                    break label0;
                }
            }
            canvas = (android.widget.RelativeLayout.LayoutParams)b.getLayoutParams();
            paint = canvas.getRules();
            if (paint[9] != -1 || paint[11] != 0)
            {
                canvas.addRule(9);
                canvas.addRule(11, 0);
                b.requestLayout();
            }
        }
    }

    public int getLeadingMargin(boolean flag)
    {
        if (flag)
        {
            return a;
        } else
        {
            return 0;
        }
    }

    public int getLeadingMarginLineCount()
    {
        return c;
    }
}
