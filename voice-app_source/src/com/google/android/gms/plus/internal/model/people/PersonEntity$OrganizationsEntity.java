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

public static final class zzSq extends FastSafeParcelableJsonResponse
    implements com.google.android.gms.plus.model.people.se
{

    public static final zzh CREATOR = new zzh();
    private static final HashMap zzaHP;
    String mName;
    final int zzCY;
    int zzSq;
    final Set zzaHQ;
    String zzaID;
    String zzaIn;
    String zzaJs;
    String zzaJt;
    boolean zzaJu;
    String zzadv;
    String zzakM;

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
        return zzxQ();
    }

    public String getDepartment()
    {
        return zzaJs;
    }

    public String getDescription()
    {
        return zzakM;
    }

    public String getEndDate()
    {
        return zzaIn;
    }

    public String getLocation()
    {
        return zzaJt;
    }

    public String getName()
    {
        return mName;
    }

    public String getStartDate()
    {
        return zzaID;
    }

    public String getTitle()
    {
        return zzadv;
    }

    public int getType()
    {
        return zzSq;
    }

    public boolean hasDepartment()
    {
        return zzaHQ.contains(Integer.valueOf(2));
    }

    public boolean hasDescription()
    {
        return zzaHQ.contains(Integer.valueOf(3));
    }

    public boolean hasEndDate()
    {
        return zzaHQ.contains(Integer.valueOf(4));
    }

    public boolean hasLocation()
    {
        return zzaHQ.contains(Integer.valueOf(5));
    }

    public boolean hasName()
    {
        return zzaHQ.contains(Integer.valueOf(6));
    }

    public boolean hasPrimary()
    {
        return zzaHQ.contains(Integer.valueOf(7));
    }

    public boolean hasStartDate()
    {
        return zzaHQ.contains(Integer.valueOf(8));
    }

    public boolean hasTitle()
    {
        return zzaHQ.contains(Integer.valueOf(9));
    }

    public boolean hasType()
    {
        return zzaHQ.contains(Integer.valueOf(10));
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
        zzh zzh1 = CREATOR;
        zzh.zza(this, parcel, i);
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
            return zzaJs;

        case 3: // '\003'
            return zzakM;

        case 4: // '\004'
            return zzaIn;

        case 5: // '\005'
            return zzaJt;

        case 6: // '\006'
            return mName;

        case 7: // '\007'
            return Boolean.valueOf(zzaJu);

        case 8: // '\b'
            return zzaID;

        case 9: // '\t'
            return zzadv;

        case 10: // '\n'
            return Integer.valueOf(zzSq);
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

    public zzaHP zzxQ()
    {
        return this;
    }

    static 
    {
        zzaHP = new HashMap();
        zzaHP.put("department", com.google.android.gms.common.server.response.ity.zzaHP("department", 2));
        zzaHP.put("description", com.google.android.gms.common.server.response.ity.zzaHP("description", 3));
        zzaHP.put("endDate", com.google.android.gms.common.server.response.ity.zzaHP("endDate", 4));
        zzaHP.put("location", com.google.android.gms.common.server.response.ity.zzaHP("location", 5));
        zzaHP.put("name", com.google.android.gms.common.server.response.ity.zzaHP("name", 6));
        zzaHP.put("primary", com.google.android.gms.common.server.response.ity.zzaHP("primary", 7));
        zzaHP.put("startDate", com.google.android.gms.common.server.response.ity.zzaHP("startDate", 8));
        zzaHP.put("title", com.google.android.gms.common.server.response.ity.zzaHP("title", 9));
        zzaHP.put("type", com.google.android.gms.common.server.response.ity.zzaHP("type", 10, (new StringToIntConverter()).zzh("work", 0).zzh("school", 1), false));
    }

    public ()
    {
        zzCY = 1;
        zzaHQ = new HashSet();
    }

    zzaHQ(Set set, int i, String s, String s1, String s2, String s3, String s4, 
            boolean flag, String s5, String s6, int j)
    {
        zzaHQ = set;
        zzCY = i;
        zzaJs = s;
        zzakM = s1;
        zzaIn = s2;
        zzaJt = s3;
        mName = s4;
        zzaJu = flag;
        zzaID = s5;
        zzadv = s6;
        zzSq = j;
    }
}
