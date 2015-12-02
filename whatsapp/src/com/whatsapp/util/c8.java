// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.util;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

// Referenced classes of package com.whatsapp.util:
//            a, Log, an

public class c8
    implements Future, Runnable
{

    private static final String a[];
    private static final String c[];
    private static final String z[];
    private final Context b;
    private final CountDownLatch d = new CountDownLatch(1);
    private final AtomicReference e = new AtomicReference(new a(null, null));

    public c8(Context context)
    {
        b = context;
    }

    private static Set a(Context context, String as[], String s)
    {
        PackageManager packagemanager;
        boolean flag;
        flag = Log.f;
        packagemanager = context.getPackageManager();
        if (packagemanager != null) goto _L2; else goto _L1
_L1:
        return null;
_L2:
        HashSet hashset;
        int i;
        int j;
        hashset = new HashSet();
        j = as.length;
        i = 0;
_L7:
        if (i >= j) goto _L4; else goto _L3
_L3:
        String s1 = as[i];
        context = packagemanager.getApplicationInfo(s1, 0);
        context = context.loadLabel(packagemanager);
_L5:
        Log.w((new StringBuilder()).append(s).append(' ').append(s1).toString());
        hashset.add(new an(context, s1));
_L6:
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_197;
        }
_L4:
        boolean flag1;
        try
        {
            flag1 = hashset.isEmpty();
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw context;
        }
        if (!flag1)
        {
            return hashset;
        }
          goto _L1
        context;
        Log.e((new StringBuilder()).append(z[0]).append(context).toString());
        context = s1;
          goto _L5
        context;
        Log.e((new StringBuilder()).append(s).append(' ').append(context.getMessage()).toString());
          goto _L6
        context;
          goto _L6
        i++;
          goto _L7
    }

    public a a()
    {
        d.await();
        return (a)e.get();
    }

    public a a(long l, TimeUnit timeunit)
    {
label0:
        {
            try
            {
                if (!d.await(l, timeunit))
                {
                    break label0;
                }
                timeunit = (a)e.get();
            }
            // Misplaced declaration of an exception variable
            catch (TimeUnit timeunit)
            {
                throw timeunit;
            }
            return timeunit;
        }
        throw new TimeoutException();
    }

    public boolean cancel(boolean flag)
    {
        return false;
    }

    public Object get()
    {
        return a();
    }

    public Object get(long l, TimeUnit timeunit)
    {
        return a(l, timeunit);
    }

    public boolean isCancelled()
    {
        return false;
    }

    public boolean isDone()
    {
        long l;
        try
        {
            l = d.getCount();
        }
        catch (RuntimeException runtimeexception)
        {
            throw runtimeexception;
        }
        return l == 0L;
    }

    public void run()
    {
        Object obj;
        Set set = null;
        obj = a(b, a, z[2]);
        Set set1 = a(b, c, z[1]);
        AtomicReference atomicreference;
        try
        {
            atomicreference = e;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw obj;
        }
        if (obj == null) goto _L2; else goto _L1
_L1:
        obj = Collections.unmodifiableSet(((Set) (obj)));
_L4:
        if (set1 != null)
        {
            set = Collections.unmodifiableSet(set1);
        }
        atomicreference.set(new a(((Set) (obj)), set));
        d.countDown();
        return;
_L2:
        obj = null;
        if (true) goto _L4; else goto _L3
_L3:
    }

    static 
    {
        String as[];
        Object obj;
        String as1[];
        byte byte0;
        int i;
        as = new String[3];
        obj = "X\013\033L\017I\032\027G_Y\006\n@\021ZS\fH\fV^\023@\023Q\026\n\t\021\\\036\035\t\023R\034\023\\\017\007S";
        byte0 = -1;
        as1 = as;
        i = 0;
_L10:
        int j;
        int k;
        obj = ((String) (obj)).toCharArray();
        k = obj.length;
        j = 0;
_L7:
        if (k <= j)
        {
            obj = (new String(((char []) (obj)))).intern();
            byte byte1;
            char c1;
            switch (byte0)
            {
            default:
                as1[i] = ((String) (obj));
                obj = "N\026\033F\021Y\022\nPRI\022\013BRV\032\024E\032O";
                i = 1;
                as1 = as;
                byte0 = 0;
                continue; /* Loop/switch isn't completed */

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "M\001\021D\036O\nU]\036N\030UB\026Q\037\035[";
                i = 2;
                as1 = as;
                byte0 = 1;
                continue; /* Loop/switch isn't completed */

            case 1: // '\001'
                as1[i] = ((String) (obj));
                z = as;
                as = new String[46];
                i = 0;
                as1 = as;
                obj = "_\032\002\007\fI\022\033A\026_\022\026HQi\022\013B4T\037\024L\r";
                byte0 = 2;
                continue; /* Loop/switch isn't completed */

            case 2: // '\002'
                as1[i] = ((String) (obj));
                obj = "^\035VJ\020P]\031G\033O\034\021MQR\003\034HQI\022\013B\022\\\035";
                i = 1;
                as1 = as;
                byte0 = 3;
                continue; /* Loop/switch isn't completed */

            case 3: // '\003'
                as1[i] = ((String) (obj));
                obj = "^\034\025\007\036O\001\027GQI\022\013B2\\\035\031N\032O";
                i = 2;
                as1 = as;
                byte0 = 4;
                continue; /* Loop/switch isn't completed */

            case 4: // '\004'
                as1[i] = ((String) (obj));
                obj = "^\034\025\007\036O\001\027GQI\022\013B2\\\035\031N\032O5\nL\032";
                byte0 = 5;
                i = 3;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 5: // '\005'
                as1[i] = ((String) (obj));
                obj = "^\034\025\007\035O\032\037A\013\023\007\031Z\024^\037\035H\021X\001VH\034I\032\016@\013D";
                byte0 = 6;
                i = 4;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 6: // '\006'
                as1[i] = ((String) (obj));
                i = 5;
                obj = "^\034\025\007\034R\034\024\007\013\\\000\023B\026Q\037\035[";
                byte0 = 7;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 7: // '\007'
                as1[i] = ((String) (obj));
                i = 6;
                obj = "^\034\025\007\032Q\035\017H\rX]9J\013T\005\035h\017M\0009M\f";
                byte0 = 8;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 8: // '\b'
                as1[i] = ((String) (obj));
                i = 7;
                obj = "^\034\025\007\032N\007\nF\021Z\000VH\021Y\001\027@\033\023\007\031Z\024P\022\026H\030X\001";
                byte0 = 9;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 9: // '\t'
                as1[i] = ((String) (obj));
                i = 8;
                obj = "^\034\025\007\030\\\006VN\020\023\037\031\\\021^\033\035[\032E]\037F\bT\027\037L\013\023\007\031Z\024P\022\026H\030X\001\035Q";
                byte0 = 10;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 10: // '\n'
                as1[i] = ((String) (obj));
                i = 9;
                obj = "^\034\025\007\026W\032\026Z\027\\\035VB\035\\\007\fL\rD\027\027J\013R\001";
                byte0 = 11;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 11: // '\013'
                as1[i] = ((String) (obj));
                i = 10;
                obj = "^\034\025\007\026W\032\026Z\027\\\035VB\035\\\007\fL\rD\027\027J\013R\001'L\021";
                byte0 = 12;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 12: // '\f'
                as1[i] = ((String) (obj));
                i = 11;
                obj = "^\034\025\007\026R\021\021]QP\034\032@\023X\020\031[\032";
                byte0 = 13;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 13: // '\r'
                as1[i] = ((String) (obj));
                i = 12;
                obj = "^\034\025\007\025\\\036\035ZQn\036\031[\013i\022\013B2\\\035\031N\032O";
                byte0 = 14;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 14: // '\016'
                as1[i] = ((String) (obj));
                i = 13;
                obj = "^\034\025\007\025\\\036\035ZQn\036\031[\013i\022\013B2\\\035\031N\032O?\021]\032";
                byte0 = 15;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 15: // '\017'
                as1[i] = ((String) (obj));
                i = 14;
                obj = "^\034\025\007\025\\\036\035ZQn\036\031[\013i\022\013B2\\\035\031N\032O#\nF";
                byte0 = 16;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 16: // '\020'
                as1[i] = ((String) (obj));
                i = 15;
                obj = "^\034\025\007\023\\\007\035M\rR\032\034\007\025H\032\033L\033X\025\035G\033X\001";
                byte0 = 17;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 17: // '\021'
                as1[i] = ((String) (obj));
                i = 16;
                obj = "^\034\025\007\023\\\007\035M\rR\032\034\007\025H\032\033L\033X\025\035G\033X\001VK\032I\022";
                byte0 = 18;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 18: // '\022'
                as1[i] = ((String) (obj));
                i = 17;
                obj = "^\034\025\007\023\\\007\035M\rR\032\034\007\025H\032\033L\033X\025\035G\033X\001VY\023H\0";
                byte0 = 19;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 19: // '\023'
                as1[i] = ((String) (obj));
                i = 18;
                obj = "^\034\025\007\023\\\007\035M\rR\032\034\007\nQ\007\021D\036I\026\022\\\026^\026";
                byte0 = 20;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 20: // '\024'
                as1[i] = ((String) (obj));
                i = 19;
                obj = "^\034\025\007\023\\\007\035M\rR\032\034\007\nQ\007\021D\036I\026\022\\\026^\026V[\020R\007";
                byte0 = 21;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 21: // '\025'
                as1[i] = ((String) (obj));
                i = 20;
                obj = "^\034\025\007\023R\034\023F\nI]\002H\017M\026\n";
                byte0 = 22;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 22: // '\026'
                as1[i] = ((String) (obj));
                i = 21;
                obj = "^\034\025\007\022R\021\027\007\013\\\000\023\007\024T\037\024L\r";
                byte0 = 23;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 23: // '\027'
                as1[i] = ((String) (obj));
                i = 22;
                obj = "^\034\025\007\021X\007\t@\021\023\022\027]\024T\037\024L\r";
                byte0 = 24;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 24: // '\030'
                as1[i] = ((String) (obj));
                i = 23;
                obj = "^\034\025\007\021X\007\t@\021\023\036\027K\026Q\026\037\\\036O\027";
                byte0 = 25;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 25: // '\031'
                as1[i] = ((String) (obj));
                i = 24;
                obj = "^\034\025\007\rX\020\020@\023Y]\031M\t\\\035\033L\033I\022\013B\024T\037\024L\r";
                byte0 = 26;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 26: // '\032'
                as1[i] = ((String) (obj));
                i = 25;
                obj = "^\034\025\007\rX\020\020@\023Y]\031M\t\\\035\033L\033I\022\013B\024T\037\024L\r[\001\027P\020";
                byte0 = 27;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 27: // '\033'
                as1[i] = ((String) (obj));
                i = 26;
                obj = "^\034\025\007\rX\020\020@\023Y]\031M\t\\\035\033L\033I\022\013B\024T\037\024L\rM\001\027";
                byte0 = 28;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 28: // '\034'
                as1[i] = ((String) (obj));
                i = 27;
                obj = "^\034\025\007\rX\020\020@\023Y]\033E\032\\\035\035[";
                byte0 = 29;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 29: // '\035'
                as1[i] = ((String) (obj));
                i = 28;
                obj = "^\034\025\007\rU\n\fA\022\023\033\035Q\026N\026V]\036N\030";
                byte0 = 30;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 30: // '\036'
                as1[i] = ((String) (obj));
                i = 29;
                obj = "^\034\025\007\f\\\035\034\007\013\\\000\023D\036S\022\037L\r";
                byte0 = 31;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 31: // '\037'
                as1[i] = ((String) (obj));
                i = 30;
                obj = "^\034\025\007\fI\022'K\032X\001\013\007\036H\007\027v\013\\\000\023";
                byte0 = 32;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 32: // ' '
                as1[i] = ((String) (obj));
                i = 31;
                obj = "^\034\025\007\fD\036\031G\013X\020VD\020S\032\fF\r";
                byte0 = 33;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 33: // '!'
                as1[i] = ((String) (obj));
                i = 32;
                obj = "^\034\025\007\013\\\000\023\007\024T\037\024L\r";
                byte0 = 34;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 34: // '"'
                as1[i] = ((String) (obj));
                i = 33;
                obj = "^\034\025\007\013S\032V}\036N8\021E\023X\001";
                byte0 = 35;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 35: // '#'
                as1[i] = ((String) (obj));
                i = 34;
                obj = "^\034\025\007\005Y\004\027[\024N]\031G\033O\034\021MQI\034\027E\035R\013";
                byte0 = 36;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 36: // '$'
                as1[i] = ((String) (obj));
                i = 35;
                obj = "^\034\025\007\005R\036\r]QJ\022\fJ\027Y\034\037";
                byte0 = 37;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 37: // '%'
                as1[i] = ((String) (obj));
                i = 36;
                obj = "^\034\025\007\005R\036\r]QJ\022\fJ\027Y\034\037E\026I\026";
                byte0 = 38;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 38: // '&'
                as1[i] = ((String) (obj));
                i = 37;
                obj = "Z\003\033\007\022D\004\035KQU\032\026L\013\023\035\035]Qi\022\013B2\\\035\031N\032O";
                byte0 = 39;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 39: // '\''
                as1[i] = ((String) (obj));
                i = 38;
                obj = "T\036\027K\023T\025\035\007\022X\036\027[\006_\034\027Z\013X\001VE\026I\026";
                byte0 = 40;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 40: // '('
                as1[i] = ((String) (obj));
                i = 39;
                obj = "W\003VJ\020\023\022\bE\026R]\013@\022M\037\035]\036N\030\023@\023Q\026\n";
                byte0 = 41;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 41: // ')'
                as1[i] = ((String) (obj));
                i = 40;
                obj = "W\003VJ\020\023\022\bE\026R]\013@\022M\037\035]\036N\030\023@\023Q\026\nO\rX\026";
                byte0 = 42;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 42: // '*'
                as1[i] = ((String) (obj));
                i = 41;
                obj = "W\003VZ\022\\\003\020FQL\006\021J\024I\022\013B\024T\037\024L\r";
                byte0 = 43;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 43: // '+'
                as1[i] = ((String) (obj));
                i = 42;
                obj = "P\034\032@QT\035\036F\023T\025\035\007\013\\\000\023D\036S\022\037L\r";
                byte0 = 44;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 44: // ','
                as1[i] = ((String) (obj));
                i = 43;
                obj = "P\034\032@QT\035\036F\023T\025\035\007\013\\\000\023D\036S\022\037L\rM\001\027";
                byte0 = 45;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 45: // '-'
                as1[i] = ((String) (obj));
                i = 44;
                obj = "S\026\f\007\023X\003\035G\030\023\021\031]\013X\001\001M\020^\007\027[";
                byte0 = 46;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 46: // '.'
                as1[i] = ((String) (obj));
                i = 45;
                obj = "S\026\f\007\023X\003\035G\030\023\000\rY\032O\021\027Q\fN";
                byte0 = 47;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 47: // '/'
                as1[i] = ((String) (obj));
                a = as;
                as = new String[11];
                obj = "^\034\025\007\036Z\032\024L\fR\025\f[\032N\034\r[\034X";
                byte0 = 48;
                as1 = as;
                i = 0;
                continue; /* Loop/switch isn't completed */

            case 48: // '0'
                as1[i] = ((String) (obj));
                obj = "^\034\025\007\036S\007\021_\026O\006\013";
                byte0 = 49;
                i = 1;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 49: // '1'
                as1[i] = ((String) (obj));
                obj = "^\034\025\007\034Q\026\031G\022\\\000\fL\r\023\036\037\\\036O\027";
                byte0 = 50;
                i = 2;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 50: // '2'
                as1[i] = ((String) (obj));
                obj = "^\034\025\007\032Q\026\033]\rT\020\013A\032X\003VH\fT";
                byte0 = 51;
                i = 3;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 51: // '3'
                as1[i] = ((String) (obj));
                obj = "^\034\025\007\032N\007\nF\021Z\000VH\021Y\001\027@\033\023\003\027Y";
                byte0 = 52;
                i = 4;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 52: // '4'
                as1[i] = ((String) (obj));
                i = 5;
                obj = "^\034\025\007\032N\007\nF\021Z\000VH\021Y\001\027@\033\023\003\027YQ^\006\bJ\036V\026";
                byte0 = 53;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 53: // '5'
                as1[i] = ((String) (obj));
                i = 6;
                obj = "^\034\025\007\022X\007\031N\020\023\022\013]\rR";
                byte0 = 54;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 54: // '6'
                as1[i] = ((String) (obj));
                i = 7;
                obj = "^\034\025\007\fP\022\n]\bU\034Vz\022\\\001\fo\026Q\0265H\021\\\024\035[";
                byte0 = 55;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 55: // '7'
                as1[i] = ((String) (obj));
                i = 8;
                obj = "^\034\025\007\fP\022\n]\bU\034Vz\022\\\001\fo\026Q\0265H\021\\\024\035[/O\034";
                byte0 = 56;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 56: // '8'
                as1[i] = ((String) (obj));
                i = 9;
                obj = "S\026\000]\036M\003VZ\006N\007\035D\017\\\035\035E";
                byte0 = 57;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 57: // '9'
                as1[i] = ((String) (obj));
                i = 10;
                obj = "S\026\000]\036M\003VZ\006N\007\035D\017\\\035\035EQOB";
                byte0 = 58;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 58: // ':'
                as1[i] = ((String) (obj));
                break;
            }
            break; /* Loop/switch isn't completed */
        }
        c1 = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 400
    //                   0 423
    //                   1 430
    //                   2 437
    //                   3 444;
           goto _L1 _L2 _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_444;
_L2:
        break; /* Loop/switch isn't completed */
_L1:
        byte1 = 127;
_L8:
        obj[j] = (char)(byte1 ^ c1);
        j++;
        if (true) goto _L7; else goto _L6
_L6:
        byte1 = 61;
          goto _L8
_L3:
        byte1 = 115;
          goto _L8
_L4:
        byte1 = 120;
          goto _L8
        byte1 = 41;
          goto _L8
        if (true) goto _L10; else goto _L9
_L9:
        c = as;
    }
}
