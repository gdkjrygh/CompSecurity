// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.api;

import android.util.Pair;
import com.google.android.apps.youtube.common.a.b;
import com.google.android.apps.youtube.common.fromguava.c;

// Referenced classes of package com.google.android.apps.youtube.api:
//            ApiDeviceRegistrationClientForV2Apis

final class g
    implements b
{

    final ApiDeviceRegistrationClientForV2Apis a;
    private final b b;

    public g(ApiDeviceRegistrationClientForV2Apis apideviceregistrationclientforv2apis, b b1)
    {
        a = apideviceregistrationclientforv2apis;
        super();
        b = (b)c.a(b1);
    }

    public final volatile void a(Object obj, Exception exception)
    {
        obj = (Pair)obj;
        b.a(((Pair) (obj)).first, exception);
    }

    public final volatile void a(Object obj, Object obj1)
    {
        obj = (Pair)obj;
        obj1 = (com.google.android.apps.youtube.datalib.legacy.model.b)obj1;
        b.a(((Pair) (obj)).first, obj1);
    }
}
