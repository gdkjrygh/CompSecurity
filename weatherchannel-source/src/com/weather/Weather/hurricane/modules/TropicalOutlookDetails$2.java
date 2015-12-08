// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.hurricane.modules;

import com.weather.dal2.net.Receiver;
import com.weather.util.log.LogUtil;
import com.weather.util.log.LoggingMetaTags;
import java.util.List;

// Referenced classes of package com.weather.Weather.hurricane.modules:
//            TropicalOutlookDetails

class sinGroup
    implements Receiver
{

    final TropicalOutlookDetails this$0;
    final sinGroup val$basinGroup;

    public volatile void onCompletion(Object obj, Object obj1)
    {
        onCompletion((List)obj, obj1);
    }

    public void onCompletion(List list, Object obj)
    {
    /* block-local class not found */
    class _cls1 {}

        runOnUiThread(new _cls1(list));
    }

    public void onError(Throwable throwable, Object obj)
    {
        LogUtil.e("TropicalOutlookDetails", LoggingMetaTags.TWC_UI, "Failed to get Nhc details data", new Object[] {
            throwable.getMessage()
        });
    }

    sinGroup()
    {
        this$0 = final_tropicaloutlookdetails;
        val$basinGroup = sinGroup.this;
        super();
    }
}
