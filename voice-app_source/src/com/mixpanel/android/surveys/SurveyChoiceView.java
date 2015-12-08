// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.surveys;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import android.widget.CheckedTextView;

public class SurveyChoiceView extends CheckedTextView
{
    private class SetCheckAnimation extends Animation
    {

        final SurveyChoiceView this$0;

        protected void applyTransformation(float f, Transformation transformation)
        {
            float f1 = 0.0F;
            float f2 = 1.0F;
            if (f <= 0.5F)
            {
                f -= 0.5F;
                f1 = f2;
            } else
            {
                float f3 = 1.0F + (f - 0.5F) * 2.0F;
                f = f1;
                f1 = f3;
            }
            mCheckmarkLeftOffset = f;
            mTextLeftOffset = f1;
            requestLayout();
        }

        public boolean willChangeBounds()
        {
            return false;
        }

        public boolean willChangeTransformationMatrix()
        {
            return false;
        }

        private SetCheckAnimation()
        {
            this$0 = SurveyChoiceView.this;
            super();
        }

        SetCheckAnimation(SetCheckAnimation setcheckanimation)
        {
            this();
        }
    }


    private static final int ANIMATION_DURATION = 300;
    private static final int BOX_PADDING_LEFT_DP = 22;
    private static final int BOX_PADDING_TOP_DP = 12;
    private static final int CHECKMARK_HEIGHT_DP = 14;
    private float mCheckmarkLeftOffset;
    private Drawable mSurveyChoiceCheckMark;
    private float mTextLeftOffset;

    public SurveyChoiceView(Context context)
    {
        super(context);
        initSurveyChoiceView();
    }

    public SurveyChoiceView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        initSurveyChoiceView();
    }

    public SurveyChoiceView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        initSurveyChoiceView();
    }

    private void initSurveyChoiceView()
    {
        mCheckmarkLeftOffset = 0.0F;
        mTextLeftOffset = 1.5F;
    }

    protected void onDraw(Canvas canvas)
    {
        Drawable drawable;
        int j;
        int k;
        int l;
        int i1;
        drawable = mSurveyChoiceCheckMark;
        float f = getResources().getDisplayMetrics().density;
        boolean flag = false;
        j = ((flag) ? 1 : 0);
        if (drawable != null)
        {
            j = ((flag) ? 1 : 0);
            if (isChecked())
            {
                j = (int)(14F * f);
            }
        }
        k = (int)(12F * f);
        l = (int)(22F * f);
        setCheckMarkDrawable(null);
        setPadding((int)((float)l + mTextLeftOffset * (float)j), k, l, k);
        super.onDraw(canvas);
        i1 = (int)((float)l + mCheckmarkLeftOffset * (float)j);
        setPadding(i1, k, l, k);
        setCheckMarkDrawable(drawable);
        if (drawable == null) goto _L2; else goto _L1
_L1:
        int i;
        int j1;
        j1 = getGravity();
        i = 0;
        j1 & 0x70;
        JVM INSTR lookupswitch 2: default 168
    //                   16: 226
    //                   80: 214;
           goto _L3 _L4 _L5
_L3:
        drawable.setBounds(getScrollX() + i1, i, getScrollX() + (i1 + j), i + j);
        drawable.draw(canvas);
_L2:
        setPadding(l, k, l, k);
        return;
_L5:
        i = getHeight() - j;
        continue; /* Loop/switch isn't completed */
_L4:
        i = (getHeight() - j) / 2;
        if (true) goto _L3; else goto _L6
_L6:
    }

    public void setCheckMarkDrawable(Drawable drawable)
    {
        super.setCheckMarkDrawable(drawable);
        mSurveyChoiceCheckMark = drawable;
    }

    public void setChecked(boolean flag)
    {
        boolean flag1 = isChecked();
        super.setChecked(flag);
        if (isChecked() && !flag1)
        {
            SetCheckAnimation setcheckanimation = new SetCheckAnimation(null);
            setcheckanimation.setDuration(300L);
            startAnimation(setcheckanimation);
        }
    }


}
