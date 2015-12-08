// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.firstparty.shared;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.google.android.gms.auth.firstparty.shared:
//            i, FACLData

public class ScopeDetail
    implements SafeParcelable
{

    public static final i CREATOR = new i();
    String description;
    public FACLData friendPickerData;
    String lX;
    String mZ;
    String nN;
    String nO;
    List nP;
    final int version;

    ScopeDetail(int j, String s, String s1, String s2, String s3, String s4, List list, 
            FACLData facldata)
    {
        version = j;
        description = s;
        lX = s1;
        nN = s2;
        nO = s3;
        mZ = s4;
        nP = list;
        friendPickerData = facldata;
    }

    public ScopeDetail(String s, String s1, String s2, String s3, String s4, FACLData facldata, List list)
    {
        version = 1;
        mZ = s;
        description = s1;
        lX = s2;
        nN = s3;
        nO = s4;
        friendPickerData = facldata;
        nP = new ArrayList();
        nP.addAll(list);
    }

    public int describeContents()
    {
        return 0;
    }

    public String getDescription()
    {
        return description;
    }

    public String getDetail()
    {
        return lX;
    }

    public FACLData getFriendPickerData()
    {
        return friendPickerData;
    }

    public String getIconBase64()
    {
        return nN;
    }

    public String getPaclPickerBase64()
    {
        return nO;
    }

    public String getService()
    {
        return mZ;
    }

    public List getUnmodifiableWarnings()
    {
        return Collections.unmodifiableList(nP);
    }

    public void writeToParcel(Parcel parcel, int j)
    {
        i.a(this, parcel, j);
    }

}
