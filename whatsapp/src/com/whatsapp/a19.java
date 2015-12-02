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
//            i6, ContactsFragment, og, App, 
//            iz, ao9, at3, a1g, 
//            mk, at1

class a19 extends ArrayAdapter
{

    private static final String z[];
    private LayoutInflater a;
    private Filter b;
    final ContactsFragment c;
    protected ArrayList d;

    public a19(ContactsFragment contactsfragment, Context context, ArrayList arraylist)
    {
        c = contactsfragment;
        super(context, 0x7f030039, arraylist);
        b = new i6(this, null);
        d = arraylist;
        a = LayoutInflater.from(context);
    }

    static boolean a(a19 a19_1, int i)
    {
        return a19_1.c(i);
    }

    private boolean b(int i)
    {
        if (i >= d.size() || i < 0)
        {
            Log.e((new StringBuilder()).append(z[2]).append(i).toString());
        } else
        if (ContactsFragment.a() == d.get(i))
        {
            return true;
        }
        return false;
    }

    static boolean b(a19 a19_1, int i)
    {
        return a19_1.d(i);
    }

    private boolean c(int i)
    {
        boolean flag = true;
        if (i >= d.size() || i < 0)
        {
            Log.e((new StringBuilder()).append(z[1]).append(i).toString());
            flag = false;
        } else
        if (ContactsFragment.e() != d.get(i))
        {
            return false;
        }
        return flag;
    }

    static boolean c(a19 a19_1, int i)
    {
        return a19_1.b(i);
    }

    private boolean d(int i)
    {
        if (i >= d.size() || i < 0)
        {
            Log.e((new StringBuilder()).append(z[0]).append(i).toString());
        } else
        if (com.whatsapp.ContactsFragment.c() == d.get(i))
        {
            return true;
        }
        return false;
    }

    public og a(int i)
    {
        return (og)d.get(i);
    }

