// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;

// Referenced classes of package com.whatsapp:
//            App

public class ConversationContentLayout extends RelativeLayout
{

    private boolean a;
    private int b;

    public ConversationContentLayout(Context context)
    {
        super(context);
    }

    public ConversationContentLayout(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public ConversationContentLayout(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    public ConversationContentLayout(Context context, AttributeSet attributeset, int i, int j)
    {
        super(context, attributeset, i, j);
    }

    protected void onLayout(boolean flag, int i, int j, int k, int l)
    {
label0:
        {
            if (a)
            {
                super.onLayout(flag, i, j, k, j + b);
                if (App.am == 0)
                {
                    break label0;
                }
            }
            super.onLayout(flag, i, j, k, l);
        }
    }

    protected void onMeasure(int i, int j)
    {
label0:
        {
            if (a)
            {
                super.onMeasure(i, android.view.View.MeasureSpec.makeMeasureSpec(b, 0x80000000));
                if (App.am == 0)
                {
                    break label0;
                }
            }
            super.onMeasure(i, j);
        }
    }

    public void setFreezeHeight()
    {
        setFreezeHeight(getHeight());
    }

    public void setFreezeHeight(int i)
    {
        if (!a || b != i)
        {
            a = true;
            b = i;
            requestLayout();
        }
    }

    public void setUnfreezeHeight()
    {
        if (a)
        {
            a = false;
            requestLayout();
        }
    }
}
