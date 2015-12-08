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
//            PersonEntity, zze

public static final class zzma extends FastSafeParcelableJsonResponse
{

    public static final zze CREATOR = new zze();
    private static final HashMap zzazC;
    String zzAX;
    final Set zzazD;
    int zzma;
    int zzmb;
    final int zzzH;

    public int describeContents()
    {
        zze zze1 = CREATOR;
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
        zze zze1 = CREATOR;
        zze.zza(this, parcel, i);
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
            return Integer.valueOf(zzmb);

        case 3: // '\003'
            return zzAX;

        case 4: // '\004'
            return Integer.valueOf(zzma);
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
        zzazC.put("height", com.google.android.gms.common.server.response.ity.zzazC("height", 2));
        zzazC.put("url", com.google.android.gms.common.server.response.ity.zzazC("url", 3));
        zzazC.put("width", com.google.android.gms.common.server.response.ity.zzazC("width", 4));
    }

    public a()
    {
        zzzH = 1;
        zzazD = new HashSet();
    }

    zzazD(Set set, int i, int j, String s, int k)
    {
        zzazD = set;
        zzzH = i;
        zzmb = j;
        zzAX = s;
        zzma = k;
    }
}
