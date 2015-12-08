// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzu;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

// Referenced classes of package com.google.android.gms.location.places:
//            zzn

public final class UserDataType
    implements SafeParcelable
{

    public static final zzn CREATOR = new zzn();
    public static final UserDataType zzaAa;
    public static final UserDataType zzaAb;
    public static final Set zzaAc;
    public static final UserDataType zzazZ;
    final int zzCY;
    final String zzEl;
    final int zzaAd;

    UserDataType(int i, String s, int j)
    {
        zzu.zzcj(s);
        zzCY = i;
        zzEl = s;
        zzaAd = j;
    }

    private static UserDataType zzy(String s, int i)
    {
        return new UserDataType(0, s, i);
    }

    public int describeContents()
    {
        zzn zzn1 = CREATOR;
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof UserDataType))
            {
                return false;
            }
            obj = (UserDataType)obj;
            if (!zzEl.equals(((UserDataType) (obj)).zzEl) || zzaAd != ((UserDataType) (obj)).zzaAd)
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        return zzEl.hashCode();
    }

    public String toString()
    {
        return zzEl;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzn zzn1 = CREATOR;
        zzn.zza(this, parcel, i);
    }

    static 
    {
        zzazZ = zzy("test_type", 1);
        zzaAa = zzy("labeled_place", 6);
        zzaAb = zzy("here_content", 7);
        zzaAc = Collections.unmodifiableSet(new HashSet(Arrays.asList(new UserDataType[] {
            zzazZ, zzaAa, zzaAb
        })));
    }
}
