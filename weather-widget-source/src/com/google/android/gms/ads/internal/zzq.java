// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ViewSwitcher;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.client.zzk;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.ads.internal.client.zzn;
import com.google.android.gms.ads.internal.client.zzt;
import com.google.android.gms.ads.internal.client.zzu;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zza;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.internal.zzan;
import com.google.android.gms.internal.zzby;
import com.google.android.gms.internal.zzca;
import com.google.android.gms.internal.zzch;
import com.google.android.gms.internal.zzct;
import com.google.android.gms.internal.zzcu;
import com.google.android.gms.internal.zzei;
import com.google.android.gms.internal.zzfm;
import com.google.android.gms.internal.zzfq;
import com.google.android.gms.internal.zzhj;
import com.google.android.gms.internal.zzhk;
import com.google.android.gms.internal.zzhl;
import com.google.android.gms.internal.zzho;
import com.google.android.gms.internal.zzhq;
import com.google.android.gms.internal.zzhw;
import com.google.android.gms.internal.zzib;
import com.google.android.gms.internal.zzid;
import com.google.android.gms.internal.zzip;
import com.google.android.gms.internal.zziq;
import com.google.android.gms.internal.zzlh;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

// Referenced classes of package com.google.android.gms.ads.internal:
//            zzp, zzh

