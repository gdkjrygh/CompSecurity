// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.nearby.messages.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzt;

// Referenced classes of package com.google.android.gms.nearby.messages.internal:
//            zzd

public class MessageType
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new zzd();
    public final String type;
    final int versionCode;
    public final String zzaby;

    MessageType(int i, String s, String s1)
    {
        versionCode = i;
        zzaby = s;
        type = s1;
    }

    public MessageType(String s, String s1)
    {
        this(1, s, s1);
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof MessageType))
            {
                return false;
            }
            obj = (MessageType)obj;
            if (!zzt.equal(zzaby, ((MessageType) (obj)).zzaby) || !zzt.equal(type, ((MessageType) (obj)).type))
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        return zzt.hashCode(new Object[] {
            zzaby, type
        });
    }

    public String toString()
    {
        return (new StringBuilder()).append("namespace=").append(zzaby).append(", type=").append(type).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzd.zza(this, parcel, i);
    }

}
