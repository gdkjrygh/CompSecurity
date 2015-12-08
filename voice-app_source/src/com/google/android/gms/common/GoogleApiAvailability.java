// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common;

import android.app.Activity;
import android.app.Dialog;
import android.app.PendingIntent;
import android.content.Context;

// Referenced classes of package com.google.android.gms.common:
//            GooglePlayServicesUtil, GooglePlayServicesRepairableException, GooglePlayServicesNotAvailableException

public class GoogleApiAvailability
{

    public static final String GOOGLE_PLAY_SERVICES_PACKAGE = "com.google.android.gms";
    public static final int GOOGLE_PLAY_SERVICES_VERSION_CODE;
    private static final GoogleApiAvailability zzVI = new GoogleApiAvailability();

    GoogleApiAvailability()
    {
    }

    public static GoogleApiAvailability getInstance()
    {
        return zzVI;
    }

    public Dialog getErrorDialog(Activity activity, int i, int j)
    {
        return GooglePlayServicesUtil.getErrorDialog(i, activity, j);
    }

    public Dialog getErrorDialog(Activity activity, int i, int j, android.content.DialogInterface.OnCancelListener oncancellistener)
    {
        return GooglePlayServicesUtil.getErrorDialog(i, activity, j, oncancellistener);
    }

    public PendingIntent getErrorResolutionPendingIntent(Context context, int i, int j)
    {
        return GooglePlayServicesUtil.getErrorPendingIntent(i, context, j);
    }

    public final String getErrorString(int i)
    {
        return GooglePlayServicesUtil.getErrorString(i);
    }

    public String getOpenSourceSoftwareLicenseInfo(Context context)
    {
        return GooglePlayServicesUtil.getOpenSourceSoftwareLicenseInfo(context);
    }

    public int isGooglePlayServicesAvailable(Context context)
    {
        int j = GooglePlayServicesUtil.isGooglePlayServicesAvailable(context);
        int i = j;
        if (GooglePlayServicesUtil.zze(context, j))
        {
            i = 18;
        }
        return i;
    }

    public final boolean isUserResolvableError(int i)
    {
        return GooglePlayServicesUtil.isUserRecoverableError(i);
    }

    public boolean showErrorDialogFragment(Activity activity, int i, int j)
    {
        return GooglePlayServicesUtil.showErrorDialogFragment(i, activity, j);
    }

    public boolean showErrorDialogFragment(Activity activity, int i, int j, android.content.DialogInterface.OnCancelListener oncancellistener)
    {
        return GooglePlayServicesUtil.showErrorDialogFragment(i, activity, j, oncancellistener);
    }

    public void showErrorNotification(Context context, int i)
    {
        GooglePlayServicesUtil.showErrorNotification(i, context);
    }

    public void zzZ(Context context)
        throws GooglePlayServicesRepairableException, GooglePlayServicesNotAvailableException
    {
        GooglePlayServicesUtil.zzY(context);
    }

    static 
    {
        GOOGLE_PLAY_SERVICES_VERSION_CODE = GooglePlayServicesUtil.GOOGLE_PLAY_SERVICES_VERSION_CODE;
    }
}
