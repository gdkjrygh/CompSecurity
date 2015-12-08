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
    private final int mVersionCode;
    private Boolean zzaFI;
    private Boolean zzaFJ;
    private int zzaFK;
    private CameraPosition zzaFL;
    private Boolean zzaFM;
    private Boolean zzaFN;
    private Boolean zzaFO;
    private Boolean zzaFP;
    private Boolean zzaFQ;
    private Boolean zzaFR;
    private Boolean zzaFS;
    private Boolean zzaFT;

    public GoogleMapOptions()
    {
        zzaFK = -1;
        mVersionCode = 1;
    }

    GoogleMapOptions(int i, byte byte0, byte byte1, int j, CameraPosition cameraposition, byte byte2, byte byte3, 
            byte byte4, byte byte5, byte byte6, byte byte7, byte byte8, byte byte9)
    {
        zzaFK = -1;
        mVersionCode = i;
        zzaFI = zza.zza(byte0);
        zzaFJ = zza.zza(byte1);
        zzaFK = j;
        zzaFL = cameraposition;
        zzaFM = zza.zza(byte2);
        zzaFN = zza.zza(byte3);
        zzaFO = zza.zza(byte4);
        zzaFP = zza.zza(byte5);
        zzaFQ = zza.zza(byte6);
        zzaFR = zza.zza(byte7);
        zzaFS = zza.zza(byte8);
        zzaFT = zza.zza(byte9);
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
        zzaFL = cameraposition;
        return this;
    }

    public GoogleMapOptions compassEnabled(boolean flag)
    {
        zzaFN = Boolean.valueOf(flag);
        return this;
    }

    public int describeContents()
    {
        return 0;
    }

    public CameraPosition getCamera()
    {
        return zzaFL;
    }

    public Boolean getCompassEnabled()
    {
        return zzaFN;
    }

    public Boolean getLiteMode()
    {
        return zzaFS;
    }

    public Boolean getMapToolbarEnabled()
    {
        return zzaFT;
    }

    public int getMapType()
    {
        return zzaFK;
    }

    public Boolean getRotateGesturesEnabled()
    {
        return zzaFR;
    }

    public Boolean getScrollGesturesEnabled()
    {
        return zzaFO;
    }

    public Boolean getTiltGesturesEnabled()
    {
        return zzaFQ;
    }

    public Boolean getUseViewLifecycleInFragment()
    {
        return zzaFJ;
    }

    int getVersionCode()
    {
        return mVersionCode;
    }

    public Boolean getZOrderOnTop()
    {
        return zzaFI;
    }

    public Boolean getZoomControlsEnabled()
    {
        return zzaFM;
    }

    public Boolean getZoomGesturesEnabled()
    {
        return zzaFP;
    }

    public GoogleMapOptions liteMode(boolean flag)
    {
        zzaFS = Boolean.valueOf(flag);
        return this;
    }

    public GoogleMapOptions mapToolbarEnabled(boolean flag)
    {
        zzaFT = Boolean.valueOf(flag);
        return this;
    }

    public GoogleMapOptions mapType(int i)
    {
        zzaFK = i;
        return this;
    }

    public GoogleMapOptions rotateGesturesEnabled(boolean flag)
    {
        zzaFR = Boolean.valueOf(flag);
        return this;
    }

    public GoogleMapOptions scrollGesturesEnabled(boolean flag)
    {
        zzaFO = Boolean.valueOf(flag);
        return this;
    }

    public GoogleMapOptions tiltGesturesEnabled(boolean flag)
    {
        zzaFQ = Boolean.valueOf(flag);
        return this;
    }

    public GoogleMapOptions useViewLifecycleInFragment(boolean flag)
    {
        zzaFJ = Boolean.valueOf(flag);
        return this;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        com.google.android.gms.maps.zza.zza(this, parcel, i);
    }

    public GoogleMapOptions zOrderOnTop(boolean flag)
    {
        zzaFI = Boolean.valueOf(flag);
        return this;
    }

    public GoogleMapOptions zoomControlsEnabled(boolean flag)
    {
        zzaFM = Boolean.valueOf(flag);
        return this;
    }

    public GoogleMapOptions zoomGesturesEnabled(boolean flag)
    {
        zzaFP = Boolean.valueOf(flag);
        return this;
    }

    byte zzwE()
    {
        return zza.zze(zzaFI);
    }

    byte zzwF()
    {
        return zza.zze(zzaFJ);
    }

    byte zzwG()
    {
        return zza.zze(zzaFM);
    }

    byte zzwH()
    {
        return zza.zze(zzaFN);
    }

    byte zzwI()
    {
        return zza.zze(zzaFO);
    }

    byte zzwJ()
    {
        return zza.zze(zzaFP);
    }

    byte zzwK()
    {
        return zza.zze(zzaFQ);
    }

    byte zzwL()
    {
        return zza.zze(zzaFR);
    }

    byte zzwM()
    {
        return zza.zze(zzaFS);
    }

    byte zzwN()
    {
        return zza.zze(zzaFT);
    }

}
