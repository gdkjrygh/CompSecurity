// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.wearable.zzb;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            zze

public class AncsNotificationParcelable
    implements SafeParcelable, zzb
{

    public static final android.os.Parcelable.Creator CREATOR = new zze();
    private int mId;
    final int zzCY;
    private final String zzRx;
    private final String zzaEw;
    private final String zzaTu;
    private byte zzaTv;
    private byte zzaTw;
    private byte zzaTx;
    private byte zzaTy;
    private String zzadI;
    private final String zzadv;
    private final String zzaox;

    AncsNotificationParcelable(int i, int j, String s, String s1, String s2, String s3, String s4, 
            String s5, byte byte0, byte byte1, byte byte2, byte byte3)
    {
        mId = j;
        zzCY = i;
        zzaEw = s;
        zzaTu = s1;
        zzRx = s2;
        zzadv = s3;
        zzaox = s4;
        zzadI = s5;
        zzaTv = byte0;
        zzaTw = byte1;
        zzaTx = byte2;
        zzaTy = byte3;
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
            if (zzaTy != ((AncsNotificationParcelable) (obj)).zzaTy)
            {
                return false;
            }
            if (zzaTx != ((AncsNotificationParcelable) (obj)).zzaTx)
            {
                return false;
            }
            if (zzaTw != ((AncsNotificationParcelable) (obj)).zzaTw)
            {
                return false;
            }
            if (zzaTv != ((AncsNotificationParcelable) (obj)).zzaTv)
            {
                return false;
            }
            if (mId != ((AncsNotificationParcelable) (obj)).mId)
            {
                return false;
            }
            if (zzCY != ((AncsNotificationParcelable) (obj)).zzCY)
            {
                return false;
            }
            if (!zzaEw.equals(((AncsNotificationParcelable) (obj)).zzaEw))
            {
                return false;
            }
            if (zzaTu == null ? ((AncsNotificationParcelable) (obj)).zzaTu != null : !zzaTu.equals(((AncsNotificationParcelable) (obj)).zzaTu))
            {
                return false;
            }
            if (!zzadI.equals(((AncsNotificationParcelable) (obj)).zzadI))
            {
                return false;
            }
            if (!zzRx.equals(((AncsNotificationParcelable) (obj)).zzRx))
            {
                return false;
            }
            if (!zzaox.equals(((AncsNotificationParcelable) (obj)).zzaox))
            {
                return false;
            }
            if (!zzadv.equals(((AncsNotificationParcelable) (obj)).zzadv))
            {
                return false;
            }
        }
        return true;
    }

    public String getDisplayName()
    {
        if (zzadI == null)
        {
            return zzaEw;
        } else
        {
            return zzadI;
        }
    }

    public int getId()
    {
        return mId;
    }

    public String getTitle()
    {
        return zzadv;
    }

    public int hashCode()
    {
        int j = zzCY;
        int k = mId;
        int l = zzaEw.hashCode();
        int i;
        if (zzaTu != null)
        {
            i = zzaTu.hashCode();
        } else
        {
            i = 0;
        }
        return ((((((((i + ((j * 31 + k) * 31 + l) * 31) * 31 + zzRx.hashCode()) * 31 + zzadv.hashCode()) * 31 + zzaox.hashCode()) * 31 + zzadI.hashCode()) * 31 + zzaTv) * 31 + zzaTw) * 31 + zzaTx) * 31 + zzaTy;
    }

    public String toString()
    {
        return (new StringBuilder()).append("AncsNotificationParcelable{mVersionCode=").append(zzCY).append(", mId=").append(mId).append(", mAppId='").append(zzaEw).append('\'').append(", mDateTime='").append(zzaTu).append('\'').append(", mNotificationText='").append(zzRx).append('\'').append(", mTitle='").append(zzadv).append('\'').append(", mSubtitle='").append(zzaox).append('\'').append(", mDisplayName='").append(zzadI).append('\'').append(", mEventId=").append(zzaTv).append(", mEventFlags=").append(zzaTw).append(", mCategoryId=").append(zzaTx).append(", mCategoryCount=").append(zzaTy).append('}').toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zze.zza(this, parcel, i);
    }

    public String zzAU()
    {
        return zzaTu;
    }

    public String zzAV()
    {
        return zzRx;
    }

    public byte zzAW()
    {
        return zzaTv;
    }

    public byte zzAX()
    {
        return zzaTw;
    }

    public byte zzAY()
    {
        return zzaTx;
    }

    public byte zzAZ()
    {
        return zzaTy;
    }

    public String zzsK()
    {
        return zzaEw;
    }

    public String zzsb()
    {
        return zzaox;
    }

}
