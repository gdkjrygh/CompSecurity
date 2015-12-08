// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.app.Notification;
import android.os.Bundle;

// Referenced classes of package android.support.v4.app:
//            NotificationCompat, NotificationCompatApi21

class ry extends ry
{

    public Notification build(ry ry, ry ry1)
    {
        ry ry2 = new ry(ry.ry, ry.ry, ry.ry, ry.ry, ry.ry, ry.ry, ry.ry, ry.ry, ry.ry, ry.ry, ry.ry, ry.ry, ry.te, ry.te, ry.te, ry.te, ry.te, ry.te, ry.te, ry.te, ry.te, ry.te, ry.te, ry.te, ry.te, ry.te, ry.te);
        NotificationCompat.access$000(ry2, ry.te);
        NotificationCompat.access$100(ry2, ry.te);
        return ry1.te(ry, ry2);
    }

    public Bundle getBundleForUnreadConversation(te te)
    {
        return NotificationCompatApi21.getBundleForUnreadConversation(te);
    }

    public String getCategory(Notification notification)
    {
        return NotificationCompatApi21.getCategory(notification);
    }

    public ry getUnreadConversationFromBundle(Bundle bundle, ry ry, ry ry1)
    {
        return NotificationCompatApi21.getUnreadConversationFromBundle(bundle, ry, ry1);
    }

    ry()
    {
    }
}
