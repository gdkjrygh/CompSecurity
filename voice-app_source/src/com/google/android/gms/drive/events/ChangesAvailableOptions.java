// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.events;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzt;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;

// Referenced classes of package com.google.android.gms.drive.events:
//            zzd

public final class ChangesAvailableOptions
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new zzd();
    final int zzCY;
    final int zzadP;
    final boolean zzadQ;
    final List zzadR;
    private final Set zzadS;

    ChangesAvailableOptions(int i, int j, boolean flag, List list)
    {
        Object obj;
        if (list == null)
        {
            obj = null;
        } else
        {
            obj = new HashSet(list);
        }
        this(i, j, flag, list, ((Set) (obj)));
    }

    private ChangesAvailableOptions(int i, int j, boolean flag, List list, Set set)
    {
        zzCY = i;
        zzadP = j;
        zzadQ = flag;
        zzadR = list;
        zzadS = set;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        boolean flag1 = true;
        if (obj != null && obj.getClass() == getClass()) goto _L2; else goto _L1
_L1:
        boolean flag = false;
_L4:
        return flag;
_L2:
        flag = flag1;
        if (obj == this) goto _L4; else goto _L3
_L3:
        obj = (ChangesAvailableOptions)obj;
        if (!zzt.equal(zzadS, ((ChangesAvailableOptions) (obj)).zzadS) || zzadP != ((ChangesAvailableOptions) (obj)).zzadP)
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (zzadQ == ((ChangesAvailableOptions) (obj)).zzadQ) goto _L4; else goto _L5
_L5:
        return false;
    }

    public int hashCode()
    {
        return zzt.hashCode(new Object[] {
            zzadS, Integer.valueOf(zzadP), Boolean.valueOf(zzadQ)
        });
    }

    public String toString()
    {
        return String.format(Locale.US, "ChangesAvailableOptions[ChangesSizeLimit=%d, Repeats=%s, Spaces=%s]", new Object[] {
            Integer.valueOf(zzadP), Boolean.valueOf(zzadQ), zzadR
        });
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzd.zza(this, parcel, i);
    }

}
