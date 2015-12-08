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
//            PersonEntity, zzh

public static final class zzMG extends FastSafeParcelableJsonResponse
{

    public static final zzh CREATOR = new zzh();
    private static final HashMap zzazC;
    String mName;
    int zzMG;
    String zzWn;
    String zzaAa;
    String zzaAq;
    String zzaBf;
    String zzaBg;
    boolean zzaBh;
    String zzadH;
    final Set zzazD;
    final int zzzH;

    public int describeContents()
    {
        zzh zzh1 = CREATOR;
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
        zzh zzh1 = CREATOR;
        zzh.zza(this, parcel, i);
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
            return zzaBf;

        case 3: // '\003'
            return zzadH;

        case 4: // '\004'
            return zzaAa;

        case 5: // '\005'
            return zzaBg;

        case 6: // '\006'
            return mName;

        case 7: // '\007'
            return Boolean.valueOf(zzaBh);

        case 8: // '\b'
            return zzaAq;

        case 9: // '\t'
            return zzWn;

        case 10: // '\n'
            return Integer.valueOf(zzMG);
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
        zzazC.put("department", com.google.android.gms.common.server.response.ity.zzazC("department", 2));
        zzazC.put("description", com.google.android.gms.common.server.response.ity.zzazC("description", 3));
        zzazC.put("endDate", com.google.android.gms.common.server.response.ity.zzazC("endDate", 4));
        zzazC.put("location", com.google.android.gms.common.server.response.ity.zzazC("location", 5));
        zzazC.put("name", com.google.android.gms.common.server.response.ity.zzazC("name", 6));
        zzazC.put("primary", com.google.android.gms.common.server.response.ity.zzazC("primary", 7));
        zzazC.put("startDate", com.google.android.gms.common.server.response.ity.zzazC("startDate", 8));
        zzazC.put("title", com.google.android.gms.common.server.response.ity.zzazC("title", 9));
        zzazC.put("type", com.google.android.gms.common.server.response.ity.zzazC("type", 10, (new StringToIntConverter()).zzg("work", 0).zzg("school", 1), false));
    }

    public ()
    {
        zzzH = 1;
        zzazD = new HashSet();
    }

    zzazD(Set set, int i, String s, String s1, String s2, String s3, String s4, 
            boolean flag, String s5, String s6, int j)
    {
        zzazD = set;
        zzzH = i;
        zzaBf = s;
        zzadH = s1;
        zzaAa = s2;
        zzaBg = s3;
        mName = s4;
        zzaBh = flag;
        zzaAq = s5;
        zzWn = s6;
        zzMG = j;
    }
}
