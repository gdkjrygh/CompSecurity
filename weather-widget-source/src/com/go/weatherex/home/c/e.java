// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.home.c;

import android.content.Context;
import android.util.SparseArray;
import com.gau.go.launcherex.gowidget.weather.model.GoLifeBean;
import com.gau.go.launcherex.gowidget.weather.model.j;
import com.gtp.a.a.b.c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.go.weatherex.home.c:
//            f

public class e
{

    public static SparseArray a(List list)
    {
        SparseArray sparsearray = new SparseArray(3);
        ArrayList arraylist = new ArrayList();
        ArrayList arraylist1 = new ArrayList();
        ArrayList arraylist2 = new ArrayList();
        list = list.iterator();
        do
        {
            if (!list.hasNext())
            {
                break;
            }
            GoLifeBean golifebean = (GoLifeBean)list.next();
            switch (f.a[golifebean.c().ordinal()])
            {
            case 1: // '\001'
                if (!golifebean.b().toLowerCase().equals("null") && !golifebean.a().toLowerCase().equals("null") && !golifebean.a().toLowerCase().equals("-null"))
                {
                    arraylist.add(golifebean);
                }
                break;

            case 2: // '\002'
                if (!golifebean.b().toLowerCase().equals("null") && !golifebean.a().toLowerCase().equals("null") && !golifebean.a().toLowerCase().equals("-null"))
                {
                    arraylist.add(golifebean);
                }
                break;

            case 3: // '\003'
                if (!golifebean.b().toLowerCase().equals("null") && !golifebean.a().toLowerCase().equals("null") && !golifebean.a().toLowerCase().equals("-null"))
                {
                    arraylist.add(golifebean);
                }
                break;

            case 4: // '\004'
                if (!golifebean.b().toLowerCase().equals("null") && !golifebean.a().toLowerCase().equals("null") && !golifebean.a().toLowerCase().equals("-null"))
                {
                    arraylist1.add(golifebean);
                }
                break;

            case 5: // '\005'
                if (!golifebean.b().toLowerCase().equals("null") && !golifebean.a().toLowerCase().equals("null") && !golifebean.a().toLowerCase().equals("-null"))
                {
                    arraylist1.add(golifebean);
                }
                break;

            case 6: // '\006'
                if (!golifebean.b().toLowerCase().equals("null") && !golifebean.a().toLowerCase().equals("null") && !golifebean.a().toLowerCase().equals("-null"))
                {
                    arraylist1.add(golifebean);
                }
                break;

            case 7: // '\007'
                if (!golifebean.b().toLowerCase().equals("null") && !golifebean.a().toLowerCase().equals("null") && !golifebean.a().toLowerCase().equals("-null"))
                {
                    arraylist2.add(golifebean);
                }
                break;

            case 8: // '\b'
                if (!golifebean.b().toLowerCase().equals("null") && !golifebean.a().toLowerCase().equals("null") && !golifebean.a().toLowerCase().equals("-null"))
                {
                    arraylist2.add(golifebean);
                }
                break;

            case 9: // '\t'
                if (!golifebean.b().toLowerCase().equals("null") && !golifebean.a().toLowerCase().equals("null") && !golifebean.a().toLowerCase().equals("-null"))
                {
                    arraylist2.add(golifebean);
                }
                break;
            }
        } while (true);
        sparsearray.put(1, arraylist);
        sparsearray.put(2, arraylist1);
        sparsearray.put(3, arraylist2);
        return sparsearray;
    }

    public static String a(j j1, Context context)
    {
        switch (f.a[j1.ordinal()])
        {
        default:
            return "";

        case 1: // '\001'
            return context.getString(0x7f080222);

        case 2: // '\002'
            return context.getString(0x7f080223);

        case 3: // '\003'
            return context.getString(0x7f080224);

        case 4: // '\004'
            return context.getString(0x7f080225);

        case 5: // '\005'
            return context.getString(0x7f080226);

        case 6: // '\006'
            return context.getString(0x7f080227);

        case 7: // '\007'
            return context.getString(0x7f080228);

        case 8: // '\b'
            return context.getString(0x7f080229);

        case 9: // '\t'
            return context.getString(0x7f08022a);
        }
    }