    public int getCount()
    {
        return d.size();
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
        og1 = a(i);
        if (ContactsFragment.b(og1))
        {
            view = new LinearLayout(getContext());
            iz.a(a, 0x7f03008a, view, true);
            view.setTag(Integer.valueOf(3));
            view.findViewById(0x7f0b024a).setClickable(true);
            return view;
        }
        flag = c(i);
        flag1 = d(i);
        flag2 = b(i);
        obj = view;
        if (view != null) goto _L2; else goto _L1
_L1:
        if (!flag && !flag2) goto _L4; else goto _L3
_L3:
        obj = iz.a(a, 0x7f03003a, null);
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
        view = iz.a(a, 0x7f030038, null);
        obj = new android.widget.AbsListView.LayoutParams(-2, (int)c.getResources().getDimension(0x7f0a0037));
        view.findViewById(0x7f0b0139).setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
        view.findViewById(0x7f0b013b).setClickable(true);
        ((TextView)(TextView)view.findViewById(0x7f0b013b)).setText(0x7f0e00d3);
        view.setTag(Integer.valueOf(5));
        if (j == 0) goto _L7; else goto _L9
_L9:
        obj = iz.a(a, 0x7f030039, viewgroup, false);
        ((View) (obj)).setTag(Integer.valueOf(1));
        view = ((View) (obj));
        if (j == 0) goto _L7; else goto _L2
_L2:
        i = ((Integer)((View) (obj)).getTag()).intValue();
        view = ((View) (obj));
        if (!flag) goto _L11; else goto _L10
_L10:
        view = ((View) (obj));
        if (i == 2) goto _L7; else goto _L12
_L12:
        obj = iz.a(a, 0x7f03003a, null);
        ((View) (obj)).setTag(Integer.valueOf(2));
        view = ((View) (obj));
        if (j == 0) goto _L7; else goto _L13
_L13:
        view = ((View) (obj));
_L11:
        obj = view;
        if (!flag2) goto _L15; else goto _L14
_L14:
        if (i == 4) goto _L7; else goto _L16
_L16:
        obj = iz.a(a, 0x7f03003a, null);
        ((ImageView)((View) (obj)).findViewById(0x7f0b0141)).setImageResource(0x7f020532);
        ((View) (obj)).findViewById(0x7f0b0140).setVisibility(8);
        ((TextView)((View) (obj)).findViewById(0x7f0b0142)).setText(0x7f0e00da);
        ((View) (obj)).setTag(Integer.valueOf(4));
        view = ((View) (obj));
        if (j == 0) goto _L7; else goto _L15
_L15:
        view = ((View) (obj));
        if (!flag1) goto _L18; else goto _L17
_L17:
        if (i != 5)
        {
            view = iz.a(a, 0x7f030038, null);
            android.widget.AbsListView.LayoutParams layoutparams = new android.widget.AbsListView.LayoutParams(-2, (int)c.getResources().getDimension(0x7f0a0037));
            view.findViewById(0x7f0b0139).setLayoutParams(layoutparams);
            view.findViewById(0x7f0b013b).setClickable(true);
            view.setTag(Integer.valueOf(5));
        }
        ((TextView)(TextView)view.findViewById(0x7f0b013b)).setText(0x7f0e00d3);
        if (j == 0) goto _L19; else goto _L18
_L18:
        if (i != 1)
        {
            view = iz.a(a, 0x7f030039, viewgroup, false);
            view.setTag(Integer.valueOf(1));
        }
_L7:
        View view1 = view;
_L23:
        if (!flag && !flag2 && !flag1) goto _L21; else goto _L20
_L20:
        return view1;
_L21:
        TextView textview;
        TextView textview1;
        TextView textview2;
label0:
        {
            String s;
label1:
            {
                view = (ImageView)view1.findViewById(0x7f0b00b4);
                view.setEnabled(true);
                ContactsFragment.a(c).a(og1, view);
                viewgroup = view1.findViewById(0x7f0b00dc);
                Object obj1 = new at3(og1.a, getContext());
                viewgroup.setOnClickListener(((android.view.View.OnClickListener) (obj1)));
                view.setOnClickListener(((android.view.View.OnClickListener) (obj1)));
                textview1 = (TextView)view1.findViewById(0x7f0b013d);
                a1g.b(textview1);
                textview2 = (TextView)view1.findViewById(0x7f0b013f);
                a1g.a(textview2);
                textview = (TextView)view1.findViewById(0x7f0b013e);
                if (!og1.k())
                {
                    break label0;
                }
                s = og1.a(getContext());
                obj1 = com.whatsapp.util.c.d(s, c.getActivity());
                view = ((View) (obj1));
                if (TextUtils.isEmpty(ContactsFragment.d(c)))
                {
                    break label1;
                }
                viewgroup = ((ViewGroup) (obj1));
                if (s.toLowerCase().startsWith(ContactsFragment.d(c).toString().toLowerCase()))
                {
                    viewgroup = ((ViewGroup) (obj1));
                    if (obj1 == null)
                    {
                        viewgroup = new SpannableStringBuilder(s);
                    }
                    viewgroup.setSpan(new ForegroundColorSpan(c.getResources().getColor(0x7f090032)), 0, ContactsFragment.d(c).length(), 33);
                    view = viewgroup;
                    if (j == 0)
                    {
                        break label1;
                    }
                }
                i = s.toLowerCase().indexOf((new StringBuilder()).append(" ").append(ContactsFragment.d(c).toString().toLowerCase()).toString());
                view = viewgroup;
                if (i > 0)
                {
                    view = viewgroup;
                    if (viewgroup == null)
                    {
                        view = new SpannableStringBuilder(s);
                    }
                    view.setSpan(new ForegroundColorSpan(c.getResources().getColor(0x7f090032)), i + 1, i + 1 + ContactsFragment.d(c).length(), 33);
                }
            }
            viewgroup = view;
            if (view == null)
            {
                viewgroup = s;
            }
            textview1.setText(viewgroup);
            textview2.setText(mk.b(og1.a));
            textview.setText("");
            textview1.setTextColor(0xff000000);
            view1.setLongClickable(false);
            if (j == 0)
            {
                break MISSING_BLOCK_LABEL_1324;
            }
        }
label2:
        {
            viewgroup = og1.a(getContext());
            Object obj2 = null;
            view = obj2;
            if (!TextUtils.isEmpty(ContactsFragment.d(c)))
            {
                if (viewgroup.toLowerCase().startsWith(ContactsFragment.d(c).toString().toLowerCase()))
                {
                    view = new SpannableStringBuilder(viewgroup);
                    view.setSpan(new ForegroundColorSpan(c.getResources().getColor(0x7f090032)), 0, ContactsFragment.d(c).length(), 33);
                } else
                {
                    i = viewgroup.toLowerCase().indexOf((new StringBuilder()).append(" ").append(ContactsFragment.d(c).toString().toLowerCase()).toString());
                    view = obj2;
                    if (i > 0)
                    {
                        view = new SpannableStringBuilder(viewgroup);
                        view.setSpan(new ForegroundColorSpan(c.getResources().getColor(0x7f090032)), i + 1, i + 1 + ContactsFragment.d(c).length(), 33);
                    }
                }
            }
            if (view == null)
            {
                view = viewgroup;
            }
            textview1.setText(view);
            if (App.C(og1.a))
            {
                textview2.setText(0x7f0e043b);
                textview1.setTextColor(0xff888888);
                view1.setLongClickable(true);
                if (j == 0)
                {
                    break label2;
                }
            }
            view1.setLongClickable(false);
            viewgroup = view1.findViewById(0x7f0b013c);
            if (og1.t)
            {
                textview1.setTextColor(0xff000000);
                if (og1.d != null)
                {
                    view = og1.d;
                } else
                {
                    view = "";
                }
                textview2.setText(com.whatsapp.util.c.c(view, c.getActivity()));
                viewgroup.setVisibility(8);
                textview.setVisibility(0);
                if (j == 0)
                {
                    break label2;
                }
            }
            textview1.setTextColor(0xff2f4444);
            viewgroup.setVisibility(0);
            textview.setVisibility(8);
            textview2.setText(og1.a());
            viewgroup.setOnClickListener(new at1(this, og1));
        }
        view = og1.a(c.getResources());
        if (view != null)
        {
            textview.setText(view);
        }
        if (com.whatsapp.ContactsFragment.c(c) != null && com.whatsapp.ContactsFragment.c(c).containsKey(og1.a))
        {
            view1.setBackgroundResource(0x7f02013c);
            if (j == 0)
            {
                continue; /* Loop/switch isn't completed */
            }
        }
        view1.setBackgroundResource(0);
        if (true) goto _L20; else goto _L19
_L19:
        view1 = view;
        if (true) goto _L23; else goto _L22
_L22:
    }

    public boolean hasStableIds()
    {
        return true;
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[3];
        obj = "\016M\017g\r\016V\021z\017\006G\023<\002\002}\002|\002\031C\002g\037B@\000w3\035M\022z\030\004M\0173";
        byte1 = -1;
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
            switch (byte1)
            {
            default:
                as1[i] = ((String) (obj));
                obj = "\016M\017g\r\016V\021z\017\006G\023<\005\036V\004\177\000\fD\023z\t\003F\023|\033B@\000w3\035M\022z\030\004M\0173";
                i = 1;
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                i = 2;
                obj = "\016M\017g\r\016V\021z\017\006G\023<\005\036J\004\177\034\037M\026<\016\fF>c\003\036K\025z\003\003\002";
                byte1 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c1 = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 156
    //                   0 177
    //                   1 183
    //                   2 189
    //                   3 195;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_195;
_L3:
        byte byte0 = 108;
_L9:
        obj[j] = (char)(byte0 ^ c1);
        j++;
          goto _L8
_L4:
        byte0 = 109;
          goto _L9
_L5:
        byte0 = 34;
          goto _L9
_L6:
        byte0 = 97;
          goto _L9
        byte0 = 19;
          goto _L9
    }
}
