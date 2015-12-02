// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.mobilemessage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.LinearLayout;

public class NoChildTouchLinearLayout extends LinearLayout
{

    public NoChildTouchLinearLayout(Context context)
    {
        super(context);
    }

    public NoChildTouchLinearLayout(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public NoChildTouchLinearLayout(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionevent)
    {
        return true;
    }
}
