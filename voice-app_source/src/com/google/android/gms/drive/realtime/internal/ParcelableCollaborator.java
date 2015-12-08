// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.realtime.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.drive.realtime.internal:
//            zzp

public class ParcelableCollaborator
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new zzp();
    final int zzCY;
    final String zzEO;
    final String zzFE;
    final String zzadI;
    final boolean zzais;
    final boolean zzait;
    final String zzaiu;
    final String zzaiv;

    ParcelableCollaborator(int i, boolean flag, boolean flag1, String s, String s1, String s2, String s3, 
            String s4)
    {
        zzCY = i;
        zzais = flag;
        zzait = flag1;
        zzFE = s;
        zzEO = s1;
        zzadI = s2;
        zzaiu = s3;
        zzaiv = s4;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (this == obj)
        {
            return true;
        }
        if (!(obj instanceof ParcelableCollaborator))
        {
            return false;
        } else
        {
            obj = (ParcelableCollaborator)obj;
            return zzFE.equals(((ParcelableCollaborator) (obj)).zzFE);
        }
    }

    public int hashCode()
    {
        return zzFE.hashCode();
    }

    public String toString()
    {
        return (new StringBuilder()).append("Collaborator [isMe=").append(zzais).append(", isAnonymous=").append(zzait).append(", sessionId=").append(zzFE).append(", userId=").append(zzEO).append(", displayName=").append(zzadI).append(", color=").append(zzaiu).append(", photoUrl=").append(zzaiv).append("]").toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzp.zza(this, parcel, i);
    }

}
