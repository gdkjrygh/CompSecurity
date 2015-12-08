// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.base;

import android.os.Bundle;
import com.contextlogic.wish.api.core.ApiDataChangeNotificationListener;

// Referenced classes of package com.contextlogic.wish.ui.fragment.base:
//            BaseContentFragment

class this._cls0
    implements ApiDataChangeNotificationListener
{

    final BaseContentFragment this$0;

    public void onNotificationReceived(com.contextlogic.wish.api.core.ionManager.NotificationType notificationtype, Bundle bundle)
    {
        if (notificationtype == com.contextlogic.wish.api.core.ionManager.NotificationType.OrientationChanged)
        {
            BaseContentFragment.access$000(BaseContentFragment.this);
        }
    }

    er.NotificationType()
    {
        this$0 = BaseContentFragment.this;
        super();
    }
}
