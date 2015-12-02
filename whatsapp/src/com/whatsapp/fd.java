// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Transformation;
import com.whatsapp.util.p;

// Referenced classes of package com.whatsapp:
//            a1g, App, dw

class fd extends p
{

    final boolean h;
    final View i;
    final dw j;
    final View k;
    private boolean l;
    final View m;

    public fd(dw dw, View view, View view1, View view2, boolean flag)
    {
        j = dw;
        k = view;
        m = view1;
        i = view2;
        h = flag;
        super(0.0F, 360F, view.getWidth() / 2, view.getHeight() / 2, a1g.a().g * 200F, false);
        setDuration(1000L);
        setInterpolator(new AccelerateDecelerateInterpolator());
    }

    protected void applyTransformation(float f, Transformation transformation)
    {
label0:
        {
            super.applyTransformation(f, transformation);
            float f1 = g;
            int i1 = (int)(f1 + (c - f1) * f) % 360;
            if (i1 > 90 && i1 < 270)
            {
                if (l)
                {
                    break label0;
                }
                l = true;
                m.setVisibility(4);
                i.setVisibility(4);
                if (App.am == 0)
                {
                    break label0;
                }
            }
            if (l)
            {
                l = false;
                m.setVisibility(0);
                if (h)
                {
                    i.setVisibility(0);
                }
            }
        }
    }
}
