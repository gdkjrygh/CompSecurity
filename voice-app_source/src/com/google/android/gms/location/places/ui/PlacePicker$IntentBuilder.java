// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places.ui;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.common.internal.safeparcel.zzc;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.maps.model.LatLngBounds;

// Referenced classes of package com.google.android.gms.location.places.ui:
//            PlacePicker

public static class ICES_VERSION_CODE
{

    private final Intent mIntent = new Intent("com.google.android.gms.location.places.ui.PICK_PLACE");

    public Intent build(Context context)
        throws GooglePlayServicesRepairableException, GooglePlayServicesNotAvailableException
    {
        GoogleApiAvailability.getInstance().zzZ(context);
        return mIntent;
    }

    public mIntent setLatLngBounds(LatLngBounds latlngbounds)
    {
        zzu.zzu(latlngbounds);
        zzc.zza(latlngbounds, mIntent, "latlng_bounds");
        return this;
    }

    public n()
    {
        mIntent.setPackage("com.google.android.gms");
        mIntent.putExtra("gmscore_client_jar_version", GoogleApiAvailability.GOOGLE_PLAY_SERVICES_VERSION_CODE);
    }
}
