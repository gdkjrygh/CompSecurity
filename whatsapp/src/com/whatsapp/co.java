// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.app.Activity;
import android.os.AsyncTask;
import com.whatsapp.messaging.MessageService;
import com.whatsapp.util.Log;
import com.whatsapp.wallpaper.d;
import java.io.IOException;

// Referenced classes of package com.whatsapp:
//            im, adn, App, aoz, 
//            vj, e4

public class co extends AsyncTask
{

    private static final String z[];
    boolean a;
    final vj b;
    boolean c;
    boolean d;

    public co(vj vj1, boolean flag, boolean flag1, boolean flag2)
    {
        b = vj1;
        super();
        c = false;
        a = flag;
        d = flag2;
    }

    static void a(co co1, Object aobj[])
    {
        co1.publishProgress(aobj);
    }

    protected im a(Object aobj[])
    {
        Object obj;
        aobj = im.FAILED;
        obj = new adn(this);
        long l;
        l = System.currentTimeMillis();
        obj = App.ah.a(a, ((x7) (obj)));
        aobj = ((Object []) (obj));
        long l1;
        publishProgress(new Integer[] {
            Integer.valueOf(100)
        });
        l1 = System.currentTimeMillis();
        l = 3000L - (l1 - l);
        boolean flag = a;
        if (!flag || l <= 0L)
        {
            break MISSING_BLOCK_LABEL_82;
        }
        Thread.sleep(l);
        return ((im) (aobj));
        Object obj1;
        obj1;
        throw obj1;
        obj1;
        throw obj1;
        obj1;
_L2:
        Log.a(((Throwable) (obj1)));
        c = true;
        return ((im) (aobj));
        obj1;
        return ((im) (aobj));
        obj1;
        if (true) goto _L2; else goto _L1
_L1:
    }

    protected void a(im im1)
    {
label0:
        {
            if (com.whatsapp.vj.d != null)
            {
                vj.a(b).removeDialog(100);
                com.whatsapp.vj.d = null;
            }
            App.ah.u();
            if (im1 != im.FAILED)
            {
                Log.i(z[0]);
                if (a && im1 == im.SUCCESS_CREATED)
                {
                    vj.a(b).showDialog(108);
                }
                App.ah.j();
                App.j();
                App.T();
                if (!b.b)
                {
                    App.m(App.au);
                    Log.i(z[2]);
                    App.f(true);
                }
                App.aw();
                App.au.aK();
                if (App.am == 0)
                {
                    break label0;
                }
            }
            Log.i(z[1]);
        }
        if (!b.b)
        {
            MessageService.b(App.au);
        }
        if (b.b && a)
        {
            com.whatsapp.wallpaper.d.a(vj.a(b));
        }
        b.c();
        b.a();
    }

    public void a(Integer ainteger[])
    {
        if (com.whatsapp.vj.d != null)
        {
            com.whatsapp.vj.d.setProgress(ainteger[0].intValue());
        }
    }

    protected Object doInBackground(Object aobj[])
    {
        return a(aobj);
    }

    protected void onPostExecute(Object obj)
    {
        a((im)obj);
    }

    public void onProgressUpdate(Object aobj[])
    {
        a((Integer[])aobj);
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[3];
        obj = "q,Edq~$Djds&Eh8t<Tnrt:";
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
                obj = "q,Edq~$Djds&Eh8a(^arc";
                i = 1;
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                i = 2;
                obj = "q,Edq~$Djds&Eh8t,Yi:f*Cdab";
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
        byte byte0 = 23;
_L9:
        obj[j] = (char)(byte0 ^ c1);
        j++;
          goto _L8
_L4:
        byte0 = 7;
          goto _L9
_L5:
        byte0 = 73;
          goto _L9
_L6:
        byte0 = 55;
          goto _L9
        byte0 = 13;
          goto _L9
    }
}
