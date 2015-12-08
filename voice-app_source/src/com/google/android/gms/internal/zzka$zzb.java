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
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.internal:
//            zzka, zzkb

private abstract class entKey extends com.google.android.gms.common.api.tKey
{
    protected final class zza extends zzka.zza
    {

        final zzka.zzb zzVA;
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
            zzka.zza(zzVA.zzVx);
            zzVA.setResult(new zzka.zzc(Status.zzXR));
        }

        public void zza(int i, int j, Surface surface)
        {
            zzka.zzln().zzb("onConnected", new Object[0]);
            DisplayManager displaymanager = (DisplayManager)zzVz.getContext().getSystemService("display");
            if (displaymanager == null)
            {
                zzka.zzln().zzc("Unable to get the display manager", new Object[0]);
                zzVA.setResult(new zzka.zzc(Status.zzXR));
                return;
            }
            zzka.zza(zzVA.zzVx);
            int k = zzi(i, j);
            zzka.zza(zzVA.zzVx, displaymanager.createVirtualDisplay("private_display", i, j, k, surface, 2));
            if (zzka.zzd(zzVA.zzVx) == null)
            {
                zzka.zzln().zzc("Unable to create virtual display", new Object[0]);
                zzVA.setResult(new zzka.zzc(Status.zzXR));
                return;
            }
            if (zzka.zzd(zzVA.zzVx).getDisplay() == null)
            {
                zzka.zzln().zzc("Virtual display does not have a display", new Object[0]);
                zzVA.setResult(new zzka.zzc(Status.zzXR));
                return;
            }
            try
            {
                zzVz.zza(this, zzka.zzd(zzVA.zzVx).getDisplay().getDisplayId());
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Surface surface)
            {
                zzVA.setResult(new zzka.zzc(Status.zzXR));
            }
        }

        public void zzmg()
        {
            zzka.zzln().zzb("onConnectedWithDisplay", new Object[0]);
            Display display = zzka.zzd(zzVA.zzVx).getDisplay();
            if (display != null)
            {
                zzVA.setResult(new zzka.zzc(display));
                return;
            } else
            {
                zzka.zzln().zzc("Virtual display no longer has a display", new Object[0]);
                zzVA.setResult(new zzka.zzc(Status.zzXR));
                return;
            }
        }

        public zza(zzkb zzkb1)
        {
            zzVA = zzka.zzb.this;
            super(zzVx, null);
            zzVz = zzkb1;
        }
    }

    protected final class zzb extends zzka.zza
    {

        final zzka.zzb zzVA;

        public void onDisconnected()
            throws RemoteException
        {
            zzka.zzln().zzb("onDisconnected", new Object[0]);
            zzka.zza(zzVA.zzVx);
            zzVA.setResult(new zzka.zzc(Status.zzXP));
        }

        public void onError(int i)
            throws RemoteException
        {
            zzka.zzln().zzb("onError: %d", new Object[] {
                Integer.valueOf(i)
            });
            zzka.zza(zzVA.zzVx);
            zzVA.setResult(new zzka.zzc(Status.zzXR));
        }

        protected zzb()
        {
            zzVA = zzka.zzb.this;
            super(zzVx, null);
        }
    }


    final zzka zzVx;

    protected Result createFailedResult(Status status)
    {
        return zzq(status);
    }

    protected com.google.android.gms.cast.eDisplay.CastRemoteDisplaySessionResult zzq(Status status)
    {
        return new <init>(status);
    }

    public piClient(zzka zzka1, GoogleApiClient googleapiclient)
    {
        zzVx = zzka1;
        super(zzka.zzc(zzka1), googleapiclient);
    }
}
