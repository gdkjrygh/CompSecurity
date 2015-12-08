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
//            PersonEntity, zzb

public static final class zzaJi extends FastSafeParcelableJsonResponse
    implements com.google.android.gms.plus.model.people.esponse
{

    public static final zzb CREATOR = new zzb();
    private static final HashMap zzaHP;
    final int zzCY;
    final Set zzaHQ;
    int zzaJh;
    int zzaJi;

    public int describeContents()
    {
        zzb zzb1 = CREATOR;
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
                for (Iterator iterator = zzaHP.values().iterator(); iterator.hasNext();)
                {
                    ity = (com.google.android.gms.common.server.response.ity.zzaHP)iterator.next();
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

    public Object freeze()
    {
        return zzxK();
    }

    public int getMax()
    {
        return zzaJh;
    }

    public int getMin()
    {
        return zzaJi;
    }

    public boolean hasMax()
    {
        return zzaHQ.contains(Integer.valueOf(2));
    }

    public boolean hasMin()
    {
        return zzaHQ.contains(Integer.valueOf(3));
    }

    public int hashCode()
    {
        Iterator iterator = zzaHP.values().iterator();
        int i = 0;
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            com.google.android.gms.common.server.response.ity ity = (com.google.android.gms.common.server.response.ity.zzaHP)iterator.next();
            if (zza(ity))
            {
                int j = ity.zza();
                i = zzb(ity).hashCode() + (i + j);
            }
        } while (true);
        return i;
    }

    public boolean isDataValid()
    {
        return true;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzb zzb1 = CREATOR;
        com.google.android.gms.plus.internal.model.people.zzb.zza(this, parcel, i);
    }

    protected boolean zza(com.google.android.gms.common.server.response.ity ity)
    {
        return zzaHQ.contains(Integer.valueOf(ity.zzaHQ()));
    }

    protected Object zzb(com.google.android.gms.common.server.response.ity ity)
    {
        switch (ity.ity())
        {
        default:
            throw new IllegalStateException((new StringBuilder()).append("Unknown safe parcelable id=").append(ity.ity()).toString());

        case 2: // '\002'
            return Integer.valueOf(zzaJh);

        case 3: // '\003'
            return Integer.valueOf(zzaJi);
        }
    }

    public Map zzom()
    {
        return zzxF();
    }

    public HashMap zzxF()
    {
        return zzaHP;
    }

    public zzaHP zzxK()
    {
        return this;
    }

    static 
    {
        zzaHP = new HashMap();
        zzaHP.put("max", com.google.android.gms.common.server.response.ity.zzaHP("max", 2));
        zzaHP.put("min", com.google.android.gms.common.server.response.ity.zzaHP("min", 3));
    }

    public ()
    {
        zzCY = 1;
        zzaHQ = new HashSet();
    }

    zzaHQ(Set set, int i, int j, int k)
    {
        zzaHQ = set;
        zzCY = i;
        zzaJh = j;
        zzaJi = k;
    }
}
