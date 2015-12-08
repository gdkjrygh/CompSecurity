// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.plus.internal.model.moments;

import android.os.Parcel;
import com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse;
import com.google.android.gms.plus.model.moments.ItemScope;
import com.google.android.gms.plus.model.moments.Moment;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.plus.internal.model.moments:
//            zzb, ItemScopeEntity

public final class MomentEntity extends FastSafeParcelableJsonResponse
    implements Moment
{

    public static final zzb CREATOR = new zzb();
    private static final HashMap zzaHP;
    final int zzCY;
    String zzEl;
    String zzKI;
    final Set zzaHQ;
    String zzaID;
    ItemScopeEntity zzaIL;
    ItemScopeEntity zzaIM;

    public MomentEntity()
    {
        zzCY = 1;
        zzaHQ = new HashSet();
    }

    MomentEntity(Set set, int i, String s, ItemScopeEntity itemscopeentity, String s1, ItemScopeEntity itemscopeentity1, String s2)
    {
        zzaHQ = set;
        zzCY = i;
        zzKI = s;
        zzaIL = itemscopeentity;
        zzaID = s1;
        zzaIM = itemscopeentity1;
        zzEl = s2;
    }

    public MomentEntity(Set set, String s, ItemScopeEntity itemscopeentity, String s1, ItemScopeEntity itemscopeentity1, String s2)
    {
        zzaHQ = set;
        zzCY = 1;
        zzKI = s;
        zzaIL = itemscopeentity;
        zzaID = s1;
        zzaIM = itemscopeentity1;
        zzEl = s2;
    }

    public int describeContents()
    {
        zzb zzb1 = CREATOR;
        return 0;
    }

    public boolean equals(Object obj)
    {
label0:
        {
            if (!(obj instanceof MomentEntity))
            {
                return false;
            }
            if (this == obj)
            {
                return true;
            }
            obj = (MomentEntity)obj;
            com.google.android.gms.common.server.response.FastJsonResponse.Field field;
label1:
            do
            {
                for (Iterator iterator = zzaHP.values().iterator(); iterator.hasNext();)
                {
                    field = (com.google.android.gms.common.server.response.FastJsonResponse.Field)iterator.next();
                    if (!zza(field))
                    {
                        continue label1;
                    }
                    if (((MomentEntity) (obj)).zza(field))
                    {
                        if (!zzb(field).equals(((MomentEntity) (obj)).zzb(field)))
                        {
                            return false;
                        }
                    } else
                    {
                        return false;
                    }
                }

                break label0;
            } while (!((MomentEntity) (obj)).zza(field));
            return false;
        }
        return true;
    }

    public Object freeze()
    {
        return zzxH();
    }

    public String getId()
    {
        return zzKI;
    }

    public ItemScope getResult()
    {
        return zzaIL;
    }

    public String getStartDate()
    {
        return zzaID;
    }

    public ItemScope getTarget()
    {
        return zzaIM;
    }

    public String getType()
    {
        return zzEl;
    }

    public boolean hasId()
    {
        return zzaHQ.contains(Integer.valueOf(2));
    }

    public boolean hasResult()
    {
        return zzaHQ.contains(Integer.valueOf(4));
    }

    public boolean hasStartDate()
    {
        return zzaHQ.contains(Integer.valueOf(5));
    }

    public boolean hasTarget()
    {
        return zzaHQ.contains(Integer.valueOf(6));
    }

    public boolean hasType()
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
            com.google.android.gms.common.server.response.FastJsonResponse.Field field = (com.google.android.gms.common.server.response.FastJsonResponse.Field)iterator.next();
            if (zza(field))
            {
                int j = field.zzot();
                i = zzb(field).hashCode() + (i + j);
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
        com.google.android.gms.plus.internal.model.moments.zzb.zza(this, parcel, i);
    }

    protected boolean zza(com.google.android.gms.common.server.response.FastJsonResponse.Field field)
    {
        return zzaHQ.contains(Integer.valueOf(field.zzot()));
    }

    protected Object zzb(com.google.android.gms.common.server.response.FastJsonResponse.Field field)
    {
        switch (field.zzot())
        {
        case 3: // '\003'
        default:
            throw new IllegalStateException((new StringBuilder()).append("Unknown safe parcelable id=").append(field.zzot()).toString());

        case 2: // '\002'
            return zzKI;

        case 4: // '\004'
            return zzaIL;

        case 5: // '\005'
            return zzaID;

        case 6: // '\006'
            return zzaIM;

        case 7: // '\007'
            return zzEl;
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

    public MomentEntity zzxH()
    {
        return this;
    }

    static 
    {
        zzaHP = new HashMap();
        zzaHP.put("id", com.google.android.gms.common.server.response.FastJsonResponse.Field.zzl("id", 2));
        zzaHP.put("result", com.google.android.gms.common.server.response.FastJsonResponse.Field.zza("result", 4, com/google/android/gms/plus/internal/model/moments/ItemScopeEntity));
        zzaHP.put("startDate", com.google.android.gms.common.server.response.FastJsonResponse.Field.zzl("startDate", 5));
        zzaHP.put("target", com.google.android.gms.common.server.response.FastJsonResponse.Field.zza("target", 6, com/google/android/gms/plus/internal/model/moments/ItemScopeEntity));
        zzaHP.put("type", com.google.android.gms.common.server.response.FastJsonResponse.Field.zzl("type", 7));
    }
}
