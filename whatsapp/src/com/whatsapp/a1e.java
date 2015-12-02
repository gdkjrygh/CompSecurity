// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Handler;
import com.whatsapp.protocol.bx;
import com.whatsapp.protocol.cr;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.whatsapp:
//            p6, App, k, LocationSharingService, 
//            auh, pk, yi, d_, 
//            aun

public class a1e
    implements bx
{

    public static final a1e g;
    private static final String z[];
    private Runnable a;
    private final ArrayList b = new ArrayList();
    private final ArrayList c = new ArrayList();
    private final Object d = new Object();
    private HashMap e;
    private final HashMap f = new HashMap();

    public a1e()
    {
        a = new p6(this);
    }

    static ArrayList a(a1e a1e1)
    {
        return a1e1.c;
    }

    static HashMap b(a1e a1e1)
    {
        return a1e1.e;
    }

    private void b()
    {
        Object obj;
        String s;
        int j;
        j = App.am;
        e = new HashMap();
        obj = App.au.getSharedPreferences(z[5], 0);
        s = ((SharedPreferences) (obj)).getString(z[4], "");
        Log.i((new StringBuilder()).append(z[2]).append(s).toString());
        if (s.length() <= 0) goto _L2; else goto _L1
_L1:
        String as[];
        boolean flag1;
        int i;
        as = s.split(",");
        i = as.length - 1;
        flag1 = false;
_L4:
        boolean flag;
label0:
        {
            flag = flag1;
            if (i < 0)
            {
                break; /* Loop/switch isn't completed */
            }
            String s2 = as[i];
            flag = flag1;
            if (s2.length() <= 1)
            {
                break label0;
            }
            String as1[] = s2.split("#");
            if (App.az.c(as1[0]) != null)
            {
                flag = flag1;
                if (e.containsKey(as1[0]))
                {
                    Log.e((new StringBuilder()).append(z[6]).append(as1[0]).toString());
                    if (j == 0)
                    {
                        break MISSING_BLOCK_LABEL_339;
                    }
                    flag = true;
                }
                e.put(as1[0], Long.valueOf(Long.parseLong(as1[1])));
                if (j == 0)
                {
                    break label0;
                }
            }
            flag = true;
        }
_L5:
        i--;
        flag1 = flag;
        if (j == 0) goto _L4; else goto _L3
_L3:
        if (flag)
        {
            String s1;
label1:
            {
                obj = ((SharedPreferences) (obj)).edit();
                s1 = c();
                if (e.isEmpty())
                {
                    ((android.content.SharedPreferences.Editor) (obj)).remove(z[3]);
                    if (j == 0)
                    {
                        break label1;
                    }
                }
                ((android.content.SharedPreferences.Editor) (obj)).putString(z[9], s1);
            }
            Log.e((new StringBuilder()).append(z[8]).append(s1).toString());
            if (!((android.content.SharedPreferences.Editor) (obj)).commit())
            {
                Log.e(z[7]);
            }
        }
_L2:
        d();
        return;
        flag = true;
          goto _L5
    }

    static Object c(a1e a1e1)
    {
        return a1e1.d;
    }

    private String c()
    {
        int i = App.am;
        StringBuilder stringbuilder = new StringBuilder();
        Iterator iterator = e.entrySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Object obj = (java.util.Map.Entry)iterator.next();
            String s = (String)((java.util.Map.Entry) (obj)).getKey();
            obj = (Long)((java.util.Map.Entry) (obj)).getValue();
            if (stringbuilder.length() != 0)
            {
                stringbuilder.append(',');
            }
            stringbuilder.append(s).append('#').append(obj);
        } while (i == 0);
        return stringbuilder.toString();
    }

    private void d()
    {
        Object obj;
        int i;
        i = App.am;
        App.au.ab().removeCallbacks(a);
        obj = null;
        Object obj2 = d;
        obj2;
        JVM INSTR monitorenter ;
        Iterator iterator = e.entrySet().iterator();
_L7:
        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        Long long1 = (Long)((java.util.Map.Entry)iterator.next()).getValue();
        Object obj1 = long1;
        if (obj == null) goto _L4; else goto _L3
_L3:
        if (long1.longValue() < ((Long) (obj)).longValue())
        {
            obj1 = long1;
        } else
        {
            obj1 = obj;
        }
          goto _L4
_L6:
        obj2;
        JVM INSTR monitorexit ;
        if (obj1 != null && ((Long) (obj1)).longValue() > System.currentTimeMillis())
        {
            App.au.ab().postDelayed(a, ((Long) (obj1)).longValue() - System.currentTimeMillis());
        }
        return;
        obj;
        obj2;
        JVM INSTR monitorexit ;
        throw obj;
_L2:
        obj1 = obj;
        if (true) goto _L6; else goto _L5
_L5:
        obj = obj1;
          goto _L7
_L4:
        if (i == 0) goto _L5; else goto _L6
    }

    static void d(a1e a1e1)
    {
        a1e1.d();
    }

    public int a(String s, long l)
    {
        Log.i((new StringBuilder()).append(z[29]).append(s).append(z[27]).append(l).toString());
        if (b(s))
        {
            s = new Intent(App.au, com/whatsapp/LocationSharingService);
            s.setAction(z[26]);
            s.putExtra(z[25], l);
            App.au.startService(s);
            return 0;
        } else
        {
            Log.w((new StringBuilder()).append(z[24]).append(s).append(z[28]).toString());
            return 401;
        }
    }

    public ArrayList a(String s)
    {
        int i = App.am;
        HashMap hashmap = f;
        hashmap;
        JVM INSTR monitorenter ;
        ArrayList arraylist;
        arraylist = new ArrayList();
        s = (ArrayList)f.get(s);
        if (s == null) goto _L2; else goto _L1
_L1:
        s = s.iterator();
_L5:
        if (!s.hasNext()) goto _L2; else goto _L3
_L3:
        cr cr1 = (cr)s.next();
        if (cr1.a() && cr1.i + 0x6ddd00L > System.currentTimeMillis())
        {
            arraylist.add(cr1);
        }
          goto _L4
_L2:
        hashmap;
        JVM INSTR monitorexit ;
        return arraylist;
        s;
        hashmap;
        JVM INSTR monitorexit ;
        throw s;
_L4:
        if (i == 0) goto _L5; else goto _L2
    }

    public void a()
    {
        Log.i(z[1]);
        Intent intent = new Intent(App.au, com/whatsapp/LocationSharingService);
        intent.setAction(z[0]);
        App.au.startService(intent);
    }

    public void a(auh auh1)
    {
        if (!b.contains(auh1))
        {
            b.add(auh1);
        }
    }

    public void a(aun aun)
    {
        if (!c.contains(aun))
        {
            c.add(aun);
        }
    }

    public void a(cr cr1)
    {
        int i;
        i = App.am;
        Log.i((new StringBuilder()).append(z[10]).append(cr1).toString());
        Object obj = f;
        obj;
        JVM INSTR monitorenter ;
        Iterator iterator = f.values().iterator();
_L5:
        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        Iterator iterator1 = ((ArrayList)iterator.next()).iterator();
_L4:
        if (!iterator1.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        cr cr2 = (cr)iterator1.next();
        if (!cr2.g.equals(cr1.g))
        {
            continue; /* Loop/switch isn't completed */
        }
        cr2.e = cr1.e;
        cr2.d = cr1.d;
        cr2.f = cr1.f;
        cr2.c = cr1.c;
        cr2.h = cr1.h;
        cr2.i = cr1.i;
        if (i == 0)
        {
            break; /* Loop/switch isn't completed */
        }
        continue; /* Loop/switch isn't completed */
_L2:
        obj;
        JVM INSTR monitorexit ;
        obj = b.iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            ((auh)((Iterator) (obj)).next()).a(cr1);
        } while (i == 0);
        return;
        cr1;
        obj;
        JVM INSTR monitorexit ;
        throw cr1;
        if (i == 0) goto _L4; else goto _L3
_L3:
        if (i == 0) goto _L5; else goto _L2
    }

    public void a(String s, long l)
    {
        synchronized (d)
        {
            if (e == null)
            {
                b();
            }
            e.put(s, Long.valueOf(l));
            android.content.SharedPreferences.Editor editor = App.au.getSharedPreferences(z[17], 0).edit();
            editor.putString(z[15], c());
            if (!editor.commit())
            {
                Log.e(z[16]);
            }
        }
        d();
        App.au.ab().post(new pk(this, s));
        return;
        s;
        obj;
        JVM INSTR monitorexit ;
        throw s;
    }

    public void a(String s, String s1)
    {
        int i;
        i = App.am;
        Log.i((new StringBuilder()).append(z[18]).append(s1).append(z[19]).append(s).toString());
        HashMap hashmap = f;
        hashmap;
        JVM INSTR monitorenter ;
        ArrayList arraylist = (ArrayList)f.get(s);
        if (arraylist != null)
        {
            break MISSING_BLOCK_LABEL_87;
        }
        arraylist = new ArrayList();
        f.put(s, arraylist);
        boolean flag = false;
        Iterator iterator1 = arraylist.iterator();
_L6:
        if (!iterator1.hasNext()) goto _L2; else goto _L1
_L1:
        if (!((cr)iterator1.next()).g.equals(s1)) goto _L4; else goto _L3
_L3:
        boolean flag1;
        flag1 = true;
        flag = true;
        if (i == 0) goto _L2; else goto _L5
_L5:
        flag = flag1;
          goto _L4
_L2:
        if (flag)
        {
            break MISSING_BLOCK_LABEL_171;
        }
        cr cr1 = new cr();
        cr1.g = s1;
        arraylist.add(cr1);
        hashmap;
        JVM INSTR monitorexit ;
        Iterator iterator = b.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            ((auh)iterator.next()).b(s, s1);
        } while (i == 0);
        return;
        s;
        hashmap;
        JVM INSTR monitorexit ;
        throw s;
