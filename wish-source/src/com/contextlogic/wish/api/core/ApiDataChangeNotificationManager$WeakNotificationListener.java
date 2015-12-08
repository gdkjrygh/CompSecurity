// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.api.core;

import android.os.Bundle;
import java.lang.ref.WeakReference;

// Referenced classes of package com.contextlogic.wish.api.core:
//            ApiDataChangeNotificationListener, ApiDataChangeNotificationManager

class listenerReference
    implements ApiDataChangeNotificationListener
{

    private WeakReference listenerReference;
    final ApiDataChangeNotificationManager this$0;

    public void onNotificationReceived(listenerReference listenerreference, Bundle bundle)
    {
        ApiDataChangeNotificationListener apidatachangenotificationlistener = (ApiDataChangeNotificationListener)listenerReference.get();
        if (apidatachangenotificationlistener != null)
        {
            apidatachangenotificationlistener.onNotificationReceived(listenerreference, bundle);
            return;
        } else
        {
            ApiDataChangeNotificationManager.access$000(ApiDataChangeNotificationManager.getInstance(), this, null);
            return;
        }
    }

    public (ApiDataChangeNotificationListener apidatachangenotificationlistener)
    {
        this$0 = ApiDataChangeNotificationManager.this;
        super();
        listenerReference = new WeakReference(apidatachangenotificationlistener);
    }
}
