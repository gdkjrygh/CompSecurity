// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.notification;

import android.content.SharedPreferences;
import android.os.Handler;
import android.os.HandlerThread;
import com.whatsapp.App;
import com.whatsapp.aoz;
import com.whatsapp.g;
import com.whatsapp.k;
import com.whatsapp.og;
import com.whatsapp.protocol.a;
import com.whatsapp.protocol.c4;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

// Referenced classes of package com.whatsapp.notification:
//            PopupNotification, v, w, n

public final class a1
{

    private static a1 d;
    private static final String z[];
    long a;
    private Handler b;
    private v c;
    private final ConcurrentHashMap e = new ConcurrentHashMap();

    public a1()
    {
        a = System.currentTimeMillis() - 200L;
    }

    private Handler a()
    {
        if (b == null)
        {
            HandlerThread handlerthread = new HandlerThread(z[0], 10);
            handlerthread.start();
            b = new Handler(handlerthread.getLooper());
        }
        return b;
    }

    public static a1 c()
    {
        return d;
    }

    public int a(SharedPreferences sharedpreferences, g g1)
    {
label0:
        {
            boolean flag = true;
            int i;
            if (g1 == g.GROUP)
            {
                g1 = sharedpreferences.getString(z[5], z[9]);
                int j;
                try
                {
                    i = Integer.parseInt(g1);
                }
                // Misplaced declaration of an exception variable
                catch (g g1)
                {
                    i = 0;
                }
                j = i;
                if (i == -1)
                {
                    boolean flag1;
                    try
                    {
                        flag1 = sharedpreferences.getBoolean(z[7], false);
                    }
                    // Misplaced declaration of an exception variable
                    catch (SharedPreferences sharedpreferences)
                    {
                        try
                        {
                            throw sharedpreferences;
                        }
                        // Misplaced declaration of an exception variable
                        catch (SharedPreferences sharedpreferences)
                        {
                            throw sharedpreferences;
                        }
                    }
                    if (flag1)
                    {
                        j = 1;
                    } else
                    {
                        j = 0;
                    }
                    g1 = sharedpreferences.edit();
                    g1.putString(z[4], Integer.toString(j));
                    g1.commit();
                }
                if (!PopupNotification.q)
                {
                    break label0;
                }
            }
            g1 = sharedpreferences.getString(z[6], z[3]);
            try
            {
                i = Integer.parseInt(g1);
            }
            // Misplaced declaration of an exception variable
            catch (g g1)
            {
                i = 0;
            }
            j = i;
            if (i == -1)
            {
                try
                {
                    flag1 = sharedpreferences.getBoolean(z[10], false);
                }
                // Misplaced declaration of an exception variable
                catch (SharedPreferences sharedpreferences)
                {
                    throw sharedpreferences;
                }
                if (flag1)
                {
                    i = ((flag) ? 1 : 0);
                } else
                {
                    i = 0;
                }
                sharedpreferences = sharedpreferences.edit();
                sharedpreferences.putString(z[8], Integer.toString(i));
                sharedpreferences.commit();
                j = i;
            }
        }
        return j;
    }

    public int a(g g1)
    {
        return a(App.au.getSharedPreferences(z[2], 0), g1);
    }

    List a(String s)
    {
label0:
        {
            Object obj;
label1:
            {
                if (e.containsKey(s))
                {
                    break label0;
                }
                obj = App.az.e(s);
                if (((og) (obj)).c > 0)
                {
                    obj = Collections.synchronizedList(App.ah.a(s, Math.min(((og) (obj)).c, 7)));
                    if (!PopupNotification.q)
                    {
                        break label1;
                    }
                }
                obj = Collections.synchronizedList(new ArrayList());
            }
            e.put(s, obj);
            return ((List) (obj));
        }
        return (List)e.get(s);
    }

