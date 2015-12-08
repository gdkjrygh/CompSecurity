// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places.personalized;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;
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
        final int mVersionCode;
        private final String zzPb;
        private final String zzagU;

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
                if (!zzw.equal(zzagU, ((Action) (obj)).zzagU) || !zzw.equal(zzPb, ((Action) (obj)).zzPb))
                {
                    return false;
                }
            }
            return true;
        }

        public String getTitle()
        {
            return zzagU;
        }

        public String getUri()
        {
            return zzPb;
        }

        public int hashCode()
        {
            return zzw.hashCode(new Object[] {
                zzagU, zzPb
            });
        }

        public String toString()
        {
            return zzw.zzu(this).zzg("title", zzagU).zzg("uri", zzPb).toString();
        }

        public void writeToParcel(Parcel parcel, int i)
        {
            zza zza1 = CREATOR;
            zza.zza(this, parcel, i);
        }


        Action(int i, String s, String s1)
        {
            mVersionCode = i;
            zzagU = s;
            zzPb = s1;
        }
    }


    public static final zzb CREATOR = new zzb();
    final int mVersionCode;
    private final String zzaFe;
    private final List zzaFf;

    HereContent(int i, String s, List list)
    {
        mVersionCode = i;
        zzaFe = s;
        zzaFf = list;
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
            if (!zzw.equal(zzaFe, ((HereContent) (obj)).zzaFe) || !zzw.equal(zzaFf, ((HereContent) (obj)).zzaFf))
            {
                return false;
            }
        }
        return true;
    }

    public List getActions()
    {
        return zzaFf;
    }

    public String getData()
    {
        return zzaFe;
    }

    public int hashCode()
    {
        return zzw.hashCode(new Object[] {
            zzaFe, zzaFf
        });
    }

    public String toString()
    {
        return zzw.zzu(this).zzg("data", zzaFe).zzg("actions", zzaFf).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzb zzb1 = CREATOR;
        zzb.zza(this, parcel, i);
    }

}
