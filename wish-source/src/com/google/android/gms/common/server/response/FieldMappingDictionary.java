// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.server.response;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzv;
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
        final ArrayList zzUL;

        private static ArrayList zzA(Map map)
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

        HashMap zzmO()
        {
            HashMap hashmap = new HashMap();
            int j = zzUL.size();
            for (int i = 0; i < j; i++)
            {
                FieldMapPair fieldmappair = (FieldMapPair)zzUL.get(i);
                hashmap.put(fieldmappair.zzgk, fieldmappair.zzUM);
            }

            return hashmap;
        }


        Entry(int i, String s, ArrayList arraylist)
        {
            versionCode = i;
            className = s;
            zzUL = arraylist;
        }

        Entry(String s, Map map)
        {
            versionCode = 1;
            className = s;
            zzUL = zzA(map);
        }
    }

    public static class FieldMapPair
        implements SafeParcelable
    {

        public static final zzb CREATOR = new zzb();
        final int versionCode;
        final FastJsonResponse.Field zzUM;
        final String zzgk;

        public int describeContents()
        {
            zzb zzb1 = CREATOR;
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i)
        {
            zzb zzb1 = CREATOR;
            zzb.zza(this, parcel, i);
        }


        FieldMapPair(int i, String s, FastJsonResponse.Field field)
        {
            versionCode = i;
            zzgk = s;
            zzUM = field;
        }

        FieldMapPair(String s, FastJsonResponse.Field field)
        {
            versionCode = 1;
            zzgk = s;
            zzUM = field;
        }
    }


    public static final zzc CREATOR = new zzc();
    private final HashMap zzUI;
    private final ArrayList zzUJ = null;
    private final String zzUK;
    private final int zzzH;

    FieldMappingDictionary(int i, ArrayList arraylist, String s)
    {
        zzzH = i;
        zzUI = zzc(arraylist);
        zzUK = (String)zzv.zzr(s);
        zzmK();
    }

    private static HashMap zzc(ArrayList arraylist)
    {
        HashMap hashmap = new HashMap();
        int j = arraylist.size();
        for (int i = 0; i < j; i++)
        {
            Entry entry = (Entry)arraylist.get(i);
            hashmap.put(entry.className, entry.zzmO());
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
        return zzzH;
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        for (Iterator iterator = zzUI.keySet().iterator(); iterator.hasNext();)
        {
            Object obj = (String)iterator.next();
            stringbuilder.append(((String) (obj))).append(":\n");
            obj = (Map)zzUI.get(obj);
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

    public Map zzbX(String s)
    {
        return (Map)zzUI.get(s);
    }

    public void zzmK()
    {
        for (Iterator iterator = zzUI.keySet().iterator(); iterator.hasNext();)
        {
            Object obj = (String)iterator.next();
            obj = (Map)zzUI.get(obj);
            Iterator iterator1 = ((Map) (obj)).keySet().iterator();
            while (iterator1.hasNext()) 
            {
                ((FastJsonResponse.Field)((Map) (obj)).get((String)iterator1.next())).zza(this);
            }
        }

    }

    ArrayList zzmM()
    {
        ArrayList arraylist = new ArrayList();
        String s;
        for (Iterator iterator = zzUI.keySet().iterator(); iterator.hasNext(); arraylist.add(new Entry(s, (Map)zzUI.get(s))))
        {
            s = (String)iterator.next();
        }

        return arraylist;
    }

    public String zzmN()
    {
        return zzUK;
    }

}
