// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.res.Resources;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.util.q;
import java.util.List;
import java.util.Locale;

// Referenced classes of package com.whatsapp:
//            fz, App, WebSessionsActivity, iz, 
//            a1g, my, w4

class cz extends BaseAdapter
{

    private static final String z[];
    protected List a;
    final WebSessionsActivity b;

    private cz(WebSessionsActivity websessionsactivity)
    {
        b = websessionsactivity;
        super();
    }

    cz(WebSessionsActivity websessionsactivity, w4 w4)
    {
        this(websessionsactivity);
    }

    public fz a(int i)
    {
        return (fz)a.get(i);
    }

    public void a(List list)
    {
        a = list;
        notifyDataSetChanged();
    }

    public int getCount()
    {
        if (a == null)
        {
            return 0;
        } else
        {
            return a.size();
        }
    }

    public Object getItem(int i)
    {
        return a(i);
    }

    public long getItemId(int i)
    {
        return (long)i;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        View view1;
        int j1;
        int k1;
label0:
        {
            k1 = App.am;
            view1 = view;
            if (view == null)
            {
                view1 = iz.a(b.getLayoutInflater(), 0x7f0300b4, viewgroup, false);
                if (k1 != 0)
                {
                    view1 = view;
                }
            }
            view = a(i);
            viewgroup = (TextView)view1.findViewById(0x7f0b0135);
            TextView textview = (TextView)view1.findViewById(0x7f0b00cf);
            a1g.a(textview);
            boolean flag = my.f(((fz) (view)).f);
            viewgroup.setText(q.a(b.getBaseContext(), ((fz) (view)).k, flag));
            if (!TextUtils.isEmpty(((fz) (view)).l))
            {
                textview.setText(b.getResources().getString(0x7f0e04a4, new Object[] {
                    ((fz) (view)).l, ((fz) (view)).b
                }));
                if (k1 == 0)
                {
                    break label0;
                }
            }
            textview.setText(((fz) (view)).b);
        }
        j1 = 0x7f020075;
        i = j1;
        if (((fz) (view)).a == null) goto _L2; else goto _L1
_L1:
        int j;
        int k;
        int l;
        int i1;
        viewgroup = ((fz) (view)).a.toLowerCase(Locale.US);
        i = -1;
        j = i;
        k = i;
        l = i;
        i1 = i;
        viewgroup.hashCode();
        JVM INSTR lookupswitch 5: default 252
    //                   -1361128838: 371
    //                   -909897856: 444
    //                   -849452327: 393
    //                   3356: 470
    //                   105948115: 418;
           goto _L3 _L4 _L5 _L6 _L7 _L8
_L3:
        i;
        JVM INSTR tableswitch 0 4: default 288
    //                   0 490
    //                   1 498
    //                   2 506
    //                   3 514
    //                   4 522;
           goto _L9 _L10 _L11 _L12 _L13 _L14
_L9:
        i = j1;
_L2:
label1:
        {
            ((ImageView)view1.findViewById(0x7f0b01ea)).setImageResource(i);
            if (((fz) (view)).h)
            {
                if (((fz) (view)).c == 0L)
                {
                    WebSessionsActivity.a(b, ((fz) (view)).f);
                    if (k1 == 0)
                    {
                        break label1;
                    }
                }
                WebSessionsActivity.a(b, ((fz) (view)).f, ((fz) (view)).c);
                if (k1 == 0)
                {
                    break label1;
                }
            }
            WebSessionsActivity.a(b, ((fz) (view)).f);
        }
        return view1;
_L4:
        if (!viewgroup.equals(z[0])) goto _L3; else goto _L15
_L15:
        j = 0;
        i = 0;
        if (k1 == 0) goto _L3; else goto _L6
_L6:
        i = j;
        if (!viewgroup.equals(z[4])) goto _L3; else goto _L16
_L16:
        k = 1;
        i = 1;
        if (k1 == 0) goto _L3; else goto _L8
_L8:
        i = k;
        if (!viewgroup.equals(z[2])) goto _L3; else goto _L17
_L17:
        l = 2;
        i = l;
        if (k1 == 0) goto _L3; else goto _L5
_L5:
        i = l;
        if (!viewgroup.equals(z[1])) goto _L3; else goto _L18
_L18:
        i1 = 3;
        i = i1;
        if (k1 == 0) goto _L3; else goto _L7
_L7:
        i = i1;
        if (viewgroup.equals(z[3]))
        {
            i = 4;
        }
          goto _L3
_L10:
        i = 0x7f020075;
        if (k1 == 0) goto _L2; else goto _L11
_L11:
        i = 0x7f020076;
        if (k1 == 0) goto _L2; else goto _L12
_L12:
        i = 0x7f020079;
        if (k1 == 0) goto _L2; else goto _L13
_L13:
        i = 0x7f02007a;
        if (k1 == 0) goto _L2; else goto _L14
_L14:
        i = 0x7f020077;
          goto _L2
    }

    public int getViewTypeCount()
    {
        return 1;
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[5];
        obj = "Q}S\n/W";
        byte0 = -1;
        i = 0;
_L2:
        String as1[];
        int j;
        int k;
        as1 = as;
        obj = ((String) (obj)).toCharArray();
        k = obj.length;
        j = 0;
_L8:
label0:
        {
            if (k > j)
            {
                break label0;
            }
            obj = (new String(((char []) (obj)))).intern();
            switch (byte0)
            {
            default:
                as1[i] = ((String) (obj));
                obj = "AtG\0040[";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "]eD\027#";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "[p";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                i = 4;
                obj = "T|S\000$]m";
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 192
    //                   0 215
    //                   1 222
    //                   2 229
    //                   3 236;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_236;
_L3:
        byte byte1 = 66;
_L9:
        obj[j] = (char)(byte1 ^ c);
        j++;
          goto _L8
_L4:
        byte1 = 50;
          goto _L9
_L5:
        byte1 = 21;
          goto _L9
_L6:
        byte1 = 33;
          goto _L9
        byte1 = 101;
          goto _L9
    }
}
