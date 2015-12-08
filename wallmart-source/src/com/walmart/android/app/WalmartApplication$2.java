// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app;

import com.urbanairship.UAirship;
import com.urbanairship.push.PushManager;
import com.walmart.android.app.push.UAPushNotificationFactory;

// Referenced classes of package com.walmart.android.app:
//            WalmartApplication

class this._cls0
    implements com.urbanairship.ack
{

    final WalmartApplication this$0;

    public void onAirshipReady(UAirship uairship)
    {
        UAPushNotificationFactory uapushnotificationfactory = new UAPushNotificationFactory(WalmartApplication.this);
        uapushnotificationfactory.setSmallIconId(0x7f0202ef);
        uairship = uairship.getPushManager();
        uairship.setNotificationFactory(uapushnotificationfactory);
        uairship.setPushEnabled(true);
        uairship.setUserNotificationsEnabled(true);
    }

    onFactory()
    {
        this$0 = WalmartApplication.this;
        super();
    }
}
