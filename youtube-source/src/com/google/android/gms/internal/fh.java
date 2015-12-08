// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.google.android.gms.internal:
//            gt, gi

public class fh
    implements SafeParcelable
{

    public static final gt CREATOR = new gt();
    private final int jE;
    private final ArrayList uA;
    private final String uB;
    private final HashMap uz;

    fh(int i, ArrayList arraylist, String s)
    {
        jE = i;
        uA = null;
        uz = b(arraylist);
        uB = (String)gi.a(s);
        cw();
    }

    public fh(Class class1)
    {
        jE = 1;
        uA = null;
        uz = new HashMap();
        uB = class1.getCanonicalName();
    }

    private static HashMap b(ArrayList arraylist)
    {
        HashMap hashmap = new HashMap();
        int j = arraylist.size();
        for (int i = 0; i < j; i++)
        {
            a a1 = (a)arraylist.get(i);
            hashmap.put(a1.className, a1.cA());
        }

        return hashmap;
    }

    public void a(Class class1, HashMap hashmap)
    {
        uz.put(class1.getCanonicalName(), hashmap);
    }

    public HashMap ag(String s)
    {
        return (HashMap)uz.get(s);
    }

    public boolean b(Class class1)
    {
        return uz.containsKey(class1.getCanonicalName());
    }

    public void cw()
    {
        for (Iterator iterator = uz.keySet().iterator(); iterator.hasNext();)
        {
            Object obj = (String)iterator.next();
            obj = (HashMap)uz.get(obj);
            Iterator iterator1 = ((HashMap) (obj)).keySet().iterator();
            while (iterator1.hasNext()) 
            {
                ((fe.a)((HashMap) (obj)).get((String)iterator1.next())).a(this);
            }
        }

    }

    public void cx()
    {
        String s;
        HashMap hashmap1;
        for (Iterator iterator = uz.keySet().iterator(); iterator.hasNext(); uz.put(s, hashmap1))
        {
            s = (String)iterator.next();
            HashMap hashmap = (HashMap)uz.get(s);
            hashmap1 = new HashMap();
            String s1;
            for (Iterator iterator1 = hashmap.keySet().iterator(); iterator1.hasNext(); hashmap1.put(s1, ((fe.a)hashmap.get(s1)).cm()))
            {
                s1 = (String)iterator1.next();
            }

        }

    }

    ArrayList cy()
    {
        ArrayList arraylist = new ArrayList();
        String s;
        for (Iterator iterator = uz.keySet().iterator(); iterator.hasNext(); arraylist.add(new a(s, (HashMap)uz.get(s))))
        {
            s = (String)iterator.next();
        }

        return arraylist;
    }

    public String cz()
    {
        return uB;
    }

    public int describeContents()
    {
        gt gt1 = CREATOR;
        return 0;
    }

    int getVersionCode()
    {
        return jE;
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        for (Iterator iterator = uz.keySet().iterator(); iterator.hasNext();)
        {
            Object obj = (String)iterator.next();
            stringbuilder.append(((String) (obj))).append(":\n");
            obj = (HashMap)uz.get(obj);
            Iterator iterator1 = ((HashMap) (obj)).keySet().iterator();
            while (iterator1.hasNext()) 
            {
                String s = (String)iterator1.next();
                stringbuilder.append("  ").append(s).append(": ");
                stringbuilder.append(((HashMap) (obj)).get(s));
            }
        }

        return stringbuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        gt gt1 = CREATOR;
        gt.a(this, parcel);
    }


    private class a
        implements SafeParcelable
    {

        public static final gu CREATOR = new gu();
        final String className;
        final ArrayList uC;
        final int versionCode;

        private static ArrayList b(HashMap hashmap)
        {
            if (hashmap == null)
            {
                return null;
            }
            ArrayList arraylist = new ArrayList();
            String s;
            for (Iterator iterator = hashmap.keySet().iterator(); iterator.hasNext(); arraylist.add(new b(s, (fe.a)hashmap.get(s))))
            {
                s = (String)iterator.next();
            }

            return arraylist;
        }

        HashMap cA()
        {
            HashMap hashmap = new HashMap();
            int j = uC.size();
            for (int i = 0; i < j; i++)
            {
                b b1 = (b)uC.get(i);
                hashmap.put(b1.uD, b1.uE);
            }

            return hashmap;
        }

        public int describeContents()
        {
            gu gu1 = CREATOR;
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i)
        {
            gu gu1 = CREATOR;
            gu.a(this, parcel);
        }


        a(int i, String s, ArrayList arraylist)
        {
            versionCode = i;
            className = s;
            uC = arraylist;
        }

        a(String s, HashMap hashmap)
        {
            versionCode = 1;
            className = s;
            uC = b(hashmap);
        }

        private class b
            implements SafeParcelable
        {

            public static final gs CREATOR = new gs();
            final String uD;
            final fe.a uE;
            final int versionCode;

            public int describeContents()
            {
                gs gs1 = CREATOR;
                return 0;
            }

            public void writeToParcel(Parcel parcel, int i)
            {
                gs gs1 = CREATOR;
                gs.a(this, parcel, i);
            }


            b(int i, String s, fe.a a1)
            {
                versionCode = i;
                uD = s;
                uE = a1;
            }

            b(String s, fe.a a1)
            {
                versionCode = 1;
                uD = s;
                uE = a1;
            }
        }

    }

}
