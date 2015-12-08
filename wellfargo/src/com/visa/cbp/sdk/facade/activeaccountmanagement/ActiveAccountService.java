// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.visa.cbp.sdk.facade.activeaccountmanagement;

import android.app.Service;
import android.content.Intent;
import android.os.Handler;
import com.visa.cbp.sdk.facade.VisaPaymentSDKImpl;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.TimeZone;
import rrrrrr.grrggg;
import uuuuuu.nuuuuu;

abstract class ActiveAccountService extends Service
{

    public static int b044E044E044E044E044E044E = 1;
    public static int b044E044E044E044E044E044E = 18;
    public static int b044E044E044E044E044E044E = 0;
    public static int b044E044E044E044E044E044E = 2;
    protected static final long delayedTime[] = {
        30000L, 60000L, 0x1d4c0L
    };
    protected static final DateFormat formatter;
    protected Handler handler;

    ActiveAccountService()
    {
        int i = b044E044E044E044E044E044E;
        int j = b044E044E044E044E044E044E;
        if (((b044E044E044E044E044E044E + b044E044E044E044E044E044E) * b044E044E044E044E044E044E) % b044E044E044E044E044E044E != b044E044E044E044E044E044E)
        {
            Object obj = com/visa/cbp/sdk/facade/activeaccountmanagement/ActiveAccountService.getMethod(nuuuuu.b0417041704170417041704170417("\uFECE\uFE9C\uFEA0\uFEA0\uFEB1\u02BA\u02BA\uFE9C\uFEA0\uFEA0\uFEB1\uFE9C\uFEA0\uFEA0\uFEB1\u02BA", '\312', '\003'), new Class[0]);
            InvocationTargetException invocationtargetexception;
            try
            {
                obj = ((Method) (obj)).invoke(null, new Object[0]);
            }
            catch (InvocationTargetException invocationtargetexception1)
            {
                throw invocationtargetexception1.getCause();
            }
            b044E044E044E044E044E044E = ((Integer)obj).intValue();
            b044E044E044E044E044E044E = 28;
        }
        if (((i + j) * b044E044E044E044E044E044E) % b044E044E044E044E044E044E != b044E044E044E044E044E044E)
        {
            obj = com/visa/cbp/sdk/facade/activeaccountmanagement/ActiveAccountService.getMethod(nuuuuu.b0417041704170417041704170417("\uFF72\uFF40\uFF44\uFF44\uFF55\u035E\u035E\uFF40\uFF44\uFF44\uFF55\uFF40\uFF44\uFF44\uFF55\u035E", 'z', 'v', '\0'), new Class[0]);
            try
            {
                obj = ((Method) (obj)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (InvocationTargetException invocationtargetexception)
            {
                throw invocationtargetexception.getCause();
            }
            b044E044E044E044E044E044E = ((Integer)obj).intValue();
            b044E044E044E044E044E044E = 22;
        }
label0:
        do
        {
            switch (0)
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
                break label0;

            case 1: // '\001'
                break;
            }
        } while (true);
        super();
    }

    public static int b044E044E044E044E044E044E()
    {
        return 23;
    }

    public static int b044E044E044E044E044E044E()
    {
        return 2;
    }

    public int onStartCommand(Intent intent, int i, int j)
    {
        if (VisaPaymentSDKImpl.environment != null) goto _L2; else goto _L1
_L1:
        Object obj = new StringBuilder();
        Object obj1 = java/lang/Object.getMethod(nuuuuu.b0417041704170417041704170417("\u01DB\u01D9\u01E8\u01B7\u01E0\u01D5\u01E7\u01E7", '|', '\006'), new Class[0]);
        obj1 = ((Method) (obj1)).invoke(this, new Object[0]);
        Method method;
        obj1 = (Class)obj1;
        method = java/lang/Class.getMethod(nuuuuu.b0417041704170417041704170417("\u0205\u0203\u0212\u01F1\u0207\u020B\u020E\u020A\u0203\u01EC\u01FF\u020B\u0203", '\317', '\001'), new Class[0]);
        obj1 = method.invoke(obj1, new Object[0]);
        obj1 = (String)obj1;
        method = java/lang/StringBuilder.getMethod(nuuuuu.b0417041704170417041704170417("\uFF77\uFF86\uFF86\uFF7B\uFF84\uFF7A", 'u', '\003'), new Class[] {
            java/lang/String
        });
        obj = method.invoke(obj, new Object[] {
            obj1
        });
        obj = (StringBuilder)obj;
        Object obj2;
        int k;
        int l;
        int i1;
        int j1;
        int k1;
        try
        {
            k = b044E044E044E044E044E044E;
            l = b044E044E044E044E044E044E;
            i1 = b044E044E044E044E044E044E;
            j1 = b044E044E044E044E044E044E;
            k1 = b044E044E044E044E044E044E;
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent)
        {
            throw intent;
        }
        if (((k + l) * i1) % j1 == k1)
        {
            break MISSING_BLOCK_LABEL_396;
        }
        obj2 = com/visa/cbp/sdk/facade/activeaccountmanagement/ActiveAccountService.getMethod(nuuuuu.b0417041704170417041704170417("\uFECC\uFE9A\uFE9E\uFE9E\uFEAF\u02B8\u02B8\uFE9A\uFE9E\uFE9E\uFEAF\uFE9A\uFE9E\uFE9E\uFEAF\u02B8", '\313', '\003'), new Class[0]);
        obj2 = ((Method) (obj2)).invoke(null, new Object[0]);
        k = ((Integer)obj2).intValue();
        try
        {
            b044E044E044E044E044E044E = k;
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent)
        {
            throw intent;
        }
        obj2 = com/visa/cbp/sdk/facade/activeaccountmanagement/ActiveAccountService.getMethod(nuuuuu.b0417041704170417041704170417("`.22C\u044C\u044C.22C.22C\u044C", '\001', '\003'), new Class[0]);
        obj2 = ((Method) (obj2)).invoke(null, new Object[0]);
        k = ((Integer)obj2).intValue();
        b044E044E044E044E044E044E = k;
        obj2 = com/visa/cbp/sdk/facade/activeaccountmanagement/ActiveAccountService.getMethod(nuuuuu.b0417041704170417041704170417("H\026\032\032+\u0434\u0434\026\032\032+\026\032\032+\u0434", '\r', '\003'), new Class[0]);
        try
        {
            obj2 = ((Method) (obj2)).invoke(null, new Object[0]);
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent)
        {
            throw intent.getCause();
        }
        k = ((Integer)obj2).intValue();
        switch ((k * (b044E044E044E044E044E044E + k)) % b044E044E044E044E044E044E)
        {
        default:
            obj2 = com/visa/cbp/sdk/facade/activeaccountmanagement/ActiveAccountService.getMethod(nuuuuu.b0417041704170417041704170417("\227\305\301\301\260\u04BB\u04BB\305\301\301\260\305\301\301\260\u04BB", '\365', '\002'), new Class[0]);
            try
            {
                obj2 = ((Method) (obj2)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (Intent intent)
            {
                throw intent.getCause();
            }
            b044E044E044E044E044E044E = ((Integer)obj2).intValue();
            b044E044E044E044E044E044E = 98;
            break;

        case 0: // '\0'
            break;
        }
        obj2 = java/lang/StringBuilder.getMethod(nuuuuu.b0417041704170417041704170417("\uFE7D\uFE8C\uFE8C\uFE81\uFE8A\uFE80", '\362', '\003'), new Class[] {
            java/lang/String
        });
        obj = ((Method) (obj2)).invoke(obj, new Object[] {
            ".onStartCommand"
        });
        obj = (StringBuilder)obj;
        obj2 = java/lang/StringBuilder.getMethod(nuuuuu.b0417041704170417041704170417("HC'HF=B;", '\026', '\003'), new Class[0]);
        obj = ((Method) (obj2)).invoke(obj, new Object[0]);
        obj = (String)obj;
        obj2 = rrrrrr/grrggg.getMethod(nuuuuu.b0417041704170417041704170417("\uFEB2\u026F\u026F\u026F\uFE80\uFE84\uFE81\uFE96\uFE80\uFE84\uFE81\uFE96\uFE80\uFE84\uFE81\uFE96", '\261', '\377', '\0'), new Class[] {
            java/lang/String
        });
        ((Method) (obj2)).invoke(null, new Object[] {
            obj
        });
        i = super.onStartCommand(intent, i, j);
        return i;
_L6:
        throw intent;
        intent;
        throw intent.getCause();
        intent;
        throw intent.getCause();
_L4:
        throw intent;
_L2:
        handler = new Handler();
        obj = com/visa/cbp/sdk/facade/activeaccountmanagement/ActiveAccountService.getDeclaredMethod(nuuuuu.b0417041704170417041704170417("\032\034\031\r\017\035\035\uFFED\031\027\027\013\030\016", '+', '\003'), new Class[] {
            android/content/Intent, Integer.TYPE, Integer.TYPE
        });
        intent = ((Intent) (((Method) (obj)).invoke(this, new Object[] {
            intent, Integer.valueOf(i), Integer.valueOf(j)
        })));
        return ((Integer)intent).intValue();
        intent;
        try
        {
            throw intent.getCause();
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent) { }
        if (true) goto _L4; else goto _L3
_L3:
        intent;
        try
        {
            throw intent.getCause();
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent) { }
        if (true) goto _L6; else goto _L5
_L5:
        intent;
        throw intent.getCause();
        intent;
        throw intent.getCause();
        intent;
        throw intent.getCause();
        intent;
        throw intent.getCause();
        intent;
        throw intent.getCause();
    }

    protected abstract int processCommand(Intent intent, int i, int j);

    static 
    {
        Object obj;
        int i;
        int k;
        int i1;
        try
        {
            formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        }
        // Misplaced declaration of an exception variable
        catch (Object obj2)
        {
            throw obj2;
        }
        obj = com/visa/cbp/sdk/facade/activeaccountmanagement/ActiveAccountService.getMethod(nuuuuu.b0417041704170417041704170417("\uFDD4\uFDA2\uFDA6\uFDA6\uFDB7\u01C0\u01C0\uFDA2\uFDA6\uFDA6\uFDB7\uFDA2\uFDA6\uFDA6\uFDB7\u01C0", '\332', '\004'), new Class[0]);
        try
        {
            obj = ((Method) (obj)).invoke(null, new Object[0]);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj2)
        {
            throw ((InvocationTargetException) (obj2)).getCause();
        }
        i = ((Integer)obj).intValue();
        k = b044E044E044E044E044E044E;
        obj = com/visa/cbp/sdk/facade/activeaccountmanagement/ActiveAccountService.getMethod(nuuuuu.b0417041704170417041704170417("\uFFC3\uFF91\uFF95\uFF95\uFFA6\u03AF\u03AF\uFF91\uFF95\uFF95\uFFA6\uFF91\uFF95\uFF95\uFFA6\u03AF", 'y', '&', '\0'), new Class[0]);
        try
        {
            obj = ((Method) (obj)).invoke(null, new Object[0]);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj2)
        {
            throw ((InvocationTargetException) (obj2)).getCause();
        }
        i1 = ((Integer)obj).intValue();
        obj = com/visa/cbp/sdk/facade/activeaccountmanagement/ActiveAccountService.getMethod(nuuuuu.b0417041704170417041704170417("\uFF74\u0360\uFF42\uFF46\uFF46\uFF57\u0360\uFF42\uFF46\uFF46\uFF57\uFF42\uFF46\uFF46\uFF57\u0360", 'w', '\003'), new Class[0]);
        try
        {
            obj = ((Method) (obj)).invoke(null, new Object[0]);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj2)
        {
            throw ((InvocationTargetException) (obj2)).getCause();
        }
        if (((k + i) * i1) % ((Integer)obj).intValue() != b044E044E044E044E044E044E)
        {
            Object obj1 = com/visa/cbp/sdk/facade/activeaccountmanagement/ActiveAccountService.getMethod(nuuuuu.b0417041704170417041704170417("\271\353\357\357\236\u0495\u0495\353\357\357\236\353\357\357\236\u0495", '\333', '\002'), new Class[0]);
            Object obj2;
            Object obj3;
            Method method;
            int j;
            int l;
            try
            {
                obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
            }
            catch (InvocationTargetException invocationtargetexception)
            {
                throw invocationtargetexception.getCause();
            }
            b044E044E044E044E044E044E = ((Integer)obj1).intValue();
            b044E044E044E044E044E044E = 38;
        }
        obj1 = com/visa/cbp/sdk/facade/activeaccountmanagement/ActiveAccountService.getMethod(nuuuuu.b0417041704170417041704170417("\351\273\277\277\316\u04C5\u04C5\273\277\277\316\273\277\277\316\u04C5", '\213', '\002'), new Class[0]);
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
        l = b044E044E044E044E044E044E;
        obj1 = com/visa/cbp/sdk/facade/activeaccountmanagement/ActiveAccountService.getMethod(nuuuuu.b0417041704170417041704170417("\uFF98\uFF66\uFF6A\uFF6A\uFF7B\u0384\u0384\uFF66\uFF6A\uFF6A\uFF7B\uFF66\uFF6A\uFF6A\uFF7B\u0384", '\312', '\0'), new Class[0]);
        try
        {
            obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj2)
        {
            throw ((InvocationTargetException) (obj2)).getCause();
        }
        if ((((Integer)obj1).intValue() * (l + j)) % b044E044E044E044E044E044E != b044E044E044E044E044E044E)
        {
            b044E044E044E044E044E044E = 70;
            obj1 = com/visa/cbp/sdk/facade/activeaccountmanagement/ActiveAccountService.getMethod(nuuuuu.b0417041704170417041704170417("\226dhhy\u0482\u0482dhhydhhy\u0482", '\231', '\315', '\001'), new Class[0]);
            try
            {
                obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj2)
            {
                throw ((InvocationTargetException) (obj2)).getCause();
            }
            b044E044E044E044E044E044E = ((Integer)obj1).intValue();
        }
        try
        {
            obj1 = formatter;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj2)
        {
            throw obj2;
        }
        obj3 = java/util/TimeZone.getMethod(nuuuuu.b0417041704170417041704170417("&$3\023(,$\031.-$", 'A', '\0'), new Class[] {
            java/lang/String
        });
        obj3 = ((Method) (obj3)).invoke(null, new Object[] {
            "UTC"
        });
        obj3 = (TimeZone)obj3;
        method = java/text/DateFormat.getMethod(nuuuuu.b0417041704170417041704170417("\uFFB7\uFFA9\uFFB8\uFF98\uFFAD\uFFB1\uFFA9\uFF9E\uFFB3\uFFB2\uFFA9", '^', '\003'), new Class[] {
            java/util/TimeZone
        });
        method.invoke(obj1, new Object[] {
            obj3
        });
        return;
        obj2;
        throw ((InvocationTargetException) (obj2)).getCause();
        obj2;
        throw ((InvocationTargetException) (obj2)).getCause();
    }
}
