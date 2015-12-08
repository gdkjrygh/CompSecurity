// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.sessionm.ui;

import com.sessionm.core.Session;
import com.sessionm.core.b;

// Referenced classes of package com.sessionm.ui:
//            ActivityController

class adContentListener
    implements Runnable
{

    final ActivityController this$0;
    final adContentListener val$loadContentListener;

    public void run()
    {
        Object obj = ActivityController.access$000(ActivityController.this).av();
        if (((b) (obj)).b(ActivityController.access$100(ActivityController.this)))
        {
            obj = ((b) (obj)).g(ActivityController.access$100(ActivityController.this));
            if (obj == null)
            {
                ActivityController.access$200(ActivityController.this, val$loadContentListener);
                return;
            } else
            {
                setActivityContent(((String) (obj)));
                val$loadContentListener.onContentLoaded(ActivityController.access$100(ActivityController.this), ActivityController.access$300(ActivityController.this));
                return;
            }
        } else
        {
            ActivityController.access$200(ActivityController.this, val$loadContentListener);
            return;
        }
    }

    adContentListener()
    {
        this$0 = final_activitycontroller;
        val$loadContentListener = adContentListener.this;
        super();
    }
}
