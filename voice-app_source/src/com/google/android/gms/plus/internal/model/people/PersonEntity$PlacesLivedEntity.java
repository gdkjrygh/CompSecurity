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
//            PersonEntity, zzi

public static final class mValue extends FastSafeParcelableJsonResponse
    implements com.google.android.gms.plus.model.people.onse
{

    public static final zzi CREATOR = new zzi();
    private static final HashMap zzaHP;
    String mValue;
    final int zzCY;
    final Set zzaHQ;
    boolean zzaJu;

    public int describeContents()
    {
        zzi zzi1 = CREATOR;
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
        return zzxR();
    }

    public String getValue()
    {
        return mValue;
    }

    public boolean hasPrimary()
    {
        return zzaHQ.contains(Integer.valueOf(2));
    }

    public boolean hasValue()
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

    public boolean isPrimary()
    {
        return zzaJu;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzi zzi1 = CREATOR;
        zzi.zza(this, parcel, i);
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
            return Boolean.valueOf(zzaJu);

        case 3: // '\003'
            return mValue;
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

    public zzaHP zzxR()
    {
        return this;
    }

    static 
    {
        zzaHP = new HashMap();
        zzaHP.put("primary", com.google.android.gms.common.server.response.ity.zzaHP("primary", 2));
        zzaHP.put("value", com.google.android.gms.common.server.response.ity.zzaHP("value", 3));
    }

    public ()
    {
        zzCY = 1;
        zzaHQ = new HashSet();
    }

    zzaHQ(Set set, int i, boolean flag, String s)
    {
        zzaHQ = set;
        zzCY = i;
        zzaJu = flag;
        mValue = s;
    }
}
