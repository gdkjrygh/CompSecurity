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
import com.google.android.gms.internal.zzbz;
import com.google.android.gms.internal.zzci;
import com.google.android.gms.internal.zzcu;
import com.google.android.gms.internal.zzcv;
import com.google.android.gms.internal.zzeg;
import com.google.android.gms.internal.zzff;
import com.google.android.gms.internal.zzfj;
import com.google.android.gms.internal.zzha;
import com.google.android.gms.internal.zzhb;
import com.google.android.gms.internal.zzhf;
import com.google.android.gms.internal.zzhh;
import com.google.android.gms.internal.zzhl;
import com.google.android.gms.internal.zzhm;
import com.google.android.gms.internal.zzhn;
import com.google.android.gms.internal.zzhq;
import com.google.android.gms.internal.zzid;
import com.google.android.gms.internal.zzie;
import com.google.android.gms.internal.zzkw;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

// Referenced classes of package com.google.android.gms.ads.internal:
//            zzo, zzg

public final class zzp
    implements android.view.ViewTreeObserver.OnGlobalLayoutListener, android.view.ViewTreeObserver.OnScrollChangedListener
{
    public static final class zza extends ViewSwitcher
    {

        private final zzhn zzqn;

        public boolean onInterceptTouchEvent(MotionEvent motionevent)
        {
            zzqn.zzd(motionevent);
            return false;
        }

        public void removeAllViews()
        {
            Object obj = new ArrayList();
            for (int i = 0; i < getChildCount(); i++)
            {
                View view = getChildAt(i);
                if (view != null && (view instanceof zzid))
                {
                    ((List) (obj)).add((zzid)view);
                }
            }

            super.removeAllViews();
            for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); ((zzid)((Iterator) (obj)).next()).destroy()) { }
        }

        public zzhn zzbP()
        {
            return zzqn;
        }

        public zza(Context context)
        {
            super(context);
            zzqn = new zzhn(context);
        }
    }


    boolean zzoU;
    final String zzpF;
    public String zzpG;
    public final Context zzpH;
    final zzan zzpI;
    public final VersionInfoParcel zzpJ;
    zza zzpK;
    public zzhh zzpL;
    public zzhh zzpM;
    public AdSizeParcel zzpN;
    public zzha zzpO;
    public com.google.android.gms.internal.zzha.zza zzpP;
    public zzhb zzpQ;
    zzm zzpR;
    zzn zzpS;
    zzt zzpT;
    zzu zzpU;
    zzff zzpV;
    zzfj zzpW;
    zzcu zzpX;
    zzcv zzpY;
    zzkw zzpZ;
    zzkw zzqa;
    NativeAdOptionsParcel zzqb;
    zzci zzqc;
    List zzqd;
    com.google.android.gms.ads.internal.purchase.zzk zzqe;
    public zzhf zzqf;
    View zzqg;
    public int zzqh;
    boolean zzqi;
    private HashSet zzqj;
    private int zzqk;
    private int zzql;
    private zzhq zzqm;

    public zzp(Context context, AdSizeParcel adsizeparcel, String s, VersionInfoParcel versioninfoparcel)
    {
        this(context, adsizeparcel, s, versioninfoparcel, null);
    }

    zzp(Context context, AdSizeParcel adsizeparcel, String s, VersionInfoParcel versioninfoparcel, zzan zzan1)
    {
        zzqf = null;
        zzqg = null;
        zzqh = 0;
        zzqi = false;
        zzoU = false;
        zzqj = null;
        zzqk = -1;
        zzql = -1;
        zzbz.zzw(context);
        zzpF = UUID.randomUUID().toString();
        if (adsizeparcel.zzsn || adsizeparcel.zzsp)
        {
            zzpK = null;
        } else
        {
            zzpK = new zza(context);
            zzpK.setMinimumWidth(adsizeparcel.widthPixels);
            zzpK.setMinimumHeight(adsizeparcel.heightPixels);
            zzpK.setVisibility(4);
        }
        if (context != null && (context instanceof Activity) && zzpK != null)
        {
            zzo.zzbv().zza((Activity)context, this);
            zzo.zzbv().zza((Activity)context, this);
        }
        zzpN = adsizeparcel;
        zzpG = s;
        zzpH = context;
        zzpJ = versioninfoparcel;
        if (zzan1 == null)
        {
            zzan1 = new zzan(new zzg(this));
        }
        zzpI = zzan1;
        zzqm = new zzhq(200L);
        zzqa = new zzkw();
    }

    private void zze(boolean flag)
    {
        boolean flag1;
        flag1 = true;
        break MISSING_BLOCK_LABEL_3;
        if (zzpK != null && zzpO != null && zzpO.zzzE != null && zzpO.zzzE.zzgF().zzbU() && (!flag || zzqm.tryAcquire()))
        {
            int ai[] = new int[2];
            zzpK.getLocationOnScreen(ai);
            int i = zzk.zzcA().zzc(zzpH, ai[0]);
            int j = zzk.zzcA().zzc(zzpH, ai[1]);
            if (i != zzqk || j != zzql)
            {
                zzqk = i;
                zzql = j;
                zzie zzie1 = zzpO.zzzE.zzgF();
                i = zzqk;
                j = zzql;
                if (!flag)
                {
                    flag = flag1;
                } else
                {
                    flag = false;
                }
                zzie1.zza(i, j, flag);
                return;
            }
        }
        return;
    }

    public void destroy()
    {
        zzpS = null;
        zzpT = null;
        zzpW = null;
        zzpV = null;
        zzqc = null;
        zzpU = null;
        if (zzpH != null && (zzpH instanceof Activity) && zzpK != null)
        {
            zzo.zzbx().zzb((Activity)zzpH, this);
            zzo.zzbv().zzb((Activity)zzpH, this);
        }
        zzf(false);
        if (zzpK != null)
        {
            zzpK.removeAllViews();
        }
        zzbJ();
        zzbL();
        zzpO = null;
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
        zzqj = hashset;
    }

    public HashSet zzbI()
    {
        return zzqj;
    }

    public void zzbJ()
    {
        if (zzpO != null && zzpO.zzzE != null)
        {
            zzpO.zzzE.destroy();
        }
    }

    public void zzbK()
    {
        if (zzpO != null && zzpO.zzzE != null)
        {
            zzpO.zzzE.stopLoading();
        }
    }

    public void zzbL()
    {
        if (zzpO == null || zzpO.zzya == null)
        {
            break MISSING_BLOCK_LABEL_29;
        }
        zzpO.zzya.destroy();
        return;
        RemoteException remoteexception;
        remoteexception;
        zzb.zzaC("Could not destroy mediation adapter.");
        return;
    }

    public boolean zzbM()
    {
        return zzqh == 0;
    }

    public boolean zzbN()
    {
        return zzqh == 1;
    }

    public void zzbO()
    {
        zzpQ.zzl(zzpO.zzFo);
        zzpQ.zzm(zzpO.zzFp);
        zzpQ.zzy(zzpN.zzsn);
        zzpQ.zzz(zzpO.zzCK);
    }

    public void zzf(boolean flag)
    {
        if (zzqh == 0)
        {
            zzbK();
        }
        if (zzpL != null)
        {
            zzpL.cancel();
        }
        if (zzpM != null)
        {
            zzpM.cancel();
        }
        if (flag)
        {
            zzpO = null;
        }
    }
}
