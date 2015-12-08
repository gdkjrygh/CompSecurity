// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places.personalized;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzt;
import java.util.List;

// Referenced classes of package com.google.android.gms.location.places.personalized:
//            zzb, zza

public class HereContent
    implements SafeParcelable
{
    public static final class Action
        implements SafeParcelable
    {

        public static final zza CREATOR = new zza();
        final int zzCY;
        private final String zzNb;
        private final String zzadv;

        public int describeContents()
        {
            zza zza1 = CREATOR;
            return 0;
        }

        public boolean equals(Object obj)
        {
            if (this != obj)
            {
                if (!(obj instanceof Action))
                {
                    return false;
                }
                obj = (Action)obj;
                if (!zzt.equal(zzadv, ((Action) (obj)).zzadv) || !zzt.equal(zzNb, ((Action) (obj)).zzNb))
                {
                    return false;
                }
            }
            return true;
        }

        public String getTitle()
        {
            return zzadv;
        }

        public String getUri()
        {
            return zzNb;
        }

        public int hashCode()
        {
            return zzt.hashCode(new Object[] {
                zzadv, zzNb
            });
        }

        public String toString()
        {
            return zzt.zzt(this).zzg("title", zzadv).zzg("uri", zzNb).toString();
        }

        public void writeToParcel(Parcel parcel, int i)
        {
            zza zza1 = CREATOR;
            zza.zza(this, parcel, i);
        }


        Action(int i, String s, String s1)
        {
            zzCY = i;
            zzadv = s;
            zzNb = s1;
        }
    }


    public static final zzb CREATOR = new zzb();
    final int zzCY;
    private final String zzaBe;
    private final List zzaBf;

    HereContent(int i, String s, List list)
    {
        zzCY = i;
        zzaBe = s;
        zzaBf = list;
    }

    public int describeContents()
    {
        zzb zzb1 = CREATOR;
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof HereContent))
            {
                return false;
            }
            obj = (HereContent)obj;
            if (!zzt.equal(zzaBe, ((HereContent) (obj)).zzaBe) || !zzt.equal(zzaBf, ((HereContent) (obj)).zzaBf))
            {
                return false;
            }
        }
        return true;
    }

    public List getActions()
    {
        return zzaBf;
    }

    public String getData()
    {
        return zzaBe;
    }

    public int hashCode()
    {
        return zzt.hashCode(new Object[] {
            zzaBe, zzaBf
        });
    }

    public String toString()
    {
        return zzt.zzt(this).zzg("data", zzaBe).zzg("actions", zzaBf).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzb zzb1 = CREATOR;
        zzb.zza(this, parcel, i);
    }

}
