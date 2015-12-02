// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.util.Hashtable;

// Referenced classes of package com.whatsapp:
//            App, als, tc, wl, 
//            wu

public class au2
{

    public static int a;
    public static boolean b;
    public static int c;
    public static int d;
    public static wu e;
    public static int f;
    public static int g;
    public static String h;
    public static int i;
    public static boolean j;
    public static boolean k;
    public static boolean l;
    public static int m;
    public static int n;
    public static boolean o;
    public static long p;
    public static int q;
    public static int r;
    private static final String z[];

    private static wu a()
    {
        if (z[1].equals(h))
        {
            return new als();
        }
        if (z[0].equals(h))
        {
            return new tc();
        } else
        {
            return new wl(h.split(","));
        }
    }

    public static void a(int i1, Hashtable hashtable)
    {
        boolean flag1 = true;
        String s = z[3];
        android.content.SharedPreferences.Editor editor = App.au.getSharedPreferences(s, 0).edit();
        a = i1;
        editor.putInt(z[30], i1);
        s = (String)hashtable.get(z[7]);
        if (!TextUtils.isEmpty(s))
        {
            g = Integer.parseInt(s) - 1;
            editor.putInt(z[18], g);
        }
        s = (String)hashtable.get(z[4]);
        if (!TextUtils.isEmpty(s))
        {
            m = Integer.parseInt(s);
            editor.putInt(z[20], m);
        }
        s = (String)hashtable.get(z[15]);
        if (!TextUtils.isEmpty(s))
        {
            r = Integer.parseInt(s);
            editor.putInt(z[19], r);
        }
        s = (String)hashtable.get(z[5]);
        if (!TextUtils.isEmpty(s))
        {
            q = Integer.parseInt(s);
            editor.putInt(z[31], q);
        }
        s = (String)hashtable.get(z[8]);
        if (!TextUtils.isEmpty(s))
        {
            i1 = Integer.parseInt(s);
            if (i1 != i)
            {
                i = i1;
                editor.putInt(z[38], i);
            }
        }
        s = (String)hashtable.get(z[12]);
        String s1;
        boolean flag;
        if (!TextUtils.isEmpty(s))
        {
            if (Integer.parseInt(s) != 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
        } else
        {
            flag = false;
        }
        if (flag != j)
        {
            j = flag;
            editor.putBoolean(z[2], j);
        }
        s1 = (String)hashtable.get(z[22]);
        s = s1;
        if (TextUtils.isEmpty(s1))
        {
            s = z[34];
        }
        if (!s.equals(h))
        {
            h = s;
            e = a();
            editor.putString(z[17], h);
        }
        s = (String)hashtable.get(z[27]);
        if (!TextUtils.isEmpty(s))
        {
            if (Integer.parseInt(s) != 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag != b)
            {
                b = flag;
                editor.putBoolean(z[6], b);
            }
        }
        s = (String)hashtable.get(z[14]);
        if (!TextUtils.isEmpty(s))
        {
            f = Integer.parseInt(s);
            editor.putInt(z[35], f);
        }
        s = (String)hashtable.get(z[36]);
        if (!TextUtils.isEmpty(s))
        {
            n = Integer.parseInt(s);
            editor.putInt(z[25], n);
        }
        s = (String)hashtable.get(z[21]);
        if (!TextUtils.isEmpty(s))
        {
            d = Integer.parseInt(s);
            editor.putInt(z[13], d);
        }
        s = (String)hashtable.get(z[10]);
        if (!TextUtils.isEmpty(s))
        {
            p = Long.parseLong(s) * 1000L;
            editor.putLong(z[9], p);
        }
        s = (String)hashtable.get(z[23]);
        if (!TextUtils.isEmpty(s))
        {
            if (Integer.parseInt(s) != 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
        } else
        {
            flag = false;
        }
        if (flag != o)
        {
            o = flag;
            editor.putBoolean(z[16], o);
        }
        s = (String)hashtable.get(z[26]);
        if (!TextUtils.isEmpty(s))
        {
            c = Integer.parseInt(s);
            editor.putInt(z[28], c);
        }
        s = (String)hashtable.get(z[11]);
        if (!TextUtils.isEmpty(s))
        {
            if (Integer.parseInt(s) != 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
        } else
        {
            flag = false;
        }
        if (flag != l)
        {
            l = flag;
            editor.putBoolean(z[24], l);
        }
        hashtable = (String)hashtable.get(z[29]);
        if (!TextUtils.isEmpty(hashtable))
        {
            if (Integer.parseInt(hashtable) != 0)
            {
                flag = flag1;
            } else
            {
                flag = false;
            }
            if (flag != k)
            {
                k = flag;
                editor.putBoolean(z[32], k);
            }
        }
        editor.putLong(z[37], System.currentTimeMillis());
        if (!editor.commit())
        {
            Log.e(z[33]);
        }
    }

    private static String z(char ac[])
    {
        int i1;
        int j1;
        j1 = ac.length;
        i1 = 0;
_L7:
        char c1;
        if (j1 <= i1)
        {
            return (new String(ac)).intern();
        }
        c1 = ac[i1];
        i1 % 5;
        JVM INSTR tableswitch 0 3: default 60
    //                   0 78
    //                   1 84
    //                   2 90
    //                   3 96;
           goto _L1 _L2 _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_96;
_L2:
        break; /* Loop/switch isn't completed */
_L1:
        byte byte0 = 84;
_L8:
        ac[i1] = (char)(byte0 ^ c1);
        i1++;
        if (true) goto _L7; else goto _L6
_L6:
        byte0 = 67;
          goto _L8
_L3:
        byte0 = 86;
          goto _L8
_L4:
        byte0 = 100;
          goto _L8
        byte0 = 21;
          goto _L8
    }

    private static char[] z(String s)
    {
        s = s.toCharArray();
        if (s.length < 2)
        {
            s[0] = (char)(s[0] ^ 0x54);
        }
        return s;
    }

    static 
    {
        String s;
        SharedPreferences sharedpreferences;
        byte byte0;
        byte byte1;
        byte1 = -1;
        String as[] = new String[39];
        int i1 = 0;
        s = "\":\b";
        byte0 = -1;
label0:
        do
        {
            String as1[] = as;
            s = z(z(s));
            switch (byte0)
            {
            default:
                as1[i1] = s;
                s = "-9\np";
                i1 = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i1] = s;
                s = " 7\by";
                i1 = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i1] = s;
                s = " 9\t;#+7\020f53&;e&&0\001g1-5\001f";
                i1 = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i1] = s;
                i1 = 4;
                s = ".7\034J'64\016p77";
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i1] = s;
                i1 = 5;
                s = ".3\000|5";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i1] = s;
                i1 = 6;
                s = "/9\007t *9\nJ1-7\006y1'";
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[i1] = s;
                i1 = 7;
                s = ".7\034J$\"$\020|7*&\005{ 0";
                byte0 = 6;
                break;

            case 6: // '\006'
                as1[i1] = s;
                i1 = 8;
                s = ".7\034J8*%\020J&&5\re=&8\020f";
                byte0 = 7;
                break;

            case 7: // '\007'
                as1[i1] = s;
                i1 = 9;
                s = "13\005q\01313\007p=3\"\027";
                byte0 = 8;
                break;

            case 8: // '\b'
                as1[i1] = s;
                i1 = 10;
                s = "13\005q&&5\001|$7%";
                byte0 = 9;
                break;

            case 9: // '\t'
                as1[i1] = s;
                i1 = 11;
                s = ".%\024p'";
                byte0 = 10;
                break;

            case 10: // '\n'
                as1[i1] = s;
                i1 = 12;
                s = " 7\by";
                byte0 = 11;
                break;

            case 11: // '\013'
                as1[i1] = s;
                i1 = 13;
                s = "*;\005r1\034;\005m\013&2\003p";
                byte0 = 12;
                break;

            case 12: // '\f'
                as1[i1] = s;
                i1 = 14;
                s = "*;\005r1\034;\005m\013(4\035a10";
                byte0 = 13;
                break;

            case 13: // '\r'
                as1[i1] = s;
                i1 = 15;
                s = ".7\034J319\021e'";
                byte0 = 14;
                break;

            case 14: // '\016'
                as1[i1] = s;
                i1 = 16;
                s = "3:\005|:73\034a\013'?\027t6/3\0";
                byte0 = 15;
                break;

            case 15: // '\017'
                as1[i1] = s;
                i1 = 17;
                s = " 7\by\013\":\bz#&2";
                byte0 = 16;
                break;

            case 16: // '\020'
                as1[i1] = s;
                i1 = 18;
                s = "37\026a= ?\024t:7%;f=93;y=.?\020";
                byte0 = 17;
                break;

            case 17: // '\021'
                as1[i1] = s;
                i1 = 19;
                s = "$$\013`$\0348\021x6&$;y=.?\020";
                byte0 = 18;
                break;

            case 18: // '\022'
                as1[i1] = s;
                i1 = 20;
                s = "0#\006\1771 \";y1-1\020}\013/?\t| ";
                byte0 = 19;
                break;

            case 19: // '\023'
                as1[i1] = s;
                i1 = 21;
                s = "*;\005r1\034;\005m\013&2\003p";
                byte0 = 20;
                break;

            case 20: // '\024'
                as1[i1] = s;
                i1 = 22;
                s = "\":\bz#";
                byte0 = 21;
                break;

            case 21: // '\025'
                as1[i1] = s;
                i1 = 23;
                s = "3:\005|:73\034a\013'?\027t6/3\0";
                byte0 = 22;
                break;

            case 22: // '\026'
                as1[i1] = s;
                i1 = 24;
                s = ".3\027f5$3\027J'77\026a\01333\nq=-1;pf&\t\027p'0?\013{";
                byte0 = 23;
                break;

            case 23: // '\027'
                as1[i1] = s;
                i1 = 25;
                s = "*;\005r1\034'\021t8*\"\035";
                byte0 = 24;
                break;

            case 24: // '\030'
                as1[i1] = s;
                i1 = 26;
                s = "3:\005|:73\034a\01313\001{5!:\001J +$\001f<,:\0";
                byte0 = 25;
                break;

            case 25: // '\031'
                as1[i1] = s;
                i1 = 27;
                s = "/9\007t *9\n";
                byte0 = 26;
                break;

            case 26: // '\032'
                as1[i1] = s;
                i1 = 28;
                s = "3:\005|:73\034a\01313\001{5!:\001J +$\001f<,:\0";
                byte0 = 27;
                break;

            case 27: // '\033'
                as1[i1] = s;
                i1 = 29;
                s = "$$\013`$0\t\022'";
                byte0 = 28;
                break;

            case 28: // '\034'
                as1[i1] = s;
                i1 = 30;
                s = "03\026c11\t\024g;3%^y50\";c11%\rz:";
                byte0 = 29;
                break;

            case 29: // '\035'
                as1[i1] = s;
                i1 = 31;
                s = ".3\000|5\034:\rx=7\t\tw";
                byte0 = 30;
                break;

            case 30: // '\036'
                as1[i1] = s;
                i1 = 32;
                s = "$$\013`$0\t\022'\013&8\005w8&2";
                byte0 = 31;
                break;

            case 31: // '\037'
                as1[i1] = s;
                i1 = 33;
                s = "03\026c11&\026z$0y\013{\007&$\022p&\023$\013e11\"\rp'l0\005|8&2";
                byte0 = 32;
                break;

            case 32: // ' '
                as1[i1] = s;
                i1 = 34;
                s = "-9\np";
                byte0 = 33;
                break;

            case 33: // '!'
                as1[i1] = s;
                i1 = 35;
                s = "*;\005r1\034;\005m\013(4\035a10";
                byte0 = 34;
                break;

            case 34: // '"'
                as1[i1] = s;
                i1 = 36;
                s = "*;\005r1\034'\021t8*\"\035";
                byte0 = 35;
                break;

            case 35: // '#'
                as1[i1] = s;
                i1 = 37;
                s = "$$\013`$0\t\027p&53\026J$19\024f\013/7\027a\01313\002g10>;a=.3";
                byte0 = 36;
                break;

            case 36: // '$'
                as1[i1] = s;
                i1 = 38;
                s = "!$\013t0 7\027a\013/?\027a\0130?\036p\013/?\t| ";
                byte0 = 37;
                break;

            case 37: // '%'
                as1[i1] = s;
                break label0;
            }
        } while (true);
        z = as;
        r = 9999;
        g = 50;
        m = 25;
        i = 256;
        q = 16;
        j = false;
        h = z(z("-9\np"));
        b = false;
        f = 5120;
        n = 80;
        d = 1280;
        p = 0L;
        o = false;
        c = 1;
        l = false;
        k = false;
        sharedpreferences = App.au.getSharedPreferences(z(z(" 9\t;#+7\020f53&;e&&0\001g1-5\001f")), 0);
        s = "03\026c11\t\024g;3%^y50\";c11%\rz:";
        byte0 = -1;
