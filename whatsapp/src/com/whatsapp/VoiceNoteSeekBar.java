// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.SeekBar;

public class VoiceNoteSeekBar extends SeekBar
{

    private int a;
    private MotionEvent b;

    public VoiceNoteSeekBar(Context context)
    {
        super(context);
        a = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    public VoiceNoteSeekBar(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    public VoiceNoteSeekBar(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        a = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        boolean flag = true;
        if (android.os.Build.VERSION.SDK_INT >= 14) goto _L2; else goto _L1
_L1:
        motionevent.getAction();
        JVM INSTR tableswitch 0 3: default 44
    //                   0 52
    //                   1 141
    //                   2 76
    //                   3 141;
           goto _L3 _L4 _L5 _L6 _L5
_L3:
        flag = super.onTouchEvent(motionevent);
_L8:
        return flag;
_L4:
        if (b != null)
        {
            b.recycle();
        }
        b = MotionEvent.obtain(motionevent);
        return true;
_L6:
        if (b != null && Math.abs(motionevent.getX() - b.getX()) > (float)a)
        {
            super.onTouchEvent(b);
            b.recycle();
            b = null;
        }
        if (b != null) goto _L8; else goto _L7
_L7:
        return super.onTouchEvent(motionevent);
_L5:
        if (b != null)
        {
            b.recycle();
            b = null;
        }
        return super.onTouchEvent(motionevent);
_L2:
        return super.onTouchEvent(motionevent);
    }
}
