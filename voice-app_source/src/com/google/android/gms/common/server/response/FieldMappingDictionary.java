// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.server.response;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzu;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.common.server.response:
//            zzc, zzd, zzb

public class FieldMappingDictionary
    implements SafeParcelable
{
    public static class Entry
        implements SafeParcelable
    {

        public static final zzd CREATOR = new zzd();
        final String className;
        final int versionCode;
        final ArrayList zzabT;

        private static ArrayList zzB(Map map)
        {
            if (map == null)
            {
                return null;
            }
            ArrayList arraylist = new ArrayList();
            String s;
            for (Iterator iterator = map.keySet().iterator(); iterator.hasNext(); arraylist.add(new FieldMapPair(s, (FastJsonResponse.Field)map.get(s))))
            {
                s = (String)iterator.next();
            }

            return arraylist;
        }

        public int describeContents()
        {
            zzd zzd1 = CREATOR;
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i)
        {
            zzd zzd1 = CREATOR;
            zzd.zza(this, parcel, i);
        }

        HashMap zzoD()
        {
            HashMap hashmap = new HashMap();
            int j = zzabT.size();
            for (int i = 0; i < j; i++)
            {
                FieldMapPair fieldmappair = (FieldMapPair)zzabT.get(i);
                hashmap.put(fieldmappair.zzaC, fieldmappair.zzabU);
            }

            return hashmap;
        }


        Entry(int i, String s, ArrayList arraylist)
        {
            versionCode = i;
            className = s;
            zzabT = arraylist;
        }

        Entry(String s, Map map)
        {
            versionCode = 1;
            className = s;
            zzabT = zzB(map);
        }
    }

    public static class FieldMapPair
        implements SafeParcelable
    {

        public static final zzb CREATOR = new zzb();
        final int versionCode;
        final String zzaC;
        final FastJsonResponse.Field zzabU;

        public int describeContents()
        {
            zzb zzb1 = CREATOR;
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i)
        {
            zzb zzb1 = CREATOR;
            com.google.android.gms.common.server.response.zzb.zza(this, parcel, i);
        }


        FieldMapPair(int i, String s, FastJsonResponse.Field field)
        {
            versionCode = i;
            zzaC = s;
            zzabU = field;
        }

        FieldMapPair(String s, FastJsonResponse.Field field)
        {
            versionCode = 1;
            zzaC = s;
            zzabU = field;
        }
    }


    public static final zzc CREATOR = new zzc();
    private final int zzCY;
    private final HashMap zzabQ;
    private final ArrayList zzabR;
    private final String zzabS;

    FieldMappingDictionary(int i, ArrayList arraylist, String s)
    {
        zzCY = i;
        zzabR = null;
        zzabQ = zzc(arraylist);
        zzabS = (String)zzu.zzu(s);
        zzoz();
    }

    public FieldMappingDictionary(Class class1)
    {
        zzCY = 1;
        zzabR = null;
        zzabQ = new HashMap();
        zzabS = class1.getCanonicalName();
    }

    private static HashMap zzc(ArrayList arraylist)
    {
        HashMap hashmap = new HashMap();
        int j = arraylist.size();
        for (int i = 0; i < j; i++)
        {
            Entry entry = (Entry)arraylist.get(i);
            hashmap.put(entry.className, entry.zzoD());
        }

        return hashmap;
    }

    public int describeContents()
    {
        zzc zzc1 = CREATOR;
        return 0;
    }

    int getVersionCode()
    {
        return zzCY;
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        for (Iterator iterator = zzabQ.keySet().iterator(); iterator.hasNext();)
        {
            Object obj = (String)iterator.next();
            stringbuilder.append(((String) (obj))).append(":\n");
            obj = (Map)zzabQ.get(obj);
            Iterator iterator1 = ((Map) (obj)).keySet().iterator();
            while (iterator1.hasNext()) 
            {
                String s = (String)iterator1.next();
                stringbuilder.append("  ").append(s).append(": ");
                stringbuilder.append(((Map) (obj)).get(s));
            }
        }

        return stringbuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzc zzc1 = CREATOR;
        com.google.android.gms.common.server.response.zzc.zza(this, parcel, i);
    }

    public void zza(Class class1, Map map)
    {
        zzabQ.put(class1.getCanonicalName(), map);
    }

    public boolean zzb(Class class1)
    {
        return zzabQ.containsKey(class1.getCanonicalName());
    }

    public Map zzco(String s)
    {
        return (Map)zzabQ.get(s);
    }

    public void zzoA()
    {
        String s;
        HashMap hashmap;
        for (Iterator iterator = zzabQ.keySet().iterator(); iterator.hasNext(); zzabQ.put(s, hashmap))
        {
            s = (String)iterator.next();
            Map map = (Map)zzabQ.get(s);
            hashmap = new HashMap();
            String s1;
            for (Iterator iterator1 = map.keySet().iterator(); iterator1.hasNext(); hashmap.put(s1, ((FastJsonResponse.Field)map.get(s1)).zzop()))
            {
                s1 = (String)iterator1.next();
            }

        }

    }

    ArrayList zzoB()
    {
        ArrayList arraylist = new ArrayList();
        String s;
        for (Iterator iterator = zzabQ.keySet().iterator(); iterator.hasNext(); arraylist.add(new Entry(s, (Map)zzabQ.get(s))))
        {
            s = (String)iterator.next();
        }

        return arraylist;
    }

    public String zzoC()
    {
        return zzabS;
    }

    public void zzoz()
    {
        for (Iterator iterator = zzabQ.keySet().iterator(); iterator.hasNext();)
        {
            Object obj = (String)iterator.next();
            obj = (Map)zzabQ.get(obj);
            Iterator iterator1 = ((Map) (obj)).keySet().iterator();
            while (iterator1.hasNext()) 
            {
                ((FastJsonResponse.Field)((Map) (obj)).get((String)iterator1.next())).zza(this);
            }
        }

    }

}
