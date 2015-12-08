// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.home.c;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.text.format.Time;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.gau.go.launcherex.gowidget.weather.model.GoLifeBean;
import com.gau.go.launcherex.gowidget.weather.model.WeatherBean;
import com.gau.go.launcherex.gowidget.weather.model.j;
import com.gau.go.launcherex.gowidget.weather.util.f;
import com.gtp.a.a.b.c;
import java.util.ArrayList;
import java.util.Collections;

// Referenced classes of package com.go.weatherex.home.c:
//            d, b, c, e

public class a extends com.go.weatherex.framework.fragment.a
{

    private Context a;
    private String b;
    private Time c;
    private d d;

    public a()
    {
        b = "";
        d = new d(this, null);
    }

    private int a(j j1)
    {
        switch (b.a[j1.ordinal()])
        {
        default:
            return 0;

        case 1: // '\001'
            return 0x7f020237;

        case 2: // '\002'
            return 0x7f020238;

        case 3: // '\003'
            return 0x7f02023c;

        case 4: // '\004'
            return 0x7f02023b;

        case 5: // '\005'
            return 0x7f02023d;

        case 6: // '\006'
            return 0x7f02023a;

        case 7: // '\007'
            return 0x7f020236;

        case 8: // '\b'
            return 0x7f020235;

        case 9: // '\t'
            return 0x7f020239;
        }
    }

    static int a(a a1, j j1)
    {
        return a1.a(j1);
    }

    private String a(j j1, String s)
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
        com.gtp.a.a.b.c.b("GoLife\u751F\u6D3B\u6307\u6570\u7684\u503C\u4E3A\uFF1A", s);
        i = Integer.parseInt(s);
        l2 = i;
        i3 = i;
        j3 = i;
        k3 = i;
        l3 = i;
        i4 = i;
        j4 = i;
        k4 = i;
        b.a[j1.ordinal()];
        JVM INSTR tableswitch 1 9: default 92
    //                   1 95
    //                   2 158
    //                   3 203
    //                   4 263
    //                   5 323
    //                   6 383
    //                   7 443
    //                   8 488
    //                   9 548;
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
            return a.getString(0x7f08022e);
        }
        if (i3 < 3)
        {
            return a.getString(0x7f08022f);
        }
        l2 = i3;
        if (i3 <= 5)
        {
            return a.getString(0x7f080230);
        }
_L3:
        int k = l2;
        if (l2 < 0)
        {
            k = -l2;
        }
        if (k < 4)
        {
            return a.getString(0x7f080231);
        }
        i3 = k;
        if (k <= 5)
        {
            return a.getString(0x7f080232);
        }
_L4:
        int l = i3;
        if (i3 < 0)
        {
            l = -i3;
        }
        if (l < 2)
        {
            return a.getString(0x7f08022e);
        }
        if (l < 3)
        {
            return a.getString(0x7f08022f);
        }
        j3 = l;
        if (l <= 5)
        {
            return a.getString(0x7f080230);
        }
_L5:
        int i1 = j3;
        if (j3 < 0)
        {
            i1 = -j3;
        }
        if (i1 < 2)
        {
            return a.getString(0x7f080237);
        }
        if (i1 < 3)
        {
            return a.getString(0x7f080238);
        }
        k3 = i1;
        if (i1 <= 5)
        {
            return a.getString(0x7f080239);
        }
_L6:
        int k1 = k3;
        if (k3 < 0)
        {
            k1 = -k3;
        }
        if (k1 < 2)
        {
            return a.getString(0x7f08022e);
        }
        if (k1 < 3)
        {
            return a.getString(0x7f08022f);
        }
        l3 = k1;
        if (k1 <= 5)
        {
            return a.getString(0x7f080230);
        }
_L7:
        int l1 = l3;
        if (l3 < 0)
        {
            l1 = -l3;
        }
        if (l1 < 2)
        {
            return a.getString(0x7f08022e);
        }
        if (l1 < 3)
        {
            return a.getString(0x7f08022f);
        }
        i4 = l1;
        if (l1 <= 5)
        {
            return a.getString(0x7f080230);
        }
_L8:
        int i2 = i4;
        if (i4 < 0)
        {
            i2 = -i4;
        }
        if (i2 <= 2)
        {
            return a.getString(0x7f080233);
        }
        j4 = i2;
        if (i2 <= 5)
        {
            return a.getString(0x7f080234);
        }
_L9:
        int j2 = j4;
        if (j4 < 0)
        {
            j2 = -j4;
        }
        if (j2 < 2)
        {
            return a.getString(0x7f080235);
        }
        if (j2 < 3)
        {
            return a.getString(0x7f080236);
        }
        k4 = j2;
        if (j2 <= 5)
        {
            return a.getString(0x7f080234);
        }
_L10:
        int k2 = k4;
        if (k4 < 0)
        {
            k2 = -k4;
        }
        if (k2 < 2)
        {
            return a.getString(0x7f080235);
        }
        if (k2 < 3)
        {
            return a.getString(0x7f080236);
        }
        if (k2 <= 5)
        {
            return a.getString(0x7f080234);
        }
        if (true) goto _L1; else goto _L11
