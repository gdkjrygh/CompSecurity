// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.trip.dispatch;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import butterknife.ButterKnife;
import com.ubercab.ui.TextView;
import fxu;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CancelView extends LinearLayout
{

    private List a;
    ImageButton mButtonCancel;
    TextView mTextViewCancelMessage;
    ViewGroup mViewGroupCancelMessage;

    public CancelView(Context context)
    {
        super(context);
        a = new CopyOnWriteArrayList();
    }

    public CancelView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a = new CopyOnWriteArrayList();
    }

    public CancelView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        a = new CopyOnWriteArrayList();
    }

    public final void a(fxu fxu1)
    {
        a.add(fxu1);
    }

    public final void a(boolean flag)
    {
        ViewGroup viewgroup = mViewGroupCancelMessage;
        int i;
        if (flag)
        {
            i = 0;
        } else
        {
            i = 8;
        }
        viewgroup.setVisibility(i);
    }

    public final void b(fxu fxu1)
    {
        a.remove(fxu1);
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        ButterKnife.inject(this);
    }

    public boolean onTouchButtonCancel(MotionEvent motionevent)
    {
        motionevent.getAction();
        JVM INSTR tableswitch 0 2: default 32
    //                   0 34
    //                   1 71
    //                   2 108;
           goto _L1 _L2 _L3 _L4
_L1:
        return false;
_L2:
        motionevent = a.iterator();
        while (motionevent.hasNext()) 
        {
            ((fxu)motionevent.next()).a(true);
        }
        continue; /* Loop/switch isn't completed */
_L3:
        motionevent = a.iterator();
        while (motionevent.hasNext()) 
        {
            ((fxu)motionevent.next()).a(false);
        }
        if (true) goto _L1; else goto _L4
_L4:
        Rect rect = new Rect();
        mButtonCancel.getLocalVisibleRect(rect);
        if (!rect.contains((int)motionevent.getX(), (int)motionevent.getY()))
        {
            motionevent = a.iterator();
            while (motionevent.hasNext()) 
            {
                ((fxu)motionevent.next()).a(false);
            }
        }
        if (true) goto _L1; else goto _L5
_L5:
    }
}
