// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcuni.nbc.thevoice;

import android.app.Application;
import com.crashlytics.android.Crashlytics;
import com.urbanairship.AirshipConfigOptions;
import com.urbanairship.UAirship;
import com.urbanairship.push.PushManager;
import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Kit;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.TimeZone;

// Referenced classes of package com.nbcuni.nbc.thevoice:
//            IntentReceiver

public class UATakeOff extends Application
{

    public UATakeOff()
    {
    }

    public String getTimeZone()
    {
        return TimeZone.getDefault().getDisplayName(false, 0, Locale.US);
    }

    public void onCreate()
    {
        super.onCreate();
        Fabric.with(this, new Kit[] {
            new Crashlytics()
        });
        UAirship.takeOff(this, AirshipConfigOptions.loadDefaultOptions(this));
        HashSet hashset = new HashSet();
        hashset.add(getTimeZone());
        PushManager.shared().setTags(hashset);
        PushManager.enablePush();
        PushManager.shared().setIntentReceiver(com/nbcuni/nbc/thevoice/IntentReceiver);
    }
}