_L4:
        if (i == 0) goto _L6; else goto _L2
    }

    public void a(String s, cr acr[])
    {
        int i;
        i = App.am;
        Log.i((new StringBuilder()).append(z[11]).append(s).append(" ").append(acr.length).toString());
        HashMap hashmap = f;
        hashmap;
        JVM INSTR monitorenter ;
        ArrayList arraylist = (ArrayList)f.get(s);
        Object obj;
        obj = arraylist;
        if (arraylist != null)
        {
            break MISSING_BLOCK_LABEL_97;
        }
        obj = new ArrayList();
        f.put(s, obj);
        s = ((String) (obj));
        if (i == 0)
        {
            break MISSING_BLOCK_LABEL_103;
        }
        ((ArrayList) (obj)).clear();
        s = ((String) (obj));
        s.addAll(Arrays.asList(acr));
        s = s.iterator();
_L5:
        if (!s.hasNext()) goto _L2; else goto _L1
_L1:
        acr = (cr)s.next();
        Log.i((new StringBuilder()).append(z[12]).append(((cr) (acr)).g).append(" ").append(acr.a()).toString());
        if (!acr.a()) goto _L4; else goto _L3
_L3:
        obj = b.iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            ((auh)((Iterator) (obj)).next()).a(acr);
        } while (i == 0);
          goto _L4
