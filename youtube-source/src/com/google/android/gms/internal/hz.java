// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.internal:
//            ib, ge, gf

public class hz
    implements SafeParcelable
{

    public static final ib CREATOR = new ib();
    public final String FW;
    public final String localeString;
    public final int versionCode;

    public hz(int i, String s, String s1)
    {
        versionCode = i;
        FW = s;
        localeString = s1;
    }

    public int describeContents()
    {
        ib ib1 = CREATOR;
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || !(obj instanceof hz))
            {
                return false;
            }
            obj = (hz)obj;
            if (!localeString.equals(((hz) (obj)).localeString) || !FW.equals(((hz) (obj)).FW))
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            FW, localeString
        });
    }

    public String toString()
    {
        return ge.a(this).a("clientPackageName", FW).a("locale", localeString).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        ib ib1 = CREATOR;
        ib.a(this, parcel);
    }

}
