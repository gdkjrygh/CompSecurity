// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.maps.model:
//            zzb, LatLng

public final class CircleOptions
    implements SafeParcelable
{

    public static final zzb CREATOR = new zzb();
    private final int zzCY;
    private LatLng zzaCV;
    private double zzaCW;
    private float zzaCX;
    private int zzaCY;
    private int zzaCZ;
    private float zzaDa;
    private boolean zzaDb;

    public CircleOptions()
    {
        zzaCV = null;
        zzaCW = 0.0D;
        zzaCX = 10F;
        zzaCY = 0xff000000;
        zzaCZ = 0;
        zzaDa = 0.0F;
        zzaDb = true;
        zzCY = 1;
    }

    CircleOptions(int i, LatLng latlng, double d, float f, int j, int k, 
            float f1, boolean flag)
    {
        zzaCV = null;
        zzaCW = 0.0D;
        zzaCX = 10F;
        zzaCY = 0xff000000;
        zzaCZ = 0;
        zzaDa = 0.0F;
        zzaDb = true;
        zzCY = i;
        zzaCV = latlng;
        zzaCW = d;
        zzaCX = f;
        zzaCY = j;
        zzaCZ = k;
        zzaDa = f1;
        zzaDb = flag;
    }

    public CircleOptions center(LatLng latlng)
    {
        zzaCV = latlng;
        return this;
    }

    public int describeContents()
    {
        return 0;
    }

    public CircleOptions fillColor(int i)
    {
        zzaCZ = i;
        return this;
    }

    public LatLng getCenter()
    {
        return zzaCV;
    }

    public int getFillColor()
    {
        return zzaCZ;
    }

    public double getRadius()
    {
        return zzaCW;
    }

    public int getStrokeColor()
    {
        return zzaCY;
    }

    public float getStrokeWidth()
    {
        return zzaCX;
    }

    int getVersionCode()
    {
        return zzCY;
    }

    public float getZIndex()
    {
        return zzaDa;
    }

    public boolean isVisible()
    {
        return zzaDb;
    }

    public CircleOptions radius(double d)
    {
        zzaCW = d;
        return this;
    }

    public CircleOptions strokeColor(int i)
    {
        zzaCY = i;
        return this;
    }

    public CircleOptions strokeWidth(float f)
    {
        zzaCX = f;
        return this;
    }

    public CircleOptions visible(boolean flag)
    {
        zzaDb = flag;
        return this;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzb.zza(this, parcel, i);
    }

    public CircleOptions zIndex(float f)
    {
        zzaDa = f;
        return this;
    }

}
