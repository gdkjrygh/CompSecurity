// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.api.core;

import android.os.Bundle;

// Referenced classes of package com.contextlogic.wish.api.core:
//            ApiDataChangeNotificationManager

class val.notificationData
    implements Runnable
{

    final ApiDataChangeNotificationManager this$0;
    final akNotificationListener val$finalListener;
    final Bundle val$notificationData;
    final tificationType val$notificationType;

    public void run()
    {
        val$finalListener.onNotificationReceived(val$notificationType, val$notificationData);
    }

    tificationType()
    {
        this$0 = final_apidatachangenotificationmanager;
        val$finalListener = aknotificationlistener;
        val$notificationType = tificationtype;
        val$notificationData = Bundle.this;
        super();
    }
}
