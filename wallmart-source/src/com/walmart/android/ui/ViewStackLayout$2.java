// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.ui;

import android.view.View;
import android.view.animation.Animation;

// Referenced classes of package com.walmart.android.ui:
//            ViewStackLayout

class ansitionListener
    implements android.view.animation.nListener
{

    final ViewStackLayout this$0;
    final ansitionListener val$listener;
    final View val$view;

    public void onAnimationEnd(Animation animation)
    {
        ViewStackLayout.access$000(ViewStackLayout.this, val$view);
        ViewStackLayout.access$202(ViewStackLayout.this, 0);
        if (val$listener != null)
        {
            post(new Runnable() {

                final ViewStackLayout._cls2 this$1;

                public void run()
                {
                    listener.onTransitionDone();
                }

            
            {
                this$1 = ViewStackLayout._cls2.this;
                super();
            }
            });
        }
        ViewStackLayout.access$300(ViewStackLayout.this).setAnimationListener(null);
    }

    public void onAnimationRepeat(Animation animation)
    {
    }

    public void onAnimationStart(Animation animation)
    {
    }

    ansitionListener()
    {
        this$0 = final_viewstacklayout;
        val$view = view1;
        val$listener = ansitionListener.this;
        super();
    }
}
