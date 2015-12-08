// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.pollen;

import android.view.View;
import com.weather.commons.analytics.allergy.AllergyFeedScreenTag;

// Referenced classes of package com.weather.Weather.pollen:
//            AllergyMainActivity

private class <init>
    implements android.support.v4.view.er
{

    final AllergyMainActivity this$0;

    private View getViewForGivenPosition(int i)
    {
        if (i == 0)
        {
            android.widget.TextView textview = AllergyMainActivity.access$200(AllergyMainActivity.this);
            AllergyMainActivity.access$300(AllergyMainActivity.this, AllergyFeedScreenTag.POLLEN);
            return textview;
        }
        if (i == 1)
        {
            android.widget.TextView textview1 = AllergyMainActivity.access$400(AllergyMainActivity.this);
            AllergyMainActivity.access$300(AllergyMainActivity.this, AllergyFeedScreenTag.BREATHING);
            return textview1;
        } else
        {
            android.widget.TextView textview2 = AllergyMainActivity.access$500(AllergyMainActivity.this);
            AllergyMainActivity.access$300(AllergyMainActivity.this, AllergyFeedScreenTag.MOLD);
            return textview2;
        }
    }

    public void onPageScrollStateChanged(int i)
    {
    }

    public void onPageScrolled(int i, float f, int j)
    {
    }

    public void onPageSelected(int i)
    {
        AllergyMainActivity.access$100(AllergyMainActivity.this, getViewForGivenPosition(i));
    }

    private ()
    {
        this$0 = AllergyMainActivity.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
