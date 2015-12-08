// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.fragments;

import android.widget.ImageView;
import android.widget.TextView;

// Referenced classes of package com.walmart.android.fragments:
//            OnboardingFragment

class val.doneText
    implements android.support.v4.view.eListener
{

    final OnboardingFragment this$0;
    final TextView val$doneText;
    final ImageView val$dotsImage;
    final ImageView val$nextButton;
    final TextView val$skipText;

    public void onPageScrollStateChanged(int i)
    {
    }

    public void onPageScrolled(int i, float f, int j)
    {
    }

    public void onPageSelected(int i)
    {
        val$dotsImage.setImageResource(OnboardingFragment.access$100(OnboardingFragment.this)[i]);
        if (i == OnboardingFragment.access$200(OnboardingFragment.this).getCount() - 1)
        {
            val$skipText.setVisibility(4);
            val$nextButton.setVisibility(4);
            val$doneText.setVisibility(0);
            return;
        } else
        {
            val$skipText.setVisibility(0);
            val$doneText.setVisibility(4);
            val$nextButton.setVisibility(0);
            return;
        }
    }

    bsAdapter()
    {
        this$0 = final_onboardingfragment;
        val$dotsImage = imageview;
        val$skipText = textview;
        val$nextButton = imageview1;
        val$doneText = TextView.this;
        super();
    }
}
