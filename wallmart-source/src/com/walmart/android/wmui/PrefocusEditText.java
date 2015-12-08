// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.wmui;

import android.content.Context;
import android.graphics.Rect;
import android.os.Handler;
import android.util.AttributeSet;
import android.widget.EditText;

public class PrefocusEditText extends EditText
{
    public static interface OnPreFocusListener
    {

        public abstract void onPreFocus(boolean flag);
    }


    private OnPreFocusListener mOnPreFocusListener;

    public PrefocusEditText(Context context)
    {
        super(context);
    }

    public PrefocusEditText(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public PrefocusEditText(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    protected void onFocusChanged(final boolean focused, final int direction, final Rect previouslyFocusedRect)
    {
        if (mOnPreFocusListener != null)
        {
            mOnPreFocusListener.onPreFocus(focused);
            (new Handler()).post(new Runnable() {

                final PrefocusEditText this$0;
                final int val$direction;
                final boolean val$focused;
                final Rect val$previouslyFocusedRect;

                public void run()
                {
                    onFocusChanged(focused, direction, previouslyFocusedRect);
                }

            
            {
                this$0 = PrefocusEditText.this;
                focused = flag;
                direction = i;
                previouslyFocusedRect = rect;
                super();
            }
            });
            return;
        } else
        {
            super.onFocusChanged(focused, direction, previouslyFocusedRect);
            return;
        }
    }

    public void setOnPreFocusListener(OnPreFocusListener onprefocuslistener)
    {
        mOnPreFocusListener = onprefocuslistener;
    }

}
