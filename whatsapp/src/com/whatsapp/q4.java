// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.Context;
import android.content.res.Resources;
import android.os.Messenger;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.util.c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

// Referenced classes of package com.whatsapp:
//            GroupChatInfo, App, og, k, 
//            iz, mk, a1g, ao9

class q4 extends ArrayAdapter
{

    private static final String z;
    public LayoutInflater a;
    final GroupChatInfo b;

    public q4(GroupChatInfo groupchatinfo, Context context, List list)
    {
        b = groupchatinfo;
        super(context, 0x7f03006c, list);
        a = LayoutInflater.from(context);
    }

    private void a(TextView textview, String s)
    {
        textview.setText(c.b(s, b.getBaseContext(), textview.getPaint()));
    }

    private boolean a(int i)
    {
        return App.az.d(((og)GroupChatInfo.f(b).get(i)).a);
    }

    public int getCount()
    {
        return GroupChatInfo.f(b).size();
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        View view1;
        int j;
label0:
        {
            j = App.am;
            view1 = view;
            if (view == null)
            {
                view1 = iz.a(a, 0x7f03006c, viewgroup, false);
                if (j != 0)
                {
                    view1 = view;
                }
            }
            if (i == getCount() - 1 && !mk.e(GroupChatInfo.g(b)))
            {
                view1.setBackgroundResource(0x7f0205de);
                view1.findViewById(0x7f0b00d7).setVisibility(8);
                if (j == 0)
                {
                    break label0;
                }
            }
            view1.setBackgroundResource(0x7f0205e0);
            view1.findViewById(0x7f0b00d7).setVisibility(0);
        }
label1:
        {
            TextView textview;
            ImageView imageview;
            TextView textview1;
label2:
            {
label3:
                {
                    view = (TextView)view1.findViewById(0x7f0b0135);
                    viewgroup = (TextView)view1.findViewById(0x7f0b00cf);
                    imageview = (ImageView)view1.findViewById(0x7f0b01ea);
                    textview1 = (TextView)view1.findViewById(0x7f0b01eb);
                    textview = (TextView)view1.findViewById(0x7f0b01ec);
                    view.setText(null);
                    view.setTextColor(b.getResources().getColor(0x7f09002b));
                    viewgroup.setText(null);
                    viewgroup.setTextColor(b.getResources().getColor(0x7f09002a));
                    a1g.a(viewgroup);
                    textview1.setVisibility(8);
                    textview.setVisibility(8);
                    if (!a(i))
                    {
                        break label2;
                    }
                    view1.setTag(null);
                    view.setText(b.getString(0x7f0e04b8));
                    if (!App.aF)
                    {
                        App.a((new StringBuilder()).append(App.k()).append(z).toString(), 0L, new Messenger(GroupChatInfo.j(b)));
                        if (j == 0)
                        {
                            break label3;
                        }
                    }
                    a(viewgroup, App.aJ);
                }
                if (mk.e(GroupChatInfo.g(b)))
                {
                    textview1.setVisibility(0);
                }
                GroupChatInfo.l(b).a(App.az.f(), imageview);
                if (j == 0)
                {
                    break label1;
                }
            }
            og og1 = (og)getItem(i);
            view1.setTag(og1);
            view.setText(og1.a(b));
            if (GroupChatInfo.r(b).containsKey(og1.a))
            {
                imageview.setImageResource(0x7f020543);
                view.setTextColor(b.getResources().getColor(0x7f09001d));
                viewgroup.setTextColor(b.getResources().getColor(0x7f09001d));
                viewgroup.setText(0x7f0e0439);
                if (j == 0)
                {
                    break label1;
                }
            }
            if (mk.b(GroupChatInfo.g(b), og1.a))
            {
                textview1.setVisibility(0);
            }
            GroupChatInfo.l(b).a(og1, imageview);
            if (og1.l())
            {
                textview.setVisibility(0);
                if (og1.N != null)
                {
                    view = (new StringBuilder()).append("~").append(og1.N).toString();
                } else
                {
                    view = null;
                }
                a(textview, view);
            }
            a(viewgroup, og1.d);
        }
        return view1;
    }

    static 
    {
        char ac[];
        int i;
        int j;
        ac = "Qdz`qpc'via9:rm".toCharArray();
        j = ac.length;
        i = 0;
_L7:
        char c1;
        if (j <= i)
        {
            z = (new String(ac)).intern();
            return;
        }
        c1 = ac[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 68
    //                   0 86
    //                   1 92
    //                   2 98
    //                   3 104;
           goto _L1 _L2 _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_104;
_L2:
        break; /* Loop/switch isn't completed */
_L1:
        byte byte0 = 25;
_L8:
        ac[i] = (char)(byte0 ^ c1);
        i++;
        if (true) goto _L7; else goto _L6
_L6:
        byte0 = 17;
          goto _L8
_L3:
        byte0 = 23;
          goto _L8
_L4:
        byte0 = 84;
          goto _L8
        byte0 = 23;
          goto _L8
    }
}
