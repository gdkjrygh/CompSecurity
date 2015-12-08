// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.internal:
//            jd, ge, gf

public class ke
    implements SafeParcelable
{

    public static final jd CREATOR = new jd();
    private final String LT[];
    private final String LU[];
    private final String LV[];
    private final String LW;
    private final String LX;
    private final String LY;
    private final String LZ;
    private final int jE;
    private final String lr;

    ke(int i, String s, String as[], String as1[], String as2[], String s1, String s2, 
            String s3, String s4)
    {
        jE = i;
        lr = s;
        LT = as;
        LU = as1;
        LV = as2;
        LW = s1;
        LX = s2;
        LY = s3;
        LZ = s4;
    }

    public ke(String s, String as[], String as1[], String as2[], String s1, String s2, String s3)
    {
        jE = 1;
        lr = s;
        LT = as;
        LU = as1;
        LV = as2;
        LW = s1;
        LX = s2;
        LY = s3;
        LZ = null;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof ke)
        {
            if (jE == ((ke) (obj = (ke)obj)).jE && ge.a(lr, ((ke) (obj)).lr) && Arrays.equals(LT, ((ke) (obj)).LT) && Arrays.equals(LU, ((ke) (obj)).LU) && Arrays.equals(LV, ((ke) (obj)).LV) && ge.a(LW, ((ke) (obj)).LW) && ge.a(LX, ((ke) (obj)).LX) && ge.a(LY, ((ke) (obj)).LY) && ge.a(LZ, ((ke) (obj)).LZ))
            {
                return true;
            }
        }
        return false;
    }

    public String fA()
    {
        return LZ;
    }

    public String[] fu()
    {
        return LT;
    }

    public String[] fv()
    {
        return LU;
    }

    public String[] fw()
    {
        return LV;
    }

    public String fx()
    {
        return LW;
    }

    public String fy()
    {
        return LX;
    }

    public String fz()
    {
        return LY;
    }

    public String getAccountName()
    {
        return lr;
    }

    public int getVersionCode()
    {
        return jE;
    }

    public int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            Integer.valueOf(jE), lr, LT, LU, LV, LW, LX, LY, LZ
        });
    }

    public String toString()
    {
        return ge.a(this).a("versionCode", Integer.valueOf(jE)).a("accountName", lr).a("requestedScopes", LT).a("visibleActivities", LU).a("requiredFeatures", LV).a("packageNameForAuth", LW).a("callingPackageName", LX).a("applicationName", LY).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        jd.a(this, parcel);
    }

}
