// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.wearable.zzd;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            zzg

public class AncsNotificationParcelable
    implements SafeParcelable, zzd
{

    public static final android.os.Parcelable.Creator CREATOR = new zzg();
    private int mId;
    final int mVersionCode;
    private final String zzTZ;
    private final String zzaIs;
    private byte zzaZA;
    private final String zzaZw;
    private byte zzaZx;
    private byte zzaZy;
    private byte zzaZz;
    private final String zzagU;
    private String zzahh;
    private final String zzasq;

    AncsNotificationParcelable(int i, int j, String s, String s1, String s2, String s3, String s4, 
            String s5, byte byte0, byte byte1, byte byte2, byte byte3)
    {
        mId = j;
        mVersionCode = i;
        zzaIs = s;
        zzaZw = s1;
        zzTZ = s2;
        zzagU = s3;
        zzasq = s4;
        zzahh = s5;
        zzaZx = byte0;
        zzaZy = byte1;
        zzaZz = byte2;
        zzaZA = byte3;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (AncsNotificationParcelable)obj;
            if (zzaZA != ((AncsNotificationParcelable) (obj)).zzaZA)
            {
                return false;
            }
            if (zzaZz != ((AncsNotificationParcelable) (obj)).zzaZz)
            {
                return false;
            }
            if (zzaZy != ((AncsNotificationParcelable) (obj)).zzaZy)
            {
                return false;
            }
            if (zzaZx != ((AncsNotificationParcelable) (obj)).zzaZx)
            {
                return false;
            }
            if (mId != ((AncsNotificationParcelable) (obj)).mId)
            {
                return false;
            }
            if (mVersionCode != ((AncsNotificationParcelable) (obj)).mVersionCode)
            {
                return false;
            }
            if (!zzaIs.equals(((AncsNotificationParcelable) (obj)).zzaIs))
            {
                return false;
            }
            if (zzaZw == null ? ((AncsNotificationParcelable) (obj)).zzaZw != null : !zzaZw.equals(((AncsNotificationParcelable) (obj)).zzaZw))
            {
                return false;
            }
            if (!zzahh.equals(((AncsNotificationParcelable) (obj)).zzahh))
            {
                return false;
            }
            if (!zzTZ.equals(((AncsNotificationParcelable) (obj)).zzTZ))
            {
                return false;
            }
            if (!zzasq.equals(((AncsNotificationParcelable) (obj)).zzasq))
            {
                return false;
            }
            if (!zzagU.equals(((AncsNotificationParcelable) (obj)).zzagU))
            {
                return false;
            }
        }
        return true;
    }

    public String getDisplayName()
    {
        if (zzahh == null)
        {
            return zzaIs;
        } else
        {
            return zzahh;
        }
    }

    public int getId()
    {
        return mId;
    }

    public String getTitle()
    {
        return zzagU;
    }

    public int hashCode()
    {
        int j = mVersionCode;
        int k = mId;
        int l = zzaIs.hashCode();
        int i;
        if (zzaZw != null)
        {
            i = zzaZw.hashCode();
        } else
        {
            i = 0;
        }
        return ((((((((i + ((j * 31 + k) * 31 + l) * 31) * 31 + zzTZ.hashCode()) * 31 + zzagU.hashCode()) * 31 + zzasq.hashCode()) * 31 + zzahh.hashCode()) * 31 + zzaZx) * 31 + zzaZy) * 31 + zzaZz) * 31 + zzaZA;
    }

    public String toString()
    {
        return (new StringBuilder()).append("AncsNotificationParcelable{mVersionCode=").append(mVersionCode).append(", mId=").append(mId).append(", mAppId='").append(zzaIs).append('\'').append(", mDateTime='").append(zzaZw).append('\'').append(", mNotificationText='").append(zzTZ).append('\'').append(", mTitle='").append(zzagU).append('\'').append(", mSubtitle='").append(zzasq).append('\'').append(", mDisplayName='").append(zzahh).append('\'').append(", mEventId=").append(zzaZx).append(", mEventFlags=").append(zzaZy).append(", mCategoryId=").append(zzaZz).append(", mCategoryCount=").append(zzaZA).append('}').toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzg.zza(this, parcel, i);
    }

    public byte zzCA()
    {
        return zzaZz;
    }

    public byte zzCB()
    {
        return zzaZA;
    }

    public String zzCw()
    {
        return zzaZw;
    }

    public String zzCx()
    {
        return zzTZ;
    }

    public byte zzCy()
    {
        return zzaZx;
    }

    public byte zzCz()
    {
        return zzaZy;
    }

    public String zztW()
    {
        return zzaIs;
    }

    public String zztn()
    {
        return zzasq;
    }

}
