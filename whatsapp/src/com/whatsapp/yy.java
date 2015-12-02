// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.app.Activity;
import android.os.AsyncTask;
import com.whatsapp.contact.g;
import com.whatsapp.contact.i;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.whatsapp:
//            ve, App, dx, UserFeedbackActivity, 
//            SystemStatusActivity

public class yy extends AsyncTask
{

    private static final String z[];
    HashMap a;
    dx b;
    Activity c;
    boolean d;
    String e;
    boolean f;

    public yy(Activity activity, dx dx1, boolean flag, boolean flag1, String s)
    {
        d = false;
        c = activity;
        b = dx1;
        d = flag;
        f = flag1;
        e = s;
    }

    protected Integer a(String as[])
    {
        try
        {
            a = ve.a();
            if (!d)
            {
                a();
                Log.i((new StringBuilder()).append(z[8]).append(i.b(g.INVISIBLE_ONLY)).append("/").append(i.b(g.BOTH)).append(z[7]).append(App.u(App.au)).append(")").toString());
            }
        }
        // Misplaced declaration of an exception variable
        catch (String as[])
        {
            Log.w((new StringBuilder()).append(z[10]).append(as.toString()).toString());
            a = null;
            return Integer.valueOf(-1);
        }
        // Misplaced declaration of an exception variable
        catch (String as[])
        {
            Log.w((new StringBuilder()).append(z[9]).append(as.toString()).toString());
            a = null;
            return Integer.valueOf(-1);
        }
        return Integer.valueOf(0);
    }

    void a()
    {
        int j = App.am;
        android.provider.Settings.System.getInt(c.getContentResolver(), z[18]);
        JVM INSTR tableswitch 0 2: default 160
    //                   0 82
    //                   1 104
    //                   2 93;
           goto _L1 _L2 _L3 _L4
_L1:
        String s = z[16];
_L5:
        Log.i((new StringBuilder()).append(z[14]).append(s).toString());
        return;
_L2:
        try
        {
            s = z[11];
        }
        catch (android.provider.Settings.SettingNotFoundException settingnotfoundexception)
        {
            Log.i(z[12]);
            return;
        }
        catch (Exception exception)
        {
            Log.i((new StringBuilder()).append(z[15]).append(exception.toString()).toString());
            return;
        }
        if (j == 0) goto _L5; else goto _L4
_L4:
        s = z[17];
        if (j == 0) goto _L5; else goto _L3
_L3:
        s = z[13];
        if (j == 0) goto _L5; else goto _L1
    }

    protected void a(Integer integer)
    {
        Object obj2;
        int j;
        obj2 = null;
        j = App.am;
        c.removeDialog(122);
        if (com.whatsapp.App.i()) goto _L2; else goto _L1
_L1:
        Log.i(z[6]);
        b.f(c.getString(0x7f0e0317, new Object[] {
            c.getString(0x7f0e00c6)
        }));
        if (j == 0) goto _L3; else goto _L2
_L2:
        if (a != null && a.size() != 0) goto _L5; else goto _L4
_L4:
        Log.i(z[0]);
        if (!d) goto _L7; else goto _L6
_L6:
        if (c.isFinishing()) goto _L3; else goto _L8
_L8:
        c.showDialog(123);
        if (j == 0) goto _L3; else goto _L7
_L7:
        Object obj;
        Object obj1;
        obj = c;
        obj1 = e;
        Object obj3 = new StringBuilder();
        Object obj4;
        String s;
        if (f)
        {
            integer = z[5];
        } else
        {
            integer = z[1];
        }
        obj3 = ((StringBuilder) (obj3)).append(integer).append(z[2]).toString();
        if (f)
        {
            integer = Integer.valueOf(1);
        } else
        {
            integer = null;
        }
        UserFeedbackActivity.a(((android.content.Context) (obj)), ((String) (obj1)), ((String) (obj3)), integer);
        if (j == 0) goto _L3; else goto _L5
_L5:
        integer = Boolean.TRUE;
        obj = Boolean.TRUE;
        obj3 = new ArrayList();
        obj4 = a.keySet().iterator();
_L19:
        if (!((Iterator) (obj4)).hasNext()) goto _L10; else goto _L9
_L9:
        s = (String)((Iterator) (obj4)).next();
        if (z[3].equals(s))
        {
            obj = (Boolean)a.get(s);
            if (j == 0)
            {
                break MISSING_BLOCK_LABEL_508;
            }
        }
        if (!z[4].equals(s)) goto _L12; else goto _L11
_L11:
        obj1 = (Boolean)a.get(s);
        if (j == 0) goto _L14; else goto _L13
_L13:
        integer = ((Integer) (obj1));
_L12:
        if (!((Boolean)a.get(s)).booleanValue())
        {
            ((ArrayList) (obj3)).add(s);
        }
        obj1 = obj;
        obj = integer;
        integer = ((Integer) (obj1));
_L20:
        if (j == 0) goto _L16; else goto _L15
_L15:
        obj1 = obj;
        obj = integer;
        integer = ((Integer) (obj1));
_L10:
        if (((ArrayList) (obj3)).size() != 0 || !((Boolean) (obj)).booleanValue() || d) goto _L18; else goto _L17
_L17:
        obj4 = c;
        s = e;
        if (f)
        {
            obj1 = Integer.valueOf(1);
        } else
        {
            obj1 = null;
        }
        UserFeedbackActivity.a(((android.content.Context) (obj4)), s, null, ((Integer) (obj1)));
        if (j == 0) goto _L3; else goto _L18
_L18:
        obj4 = c;
        s = e;
        obj1 = obj2;
        if (f)
        {
            obj1 = Integer.valueOf(1);
        }
        SystemStatusActivity.a(((android.content.Context) (obj4)), s, ((Integer) (obj1)), integer.booleanValue(), ((Boolean) (obj)).booleanValue(), ((ArrayList) (obj3)), d);
_L3:
        return;
_L16:
        obj1 = obj;
        obj = integer;
        integer = ((Integer) (obj1));
          goto _L19
_L14:
        integer = ((Integer) (obj));
        obj = obj1;
          goto _L20
        Integer integer1 = integer;
        integer = ((Integer) (obj));
        obj = integer1;
          goto _L20
    }

