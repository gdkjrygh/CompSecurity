// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.backport.util.Base64;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import com.android.vending.billing.IInAppBillingService;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

// Referenced classes of package com.whatsapp:
//            aus, a8g, App, k5, 
//            akd, ad0, j0, al0, 
//            ni, _l, a3y, l4, 
//            yu, f3, si, i3, 
//            nr

public class dc extends HandlerThread
{

    private static final aus c;
    private static final String z[];
    private boolean a;
    private ArrayList b;
    private int d;
    private Handler e;
    private Map f;
    private Map g;
    private akd h;
    private Map i;
    private ArrayList j;
    private boolean k;
    private Context l;
    private String m;

    public dc(Context context)
    {
        super(z[60], 10);
        j = new ArrayList(3);
        f = new ConcurrentHashMap();
        i = new HashMap();
        g = new HashMap();
        b = new ArrayList();
        d = 2;
        a = false;
        k = false;
        j.add("1");
        j.add("3");
        j.add("5");
        i.put("1", z[66]);
        i.put("3", z[64]);
        i.put("5", z[61]);
        l = context.getApplicationContext();
        m = context.getPackageName();
        if (m == null)
        {
            Log.e(z[65]);
            App.a(z[62], false, a8g.CRASH, null);
            m = z[63];
        }
    }

    private int a(Intent intent)
    {
        return a(intent.getExtras().get(z[45]));
    }

    private int a(Bundle bundle)
    {
        return a(bundle.get(z[59]));
    }

    static int a(dc dc1, int i1)
    {
        dc1.d = i1;
        return i1;
    }

    static int a(dc dc1, Bundle bundle)
    {
        return dc1.a(bundle);
    }

    private int a(Object obj)
    {
label0:
        {
            if (obj == null)
            {
                try
                {
                    Log.e(z[8]);
                }
                // Misplaced declaration of an exception variable
                catch (Object obj)
                {
                    throw obj;
                }
                return 0;
            }
            int i1;
            try
            {
                if (!(obj instanceof Integer))
                {
                    break label0;
                }
                i1 = ((Integer)obj).intValue();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw obj;
            }
            return i1;
        }
label1:
        {
            long l1;
            try
            {
                if (!(obj instanceof Long))
                {
                    break label1;
                }
                l1 = ((Long)obj).longValue();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw obj;
            }
            return (int)l1;
        }
        throw new RuntimeException((new StringBuilder()).append(z[7]).append(obj.getClass().getName()).toString());
    }

    static akd a(dc dc1, akd akd1)
    {
        dc1.h = akd1;
        return akd1;
    }

    static aus a()
    {
        return c;
    }

    static String a(dc dc1)
    {
        return dc1.m;
    }

    static void a(dc dc1, Runnable runnable)
    {
        dc1.a(runnable);
    }

    static void a(dc dc1, ArrayList arraylist)
    {
        dc1.a(arraylist);
    }

    private void a(Runnable runnable)
    {
        runnable = new k5(this, runnable);
        Intent intent = (new Intent(z[68])).setPackage(z[67]);
        l.bindService(intent, runnable, 1);
    }

    private void a(ArrayList arraylist)
    {
        int i1;
        i1 = App.am;
        Bundle bundle = new Bundle();
        bundle.putStringArrayList(z[36], arraylist);
        try
        {
            arraylist = h.a.getSkuDetails(3, m, z[38], bundle);
        }
        // Misplaced declaration of an exception variable
        catch (ArrayList arraylist)
        {
            Log.e(z[40]);
            return;
        }
        if (arraylist != null) goto _L2; else goto _L1
_L1:
        Log.e(z[41]);
_L8:
        return;
        arraylist;
        throw arraylist;
_L2:
        int j1 = a(((Bundle) (arraylist)));
        j1;
        JVM INSTR lookupswitch 2: default 112
    //                   0: 180
    //                   6: 150;
           goto _L3 _L4 _L5
_L4:
        break; /* Loop/switch isn't completed */
_L3:
        try
        {
            Log.e((new StringBuilder()).append(z[44]).append(j1).toString());
            throw new IllegalStateException();
        }
        // Misplaced declaration of an exception variable
        catch (ArrayList arraylist)
        {
            throw arraylist;
        }
_L5:
        Log.e((new StringBuilder()).append(z[43]).append(arraylist).toString());
        if (i1 == 0) goto _L7; else goto _L6
_L7:
        break; /* Loop/switch isn't completed */
        arraylist;
        throw arraylist;
_L6:
        try
        {
            if (!arraylist.containsKey(z[39]))
            {
                Log.e((new StringBuilder()).append(z[42]).append(arraylist).toString());
                throw new IllegalStateException();
            }
        }
        // Misplaced declaration of an exception variable
        catch (ArrayList arraylist)
        {
            throw arraylist;
        }
        arraylist = arraylist.getStringArrayList(z[37]).iterator();
        do
        {
            if (!arraylist.hasNext())
            {
                break;
            }
            ad0 ad0_1 = new ad0((String)arraylist.next());
            g.put(ad0_1.a(), ad0_1);
            i.put(ad0_1.a(), ad0_1.b());
        } while (i1 == 0);
        if (i1 == 0) goto _L8; else goto _L3
    }

