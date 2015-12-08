// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.service;

import java.util.Comparator;
import java.util.HashMap;

// Referenced classes of package com.walmart.android.service:
//            MockManager, MockResponseInfo

class this._cls0
    implements Comparator
{

    final MockManager this$0;

    public int compare(MockResponseInfo mockresponseinfo, MockResponseInfo mockresponseinfo1)
    {
        return mockresponseinfo.getParameters().size() - mockresponseinfo1.getParameters().size();
    }

    public volatile int compare(Object obj, Object obj1)
    {
        return compare((MockResponseInfo)obj, (MockResponseInfo)obj1);
    }

    fo()
    {
        this$0 = MockManager.this;
        super();
    }
}
