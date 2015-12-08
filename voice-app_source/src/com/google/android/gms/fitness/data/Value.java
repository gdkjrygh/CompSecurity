// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.fitness.data;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.util.ArrayMap;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzt;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.fitness.FitnessActivities;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

// Referenced classes of package com.google.android.gms.fitness.data:
//            zzt, MapValue

public final class Value
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new com.google.android.gms.fitness.data.zzt();
    private final int zzCY;
    private final int zzakB;
    private float zzakF;
    private boolean zzakR;
    private String zzakS;
    private Map zzakT;

    public Value(int i)
    {
        this(2, i, false, 0.0F, null, null);
    }

    Value(int i, int j, boolean flag, float f, String s, Bundle bundle)
    {
        zzCY = i;
        zzakB = j;
        zzakR = flag;
        zzakF = f;
        zzakS = s;
        zzakT = zzr(bundle);
    }

    private boolean zza(Value value)
    {
        if (zzakB != value.zzakB || zzakR != value.zzakR) goto _L2; else goto _L1
_L1:
        zzakB;
        JVM INSTR tableswitch 1 4: default 56
    //                   1 70
    //                   2 83
    //                   3 97
    //                   4 109;
           goto _L3 _L4 _L5 _L6 _L7
_L3:
        if (zzakF != value.zzakF) goto _L9; else goto _L8
_L8:
        return true;
_L4:
        if (asInt() == value.asInt()) goto _L8; else goto _L10
_L10:
        return false;
_L5:
        if (asFloat() == value.asFloat()) goto _L8; else goto _L11
_L11:
        return false;
_L6:
        return asString().equals(value.asString());
_L7:
        return zzpT().equals(value.zzpT());
_L9:
        return false;
_L2:
        return false;
    }

    private static Map zzr(Bundle bundle)
    {
        if (bundle == null)
        {
            return null;
        }
        bundle.setClassLoader(com/google/android/gms/fitness/data/MapValue.getClassLoader());
        ArrayMap arraymap = new ArrayMap(bundle.size());
        String s;
        for (Iterator iterator = bundle.keySet().iterator(); iterator.hasNext(); arraymap.put(s, bundle.getParcelable(s)))
        {
            s = (String)iterator.next();
        }

        return arraymap;
    }

    public String asActivity()
    {
        return FitnessActivities.getName(asInt());
    }

    public float asFloat()
    {
        boolean flag;
        if (zzakB == 2)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        zzu.zza(flag, "Value is not in float format");
        return zzakF;
    }

    public int asInt()
    {
        boolean flag = true;
        if (zzakB != 1)
        {
            flag = false;
        }
        zzu.zza(flag, "Value is not in int format");
        return Float.floatToRawIntBits(zzakF);
    }

    public String asString()
    {
        boolean flag;
        if (zzakB == 3)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        zzu.zza(flag, "Value is not in string format");
        return zzakS;
    }

    public void clearKey(String s)
    {
        boolean flag;
        if (zzakB == 4)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        zzu.zza(flag, "Attempting to set a key's value to a field that is not in FLOAT_MAP format.  Please check the data type definition and use the right format.");
        if (zzakT != null)
        {
            zzakT.remove(s);
        }
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        return this == obj || (obj instanceof Value) && zza((Value)obj);
    }

    public int getFormat()
    {
        return zzakB;
    }

    public Float getKeyValue(String s)
    {
        boolean flag;
        if (zzakB == 4)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        zzu.zza(flag, "Value is not in float map format");
        if (zzakT != null && zzakT.containsKey(s))
        {
            return Float.valueOf(((MapValue)zzakT.get(s)).asFloat());
        } else
        {
            return null;
        }
    }

    int getVersionCode()
    {
        return zzCY;
    }

    public int hashCode()
    {
        return zzt.hashCode(new Object[] {
            Float.valueOf(zzakF), zzakS, zzakT
        });
    }

    public boolean isSet()
    {
        return zzakR;
    }

    public void setActivity(String s)
    {
        setInt(FitnessActivities.zzcF(s));
    }

    public void setFloat(float f)
    {
        boolean flag;
        if (zzakB == 2)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        zzu.zza(flag, "Attempting to set an float value to a field that is not in FLOAT format.  Please check the data type definition and use the right format.");
        zzakR = true;
        zzakF = f;
    }

    public void setInt(int i)
    {
        boolean flag;
        if (zzakB == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        zzu.zza(flag, "Attempting to set an int value to a field that is not in INT32 format.  Please check the data type definition and use the right format.");
        zzakR = true;
        zzakF = Float.intBitsToFloat(i);
    }

    public void setKeyValue(String s, float f)
    {
        boolean flag;
        if (zzakB == 4)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        zzu.zza(flag, "Attempting to set a key's value to a field that is not in FLOAT_MAP format.  Please check the data type definition and use the right format.");
        zzakR = true;
        if (zzakT == null)
        {
            zzakT = new HashMap();
        }
        zzakT.put(s, MapValue.zzc(f));
    }

    public void setString(String s)
    {
        boolean flag;
        if (zzakB == 3)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        zzu.zza(flag, "Attempting to set a string value to a field that is not in STRING format.  Please check the data type definition and use the right format.");
        zzakR = true;
        zzakS = s;
    }

    public String toString()
    {
        if (!zzakR)
        {
            return "unset";
        }
        switch (zzakB)
        {
        default:
            return "unknown";

        case 1: // '\001'
            return Integer.toString(asInt());

        case 2: // '\002'
            return Float.toString(asFloat());

        case 3: // '\003'
            return zzakS;

        case 4: // '\004'
            return (new TreeMap(zzakT)).toString();
        }
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzt.zza(this, parcel, i);
    }

    public Map zzpT()
    {
        boolean flag;
        if (zzakB == 4)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        zzu.zza(flag, "Value is not in float map format");
        if (zzakT == null)
        {
            return Collections.emptyMap();
        } else
        {
            return zzakT;
        }
    }

    float zzqI()
    {
        return zzakF;
    }

    String zzqO()
    {
        return zzakS;
    }

    Bundle zzqP()
    {
        if (zzakT == null)
        {
            return null;
        }
        Bundle bundle = new Bundle(zzakT.size());
        java.util.Map.Entry entry;
        for (Iterator iterator = zzakT.entrySet().iterator(); iterator.hasNext(); bundle.putParcelable((String)entry.getKey(), (Parcelable)entry.getValue()))
        {
            entry = (java.util.Map.Entry)iterator.next();
        }

        return bundle;
    }

}
