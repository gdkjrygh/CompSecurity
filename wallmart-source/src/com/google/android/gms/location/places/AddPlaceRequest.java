// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places;

import android.net.Uri;
import android.os.Parcel;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

// Referenced classes of package com.google.android.gms.location.places:
//            zzb

public class AddPlaceRequest
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new zzb();
    private final String mName;
    final int mVersionCode;
    private final LatLng zzaDh;
    private final List zzaDi;
    private final String zzaDj;
    private final Uri zzaDk;
    private final String zzanu;

    AddPlaceRequest(int i, String s, LatLng latlng, String s1, List list, String s2, Uri uri)
    {
label0:
        {
            boolean flag1 = false;
            super();
            mVersionCode = i;
            mName = zzx.zzcs(s);
            zzaDh = (LatLng)zzx.zzv(latlng);
            zzanu = zzx.zzcs(s1);
            zzaDi = new ArrayList((Collection)zzx.zzv(list));
            boolean flag;
            if (!zzaDi.isEmpty())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            zzx.zzb(flag, "At least one place type should be provided.");
            if (TextUtils.isEmpty(s2))
            {
                flag = flag1;
                if (uri == null)
                {
                    break label0;
                }
            }
            flag = true;
        }
        zzx.zzb(flag, "One of phone number or URI should be provided.");
        zzaDj = s2;
        zzaDk = uri;
    }

    public AddPlaceRequest(String s, LatLng latlng, String s1, List list, Uri uri)
    {
        this(s, latlng, s1, list, null, (Uri)zzx.zzv(uri));
    }

    public AddPlaceRequest(String s, LatLng latlng, String s1, List list, String s2)
    {
        this(s, latlng, s1, list, zzx.zzcs(s2), null);
    }

    public AddPlaceRequest(String s, LatLng latlng, String s1, List list, String s2, Uri uri)
    {
        this(0, s, latlng, s1, list, s2, uri);
    }

    public int describeContents()
    {
        return 0;
    }

    public String getAddress()
    {
        return zzanu;
    }

    public LatLng getLatLng()
    {
        return zzaDh;
    }

    public String getName()
    {
        return mName;
    }

    public String getPhoneNumber()
    {
        return zzaDj;
    }

    public List getPlaceTypes()
    {
        return zzaDi;
    }

    public Uri getWebsiteUri()
    {
        return zzaDk;
    }

    public String toString()
    {
        return zzw.zzu(this).zzg("name", mName).zzg("latLng", zzaDh).zzg("address", zzanu).zzg("placeTypes", zzaDi).zzg("phoneNumer", zzaDj).zzg("websiteUri", zzaDk).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzb.zza(this, parcel, i);
    }

}
