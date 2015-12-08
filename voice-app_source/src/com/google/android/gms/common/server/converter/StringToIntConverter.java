// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.server.converter;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.google.android.gms.common.server.converter:
//            zzb, zzc

public final class StringToIntConverter
    implements SafeParcelable, com.google.android.gms.common.server.response.FastJsonResponse.zza
{
    public static final class Entry
        implements SafeParcelable
    {

        public static final zzc CREATOR = new zzc();
        final int versionCode;
        final String zzabE;
        final int zzabF;

        public int describeContents()
        {
            zzc zzc1 = CREATOR;
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i)
        {
            zzc zzc1 = CREATOR;
            zzc.zza(this, parcel, i);
        }


        Entry(int i, String s, int j)
        {
            versionCode = i;
            zzabE = s;
            zzabF = j;
        }

        Entry(String s, int i)
        {
            versionCode = 1;
            zzabE = s;
            zzabF = i;
        }
    }


    public static final zzb CREATOR = new zzb();
    private final int zzCY;
    private final HashMap zzabB;
    private final HashMap zzabC;
    private final ArrayList zzabD;

    public StringToIntConverter()
    {
        zzCY = 1;
        zzabB = new HashMap();
        zzabC = new HashMap();
        zzabD = null;
    }

    StringToIntConverter(int i, ArrayList arraylist)
    {
        zzCY = i;
        zzabB = new HashMap();
        zzabC = new HashMap();
        zzabD = null;
        zzb(arraylist);
    }

    private void zzb(ArrayList arraylist)
    {
        Entry entry;
        for (arraylist = arraylist.iterator(); arraylist.hasNext(); zzh(entry.zzabE, entry.zzabF))
        {
            entry = (Entry)arraylist.next();
        }

    }

    public Object convertBack(Object obj)
    {
        return zzb((Integer)obj);
    }

    public int describeContents()
    {
        zzb zzb1 = CREATOR;
        return 0;
    }

    int getVersionCode()
    {
        return zzCY;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzb zzb1 = CREATOR;
        com.google.android.gms.common.server.converter.zzb.zza(this, parcel, i);
    }

    public String zzb(Integer integer)
    {
        String s = (String)zzabC.get(integer);
        integer = s;
        if (s == null)
        {
            integer = s;
            if (zzabB.containsKey("gms_unknown"))
            {
                integer = "gms_unknown";
            }
        }
        return integer;
    }

    public StringToIntConverter zzh(String s, int i)
    {
        zzabB.put(s, Integer.valueOf(i));
        zzabC.put(Integer.valueOf(i), s);
        return this;
    }

    ArrayList zzoj()
    {
        ArrayList arraylist = new ArrayList();
        String s;
        for (Iterator iterator = zzabB.keySet().iterator(); iterator.hasNext(); arraylist.add(new Entry(s, ((Integer)zzabB.get(s)).intValue())))
        {
            s = (String)iterator.next();
        }

        return arraylist;
    }

    public int zzok()
    {
        return 7;
    }

    public int zzol()
    {
        return 0;
    }

}
