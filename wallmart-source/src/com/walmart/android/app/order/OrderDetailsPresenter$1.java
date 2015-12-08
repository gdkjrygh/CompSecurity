// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.order;

import android.text.TextUtils;
import java.util.Comparator;

// Referenced classes of package com.walmart.android.app.order:
//            OrderDetailsPresenter

class this._cls0
    implements Comparator
{

    final OrderDetailsPresenter this$0;

    public int compare(com.walmart.android.service.orderhistory. , com.walmart.android.service.orderhistory. 1)
    {
        byte byte0 = 0;
        if (TextUtils.isEmpty(.getTrackUrl()))
        {
            if (!TextUtils.isEmpty(1.getTrackUrl()))
            {
                byte0 = -1;
            }
            return byte0;
        }
        if (TextUtils.isEmpty(1.getTrackUrl()))
        {
            return 1;
        } else
        {
            return .getTrackUrl().compareTo(1.getTrackUrl());
        }
    }

    public volatile int compare(Object obj, Object obj1)
    {
        return compare((com.walmart.android.service.orderhistory.getTrackUrl)obj, (com.walmart.android.service.orderhistory.getTrackUrl)obj1);
    }

    esult.Item()
    {
        this$0 = OrderDetailsPresenter.this;
        super();
    }
}