_L11:
    }

    static String a(a a1, j j1, String s)
    {
        return a1.a(j1, s);
    }

    public static ArrayList a(ArrayList arraylist)
    {
        arraylist = new ArrayList(arraylist);
        Collections.sort(arraylist, GoLifeBean.a);
        return arraylist;
    }

    private void a(int i, GoLifeBean golifebean, LinearLayout linearlayout)
    {
        i;
        JVM INSTR tableswitch 0 2: default 28
    //                   0 35
    //                   1 45
    //                   2 55;
           goto _L1 _L2 _L3 _L4
_L1:
        linearlayout = null;
_L6:
        if (linearlayout == null)
        {
            return;
        }
        break; /* Loop/switch isn't completed */
_L2:
        linearlayout = linearlayout.findViewById(0x7f0902d4);
        continue; /* Loop/switch isn't completed */
_L3:
        linearlayout = linearlayout.findViewById(0x7f0902d5);
        continue; /* Loop/switch isn't completed */
_L4:
        linearlayout = linearlayout.findViewById(0x7f0902d6);
        if (true) goto _L6; else goto _L5
_L5:
        if (linearlayout.getTag() == null)
        {
            linearlayout = new com.go.weatherex.home.c.c(this, linearlayout);
        } else
        {
            linearlayout = (com.go.weatherex.home.c.c)linearlayout.getTag();
        }
        linearlayout.a(golifebean);
        return;
    }

    private void a(LinearLayout linearlayout, String s)
    {
        ((TextView)linearlayout.findViewById(0x7f090202)).setText(s);
    }

    static void a(a a1, View view)
    {
        a1.b(view);
    }

    static boolean a(a a1)
    {
        return a1.b();
    }

    private String b(j j1)
    {
        switch (b.a[j1.ordinal()])
        {
        default:
            return "";

        case 1: // '\001'
            return a.getString(0x7f080222);

        case 2: // '\002'
            return a.getString(0x7f080223);

        case 3: // '\003'
            return a.getString(0x7f080224);

        case 4: // '\004'
            return a.getString(0x7f080225);

        case 5: // '\005'
            return a.getString(0x7f080226);

        case 6: // '\006'
            return a.getString(0x7f080227);

        case 7: // '\007'
            return a.getString(0x7f080228);

        case 8: // '\b'
            return a.getString(0x7f080229);

        case 9: // '\t'
            return a.getString(0x7f08022a);
        }
    }

    static String b(a a1, j j1)
    {
        return a1.b(j1);
    }

    private void b(View view)
    {
        boolean flag = false;
        Object obj = e.a(f.a(getActivity().getApplicationContext()).a(getArguments().getString("cityId")).k);
        new ArrayList();
        ArrayList arraylist = a((ArrayList)((SparseArray) (obj)).get(1));
        new ArrayList();
        ArrayList arraylist1 = a((ArrayList)((SparseArray) (obj)).get(2));
        new ArrayList();
        obj = a((ArrayList)((SparseArray) (obj)).get(3));
        LinearLayout linearlayout = (LinearLayout)view.findViewById(0x7f0902d2);
        LinearLayout linearlayout1 = (LinearLayout)view.findViewById(0x7f0902d7);
        LinearLayout linearlayout2 = (LinearLayout)view.findViewById(0x7f0902d9);
        if (arraylist.size() >= 1)
        {
            linearlayout.setVisibility(0);
            a(linearlayout, getActivity().getString(0x7f08022b));
            for (int i = 0; i < arraylist.size(); i++)
            {
                a(i, (GoLifeBean)arraylist.get(i), linearlayout);
            }

        } else
        {
            linearlayout.setVisibility(8);
        }
        if (arraylist1.size() >= 1)
        {
            linearlayout1.setVisibility(0);
            a(linearlayout1, getActivity().getString(0x7f08022c));
            for (int k = 0; k < arraylist1.size(); k++)
            {
                a(k, (GoLifeBean)arraylist1.get(k), linearlayout1);
            }

        } else
        {
            linearlayout1.setVisibility(8);
        }
        if (((ArrayList) (obj)).size() >= 1)
        {
            linearlayout2.setVisibility(0);
            a(linearlayout2, getActivity().getString(0x7f08022d));
            for (int l = ((flag) ? 1 : 0); l < ((ArrayList) (obj)).size(); l++)
            {
                a(l, (GoLifeBean)((ArrayList) (obj)).get(l), linearlayout2);
            }

        } else
        {
            linearlayout2.setVisibility(8);
        }
        a(view.findViewById(0x7f0902d3), 4, true);
        a(view.findViewById(0x7f0902d8), 4, true);
        a(view.findViewById(0x7f0902da), 4, true);
    }

    private boolean b()
    {
        Time time = new Time();
        time.setToNow();
        if (c.year == time.year && c.month == time.month && c.monthDay == time.monthDay)
        {
            return false;
        } else
        {
            c.setToNow();
            return true;
        }
    }

    protected void a(Bundle bundle)
    {
        super.a(bundle);
        if (bundle != null)
        {
            bundle = bundle.getString("cityId");
        } else
        {
            bundle = "";
        }
        if (!TextUtils.isEmpty(bundle) && !bundle.equals(b))
        {
            b = bundle;
        }
    }

    protected void b(int i, Object obj)
    {
        i;
        JVM INSTR tableswitch 10 10: default 20
    //                   10 21;
           goto _L1 _L2
_L1:
        return;
_L2:
        if (!isHidden() && (!TextUtils.isEmpty(((CharSequence) (obj = String.valueOf(obj)))) && !((String) (obj)).equals(b)))
        {
            b = ((String) (obj));
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        a = getActivity();
        a(new int[] {
            10
        });
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        return layoutinflater.inflate(0x7f03007d, viewgroup, false);
    }

    public void onDestroyView()
    {
        b(d);
        super.onDestroyView();
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        c = new Time();
        c.setToNow();
        b(view);
        a(d);
    }
}
