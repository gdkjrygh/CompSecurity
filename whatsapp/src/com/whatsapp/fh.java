// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.os.AsyncTask;
import com.whatsapp.notification.l;
import com.whatsapp.util.Log;

// Referenced classes of package com.whatsapp:
//            App, u5, k

class fh extends AsyncTask
{

    private static final String z[];
    final App a;

    fh(App app)
    {
        a = app;
        super();
    }

    protected Void a(Void avoid[])
    {
        try
        {
            App.az.a(u5.d());
            l.d().a(App.au, true);
        }
        // Misplaced declaration of an exception variable
        catch (Void avoid[])
        {
            Log.w((new StringBuilder()).append(z[1]).append(avoid.toString()).toString());
        }
        return null;
    }

    protected void a(Void void1)
    {
        try
        {
            App.a(true, true, true, false);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Void void1)
        {
            Log.c(z[0], void1);
        }
    }

    protected Object doInBackground(Object aobj[])
    {
        return a((Void[])aobj);
    }

    protected void onPostExecute(Object obj)
    {
        a((Void)obj);
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[2];
        obj = "\002\036\026S\n\023\n\007\b\032\r\001\022\025\031\032A\024\031\031\021\013\025\024P\006\034\024\023\r";
        byte1 = -1;
        i = 0;
_L2:
        String as1[];
        int j;
        int i1;
        as1 = as;
        obj = ((String) (obj)).toCharArray();
        i1 = obj.length;
        j = 0;
_L8:
label0:
        {
            if (i1 > j)
            {
                break label0;
            }
            obj = (new String(((char []) (obj)))).intern();
            switch (byte1)
            {
            default:
                as1[i] = ((String) (obj));
                i = 1;
                obj = "\002\036\026S\n\023\n\007\b\032\r\001\022\025\031L\013\024\016\020\021N";
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 136
    //                   0 157
    //                   1 163
    //                   2 169
    //                   3 175;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_175;
_L3:
        byte byte0 = 127;
_L9:
        obj[j] = (char)(byte0 ^ c);
        j++;
          goto _L8
_L4:
        byte0 = 99;
          goto _L9
_L5:
        byte0 = 110;
          goto _L9
_L6:
        byte0 = 102;
          goto _L9
        byte0 = 124;
          goto _L9
    }
}