_L23:
        Object obj;
        obj = sharedpreferences;
        s = z(z(s));
        byte0;
        JVM INSTR tableswitch 0 15: default 1072
    //                   0 1148
    //                   1 1169
    //                   2 1190
    //                   3 1211
    //                   4 1232
    //                   5 1253
    //                   6 1275
    //                   7 1303
    //                   8 1325
    //                   9 1347
    //                   10 1369
    //                   11 1391
    //                   12 1413
    //                   13 1435
    //                   14 1457
    //                   15 1479;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L17
_L1:
        a = ((SharedPreferences) (obj)).getInt(s, 0);
        s = "$$\013`$\0348\021x6&$;y=.?\020";
        byte0 = 0;
        continue; /* Loop/switch isn't completed */
_L21:
        s = z(z(s));
        byte0;
        JVM INSTR tableswitch 0 0: default 1120
    //                   0 1508;
           goto _L18 _L19
_L18:
        ((android.content.SharedPreferences.Editor) (obj)).remove(s).commit();
        obj = sharedpreferences.edit();
        s = "2$;p:\"4\bp0";
        byte0 = 0;
        if (true) goto _L21; else goto _L20
_L20:
_L2:
        r = ((SharedPreferences) (obj)).getInt(s, r);
        s = "37\026a= ?\024t:7%;f=93;y=.?\020";
        byte0 = 1;
        continue; /* Loop/switch isn't completed */
