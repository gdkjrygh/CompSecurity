// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.visa.cbp.sdk.facade.broadcastreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.visa.cbp.sdk.facade.VisaPaymentSDK;
import com.visa.cbp.sdk.facade.VisaPaymentSDKImpl;
import com.visa.cbp.sdk.facade.environment.Environment;
import com.visa.cbp.sdk.facade.environment.EnvironmentRepo;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import rrrrrr.gggrgg;
import rrrrrr.grrgrg;
import rrrrrr.llpppl;
import rrrrrr.lppllp;
import rrrrrr.ppplpl;
import rrrrrr.ppplpp;
import rrrrrr.rggggr;
import rrrrrr.rgrgrg;
import uuuuuu.nuuuuu;

public class DeviceBootReceiver extends BroadcastReceiver
{

    private static final String TAG;
    public static int b043B043B043B043B043B043B = 1;
    public static int b043B043B043B043B043B043B = 0;
    public static int b043B043B043B043B043B043B = 65;
    public static int b043B043B043B043B043B043B = 2;
    private final long TEN_MINUTES;
    private ppplpl tokenDao;

    public DeviceBootReceiver()
    {
        Object obj;
        int i;
        int k;
        int l;
        try
        {
            i = b043B043B043B043B043B043B;
            k = b043B043B043B043B043B043B;
            l = b043B043B043B043B043B043B;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj2)
        {
            throw obj2;
        }
        (i * (k + i)) % l;
        JVM INSTR tableswitch 0 0: default 40
    //                   0 153;
           goto _L1 _L2
_L2:
        break MISSING_BLOCK_LABEL_153;
_L1:
        obj = com/visa/cbp/sdk/facade/broadcastreceiver/DeviceBootReceiver.getMethod(nuuuuu.b0417041704170417041704170417("\f\uFFDA\uFFDE\uFFDD\uFFEC\u03E5\uFFDA\uFFDE\uFFDD\uFFEC\u03E5\u03E5\u03E5", '\207', '1', '\001'), new Class[0]);
        obj = ((Method) (obj)).invoke(null, new Object[0]);
        int j = ((Integer)obj).intValue();
        if (((b043B043B043B043B043B043B + b043B043B043B043B043B043B) * b043B043B043B043B043B043B) % b043B043B043B043B043B043B != b043B043B043B043B043B043B)
        {
            Object obj1 = com/visa/cbp/sdk/facade/broadcastreceiver/DeviceBootReceiver.getMethod(nuuuuu.b0417041704170417041704170417("\u010A\330\334\333\352\u04E3\330\334\333\352\u04E3\u04E3\u04E3", '\250', '\005'), new Class[0]);
            Object obj2;
            try
            {
                obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
            }
            catch (InvocationTargetException invocationtargetexception)
            {
                throw invocationtargetexception.getCause();
            }
            b043B043B043B043B043B043B = ((Integer)obj1).intValue();
            b043B043B043B043B043B043B = 26;
        }
        b043B043B043B043B043B043B = j;
        b043B043B043B043B043B043B = 51;
        super();
        try
        {
            TEN_MINUTES = 0x927c0L;
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj2)
        {
            try
            {
                throw obj2;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj2)
            {
                throw obj2;
            }
        }
        obj2;
        throw obj2;
        obj2;
        throw ((InvocationTargetException) (obj2)).getCause();
    }

    public static int b043B043B043B043B043B043B()
    {
        return 1;
    }

    public static int b043B043B043B043B043B043B()
    {
        return 12;
    }

