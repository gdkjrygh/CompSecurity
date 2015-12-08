// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rrrrrr;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.visa.cbp.sdk.facade.VisaPaymentSDKImpl;
import com.visa.cbp.sdk.facade.activeaccountmanagement.CheckStatusService;
import com.visa.cbp.sdk.facade.activeaccountmanagement.ReplenishmentCheckService;
import com.visa.cbp.sdk.facade.data.NotificationAction;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import uuuuuu.nuuuuu;

// Referenced classes of package rrrrrr:
//            grrrrr, grrggg, grgrgr

public class rggggr
{

    public static final long b041A041A041A041A041A041A_long_static_fld = 0x5265c00L;
    public static final int b041A041A041A041A041A041A_int_static_fld = 100;
    private static final String b041A041A041A041A041A041A_java_lang_String_static_fld;
    public static int b041D041D041D041D041D041D = 80;
    public static int b041D041D041D041D041D041D = 2;
    public static final int b041D041D041D041D041D041D = 102;
    public static final int b041A041A041A041A041A041A_int_static_fld = 101;
    public static final long b041A041A041A041A041A041A_long_static_fld;
    public static final long b041A041A041A041A041A041A_long_static_fld = 0x5265c00L;
    public static int b041D041D041D041D041D041D = 0;
    public static final int b041D041D041D041D041D041D = 103;
    public static int b041D041D041D041D041D041D = 1;

    public rggggr()
    {
        Object obj;
        InvocationTargetException invocationtargetexception;
        int i;
        int j;
        int k;
        try
        {
            super();
            i = b041D041D041D041D041D041D;
        }
        catch (Exception exception)
        {
            throw exception;
        }
        try
        {
            j = b041D041D041D041D041D041D;
            k = b041D041D041D041D041D041D;
        }
        catch (Exception exception1)
        {
            throw exception1;
        }
        (i * (j + i)) % k;
        JVM INSTR tableswitch 0 0: default 44
    //                   0 102;
           goto _L1 _L2
_L1:
        obj = rrrrrr/rggggr.getMethod(nuuuuu.b0417041704170417041704170417(">\u041C\f\020\020\f\u041C\u041C\u041C\u041C", '\022', '\003'), new Class[0]);
        obj = ((Method) (obj)).invoke(null, new Object[0]);
        i = ((Integer)obj).intValue();
        b041D041D041D041D041D041D = i;
        b041D041D041D041D041D041D = 6;
        return;
        invocationtargetexception;
        throw invocationtargetexception.getCause();
_L2:
    }