_L3:
        g = ((SharedPreferences) (obj)).getInt(s, g);
        s = "0#\006\1771 \";y1-1\020}\013/?\t| ";
        byte0 = 2;
        continue; /* Loop/switch isn't completed */
_L4:
        m = ((SharedPreferences) (obj)).getInt(s, m);
        s = ".3\000|5\034:\rx=7\t\tw";
        byte0 = 3;
        continue; /* Loop/switch isn't completed */
_L5:
        q = ((SharedPreferences) (obj)).getInt(s, q);
        s = "!$\013t0 7\027a\013/?\027a\0130?\036p\013/?\t| ";
        byte0 = 4;
        continue; /* Loop/switch isn't completed */
_L6:
        i = ((SharedPreferences) (obj)).getInt(s, i);
        s = " 7\by";
        byte0 = 5;
        continue; /* Loop/switch isn't completed */
_L7:
        j = ((SharedPreferences) (obj)).getBoolean(s, j);
        s = " 7\by\013\":\bz#&2";
        byte0 = 6;
        continue; /* Loop/switch isn't completed */
_L8:
        h = ((SharedPreferences) (obj)).getString(s, h);
        e = a();
        s = "/9\007t *9\nJ1-7\006y1'";
        byte0 = 7;
        continue; /* Loop/switch isn't completed */
