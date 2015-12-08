// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.wmservice;

import com.walmart.android.data.WalmartStore;
import java.util.Comparator;

// Referenced classes of package com.walmart.android.wmservice:
//            WalmartLocationService

class this._cls0
    implements Comparator
{

    final compare this$0;

    public int compare(WalmartStore walmartstore, WalmartStore walmartstore1)
    {
        if (walmartstore.distanceFromSource < walmartstore1.distanceFromSource)
        {
            return -1;
        }
        return walmartstore.distanceFromSource <= walmartstore1.distanceFromSource ? 0 : 1;
    }

    public volatile int compare(Object obj, Object obj1)
    {
        return compare((WalmartStore)obj, (WalmartStore)obj1);
    }

    ()
    {
        this$0 = this._cls0.this;
        super();
    }
}
