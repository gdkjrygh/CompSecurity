// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.hybrid;

import com.walmart.android.analytics.Collector;

// Referenced classes of package com.walmart.android.app.hybrid:
//            JSBridgeAdapter

class this._cls0
    implements com.walmartlabs.hybrid.idge.JavaHandler
{

    final JSBridgeAdapter this$0;

    public Object handle(String s, com.walmartlabs.hybrid.idge.JsCallback jscallback)
    {
        return Collector.getInstance().getEventMap();
    }

    allback()
    {
        this$0 = JSBridgeAdapter.this;
        super();
    }
}