_L9:
        b = ((SharedPreferences) (obj)).getBoolean(s, b);
        s = "*;\005r1\034;\005m\013(4\035a10";
        byte0 = 8;
        continue; /* Loop/switch isn't completed */
_L10:
        f = ((SharedPreferences) (obj)).getInt(s, f);
        s = "*;\005r1\034'\021t8*\"\035";
        byte0 = 9;
        continue; /* Loop/switch isn't completed */
_L11:
        n = ((SharedPreferences) (obj)).getInt(s, n);
        s = "*;\005r1\034;\005m\013&2\003p";
        byte0 = 10;
        continue; /* Loop/switch isn't completed */
_L12:
        d = ((SharedPreferences) (obj)).getInt(s, d);
        s = "13\005q\01313\007p=3\"\027";
        byte0 = 11;
        continue; /* Loop/switch isn't completed */
_L13:
        p = ((SharedPreferences) (obj)).getLong(s, p);
        s = "3:\005|:73\034a\013'?\027t6/3\0";
        byte0 = 12;
        continue; /* Loop/switch isn't completed */
_L14:
        o = ((SharedPreferences) (obj)).getBoolean(s, o);
        s = "3:\005|:73\034a\01313\001{5!:\001J +$\001f<,:\0";
        byte0 = 13;
        continue; /* Loop/switch isn't completed */
_L15:
        c = ((SharedPreferences) (obj)).getInt(s, c);
        s = ".3\027f5$3\027J'77\026a\01333\nq=-1;pf&\t\027p'0?\013{";
        byte0 = 14;
        continue; /* Loop/switch isn't completed */
_L16:
        l = ((SharedPreferences) (obj)).getBoolean(s, l);
        s = "$$\013`$0\t\022'\013&8\005w8&2";
        byte0 = 15;
        continue; /* Loop/switch isn't completed */
_L17:
        k = ((SharedPreferences) (obj)).getBoolean(s, k);
        obj = sharedpreferences.edit();
        s = "3$\rc5 /;p:\"4\bp0";
        byte0 = byte1;
          goto _L21
_L19:
        ((android.content.SharedPreferences.Editor) (obj)).remove(s).commit();
        if (true) goto _L23; else goto _L22
_L22:
    }
}
