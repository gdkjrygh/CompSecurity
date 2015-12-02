// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.ui.deprecated.view;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;

// Referenced classes of package com.ubercab.ui.deprecated.view:
//            SlidingTabLayout

public class ScrollableSlidingTabLayout extends SlidingTabLayout
{

    private HorizontalScrollView b;

    public ScrollableSlidingTabLayout(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public ScrollableSlidingTabLayout(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        b = new HorizontalScrollView(context);
        addView(b);
        b.setFillViewport(true);
        b.setHorizontalScrollBarEnabled(false);
        b.setOverScrollMode(2);
    }

    protected final ViewGroup a()
    {
        return b;
    }

    protected final void a(View view, int i, int j)
    {
label0:
        {
            int k = view.getLeft() + j;
            if (i <= 0)
            {
                i = k;
                if (j <= 0)
                {
                    break label0;
                }
            }
            i = k - c();
        }
        j = b();
        b.scrollTo(i - j, 0);
    }

    protected final int b()
    {
        return (int)(16F * getResources().getDisplayMetrics().density);
    }
}
