// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.os.AsyncTask;
import android.os.PowerManager;
import com.whatsapp.util.Log;
import com.whatsapp.wallpaper.d;
import java.io.IOException;

// Referenced classes of package com.whatsapp:
//            App, aoz, Conversation, dx, 
//            o4

class u_ extends AsyncTask
{

    private static final String z[];
    private final boolean a;

    protected u_(boolean flag)
    {
        a = flag;
    }

    protected Boolean a(Void avoid[])
    {
        android.os.PowerManager.WakeLock wakelock;
        avoid = (PowerManager)App.au.getSystemService(z[4]);
        wakelock = null;
        if (avoid != null)
        {
            wakelock = avoid.newWakeLock(1, z[2]);
        }
        if (wakelock == null)
        {
            break MISSING_BLOCK_LABEL_40;
        }
        wakelock.acquire();
        Log.i(z[5]);
        avoid = App.ah.a(false, a);
        d.c(App.au);
        Object obj;
label0:
        {
            obj = avoid;
            if (wakelock == null)
            {
                break label0;
            }
            obj = avoid;
            IOException ioexception;
            try
            {
                if (!wakelock.isHeld())
                {
                    break label0;
                }
                wakelock.release();
                Log.i(z[6]);
            }
            // Misplaced declaration of an exception variable
            catch (Void avoid[])
            {
                throw avoid;
            }
            obj = avoid;
        }
_L2:
        return ((Boolean) (obj));
        avoid;
        try
        {
            throw avoid;
        }
        // Misplaced declaration of an exception variable
        catch (IOException ioexception)
        {
            avoid = Boolean.valueOf(false);
        }
        finally
        {
            if (wakelock == null) goto _L0; else goto _L0
        }
_L4:
        Log.e((new StringBuilder()).append(z[1]).append(ioexception.toString()).toString());
        ioexception = avoid;
        if (wakelock == null) goto _L2; else goto _L1
_L1:
        ioexception = avoid;
        if (!wakelock.isHeld()) goto _L2; else goto _L3
_L3:
        wakelock.release();
        Log.i(z[0]);
        return avoid;
        avoid;
        throw avoid;
        try
        {
            if (wakelock.isHeld())
            {
                wakelock.release();
                Log.i(z[3]);
            }
        }
        // Misplaced declaration of an exception variable
        catch (Void avoid[])
        {
            throw avoid;
        }
        throw avoid;
        ioexception;
          goto _L4
    }

    protected void a(Boolean boolean1)
    {
        Conversation.i();
        if (App.aB() != null)
        {
            App.aB().c();
        }
        if (boolean1 == null)
        {
            o4.N();
        }
    }

    protected Object doInBackground(Object aobj[])
    {
        return a((Void[])aobj);
    }

    protected void onPostExecute(Object obj)
    {
        a((Boolean)obj);
    }

    protected void onPreExecute()
    {
        App.aY = false;
        if (App.aB() != null)
        {
            App.aB().a(0x7f0e0265, 0x7f0e0264);
        }
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[7];
        obj = "\006!d\025\021\0062\177O\003H&x\025\001\002=q[\000\002";
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
                obj = "\006!d\025\021\0062\177O\003H4fH\034\025q";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "\0050wQ\006\0275v";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "\006!d\025\021\0062\177O\003H&x\025\001\002=q[\000\002";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                obj = "\027>c_\001";
                i = 4;
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                i = 5;
                obj = "\006!d\025\021\0062\177O\003H&x\025\022\004 aS\001\002";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i] = ((String) (obj));
                i = 6;
                obj = "\006!d\025\021\0062\177O\003H&x\025\001\002=q[\000\002";
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
        char c = obj[j];
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
        byte byte1 = 115;
_L9:
        obj[j] = (char)(byte1 ^ c);
        j++;
          goto _L8
_L4:
        byte1 = 103;
          goto _L9
_L5:
        byte1 = 81;
          goto _L9
_L6:
        byte1 = 20;
          goto _L9
        byte1 = 58;
          goto _L9
    }
}
