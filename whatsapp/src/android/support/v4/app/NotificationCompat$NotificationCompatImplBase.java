// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.app.Notification;
import android.os.Bundle;
import java.util.ArrayList;

class 
    implements 
{

    public Notification build( )
    {
        Notification notification = .;
        notification.setLatestEventInfo(., ., ., .);
        if (. > 0)
        {
            notification.flags = notification.flags | 0x80;
        }
        return notification;
    }

    public Bundle getExtras(Notification notification)
    {
        return null;
    }

    public ArrayList getParcelableArrayListForActions( a[])
    {
        return null;
    }

    ()
    {
    }
}