    private void initializeSdk(Context context, String s)
    {
        Object obj = java/lang/String.getMethod(nuuuuu.b0417041704170417041704170417("R^bNY`", '\023', '\0'), new Class[] {
            java/lang/Object
        });
        obj = ((Method) (obj)).invoke(s, new Object[] {
            "FLOW_2"
        });
        if (((Boolean)obj).booleanValue()) goto _L2; else goto _L1
_L1:
        Object obj1;
        int i;
        int j;
        int k;
        int l;
        int i1;
        try
        {
            i = b043B043B043B043B043B043B;
            j = b043B043B043B043B043B043B;
            k = b043B043B043B043B043B043B;
            l = b043B043B043B043B043B043B;
            i1 = b043B043B043B043B043B043B;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw context;
        }
        if (((i + j) * k) % l == i1)
        {
            break MISSING_BLOCK_LABEL_137;
        }
        obj1 = com/visa/cbp/sdk/facade/broadcastreceiver/DeviceBootReceiver.getMethod(nuuuuu.b0417041704170417041704170417("\uFEA6\uFE74\uFE78\uFE77\uFE86\u027F\uFE74\uFE78\uFE77\uFE86\u027F\u027F\u027F", '\224', '\004'), new Class[0]);
        obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
        i = ((Integer)obj1).intValue();
        try
        {
            b043B043B043B043B043B043B = i;
            b043B043B043B043B043B043B = 45;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw context;
        }
        if (((b043B043B043B043B043B043B + b043B043B043B043B043B043B) * b043B043B043B043B043B043B) % b043B043B043B043B043B043B != b043B043B043B043B043B043B)
        {
            obj1 = com/visa/cbp/sdk/facade/broadcastreceiver/DeviceBootReceiver.getMethod(nuuuuu.b0417041704170417041704170417("\uFEF0\uFEBE\uFEC2\uFEC1\uFED0\u02C9\uFEBE\uFEC2\uFEC1\uFED0\u02C9\u02C9\u02C9", '\337', '\223', '\0'), new Class[0]);
            try
            {
                obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                throw context.getCause();
            }
            b043B043B043B043B043B043B = ((Integer)obj1).intValue();
            obj1 = com/visa/cbp/sdk/facade/broadcastreceiver/DeviceBootReceiver.getMethod(nuuuuu.b0417041704170417041704170417("\u016C\u013A\u013E\u013D\u014C\u0545\u013A\u013E\u013D\u014C\u0545\u0545\u0545", ';', '\317', '\003'), new Class[0]);
            try
            {
                obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                throw context.getCause();
            }
            b043B043B043B043B043B043B = ((Integer)obj1).intValue();
        }
        obj1 = com/visa/cbp/sdk/facade/environment/EnvironmentRepo.getMethod(nuuuuu.b0417041704170417041704170417("b`o@iqdmjih`ioAmjhNomdib", '`', 'e', '\002'), new Class[] {
            java/lang/String
        });
        s = ((String) (((Method) (obj1)).invoke(null, new Object[] {
            s
        })));
        s = (Environment)s;
_L4:
        obj1 = com/visa/cbp/sdk/facade/VisaPaymentSDKImpl.getMethod(nuuuuu.b0417041704170417041704170417("_d_j_Wb_p[", '+', '5', '\002'), new Class[] {
            android/content/Context, com/visa/cbp/sdk/facade/environment/Environment
        });
        ((Method) (obj1)).invoke(null, new Object[] {
            context, s
        });
        context = com/visa/cbp/sdk/facade/VisaPaymentSDKImpl.getMethod(nuuuuu.b0417041704170417041704170417("\u01A3\u01A1\u01B0\u0185\u01AA\u01AF\u01B0\u019D\u01AA\u019F\u01A1", '\236', '\001'), new Class[0]);
        context = ((Context) (context.invoke(null, new Object[0])));
        context = (VisaPaymentSDK)context;
        return;
        context;
        try
        {
            throw context.getCause();
        }
        // Misplaced declaration of an exception variable
        catch (Context context) { }
        throw context;
        context;
        throw context.getCause();
        context;
        try
        {
            throw context.getCause();
        }
        // Misplaced declaration of an exception variable
        catch (Context context) { }
        throw context;
        context;
        throw context.getCause();
        context;
        throw context.getCause();
_L2:
        s = null;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void onReceive(Context context, Intent intent)
    {
        Object obj;
        Object obj1;
        Object obj2;
        int i;
        long l;
        long l1;
        long l2;
        try
        {
            obj = TAG;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw context;
        }
        obj1 = rrrrrr/ppplpp.getMethod(nuuuuu.b0417041704170417041704170417("\023\u03C6\u03C6\uFFE1\uFFE5\uFFE2\uFFE6\uFFE1\uFFE5\uFFE2\uFFE6\uFFE1\uFFE5\uFFE2\uFFE6\u03C6\uFFE1\uFFE5\uFFE2\uFFE6", 'O', '\0'), new Class[] {
            java/lang/String, java/lang/String
        });
        ((Method) (obj1)).invoke(null, new Object[] {
            obj, "Broadcast received"
        });
        i = b043B043B043B043B043B043B;
        switch ((i * (b043B043B043B043B043B043B + i)) % b043B043B043B043B043B043B)
        {
        default:
            b043B043B043B043B043B043B = 2;
            b043B043B043B043B043B043B = 52;
            // fall through

        case 0: // '\0'
            obj = android/content/Context.getMethod(nuuuuu.b0417041704170417041704170417("\u0214\u0212\u0221\u01EE\u021D\u021D\u0219\u0216\u0210\u020E\u0221\u0216\u021C\u021B\u01F0\u021C\u021B\u0221\u0212\u0225\u0221", '\364', '\271', '\003'), new Class[0]);
            break;
        }
        obj = ((Method) (obj)).invoke(context, new Object[0]);
        obj = (Context)obj;
        try
        {
            obj = new lppllp(((Context) (obj)));
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw context;
        }
        obj1 = rrrrrr/grrgrg.getMethod(nuuuuu.b0417041704170417041704170417("\u01C7\u058C\u0195\u0199\u0197\u019C\u058C\u0195\u0199\u0197\u019C\u058C\u058C", '\246', '\277', '\003'), new Class[0]);
        obj1 = ((Method) (obj1)).invoke(obj, new Object[0]);
        obj1 = (String)obj1;
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_1042;
        }
        obj2 = java/lang/String.getMethod(nuuuuu.b0417041704170417041704170417("\234\250\254\230\243\252", '7', '\005'), new Class[] {
            java/lang/Object
        });
        obj2 = ((Method) (obj2)).invoke(obj1, new Object[] {
            "FLOW_2"
        });
        if (((Boolean)obj2).booleanValue())
        {
            break MISSING_BLOCK_LABEL_1042;
        }
        obj2 = android/content/Intent.getMethod(nuuuuu.b0417041704170417041704170417("\u0140\u013E\u014D\u011A\u013C\u014D\u0142\u0148\u0147", '\032', '\363', '\001'), new Class[0]);
        intent = ((Intent) (((Method) (obj2)).invoke(intent, new Object[0])));
        intent = (String)intent;
        obj2 = java/lang/String.getMethod(nuuuuu.b0417041704170417041704170417("\uFFFF\013\017\uFFFB\006\r", '3', '\003'), new Class[] {
            java/lang/Object
        });
        intent = ((Intent) (((Method) (obj2)).invoke(intent, new Object[] {
            "android.intent.action.BOOT_COMPLETED"
        })));
        if (!((Boolean)intent).booleanValue())
        {
            break MISSING_BLOCK_LABEL_1042;
        }
        intent = com/visa/cbp/sdk/facade/broadcastreceiver/DeviceBootReceiver.getDeclaredMethod(nuuuuu.b0417041704170417041704170417("\u0104\u0109\u0104\u010F\u0104\374\u0107\u0104\u0115\u0100\356\377\u0106", '3', '\316', '\001'), new Class[] {
            android/content/Context, java/lang/String
        });
        intent.invoke(this, new Object[] {
            context, obj1
        });
        tokenDao = new llpppl(context);
        context = tokenDao;
        intent = rrrrrr/ppplpl.getMethod(nuuuuu.b0417041704170417041704170417("\uFEEC\uFEBA\uFEBE\uFEBB\uFECC\u02A5\u02A5\u02A5\u02A5\uFEBA\uFEBE\uFEBB\uFECC", '\321', '\245', '\0'), new Class[0]);
        context = ((Context) (intent.invoke(context, new Object[0])));
        context = (List)context;
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_1175;
        }
        intent = java/util/List.getMethod(nuuuuu.b0417041704170417041704170417("\u0191\u0187\u0198\u0183", '\217', '\001'), new Class[0]);
        context = ((Context) (intent.invoke(context, new Object[0])));
        if (((Integer)context).intValue() <= 0)
        {
            break MISSING_BLOCK_LABEL_1175;
        }
        context = java/lang/System.getMethod(nuuuuu.b0417041704170417041704170417("\u01E9\u01FB\u01F8\u01F8\u01EB\u01F4\u01FA\u01DA\u01EF\u01F3\u01EB\u01D3\u01EF\u01F2\u01F2\u01EF\u01F9", '\202', '\006'), new Class[0]);
        context = ((Context) (context.invoke(null, new Object[0])));
        l = ((Long)context).longValue();
        context = com/visa/cbp/sdk/facade/VisaPaymentSDKImpl.getMethod(nuuuuu.b0417041704170417041704170417("\uFDC4\uFDC2\uFDD1\uFDA6\uFDCB\uFDD0\uFDD1\uFDBE\uFDCB\uFDC0\uFDC2", '\341', '\004'), new Class[0]);
        context = ((Context) (context.invoke(null, new Object[0])));
        context = (VisaPaymentSDK)context;
        intent = rrrrrr/rggggr.getMethod(nuuuuu.b0417041704170417041704170417("\212\u0468X\\\\XX\\\\X\u0468\u0468\u0468", '(', '\005'), new Class[] {
            Long.TYPE
        });
        intent.invoke(null, new Object[] {
            Long.valueOf(0x927c0L + l)
        });
        if (((b043B043B043B043B043B043B + b043B043B043B043B043B043B) * b043B043B043B043B043B043B) % b043B043B043B043B043B043B != b043B043B043B043B043B043B)
        {
            intent = com/visa/cbp/sdk/facade/broadcastreceiver/DeviceBootReceiver.getMethod(nuuuuu.b0417041704170417041704170417("\321\237\243\242\261\u04AA\237\243\242\261\u04AA\u04AA\u04AA", 'o', '\005'), new Class[0]);
            try
            {
                intent = ((Intent) (intent.invoke(null, new Object[0])));
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                throw context.getCause();
            }
            b043B043B043B043B043B043B = ((Integer)intent).intValue();
            b043B043B043B043B043B043B = 1;
        }
        intent = com/visa/cbp/sdk/facade/VisaPaymentSDK.getMethod(nuuuuu.b0417041704170417041704170417("\u01CF\u01CD\u01DC\u01AB\u01D0\u01CD\u01CB\u01D3\u01BB\u01DC\u01C9\u01DC\u01DD\u01DB\u01B8\u01CD\u01DA\u01D1\u01D7\u01CC", '\264', '\001'), new Class[0]);
        context = ((Context) (intent.invoke(context, new Object[0])));
        l1 = ((Long)context).longValue();
        context = rrrrrr/rggggr.getMethod(nuuuuu.b0417041704170417041704170417("n<@@<<@@<\u044C\u044C\u044C\u044C", '\004', '\006'), new Class[] {
            Long.TYPE
        });
        context.invoke(null, new Object[] {
            Long.valueOf(l1)
        });
        context = rrrrrr/grrgrg.getMethod(nuuuuu.b0417041704170417041704170417("\u01DF\u05BD\u01AD\u01B1\u01B1\u01AD\u05BD\u01AD\u01B1\u01B1\u01AD\u01AD\u01B1\u01B1\u01AD\u01AD\u01B1\u01B1\u01AD", '\177', '\006'), new Class[0]);
        context = ((Context) (context.invoke(obj, new Object[0])));
        context = (gggrgg)context;
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_1042;
        }
        intent = rrrrrr/gggrgg.getMethod(nuuuuu.b0417041704170417041704170417("\uFFAB\uFF79\uFF7D\uFF7D\uFF79\u0389\u0389\uFF79\uFF7D\uFF7D\uFF79\uFF79\uFF7D\uFF7D\uFF79\uFF79\uFF7D\uFF7D\uFF79", '5', '\202', '\0'), new Class[0]);
        context = ((Context) (intent.invoke(context, new Object[0])));
        l1 = ((Long)context).longValue();
        context = rrrrrr/grrgrg.getMethod(nuuuuu.b0417041704170417041704170417("\006\uFFD4\uFFD8\uFFD6\uFFDB\uFFD4\uFFD8\uFFD6\uFFDB\uFFD4\uFFD8\uFFD6\uFFDB\u03CB\u03CB\u03CB", '\\', '\0'), new Class[0]);
        context = ((Context) (context.invoke(obj, new Object[0])));
        context = (rgrgrg)context;
        intent = rrrrrr/rgrgrg.getMethod(nuuuuu.b0417041704170417041704170417("\u0176\u053B\u053B\u0144\u0148\u0146\u014B\u0144\u0148\u0146\u014B\u0144\u0148\u0146\u014B\u053B", '\212', '\001'), new Class[0]);
        context = ((Context) (intent.invoke(context, new Object[0])));
        l2 = ((Long)context).longValue();
        if (l1 <= l)
        {
            break MISSING_BLOCK_LABEL_940;
        }
        context = rrrrrr/rggggr.getMethod(nuuuuu.b0417041704170417041704170417("\uFD98\uFD66\uFD6A\uFD6A\uFD66\uFD66\uFD6A\uFD6A\uFD66\uFD66\uFD6A\uFD6A\uFD66\u0176\u0176\u0176", '\356', '\004'), new Class[] {
            Long.TYPE
        });
        context.invoke(null, new Object[] {
            Long.valueOf(l1)
        });
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
        if (l2 <= l)
        {
            break MISSING_BLOCK_LABEL_1042;
        }
        context = rrrrrr/rggggr.getMethod(nuuuuu.b0417041704170417041704170417("\uFD65\uFD33\uFD37\uFD37\uFD33\u0143\u0143\uFD33\uFD37\uFD37\uFD33\u0143\u0143", '\377', '\004'), new Class[] {
            Long.TYPE
        });
        context.invoke(null, new Object[] {
            Long.valueOf(l2)
        });
        return;
        context;
        throw context.getCause();
        context;
        throw context.getCause();
        context;
        throw context.getCause();
        context;
        throw context.getCause();
        context;
        throw context.getCause();
        context;
        throw context.getCause();
        context;
        throw context.getCause();
        context;
        throw context.getCause();
        context;
        throw context.getCause();
        context;
        throw context.getCause();
        context;
        throw context.getCause();
        context;
        throw context.getCause();
        context;
        throw context.getCause();
        context;
        throw context.getCause();
        context;
        throw context.getCause();
        context;
        throw context.getCause();
        context;
        throw context.getCause();
        context;
        throw context.getCause();
        context;
        throw context.getCause();
        context;
        throw context.getCause();
        context = TAG;
        intent = rrrrrr/ppplpp.getMethod(nuuuuu.b0417041704170417041704170417("\u0140\u04F3\u04F3\u010E\u0112\u010F\u0113\u010E\u0112\u010F\u0113\u010E\u0112\u010F\u0113\u04F3\u010E\u0112\u010F\u0113", '\336', '\005'), new Class[] {
            java/lang/String, java/lang/String
        });
        intent.invoke(null, new Object[] {
            context, "TokenInfo Null"
        });
        return;
        context;
        throw context.getCause();
    }

    static 
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
        Object obj = java/lang/Class.getMethod(nuuuuu.b0417041704170417041704170417("\uFF9F\uFF9D\uFFAC\uFF8B\uFFA1\uFFA5\uFFA8\uFFA4\uFF9D\uFF86\uFF99\uFFA5\uFF9D", '\305', '\003', '\0'), new Class[0]);
        int i;
        int j;
        try
        {
            obj = ((Method) (obj)).invoke(com/visa/cbp/sdk/facade/broadcastreceiver/DeviceBootReceiver, new Object[0]);
        }
        catch (InvocationTargetException invocationtargetexception4)
        {
            throw invocationtargetexception4.getCause();
        }
        TAG = (String)obj;
        obj = com/visa/cbp/sdk/facade/broadcastreceiver/DeviceBootReceiver.getMethod(nuuuuu.b0417041704170417041704170417("\u01F1\u01BF\u01C3\u01C2\u01D1\u05CA\u01BF\u01C3\u01C2\u01D1\u05CA\u05CA\u05CA", '\375', '\222', '\003'), new Class[0]);
        try
        {
            obj = ((Method) (obj)).invoke(null, new Object[0]);
        }
        catch (InvocationTargetException invocationtargetexception1)
        {
            throw invocationtargetexception1.getCause();
        }
        i = ((Integer)obj).intValue();
        obj = com/visa/cbp/sdk/facade/broadcastreceiver/DeviceBootReceiver.getMethod(nuuuuu.b0417041704170417041704170417("\uFFD0\uFF9E\uFFA2\uFFA1\uFFB0\uFF9E\uFFA2\uFFA1\uFFB0\uFF9E\uFFA2\uFFA1\uFFB0\u03A9\u03A9\u03A9", '\222', '\0'), new Class[0]);
        try
        {
            obj = ((Method) (obj)).invoke(null, new Object[0]);
        }
        catch (InvocationTargetException invocationtargetexception2)
        {
            throw invocationtargetexception2.getCause();
        }
        j = ((Integer)obj).intValue();
        obj = com/visa/cbp/sdk/facade/broadcastreceiver/DeviceBootReceiver.getMethod(nuuuuu.b0417041704170417041704170417("\024\uFFE2\uFFE6\uFFE5\uFFF4\u03ED\uFFE2\uFFE6\uFFE5\uFFF4\u03ED\u03ED\u03ED", ']', '\017', '\001'), new Class[0]);
        try
        {
            obj = ((Method) (obj)).invoke(null, new Object[0]);
        }
        catch (InvocationTargetException invocationtargetexception3)
        {
            throw invocationtargetexception3.getCause();
        }
        if ((((Integer)obj).intValue() * (i + j)) % b043B043B043B043B043B043B != b043B043B043B043B043B043B)
        {
            Object obj1 = com/visa/cbp/sdk/facade/broadcastreceiver/DeviceBootReceiver.getMethod(nuuuuu.b0417041704170417041704170417("\340\256\262\261\300\u04B9\256\262\261\300\u04B9\u04B9\u04B9", 'C', ';', '\003'), new Class[0]);
            try
            {
                obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
            }
            catch (InvocationTargetException invocationtargetexception5)
            {
                throw invocationtargetexception5.getCause();
            }
            b043B043B043B043B043B043B = ((Integer)obj1).intValue();
            if (((b043B043B043B043B043B043B + b043B043B043B043B043B043B) * b043B043B043B043B043B043B) % b043B043B043B043B043B043B != b043B043B043B043B043B043B)
            {
                Object obj2 = com/visa/cbp/sdk/facade/broadcastreceiver/DeviceBootReceiver.getMethod(nuuuuu.b0417041704170417041704170417("\u0123\361\365\364\u0103\u04FC\361\365\364\u0103\u04FC\u04FC\u04FC", '\301', '\005'), new Class[0]);
                InvocationTargetException invocationtargetexception;
                try
                {
                    obj2 = ((Method) (obj2)).invoke(null, new Object[0]);
                }
                catch (InvocationTargetException invocationtargetexception6)
                {
                    throw invocationtargetexception6.getCause();
                }
                b043B043B043B043B043B043B = ((Integer)obj2).intValue();
                b043B043B043B043B043B043B = 56;
            }
            obj2 = com/visa/cbp/sdk/facade/broadcastreceiver/DeviceBootReceiver.getMethod(nuuuuu.b0417041704170417041704170417("\uFF26\uFEF4\uFEF8\uFEF7\uFF06\u02FF\uFEF4\uFEF8\uFEF7\uFF06\u02FF\u02FF\u02FF", '\366', 'F', '\0'), new Class[0]);
            try
            {
                obj2 = ((Method) (obj2)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (InvocationTargetException invocationtargetexception)
            {
                throw invocationtargetexception.getCause();
            }
            b043B043B043B043B043B043B = ((Integer)obj2).intValue();
        }
    }
}
