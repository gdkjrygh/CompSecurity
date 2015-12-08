// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import com.google.android.gms.ads.search.SearchAdRequest;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.ads.internal.client:
//            zzx

public final class SearchAdRequestParcel
    implements SafeParcelable
{

    public static final zzx CREATOR = new zzx();
    public final int backgroundColor;
    public final int versionCode;
    public final int zzqL;
    public final int zzqM;
    public final int zzqN;
    public final int zzqO;
    public final int zzqP;
    public final int zzqQ;
    public final int zzqR;
    public final String zzqS;
    public final int zzqT;
    public final String zzqU;
    public final int zzqV;
    public final int zzqW;
    public final String zzqX;

    SearchAdRequestParcel(int i, int j, int k, int l, int i1, int j1, int k1, 
            int l1, int i2, String s, int j2, String s1, int k2, int l2, 
            String s2)
    {
        versionCode = i;
        zzqL = j;
        backgroundColor = k;
        zzqM = l;
        zzqN = i1;
        zzqO = j1;
        zzqP = k1;
        zzqQ = l1;
        zzqR = i2;
        zzqS = s;
        zzqT = j2;
        zzqU = s1;
        zzqV = k2;
        zzqW = l2;
        zzqX = s2;
    }

    public SearchAdRequestParcel(SearchAdRequest searchadrequest)
    {
        versionCode = 1;
        zzqL = searchadrequest.getAnchorTextColor();
        backgroundColor = searchadrequest.getBackgroundColor();
        zzqM = searchadrequest.getBackgroundGradientBottom();
        zzqN = searchadrequest.getBackgroundGradientTop();
        zzqO = searchadrequest.getBorderColor();
        zzqP = searchadrequest.getBorderThickness();
        zzqQ = searchadrequest.getBorderType();
        zzqR = searchadrequest.getCallButtonColor();
        zzqS = searchadrequest.getCustomChannels();
        zzqT = searchadrequest.getDescriptionTextColor();
        zzqU = searchadrequest.getFontFace();
        zzqV = searchadrequest.getHeaderTextColor();
        zzqW = searchadrequest.getHeaderTextSize();
        zzqX = searchadrequest.getQuery();
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzx.zza(this, parcel, i);
    }

}
