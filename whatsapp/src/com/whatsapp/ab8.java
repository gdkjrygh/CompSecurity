// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Filter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.whatsapp.util.Log;
import com.whatsapp.util.c;
import java.util.ArrayList;
import java.util.HashMap;

// Referenced classes of package com.whatsapp:
//            wz, ContactPicker, og, App, 
//            iz, ao9, a1g, mk

class ab8 extends ArrayAdapter
{

    private static final String z[];
    private Filter a;
    protected ArrayList b;
    private LayoutInflater c;
    final ContactPicker d;

    public ab8(ContactPicker contactpicker, Context context, ArrayList arraylist)
    {
        d = contactpicker;
        super(context, 0x7f030039, arraylist);
        a = new wz(this, null);
        b = arraylist;
        c = LayoutInflater.from(context);
    }

    private boolean a(int i)
    {
        if (i >= b.size() || i < 0)
        {
            Log.e((new StringBuilder()).append(z[0]).append(i).toString());
        } else
        if (ContactPicker.n() == b.get(i))
        {
            return true;
        }
        return false;
    }

    static boolean a(ab8 ab8_1, int i)
    {
        return ab8_1.a(i);
    }

    static boolean b(ab8 ab8_1, int i)
    {
        return ab8_1.d(i);
    }

    private boolean c(int i)
    {
        boolean flag = true;
        if (i >= b.size() || i < 0)
        {
            Log.e((new StringBuilder()).append(z[1]).append(i).toString());
            flag = false;
        } else
        if (ContactPicker.k() != b.get(i))
        {
            return false;
        }
        return flag;
    }

    static boolean c(ab8 ab8_1, int i)
    {
        return ab8_1.c(i);
    }

    private boolean d(int i)
    {
        if (i >= b.size() || i < 0)
        {
            Log.e((new StringBuilder()).append(z[2]).append(i).toString());
        } else
        if (ContactPicker.g() == b.get(i))
        {
            return true;
        }
        return false;
    }

    public og b(int i)
    {
        return (og)b.get(i);
    }

    public int getCount()
    {
        return b.size();
    }

    public Filter getFilter()
    {
        return a;
    }

    public Object getItem(int i)
    {
        return b(i);
    }

