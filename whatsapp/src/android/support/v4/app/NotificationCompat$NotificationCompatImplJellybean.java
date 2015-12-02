// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.app.Notification;
import android.os.Bundle;
import java.util.ArrayList;

// Referenced classes of package android.support.v4.app:
//            NotificationCompat, NotificationCompatJellybean

class  extends 
{

    public Notification build( )
    {
         1 = new (., ., ., ., ., ., ., ., ., ., ., ., ., ., ., ., ., ., ., ., .);
        NotificationCompat.access$000(1, .);
        NotificationCompat.access$100(1, .);
        return 1.();
    }

    public Bundle getExtras(Notification notification)
    {
        return NotificationCompatJellybean.getExtras(notification);
    }

    public ArrayList getParcelableArrayListForActions( a[])
    {
        return NotificationCompatJellybean.getParcelableArrayListForActions(a);
    }

    ()
    {
    }
}
