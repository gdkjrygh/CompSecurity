// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.item.view;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import android.widget.Adapter;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.walmart.android.utils.ViewUtil;
import com.walmart.android.wmui.FlowLayout;

public class VariantView extends LinearLayout
{
    private static class SizeAnimation extends Animation
    {

        private static final long DEFAULT_DURATION = 100L;
        private final int mStartHeight;
        private final int mStartWidth;
        private final int mTargetHeight;
        private final int mTargetWidth;
        private final View mView;

        protected void applyTransformation(float f, Transformation transformation)
        {
            int i = mTargetHeight;
            int j = mTargetWidth;
            if (f < 1.0F)
            {
                i = mStartHeight + (int)((float)(mTargetHeight - mStartHeight) * f);
                j = mStartWidth + (int)((float)(mTargetWidth - mStartWidth) * f);
            }
            mView.getLayoutParams().width = j;
            mView.getLayoutParams().height = i;
            mView.requestLayout();
        }

        public boolean willChangeBounds()
        {
            return true;
        }

        public SizeAnimation(View view, int i)
        {
            mView = view;
            mTargetHeight = i;
            mStartHeight = view.getHeight();
            mStartWidth = view.getWidth();
            mTargetWidth = mStartWidth + (i - mStartHeight);
            setDuration(100L);
        }
    }

    public static interface ValueClickedListener
    {

        public abstract void onValueClicked(int i);
    }


    private Adapter mAdapter;
    private TextView mTitle;
    private ValueClickedListener mValueClickedListener;
    private FlowLayout mValues;

    public VariantView(Context context)
    {
        super(context);
    }

    public VariantView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public VariantView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    public VariantView(Context context, AttributeSet attributeset, int i, int j)
    {
        super(context, attributeset, i, j);
    }

    private static void updateChildSize(View view, int i)
    {
        android.view.ViewGroup.LayoutParams layoutparams = view.getLayoutParams();
        int j = view.getWidth();
        int k = view.getHeight();
        layoutparams.height = i;
        layoutparams.width = j + (i - k);
        view.setLayoutParams(layoutparams);
    }

    private static void updateChildSizeWithLayoutCheck(View view, int i)
    {
        if (view.getHeight() == 0)
        {
            ViewUtil.runAfterLayout(new Runnable(view, i) {

                final View val$child;
                final int val$targetHeight;

                public void run()
                {
                    VariantView.updateChildSize(child, targetHeight);
                }

            
            {
                child = view;
                targetHeight = i;
                super();
            }
            }, view);
            return;
        } else
        {
            updateChildSize(view, i);
            return;
        }
    }

    public void hideValues()
    {
        mValues.setVisibility(8);
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        mTitle = (TextView)ViewUtil.findViewById(this, 0x7f1001fb);
        mValues = (FlowLayout)ViewUtil.findViewById(this, 0x7f1000a6);
        mValues.setFixedLineHeight(getResources().getDimensionPixelSize(0x7f0a00b0));
        int i = ViewUtil.dpToPixels(2, getContext());
        mValues.setHorizontalSpacing(i);
        mValues.setVerticalSpacing(i);
    }

    public void setAdapter(Adapter adapter)
    {
        mAdapter = adapter;
        mValues.removeAllViews();
        for (int i = 0; i < adapter.getCount(); i++)
        {
            final View view = adapter.getView(i, null, mValues);
            view.setTag(0x7f10000d, Integer.valueOf(i));
            view.setOnClickListener(new android.view.View.OnClickListener() {

                final VariantView this$0;
                final View val$view;

                public void onClick(View view1)
                {
                    while (view1.isSelected() || mValueClickedListener == null) 
                    {
                        return;
                    }
                    mValueClickedListener.onValueClicked(((Integer)view.getTag(0x7f10000d)).intValue());
                }

            
            {
                this$0 = VariantView.this;
                view = view1;
                super();
            }
            });
            mValues.addView(view);
        }

    }

    public void setSelectedValue(int i, boolean flag)
    {
        View view1;
label0:
        {
            if (i < mValues.getChildCount())
            {
                int k = mValues.getChildCount();
                int j = 0;
                while (j < k) 
                {
                    View view = mValues.getChildAt(j);
                    if (view.isSelected())
                    {
                        int l = getResources().getDimensionPixelSize(0x7f0a00b1);
                        if (flag)
                        {
                            view.startAnimation(new SizeAnimation(view, l));
                        } else
                        {
                            updateChildSizeWithLayoutCheck(view, l);
                        }
                        view.setSelected(false);
                    }
                    j++;
                }
                view1 = mValues.getChildAt(i);
                view1.setSelected(true);
                if (!flag)
                {
                    break label0;
                }
                view1.startAnimation(new SizeAnimation(view1, getResources().getDimensionPixelSize(0x7f0a00b0)));
            }
            return;
        }
        updateChildSizeWithLayoutCheck(view1, getResources().getDimensionPixelSize(0x7f0a00b0));
    }

    public void setSelectedValue(Object obj, boolean flag)
    {
        if (mAdapter == null) goto _L2; else goto _L1
_L1:
        int i;
        byte byte0;
        byte0 = -1;
        i = 0;
_L8:
        int j = byte0;
        if (i >= mAdapter.getCount()) goto _L4; else goto _L3
_L3:
        if (!mAdapter.getItem(i).equals(obj)) goto _L6; else goto _L5
_L5:
        j = i;
_L4:
        if (j != -1)
        {
            setSelectedValue(j, flag);
        }
_L2:
        return;
_L6:
        i++;
        if (true) goto _L8; else goto _L7
_L7:
    }

    public void setTitle(String s)
    {
        mTitle.setText(s);
    }

    public void setValueSelectedListener(ValueClickedListener valueclickedlistener)
    {
        mValueClickedListener = valueclickedlistener;
    }


}
