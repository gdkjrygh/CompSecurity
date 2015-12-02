// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.util;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import java.util.Set;

// Referenced classes of package com.whatsapp.util:
//            Log, a5, ae, bx

class bt
    implements Runnable
{

    private static final String z[];
    final bx a;
    final String b;
    final View c[];

    bt(bx bx, View aview[], String s)
    {
        a = bx;
        c = aview;
        b = s;
        super();
    }

    private boolean a(View view, String s)
    {
        do
        {
            if (view == null)
            {
                return false;
            }
            view = view.getParent();
            if (view == null)
            {
                return false;
            }
            if (view.getClass().toString().contains(s))
            {
                return true;
            }
            if (!(view instanceof View))
            {
                return false;
            }
            view = (View)view;
        } while (true);
    }

    public void run()
    {
        TextView textview;
        View view;
label0:
        {
            view = c[0];
            if (view instanceof TextView)
            {
                textview = (TextView)view;
                Log.i((new StringBuilder()).append(z[6]).append(textview.getText()).toString());
                view = view.getRootView();
                if (!b.equalsIgnoreCase(z[3]) || a(textview, z[4]) || a(textview, z[0]) || a5.d().contains(view))
                {
                    break label0;
                }
                Log.i((new StringBuilder()).append(z[1]).append(textview.getText()).toString());
                a5.k = true;
            }
            return;
        }
label1:
        {
            String s = textview.getText().toString();
            if (TextUtils.isEmpty(s))
            {
                Log.i((new StringBuilder()).append(z[5]).append(s).toString());
                if (!Log.f)
                {
                    break label1;
                }
            }
            Log.i((new StringBuilder()).append(z[2]).append(s).toString());
            a5.k = false;
        }
        a5.d().add(view);
        textview.getViewTreeObserver().addOnGlobalLayoutListener(new ae(this, view, textview));
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[7];
        obj = "o>\031b\b@\037\fy$A3\031n\037Z\013\004n\020";
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
                obj = "Z/\030e\004O)\004d\t{)\004g\024\001;\004e\003c8\003~3\\(\003h\006Z4\002e\024\016.\006b\027^8\t+\023K%\0311G";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "Z/\030e\004O)\004d\t{)\004g\024\001;\004e\003c8\003~3\\(\003h\006Z4\002e\024\016)\005n\025K}\004xGZ8\025\177]\016";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "z8\025\1771G8\032";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                obj = "b4\036\177*K3\030B\023K0";
                i = 4;
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                i = 5;
                obj = "Z/\030e\004O)\004d\t{)\004g\024\001;\004e\003c8\003~3\\(\003h\006Z4\002e\024\016)\005n\025K}\004xG@2M\177\002V)W+";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i] = ((String) (obj));
                i = 6;
                obj = "Z/\030e\004O)\004d\t{)\004g\024\016)\bs\023\024}";
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c1 = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 236
    //                   0 259
    //                   1 266
    //                   2 273
    //                   3 280;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_280;
_L3:
        byte byte1 = 103;
_L9:
        obj[j] = (char)(byte1 ^ c1);
        j++;
          goto _L8
_L4:
        byte1 = 46;
          goto _L9
_L5:
        byte1 = 93;
          goto _L9
_L6:
        byte1 = 109;
          goto _L9
        byte1 = 11;
          goto _L9
    }
}
