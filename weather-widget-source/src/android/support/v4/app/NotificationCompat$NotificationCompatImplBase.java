// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.app.Notification;
import android.os.Bundle;
import java.util.ArrayList;

// Referenced classes of package android.support.v4.app:
//            NotificationCompat

static class ory
    implements ory
{

    public Notification build(ory ory)
    {
        Notification notification = ory.ory;
        notification.setLatestEventInfo(ory.ory, ory.ory, ory.ory, ory.ory);
        if (ory.ory > 0)
        {
            notification.flags = notification.flags | 0x80;
        }
        return notification;
    }

    public ory getAction(Notification notification, int i)
    {
        return null;
    }

    public int getActionCount(Notification notification)
    {
        return 0;
    }

    public ory[] getActionsFromParcelableArrayList(ArrayList arraylist)
    {
        return null;
    }

    public Bundle getBundleForUnreadConversation(ory ory)
    {
        return null;
    }

    public String getCategory(Notification notification)
    {
        return null;
    }

    public Bundle getExtras(Notification notification)
    {
        return null;
    }

    public String getGroup(Notification notification)
    {
        return null;
    }

    public boolean getLocalOnly(Notification notification)
    {
        return false;
    }

    public ArrayList getParcelableArrayListForActions(ory aory[])
    {
        return null;
    }

    public String getSortKey(Notification notification)
    {
        return null;
    }

    public ory getUnreadConversationFromBundle(Bundle bundle, ory ory, ory ory1)
    {
        return null;
    }

    public boolean isGroupSummary(Notification notification)
    {
        return false;
    }

    ory()
    {
    }
}
