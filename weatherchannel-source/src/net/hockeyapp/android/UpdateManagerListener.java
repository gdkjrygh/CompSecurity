// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package net.hockeyapp.android;

import java.util.Date;
import org.json.JSONArray;

// Referenced classes of package net.hockeyapp.android:
//            StringListener, UpdateActivity, UpdateFragment

public abstract class UpdateManagerListener extends StringListener
{

    public UpdateManagerListener()
    {
    }

    public boolean canUpdateInMarket()
    {
        return false;
    }

    public Date getExpiryDate()
    {
        return null;
    }

    public Class getUpdateActivityClass()
    {
        return net/hockeyapp/android/UpdateActivity;
    }

    public Class getUpdateFragmentClass()
    {
        return net/hockeyapp/android/UpdateFragment;
    }

    public boolean onBuildExpired()
    {
        return true;
    }

    public void onNoUpdateAvailable()
    {
    }

    public void onUpdateAvailable()
    {
    }

    public void onUpdateAvailable(JSONArray jsonarray, String s)
    {
        onUpdateAvailable();
    }
}