    public static void b044004400440044004400440(long l)
    {
        if (VisaPaymentSDKImpl.environment == null)
        {
            String s = grrrrr.b044C044C044C044C044C044C("=+:;>\017--+==\032!%+ \017*8/ -+\031/< ' )\0136>'<7", 'N', '\002');
            Method method = rrrrrr/grrggg.getMethod(nuuuuu.b0417041704170417041704170417("\u0158\u0515\u0515\u0515\u0126\u012A\u0127\u013C\u0126\u012A\u0127\u013C\u0126\u012A\u0127\u013C", '{', '\001'), new Class[] {
                java/lang/String
            });
            try
            {
                method.invoke(null, new Object[] {
                    s
                });
                return;
            }
            catch (InvocationTargetException invocationtargetexception)
            {
                throw invocationtargetexception.getCause();
            }
        }
        Object obj = rrrrrr/grgrgr.getMethod(nuuuuu.b0417041704170417041704170417("z\u0443HLJZ\u0443\u0443\u0443HLJZ", '\b', '\006'), new Class[0]);
        Object obj1;
        Object obj2;
        Method method1;
        int i;
        int k;
        int i1;
        int j1;
        try
        {
            obj = ((Method) (obj)).invoke(null, new Object[0]);
        }
        // Misplaced declaration of an exception variable
        catch (InvocationTargetException invocationtargetexception1)
        {
            throw invocationtargetexception1.getCause();
        }
        obj = (AlarmManager)obj;
        if (((b041D041D041D041D041D041D + b041D041D041D041D041D041D) * b041D041D041D041D041D041D) % b041D041D041D041D041D041D != b041D041D041D041D041D041D)
        {
            b041D041D041D041D041D041D = 19;
            b041D041D041D041D041D041D = 25;
        }
        obj1 = new Intent(grrrrr.b044C044C044C044C044C044C("\u010B\u0117\u0115\326\u011E\u0111\u011B\u0109\326\u010B\u010A\u0118\326\u0109\u010B\u011C\u0111\u0117\u0116\326\376\361\373\351\u0107\373\354\363\u0107\366\367\374\361\356\361\353\351\374\361\367\366", '\250', '\005'));
        obj2 = rrrrrr/grgrgr.getMethod(nuuuuu.b0417041704170417041704170417("\uFF1F\uFEED\uFEF1\uFEEF\uFEFF\u02E8\u02E8\u02E8\u02E8\uFEED\uFEF1\uFEEF\uFEFF", '\325', 'n', '\0'), new Class[0]);
        try
        {
            obj2 = ((Method) (obj2)).invoke(null, new Object[0]);
        }
        // Misplaced declaration of an exception variable
        catch (InvocationTargetException invocationtargetexception1)
        {
            throw invocationtargetexception1.getCause();
        }
        obj2 = (Context)obj2;
        method1 = android/content/Context.getMethod(nuuuuu.b0417041704170417041704170417("\326\324\343\277\320\322\332\320\326\324\275\320\334\324", 'o', '\005'), new Class[0]);
        try
        {
            obj2 = method1.invoke(obj2, new Object[0]);
        }
        // Misplaced declaration of an exception variable
        catch (InvocationTargetException invocationtargetexception1)
        {
            throw invocationtargetexception1.getCause();
        }
        obj2 = (String)obj2;
        method1 = android/content/Intent.getMethod(nuuuuu.b0417041704170417041704170417("\uFE7B\uFE6D\uFE7C\uFE58\uFE69\uFE6B\uFE73\uFE69\uFE6F\uFE6D", '\250', '\004'), new Class[] {
            java/lang/String
        });
        try
        {
            obj2 = method1.invoke(obj1, new Object[] {
                obj2
            });
        }
        // Misplaced declaration of an exception variable
        catch (InvocationTargetException invocationtargetexception1)
        {
            throw invocationtargetexception1.getCause();
        }
        obj2 = (Intent)obj2;
        i = b041D041D041D041D041D041D;
        k = b041D041D041D041D041D041D;
        i1 = b041D041D041D041D041D041D;
        j1 = b041D041D041D041D041D041D;
        obj2 = rrrrrr/rggggr.getMethod(nuuuuu.b0417041704170417041704170417("\u01A0\u057E\u057E\u057E\u016E\u0172\u0172\u016E\u057E\u057E", 'j', '\006'), new Class[0]);
        try
        {
            obj2 = ((Method) (obj2)).invoke(null, new Object[0]);
        }
        catch (InvocationTargetException invocationtargetexception4)
        {
            throw invocationtargetexception4.getCause();
        }
        if (((i + k) * i1) % j1 != ((Integer)obj2).intValue())
        {
            Object obj3 = rrrrrr/rggggr.getMethod(nuuuuu.b0417041704170417041704170417("\uFF61\u033F\uFF2F\uFF33\uFF33\uFF2F\u033F\u033F\u033F\u033F", '\367', '\n', '\0'), new Class[0]);
            InvocationTargetException invocationtargetexception1;
            Object obj4;
            Method method2;
            int j;
            try
            {
                obj3 = ((Method) (obj3)).invoke(null, new Object[0]);
            }
            catch (InvocationTargetException invocationtargetexception2)
            {
                throw invocationtargetexception2.getCause();
            }
            b041D041D041D041D041D041D = ((Integer)obj3).intValue();
            obj3 = rrrrrr/rggggr.getMethod(nuuuuu.b0417041704170417041704170417("\uFF22\u0300\uFEF0\uFEF4\uFEF4\uFEF0\u0300\u0300\u0300\u0300", 'S', '\355', '\0'), new Class[0]);
            try
            {
                obj3 = ((Method) (obj3)).invoke(null, new Object[0]);
            }
            catch (InvocationTargetException invocationtargetexception3)
            {
                throw invocationtargetexception3.getCause();
            }
            b041D041D041D041D041D041D = ((Integer)obj3).intValue();
        }
label0:
        do
        {
            switch (0)
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
                break label0;

            case 1: // '\001'
                break;
            }
        } while (true);
        obj3 = grrrrr.b044C044C044C044C044C044C("\321\335\333\234\344\327\341\317\234\321\320\336\234\317\321\342\327\335\334\234\304\267\301\257\315\301\262\271\315\274\275\302\267\264\267\261\257\302\267\275\274\315\257\261\302\267\275\274", '7', '\001');
        obj4 = NotificationAction.ACTION_ACCESS_TOKEN_ABOUT_TO_EXPIRE;
        method2 = com/visa/cbp/sdk/facade/data/NotificationAction.getMethod(nuuuuu.b0417041704170417041704170417("\u0158\u0156\u0165\u0134\u0160\u0155\u0156", '4', '\275', '\003'), new Class[0]);
        try
        {
            obj4 = method2.invoke(obj4, new Object[0]);
        }
        // Misplaced declaration of an exception variable
        catch (InvocationTargetException invocationtargetexception1)
        {
            throw invocationtargetexception1.getCause();
        }
        j = ((Integer)obj4).intValue();
        obj4 = android/content/Intent.getMethod(nuuuuu.b0417041704170417041704170417("\uFF36\uFF3B\uFF3A\uFF0B\uFF3E\uFF3A\uFF38\uFF27", '\235', '\003'), new Class[] {
            java/lang/String, Integer.TYPE
        });
        try
        {
            obj3 = ((Method) (obj4)).invoke(obj1, new Object[] {
                obj3, Integer.valueOf(j)
            });
        }
        // Misplaced declaration of an exception variable
        catch (InvocationTargetException invocationtargetexception1)
        {
            throw invocationtargetexception1.getCause();
        }
        obj3 = (Intent)obj3;
        obj3 = rrrrrr/grgrgr.getMethod(nuuuuu.b0417041704170417041704170417("\uFDA4\uFD72\uFD76\uFD74\uFD84\uFD72\uFD76\uFD74\uFD84\u016D\u016D\u016D\uFD72\uFD76\uFD74\uFD84", '\352', '\004'), new Class[] {
            Integer.TYPE, android/content/Intent, Integer.TYPE
        });
        try
        {
            obj1 = ((Method) (obj3)).invoke(null, new Object[] {
                Integer.valueOf(102), obj1, Integer.valueOf(0x8000000)
            });
        }
        // Misplaced declaration of an exception variable
        catch (InvocationTargetException invocationtargetexception1)
        {
            throw invocationtargetexception1.getCause();
        }
        obj1 = (PendingIntent)obj1;
        obj3 = android/app/AlarmManager.getMethod(nuuuuu.b0417041704170417041704170417("\u0124\u0116\u0125\366\u0129\u0112\u0114\u0125", '\261', '\005'), new Class[] {
            Integer.TYPE, Long.TYPE, android/app/PendingIntent
        });
        try
        {
            ((Method) (obj3)).invoke(obj, new Object[] {
                Integer.valueOf(0), Long.valueOf(l), obj1
            });
            return;
        }
        // Misplaced declaration of an exception variable
        catch (InvocationTargetException invocationtargetexception1)
        {
            throw invocationtargetexception1.getCause();
        }
    }

    public static void b044004400440044004400440(long l)
    {
_L2:
        1;
        JVM INSTR tableswitch 0 1: default 24
    //                   0 0
    //                   1 51;
           goto _L1 _L2 _L3
_L1:
        1;
        JVM INSTR tableswitch 0 1: default 48
    //                   0 0
    //                   1 51;
           goto _L1 _L2 _L3
_L3:
        if (VisaPaymentSDKImpl.environment != null) goto _L5; else goto _L4
_L4:
        int i = b041D041D041D041D041D041D;
        int k = b041D041D041D041D041D041D;
        Object obj = rrrrrr/rggggr.getMethod(nuuuuu.b0417041704170417041704170417("\uFF90\u036E\u036E\uFF5E\uFF62\uFF62\uFF5E\u036E\u036E\u036E", '9', '\231', '\0'), new Class[0]);
        InvocationTargetException invocationtargetexception1;
        try
        {
            obj = ((Method) (obj)).invoke(null, new Object[0]);
        }
        catch (InvocationTargetException invocationtargetexception2)
        {
            throw invocationtargetexception2.getCause();
        }
        switch (((k + i) * i) % ((Integer)obj).intValue())
        {
        default:
            Object obj1 = rrrrrr/rggggr.getMethod(nuuuuu.b0417041704170417041704170417("\020\u03EE\uFFDE\uFFE2\uFFE2\uFFDE\u03EE\u03EE\u03EE\u03EE", ')', '\003'), new Class[0]);
            Object obj2;
            Object obj3;
            Object obj4;
            int j;
            int i1;
            long l1;
            try
            {
                obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
            }
            catch (InvocationTargetException invocationtargetexception)
            {
                throw invocationtargetexception.getCause();
            }
            b041D041D041D041D041D041D = ((Integer)obj1).intValue();
            b041D041D041D041D041D041D = 44;
            break;

        case 0: // '\0'
            break;
        }
        try
        {
            obj1 = grrrrr.b044C044C044C044C044C044C("\u026F\u0261\u0270\u0271\u026C\u023F\u0264\u0261\u025F\u0267\u024F\u0270\u025D\u0270\u0271\u026F\u024F\u025F\u0264\u0261\u0260\u0271\u0268\u0261\u026E", '\376', '\001');
        }
        // Misplaced declaration of an exception variable
        catch (Object obj2)
        {
            throw obj2;
        }
        obj3 = rrrrrr/grrggg.getMethod(nuuuuu.b0417041704170417041704170417("\272\u04C7\u04C7\u04C7\350\354\351\236\350\354\351\236\350\354\351\236", '\330', '\002'), new Class[] {
            java/lang/String
        });
        ((Method) (obj3)).invoke(null, new Object[] {
            obj1
        });
_L9:
        return;
_L7:
        obj4 = java/lang/System.getMethod(nuuuuu.b0417041704170417041704170417("\252\274\271\271\254\265\273\233\260\264\254\224\260\263\263\260\272", '7', '~', '\001'), new Class[0]);
        obj4 = ((Method) (obj4)).invoke(null, new Object[0]);
        l1 = ((Long)obj4).longValue();
        obj4 = android/app/AlarmManager.getMethod(nuuuuu.b0417041704170417041704170417("\uFF89\uFF7B\uFF8A\uFF68\uFF7B\uFF86\uFF7B\uFF77\uFF8A\uFF7F\uFF84\uFF7D", '\352', '\0'), new Class[] {
            Integer.TYPE, Long.TYPE, Long.TYPE, android/app/PendingIntent
        });
        try
        {
            ((Method) (obj4)).invoke(obj3, new Object[] {
                Integer.valueOf(0), Long.valueOf(l1 + l), Long.valueOf(l), obj1
            });
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1) { }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            throw obj1;
        }
        throw ((InvocationTargetException) (obj1)).getCause();
        obj1;
        throw ((InvocationTargetException) (obj1)).getCause();
