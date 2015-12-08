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
import com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate;
import com.google.android.gms.maps.model.RuntimeRemoteException;

// Referenced classes of package com.google.android.gms.maps:
//            StreetViewPanorama, StreetViewPanoramaOptions, OnStreetViewPanoramaReadyCallback

public class StreetViewPanoramaView extends FrameLayout
{

    private final zzb zzaCC;
    private StreetViewPanorama zzaCq;

    public StreetViewPanoramaView(Context context)
    {
        super(context);
    /* block-local class not found */
    class zzb {}

        zzaCC = new zzb(context, null);
    }

    public StreetViewPanoramaView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        zzaCC = new zzb(context, null);
    }

    public StreetViewPanoramaView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        zzaCC = new zzb(context, null);
    }

    public StreetViewPanoramaView(Context context, StreetViewPanoramaOptions streetviewpanoramaoptions)
    {
        super(context);
        zzaCC = new zzb(context, streetviewpanoramaoptions);
    }

    public final StreetViewPanorama getStreetViewPanorama()
    {
        if (zzaCq != null)
        {
            return zzaCq;
        }
        zzaCC.zzvu();
        if (zzaCC.zzqj() == null)
        {
            return null;
        }
    /* block-local class not found */
    class zza {}

        try
        {
            zzaCq = new StreetViewPanorama(((zza)zzaCC.zzqj()).zzvB().getStreetViewPanorama());
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return zzaCq;
    }

    public void getStreetViewPanoramaAsync(OnStreetViewPanoramaReadyCallback onstreetviewpanoramareadycallback)
    {
        zzu.zzbY("getStreetViewPanoramaAsync() must be called on the main thread");
        zzaCC.getStreetViewPanoramaAsync(onstreetviewpanoramareadycallback);
    }

    public final void onCreate(Bundle bundle)
    {
        zzaCC.onCreate(bundle);
        if (zzaCC.zzqj() == null)
        {
            com.google.android.gms.dynamic.zza.zzb(this);
        }
    }

    public final void onDestroy()
    {
        zzaCC.onDestroy();
    }

    public final void onLowMemory()
    {
        zzaCC.onLowMemory();
    }

    public final void onPause()
    {
        zzaCC.onPause();
    }

    public final void onResume()
    {
        zzaCC.onResume();
    }

    public final void onSaveInstanceState(Bundle bundle)
    {
        zzaCC.onSaveInstanceState(bundle);
    }
}