    static void b(dc dc1)
    {
        dc1.e();
    }

    static ArrayList c(dc dc1)
    {
        return dc1.j;
    }

    static Handler d(dc dc1)
    {
        return dc1.e;
    }

    private void d()
    {
        int i1 = 3;
        int j1 = h.a.isBillingSupported(3, m, z[5]);
        i1 = j1;
_L2:
        this;
        JVM INSTR monitorenter ;
        a = true;
        Object obj;
        boolean flag;
        if (i1 == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        k = flag;
        this;
        JVM INSTR monitorexit ;
        return;
        obj;
        Log.a(z[6], ((Throwable) (obj)));
        if (true) goto _L2; else goto _L1
_L1:
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
    }

    static akd e(dc dc1)
    {
        return dc1.h;
    }

    private void e()
    {
        Object obj;
        Log.i(z[2]);
        obj = h;
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_64;
        }
        obj = h.c;
        if (obj != null)
        {
            IllegalArgumentException illegalargumentexception;
            try
            {
                l.unbindService(h.c);
            }
            catch (IllegalArgumentException illegalargumentexception1)
            {
                Log.e((new StringBuilder()).append(z[3]).append(illegalargumentexception1.toString()).toString());
            }
            catch (NullPointerException nullpointerexception)
            {
                throw nullpointerexception;
            }
            h.c = null;
            h.a = null;
        }
        h = null;
        d = 2;
        return;
        illegalargumentexception;
        throw illegalargumentexception;
    }

    static void f(dc dc1)
    {
        dc1.d();
    }

    static int g(dc dc1)
    {
        return dc1.d;
    }

    public String a(String s)
    {
        s = (String)i.get(s);
        if (s == null)
        {
            try
            {
                throw new IllegalStateException();
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw s;
            }
        } else
        {
            return s;
        }
    }

    public void a(int i1, Intent intent)
    {
        int j1 = App.am;
        Log.i((new StringBuilder()).append(z[53]).append(i1).append(z[48]).append(intent).toString());
        i1;
        JVM INSTR tableswitch -1 0: default 68
    //                   -1 79
    //                   0 358;
           goto _L1 _L2 _L3
_L1:
        try
        {
            throw new IllegalStateException();
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent)
        {
            throw intent;
        }
        intent;
        throw intent;
_L2:
        if (intent == null)
        {
            try
            {
                throw new IllegalStateException(z[54]);
            }
            // Misplaced declaration of an exception variable
            catch (Intent intent)
            {
                throw intent;
            }
        }
        i1 = a(intent);
        i1;
        JVM INSTR tableswitch 0 0: default 128
    //                   0 162;
           goto _L4 _L5
_L4:
        try
        {
            throw new IllegalStateException((new StringBuilder()).append(z[56]).append(i1).toString());
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent)
        {
            throw intent;
        }
_L5:
        String s;
        String s1;
        s = intent.getStringExtra(z[58]);
        s1 = intent.getStringExtra(z[49]);
        Log.i((new StringBuilder()).append(z[57]).append(s).append(z[46]).append(s1).append(z[50]).append(intent.getExtras()).toString());
          goto _L6
        intent;
        throw intent;
_L6:
        if (s == null || s1 == null)
        {
            try
            {
                throw new IllegalStateException(z[51]);
            }
            // Misplaced declaration of an exception variable
            catch (Intent intent)
            {
                throw intent;
            }
        }
        intent = new j0(s, s1);
        String s2 = intent.a();
        try
        {
            if (!ni.a(al0.o, s, s1))
            {
                throw new IllegalStateException((new StringBuilder()).append(z[52]).append(s2).toString());
            }
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent)
        {
            throw intent;
        }
        Log.i(z[55]);
        a(((j0) (intent)));
        if (j1 != 0) goto _L4; else goto _L7
_L7:
        if (j1 == 0)
        {
            break; /* Loop/switch isn't completed */
        }
_L3:
        Log.i(z[47]);
        if (j1 != 0) goto _L1; else goto _L8
_L8:
    }

