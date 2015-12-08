// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.locations;


// Referenced classes of package com.weather.commons.locations:
//            SQSLocationUpdateUtil

class this._cls0
    implements Runnable
{

    final SQSLocationUpdateUtil this$0;

    public void run()
    {
        SQSLocationUpdateUtil.cancelAlarm();
        SQSLocationUpdateUtil.initialize();
    }

    ()
    {
        this$0 = SQSLocationUpdateUtil.this;
        super();
    }
}
