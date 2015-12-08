// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;


// Referenced classes of package com.google.android.gms.maps.model:
//            CameraPosition, LatLng

public static final class zzaGS
{

    private LatLng zzaGP;
    private float zzaGQ;
    private float zzaGR;
    private float zzaGS;

    public zzaGS bearing(float f)
    {
        zzaGS = f;
        return this;
    }

    public CameraPosition build()
    {
        return new CameraPosition(zzaGP, zzaGQ, zzaGR, zzaGS);
    }

    public zzaGS target(LatLng latlng)
    {
        zzaGP = latlng;
        return this;
    }

    public zzaGP tilt(float f)
    {
        zzaGR = f;
        return this;
    }

    public zzaGR zoom(float f)
    {
        zzaGQ = f;
        return this;
    }

    public ()
    {
    }

    public (CameraPosition cameraposition)
    {
        zzaGP = cameraposition.target;
        zzaGQ = cameraposition.zoom;
        zzaGR = cameraposition.tilt;
        zzaGS = cameraposition.bearing;
    }
}
