// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.firstparty.dataservice;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.auth.firstparty.dataservice:
//            p

public class GplusInfoResponse
    implements SafeParcelable
{

    public static final p CREATOR = new p();
    String mO;
    boolean mP;
    String mQ;
    boolean mR;
    boolean mS;
    String mT;
    String mU;
    String mp;
    String mq;
    final int version;

    GplusInfoResponse(int i, boolean flag, String s, String s1, String s2, boolean flag1, boolean flag2, 
            String s3, String s4, String s5)
    {
        version = i;
        mP = flag;
        mp = s;
        mq = s1;
        mQ = s2;
        mR = flag1;
        mS = flag2;
        mT = s3;
        mO = s4;
        mU = s5;
    }

    public GplusInfoResponse(boolean flag, String s, String s1, String s2, boolean flag1, boolean flag2, String s3, 
            String s4, String s5)
    {
        version = 1;
        mP = flag;
        mp = s;
        mq = s1;
        mQ = s2;
        mT = s3;
        mO = s4;
        mR = flag1;
        mS = flag2;
        mU = s5;
    }

    public int describeContents()
    {
        return 0;
    }

    public String getFirstName()
    {
        return mp;
    }

    public String getLastName()
    {
        return mq;
    }

    public String getPicasaUser()
    {
        return mQ;
    }

    public String getRopRevision()
    {
        return mO;
    }

    public String getRopText()
    {
        return mT;
    }

    public String getWireCode()
    {
        return mU;
    }

    public boolean hasEsMobile()
    {
        return mS;
    }

    public boolean hasGooglePlus()
    {
        return mR;
    }

    public boolean isAllowed()
    {
        return mP;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        p.a(this, parcel);
    }

}
