// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.ui;

import android.view.View;
import android.view.animation.Animation;

// Referenced classes of package com.walmart.android.ui:
//            ViewStackLayout

class this._cls1
    implements Runnable
{

    final l.topChild this$1;

    public void run()
    {
        removeView(topChild);
    }

    l.replace()
    {
        this$1 = this._cls1.this;
        super();
    }

    // Unreferenced inner class com/walmart/android/ui/ViewStackLayout$1

/* anonymous class */
    class ViewStackLayout._cls1
        implements android.view.animation.Animation.AnimationListener
    {

        final ViewStackLayout this$0;
        final boolean val$replace;
        final View val$topChild;

        public void onAnimationEnd(Animation animation)
        {
            ViewStackLayout.access$000(ViewStackLayout.this, topChild);
            if (replace)
            {
                post(new ViewStackLayout._cls1._cls1());
            } else
            {
                topChild.setVisibility(8);
            }
            ViewStackLayout.access$100(ViewStackLayout.this).setAnimationListener(null);
        }

        public void onAnimationRepeat(Animation animation)
        {
        }

        public void onAnimationStart(Animation animation)
        {
        }

            
            {
                this$0 = final_viewstacklayout;
                topChild = view;
                replace = Z.this;
                super();
            }
    }

}
