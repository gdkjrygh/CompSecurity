// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal;

import android.content.Context;
import android.os.Handler;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.request.AdRequestInfoParcel;
import com.google.android.gms.ads.internal.request.AdResponseParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.internal.zzcd;
import com.google.android.gms.internal.zzce;
import com.google.android.gms.internal.zzch;
import com.google.android.gms.internal.zzeh;
import com.google.android.gms.internal.zzfc;
import com.google.android.gms.internal.zzga;
import com.google.android.gms.internal.zzhj;
import com.google.android.gms.internal.zzhu;
import com.google.android.gms.internal.zzhw;
import com.google.android.gms.internal.zzip;
import com.google.android.gms.internal.zziq;
import com.google.android.gms.internal.zzir;

// Referenced classes of package com.google.android.gms.ads.internal:
//            zzb, zzg, zzq, zzp, 
//            zzd, zze

public abstract class zzc extends com.google.android.gms.ads.internal.zzb
    implements zzg, zzfc
{

    public zzc(Context context, AdSizeParcel adsizeparcel, String s, zzeh zzeh, VersionInfoParcel versioninfoparcel, zzd zzd)
    {
        super(context, adsizeparcel, s, zzeh, versioninfoparcel, zzd);
    }

    public void recordClick()
    {
        onAdClicked();
    }

    public void recordImpression()
    {
        zza(zzos.zzqg, false);
    }

    protected zzip zza(com.google.android.gms.internal.zzhj.zza zza1, zze zze)
    {
        Object obj = zzos.zzqc.getNextView();
        if (!(obj instanceof zzip)) goto _L2; else goto _L1
_L1:
        zzb.zzaC("Reusing webview...");
        obj = (zzip)obj;
        ((zzip) (obj)).zza(zzos.context, zzos.zzqf);
_L4:
        ((zzip) (obj)).zzgS().zzb(this, this, this, this, false, this, null, zze, this);
        ((zzip) (obj)).zzaG(zza1.zzGL.zzDQ);
        ((zzip) (obj)).zzaH(zza1.zzGL.zzDO);
        return ((zzip) (obj));
_L2:
        if (obj != null)
        {
            zzos.zzqc.removeView(((View) (obj)));
        }
        obj = zzp.zzby().zza(zzos.context, zzos.zzqf, false, false, zzos.zzqa, zzos.zzqb, zzov);
        if (zzos.zzqf.zzsI == null)
        {
            zzb(((zzip) (obj)).getWebView());
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void zza(int i, int j, int k, int l)
    {
        zzaS();
    }

    public void zza(zzch zzch)
    {
        zzx.zzch("setOnCustomRenderedAdLoadedListener must be called on the main UI thread.");
        zzos.zzqu = zzch;
    }

    protected void zza(com.google.android.gms.internal.zzhj.zza zza1, zzcd zzcd)
    {
        if (zza1.errorCode != -2)
        {
            zzhu.zzHK.post(new Runnable(zza1) {

                final com.google.android.gms.internal.zzhj.zza zzoA;
                final zzc zzoB;

                public void run()
                {
                    zzoB.zzb(new zzhj(zzoA, null, null, null, null, null, null));
                }

            
            {
                zzoB = zzc.this;
                zzoA = zza1;
                super();
            }
            });
            return;
        }
        if (zza1.zzqf != null)
        {
            zzos.zzqf = zza1.zzqf;
        }
        if (zza1.zzGM.zzDX)
        {
            zzos.zzqz = 0;
            zzos.zzqe = zzp.zzbw().zza(zzos.context, this, zza1, zzos.zzqa, null, zzow, this, zzcd);
            return;
        } else
        {
            zzhu.zzHK.post(new Runnable(zza1, zzcd) {

                final com.google.android.gms.internal.zzhj.zza zzoA;
                final zzc zzoB;
                final zzcd zzoC;

                public void run()
                {
                    if (zzoA.zzGM.zzEg && zzoB.zzos.zzqu != null)
                    {
                        Object obj = null;
                        if (zzoA.zzGM.zzAT != null)
                        {
                            obj = zzp.zzbx().zzaw(zzoA.zzGM.zzAT);
                        }
                        obj = new zzce(zzoB, ((String) (obj)), zzoA.zzGM.body);
                        zzoB.zzos.zzqz = 1;
                        try
                        {
                            zzoB.zzos.zzqu.zza(((com.google.android.gms.internal.zzcg) (obj)));
                            return;
                        }
                        catch (RemoteException remoteexception)
                        {
                            zzb.zzd("Could not call the onCustomRenderedAdLoadedListener.", remoteexception);
                        }
                    }
                    zze zze1 = new zze();
                    zzip zzip1 = zzoB.zza(zzoA, zze1);
                    zze1.zza(new zze.zzb(zzoA, zzip1));
                    zzip1.setOnTouchListener(new android.view.View.OnTouchListener(this, zze1) {

                        final zze zzoD;
                        final _cls2 zzoE;

                        public boolean onTouch(View view, MotionEvent motionevent)
                        {
                            zzoD.recordClick();
                            return false;
                        }

            
            {
                zzoE = _pcls2;
                zzoD = zze1;
                super();
            }
                    });
                    zzip1.setOnClickListener(new android.view.View.OnClickListener(this, zze1) {

                        final zze zzoD;
                        final _cls2 zzoE;

                        public void onClick(View view)
                        {
                            zzoD.recordClick();
                        }

            
            {
                zzoE = _pcls2;
                zzoD = zze1;
                super();
            }
                    });
                    zzoB.zzos.zzqz = 0;
                    zzoB.zzos.zzqe = zzp.zzbw().zza(zzoB.zzos.context, zzoB, zzoA, zzoB.zzos.zzqa, zzip1, zzoB.zzow, zzoB, zzoC);
                }

            
            {
                zzoB = zzc.this;
                zzoA = zza1;
                zzoC = zzcd;
                super();
            }
            });
            return;
        }
    }

    protected boolean zza(zzhj zzhj1, zzhj zzhj2)
    {
        if (zzos.zzbP() && zzos.zzqc != null)
        {
            zzos.zzqc.zzbT().zzaz(zzhj2.zzEc);
        }
        return super.zza(zzhj1, zzhj2);
    }

    public void zzbc()
    {
        zzaQ();
    }

    public void zzc(View view)
    {
        zzos.zzqy = view;
        zzb(new zzhj(zzos.zzqh, null, null, null, null, null, null));
    }
}
