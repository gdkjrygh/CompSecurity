// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wsi.android.framework.ui.utils;


// Referenced classes of package com.wsi.android.framework.ui.utils:
//            ServerActivityIndicator, ServerActivityObject

public class ApplicationFacilities
{

    private static final ApplicationFacilities instance = new ApplicationFacilities();
    private ServerActivityIndicator serverActivityIndicator;

    private ApplicationFacilities()
    {
    }

    public static ApplicationFacilities getInstance()
    {
        return instance;
    }

    public void dissmissServerActivityIndicator()
    {
        if (serverActivityIndicator != null)
        {
            serverActivityIndicator.dissmissIndicator();
        }
    }

    public void setServerActivityIndicator(ServerActivityIndicator serveractivityindicator)
    {
        serverActivityIndicator = serveractivityindicator;
    }

    public void startServerActivityIndicator(ServerActivityObject serveractivityobject)
    {
        if (serverActivityIndicator != null)
        {
            serverActivityIndicator.startIndicator(serveractivityobject);
        }
    }

    public void stopServerActivityIndicator(ServerActivityObject serveractivityobject)
    {
        if (serverActivityIndicator != null)
        {
            serverActivityIndicator.stopIndicator(serveractivityobject);
        }
    }

}
