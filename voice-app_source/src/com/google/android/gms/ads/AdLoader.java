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
import com.google.android.gms.internal.zzcz;
import com.google.android.gms.internal.zzda;
import com.google.android.gms.internal.zzdb;
import com.google.android.gms.internal.zzdc;
import com.google.android.gms.internal.zzee;

// Referenced classes of package com.google.android.gms.ads:
//            AdRequest, AdListener

public class AdLoader
{
    public static class Builder
    {

        private final Context mContext;
        private final zzp zznJ;

        public AdLoader build()
        {
            AdLoader adloader;
            try
            {
                adloader = new AdLoader(mContext, zznJ.zzbi());
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
                zznJ.zza(new zzcz(onappinstalladloadedlistener));
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
                zznJ.zza(new zzda(oncontentadloadedlistener));
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
            zzdc zzdc1;
            try
            {
                zzp1 = zznJ;
                zzdc1 = new zzdc(oncustomtemplateadloadedlistener);
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
            zzp1.zza(s, zzdc1, oncustomtemplateadloadedlistener);
            return this;
            oncustomtemplateadloadedlistener = new zzdb(oncustomclicklistener);
            break MISSING_BLOCK_LABEL_22;
        }

        public Builder withAdListener(AdListener adlistener)
        {
            try
            {
                zznJ.zzb(new zzc(adlistener));
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
                zznJ.zza(new NativeAdOptionsParcel(nativeadoptions));
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
            zznJ = zzp1;
        }

        public Builder(Context context, String s)
        {
            this(context, zzd.zza(context, s, new zzee()));
        }
    }


    private final Context mContext;
    private final zzg zznH;
    private final zzo zznI;

    AdLoader(Context context, zzo zzo1)
    {
        this(context, zzo1, zzg.zzcw());
    }

    AdLoader(Context context, zzo zzo1, zzg zzg1)
    {
        mContext = context;
        zznI = zzo1;
        zznH = zzg1;
    }

    private void zza(zzx zzx)
    {
        try
        {
            zznI.zze(zznH.zza(mContext, zzx));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (zzx zzx)
        {
            zzb.zzb("Failed to load ad.", zzx);
        }
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
