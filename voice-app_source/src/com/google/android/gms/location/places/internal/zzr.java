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

    private boolean zzaAE;
    private final zzo zzaAH;
    private final String zzazK = zzB("place_id", "");

    public zzr(DataHolder dataholder, int i, Context context)
    {
        super(dataholder, i);
        if (context != null)
        {
            dataholder = zzo.zzax(context);
        } else
        {
            dataholder = null;
        }
        zzaAH = dataholder;
        zzaAE = zzh("place_is_logging_enabled", false);
    }

    private void zzdp(String s)
    {
        if (zzaAE && zzaAH != null)
        {
            zzaAH.zzA(zzazK, s);
        }
    }

    public Object freeze()
    {
        return zzuW();
    }

    public CharSequence getAddress()
    {
        zzdp("getAddress");
        return zzB("place_address", "");
    }

    public String getId()
    {
        zzdp("getId");
        return zzazK;
    }

    public LatLng getLatLng()
    {
        zzdp("getLatLng");
        return (LatLng)zza("place_lat_lng", LatLng.CREATOR);
    }

    public Locale getLocale()
    {
        zzdp("getLocale");
        String s = zzB("place_locale", "");
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
        zzdp("getName");
        return zzB("place_name", "");
    }

    public CharSequence getPhoneNumber()
    {
        zzdp("getPhoneNumber");
        return zzB("place_phone_number", "");
    }

    public List getPlaceTypes()
    {
        zzdp("getPlaceTypes");
        return zza("place_types", Collections.emptyList());
    }

    public int getPriceLevel()
    {
        zzdp("getPriceLevel");
        return zzz("place_price_level", -1);
    }

    public float getRating()
    {
        zzdp("getRating");
        return zzb("place_rating", -1F);
    }

    public LatLngBounds getViewport()
    {
        zzdp("getViewport");
        return (LatLngBounds)zza("place_viewport", LatLngBounds.CREATOR);
    }

    public Uri getWebsiteUri()
    {
        zzdp("getWebsiteUri");
        String s = zzB("place_website_uri", null);
        if (s == null)
        {
            return null;
        } else
        {
            return Uri.parse(s);
        }
    }

    public float zzuO()
    {
        zzdp("getLevelNumber");
        return zzb("place_level_number", 0.0F);
    }

    public boolean zzuR()
    {
        zzdp("isPermanentlyClosed");
        return zzh("place_is_permanently_closed", false);
    }

    public Place zzuW()
    {
        Object obj = (new PlaceImpl.zza()).zzae(zzaAE);
        zzaAE = false;
        obj = ((PlaceImpl.zza) (obj)).zzds(getAddress().toString()).zzn(zzb("place_attributions", Collections.emptyList())).zzdq(getId()).zzad(zzuR()).zza(getLatLng()).zzf(zzuO()).zzdr(getName().toString()).zzdt(getPhoneNumber().toString()).zzgX(getPriceLevel()).zzg(getRating()).zzm(getPlaceTypes()).zza(getViewport()).zzk(getWebsiteUri()).zzuX();
        ((PlaceImpl) (obj)).setLocale(getLocale());
        ((PlaceImpl) (obj)).zza(zzaAH);
        return ((Place) (obj));
    }
}
