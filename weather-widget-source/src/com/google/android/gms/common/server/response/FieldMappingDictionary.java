// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.server.response;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzx;
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
        final ArrayList zzafd;

        private static ArrayList zzD(Map map)
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

        HashMap zzps()
        {
            HashMap hashmap = new HashMap();
            int j = zzafd.size();
            for (int i = 0; i < j; i++)
            {
                FieldMapPair fieldmappair = (FieldMapPair)zzafd.get(i);
                hashmap.put(fieldmappair.key, fieldmappair.zzafe);
            }

            return hashmap;
        }


        Entry(int i, String s, ArrayList arraylist)
        {
            versionCode = i;
            className = s;
            zzafd = arraylist;
        }

        Entry(String s, Map map)
        {
            versionCode = 1;
            className = s;
            zzafd = zzD(map);
        }
    }

    public static class FieldMapPair
        implements SafeParcelable
    {

        public static final zzb CREATOR = new zzb();
        final String key;
        final int versionCode;
        final FastJsonResponse.Field zzafe;

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
            key = s;
            zzafe = field;
        }

        FieldMapPair(String s, FastJsonResponse.Field field)
        {
            versionCode = 1;
            key = s;
            zzafe = field;
        }
    }


    public static final zzc CREATOR = new zzc();
    private final int mVersionCode;
    private final HashMap zzafa;
    private final ArrayList zzafb;
    private final String zzafc;

    FieldMappingDictionary(int i, ArrayList arraylist, String s)
    {
        mVersionCode = i;
        zzafb = null;
        zzafa = zzc(arraylist);
        zzafc = (String)zzx.zzv(s);
        zzpo();
    }

    public FieldMappingDictionary(Class class1)
    {
        mVersionCode = 1;
        zzafb = null;
        zzafa = new HashMap();
        zzafc = class1.getCanonicalName();
    }

    private static HashMap zzc(ArrayList arraylist)
    {
        HashMap hashmap = new HashMap();
        int j = arraylist.size();
        for (int i = 0; i < j; i++)
        {
            Entry entry = (Entry)arraylist.get(i);
            hashmap.put(entry.className, entry.zzps());
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
        return mVersionCode;
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        for (Iterator iterator = zzafa.keySet().iterator(); iterator.hasNext();)
        {
            Object obj = (String)iterator.next();
            stringbuilder.append(((String) (obj))).append(":\n");
            obj = (Map)zzafa.get(obj);
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
        zzafa.put(class1.getCanonicalName(), map);
    }

    public boolean zzb(Class class1)
    {
        return zzafa.containsKey(class1.getCanonicalName());
    }

    public Map zzcx(String s)
    {
        return (Map)zzafa.get(s);
    }

    public void zzpo()
    {
        for (Iterator iterator = zzafa.keySet().iterator(); iterator.hasNext();)
        {
            Object obj = (String)iterator.next();
            obj = (Map)zzafa.get(obj);
            Iterator iterator1 = ((Map) (obj)).keySet().iterator();
            while (iterator1.hasNext()) 
            {
                ((FastJsonResponse.Field)((Map) (obj)).get((String)iterator1.next())).zza(this);
            }
        }

    }

    public void zzpp()
    {
        String s;
        HashMap hashmap;
        for (Iterator iterator = zzafa.keySet().iterator(); iterator.hasNext(); zzafa.put(s, hashmap))
        {
            s = (String)iterator.next();
            Map map = (Map)zzafa.get(s);
            hashmap = new HashMap();
            String s1;
            for (Iterator iterator1 = map.keySet().iterator(); iterator1.hasNext(); hashmap.put(s1, ((FastJsonResponse.Field)map.get(s1)).zzpe()))
            {
                s1 = (String)iterator1.next();
            }

        }

    }

    ArrayList zzpq()
    {
        ArrayList arraylist = new ArrayList();
        String s;
        for (Iterator iterator = zzafa.keySet().iterator(); iterator.hasNext(); arraylist.add(new Entry(s, (Map)zzafa.get(s))))
        {
            s = (String)iterator.next();
        }

        return arraylist;
    }

    public String zzpr()
    {
        return zzafc;
    }

}
