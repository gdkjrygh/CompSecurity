// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rrrrrr;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.bluetooth.BluetoothManager;
import android.content.Context;
import android.content.Intent;
import android.net.wifi.WifiManager;
import android.telephony.TelephonyManager;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import uuuuuu.nuuuuu;

// Referenced classes of package rrrrrr:
//            grrrrr

public class grgrgr
{

    public static int b041A041A041A041A041A041A_int_static_fld = 1;
    private static volatile grgrgr b041A041A041A041A041A041A_rrrrrr_grgrgr_static_fld;
    public static int b041A041A041A041A041A041A_int_static_fld = 0;
    private static Context b041A041A041A041A041A041A_android_content_Context_static_fld;
    public static int b041A041A041A041A041A041A_int_static_fld = 2;
    private static volatile boolean b041A041A041A041A041A041A_boolean_static_fld = false;
    public static int b041A041A041A041A041A041A_int_static_fld = 98;

    private grgrgr()
    {
        int i = b041A041A041A041A041A041A_int_static_fld;
        Object obj = rrrrrr/grgrgr.getMethod(nuuuuu.b0417041704170417041704170417("\uFF0C\u02D5\u02D5\uFEDA\uFEDE\uFEDC\uFEEC\uFEDA\uFEDE\uFEDC\uFEEC\uFEDA\uFEDE\uFEDC\uFEEC\u02D5", 'r', '\004'), new Class[0]);
        int j;
        int k;
        try
        {
            obj = ((Method) (obj)).invoke(null, new Object[0]);
        }
        catch (InvocationTargetException invocationtargetexception)
        {
            throw invocationtargetexception.getCause();
        }
        j = ((Integer)obj).intValue();
        k = b041A041A041A041A041A041A_int_static_fld;
        switch ((k * (b041A041A041A041A041A041A_int_static_fld + k)) % b041A041A041A041A041A041A_int_static_fld)
        {
        default:
            Object obj1 = rrrrrr/grgrgr.getMethod(nuuuuu.b0417041704170417041704170417("\uFFBA\uFF88\uFF8C\uFF8A\uFF9A\u0383\uFF88\uFF8C\uFF8A\uFF9A\uFF88\uFF8C\uFF8A\uFF9A\uFF88\uFF8C\uFF8A\uFF9A\u0383", '\250', '\0'), new Class[0]);
            InvocationTargetException invocationtargetexception1;
            try
            {
                obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
            }
            catch (InvocationTargetException invocationtargetexception2)
            {
                throw invocationtargetexception2.getCause();
            }
            b041A041A041A041A041A041A_int_static_fld = ((Integer)obj1).intValue();
            obj1 = rrrrrr/grgrgr.getMethod(nuuuuu.b0417041704170417041704170417("\314\232\236\234\254\u0495\232\236\234\254\232\236\234\254\232\236\234\254\u0495", 'U', '\277', '\001'), new Class[0]);
            try
            {
                obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
            }
            catch (InvocationTargetException invocationtargetexception3)
            {
                throw invocationtargetexception3.getCause();
            }
            b041A041A041A041A041A041A_int_static_fld = ((Integer)obj1).intValue();
            break;

        case 0: // '\0'
            break;
        }
        if (((i + j) * b041A041A041A041A041A041A_int_static_fld) % b041A041A041A041A041A041A_int_static_fld != b041A041A041A041A041A041A_int_static_fld)
        {
            obj1 = rrrrrr/grgrgr.getMethod(nuuuuu.b0417041704170417041704170417("\000\uFFCE\uFFD2\uFFD0\uFFE0\u03C9\uFFCE\uFFD2\uFFD0\uFFE0\uFFCE\uFFD2\uFFD0\uFFE0\uFFCE\uFFD2\uFFD0\uFFE0\u03C9", '\264', 'R', '\001'), new Class[0]);
            try
            {
                obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (InvocationTargetException invocationtargetexception1)
            {
                throw invocationtargetexception1.getCause();
            }
            b041A041A041A041A041A041A_int_static_fld = ((Integer)obj1).intValue();
            b041A041A041A041A041A041A_int_static_fld = 1;
        }
        super();
label0:
        do
        {
            switch (1)
            {
            default:
                while (true) 
                {
label1:
                    switch (1)
                    {
                    case 0: // '\0'
                        break;

                    default:
label2:
                        while (true) 
                        {
                            switch (1)
                            {
                            default:
                                break;

                            case 0: // '\0'
                                break label1;

                            case 1: // '\001'
                                break label2;
                            }
                        }
                        // fall through

                    case 1: // '\001'
                        switch (1)
                        {
                        default:
                            break;

                        case 0: // '\0'
                            continue label0;

                        case 1: // '\001'
                            break label0;
                        }
                        break;
                    }
                }
                break;

            case 0: // '\0'
                break;

            case 1: // '\001'
                break label0;
            }
        } while (true);
    }

    private void b042B042B042B042B042B042B(Context context)
    {
        if (b041A041A041A041A041A041A_boolean_static_fld) goto _L2; else goto _L1
_L1:
        b041A041A041A041A041A041A_android_content_Context_static_fld = context;
          goto _L3
_L10:
        int i;
        int j;
        int k;
        int l;
        try
        {
            i = b041A041A041A041A041A041A_int_static_fld;
            j = b041A041A041A041A041A041A_int_static_fld;
            k = b041A041A041A041A041A041A_int_static_fld;
            l = b041A041A041A041A041A041A_int_static_fld;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw context;
        }
        context = rrrrrr/grgrgr.getMethod(nuuuuu.b0417041704170417041704170417("\305\u048C\u048C\u048C\u048C\u048C\227\223\225\345", '\247', '\002'), new Class[0]);
        context = ((Context) (context.invoke(null, new Object[0])));
        if (((i + j) * k) % l != ((Integer)context).intValue())
        {
            if (((b041A041A041A041A041A041A_int_static_fld + b041A041A041A041A041A041A_int_static_fld) * b041A041A041A041A041A041A_int_static_fld) % b041A041A041A041A041A041A_int_static_fld != b041A041A041A041A041A041A_int_static_fld)
            {
                context = rrrrrr/grgrgr.getMethod(nuuuuu.b0417041704170417041704170417("\u0145\u0113\u0117\u0115\u0125\u050E\u0113\u0117\u0115\u0125\u0113\u0117\u0115\u0125\u0113\u0117\u0115\u0125\u050E", '\343', '\005'), new Class[0]);
                try
                {
                    context = ((Context) (context.invoke(null, new Object[0])));
                }
                // Misplaced declaration of an exception variable
                catch (Context context)
                {
                    throw context.getCause();
                }
                b041A041A041A041A041A041A_int_static_fld = ((Integer)context).intValue();
                b041A041A041A041A041A041A_int_static_fld = 83;
            }
            try
            {
                b041A041A041A041A041A041A_int_static_fld = 10;
                b041A041A041A041A041A041A_int_static_fld = 60;
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                throw context;
            }
        }
        b041A041A041A041A041A041A_boolean_static_fld = true;
        return;
        context;
        throw context.getCause();
_L3:
        switch (0)
        {
        case 0: // '\0'
            break; /* Loop/switch isn't completed */

        case 1: // '\001'
            continue; /* Loop/switch isn't completed */
        }
_L8:
        1;
        JVM INSTR tableswitch 0 1: default 224
    //                   0 177
    //                   1 13;
           goto _L4 _L5 _L6
_L5:
        continue; /* Loop/switch isn't completed */
_L4:
        break; /* Loop/switch isn't completed */
_L6:
        break; /* Loop/switch isn't completed */
        if (true) goto _L8; else goto _L7
_L7:
        if (true) goto _L3; else goto _L9
_L9:
        if (true) goto _L10; else goto _L2
_L2:
    }

    public static PendingIntent b042B042B042B042B042B042B(int i, Intent intent, int j)
    {
        if (!b041A041A041A041A041A041A_boolean_static_fld) goto _L2; else goto _L1
_L1:
        Context context;
        int k;
        int i1;
        int j1;
        context = b041A041A041A041A041A041A_android_content_Context_static_fld;
        k = b041A041A041A041A041A041A_int_static_fld;
        i1 = b041A041A041A041A041A041A_int_static_fld;
        j1 = b041A041A041A041A041A041A_int_static_fld;
        (k * (i1 + k)) % j1;
        JVM INSTR tableswitch 0 0: default 56
    //                   0 107;
           goto _L3 _L4
_L3:
        Object obj = rrrrrr/grgrgr.getMethod(nuuuuu.b0417041704170417041704170417("j8<:J\u04238<:J8<:J8<:J\u0423", '\b', '\002'), new Class[0]);
        obj = ((Method) (obj)).invoke(null, new Object[0]);
        int l = ((Integer)obj).intValue();
        try
        {
            b041A041A041A041A041A041A_int_static_fld = l;
            b041A041A041A041A041A041A_int_static_fld = 43;
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent)
        {
            throw intent;
        }
_L4:
        obj = android/app/PendingIntent.getMethod(nuuuuu.b0417041704170417041704170417("_]lK]jna[]", '\b', '\0'), new Class[] {
            android/content/Context, Integer.TYPE, android/content/Intent, Integer.TYPE
        });
        intent = ((Intent) (((Method) (obj)).invoke(null, new Object[] {
            context, Integer.valueOf(i), intent, Integer.valueOf(j)
        })));
        return (PendingIntent)intent;
        intent;
        try
        {
            throw intent.getCause();
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent)
        {
            throw intent;
        }
_L2:
        i = b041A041A041A041A041A041A_int_static_fld;
        switch ((i * (b041A041A041A041A041A041A_int_static_fld + i)) % b041A041A041A041A041A041A_int_static_fld)
        {
        default:
            intent = rrrrrr/grgrgr.getMethod(nuuuuu.b0417041704170417041704170417("\u02D8\u02A6\u02AA\u02A8\u02B8\u06A1\u02A6\u02AA\u02A8\u02B8\u02A6\u02AA\u02A8\u02B8\u02A6\u02AA\u02A8\u02B8\u06A1", '\322', '\006'), new Class[0]);
            try
            {
                intent = ((Intent) (intent.invoke(null, new Object[0])));
            }
            // Misplaced declaration of an exception variable
            catch (Intent intent)
            {
                throw intent.getCause();
            }
            b041A041A041A041A041A041A_int_static_fld = ((Integer)intent).intValue();
            intent = rrrrrr/grgrgr.getMethod(nuuuuu.b0417041704170417041704170417("\205SWUe\u044ESWUeSWUeSWUe\u044E", '\236', '\301', '\001'), new Class[0]);
            try
            {
                intent = ((Intent) (intent.invoke(null, new Object[0])));
            }
            // Misplaced declaration of an exception variable
            catch (Intent intent)
            {
                throw intent.getCause();
            }
            b041A041A041A041A041A041A_int_static_fld = ((Integer)intent).intValue();
            // fall through

        case 0: // '\0'
            return null;
        }
        intent;
        throw intent.getCause();
    }

    public static int b042B042B042B042B042B042B()
    {
        return 27;
    }

    public static WifiManager b042B042B042B042B042B042B()
    {
        Object obj;
        String s;
        Object obj2;
        int i;
        int j;
        int k;
        int l;
        int i1;
        int j1;
        try
        {
            if (!b041A041A041A041A041A041A_boolean_static_fld)
            {
                break MISSING_BLOCK_LABEL_294;
            }
            obj = b041A041A041A041A041A041A_android_content_Context_static_fld;
            s = grrrrr.b044C044C044C044C044C044C("\366\350\345\350", '\177', '\005');
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            throw obj1;
        }
        i = b041A041A041A041A041A041A_int_static_fld;
        j = b041A041A041A041A041A041A_int_static_fld;
        k = b041A041A041A041A041A041A_int_static_fld;
        l = b041A041A041A041A041A041A_int_static_fld;
        i1 = b041A041A041A041A041A041A_int_static_fld;
        j1 = b041A041A041A041A041A041A_int_static_fld;
        obj2 = rrrrrr/grgrgr.getMethod(nuuuuu.b0417041704170417041704170417("\031\u0450\u0450\u0450\u0450\u0450KOI9", '{', '\002'), new Class[0]);
        try
        {
            obj2 = ((Method) (obj2)).invoke(null, new Object[0]);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            throw ((InvocationTargetException) (obj1)).getCause();
        }
        if (((k + l) * i1) % j1 != ((Integer)obj2).intValue())
        {
            b041A041A041A041A041A041A_int_static_fld = 85;
            Object obj3 = rrrrrr/grgrgr.getMethod(nuuuuu.b0417041704170417041704170417("\204RVTd\u044DRVTdRVTdRVTd\u044D", '\362', '\320', '\002'), new Class[0]);
            Object obj1;
            try
            {
                obj3 = ((Method) (obj3)).invoke(null, new Object[0]);
            }
            catch (InvocationTargetException invocationtargetexception)
            {
                throw invocationtargetexception.getCause();
            }
            b041A041A041A041A041A041A_int_static_fld = ((Integer)obj3).intValue();
        }
        switch (((j + i) * i) % b041A041A041A041A041A041A_int_static_fld)
        {
        default:
            obj3 = rrrrrr/grgrgr.getMethod(nuuuuu.b0417041704170417041704170417("\361\243\247\241\321\u04B8\243\247\241\321\243\247\241\321\243\247\241\321\u04B8", '\223', '\002'), new Class[0]);
            try
            {
                obj3 = ((Method) (obj3)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj1)
            {
                throw ((InvocationTargetException) (obj1)).getCause();
            }
            b041A041A041A041A041A041A_int_static_fld = ((Integer)obj3).intValue();
            b041A041A041A041A041A041A_int_static_fld = 24;
            // fall through

        case 0: // '\0'
            obj3 = android/content/Context.getMethod(nuuuuu.b0417041704170417041704170417("\uFE97\uFE95\uFEA4\uFE83\uFEA9\uFEA3\uFEA4\uFE95\uFE9D\uFE83\uFE95\uFEA2\uFEA6\uFE99\uFE93\uFE95", '\350', '\003'), new Class[] {
                java/lang/String
            });
            break;
        }
        obj = ((Method) (obj3)).invoke(obj, new Object[] {
            s
        });
        obj = (Object)obj;
        try
        {
            return (WifiManager)obj;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            throw obj1;
        }
        obj1;
        throw ((InvocationTargetException) (obj1)).getCause();
        return null;
    }

    public static Context b042B042B042B042B042B042B()
    {
        Object obj = null;
        if (b041A041A041A041A041A041A_boolean_static_fld)
        {
label0:
            do
            {
                switch (1)
                {
                default:
                    while (true) 
                    {
                        switch (1)
                        {
                        default:
                            break;

                        case 0: // '\0'
                            continue label0;

                        case 1: // '\001'
                            break label0;
                        }
                    }
                    break;

                case 0: // '\0'
                    break;

                case 1: // '\001'
                    break label0;
                }
            } while (true);
            obj = rrrrrr/grgrgr.getMethod(nuuuuu.b0417041704170417041704170417("\u0335\u0303\u0307\u0305\u0315\u06FE\u0303\u0307\u0305\u0315\u0303\u0307\u0305\u0315\u0303\u0307\u0305\u0315\u06FE", '\361', '\006'), new Class[0]);
            int i;
            try
            {
                obj = ((Method) (obj)).invoke(null, new Object[0]);
            }
            catch (InvocationTargetException invocationtargetexception)
            {
                throw invocationtargetexception.getCause();
            }
            i = ((Integer)obj).intValue();
            switch ((i * (b041A041A041A041A041A041A_int_static_fld + i)) % b041A041A041A041A041A041A_int_static_fld)
            {
            default:
                b041A041A041A041A041A041A_int_static_fld = 93;
                obj = rrrrrr/grgrgr.getMethod(nuuuuu.b0417041704170417041704170417("\u0164\u0132\u0136\u0134\u0144\u052D\u0132\u0136\u0134\u0144\u0132\u0136\u0134\u0144\u0132\u0136\u0134\u0144\u052D", 'a', '\241', '\003'), new Class[0]);
                Context context;
                try
                {
                    obj = ((Method) (obj)).invoke(null, new Object[0]);
                }
                catch (InvocationTargetException invocationtargetexception1)
                {
                    throw invocationtargetexception1.getCause();
                }
                b041A041A041A041A041A041A_int_static_fld = ((Integer)obj).intValue();
                // fall through

            case 0: // '\0'
                context = b041A041A041A041A041A041A_android_content_Context_static_fld;
                break;
            }
label1:
            do
            {
                obj = context;
                switch (1)
                {
                default:
                    while (true) 
                    {
                        obj = context;
                        switch (0)
                        {
                        default:
                            break;

                        case 0: // '\0'
                            break label1;

                        case 1: // '\001'
                            continue label1;
                        }
                    }
                    break;

                case 0: // '\0'
                    break;

                case 1: // '\001'
                    break label1;
                }
            } while (true);
        }
        return ((Context) (obj));
    }

    public static grgrgr b042B042B042B042B042B042B(Context context)
    {
        if (b041A041A041A041A041A041A_rrrrrr_grgrgr_static_fld != null) goto _L2; else goto _L1
_L1:
        rrrrrr/grgrgr;
        JVM INSTR monitorenter ;
        if (b041A041A041A041A041A041A_rrrrrr_grgrgr_static_fld != null) goto _L4; else goto _L3
_L3:
        grgrgr grgrgr1 = new grgrgr();
        Method method = rrrrrr/grgrgr.getDeclaredMethod(nuuuuu.b0417041704170417041704170417("\263\341\345\343\223\341\345\343\223\341\345\343\223\341\345\343\223\341\345\343\223\u04FA", '\321', '\002'), new Class[] {
            android/content/Context
        });
        method.invoke(grgrgr1, new Object[] {
            context
        });
_L7:
        0;
        JVM INSTR tableswitch 0 1: default 84
    //                   0 111
    //                   1 61;
           goto _L5 _L6 _L7
_L5:
        1;
        JVM INSTR tableswitch 0 1: default 108
    //                   0 61
    //                   1 111;
           goto _L5 _L7 _L6
_L6:
        b041A041A041A041A041A041A_rrrrrr_grgrgr_static_fld = grgrgr1;
_L4:
        rrrrrr/grgrgr;
        JVM INSTR monitorexit ;
label0:
        do
        {
            switch (1)
            {
            default:
                while (true) 
                {
                    switch (1)
                    {
                    default:
                        break;

                    case 0: // '\0'
                        continue label0;

                    case 1: // '\001'
                        break label0;
                    }
                }
                break;

            case 0: // '\0'
                break;

            case 1: // '\001'
                break label0;
            }
        } while (true);
_L2:
        return b041A041A041A041A041A041A_rrrrrr_grgrgr_static_fld;
        context;
        rrrrrr/grgrgr;
        JVM INSTR monitorexit ;
        throw context;
        context;
        throw context.getCause();
    }

    public static BluetoothManager b042B042B042B042B042B042B()
    {
        boolean flag = b041A041A041A041A041A041A_boolean_static_fld;
        int i = b041A041A041A041A041A041A_int_static_fld;
        switch ((i * (b041A041A041A041A041A041A_int_static_fld + i)) % b041A041A041A041A041A041A_int_static_fld)
        {
        default:
            int j = b041A041A041A041A041A041A_int_static_fld;
            Object obj;
            switch ((j * (b041A041A041A041A041A041A_int_static_fld + j)) % b041A041A041A041A041A041A_int_static_fld)
            {
            default:
                b041A041A041A041A041A041A_int_static_fld = 28;
                b041A041A041A041A041A041A_int_static_fld = 68;
                // fall through

            case 0: // '\0'
                obj = rrrrrr/grgrgr.getMethod(nuuuuu.b0417041704170417041704170417("\uFEA6\uFE74\uFE78\uFE76\uFE86\u026F\uFE74\uFE78\uFE76\uFE86\uFE74\uFE78\uFE76\uFE86\uFE74\uFE78\uFE76\uFE86\u026F", '\224', '\004'), new Class[0]);
                break;
            }
            String s;
            Method method;
            try
            {
                obj = ((Method) (obj)).invoke(null, new Object[0]);
            }
            catch (InvocationTargetException invocationtargetexception)
            {
                throw invocationtargetexception.getCause();
            }
            b041A041A041A041A041A041A_int_static_fld = ((Integer)obj).intValue();
            obj = rrrrrr/grgrgr.getMethod(nuuuuu.b0417041704170417041704170417("\uFFCD\uFF9B\uFF9F\uFF9D\uFFAD\u0396\uFF9B\uFF9F\uFF9D\uFFAD\uFF9B\uFF9F\uFF9D\uFFAD\uFF9B\uFF9F\uFF9D\uFFAD\u0396", '\241', '\f', '\001'), new Class[0]);
            try
            {
                obj = ((Method) (obj)).invoke(null, new Object[0]);
            }
            catch (InvocationTargetException invocationtargetexception1)
            {
                throw invocationtargetexception1.getCause();
            }
            b041A041A041A041A041A041A_int_static_fld = ((Integer)obj).intValue();
            break;

        case 0: // '\0'
            break;
        }
        if (flag)
        {
            obj = b041A041A041A041A041A041A_android_content_Context_static_fld;
            s = grrrrr.b044C044C044C044C044C044C("\u0153\u015D\u0166\u0156\u0165\u0160\u0160\u0165\u0159", '\361', '\005');
            method = android/content/Context.getMethod(nuuuuu.b0417041704170417041704170417("\317\315\334\273\341\333\334\315\325\273\315\332\336\321\313\315", 'h', '\005'), new Class[] {
                java/lang/String
            });
            try
            {
                obj = method.invoke(obj, new Object[] {
                    s
                });
            }
            catch (InvocationTargetException invocationtargetexception2)
            {
                throw invocationtargetexception2.getCause();
            }
            return (BluetoothManager)(Object)obj;
        }
label0:
        do
        {
            switch (1)
            {
            default:
                while (true) 
                {
label1:
                    switch (0)
                    {
                    case 1: // '\001'
                        break;

                    default:
label2:
                        while (true) 
                        {
                            switch (0)
                            {
                            default:
                                break;

                            case 0: // '\0'
                                break label2;

                            case 1: // '\001'
                                break label1;
                            }
                        }
                        // fall through

                    case 0: // '\0'
                        switch (1)
                        {
                        default:
                            break;

                        case 0: // '\0'
                            continue label0;

                        case 1: // '\001'
                            break label0;
                        }
                        break;
                    }
                }
                break;

            case 0: // '\0'
                break;

            case 1: // '\001'
                break label0;
            }
        } while (true);
        return null;
    }

    public static AlarmManager b042B042B042B042B042B042B()
    {
        Object obj = null;
        if (b041A041A041A041A041A041A_boolean_static_fld)
        {
            obj = b041A041A041A041A041A041A_android_content_Context_static_fld;
            int i = b041A041A041A041A041A041A_int_static_fld;
            switch ((i * (b041A041A041A041A041A041A_int_static_fld + i)) % b041A041A041A041A041A041A_int_static_fld)
            {
            default:
                Object obj1 = rrrrrr/grgrgr.getMethod(nuuuuu.b0417041704170417041704170417("\uFFE1\uFFAF\uFFB3\uFFB1\uFFC1\u03AA\uFFAF\uFFB3\uFFB1\uFFC1\uFFAF\uFFB3\uFFB1\uFFC1\uFFAF\uFFB3\uFFB1\uFFC1\u03AA", '"', '\243', '\002'), new Class[0]);
                InvocationTargetException invocationtargetexception;
                Method method;
                try
                {
                    obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
                }
                catch (InvocationTargetException invocationtargetexception1)
                {
                    throw invocationtargetexception1.getCause();
                }
                b041A041A041A041A041A041A_int_static_fld = ((Integer)obj1).intValue();
                b041A041A041A041A041A041A_int_static_fld = 30;
                // fall through

            case 0: // '\0'
                obj1 = grrrrr.b044C044C044C044C044C044C("\u0125\u0130\u0125\u0136\u0131", '\227', '-', '\003');
                method = android/content/Context.getMethod(nuuuuu.b0417041704170417041704170417("\uFE66\uFE64\uFE73\uFE52\uFE78\uFE72\uFE73\uFE64\uFE6C\uFE52\uFE64\uFE71\uFE75\uFE68\uFE62\uFE64", '\253', '\004'), new Class[] {
                    java/lang/String
                });
                break;
            }
            try
            {
                obj = method.invoke(obj, new Object[] {
                    obj1
                });
            }
            // Misplaced declaration of an exception variable
            catch (InvocationTargetException invocationtargetexception)
            {
                throw invocationtargetexception.getCause();
            }
            obj = (AlarmManager)(Object)obj;
        }
        return ((AlarmManager) (obj));
    }

    public static int b042B042B042B042B042B042B()
    {
        return 1;
    }

    public static TelephonyManager b042B042B042B042B042B042B()
    {
        Object obj;
        if (!b041A041A041A041A041A041A_boolean_static_fld)
        {
            break MISSING_BLOCK_LABEL_155;
        }
        obj = b041A041A041A041A041A041A_android_content_Context_static_fld;
        if (((b041A041A041A041A041A041A_int_static_fld + b041A041A041A041A041A041A_int_static_fld) * b041A041A041A041A041A041A_int_static_fld) % b041A041A041A041A041A041A_int_static_fld != b041A041A041A041A041A041A_int_static_fld)
        {
            Object obj2 = rrrrrr/grgrgr.getMethod(nuuuuu.b0417041704170417041704170417("Z\b\f\nz\u0413\b\f\nz\b\f\nz\b\f\nz\u0413", '8', '\002'), new Class[0]);
            Object obj1;
            Method method;
            try
            {
                obj2 = ((Method) (obj2)).invoke(null, new Object[0]);
            }
            catch (InvocationTargetException invocationtargetexception)
            {
                throw invocationtargetexception.getCause();
            }
            b041A041A041A041A041A041A_int_static_fld = ((Integer)obj2).intValue();
            b041A041A041A041A041A041A_int_static_fld = 33;
        }
        obj2 = grrrrr.b044C044C044C044C044C044C("PHONE", '\316', '\256', '\001');
        method = android/content/Context.getMethod(nuuuuu.b0417041704170417041704170417("\335\333\352\311\357\351\352\333\343\311\333\350\354\337\331\333", 'v', '\005'), new Class[] {
            java/lang/String
        });
        obj = method.invoke(obj, new Object[] {
            obj2
        });
        obj = (Object)obj;
        try
        {
            return (TelephonyManager)obj;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            try
            {
                throw obj1;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj1)
            {
                throw obj1;
            }
        }
        obj1;
        throw ((InvocationTargetException) (obj1)).getCause();
        obj1;
        throw obj1;
        return null;
    }

    public static int b042B042B042B042B042B042B()
    {
        return 0;
    }

    static 
    {
        throw new Runtime("d2j fail translate: java.lang.IndexOutOfBoundsException: fromIndex < 0: -1\n\tat java.util.BitSet.nextSetBit(BitSet.java:701)\n\tat com.googlecode.dex2jar.ir.ts.array.FillArrayTransformer.makeSureAllElementAreAssigned(FillArrayTransformer.java:505)\n\tat com.googlecode.dex2jar.ir.ts.array.FillArrayTransformer.transformReportChanged(FillArrayTransformer.java:123)\n\tat com.googlecode.dex2jar.ir.ts.StatedTransformer.transform(StatedTransformer.java:10)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:149)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
    }
}
