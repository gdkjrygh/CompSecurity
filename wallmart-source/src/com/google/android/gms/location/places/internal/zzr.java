// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places.internal;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.location.places.Place;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

// Referenced classes of package com.google.android.gms.location.places.internal:
//            zzt, zzo, PlaceImpl

public class zzr extends zzt
    implements Place
{

    private final String zzaDH = zzD("place_id", "");
    private boolean zzaEC;
    private final zzo zzaEF;

    public zzr(DataHolder dataholder, int i, Context context)
    {
        super(dataholder, i);
        if (context != null)
        {
            dataholder = zzo.zzaE(context);
        } else
        {
            dataholder = null;
        }
        zzaEF = dataholder;
        zzaEC = zzh("place_is_logging_enabled", false);
    }

    private void zzdA(String s)
    {
        if (zzaEC && zzaEF != null)
        {
            zzaEF.zzC(zzaDH, s);
        }
    }

    public Object freeze()
    {
        return zzwr();
    }

    public CharSequence getAddress()
    {
        zzdA("getAddress");
        return zzD("place_address", "");
    }

    public String getId()
    {
        zzdA("getId");
        return zzaDH;
    }

    public LatLng getLatLng()
    {
        zzdA("getLatLng");
        return (LatLng)zza("place_lat_lng", LatLng.CREATOR);
    }

    public Locale getLocale()
    {
        zzdA("getLocale");
        String s = zzD("place_locale", "");
        if (!TextUtils.isEmpty(s))
        {
            return new Locale(s);
        } else
        {
            return Locale.getDefault();
        }
    }

    public CharSequence getName()
    {
        zzdA("getName");
        return zzD("place_name", "");
    }

    public CharSequence getPhoneNumber()
    {
        zzdA("getPhoneNumber");
        return zzD("place_phone_number", "");
    }

    public List getPlaceTypes()
    {
        zzdA("getPlaceTypes");
        return zza("place_types", Collections.emptyList());
    }

    public int getPriceLevel()
    {
        zzdA("getPriceLevel");
        return zzA("place_price_level", -1);
    }

    public float getRating()
    {
        zzdA("getRating");
        return zzb("place_rating", -1F);
    }

    public LatLngBounds getViewport()
    {
        zzdA("getViewport");
        return (LatLngBounds)zza("place_viewport", LatLngBounds.CREATOR);
    }

    public Uri getWebsiteUri()
    {
        zzdA("getWebsiteUri");
        String s = zzD("place_website_uri", null);
        if (s == null)
        {
            return null;
        } else
        {
            return Uri.parse(s);
        }
    }

    public float zzwj()
    {
        zzdA("getLevelNumber");
        return zzb("place_level_number", 0.0F);
    }

    public boolean zzwm()
    {
        zzdA("isPermanentlyClosed");
        return zzh("place_is_permanently_closed", false);
    }

    public Place zzwr()
    {
        Object obj = (new PlaceImpl.zza()).zzai(zzaEC);
        zzaEC = false;
        obj = ((PlaceImpl.zza) (obj)).zzdD(getAddress().toString()).zzn(zzb("place_attributions", Collections.emptyList())).zzdB(getId()).zzah(zzwm()).zza(getLatLng()).zzf(zzwj()).zzdC(getName().toString()).zzdE(getPhoneNumber().toString()).zzhj(getPriceLevel()).zzg(getRating()).zzm(getPlaceTypes()).zza(getViewport()).zzl(getWebsiteUri()).zzws();
        ((PlaceImpl) (obj)).setLocale(getLocale());
        ((PlaceImpl) (obj)).zza(zzaEF);
        return ((Place) (obj));
    }
}
