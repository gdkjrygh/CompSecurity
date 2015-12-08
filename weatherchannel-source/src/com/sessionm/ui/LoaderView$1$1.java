// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.sessionm.ui;

import android.app.Activity;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.ScrollView;

// Referenced classes of package com.sessionm.ui:
//            LoaderView

class this._cls1
    implements Runnable
{

    final eAllViews this$1;

    public void run()
    {
        ViewGroup viewgroup = (ViewGroup)containerLayout.getParent();
        if (viewgroup != null)
        {
            viewgroup.removeView(containerLayout);
        }
        containerLayout.removeAllViews();
    }

    is._cls0()
    {
        this$1 = this._cls1.this;
        super();
    }

    // Unreferenced inner class com/sessionm/ui/LoaderView$1

/* anonymous class */
    class LoaderView._cls1
        implements android.view.animation.Animation.AnimationListener
    {

        final LoaderView this$0;

        public void onAnimationEnd(Animation animation)
        {
            if (containerLayout == null)
            {
                return;
            } else
            {
                activity.runOnUiThread(new LoaderView._cls1._cls1());
                return;
            }
        }

        public void onAnimationRepeat(Animation animation)
        {
        }

        public void onAnimationStart(Animation animation)
        {
        }

            
            {
                this$0 = LoaderView.this;
                super();
            }
    }

}
