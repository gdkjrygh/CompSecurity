// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.wmui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.ImageButton;

// Referenced classes of package com.walmart.android.wmui:
//            NumberPicker

public class NumberPickerButton extends ImageButton
{

    private NumberPicker mNumberPicker;

    public NumberPickerButton(Context context)
    {
        super(context);
    }

    public NumberPickerButton(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public NumberPickerButton(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    private void cancelLongpress()
    {
        if (0x7f100211 == getId())
        {
            mNumberPicker.cancelIncrement();
        } else
        if (0x7f10020f == getId())
        {
            mNumberPicker.cancelDecrement();
            return;
        }
    }

    private void cancelLongpressIfRequired(MotionEvent motionevent)
    {
        if (motionevent.getAction() == 3 || motionevent.getAction() == 1)
        {
            cancelLongpress();
        }
    }

    public boolean onKeyUp(int i, KeyEvent keyevent)
    {
        if (i == 23 || i == 66)
        {
            cancelLongpress();
        }
        return super.onKeyUp(i, keyevent);
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        cancelLongpressIfRequired(motionevent);
        return super.onTouchEvent(motionevent);
    }

    public boolean onTrackballEvent(MotionEvent motionevent)
    {
        cancelLongpressIfRequired(motionevent);
        return super.onTrackballEvent(motionevent);
    }

    public void setNumberPicker(NumberPicker numberpicker)
    {
        mNumberPicker = numberpicker;
    }
}
