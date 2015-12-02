// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AutoCompleteTextView;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.util.c;
import java.util.ArrayList;

// Referenced classes of package com.whatsapp:
//            k1, og, App, MultipleContactsSelector, 
//            iz, ao9, a1g

class alc extends BaseAdapter
    implements Filterable
{

    private static final String z[];
    final MultipleContactsSelector a;
    private Filter b;
    private ArrayList c;

    public alc(MultipleContactsSelector multiplecontactsselector)
    {
        a = multiplecontactsselector;
        super();
        b = new k1(this, null);
    }

    static ArrayList a(alc alc1, ArrayList arraylist)
    {
        alc1.c = arraylist;
        return arraylist;
    }

    public og a(int i)
    {
        og og1;
        synchronized (c)
        {
            og1 = (og)c.get(i);
        }
        return og1;
        exception;
        arraylist;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public int getCount()
    {
        if (c != null)
        {
            return c.size();
        } else
        {
            return 0;
        }
    }

    public Filter getFilter()
    {
        return b;
    }

    public Object getItem(int i)
    {
        return a(i);
    }

    public long getItemId(int i)
    {
        return 0L;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        og og1;
        TextView textview;
        SpannableStringBuilder spannablestringbuilder;
        int j;
label0:
        {
            j = App.am;
            og1 = a(i);
            viewgroup = view;
            if (view == null)
            {
                viewgroup = iz.a(a.getLayoutInflater(), 0x7f030021, null);
            }
            view = (ImageView)viewgroup.findViewById(0x7f0b00b4);
            MultipleContactsSelector.a(a).a(og1, view);
            textview = (TextView)viewgroup.findViewById(0x7f0b00b6);
            a1g.b(textview);
            view = og1.a(a);
            String s = a.q.getText().toString().toLowerCase();
            spannablestringbuilder = new SpannableStringBuilder(view);
            if (view.toLowerCase().startsWith(s))
            {
                spannablestringbuilder.setSpan(new ForegroundColorSpan(a.getResources().getColor(0x7f090032)), 0, s.length(), 33);
                if (j == 0)
                {
                    break label0;
                }
            }
            i = view.toLowerCase().indexOf((new StringBuilder()).append(" ").append(s).toString());
            if (i > 0)
            {
                spannablestringbuilder.setSpan(new ForegroundColorSpan(a.getResources().getColor(0x7f090032)), i + 1, i + 1 + s.length(), 33);
            }
        }
label1:
        {
            textview.setText(spannablestringbuilder);
            TextView textview1 = (TextView)viewgroup.findViewById(0x7f0b00b8);
            if (App.C(og1.a))
            {
                textview1.setText(0x7f0e0454);
                textview.setTextColor(0xff888888);
                viewgroup.setLongClickable(true);
                if (j == 0)
                {
                    break label1;
                }
            }
            if (og1.d != null)
            {
                view = (new StringBuilder()).append(og1.d).append(z[1]).toString();
            } else
            {
                view = z[0];
            }
            textview.setTextColor(0xff000000);
            textview1.setText(com.whatsapp.util.c.c(view, a.getBaseContext()));
            viewgroup.setLongClickable(false);
        }
        view = og1.a(a.getResources());
        if (view != null)
        {
            ((TextView)viewgroup.findViewById(0x7f0b00b7)).setText(view);
        }
        viewgroup.setTag(og1);
        return viewgroup;
    }

    public boolean hasStableIds()
    {
        return true;
    }

    static 
    {
        String as[];
        byte byte1;
        int i;
        as = new String[2];
        byte1 = -1;
        i = 0;
_L2:
        String as1[];
        Object obj;
        int j;
        int k;
        as1 = as;
        obj = "g\004".toCharArray();
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
            switch (byte1)
            {
            default:
                as1[i] = ((String) (obj));
                i = 1;
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c1 = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 128
    //                   0 149
    //                   1 155
    //                   2 161
    //                   3 167;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_167;
_L3:
        byte byte0 = 76;
_L9:
        obj[j] = (char)(byte0 ^ c1);
        j++;
          goto _L8
_L4:
        byte0 = 71;
          goto _L9
_L5:
        byte0 = 36;
          goto _L9
_L6:
        byte0 = 89;
          goto _L9
        byte0 = 3;
          goto _L9
    }
}
