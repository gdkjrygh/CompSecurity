// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.app.Activity;
import android.content.Context;
import android.text.format.DateUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.protocol.cr;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

// Referenced classes of package com.whatsapp:
//            td, App, iz, k, 
//            og, ao9

class ya extends ArrayAdapter
{

    private static final String z[];
    final td a;

    public ya(td td1, Context context, List list)
    {
        a = td1;
        super(context, 0x7f030092, list);
    }

    public cr a(int i)
    {
        return (cr)a.e.get(i);
    }

    public int getCount()
    {
        return a.e.size();
    }

    public Object getItem(int i)
    {
        return a(i);
    }

    public int getItemViewType(int i)
    {
        return 0;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        View view1;
        TextView textview;
        cr cr1;
        og og1;
        int j;
label0:
        {
            j = App.am;
            view1 = view;
            if (view == null)
            {
                view1 = iz.a(td.a(a).getLayoutInflater(), 0x7f030092, viewgroup, false);
                if (j != 0)
                {
                    view1 = view;
                }
            }
            view1.setBackgroundResource(0x7f02063d);
            view1.setSelected(true);
            view = (TextView)view1.findViewById(0x7f0b0135);
            textview = (TextView)view1.findViewById(0x7f0b00cf);
            viewgroup = (ImageView)view1.findViewById(0x7f0b01ea);
            cr1 = a(i);
            og1 = App.az.e(cr1.g);
            if (a.o.contains(cr1))
            {
                view1.setBackgroundColor(0xffcfe9f3);
                if (j == 0)
                {
                    break label0;
                }
            }
            view1.setBackgroundResource(0);
        }
label1:
        {
            view1.setTag(cr1);
            view.setText(og1.a(getContext()));
            td.h(a).a(og1, viewgroup);
            if (System.currentTimeMillis() - cr1.i < 60000L)
            {
                viewgroup = td.a(a).getString(0x7f0e0227);
                if (j == 0)
                {
                    break label1;
                }
            }
            viewgroup = DateUtils.getRelativeTimeSpanString(cr1.i, System.currentTimeMillis(), 60000L, 0).toString();
        }
label2:
        {
            view = viewgroup;
            if (cr1.f != 0)
            {
                view = (new StringBuilder()).append(viewgroup).append(z[2]).append(td.a(a).getString(0x7f0e0224, new Object[] {
                    Integer.valueOf(cr1.f)
                })).toString();
            }
            viewgroup = view;
            if ((double)cr1.c <= 0.44703999999999999D)
            {
                break label2;
            }
            viewgroup = (new StringBuilder()).append(view).append(z[3]).toString();
            view = viewgroup;
            if (Locale.US.equals(Locale.getDefault()))
            {
                view = (new StringBuilder()).append(viewgroup).append(td.a(a).getString(0x7f0e022c, new Object[] {
                    String.format(z[0], new Object[] {
                        Double.valueOf((double)cr1.c * 2.2369400000000002D)
                    })
                })).toString();
                viewgroup = view;
                if (j == 0)
                {
                    break label2;
                }
            }
            viewgroup = (new StringBuilder()).append(view).append(td.a(a).getString(0x7f0e022b, new Object[] {
                String.format(z[1], new Object[] {
                    Double.valueOf((double)cr1.c * 3.6000000000000001D)
                })
            })).toString();
        }
        textview.setText(viewgroup);
        return view1;
    }

    public int getViewTypeCount()
    {
        return 1;
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[4];
        obj = "1fO&D%1";
        byte1 = -1;
        i = 0;
_L2:
        String as1[];
        int j;
        int l;
        as1 = as;
        obj = ((String) (obj)).toCharArray();
        l = obj.length;
        j = 0;
_L8:
label0:
        {
            if (l > j)
            {
                break label0;
            }
            obj = (new String(((char []) (obj)))).intern();
            switch (byte1)
            {
            default:
                as1[i] = ((String) (obj));
                obj = "1fO&D%1";
                i = 1;
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "8w";
                i = 2;
                byte1 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                i = 3;
                obj = "8w";
                byte1 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 176
    //                   0 197
    //                   1 203
    //                   2 209
    //                   3 215;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_215;
_L3:
        byte byte0 = 106;
_L9:
        obj[j] = (char)(byte0 ^ c);
        j++;
          goto _L8
_L4:
        byte0 = 20;
          goto _L9
_L5:
        byte0 = 87;
          goto _L9
_L6:
        byte0 = 107;
          goto _L9
        byte0 = 10;
          goto _L9
    }
}
