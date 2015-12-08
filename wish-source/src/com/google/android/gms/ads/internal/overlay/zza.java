// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.overlay;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.client.zzb;

// Referenced classes of package com.google.android.gms.ads.internal.overlay:
//            AdLauncherIntentInfoParcel, zzi

public class zza
{

    public zza()
    {
    }

    public boolean zza(Context context, AdLauncherIntentInfoParcel adlauncherintentinfoparcel, zzi zzi1)
    {
        if (adlauncherintentinfoparcel == null)
        {
            zzb.zzan("No intent data for launcher overlay.");
            return false;
        }
        Intent intent = new Intent();
        if (TextUtils.isEmpty(adlauncherintentinfoparcel.zzwa))
        {
            zzb.zzan("Open GMSG did not contain a URL.");
            return false;
        }
        if (!TextUtils.isEmpty(adlauncherintentinfoparcel.mimeType))
        {
            intent.setDataAndType(Uri.parse(adlauncherintentinfoparcel.zzwa), adlauncherintentinfoparcel.mimeType);
        } else
        {
            intent.setData(Uri.parse(adlauncherintentinfoparcel.zzwa));
        }
        intent.setAction("android.intent.action.VIEW");
        if (!TextUtils.isEmpty(adlauncherintentinfoparcel.packageName))
        {
            intent.setPackage(adlauncherintentinfoparcel.packageName);
        }
        if (!TextUtils.isEmpty(adlauncherintentinfoparcel.zzwb))
        {
            String as[] = adlauncherintentinfoparcel.zzwb.split("/", 2);
            if (as.length < 2)
            {
                zzb.zzan((new StringBuilder()).append("Could not parse component name from open GMSG: ").append(adlauncherintentinfoparcel.zzwb).toString());
                return false;
            }
            intent.setClassName(as[0], as[1]);
        }
        adlauncherintentinfoparcel = adlauncherintentinfoparcel.zzwc;
        if (!TextUtils.isEmpty(adlauncherintentinfoparcel))
        {
            int i;
            try
            {
                i = Integer.parseInt(adlauncherintentinfoparcel);
            }
            // Misplaced declaration of an exception variable
            catch (AdLauncherIntentInfoParcel adlauncherintentinfoparcel)
            {
                zzb.zzan("Could not parse intent flags.");
                i = 0;
            }
            intent.addFlags(i);
        }
        try
        {
            zzb.zzam((new StringBuilder()).append("Launching an intent: ").append(intent.toURI()).toString());
            context.startActivity(intent);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            zzb.zzan(context.getMessage());
            return false;
        }
        if (zzi1 == null)
        {
            break MISSING_BLOCK_LABEL_246;
        }
        zzi1.zzai();
        return true;
    }
}
