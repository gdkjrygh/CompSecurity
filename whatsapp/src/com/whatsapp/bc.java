// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.os.AsyncTask;
import android.os.Environment;
import android.os.PowerManager;
import com.whatsapp.util.Log;

// Referenced classes of package com.whatsapp:
//            SettingsChat, App, aoz, Conversation, 
//            o4, uv

class bc extends AsyncTask
{

    private static final String z[];
    final SettingsChat a;

    private bc(SettingsChat settingschat)
    {
        a = settingschat;
        super();
    }

    bc(SettingsChat settingschat, uv uv)
    {
        this(settingschat);
    }

    protected Boolean a(Void avoid[])
    {
        android.os.PowerManager.WakeLock wakelock = ((PowerManager)a.getSystemService(z[1])).newWakeLock(1, z[0]);
        long l;
        wakelock.acquire();
        l = System.currentTimeMillis();
        avoid = App.ah.a(false, false);
        long l1 = System.currentTimeMillis();
        l = 3000L - (l1 - l);
        if (l <= 0L)
        {
            break MISSING_BLOCK_LABEL_71;
        }
        Thread.sleep(l);
_L3:
        Object obj;
label0:
        {
            obj = avoid;
            try
            {
                if (!wakelock.isHeld())
                {
                    break label0;
                }
                wakelock.release();
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
        Exception exception;
        exception;
        avoid = Boolean.valueOf(false);
_L4:
        Log.e((new StringBuilder()).append(z[2]).append(exception.toString()).toString());
        exception = avoid;
        if (!wakelock.isHeld()) goto _L2; else goto _L1
_L1:
        wakelock.release();
        return avoid;
        avoid;
        try
        {
            if (wakelock.isHeld())
            {
                wakelock.release();
            }
        }
        // Misplaced declaration of an exception variable
        catch (Void avoid[])
        {
            throw avoid;
        }
        throw avoid;
        exception;
          goto _L3
        exception;
          goto _L4
    }

    protected void a(Boolean boolean1)
    {
        int j;
label0:
        {
label1:
            {
                j = App.am;
                a.removeDialog(8);
                Conversation.i();
                if (boolean1 != null)
                {
                    break label0;
                }
                o4.N();
                byte abyte0[] = o4.w();
                byte abyte1[] = o4.b(abyte0);
                if (abyte1 != null)
                {
                    App.a(abyte1, abyte0);
                    a.a(0x7f0e0267);
                    Log.i(z[3]);
                    if (j == 0)
                    {
                        break label1;
                    }
                }
                a.a(0x7f0e0266);
                Log.w(z[4]);
            }
            if (j == 0)
            {
                break MISSING_BLOCK_LABEL_162;
            }
        }
label2:
        {
            if (boolean1.booleanValue())
            {
                SettingsChat.b(a);
                if (j == 0)
                {
                    break MISSING_BLOCK_LABEL_162;
                }
            }
            boolean1 = Environment.getExternalStorageState();
            int i;
            if (boolean1.equals(z[5]))
            {
                i = 0x7f0e026d;
                if (j == 0)
                {
                    break label2;
                }
            }
            if (!boolean1.equals(z[6]) || j != 0)
            {
                i = 0x7f0e026c;
            } else
            {
                i = 0x7f0e0266;
            }
        }
        a.a(i);
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
        a.showDialog(8);
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[7];
        obj = "\003|IhI\021yH";
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
                obj = "\021r]fN";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "\022x^wU\017zY,^\000~AvLNpYdO\025rXf\023\004oXlNA";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "\022x^wU\017zY,^\000~AvLN{KjP\004y\005nU\022nCm[LrX.Q\bnGbH\002u";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                obj = "\022x^wU\017zY,^\000~AvLN{KjP\004y\005mI\rq";
                i = 4;
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                i = 5;
                obj = "\fr_mH\004yuqS";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i] = ((String) (obj));
                i = 6;
                obj = "\fr_mH\004y";
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
        byte byte1 = 60;
_L9:
        obj[j] = (char)(byte1 ^ c);
        j++;
          goto _L8
_L4:
        byte1 = 97;
          goto _L9
_L5:
        byte1 = 29;
          goto _L9
_L6:
        byte1 = 42;
          goto _L9
        byte1 = 3;
          goto _L9
    }
}
