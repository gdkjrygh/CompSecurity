// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.dynamic.zza;
import com.google.android.gms.maps.internal.IMapViewDelegate;
import com.google.android.gms.maps.model.RuntimeRemoteException;

// Referenced classes of package com.google.android.gms.maps:
//            GoogleMapOptions, GoogleMap, OnMapReadyCallback

public class MapView extends FrameLayout
{

    private GoogleMap zzaFV;
    private final zzb zzaGb;

    public MapView(Context context)
    {
        super(context);
    /* block-local class not found */
    class zzb {}

        zzaGb = new zzb(context, null);
        init();
    }

    public MapView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        zzaGb = new zzb(context, GoogleMapOptions.createFromAttributes(context, attributeset));
        init();
    }

    public MapView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        zzaGb = new zzb(context, GoogleMapOptions.createFromAttributes(context, attributeset));
        init();
    }

    public MapView(Context context, GoogleMapOptions googlemapoptions)
    {
        super(context);
        zzaGb = new zzb(context, googlemapoptions);
        init();
    }

    private void init()
    {
        setClickable(true);
    }

    public final GoogleMap getMap()
    {
        if (zzaFV != null)
        {
            return zzaFV;
        }
        zzaGb.zzwP();
        if (zzaGb.zzrn() == null)
        {
            return null;
        }
    /* block-local class not found */
    class zza {}

        try
        {
            zzaFV = new GoogleMap(((zza)zzaGb.zzrn()).zzwQ().getMap());
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return zzaFV;
    }

    public void getMapAsync(OnMapReadyCallback onmapreadycallback)
    {
        zzx.zzch("getMapAsync() must be called on the main thread");
        zzaGb.getMapAsync(onmapreadycallback);
    }

    public final void onCreate(Bundle bundle)
    {
        zzaGb.onCreate(bundle);
        if (zzaGb.zzrn() == null)
        {
            com.google.android.gms.dynamic.zza.zzb(this);
        }
    }

    public final void onDestroy()
    {
        zzaGb.onDestroy();
    }

    public final void onLowMemory()
    {
        zzaGb.onLowMemory();
    }

    public final void onPause()
    {
        zzaGb.onPause();
    }

    public final void onResume()
    {
        zzaGb.onResume();
    }

    public final void onSaveInstanceState(Bundle bundle)
    {
        zzaGb.onSaveInstanceState(bundle);
    }
}