_L5:
        obj1 = rrrrrr/grgrgr.getMethod(nuuuuu.b0417041704170417041704170417("]+/-=\u0426\u0426\u0426\u0426+/-=", '\005', '\0'), new Class[0]);
        obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
        obj1 = (Context)obj1;
        obj1 = new Intent(((Context) (obj1)), com/visa/cbp/sdk/facade/activeaccountmanagement/CheckStatusService);
        obj3 = rrrrrr/grgrgr.getMethod(nuuuuu.b0417041704170417041704170417("\u0350\u031E\u0322\u0320\u0330\u031E\u0322\u0320\u0330\u0719\u0719\u0719\u031E\u0322\u0320\u0330", '\372', '\006'), new Class[] {
            Integer.TYPE, android/content/Intent, Integer.TYPE
        });
        obj1 = ((Method) (obj3)).invoke(null, new Object[] {
            Integer.valueOf(100), obj1, Integer.valueOf(0x8000000)
        });
        obj1 = (PendingIntent)obj1;
        obj3 = rrrrrr/grgrgr.getMethod(nuuuuu.b0417041704170417041704170417("\uFEFA\u02C3\uFEC8\uFECC\uFECA\uFEDA\u02C3\u02C3\u02C3\uFEC8\uFECC\uFECA\uFEDA", '\264', '\003'), new Class[0]);
        obj3 = ((Method) (obj3)).invoke(null, new Object[0]);
        obj3 = (AlarmManager)obj3;
        if (l > 0L) goto _L7; else goto _L6
