// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package net.hockeyapp.android;


// Referenced classes of package net.hockeyapp.android:
//            StringListener

public abstract class CrashManagerListener extends StringListener
{

    public CrashManagerListener()
    {
    }

    public String getContact()
    {
        return null;
    }

    public String getDescription()
    {
        return null;
    }

    public String getUserID()
    {
        return null;
    }

    public boolean ignoreDefaultHandler()
    {
        return false;
    }

    public boolean includeDeviceData()
    {
        return true;
    }

    public boolean includeDeviceIdentifier()
    {
        return true;
    }

    public void onConfirmedCrashesFound()
    {
    }

    public boolean onCrashesFound()
    {
        return false;
    }

    public void onCrashesNotSent()
    {
    }

    public void onCrashesSent()
    {
    }

    public void onNewCrashesFound()
    {
    }

    public void onUserDeniedCrashes()
    {
    }

    public boolean shouldAutoUploadCrashes()
    {
        return false;
    }
}
