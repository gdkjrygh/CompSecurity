// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places;

import android.net.Uri;
import android.os.Parcel;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzt;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.gms.location.places:
//            zzb

public class AddPlaceRequest
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new zzb();
    private final String mName;
    final int zzCY;
    private final String zzajO;
    private final LatLng zzazn;
    private final List zzazo;
    private final String zzazp;
    private final Uri zzazq;

    AddPlaceRequest(int i, String s, LatLng latlng, String s1, List list, String s2, Uri uri)
    {
        zzCY = i;
        mName = zzu.zzcj(s);
        zzazn = (LatLng)zzu.zzu(latlng);
        zzajO = s1;
        zzazo = new ArrayList(list);
        boolean flag;
        if (!TextUtils.isEmpty(s2) || uri != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        zzu.zzb(flag, "One of phone number or URI should be provided.");
        zzazp = s2;
        zzazq = uri;
    }

    public AddPlaceRequest(String s, LatLng latlng, String s1, List list, Uri uri)
    {
        this(s, latlng, s1, list, null, (Uri)zzu.zzu(uri));
    }

    public AddPlaceRequest(String s, LatLng latlng, String s1, List list, String s2)
    {
        this(s, latlng, s1, list, zzu.zzcj(s2), null);
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
        return zzajO;
    }

    public LatLng getLatLng()
    {
        return zzazn;
    }

    public String getName()
    {
        return mName;
    }

    public String getPhoneNumber()
    {
        return zzazp;
    }

    public List getPlaceTypes()
    {
        return zzazo;
    }

    public Uri getWebsiteUri()
    {
        return zzazq;
    }

    public String toString()
    {
        return zzt.zzt(this).zzg("name", mName).zzg("latLng", zzazn).zzg("address", zzajO).zzg("placeTypes", zzazo).zzg("phoneNumer", zzazp).zzg("websiteUri", zzazq).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzb.zza(this, parcel, i);
    }

}