    public long getItemId(int i)
    {
        return (long)(i * 1024);
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        Object obj;
        og og1;
        int j;
        boolean flag;
        boolean flag1;
        boolean flag2;
        j = App.am;
        og1 = b(i);
        if (com.whatsapp.ContactPicker.c(og1))
        {
            view = new LinearLayout(getContext());
            iz.a(c, 0x7f03008a, view, true);
            view.setTag(Integer.valueOf(3));
            view.findViewById(0x7f0b024a).setClickable(true);
            return view;
        }
        flag = c(i);
        flag1 = d(i);
        flag2 = a(i);
        obj = view;
        if (view != null) goto _L2; else goto _L1
_L1:
        if (!flag && !flag2) goto _L4; else goto _L3
_L3:
        obj = iz.a(c, 0x7f03003a, null);
        if (!flag) goto _L6; else goto _L5
_L5:
        ((View) (obj)).setTag(Integer.valueOf(2));
        view = ((View) (obj));
        if (j == 0) goto _L7; else goto _L6
_L6:
        ((View) (obj)).findViewById(0x7f0b0140).setVisibility(8);
        ((TextView)((View) (obj)).findViewById(0x7f0b0142)).setText(0x7f0e00da);
        ((ImageView)((View) (obj)).findViewById(0x7f0b0141)).setImageResource(0x7f020532);
        ((View) (obj)).setTag(Integer.valueOf(4));
        view = ((View) (obj));
        if (j == 0) goto _L7; else goto _L4
_L4:
        if (!flag1) goto _L9; else goto _L8
_L8:
label0:
        {
            view = iz.a(c, 0x7f030038, null);
            obj = new android.widget.AbsListView.LayoutParams(-2, (int)d.getResources().getDimension(0x7f0a0037));
            view.findViewById(0x7f0b0139).setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
            view.findViewById(0x7f0b013b).setClickable(true);
            if (b == ContactPicker.l(d))
            {
                ((TextView)(TextView)view.findViewById(0x7f0b013b)).setText(0x7f0e00d3);
                if (j == 0)
                {
                    break label0;
                }
            }
            if (b == ContactPicker.t(d))
            {
                ((TextView)(TextView)view.findViewById(0x7f0b013b)).setText(0x7f0e00d4);
                if (j == 0)
                {
                    break label0;
                }
            }
            ((TextView)(TextView)view.findViewById(0x7f0b013b)).setText(0x7f0e00d5);
        }
        view.setTag(Integer.valueOf(5));
        if (j == 0) goto _L7; else goto _L9
_L9:
        view = iz.a(c, 0x7f030039, viewgroup, false);
        view.setTag(Integer.valueOf(1));
        obj = view;
        if (j == 0) goto _L11; else goto _L10
_L10:
        obj = view;
_L2:
        i = ((Integer)((View) (obj)).getTag()).intValue();
        if (!flag) goto _L13; else goto _L12
_L12:
        if (i == 2) goto _L11; else goto _L14
_L14:
        obj = iz.a(c, 0x7f03003a, null);
        ((View) (obj)).setTag(Integer.valueOf(2));
        view = ((View) (obj));
        if (j == 0) goto _L7; else goto _L15
_L15:
        view = ((View) (obj));
_L31:
        obj = view;
        if (!flag2) goto _L17; else goto _L16
_L16:
        if (i == 4) goto _L7; else goto _L18
_L18:
        obj = iz.a(c, 0x7f03003a, null);
        ((ImageView)((View) (obj)).findViewById(0x7f0b0141)).setImageResource(0x7f020532);
        ((View) (obj)).findViewById(0x7f0b0140).setVisibility(8);
        ((TextView)((View) (obj)).findViewById(0x7f0b0142)).setText(0x7f0e00da);
        ((View) (obj)).setTag(Integer.valueOf(4));
        view = ((View) (obj));
        if (j == 0) goto _L7; else goto _L17
_L17:
        if (!flag1) goto _L20; else goto _L19
_L19:
        if (i != 5)
        {
            obj = iz.a(c, 0x7f030038, null);
            view = new android.widget.AbsListView.LayoutParams(-2, (int)d.getResources().getDimension(0x7f0a0037));
            ((View) (obj)).findViewById(0x7f0b0139).setLayoutParams(view);
            ((View) (obj)).findViewById(0x7f0b013b).setClickable(true);
            ((View) (obj)).setTag(Integer.valueOf(5));
        }
        if (b != ContactPicker.l(d)) goto _L22; else goto _L21
_L21:
        ((TextView)(TextView)((View) (obj)).findViewById(0x7f0b013b)).setText(0x7f0e00d3);
        view = ((View) (obj));
        if (j == 0) goto _L7; else goto _L22
_L22:
        if (b != ContactPicker.t(d)) goto _L24; else goto _L23
_L23:
        ((TextView)(TextView)((View) (obj)).findViewById(0x7f0b013b)).setText(0x7f0e00d4);
        view = ((View) (obj));
        if (j == 0) goto _L7; else goto _L24
_L24:
        ((TextView)(TextView)((View) (obj)).findViewById(0x7f0b013b)).setText(0x7f0e00d5);
        view = ((View) (obj));
        if (j == 0) goto _L7; else goto _L25
_L25:
        view = ((View) (obj));
_L28:
        if (i != 1)
        {
            view = iz.a(c, 0x7f030039, viewgroup, false);
            view.setTag(Integer.valueOf(1));
        }
_L7:
        Object obj1 = view;
_L29:
        if (!flag && !flag2 && !flag1) goto _L27; else goto _L26
_L26:
        return ((View) (obj1));
_L27:
        String s;
        TextView textview;
        TextView textview1;
        TextView textview2;
label1:
        {
            view = (ImageView)((View) (obj1)).findViewById(0x7f0b00b4);
            ContactPicker.p(d).a(og1, view);
            textview1 = (TextView)((View) (obj1)).findViewById(0x7f0b013d);
            a1g.b(textview1);
            textview2 = (TextView)((View) (obj1)).findViewById(0x7f0b013f);
            a1g.a(textview2);
            textview = (TextView)((View) (obj1)).findViewById(0x7f0b013e);
            s = og1.a(d);
            viewgroup = null;
            if (og1.k() || og1.d())
            {
                viewgroup = com.whatsapp.util.c.d(s, d);
            }
            view = viewgroup;
            if (TextUtils.isEmpty(ContactPicker.q(d)))
            {
                break label1;
            }
            obj = viewgroup;
            if (s.toLowerCase().startsWith(ContactPicker.q(d).toLowerCase()))
            {
                obj = viewgroup;
                if (viewgroup == null)
                {
                    obj = new SpannableStringBuilder(s);
                }
                ((SpannableStringBuilder) (obj)).setSpan(new ForegroundColorSpan(d.getResources().getColor(0x7f090032)), 0, ContactPicker.q(d).length(), 33);
                view = ((View) (obj));
                if (j == 0)
                {
                    break label1;
                }
            }
            i = s.toLowerCase().indexOf((new StringBuilder()).append(" ").append(ContactPicker.q(d).toLowerCase()).toString());
            view = ((View) (obj));
            if (i > 0)
            {
                view = ((View) (obj));
                if (obj == null)
                {
                    view = new SpannableStringBuilder(s);
                }
                view.setSpan(new ForegroundColorSpan(d.getResources().getColor(0x7f090032)), i + 1, i + 1 + ContactPicker.q(d).length(), 33);
            }
        }
label2:
        {
label3:
            {
                viewgroup = view;
                if (view == null)
                {
                    viewgroup = s;
                }
                textview1.setText(viewgroup);
                if (og1.k() || og1.d())
                {
                    textview2.setText(mk.b(og1.a));
                    textview.setText("");
                    textview1.setTextColor(0xff000000);
                    ((View) (obj1)).setLongClickable(false);
                    if (j == 0)
                    {
                        break label2;
                    }
                }
                if (App.C(og1.a))
                {
                    textview2.setText(0x7f0e043b);
                    textview1.setTextColor(0xff888888);
                    ((View) (obj1)).setLongClickable(true);
                    if (j == 0)
                    {
                        break label3;
                    }
                }
                if (og1.d != null)
                {
                    view = (new StringBuilder()).append(og1.d).append(z[4]).toString();
                } else
                {
                    view = z[3];
                }
                textview2.setText(com.whatsapp.util.c.c(view, d.getBaseContext()));
                textview1.setTextColor(0xff000000);
                ((View) (obj1)).setLongClickable(false);
            }
            view = og1.a(d.getResources());
            if (view != null)
            {
                textview.setText(view);
            }
        }
        if (ContactPicker.r(d) != null && ContactPicker.r(d).containsKey(og1.a))
        {
            ((View) (obj1)).setBackgroundResource(0x7f02013c);
            if (j == 0)
            {
                continue; /* Loop/switch isn't completed */
            }
        }
        ((View) (obj1)).setBackgroundResource(0);
        if (true) goto _L26; else goto _L20
_L20:
        view = ((View) (obj));
          goto _L28
_L11:
        obj1 = obj;
          goto _L29
_L13:
        view = ((View) (obj));
        if (true) goto _L31; else goto _L30
_L30:
    }

    public boolean hasStableIds()
    {
        return true;
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[5];
        obj = "jUrW\001jNlJ\003b_n\f\tzRyO\020{Uk\f\002h^CS\017zShJ\017g\032";
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
                obj = "jUrW\001jNlJ\003b_n\f\tzNyO\fh\\nJ\005g^nL\027&X}G?yUoJ\024`Ur\003";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "jUrW\001jNlJ\003b_n\f\016fe\177L\016}[\177W\023&X}G?yUoJ\024`Ur\003";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = ")\032";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                i = 4;
                obj = ")\032";
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
        char c1 = obj[j];
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
        byte byte1 = 96;
_L9:
        obj[j] = (char)(byte1 ^ c1);
        j++;
          goto _L8
_L4:
        byte1 = 9;
          goto _L9
_L5:
        byte1 = 58;
          goto _L9
_L6:
        byte1 = 28;
          goto _L9
        byte1 = 35;
          goto _L9
    }
}
