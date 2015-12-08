// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.app.Notification;
import java.util.ArrayList;

// Referenced classes of package android.support.v4.app:
//            NotificationCompat, RemoteInput, NotificationCompatApi20

class  extends 
{

    public Notification build( ,  1)
    {
         2 = new (., ., ., ., ., ., ., ., ., ., ., ., .te, .te, .te, .te, .te, .te, .te, .te, .te, .te, .te);
        NotificationCompat.access$000(2, .te);
        NotificationCompat.access$100(2, .te);
        return 1.te(, 2);
    }

    public te getAction(Notification notification, int i)
    {
        return (te)NotificationCompatApi20.getAction(notification, i, te, RemoteInput.FACTORY);
    }

    public te[] getActionsFromParcelableArrayList(ArrayList arraylist)
    {
        return (te[])(te[])NotificationCompatApi20.getActionsFromParcelableArrayList(arraylist, eArrayList, RemoteInput.FACTORY);
    }

    public String getGroup(Notification notification)
    {
        return NotificationCompatApi20.getGroup(notification);
    }

    public boolean getLocalOnly(Notification notification)
    {
        return NotificationCompatApi20.getLocalOnly(notification);
    }

    public ArrayList getParcelableArrayListForActions(eArrayList aearraylist[])
    {
        return NotificationCompatApi20.getParcelableArrayListForActions(aearraylist);
    }

    public String getSortKey(Notification notification)
    {
        return NotificationCompatApi20.getSortKey(notification);
    }

    public boolean isGroupSummary(Notification notification)
    {
        return NotificationCompatApi20.isGroupSummary(notification);
    }

    ()
    {
    }
}
