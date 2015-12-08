// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.surveys;

import android.view.animation.Animation;
import android.view.animation.Transformation;

// Referenced classes of package com.mixpanel.android.surveys:
//            SurveyChoiceView

private class <init> extends Animation
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
        SurveyChoiceView.access$0(SurveyChoiceView.this, f);
        SurveyChoiceView.access$1(SurveyChoiceView.this, f1);
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

    private ()
    {
        this$0 = SurveyChoiceView.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
