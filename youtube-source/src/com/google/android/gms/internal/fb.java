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
//            gq, go

public final class fb
    implements SafeParcelable, gq
{

    public static final go CREATOR = new go();
    private final int jE;
    private final HashMap uk;
    private final HashMap ul;
    private final ArrayList um;

    public fb()
    {
        jE = 1;
        uk = new HashMap();
        ul = new HashMap();
        um = null;
    }

    fb(int i, ArrayList arraylist)
    {
        jE = i;
        uk = new HashMap();
        ul = new HashMap();
        um = null;
        a(arraylist);
    }

    private void a(ArrayList arraylist)
    {
        a a1;
        for (arraylist = arraylist.iterator(); arraylist.hasNext(); c(a1.un, a1.uo))
        {
            a1 = (a)arraylist.next();
        }

    }

    public final String a(Integer integer)
    {
        String s = (String)ul.get(integer);
        integer = s;
        if (s == null)
        {
            integer = s;
            if (uk.containsKey("gms_unknown"))
            {
                integer = "gms_unknown";
            }
        }
        return integer;
    }

    public final fb c(String s, int i)
    {
        uk.put(s, Integer.valueOf(i));
        ul.put(Integer.valueOf(i), s);
        return this;
    }

    final ArrayList cg()
    {
        ArrayList arraylist = new ArrayList();
        String s;
        for (Iterator iterator = uk.keySet().iterator(); iterator.hasNext(); arraylist.add(new a(s, ((Integer)uk.get(s)).intValue())))
        {
            s = (String)iterator.next();
        }

        return arraylist;
    }

    public final int ch()
    {
        return 7;
    }

    public final int ci()
    {
        return 0;
    }

    public final int describeContents()
    {
        go go1 = CREATOR;
        return 0;
    }

    public final Object g(Object obj)
    {
        return a((Integer)obj);
    }

    final int getVersionCode()
    {
        return jE;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        go go1 = CREATOR;
        go.a(this, parcel);
    }


    private class a
        implements SafeParcelable
    {

        public static final gp CREATOR = new gp();
        final String un;
        final int uo;
        final int versionCode;

        public final int describeContents()
        {
            gp gp1 = CREATOR;
            return 0;
        }

        public final void writeToParcel(Parcel parcel, int i)
        {
            gp gp1 = CREATOR;
            gp.a(this, parcel);
        }


        a(int i, String s, int j)
        {
            versionCode = i;
            un = s;
            uo = j;
        }

        a(String s, int i)
        {
            versionCode = 1;
            un = s;
            uo = i;
        }
    }

}
