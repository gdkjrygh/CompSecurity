// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.severe;

import com.weather.dal2.net.Receiver;

// Referenced classes of package com.weather.Weather.severe:
//            SevereWeatherAlertActivity

class this._cls0
    implements Receiver
{

    final SevereWeatherAlertActivity this$0;

    public volatile void onCompletion(Object obj, Object obj1)
    {
        onCompletion((String)obj, obj1);
    }

    public void onCompletion(String s, Object obj)
    {
    /* block-local class not found */
    class _cls1 {}

        runOnUiThread(new _cls1(s));
    }

    public void onError(Throwable throwable, Object obj)
    {
    }

    _cls1()
    {
        this$0 = SevereWeatherAlertActivity.this;
        super();
    }
}
