// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.support.v4.content.LocalBroadcastManager;
import com.baidu.android.pushservice.PushManager;
import com.baidu.android.pushservice.PushService;
import com.baidu.android.pushservice.PushServiceReceiver;
import com.baidu.android.pushservice.RegistrationReceiver;
import com.ubercab.push.internal.receiver.RegisterReceiver;
import com.ubercab.push.internal.receiver.UnregisterReceiver;
import com.ubercab.push.internal.vendor.baidu.BaiduPushMessageReceiver;

public final class hbd
    implements hba
{

    private final Context a;
    private final haz b;

    public hbd(Context context, haz haz1)
    {
        a = context;
        b = haz1;
        b();
    }

    public static Intent a(String s)
    {
        return RegisterReceiver.a("com.ubercab.push.BAIDU_REGISTRATION_RESULT", s);
    }

    public static Intent a(boolean flag)
    {
        return UnregisterReceiver.a("com.ubercab.push.BAIDU_UNREGISTRATION_RESULT", flag);
    }

    private void b()
    {
        PackageManager packagemanager = a.getPackageManager();
        packagemanager.setComponentEnabledSetting(new ComponentName(a, com/ubercab/push/internal/vendor/baidu/BaiduPushMessageReceiver), 1, 1);
        packagemanager.setComponentEnabledSetting(new ComponentName(a, com/baidu/android/pushservice/PushServiceReceiver), 1, 1);
        packagemanager.setComponentEnabledSetting(new ComponentName(a, com/baidu/android/pushservice/RegistrationReceiver), 1, 1);
        packagemanager.setComponentEnabledSetting(new ComponentName(a, com/baidu/android/pushservice/PushService), 1, 1);
    }

    public final void a(hay hay)
    {
        hay = b.a(hav.a, hay);
        LocalBroadcastManager.getInstance(a).registerReceiver(hay, new IntentFilter("com.ubercab.push.BAIDU_UNREGISTRATION_RESULT"));
        PushManager.stopWork(a);
    }

    public final void a(String s, hax hax)
    {
        hax = b.a(hav.a, hax);
        LocalBroadcastManager.getInstance(a).registerReceiver(hax, new IntentFilter("com.ubercab.push.BAIDU_REGISTRATION_RESULT"));
        PushManager.startWork(a, 0, s);
    }

    public final boolean a()
    {
        return true;
    }
}
