// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Transformation;

// Referenced classes of package com.whatsapp:
//            App, a1n

class av extends Animation
{

    final View a;
    final a1n b;
    final int c;
    final int d;

    av(a1n a1n, View view, int i, int j)
    {
        b = a1n;
        a = view;
        d = i;
        c = j;
        super();
    }

    protected void applyTransformation(float f, Transformation transformation)
    {
label0:
        {
            if (f == 1.0F)
            {
                a.getLayoutParams().height = -2;
                if (App.am == 0)
                {
                    break label0;
                }
            }
            a.getLayoutParams().height = d + (int)((float)(c - d) * f);
        }
        a.requestLayout();
    }

    public boolean willChangeBounds()
    {
        return true;
    }
}
