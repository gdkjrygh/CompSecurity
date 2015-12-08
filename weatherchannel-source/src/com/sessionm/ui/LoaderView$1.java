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

class this._cls0
    implements android.view.animation.mationListener
{

    final LoaderView this$0;

    public void onAnimationEnd(Animation animation)
    {
        if (containerLayout == null)
        {
            return;
        } else
        {
            activity.runOnUiThread(new Runnable() {

                final LoaderView._cls1 this$1;

                public void run()
                {
                    ViewGroup viewgroup = (ViewGroup)containerLayout.getParent();
                    if (viewgroup != null)
                    {
                        viewgroup.removeView(containerLayout);
                    }
                    containerLayout.removeAllViews();
                }

            
            {
                this$1 = LoaderView._cls1.this;
                super();
            }
            });
            return;
        }
    }

    public void onAnimationRepeat(Animation animation)
    {
    }

    public void onAnimationStart(Animation animation)
    {
    }

    _cls1.this._cls1()
    {
        this$0 = LoaderView.this;
        super();
    }
}
