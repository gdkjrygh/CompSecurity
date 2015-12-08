// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.youtube.player.internal;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.youtube.player.internal.b.b;

// Referenced classes of package com.google.android.youtube.player.internal:
//            ah

public final class PlayerViewPlaceHolder extends FrameLayout
{

    private final ProgressBar a;
    private final TextView b;

    public PlayerViewPlaceHolder(Context context)
    {
        super(context, null, com.google.android.youtube.player.internal.b.b.c(context));
        ah ah1 = new ah(context);
        setBackgroundColor(0xff000000);
        a = new ProgressBar(context);
        a.setVisibility(8);
        addView(a, new android.widget.FrameLayout.LayoutParams(-2, -2, 17));
        int i = (int)(10F * context.getResources().getDisplayMetrics().density + 0.5F);
        b = new TextView(context);
        b.setTextAppearance(context, 0x1030046);
        b.setTextColor(-1);
        b.setVisibility(8);
        b.setPadding(i, i, i, i);
        b.setGravity(17);
        b.setText(ah1.a);
        addView(b, new android.widget.FrameLayout.LayoutParams(-2, -2, 17));
    }

    public final void a()
    {
        a.setVisibility(8);
        b.setVisibility(8);
    }

    public final void b()
    {
        a.setVisibility(0);
        b.setVisibility(8);
    }

    public final void c()
    {
        a.setVisibility(8);
        b.setVisibility(0);
    }

    protected final void onMeasure(int i, int j)
    {
        boolean flag = false;
        int i1 = android.view.View.MeasureSpec.getMode(i);
        int j1 = android.view.View.MeasureSpec.getMode(j);
        int k = android.view.View.MeasureSpec.getSize(i);
        int l = android.view.View.MeasureSpec.getSize(j);
        if (i1 != 0x40000000 || j1 != 0x40000000)
        {
            if (i1 == 0x40000000 || i1 == 0x80000000 && j1 == 0)
            {
                l = (int)((float)k / 1.777F);
            } else
            if (j1 == 0x40000000 || j1 == 0x80000000 && i1 == 0)
            {
                k = (int)((float)l * 1.777F);
            } else
            if (i1 == 0x80000000 && j1 == 0x80000000)
            {
                if ((float)l < (float)k / 1.777F)
                {
                    k = (int)((float)l * 1.777F);
                } else
                {
                    l = (int)((float)k / 1.777F);
                }
            } else
            {
                l = 0;
                k = ((flag) ? 1 : 0);
            }
        }
        i = resolveSize(k, i);
        j = resolveSize(l, j);
        super.onMeasure(android.view.View.MeasureSpec.makeMeasureSpec(i, 0x40000000), android.view.View.MeasureSpec.makeMeasureSpec(j, 0x40000000));
    }
}
