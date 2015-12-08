// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.dynamic.zzd;

// Referenced classes of package com.google.android.gms.maps.model:
//            zzf, BitmapDescriptor, LatLng

public final class MarkerOptions
    implements SafeParcelable
{

    public static final zzf CREATOR = new zzf();
    private float mAlpha;
    private final int zzCY;
    private LatLng zzaCx;
    private boolean zzaDb;
    private float zzaDj;
    private float zzaDk;
    private String zzaDs;
    private BitmapDescriptor zzaDt;
    private boolean zzaDu;
    private boolean zzaDv;
    private float zzaDw;
    private float zzaDx;
    private float zzaDy;
    private String zzadv;

    public MarkerOptions()
    {
        zzaDj = 0.5F;
        zzaDk = 1.0F;
        zzaDb = true;
        zzaDv = false;
        zzaDw = 0.0F;
        zzaDx = 0.5F;
        zzaDy = 0.0F;
        mAlpha = 1.0F;
        zzCY = 1;
    }

    MarkerOptions(int i, LatLng latlng, String s, String s1, IBinder ibinder, float f, float f1, 
            boolean flag, boolean flag1, boolean flag2, float f2, float f3, float f4, float f5)
    {
        zzaDj = 0.5F;
        zzaDk = 1.0F;
        zzaDb = true;
        zzaDv = false;
        zzaDw = 0.0F;
        zzaDx = 0.5F;
        zzaDy = 0.0F;
        mAlpha = 1.0F;
        zzCY = i;
        zzaCx = latlng;
        zzadv = s;
        zzaDs = s1;
        if (ibinder == null)
        {
            latlng = null;
        } else
        {
            latlng = new BitmapDescriptor(com.google.android.gms.dynamic.zzd.zza.zzbg(ibinder));
        }
        zzaDt = latlng;
        zzaDj = f;
        zzaDk = f1;
        zzaDu = flag;
        zzaDb = flag1;
        zzaDv = flag2;
        zzaDw = f2;
        zzaDx = f3;
        zzaDy = f4;
        mAlpha = f5;
    }

    public MarkerOptions alpha(float f)
    {
        mAlpha = f;
        return this;
    }

    public MarkerOptions anchor(float f, float f1)
    {
        zzaDj = f;
        zzaDk = f1;
        return this;
    }

    public int describeContents()
    {
        return 0;
    }

    public MarkerOptions draggable(boolean flag)
    {
        zzaDu = flag;
        return this;
    }

    public MarkerOptions flat(boolean flag)
    {
        zzaDv = flag;
        return this;
    }

    public float getAlpha()
    {
        return mAlpha;
    }

    public float getAnchorU()
    {
        return zzaDj;
    }

    public float getAnchorV()
    {
        return zzaDk;
    }

    public BitmapDescriptor getIcon()
    {
        return zzaDt;
    }

    public float getInfoWindowAnchorU()
    {
        return zzaDx;
    }

    public float getInfoWindowAnchorV()
    {
        return zzaDy;
    }

    public LatLng getPosition()
    {
        return zzaCx;
    }

    public float getRotation()
    {
        return zzaDw;
    }

    public String getSnippet()
    {
        return zzaDs;
    }

    public String getTitle()
    {
        return zzadv;
    }

    int getVersionCode()
    {
        return zzCY;
    }

    public MarkerOptions icon(BitmapDescriptor bitmapdescriptor)
    {
        zzaDt = bitmapdescriptor;
        return this;
    }

    public MarkerOptions infoWindowAnchor(float f, float f1)
    {
        zzaDx = f;
        zzaDy = f1;
        return this;
    }

    public boolean isDraggable()
    {
        return zzaDu;
    }

    public boolean isFlat()
    {
        return zzaDv;
    }

    public boolean isVisible()
    {
        return zzaDb;
    }

    public MarkerOptions position(LatLng latlng)
    {
        zzaCx = latlng;
        return this;
    }

    public MarkerOptions rotation(float f)
    {
        zzaDw = f;
        return this;
    }

    public MarkerOptions snippet(String s)
    {
        zzaDs = s;
        return this;
    }

    public MarkerOptions title(String s)
    {
        zzadv = s;
        return this;
    }

    public MarkerOptions visible(boolean flag)
    {
        zzaDb = flag;
        return this;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzf.zza(this, parcel, i);
    }

    IBinder zzvJ()
    {
        if (zzaDt == null)
        {
            return null;
        } else
        {
            return zzaDt.zzvg().asBinder();
        }
    }

}
