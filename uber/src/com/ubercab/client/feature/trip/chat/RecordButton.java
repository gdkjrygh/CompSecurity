// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.trip.chat;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import fum;

public class RecordButton extends ImageView
    implements android.view.View.OnTouchListener
{

    private static final int b[] = {
        0x7f010099
    };
    private static final int c[] = {
        0x7f01009a
    };
    int a;
    private final Rect d;
    private fum e;

    public RecordButton(Context context)
    {
        this(context, null);
    }

    public RecordButton(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public RecordButton(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        a = 4;
        d = new Rect();
        setOnTouchListener(this);
    }

    private void a(int i)
    {
        if (a != i)
        {
            a = i;
            refreshDrawableState();
            if (e != null)
            {
                e.a(a);
                return;
            }
        }
    }

    private boolean a(View view, MotionEvent motionevent)
    {
        view.getHitRect(d);
        float f = motionevent.getX();
        float f1 = motionevent.getY();
        view = d;
        int i = d.left;
        int j = Math.round(f);
        int k = d.top;
        return view.contains(j + i, Math.round(f1) + k);
    }

    public final void a(fum fum1)
    {
        e = fum1;
    }

    public int[] onCreateDrawableState(int i)
    {
        int ai[];
        if (a != 3 && a != 1 && a != 2)
        {
            break MISSING_BLOCK_LABEL_76;
        }
        ai = super.onCreateDrawableState(i + 1);
        if (a != 3 && a != 1) goto _L2; else goto _L1
_L1:
        mergeDrawableStates(ai, b);
_L4:
        return ai;
_L2:
        if (a != 2) goto _L4; else goto _L3
_L3:
        mergeDrawableStates(ai, c);
        return ai;
        return super.onCreateDrawableState(i);
    }

    public boolean onTouch(View view, MotionEvent motionevent)
    {
        motionevent.getActionMasked();
        JVM INSTR tableswitch 0 2: default 32
    //                   0 34
    //                   1 72
    //                   2 41;
           goto _L1 _L2 _L3 _L4
_L1:
        return true;
_L2:
        a(3);
        return true;
_L4:
        if (a(view, motionevent))
        {
            if (a == 2)
            {
                a(1);
                return true;
            }
        } else
        {
            a(2);
            return true;
        }
          goto _L1
_L3:
        byte byte0;
        if (a(view, motionevent))
        {
            byte0 = 4;
        } else
        {
            byte0 = 5;
        }
        a(byte0);
        return true;
    }

}
