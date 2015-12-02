// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.c2dm;

import android.app.AlarmManager;
import android.app.IntentService;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import com.whatsapp.App;
import com.whatsapp.util.Log;
import java.util.Random;

// Referenced classes of package com.whatsapp.c2dm:
//            a

public class C2DMRegistrar extends IntentService
{

    private static final String b;
    public static boolean c;
    private static final String e;
    private static final String z[];
    private final a a = new a(this);
    private final Random d = new Random();

    public C2DMRegistrar()
    {
        super(b);
    }

    private long a()
    {
        int i = a.b();
        if (i == 0)
        {
            return 0L;
        } else
        {
            i = Math.min(i - 1, 10);
            double d1 = d.nextDouble();
            return (long)((double)((1L << i) * 15000L) * (d1 + 0.5D));
        }
    }

    public static void a(Context context)
    {
        Log.i(z[18]);
        Intent intent = new Intent(z[19]);
        intent.putExtra(z[20], z[21]);
        a(context, intent);
    }

    static void a(Context context, Intent intent)
    {
        intent.setClassName(context, b);
        context.startService(intent);
    }

    public static void a(Context context, String s)
    {
        Intent intent = new Intent(e);
        if (s != null)
        {
            try
            {
                intent.putExtra(z[32], s);
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                throw context;
            }
        }
        a(context, intent);
    }

    private void a(String s)
    {
        App.a(s, z[31]);
    }

    private void a(boolean flag)
    {
        Object obj;
        PendingIntent pendingintent;
        boolean flag1;
        flag1 = c;
        Log.i(z[9]);
        obj = (new Intent(z[11])).setPackage(z[8]).putExtra(z[10], PendingIntent.getBroadcast(this, 0, new Intent(), 0)).putExtra(z[13], z[17]);
        pendingintent = PendingIntent.getService(this, 0, ((Intent) (obj)), 0x20000000);
        if (flag || pendingintent == null) goto _L2; else goto _L1
_L1:
        Log.i(z[14]);
_L4:
        return;
        obj;
        throw obj;
_L2:
        AlarmManager alarmmanager;
        long l;
        l = a();
        if (l <= 0L)
        {
            break; /* Loop/switch isn't completed */
        }
        Log.b(z[7], null, new Object[] {
            Long.valueOf(l)
        });
        pendingintent = PendingIntent.getService(this, 0, ((Intent) (obj)), 0);
        alarmmanager = (AlarmManager)getSystemService(z[16]);
        if (android.os.Build.VERSION.SDK_INT < 19)
        {
            break MISSING_BLOCK_LABEL_188;
        }
        alarmmanager.setExact(3, SystemClock.elapsedRealtime() + l, pendingintent);
        if (!flag1)
        {
            continue; /* Loop/switch isn't completed */
        }
        SecurityException securityexception1;
        try
        {
            alarmmanager.set(3, l + SystemClock.elapsedRealtime(), pendingintent);
        }
        catch (SecurityException securityexception2)
        {
            throw securityexception2;
        }
        if (!flag1) goto _L4; else goto _L3
_L3:
        Log.i(z[12]);
        try
        {
            startService(((Intent) (obj)));
            return;
        }
        catch (SecurityException securityexception)
        {
            Log.e(z[15]);
        }
        return;
        securityexception1;
        throw securityexception1;
    }

    private void b()
    {
        Log.i(z[2]);
        a(false);
    }

