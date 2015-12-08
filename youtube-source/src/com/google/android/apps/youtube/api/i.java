// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.api;

import android.net.Uri;
import android.util.Base64;
import android.util.Pair;
import com.google.android.apps.youtube.common.a.b;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.async.af;

// Referenced classes of package com.google.android.apps.youtube.api:
//            ApiDeviceRegistrationClientForV2Apis, g

final class i
    implements b
{

    final ApiDeviceRegistrationClientForV2Apis a;
    private final b b;

    public i(ApiDeviceRegistrationClientForV2Apis apideviceregistrationclientforv2apis, b b1)
    {
        a = apideviceregistrationclientforv2apis;
        super();
        b = (b)c.a(b1);
    }

    public final volatile void a(Object obj, Exception exception)
    {
        obj = (Uri)obj;
        b.a(obj, exception);
    }

    public final void a(Object obj, Object obj1)
    {
        obj = (com.google.android.apps.youtube.datalib.legacy.model.b)obj1;
        obj1 = Base64.encodeToString(ApiDeviceRegistrationClientForV2Apis.a(a), 10);
        obj1 = Uri.parse(String.format("https://www.google.com/youtube/accounts/registerDevice?type=ANDROID_PLAYER_API&developer=%s&fingerprint=%s&serialNumber=%s", new Object[] {
            com.google.android.apps.youtube.api.ApiDeviceRegistrationClientForV2Apis.b(a), obj1, com.google.android.apps.youtube.api.ApiDeviceRegistrationClientForV2Apis.c(a)
        }));
        ApiDeviceRegistrationClientForV2Apis.d(a).a(Pair.create(obj1, obj), new g(a, b));
    }
}
