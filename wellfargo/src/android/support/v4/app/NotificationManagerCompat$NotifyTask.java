// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.app.Notification;

// Referenced classes of package android.support.v4.app:
//            INotificationSideChannel

class notif
    implements notif
{

    final int id;
    final Notification notif;
    final String packageName;
    final String tag;

    public void send(INotificationSideChannel inotificationsidechannel)
    {
        inotificationsidechannel.notify(packageName, id, tag, notif);
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder("NotifyTask[");
        stringbuilder.append("packageName:").append(packageName);
        stringbuilder.append(", id:").append(id);
        stringbuilder.append(", tag:").append(tag);
        stringbuilder.append("]");
        return stringbuilder.toString();
    }

    public A(String s, int i, String s1, Notification notification)
    {
        packageName = s;
        id = i;
        tag = s1;
        notif = notification;
    }
}
