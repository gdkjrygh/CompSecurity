// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.whatsapp.contact.n;
import com.whatsapp.fieldstats.a0;
import com.whatsapp.fieldstats.a1;
import com.whatsapp.fieldstats.a4;
import com.whatsapp.fieldstats.a6;
import com.whatsapp.fieldstats.ag;
import com.whatsapp.fieldstats.ai;
import com.whatsapp.fieldstats.aj;
import com.whatsapp.fieldstats.ak;
import com.whatsapp.fieldstats.am;
import com.whatsapp.fieldstats.an;
import com.whatsapp.fieldstats.ao;
import com.whatsapp.fieldstats.ay;
import com.whatsapp.fieldstats.az;
import com.whatsapp.fieldstats.bo;
import com.whatsapp.fieldstats.bs;
import com.whatsapp.fieldstats.bt;
import com.whatsapp.fieldstats.k;
import com.whatsapp.fieldstats.l;
import com.whatsapp.fieldstats.o;
import com.whatsapp.fieldstats.q;
import com.whatsapp.fieldstats.u;
import com.whatsapp.fieldstats.v;
import com.whatsapp.fieldstats.x;
import com.whatsapp.fieldstats.z;
import com.whatsapp.protocol.a;
import com.whatsapp.protocol.c4;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.ArrayList;

// Referenced classes of package com.whatsapp:
//            App, mk, u5, og, 
//            s0

public class ft
{

    private static final String z[];

    public static int a()
    {
        Object obj;
        int j1;
        j1 = com.whatsapp.App.am;
        obj = (ConnectivityManager)App.au.getSystemService(z[3]);
        if (obj == null) goto _L2; else goto _L1
_L1:
        obj = ((ConnectivityManager) (obj)).getActiveNetworkInfo();
        if (obj == null) goto _L2; else goto _L3
_L3:
        int i1 = ((NetworkInfo) (obj)).getType();
        if (i1 != 0) goto _L5; else goto _L4
_L4:
        obj = (TelephonyManager)App.au.getSystemService(z[4]);
        if (obj == null) goto _L7; else goto _L6
_L6:
        ((TelephonyManager) (obj)).getNetworkType();
        JVM INSTR tableswitch 1 15: default 140
    //                   1 194
    //                   2 182
    //                   3 206
    //                   4 254
    //                   5 266
    //                   6 266
    //                   7 278
    //                   8 218
    //                   9 230
    //                   10 242
    //                   11 314
    //                   12 266
    //                   13 290
    //                   14 302
    //                   15 326;
           goto _L8 _L9 _L10 _L11 _L12 _L13 _L13 _L14 _L15 _L16 _L17 _L18 _L13 _L19 _L20 _L21
_L8:
        int i = bt.CELLULAR_UNKNOWN.getCode();
_L25:
        if (j1 == 0) goto _L22; else goto _L7
_L7:
        i = bt.CELLULAR_UNKNOWN.getCode();
_L22:
        int j = i;
        if (j1 == 0) goto _L24; else goto _L23
_L23:
        j = i;
        if (i1 == 1)
        {
            j = bt.WIFI_UNKNOWN.getCode();
        }
_L24:
        return j;
_L10:
        i = bt.CELLULAR_EDGE.getCode();
        if (j1 == 0) goto _L25; else goto _L9
_L9:
        i = bt.CELLULAR_GPRS.getCode();
        if (j1 == 0) goto _L25; else goto _L11
_L11:
        i = bt.CELLULAR_UMTS.getCode();
        if (j1 == 0) goto _L25; else goto _L15
_L15:
        i = bt.CELLULAR_HSDPA.getCode();
        if (j1 == 0) goto _L25; else goto _L16
_L16:
        i = bt.CELLULAR_HSUPA.getCode();
        if (j1 == 0) goto _L25; else goto _L17
_L17:
        i = bt.CELLULAR_HSPA.getCode();
        if (j1 == 0) goto _L25; else goto _L12
_L12:
        i = bt.CELLULAR_CDMA.getCode();
        if (j1 == 0) goto _L25; else goto _L13
_L13:
        i = bt.CELLULAR_EVDO.getCode();
        if (j1 == 0) goto _L25; else goto _L14
_L14:
        i = bt.CELLULAR_1XRTT.getCode();
        if (j1 == 0) goto _L25; else goto _L19
_L19:
        i = bt.CELLULAR_LTE.getCode();
        if (j1 == 0) goto _L25; else goto _L20
_L20:
        i = bt.CELLULAR_EHRPD.getCode();
        if (j1 == 0) goto _L25; else goto _L18
_L18:
        i = bt.CELLULAR_IDEN.getCode();
        if (j1 == 0) goto _L25; else goto _L21
_L21:
        i = bt.CELLULAR_HSPAP.getCode();
        if (j1 == 0) goto _L25; else goto _L8
_L5:
        i = -1;
          goto _L23
_L2:
        return -1;
    }

