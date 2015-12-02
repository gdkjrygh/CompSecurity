// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps;

import android.app.Activity;
import android.os.RemoteException;
import android.support.v4.app.Fragment;
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
//            MapView, MapsInitializer, OnMapReadyCallback

class Mx extends a
{

    private final Fragment Mx;
    protected f akW;
    private final List akX = new ArrayList();
    private Activity nB;

    static void a(Mx mx, Activity activity)
    {
        mx.setActivity(activity);
    }

    private void setActivity(Activity activity)
    {
        nB = activity;
        nO();
    }

    protected void a(f f1)
    {
        akW = f1;
        nO();
    }

    public void nO()
    {
        int i = com.google.android.gms.maps.MapView.a;
        Object obj;
        if (nB == null)
        {
            break MISSING_BLOCK_LABEL_131;
        }
        obj = akW;
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_131;
        }
        RemoteException remoteexception;
        OnMapReadyCallback onmapreadycallback;
        try
        {
            obj = je();
        }
        catch (RemoteException remoteexception1)
        {
            throw remoteexception1;
        }
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_131;
        }
        MapsInitializer.initialize(nB);
        obj = x.S(nB).j(e.k(nB));
        akW.a(new <init>(Mx, ((com.google.android.gms.maps.internal.IMapFragmentDelegate) (obj))));
        obj = akX.iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            onmapreadycallback = (OnMapReadyCallback)((Iterator) (obj)).next();
            ((akX)je()).getMapAsync(onmapreadycallback);
        } while (i == 0);
        akX.clear();
        return;
        remoteexception;
        throw remoteexception;
        Object obj1;
        obj1;
        throw new RuntimeRemoteException(((RemoteException) (obj1)));
        obj1;
    }

    otAvailableException(Fragment fragment)
    {
        Mx = fragment;
    }
}
