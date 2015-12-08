// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.cast;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.cast.internal.zzf;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzt;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.gms.cast:
//            zza

public final class ApplicationMetadata
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new zza();
    String mName;
    private final int zzCY;
    String zzQv;
    List zzQw;
    String zzQx;
    Uri zzQy;
    List zzvi;

    private ApplicationMetadata()
    {
        zzCY = 1;
        zzvi = new ArrayList();
        zzQw = new ArrayList();
    }

    ApplicationMetadata(int i, String s, String s1, List list, List list1, String s2, Uri uri)
    {
        zzCY = i;
        zzQv = s;
        mName = s1;
        zzvi = list;
        zzQw = list1;
        zzQx = s2;
        zzQy = uri;
    }

    public boolean areNamespacesSupported(List list)
    {
        return zzQw != null && zzQw.containsAll(list);
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof ApplicationMetadata))
            {
                return false;
            }
            obj = (ApplicationMetadata)obj;
            if (!zzf.zza(zzQv, ((ApplicationMetadata) (obj)).zzQv) || !zzf.zza(zzvi, ((ApplicationMetadata) (obj)).zzvi) || !zzf.zza(mName, ((ApplicationMetadata) (obj)).mName) || !zzf.zza(zzQw, ((ApplicationMetadata) (obj)).zzQw) || !zzf.zza(zzQx, ((ApplicationMetadata) (obj)).zzQx) || !zzf.zza(zzQy, ((ApplicationMetadata) (obj)).zzQy))
            {
                return false;
            }
        }
        return true;
    }

    public String getApplicationId()
    {
        return zzQv;
    }

    public List getImages()
    {
        return zzvi;
    }

    public String getName()
    {
        return mName;
    }

    public String getSenderAppIdentifier()
    {
        return zzQx;
    }

    int getVersionCode()
    {
        return zzCY;
    }

    public int hashCode()
    {
        return zzt.hashCode(new Object[] {
            Integer.valueOf(zzCY), zzQv, mName, zzvi, zzQw, zzQx, zzQy
        });
    }

    public boolean isNamespaceSupported(String s)
    {
        return zzQw != null && zzQw.contains(s);
    }

    public String toString()
    {
        boolean flag = false;
        StringBuilder stringbuilder = (new StringBuilder()).append("applicationId: ").append(zzQv).append(", name: ").append(mName).append(", images.count: ");
        int i;
        if (zzvi == null)
        {
            i = 0;
        } else
        {
            i = zzvi.size();
        }
        stringbuilder = stringbuilder.append(i).append(", namespaces.count: ");
        if (zzQw == null)
        {
            i = ((flag) ? 1 : 0);
        } else
        {
            i = zzQw.size();
        }
        return stringbuilder.append(i).append(", senderAppIdentifier: ").append(zzQx).append(", senderAppLaunchUrl: ").append(zzQy).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zza.zza(this, parcel, i);
    }

    public Uri zzle()
    {
        return zzQy;
    }

}
