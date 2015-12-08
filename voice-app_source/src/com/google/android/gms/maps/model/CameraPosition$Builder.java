// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;


// Referenced classes of package com.google.android.gms.maps.model:
//            CameraPosition, LatLng

public static final class zzaCT
{

    private LatLng zzaCQ;
    private float zzaCR;
    private float zzaCS;
    private float zzaCT;

    public zzaCT bearing(float f)
    {
        zzaCT = f;
        return this;
    }

    public CameraPosition build()
    {
        return new CameraPosition(zzaCQ, zzaCR, zzaCS, zzaCT);
    }

    public zzaCT target(LatLng latlng)
    {
        zzaCQ = latlng;
        return this;
    }

    public zzaCQ tilt(float f)
    {
        zzaCS = f;
        return this;
    }

    public zzaCS zoom(float f)
    {
        zzaCR = f;
        return this;
    }

    public ()
    {
    }

    public (CameraPosition cameraposition)
    {
        zzaCQ = cameraposition.target;
        zzaCR = cameraposition.zoom;
        zzaCS = cameraposition.tilt;
        zzaCT = cameraposition.bearing;
    }
}