_L6:
        l = b041A041A041A041A041A041A_long_static_fld;
        obj4 = android/app/AlarmManager.getMethod(nuuuuu.b0417041704170417041704170417("\316\330\311\364\323\330\305\334\336\311\357\330\315\330\334\311\324\323\332", '\275', '\002'), new Class[] {
            Integer.TYPE, Long.TYPE, Long.TYPE, android/app/PendingIntent
        });
        ((Method) (obj4)).invoke(obj3, new Object[] {
            Integer.valueOf(0), Long.valueOf(l), Long.valueOf(0x5265c00L), obj1
        });
        obj1 = rrrrrr/rggggr.getMethod(nuuuuu.b0417041704170417041704170417("\uFE49\u0227\uFE17\uFE1B\uFE1B\uFE17\u0227\u0227\u0227\u0227", '\263', '\004'), new Class[0]);
        try
        {
            obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj2)
        {
            throw ((InvocationTargetException) (obj2)).getCause();
        }
        j = ((Integer)obj1).intValue();
        i1 = b041D041D041D041D041D041D;
        obj1 = rrrrrr/rggggr.getMethod(nuuuuu.b0417041704170417041704170417("\uFED2\u02B0\uFEA0\uFEA4\uFEA4\uFEA0\u02B0\u02B0\u02B0\u02B0", '\310', '\003'), new Class[0]);
        try
        {
            obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj2)
        {
            throw ((InvocationTargetException) (obj2)).getCause();
        }
        if ((((Integer)obj1).intValue() * (i1 + j)) % b041D041D041D041D041D041D == b041D041D041D041D041D041D) goto _L9; else goto _L8
