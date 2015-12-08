// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.nearby.sharing;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzt;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.nearby.sharing:
//            zzc, ViewableItem, LocalContent

public class SharedContent
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new zzc();
    private final int versionCode;
    private String zzaGl;
    private ViewableItem zzaGm[];
    private LocalContent zzaGn[];

    private SharedContent()
    {
        versionCode = 2;
    }

    SharedContent(int i, String s, ViewableItem aviewableitem[], LocalContent alocalcontent[])
    {
        versionCode = i;
        zzaGl = s;
        zzaGm = aviewableitem;
        zzaGn = alocalcontent;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof SharedContent))
            {
                return false;
            }
            obj = (SharedContent)obj;
            if (!zzt.equal(zzaGm, ((SharedContent) (obj)).zzaGm) || !zzt.equal(zzaGn, ((SharedContent) (obj)).zzaGn) || !zzt.equal(zzaGl, ((SharedContent) (obj)).zzaGl))
            {
                return false;
            }
        }
        return true;
    }

    public String getUri()
    {
        return zzaGl;
    }

    int getVersionCode()
    {
        return versionCode;
    }

    public int hashCode()
    {
        return zzt.hashCode(new Object[] {
            zzaGm, zzaGn, zzaGl
        });
    }

    public String toString()
    {
        return (new StringBuilder()).append("SharedContent[viewableItems=").append(Arrays.toString(zzaGm)).append(", localContents=").append(Arrays.toString(zzaGn)).append("]").toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzc.zza(this, parcel, i);
    }

    public ViewableItem[] zzxe()
    {
        return zzaGm;
    }

    public LocalContent[] zzxf()
    {
        return zzaGn;
    }

}
