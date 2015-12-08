// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.sessionm.ui;

import android.app.Activity;
import android.view.animation.Animation;

// Referenced classes of package com.sessionm.ui:
//            ActivityController

class this._cls0
    implements android.view.animation.tener
{

    final ActivityController this$0;

    public void onAnimationEnd(Animation animation)
    {
        getActivityContext().runOnUiThread(new Runnable() {

            final ActivityController._cls13 this$1;

            public void run()
            {
                if (ActivityController.access$500(this$0) == ActivityController.State.DISMISSED)
                {
                    return;
                } else
                {
                    removeBrowserView();
                    return;
                }
            }

            
            {
                this$1 = ActivityController._cls13.this;
                super();
            }
        });
    }

    public void onAnimationRepeat(Animation animation)
    {
    }

    public void onAnimationStart(Animation animation)
    {
    }

    _cls1.this._cls1()
    {
        this$0 = ActivityController.this;
        super();
    }
}
