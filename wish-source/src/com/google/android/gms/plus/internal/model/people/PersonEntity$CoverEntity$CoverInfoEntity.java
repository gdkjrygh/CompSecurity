// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.plus.internal.model.people;

import android.os.Parcel;
import com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.plus.internal.model.people:
//            PersonEntity, zzd

public static final class zzaBa extends FastSafeParcelableJsonResponse
{

    public static final zzd CREATOR = new zzd();
    private static final HashMap zzazC;
    int zzaAZ;
    int zzaBa;
    final Set zzazD;
    final int zzzH;

    public int describeContents()
    {
        zzd zzd1 = CREATOR;
        return 0;
    }

    public boolean equals(Object obj)
    {
label0:
        {
            if (!(obj instanceof CREATOR))
            {
                return false;
            }
            if (this == obj)
            {
                return true;
            }
            obj = (CREATOR)obj;
            com.google.android.gms.common.server.response.ity ity;
label1:
            do
            {
                for (Iterator iterator = zzazC.values().iterator(); iterator.hasNext();)
                {
                    ity = (com.google.android.gms.common.server.response.ity.zzazC)iterator.next();
                    if (!zza(ity))
                    {
                        continue label1;
                    }
                    if (((zza) (obj)).zza(ity))
                    {
                        if (!zzb(ity).equals(((zzb) (obj)).zzb(ity)))
                        {
                            return false;
                        }
                    } else
                    {
                        return false;
                    }
                }

                break label0;
            } while (!((zzb) (obj)).zza(ity));
            return false;
        }
        return true;
    }

    public int hashCode()
    {
        Iterator iterator = zzazC.values().iterator();
        int i = 0;
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            com.google.android.gms.common.server.response.ity ity = (com.google.android.gms.common.server.response.ity.zzazC)iterator.next();
            if (zza(ity))
            {
                int j = ity.zza();
                i = zzb(ity).hashCode() + (i + j);
            }
        } while (true);
        return i;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzd zzd1 = CREATOR;
        zzd.zza(this, parcel, i);
    }

    protected boolean zza(com.google.android.gms.common.server.response.ity ity)
    {
        return zzazD.contains(Integer.valueOf(ity.zzazD()));
    }

    protected Object zzb(com.google.android.gms.common.server.response.ity ity)
    {
        switch (ity.ity())
        {
        default:
            throw new IllegalStateException((new StringBuilder()).append("Unknown safe parcelable id=").append(ity.ity()).toString());

        case 2: // '\002'
            return Integer.valueOf(zzaAZ);

        case 3: // '\003'
            return Integer.valueOf(zzaBa);
        }
    }

    public Map zzmx()
    {
        return zzvJ();
    }

    public HashMap zzvJ()
    {
        return zzazC;
    }

    static 
    {
        zzazC = new HashMap();
        zzazC.put("leftImageOffset", com.google.android.gms.common.server.response.ity.zzazC("leftImageOffset", 2));
        zzazC.put("topImageOffset", com.google.android.gms.common.server.response.ity.zzazC("topImageOffset", 3));
    }

    public ()
    {
        zzzH = 1;
        zzazD = new HashSet();
    }

    zzazD(Set set, int i, int j, int k)
    {
        zzazD = set;
        zzzH = i;
        zzaAZ = j;
        zzaBa = k;
    }
}
