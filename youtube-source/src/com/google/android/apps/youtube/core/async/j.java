// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.async;

import android.content.SharedPreferences;
import android.net.Uri;
import android.os.ConditionVariable;
import com.google.android.apps.youtube.common.L;
import com.google.android.apps.youtube.common.a.b;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.client.as;

// Referenced classes of package com.google.android.apps.youtube.core.async:
//            DeviceAuthorizerForV2Apis

public final class j
    implements b, DeviceAuthorizerForV2Apis
{

    private final as a;
    private final SharedPreferences b;
    private volatile boolean c;
    private final ConditionVariable d;
    private volatile com.google.android.apps.youtube.datalib.legacy.model.b e;
    private volatile DeviceAuthorizerForV2Apis.DeviceRegistrationException f;

    public j(as as1, SharedPreferences sharedpreferences)
    {
        a = (as)com.google.android.apps.youtube.common.fromguava.c.a(as1, "deviceRegistrationClient cannot be null");
        b = (SharedPreferences)com.google.android.apps.youtube.common.fromguava.c.a(sharedpreferences);
        e = com.google.android.apps.youtube.datalib.legacy.model.b.a(sharedpreferences, "");
        if (e == null)
        {
            as1 = new ConditionVariable(false);
        } else
        {
            as1 = null;
        }
        d = as1;
    }

    public final String a(Uri uri)
    {
        boolean flag;
        flag = true;
        if (e != null)
        {
            return e.a(uri);
        }
        this;
        JVM INSTR monitorenter ;
        if (c)
        {
            break MISSING_BLOCK_LABEL_91;
        }
        c = true;
        d.close();
_L1:
        this;
        JVM INSTR monitorexit ;
        if (flag)
        {
            a.a(this);
        } else
        {
            d.block();
        }
        if (f != null)
        {
            throw f;
        } else
        {
            return e.a(uri);
        }
        uri;
        throw uri;
        flag = false;
          goto _L1
    }

    public final void a(Object obj, Exception exception)
    {
        e = null;
        f = new DeviceAuthorizerForV2Apis.DeviceRegistrationException(exception);
        d.open();
        c = false;
        L.b("device registration failed");
    }

    public final void a(Object obj, Object obj1)
    {
        e = (com.google.android.apps.youtube.datalib.legacy.model.b)obj1;
        f = null;
        com.google.android.apps.youtube.datalib.legacy.model.b.a(e, b, "");
        d.open();
        c = false;
        L.e("device registered");
    }
}
