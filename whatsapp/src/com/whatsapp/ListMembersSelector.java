// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.res.Resources;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;
import com.actionbarsherlock.app.ActionBar;
import com.whatsapp.fieldstats.o;
import com.whatsapp.protocol.c4;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Vector;

// Referenced classes of package com.whatsapp:
//            MultipleContactsSelector, ConversationRow, App, VerifyNumber, 
//            au2, u5, og, mk, 
//            aoz, Conversation, ft

public class ListMembersSelector extends MultipleContactsSelector
{

    private static final String z[];

    public ListMembersSelector()
    {
    }

    protected void a(ListView listview)
    {
        TextView textview = new TextView(this);
        textview.setTextSize(ConversationRow.b(getResources()));
        textview.setPadding(0, getResources().getDimensionPixelSize(0x7f0a0032), 0, getResources().getDimensionPixelSize(0x7f0a0032));
        textview.setText(getString(0x7f0e0065, new Object[] {
            (new StringBuilder()).append("\u202A").append(VerifyNumber.a(App.Z.cc, App.Z.jabber_id.substring(App.Z.cc.length()))).append("\u202C").toString()
        }));
        listview.addFooterView(textview);
    }

    protected String b()
    {
        return getString(0x7f0e0220).toUpperCase();
    }

    protected String c()
    {
        return getString(0x7f0e02a1);
    }

    protected int d()
    {
        return 2;
    }

    protected int e()
    {
        return 0x7f0e0062;
    }

    protected int f()
    {
        return 0x7f0e0107;
    }

    protected int h()
    {
        if (au2.i == 0)
        {
            return -1;
        } else
        {
            return au2.i;
        }
    }

    protected void i()
    {
        super.i();
    }

    protected void j()
    {
        int k = App.am;
        String s = u5.e();
        Object obj = new Vector(j.size());
        Object obj1 = j.iterator();
        do
        {
            if (!((Iterator) (obj1)).hasNext())
            {
                break;
            }
            ((Vector) (obj)).add(((og)((Iterator) (obj1)).next()).a);
        } while (k == 0);
        mk.a(s, ((Vector) (obj)));
        obj1 = new c4(s, "", null);
        obj1.I = App.U();
        obj1.M = 6;
        obj1.t = 9L;
        obj1.B = obj;
        obj1.G = (new StringBuilder()).append(App.k()).append(z[2]).toString();
        App.ah.g(((c4) (obj1)));
        obj = new HashSet();
        obj1 = j.iterator();
        do
        {
            if (!((Iterator) (obj1)).hasNext())
            {
                break;
            }
            ((HashSet) (obj)).add(((og)((Iterator) (obj1)).next()).a);
        } while (k == 0);
        App.y(s);
        startActivity(Conversation.a(u5.a(s, "", System.currentTimeMillis())));
        finish();
    }

    public void onCreate(Bundle bundle)
    {
        Log.i(z[0]);
        super.onCreate(bundle);
        ft.a(o.NEW_BROADCAST_LIST);
        bundle = getSupportActionBar();
        bundle.setDisplayHomeAsUpEnabled(true);
        bundle.setTitle(0x7f0e02a1);
    }

    public void onDestroy()
    {
        Log.i(z[1]);
        super.onDestroy();
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int k;
        as = new String[3];
        obj = "D|Z7JMxK&U[fL/BKaF1\bKgL\"SM";
        byte1 = -1;
        k = 0;
_L2:
        String as1[];
        int l;
        int i1;
        as1 = as;
        obj = ((String) (obj)).toCharArray();
        i1 = obj.length;
        l = 0;
_L8:
label0:
        {
            if (i1 > l)
            {
                break label0;
            }
            obj = (new String(((char []) (obj)))).intern();
            switch (byte1)
            {
            default:
                as1[k] = ((String) (obj));
                obj = "D|Z7JMxK&U[fL/BKaF1\bLpZ7UGl";
                k = 1;
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[k] = ((String) (obj));
                k = 2;
                obj = "hf\0074OIaZ\"WX;G&S";
                byte1 = 1;
                break;

            case 1: // '\001'
                as1[k] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c1 = obj[l];
        l % 5;
        JVM INSTR tableswitch 0 3: default 156
    //                   0 177
    //                   1 183
    //                   2 189
    //                   3 195;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_195;
_L3:
        byte byte0 = 39;
_L9:
        obj[l] = (char)(byte0 ^ c1);
        l++;
          goto _L8
_L4:
        byte0 = 40;
          goto _L9
_L5:
        byte0 = 21;
          goto _L9
_L6:
        byte0 = 41;
          goto _L9
        byte0 = 67;
          goto _L9
    }
}
