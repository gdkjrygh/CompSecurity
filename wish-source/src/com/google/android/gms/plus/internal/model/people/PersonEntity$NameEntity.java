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
//            PersonEntity, zzg

public static final class zzaBe extends FastSafeParcelableJsonResponse
{

    public static final zzg CREATOR = new zzg();
    private static final HashMap zzazC;
    String zzaAb;
    String zzaAe;
    String zzaBb;
    String zzaBc;
    String zzaBd;
    String zzaBe;
    final Set zzazD;
    final int zzzH;

    public int describeContents()
    {
        zzg zzg1 = CREATOR;
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
                int j = ity.zmE();
                i = zzb(ity).hashCode() + (i + j);
            }
        } while (true);
        return i;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzg zzg1 = CREATOR;
        zzg.zza(this, parcel, i);
    }

    protected boolean zza(com.google.android.gms.common.server.response.ity ity)
    {
        return zzazD.contains(Integer.valueOf(ity.zmE()));
    }

    protected Object zzb(com.google.android.gms.common.server.response.ity ity)
    {
        switch (ity.zmE())
        {
        default:
            throw new IllegalStateException((new StringBuilder()).append("Unknown safe parcelable id=").append(ity.zmE()).toString());

        case 2: // '\002'
            return zzaAb;

        case 3: // '\003'
            return zzaBb;

        case 4: // '\004'
            return zzaAe;

        case 5: // '\005'
            return zzaBc;

        case 6: // '\006'
            return zzaBd;

        case 7: // '\007'
            return zzaBe;
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
        zzazC.put("familyName", com.google.android.gms.common.server.response.zk("familyName", 2));
        zzazC.put("formatted", com.google.android.gms.common.server.response.zk("formatted", 3));
        zzazC.put("givenName", com.google.android.gms.common.server.response.zk("givenName", 4));
        zzazC.put("honorificPrefix", com.google.android.gms.common.server.response.zk("honorificPrefix", 5));
        zzazC.put("honorificSuffix", com.google.android.gms.common.server.response.zk("honorificSuffix", 6));
        zzazC.put("middleName", com.google.android.gms.common.server.response.zk("middleName", 7));
    }

    public se()
    {
        zzzH = 1;
        zzazD = new HashSet();
    }

    zzazD(Set set, int i, String s, String s1, String s2, String s3, String s4, 
            String s5)
    {
        zzazD = set;
        zzzH = i;
        zzaAb = s;
        zzaBb = s1;
        zzaAe = s2;
        zzaBc = s3;
        zzaBd = s4;
        zzaBe = s5;
    }
}
