// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.item.view;

import android.content.Context;
import android.transition.ChangeBounds;
import android.transition.TransitionManager;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.webkit.WebView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.walmart.android.utils.ViewUtil;

public class ModuleView extends LinearLayout
{
    public static class Builder
    {

        private final ModuleView mModuleView;

        public ModuleView build()
        {
            return mModuleView;
        }

        public Builder setContent(View view)
        {
            mModuleView.setContent(view);
            if (view instanceof WebView)
            {
                view.setOnTouchListener(new android.view.View.OnTouchListener() {

                    final Builder this$0;

                    public boolean onTouch(View view, MotionEvent motionevent)
                    {
                        return mModuleView.onTouchEvent(motionevent);
                    }

            
            {
                this$0 = Builder.this;
                super();
            }
                });
            }
            return this;
        }

        public Builder setContent(CharSequence charsequence)
        {
            mModuleView.setContent(charsequence);
            return this;
        }

        public Builder setTitle(int i)
        {
            mModuleView.setTitle(i);
            return this;
        }

        public Builder setTitle(CharSequence charsequence)
        {
            mModuleView.setTitle(charsequence);
            return this;
        }


        public Builder(Context context)
        {
            mModuleView = new ModuleView(context);
        }
    }


    private View mCaret;
    private ViewGroup mContentView;
    private boolean mIsExpanded;
    private TextView mTitleView;

    public ModuleView(Context context)
    {
        this(context, null);
    }

    public ModuleView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public ModuleView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        init();
    }

    public ModuleView(Context context, AttributeSet attributeset, int i, int j)
    {
        super(context, attributeset, i, j);
        init();
    }

    private void init()
    {
        inflate(getContext(), 0x7f04001e, this);
        mTitleView = (TextView)ViewUtil.findViewById(this, 0x7f10007c);
        mContentView = (ViewGroup)ViewUtil.findViewById(this, 0x7f10007e);
        mCaret = ViewUtil.findViewById(this, 0x7f10007d);
        mIsExpanded = false;
        setClickable(true);
    }

    public boolean performClick()
    {
        boolean flag;
        if (!mIsExpanded)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        setExpanded(flag);
        return super.performClick();
    }

    public void setContent(View view)
    {
        mContentView.addView(view, -1, -2);
    }

    public void setContent(CharSequence charsequence)
    {
        TextView textview = new TextView(getContext());
        textview.setTextAppearance(mContentView.getContext(), 0x7f0b0170);
        textview.setText(charsequence);
        mContentView.addView(textview, -1, -2);
    }

    public void setExpanded(boolean flag)
    {
        mIsExpanded = flag;
        if (android.os.Build.VERSION.SDK_INT > 19)
        {
            TransitionManager.beginDelayedTransition((ViewGroup)getRootView(), new ChangeBounds());
        }
        Object obj = mContentView;
        float f;
        int i;
        if (mIsExpanded)
        {
            i = 0;
        } else
        {
            i = 8;
        }
        ((ViewGroup) (obj)).setVisibility(i);
        obj = mCaret.animate();
        if (mIsExpanded)
        {
            f = -1F;
        } else
        {
            f = 1.0F;
        }
        ((ViewPropertyAnimator) (obj)).scaleY(f).start();
    }

    public void setTitle(int i)
    {
        mTitleView.setText(i);
    }

    public void setTitle(CharSequence charsequence)
    {
        mTitleView.setText(charsequence);
    }
}
