// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.ui;

import android.view.View;
import android.view.animation.Animation;

// Referenced classes of package com.walmart.android.ui:
//            ViewStackLayout

class val.replace
    implements android.view.animation.nListener
{

    final ViewStackLayout this$0;
    final boolean val$replace;
    final View val$topChild;

    public void onAnimationEnd(Animation animation)
    {
        ViewStackLayout.access$000(ViewStackLayout.this, val$topChild);
        if (val$replace)
        {
            post(new Runnable() {

                final ViewStackLayout._cls1 this$1;

                public void run()
                {
                    removeView(topChild);
                }

            
            {
                this$1 = ViewStackLayout._cls1.this;
                super();
            }
            });
        } else
        {
            val$topChild.setVisibility(8);
        }
        ViewStackLayout.access$100(ViewStackLayout.this).setAnimationListener(null);
    }

    public void onAnimationRepeat(Animation animation)
    {
    }

    public void onAnimationStart(Animation animation)
    {
    }

    _cls1.this._cls1()
    {
        this$0 = final_viewstacklayout;
        val$topChild = view;
        val$replace = Z.this;
        super();
    }
}
