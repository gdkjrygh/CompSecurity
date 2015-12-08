// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places.internal;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.location.places.Place;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

// Referenced classes of package com.google.android.gms.location.places.internal:
//            zzk, zzo, PlaceLocalization

public final class PlaceImpl
    implements SafeParcelable, Place
{
    public static class zza
    {

        private String mName;
        private int mVersionCode;
        private LatLng zzaDh;
        private String zzaDj;
        private Uri zzaDk;
        private String zzaEA;
        private List zzaEB;
        private boolean zzaEC;
        private Bundle zzaEG;
        private List zzaEH;
        private float zzaEs;
        private LatLngBounds zzaEt;
        private String zzaEu;
        private boolean zzaEv;
        private float zzaEw;
        private int zzaEx;
        private long zzaEy;
        private String zzanu;
        private String zzwj;

        public zza zza(LatLng latlng)
        {
            zzaDh = latlng;
            return this;
        }

        public zza zza(LatLngBounds latlngbounds)
        {
            zzaEt = latlngbounds;
            return this;
        }

        public zza zzah(boolean flag)
        {
            zzaEv = flag;
            return this;
        }

        public zza zzai(boolean flag)
        {
            zzaEC = flag;
            return this;
        }

        public zza zzdB(String s)
        {
            zzwj = s;
            return this;
        }

        public zza zzdC(String s)
        {
            mName = s;
            return this;
        }

        public zza zzdD(String s)
        {
            zzanu = s;
            return this;
        }

        public zza zzdE(String s)
        {
            zzaDj = s;
            return this;
        }

        public zza zzf(float f)
        {
            zzaEs = f;
            return this;
        }

        public zza zzg(float f)
        {
            zzaEw = f;
            return this;
        }

        public zza zzhj(int i)
        {
            zzaEx = i;
            return this;
        }

        public zza zzl(Uri uri)
        {
            zzaDk = uri;
            return this;
        }

        public zza zzm(List list)
        {
            zzaEH = list;
            return this;
        }

        public zza zzn(List list)
        {
            zzaEB = list;
            return this;
        }

        public PlaceImpl zzws()
        {
            return new PlaceImpl(mVersionCode, zzwj, zzaEH, Collections.emptyList(), zzaEG, mName, zzanu, zzaDj, zzaEA, zzaEB, zzaDh, zzaEs, zzaEt, zzaEu, zzaDk, zzaEv, zzaEw, zzaEx, zzaEy, zzaEC, PlaceLocalization.zza(mName, zzanu, zzaDj, zzaEA, zzaEB));
        }

        public zza()
        {
            mVersionCode = 0;
        }
    }


    public static final zzk CREATOR = new zzk();
    private final String mName;
    final int mVersionCode;
    private final LatLng zzaDh;
    private final List zzaDi;
    private final String zzaDj;
    private final Uri zzaDk;
    private final String zzaEA;
    private final List zzaEB;
    final boolean zzaEC;
    private final Map zzaED = Collections.unmodifiableMap(new HashMap());
    private final TimeZone zzaEE = null;
    private zzo zzaEF;
    private Locale zzaEk;
    private final Bundle zzaEq;
    private final PlaceLocalization zzaEr;
    private final float zzaEs;
    private final LatLngBounds zzaEt;
    private final String zzaEu;
    private final boolean zzaEv;
    private final float zzaEw;
    private final int zzaEx;
    private final long zzaEy;
    private final List zzaEz;
    private final String zzanu;
    private final String zzwj;

    PlaceImpl(int i, String s, List list, List list1, Bundle bundle, String s1, String s2, 
            String s3, String s4, List list2, LatLng latlng, float f, LatLngBounds latlngbounds, String s5, 
            Uri uri, boolean flag, float f1, int j, long l, boolean flag1, 
            PlaceLocalization placelocalization)
    {
        mVersionCode = i;
        zzwj = s;
        zzaDi = Collections.unmodifiableList(list);
        zzaEz = list1;
        if (bundle == null)
        {
            bundle = new Bundle();
        }
        zzaEq = bundle;
        mName = s1;
        zzanu = s2;
        zzaDj = s3;
        zzaEA = s4;
        if (list2 == null)
        {
            list2 = Collections.emptyList();
        }
        zzaEB = list2;
        zzaDh = latlng;
        zzaEs = f;
        zzaEt = latlngbounds;
        if (s5 == null)
        {
            s5 = "UTC";
        }
        zzaEu = s5;
        zzaDk = uri;
        zzaEv = flag;
        zzaEw = f1;
        zzaEx = j;
        zzaEy = l;
        zzaEk = null;
        zzaEC = flag1;
        zzaEr = placelocalization;
    }

    private void zzdA(String s)
    {
        if (zzaEC && zzaEF != null)
        {
            zzaEF.zzC(zzwj, s);
        }
    }

    public int describeContents()
    {
        zzk zzk1 = CREATOR;
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof PlaceImpl))
            {
                return false;
            }
            obj = (PlaceImpl)obj;
            if (!zzwj.equals(((PlaceImpl) (obj)).zzwj) || !zzw.equal(zzaEk, ((PlaceImpl) (obj)).zzaEk) || zzaEy != ((PlaceImpl) (obj)).zzaEy)
            {
                return false;
            }
        }
        return true;
    }

    public Object freeze()
    {
        return zzwr();
    }

    public volatile CharSequence getAddress()
    {
        return getAddress();
    }

    public String getAddress()
    {
        zzdA("getAddress");
        return zzanu;
    }

    public String getId()
    {
        zzdA("getId");
        return zzwj;
    }

    public LatLng getLatLng()
    {
        zzdA("getLatLng");
        return zzaDh;
    }

    public Locale getLocale()
    {
        zzdA("getLocale");
        return zzaEk;
    }

    public volatile CharSequence getName()
    {
        return getName();
    }

    public String getName()
    {
        zzdA("getName");
        return mName;
    }

    public volatile CharSequence getPhoneNumber()
    {
        return getPhoneNumber();
    }

    public String getPhoneNumber()
    {
        zzdA("getPhoneNumber");
        return zzaDj;
    }

    public List getPlaceTypes()
    {
        zzdA("getPlaceTypes");
        return zzaDi;
    }

    public int getPriceLevel()
    {
        zzdA("getPriceLevel");
        return zzaEx;
    }

    public float getRating()
    {
        zzdA("getRating");
        return zzaEw;
    }

    public LatLngBounds getViewport()
    {
        zzdA("getViewport");
        return zzaEt;
    }

    public Uri getWebsiteUri()
    {
        zzdA("getWebsiteUri");
        return zzaDk;
    }

    public int hashCode()
    {
        return zzw.hashCode(new Object[] {
            zzwj, zzaEk, Long.valueOf(zzaEy)
        });
    }

    public boolean isDataValid()
    {
        return true;
    }

    public void setLocale(Locale locale)
    {
        zzaEk = locale;
    }

    public String toString()
    {
        return zzw.zzu(this).zzg("id", zzwj).zzg("placeTypes", zzaDi).zzg("locale", zzaEk).zzg("name", mName).zzg("address", zzanu).zzg("phoneNumber", zzaDj).zzg("latlng", zzaDh).zzg("viewport", zzaEt).zzg("websiteUri", zzaDk).zzg("isPermanentlyClosed", Boolean.valueOf(zzaEv)).zzg("priceLevel", Integer.valueOf(zzaEx)).zzg("timestampSecs", Long.valueOf(zzaEy)).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzk zzk1 = CREATOR;
        zzk.zza(this, parcel, i);
    }

    public void zza(zzo zzo1)
    {
        zzaEF = zzo1;
    }

    public List zzwi()
    {
        zzdA("getTypesDeprecated");
        return zzaEz;
    }

    public float zzwj()
    {
        zzdA("getLevelNumber");
        return zzaEs;
    }

    public String zzwk()
    {
        zzdA("getRegularOpenHours");
        return zzaEA;
    }

    public List zzwl()
    {
        zzdA("getAttributions");
        return zzaEB;
    }

    public boolean zzwm()
    {
        zzdA("isPermanentlyClosed");
        return zzaEv;
    }

    public long zzwn()
    {
        return zzaEy;
    }

    public Bundle zzwo()
    {
        return zzaEq;
    }

    public String zzwp()
    {
        return zzaEu;
    }

    public PlaceLocalization zzwq()
    {
        zzdA("getLocalization");
        return zzaEr;
    }

    public Place zzwr()
    {
        return this;
    }

}
