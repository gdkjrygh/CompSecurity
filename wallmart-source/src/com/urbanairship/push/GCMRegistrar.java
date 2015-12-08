// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.urbanairship.push;

import android.content.Intent;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.gcm.GoogleCloudMessaging;
import com.urbanairship.AirshipConfigOptions;
import com.urbanairship.Logger;
import com.urbanairship.UAirship;
import com.urbanairship.util.ManifestUtils;
import java.io.IOException;
import java.util.Set;

// Referenced classes of package com.urbanairship.push:
//            PushManager, PushPreferences, PushService

class GCMRegistrar
{

    GCMRegistrar()
    {
    }

    private static boolean isGCMAvailable()
    {
label0:
        {
            try
            {
                if (GooglePlayServicesUtil.isGooglePlayServicesAvailable(UAirship.getApplicationContext()) == 0)
                {
                    break label0;
                }
                Logger.error("Google Play services is currently unavailable.");
            }
            catch (IllegalStateException illegalstateexception)
            {
                Logger.error((new StringBuilder()).append("Unable to register. ").append(illegalstateexception.getMessage()).toString());
                return false;
            }
            return false;
        }
        if (!ManifestUtils.isPermissionKnown("com.google.android.c2dm.permission.RECEIVE"))
        {
            Logger.error("com.google.android.c2dm.permission.RECEIVE is unknown to PackageManager. Note that an AVD emulator may not support GCM.");
            Logger.error("If you're running in an emulator, you need to install the appropriate image through the Android SDK and AVM manager. See http://developer.android.com/guide/google/gcm/ for further details.");
            return false;
        }
        if (UAirship.shared().getAirshipConfigOptions().gcmSender == null)
        {
            Logger.error("The GCM sender ID is not set. Unable to register.");
            return false;
        } else
        {
            return true;
        }
    }

    public static boolean register()
        throws IOException
    {
        Logger.verbose("Registering with GCM.");
        if (!isGCMAvailable())
        {
            return false;
        }
        Object obj1 = GoogleCloudMessaging.getInstance(UAirship.getApplicationContext());
        Object obj = UAirship.shared().getAirshipConfigOptions().getGCMSenderIds();
        Set set = PushManager.shared().getPreferences().getRegisteredGcmSenderIds();
        if (set != null && !set.equals(obj))
        {
            Logger.debug((new StringBuilder()).append("Unregistering GCM Sender IDs:  ").append(set).toString());
            ((GoogleCloudMessaging) (obj1)).unregister();
        }
        Logger.debug((new StringBuilder()).append("Registering GCM Sender IDs:  ").append(obj).toString());
        obj1 = ((GoogleCloudMessaging) (obj1)).register((String[])((Set) (obj)).toArray(new String[((Set) (obj)).size()]));
        if (obj1 != null)
        {
            Logger.info((new StringBuilder()).append("GCM registration successful. Registration ID: ").append(((String) (obj1))).toString());
            UAirship.shared().getPushManager().setGcmId(((String) (obj1)));
            UAirship.shared().getPushManager().getPreferences().setRegisteredGcmSenderIds(((Set) (obj)));
        }
        obj = new Intent("com.urbanairship.push.ACTION_PUSH_REGISTRATION_FINISHED");
        PushService.startServiceWithWakeLock(UAirship.getApplicationContext(), ((Intent) (obj)));
        return true;
    }
}
