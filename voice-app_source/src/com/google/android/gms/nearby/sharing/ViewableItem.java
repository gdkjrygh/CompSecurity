// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.nearby.sharing;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzt;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.nearby.sharing:
//            zzf

public class ViewableItem
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new zzf();
    private final int versionCode;
    private String zzaGo[];

    private ViewableItem()
    {
        versionCode = 1;
    }

    ViewableItem(int i, String as[])
    {
        versionCode = i;
        zzaGo = as;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (obj == this)
        {
            return true;
        }
        if (!(obj instanceof ViewableItem))
        {
            return false;
        } else
        {
            obj = (ViewableItem)obj;
            return zzt.equal(zzaGo, ((ViewableItem) (obj)).zzaGo);
        }
    }

    int getVersionCode()
    {
        return versionCode;
    }

    public int hashCode()
    {
        return zzt.hashCode(new Object[] {
            zzaGo
        });
    }

    public String toString()
    {
        return (new StringBuilder()).append("ViewableItem[uris=").append(Arrays.toString(zzaGo)).append("]").toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzf.zza(this, parcel, i);
    }

    public String[] zzxg()
    {
        return zzaGo;
    }

}
