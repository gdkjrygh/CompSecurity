// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.internal;

import android.app.PendingIntent;
import android.location.Location;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.ActivityRecognitionResult;
import com.google.android.gms.location.GeofencingRequest;
import com.google.android.gms.location.GestureRequest;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.location.r;
import java.util.List;

// Referenced classes of package com.google.android.gms.location.internal:
//            i, o, LocationRequestInternal, LocationRequestUpdateData

public interface l
    extends IInterface
{

    public abstract Location a();

    public abstract Status a(GestureRequest gesturerequest, PendingIntent pendingintent);

    public abstract ActivityRecognitionResult a(String s);

    public abstract void a(long l1, boolean flag, PendingIntent pendingintent);

    public abstract void a(PendingIntent pendingintent);

    public abstract void a(PendingIntent pendingintent, i i, String s);

    public abstract void a(Location location);

    public abstract void a(Location location, int i);

    public abstract void a(GeofencingRequest geofencingrequest, PendingIntent pendingintent, i i);

    public abstract void a(LocationRequest locationrequest, PendingIntent pendingintent);

    public abstract void a(LocationRequest locationrequest, r r);

    public abstract void a(LocationRequest locationrequest, r r, String s);

    public abstract void a(LocationSettingsRequest locationsettingsrequest, o o, String s);

    public abstract void a(LocationRequestInternal locationrequestinternal, PendingIntent pendingintent);

    public abstract void a(LocationRequestInternal locationrequestinternal, r r);

    public abstract void a(LocationRequestUpdateData locationrequestupdatedata);

    public abstract void a(i i, String s);

    public abstract void a(r r);

    public abstract void a(List list, PendingIntent pendingintent, i i, String s);

    public abstract void a(boolean flag);

    public abstract void a(String as[], i i, String s);

    public abstract Location b(String s);

    public abstract IBinder b();

    public abstract Status b(PendingIntent pendingintent);

    public abstract Status c(PendingIntent pendingintent);

    public abstract LocationAvailability c(String s);

    public abstract Status d(PendingIntent pendingintent);

    public abstract void e(PendingIntent pendingintent);
}
