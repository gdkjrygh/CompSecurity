// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps;

import android.content.Context;
import android.os.RemoteException;
import android.view.ViewGroup;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.dynamic.a;
import com.google.android.gms.dynamic.e;
import com.google.android.gms.dynamic.f;
import com.google.android.gms.maps.internal.c;
import com.google.android.gms.maps.internal.x;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.gms.maps:
//            MapView, OnStreetViewPanoramaReadyCallback, StreetViewPanoramaOptions

class alC extends a
{

    protected f akW;
    private final StreetViewPanoramaOptions alC;
    private final ViewGroup ald;
    private final List alq = new ArrayList();
    private final Context mContext;

    protected void a(f f1)
    {
        akW = f1;
        nO();
    }

    public void nO()
    {
        int i = com.google.android.gms.maps.MapView.a;
        Object obj;
        OnStreetViewPanoramaReadyCallback onstreetviewpanoramareadycallback;
        try
        {
            if (akW == null)
            {
                break MISSING_BLOCK_LABEL_118;
            }
            obj = je();
        }
        catch (RemoteException remoteexception)
        {
            throw remoteexception;
        }
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_118;
        }
        obj = x.S(mContext).a(e.k(mContext), alC);
        akW.a(new <init>(ald, ((com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate) (obj))));
        obj = alq.iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            onstreetviewpanoramareadycallback = (OnStreetViewPanoramaReadyCallback)((Iterator) (obj)).next();
            ((Callback)je()).getStreetViewPanoramaAsync(onstreetviewpanoramareadycallback);
        } while (i == 0);
        alq.clear();
        return;
        Object obj1;
        obj1;
        throw new RuntimeRemoteException(((RemoteException) (obj1)));
        obj1;
    }

    (ViewGroup viewgroup, Context context, StreetViewPanoramaOptions streetviewpanoramaoptions)
    {
        ald = viewgroup;
        mContext = context;
        alC = streetviewpanoramaoptions;
    }
}
