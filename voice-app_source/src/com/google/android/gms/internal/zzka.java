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
import com.google.android.gms.cast.CastRemoteDisplayApi;
import com.google.android.gms.cast.internal.zzl;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.internal:
//            zzke, zzkb

public class zzka
    implements CastRemoteDisplayApi
{
    private abstract class zza extends zzkc.zza
    {

        final zzka zzVx;

        public void onDisconnected()
            throws RemoteException
        {
            throw new UnsupportedOperationException();
        }

        public void onError(int i)
            throws RemoteException
        {
            throw new UnsupportedOperationException();
        }

        public void zza(int i, int j, Surface surface)
            throws RemoteException
        {
            throw new UnsupportedOperationException();
        }

        public void zzmg()
            throws RemoteException
        {
            throw new UnsupportedOperationException();
        }

        private zza()
        {
            zzVx = zzka.this;
            super();
        }

    }

    private abstract class zzb extends com.google.android.gms.common.api.zza.zza
    {

        final zzka zzVx;

        protected Result createFailedResult(Status status)
        {
            return zzq(status);
        }

        protected com.google.android.gms.cast.CastRemoteDisplay.CastRemoteDisplaySessionResult zzq(Status status)
        {
            return new zzc(status);
        }

        public zzb(GoogleApiClient googleapiclient)
        {
            zzVx = zzka.this;
            super(zzka.zzc(zzka.this), googleapiclient);
        }
    }

    protected final class zzb.zza extends zza
    {

        final zzb zzVA;
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
            zzVA.setResult(new zzc(Status.zzXR));
        }

        public void zza(int i, int j, Surface surface)
        {
            zzka.zzln().zzb("onConnected", new Object[0]);
            DisplayManager displaymanager = (DisplayManager)zzVz.getContext().getSystemService("display");
            if (displaymanager == null)
            {
                zzka.zzln().zzc("Unable to get the display manager", new Object[0]);
                zzVA.setResult(new zzc(Status.zzXR));
                return;
            }
            zzka.zza(zzVA.zzVx);
            int k = zzi(i, j);
            zzka.zza(zzVA.zzVx, displaymanager.createVirtualDisplay("private_display", i, j, k, surface, 2));
            if (zzka.zzd(zzVA.zzVx) == null)
            {
                zzka.zzln().zzc("Unable to create virtual display", new Object[0]);
                zzVA.setResult(new zzc(Status.zzXR));
                return;
            }
            if (zzka.zzd(zzVA.zzVx).getDisplay() == null)
            {
                zzka.zzln().zzc("Virtual display does not have a display", new Object[0]);
                zzVA.setResult(new zzc(Status.zzXR));
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
                zzVA.setResult(new zzc(Status.zzXR));
            }
        }

        public void zzmg()
        {
            zzka.zzln().zzb("onConnectedWithDisplay", new Object[0]);
            Display display = zzka.zzd(zzVA.zzVx).getDisplay();
            if (display != null)
            {
                zzVA.setResult(new zzc(display));
                return;
            } else
            {
                zzka.zzln().zzc("Virtual display no longer has a display", new Object[0]);
                zzVA.setResult(new zzc(Status.zzXR));
                return;
            }
        }

        public zzb.zza(zzb zzb1, zzkb zzkb1)
        {
            zzVA = zzb1;
            zzb1.zzVx. super();
            zzVz = zzkb1;
        }
    }

    protected final class zzb.zzb extends zza
    {

        final zzb zzVA;

        public void onDisconnected()
            throws RemoteException
        {
            zzka.zzln().zzb("onDisconnected", new Object[0]);
            zzka.zza(zzVA.zzVx);
            zzVA.setResult(new zzc(Status.zzXP));
        }

        public void onError(int i)
            throws RemoteException
        {
            zzka.zzln().zzb("onError: %d", new Object[] {
                Integer.valueOf(i)
            });
            zzka.zza(zzVA.zzVx);
            zzVA.setResult(new zzc(Status.zzXR));
        }

        protected zzb.zzb(zzb zzb1)
        {
            zzVA = zzb1;
            zzb1.zzVx. super();
        }
    }

    private static final class zzc
        implements com.google.android.gms.cast.CastRemoteDisplay.CastRemoteDisplaySessionResult
    {

        private final Status zzOt;
        private final Display zzRi;

        public Display getPresentationDisplay()
        {
            return zzRi;
        }

        public Status getStatus()
        {
            return zzOt;
        }

        public zzc(Display display)
        {
            zzOt = Status.zzXP;
            zzRi = display;
        }

        public zzc(Status status)
        {
            zzOt = status;
            zzRi = null;
        }
    }


    private static final zzl zzQW = new zzl("CastRemoteDisplayApiImpl");
    private com.google.android.gms.common.api.Api.ClientKey zzVu;
    private VirtualDisplay zzVv;
    private final zzke zzVw = new zzke.zza() {

        final zzka zzVx;

        public void zzaR(int i)
        {
            zzka.zzln().zzb("onRemoteDisplayEnded", new Object[0]);
            zzka.zza(zzVx);
        }

            
            {
                zzVx = zzka.this;
                super();
            }
    };

    public zzka(com.google.android.gms.common.api.Api.ClientKey clientkey)
    {
        zzVu = clientkey;
    }

    static VirtualDisplay zza(zzka zzka1, VirtualDisplay virtualdisplay)
    {
        zzka1.zzVv = virtualdisplay;
        return virtualdisplay;
    }

    static void zza(zzka zzka1)
    {
        zzka1.zzmf();
    }

    static zzke zzb(zzka zzka1)
    {
        return zzka1.zzVw;
    }

    static com.google.android.gms.common.api.Api.ClientKey zzc(zzka zzka1)
    {
        return zzka1.zzVu;
    }

    static VirtualDisplay zzd(zzka zzka1)
    {
        return zzka1.zzVv;
    }

    static zzl zzln()
    {
        return zzQW;
    }

    private void zzmf()
    {
        if (zzVv != null)
        {
            if (zzVv.getDisplay() != null)
            {
                zzQW.zzb((new StringBuilder()).append("releasing virtual display: ").append(zzVv.getDisplay().getDisplayId()).toString(), new Object[0]);
            }
            zzVv.release();
            zzVv = null;
        }
    }

    public PendingResult startRemoteDisplay(GoogleApiClient googleapiclient, String s)
    {
        zzQW.zzb("startRemoteDisplay", new Object[0]);
        return googleapiclient.zzb(new zzb(googleapiclient, s) {

            final zzka zzVx;
            final String zzVy;

            protected volatile void zza(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                zza((zzkb)client);
            }

            protected void zza(zzkb zzkb1)
                throws RemoteException
            {
                zzkb1.zza(new zzb.zza(this, zzkb1), zzka.zzb(zzVx), zzVy);
            }

            
            {
                zzVx = zzka.this;
                zzVy = s;
                super(googleapiclient);
            }
        });
    }

    public PendingResult stopRemoteDisplay(GoogleApiClient googleapiclient)
    {
        zzQW.zzb("stopRemoteDisplay", new Object[0]);
        return googleapiclient.zzb(new zzb(googleapiclient) {

            final zzka zzVx;

            protected volatile void zza(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                zza((zzkb)client);
            }

            protected void zza(zzkb zzkb1)
                throws RemoteException
            {
                zzkb1.zza(new zzb.zzb(this));
            }

            
            {
                zzVx = zzka.this;
                super(googleapiclient);
            }
        });
    }

}
