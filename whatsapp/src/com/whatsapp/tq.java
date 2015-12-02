// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.whatsapp.util.Log;
import java.util.List;

// Referenced classes of package com.whatsapp:
//            App, iz, adj, a1g

final class tq extends ArrayAdapter
{

    private static final String z[];
    private final String a;
    private final String b;

    public tq(Context context, int i, List list, String s, String s1)
    {
        super(context, i, list);
        a = s;
        b = s1;
    }

    public int getCount()
    {
        return Math.max(1, super.getCount());
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        int j = App.am;
        if (super.getCount() != 0) goto _L2; else goto _L1
_L1:
label0:
        {
            if (view != null)
            {
                viewgroup = view;
                if (view == null)
                {
                    break label0;
                }
                viewgroup = view;
                if (view.findViewById(0x7f0b013b) != null)
                {
                    break label0;
                }
            }
            view = getContext();
            String s = z[4];
            viewgroup = new LinearLayout(view);
            iz.a((LayoutInflater)view.getSystemService(s), 0x7f03008a, viewgroup, true);
            viewgroup.findViewById(0x7f0b024a).setClickable(true);
        }
_L4:
        return viewgroup;
_L2:
        adj adj1;
        adj1 = (adj)getItem(i);
        if (view == null || view != null && view.findViewById(0x7f0b01a9) == null)
        {
            Context context = getContext();
            String s1 = z[3];
            viewgroup = new LinearLayout(context);
            iz.a((LayoutInflater)context.getSystemService(s1), 0x7f03005a, viewgroup, true);
            if (j == 0)
            {
                break MISSING_BLOCK_LABEL_414;
            }
        }
        view = (LinearLayout)view;
_L5:
        TextView textview;
        ImageView imageview;
label1:
        {
            if (view == null)
            {
                Log.w(z[0]);
            }
            textview = (TextView)view.findViewById(0x7f0b01a9);
            if (textview == null)
            {
                Log.w(z[1]);
            }
            textview.setText(adj1.c);
            viewgroup = (TextView)view.findViewById(0x7f0b01aa);
            if (!TextUtils.equals(adj1.c, adj1.b))
            {
                viewgroup.setText(adj1.b);
                viewgroup.setVisibility(0);
                if (j == 0)
                {
                    break label1;
                }
            }
            viewgroup.setVisibility(8);
            viewgroup.setText(null);
        }
        a1g.b(textview);
        viewgroup = (TextView)view.findViewById(0x7f0b01ab);
        if (viewgroup == null)
        {
            Log.w(z[2]);
        }
        viewgroup.setText((new StringBuilder()).append("+").append(adj1.a).toString());
        imageview = (ImageView)view.findViewById(0x7f0b01ac);
        if (!TextUtils.equals(adj1.d, a) && !TextUtils.equals(adj1.c, b))
        {
            break; /* Loop/switch isn't completed */
        }
        textview.setTextColor(getContext().getResources().getColor(0x7f09002c));
        imageview.setBackgroundDrawable(getContext().getResources().getDrawable(0x7f02013f));
        viewgroup = view;
        if (j == 0) goto _L4; else goto _L3
_L3:
        textview.setTextColor(0xff000000);
        imageview.setBackgroundDrawable(null);
        return view;
        view = viewgroup;
          goto _L5
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[5];
        obj = "4\017tN\025kK*_\0031I?T\025kQ~D\t>K+A\026?";
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
                obj = "4\017tN\025kK*_\0031Q;U\016hL;ZZwV~C\017rI\177";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "4\017tN\025kK*_\003}J:HUj@&Y\fw@)\r\023m\0050X\026r\004";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "rD'B\017jz7C\034rD*H\b";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                i = 4;
                obj = "rD'B\017jz7C\034rD*H\b";
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
        byte byte1 = 122;
_L9:
        obj[j] = (char)(byte1 ^ c);
        j++;
          goto _L8
_L4:
        byte1 = 30;
          goto _L9
_L5:
        byte1 = 37;
          goto _L9
_L6:
        byte1 = 94;
          goto _L9
        byte1 = 45;
          goto _L9
    }
}
