// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.surveys;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.Button;

public class FadeOnPressButton extends Button
{

    private boolean mIsFaded;

    public FadeOnPressButton(Context context)
    {
        super(context);
    }

    public FadeOnPressButton(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public FadeOnPressButton(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    private void setAlphaBySDK(float f)
    {
        setAlpha(f);
    }

    protected void drawableStateChanged()
    {
        int ai[];
        int i;
        boolean flag;
        int j;
        ai = getDrawableState();
        flag = false;
        j = ai.length;
        i = 0;
_L6:
        if (i < j) goto _L2; else goto _L1
_L1:
        i = ((flag) ? 1 : 0);
_L4:
        if (mIsFaded && i == 0)
        {
            setAlphaBySDK(1.0F);
            mIsFaded = true;
        }
        super.drawableStateChanged();
        return;
_L2:
        if (ai[i] != 0x10100a7)
        {
            break; /* Loop/switch isn't completed */
        }
        if (!mIsFaded)
        {
            setAlphaBySDK(0.5F);
        }
        i = 1;
        if (true) goto _L4; else goto _L3
_L3:
        i++;
        if (true) goto _L6; else goto _L5
_L5:
    }
}