    public void a(_l _pl)
    {
        j0 j0_1;
        _pl = _pl.a();
        if (_pl == null)
        {
            try
            {
                throw new IllegalStateException();
            }
            // Misplaced declaration of an exception variable
            catch (_l _pl)
            {
                throw _pl;
            }
        }
        j0_1 = (j0)f.get(_pl);
        if (j0_1 == null)
        {
            break MISSING_BLOCK_LABEL_64;
        }
        e.post(new a3y(this, new l4(this, _pl, j0_1)));
        return;
        _pl;
        throw _pl;
    }

    public void a(j0 j0_1)
    {
        String s;
        String s1;
        Log.i((new StringBuilder()).append(z[4]).append(j0_1).toString());
        s1 = j0_1.d();
        s = j0_1.c();
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_99;
        }
        int i1 = s1.length();
        if (i1 > 0 && s != null)
        {
            int j1;
            try
            {
                j1 = s.length();
            }
            // Misplaced declaration of an exception variable
            catch (j0 j0_1)
            {
                throw j0_1;
            }
            if (j1 > 0)
            {
                byte abyte1[] = s1.getBytes();
                byte abyte0[] = Base64.decode(s, 0);
                c.a();
                f.put(abyte1, j0_1);
                App.b(abyte1, abyte0);
            }
        }
        return;
        j0_1;
        throw j0_1;
    }

    public void a(nr nr)
    {
        c.registerObserver(nr);
    }

    public void a(Integer integer, String as[])
    {
        c.a(integer, as);
    }

    public void a(String s, String s1)
    {
        e.post(new a3y(this, new yu(this, s, s1)));
    }

    void a(byte abyte0[], j0 j0_1)
    {
        int i1;
        int j1;
        i1 = App.am;
        String s = j0_1.b();
        String s1 = j0_1.a();
        try
        {
            Log.i((new StringBuilder()).append(z[15]).append(s1).append(z[11]).append(s).toString());
            if (TextUtils.isEmpty(s))
            {
                throw new IllegalStateException(z[12]);
            }
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw abyte0;
        }
        j1 = h.a.consumePurchase(3, m, s);
        j1;
        JVM INSTR lookupswitch 3: default 136
    //                   0: 171
    //                   6: 199
    //                   8: 185;
           goto _L1 _L2 _L3 _L4
_L1:
        try
        {
            throw new IllegalStateException((new StringBuilder()).append(z[9]).append(j1).toString());
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw abyte0;
        }
_L2:
        Log.i(z[14]);
        if (i1 == 0)
        {
            break; /* Loop/switch isn't completed */
        }
_L4:
        Log.i(z[10]);
        if (i1 == 0)
        {
            break; /* Loop/switch isn't completed */
        }
_L3:
        Log.i(z[13]);
        if (i1 != 0) goto _L1; else goto _L5
_L5:
        f.remove(abyte0);
        c.a(j0_1);
        return;
        abyte0;
        try
        {
            throw abyte0;
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[]) { }
        throw abyte0;
    }

    public void b(nr nr)
    {
        c.unregisterObserver(nr);
    }

    public boolean b()
    {
        boolean flag1 = false;
        this;
        JVM INSTR monitorenter ;
        boolean flag2 = a;
        boolean flag;
        flag = flag1;
        if (!flag2)
        {
            break MISSING_BLOCK_LABEL_32;
        }
        flag2 = k;
        flag = flag1;
        if (flag2)
        {
            flag = true;
        }
        Log.i((new StringBuilder()).append(z[0]).append(flag).toString());
        this;
        JVM INSTR monitorexit ;
        return flag;
        Object obj;
        obj;
        throw obj;
        obj;
        throw obj;
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
    }

    public void c()
    {
        boolean flag;
        try
        {
            flag = b();
        }
        catch (RuntimeException runtimeexception)
        {
            throw runtimeexception;
        }
        if (flag) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (!f()) goto _L1; else goto _L3
_L3:
        e.post(new a3y(this, new f3(this)));
        return;
        RuntimeException runtimeexception1;
        runtimeexception1;
        throw runtimeexception1;
    }

    public boolean f()
    {
        boolean flag;
        try
        {
            flag = f.isEmpty();
        }
        catch (RuntimeException runtimeexception)
        {
            throw runtimeexception;
        }
        return !flag;
    }

    void g()
    {
        Object obj;
        int k1;
        k1 = App.am;
        obj = null;
        b = new ArrayList();
_L4:
        obj = h.a.getPurchases(3, m, z[20], ((String) (obj)));
        if (obj != null) goto _L2; else goto _L1
_L1:
        Log.e(z[30]);
_L6:
        return;
_L2:
        int i1 = a(((Bundle) (obj)));
        try
        {
            Log.i((new StringBuilder()).append(z[27]).append(i1).toString());
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw obj;
        }
        if (i1 == 0)
        {
            break MISSING_BLOCK_LABEL_127;
        }
        Log.e((new StringBuilder()).append(z[23]).append(i1).toString());
        return;
        boolean flag;
        try
        {
            flag = ((Bundle) (obj)).containsKey(z[25]);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            try
            {
                throw obj;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj) { }
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
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_174;
        }
        flag = ((Bundle) (obj)).containsKey(z[35]);
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_174;
        }
        if (((Bundle) (obj)).containsKey(z[16]))
        {
            break MISSING_BLOCK_LABEL_193;
        }
        Log.e(z[34]);
        return;
        Object obj1 = ((Bundle) (obj)).getStringArrayList(z[29]);
        ArrayList arraylist = ((Bundle) (obj)).getStringArrayList(z[28]);
        ArrayList arraylist1 = ((Bundle) (obj)).getStringArrayList(z[17]);
        RuntimeException runtimeexception;
        String s;
        String s1;
        Object obj2;
        for (int j1 = 0; j1 >= arraylist.size(); j1++)
        {
            break MISSING_BLOCK_LABEL_462;
        }

        s = (String)arraylist.get(j1);
        s1 = (String)arraylist1.get(j1);
        obj2 = (String)((ArrayList) (obj1)).get(j1);
        Log.i((new StringBuilder()).append(z[19]).append(((String) (obj2))).append(z[18]).append(s).append(z[22]).append(s1).toString());
        if (ni.a(al0.o, s, s1))
        {
            obj2 = new j0(s, s1);
            try
            {
                if (TextUtils.isEmpty(((j0) (obj2)).b()))
                {
                    Log.e(z[24]);
                    Log.i((new StringBuilder()).append(z[31]).append(s).toString());
                }
            }
            // Misplaced declaration of an exception variable
            catch (RuntimeException runtimeexception)
            {
                throw runtimeexception;
            }
            try
            {
                b.add(obj2);
            }
            // Misplaced declaration of an exception variable
            catch (RuntimeException runtimeexception)
            {
                throw runtimeexception;
            }
            if (k1 == 0)
            {
                break MISSING_BLOCK_LABEL_457;
            }
        }
        Log.e((new StringBuilder()).append(z[21]).append(s).append(z[26]).append(s1).toString());
        if (k1 == 0)
        {
            break MISSING_BLOCK_LABEL_552;
        }
        obj1 = ((Bundle) (obj)).getString(z[33]);
        obj = obj1;
        if (!TextUtils.isEmpty(((CharSequence) (obj1)))) goto _L4; else goto _L3
