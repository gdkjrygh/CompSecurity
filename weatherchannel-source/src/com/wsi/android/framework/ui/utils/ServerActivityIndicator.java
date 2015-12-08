// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wsi.android.framework.ui.utils;

import android.content.Context;

// Referenced classes of package com.wsi.android.framework.ui.utils:
//            ServerActivityObject

public class ServerActivityIndicator
{

    public ServerActivityIndicator(Context context, String s, String s1, String s2, String s3)
    {
        ServerActivityObject.TILE_DOWNLOADING.setNotificationMessage(s1);
        ServerActivityObject.WEATHER_DATA.setNotificationMessage(s2);
        ServerActivityObject.GEO_DATA_EARTHQUAKES.setNotificationMessage(s3);
        ServerActivityObject.GEO_DATA_STORM_CELLS.setNotificationMessage(s3);
        ServerActivityObject.GEO_DATA_HURRICANES.setNotificationMessage(s3);
        ServerActivityObject.GEO_WATCH_WARNING_BOXES.setNotificationMessage(s3);
    }

    public void dissmissIndicator()
    {
        this;
        JVM INSTR monitorenter ;
    }

    public void startIndicator(ServerActivityObject serveractivityobject)
    {
        this;
        JVM INSTR monitorenter ;
    }

    public void stopIndicator(ServerActivityObject serveractivityobject)
    {
        this;
        JVM INSTR monitorenter ;
    }
}
