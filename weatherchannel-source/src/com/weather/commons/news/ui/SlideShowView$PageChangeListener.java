// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.news.ui;

import android.app.Activity;
import android.widget.ImageView;
import android.widget.TextView;

// Referenced classes of package com.weather.commons.news.ui:
//            SlideShowView

private class <init>
    implements android.support.v4.view.ner
{

    final SlideShowView this$0;

    public void onPageScrollStateChanged(int i)
    {
    }

    public void onPageScrolled(int i, float f, int j)
    {
    }

    public void onPageSelected(int i)
    {
        int j = SlideShowView.access$200(SlideShowView.this).getCount();
        if (SlideShowView.access$900(SlideShowView.this) != null)
        {
            if (i > 0)
            {
                SlideShowView.access$900(SlideShowView.this).setVisibility(0);
            } else
            {
                SlideShowView.access$900(SlideShowView.this).setVisibility(8);
            }
        }
        if (SlideShowView.access$1000(SlideShowView.this) != null)
        {
            if (i < j - 1)
            {
                SlideShowView.access$1000(SlideShowView.this).setVisibility(0);
            } else
            {
                SlideShowView.access$1000(SlideShowView.this).setVisibility(8);
            }
        }
        if (SlideShowView.access$1100(SlideShowView.this) != null)
        {
            SlideShowView.access$1100(SlideShowView.this).setText(SlideShowView.access$600(SlideShowView.this).getString(com.weather.commons.istener.this._fld0, new Object[] {
                Integer.valueOf(i + 1), Integer.valueOf(j)
            }));
        }
        int _tmp = SlideShowView.access$1208(SlideShowView.this);
    }

    private erAdapter()
    {
        this$0 = SlideShowView.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
