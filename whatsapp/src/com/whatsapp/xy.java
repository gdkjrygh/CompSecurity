// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import com.whatsapp.protocol.c4;
import com.whatsapp.util.Log;
import com.whatsapp.util.x;
import java.util.ArrayList;
import java.util.Vector;

// Referenced classes of package com.whatsapp:
//            App, vl, ConversationsFragment, u5, 
//            aoz, mk, s_, og, 
//            da, Broadcasts, Conversation

class xy
    implements android.widget.AdapterView.OnItemClickListener
{

    private static final String z[];
    final ConversationsFragment a;

    xy(ConversationsFragment conversationsfragment)
    {
        a = conversationsfragment;
        super();
    }

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        Object obj;
        int j;
        j = App.am;
        obj = (vl)view.getTag();
        if (obj != null) goto _L2; else goto _L1
_L1:
        Log.i((new StringBuilder()).append(z[4]).append(i).toString());
_L4:
        return;
_L2:
        view = ((vl) (obj)).j;
        Log.i((new StringBuilder()).append(z[6]).append(view).append(z[0]).append(i).toString());
        adapterview = (String)ConversationsFragment.a(a).get(i);
        if (!view.equals(adapterview))
        {
            Log.w((new StringBuilder()).append(z[2]).append(view).append(z[5]).append(adapterview).toString());
        }
        view = u5.d(adapterview);
        if (((vl) (obj)).o.getVisibility() == 0) goto _L4; else goto _L3
_L3:
        if (!adapterview.contains(z[1]) && !adapterview.contains(z[7]))
        {
            break; /* Loop/switch isn't completed */
        }
        obj = App.ah.t(adapterview);
        if (obj != null && (int)((c4) (obj)).t != -2) goto _L4; else goto _L5
_L5:
        if (App.i())
        {
            mk.f();
            x.a(new s_(this));
            if (j == 0)
            {
                break; /* Loop/switch isn't completed */
            }
        }
        App.b(a.getActivity(), 0x7f0e0289, 0);
        if (j != 0) goto _L4; else goto _L6
_L6:
        if (j == 0) goto _L4; else goto _L7
_L7:
        if (!og.c(adapterview))
        {
            break; /* Loop/switch isn't completed */
        }
        if (!App.i())
        {
            break; /* Loop/switch isn't completed */
        }
        obj = App.ah.t(adapterview);
        if (obj == null) goto _L4; else goto _L8
_L8:
        App.ah.g(mk.a(adapterview, ((c4) (obj)).e(), (Vector)((c4) (obj)).B, 2));
        x.a(new da(this, adapterview, ((c4) (obj))));
        if (j == 0) goto _L4; else goto _L9
_L9:
        App.b(a.getActivity(), 0x7f0e0289, 0);
        if (j == 0) goto _L4; else goto _L10
_L10:
        if (!z[3].equals(adapterview))
        {
            break; /* Loop/switch isn't completed */
        }
        a.startActivity(new Intent(a.getActivity(), com/whatsapp/Broadcasts));
        if (j == 0) goto _L4; else goto _L11
_L11:
        if (view.p()) goto _L4; else goto _L12
_L12:
        a.startActivity(Conversation.a(view));
        return;
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[8];
        obj = "ns_\0371";
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
                obj = ")q_\031|\021m_\030e-fp\030i#s";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "-l^\032i<pQ\030e!mCCo\"jS\007# lDL\177/nULf'g\021Lz'fGQ";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = ",q_\rh-bC\030";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                obj = "-l^\032i<pQ\030e!mCCo\"jS\007# v\\\000#>lCL";
                i = 4;
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                i = 5;
                obj = "b#\\\005\177:>";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i] = ((String) (obj));
                i = 6;
                obj = "-l^\032i<pQ\030e!mCCo\"jS\007#$jTL";
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[i] = ((String) (obj));
                i = 7;
                obj = "\tq_\031|-kQ\030,\000lD\005o+\"p\030i#s";
                byte0 = 6;
                break;

            case 6: // '\006'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 256
    //                   0 279
    //                   1 286
    //                   2 292
    //                   3 299;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_299;
_L3:
        byte byte1 = 12;
_L9:
        obj[j] = (char)(byte1 ^ c);
        j++;
          goto _L8
_L4:
        byte1 = 78;
          goto _L9
_L5:
        byte1 = 3;
          goto _L9
_L6:
        byte1 = 48;
          goto _L9
        byte1 = 108;
          goto _L9
    }
}
