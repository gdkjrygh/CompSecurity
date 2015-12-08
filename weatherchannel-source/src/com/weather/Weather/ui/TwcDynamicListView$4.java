// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.ui;

import android.view.View;
import com.nineoldandroids.animation.Animator;
import com.nineoldandroids.animation.AnimatorListenerAdapter;

// Referenced classes of package com.weather.Weather.ui:
//            TwcDynamicListView

class erAdapter extends AnimatorListenerAdapter
{

    final TwcDynamicListView this$0;
    final View val$mobileView;

    public void onAnimationEnd(Animator animator)
    {
        TwcDynamicListView.access$502(TwcDynamicListView.this, -1L);
        TwcDynamicListView.access$602(TwcDynamicListView.this, -1L);
        TwcDynamicListView.access$702(TwcDynamicListView.this, -1L);
        val$mobileView.setVisibility(0);
        TwcDynamicListView.access$802(TwcDynamicListView.this, null);
        setEnabled(true);
        invalidate();
        if (TwcDynamicListView.access$900(TwcDynamicListView.this) != null)
        {
            TwcDynamicListView.access$900(TwcDynamicListView.this).onItemMoved(TwcDynamicListView.access$1000(TwcDynamicListView.this) - getHeaderViewsCount());
        }
    }

    public void onAnimationStart(Animator animator)
    {
        setEnabled(false);
    }

    ItemMovedListener()
    {
        this$0 = final_twcdynamiclistview;
        val$mobileView = View.this;
        super();
    }
}