_L2:
        hashmap;
        JVM INSTR monitorexit ;
        return;
        s;
        hashmap;
        JVM INSTR monitorexit ;
        throw s;
_L4:
        if (i == 0) goto _L5; else goto _L2
    }

    public void b(auh auh1)
    {
        b.remove(auh1);
    }

    public void b(aun aun)
    {
        c.remove(aun);
    }

    public void b(String s, String s1)
    {
        int i;
        i = App.am;
        Log.i((new StringBuilder()).append(z[14]).append(s1).append(z[13]).append(s).toString());
        Object obj = f;
        obj;
        JVM INSTR monitorenter ;
        ArrayList arraylist = (ArrayList)f.get(s);
        if (arraylist == null) goto _L2; else goto _L1
_L1:
        Iterator iterator = arraylist.iterator();
_L6:
        if (!iterator.hasNext()) goto _L2; else goto _L3
_L3:
        cr cr1 = (cr)iterator.next();
        if (!cr1.g.equals(s1)) goto _L5; else goto _L4
_L4:
        arraylist.remove(cr1);
        if (i == 0) goto _L2; else goto _L5
_L2:
        obj;
        JVM INSTR monitorexit ;
        obj = b.iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            ((auh)((Iterator) (obj)).next()).a(s, s1);
        } while (i == 0);
        return;
        s;
        obj;
        JVM INSTR monitorexit ;
        throw s;
