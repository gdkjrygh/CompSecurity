// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.visa.cbp.sdk.facade.activeaccountmanagement;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import com.visa.cbp.external.aam.CheckStatusRequest;
import com.visa.cbp.external.aam.CheckStatusResponse;
import com.visa.cbp.sdk.facade.data.GenericResponse;
import com.visa.cbp.sdk.facade.data.NotificationAction;
import com.visa.cbp.sdk.facade.error.CbpError;
import com.visa.cbp.sdk.facade.error.SDKErrorType;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import rrrrrr.ggrrgg;
import rrrrrr.grrggg;
import rrrrrr.llllpp;
import rrrrrr.ppplpp;
import uuuuuu.nuuuuu;

// Referenced classes of package com.visa.cbp.sdk.facade.activeaccountmanagement:
//            CheckStatusCallback, CheckStatusService, ActiveAccountService, ReplenishmentService

class b042A042A042A042A042A042A
    implements CheckStatusCallback
{

    public static int b042A042A042A042A042A042A = 1;
    public static int b042A042A042A042A042A042A = 96;
    public static int b042A042A042A042A042A042A = 0;
    public static int b042A042A042A042A042A042A = 2;
    final b042A042A042A042A042A042A this$1;

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
        Object obj = com/visa/cbp/sdk/facade/activeaccountmanagement/CheckStatusService.getDeclaredMethod(nuuuuu.b0417041704170417041704170417("\u02A4\u02A6\u02A6\u02A8\u02B6\u02B6\u0267\u0273\u0273\u0273", '\301', '\006'), new Class[0]);
        obj = ((Method) (obj)).invoke(null, new Object[0]);
        obj = (String)obj;
        Object obj1;
        Object obj3;
        Object obj5;
        Method method;
        int i;
        long l1;
        try
        {
            obj1 = new StringBuilder();
        }
        // Misplaced declaration of an exception variable
        catch (CbpError cbperror)
        {
            throw cbperror;
        }
        obj3 = java/lang/StringBuilder.getMethod(nuuuuu.b0417041704170417041704170417("\uFFC8\uFFD7\uFFD7\uFFCC\uFFD5\uFFCB", '3', '\004'), new Class[] {
            java/lang/String
        });
        obj1 = ((Method) (obj3)).invoke(obj1, new Object[] {
            "failure in check status : "
        });
        obj1 = (StringBuilder)obj1;
        obj3 = com/visa/cbp/sdk/facade/error/CbpError.getMethod(nuuuuu.b0417041704170417041704170417("\u02C2\u02C0\u02CF\u02A0\u02CD\u02CD\u02CA\u02CD\u02A8\u02C0\u02CE\u02CE\u02BC\u02C2\u02C0", '\311', '\006'), new Class[0]);
        obj3 = ((Method) (obj3)).invoke(cbperror, new Object[0]);
        obj3 = (String)obj3;
        obj5 = java/lang/StringBuilder.getMethod(nuuuuu.b0417041704170417041704170417("\uFEC3\uFED2\uFED2\uFEC7\uFED0\uFEC6", '\212', '\004'), new Class[] {
            java/lang/String
        });
        obj1 = ((Method) (obj5)).invoke(obj1, new Object[] {
            obj3
        });
        obj1 = (StringBuilder)obj1;
        obj3 = java/lang/StringBuilder.getMethod(nuuuuu.b0417041704170417041704170417("\345\376\302\345\343\370\377\366", '\221', '\002'), new Class[0]);
        obj1 = ((Method) (obj3)).invoke(obj1, new Object[0]);
        obj1 = (String)obj1;
        obj3 = rrrrrr/ppplpp.getMethod(nuuuuu.b0417041704170417041704170417("\uFF92\u0345\u0345\uFF60\uFF64\uFF61\uFF65\uFF60\uFF64\uFF61\uFF65\uFF60\uFF64\uFF61\uFF65\u0345\uFF60\uFF64\uFF61\uFF65", '\320', '\0'), new Class[] {
            java/lang/String, java/lang/String
        });
        ((Method) (obj3)).invoke(null, new Object[] {
            obj, obj1
        });
        obj = rrrrrr/grrggg.getMethod(nuuuuu.b0417041704170417041704170417("\u018B\u0159\u015D\u015A\u016F\u0548\u0548\u0159\u015D\u015A\u016F\u0159\u015D\u015A\u016F\u0159\u015D\u015A\u016F", 'c', '\006'), new Class[] {
            com/visa/cbp/sdk/facade/error/CbpError
        });
        ((Method) (obj)).invoke(null, new Object[] {
            cbperror
        });
        obj = getApplicationContext();
        obj1 = rrrrrr/grrggg.getMethod(nuuuuu.b0417041704170417041704170417("\uFFA7\uFF75\uFF79\uFF76\uFF8B\uFF75\uFF79\uFF76\uFF8B\u0364\uFF75\uFF79\uFF76\uFF8B\uFF75\uFF79\uFF76\uFF8B\uFF75\uFF79\uFF76\uFF8B", '\273', '\0'), new Class[] {
            android/content/Context
        });
        obj = ((Method) (obj1)).invoke(null, new Object[] {
            obj
        });
        if (((Boolean)obj).booleanValue())
        {
            break MISSING_BLOCK_LABEL_1078;
        }
        obj = com/visa/cbp/sdk/facade/error/CbpError.getMethod(nuuuuu.b0417041704170417041704170417("\u0153\u0151\u0160\u0131\u015E\u015E\u015B\u015E\u012F\u015B\u0150\u0151", '\354', '\005'), new Class[0]);
        obj = ((Method) (obj)).invoke(cbperror, new Object[0]);
        i = ((Integer)obj).intValue();
        obj = SDKErrorType.NETWORK_NOT_AVAILABLE;
        obj1 = com/visa/cbp/sdk/facade/error/SDKErrorType.getMethod(nuuuuu.b0417041704170417041704170417("jhwFrgh", '\001', '\006'), new Class[0]);
        obj = ((Method) (obj1)).invoke(obj, new Object[0]);
        if (i == ((Integer)obj).intValue())
        {
            break MISSING_BLOCK_LABEL_604;
        }
        obj = com/visa/cbp/sdk/facade/error/CbpError.getMethod(nuuuuu.b0417041704170417041704170417("\uFFB4\uFFB2\uFFC1\uFF92\uFFBF\uFFBF\uFFBC\uFFBF\uFF90\uFFBC\uFFB1\uFFB2", '\341', '.', '\001'), new Class[0]);
        obj = ((Method) (obj)).invoke(cbperror, new Object[0]);
        i = ((Integer)obj).intValue();
        obj = llllpp.b043504350435043504350435;
        obj1 = rrrrrr/llllpp.getMethod(nuuuuu.b0417041704170417041704170417("\uFFFD\u03BC\u03BC\uFFCB\uFFCF\uFFCD\uFFCC\uFFCB\uFFCF\uFFCD\uFFCC\uFFCB\uFFCF\uFFCD\uFFCC\u03BC\uFFCB\uFFCF\uFFCD\uFFCC", 'e', '\0'), new Class[0]);
        obj = ((Method) (obj1)).invoke(obj, new Object[0]);
        if (i == ((Integer)obj).intValue())
        {
            break MISSING_BLOCK_LABEL_604;
        }
        obj = com/visa/cbp/sdk/facade/error/CbpError.getMethod(nuuuuu.b0417041704170417041704170417("\261\263\242\223\244\244\271\244\225\271\262\263", '\326', '\002'), new Class[0]);
        cbperror = ((CbpError) (((Method) (obj)).invoke(cbperror, new Object[0])));
        i = ((Integer)cbperror).intValue();
        cbperror = llllpp.b043504350435043504350435;
        obj = rrrrrr/llllpp.getMethod(nuuuuu.b0417041704170417041704170417("\035\u045E\u045EOKMNOKMNOKMN\u045EOKMN", '\177', '\002'), new Class[0]);
        cbperror = ((CbpError) (((Method) (obj)).invoke(cbperror, new Object[0])));
        if (i != ((Integer)cbperror).intValue())
        {
            break MISSING_BLOCK_LABEL_1078;
        }
        cbperror = this._cls1.this;
        obj = com/visa/cbp/sdk/facade/activeaccountmanagement/CheckStatusService$CheckStatusExecutor.getDeclaredMethod(nuuuuu.b0417041704170417041704170417("EGGIWW\b\025\024\024", '\034', '\0'), new Class[] {
            com/visa/cbp/sdk/facade/activeaccountmanagement/CheckStatusService$CheckStatusExecutor
        });
        cbperror = ((CbpError) (((Method) (obj)).invoke(null, new Object[] {
            cbperror
        })));
        i = ((Integer)cbperror).intValue();
        if (i >= ActiveAccountService.delayedTime.length)
        {
            break MISSING_BLOCK_LABEL_1088;
        }
        cbperror = ActiveAccountService.delayedTime;
        obj = this._cls1.this;
        obj1 = com/visa/cbp/sdk/facade/activeaccountmanagement/CheckStatusService$CheckStatusExecutor.getDeclaredMethod(nuuuuu.b0417041704170417041704170417("\uFF0B\uFF0D\uFF0D\uFF0F\uFF1D\uFF1D\uFECE\uFEDB\uFEDA\uFEDA", '\243', '\263', '\0'), new Class[] {
            com/visa/cbp/sdk/facade/activeaccountmanagement/CheckStatusService$CheckStatusExecutor
        });
        obj = ((Method) (obj1)).invoke(null, new Object[] {
            obj
        });
        i = ((Integer)obj).intValue();
        l1 = cbperror[i];
        Object obj2;
        Object obj4;
        int j;
        int k;
        int l;
        try
        {
            cbperror = this._cls1.this;
        }
        // Misplaced declaration of an exception variable
        catch (CbpError cbperror)
        {
            throw cbperror;
        }
        obj = com/visa/cbp/sdk/facade/activeaccountmanagement/CheckStatusService$CheckStatusExecutor.getDeclaredMethod(nuuuuu.b0417041704170417041704170417("\uFF77\uFF79\uFF79\uFF7B\uFF89\uFF89\uFF3A\uFF48\uFF46\uFF46", 'N', '\004'), new Class[] {
            com/visa/cbp/sdk/facade/activeaccountmanagement/CheckStatusService$CheckStatusExecutor
        });
        cbperror = ((CbpError) (((Method) (obj)).invoke(null, new Object[] {
            cbperror
        })));
        cbperror = (Handler)cbperror;
        obj = _fld0;
        obj1 = this._cls1.this;
        obj3 = com/visa/cbp/sdk/facade/activeaccountmanagement/CheckStatusService$CheckStatusExecutor.getDeclaredMethod(nuuuuu.b0417041704170417041704170417("\035\037\037!//\uFFE0\uFFED\uFFEC\uFFF0", '\212', '\316', '\002'), new Class[] {
            com/visa/cbp/sdk/facade/activeaccountmanagement/CheckStatusService$CheckStatusExecutor
        });
        obj1 = ((Method) (obj3)).invoke(null, new Object[] {
            obj1
        });
        i = ((Integer)obj1).intValue();
        obj1 = this._cls1.this;
        obj3 = com/visa/cbp/sdk/facade/activeaccountmanagement/CheckStatusService$CheckStatusExecutor.getDeclaredMethod(nuuuuu.b0417041704170417041704170417("\u0120\u0122\u0122\u0124\u0132\u0132\343\361\357\357", '\b', '\307', '\001'), new Class[] {
            com/visa/cbp/sdk/facade/activeaccountmanagement/CheckStatusService$CheckStatusExecutor
        });
        obj1 = ((Method) (obj3)).invoke(null, new Object[] {
            obj1
        });
        obj1 = (Handler)obj1;
        obj3 = this._cls1.this;
        obj5 = com/visa/cbp/sdk/facade/activeaccountmanagement/CheckStatusService$CheckStatusExecutor.getDeclaredMethod(nuuuuu.b0417041704170417041704170417("\uFFAE\uFFB0\uFFB0\uFFB2\uFFC0\uFFC0\uFF71\uFF80\uFF7D\uFF7D", '\263', '\0'), new Class[] {
            com/visa/cbp/sdk/facade/activeaccountmanagement/CheckStatusService$CheckStatusExecutor
        });
        obj3 = ((Method) (obj5)).invoke(null, new Object[] {
            obj3
        });
        obj3 = (ggrrgg)obj3;
        obj5 = this._cls1.this;
        method = com/visa/cbp/sdk/facade/activeaccountmanagement/CheckStatusService$CheckStatusExecutor.getDeclaredMethod(nuuuuu.b0417041704170417041704170417("\\^^XNN\031\t\r\r", '=', '\002'), new Class[] {
            com/visa/cbp/sdk/facade/activeaccountmanagement/CheckStatusService$CheckStatusExecutor
        });
        obj5 = method.invoke(null, new Object[] {
            obj5
        });
        obj5 = (CheckStatusRequest)obj5;
        obj = new nit>(((CheckStatusService) (obj)), i, ((Handler) (obj1)), ((ggrrgg) (obj3)), ((CheckStatusRequest) (obj5)));
        obj1 = android/os/Handler.getMethod(nuuuuu.b0417041704170417041704170417("\uFE2D\uFE2C\uFE30\uFE31\uFE01\uFE22\uFE29\uFE1E\uFE36\uFE22\uFE21", '\301', '\004'), new Class[] {
            java/lang/Runnable, Long.TYPE
        });
        cbperror = ((CbpError) (((Method) (obj1)).invoke(cbperror, new Object[] {
            obj, Long.valueOf(l1)
        })));
        ((Boolean)cbperror).booleanValue();
        return;
        cbperror;
        throw cbperror.getCause();
        cbperror = ActiveAccountService.formatter;
        obj = java/util/Calendar.getMethod(nuuuuu.b0417041704170417041704170417("\u0201\u01FF\u020E\u01E3\u0208\u020D\u020E\u01FB\u0208\u01FD\u01FF", '\377', '\233', '\003'), new Class[0]);
        obj = ((Method) (obj)).invoke(null, new Object[0]);
        obj = (Calendar)obj;
        obj2 = java/util/Calendar.getMethod(nuuuuu.b0417041704170417041704170417("\u0105\u0103\u0112\362\u0107\u010B\u0103", '\236', '\005'), new Class[0]);
        obj = ((Method) (obj2)).invoke(obj, new Object[0]);
        obj = (Date)obj;
        obj2 = java/text/DateFormat.getMethod(nuuuuu.b0417041704170417041704170417("\uFED6\uFEDF\uFEE2\uFEDD\uFED1\uFEE4", '\310', '\003'), new Class[] {
            java/util/Date
        });
        cbperror = ((CbpError) (((Method) (obj2)).invoke(cbperror, new Object[] {
            obj
        })));
        cbperror = (String)cbperror;
        obj = new Intent("com.visa.cbp.action.VISA_SDK_NOTIFICATION_ACTION");
        obj2 = getApplicationContext();
        obj4 = android/content/Context.getMethod(nuuuuu.b0417041704170417041704170417("\uFEDB\uFED9\uFEE8\uFEC4\uFED5\uFED7\uFEDF\uFED5\uFEDB\uFED9\uFEC2\uFED5\uFEE1\uFED9", '\306', '\003'), new Class[0]);
        obj2 = ((Method) (obj4)).invoke(obj2, new Object[0]);
        obj2 = (String)obj2;
        obj4 = android/content/Intent.getMethod(nuuuuu.b0417041704170417041704170417("\uFFAF\uFFA1\uFFB0\uFF8C\uFF9D\uFF9F\uFFA7\uFF9D\uFFA3\uFFA1", 'b', '\003'), new Class[] {
            java/lang/String
        });
        obj2 = ((Method) (obj4)).invoke(obj, new Object[] {
            obj2
        });
        obj2 = (Intent)obj2;
        obj2 = NotificationAction.ACTION_CHECK_STATUS_FAIL;
        obj4 = com/visa/cbp/sdk/facade/data/NotificationAction.getMethod(nuuuuu.b0417041704170417041704170417("\334\332\351\270\344\331\332", 'u', '\005'), new Class[0]);
        obj2 = ((Method) (obj4)).invoke(obj2, new Object[0]);
        j = ((Integer)obj2).intValue();
        obj2 = android/content/Intent.getMethod(nuuuuu.b0417041704170417041704170417("\uFFDD\uFFE2\uFFE1\uFFB2\uFFE5\uFFE1\uFFDF\uFFCE", '}', '\026', '\0'), new Class[] {
            java/lang/String, Integer.TYPE
        });
        obj2 = ((Method) (obj2)).invoke(obj, new Object[] {
            "com.visa.cbp.action.VISA_SDK_NOTIFICATION_ACTION", Integer.valueOf(j)
        });
        obj2 = (Intent)obj2;
        obj2 = android/content/Intent.getMethod(nuuuuu.b0417041704170417041704170417("\372\377\376\317\u0102\376\374\353", 'R', '8', '\003'), new Class[] {
            java/lang/String, java/lang/String
        });
        obj2 = ((Method) (obj2)).invoke(obj, new Object[] {
            "com.visa.cbp.action.CHECK_STATUS_ACTION_FAIL_DATE", cbperror
        });
        obj2 = (Intent)obj2;
        if (((b042A042A042A042A042A042A + b042A042A042A042A042A042A) * b042A042A042A042A042A042A) % b042A042A042A042A042A042A != b042A042A042A042A042A042A)
        {
            b042A042A042A042A042A042A = 66;
            obj2 = com/visa/cbp/sdk/facade/activeaccountmanagement/CheckStatusService$CheckStatusExecutor$1.getMethod(nuuuuu.b0417041704170417041704170417("u'#%V\u043D'#%V'#%V\u043D'#%V", '\027', '\002'), new Class[0]);
            try
            {
                obj2 = ((Method) (obj2)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (CbpError cbperror)
            {
                throw cbperror.getCause();
            }
            b042A042A042A042A042A042A = ((Integer)obj2).intValue();
        }
        obj2 = getApplicationContext();
        obj4 = android/content/Context.getMethod(nuuuuu.b0417041704170417041704170417("\246\247\224\245\247\206\230\245\251\234\226\230", '3', '\005'), new Class[] {
            android/content/Intent
        });
        obj = ((Method) (obj4)).invoke(obj2, new Object[] {
            obj
        });
        obj = (ComponentName)obj;
        obj = com/visa/cbp/sdk/facade/activeaccountmanagement/CheckStatusService.getDeclaredMethod(nuuuuu.b0417041704170417041704170417("Y[[]KK\034\b\b\b", '8', '\002'), new Class[0]);
        obj = ((Method) (obj)).invoke(null, new Object[0]);
        obj = (String)obj;
        obj2 = new StringBuilder();
        obj4 = java/lang/StringBuilder.getMethod(nuuuuu.b0417041704170417041704170417("hwwluk", '\026', '\035', '\001'), new Class[] {
            java/lang/String
        });
        obj2 = ((Method) (obj4)).invoke(obj2, new Object[] {
            "Replenishment retry failed: "
        });
        obj2 = (StringBuilder)obj2;
        j = b042A042A042A042A042A042A;
        k = b042A042A042A042A042A042A;
        l = b042A042A042A042A042A042A;
        (j * (k + j)) % l;
        JVM INSTR tableswitch 0 0: default 1716
    //                   0 1768;
           goto _L1 _L2
_L1:
        obj4 = com/visa/cbp/sdk/facade/activeaccountmanagement/CheckStatusService$CheckStatusExecutor$1.getMethod(nuuuuu.b0417041704170417041704170417("\uFF00\uFECE\uFED2\uFED0\uFEDF\u02C8\uFECE\uFED2\uFED0\uFEDF\uFECE\uFED2\uFED0\uFEDF\u02C8\uFECE\uFED2\uFED0\uFEDF", 'v', '\004'), new Class[0]);
        obj4 = ((Method) (obj4)).invoke(null, new Object[0]);
        j = ((Integer)obj4).intValue();
        b042A042A042A042A042A042A = j;
        b042A042A042A042A042A042A = 64;
_L2:
        obj4 = java/lang/StringBuilder.getMethod(nuuuuu.b0417041704170417041704170417("-<<1:0", 'm', '9', '\001'), new Class[] {
            java/lang/String
        });
        cbperror = ((CbpError) (((Method) (obj4)).invoke(obj2, new Object[] {
            cbperror
        })));
        cbperror = (StringBuilder)cbperror;
        obj2 = java/lang/StringBuilder.getMethod(nuuuuu.b0417041704170417041704170417("\uFF6A\uFF65\uFF49\uFF6A\uFF68\uFF5F\uFF64\uFF5D", '\205', '\003'), new Class[0]);
        cbperror = ((CbpError) (((Method) (obj2)).invoke(cbperror, new Object[0])));
        cbperror = (String)cbperror;
        obj2 = rrrrrr/ppplpp.getMethod(nuuuuu.b0417041704170417041704170417("\253\u045Ey}z~\u045E\u045Ey}z~\u045Ey}z~", 'I', '\005'), new Class[] {
            java/lang/String, java/lang/String
        });
        ((Method) (obj2)).invoke(null, new Object[] {
            obj, cbperror
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
            int i;
            int j;
            int k;
            int l;
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
            i = b042A042A042A042A042A042A;
            j = b042A042A042A042A042A042A;
            k = b042A042A042A042A042A042A;
            l = b042A042A042A042A042A042A;
        }
        // Misplaced declaration of an exception variable
        catch (CheckStatusResponse checkstatusresponse)
        {
            throw checkstatusresponse;
        }
        list = com/visa/cbp/sdk/facade/activeaccountmanagement/CheckStatusService$CheckStatusExecutor$1.getMethod(nuuuuu.b0417041704170417041704170417("\uFEA0\u0268\uFE6E\uFE72\uFE70\uFE7F\uFE6E\uFE72\uFE70\uFE7F\uFE6E\uFE72\uFE70\uFE7F\u0268\uFE6E\uFE72\uFE70\uFE7F", '\226', '\004'), new Class[0]);
        list = ((List) (list.invoke(null, new Object[0])));
        if (((i + j) * k) % l == ((Integer)list).intValue())
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

    ()
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
        this$1 = this._cls1.this;
        int i = b042A042A042A042A042A042A;
        int j = b042A042A042A042A042A042A;
        int k = b042A042A042A042A042A042A;
        int l = b042A042A042A042A042A042A;
        int i1 = b042A042A042A042A042A042A;
        switch ((i1 * (b042A042A042A042A042A042A + i1)) % b042A042A042A042A042A042A)
        {
        default:
             = com/visa/cbp/sdk/facade/activeaccountmanagement/CheckStatusService$CheckStatusExecutor$1.getMethod(nuuuuu.b0417041704170417041704170417("\u014B\u0119\u011D\u011B\u012A\u0513\u0119\u011D\u011B\u012A\u0119\u011D\u011B\u012A\u0513\u0119\u011D\u011B\u012A", '\216', '[', '\003'), new Class[0]);
            try
            {
                 = ((b042A042A042A042A042A042A) (invoke(null, new Object[0])));
            }
            // Misplaced declaration of an exception variable
            catch ( )
            {
                throw getCause();
            }
            b042A042A042A042A042A042A = ((Integer)b042A042A042A042A042A042A.this).intValue();
            b042A042A042A042A042A042A = 54;
            break;

        case 0: // '\0'
            break;
        }
        if ((k * (i + j)) % l != b042A042A042A042A042A042A)
        {
             = com/visa/cbp/sdk/facade/activeaccountmanagement/CheckStatusService$CheckStatusExecutor$1.getMethod(nuuuuu.b0417041704170417041704170417("\uFE78\uFE46\uFE4A\uFE48\uFE57\u0240\uFE46\uFE4A\uFE48\uFE57\uFE46\uFE4A\uFE48\uFE57\u0240\uFE46\uFE4A\uFE48\uFE57", '\365', '\003'), new Class[0]);
            try
            {
                 = ((b042A042A042A042A042A042A) (invoke(null, new Object[0])));
            }
            // Misplaced declaration of an exception variable
            catch ( )
            {
                throw getCause();
            }
            b042A042A042A042A042A042A = ((Integer)b042A042A042A042A042A042A.this).intValue();
            b042A042A042A042A042A042A = 89;
        }
        super();
    }
}