    public static String a(j j1, String s, Context context)
    {
        int i;
        int l2;
        int i3;
        int j3;
        int k3;
        int l3;
        int i4;
        int j4;
        int k4;
        c.b("GoLife\u751F\u6D3B\u6307\u6570\u7684\u503C\u4E3A\uFF1A", s);
        i = Integer.parseInt(s);
        l2 = i;
        i3 = i;
        j3 = i;
        k3 = i;
        l3 = i;
        i4 = i;
        j4 = i;
        k4 = i;
        f.a[j1.ordinal()];
        JVM INSTR tableswitch 1 9: default 92
    //                   1 95
    //                   2 149
    //                   3 188
    //                   4 239
    //                   5 290
    //                   6 341
    //                   7 392
    //                   8 431
    //                   9 482;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10
_L1:
        return "";
_L2:
        i3 = i;
        if (i < 0)
        {
            i3 = -i;
        }
        if (i3 < 2)
        {
            return context.getString(0x7f08022e);
        }
        if (i3 < 3)
        {
            return context.getString(0x7f08022f);
        }
        l2 = i3;
        if (i3 <= 5)
        {
            return context.getString(0x7f080230);
        }
_L3:
        int k = l2;
        if (l2 < 0)
        {
            k = -l2;
        }
        if (k < 4)
        {
            return context.getString(0x7f080231);
        }
        i3 = k;
        if (k <= 5)
        {
            return context.getString(0x7f080232);
        }
_L4:
        int l = i3;
        if (i3 < 0)
        {
            l = -i3;
        }
        if (l < 2)
        {
            return context.getString(0x7f08022e);
        }
        if (l < 3)
        {
            return context.getString(0x7f08022f);
        }
        j3 = l;
        if (l <= 5)
        {
            return context.getString(0x7f080230);
        }
_L5:
        int i1 = j3;
        if (j3 < 0)
        {
            i1 = -j3;
        }
        if (i1 < 2)
        {
            return context.getString(0x7f080237);
        }
        if (i1 < 3)
        {
            return context.getString(0x7f080238);
        }
        k3 = i1;
        if (i1 <= 5)
        {
            return context.getString(0x7f080239);
        }
_L6:
        int k1 = k3;
        if (k3 < 0)
        {
            k1 = -k3;
        }
        if (k1 < 2)
        {
            return context.getString(0x7f08022e);
        }
        if (k1 < 3)
        {
            return context.getString(0x7f08022f);
        }
        l3 = k1;
        if (k1 <= 5)
        {
            return context.getString(0x7f080230);
        }
_L7:
        int l1 = l3;
        if (l3 < 0)
        {
            l1 = -l3;
        }
        if (l1 < 2)
        {
            return context.getString(0x7f08022e);
        }
        if (l1 < 3)
        {
            return context.getString(0x7f08022f);
        }
        i4 = l1;
        if (l1 <= 5)
        {
            return context.getString(0x7f080230);
        }
_L8:
        int i2 = i4;
        if (i4 < 0)
        {
            i2 = -i4;
        }
        if (i2 <= 2)
        {
            return context.getString(0x7f080233);
        }
        j4 = i2;
        if (i2 <= 5)
        {
            return context.getString(0x7f080234);
        }
_L9:
        int j2 = j4;
        if (j4 < 0)
        {
            j2 = -j4;
        }
        if (j2 < 2)
        {
            return context.getString(0x7f080235);
        }
        if (j2 < 3)
        {
            return context.getString(0x7f080236);
        }
        k4 = j2;
        if (j2 <= 5)
        {
            return context.getString(0x7f080234);
        }
_L10:
        int k2 = k4;
        if (k4 < 0)
        {
            k2 = -k4;
        }
        if (k2 < 2)
        {
            return context.getString(0x7f080235);
        }
        if (k2 < 3)
        {
            return context.getString(0x7f080236);
        }
        if (k2 <= 5)
        {
            return context.getString(0x7f080234);
        }
        if (true) goto _L1; else goto _L11
_L11:
    }

    public static ArrayList a(ArrayList arraylist)
    {
        arraylist = new ArrayList(arraylist);
        Collections.sort(arraylist, GoLifeBean.a);
        return arraylist;
    }

    public static ArrayList a(ArrayList arraylist, int i)
    {
        if (i == 1)
        {
            return a((ArrayList)a(((List) (arraylist))).get(1));
        }
        if (i == 2)
        {
            return a((ArrayList)a(((List) (arraylist))).get(2));
        }
        if (i == 3)
        {
            return a((ArrayList)a(((List) (arraylist))).get(3));
        } else
        {
            return null;
        }
    }
}
