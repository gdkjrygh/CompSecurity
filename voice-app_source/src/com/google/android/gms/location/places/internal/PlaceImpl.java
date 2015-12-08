// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places.internal;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzt;
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
        private int zzCY;
        private String zzKI;
        private long zzaAA;
        private String zzaAC;
        private List zzaAD;
        private boolean zzaAE;
        private Bundle zzaAI;
        private List zzaAJ;
        private float zzaAu;
        private LatLngBounds zzaAv;
        private String zzaAw;
        private boolean zzaAx;
        private float zzaAy;
        private int zzaAz;
        private String zzajO;
        private LatLng zzazn;
        private String zzazp;
        private Uri zzazq;

        public zza zza(LatLng latlng)
        {
            zzazn = latlng;
            return this;
        }

        public zza zza(LatLngBounds latlngbounds)
        {
            zzaAv = latlngbounds;
            return this;
        }

        public zza zzad(boolean flag)
        {
            zzaAx = flag;
            return this;
        }

        public zza zzae(boolean flag)
        {
            zzaAE = flag;
            return this;
        }

        public zza zzdq(String s)
        {
            zzKI = s;
            return this;
        }

        public zza zzdr(String s)
        {
            mName = s;
            return this;
        }

        public zza zzds(String s)
        {
            zzajO = s;
            return this;
        }

        public zza zzdt(String s)
        {
            zzazp = s;
            return this;
        }

        public zza zzf(float f)
        {
            zzaAu = f;
            return this;
        }

        public zza zzg(float f)
        {
            zzaAy = f;
            return this;
        }

        public zza zzgX(int i)
        {
            zzaAz = i;
            return this;
        }

        public zza zzk(Uri uri)
        {
            zzazq = uri;
            return this;
        }

        public zza zzm(List list)
        {
            zzaAJ = list;
            return this;
        }

        public zza zzn(List list)
        {
            zzaAD = list;
            return this;
        }

        public PlaceImpl zzuX()
        {
            return new PlaceImpl(zzCY, zzKI, zzaAJ, Collections.emptyList(), zzaAI, mName, zzajO, zzazp, zzaAC, zzaAD, zzazn, zzaAu, zzaAv, zzaAw, zzazq, zzaAx, zzaAy, zzaAz, zzaAA, zzaAE, PlaceLocalization.zza(mName, zzajO, zzazp, zzaAC, zzaAD));
        }

        public zza()
        {
            zzCY = 0;
        }
    }


    public static final zzk CREATOR = new zzk();
    private final String mName;
    final int zzCY;
    private final String zzKI;
    private final long zzaAA;
    private final List zzaAB;
    private final String zzaAC;
    private final List zzaAD;
    final boolean zzaAE;
    private final Map zzaAF = Collections.unmodifiableMap(new HashMap());
    private final TimeZone zzaAG = null;
    private zzo zzaAH;
    private Locale zzaAm;
    private final Bundle zzaAs;
    private final PlaceLocalization zzaAt;
    private final float zzaAu;
    private final LatLngBounds zzaAv;
    private final String zzaAw;
    private final boolean zzaAx;
    private final float zzaAy;
    private final int zzaAz;
    private final String zzajO;
    private final LatLng zzazn;
    private final List zzazo;
    private final String zzazp;
    private final Uri zzazq;

    PlaceImpl(int i, String s, List list, List list1, Bundle bundle, String s1, String s2, 
            String s3, String s4, List list2, LatLng latlng, float f, LatLngBounds latlngbounds, String s5, 
            Uri uri, boolean flag, float f1, int j, long l, boolean flag1, 
            PlaceLocalization placelocalization)
    {
        zzCY = i;
        zzKI = s;
        zzazo = Collections.unmodifiableList(list);
        zzaAB = list1;
        if (bundle == null)
        {
            bundle = new Bundle();
        }
        zzaAs = bundle;
        mName = s1;
        zzajO = s2;
        zzazp = s3;
        zzaAC = s4;
        if (list2 == null)
        {
            list2 = Collections.emptyList();
        }
        zzaAD = list2;
        zzazn = latlng;
        zzaAu = f;
        zzaAv = latlngbounds;
        if (s5 == null)
        {
            s5 = "UTC";
        }
        zzaAw = s5;
        zzazq = uri;
        zzaAx = flag;
        zzaAy = f1;
        zzaAz = j;
        zzaAA = l;
        zzaAm = null;
        zzaAE = flag1;
        zzaAt = placelocalization;
    }

    private void zzdp(String s)
    {
        if (zzaAE && zzaAH != null)
        {
            zzaAH.zzA(zzKI, s);
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
            if (!zzKI.equals(((PlaceImpl) (obj)).zzKI) || !zzt.equal(zzaAm, ((PlaceImpl) (obj)).zzaAm) || zzaAA != ((PlaceImpl) (obj)).zzaAA)
            {
                return false;
            }
        }
        return true;
    }

    public Object freeze()
    {
        return zzuW();
    }

    public volatile CharSequence getAddress()
    {
        return getAddress();
    }

    public String getAddress()
    {
        zzdp("getAddress");
        return zzajO;
    }

    public String getId()
    {
        zzdp("getId");
        return zzKI;
    }

    public LatLng getLatLng()
    {
        zzdp("getLatLng");
        return zzazn;
    }

    public Locale getLocale()
    {
        zzdp("getLocale");
        return zzaAm;
    }

    public volatile CharSequence getName()
    {
        return getName();
    }

    public String getName()
    {
        zzdp("getName");
        return mName;
    }

    public volatile CharSequence getPhoneNumber()
    {
        return getPhoneNumber();
    }

    public String getPhoneNumber()
    {
        zzdp("getPhoneNumber");
        return zzazp;
    }

    public List getPlaceTypes()
    {
        zzdp("getPlaceTypes");
        return zzazo;
    }

    public int getPriceLevel()
    {
        zzdp("getPriceLevel");
        return zzaAz;
    }

    public float getRating()
    {
        zzdp("getRating");
        return zzaAy;
    }

    public LatLngBounds getViewport()
    {
        zzdp("getViewport");
        return zzaAv;
    }

    public Uri getWebsiteUri()
    {
        zzdp("getWebsiteUri");
        return zzazq;
    }

    public int hashCode()
    {
        return zzt.hashCode(new Object[] {
            zzKI, zzaAm, Long.valueOf(zzaAA)
        });
    }

    public boolean isDataValid()
    {
        return true;
    }

    public void setLocale(Locale locale)
    {
        zzaAm = locale;
    }

    public String toString()
    {
        return zzt.zzt(this).zzg("id", zzKI).zzg("placeTypes", zzazo).zzg("locale", zzaAm).zzg("name", mName).zzg("address", zzajO).zzg("phoneNumber", zzazp).zzg("latlng", zzazn).zzg("viewport", zzaAv).zzg("websiteUri", zzazq).zzg("isPermanentlyClosed", Boolean.valueOf(zzaAx)).zzg("priceLevel", Integer.valueOf(zzaAz)).zzg("timestampSecs", Long.valueOf(zzaAA)).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzk zzk1 = CREATOR;
        zzk.zza(this, parcel, i);
    }

    public void zza(zzo zzo1)
    {
        zzaAH = zzo1;
    }

    public List zzuN()
    {
        zzdp("getTypesDeprecated");
        return zzaAB;
    }

    public float zzuO()
    {
        zzdp("getLevelNumber");
        return zzaAu;
    }

    public String zzuP()
    {
        zzdp("getRegularOpenHours");
        return zzaAC;
    }

    public List zzuQ()
    {
        zzdp("getAttributions");
        return zzaAD;
    }

    public boolean zzuR()
    {
        zzdp("isPermanentlyClosed");
        return zzaAx;
    }

    public long zzuS()
    {
        return zzaAA;
    }

    public Bundle zzuT()
    {
        return zzaAs;
    }

    public String zzuU()
    {
        return zzaAw;
    }

    public PlaceLocalization zzuV()
    {
        zzdp("getLocalization");
        return zzaAt;
    }

    public Place zzuW()
    {
        return this;
    }

}
