// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.visa.cbp.sdk.facade.activeaccountmanagement;

import android.os.Handler;
import com.visa.cbp.external.aam.CheckStatusRequest;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import rrrrrr.ggrrgg;
import uuuuuu.nuuuuu;

// Referenced classes of package com.visa.cbp.sdk.facade.activeaccountmanagement:
//            CheckStatusCallback, CheckStatusService

class handler
    implements Runnable
{

    public static int b042D042D042D042D042D042D = 1;
    public static int b042D042D042D042D042D042D = 0;
    public static int b042D042D042D042D042D042D = 58;
    public static int b042D042D042D042D042D042D = 2;
    private CheckStatusRequest checkStatusRequest;
    private int count;
    private Handler handler;
    final CheckStatusService this$0;
    private ggrrgg tokenManager;

    public static int b042D042D042D042D042D042D()
    {
        return 2;
    }

    public static int b042D042D042D042D042D042D()
    {
        return 72;
    }

    public static int b042D042D042D042D042D042D()
    {
        return 1;
    }

    public void run()
    {
        ggrrgg ggrrgg1 = tokenManager;
        CheckStatusRequest checkstatusrequest = checkStatusRequest;
        Object obj = com/visa/cbp/sdk/facade/activeaccountmanagement/CheckStatusService$CheckStatusExecutor.getMethod(nuuuuu.b0417041704170417041704170417("\327\245\251\247\271\u04A2\245\251\247\271\245\251\247\271\u04A2\245\251\247\271", '\'', '\006'), new Class[0]);
        int i;
        int j;
        try
        {
            obj = ((Method) (obj)).invoke(null, new Object[0]);
        }
        catch (InvocationTargetException invocationtargetexception3)
        {
            throw invocationtargetexception3.getCause();
        }
        i = ((Integer)obj).intValue();
        j = b042D042D042D042D042D042D;
        obj = com/visa/cbp/sdk/facade/activeaccountmanagement/CheckStatusService$CheckStatusExecutor.getMethod(nuuuuu.b0417041704170417041704170417("\351\267\273\271\313\u04B4\267\273\271\313\267\273\271\313\u04B4\267\273\271\313", '\207', '\005'), new Class[0]);
        try
        {
            obj = ((Method) (obj)).invoke(null, new Object[0]);
        }
        catch (InvocationTargetException invocationtargetexception4)
        {
            throw invocationtargetexception4.getCause();
        }
        if ((((Integer)obj).intValue() * (j + i)) % b042D042D042D042D042D042D != b042D042D042D042D042D042D)
        {
            Object obj1 = com/visa/cbp/sdk/facade/activeaccountmanagement/CheckStatusService$CheckStatusExecutor.getMethod(nuuuuu.b0417041704170417041704170417("\345\263\267\265\307\u04B0\263\267\265\307\263\267\265\307\u04B0\263\267\265\307", '\203', '\005'), new Class[0]);
            class _cls1
                implements CheckStatusCallback
            {

                public static int b042A042A042A042A042A042A = 1;
                public static int b042A042A042A042A042A042A = 96;
                public static int b042A042A042A042A042A042A = 0;
                public static int b042A042A042A042A042A042A = 2;
                final CheckStatusService.CheckStatusExecutor this$1;

                public static int b042A042A042A042A042A042A()
                {
                    return 93;
                }

                public static int b042A042A042A042A042A042A()
                {
                    return 0;
                }

                public void failure(CbpError cbperror)
                {
                    Object obj2 = com/visa/cbp/sdk/facade/activeaccountmanagement/CheckStatusService.getDeclaredMethod(nuuuuu.b0417041704170417041704170417("\u02A4\u02A6\u02A6\u02A8\u02B6\u02B6\u0267\u0273\u0273\u0273", '\301', '\006'), new Class[0]);
                    obj2 = ((Method) (obj2)).invoke(null, new Object[0]);
                    obj2 = (String)obj2;
                    Object obj3;
                    Object obj5;
                    Object obj7;
                    Method method1;
                    int k;
                    long l1;
                    try
                    {
                        obj3 = new StringBuilder();
                    }
                    // Misplaced declaration of an exception variable
                    catch (CbpError cbperror)
                    {
                        throw cbperror;
                    }
                    obj5 = java/lang/StringBuilder.getMethod(nuuuuu.b0417041704170417041704170417("\uFFC8\uFFD7\uFFD7\uFFCC\uFFD5\uFFCB", '3', '\004'), new Class[] {
                        java/lang/String
                    });
                    obj3 = ((Method) (obj5)).invoke(obj3, new Object[] {
                        "failure in check status : "
                    });
                    obj3 = (StringBuilder)obj3;
                    obj5 = com/visa/cbp/sdk/facade/error/CbpError.getMethod(nuuuuu.b0417041704170417041704170417("\u02C2\u02C0\u02CF\u02A0\u02CD\u02CD\u02CA\u02CD\u02A8\u02C0\u02CE\u02CE\u02BC\u02C2\u02C0", '\311', '\006'), new Class[0]);
                    obj5 = ((Method) (obj5)).invoke(cbperror, new Object[0]);
                    obj5 = (String)obj5;
                    obj7 = java/lang/StringBuilder.getMethod(nuuuuu.b0417041704170417041704170417("\uFEC3\uFED2\uFED2\uFEC7\uFED0\uFEC6", '\212', '\004'), new Class[] {
                        java/lang/String
                    });
                    obj3 = ((Method) (obj7)).invoke(obj3, new Object[] {
                        obj5
                    });
                    obj3 = (StringBuilder)obj3;
                    obj5 = java/lang/StringBuilder.getMethod(nuuuuu.b0417041704170417041704170417("\345\376\302\345\343\370\377\366", '\221', '\002'), new Class[0]);
                    obj3 = ((Method) (obj5)).invoke(obj3, new Object[0]);
                    obj3 = (String)obj3;
                    obj5 = rrrrrr/ppplpp.getMethod(nuuuuu.b0417041704170417041704170417("\uFF92\u0345\u0345\uFF60\uFF64\uFF61\uFF65\uFF60\uFF64\uFF61\uFF65\uFF60\uFF64\uFF61\uFF65\u0345\uFF60\uFF64\uFF61\uFF65", '\320', '\0'), new Class[] {
                        java/lang/String, java/lang/String
                    });
                    ((Method) (obj5)).invoke(null, new Object[] {
                        obj2, obj3
                    });
                    obj2 = rrrrrr/grrggg.getMethod(nuuuuu.b0417041704170417041704170417("\u018B\u0159\u015D\u015A\u016F\u0548\u0548\u0159\u015D\u015A\u016F\u0159\u015D\u015A\u016F\u0159\u015D\u015A\u016F", 'c', '\006'), new Class[] {
                        com/visa/cbp/sdk/facade/error/CbpError
                    });
                    ((Method) (obj2)).invoke(null, new Object[] {
                        cbperror
                    });
                    obj2 = getApplicationContext();
                    obj3 = rrrrrr/grrggg.getMethod(nuuuuu.b0417041704170417041704170417("\uFFA7\uFF75\uFF79\uFF76\uFF8B\uFF75\uFF79\uFF76\uFF8B\u0364\uFF75\uFF79\uFF76\uFF8B\uFF75\uFF79\uFF76\uFF8B\uFF75\uFF79\uFF76\uFF8B", '\273', '\0'), new Class[] {
                        android/content/Context
                    });
                    obj2 = ((Method) (obj3)).invoke(null, new Object[] {
                        obj2
                    });
                    if (((Boolean)obj2).booleanValue())
                    {
                        break MISSING_BLOCK_LABEL_1078;
                    }
                    obj2 = com/visa/cbp/sdk/facade/error/CbpError.getMethod(nuuuuu.b0417041704170417041704170417("\u0153\u0151\u0160\u0131\u015E\u015E\u015B\u015E\u012F\u015B\u0150\u0151", '\354', '\005'), new Class[0]);
                    obj2 = ((Method) (obj2)).invoke(cbperror, new Object[0]);
                    k = ((Integer)obj2).intValue();
                    obj2 = SDKErrorType.NETWORK_NOT_AVAILABLE;
                    obj3 = com/visa/cbp/sdk/facade/error/SDKErrorType.getMethod(nuuuuu.b0417041704170417041704170417("jhwFrgh", '\001', '\006'), new Class[0]);
                    obj2 = ((Method) (obj3)).invoke(obj2, new Object[0]);
                    if (k == ((Integer)obj2).intValue())
                    {
                        break MISSING_BLOCK_LABEL_604;
                    }
                    obj2 = com/visa/cbp/sdk/facade/error/CbpError.getMethod(nuuuuu.b0417041704170417041704170417("\uFFB4\uFFB2\uFFC1\uFF92\uFFBF\uFFBF\uFFBC\uFFBF\uFF90\uFFBC\uFFB1\uFFB2", '\341', '.', '\001'), new Class[0]);
                    obj2 = ((Method) (obj2)).invoke(cbperror, new Object[0]);
                    k = ((Integer)obj2).intValue();
                    obj2 = llllpp.b043504350435043504350435;
                    obj3 = rrrrrr/llllpp.getMethod(nuuuuu.b0417041704170417041704170417("\uFFFD\u03BC\u03BC\uFFCB\uFFCF\uFFCD\uFFCC\uFFCB\uFFCF\uFFCD\uFFCC\uFFCB\uFFCF\uFFCD\uFFCC\u03BC\uFFCB\uFFCF\uFFCD\uFFCC", 'e', '\0'), new Class[0]);
                    obj2 = ((Method) (obj3)).invoke(obj2, new Object[0]);
                    if (k == ((Integer)obj2).intValue())
                    {
                        break MISSING_BLOCK_LABEL_604;
                    }
                    obj2 = com/visa/cbp/sdk/facade/error/CbpError.getMethod(nuuuuu.b0417041704170417041704170417("\261\263\242\223\244\244\271\244\225\271\262\263", '\326', '\002'), new Class[0]);
                    cbperror = ((CbpError) (((Method) (obj2)).invoke(cbperror, new Object[0])));
                    k = ((Integer)cbperror).intValue();
                    cbperror = llllpp.b043504350435043504350435;
                    obj2 = rrrrrr/llllpp.getMethod(nuuuuu.b0417041704170417041704170417("\035\u045E\u045EOKMNOKMNOKMN\u045EOKMN", '\177', '\002'), new Class[0]);
                    cbperror = ((CbpError) (((Method) (obj2)).invoke(cbperror, new Object[0])));
                    if (k != ((Integer)cbperror).intValue())
                    {
                        break MISSING_BLOCK_LABEL_1078;
                    }
                    cbperror = CheckStatusService.CheckStatusExecutor.this;
                    obj2 = com/visa/cbp/sdk/facade/activeaccountmanagement/CheckStatusService$CheckStatusExecutor.getDeclaredMethod(nuuuuu.b0417041704170417041704170417("EGGIWW\b\025\024\024", '\034', '\0'), new Class[] {
                        com/visa/cbp/sdk/facade/activeaccountmanagement/CheckStatusService$CheckStatusExecutor
                    });
                    cbperror = ((CbpError) (((Method) (obj2)).invoke(null, new Object[] {
                        cbperror
                    })));
                    k = ((Integer)cbperror).intValue();
                    if (k >= ActiveAccountService.delayedTime.length)
                    {
                        break MISSING_BLOCK_LABEL_1088;
                    }
                    cbperror = ActiveAccountService.delayedTime;
                    obj2 = CheckStatusService.CheckStatusExecutor.this;
                    obj3 = com/visa/cbp/sdk/facade/activeaccountmanagement/CheckStatusService$CheckStatusExecutor.getDeclaredMethod(nuuuuu.b0417041704170417041704170417("\uFF0B\uFF0D\uFF0D\uFF0F\uFF1D\uFF1D\uFECE\uFEDB\uFEDA\uFEDA", '\243', '\263', '\0'), new Class[] {
                        com/visa/cbp/sdk/facade/activeaccountmanagement/CheckStatusService$CheckStatusExecutor
                    });
                    obj2 = ((Method) (obj3)).invoke(null, new Object[] {
                        obj2
                    });
                    k = ((Integer)obj2).intValue();
                    l1 = cbperror[k];
                    Object obj4;
                    Object obj6;
                    int l;
                    int i1;
                    int j1;
                    try
                    {
                        cbperror = CheckStatusService.CheckStatusExecutor.this;
                    }
                    // Misplaced declaration of an exception variable
                    catch (CbpError cbperror)
                    {
                        throw cbperror;
                    }
                    obj2 = com/visa/cbp/sdk/facade/activeaccountmanagement/CheckStatusService$CheckStatusExecutor.getDeclaredMethod(nuuuuu.b0417041704170417041704170417("\uFF77\uFF79\uFF79\uFF7B\uFF89\uFF89\uFF3A\uFF48\uFF46\uFF46", 'N', '\004'), new Class[] {
                        com/visa/cbp/sdk/facade/activeaccountmanagement/CheckStatusService$CheckStatusExecutor
                    });
                    cbperror = ((CbpError) (((Method) (obj2)).invoke(null, new Object[] {
                        cbperror
                    })));
                    cbperror = (Handler)cbperror;
                    obj2 = this$0;
                    obj3 = CheckStatusService.CheckStatusExecutor.this;
                    obj5 = com/visa/cbp/sdk/facade/activeaccountmanagement/CheckStatusService$CheckStatusExecutor.getDeclaredMethod(nuuuuu.b0417041704170417041704170417("\035\037\037!//\uFFE0\uFFED\uFFEC\uFFF0", '\212', '\316', '\002'), new Class[] {
                        com/visa/cbp/sdk/facade/activeaccountmanagement/CheckStatusService$CheckStatusExecutor
                    });
                    obj3 = ((Method) (obj5)).invoke(null, new Object[] {
                        obj3
                    });
                    k = ((Integer)obj3).intValue();
                    obj3 = CheckStatusService.CheckStatusExecutor.this;
                    obj5 = com/visa/cbp/sdk/facade/activeaccountmanagement/CheckStatusService$CheckStatusExecutor.getDeclaredMethod(nuuuuu.b0417041704170417041704170417("\u0120\u0122\u0122\u0124\u0132\u0132\343\361\357\357", '\b', '\307', '\001'), new Class[] {
                        com/visa/cbp/sdk/facade/activeaccountmanagement/CheckStatusService$CheckStatusExecutor
                    });
                    obj3 = ((Method) (obj5)).invoke(null, new Object[] {
                        obj3
                    });
                    obj3 = (Handler)obj3;
                    obj5 = CheckStatusService.CheckStatusExecutor.this;
                    obj7 = com/visa/cbp/sdk/facade/activeaccountmanagement/CheckStatusService$CheckStatusExecutor.getDeclaredMethod(nuuuuu.b0417041704170417041704170417("\uFFAE\uFFB0\uFFB0\uFFB2\uFFC0\uFFC0\uFF71\uFF80\uFF7D\uFF7D", '\263', '\0'), new Class[] {
                        com/visa/cbp/sdk/facade/activeaccountmanagement/CheckStatusService$CheckStatusExecutor
                    });
                    obj5 = ((Method) (obj7)).invoke(null, new Object[] {
                        obj5
                    });
                    obj5 = (ggrrgg)obj5;
                    obj7 = CheckStatusService.CheckStatusExecutor.this;
                    method1 = com/visa/cbp/sdk/facade/activeaccountmanagement/CheckStatusService$CheckStatusExecutor.getDeclaredMethod(nuuuuu.b0417041704170417041704170417("\\^^XNN\031\t\r\r", '=', '\002'), new Class[] {
                        com/visa/cbp/sdk/facade/activeaccountmanagement/CheckStatusService$CheckStatusExecutor
                    });
                    obj7 = method1.invoke(null, new Object[] {
                        obj7
                    });
                    obj7 = (CheckStatusRequest)obj7;
                    obj2 = ((CheckStatusService.CheckStatusExecutor) (obj2)). new CheckStatusService.CheckStatusExecutor(k, ((Handler) (obj3)), ((ggrrgg) (obj5)), ((CheckStatusRequest) (obj7)));
                    obj3 = android/os/Handler.getMethod(nuuuuu.b0417041704170417041704170417("\uFE2D\uFE2C\uFE30\uFE31\uFE01\uFE22\uFE29\uFE1E\uFE36\uFE22\uFE21", '\301', '\004'), new Class[] {
                        java/lang/Runnable, Long.TYPE
                    });
                    cbperror = ((CbpError) (((Method) (obj3)).invoke(cbperror, new Object[] {
                        obj2, Long.valueOf(l1)
                    })));
                    ((Boolean)cbperror).booleanValue();
                    return;
                    cbperror;
                    throw cbperror.getCause();
                    cbperror = ActiveAccountService.formatter;
                    obj2 = java/util/Calendar.getMethod(nuuuuu.b0417041704170417041704170417("\u0201\u01FF\u020E\u01E3\u0208\u020D\u020E\u01FB\u0208\u01FD\u01FF", '\377', '\233', '\003'), new Class[0]);
                    obj2 = ((Method) (obj2)).invoke(null, new Object[0]);
                    obj2 = (Calendar)obj2;
                    obj4 = java/util/Calendar.getMethod(nuuuuu.b0417041704170417041704170417("\u0105\u0103\u0112\362\u0107\u010B\u0103", '\236', '\005'), new Class[0]);
                    obj2 = ((Method) (obj4)).invoke(obj2, new Object[0]);
                    obj2 = (Date)obj2;
                    obj4 = java/text/DateFormat.getMethod(nuuuuu.b0417041704170417041704170417("\uFED6\uFEDF\uFEE2\uFEDD\uFED1\uFEE4", '\310', '\003'), new Class[] {
                        java/util/Date
                    });
                    cbperror = ((CbpError) (((Method) (obj4)).invoke(cbperror, new Object[] {
                        obj2
                    })));
                    cbperror = (String)cbperror;
                    obj2 = new Intent("com.visa.cbp.action.VISA_SDK_NOTIFICATION_ACTION");
                    obj4 = getApplicationContext();
                    obj6 = android/content/Context.getMethod(nuuuuu.b0417041704170417041704170417("\uFEDB\uFED9\uFEE8\uFEC4\uFED5\uFED7\uFEDF\uFED5\uFEDB\uFED9\uFEC2\uFED5\uFEE1\uFED9", '\306', '\003'), new Class[0]);
                    obj4 = ((Method) (obj6)).invoke(obj4, new Object[0]);
                    obj4 = (String)obj4;
                    obj6 = android/content/Intent.getMethod(nuuuuu.b0417041704170417041704170417("\uFFAF\uFFA1\uFFB0\uFF8C\uFF9D\uFF9F\uFFA7\uFF9D\uFFA3\uFFA1", 'b', '\003'), new Class[] {
                        java/lang/String
                    });
                    obj4 = ((Method) (obj6)).invoke(obj2, new Object[] {
                        obj4
                    });
                    obj4 = (Intent)obj4;
                    obj4 = NotificationAction.ACTION_CHECK_STATUS_FAIL;
                    obj6 = com/visa/cbp/sdk/facade/data/NotificationAction.getMethod(nuuuuu.b0417041704170417041704170417("\334\332\351\270\344\331\332", 'u', '\005'), new Class[0]);
                    obj4 = ((Method) (obj6)).invoke(obj4, new Object[0]);
                    l = ((Integer)obj4).intValue();
                    obj4 = android/content/Intent.getMethod(nuuuuu.b0417041704170417041704170417("\uFFDD\uFFE2\uFFE1\uFFB2\uFFE5\uFFE1\uFFDF\uFFCE", '}', '\026', '\0'), new Class[] {
                        java/lang/String, Integer.TYPE
                    });
                    obj4 = ((Method) (obj4)).invoke(obj2, new Object[] {
                        "com.visa.cbp.action.VISA_SDK_NOTIFICATION_ACTION", Integer.valueOf(l)
                    });
                    obj4 = (Intent)obj4;
                    obj4 = android/content/Intent.getMethod(nuuuuu.b0417041704170417041704170417("\372\377\376\317\u0102\376\374\353", 'R', '8', '\003'), new Class[] {
                        java/lang/String, java/lang/String
                    });
                    obj4 = ((Method) (obj4)).invoke(obj2, new Object[] {
                        "com.visa.cbp.action.CHECK_STATUS_ACTION_FAIL_DATE", cbperror
                    });
                    obj4 = (Intent)obj4;
                    if (((b042A042A042A042A042A042A + b042A042A042A042A042A042A) * b042A042A042A042A042A042A) % b042A042A042A042A042A042A != b042A042A042A042A042A042A)
                    {
                        b042A042A042A042A042A042A = 66;
                        obj4 = com/visa/cbp/sdk/facade/activeaccountmanagement/CheckStatusService$CheckStatusExecutor$1.getMethod(nuuuuu.b0417041704170417041704170417("u'#%V\u043D'#%V'#%V\u043D'#%V", '\027', '\002'), new Class[0]);
                        try
                        {
                            obj4 = ((Method) (obj4)).invoke(null, new Object[0]);
                        }
                        // Misplaced declaration of an exception variable
                        catch (CbpError cbperror)
                        {
                            throw cbperror.getCause();
                        }
                        b042A042A042A042A042A042A = ((Integer)obj4).intValue();
                    }
                    obj4 = getApplicationContext();
                    obj6 = android/content/Context.getMethod(nuuuuu.b0417041704170417041704170417("\246\247\224\245\247\206\230\245\251\234\226\230", '3', '\005'), new Class[] {
                        android/content/Intent
                    });
                    obj2 = ((Method) (obj6)).invoke(obj4, new Object[] {
                        obj2
                    });
                    obj2 = (ComponentName)obj2;
                    obj2 = com/visa/cbp/sdk/facade/activeaccountmanagement/CheckStatusService.getDeclaredMethod(nuuuuu.b0417041704170417041704170417("Y[[]KK\034\b\b\b", '8', '\002'), new Class[0]);
                    obj2 = ((Method) (obj2)).invoke(null, new Object[0]);
                    obj2 = (String)obj2;
                    obj4 = new StringBuilder();
                    obj6 = java/lang/StringBuilder.getMethod(nuuuuu.b0417041704170417041704170417("hwwluk", '\026', '\035', '\001'), new Class[] {
                        java/lang/String
                    });
                    obj4 = ((Method) (obj6)).invoke(obj4, new Object[] {
                        "Replenishment retry failed: "
                    });
                    obj4 = (StringBuilder)obj4;
                    l = b042A042A042A042A042A042A;
                    i1 = b042A042A042A042A042A042A;
                    j1 = b042A042A042A042A042A042A;
                    (l * (i1 + l)) % j1;
                    JVM INSTR tableswitch 0 0: default 1716
                //                               0 1768;
                       goto _L1 _L2
_L1:
                    obj6 = com/visa/cbp/sdk/facade/activeaccountmanagement/CheckStatusService$CheckStatusExecutor$1.getMethod(nuuuuu.b0417041704170417041704170417("\uFF00\uFECE\uFED2\uFED0\uFEDF\u02C8\uFECE\uFED2\uFED0\uFEDF\uFECE\uFED2\uFED0\uFEDF\u02C8\uFECE\uFED2\uFED0\uFEDF", 'v', '\004'), new Class[0]);
                    obj6 = ((Method) (obj6)).invoke(null, new Object[0]);
                    l = ((Integer)obj6).intValue();
                    b042A042A042A042A042A042A = l;
                    b042A042A042A042A042A042A = 64;
_L2:
                    obj6 = java/lang/StringBuilder.getMethod(nuuuuu.b0417041704170417041704170417("-<<1:0", 'm', '9', '\001'), new Class[] {
                        java/lang/String
                    });
                    cbperror = ((CbpError) (((Method) (obj6)).invoke(obj4, new Object[] {
                        cbperror
                    })));
                    cbperror = (StringBuilder)cbperror;
                    obj4 = java/lang/StringBuilder.getMethod(nuuuuu.b0417041704170417041704170417("\uFF6A\uFF65\uFF49\uFF6A\uFF68\uFF5F\uFF64\uFF5D", '\205', '\003'), new Class[0]);
                    cbperror = ((CbpError) (((Method) (obj4)).invoke(cbperror, new Object[0])));
                    cbperror = (String)cbperror;
                    obj4 = rrrrrr/ppplpp.getMethod(nuuuuu.b0417041704170417041704170417("\253\u045Ey}z~\u045E\u045Ey}z~\u045Ey}z~", 'I', '\005'), new Class[] {
                        java/lang/String, java/lang/String
                    });
                    ((Method) (obj4)).invoke(null, new Object[] {
                        obj2, cbperror
                    });
                    return;
                    cbperror;
                    throw cbperror.getCause();
                    cbperror;
                    throw cbperror.getCause();
                    cbperror;
                    throw cbperror.getCause();
                    cbperror;
                    throw cbperror.getCause();
                    cbperror;
                    throw cbperror.getCause();
                    cbperror;
                    throw cbperror.getCause();
                    cbperror;
                    throw cbperror.getCause();
                    cbperror;
                    throw cbperror.getCause();
                    cbperror;
                    throw cbperror.getCause();
                    cbperror;
                    throw cbperror.getCause();
                    cbperror;
                    throw cbperror.getCause();
                    cbperror;
                    throw cbperror.getCause();
                    cbperror;
                    throw cbperror.getCause();
                    cbperror;
                    throw cbperror.getCause();
                    cbperror;
                    throw cbperror.getCause();
                    cbperror;
                    throw cbperror.getCause();
                    cbperror;
                    throw cbperror.getCause();
                    cbperror;
                    throw cbperror.getCause();
                    cbperror;
                    throw cbperror.getCause();
                    cbperror;
                    throw cbperror.getCause();
                    cbperror;
                    throw cbperror.getCause();
                    cbperror;
                    throw cbperror.getCause();
                    cbperror;
                    throw cbperror.getCause();
                    cbperror;
                    throw cbperror.getCause();
                    cbperror;
                    throw cbperror.getCause();
                    cbperror;
                    throw cbperror.getCause();
                    cbperror;
                    throw cbperror.getCause();
                    cbperror;
                    throw cbperror.getCause();
                    cbperror;
                    throw cbperror.getCause();
                    cbperror;
                    throw cbperror.getCause();
                    cbperror;
                    throw cbperror.getCause();
                    cbperror;
                    throw cbperror.getCause();
                    cbperror;
                    throw cbperror.getCause();
                    cbperror;
                    throw cbperror.getCause();
                    cbperror;
                    throw cbperror.getCause();
                    cbperror;
                    throw cbperror.getCause();
                }

                public void success(CheckStatusResponse checkstatusresponse, List list, GenericResponse genericresponse)
                {
                    checkstatusresponse = java/util/List.getMethod(nuuuuu.b0417041704170417041704170417("\325\313\334\307", 'b', '\005'), new Class[0]);
                    checkstatusresponse = ((CheckStatusResponse) (checkstatusresponse.invoke(list, new Object[0])));
                    if (((Integer)checkstatusresponse).intValue() <= 0)
                    {
                        break MISSING_BLOCK_LABEL_412;
                    }
                    try
                    {
                        checkstatusresponse = new ArrayList();
                    }
                    // Misplaced declaration of an exception variable
                    catch (CheckStatusResponse checkstatusresponse)
                    {
                        throw checkstatusresponse;
                    }
                    if (((b042A042A042A042A042A042A + b042A042A042A042A042A042A) * b042A042A042A042A042A042A) % b042A042A042A042A042A042A != b042A042A042A042A042A042A)
                    {
                        genericresponse = com/visa/cbp/sdk/facade/activeaccountmanagement/CheckStatusService$CheckStatusExecutor$1.getMethod(nuuuuu.b0417041704170417041704170417("\344\262\266\264\303\u04AC\262\266\264\303\262\266\264\303\u04AC\262\266\264\303", 'A', '\001'), new Class[0]);
                        int k;
                        int l;
                        int i1;
                        int j1;
                        try
                        {
                            genericresponse = ((GenericResponse) (genericresponse.invoke(null, new Object[0])));
                        }
                        // Misplaced declaration of an exception variable
                        catch (CheckStatusResponse checkstatusresponse)
                        {
                            throw checkstatusresponse.getCause();
                        }
                        b042A042A042A042A042A042A = ((Integer)genericresponse).intValue();
                        genericresponse = com/visa/cbp/sdk/facade/activeaccountmanagement/CheckStatusService$CheckStatusExecutor$1.getMethod(nuuuuu.b0417041704170417041704170417("F\024\030\026%\u040E\024\030\026%\024\030\026%\u040E\024\030\026%", '\016', '\003'), new Class[0]);
                        try
                        {
                            genericresponse = ((GenericResponse) (genericresponse.invoke(null, new Object[0])));
                        }
                        // Misplaced declaration of an exception variable
                        catch (CheckStatusResponse checkstatusresponse)
                        {
                            throw checkstatusresponse.getCause();
                        }
                        b042A042A042A042A042A042A = ((Integer)genericresponse).intValue();
                    }
                    genericresponse = java/util/ArrayList.getMethod(nuuuuu.b0417041704170417041704170417("\uFF33\uFF36\uFF36\uFF13\uFF3E\uFF3E", '\224', '\232', '\0'), new Class[] {
                        java/util/Collection
                    });
                    list = ((List) (genericresponse.invoke(checkstatusresponse, new Object[] {
                        list
                    })));
                    ((Boolean)list).booleanValue();
                    try
                    {
                        k = b042A042A042A042A042A042A;
                        l = b042A042A042A042A042A042A;
                        i1 = b042A042A042A042A042A042A;
                        j1 = b042A042A042A042A042A042A;
                    }
                    // Misplaced declaration of an exception variable
                    catch (CheckStatusResponse checkstatusresponse)
                    {
                        throw checkstatusresponse;
                    }
                    list = com/visa/cbp/sdk/facade/activeaccountmanagement/CheckStatusService$CheckStatusExecutor$1.getMethod(nuuuuu.b0417041704170417041704170417("\uFEA0\u0268\uFE6E\uFE72\uFE70\uFE7F\uFE6E\uFE72\uFE70\uFE7F\uFE6E\uFE72\uFE70\uFE7F\u0268\uFE6E\uFE72\uFE70\uFE7F", '\226', '\004'), new Class[0]);
                    list = ((List) (list.invoke(null, new Object[0])));
                    if (((k + l) * i1) % j1 == ((Integer)list).intValue())
                    {
                        break MISSING_BLOCK_LABEL_279;
                    }
                    b042A042A042A042A042A042A = 4;
                    b042A042A042A042A042A042A = 65;
                    list = new Intent(getApplicationContext(), com/visa/cbp/sdk/facade/activeaccountmanagement/ReplenishmentService);
                    genericresponse = android/content/Intent.getMethod(nuuuuu.b0417041704170417041704170417("\u0232\u0237\u0236\u0207\u023A\u0236\u0234\u0223", '\226', '\006'), new Class[] {
                        java/lang/String, java/io/Serializable
                    });
                    checkstatusresponse = ((CheckStatusResponse) (genericresponse.invoke(list, new Object[] {
                        "TOKENS", checkstatusresponse
                    })));
                    checkstatusresponse = (Intent)checkstatusresponse;
                    startService(list);
                    return;
                    checkstatusresponse;
                    throw checkstatusresponse.getCause();
                    checkstatusresponse;
                    throw checkstatusresponse.getCause();
                    checkstatusresponse;
                    throw checkstatusresponse.getCause();
                    checkstatusresponse;
                    throw checkstatusresponse.getCause();
                }

            _cls1()
            {
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
                this$1 = CheckStatusService.CheckStatusExecutor.this;
                int i = b042A042A042A042A042A042A;
                int j = b042A042A042A042A042A042A;
                int k = b042A042A042A042A042A042A;
                int l = b042A042A042A042A042A042A;
                int i1 = b042A042A042A042A042A042A;
                switch ((i1 * (b042A042A042A042A042A042A + i1)) % b042A042A042A042A042A042A)
                {
                default:
                    checkstatusexecutor = com/visa/cbp/sdk/facade/activeaccountmanagement/CheckStatusService$CheckStatusExecutor$1.getMethod(nuuuuu.b0417041704170417041704170417("\u014B\u0119\u011D\u011B\u012A\u0513\u0119\u011D\u011B\u012A\u0119\u011D\u011B\u012A\u0513\u0119\u011D\u011B\u012A", '\216', '[', '\003'), new Class[0]);
                    try
                    {
                        checkstatusexecutor = ((CheckStatusService.CheckStatusExecutor) (invoke(null, new Object[0])));
                    }
                    // Misplaced declaration of an exception variable
                    catch (CheckStatusService.CheckStatusExecutor checkstatusexecutor)
                    {
                        throw getCause();
                    }
                    b042A042A042A042A042A042A = ((Integer)CheckStatusService.CheckStatusExecutor.this).intValue();
                    b042A042A042A042A042A042A = 54;
                    break;

                case 0: // '\0'
                    break;
                }
                if ((k * (i + j)) % l != b042A042A042A042A042A042A)
                {
                    checkstatusexecutor = com/visa/cbp/sdk/facade/activeaccountmanagement/CheckStatusService$CheckStatusExecutor$1.getMethod(nuuuuu.b0417041704170417041704170417("\uFE78\uFE46\uFE4A\uFE48\uFE57\u0240\uFE46\uFE4A\uFE48\uFE57\uFE46\uFE4A\uFE48\uFE57\u0240\uFE46\uFE4A\uFE48\uFE57", '\365', '\003'), new Class[0]);
                    try
                    {
                        checkstatusexecutor = ((CheckStatusService.CheckStatusExecutor) (invoke(null, new Object[0])));
                    }
                    // Misplaced declaration of an exception variable
                    catch (CheckStatusService.CheckStatusExecutor checkstatusexecutor)
                    {
                        throw getCause();
                    }
                    b042A042A042A042A042A042A = ((Integer)CheckStatusService.CheckStatusExecutor.this).intValue();
                    b042A042A042A042A042A042A = 89;
                }
                super();
            }
            }

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
            b042D042D042D042D042D042D = ((Integer)obj1).intValue();
            obj1 = com/visa/cbp/sdk/facade/activeaccountmanagement/CheckStatusService$CheckStatusExecutor.getMethod(nuuuuu.b0417041704170417041704170417("8\006\n\b\032\u0403\006\n\b\032\006\n\b\032\u0403\006\n\b\032", '\025', '\003'), new Class[0]);
            try
            {
                obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
            }
            catch (InvocationTargetException invocationtargetexception2)
            {
                throw invocationtargetexception2.getCause();
            }
            b042D042D042D042D042D042D = ((Integer)obj1).intValue();
        }
        obj1 = new _cls1();
        method = rrrrrr/ggrrgg.getMethod(nuuuuu.b0417041704170417041704170417("Z(,,9(,,9\u0442\u0442(,,9(,,9", 'u', 'm', '\001'), new Class[] {
            com/visa/cbp/external/aam/CheckStatusRequest, com/visa/cbp/sdk/facade/activeaccountmanagement/CheckStatusCallback
        });
        try
        {
            method.invoke(ggrrgg1, new Object[] {
                checkstatusrequest, obj1
            });
            return;
        }
        // Misplaced declaration of an exception variable
        catch (InvocationTargetException invocationtargetexception)
        {
            throw invocationtargetexception.getCause();
        }
    }


/*
    static int access$100(_cls1 _pcls1)
    {
        int i = b042D042D042D042D042D042D;
        switch ((i * (b042D042D042D042D042D042D + i)) % b042D042D042D042D042D042D)
        {
        default:
            Object obj = com/visa/cbp/sdk/facade/activeaccountmanagement/CheckStatusService$CheckStatusExecutor.getMethod(nuuuuu.b0417041704170417041704170417("\u0182\u0150\u0154\u0152\u0164\u054D\u0150\u0154\u0152\u0164\u0150\u0154\u0152\u0164\u054D\u0150\u0154\u0152\u0164", '`', '\006'), new Class[0]);
            try
            {
                obj = ((Method) (obj)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (_cls1 _pcls1)
            {
                throw _pcls1.getCause();
            }
            b042D042D042D042D042D042D = ((Integer)obj).intValue();
            obj = com/visa/cbp/sdk/facade/activeaccountmanagement/CheckStatusService$CheckStatusExecutor.getMethod(nuuuuu.b0417041704170417041704170417("\uFF46\uFF14\uFF18\uFF16\uFF28\u0311\uFF14\uFF18\uFF16\uFF28\uFF14\uFF18\uFF16\uFF28\u0311\uFF14\uFF18\uFF16\uFF28", '\216', '\003'), new Class[0]);
            try
            {
                obj = ((Method) (obj)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (_cls1 _pcls1)
            {
                throw _pcls1.getCause();
            }
            b042D042D042D042D042D042D = ((Integer)obj).intValue();
            break;

        case 0: // '\0'
            break;
        }
        if (((b042D042D042D042D042D042D + b042D042D042D042D042D042D) * b042D042D042D042D042D042D) % b042D042D042D042D042D042D != b042D042D042D042D042D042D)
        {
            obj = com/visa/cbp/sdk/facade/activeaccountmanagement/CheckStatusService$CheckStatusExecutor.getMethod(nuuuuu.b0417041704170417041704170417("\uFF62\uFF30\uFF34\uFF32\uFF44\u032D\uFF30\uFF34\uFF32\uFF44\uFF30\uFF34\uFF32\uFF44\u032D\uFF30\uFF34\uFF32\uFF44", '\200', '\003'), new Class[0]);
            try
            {
                obj = ((Method) (obj)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (_cls1 _pcls1)
            {
                throw _pcls1.getCause();
            }
            b042D042D042D042D042D042D = ((Integer)obj).intValue();
            b042D042D042D042D042D042D = 89;
        }
        return _pcls1.count;
    }

*/


/*
    static int access$104(count count1)
    {
        int i;
        try
        {
            i = count1.count;
        }
        // Misplaced declaration of an exception variable
        catch (count count1)
        {
            throw count1;
        }
        i++;
        try
        {
            count1.count = i;
        }
        // Misplaced declaration of an exception variable
        catch (count count1)
        {
            throw count1;
        }
        return i;
    }

*/


/*
    static Handler access$200(count count1)
    {
        if (((b042D042D042D042D042D042D + b042D042D042D042D042D042D) * b042D042D042D042D042D042D) % b042D042D042D042D042D042D != b042D042D042D042D042D042D)
        {
            b042D042D042D042D042D042D = 68;
            b042D042D042D042D042D042D = 74;
            int i = b042D042D042D042D042D042D;
            switch ((i * (b042D042D042D042D042D042D + i)) % b042D042D042D042D042D042D)
            {
            default:
                b042D042D042D042D042D042D = 54;
                b042D042D042D042D042D042D = 12;
                break;

            case 0: // '\0'
                break;
            }
        }
        try
        {
            count1 = count1.handler;
        }
        // Misplaced declaration of an exception variable
        catch (count count1)
        {
            throw count1;
        }
        return count1;
    }

*/


/*
    static ggrrgg access$300(handler handler1)
    {
        int i = b042D042D042D042D042D042D;
        int j = b042D042D042D042D042D042D;
        Object obj = com/visa/cbp/sdk/facade/activeaccountmanagement/CheckStatusService$CheckStatusExecutor.getMethod(nuuuuu.b0417041704170417041704170417("\003\uFFD1\uFFD5\uFFD3\uFFE5\uFFD1\uFFD5\uFFD3\uFFE5\uFFD1\uFFD5\uFFD3\uFFE5\uFFD1\uFFD5\uFFD3\uFFE5\u03CE\uFFD1\uFFD5\uFFD3\uFFE5", '_', '\0'), new Class[0]);
        try
        {
            obj = ((Method) (obj)).invoke(null, new Object[0]);
        }
        // Misplaced declaration of an exception variable
        catch (handler handler1)
        {
            throw handler1.getCause();
        }
        switch (((j + i) * i) % ((Integer)obj).intValue())
        {
        default:
            b042D042D042D042D042D042D = 29;
            Object obj1 = com/visa/cbp/sdk/facade/activeaccountmanagement/CheckStatusService$CheckStatusExecutor.getMethod(nuuuuu.b0417041704170417041704170417("\uFFCD\uFF9B\uFF9F\uFF9D\uFFAF\u0398\uFF9B\uFF9F\uFF9D\uFFAF\uFF9B\uFF9F\uFF9D\uFFAF\u0398\uFF9B\uFF9F\uFF9D\uFFAF", '\225', '\0'), new Class[0]);
            try
            {
                obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (handler handler1)
            {
                throw handler1.getCause();
            }
            b042D042D042D042D042D042D = ((Integer)obj1).intValue();
            break;

        case 0: // '\0'
            break;
        }
        try
        {
            handler1 = handler1.tokenManager;
        }
        // Misplaced declaration of an exception variable
        catch (handler handler1)
        {
            throw handler1;
        }
        return handler1;
    }

*/


/*
    static CheckStatusRequest access$400(tokenManager tokenmanager)
    {
        tokenmanager = tokenmanager.checkStatusRequest;
        int i;
        int l;
        int j1;
        try
        {
            i = b042D042D042D042D042D042D;
            l = b042D042D042D042D042D042D;
            j1 = b042D042D042D042D042D042D;
        }
        // Misplaced declaration of an exception variable
        catch (tokenManager tokenmanager)
        {
            throw tokenmanager;
        }
        (i * (l + i)) % j1;
        JVM INSTR tableswitch 0 0: default 44
    //                   0 238;
           goto _L1 _L2
_L1:
        int j = b042D042D042D042D042D042D;
        int i1 = b042D042D042D042D042D042D;
        Object obj = com/visa/cbp/sdk/facade/activeaccountmanagement/CheckStatusService$CheckStatusExecutor.getMethod(nuuuuu.b0417041704170417041704170417("\036\uFFEC\uFFF0\uFFEE\000\uFFEC\uFFF0\uFFEE\000\uFFEC\uFFF0\uFFEE\000\uFFEC\uFFF0\uFFEE\000\u03E9\uFFEC\uFFF0\uFFEE\0", '+', '\031', '\0'), new Class[0]);
        try
        {
            obj = ((Method) (obj)).invoke(null, new Object[0]);
        }
        // Misplaced declaration of an exception variable
        catch (tokenManager tokenmanager)
        {
            throw tokenmanager.getCause();
        }
        switch (((i1 + j) * j) % ((Integer)obj).intValue())
        {
        default:
            Object obj1 = com/visa/cbp/sdk/facade/activeaccountmanagement/CheckStatusService$CheckStatusExecutor.getMethod(nuuuuu.b0417041704170417041704170417("\u012D\373\377\375\u010F\u04F8\373\377\375\u010F\373\377\375\u010F\u04F8\373\377\375\u010F", '\313', '\005'), new Class[0]);
            int k;
            try
            {
                obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (tokenManager tokenmanager)
            {
                throw tokenmanager.getCause();
            }
            b042D042D042D042D042D042D = ((Integer)obj1).intValue();
            b042D042D042D042D042D042D = 12;
            // fall through

        case 0: // '\0'
            obj1 = com/visa/cbp/sdk/facade/activeaccountmanagement/CheckStatusService$CheckStatusExecutor.getMethod(nuuuuu.b0417041704170417041704170417("\uFE22\uFDF0\uFDF4\uFDF2\uFE04\u01ED\uFDF0\uFDF4\uFDF2\uFE04\uFDF0\uFDF4\uFDF2\uFE04\u01ED\uFDF0\uFDF4\uFDF2\uFE04", '\300', '\004'), new Class[0]);
            break;
        }
        obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
        k = ((Integer)obj1).intValue();
        try
        {
            b042D042D042D042D042D042D = k;
        }
        // Misplaced declaration of an exception variable
        catch (tokenManager tokenmanager)
        {
            throw tokenmanager;
        }
        obj1 = com/visa/cbp/sdk/facade/activeaccountmanagement/CheckStatusService$CheckStatusExecutor.getMethod(nuuuuu.b0417041704170417041704170417("\u011A\350\354\352\374\u04E5\350\354\352\374\350\354\352\374\u04E5\350\354\352\374", '\270', '\005'), new Class[0]);
        obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
        k = ((Integer)obj1).intValue();
        b042D042D042D042D042D042D = k;
_L2:
        return tokenmanager;
        tokenmanager;
        throw tokenmanager.getCause();
        tokenmanager;
        throw tokenmanager;
        tokenmanager;
        throw tokenmanager.getCause();
    }

*/

    public b042D042D042D042D042D042D(int i, Handler handler1, ggrrgg ggrrgg1, CheckStatusRequest checkstatusrequest)
    {
        this$0 = CheckStatusService.this;
        super();
        count = i;
        tokenManager = ggrrgg1;
        checkStatusRequest = checkstatusrequest;
        handler = handler1;
    }

    public handler(Handler handler1, ggrrgg ggrrgg1, CheckStatusRequest checkstatusrequest)
    {
        throw new Runtime("d2j fail translate: java.lang.IndexOutOfBoundsException: fromIndex < 0: -1\n\tat java.util.BitSet.nextSetBit(BitSet.java:701)\n\tat com.googlecode.dex2jar.ir.ts.array.FillArrayTransformer.makeSureAllElementAreAssigned(FillArrayTransformer.java:505)\n\tat com.googlecode.dex2jar.ir.ts.array.FillArrayTransformer.transformReportChanged(FillArrayTransformer.java:123)\n\tat com.googlecode.dex2jar.ir.ts.StatedTransformer.transform(StatedTransformer.java:10)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:149)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
    }
}
