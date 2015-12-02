// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.app.Activity;
import android.os.Handler;
import com.whatsapp.protocol.ci;
import com.whatsapp.util.Log;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Timer;

// Referenced classes of package com.whatsapp:
//            alp, ad8, App, n8

public class a9q
    implements ci, Runnable
{

    private static Timer d;
    public static HashMap m;
    private static final String z[];
    private n8 a;
    public Long b;
    public Activity c;
    public String e;
    public boolean f;
    private Runnable g;
    private Runnable h;
    public boolean i;
    public int j;
    public boolean k;
    public Hashtable l;

    public a9q(Activity activity, String s, int i1, Hashtable hashtable, boolean flag)
    {
label0:
        {
            super();
            f = false;
            i = false;
            k = false;
            g = new alp(this);
            h = new ad8(this);
            e = s;
            c = activity;
            j = i1;
            f = flag;
            l = hashtable;
            if (s == null)
            {
                b = Long.valueOf(System.currentTimeMillis());
                m.put((new StringBuilder()).append("").append(b).toString(), this);
                if (App.am == 0)
                {
                    break label0;
                }
            }
            m.put(s, this);
        }
        if (i1 == 2)
        {
            a = new n8(this);
            d.schedule(a, 20000L);
        }
    }

    static Runnable a(a9q a9q1)
    {
        return a9q1.g;
    }

    private void a()
    {
        a9q a9q1;
        if (e == null)
        {
            a9q1 = (a9q)m.remove(b);
        } else
        {
            a9q1 = (a9q)m.remove(e);
        }
        if (a9q1 != null)
        {
            a9q1.a.cancel();
        }
    }

    public void a(int i1)
    {
        Log.i((new StringBuilder()).append(z[2]).append(i1).append(z[3]).append(e).append(z[1]).append(j).toString());
        switch (j)
        {
        case 2: // '\002'
        default:
            a();
            break;
        }
        App.au.ab().post(h);
    }

    public void run()
    {
label0:
        {
            Log.i((new StringBuilder()).append(z[0]).append(j).toString());
            k = true;
            if (j != 2)
            {
                break label0;
            }
            if (f)
            {
                App.L.put(e, e);
                if (App.am == 0)
                {
                    break label0;
                }
            }
            App.L.remove(e);
        }
        a();
        App.au.ab().post(h);
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i1;
        as = new String[4];
        obj = "i\013CB?o\002rU(\177\033HT9Q\035XD.k\035^\b";
        byte1 = -1;
        i1 = 0;
_L2:
        String as1[];
        int j1;
        int k1;
        as1 = as;
        obj = ((String) (obj)).toCharArray();
        k1 = obj.length;
        j1 = 0;
_L8:
label0:
        {
            if (k1 > j1)
            {
                break label0;
            }
            obj = (new String(((char []) (obj)))).intern();
            switch (byte1)
            {
            default:
                as1[i1] = ((String) (obj));
                obj = ".\022\r";
                i1 = 1;
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[i1] = ((String) (obj));
                obj = "i\013CB?o\002rU(\177\033HT9Q\bLN!k\n\r\035m";
                i1 = 2;
                byte1 = 1;
                break;

            case 1: // '\001'
                as1[i1] = ((String) (obj));
                i1 = 3;
                obj = ".\022\r";
                byte1 = 2;
                break;

            case 2: // '\002'
                as1[i1] = ((String) (obj));
                z = as;
                m = new HashMap();
                d = new Timer();
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c1 = obj[j1];
        j1 % 5;
        JVM INSTR tableswitch 0 3: default 196
    //                   0 217
    //                   1 223
    //                   2 229
    //                   3 235;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_235;
_L3:
        byte byte0 = 77;
_L9:
        obj[j1] = (char)(byte0 ^ c1);
        j1++;
          goto _L8
_L4:
        byte0 = 14;
          goto _L9
_L5:
        byte0 = 110;
          goto _L9
_L6:
        byte0 = 45;
          goto _L9
        byte0 = 39;
          goto _L9
    }
}
