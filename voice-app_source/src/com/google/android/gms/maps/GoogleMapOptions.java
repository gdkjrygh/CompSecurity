// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.util.AttributeSet;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.internal.zza;
import com.google.android.gms.maps.model.CameraPosition;

// Referenced classes of package com.google.android.gms.maps:
//            zza

public final class GoogleMapOptions
    implements SafeParcelable
{

    public static final com.google.android.gms.maps.zza CREATOR = new com.google.android.gms.maps.zza();
    private final int zzCY;
    private Boolean zzaBI;
    private Boolean zzaBJ;
    private int zzaBK;
    private CameraPosition zzaBL;
    private Boolean zzaBM;
    private Boolean zzaBN;
    private Boolean zzaBO;
    private Boolean zzaBP;
    private Boolean zzaBQ;
    private Boolean zzaBR;
    private Boolean zzaBS;
    private Boolean zzaBT;

    public GoogleMapOptions()
    {
        zzaBK = -1;
        zzCY = 1;
    }

    GoogleMapOptions(int i, byte byte0, byte byte1, int j, CameraPosition cameraposition, byte byte2, byte byte3, 
            byte byte4, byte byte5, byte byte6, byte byte7, byte byte8, byte byte9)
    {
        zzaBK = -1;
        zzCY = i;
        zzaBI = zza.zza(byte0);
        zzaBJ = zza.zza(byte1);
        zzaBK = j;
        zzaBL = cameraposition;
        zzaBM = zza.zza(byte2);
        zzaBN = zza.zza(byte3);
        zzaBO = zza.zza(byte4);
        zzaBP = zza.zza(byte5);
        zzaBQ = zza.zza(byte6);
        zzaBR = zza.zza(byte7);
        zzaBS = zza.zza(byte8);
        zzaBT = zza.zza(byte9);
    }

    public static GoogleMapOptions createFromAttributes(Context context, AttributeSet attributeset)
    {
        if (attributeset == null)
        {
            return null;
        }
        TypedArray typedarray = context.getResources().obtainAttributes(attributeset, com.google.android.gms.R.styleable.MapAttrs);
        GoogleMapOptions googlemapoptions = new GoogleMapOptions();
        if (typedarray.hasValue(com.google.android.gms.R.styleable.MapAttrs_mapType))
        {
            googlemapoptions.mapType(typedarray.getInt(com.google.android.gms.R.styleable.MapAttrs_mapType, -1));
        }
        if (typedarray.hasValue(com.google.android.gms.R.styleable.MapAttrs_zOrderOnTop))
        {
            googlemapoptions.zOrderOnTop(typedarray.getBoolean(com.google.android.gms.R.styleable.MapAttrs_zOrderOnTop, false));
        }
        if (typedarray.hasValue(com.google.android.gms.R.styleable.MapAttrs_useViewLifecycle))
        {
            googlemapoptions.useViewLifecycleInFragment(typedarray.getBoolean(com.google.android.gms.R.styleable.MapAttrs_useViewLifecycle, false));
        }
        if (typedarray.hasValue(com.google.android.gms.R.styleable.MapAttrs_uiCompass))
        {
            googlemapoptions.compassEnabled(typedarray.getBoolean(com.google.android.gms.R.styleable.MapAttrs_uiCompass, true));
        }
        if (typedarray.hasValue(com.google.android.gms.R.styleable.MapAttrs_uiRotateGestures))
        {
            googlemapoptions.rotateGesturesEnabled(typedarray.getBoolean(com.google.android.gms.R.styleable.MapAttrs_uiRotateGestures, true));
        }
        if (typedarray.hasValue(com.google.android.gms.R.styleable.MapAttrs_uiScrollGestures))
        {
            googlemapoptions.scrollGesturesEnabled(typedarray.getBoolean(com.google.android.gms.R.styleable.MapAttrs_uiScrollGestures, true));
        }
        if (typedarray.hasValue(com.google.android.gms.R.styleable.MapAttrs_uiTiltGestures))
        {
            googlemapoptions.tiltGesturesEnabled(typedarray.getBoolean(com.google.android.gms.R.styleable.MapAttrs_uiTiltGestures, true));
        }
        if (typedarray.hasValue(com.google.android.gms.R.styleable.MapAttrs_uiZoomGestures))
        {
            googlemapoptions.zoomGesturesEnabled(typedarray.getBoolean(com.google.android.gms.R.styleable.MapAttrs_uiZoomGestures, true));
        }
        if (typedarray.hasValue(com.google.android.gms.R.styleable.MapAttrs_uiZoomControls))
        {
            googlemapoptions.zoomControlsEnabled(typedarray.getBoolean(com.google.android.gms.R.styleable.MapAttrs_uiZoomControls, true));
        }
        if (typedarray.hasValue(com.google.android.gms.R.styleable.MapAttrs_liteMode))
        {
            googlemapoptions.liteMode(typedarray.getBoolean(com.google.android.gms.R.styleable.MapAttrs_liteMode, false));
        }
        if (typedarray.hasValue(com.google.android.gms.R.styleable.MapAttrs_uiMapToolbar))
        {
            googlemapoptions.mapToolbarEnabled(typedarray.getBoolean(com.google.android.gms.R.styleable.MapAttrs_uiMapToolbar, true));
        }
        googlemapoptions.camera(CameraPosition.createFromAttributes(context, attributeset));
        typedarray.recycle();
        return googlemapoptions;
    }

    public GoogleMapOptions camera(CameraPosition cameraposition)
    {
        zzaBL = cameraposition;
        return this;
    }

    public GoogleMapOptions compassEnabled(boolean flag)
    {
        zzaBN = Boolean.valueOf(flag);
        return this;
    }

    public int describeContents()
    {
        return 0;
    }

    public CameraPosition getCamera()
    {
        return zzaBL;
    }

    public Boolean getCompassEnabled()
    {
        return zzaBN;
    }

    public Boolean getLiteMode()
    {
        return zzaBS;
    }

    public Boolean getMapToolbarEnabled()
    {
        return zzaBT;
    }

    public int getMapType()
    {
        return zzaBK;
    }

    public Boolean getRotateGesturesEnabled()
    {
        return zzaBR;
    }

    public Boolean getScrollGesturesEnabled()
    {
        return zzaBO;
    }

    public Boolean getTiltGesturesEnabled()
    {
        return zzaBQ;
    }

    public Boolean getUseViewLifecycleInFragment()
    {
        return zzaBJ;
    }

    int getVersionCode()
    {
        return zzCY;
    }

    public Boolean getZOrderOnTop()
    {
        return zzaBI;
    }

    public Boolean getZoomControlsEnabled()
    {
        return zzaBM;
    }

    public Boolean getZoomGesturesEnabled()
    {
        return zzaBP;
    }

    public GoogleMapOptions liteMode(boolean flag)
    {
        zzaBS = Boolean.valueOf(flag);
        return this;
    }

    public GoogleMapOptions mapToolbarEnabled(boolean flag)
    {
        zzaBT = Boolean.valueOf(flag);
        return this;
    }

    public GoogleMapOptions mapType(int i)
    {
        zzaBK = i;
        return this;
    }

    public GoogleMapOptions rotateGesturesEnabled(boolean flag)
    {
        zzaBR = Boolean.valueOf(flag);
        return this;
    }

    public GoogleMapOptions scrollGesturesEnabled(boolean flag)
    {
        zzaBO = Boolean.valueOf(flag);
        return this;
    }

    public GoogleMapOptions tiltGesturesEnabled(boolean flag)
    {
        zzaBQ = Boolean.valueOf(flag);
        return this;
    }

    public GoogleMapOptions useViewLifecycleInFragment(boolean flag)
    {
        zzaBJ = Boolean.valueOf(flag);
        return this;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        com.google.android.gms.maps.zza.zza(this, parcel, i);
    }

    public GoogleMapOptions zOrderOnTop(boolean flag)
    {
        zzaBI = Boolean.valueOf(flag);
        return this;
    }

    public GoogleMapOptions zoomControlsEnabled(boolean flag)
    {
        zzaBM = Boolean.valueOf(flag);
        return this;
    }

    public GoogleMapOptions zoomGesturesEnabled(boolean flag)
    {
        zzaBP = Boolean.valueOf(flag);
        return this;
    }

    byte zzvj()
    {
        return zza.zze(zzaBI);
    }

    byte zzvk()
    {
        return zza.zze(zzaBJ);
    }

    byte zzvl()
    {
        return zza.zze(zzaBM);
    }

    byte zzvm()
    {
        return zza.zze(zzaBN);
    }

    byte zzvn()
    {
        return zza.zze(zzaBO);
    }

    byte zzvo()
    {
        return zza.zze(zzaBP);
    }

    byte zzvp()
    {
        return zza.zze(zzaBQ);
    }

    byte zzvq()
    {
        return zza.zze(zzaBR);
    }

    byte zzvr()
    {
        return zza.zze(zzaBS);
    }

    byte zzvs()
    {
        return zza.zze(zzaBT);
    }

}
