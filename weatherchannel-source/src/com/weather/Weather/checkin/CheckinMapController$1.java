// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.checkin;


// Referenced classes of package com.weather.Weather.checkin:
//            CheckinMapController

class this._cls0
    implements Runnable
{

    final CheckinMapController this$0;

    public void run()
    {
        updateCheckins();
    }

    ()
    {
        this$0 = CheckinMapController.this;
        super();
    }
}
