// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.theholygrail.dingo.platform;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import io.theholygrail.dingo.JsonTransformer;
import io.theholygrail.jsbridge.JSLog;
import io.theholygrail.jsbridge.JSValue;

// Referenced classes of package io.theholygrail.dingo.platform:
//            PlatformBridge, Info

class val.callbackValue
    implements Runnable
{

    final PlatformBridge this$0;
    final JSValue val$callbackValue;

    public void run()
    {
        String s;
        String s2;
        int i;
        s = "Unknown";
        s2 = Build.MODEL;
        i = android.os._INT;
        String s1 = PlatformBridge.access$000(PlatformBridge.this).getPackageManager().getPackageInfo(PlatformBridge.access$000(PlatformBridge.this).getPackageName(), 0).versionName;
        s = s1;
_L2:
        if (val$callbackValue.isFunction().booleanValue())
        {
            Info info = new Info();
            info.appVersion = s;
            info.platform = String.valueOf(i);
            info.device = s2;
            s = PlatformBridge.access$200(PlatformBridge.this).toJson(info);
            val$callbackValue.callFunction(PlatformBridge.access$300(PlatformBridge.this), new Object[] {
                s
            }, null);
        }
        return;
        android.content.pm.meNotFoundException menotfoundexception;
        menotfoundexception;
        JSLog.d(PlatformBridge.access$100(), "Failed to get appversion: ", menotfoundexception);
        if (true) goto _L2; else goto _L1
_L1:
    }

    ception()
    {
        this$0 = final_platformbridge;
        val$callbackValue = JSValue.this;
        super();
    }
}
