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
import com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate;
import com.google.android.gms.maps.model.RuntimeRemoteException;

// Referenced classes of package com.google.android.gms.maps:
//            StreetViewPanorama, StreetViewPanoramaOptions, OnStreetViewPanoramaReadyCallback

public class StreetViewPanoramaView extends FrameLayout
{

    private final zzb zzaGC;
    private StreetViewPanorama zzaGq;

    public StreetViewPanoramaView(Context context)
    {
        super(context);
    /* block-local class not found */
    class zzb {}

        zzaGC = new zzb(context, null);
    }

    public StreetViewPanoramaView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        zzaGC = new zzb(context, null);
    }

    public StreetViewPanoramaView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        zzaGC = new zzb(context, null);
    }

    public StreetViewPanoramaView(Context context, StreetViewPanoramaOptions streetviewpanoramaoptions)
    {
        super(context);
        zzaGC = new zzb(context, streetviewpanoramaoptions);
    }

    public final StreetViewPanorama getStreetViewPanorama()
    {
        if (zzaGq != null)
        {
            return zzaGq;
        }
        zzaGC.zzwP();
        if (zzaGC.zzrn() == null)
        {
            return null;
        }
    /* block-local class not found */
    class zza {}

        try
        {
            zzaGq = new StreetViewPanorama(((zza)zzaGC.zzrn()).zzwW().getStreetViewPanorama());
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return zzaGq;
    }

    public void getStreetViewPanoramaAsync(OnStreetViewPanoramaReadyCallback onstreetviewpanoramareadycallback)
    {
        zzx.zzch("getStreetViewPanoramaAsync() must be called on the main thread");
        zzaGC.getStreetViewPanoramaAsync(onstreetviewpanoramareadycallback);
    }

    public final void onCreate(Bundle bundle)
    {
        zzaGC.onCreate(bundle);
        if (zzaGC.zzrn() == null)
        {
            com.google.android.gms.dynamic.zza.zzb(this);
        }
    }

    public final void onDestroy()
    {
        zzaGC.onDestroy();
    }

    public final void onLowMemory()
    {
        zzaGC.onLowMemory();
    }

    public final void onPause()
    {
        zzaGC.onPause();
    }

    public final void onResume()
    {
        zzaGC.onResume();
    }

    public final void onSaveInstanceState(Bundle bundle)
    {
        zzaGC.onSaveInstanceState(bundle);
    }
}