public final class zzq
    implements android.view.ViewTreeObserver.OnGlobalLayoutListener, android.view.ViewTreeObserver.OnScrollChangedListener
{
    public static final class zza extends ViewSwitcher
    {

        private final zzhw zzqF;
        private final zzid zzqG;

        protected void onAttachedToWindow()
        {
            super.onAttachedToWindow();
            if (zzqG != null)
            {
                zzqG.onAttachedToWindow();
            }
        }

        protected void onDetachedFromWindow()
        {
            super.onDetachedFromWindow();
            if (zzqG != null)
            {
                zzqG.onDetachedFromWindow();
            }
        }

        public boolean onInterceptTouchEvent(MotionEvent motionevent)
        {
            zzqF.zze(motionevent);
            return false;
        }

        public void removeAllViews()
        {
            Object obj = new ArrayList();
            for (int i = 0; i < getChildCount(); i++)
            {
                View view = getChildAt(i);
                if (view != null && (view instanceof zzip))
                {
                    ((List) (obj)).add((zzip)view);
                }
            }

            super.removeAllViews();
            for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); ((zzip)((Iterator) (obj)).next()).destroy()) { }
        }

        public void zzbR()
        {
            zzb.v("Disable position monitoring on adFrame.");
            if (zzqG != null)
            {
                zzqG.zzgE();
            }
        }

        public zzhw zzbT()
        {
            return zzqF;
        }

        public zza(Context context1, android.view.ViewTreeObserver.OnGlobalLayoutListener ongloballayoutlistener, android.view.ViewTreeObserver.OnScrollChangedListener onscrollchangedlistener)
        {
            super(context1);
            zzqF = new zzhw(context1);
            if (context1 instanceof Activity)
            {
                zzqG = new zzid((Activity)context1, ongloballayoutlistener, onscrollchangedlistener);
                zzqG.zzgD();
                return;
            } else
            {
                zzqG = null;
                return;
            }
        }
    }


    public final Context context;
    final String zzpY;
    public String zzpZ;
    boolean zzpk;
    boolean zzqA;
    private HashSet zzqB;
    private int zzqC;
    private int zzqD;
    private zzib zzqE;
    final zzan zzqa;
    public final VersionInfoParcel zzqb;
    zza zzqc;
    public zzhq zzqd;
    public zzhq zzqe;
    public AdSizeParcel zzqf;
    public zzhj zzqg;
    public com.google.android.gms.internal.zzhj.zza zzqh;
    public zzhk zzqi;
    zzm zzqj;
    zzn zzqk;
    zzt zzql;
    zzu zzqm;
    zzfm zzqn;
    zzfq zzqo;
    zzct zzqp;
    zzcu zzqq;
    zzlh zzqr;
    zzlh zzqs;
    NativeAdOptionsParcel zzqt;
    zzch zzqu;
    List zzqv;
    com.google.android.gms.ads.internal.purchase.zzk zzqw;
    public zzho zzqx;
    View zzqy;
    public int zzqz;

    public zzq(Context context1, AdSizeParcel adsizeparcel, String s, VersionInfoParcel versioninfoparcel)
    {
        this(context1, adsizeparcel, s, versioninfoparcel, null);
    }

    zzq(Context context1, AdSizeParcel adsizeparcel, String s, VersionInfoParcel versioninfoparcel, zzan zzan1)
    {
        zzqx = null;
        zzqy = null;
        zzqz = 0;
        zzqA = false;
        zzpk = false;
        zzqB = null;
        zzqC = -1;
        zzqD = -1;
        zzby.zzw(context1);
        if (zzp.zzbA().zzgc() != null)
        {
            List list = zzby.zzde();
            if (versioninfoparcel.zzIA != 0)
            {
                list.add(Integer.toString(versioninfoparcel.zzIA));
            }
            zzp.zzbA().zzgc().zzb(list);
        }
        zzpY = UUID.randomUUID().toString();
        if (adsizeparcel.zzsH || adsizeparcel.zzsJ)
        {
            zzqc = null;
        } else
        {
            zzqc = new zza(context1, this, this);
            zzqc.setMinimumWidth(adsizeparcel.widthPixels);
            zzqc.setMinimumHeight(adsizeparcel.heightPixels);
            zzqc.setVisibility(4);
        }
        zzqf = adsizeparcel;
        zzpZ = s;
        context = context1;
        zzqb = versioninfoparcel;
        if (zzan1 == null)
        {
            zzan1 = new zzan(new zzh(this));
        }
        zzqa = zzan1;
        zzqE = new zzib(200L);
        zzqs = new zzlh();
    }

    private void zze(boolean flag)
    {
        boolean flag1;
        flag1 = true;
        break MISSING_BLOCK_LABEL_3;
        if (zzqc != null && zzqg != null && zzqg.zzAR != null && zzqg.zzAR.zzgS().zzbY() && (!flag || zzqE.tryAcquire()))
        {
            int ai[] = new int[2];
            zzqc.getLocationOnScreen(ai);
            int i = zzk.zzcE().zzc(context, ai[0]);
            int j = zzk.zzcE().zzc(context, ai[1]);
            if (i != zzqC || j != zzqD)
            {
                zzqC = i;
                zzqD = j;
                zziq zziq1 = zzqg.zzAR.zzgS();
                i = zzqC;
                j = zzqD;
                if (!flag)
                {
                    flag = flag1;
                } else
                {
                    flag = false;
                }
                zziq1.zza(i, j, flag);
                return;
            }
        }
        return;
    }

    public void destroy()
    {
        zzbR();
        zzqk = null;
        zzql = null;
        zzqo = null;
        zzqn = null;
        zzqu = null;
        zzqm = null;
        zzf(false);
        if (zzqc != null)
        {
            zzqc.removeAllViews();
        }
        zzbM();
        zzbO();
        zzqg = null;
    }

    public void onGlobalLayout()
    {
        zze(false);
    }

    public void onScrollChanged()
    {
        zze(true);
    }

    public void zza(HashSet hashset)
    {
        zzqB = hashset;
    }

    public HashSet zzbL()
    {
        return zzqB;
    }

    public void zzbM()
    {
        if (zzqg != null && zzqg.zzAR != null)
        {
            zzqg.zzAR.destroy();
        }
    }

    public void zzbN()
    {
        if (zzqg != null && zzqg.zzAR != null)
        {
            zzqg.zzAR.stopLoading();
        }
    }

    public void zzbO()
    {
        if (zzqg == null || zzqg.zzyR == null)
        {
            break MISSING_BLOCK_LABEL_29;
        }
        zzqg.zzyR.destroy();
        return;
        RemoteException remoteexception;
        remoteexception;
        zzb.zzaE("Could not destroy mediation adapter.");
        return;
    }

    public boolean zzbP()
    {
        return zzqz == 0;
    }

    public boolean zzbQ()
    {
        return zzqz == 1;
    }

    public void zzbR()
    {
        if (zzqc != null)
        {
            zzqc.zzbR();
        }
    }

    public void zzbS()
    {
        zzqi.zzl(zzqg.zzGI);
        zzqi.zzm(zzqg.zzGJ);
        zzqi.zzy(zzqf.zzsH);
        zzqi.zzz(zzqg.zzDX);
    }

    public void zzf(boolean flag)
    {
        if (zzqz == 0)
        {
            zzbN();
        }
        if (zzqd != null)
        {
            zzqd.cancel();
        }
        if (zzqe != null)
        {
            zzqe.cancel();
        }
        if (flag)
        {
            zzqg = null;
        }
    }
}
