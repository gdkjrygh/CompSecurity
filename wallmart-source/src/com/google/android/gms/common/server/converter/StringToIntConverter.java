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
        final String zzaeO;
        final int zzaeP;

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
            zzaeO = s;
            zzaeP = j;
        }

        Entry(String s, int i)
        {
            versionCode = 1;
            zzaeO = s;
            zzaeP = i;
        }
    }


    public static final zzb CREATOR = new zzb();
    private final int mVersionCode;
    private final HashMap zzaeL;
    private final HashMap zzaeM;
    private final ArrayList zzaeN;

    public StringToIntConverter()
    {
        mVersionCode = 1;
        zzaeL = new HashMap();
        zzaeM = new HashMap();
        zzaeN = null;
    }

    StringToIntConverter(int i, ArrayList arraylist)
    {
        mVersionCode = i;
        zzaeL = new HashMap();
        zzaeM = new HashMap();
        zzaeN = null;
        zzb(arraylist);
    }

    private void zzb(ArrayList arraylist)
    {
        Entry entry;
        for (arraylist = arraylist.iterator(); arraylist.hasNext(); zzi(entry.zzaeO, entry.zzaeP))
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
        return mVersionCode;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzb zzb1 = CREATOR;
        com.google.android.gms.common.server.converter.zzb.zza(this, parcel, i);
    }

    public String zzb(Integer integer)
    {
        String s = (String)zzaeM.get(integer);
        integer = s;
        if (s == null)
        {
            integer = s;
            if (zzaeL.containsKey("gms_unknown"))
            {
                integer = "gms_unknown";
            }
        }
        return integer;
    }

    public StringToIntConverter zzi(String s, int i)
    {
        zzaeL.put(s, Integer.valueOf(i));
        zzaeM.put(Integer.valueOf(i), s);
        return this;
    }

    ArrayList zzoY()
    {
        ArrayList arraylist = new ArrayList();
        String s;
        for (Iterator iterator = zzaeL.keySet().iterator(); iterator.hasNext(); arraylist.add(new Entry(s, ((Integer)zzaeL.get(s)).intValue())))
        {
            s = (String)iterator.next();
        }

        return arraylist;
    }

    public int zzoZ()
    {
        return 7;
    }

    public int zzpa()
    {
        return 0;
    }

}
