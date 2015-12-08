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

public static final class zzaJr extends FastSafeParcelableJsonResponse
    implements com.google.android.gms.plus.model.people.sonResponse
{

    public static final zzg CREATOR = new zzg();
    private static final HashMap zzaHP;
    final int zzCY;
    final Set zzaHQ;
    String zzaIo;
    String zzaIr;
    String zzaJo;
    String zzaJp;
    String zzaJq;
    String zzaJr;

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
        return zzxP();
    }

    public String getFamilyName()
    {
        return zzaIo;
    }

    public String getFormatted()
    {
        return zzaJo;
    }

    public String getGivenName()
    {
        return zzaIr;
    }

    public String getHonorificPrefix()
    {
        return zzaJp;
    }

    public String getHonorificSuffix()
    {
        return zzaJq;
    }

    public String getMiddleName()
    {
        return zzaJr;
    }

    public boolean hasFamilyName()
    {
        return zzaHQ.contains(Integer.valueOf(2));
    }

    public boolean hasFormatted()
    {
        return zzaHQ.contains(Integer.valueOf(3));
    }

    public boolean hasGivenName()
    {
        return zzaHQ.contains(Integer.valueOf(4));
    }

    public boolean hasHonorificPrefix()
    {
        return zzaHQ.contains(Integer.valueOf(5));
    }

    public boolean hasHonorificSuffix()
    {
        return zzaHQ.contains(Integer.valueOf(6));
    }

    public boolean hasMiddleName()
    {
        return zzaHQ.contains(Integer.valueOf(7));
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
                int j = ity.zot();
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
        zzg zzg1 = CREATOR;
        zzg.zza(this, parcel, i);
    }

    protected boolean zza(com.google.android.gms.common.server.response.ity ity)
    {
        return zzaHQ.contains(Integer.valueOf(ity.zot()));
    }

    protected Object zzb(com.google.android.gms.common.server.response.ity ity)
    {
        switch (ity.zot())
        {
        default:
            throw new IllegalStateException((new StringBuilder()).append("Unknown safe parcelable id=").append(ity.zot()).toString());

        case 2: // '\002'
            return zzaIo;

        case 3: // '\003'
            return zzaJo;

        case 4: // '\004'
            return zzaIr;

        case 5: // '\005'
            return zzaJp;

        case 6: // '\006'
            return zzaJq;

        case 7: // '\007'
            return zzaJr;
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

    public zzaHP zzxP()
    {
        return this;
    }

    static 
    {
        zzaHP = new HashMap();
        zzaHP.put("familyName", com.google.android.gms.common.server.response.zl("familyName", 2));
        zzaHP.put("formatted", com.google.android.gms.common.server.response.zl("formatted", 3));
        zzaHP.put("givenName", com.google.android.gms.common.server.response.zl("givenName", 4));
        zzaHP.put("honorificPrefix", com.google.android.gms.common.server.response.zl("honorificPrefix", 5));
        zzaHP.put("honorificSuffix", com.google.android.gms.common.server.response.zl("honorificSuffix", 6));
        zzaHP.put("middleName", com.google.android.gms.common.server.response.zl("middleName", 7));
    }

    public se()
    {
        zzCY = 1;
        zzaHQ = new HashSet();
    }

    zzaHQ(Set set, int i, String s, String s1, String s2, String s3, String s4, 
            String s5)
    {
        zzaHQ = set;
        zzCY = i;
        zzaIo = s;
        zzaJo = s1;
        zzaIr = s2;
        zzaJp = s3;
        zzaJq = s4;
        zzaJr = s5;
    }
}
