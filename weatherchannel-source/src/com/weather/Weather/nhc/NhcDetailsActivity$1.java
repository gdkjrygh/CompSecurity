// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.nhc;

import com.weather.dal2.net.Receiver;
import com.weather.util.log.LogUtil;
import com.weather.util.log.LoggingMetaTags;
import java.util.List;

// Referenced classes of package com.weather.Weather.nhc:
//            NhcDetailsActivity

class this._cls0
    implements Receiver
{

    final NhcDetailsActivity this$0;

    public volatile void onCompletion(Object obj, Object obj1)
    {
        onCompletion((List)obj, obj1);
    }

    public void onCompletion(List list, Object obj)
    {
        NhcDetailsActivity.access$000(NhcDetailsActivity.this, list);
    }

    public void onError(Throwable throwable, Object obj)
    {
        LogUtil.e("NhcDetailsActivity", LoggingMetaTags.TWC_UI, "Failed to get Nhc details data", new Object[] {
            throwable.getMessage()
        });
    }

    ()
    {
        this$0 = NhcDetailsActivity.this;
        super();
    }
}