_L8:
        b041D041D041D041D041D041D = 17;
        b041D041D041D041D041D041D = 64;
        return;
        obj2;
        throw ((InvocationTargetException) (obj2)).getCause();
        obj2;
        throw ((InvocationTargetException) (obj2)).getCause();
        invocationtargetexception1;
        throw invocationtargetexception1.getCause();
        InvocationTargetException invocationtargetexception3;
        invocationtargetexception3;
        throw invocationtargetexception3.getCause();
        invocationtargetexception3;
        throw invocationtargetexception3.getCause();
    }

    public static void b044004400440044004400440()
    {
        long l = b041A041A041A041A041A041A_long_static_fld;
        Method method = rrrrrr/rggggr.getMethod(nuuuuu.b0417041704170417041704170417("\uFED0\u02AE\uFE9E\uFEA2\uFEA2\uFE9E\uFE9E\uFEA2\uFEA2\uFE9E\u02AE\u02AE\u02AE", '\206', '\004'), new Class[] {
            Long.TYPE
        });
        int i;
        try
        {
            method.invoke(null, new Object[] {
                Long.valueOf(l)
            });
        }
        catch (InvocationTargetException invocationtargetexception)
        {
            throw invocationtargetexception.getCause();
        }
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
        i = b041D041D041D041D041D041D;
        switch ((i * (b041D041D041D041D041D041D + i)) % b041D041D041D041D041D041D)
        {
        default:
            int j = b041D041D041D041D041D041D;
            Object obj;
            switch ((j * (b041D041D041D041D041D041D + j)) % b041D041D041D041D041D041D)
            {
            default:
                b041D041D041D041D041D041D = 75;
                b041D041D041D041D041D041D = 54;
                // fall through

            case 0: // '\0'
                obj = rrrrrr/rggggr.getMethod(nuuuuu.b0417041704170417041704170417("\247\u0485uyyu\u0485\u0485\u0485\u0485", '\272', 'u', '\002'), new Class[0]);
                break;
            }
            try
            {
                obj = ((Method) (obj)).invoke(null, new Object[0]);
            }
            catch (InvocationTargetException invocationtargetexception1)
            {
                throw invocationtargetexception1.getCause();
            }
            b041D041D041D041D041D041D = ((Integer)obj).intValue();
label1:
            do
            {
                switch (0)
                {
                default:
                    while (true) 
                    {
                        switch (1)
                        {
                        default:
                            break;

                        case 0: // '\0'
                            continue label1;

                        case 1: // '\001'
                            break label1;
                        }
                    }
                    break;

                case 0: // '\0'
                    break label1;

                case 1: // '\001'
                    break;
                }
            } while (true);
            b041D041D041D041D041D041D = 38;
            // fall through

        case 0: // '\0'
            return;
        }
    }

    public static void b044004400440044004400440(long l)
    {
        if (VisaPaymentSDKImpl.environment != null) goto _L2; else goto _L1
_L1:
        String s = grrrrr.b044C044C044C044C044C044C("\uFFF0\uFFE2\uFFF1\uFFD2\uFFED\uFFBE\uFFE0\uFFE0\uFFE2\uFFF0\uFFF0\uFFD1\uFFEC\uFFE8\uFFE2\uFFEB\uFFC2\uFFF5\uFFED\uFFE6\uFFEF\uFFE2\uFFE1\uFFD4\uFFDE\uFFEF\uFFEB\uFFE6\uFFEB\uFFE4", '\016', '\221', '\002');
        Object obj1 = rrrrrr/grrggg.getMethod(nuuuuu.b0417041704170417041704170417("\uFD68\u0125\u0125\u0125\uFD36\uFD3A\uFD37\uFD4C\uFD36\uFD3A\uFD37\uFD4C\uFD36\uFD3A\uFD37\uFD4C", '\376', '\004'), new Class[] {
            java/lang/String
        });
        Object obj2;
        Object obj3;
        Method method;
        int i;
        try
        {
            ((Method) (obj1)).invoke(null, new Object[] {
                s
            });
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw obj;
        }
          goto _L3
_L13:
        i = b041D041D041D041D041D041D;
        switch ((i * (b041D041D041D041D041D041D + i)) % b041D041D041D041D041D041D)
        {
        default:
            obj1 = rrrrrr/rggggr.getMethod(nuuuuu.b0417041704170417041704170417("\224\u0472bffb\u0472\u0472\u0472\u0472", '\031', '\001'), new Class[0]);
            Object obj;
            InvocationTargetException invocationtargetexception;
            try
            {
                obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
            }
            catch (InvocationTargetException invocationtargetexception1)
            {
                throw invocationtargetexception1.getCause();
            }
            b041D041D041D041D041D041D = ((Integer)obj1).intValue();
            b041D041D041D041D041D041D = 41;
            break;

        case 0: // '\0'
            break;
        }
        obj1 = new Intent(grrrrr.b044C044C044C044C044C044C("\uFFB5\uFFC1\uFFBF\uFF80\uFFC8\uFFBB\uFFC5\uFFB3\uFF80\uFFB5\uFFB4\uFFC2\uFF80\uFFB3\uFFB5\uFFC6\uFFBB\uFFC1\uFFC0\uFF80\uFFA8\uFF9B\uFFA5\uFF93\uFFB1\uFFA5\uFF96\uFF9D\uFFB1\uFFA0\uFFA1\uFFA6\uFF9B\uFF98\uFF9B\uFF95\uFF93\uFFA6\uFF9B\uFFA1\uFFA0", ':', '\004'));
        obj2 = rrrrrr/grgrgr.getMethod(nuuuuu.b0417041704170417041704170417("\uFF9D\uFF6B\uFF6F\uFF6D\uFF7D\u0366\u0366\u0366\u0366\uFF6B\uFF6F\uFF6D\uFF7D", '\305', '\0'), new Class[0]);
        obj2 = ((Method) (obj2)).invoke(null, new Object[0]);
        obj2 = (Context)obj2;
        obj3 = android/content/Context.getMethod(nuuuuu.b0417041704170417041704170417("\u0124\u0122\u0131\u010D\u011E\u0120\u0128\u011E\u0124\u0122\u010B\u011E\u012A\u0122", '\241', '\034', '\003'), new Class[0]);
        obj2 = ((Method) (obj3)).invoke(obj2, new Object[0]);
        obj2 = (String)obj2;
        obj3 = android/content/Intent.getMethod(nuuuuu.b0417041704170417041704170417("\u0334\u0326\u0335\u0311\u0322\u0324\u032C\u0322\u0328\u0326", '\353', '\006'), new Class[] {
            java/lang/String
        });
        obj2 = ((Method) (obj3)).invoke(obj1, new Object[] {
            obj2
        });
        obj2 = (Intent)obj2;
        obj2 = grrrrr.b044C044C044C044C044C044C("@LN\rUJPB\r@AS\rB@WJLM\rujpb|pgh|mlwjej`bwjlm|b`wjlm", '#', '\002');
        obj3 = NotificationAction.ACTION_ACCESS_TOKEN_EXPIRED;
        method = com/visa/cbp/sdk/facade/data/NotificationAction.getMethod(nuuuuu.b0417041704170417041704170417("\u016F\u016D\u017C\u014B\u0177\u016C\u016D", '\204', '\001'), new Class[0]);
        obj3 = method.invoke(obj3, new Object[0]);
        i = ((Integer)obj3).intValue();
        if (((b041D041D041D041D041D041D + b041D041D041D041D041D041D) * b041D041D041D041D041D041D) % b041D041D041D041D041D041D != b041D041D041D041D041D041D)
        {
            obj3 = rrrrrr/rggggr.getMethod(nuuuuu.b0417041704170417041704170417("\uFE9E\u027C\uFE6C\uFE70\uFE70\uFE6C\u027C\u027C\u027C\u027C", '\376', '\306', '\0'), new Class[0]);
            InvocationTargetException invocationtargetexception2;
            try
            {
                obj3 = ((Method) (obj3)).invoke(null, new Object[0]);
            }
            catch (InvocationTargetException invocationtargetexception3)
            {
                throw invocationtargetexception3.getCause();
            }
            b041D041D041D041D041D041D = ((Integer)obj3).intValue();
            b041D041D041D041D041D041D = 93;
        }
        obj3 = android/content/Intent.getMethod(nuuuuu.b0417041704170417041704170417("\uFF8C\uFF91\uFF90\uFF61\uFF94\uFF90\uFF8E\uFF7D", 'r', '\003'), new Class[] {
            java/lang/String, Integer.TYPE
        });
        obj2 = ((Method) (obj3)).invoke(obj1, new Object[] {
            obj2, Integer.valueOf(i)
        });
        obj2 = (Intent)obj2;
        obj2 = rrrrrr/grgrgr.getMethod(nuuuuu.b0417041704170417041704170417("\256\374\370\376\216\374\370\376\216\u04E7\u04E7\u04E7\374\370\376\216", '\314', '\002'), new Class[] {
            Integer.TYPE, android/content/Intent, Integer.TYPE
        });
        obj1 = ((Method) (obj2)).invoke(null, new Object[] {
            Integer.valueOf(103), obj1, Integer.valueOf(0x8000000)
        });
        obj1 = (PendingIntent)obj1;
        obj2 = android/app/AlarmManager.getMethod(nuuuuu.b0417041704170417041704170417("\uFEB5\uFEA7\uFEB6\uFE87\uFEBA\uFEA3\uFEA5\uFEB6", '\302', '\374', '\0'), new Class[] {
            Integer.TYPE, Long.TYPE, android/app/PendingIntent
        });
        try
        {
            ((Method) (obj2)).invoke(obj, new Object[] {
                Integer.valueOf(0), Long.valueOf(l), obj1
            });
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw obj;
        }
        throw ((InvocationTargetException) (obj)).getCause();
        obj;
        throw ((InvocationTargetException) (obj)).getCause();
        obj;
        throw ((InvocationTargetException) (obj)).getCause();
_L3:
        throw ((InvocationTargetException) (obj)).getCause();
_L2:
        obj = rrrrrr/grgrgr.getMethod(nuuuuu.b0417041704170417041704170417("\351\u04B2\267\273\271\311\u04B2\u04B2\u04B2\267\273\271\311", '\007', '\200', '\003'), new Class[0]);
        obj = ((Method) (obj)).invoke(null, new Object[0]);
        obj = (AlarmManager)obj;
_L11:
        switch (0)
        {
        case 0: // '\0'
            continue; /* Loop/switch isn't completed */

        case 1: // '\001'
            continue; /* Loop/switch isn't completed */
        }
          goto _L4
_L9:
        1;
        JVM INSTR tableswitch 0 1: default 732
    //                   0 683
    //                   1 57;
           goto _L4 _L5 _L6
_L6:
        continue; /* Loop/switch isn't completed */
_L5:
        break; /* Loop/switch isn't completed */
        invocationtargetexception;
          goto _L7
_L4:
        if (true) goto _L9; else goto _L8
_L8:
        if (true) goto _L11; else goto _L10
_L10:
        if (true) goto _L13; else goto _L12
_L12:
_L7:
        throw invocationtargetexception.getCause();
        invocationtargetexception;
        throw invocationtargetexception.getCause();
        invocationtargetexception;
        throw invocationtargetexception.getCause();
        invocationtargetexception;
        throw invocationtargetexception.getCause();
        invocationtargetexception2;
        throw invocationtargetexception2.getCause();
    }

    public static void b044004400440044004400440(long l)
    {
        Object obj = rrrrrr/grgrgr.getMethod(nuuuuu.b0417041704170417041704170417("\u01B8\u0186\u018A\u0188\u0198\u0581\u0581\u0581\u0581\u0186\u018A\u0188\u0198", '\253', '\001'), new Class[0]);
        Object obj1;
        int i;
        try
        {
            obj = ((Method) (obj)).invoke(null, new Object[0]);
        }
        catch (InvocationTargetException invocationtargetexception)
        {
            throw invocationtargetexception.getCause();
        }
        obj = new Intent((Context)obj, com/visa/cbp/sdk/facade/activeaccountmanagement/ReplenishmentCheckService);
        obj1 = rrrrrr/grgrgr.getMethod(nuuuuu.b0417041704170417041704170417("\uFEF8\uFEC6\uFECA\uFEC8\uFED8\uFEC6\uFECA\uFEC8\uFED8\u02C1\u02C1\u02C1\uFEC6\uFECA\uFEC8\uFED8", '\265', '\003'), new Class[] {
            Integer.TYPE, android/content/Intent, Integer.TYPE
        });
        try
        {
            obj = ((Method) (obj1)).invoke(null, new Object[] {
                Integer.valueOf(101), obj, Integer.valueOf(0x8000000)
            });
        }
        catch (InvocationTargetException invocationtargetexception1)
        {
            throw invocationtargetexception1.getCause();
        }
        obj = (PendingIntent)obj;
        obj1 = rrrrrr/grgrgr.getMethod(nuuuuu.b0417041704170417041704170417("j\u04338<:J\u0433\u0433\u04338<:J", '\b', '\005'), new Class[0]);
        try
        {
            obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
        }
        catch (InvocationTargetException invocationtargetexception2)
        {
            throw invocationtargetexception2.getCause();
        }
        obj1 = (AlarmManager)obj1;
        if (((b041D041D041D041D041D041D + b041D041D041D041D041D041D) * b041D041D041D041D041D041D) % b041D041D041D041D041D041D != b041D041D041D041D041D041D)
        {
            b041D041D041D041D041D041D = 44;
            b041D041D041D041D041D041D = 36;
        }
        i = b041D041D041D041D041D041D;
        switch ((i * (b041D041D041D041D041D041D + i)) % b041D041D041D041D041D041D)
        {
        default:
            Object obj2 = rrrrrr/rggggr.getMethod(nuuuuu.b0417041704170417041704170417("\uFF19\u02F7\uFEE7\uFEEB\uFEEB\uFEE7\u02F7\u02F7\u02F7\u02F7", '\276', '\213', '\0'), new Class[0]);
            InvocationTargetException invocationtargetexception3;
            try
            {
                obj2 = ((Method) (obj2)).invoke(null, new Object[0]);
            }
            catch (InvocationTargetException invocationtargetexception4)
            {
                throw invocationtargetexception4.getCause();
            }
            b041D041D041D041D041D041D = ((Integer)obj2).intValue();
            b041D041D041D041D041D041D = 63;
            // fall through

        case 0: // '\0'
            obj2 = android/app/AlarmManager.getMethod(nuuuuu.b0417041704170417041704170417("\u019D\u018F\u019E\u0173\u0198\u018F\u01A2\u018B\u018D\u019E\u017C\u018F\u019A\u018F\u018B\u019E\u0193\u0198\u0191", '\225', '\001'), new Class[] {
                Integer.TYPE, Long.TYPE, Long.TYPE, android/app/PendingIntent
            });
            break;
        }
        try
        {
            ((Method) (obj2)).invoke(obj1, new Object[] {
                Integer.valueOf(0), Long.valueOf(l), Long.valueOf(0x5265c00L), obj
            });
            return;
        }
        // Misplaced declaration of an exception variable
        catch (InvocationTargetException invocationtargetexception3)
        {
            throw invocationtargetexception3.getCause();
        }
    }

    public static int b044004400440044004400440()
    {
        return 97;
    }

    public static int b044004400440044004400440()
    {
        return 2;
    }

    public static int b044004400440044004400440()
    {
        return 0;
    }

    static 
    {
        Object obj = java/lang/Class.getMethod(nuuuuu.b0417041704170417041704170417("\017\r\034&\t\005\r", 'h', '\002'), new Class[0]);
        int i;
        int j;
        int k;
        try
        {
            obj = ((Method) (obj)).invoke(rrrrrr/rggggr, new Object[0]);
        }
        catch (InvocationTargetException invocationtargetexception)
        {
            throw invocationtargetexception.getCause();
        }
        b041A041A041A041A041A041A_java_lang_String_static_fld = (String)obj;
        obj = java/lang/System.getMethod(nuuuuu.b0417041704170417041704170417("\uFF8D\uFF9F\uFF9C\uFF9C\uFF8F\uFF98\uFF9E\uFF7E\uFF93\uFF97\uFF8F\uFF77\uFF93\uFF96\uFF96\uFF93\uFF9D", '\326', '\0'), new Class[0]);
        try
        {
            obj = ((Method) (obj)).invoke(null, new Object[0]);
        }
        catch (InvocationTargetException invocationtargetexception1)
        {
            throw invocationtargetexception1.getCause();
        }
        b041A041A041A041A041A041A_long_static_fld = ((Long)obj).longValue() + 0x5265c00L;
        i = b041D041D041D041D041D041D;
        j = b041D041D041D041D041D041D;
        k = b041D041D041D041D041D041D;
label0:
        do
        {
            switch (1)
            {
            default:
                while (true) 
                {
                    switch (0)
                    {
                    default:
                        break;

                    case 0: // '\0'
                        break label0;

                    case 1: // '\001'
                        continue label0;
                    }
                }
                break;

            case 0: // '\0'
                break;

            case 1: // '\001'
                break label0;
            }
        } while (true);
        switch ((i * (j + i)) % k)
        {
        default:
            Object obj1 = rrrrrr/rggggr.getMethod(nuuuuu.b0417041704170417041704170417("\334\u04BA\252\256\256\252\u04BA\u04BA\u04BA\u04BA", 'I', '1', '\003'), new Class[0]);
            try
            {
                obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
            }
            catch (InvocationTargetException invocationtargetexception2)
            {
                throw invocationtargetexception2.getCause();
            }
            b041D041D041D041D041D041D = ((Integer)obj1).intValue();
            if (((b041D041D041D041D041D041D + b041D041D041D041D041D041D) * b041D041D041D041D041D041D) % b041D041D041D041D041D041D != b041D041D041D041D041D041D)
            {
                Object obj2 = rrrrrr/rggggr.getMethod(nuuuuu.b0417041704170417041704170417("\u0212\u05F0\u01E0\u01E4\u01E4\u01E0\u05F0\u05F0\u05F0\u05F0", '\220', '\006'), new Class[0]);
                try
                {
                    obj2 = ((Method) (obj2)).invoke(null, new Object[0]);
                }
                catch (InvocationTargetException invocationtargetexception3)
                {
                    throw invocationtargetexception3.getCause();
                }
                b041D041D041D041D041D041D = ((Integer)obj2).intValue();
                obj2 = rrrrrr/rggggr.getMethod(nuuuuu.b0417041704170417041704170417("\246\u0484txxt\u0484\u0484\u0484\u0484", '"', '\001'), new Class[0]);
                try
                {
                    obj2 = ((Method) (obj2)).invoke(null, new Object[0]);
                }
                catch (InvocationTargetException invocationtargetexception4)
                {
                    throw invocationtargetexception4.getCause();
                }
                b041D041D041D041D041D041D = ((Integer)obj2).intValue();
            }
            b041D041D041D041D041D041D = 34;
            break;

        case 0: // '\0'
            break;
        }
label1:
        do
        {
            switch (0)
            {
            default:
                while (true) 
                {
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
                break label1;

            case 1: // '\001'
                break;
            }
        } while (true);
    }
}
