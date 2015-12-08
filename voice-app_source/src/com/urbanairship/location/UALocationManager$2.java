// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.urbanairship.location;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.urbanairship.Logger;

// Referenced classes of package com.urbanairship.location:
//            UALocationManager

static final class b
    implements ServiceConnection
{

    public void onServiceConnected(ComponentName componentname, IBinder ibinder)
    {
        ILocationService _tmp = UALocationManager.access$402(b.asInterface(ibinder));
        boolean _tmp1 = UALocationManager.access$502(true);
        if (UALocationManager.access$600(UALocationManager.access$000()) != null)
        {
            UALocationManager.access$700().sendBroadcast((new Intent(UALocationManager.access$700(), UALocationManager.access$600(UALocationManager.access$000()))).setAction("com.urbanairship.location.LOCATION_SERVICE_BOUND"));
        }
    }

    public void onServiceDisconnected(ComponentName componentname)
    {
        ILocationService _tmp = UALocationManager.access$402(null);
        boolean _tmp1 = UALocationManager.access$502(false);
        if (UALocationManager.access$600(UALocationManager.access$000()) != null)
        {
            UALocationManager.access$700().sendBroadcast((new Intent(UALocationManager.access$700(), UALocationManager.access$600(UALocationManager.access$000()))).setAction("com.urbanairship.location.LOCATION_SERVICE_UNBOUND"));
        }
        Logger.info("LocationService unbound.");
    }

    b()
    {
    }
}