    private void b(String s)
    {
        int i = a.h();
        try
        {
            Log.b(z[0], null, new Object[] {
                s, Integer.valueOf(i)
            });
            a.c();
            if (a.i() == null)
            {
                Log.i(z[1]);
                App.a(this, 0);
            }
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw s;
        }
        try
        {
            a.a(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw s;
        }
        if (i <= 0)
        {
            break MISSING_BLOCK_LABEL_82;
        }
        a.a(i);
        a(s);
        return;
    }

    public static boolean b(Context context)
    {
        return (new a(context)).a();
    }

    private void c(String s)
    {
        boolean flag;
        try
        {
            flag = s.equals(z[5]);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            try
            {
                throw s;
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw s;
            }
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_49;
        }
        Log.b(z[4], null, new Object[] {
            s
        });
        a.e();
        a(true);
        if (!c)
        {
            break MISSING_BLOCK_LABEL_87;
        }
        Log.a(z[3], null, new Object[] {
            s
        });
        a.g();
        a.d();
        return;
    }

    public void onHandleIntent(Intent intent)
    {
        boolean flag = c;
        if (intent == null)
        {
            String s;
            String s1;
            String s2;
            int i;
            int j;
            boolean flag1;
            try
            {
                Log.w(z[23]);
            }
            // Misplaced declaration of an exception variable
            catch (Intent intent)
            {
                throw intent;
            }
            if (!flag)
            {
                break MISSING_BLOCK_LABEL_290;
            }
        }
        flag1 = z[29].equals(intent.getAction());
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_143;
        }
        s = intent.getStringExtra(z[22]);
        s1 = intent.getStringExtra(z[26]);
        s2 = intent.getStringExtra(z[28]);
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_91;
        }
        c(s);
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_138;
        }
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_104;
        }
        b();
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_138;
        }
        if (s2 != null)
        {
            try
            {
                b(s2);
            }
            // Misplaced declaration of an exception variable
            catch (Intent intent)
            {
                throw intent;
            }
            if (!flag)
            {
                break MISSING_BLOCK_LABEL_138;
            }
        }
        Log.a(z[24], null, new Object[] {
            intent
        });
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_290;
        }
        try
        {
            flag1 = e.equals(intent.getAction());
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent)
        {
            throw intent;
        }
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_272;
        }
        s = intent.getStringExtra(z[27]);
        s1 = a.i();
        i = a.h();
        j = a.j();
        Log.b(z[25], null, new Object[] {
            s1, s, Integer.valueOf(i), Integer.valueOf(j)
        });
        if (s1 == null || s == null)
        {
            break MISSING_BLOCK_LABEL_262;
        }
        flag1 = s.equals(s1);
        if (flag1 && i == j)
        {
            break MISSING_BLOCK_LABEL_267;
        }
        try
        {
            a(false);
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent)
        {
            throw intent;
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_290;
        }
        Log.a(z[30], null, new Object[] {
            intent
        });
        return;
        intent;
        try
        {
            throw intent;
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent) { }
        try
        {
            throw intent;
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent) { }
        try
        {
            throw intent;
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent) { }
        throw intent;
        intent;
        try
        {
            throw intent;
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent) { }
        try
        {
            throw intent;
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent) { }
        throw intent;
        intent;
        throw intent;
    }

    public int onStartCommand(Intent intent, int i, int j)
    {
        if (intent == null) goto _L2; else goto _L1
_L1:
        boolean flag;
        try
        {
            flag = z[6].equals(intent.getAction());
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent)
        {
            throw intent;
        }
        if (!flag) goto _L2; else goto _L3
_L3:
        flag = true;
_L5:
        setIntentRedelivery(flag);
        return super.onStartCommand(intent, i, j);
_L2:
        flag = false;
        if (true) goto _L5; else goto _L4
_L4:
    }

    static 
    {
        Object obj;
        Object aobj[];
        byte byte0;
        int i;
        aobj = new String[33];
        obj = "$f>2 \006B\032n&\006W\026y}FVS|\"\023s\026o!\nJ\035 w\007";
        byte0 = -1;
        i = 0;
_L44:
        String as[];
        int k;
        int l;
        as = ((String []) (aobj));
        obj = ((String) (obj)).toCharArray();
        l = obj.length;
        k = 0;
_L42:
        if (l > k) goto _L2; else goto _L1
_L1:
        obj = (new String(((char []) (obj)))).intern();
        byte0;
        JVM INSTR tableswitch 0 31: default 192
    //                   0 208
    //                   1 224
    //                   2 240
    //                   3 256
    //                   4 272
    //                   5 289
    //                   6 307
    //                   7 325
    //                   8 343
    //                   9 361
    //                   10 379
    //                   11 397
    //                   12 415
    //                   13 433
    //                   14 451
    //                   15 469
    //                   16 487
    //                   17 505
    //                   18 523
    //                   19 541
    //                   20 559
    //                   21 577
    //                   22 595
    //                   23 613
    //                   24 631
    //                   25 649
    //                   26 667
    //                   27 685
    //                   28 703
    //                   29 721
    //                   30 739
    //                   31 757;
           goto _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L17 _L18 _L19 _L20 _L21 _L22 _L23 _L24 _L25 _L26 _L27 _L28 _L29 _L30 _L31 _L32 _L33 _L34 _L35
_L3:
        as[i] = ((String) (obj));
        obj = "$f>2 \006B\032n&\006W\026y}\r@\004";
        i = 1;
        byte0 = 0;
        break; /* Loop/switch isn't completed */
_L4:
        as[i] = ((String) (obj));
        obj = "$f>2 \006C\001x!\013";
        i = 2;
        byte0 = 1;
        break; /* Loop/switch isn't completed */
_L5:
        as[i] = ((String) (obj));
        obj = "$f>2 \006B\032n&\021D\007t=\r\n\026o \fW\\8!";
        i = 3;
        byte0 = 2;
        break; /* Loop/switch isn't completed */
_L6:
        as[i] = ((String) (obj));
        i = 4;
        obj = "$f>2 \006B\032n&\021D\007t=\r\n\026o \fW\\8!";
        byte0 = 3;
        break; /* Loop/switch isn't completed */
_L7:
        as[i] = ((String) (obj));
        i = 5;
        obj = "0`!K\033 `,S\0357z2K\023*i2_\036&";
        byte0 = 4;
        break; /* Loop/switch isn't completed */
_L8:
        as[i] = ((String) (obj));
        i = 6;
        obj = "\000J\03635\fJ\024q7MD\035y \fL\02731QA\0363;\rQ\026s&Mw6Z\0330q!\\\006*j=";
        byte0 = 5;
        break; /* Loop/switch isn't completed */
_L9:
        as[i] = ((String) (obj));
        i = 7;
        obj = "$f>2 \006B\032n&\021D\007t=\r\n\021|1\bJ\025{rFA\036n";
        byte0 = 6;
        break; /* Loop/switch isn't completed */
_L10:
        as[i] = ((String) (obj));
        i = 8;
        obj = "\000J\03635\fJ\024q7MD\035y \fL\02735\016V";
        byte0 = 7;
        break; /* Loop/switch isn't completed */
_L11:
        as[i] = ((String) (obj));
        i = 9;
        obj = "$f>2 \006T\006x!\027W\026z;\020Q\001|&\nJ\035";
        byte0 = 8;
        break; /* Loop/switch isn't completed */
_L12:
        as[i] = ((String) (obj));
        i = 10;
        obj = "\002U\003";
        byte0 = 9;
        break; /* Loop/switch isn't completed */
_L13:
        as[i] = ((String) (obj));
        i = 11;
        obj = "\000J\03635\fJ\024q7MD\035y \fL\02731QA\0363;\rQ\026s&Mw6Z\0330q6O";
        byte0 = 10;
        break; /* Loop/switch isn't completed */
_L14:
        as[i] = ((String) (obj));
        i = 12;
        obj = "$f>2 \006B\032n&\021D\007t=\r\n\001x#\026@\000i";
        byte0 = 11;
        break; /* Loop/switch isn't completed */
_L15:
        as[i] = ((String) (obj));
        i = 13;
        obj = "\020@\035y7\021";
        byte0 = 12;
        break; /* Loop/switch isn't completed */
_L16:
        as[i] = ((String) (obj));
        i = 14;
        obj = "$f>2 \006B\032n&\021D\007t=\r\n\004|;\027L\035z";
        byte0 = 13;
        break; /* Loop/switch isn't completed */
_L17:
        as[i] = ((String) (obj));
        i = 15;
        obj = "$f>2 \006B\032n&\021D\007t=\r\n\000x1\026W\032i+&]\020x\"\027L\034s";
        byte0 = 14;
        break; /* Loop/switch isn't completed */
_L18:
        as[i] = ((String) (obj));
        i = 16;
        obj = "\002I\022o?";
        byte0 = 15;
        break; /* Loop/switch isn't completed */
_L19:
        as[i] = ((String) (obj));
        i = 17;
        obj = "Q\034@$gV\021G,jP\021";
        byte0 = 16;
        break; /* Loop/switch isn't completed */
_L20:
        as[i] = ((String) (obj));
        i = 18;
        obj = "$f>2 \006B\032n&\021D\007t=\r\n\001x4\021@\000u";
        byte0 = 17;
        break; /* Loop/switch isn't completed */
_L21:
        as[i] = ((String) (obj));
        i = 19;
        obj = "\000J\03635\fJ\024q7MD\035y \fL\02731QA\0363;\rQ\026s&Mw6Z\0330q!\\\006*j=";
        byte0 = 18;
        break; /* Loop/switch isn't completed */
_L22:
        as[i] = ((String) (obj));
        i = 20;
        obj = "\021@\025o7\020M";
        byte0 = 19;
        break; /* Loop/switch isn't completed */
_L23:
        as[i] = ((String) (obj));
        i = 21;
        obj = "\021@\025o7\020M";
        byte0 = 20;
        break; /* Loop/switch isn't completed */
_L24:
        as[i] = ((String) (obj));
        i = 22;
        obj = "\006W\001r ";
        byte0 = 21;
        break; /* Loop/switch isn't completed */
_L25:
        as[i] = ((String) (obj));
        i = 23;
        obj = "$f>2=\rm\022s6\017@:s&\006K\007=;\rQ\026s&^\r\035h>\017\fS";
        byte0 = 22;
        break; /* Loop/switch isn't completed */
_L26:
        as[i] = ((String) (obj));
        i = 24;
        obj = "$f>2 \006B\032n&\021D\007t=\r\n\006s9\rJ\004s\033\rQ\026s&Y\005Vn";
        byte0 = 23;
        break; /* Loop/switch isn't completed */
_L27:
        as[i] = ((String) (obj));
        i = 25;
        obj = "$f>2 \006B\032n&\021D\007t=\r\n\000i3\021QSn3\025@\027 w\020\005\000x \025@\001 w\020\005\022m\"5@\001n;\fKN86CV\022k7\007d\003m\004\006W\000t=\r\030Vy";
        byte0 = 24;
        break; /* Loop/switch isn't completed */
_L28:
        as[i] = ((String) (obj));
        i = 26;
        obj = "\021@\025o7\020M";
        byte0 = 25;
        break; /* Loop/switch isn't completed */
_L29:
        as[i] = ((String) (obj));
        i = 27;
        obj = "\021@\024t!\027W\022i;\fK,t6";
        byte0 = 26;
        break; /* Loop/switch isn't completed */
_L30:
        as[i] = ((String) (obj));
        i = 28;
        obj = "\021@\024t!\027W\022i;\fK,t6";
        byte0 = 27;
        break; /* Loop/switch isn't completed */
_L31:
        as[i] = ((String) (obj));
        obj = "\000J\03635\fJ\024q7MD\035y \fL\02731QA\0363;\rQ\026s&Mw6Z\0330q!\\\006*j=";
        byte0 = 28;
        i = 29;
        break; /* Loop/switch isn't completed */
_L32:
        as[i] = ((String) (obj));
        i = 30;
        obj = "$f>2=\rm\022s6\017@:s&\006K\00720\fB\006nhC\000\0";
        byte0 = 29;
        break; /* Loop/switch isn't completed */
_L33:
        as[i] = ((String) (obj));
        i = 31;
        obj = "\004F\036";
        byte0 = 30;
        break; /* Loop/switch isn't completed */
_L34:
        as[i] = ((String) (obj));
        i = 32;
        obj = "\021@\024t!\027W\022i;\fK,t6";
        byte0 = 31;
        break; /* Loop/switch isn't completed */
_L35:
        int j;
        as[i] = ((String) (obj));
        z = ((String []) (aobj));
        b = com/whatsapp/c2dm/C2DMRegistrar.getCanonicalName();
        obj = (new StringBuilder()).append(b);
        aobj = "Mv'\\\0007".toCharArray();
        j = aobj.length;
        i = 0;
          goto _L36
_L2:
        c1 = obj[k];
        k % 5;
        JVM INSTR tableswitch 0 3: default 872
    //                   0 895
    //                   1 902
    //                   2 909
    //                   3 916;
           goto _L37 _L38 _L39 _L40 _L41
_L41:
        break MISSING_BLOCK_LABEL_916;
_L37:
        j = 82;
_L43:
        obj[k] = (char)(j ^ c1);
        k++;
          goto _L42
_L38:
        j = 99;
          goto _L43
_L39:
        j = 37;
          goto _L43
_L40:
        j = 115;
          goto _L43
        j = 29;
          goto _L43
        if (true) goto _L44; else goto _L2
_L36:
        char c1;
        if (j <= i)
        {
            e = ((StringBuilder) (obj)).append((new String(((char []) (aobj)))).intern()).toString();
            return;
        }
        k = aobj[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 964
    //                   0 985
    //                   1 991
    //                   2 997
    //                   3 1003;
           goto _L45 _L46 _L47 _L48 _L49
_L49:
        break MISSING_BLOCK_LABEL_1003;
_L46:
        break; /* Loop/switch isn't completed */
_L45:
        byte0 = 82;
_L51:
        aobj[i] = (char)(byte0 ^ k);
        i++;
        if (true) goto _L36; else goto _L50
_L50:
        byte0 = 99;
          goto _L51
_L47:
        byte0 = 37;
          goto _L51
_L48:
        byte0 = 115;
          goto _L51
        byte0 = 29;
          goto _L51
    }
}
