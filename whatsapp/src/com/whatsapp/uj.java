// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.os.Handler;
import com.whatsapp.protocol.a;
import com.whatsapp.protocol.b;
import com.whatsapp.protocol.c4;
import com.whatsapp.protocol.cx;
import com.whatsapp.util.Log;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.TimerTask;

// Referenced classes of package com.whatsapp:
//            App, vi, sb, p5, 
//            gc, rj

public class uj
    implements cx
{

    private static final String z[];
    public String a;
    public String b;
    final p5 c;
    public String d;
    public long e;
    public String f;

    public uj(p5 p5_1)
    {
        c = p5_1;
        super();
    }

    private void a()
    {
        App.au.ab().post(new vi(this));
    }

    private void b()
    {
        App.au.ab().post(new sb(this));
    }

    public void a(int i)
    {
        Log.w((new StringBuilder()).append(z[2]).append(i).append(" ").append(c.k.y).toString());
        com.whatsapp.p5.b(c).cancel();
        a();
    }

    public void a(b b1)
    {
        boolean flag;
label0:
        {
            flag = true;
            if (b1 != null)
            {
                Log.i((new StringBuilder()).append(z[0]).append(b1.e).append(" ").append(b1.d).append(" ").append(b1.c).append(" ").append(c.k.y).toString());
                if (App.am == 0)
                {
                    break label0;
                }
            }
            Log.i((new StringBuilder()).append(z[1]).append(c.k.y).toString());
        }
        com.whatsapp.p5.b(c).cancel();
        c.f = b1;
        com.whatsapp.p5.a(c, true);
        p5 p5_1 = c;
        if (b1 == null)
        {
            flag = false;
        }
        p5_1.a = flag;
        b();
    }

    public void a(String s, String s1, int i)
    {
        Log.i((new StringBuilder()).append(z[6]).append(s).append(" ").append(s1).append(" ").append(i).append(" ").append(c.k.y).toString());
        com.whatsapp.p5.b(c).cancel();
        s = App.h(s);
        try
        {
            s = new URL(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.e((new StringBuilder()).append(z[3]).append(s.toString()).toString());
            a();
            return;
        }
        com.whatsapp.p5.a(c, new gc(s, c.g(), i, c.h(), new rj(this)));
        com.whatsapp.p5.a(c).a(z[4], (new StringBuilder()).append(App.Z.jabber_id).append(z[5]).toString());
        com.whatsapp.p5.a(c).a(z[7], c.k.y.a);
        b();
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[8];
        obj = "\016wi>}\026ba8}\007=b9x\026ba>\177\002fhw";
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
                obj = "\016wi>}\026ba8}\007=b9x\026ba>\177\002fhwr\026~aw";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "\016wi>}\026ba8}\007=b9y\021`b%<";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "\016wi>}\026ba8}\007=`6p\005}\177:y\007g\177;y\033qh'h\n}cw";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                obj = "\005`b:";
                i = 4;
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                i = 5;
                obj = "#a# t\002f~6l\023<c2h";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i] = ((String) (obj));
                i = 6;
                obj = "\016wi>}\026ba8}\007=b9i\023~b6xC";
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[i] = ((String) (obj));
                i = 7;
                obj = "\027}";
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
        char c1 = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 256
    //                   0 279
    //                   1 286
    //                   2 293
    //                   3 300;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_300;
_L3:
        byte byte1 = 28;
_L9:
        obj[j] = (char)(byte1 ^ c1);
        j++;
          goto _L8
_L4:
        byte1 = 99;
          goto _L9
_L5:
        byte1 = 18;
          goto _L9
_L6:
        byte1 = 13;
          goto _L9
        byte1 = 87;
          goto _L9
    }
}