    public void a(String s, c4 c4_1)
    {
        boolean flag;
        boolean flag1;
        flag = false;
        flag1 = PopupNotification.q;
        if (e.containsKey(s)) goto _L2; else goto _L1
_L1:
        Object obj;
label0:
        {
            obj = App.az.e(s);
            if (((og) (obj)).c > 1)
            {
                obj = Collections.synchronizedList(App.ah.a(s, Math.min(((og) (obj)).c, 7)));
                if (!flag1)
                {
                    break label0;
                }
            }
            obj = Collections.synchronizedList(new ArrayList());
        }
        e.put(s, obj);
        if (!flag1) goto _L3; else goto _L2
_L2:
        s = (List)e.get(s);
_L9:
        obj = s.iterator();
_L7:
        if (!((Iterator) (obj)).hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        if (!((c4)((Iterator) (obj)).next()).y.equals(c4_1.y))
        {
            continue; /* Loop/switch isn't completed */
        }
        if (!flag1) goto _L5; else goto _L4
_L4:
        flag = true;
        if (!flag1) goto _L7; else goto _L6
_L6:
        if (!flag)
        {
            try
            {
                s.add(0, c4_1);
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw s;
            }
            do
            {
                if (s.size() <= 7)
                {
                    break;
                }
                s.remove(s.size() - 1);
            } while (!flag1);
        }
        return;
_L5:
        flag = true;
        if (true) goto _L6; else goto _L3
_L3:
        s = ((String) (obj));
        if (true) goto _L9; else goto _L8
_L8:
    }

    public void a(boolean flag, boolean flag1, boolean flag2, boolean flag3)
    {
        v v1 = new v(this, flag, flag1, flag2, flag3);
        v v2 = c;
        NumberFormatException numberformatexception;
        if (v2 != null)
        {
            try
            {
                if (c.equals(v1))
                {
                    a().removeCallbacks(c);
                }
            }
            catch (NumberFormatException numberformatexception1)
            {
                throw numberformatexception1;
            }
        }
        c = v1;
        a().post(c);
        return;
        numberformatexception;
        throw numberformatexception;
    }

    public void b()
    {
        a().post(new w(this));
    }

    public void b(String s)
    {
        a().post(new n(this, s));
    }

    public void b(String s, c4 c4_1)
    {
        boolean flag = PopupNotification.q;
        if (c4_1 == null)
        {
            List list;
            int i;
            try
            {
                e.put(s, Collections.synchronizedList(new ArrayList()));
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw s;
            }
            if (!flag)
            {
                break MISSING_BLOCK_LABEL_105;
            }
        }
        list = (List)e.get(s);
        if (list != null)
        {
            i = list.indexOf(c4_1);
            if (i > -1)
            {
                try
                {
                    list.subList(i, list.size()).clear();
                }
                // Misplaced declaration of an exception variable
                catch (String s)
                {
                    throw s;
                }
            }
            if (!flag)
            {
                break MISSING_BLOCK_LABEL_105;
            }
        }
        Log.c(z[1], null, new Object[] {
            s
        });
        return;
        s;
        throw s;
    }

    public void c(String s)
    {
        b(s, null);
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[11];
        obj = "oM7SjHA\"NeNL0";
        byte0 = -1;
        i = 0;
_L2:
        String as1[];
        int j;
        int l;
        as1 = as;
        obj = ((String) (obj)).toCharArray();
        l = obj.length;
        j = 0;
_L8:
label0:
        {
            if (l > j)
            {
                break label0;
            }
            obj = (new String(((char []) (obj)))).intern();
            switch (byte0)
            {
            default:
                as1[i] = ((String) (obj));
                obj = "LG0ImFG\rUxHD*YmUK,T#SG0_xlG0ImFG0|cSl,NeGK [xHM-\025}S\002/S\177U\002-O`M\002%U~\001\0070";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "BM.\024{IC7ImQR\034J~DD&HiOA&I";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "\f\023";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                obj = "FP,O|~L,NeG[\034JcQW3eaNF&";
                i = 4;
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                i = 5;
                obj = "FP,O|~L,NeG[\034JcQW3eaNF&";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i] = ((String) (obj));
                i = 6;
                obj = "OM7SjX}3U|TR\034WcEG";
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[i] = ((String) (obj));
                i = 7;
                obj = "FP,O|~L,NeG[\034JcQW3";
                byte0 = 6;
                break;

            case 6: // '\006'
                as1[i] = ((String) (obj));
                i = 8;
                obj = "OM7SjX}3U|TR\034WcEG";
                byte0 = 7;
                break;

            case 7: // '\007'
                as1[i] = ((String) (obj));
                i = 9;
                obj = "\f\023";
                byte0 = 8;
                break;

            case 8: // '\b'
                as1[i] = ((String) (obj));
                i = 10;
                obj = "OM7SjX}3U|TR";
                byte0 = 9;
                break;

            case 9: // '\t'
                as1[i] = ((String) (obj));
                z = as;
                d = new a1();
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c1 = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 332
    //                   0 355
    //                   1 362
    //                   2 369
    //                   3 376;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_376;
_L3:
        byte byte1 = 12;
_L9:
        obj[j] = (char)(byte1 ^ c1);
        j++;
          goto _L8
_L4:
        byte1 = 33;
          goto _L9
_L5:
        byte1 = 34;
          goto _L9
_L6:
        byte1 = 67;
          goto _L9
        byte1 = 58;
          goto _L9
    }
}