    private static int a(n n1)
    {
        if (n1 == n.NETWORK_UNAVAILABLE)
        {
            return ao.NETWORK_UNAVAILABLE.getCode();
        }
        if (n1 == n.IN_PROGRESS)
        {
            return ao.IN_PROGRESS.getCode();
        }
        if (n1 == n.UP_TO_DATE)
        {
            return ao.UP_TO_DATE.getCode();
        }
        if (n1 == n.FAILED)
        {
            return ao.FAILED.getCode();
        }
        if (n1 == n.DELAYED)
        {
            return ao.DELAYED.getCode();
        }
        if (n1 == n.USER_IS_EXPIRED)
        {
            return ao.USER_IS_EXPIRED.getCode();
        } else
        {
            return 0;
        }
    }

    public static void a(Context context)
    {
        boolean flag1 = true;
        int i = App.G();
        Object obj = ag.NETWORK_IS_WIFI;
        ag ag1;
        boolean flag;
        if (i == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        com.whatsapp.fieldstats.z.a(context, ((ag) (obj)), Boolean.valueOf(flag));
        obj = ag.NETWORK_IS_ROAMING;
        if (i == 3)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        com.whatsapp.fieldstats.z.a(context, ((ag) (obj)), Boolean.valueOf(flag));
        i = a();
        ag1 = ag.NETWORK_RADIO_TYPE;
        if (i == -1)
        {
            obj = null;
        } else
        {
            obj = Integer.valueOf(i);
        }
        com.whatsapp.fieldstats.z.a(context, ag1, ((Integer) (obj)));
    }

    public static void a(Context context, com.whatsapp.fieldstats.Events.Call call)
    {
        com.whatsapp.fieldstats.z.a(context, call);
    }

    static void a(Context context, a1 a1_1, long l1)
    {
        an an1 = new an();
        an1.a = Double.valueOf(a1_1.getCode());
        an1.b = Double.valueOf(l1);
        com.whatsapp.fieldstats.z.a(context, an1);
    }

    static void a(Context context, q q1, boolean flag, x x1, long l1, long l2)
    {
        aj aj1 = new aj();
        aj1.c = Double.valueOf(q1.getCode());
        double d1;
        if (flag)
        {
            d1 = 1.0D;
        } else
        {
            d1 = 0.0D;
        }
        aj1.b = Double.valueOf(d1);
        aj1.e = Double.valueOf(x1.getCode());
        aj1.a = Double.valueOf(l1);
        aj1.f = Double.valueOf(l2);
        com.whatsapp.fieldstats.z.a(context, aj1);
    }

    public static void a(Context context, u u1, ak ak1, bo bo1, boolean flag, boolean flag1, int i, int j, 
            long l1)
    {
        am am1 = new am();
        am1.e = Double.valueOf(u1.getCode());
        am1.a = Double.valueOf(ak1.getCode());
        am1.d = Double.valueOf(bo1.getCode());
        double d1;
        if (flag)
        {
            d1 = 1.0D;
        } else
        {
            d1 = 0.0D;
        }
        am1.h = Double.valueOf(d1);
        if (flag1)
        {
            d1 = 1.0D;
        } else
        {
            d1 = 0.0D;
        }
        am1.f = Double.valueOf(d1);
        am1.b = Double.valueOf(i);
        am1.c = Double.valueOf(j);
        am1.g = Double.valueOf(l1);
        com.whatsapp.fieldstats.z.a(context, am1);
    }

    static void a(Context context, c4 c4_1, k k1, long l1, long l2)
    {
        a4 a4_1 = new a4();
        a4_1.b = Double.valueOf(d(c4_1));
        a4_1.d = Double.valueOf(k1.getCode());
        a4_1.c = Double.valueOf(l1);
        a4_1.e = Double.valueOf(l2);
        com.whatsapp.fieldstats.z.a(context, a4_1);
    }

    public static void a(Context context, boolean flag, int i, long l1)
    {
        a0 a0_1 = new a0();
        int j;
        if (flag)
        {
            j = v.OK.getCode();
        } else
        {
            j = v.ERROR_UNKNOWN.getCode();
        }
        a0_1.c = Double.valueOf(j);
        a0_1.b = Double.valueOf(i);
        a0_1.a = Double.valueOf(l1);
        com.whatsapp.fieldstats.z.a(context, a0_1);
    }

    public static void a(Context context, boolean flag, n n1, long l1)
    {
        ai ai1 = new ai();
        double d1;
        int i;
        if (flag)
        {
            d1 = 1.0D;
        } else
        {
            d1 = 0.0D;
        }
        ai1.a = Double.valueOf(d1);
        i = a(n1);
        if (i != 0)
        {
            ai1.d = Double.valueOf(i);
        }
        ai1.b = Double.valueOf(l1);
        com.whatsapp.fieldstats.z.a(context, ai1);
    }

    static void a(o o1)
    {
        a(o1, ((l) (null)));
    }

    static void a(o o1, l l1)
    {
        az az1 = new az();
        az1.b = Double.valueOf(o1.getCode());
        if (l1 != null)
        {
            az1.a = Double.valueOf(l1.getCode());
        }
        com.whatsapp.fieldstats.z.a(App.au, az1);
    }

    static void a(c4 c4_1)
    {
        double d2 = 1.0D;
        if (c4_1 == null)
        {
            return;
        }
        a6 a6_1 = new a6();
        a6_1.g = Double.valueOf(d(c4_1));
        a6_1.c = Double.valueOf(b(c4_1));
        double d1;
        if (a6_1.c.doubleValue() == (double)bs.INDIVIDUAL.getCode() || a6_1.c.doubleValue() == (double)bs.BROADCAST.getCode())
        {
            Boolean boolean1 = c(c4_1);
            if (boolean1 != null)
            {
                if (boolean1.booleanValue())
                {
                    d1 = 1.0D;
                } else
                {
                    d1 = 0.0D;
                }
                a6_1.e = Double.valueOf(d1);
            }
        }
        if (c4_1.j != null)
        {
            d1 = d2;
        } else
        {
            d1 = 0.0D;
        }
        a6_1.b = Double.valueOf(d1);
        com.whatsapp.fieldstats.z.a(App.au.getApplicationContext(), a6_1);
    }

    public static void a(c4 c4_1, long l1)
    {
        double d2 = 0.0D;
        if (c4_1 == null)
        {
            return;
        }
        ay ay1 = new ay();
        ay1.b = Double.valueOf(l1);
        ay1.f = Double.valueOf(d(c4_1));
        ay1.c = Double.valueOf(b(c4_1));
        double d1;
        if (ay1.c.doubleValue() == (double)bs.INDIVIDUAL.getCode())
        {
            Boolean boolean1 = c(c4_1);
            if (boolean1 != null)
            {
                if (boolean1.booleanValue())
                {
                    d1 = 1.0D;
                } else
                {
                    d1 = 0.0D;
                }
                ay1.a = Double.valueOf(d1);
            }
        }
        if (TextUtils.isEmpty(c4_1.b))
        {
            d1 = d2;
        } else
        {
            d1 = 1.0D;
        }
        ay1.h = Double.valueOf(d1);
        com.whatsapp.fieldstats.z.a(App.au.getApplicationContext(), ay1);
    }

    private static long[] a(File file)
    {
        long al[];
        int j;
        j = com.whatsapp.App.am;
        al = new long[2];
        al;
        al[0] = 0L;
        al[1] = 0L;
        if (file != null) goto _L2; else goto _L1
_L1:
        return al;
_L2:
        File afile[] = file.listFiles();
        if (afile == null)
        {
            break; /* Loop/switch isn't completed */
        }
        int i1 = afile.length;
        int i = 0;
label0:
        do
        {
label1:
            {
                if (i >= i1)
                {
                    break label0;
                }
                File file1 = afile[i];
                if (file1.isFile())
                {
                    al[0] = al[0] + file1.length();
                    al[1] = al[1] + 1L;
                    if (j == 0)
                    {
                        break label1;
                    }
                }
                if (file1.isDirectory())
                {
                    long al1[] = a(file1);
                    al[0] = al[0] + al1[0];
                    long l1 = al[1];
                    al[1] = al1[1] + l1;
                }
            }
            i++;
        } while (j == 0);
        if (j == 0) goto _L1; else goto _L3
_L3:
        Log.w((new StringBuilder()).append(z[2]).append(file).toString());
        return al;
    }

    private static double b(c4 c4_1)
    {
        if (c4_1.E)
        {
            return (double)bs.BROADCAST.getCode();
        }
        if (mk.h(c4_1.y.a))
        {
            return (double)bs.GROUP.getCode();
        } else
        {
            return (double)bs.INDIVIDUAL.getCode();
        }
    }

    public static void b()
    {
        int k2 = com.whatsapp.App.am;
        ArrayList arraylist = u5.f();
        int j2 = 0;
        int i = 0;
        int j = 0;
        int k1 = 0;
        do
        {
            int i1;
            int j1;
            int l1;
label0:
            {
label1:
                {
label2:
                    {
                        i1 = i;
                        j1 = j;
                        l1 = k1;
                        if (j2 >= arraylist.size())
                        {
                            break label1;
                        }
                        String s = (String)arraylist.get(j2);
                        i1 = i;
                        j1 = j;
                        l1 = k1;
                        if (s == null)
                        {
                            break label2;
                        }
                        int i2 = j;
                        if (mk.h(s))
                        {
                            i2 = j + 1;
                            i1 = i;
                            j1 = i2;
                            l1 = k1;
                            if (k2 == 0)
                            {
                                break label2;
                            }
                        }
                        i1 = i;
                        if (og.g(s))
                        {
                            i++;
                            i1 = i;
                            j1 = i2;
                            l1 = k1;
                            if (k2 == 0)
                            {
                                break label2;
                            }
                            i1 = i;
                        }
                        l1 = k1 + 1;
                        j1 = i2;
                    }
                    if (k2 == 0)
                    {
                        break label0;
                    }
                }
                com.whatsapp.fieldstats.z.a(App.au, ag.INDIVIDUAL_CHAT_COUNT, Integer.valueOf(l1));
                com.whatsapp.fieldstats.z.a(App.au, ag.GROUP_CHAT_COUNT, Integer.valueOf(j1));
                com.whatsapp.fieldstats.z.a(App.au, ag.BROADCAST_CHAT_COUNT, Integer.valueOf(i1));
                return;
            }
            j2++;
            i = i1;
            j = j1;
            k1 = l1;
        } while (true);
    }

    private static Boolean c(c4 c4_1)
    {
        if (App.Z != null && App.Z.cc != null && c4_1.y != null && c4_1.y.a != null)
        {
            boolean flag;
            if (!c4_1.y.a.startsWith(App.Z.cc))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            return Boolean.valueOf(flag);
        } else
        {
            return null;
        }
    }

    static void c()
    {
        Object obj;
label0:
        {
            obj = com.whatsapp.s0.a((byte)0, 0, false);
            boolean flag;
            try
            {
                if (!((File) (obj)).exists())
                {
                    break label0;
                }
                flag = ((File) (obj)).isDirectory();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                try
                {
                    throw obj;
                }
                // Misplaced declaration of an exception variable
                catch (Object obj)
                {
                    throw obj;
                }
            }
            if (flag)
            {
                break MISSING_BLOCK_LABEL_30;
            }
        }
        return;
        try
        {
            long al[] = a(((File) (obj)));
            com.whatsapp.fieldstats.z.a(App.au, ag.MEDIA_FOLDER_SIZE, Double.valueOf(al[0]));
            com.whatsapp.fieldstats.z.a(App.au, ag.MEDIA_FOLDER_FILE_COUNT, Double.valueOf(al[1]));
            return;
        }
        catch (StackOverflowError stackoverflowerror)
        {
            Log.e(z[0]);
            return;
        }
        catch (OutOfMemoryError outofmemoryerror)
        {
            Log.e(z[1]);
        }
        return;
    }

    private static double d(c4 c4_1)
    {
        switch (c4_1.w)
        {
        default:
            return (double)q.NONE.getCode();

        case 1: // '\001'
            return (double)q.PHOTO.getCode();

        case 3: // '\003'
            return (double)q.VIDEO.getCode();

        case 2: // '\002'
            if (c4_1.n == 1)
            {
                return (double)q.PTT.getCode();
            } else
            {
                return (double)q.AUDIO.getCode();
            }

        case 5: // '\005'
            return (double)q.LOCATION.getCode();

        case 4: // '\004'
            return (double)q.CONTACT.getCode();
        }
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[5];
        obj = "=r#\002\032(o'\032\026>w6\013\f(43\036\032:o#\003\033?r'\b\0217\177#\034\0302~*\n\r/z2\035Q>i4\001\fth2\017\0350t0\013\f=w)\031";
        byte0 = -1;
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
            switch (byte0)
            {
            default:
                as1[i] = ((String) (obj));
                obj = "=r#\002\032(o'\032\026>w6\013\f(43\036\032:o#\003\033?r'\b\0217\177#\034\0302~*\n\r/z2\035Q>i4\001\ftt3\032\021=v#\003\021)b";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "6~\"\007\037=t*\n\033)h/\024\033{w/\035\n>\177\000\007\022>hf\007\r{u3\002\022{})\034^=t*\n\033);";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "8t(\000\0338o/\030\027/b";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                i = 4;
                obj = "+s)\000\033";
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c1 = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 192
    //                   0 215
    //                   1 222
    //                   2 229
    //                   3 236;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_236;
_L3:
        byte byte1 = 126;
_L9:
        obj[j] = (char)(byte1 ^ c1);
        j++;
          goto _L8
_L4:
        byte1 = 91;
          goto _L9
_L5:
        byte1 = 27;
          goto _L9
_L6:
        byte1 = 70;
          goto _L9
        byte1 = 110;
          goto _L9
    }
}
