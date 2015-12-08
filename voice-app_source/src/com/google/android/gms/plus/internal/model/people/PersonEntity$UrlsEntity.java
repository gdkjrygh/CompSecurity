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
    implements com.google.android.gms.plus.model.people.sonResponse
{

    public static final zzj CREATOR = new zzj();
    private static final HashMap zzaHP;
    String mValue;
    final int zzCY;
    int zzSq;
    String zzaEH;
    final Set zzaHQ;
    private final int zzaJv;

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
        return zzxT();
    }

    public String getLabel()
    {
        return zzaEH;
    }

    public int getType()
    {
        return zzSq;
    }

    public String getValue()
    {
        return mValue;
    }

    public boolean hasLabel()
    {
        return zzaHQ.contains(Integer.valueOf(5));
    }

    public boolean hasType()
    {
        return zzaHQ.contains(Integer.valueOf(6));
    }

    public boolean hasValue()
    {
        return zzaHQ.contains(Integer.valueOf(4));
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
        zzj zzj1 = CREATOR;
        zzj.zza(this, parcel, i);
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

        case 5: // '\005'
            return zzaEH;

        case 6: // '\006'
            return Integer.valueOf(zzSq);

        case 4: // '\004'
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

    public int zzxS()
    {
        return 4;
    }

    public zzaHP zzxT()
    {
        return this;
    }

    static 
    {
        zzaHP = new HashMap();
        zzaHP.put("label", com.google.android.gms.common.server.response.zl("label", 5));
        zzaHP.put("type", com.google.android.gms.common.server.response.za("type", 6, (new StringToIntConverter()).zzh("home", 0).zzh("work", 1).zzh("blog", 2).zzh("profile", 3).zzh("other", 4).zzh("otherProfile", 5).zzh("contributor", 6).zzh("website", 7), false));
        zzaHP.put("value", com.google.android.gms.common.server.response.zl("value", 4));
    }

    public se()
    {
        zzaJv = 4;
        zzCY = 1;
        zzaHQ = new HashSet();
    }

    zzaHQ(Set set, int i, String s, int j, String s1, int k)
    {
        zzaJv = 4;
        zzaHQ = set;
        zzCY = i;
        zzaEH = s;
        zzSq = j;
        mValue = s1;
    }
}