    protected Object doInBackground(Object aobj[])
    {
        return a((String[])aobj);
    }

    protected void onPostExecute(Object obj)
    {
        a((Integer)obj);
    }

    protected void onPreExecute()
    {
        c.showDialog(122);
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int j;
        as = new String[19];
        obj = "+\016P'\n;\037F0\004%\025A%\025=\025\032*\016e\025P6\027-\024\0307\025)\022@7";
        byte0 = -1;
        j = 0;
_L2:
        String as1[];
        int k;
        int l;
        as1 = as;
        obj = ((String) (obj)).toCharArray();
        l = obj.length;
        k = 0;
_L8:
label0:
        {
            if (l > k)
            {
                break label0;
            }
            obj = (new String(((char []) (obj)))).intern();
            switch (byte0)
            {
            default:
                as1[j] = ((String) (obj));
                obj = ":\003R";
                j = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[j] = ((String) (obj));
                obj = "e\023[/\017'\021[";
                j = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[j] = ((String) (obj));
                obj = ">\003G7\b'\b";
                j = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[j] = ((String) (obj));
                obj = "-\013T-\r";
                j = 4;
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[j] = ((String) (obj));
                j = 5;
                obj = "+\016T0";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[j] = ((String) (obj));
                j = 6;
                obj = "+\016P'\n;\037F0\004%\025A%\025=\025\032*\016e\005Z*\017-\005A-\027!\022L";
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[j] = ((String) (obj));
                j = 7;
                obj = "hN";
                byte0 = 6;
                break;

            case 6: // '\006'
                as1[j] = ((String) (obj));
                j = 8;
                obj = ")\004Z1\025g\005Z*\025)\005A7N+\t@*\025h";
                byte0 = 7;
                break;

            case 7: // '\007'
                as1[j] = ((String) (obj));
                j = 9;
                obj = "+\016P'\n;\037F0\004%\025A%\025=\025\032!\023:\tGd";
                byte0 = 8;
                break;

            case 8: // '\b'
                as1[j] = ((String) (obj));
                j = 10;
                obj = "+\016P'\n;\037F0\004%\025A%\025=\025\032-\016-\024G+\023h";
                byte0 = 9;
                break;

            case 9: // '\t'
                as1[j] = ((String) (obj));
                j = 11;
                obj = ",\003S%\024$\022";
                byte0 = 10;
                break;

            case 10: // '\n'
                as1[j] = ((String) (obj));
                j = 12;
                obj = ")\004Z1\025g\021\\\"\b;\nP!\021g\bZ0L.\t@*\005";
                byte0 = 11;
                break;

            case 11: // '\013'
                as1[j] = ((String) (obj));
                j = 13;
                obj = "&\003C!\023e\021]-\r-KE(\024/\001P ";
                byte0 = 12;
                break;

            case 12: // '\f'
                as1[j] = ((String) (obj));
                j = 14;
                obj = ")\004Z1\025g\021\\\"\b;\nP!\021g";
                byte0 = 13;
                break;

            case 13: // '\r'
                as1[j] = ((String) (obj));
                j = 15;
                obj = ")\004Z1\025g\021\\\"\b;\nP!\021g\003G6\016:F";
                byte0 = 14;
                break;

            case 14: // '\016'
                as1[j] = ((String) (obj));
                j = 16;
                obj = "=\b^*\016?\b";
                byte0 = 15;
                break;

            case 15: // '\017'
                as1[j] = ((String) (obj));
                j = 17;
                obj = "&\003C!\023";
                byte0 = 16;
                break;

            case 16: // '\020'
                as1[j] = ((String) (obj));
                j = 18;
                obj = "?\017S->;\nP!\021\027\026Z(\b+\037";
                byte0 = 17;
                break;

            case 17: // '\021'
                as1[j] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c1 = obj[k];
        k % 5;
        JVM INSTR tableswitch 0 3: default 500
    //                   0 523
    //                   1 530
    //                   2 537
    //                   3 544;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_544;
_L3:
        byte byte1 = 97;
_L9:
        obj[k] = (char)(byte1 ^ c1);
        k++;
          goto _L8
_L4:
        byte1 = 72;
          goto _L9
_L5:
        byte1 = 102;
          goto _L9
_L6:
        byte1 = 53;
          goto _L9
        byte1 = 68;
          goto _L9
    }
}
