// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            hy, ge, gf

public final class hw
    implements SafeParcelable
{

    public static final hy CREATOR = new hy();
    public final String FO;
    public final String FP;
    public final String FQ;
    public final List FR;
    public final String name;
    public final int versionCode;

    public hw(int i, String s, String s1, String s2, String s3, List list)
    {
        versionCode = i;
        name = s;
        FO = s1;
        FP = s2;
        FQ = s3;
        FR = list;
    }

    public final int describeContents()
    {
        hy hy1 = CREATOR;
        return 0;
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof hw))
            {
                return false;
            }
            obj = (hw)obj;
            if (!ge.a(name, ((hw) (obj)).name) || !ge.a(FO, ((hw) (obj)).FO) || !ge.a(FP, ((hw) (obj)).FP) || !ge.a(FQ, ((hw) (obj)).FQ) || !ge.a(FR, ((hw) (obj)).FR))
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            name, FO, FP, FQ
        });
    }

    public final String toString()
    {
        return ge.a(this).a("name", name).a("address", FO).a("internationalPhoneNumber", FP).a("regularOpenHours", FQ).a("attributions", FR).toString();
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        hy hy1 = CREATOR;
        hy.a(this, parcel);
    }

}