_L3:
        obj = b.iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                continue; /* Loop/switch isn't completed */
            }
            obj1 = (j0)((Iterator) (obj)).next();
            Log.i((new StringBuilder()).append(z[32]).append(obj1).toString());
            a(((j0) (obj1)));
        } while (k1 == 0);
        break; /* Loop/switch isn't completed */
        if (true) goto _L6; else goto _L5
_L5:
    }

    protected void onLooperPrepared()
    {
        Log.i(z[1]);
        e = new si(this);
        a(new a3y(this, new i3(this)));
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i1;
        as = new String[69];
        obj = "CP\024B1]E@B5]P\nJ&\034X\036\0026Z]\001F:T\034\036Z$C^\037[1W\021";
        byte0 = -1;
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
            switch (byte0)
            {
            default:
                as1[i1] = ((String) (obj));
                obj = "CP\024B1]E@B5]P\nJ&\034^\003\0028\\^\035J&\036A\037J$RC\bK";
                i1 = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i1] = ((String) (obj));
                i1 = 2;
                obj = "CP\024B1]E@B5]P\nJ&\034B\b]\"ZR\b\0000ZB\016@:]T\016[";
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i1] = ((String) (obj));
                i1 = 3;
                obj = "CP\024B1]E@B5]P\nJ&\034B\b]\"ZR\b\0000ZB\016@:]T\016[{VI\016J$GX\002At";
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i1] = ((String) (obj));
                i1 = 4;
                obj = "CP\024B1]E@B5]P\nJ&\034C\bK1V\\@_!AR\005N'V\021";
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i1] = ((String) (obj));
                i1 = 5;
                obj = "Z_\f_$";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i1] = ((String) (obj));
                i1 = 6;
                obj = "CP\024B1]E@B5]P\nJ&\034S\004C8Z_\n\002'FA\035@&GT\t";
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[i1] = ((String) (obj));
                i1 = 7;
                obj = "f_\bW$VR\031J0\023E\024_1\023W\002]tZ_\031J:G\021\037J'C^\003\\1\023R\002K1\t\021";
                byte0 = 6;
                break;

            case 6: // '\006'
                as1[i1] = ((String) (obj));
                i1 = 8;
                obj = "CP\024B1]E@B5]P\nJ&\034C\b\\$\\_\036JyP^\tJ{]D\001C{\\Z";
                byte0 = 7;
                break;

            case 7: // '\007'
                as1[i1] = ((String) (obj));
                i1 = 9;
                obj = "CP\024B1]E@B5]P\nJ&\034R\002A'F\\\b\0001AC\002]tAT\036_;]B\b\022";
                byte0 = 8;
                break;

            case 8: // '\b'
                as1[i1] = ((String) (obj));
                i1 = 10;
                obj = "CP\024B1]E@B5]P\nJ&\034R\002A'F\\\b\000'FR\016J'@\034\003@ \036^\032A1W";
                byte0 = 9;
                break;

            case 9: // '\t'
                as1[i1] = ((String) (obj));
                i1 = 11;
                obj = "\023E\002D1]\f";
                byte0 = 10;
                break;

            case 10: // '\n'
                as1[i1] = ((String) (obj));
                i1 = 12;
                obj = "CP\024B1]E@B5]P\nJ&\034R\002A'F\\\b\000 \\Z\bAyZ_\033N8ZU";
                byte0 = 11;
                break;

            case 11: // '\013'
                as1[i1] = ((String) (obj));
                i1 = 13;
                obj = "CP\024B1]E@B5]P\nJ&\034R\002A'F\\\b\0001AC\002]";
                byte0 = 12;
                break;

            case 12: // '\f'
                as1[i1] = ((String) (obj));
                i1 = 14;
                obj = "CP\024B1]E@B5]P\nJ&\034R\002A'F\\\b\000'FR\016J'@";
                byte0 = 13;
                break;

            case 13: // '\r'
                as1[i1] = ((String) (obj));
                i1 = 15;
                obj = "CP\024B1]E@B5]P\nJ&\034R\002A'F\\\b\017'XDP";
                byte0 = 14;
                break;

            case 14: // '\016'
                as1[i1] = ((String) (obj));
                i1 = 16;
                obj = "z\177,\177\004lu,{\025lb$h\032re8}\021l}$|\0";
                byte0 = 15;
                break;

            case 15: // '\017'
                as1[i1] = ((String) (obj));
                i1 = 17;
                obj = "z\177,\177\004lu,{\025lb$h\032re8}\021l}$|\0";
                byte0 = 16;
                break;

            case 16: // '\020'
                as1[i1] = ((String) (obj));
                i1 = 18;
                obj = "\023A\030]7[P\036Ji";
                byte0 = 17;
                break;

            case 17: // '\021'
                as1[i1] = ((String) (obj));
                i1 = 19;
                obj = "CP\024B1]E@B5]P\nJ&\034A\037@7VB\036\002$FC\016G5@T\036\017'XDP";
                byte0 = 18;
                break;

            case 18: // '\022'
                as1[i1] = ((String) (obj));
                i1 = 20;
                obj = "Z_\f_$";
                byte0 = 19;
                break;

            case 19: // '\023'
                as1[i1] = ((String) (obj));
                i1 = 21;
                obj = "CP\024B1]E@B5]P\nJ&\034@\030J&J\034\035Z&PY\f\\1@\036\033J&ZW\004L5GX\002AyUP\004C1W\021\035Z&PY\f\\1\016";
                byte0 = 20;
                break;

            case 20: // '\024'
                as1[i1] = ((String) (obj));
                i1 = 22;
                obj = "\023B\004H:RE\030]1\016";
                byte0 = 21;
                break;

            case 21: // '\025'
                as1[i1] = ((String) (obj));
                i1 = 23;
                obj = "CP\024B1]E@B5]P\nJ&\034V\b[yCD\037L<RB\b\\tAT\036_;]B\b\022";
                byte0 = 22;
                break;

            case 22: // '\026'
                as1[i1] = ((String) (obj));
                i1 = 24;
                obj = "CP\024B1]E@B5]P\nJ&\034T\000_ J\034\031@?V_";
                byte0 = 23;
                break;

            case 23: // '\027'
                as1[i1] = ((String) (obj));
                i1 = 25;
                obj = "z\177,\177\004la8}\027{p>j\013ze(b\013\177x>{";
                byte0 = 24;
                break;

            case 24: // '\030'
                as1[i1] = ((String) (obj));
                i1 = 26;
                obj = "\023B\004H:RE\030]1\016";
                byte0 = 25;
                break;

            case 25: // '\031'
                as1[i1] = ((String) (obj));
                i1 = 27;
                obj = "CP\024B1]E@B5]P\nJ&\034V\b[yCD\037L<RB\b\\{AT\036_;]B\b\025t";
                byte0 = 26;
                break;

            case 26: // '\032'
                as1[i1] = ((String) (obj));
                i1 = 28;
                obj = "z\177,\177\004la8}\027{p>j\013wp9n\013\177x>{";
                byte0 = 27;
                break;

            case 27: // '\033'
                as1[i1] = ((String) (obj));
                i1 = 29;
                obj = "z\177,\177\004la8}\027{p>j\013ze(b\013\177x>{";
                byte0 = 28;
                break;

            case 28: // '\034'
                as1[i1] = ((String) (obj));
                i1 = 30;
                obj = "CP\024B1]E@B5]P\nJ&\034V\b[yCD\037L<RB\b\\{]D\001C";
                byte0 = 29;
                break;

            case 29: // '\035'
                as1[i1] = ((String) (obj));
                i1 = 31;
                obj = "CP\024B1]E@B5]P\nJ&\034A\030]7[P\036Jt";
                byte0 = 30;
                break;

            case 30: // '\036'
                as1[i1] = ((String) (obj));
                i1 = 32;
                obj = "CP\024B1]E@B5]P\nJ&\034A\037@7VB\036\002$FC\016G5@T\036\000&VU\bJ9\036A\030]7[P\036Jt";
                byte0 = 31;
                break;

            case 31: // '\037'
                as1[i1] = ((String) (obj));
                i1 = 33;
                obj = "z\177,\177\004lr\"a\000z\1778n\000z~#p\000|z(a";
                byte0 = 32;
                break;

            case 32: // ' '
                as1[i1] = ((String) (obj));
                i1 = 34;
                obj = "CP\024B1]E@B5]P\nJ&\034V\b[yCD\037L<RB\b\\{QP\t\002&VB\035@:@T";
                byte0 = 33;
                break;

            case 33: // '!'
                as1[i1] = ((String) (obj));
                i1 = 35;
                obj = "z\177,\177\004la8}\027{p>j\013wp9n\013\177x>{";
                byte0 = 34;
                break;

            case 34: // '"'
                as1[i1] = ((String) (obj));
                i1 = 36;
                obj = "ze(b\013zu2c\035`e";
                byte0 = 35;
                break;

            case 35: // '#'
                as1[i1] = ((String) (obj));
                i1 = 37;
                obj = "wt9n\035\177b2c\035`e";
                byte0 = 36;
                break;

            case 36: // '$'
                as1[i1] = ((String) (obj));
                i1 = 38;
                obj = "Z_\f_$";
                byte0 = 37;
                break;

            case 37: // '%'
                as1[i1] = ((String) (obj));
                i1 = 39;
                obj = "wt9n\035\177b2c\035`e";
                byte0 = 38;
                break;

            case 38: // '&'
                as1[i1] = ((String) (obj));
                i1 = 40;
                obj = "CP\024B1]E@B5]P\nJ&\034V\b[y@Z\030\0020VE\fF8@\036\003_1";
                byte0 = 39;
                break;

            case 39: // '\''
                as1[i1] = ((String) (obj));
                i1 = 41;
                obj = "CP\024B1]E@B5]P\nJ&\034V\b[y@Z\030\0020VE\fF8@\036\003Z8_";
                byte0 = 40;
                break;

            case 40: // '('
                as1[i1] = ((String) (obj));
                i1 = 42;
                obj = "CP\024B1]E@B5]P\nJ&\034V\b[y@Z\030\0020VE\fF8@\036\000F'@X\003HyXT\024\0170VE\fF8@\f";
                byte0 = 41;
                break;

            case 41: // ')'
                as1[i1] = ((String) (obj));
                i1 = 43;
                obj = "CP\024B1]E@B5]P\nJ&\034V\b[y@Z\030\0020VE\fF8@\036\b]&\\CM";
                byte0 = 42;
                break;

            case 42: // '*'
                as1[i1] = ((String) (obj));
                i1 = 44;
                obj = "CP\024B1]E@B5]P\nJ&\034V\b[y@Z\030\0020VE\fF8@\021\037J'C^\003\\1\016";
                byte0 = 43;
                break;

            case 43: // '+'
                as1[i1] = ((String) (obj));
                i1 = 45;
                obj = "at>\177\033}b(p\027|u(";
                byte0 = 44;
                break;

            case 44: // ','
                as1[i1] = ((String) (obj));
                i1 = 46;
                obj = "\023B\004H:RE\030]1\016";
                byte0 = 45;
                break;

            case 45: // '-'
                as1[i1] = ((String) (obj));
                obj = "CP\024B1]E@B5]P\nJ&\034R\fA7V]\bK";
                byte0 = 46;
                i1 = 47;
                break;

            case 46: // '.'
                as1[i1] = ((String) (obj));
                i1 = 48;
                obj = "\023X\003[1]EP";
                byte0 = 47;
                break;

            case 47: // '/'
                as1[i1] = ((String) (obj));
                obj = "z\177,\177\004lu,{\025lb$h\032re8}\021";
                byte0 = 48;
                i1 = 49;
                break;

            case 48: // '0'
                as1[i1] = ((String) (obj));
                i1 = 50;
                obj = "\023T\025[&RBP";
                byte0 = 49;
                break;

            case 49: // '1'
                as1[i1] = ((String) (obj));
                obj = "CP\024B1]E@B5]P\nJ&\034T\037];A\036\030A?]^\032A";
                byte0 = 50;
                i1 = 51;
                break;

            case 50: // '2'
                as1[i1] = ((String) (obj));
                i1 = 52;
                obj = "CP\024B1]E@B5]P\nJ&\034A\030]7[P\036J{@X\nA5GD\037J{UP\004C1W\021\036D!\016";
                byte0 = 51;
                break;

            case 51: // '3'
                as1[i1] = ((String) (obj));
                i1 = 53;
                obj = "CP\024B1]E@B5]P\nJ&\034P\016[=EX\031VyAT\036Z8G\021\037J'F]\031\022";
                byte0 = 52;
                break;

            case 52: // '4'
                as1[i1] = ((String) (obj));
                i1 = 54;
                obj = "CP\024B1]E@B5]P\nJ&\034^\003\0025PE\004Y=GH@]1@D\001[tZ_\031J:G\f\003Z8_";
                byte0 = 53;
                break;

            case 53: // '5'
                as1[i1] = ((String) (obj));
                i1 = 55;
                obj = "CP\024B1]E@B5]P\nJ&\034A\030]7[P\036J{@X\nA5GD\037J{ET\037F2ZT\t";
                byte0 = 54;
                break;

            case 54: // '6'
                as1[i1] = ((String) (obj));
                i1 = 56;
                obj = "CP\024B1]E@B5]P\nJ&\034^\003\0025PE\004Y=GH@]1@D\001[tAT\036_;]B\b\022";
                byte0 = 55;
                break;

            case 55: // '7'
                as1[i1] = ((String) (obj));
                i1 = 57;
                obj = "CP\024B1]E@B5]P\nJ&\034B\030L7VB\036\0170RE\f\022";
                byte0 = 56;
                break;

            case 56: // '8'
                as1[i1] = ((String) (obj));
                i1 = 58;
                obj = "z\177,\177\004la8}\027{p>j\013wp9n";
                byte0 = 57;
                break;

            case 57: // '9'
                as1[i1] = ((String) (obj));
                i1 = 59;
                obj = "at>\177\033}b(p\027|u(";
                byte0 = 58;
                break;

            case 58: // ':'
                as1[i1] = ((String) (obj));
                i1 = 60;
                obj = "CP\024B1]E";
                byte0 = 59;
                break;

            case 59: // ';'
                as1[i1] = ((String) (obj));
                i1 = 61;
                obj = "fbI\034z\004\0";
                byte0 = 60;
                break;

            case 60: // '<'
                as1[i1] = ((String) (obj));
                i1 = 62;
                obj = "]D\001CtCP\016D5TTMA5^T";
                byte0 = 61;
                break;

            case 61: // '='
                as1[i1] = ((String) (obj));
                i1 = 63;
                obj = "P^\000\001#[P\031\\5CA";
                byte0 = 62;
                break;

            case 62: // '>'
                as1[i1] = ((String) (obj));
                i1 = 64;
                obj = "fbI\035z\005\006";
                byte0 = 63;
                break;

            case 63: // '?'
                as1[i1] = ((String) (obj));
                i1 = 65;
                obj = "CP\024B1]E@B5]P\nJ&\034A\fL?RV\b\002:R\\\b\000:F]\001";
                byte0 = 64;
                break;

            case 64: // '@'
                as1[i1] = ((String) (obj));
                i1 = 66;
                obj = "fbI\037z\n\b";
                byte0 = 65;
                break;

            case 65: // 'A'
                as1[i1] = ((String) (obj));
                i1 = 67;
                obj = "P^\000\0015]U\037@=W\037\033J:WX\003H";
                byte0 = 66;
                break;

            case 66: // 'B'
                as1[i1] = ((String) (obj));
                i1 = 68;
                obj = "P^\000\0015]U\037@=W\037\033J:WX\003HzQX\001C=]VCf:rA\035m=_]\004A3`T\037Y=PTCm\035}u";
                byte0 = 67;
                break;

            case 67: // 'C'
                as1[i1] = ((String) (obj));
                z = as;
                c = new aus(null);
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c1 = obj[j1];
        j1 % 5;
        JVM INSTR tableswitch 0 3: default 1612
    //                   0 1635
    //                   1 1642
    //                   2 1649
    //                   3 1656;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_1656;
_L3:
        byte byte1 = 84;
_L9:
        obj[j1] = (char)(byte1 ^ c1);
        j1++;
          goto _L8
_L4:
        byte1 = 51;
          goto _L9
_L5:
        byte1 = 49;
          goto _L9
_L6:
        byte1 = 109;
          goto _L9
        byte1 = 47;
          goto _L9
    }
}
