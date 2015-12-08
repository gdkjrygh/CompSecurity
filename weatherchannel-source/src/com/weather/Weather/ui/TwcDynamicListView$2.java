// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.ui;

import android.view.View;
import android.view.ViewTreeObserver;
import com.nineoldandroids.animation.ObjectAnimator;
import com.nineoldandroids.view.ViewHelper;

// Referenced classes of package com.weather.Weather.ui:
//            TwcDynamicListView

class val.switchViewStartTop
    implements android.view.eDrawListener
{

    final TwcDynamicListView this$0;
    final int val$deltaY;
    final ViewTreeObserver val$observer;
    final long val$switchItemId;
    final int val$switchViewStartTop;

    public boolean onPreDraw()
    {
        val$observer.removeOnPreDrawListener(this);
        Object obj = TwcDynamicListView.access$300(TwcDynamicListView.this, val$switchItemId);
        TwcDynamicListView.access$402(TwcDynamicListView.this, TwcDynamicListView.access$400(TwcDynamicListView.this) + val$deltaY);
        int i = ((View) (obj)).getTop();
        ViewHelper.setTranslationY(((View) (obj)), val$switchViewStartTop - i);
        obj = ObjectAnimator.ofFloat(obj, "translationY", new float[] {
            0.0F
        });
        ((ObjectAnimator) (obj)).setDuration(150L);
        ((ObjectAnimator) (obj)).start();
        return true;
    }

    ()
    {
        this$0 = final_twcdynamiclistview;
        val$observer = viewtreeobserver;
        val$switchItemId = l;
        val$deltaY = i;
        val$switchViewStartTop = I.this;
        super();
    }
}
