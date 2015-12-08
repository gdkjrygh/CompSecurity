// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.app.Notification;

// Referenced classes of package android.support.v4.app:
//            an, al

final class ao
    implements an
{

    ao()
    {
    }

    public final Notification a(al al1)
    {
        Notification notification = al1.r;
        notification.setLatestEventInfo(al1.a, al1.b, al1.c, al1.d);
        if (al1.j > 0)
        {
            notification.flags = notification.flags | 0x80;
        }
        return notification;
    }
}
