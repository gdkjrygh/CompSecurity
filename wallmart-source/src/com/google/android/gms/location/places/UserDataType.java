// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzx;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

// Referenced classes of package com.google.android.gms.location.places:
//            zzm

public final class UserDataType
    implements SafeParcelable
{

    public static final zzm CREATOR = new zzm();
    public static final UserDataType zzaDW;
    public static final UserDataType zzaDX;
    public static final UserDataType zzaDY;
    public static final Set zzaDZ;
    final int mVersionCode;
    final String zzFz;
    final int zzaEa;

    UserDataType(int i, String s, int j)
    {
        zzx.zzcs(s);
        mVersionCode = i;
        zzFz = s;
        zzaEa = j;
    }

    private static UserDataType zzz(String s, int i)
    {
        return new UserDataType(0, s, i);
    }

    public int describeContents()
    {
        zzm zzm1 = CREATOR;
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
            if (!zzFz.equals(((UserDataType) (obj)).zzFz) || zzaEa != ((UserDataType) (obj)).zzaEa)
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        return zzFz.hashCode();
    }

    public String toString()
    {
        return zzFz;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzm zzm1 = CREATOR;
        zzm.zza(this, parcel, i);
    }

    static 
    {
        zzaDW = zzz("test_type", 1);
        zzaDX = zzz("labeled_place", 6);
        zzaDY = zzz("here_content", 7);
        zzaDZ = Collections.unmodifiableSet(new HashSet(Arrays.asList(new UserDataType[] {
            zzaDW, zzaDX, zzaDY
        })));
    }
}
