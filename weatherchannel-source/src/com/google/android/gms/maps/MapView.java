// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.dynamic.zza;
import com.google.android.gms.maps.internal.IMapViewDelegate;
import com.google.android.gms.maps.model.RuntimeRemoteException;

// Referenced classes of package com.google.android.gms.maps:
//            GoogleMapOptions, GoogleMap, OnMapReadyCallback

public class MapView extends FrameLayout
{

    private GoogleMap zzaBV;
    private final zzb zzaCb;

    public MapView(Context context)
    {
        super(context);
    /* block-local class not found */
    class zzb {}

        zzaCb = new zzb(context, null);
        init();
    }

    public MapView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        zzaCb = new zzb(context, GoogleMapOptions.createFromAttributes(context, attributeset));
        init();
    }

    public MapView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        zzaCb = new zzb(context, GoogleMapOptions.createFromAttributes(context, attributeset));
        init();
    }

    public MapView(Context context, GoogleMapOptions googlemapoptions)
    {
        super(context);
        zzaCb = new zzb(context, googlemapoptions);
        init();
    }

    private void init()
    {
        setClickable(true);
    }

    public final GoogleMap getMap()
    {
        if (zzaBV != null)
        {
            return zzaBV;
        }
        zzaCb.zzvu();
        if (zzaCb.zzqj() == null)
        {
            return null;
        }
    /* block-local class not found */
    class zza {}

        try
        {
            zzaBV = new GoogleMap(((zza)zzaCb.zzqj()).zzvv().getMap());
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return zzaBV;
    }

    public void getMapAsync(OnMapReadyCallback onmapreadycallback)
    {
        zzu.zzbY("getMapAsync() must be called on the main thread");
        zzaCb.getMapAsync(onmapreadycallback);
    }

    public final void onCreate(Bundle bundle)
    {
        zzaCb.onCreate(bundle);
        if (zzaCb.zzqj() == null)
        {
            com.google.android.gms.dynamic.zza.zzb(this);
        }
    }

    public final void onDestroy()
    {
        zzaCb.onDestroy();
    }

    public final void onLowMemory()
    {
        zzaCb.onLowMemory();
    }

    public final void onPause()
    {
        zzaCb.onPause();
    }

    public final void onResume()
    {
        zzaCb.onResume();
    }

    public final void onSaveInstanceState(Bundle bundle)
    {
        zzaCb.onSaveInstanceState(bundle);
    }
}
