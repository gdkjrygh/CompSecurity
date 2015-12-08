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
//            PersonEntity, zzf

public static final class zzAX extends FastSafeParcelableJsonResponse
    implements com.google.android.gms.plus.model.people.onResponse
{

    public static final zzf CREATOR = new zzf();
    private static final HashMap zzazC;
    String zzAX;
    final Set zzazD;
    final int zzzH;

    public int describeContents()
    {
        zzf zzf1 = CREATOR;
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

    public String getUrl()
    {
        return zzAX;
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
                int j = ity.mE();
                i = zzb(ity).hashCode() + (i + j);
            }
        } while (true);
        return i;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzf zzf1 = CREATOR;
        zzf.zza(this, parcel, i);
    }

    protected boolean zza(com.google.android.gms.common.server.response.ity ity)
    {
        return zzazD.contains(Integer.valueOf(ity.mE()));
    }

    protected Object zzb(com.google.android.gms.common.server.response.ity ity)
    {
        switch (ity.mE())
        {
        default:
            throw new IllegalStateException((new StringBuilder()).append("Unknown safe parcelable id=").append(ity.mE()).toString());

        case 2: // '\002'
            return zzAX;
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
        zzazC.put("url", com.google.android.gms.common.server.response.k("url", 2));
    }

    public e()
    {
        zzzH = 1;
        zzazD = new HashSet();
    }

    public zzazD(String s)
    {
        zzazD = new HashSet();
        zzzH = 1;
        zzAX = s;
        zzazD.add(Integer.valueOf(2));
    }

    zzazD(Set set, int i, String s)
    {
        zzazD = set;
        zzzH = i;
        zzAX = s;
    }
}
