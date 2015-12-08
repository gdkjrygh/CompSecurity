// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.mpmetrics;

import android.app.Activity;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;

// Referenced classes of package com.mixpanel.android.mpmetrics:
//            InAppFragment

class this._cls1
    implements android.view.er
{

    final is._cls0 this$1;

    public boolean onTouch(View view, MotionEvent motionevent)
    {
        return InAppFragment.access$3(_fld0).onTouchEvent(motionevent);
    }

    is._cls0()
    {
        this$1 = this._cls1.this;
        super();
    }

    // Unreferenced inner class com/mixpanel/android/mpmetrics/InAppFragment$2

/* anonymous class */
    class InAppFragment._cls2
        implements Runnable
    {

        final InAppFragment this$0;

        public void run()
        {
            InAppFragment.access$1(InAppFragment.this).setVisibility(0);
            InAppFragment.access$1(InAppFragment.this).setBackgroundColor(InAppFragment.access$2(InAppFragment.this).getHighlightColor());
            InAppFragment.access$1(InAppFragment.this).setOnTouchListener(new InAppFragment._cls2._cls1());
            ImageView imageview = (ImageView)InAppFragment.access$1(InAppFragment.this).findViewById(com.mixpanel.android.R.id.com_mixpanel_android_notification_image);
            float f = TypedValue.applyDimension(1, 75F, InAppFragment.access$4(InAppFragment.this).getResources().getDisplayMetrics());
            Object obj = new TranslateAnimation(0.0F, 0.0F, f, 0.0F);
            ((TranslateAnimation) (obj)).setInterpolator(new DecelerateInterpolator());
            ((TranslateAnimation) (obj)).setDuration(200L);
            InAppFragment.access$1(InAppFragment.this).startAnimation(((android.view.animation.Animation) (obj)));
            obj = new ScaleAnimation(0.0F, 1.0F, 0.0F, 1.0F, f / 2.0F, f / 2.0F);
            ((ScaleAnimation) (obj)).setInterpolator(new InAppFragment.SineBounceInterpolator(InAppFragment.this));
            ((ScaleAnimation) (obj)).setDuration(400L);
            ((ScaleAnimation) (obj)).setStartOffset(200L);
            imageview.startAnimation(((android.view.animation.Animation) (obj)));
        }


            
            {
                this$0 = InAppFragment.this;
                super();
            }
    }

}