_L5:
        if (i == 0) goto _L6; else goto _L2
    }

    public boolean b(String s)
    {
        Object obj = d;
        obj;
        JVM INSTR monitorenter ;
        long l;
        if (e == null)
        {
            b();
        }
        if (!e.containsKey(s))
        {
            break MISSING_BLOCK_LABEL_67;
        }
        l = ((Long)e.get(s)).longValue();
        if (l == 0L)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        if (l <= System.currentTimeMillis())
        {
            break MISSING_BLOCK_LABEL_62;
        }
        obj;
        JVM INSTR monitorexit ;
        return true;
        c(s);
        obj;
        JVM INSTR monitorexit ;
        return false;
        s;
        obj;
        JVM INSTR monitorexit ;
        throw s;
    }

    public void c(String s)
    {
label0:
        {
            synchronized (d)
            {
                if (e == null)
                {
                    b();
                }
                if ((Long)e.remove(s) != null)
                {
                    break label0;
                }
            }
            return;
        }
        android.content.SharedPreferences.Editor editor;
label1:
        {
            editor = App.au.getSharedPreferences(z[22], 0).edit();
            String s1 = c();
            if (e.isEmpty())
            {
                editor.remove(z[23]);
                if (App.am == 0)
                {
                    break label1;
                }
            }
            editor.putString(z[20], s1);
        }
        if (!editor.commit())
        {
            Log.e(z[21]);
        }
        App.au.ab().post(new yi(this, s));
        obj;
        JVM INSTR monitorexit ;
        d();
        App.au.ab().post(new d_(this, s));
        return;
        s;
        obj;
        JVM INSTR monitorexit ;
        throw s;
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[30];
        obj = "B?t9sI1mdeQ 7Dl@\"|[kB1m~kO\003|erH3|9Wu\037I";
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
                obj = "M?zvpH?wdiF\"6xjr$vgHN3xcmN>KrtN\"m~jF";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                i = 2;
                obj = "M?zvpH?wdiF\"6~jH$FdaU$pycRj";
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                i = 3;
                obj = "M?zvpH?wHwI1k~jF";
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                obj = "M?zvpH?wHwI1k~jF";
                byte0 = 3;
                i = 4;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                i = 5;
                obj = "B?t9sI1mdeQ FgvD6|eaO3|d";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i] = ((String) (obj));
                i = 6;
                obj = "M?zvpH?wdiF\"6~jH$FdaU$pycRp~ekT 9ykUp|otD3mr`";
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[i] = ((String) (obj));
                i = 7;
                obj = "M?zvpH?wdiF\"6btE1mr[R5mcmO7j8b@9ur`";
                byte0 = 6;
                break;

            case 6: // '\006'
                as1[i] = ((String) (obj));
                i = 8;
                obj = "M?zvpH?wdiF\"6btE1mr[R5mcmO7j-";
                byte0 = 7;
                break;

            case 7: // '\007'
                as1[i] = ((String) (obj));
                i = 9;
                obj = "M?zvpH?wHwI1k~jF";
                byte0 = 8;
                break;

            case 8: // '\b'
                as1[i] = ((String) (obj));
                i = 10;
                obj = "M?zvpH?wdiF\"6xjq1kcmB9ivjU\034vteU9vy+";
                byte0 = 9;
                break;

            case 9: // '\t'
                as1[i] = ((String) (obj));
                i = 11;
                obj = "M?zvpH?wdiF\"6xjq1kcmB9ivjU#J\177eS9wpHN3xcmN>6";
                byte0 = 10;
                break;

            case 10: // '\n'
                as1[i] = ((String) (obj));
                i = 12;
                obj = "M?zvpH?wdiF\"6xjq1kcmB9ivjU#J\177eS9wpHN3xcmN>6}mEj";
                byte0 = 11;
                break;

            case 11: // '\013'
                as1[i] = ((String) (obj));
                i = 13;
                obj = "\0017kxqQj";
                byte0 = 12;
                break;

            case 12: // '\f'
                as1[i] = ((String) (obj));
                i = 14;
                obj = "M?zvpH?wdiF\"6xjq1kcmB9ivjU\003mxtQ5}Dl@\"pycm?zvpH?w8";
                byte0 = 13;
                break;

            case 13: // '\r'
                as1[i] = ((String) (obj));
                i = 15;
                obj = "M?zvpH?wHwI1k~jF";
                byte0 = 14;
                break;

            case 14: // '\016'
                as1[i] = ((String) (obj));
                i = 16;
                obj = "M?zvpH?wdiF\"6daU$pycR\177\177vmM5}";
                byte0 = 15;
                break;

            case 15: // '\017'
                as1[i] = ((String) (obj));
                i = 17;
                obj = "B?t9sI1mdeQ FgvD6|eaO3|d";
                byte0 = 16;
                break;

            case 16: // '\020'
                as1[i] = ((String) (obj));
                i = 18;
                obj = "M?zvpH?wdiF\"6xjq1kcmB9ivjU\003mvvU5}Dl@\"pycm?zvpH?w8";
                byte0 = 17;
                break;

            case 17: // '\021'
                as1[i] = ((String) (obj));
                i = 19;
                obj = "\0017kxqQj";
                byte0 = 18;
                break;

            case 18: // '\022'
                as1[i] = ((String) (obj));
                i = 20;
                obj = "M?zvpH?wHwI1k~jF";
                byte0 = 19;
                break;

            case 19: // '\023'
                as1[i] = ((String) (obj));
                i = 21;
                obj = "M?zvpH?wdiF\"6daU$pycR\177krwD$6qeH<|s";
                byte0 = 20;
                break;

            case 20: // '\024'
                as1[i] = ((String) (obj));
                i = 22;
                obj = "B?t9sI1mdeQ FgvD6|eaO3|d";
                byte0 = 21;
                break;

            case 21: // '\025'
                as1[i] = ((String) (obj));
                obj = "M?zvpH?wHwI1k~jF";
                byte0 = 22;
                i = 23;
                break;

            case 22: // '\026'
                as1[i] = ((String) (obj));
                i = 24;
                obj = "M?zvpH?wdiF\"6xjr$xepm?zvpH?wEaQ?kcmO76";
                byte0 = 23;
                break;

            case 23: // '\027'
                as1[i] = ((String) (obj));
                obj = "E%kvpH?w";
                byte0 = 24;
                i = 25;
                break;

            case 24: // '\030'
                as1[i] = ((String) (obj));
                i = 26;
                obj = "B?t9sI1mdeQ 7Dl@\"|[kB1m~kO\003|erH3|9Wu\021KC";
                byte0 = 25;
                break;

            case 25: // '\031'
                as1[i] = ((String) (obj));
                i = 27;
                obj = "\0014leeU9vy>";
                byte0 = 26;
                break;

            case 26: // '\032'
                as1[i] = ((String) (obj));
                i = 28;
                obj = "\0014pdeC<|s";
                byte0 = 27;
                break;

            case 27: // '\033'
                as1[i] = ((String) (obj));
                i = 29;
                obj = "M?zvpH?wdiF\"6xjr$xepm?zvpH?wEaQ?kcmO76";
                byte0 = 28;
                break;

            case 28: // '\034'
                as1[i] = ((String) (obj));
                z = as;
                g = new a1e();
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c1 = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 752
    //                   0 774
    //                   1 781
    //                   2 788
    //                   3 795;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_795;
_L3:
        byte byte1 = 4;
_L9:
        obj[j] = (char)(byte1 ^ c1);
        j++;
          goto _L8
_L4:
        byte1 = 33;
          goto _L9
_L5:
        byte1 = 80;
          goto _L9
_L6:
        byte1 = 25;
          goto _L9
        byte1 = 23;
          goto _L9
    }
}
