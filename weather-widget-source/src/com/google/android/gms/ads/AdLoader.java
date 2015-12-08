// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.doubleclick.PublisherAdRequest;
import com.google.android.gms.ads.formats.NativeAdOptions;
import com.google.android.gms.ads.internal.client.zzc;
import com.google.android.gms.ads.internal.client.zzd;
import com.google.android.gms.ads.internal.client.zzg;
import com.google.android.gms.ads.internal.client.zzo;
import com.google.android.gms.ads.internal.client.zzp;
import com.google.android.gms.ads.internal.client.zzx;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.internal.zzcy;
import com.google.android.gms.internal.zzcz;
import com.google.android.gms.internal.zzda;
import com.google.android.gms.internal.zzdb;
import com.google.android.gms.internal.zzeg;

// Referenced classes of package com.google.android.gms.ads:
//            AdRequest, AdListener

public class AdLoader
{
    public static class Builder
    {

        private final Context mContext;
        private final zzp zznM;

        public AdLoader build()
        {
            AdLoader adloader;
            try
            {
                adloader = new AdLoader(mContext, zznM.zzbk());
            }
            catch (RemoteException remoteexception)
            {
                zzb.zzb("Failed to build AdLoader.", remoteexception);
                return null;
            }
            return adloader;
        }

        public Builder forAppInstallAd(com.google.android.gms.ads.formats.NativeAppInstallAd.OnAppInstallAdLoadedListener onappinstalladloadedlistener)
        {
            try
            {
                zznM.zza(new zzcy(onappinstalladloadedlistener));
            }
            // Misplaced declaration of an exception variable
            catch (com.google.android.gms.ads.formats.NativeAppInstallAd.OnAppInstallAdLoadedListener onappinstalladloadedlistener)
            {
                zzb.zzd("Failed to add app install ad listener", onappinstalladloadedlistener);
                return this;
            }
            return this;
        }

        public Builder forContentAd(com.google.android.gms.ads.formats.NativeContentAd.OnContentAdLoadedListener oncontentadloadedlistener)
        {
            try
            {
                zznM.zza(new zzcz(oncontentadloadedlistener));
            }
            // Misplaced declaration of an exception variable
            catch (com.google.android.gms.ads.formats.NativeContentAd.OnContentAdLoadedListener oncontentadloadedlistener)
            {
                zzb.zzd("Failed to add content ad listener", oncontentadloadedlistener);
                return this;
            }
            return this;
        }

        public Builder forCustomTemplateAd(String s, com.google.android.gms.ads.formats.NativeCustomTemplateAd.OnCustomTemplateAdLoadedListener oncustomtemplateadloadedlistener, com.google.android.gms.ads.formats.NativeCustomTemplateAd.OnCustomClickListener oncustomclicklistener)
        {
            zzp zzp1;
            zzdb zzdb1;
            try
            {
                zzp1 = zznM;
                zzdb1 = new zzdb(oncustomtemplateadloadedlistener);
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                zzb.zzd("Failed to add custom template ad listener", s);
                return this;
            }
            if (oncustomclicklistener != null)
            {
                break MISSING_BLOCK_LABEL_35;
            }
            oncustomtemplateadloadedlistener = null;
            zzp1.zza(s, zzdb1, oncustomtemplateadloadedlistener);
            return this;
            oncustomtemplateadloadedlistener = new zzda(oncustomclicklistener);
            break MISSING_BLOCK_LABEL_22;
        }

        public Builder withAdListener(AdListener adlistener)
        {
            try
            {
                zznM.zzb(new zzc(adlistener));
            }
            // Misplaced declaration of an exception variable
            catch (AdListener adlistener)
            {
                zzb.zzd("Failed to set AdListener.", adlistener);
                return this;
            }
            return this;
        }

        public Builder withNativeAdOptions(NativeAdOptions nativeadoptions)
        {
            try
            {
                zznM.zza(new NativeAdOptionsParcel(nativeadoptions));
            }
            // Misplaced declaration of an exception variable
            catch (NativeAdOptions nativeadoptions)
            {
                zzb.zzd("Failed to specify native ad options", nativeadoptions);
                return this;
            }
            return this;
        }

        Builder(Context context, zzp zzp1)
        {
            mContext = context;
            zznM = zzp1;
        }

        public Builder(Context context, String s)
        {
            this(context, zzd.zza(context, s, new zzeg()));
        }
    }


    private final Context mContext;
    private final zzg zznK;
    private final zzo zznL;

    AdLoader(Context context, zzo zzo1)
    {
        this(context, zzo1, zzg.zzcA());
    }

    AdLoader(Context context, zzo zzo1, zzg zzg1)
    {
        mContext = context;
        zznL = zzo1;
        zznK = zzg1;
    }

    private void zza(zzx zzx)
    {
        try
        {
            zznL.zze(zznK.zza(mContext, zzx));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (zzx zzx)
        {
            zzb.zzb("Failed to load ad.", zzx);
        }
    }

    public String getMediationAdapterClassName()
    {
        String s;
        try
        {
            s = zznL.getMediationAdapterClassName();
        }
        catch (RemoteException remoteexception)
        {
            zzb.zzd("Failed to get the mediation adapter class name.", remoteexception);
            return null;
        }
        return s;
    }

    public boolean isLoading()
    {
        boolean flag;
        try
        {
            flag = zznL.isLoading();
        }
        catch (RemoteException remoteexception)
        {
            zzb.zzd("Failed to check if ad is loading.", remoteexception);
            return false;
        }
        return flag;
    }

    public void loadAd(AdRequest adrequest)
    {
        zza(adrequest.zzaF());
    }

    public void loadAd(PublisherAdRequest publisheradrequest)
    {
        zza(publisheradrequest.zzaF());
    }
}
