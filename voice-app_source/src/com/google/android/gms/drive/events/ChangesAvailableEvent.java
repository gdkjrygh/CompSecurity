// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.events;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzt;
import java.util.Locale;

// Referenced classes of package com.google.android.gms.drive.events:
//            DriveEvent, zzb, ChangesAvailableOptions

public final class ChangesAvailableEvent
    implements SafeParcelable, DriveEvent
{

    public static final android.os.Parcelable.Creator CREATOR = new zzb();
    final int zzCY;
    final String zzOx;
    final ChangesAvailableOptions zzadO;

    ChangesAvailableEvent(int i, String s, ChangesAvailableOptions changesavailableoptions)
    {
        zzCY = i;
        zzOx = s;
        zzadO = changesavailableoptions;
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
        obj = (ChangesAvailableEvent)obj;
        if (!zzt.equal(zzadO, ((ChangesAvailableEvent) (obj)).zzadO))
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (zzt.equal(zzOx, ((ChangesAvailableEvent) (obj)).zzOx)) goto _L4; else goto _L5
_L5:
        return false;
    }

    public int getType()
    {
        return 4;
    }

    public int hashCode()
    {
        return zzt.hashCode(new Object[] {
            zzadO, zzOx
        });
    }

    public String toString()
    {
        return String.format(Locale.US, "ChangesAvailableEvent [changesAvailableOptions=%s]", new Object[] {
            zzadO
        });
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzb.zza(this, parcel, i);
    }

}
