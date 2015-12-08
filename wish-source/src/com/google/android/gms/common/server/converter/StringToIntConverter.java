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
        final String zzUw;
        final int zzUx;

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
            zzUw = s;
            zzUx = j;
        }

        Entry(String s, int i)
        {
            versionCode = 1;
            zzUw = s;
            zzUx = i;
        }
    }


    public static final zzb CREATOR = new zzb();
    private final HashMap zzUt;
    private final HashMap zzUu;
    private final ArrayList zzUv;
    private final int zzzH;

    public StringToIntConverter()
    {
        zzzH = 1;
        zzUt = new HashMap();
        zzUu = new HashMap();
        zzUv = null;
    }

    StringToIntConverter(int i, ArrayList arraylist)
    {
        zzzH = i;
        zzUt = new HashMap();
        zzUu = new HashMap();
        zzUv = null;
        zzb(arraylist);
    }

    private void zzb(ArrayList arraylist)
    {
        Entry entry;
        for (arraylist = arraylist.iterator(); arraylist.hasNext(); zzg(entry.zzUw, entry.zzUx))
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
        return zzzH;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzb zzb1 = CREATOR;
        com.google.android.gms.common.server.converter.zzb.zza(this, parcel, i);
    }

    public String zzb(Integer integer)
    {
        String s = (String)zzUu.get(integer);
        integer = s;
        if (s == null)
        {
            integer = s;
            if (zzUt.containsKey("gms_unknown"))
            {
                integer = "gms_unknown";
            }
        }
        return integer;
    }

    public StringToIntConverter zzg(String s, int i)
    {
        zzUt.put(s, Integer.valueOf(i));
        zzUu.put(Integer.valueOf(i), s);
        return this;
    }

    ArrayList zzmu()
    {
        ArrayList arraylist = new ArrayList();
        String s;
        for (Iterator iterator = zzUt.keySet().iterator(); iterator.hasNext(); arraylist.add(new Entry(s, ((Integer)zzUt.get(s)).intValue())))
        {
            s = (String)iterator.next();
        }

        return arraylist;
    }

    public int zzmv()
    {
        return 7;
    }

    public int zzmw()
    {
        return 0;
    }

}
