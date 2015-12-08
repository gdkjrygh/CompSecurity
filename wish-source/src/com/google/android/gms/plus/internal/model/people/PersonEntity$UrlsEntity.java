// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.plus.internal.model.people;

import android.os.Parcel;
import com.google.android.gms.common.server.converter.StringToIntConverter;
import com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.plus.internal.model.people:
//            PersonEntity, zzj

public static final class mValue extends FastSafeParcelableJsonResponse
{

    public static final zzj CREATOR = new zzj();
    private static final HashMap zzazC;
    String mValue;
    int zzMG;
    private final int zzaBi;
    String zzawK;
    final Set zzazD;
    final int zzzH;

    public int describeContents()
    {
        zzj zzj1 = CREATOR;
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
        zzj zzj1 = CREATOR;
        zzj.zza(this, parcel, i);
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

        case 5: // '\005'
            return zzawK;

        case 6: // '\006'
            return Integer.valueOf(zzMG);

        case 4: // '\004'
            return mValue;
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

    public int zzvW()
    {
        return 4;
    }

    static 
    {
        zzazC = new HashMap();
        zzazC.put("label", com.google.android.gms.common.server.response.zk("label", 5));
        zzazC.put("type", com.google.android.gms.common.server.response.za("type", 6, (new StringToIntConverter()).zzg("home", 0).zzg("work", 1).zzg("blog", 2).zzg("profile", 3).zzg("other", 4).zzg("otherProfile", 5).zzg("contributor", 6).zzg("website", 7), false));
        zzazC.put("value", com.google.android.gms.common.server.response.zk("value", 4));
    }

    public se()
    {
        zzaBi = 4;
        zzzH = 1;
        zzazD = new HashSet();
    }

    zzazD(Set set, int i, String s, int j, String s1, int k)
    {
        zzaBi = 4;
        zzazD = set;
        zzzH = i;
        zzawK = s;
        zzMG = j;
        mValue = s1;
    }
}
