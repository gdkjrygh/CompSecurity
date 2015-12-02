// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.util.c;
import java.util.List;

// Referenced classes of package com.whatsapp:
//            App, og, MultipleContactPicker, iz, 
//            ao9, a1g, as5, abg

class a5 extends ArrayAdapter
{

    private static final String z[];
    final MultipleContactPicker a;

    public a5(MultipleContactPicker multiplecontactpicker, Context context, int i, List list)
    {
        a = multiplecontactpicker;
        super(context, i, list);
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        View view1;
        og og1;
        int j;
label0:
        {
            j = App.am;
            og1 = (og)getItem(i);
            if (MultipleContactPicker.a(og1))
            {
                view = iz.a(a.getLayoutInflater(), 0x7f03008a, viewgroup, false);
                view.setTag(Integer.valueOf(2));
                return view;
            }
            if (view != null)
            {
                view1 = view;
                if (((Integer)(Integer)view.getTag()).intValue() == 1)
                {
                    break label0;
                }
            }
            view1 = iz.a(a.getLayoutInflater(), 0x7f030089, viewgroup, false);
            if (j != 0)
            {
                view1 = view;
            }
        }
label1:
        {
            SpannableStringBuilder spannablestringbuilder;
label2:
            {
                view1.setTag(Integer.valueOf(1));
                view = (ImageView)view1.findViewById(0x7f0b00ce);
                MultipleContactPicker.b(a).a(og1, view);
                viewgroup = (TextView)view1.findViewById(0x7f0b0248);
                a1g.b(viewgroup);
                view = og1.a(getContext());
                String s = MultipleContactPicker.i(a).getText().toString().toLowerCase();
                if (TextUtils.isEmpty(s))
                {
                    viewgroup.setText(view);
                    if (j == 0)
                    {
                        break label1;
                    }
                }
                spannablestringbuilder = new SpannableStringBuilder(view);
                if (view.toLowerCase().startsWith(s))
                {
                    spannablestringbuilder.setSpan(new ForegroundColorSpan(a.getResources().getColor(0x7f090032)), 0, s.length(), 33);
                    if (j == 0)
                    {
                        break label2;
                    }
                }
                i = view.toLowerCase().indexOf((new StringBuilder()).append(" ").append(s).toString());
                if (i > 0)
                {
                    spannablestringbuilder.setSpan(new ForegroundColorSpan(a.getResources().getColor(0x7f090032)), i + 1, i + 1 + s.length(), 33);
                }
            }
            viewgroup.setText(spannablestringbuilder);
        }
label3:
        {
            TextView textview = (TextView)view1.findViewById(0x7f0b0249);
            if (og1.d != null)
            {
                view = (new StringBuilder()).append(og1.d).append(z[0]).toString();
            } else
            {
                view = z[1];
            }
            textview.setText(view);
            if (App.C(og1.a))
            {
                textview.setText(0x7f0e043b);
                viewgroup.setTextColor(0xff888888);
                view1.setLongClickable(true);
                view1.findViewById(0x7f0b0247).setVisibility(8);
                if (j == 0)
                {
                    break label3;
                }
            }
            if (og1.d != null)
            {
                view = (new StringBuilder()).append(og1.d).append(z[2]).toString();
            } else
            {
                view = z[3];
            }
            textview.setText(c.c(view, a.getBaseContext()));
            viewgroup.setTextColor(0xff000000);
            view1.setLongClickable(false);
            view1.findViewById(0x7f0b0247).setVisibility(0);
        }
        view = (CheckBox)view1.findViewById(0x7f0b0247);
        view.setOnClickListener(new as5(this));
        view.setChecked(og1.L);
        view.setTag(og1);
        view1.setOnClickListener(new abg(this));
        return view1;
    }

    static 
    {
        String as[];
        byte byte1;
        int i;
        as = new String[4];
        byte1 = -1;
        i = 0;
_L2:
        String as1[];
        Object obj;
        int j;
        int k;
        as1 = as;
        obj = "EH".toCharArray();
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
                i = 2;
                byte1 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                i = 3;
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
        char c1 = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 164
    //                   0 185
    //                   1 191
    //                   2 197
    //                   3 203;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_203;
_L3:
        byte byte0 = 100;
_L9:
        obj[j] = (char)(byte0 ^ c1);
        j++;
          goto _L8
_L4:
        byte0 = 101;
          goto _L9
_L5:
        byte0 = 104;
          goto _L9
_L6:
        byte0 = 112;
          goto _L9
        byte0 = 68;
          goto _L9
    }
}
