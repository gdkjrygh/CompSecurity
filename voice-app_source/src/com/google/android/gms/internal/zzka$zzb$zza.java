// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.hardware.display.VirtualDisplay;
import android.os.RemoteException;
import android.view.Display;
import android.view.Surface;
import com.google.android.gms.cast.internal.zzl;
import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.internal:
//            zzka, zzkb

protected final class zzVz extends zzVz
{

    final  zzVA;
    private final zzkb zzVz;

    private int zzi(int i, int j)
    {
        if (i >= j)
        {
            i = j;
        }
        return (i * 320) / 1080;
    }

    public void onError(int i)
        throws RemoteException
    {
        zzka.zzln().zzb("onError: %d", new Object[] {
            Integer.valueOf(i)
        });
        zzka.zza(zzVA.);
        zzVA.esult(new t>(Status.zzXR));
    }

    public void zza(int i, int j, Surface surface)
    {
        zzka.zzln().zzb("onConnected", new Object[0]);
        DisplayManager displaymanager = (DisplayManager)zzVz.getContext().getSystemService("display");
        if (displaymanager == null)
        {
            zzka.zzln().zzc("Unable to get the display manager", new Object[0]);
            zzVA.esult(new t>(Status.zzXR));
            return;
        }
        zzka.zza(zzVA.);
        int k = zzi(i, j);
        zzka.zza(zzVA., displaymanager.createVirtualDisplay("private_display", i, j, k, surface, 2));
        if (zzka.zzd(zzVA.) == null)
        {
            zzka.zzln().zzc("Unable to create virtual display", new Object[0]);
            zzVA.esult(new t>(Status.zzXR));
            return;
        }
        if (zzka.zzd(zzVA.).getDisplay() == null)
        {
            zzka.zzln().zzc("Virtual display does not have a display", new Object[0]);
            zzVA.esult(new t>(Status.zzXR));
            return;
        }
        try
        {
            zzVz.zza(this, zzka.zzd(zzVA.).getDisplay().getDisplayId());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Surface surface)
        {
            zzVA.esult(new t>(Status.zzXR));
        }
    }

    public void zzmg()
    {
        zzka.zzln().zzb("onConnectedWithDisplay", new Object[0]);
        Display display = zzka.zzd(zzVA.).getDisplay();
        if (display != null)
        {
            zzVA.esult(new t>(display));
            return;
        } else
        {
            zzka.zzln().zzc("Virtual display no longer has a display", new Object[0]);
            zzVA.esult(new t>(Status.zzXR));
            return;
        }
    }

    public ( , zzkb zzkb1)
    {
        zzVA = ;
        super(., null);
        zzVz = zzkb1;
    }
}
