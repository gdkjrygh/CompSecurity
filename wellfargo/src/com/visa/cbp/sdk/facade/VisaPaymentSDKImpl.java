// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.visa.cbp.sdk.facade;

import android.content.Context;
import android.os.Bundle;
import com.visa.cbp.external.aam.CheckStatusRequest;
import com.visa.cbp.external.aam.ReplenishRequest;
import com.visa.cbp.external.common.Status;
import com.visa.cbp.external.common.TokenInfo;
import com.visa.cbp.external.lcm.LcmTokenRequest;
import com.visa.cbp.sdk.facade.activeaccountmanagement.CheckStatusCallback;
import com.visa.cbp.sdk.facade.data.ApduResponse;
import com.visa.cbp.sdk.facade.data.CvmMode;
import com.visa.cbp.sdk.facade.data.DeviceData;
import com.visa.cbp.sdk.facade.data.EnrollProvisionRequestWrapper;
import com.visa.cbp.sdk.facade.data.LcmParams;
import com.visa.cbp.sdk.facade.data.TokenData;
import com.visa.cbp.sdk.facade.data.TokenKey;
import com.visa.cbp.sdk.facade.data.TokenStatus;
import com.visa.cbp.sdk.facade.environment.Environment;
import com.visa.cbp.sdk.facade.error.CbpError;
import com.visa.cbp.sdk.facade.error.ReasonCode;
import com.visa.cbp.sdk.facade.error.SDKErrorType;
import com.visa.cbp.sdk.facade.error.TokenStatusError;
import com.visa.cbp.sdk.facade.exception.InitializationException;
import com.visa.cbp.sdk.facade.exception.InvalidInputException;
import com.visa.cbp.sdk.facade.exception.PaywaveException;
import com.visa.cbp.sdk.facade.exception.SDKModeException;
import com.visa.cbp.sdk.facade.exception.TokenInvalidException;
import com.visa.cbp.sdk.facade.exception.TokenKeyInvalidException;
import com.visa.cbp.sdk.facade.provider.CheckStatusProvider;
import com.visa.cbp.sdk.facade.provider.DeleteTokenProvider;
import com.visa.cbp.sdk.facade.provider.ReplenishmentProvider;
import com.visa.cbp.sdk.facade.provider.ResponseCallback;
import com.visa.cbp.sdk.facade.provider.ResumeTokenProvider;
import com.visa.cbp.sdk.facade.provider.SuspendTokenProvider;
import com.visa.cbp.sdk.facade.provider.TokenProvider;
import com.visa.cbp.sdk.facade.request.AuthenticationParams;
import com.visa.cbp.sdk.facade.request.AuthenticationRequest;
import com.visa.cbp.sdk.facade.request.ProvisionTokenParams;
import com.visa.cbp.sdk.facade.request.ReplenishParams;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import rrrrrr.gggggr;
import rrrrrr.ggrrgg;
import rrrrrr.ggrrrr;
import rrrrrr.grgrgr;
import rrrrrr.grrgrg;
import rrrrrr.grrgrr;
import rrrrrr.lllpll;
import rrrrrr.llnnnn;
import rrrrrr.llplll;
import rrrrrr.llpllp;
import rrrrrr.llplpp;
import rrrrrr.llpppl;
import rrrrrr.lpllpl;
import rrrrrr.lpllpp;
import rrrrrr.lpplll;
import rrrrrr.lppllp;
import rrrrrr.lpplpl;
import rrrrrr.lpppll;
import rrrrrr.nnlnnn;
import rrrrrr.nnnlnn;
import rrrrrr.plllpp;
import rrrrrr.pllppl;
import rrrrrr.pllppp;
import rrrrrr.plpllp;
import rrrrrr.pplpll;
import rrrrrr.ppplpl;
import rrrrrr.ppplpp;
import rrrrrr.rggggr;
import rrrrrr.rggrgg;
import rrrrrr.rggrrr;
import rrrrrr.rgrgrg;
import rrrrrr.rrgggg;
import uuuuuu.nuuuuu;

// Referenced classes of package com.visa.cbp.sdk.facade:
//            VisaPaymentSDK

public class VisaPaymentSDKImpl
    implements VisaPaymentSDK
{

    public static final String FLOW1_MODE = "Network calls outside of Visa are only available in Flow 2.  Since the environment variable is set, Flow 2 is not enabled and Flow 1 is assumed.";
    public static final String FLOW1_MODE_NOT_ALLOWED = "Network calls outside of Visa are only available in Flow 2.  Since the environment variable is set, Flow 2 is not enabled and Flow 1 is assumed.  This method (or this specific overloaded version of this method) should not be called while in Flow 1 mode since Visa is responsible for all network traffic from the SDK.";
    public static final String FLOW2_MODE = "Network calls to Visa are only available in Flow 1.  Since the environment variable is not set, Flow 1 is not enabled within the SDK and Flow2 is assumed.";
    public static final String FLOW2_MODE_NOT_ALLOWED = "Network calls to Visa are only available in Flow 1.  Since the environment variable is not set, Flow 1 is not enabled within the SDK and Flow2 is assumed.  This method (or this specific overloaded version of this method) should not be called while in Flow 2 mode since you are responsible for all network traffic.";
    private static final String TAG;
    public static int b041C041C041C041C041C041C = 2;
    public static int b042504250425042504250425 = 0;
    public static int b042504250425042504250425 = 1;
    public static int b042504250425042504250425 = 59;
    private static Context context;
    public static Environment environment;
    private static volatile VisaPaymentSDKImpl instance;
    public Context appContext;
    private volatile boolean initialized;
    private grrgrg settingsDao;
    private ppplpl tokenDao;
    private llplpp tvlDao;
    private grrgrr vcpcsProcessor;

    private VisaPaymentSDKImpl()
    {
_L8:
        1;
        JVM INSTR tableswitch 0 1: default 28
    //                   0 4
    //                   1 55;
           goto _L1 _L2 _L3
_L2:
        continue; /* Loop/switch isn't completed */
_L1:
label0:
        while (true) 
        {
            switch (0)
            {
            default:
                break;

            case 0: // '\0'
                break label0;

            case 1: // '\001'
                continue; /* Loop/switch isn't completed */
            }
        }
_L3:
        1;
        JVM INSTR tableswitch 0 1: default 80
    //                   0 4
    //                   1 107;
           goto _L4 _L5 _L6
_L5:
        continue; /* Loop/switch isn't completed */
_L6:
        break; /* Loop/switch isn't completed */
_L4:
        while (true) 
        {
            switch (0)
            {
            default:
                break;

            case 0: // '\0'
                break; /* Loop/switch isn't completed */

            case 1: // '\001'
                continue; /* Loop/switch isn't completed */
            }
        }
        if (true) goto _L8; else goto _L7
_L7:
        if (((b042504250425042504250425 + b042504250425042504250425) * b042504250425042504250425) % b041C041C041C041C041C041C != b042504250425042504250425)
        {
            int i = b042504250425042504250425;
            int j = b042504250425042504250425;
            int k = b042504250425042504250425;
            int l = b041C041C041C041C041C041C;
            Object obj = com/visa/cbp/sdk/facade/VisaPaymentSDKImpl.getMethod(nuuuuu.b0417041704170417041704170417("6\004\b\005\027\004\b\005\027\u03F0\u03F0\u03F0\u03F0", '\026', '\003'), new Class[0]);
            try
            {
                obj = ((Method) (obj)).invoke(null, new Object[0]);
            }
            catch (InvocationTargetException invocationtargetexception1)
            {
                throw invocationtargetexception1.getCause();
            }
            if (((i + j) * k) % l != ((Integer)obj).intValue())
            {
                Object obj1 = com/visa/cbp/sdk/facade/VisaPaymentSDKImpl.getMethod(nuuuuu.b0417041704170417041704170417("m\u0427;?<N\u0427\u0427\u0427\u0427", 'O', 'Z', '\001'), new Class[0]);
                InvocationTargetException invocationtargetexception;
                try
                {
                    obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
                }
                catch (InvocationTargetException invocationtargetexception2)
                {
                    throw invocationtargetexception2.getCause();
                }
                b042504250425042504250425 = ((Integer)obj1).intValue();
                obj1 = com/visa/cbp/sdk/facade/VisaPaymentSDKImpl.getMethod(nuuuuu.b0417041704170417041704170417("\u0238\u05F2\u0206\u020A\u0207\u0219\u05F2\u05F2\u05F2\u05F2", '\373', '\333', '\003'), new Class[0]);
                try
                {
                    obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
                }
                catch (InvocationTargetException invocationtargetexception3)
                {
                    throw invocationtargetexception3.getCause();
                }
                b042504250425042504250425 = ((Integer)obj1).intValue();
            }
            b042504250425042504250425 = 14;
            obj1 = com/visa/cbp/sdk/facade/VisaPaymentSDKImpl.getMethod(nuuuuu.b0417041704170417041704170417("\uFF0F\u02C9\uFEDD\uFEE1\uFEDE\uFEF0\u02C9\u02C9\u02C9\u02C9", 'q', '\004'), new Class[0]);
            try
            {
                obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (InvocationTargetException invocationtargetexception)
            {
                throw invocationtargetexception.getCause();
            }
            b042504250425042504250425 = ((Integer)obj1).intValue();
        }
        initialized = false;
        return;
    }

    static boolean arrayCompare(byte abyte0[], int i, byte abyte1[], int j, int k)
    {
        int l;
        if (abyte0 == null)
        {
            return true;
        }
        l = b042504250425042504250425;
        Object obj = com/visa/cbp/sdk/facade/VisaPaymentSDKImpl.getMethod(nuuuuu.b0417041704170417041704170417("\uFF91\u034B\uFF5F\uFF63\uFF60\uFF72\uFF5F\uFF63\uFF60\uFF72\u034B\u034B\u034B", '\222', '?', '\0'), new Class[0]);
        try
        {
            obj = ((Method) (obj)).invoke(null, new Object[0]);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw abyte0.getCause();
        }
        switch (((((Integer)obj).intValue() + l) * l) % b041C041C041C041C041C041C)
        {
        default:
            Object obj1 = com/visa/cbp/sdk/facade/VisaPaymentSDKImpl.getMethod(nuuuuu.b0417041704170417041704170417("z\u0434HLI[\u0434\u0434\u0434\u0434", '\030', '\005'), new Class[0]);
            try
            {
                obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (byte abyte0[])
            {
                throw abyte0.getCause();
            }
            b042504250425042504250425 = ((Integer)obj1).intValue();
            obj1 = com/visa/cbp/sdk/facade/VisaPaymentSDKImpl.getMethod(nuuuuu.b0417041704170417041704170417("G\u0401\025\031\026(\u0401\u0401\u0401\u0401", 'E', '*', '\001'), new Class[0]);
            try
            {
                obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (byte abyte0[])
            {
                throw abyte0.getCause();
            }
            b042504250425042504250425 = ((Integer)obj1).intValue();
            break;

        case 0: // '\0'
            break;
        }
        if (abyte1 == null)
        {
            return false;
        }
        l = i;
        if (l < i + k)
        {
            if (abyte1[j] != abyte0[l])
            {
                return false;
            }
        } else
        {
            return true;
        }
        break MISSING_BLOCK_LABEL_206;
        l++;
        j++;
        if (false)
        {
        } else
        {
            break MISSING_BLOCK_LABEL_9;
        }
    }

    public static int b041C041C041C041C041C041C()
    {
        return 2;
    }

    public static int b041C041C041C041C041C041C()
    {
        return 0;
    }

    public static int b041C041C041C041C041C041C()
    {
        return 1;
    }

    public static int b041C041C041C041C041C041C()
    {
        return 45;
    }

    public static VisaPaymentSDK getInstance()
    {
        if (instance != null) goto _L2; else goto _L1
_L1:
        com/visa/cbp/sdk/facade/VisaPaymentSDKImpl;
        JVM INSTR monitorenter ;
        if (instance != null) goto _L4; else goto _L3
_L3:
        if (context != null) goto _L6; else goto _L5
_L5:
        Object obj = TAG;
        Method method = rrrrrr/ppplpp.getMethod(nuuuuu.b0417041704170417041704170417("\301\u0474\217\223\220\224\u0474\u0474\217\223\220\224\u0474\217\223\220\224", '_', '\005'), new Class[] {
            java/lang/String, java/lang/String
        });
        method.invoke(null, new Object[] {
            obj, "Context must be initialized using VisaPaymentSDKImpl.initialize(..) before calling VisaPaymentSDK.getInstance() method.  If the environment  is set to null, no network calls will be made by the SDK (flow 2)."
        });
        com/visa/cbp/sdk/facade/VisaPaymentSDKImpl;
        JVM INSTR monitorexit ;
        return null;
_L15:
        VisaPaymentSDKImpl visapaymentsdkimpl;
        visapaymentsdkimpl = new VisaPaymentSDKImpl();
        obj = context;
        method = com/visa/cbp/sdk/facade/VisaPaymentSDKImpl.getDeclaredMethod(nuuuuu.b0417041704170417041704170417("\uFE7D\uFE82\uFE7D\uFE88", '\244', '\004'), new Class[] {
            android/content/Context
        });
        method.invoke(visapaymentsdkimpl, new Object[] {
            obj
        });
        instance = visapaymentsdkimpl;
_L4:
        com/visa/cbp/sdk/facade/VisaPaymentSDKImpl;
        JVM INSTR monitorexit ;
_L2:
        return instance;
_L7:
        0;
        JVM INSTR tableswitch 0 1: default 160
    //                   0 163
    //                   1 234;
           goto _L7 _L8 _L9
_L8:
        com/visa/cbp/sdk/facade/VisaPaymentSDKImpl;
        JVM INSTR monitorexit ;
        throw obj;
        obj;
        throw ((InvocationTargetException) (obj)).getCause();
        obj;
        throw ((InvocationTargetException) (obj)).getCause();
_L6:
        obj = context;
        method = rrrrrr/lpllpl.getMethod(nuuuuu.b0417041704170417041704170417("\uFFEC\uFFBA\uFFBE\uFFBD\uFFBB\u03BB\uFFBA\uFFBE\uFFBD\uFFBB\u03BB\uFFBA\uFFBE\uFFBD\uFFBB\uFFBA\uFFBE\uFFBD\uFFBB", '\330', 'b', '\001'), new Class[] {
            android/content/Context
        });
        method.invoke(null, new Object[] {
            obj
        });
          goto _L10
        obj;
        throw ((InvocationTargetException) (obj)).getCause();
        obj;
_L9:
        0;
        JVM INSTR tableswitch 0 1: default 256
    //                   0 163
    //                   1 234;
           goto _L7 _L8 _L9
_L10:
        1;
        JVM INSTR tableswitch 0 1: default 284
    //                   0 259
    //                   1 77;
           goto _L11 _L10 _L12
_L12:
        continue; /* Loop/switch isn't completed */
_L11:
        1;
        JVM INSTR tableswitch 0 1: default 308
    //                   0 259
    //                   1 77;
           goto _L11 _L10 _L13
_L13:
        if (true) goto _L15; else goto _L14
_L14:
    }

    private void init(Context context1)
    {
        if (initialized)
        {
            break MISSING_BLOCK_LABEL_764;
        }
        Object obj = TAG;
        Method method = rrrrrr/ppplpp.getMethod(nuuuuu.b0417041704170417041704170417("\266\u0469\u0469\204\210\205\211\204\210\205\211\204\210\205\211\u0469\204\210\205\211", 'K', '\t', '\003'), new Class[] {
            java/lang/String, java/lang/String
        });
        try
        {
            method.invoke(null, new Object[] {
                obj, "Initializing SDK..."
            });
        }
        // Misplaced declaration of an exception variable
        catch (Context context1)
        {
            throw context1.getCause();
        }
        appContext = context1;
        settingsDao = new lppllp(appContext);
        obj = rrrrrr/grgrgr.getMethod(nuuuuu.b0417041704170417041704170417("\u01AF\u0578\u017D\u0181\u017F\u018F\u017D\u0181\u017F\u018F\u017D\u0181\u017F\u018F\u017D\u0181\u017F\u018F\u0578", '\\', '\361', '\003'), new Class[] {
            android/content/Context
        });
        try
        {
            obj = ((Method) (obj)).invoke(null, new Object[] {
                context1
            });
        }
        // Misplaced declaration of an exception variable
        catch (Context context1)
        {
            throw context1.getCause();
        }
        obj = (grgrgr)obj;
        if (environment != null)
        {
            obj = rrrrrr/llplll.getMethod(nuuuuu.b0417041704170417041704170417("\231\u04BC\u04BC\313\317\317\314\u04BC\u04BC\313\317\317\314", '\373', '\002'), new Class[0]);
            Object obj1;
            Method method1;
            int i;
            try
            {
                obj = ((Method) (obj)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (Context context1)
            {
                throw context1.getCause();
            }
            obj = (llplll)obj;
            obj = environment.name();
        } else
        {
            obj = "FLOW_2";
        }
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
        obj1 = settingsDao;
        method1 = rrrrrr/grrgrg.getMethod(nuuuuu.b0417041704170417041704170417("\u02D8\u02A6\u02AA\u02A8\u02AD\u02A6\u02AA\u02A8\u02AD\u069D\u02A6\u02AA\u02A8\u02AD\u069D\u069D", '\322', '\006'), new Class[] {
            java/lang/String
        });
        try
        {
            method1.invoke(obj1, new Object[] {
                obj
            });
        }
        // Misplaced declaration of an exception variable
        catch (Context context1)
        {
            throw context1.getCause();
        }
        tokenDao = new llpppl(appContext);
        tvlDao = new rggrgg(appContext);
        obj = rrrrrr/pllppl.getMethod(nuuuuu.b0417041704170417041704170417("\uFF93\uFF61\uFF65\uFF62\uFF73\u034C\u034C\u034C\uFF61\uFF65\uFF62\uFF73\uFF61\uFF65\uFF62\uFF73", 'E', '\004'), new Class[0]);
        try
        {
            obj = ((Method) (obj)).invoke(null, new Object[0]);
        }
        // Misplaced declaration of an exception variable
        catch (Context context1)
        {
            throw context1.getCause();
        }
        obj = (plpllp)obj;
        obj1 = rrrrrr/plpllp.getMethod(nuuuuu.b0417041704170417041704170417("\uFDEC\uFDBA\uFDBE\uFDBB\uFDCC\uFDBA\uFDBE\uFDBB\uFDCC\u01A5\u01A5\uFDBA\uFDBE\uFDBB\uFDCC\uFDBA\uFDBE\uFDBB\uFDCC", '\322', '\004'), new Class[0]);
        try
        {
            ((Method) (obj1)).invoke(obj, new Object[0]);
        }
        // Misplaced declaration of an exception variable
        catch (Context context1)
        {
            throw context1.getCause();
        }
        vcpcsProcessor = new rrgggg(settingsDao, tokenDao, tvlDao);
        plllpp.b044604460446044604460446_rrrrrr_ppplpl_static_fld = tokenDao;
        plllpp.b044604460446044604460446_rrrrrr_pplppp_static_fld = new gggggr(context1);
        plllpp.b044604460446044604460446_android_content_Context_static_fld = context1;
        plllpp.b044604460446044604460446_rrrrrr_plpllp_static_fld = ((plpllp) (obj));
        context1 = settingsDao;
        obj = rrrrrr/grrgrg.getMethod(nuuuuu.b0417041704170417041704170417("\002\u03E0\u03E0\uFFD0\uFFD4\uFFD4\uFFD0\uFFD0\uFFD4\uFFD4\uFFD0\uFFD0\uFFD4\uFFD4\uFFD0\uFFD0\uFFD4\uFFD4\uFFD0", '0', '\003'), new Class[0]);
        try
        {
            context1 = ((Context) (((Method) (obj)).invoke(context1, new Object[0])));
        }
        // Misplaced declaration of an exception variable
        catch (Context context1)
        {
            throw context1.getCause();
        }
        context1 = (TokenKey)context1;
        if (((b042504250425042504250425 + b042504250425042504250425) * b042504250425042504250425) % b041C041C041C041C041C041C != b042504250425042504250425)
        {
            i = b042504250425042504250425;
            obj = com/visa/cbp/sdk/facade/VisaPaymentSDKImpl.getMethod(nuuuuu.b0417041704170417041704170417("\uFE92\u024C\uFE60\uFE64\uFE61\uFE73\uFE60\uFE64\uFE61\uFE73\u024C\u024C\u024C", '\336', '\362', '\0'), new Class[0]);
            try
            {
                obj = ((Method) (obj)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (Context context1)
            {
                throw context1.getCause();
            }
            switch (((((Integer)obj).intValue() + i) * i) % b041C041C041C041C041C041C)
            {
            default:
                obj = com/visa/cbp/sdk/facade/VisaPaymentSDKImpl.getMethod(nuuuuu.b0417041704170417041704170417("\227\u0451eifx\u0451\u0451\u0451\u0451", '5', '\005'), new Class[0]);
                try
                {
                    obj = ((Method) (obj)).invoke(null, new Object[0]);
                }
                // Misplaced declaration of an exception variable
                catch (Context context1)
                {
                    throw context1.getCause();
                }
                b042504250425042504250425 = ((Integer)obj).intValue();
                obj = com/visa/cbp/sdk/facade/VisaPaymentSDKImpl.getMethod(nuuuuu.b0417041704170417041704170417("\250\u0462vzw\211\u0462\u0462\u0462\u0462", 'F', '\005'), new Class[0]);
                try
                {
                    obj = ((Method) (obj)).invoke(null, new Object[0]);
                }
                // Misplaced declaration of an exception variable
                catch (Context context1)
                {
                    throw context1.getCause();
                }
                b042504250425042504250425 = ((Integer)obj).intValue();
                // fall through

            case 0: // '\0'
                b042504250425042504250425 = 46;
                obj = com/visa/cbp/sdk/facade/VisaPaymentSDKImpl.getMethod(nuuuuu.b0417041704170417041704170417("\u017C\u0536\u014A\u014E\u014B\u015D\u0536\u0536\u0536\u0536", '\220', '\212', '\003'), new Class[0]);
                break;
            }
            try
            {
                obj = ((Method) (obj)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (Context context1)
            {
                throw context1.getCause();
            }
            b042504250425042504250425 = ((Integer)obj).intValue();
        }
        if (context1 != null)
        {
            obj = com/visa/cbp/sdk/facade/VisaPaymentSDKImpl.getDeclaredMethod(nuuuuu.b0417041704170417041704170417("\232\234\217z\234\231\215\217\235\235}\217\226\217\215\236\217\216m\213\234\216~\231\225\217\230s\230\220\231", '\322', '\374', '\001'), new Class[] {
                com/visa/cbp/sdk/facade/data/TokenKey
            });
            try
            {
                ((Method) (obj)).invoke(this, new Object[] {
                    context1
                });
            }
            // Misplaced declaration of an exception variable
            catch (Context context1)
            {
                throw context1.getCause();
            }
        }
        initialized = true;
        context1 = TAG;
        obj = rrrrrr/ppplpp.getMethod(nuuuuu.b0417041704170417041704170417("\u0128\u04DB\u04DB\366\372\367\373\366\372\367\373\366\372\367\373\u04DB\366\372\367\373", 'c', '\001'), new Class[] {
            java/lang/String, java/lang/String
        });
        ((Method) (obj)).invoke(null, new Object[] {
            context1, "SDK Initialized."
        });
        return;
        context1;
        throw context1.getCause();
    }

    public static void initialize(Context context1)
    {
        int i = b042504250425042504250425;
        switch ((i * (b042504250425042504250425 + i)) % b041C041C041C041C041C041C)
        {
        default:
            b042504250425042504250425 = 41;
            Object obj = com/visa/cbp/sdk/facade/VisaPaymentSDKImpl.getMethod(nuuuuu.b0417041704170417041704170417("\006\u03C0\uFFD4\uFFD8\uFFD5\uFFE7\u03C0\u03C0\u03C0\u03C0", '.', '\003'), new Class[0]);
            try
            {
                obj = ((Method) (obj)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (Context context1)
            {
                throw context1.getCause();
            }
            b042504250425042504250425 = ((Integer)obj).intValue();
            break;

        case 0: // '\0'
            break;
        }
        1;
        JVM INSTR tableswitch 0 1: default 100
    //                   0 75
    //                   1 127;
           goto _L1 _L2 _L3
_L2:
        continue; /* Loop/switch isn't completed */
_L1:
label0:
        while (true) 
        {
            switch (0)
            {
            default:
                break;

            case 0: // '\0'
                break label0;

            case 1: // '\001'
                continue; /* Loop/switch isn't completed */
            }
        }
_L3:
        1;
        JVM INSTR tableswitch 0 1: default 152
    //                   0 75
    //                   1 179;
           goto _L4 _L5 _L6
_L5:
        continue; /* Loop/switch isn't completed */
_L6:
        break; /* Loop/switch isn't completed */
_L4:
        while (true) 
        {
            switch (0)
            {
            default:
                break;

            case 0: // '\0'
                break; /* Loop/switch isn't completed */

            case 1: // '\001'
                continue; /* Loop/switch isn't completed */
            }
        }
        if (true) goto _L8; else goto _L7
_L8:
        break MISSING_BLOCK_LABEL_75;
_L7:
        obj = com/visa/cbp/sdk/facade/VisaPaymentSDKImpl.getMethod(nuuuuu.b0417041704170417041704170417("\271\276\271\304\271\261\274\271\312\265", '\017', 'A', '\003'), new Class[] {
            android/content/Context, com/visa/cbp/sdk/facade/environment/Environment
        });
        try
        {
            ((Method) (obj)).invoke(null, new Object[] {
                context1, null
            });
        }
        // Misplaced declaration of an exception variable
        catch (Context context1)
        {
            throw context1.getCause();
        }
_L10:
        context1 = java/lang/String.getMethod(nuuuuu.b0417041704170417041704170417("\\U^WdX", '\306', '\326', '\002'), new Class[0]);
        context1 = ((Context) (context1.invoke(null, new Object[0])));
        ((Integer)context1).intValue();
        if (true) goto _L10; else goto _L9
_L9:
        context1;
        try
        {
            throw context1.getCause();
        }
        // Misplaced declaration of an exception variable
        catch (Context context1)
        {
            context1 = com/visa/cbp/sdk/facade/VisaPaymentSDKImpl.getMethod(nuuuuu.b0417041704170417041704170417("\u01B2\u056C\u0180\u0184\u0181\u0193\u056C\u056C\u056C\u056C", 'p', '\006'), new Class[0]);
        }
        try
        {
            context1 = ((Context) (context1.invoke(null, new Object[0])));
        }
        // Misplaced declaration of an exception variable
        catch (Context context1)
        {
            throw context1.getCause();
        }
        b042504250425042504250425 = ((Integer)context1).intValue();
        return;
    }

    public static void initialize(Context context1, Environment environment1)
    {
        if (context1 == null)
        {
            throw new InitializationException("Context cannot be null");
        }
          goto _L1
_L3:
        Object obj = TAG;
        Method method = rrrrrr/ppplpp.getMethod(nuuuuu.b0417041704170417041704170417("\uFF1C\u02CF\u02CF\uFEEA\uFEEE\uFEEB\uFEEF\uFEEA\uFEEE\uFEEB\uFEEF\uFEEA\uFEEE\uFEEB\uFEEF\u02CF\uFEEA\uFEEE\uFEEB\uFEEF", '\243', '\003'), new Class[] {
            java/lang/String, java/lang/String
        });
        try
        {
            method.invoke(null, new Object[] {
                obj, "initialize environment: Flow-2"
            });
        }
        // Misplaced declaration of an exception variable
        catch (Context context1)
        {
            throw context1.getCause();
        }
_L4:
        obj = android/content/Context.getMethod(nuuuuu.b0417041704170417041704170417("\u0217\u0215\u0224\u01F1\u0220\u0220\u021C\u0219\u0213\u0211\u0224\u0219\u021F\u021E\u01F3\u021F\u021E\u0224\u0215\u0228\u0224", '\330', '\001'), new Class[0]);
        try
        {
            context1 = ((Context) (((Method) (obj)).invoke(context1, new Object[0])));
        }
        // Misplaced declaration of an exception variable
        catch (Context context1)
        {
            throw context1.getCause();
        }
        context1 = (Context)context1;
label0:
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
                        break label0;

                    case 1: // '\001'
                        continue label0;
                    }
                }
                break;

            case 0: // '\0'
                break label0;

            case 1: // '\001'
                break;
            }
        } while (true);
        context = context1;
        environment = environment1;
        if (((b042504250425042504250425 + b042504250425042504250425) * b042504250425042504250425) % b041C041C041C041C041C041C != b042504250425042504250425)
        {
            context1 = com/visa/cbp/sdk/facade/VisaPaymentSDKImpl.getMethod(nuuuuu.b0417041704170417041704170417("\uFD8C\u0146\uFD5A\uFD5E\uFD5B\uFD6D\u0146\u0146\u0146\u0146", '\362', '\004'), new Class[0]);
            String s;
            Object obj1;
            Object obj2;
            Method method1;
            try
            {
                context1 = ((Context) (context1.invoke(null, new Object[0])));
            }
            // Misplaced declaration of an exception variable
            catch (Context context1)
            {
                throw context1.getCause();
            }
            b042504250425042504250425 = ((Integer)context1).intValue();
            context1 = com/visa/cbp/sdk/facade/VisaPaymentSDKImpl.getMethod(nuuuuu.b0417041704170417041704170417("\242\u04DC\360\364\361\203\u04DC\u04DC\u04DC\u04DC", '\300', '\002'), new Class[0]);
            try
            {
                context1 = ((Context) (context1.invoke(null, new Object[0])));
            }
            // Misplaced declaration of an exception variable
            catch (Context context1)
            {
                throw context1.getCause();
            }
            b042504250425042504250425 = ((Integer)context1).intValue();
        }
        return;
_L1:
        if (environment1 == null) goto _L3; else goto _L2
_L2:
        s = TAG;
        obj1 = new StringBuilder();
        obj2 = java/lang/StringBuilder.getMethod(nuuuuu.b0417041704170417041704170417("\u0129\u0138\u0138\u012D\u0136\u012C", '\032', '\256', '\003'), new Class[] {
            java/lang/String
        });
        try
        {
            obj1 = ((Method) (obj2)).invoke(obj1, new Object[] {
                "initialize environment: "
            });
        }
        // Misplaced declaration of an exception variable
        catch (Context context1)
        {
            throw context1.getCause();
        }
        obj1 = (StringBuilder)obj1;
        obj2 = environment1.toString();
        method1 = java/lang/StringBuilder.getMethod(nuuuuu.b0417041704170417041704170417(" //$-#", 'A', '\0'), new Class[] {
            java/lang/String
        });
        try
        {
            obj1 = method1.invoke(obj1, new Object[] {
                obj2
            });
        }
        // Misplaced declaration of an exception variable
        catch (Context context1)
        {
            throw context1.getCause();
        }
        obj1 = (StringBuilder)obj1;
        obj2 = java/lang/StringBuilder.getMethod(nuuuuu.b0417041704170417041704170417("\224\217s\224\222\211\216\207", '\237', '\277', '\001'), new Class[0]);
        try
        {
            obj1 = ((Method) (obj2)).invoke(obj1, new Object[0]);
        }
        // Misplaced declaration of an exception variable
        catch (Context context1)
        {
            throw context1.getCause();
        }
        obj1 = (String)obj1;
        obj2 = rrrrrr/ppplpp.getMethod(nuuuuu.b0417041704170417041704170417("\255\u0460\u0460{\177|\200{\177|\200{\177|\200\u0460{\177|\200", 'K', '\005'), new Class[] {
            java/lang/String, java/lang/String
        });
        try
        {
            ((Method) (obj2)).invoke(null, new Object[] {
                s, obj1
            });
        }
        // Misplaced declaration of an exception variable
        catch (Context context1)
        {
            throw context1.getCause();
        }
          goto _L4
    }

    private void preProcessSelectedCardTokenInfo(TokenKey tokenkey)
    {
        Object obj;
        Object obj1;
        Object obj2;
        int i;
        int j;
        int k;
        int l;
        int i1;
        int j1;
        try
        {
            obj = TAG;
        }
        // Misplaced declaration of an exception variable
        catch (TokenKey tokenkey)
        {
            throw tokenkey;
        }
        obj1 = rrrrrr/ppplpp.getMethod(nuuuuu.b0417041704170417041704170417("\uFF84\u0337\u0337\uFF52\uFF56\uFF53\uFF57\uFF52\uFF56\uFF53\uFF57\uFF52\uFF56\uFF53\uFF57\u0337\uFF52\uFF56\uFF53\uFF57", '!', '\377', '\002'), new Class[] {
            java/lang/String, java/lang/String
        });
        ((Method) (obj1)).invoke(null, new Object[] {
            obj, "Preprocessing Token Data"
        });
        plllpp.b044604460446044604460446_com_visa_cbp_sdk_facade_data_TokenKey_static_fld = tokenkey;
        try
        {
            obj = vcpcsProcessor;
        }
        // Misplaced declaration of an exception variable
        catch (TokenKey tokenkey)
        {
            throw tokenkey;
        }
        obj1 = rrrrrr/grrgrr.getMethod(nuuuuu.b0417041704170417041704170417("\uFFCA\uFF98\uFF9C\uFF9B\uFF9E\uFF98\uFF9C\uFF9B\uFF9E\u039E\u039E\u039E\u039E", 'L', '\003'), new Class[] {
            com/visa/cbp/sdk/facade/data/TokenKey
        });
        ((Method) (obj1)).invoke(obj, new Object[] {
            tokenkey
        });
        obj = tokenDao;
        obj1 = rrrrrr/ppplpl.getMethod(nuuuuu.b0417041704170417041704170417("\u0149\u0502\u0117\u011B\u0118\u0129\u0117\u011B\u0118\u0129\u0117\u011B\u0118\u0129\u0117\u011B\u0118\u0129\u0502", 'M', '\006'), new Class[] {
            com/visa/cbp/sdk/facade/data/TokenKey
        });
        obj = ((Method) (obj1)).invoke(obj, new Object[] {
            tokenkey
        });
        obj = (TokenInfo)obj;
        obj1 = tokenDao;
        obj2 = rrrrrr/ppplpl.getMethod(nuuuuu.b0417041704170417041704170417("f\u041F\u041F\u041F405F405F\u041F", '\004', '\002'), new Class[] {
            com/visa/cbp/sdk/facade/data/TokenKey
        });
        obj1 = ((Method) (obj2)).invoke(obj1, new Object[] {
            tokenkey
        });
        i = ((Integer)obj1).intValue();
        obj1 = tokenDao;
        obj2 = rrrrrr/ppplpl.getMethod(nuuuuu.b0417041704170417041704170417("f485F485F\u041F\u041F\u041F485F", '\002', '\001'), new Class[] {
            com/visa/cbp/sdk/facade/data/TokenKey
        });
        obj1 = ((Method) (obj2)).invoke(obj1, new Object[] {
            tokenkey
        });
        obj1 = (rggrrr)obj1;
        if (((b042504250425042504250425 + b042504250425042504250425) * b042504250425042504250425) % b041C041C041C041C041C041C != b042504250425042504250425)
        {
            b042504250425042504250425 = 3;
            b042504250425042504250425 = 80;
        }
_L3:
        0;
        JVM INSTR tableswitch 0 1: default 312
    //                   0 339
    //                   1 288;
           goto _L1 _L2 _L3
_L1:
        0;
        JVM INSTR tableswitch 0 1: default 336
    //                   0 339
    //                   1 288;
           goto _L1 _L2 _L3
_L2:
        j = b042504250425042504250425;
        k = b042504250425042504250425;
        l = b042504250425042504250425;
        obj2 = com/visa/cbp/sdk/facade/VisaPaymentSDKImpl.getMethod(nuuuuu.b0417041704170417041704170417("\uFF6C\uFF3A\uFF3E\uFF3B\uFF4D\uFF3A\uFF3E\uFF3B\uFF4D\uFF3A\uFF3E\uFF3B\uFF4D\u0326\u0326\u0326", 'R', '\004'), new Class[0]);
        obj2 = ((Method) (obj2)).invoke(null, new Object[0]);
        i1 = ((Integer)obj2).intValue();
        j1 = b042504250425042504250425;
        if ((l * (j + k)) % i1 == j1) goto _L5; else goto _L4
_L4:
        obj2 = com/visa/cbp/sdk/facade/VisaPaymentSDKImpl.getMethod(nuuuuu.b0417041704170417041704170417("\205\u043FSWTf\u043F\u043F\u043F\u043F", '(', '\005', '\002'), new Class[0]);
        obj2 = ((Method) (obj2)).invoke(null, new Object[0]);
        j = ((Integer)obj2).intValue();
        b042504250425042504250425 = j;
        obj2 = com/visa/cbp/sdk/facade/VisaPaymentSDKImpl.getMethod(nuuuuu.b0417041704170417041704170417("\u01F2\u05AC\u01C0\u01C4\u01C1\u01D3\u05AC\u05AC\u05AC\u05AC", '\374', '\224', '\003'), new Class[0]);
        obj2 = ((Method) (obj2)).invoke(null, new Object[0]);
        j = ((Integer)obj2).intValue();
        b042504250425042504250425 = j;
_L5:
        obj2 = rrrrrr/plllpp.getMethod(nuuuuu.b0417041704170417041704170417("\215[_]\\[_]\\\u044C\u044C[_]\\[_]\\[_]\\", '\033', '\020', '\003'), new Class[] {
            com/visa/cbp/sdk/facade/data/TokenKey, com/visa/cbp/external/common/TokenInfo, Integer.TYPE, rrrrrr/rggrrr
        });
        tokenkey = ((TokenKey) (((Method) (obj2)).invoke(null, new Object[] {
            tokenkey, obj, Integer.valueOf(i), obj1
        })));
        tokenkey = (Boolean)tokenkey;
        return;
        tokenkey;
        throw tokenkey.getCause();
        tokenkey;
        throw tokenkey.getCause();
        tokenkey;
        throw tokenkey.getCause();
        tokenkey;
        throw tokenkey.getCause();
        tokenkey;
        throw tokenkey.getCause();
        tokenkey;
        throw tokenkey.getCause();
        tokenkey;
        throw tokenkey.getCause();
        tokenkey;
        throw tokenkey.getCause();
        tokenkey;
        throw tokenkey.getCause();
    }

    public static void reset()
    {
        int i = b042504250425042504250425;
        switch ((i * (b042504250425042504250425 + i)) % b041C041C041C041C041C041C)
        {
        default:
            b042504250425042504250425 = 92;
            b042504250425042504250425 = 57;
            break;

        case 0: // '\0'
            break;
        }
label0:
        do
        {
            if (((b042504250425042504250425 + b042504250425042504250425) * b042504250425042504250425) % b041C041C041C041C041C041C != b042504250425042504250425)
            {
                Object obj = com/visa/cbp/sdk/facade/VisaPaymentSDKImpl.getMethod(nuuuuu.b0417041704170417041704170417("\uFF84\u033E\uFF52\uFF56\uFF53\uFF65\u033E\u033E\u033E\u033E", 'J', '\004'), new Class[0]);
                InvocationTargetException invocationtargetexception;
                try
                {
                    obj = ((Method) (obj)).invoke(null, new Object[0]);
                }
                catch (InvocationTargetException invocationtargetexception1)
                {
                    throw invocationtargetexception1.getCause();
                }
                b042504250425042504250425 = ((Integer)obj).intValue();
                obj = com/visa/cbp/sdk/facade/VisaPaymentSDKImpl.getMethod(nuuuuu.b0417041704170417041704170417("\uFFA2\u035C\uFF70\uFF74\uFF71\uFF83\u035C\u035C\u035C\u035C", '\260', '\020', '\0'), new Class[0]);
                try
                {
                    obj = ((Method) (obj)).invoke(null, new Object[0]);
                }
                catch (InvocationTargetException invocationtargetexception2)
                {
                    throw invocationtargetexception2.getCause();
                }
                b042504250425042504250425 = ((Integer)obj).intValue();
            }
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
        obj = rrrrrr/llplll.getMethod(nuuuuu.b0417041704170417041704170417("\u0246\u0214\u0218\u0218\u021B\u062B\u0214\u0218\u0218\u021B\u062B\u062B\u0214\u0218\u0218\u021B", '\362', '\001'), new Class[0]);
        try
        {
            ((Method) (obj)).invoke(null, new Object[0]);
        }
        // Misplaced declaration of an exception variable
        catch (InvocationTargetException invocationtargetexception)
        {
            throw invocationtargetexception.getCause();
        }
        obj = rrrrrr/pllppl.getMethod(nuuuuu.b0417041704170417041704170417("\u014C\u011A\u011E\u011B\u012C\u0505\u011A\u011E\u011B\u012C\u011A\u011E\u011B\u012C\u011A\u011E\u011B\u012C\u011A\u011E\u011B\u012C", 'u', '\001'), new Class[0]);
        try
        {
            ((Method) (obj)).invoke(null, new Object[0]);
        }
        // Misplaced declaration of an exception variable
        catch (InvocationTargetException invocationtargetexception)
        {
            throw invocationtargetexception.getCause();
        }
        instance = null;
    }

    public void authenticate(AuthenticationParams authenticationparams, ResponseCallback responsecallback)
    {
        if (environment != null)
        {
            int i = b042504250425042504250425;
            int j = b042504250425042504250425;
            Object obj = com/visa/cbp/sdk/facade/VisaPaymentSDKImpl.getMethod(nuuuuu.b0417041704170417041704170417("8jnk\031jnk\031jnk\031\u0446\u0446\u0446", 'Z', '\002'), new Class[0]);
            try
            {
                obj = ((Method) (obj)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (AuthenticationParams authenticationparams)
            {
                throw authenticationparams.getCause();
            }
            switch (((j + i) * i) % ((Integer)obj).intValue())
            {
            default:
                Object obj1 = com/visa/cbp/sdk/facade/VisaPaymentSDKImpl.getMethod(nuuuuu.b0417041704170417041704170417("F\u0400\024\030\025'\u0400\u0400\u0400\u0400", '\026', '2', '\002'), new Class[0]);
                try
                {
                    obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
                }
                // Misplaced declaration of an exception variable
                catch (AuthenticationParams authenticationparams)
                {
                    throw authenticationparams.getCause();
                }
                b042504250425042504250425 = ((Integer)obj1).intValue();
                obj1 = com/visa/cbp/sdk/facade/VisaPaymentSDKImpl.getMethod(nuuuuu.b0417041704170417041704170417("\uFFA4\u035E\uFF72\uFF76\uFF73\uFF85\u035E\u035E\u035E\u035E", '_', '\003'), new Class[0]);
                try
                {
                    obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
                }
                // Misplaced declaration of an exception variable
                catch (AuthenticationParams authenticationparams)
                {
                    throw authenticationparams.getCause();
                }
                b042504250425042504250425 = ((Integer)obj1).intValue();
                // fall through

            case 0: // '\0'
                obj1 = rrrrrr/llpllp.getMethod(nuuuuu.b0417041704170417041704170417("\033\u03DA\u03DA\uFFE9\uFFED\uFFEB\uFFEA\uFFE9\uFFED\uFFEB\uFFEA\u03DA\uFFE9\uFFED\uFFEB\uFFEA\u03DA", '`', '\247', '\002'), new Class[] {
                    com/visa/cbp/sdk/facade/request/AuthenticationParams
                });
                break;
            }
            try
            {
                authenticationparams = ((AuthenticationParams) (((Method) (obj1)).invoke(null, new Object[] {
                    authenticationparams
                })));
            }
            // Misplaced declaration of an exception variable
            catch (AuthenticationParams authenticationparams)
            {
                throw authenticationparams.getCause();
            }
            authenticationparams = (AuthenticationRequest)authenticationparams;
            if (((b042504250425042504250425 + b042504250425042504250425) * b042504250425042504250425) % b041C041C041C041C041C041C != b042504250425042504250425)
            {
                obj1 = com/visa/cbp/sdk/facade/VisaPaymentSDKImpl.getMethod(nuuuuu.b0417041704170417041704170417("\uFFC5\u037F\uFF93\uFF97\uFF94\uFFA6\u037F\u037F\u037F\u037F", 'B', '[', '\0'), new Class[0]);
                try
                {
                    obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
                }
                // Misplaced declaration of an exception variable
                catch (AuthenticationParams authenticationparams)
                {
                    throw authenticationparams.getCause();
                }
                b042504250425042504250425 = ((Integer)obj1).intValue();
                obj1 = com/visa/cbp/sdk/facade/VisaPaymentSDKImpl.getMethod(nuuuuu.b0417041704170417041704170417("\362\u04AC\300\304\301\323\u04AC\u04AC\u04AC\u04AC", '\320', '@', '\002'), new Class[0]);
                try
                {
                    obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
                }
                // Misplaced declaration of an exception variable
                catch (AuthenticationParams authenticationparams)
                {
                    throw authenticationparams.getCause();
                }
                b042504250425042504250425 = ((Integer)obj1).intValue();
            }
            authenticationparams = new lpppll(authenticationparams, new nnlnnn(), responsecallback, settingsDao);
            responsecallback = rrrrrr/lpppll.getMethod(nuuuuu.b0417041704170417041704170417("\uFFBF\uFF8D\uFF91\uFF90\uFF8E\u038E\uFF8D\uFF91\uFF90\uFF8E\u038E\uFF8D\uFF91\uFF90\uFF8E\u038E", '\243', '\0'), new Class[0]);
            try
            {
                responsecallback.invoke(authenticationparams, new Object[0]);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (AuthenticationParams authenticationparams)
            {
                throw authenticationparams.getCause();
            }
        }
        authenticationparams = new SDKModeException("Network calls to Visa are only available in Flow 1.  Since the environment variable is not set, Flow 1 is not enabled within the SDK and Flow2 is assumed.  This method (or this specific overloaded version of this method) should not be called while in Flow 2 mode since you are responsible for all network traffic.");
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
        throw authenticationparams;
    }

    public void checkStatus(ResponseCallback responsecallback)
    {
        if (environment == null)
        {
            break MISSING_BLOCK_LABEL_335;
        }
        Object obj = com/visa/cbp/sdk/facade/VisaPaymentSDKImpl.getMethod(nuuuuu.b0417041704170417041704170417("0\u03EA\uFFFE\002\uFFFF\021\u03EA\u03EA\u03EA\u03EA", '\374', '\312', '\001'), new Class[0]);
        int i;
        int k;
        try
        {
            obj = ((Method) (obj)).invoke(null, new Object[0]);
        }
        // Misplaced declaration of an exception variable
        catch (ResponseCallback responsecallback)
        {
            throw responsecallback.getCause();
        }
        i = ((Integer)obj).intValue();
        k = b042504250425042504250425;
        obj = com/visa/cbp/sdk/facade/VisaPaymentSDKImpl.getMethod(nuuuuu.b0417041704170417041704170417("\266\u0470\204\210\205\227\u0470\u0470\u0470\u0470", '*', '\001'), new Class[0]);
        try
        {
            obj = ((Method) (obj)).invoke(null, new Object[0]);
        }
        // Misplaced declaration of an exception variable
        catch (ResponseCallback responsecallback)
        {
            throw responsecallback.getCause();
        }
        if ((((Integer)obj).intValue() * (k + i)) % b041C041C041C041C041C041C != b042504250425042504250425)
        {
            b042504250425042504250425 = 17;
            Object obj1 = com/visa/cbp/sdk/facade/VisaPaymentSDKImpl.getMethod(nuuuuu.b0417041704170417041704170417("\u0104\u04BE\322\326\323\345\u04BE\u04BE\u04BE\u04BE", 'Q', '\001'), new Class[0]);
            Method method;
            int j;
            try
            {
                obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (ResponseCallback responsecallback)
            {
                throw responsecallback.getCause();
            }
            b042504250425042504250425 = ((Integer)obj1).intValue();
        }
        try
        {
            obj1 = new nnnlnn();
        }
        // Misplaced declaration of an exception variable
        catch (ResponseCallback responsecallback)
        {
            throw responsecallback;
        }
        method = com/visa/cbp/sdk/facade/VisaPaymentSDKImpl.getMethod(nuuuuu.b0417041704170417041704170417("\u0163\u0168\u0165\u0163\u016B\u0153\u0174\u0161\u0174\u0175\u0173", '\200', '\001'), new Class[] {
            com/visa/cbp/sdk/facade/provider/ResponseCallback, com/visa/cbp/sdk/facade/provider/CheckStatusProvider
        });
        method.invoke(this, new Object[] {
            responsecallback, obj1
        });
        j = b042504250425042504250425;
        switch ((j * (b042504250425042504250425 + j)) % b041C041C041C041C041C041C)
        {
        default:
            responsecallback = com/visa/cbp/sdk/facade/VisaPaymentSDKImpl.getMethod(nuuuuu.b0417041704170417041704170417("\uFF54\u030E\uFF22\uFF26\uFF23\uFF35\u030E\u030E\u030E\u030E", 'Z', '\004'), new Class[0]);
            try
            {
                responsecallback = ((ResponseCallback) (responsecallback.invoke(null, new Object[0])));
            }
            // Misplaced declaration of an exception variable
            catch (ResponseCallback responsecallback)
            {
                throw responsecallback.getCause();
            }
            b042504250425042504250425 = ((Integer)responsecallback).intValue();
            responsecallback = com/visa/cbp/sdk/facade/VisaPaymentSDKImpl.getMethod(nuuuuu.b0417041704170417041704170417("\372\u04B4\310\314\311\333\u04B4\u04B4\u04B4\u04B4", 'L', '\001'), new Class[0]);
            try
            {
                responsecallback = ((ResponseCallback) (responsecallback.invoke(null, new Object[0])));
            }
            // Misplaced declaration of an exception variable
            catch (ResponseCallback responsecallback)
            {
                throw responsecallback.getCause();
            }
            b042504250425042504250425 = ((Integer)responsecallback).intValue();
            // fall through

        case 0: // '\0'
            return;
        }
        try
        {
            throw new SDKModeException("Network calls to Visa are only available in Flow 1.  Since the environment variable is not set, Flow 1 is not enabled within the SDK and Flow2 is assumed.  This method (or this specific overloaded version of this method) should not be called while in Flow 2 mode since you are responsible for all network traffic.: checkStatus(final ResponseCallback<Void, CbpError> checkStatusCallback)");
        }
        // Misplaced declaration of an exception variable
        catch (ResponseCallback responsecallback)
        {
            throw responsecallback;
        }
        responsecallback;
        throw responsecallback.getCause();
    }

    public void checkStatus(final ResponseCallback checkStatusCallback, CheckStatusProvider checkstatusprovider)
    {
        Object obj;
        Object obj2;
        int i;
        try
        {
            obj = tokenDao;
        }
        // Misplaced declaration of an exception variable
        catch (final ResponseCallback checkStatusCallback)
        {
            throw checkStatusCallback;
        }
        obj2 = rrrrrr/llpllp.getMethod(nuuuuu.b0417041704170417041704170417("\uFE78\uFE46\uFE4A\uFE48\uFE47\u0237\u0237\u0237\uFE46\uFE4A\uFE48\uFE47\uFE46\uFE4A\uFE48\uFE47\u0237", '\365', '\003'), new Class[] {
            rrrrrr/ppplpl
        });
        obj = ((Method) (obj2)).invoke(null, new Object[] {
            obj
        });
        obj = (CheckStatusRequest)obj;
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_272;
        }
        if (((b042504250425042504250425 + b042504250425042504250425) * b042504250425042504250425) % b041C041C041C041C041C041C != b042504250425042504250425)
        {
            i = b042504250425042504250425;
            switch ((i * (b042504250425042504250425 + i)) % b041C041C041C041C041C041C)
            {
            default:
                b042504250425042504250425 = 65;
                b042504250425042504250425 = 64;
                // fall through

            case 0: // '\0'
                obj2 = com/visa/cbp/sdk/facade/VisaPaymentSDKImpl.getMethod(nuuuuu.b0417041704170417041704170417("\uFE90\u024A\uFE5E\uFE62\uFE5F\uFE71\u024A\u024A\u024A\u024A", '\351', '\003'), new Class[0]);
                break;
            }
            Object obj1;
            Method method;
            try
            {
                obj2 = ((Method) (obj2)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (final ResponseCallback checkStatusCallback)
            {
                throw checkStatusCallback.getCause();
            }
            b042504250425042504250425 = ((Integer)obj2).intValue();
            b042504250425042504250425 = 96;
        }
        checkstatusprovider = new ggrrgg(appContext, checkstatusprovider, tokenDao);
        checkStatusCallback = new _cls1();
        obj2 = rrrrrr/ggrrgg.getMethod(nuuuuu.b0417041704170417041704170417("\u0323\u02F1\u02F5\u02F5\u0302\u02F1\u02F5\u02F5\u0302\u070B\u070B\u02F1\u02F5\u02F5\u0302\u02F1\u02F5\u02F5\u0302", '\353', '\006'), new Class[] {
            com/visa/cbp/external/aam/CheckStatusRequest, com/visa/cbp/sdk/facade/activeaccountmanagement/CheckStatusCallback
        });
        ((Method) (obj2)).invoke(checkstatusprovider, new Object[] {
            obj, checkStatusCallback
        });
        return;
        checkStatusCallback;
        throw checkStatusCallback.getCause();
        checkStatusCallback;
        throw checkStatusCallback.getCause();
label0:
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
                        break label0;

                    case 1: // '\001'
                        continue label0;
                    }
                }
                break;

            case 0: // '\0'
                break label0;

            case 1: // '\001'
                break;
            }
        } while (true);
        try
        {
            checkstatusprovider = SDKErrorType.TOKEN_KEY_INVALID;
            obj1 = ReasonCode.INVALID_INPUT_ERROR;
        }
        // Misplaced declaration of an exception variable
        catch (final ResponseCallback checkStatusCallback)
        {
            throw checkStatusCallback;
        }
        method = rrrrrr/lpplll.getMethod(nuuuuu.b0417041704170417041704170417("S\001\005\005\006\001\005\005\006\u0476\001\005\005\006\u0476\001\005\005\006", '1', '\002'), new Class[] {
            com/visa/cbp/sdk/facade/error/SDKErrorType, com/visa/cbp/sdk/facade/error/ReasonCode
        });
        checkstatusprovider = ((CheckStatusProvider) (method.invoke(null, new Object[] {
            checkstatusprovider, obj1
        })));
        checkstatusprovider = (CbpError)checkstatusprovider;
        obj1 = com/visa/cbp/sdk/facade/provider/ResponseCallback.getMethod(nuuuuu.b0417041704170417041704170417("\370\363\373\376\u0107\u0104\367", '\222', '\005'), new Class[] {
            com/visa/cbp/sdk/facade/error/CbpError
        });
        ((Method) (obj1)).invoke(checkStatusCallback, new Object[] {
            checkstatusprovider
        });
        return;
        checkStatusCallback;
        throw checkStatusCallback.getCause();
        checkStatusCallback;
        throw checkStatusCallback.getCause();
    }

    public void deleteAllTokensLocally()
    {
        if (((b042504250425042504250425 + b042504250425042504250425) * b042504250425042504250425) % b041C041C041C041C041C041C != b042504250425042504250425)
        {
            Object obj = com/visa/cbp/sdk/facade/VisaPaymentSDKImpl.getMethod(nuuuuu.b0417041704170417041704170417("\u0137\u04F1\u0105\u0109\u0106\u0118\u04F1\u04F1\u04F1\u04F1", 'G', '\006'), new Class[0]);
            Object obj1;
            Method method;
            int i;
            int j;
            int k;
            int l;
            int i1;
            try
            {
                obj = ((Method) (obj)).invoke(null, new Object[0]);
            }
            catch (InvocationTargetException invocationtargetexception)
            {
                throw invocationtargetexception.getCause();
            }
            b042504250425042504250425 = ((Integer)obj).intValue();
            b042504250425042504250425 = 37;
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
        try
        {
            obj = tokenDao;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            throw obj1;
        }
        method = rrrrrr/ppplpl.getMethod(nuuuuu.b0417041704170417041704170417("\005\uFFD3\uFFD7\uFFD4\uFFE5\uFFD3\uFFD7\uFFD4\uFFE5\u03BE\uFFD3\uFFD7\uFFD4\uFFE5\uFFD3\uFFD7\uFFD4\uFFE5\u03BE", '\207', '*', '\001'), new Class[0]);
        obj = method.invoke(obj, new Object[0]);
        ((Integer)obj).intValue();
        i = b042504250425042504250425;
        j = b042504250425042504250425;
        k = b042504250425042504250425;
        l = b041C041C041C041C041C041C;
        i1 = b042504250425042504250425;
        if (((i + j) * k) % l == i1)
        {
            break MISSING_BLOCK_LABEL_229;
        }
        try
        {
            b042504250425042504250425 = 74;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            throw obj1;
        }
        b042504250425042504250425 = 37;
        return;
        obj1;
        throw ((InvocationTargetException) (obj1)).getCause();
    }

    public void deleteToken(LcmParams lcmparams, ResponseCallback responsecallback)
    {
        Environment environment1;
        try
        {
            environment1 = environment;
        }
        // Misplaced declaration of an exception variable
        catch (LcmParams lcmparams)
        {
            throw lcmparams;
        }
        if (environment1 == null) goto _L2; else goto _L1
_L1:
        llnnnn llnnnn1;
        Method method;
        int i;
        int j;
        int k;
        try
        {
            llnnnn1 = new llnnnn();
        }
        // Misplaced declaration of an exception variable
        catch (LcmParams lcmparams)
        {
            throw lcmparams;
        }
        method = com/visa/cbp/sdk/facade/VisaPaymentSDKImpl.getMethod(nuuuuu.b0417041704170417041704170417("\uFF18\uFF19\uFF20\uFF19\uFF28\uFF19\uFF08\uFF23\uFF1F\uFF19\uFF22", '\246', '\003'), new Class[] {
            com/visa/cbp/sdk/facade/data/LcmParams, com/visa/cbp/sdk/facade/provider/ResponseCallback, com/visa/cbp/sdk/facade/provider/DeleteTokenProvider
        });
        method.invoke(this, new Object[] {
            lcmparams, responsecallback, llnnnn1
        });
        i = b042504250425042504250425;
        lcmparams = com/visa/cbp/sdk/facade/VisaPaymentSDKImpl.getMethod(nuuuuu.b0417041704170417041704170417("\uFFEA\u03A4\uFFB8\uFFBC\uFFB9\uFFCB\uFFB8\uFFBC\uFFB9\uFFCB\u03A4\u03A4\u03A4", '\257', '7', '\001'), new Class[0]);
        lcmparams = ((LcmParams) (lcmparams.invoke(null, new Object[0])));
        j = ((Integer)lcmparams).intValue();
        k = b041C041C041C041C041C041C;
        ((j + i) * i) % k;
        JVM INSTR tableswitch 0 0: default 160
    //                   0 377;
           goto _L3 _L4
_L3:
        lcmparams = com/visa/cbp/sdk/facade/VisaPaymentSDKImpl.getMethod(nuuuuu.b0417041704170417041704170417("\u0120\u04DA\356\362\357\u0101\u04DA\u04DA\u04DA\u04DA", '7', '\365', '\001'), new Class[0]);
        lcmparams = ((LcmParams) (lcmparams.invoke(null, new Object[0])));
        i = ((Integer)lcmparams).intValue();
        b042504250425042504250425 = i;
        lcmparams = com/visa/cbp/sdk/facade/VisaPaymentSDKImpl.getMethod(nuuuuu.b0417041704170417041704170417("\u0151\u050B\u011F\u0123\u0120\u0132\u050B\u050B\u050B\u050B", '\310', '\'', '\003'), new Class[0]);
        lcmparams = ((LcmParams) (lcmparams.invoke(null, new Object[0])));
        i = ((Integer)lcmparams).intValue();
        b042504250425042504250425 = i;
        return;
        lcmparams;
        throw lcmparams.getCause();
        lcmparams;
        throw lcmparams.getCause();
_L2:
label0:
        do
        {
            switch (1)
            {
            default:
                while (true) 
                {
                    if (((b042504250425042504250425 + b042504250425042504250425) * b042504250425042504250425) % b041C041C041C041C041C041C != b042504250425042504250425)
                    {
                        b042504250425042504250425 = 60;
                        b042504250425042504250425 = 98;
                    }
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
        throw new SDKModeException("Network calls to Visa are only available in Flow 1.  Since the environment variable is not set, Flow 1 is not enabled within the SDK and Flow2 is assumed.  This method (or this specific overloaded version of this method) should not be called while in Flow 2 mode since you are responsible for all network traffic.: deleteToken(LcmParams lcmParams, final ResponseCallback<TokenStatusResponse, TokenStatusError> deleteCallback)");
        lcmparams;
        throw lcmparams.getCause();
        lcmparams;
        throw lcmparams.getCause();
_L4:
    }

    public void deleteToken(LcmParams lcmparams, ResponseCallback responsecallback, DeleteTokenProvider deletetokenprovider)
    {
        Object obj = rrrrrr/pplpll.getMethod(nuuuuu.b0417041704170417041704170417("\032\uFFE8\uFFEC\uFFEB\uFFE9\u03E9\uFFE8\uFFEC\uFFEB\uFFE9\uFFE8\uFFEC\uFFEB\uFFE9\u03E9\u03E9", 'm', '%', '\001'), new Class[] {
            com/visa/cbp/sdk/facade/data/LcmParams
        });
        obj = ((Method) (obj)).invoke(null, new Object[] {
            lcmparams
        });
        obj = (TokenStatusError)obj;
        if (obj != null) goto _L2; else goto _L1
_L1:
        Method method;
        int i;
        int j;
        try
        {
            obj = tokenDao;
        }
        // Misplaced declaration of an exception variable
        catch (LcmParams lcmparams)
        {
            throw lcmparams;
        }
        method = rrrrrr/llpllp.getMethod(nuuuuu.b0417041704170417041704170417("5gcefgcef\u0476\u0476gcefgcef\u0476", 'W', '\002'), new Class[] {
            com/visa/cbp/sdk/facade/data/LcmParams, rrrrrr/ppplpl
        });
        lcmparams = ((LcmParams) (method.invoke(null, new Object[] {
            lcmparams, obj
        })));
        lcmparams = (LcmTokenRequest)lcmparams;
        try
        {
            deletetokenprovider = new ggrrgg(appContext, deletetokenprovider, tokenDao);
        }
        // Misplaced declaration of an exception variable
        catch (LcmParams lcmparams)
        {
            throw lcmparams;
        }
        obj = rrrrrr/ggrrgg.getMethod(nuuuuu.b0417041704170417041704170417("\u025A\u0642\u0228\u022C\u022C\u0239\u0642\u0228\u022C\u022C\u0239\u0228\u022C\u022C\u0239\u0228\u022C\u022C\u0239", '\250', '\006'), new Class[] {
            com/visa/cbp/external/lcm/LcmTokenRequest, com/visa/cbp/sdk/facade/provider/ResponseCallback
        });
        ((Method) (obj)).invoke(deletetokenprovider, new Object[] {
            lcmparams, responsecallback
        });
_L4:
        return;
_L2:
        i = b042504250425042504250425;
        j = b042504250425042504250425;
        lcmparams = com/visa/cbp/sdk/facade/VisaPaymentSDKImpl.getMethod(nuuuuu.b0417041704170417041704170417("G\025\021\024f\025\021\024f\025\021\024f\u0439\u0439\u0439", '%', '\002'), new Class[0]);
        try
        {
            lcmparams = ((LcmParams) (lcmparams.invoke(null, new Object[0])));
        }
        // Misplaced declaration of an exception variable
        catch (LcmParams lcmparams)
        {
            throw lcmparams.getCause();
        }
        switch (((j + i) * i) % ((Integer)lcmparams).intValue())
        {
        default:
            lcmparams = com/visa/cbp/sdk/facade/VisaPaymentSDKImpl.getMethod(nuuuuu.b0417041704170417041704170417("!\u03DB\uFFEF\uFFF3\uFFF0\002\u03DB\u03DB\u03DB\u03DB", '\031', '(', '\0'), new Class[0]);
            try
            {
                lcmparams = ((LcmParams) (lcmparams.invoke(null, new Object[0])));
            }
            // Misplaced declaration of an exception variable
            catch (LcmParams lcmparams)
            {
                throw lcmparams.getCause();
            }
            b042504250425042504250425 = ((Integer)lcmparams).intValue();
            lcmparams = com/visa/cbp/sdk/facade/VisaPaymentSDKImpl.getMethod(nuuuuu.b0417041704170417041704170417("\uFFFC\u03B6\uFFCA\uFFCE\uFFCB\uFFDD\u03B6\u03B6\u03B6\u03B6", '"', '\004'), new Class[0]);
            try
            {
                lcmparams = ((LcmParams) (lcmparams.invoke(null, new Object[0])));
            }
            // Misplaced declaration of an exception variable
            catch (LcmParams lcmparams)
            {
                throw lcmparams.getCause();
            }
            b042504250425042504250425 = ((Integer)lcmparams).intValue();
            // fall through

        case 0: // '\0'
            lcmparams = com/visa/cbp/sdk/facade/provider/ResponseCallback.getMethod(nuuuuu.b0417041704170417041704170417("\305\300\310\313\324\321\304", '\212', '+', '\002'), new Class[] {
                com/visa/cbp/sdk/facade/error/CbpError
            });
            break;
        }
        lcmparams.invoke(responsecallback, new Object[] {
            obj
        });
        if (((b042504250425042504250425 + b042504250425042504250425) * b042504250425042504250425) % b041C041C041C041C041C041C == b042504250425042504250425) goto _L4; else goto _L3
_L3:
        lcmparams = com/visa/cbp/sdk/facade/VisaPaymentSDKImpl.getMethod(nuuuuu.b0417041704170417041704170417("\u0326\u06E0\u02F4\u02F8\u02F5\u0307\u06E0\u06E0\u06E0\u06E0", '\354', '\006'), new Class[0]);
        try
        {
            lcmparams = ((LcmParams) (lcmparams.invoke(null, new Object[0])));
        }
        // Misplaced declaration of an exception variable
        catch (LcmParams lcmparams)
        {
            throw lcmparams.getCause();
        }
        b042504250425042504250425 = ((Integer)lcmparams).intValue();
        lcmparams = com/visa/cbp/sdk/facade/VisaPaymentSDKImpl.getMethod(nuuuuu.b0417041704170417041704170417("\uFE4C\u0206\uFE1A\uFE1E\uFE1B\uFE2D\u0206\u0206\u0206\u0206", '\262', '\004'), new Class[0]);
        try
        {
            lcmparams = ((LcmParams) (lcmparams.invoke(null, new Object[0])));
        }
        // Misplaced declaration of an exception variable
        catch (LcmParams lcmparams)
        {
            throw lcmparams.getCause();
        }
        b042504250425042504250425 = ((Integer)lcmparams).intValue();
        return;
        lcmparams;
        throw lcmparams.getCause();
        lcmparams;
        throw lcmparams.getCause();
        lcmparams;
        throw lcmparams.getCause();
        lcmparams;
        throw lcmparams.getCause();
    }

    public void deleteToken(LcmParams alcmparams[], ResponseCallback responsecallback)
    {
        if (environment == null)
        {
            break MISSING_BLOCK_LABEL_295;
        }
        llnnnn llnnnn1;
        int i;
        int j;
        int k;
        int l;
        try
        {
            llnnnn1 = new llnnnn();
        }
        // Misplaced declaration of an exception variable
        catch (LcmParams alcmparams[])
        {
            throw alcmparams;
        }
        i = b042504250425042504250425;
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
        j = b042504250425042504250425;
        k = b042504250425042504250425;
        l = b041C041C041C041C041C041C;
        if (((b042504250425042504250425 + b042504250425042504250425) * b042504250425042504250425) % b041C041C041C041C041C041C != b042504250425042504250425)
        {
            b042504250425042504250425 = 21;
            Object obj = com/visa/cbp/sdk/facade/VisaPaymentSDKImpl.getMethod(nuuuuu.b0417041704170417041704170417("\u015E\u0518\u012C\u0130\u012D\u013F\u0518\u0518\u0518\u0518", '\374', '\005'), new Class[0]);
            try
            {
                obj = ((Method) (obj)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (LcmParams alcmparams[])
            {
                throw alcmparams.getCause();
            }
            b042504250425042504250425 = ((Integer)obj).intValue();
        }
        if ((k * (i + j)) % l != b042504250425042504250425)
        {
            b042504250425042504250425 = 77;
            obj = com/visa/cbp/sdk/facade/VisaPaymentSDKImpl.getMethod(nuuuuu.b0417041704170417041704170417("\u0188\u0542\u0156\u015A\u0157\u0169\u0542\u0542\u0542\u0542", 'b', '\006'), new Class[0]);
            try
            {
                obj = ((Method) (obj)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (LcmParams alcmparams[])
            {
                throw alcmparams.getCause();
            }
            b042504250425042504250425 = ((Integer)obj).intValue();
        }
        obj = com/visa/cbp/sdk/facade/VisaPaymentSDKImpl.getMethod(nuuuuu.b0417041704170417041704170417("78?8G8'B>8A", ']', '0', '\001'), new Class[] {
            [Lcom/visa/cbp/sdk/facade/data/LcmParams;, com/visa/cbp/sdk/facade/provider/ResponseCallback, com/visa/cbp/sdk/facade/provider/DeleteTokenProvider
        });
        try
        {
            ((Method) (obj)).invoke(this, new Object[] {
                alcmparams, responsecallback, llnnnn1
            });
            return;
        }
        // Misplaced declaration of an exception variable
        catch (LcmParams alcmparams[]) { }
        // Misplaced declaration of an exception variable
        catch (LcmParams alcmparams[])
        {
            throw alcmparams;
        }
        throw alcmparams.getCause();
        alcmparams = new SDKModeException("Network calls to Visa are only available in Flow 1.  Since the environment variable is not set, Flow 1 is not enabled within the SDK and Flow2 is assumed.  This method (or this specific overloaded version of this method) should not be called while in Flow 2 mode since you are responsible for all network traffic.: deleteToken(LcmParams[] lcmParams, final ResponseCallback<TokenStatusResponse, TokenStatusError> deleteCallback)");
        throw alcmparams;
    }

    public void deleteToken(LcmParams alcmparams[], ResponseCallback responsecallback, DeleteTokenProvider deletetokenprovider)
    {
        throw new Runtime("d2j fail translate: java.lang.IndexOutOfBoundsException: fromIndex < 0: -1\n\tat java.util.BitSet.nextSetBit(BitSet.java:701)\n\tat com.googlecode.dex2jar.ir.ts.array.FillArrayTransformer.makeSureAllElementAreAssigned(FillArrayTransformer.java:505)\n\tat com.googlecode.dex2jar.ir.ts.array.FillArrayTransformer.transformReportChanged(FillArrayTransformer.java:123)\n\tat com.googlecode.dex2jar.ir.ts.StatedTransformer.transform(StatedTransformer.java:10)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:149)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
    }

    public void enableThm(boolean flag)
    {
        if (((b042504250425042504250425 + b042504250425042504250425) * b042504250425042504250425) % b041C041C041C041C041C041C != b042504250425042504250425)
        {
            b042504250425042504250425 = 35;
            b042504250425042504250425 = 87;
        }
        Object obj;
        InvocationTargetException invocationtargetexception;
        Method method;
        int i;
        int j;
        try
        {
            obj = settingsDao;
        }
        catch (Exception exception)
        {
            throw exception;
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
        method = rrrrrr/grrgrg.getMethod(nuuuuu.b0417041704170417041704170417("\u0174\u0539\u0539\u0142\u0146\u0144\u0149\u0142\u0146\u0144\u0149\u0539\u0539", '\211', '\001'), new Class[] {
            Boolean.TYPE
        });
        method.invoke(obj, new Object[] {
            Boolean.valueOf(flag)
        });
        i = b042504250425042504250425;
        obj = com/visa/cbp/sdk/facade/VisaPaymentSDKImpl.getMethod(nuuuuu.b0417041704170417041704170417("\uFF89\u0343\uFF57\uFF5B\uFF58\uFF6A\uFF57\uFF5B\uFF58\uFF6A\u0343\u0343\u0343", '\331', '\0'), new Class[0]);
        obj = ((Method) (obj)).invoke(null, new Object[0]);
        j = ((Integer)obj).intValue();
        obj = com/visa/cbp/sdk/facade/VisaPaymentSDKImpl.getMethod(nuuuuu.b0417041704170417041704170417("\uFF7B\uFF49\uFF4D\uFF4A\uFF5C\uFF49\uFF4D\uFF4A\uFF5C\uFF49\uFF4D\uFF4A\uFF5C\u0335\u0335\u0335", 'M', '\004'), new Class[0]);
        obj = ((Method) (obj)).invoke(null, new Object[0]);
        (i * (j + i)) % ((Integer)obj).intValue();
        JVM INSTR tableswitch 0 0: default 236
    //                   0 286;
           goto _L1 _L2
_L1:
        InvocationTargetException invocationtargetexception1;
        try
        {
            b042504250425042504250425 = 87;
        }
        catch (Exception exception1)
        {
            throw exception1;
        }
        obj = com/visa/cbp/sdk/facade/VisaPaymentSDKImpl.getMethod(nuuuuu.b0417041704170417041704170417("\236\u0458lpm\177\u0458\u0458\u0458\u0458", ',', 'h', '\001'), new Class[0]);
        obj = ((Method) (obj)).invoke(null, new Object[0]);
        i = ((Integer)obj).intValue();
        b042504250425042504250425 = i;
_L2:
        return;
        invocationtargetexception;
        throw invocationtargetexception.getCause();
        invocationtargetexception1;
        throw invocationtargetexception1.getCause();
        invocationtargetexception1;
        throw invocationtargetexception1.getCause();
        invocationtargetexception1;
        throw invocationtargetexception1.getCause();
    }

    public int getAccessTokenAdvancedWarningPercent()
    {
        Object obj = settingsDao;
        Method method = rrrrrr/grrgrg.getMethod(nuuuuu.b0417041704170417041704170417("\u0117\u04F5\u04F5\u04F5\345\351\351\345\345\351\351\345\345\351\351\345", '\265', '\005'), new Class[0]);
        int i;
        try
        {
            obj = method.invoke(obj, new Object[0]);
        }
        catch (InvocationTargetException invocationtargetexception)
        {
            throw invocationtargetexception.getCause();
        }
        i = ((Integer)obj).intValue();
        if (((b042504250425042504250425 + b042504250425042504250425) * b042504250425042504250425) % b041C041C041C041C041C041C != b042504250425042504250425)
        {
            Object obj1 = com/visa/cbp/sdk/facade/VisaPaymentSDKImpl.getMethod(nuuuuu.b0417041704170417041704170417("\u0124\u04DE\362\366\363\u0105\u04DE\u04DE\u04DE\u04DE", 'a', '\001'), new Class[0]);
            InvocationTargetException invocationtargetexception1;
            int j;
            int k;
            int l;
            try
            {
                obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
            }
            catch (InvocationTargetException invocationtargetexception2)
            {
                throw invocationtargetexception2.getCause();
            }
            b042504250425042504250425 = ((Integer)obj1).intValue();
            b042504250425042504250425 = 1;
        }
        j = b042504250425042504250425;
        k = b042504250425042504250425;
        l = b042504250425042504250425;
        obj1 = com/visa/cbp/sdk/facade/VisaPaymentSDKImpl.getMethod(nuuuuu.b0417041704170417041704170417("#\uFFF1\uFFF5\uFFF2\004\uFFF1\uFFF5\uFFF2\004\uFFF1\uFFF5\uFFF2\004\u03DD\u03DD\u03DD", '?', '\0'), new Class[0]);
        try
        {
            obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
        }
        // Misplaced declaration of an exception variable
        catch (InvocationTargetException invocationtargetexception1)
        {
            throw invocationtargetexception1.getCause();
        }
        if ((l * (j + k)) % ((Integer)obj1).intValue() != b042504250425042504250425)
        {
            obj1 = com/visa/cbp/sdk/facade/VisaPaymentSDKImpl.getMethod(nuuuuu.b0417041704170417041704170417("\u01F6\u05B0\u01C4\u01C8\u01C5\u01D7\u05B0\u05B0\u05B0\u05B0", '\312', '\001'), new Class[0]);
            try
            {
                obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (InvocationTargetException invocationtargetexception1)
            {
                throw invocationtargetexception1.getCause();
            }
            b042504250425042504250425 = ((Integer)obj1).intValue();
            obj1 = com/visa/cbp/sdk/facade/VisaPaymentSDKImpl.getMethod(nuuuuu.b0417041704170417041704170417("\uFFC1\u037B\uFF8F\uFF93\uFF90\uFFA2\u037B\u037B\u037B\u037B", '\326', '5', '\001'), new Class[0]);
            try
            {
                obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (InvocationTargetException invocationtargetexception1)
            {
                throw invocationtargetexception1.getCause();
            }
            b042504250425042504250425 = ((Integer)obj1).intValue();
        }
        if (i <= 0)
        {
            i = 10;
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
        return i;
    }

    public List getAllTokenData()
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
        if (((b042504250425042504250425 + b042504250425042504250425) * b042504250425042504250425) % b041C041C041C041C041C041C != b042504250425042504250425)
        {
            if (((b042504250425042504250425 + b042504250425042504250425) * b042504250425042504250425) % b041C041C041C041C041C041C != b042504250425042504250425)
            {
                Object obj = com/visa/cbp/sdk/facade/VisaPaymentSDKImpl.getMethod(nuuuuu.b0417041704170417041704170417("\u01FC\u05B6\u01CA\u01CE\u01CB\u01DD\u05B6\u05B6\u05B6\u05B6", '\306', '\324', '\003'), new Class[0]);
                InvocationTargetException invocationtargetexception;
                Method method;
                try
                {
                    obj = ((Method) (obj)).invoke(null, new Object[0]);
                }
                catch (InvocationTargetException invocationtargetexception1)
                {
                    throw invocationtargetexception1.getCause();
                }
                b042504250425042504250425 = ((Integer)obj).intValue();
                b042504250425042504250425 = 98;
            }
            b042504250425042504250425 = 14;
            obj = com/visa/cbp/sdk/facade/VisaPaymentSDKImpl.getMethod(nuuuuu.b0417041704170417041704170417("\342\u049C\260\264\261\303\u049C\u049C\u049C\u049C", '\200', '\002'), new Class[0]);
            try
            {
                obj = ((Method) (obj)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (InvocationTargetException invocationtargetexception)
            {
                throw invocationtargetexception.getCause();
            }
            b042504250425042504250425 = ((Integer)obj).intValue();
        }
        obj = tokenDao;
        method = rrrrrr/ppplpl.getMethod(nuuuuu.b0417041704170417041704170417("\uFF09\uFED7\uFEDB\uFED8\uFEE9\u02C2\u02C2\u02C2\u02C2\uFED7\uFEDB\uFED8\uFEE9", 's', '\004'), new Class[0]);
        try
        {
            obj = method.invoke(obj, new Object[0]);
        }
        // Misplaced declaration of an exception variable
        catch (InvocationTargetException invocationtargetexception)
        {
            throw invocationtargetexception.getCause();
        }
        return (List)obj;
    }

    public long getCheckStatusPeriod()
    {
        Object obj = settingsDao;
        Method method = rrrrrr/grrgrg.getMethod(nuuuuu.b0417041704170417041704170417("\u032C\u02FA\u02FE\u02FE\u02FA\u070A\u02FA\u02FE\u02FE\u02FA\u02FA\u02FE\u02FE\u02FA\u02FA\u02FE\u02FE\u02FA\u02FA\u02FE\u02FE\u02FA", '\356', '\006'), new Class[0]);
        long l;
        try
        {
            obj = method.invoke(obj, new Object[0]);
        }
        catch (InvocationTargetException invocationtargetexception)
        {
            throw invocationtargetexception.getCause();
        }
        l = ((Long)obj).longValue();
        if (((b042504250425042504250425 + b042504250425042504250425) * b042504250425042504250425) % b041C041C041C041C041C041C != b042504250425042504250425)
        {
            b042504250425042504250425 = 35;
            Object obj1 = com/visa/cbp/sdk/facade/VisaPaymentSDKImpl.getMethod(nuuuuu.b0417041704170417041704170417("\254\u0466z~{\215\u0466\u0466\u0466\u0466", 'J', '\005'), new Class[0]);
            try
            {
                obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
            }
            catch (InvocationTargetException invocationtargetexception1)
            {
                throw invocationtargetexception1.getCause();
            }
            b042504250425042504250425 = ((Integer)obj1).intValue();
        }
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
        if (((b042504250425042504250425 + b042504250425042504250425) * b042504250425042504250425) % b041C041C041C041C041C041C != b042504250425042504250425)
        {
            b042504250425042504250425 = 96;
            b042504250425042504250425 = 2;
        }
        if (l <= 0L)
        {
            return 0x15180L;
        } else
        {
            return l;
        }
    }

    public String getConversationId()
    {
        if (environment != null)
        {
            Object obj = rrrrrr/grgrgr.getMethod(nuuuuu.b0417041704170417041704170417("\u0245\u0213\u0217\u0215\u0225\u060E\u060E\u060E\u060E\u0213\u0217\u0215\u0225", '\241', '\006'), new Class[0]);
            Method method;
            int i;
            try
            {
                obj = ((Method) (obj)).invoke(null, new Object[0]);
            }
            catch (InvocationTargetException invocationtargetexception)
            {
                throw invocationtargetexception.getCause();
            }
            obj = new lppllp((Context)obj);
label0:
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
                            break label0;

                        case 1: // '\001'
                            continue label0;
                        }
                    }
                    break;

                case 0: // '\0'
                    break label0;

                case 1: // '\001'
                    break;
                }
            } while (true);
            i = b042504250425042504250425;
            switch ((i * (b042504250425042504250425 + i)) % b041C041C041C041C041C041C)
            {
            default:
                b042504250425042504250425 = 45;
                b042504250425042504250425 = 35;
                // fall through

            case 0: // '\0'
                method = rrrrrr/grrgrg.getMethod(nuuuuu.b0417041704170417041704170417("\u028D\u025B\u025F\u025D\u0262\u025B\u025F\u025D\u0262\u025B\u025F\u025D\u0262\u0652\u0652\u0652", '\271', '\006'), new Class[0]);
                break;
            }
            try
            {
                obj = method.invoke(obj, new Object[0]);
            }
            catch (InvocationTargetException invocationtargetexception1)
            {
                throw invocationtargetexception1.getCause();
            }
            obj = (rgrgrg)obj;
            if (obj != null)
            {
                Method method1 = rrrrrr/rgrgrg.getMethod(nuuuuu.b0417041704170417041704170417("\u032C\u02FA\u02FE\u02FC\u0301\u06F1\u06F1\u06F1\u02FA\u02FE\u02FC\u0301\u06F1", '\356', '\006'), new Class[0]);
                try
                {
                    obj = method1.invoke(obj, new Object[0]);
                }
                catch (InvocationTargetException invocationtargetexception2)
                {
                    throw invocationtargetexception2.getCause();
                }
                return (String)obj;
            }
        }
        return null;
    }

    public CvmMode getCvmVerificationMode()
    {
        Object obj = settingsDao;
        Method method = rrrrrr/grrgrg.getMethod(nuuuuu.b0417041704170417041704170417("\364\302\306\304\311\302\306\304\311\u04B9\u04B9\u04B9\u04B9", '\222', '\005'), new Class[0]);
        try
        {
            obj = method.invoke(obj, new Object[0]);
        }
        catch (InvocationTargetException invocationtargetexception)
        {
            throw invocationtargetexception.getCause();
        }
        return (CvmMode)obj;
    }

    public DeviceData getDeviceData()
    {
_L2:
        Object obj = java/lang/String.getMethod(nuuuuu.b0417041704170417041704170417("\u0148\u0141\u014A\u0143\u0150\u0144", 'n', '\001'), new Class[0]);
        obj = ((Method) (obj)).invoke(null, new Object[0]);
        ((Integer)obj).intValue();
        if (true) goto _L2; else goto _L1
_L1:
        0;
        JVM INSTR tableswitch 0 1: default 64
    //                   0 67
    //                   1 89;
           goto _L1 _L3 _L4
_L3:
        Object obj1;
        return ((DeviceData) (obj1));
        obj1;
        try
        {
            throw ((InvocationTargetException) (obj1)).getCause();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            b042504250425042504250425 = 47;
        }
        obj1 = new DeviceData();
_L4:
        1;
        JVM INSTR tableswitch 0 1: default 112
    //                   0 89
    //                   1 67;
           goto _L1 _L4 _L3
    }

    public int getMaxTvlRecords()
    {
        Object obj;
        int i;
        int k;
        int i1;
        try
        {
            i = b042504250425042504250425;
            k = b042504250425042504250425;
            i1 = b041C041C041C041C041C041C;
        }
        catch (Exception exception1)
        {
            throw exception1;
        }
        (i * (k + i)) % i1;
        JVM INSTR tableswitch 0 0: default 40
    //                   0 87;
           goto _L1 _L2
_L1:
        obj = com/visa/cbp/sdk/facade/VisaPaymentSDKImpl.getMethod(nuuuuu.b0417041704170417041704170417("\uFFA1\u035B\uFF6F\uFF73\uFF70\uFF82\u035B\u035B\u035B\u035B", '\301', '\0'), new Class[0]);
        obj = ((Method) (obj)).invoke(null, new Object[0]);
        int j = ((Integer)obj).intValue();
        Object obj1;
        Method method;
        int l;
        try
        {
            b042504250425042504250425 = j;
        }
        catch (Exception exception)
        {
            throw exception;
        }
        b042504250425042504250425 = 99;
_L2:
        if (((b042504250425042504250425 + b042504250425042504250425) * b042504250425042504250425) % b041C041C041C041C041C041C != b042504250425042504250425)
        {
            obj = com/visa/cbp/sdk/facade/VisaPaymentSDKImpl.getMethod(nuuuuu.b0417041704170417041704170417("\u0108\u04C2\326\332\327\351\u04C2\u04C2\u04C2\u04C2", '2', '\330', '\001'), new Class[0]);
            InvocationTargetException invocationtargetexception;
            try
            {
                obj = ((Method) (obj)).invoke(null, new Object[0]);
            }
            catch (InvocationTargetException invocationtargetexception1)
            {
                throw invocationtargetexception1.getCause();
            }
            b042504250425042504250425 = ((Integer)obj).intValue();
            obj = com/visa/cbp/sdk/facade/VisaPaymentSDKImpl.getMethod(nuuuuu.b0417041704170417041704170417("\u0152\u050C\u0120\u0124\u0121\u0133\u050C\u050C\u050C\u050C", 'x', '\001'), new Class[0]);
            try
            {
                obj = ((Method) (obj)).invoke(null, new Object[0]);
            }
            catch (InvocationTargetException invocationtargetexception2)
            {
                throw invocationtargetexception2.getCause();
            }
            b042504250425042504250425 = ((Integer)obj).intValue();
        }
        obj = settingsDao;
        method = rrrrrr/grrgrg.getMethod(nuuuuu.b0417041704170417041704170417("\uFDB6\uFD84\uFD88\uFD86\uFD8B\u017B\u017B\uFD84\uFD88\uFD86\uFD8B\u017B\u017B", '\344', '\004'), new Class[0]);
        obj = method.invoke(obj, new Object[0]);
        l = ((Integer)obj).intValue();
        j = l;
        if (l < 0)
        {
            j = 50;
        }
        return j;
        obj1;
        throw ((InvocationTargetException) (obj1)).getCause();
        obj1;
        throw obj1;
        invocationtargetexception;
        throw invocationtargetexception.getCause();
    }

    public TokenKey getSelectedCard()
    {
label0:
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
                        break label0;

                    case 1: // '\001'
                        continue label0;
                    }
                }
                break;

            case 0: // '\0'
                break label0;

            case 1: // '\001'
                break;
            }
        } while (true);
        Object obj;
        int i;
        try
        {
            obj = settingsDao;
        }
        catch (Exception exception)
        {
            throw exception;
        }
        i = b042504250425042504250425;
        switch ((i * (b042504250425042504250425 + i)) % b041C041C041C041C041C041C)
        {
        default:
            Object obj2 = com/visa/cbp/sdk/facade/VisaPaymentSDKImpl.getMethod(nuuuuu.b0417041704170417041704170417("\020\u03CA\uFFDE\uFFE2\uFFDF\uFFF1\u03CA\u03CA\u03CA\u03CA", ')', '\003'), new Class[0]);
            Object obj1;
            try
            {
                obj2 = ((Method) (obj2)).invoke(null, new Object[0]);
            }
            catch (InvocationTargetException invocationtargetexception)
            {
                throw invocationtargetexception.getCause();
            }
            b042504250425042504250425 = ((Integer)obj2).intValue();
            b042504250425042504250425 = 45;
            // fall through

        case 0: // '\0'
            obj2 = rrrrrr/grrgrg.getMethod(nuuuuu.b0417041704170417041704170417("l\u044A\u044A:>>::>>::>>::>>:", '\n', '\005'), new Class[0]);
            break;
        }
        obj = ((Method) (obj2)).invoke(obj, new Object[0]);
        return (TokenKey)obj;
        obj1;
        try
        {
            throw ((InvocationTargetException) (obj1)).getCause();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            throw obj1;
        }
    }

    public TokenData getTokenData(TokenKey tokenkey)
    {
        Object obj;
        if (tokenkey == null)
        {
            break MISSING_BLOCK_LABEL_343;
        }
        obj = com/visa/cbp/sdk/facade/data/TokenKey.getMethod(nuuuuu.b0417041704170417041704170417("dbqQlhbkFa", '\003', '\0'), new Class[0]);
        obj = ((Method) (obj)).invoke(tokenkey, new Object[0]);
        long l = ((Long)obj).longValue();
        if (((b042504250425042504250425 + b042504250425042504250425) * b042504250425042504250425) % b041C041C041C041C041C041C != b042504250425042504250425)
        {
            b042504250425042504250425 = 77;
            Object obj1 = com/visa/cbp/sdk/facade/VisaPaymentSDKImpl.getMethod(nuuuuu.b0417041704170417041704170417("\u0130\u04EA\376\u0102\377\u0111\u04EA\u04EA\u04EA\u04EA", '"', '\254', '\003'), new Class[0]);
            Object obj2;
            try
            {
                obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (TokenKey tokenkey)
            {
                throw tokenkey.getCause();
            }
            b042504250425042504250425 = ((Integer)obj1).intValue();
        }
        if (l <= 0L)
        {
            break MISSING_BLOCK_LABEL_343;
        }
        try
        {
            obj1 = tokenDao;
        }
        // Misplaced declaration of an exception variable
        catch (TokenKey tokenkey)
        {
            throw tokenkey;
        }
        if (((b042504250425042504250425 + b042504250425042504250425) * b042504250425042504250425) % b041C041C041C041C041C041C != b042504250425042504250425)
        {
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
            obj2 = com/visa/cbp/sdk/facade/VisaPaymentSDKImpl.getMethod(nuuuuu.b0417041704170417041704170417("\uFF74\u032E\uFF42\uFF46\uFF43\uFF55\u032E\u032E\u032E\u032E", '\356', '\0'), new Class[0]);
            try
            {
                obj2 = ((Method) (obj2)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (TokenKey tokenkey)
            {
                throw tokenkey.getCause();
            }
            b042504250425042504250425 = ((Integer)obj2).intValue();
            obj2 = com/visa/cbp/sdk/facade/VisaPaymentSDKImpl.getMethod(nuuuuu.b0417041704170417041704170417("\uFF6E\u0328\uFF3C\uFF40\uFF3D\uFF4F\u0328\u0328\u0328\u0328", 'z', '\003'), new Class[0]);
            try
            {
                obj2 = ((Method) (obj2)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (TokenKey tokenkey)
            {
                throw tokenkey.getCause();
            }
            b042504250425042504250425 = ((Integer)obj2).intValue();
        }
        obj2 = rrrrrr/ppplpl.getMethod(nuuuuu.b0417041704170417041704170417("\\*.+<*.+<*.+<*.+<*.+<\u0415", '\002', '\004'), new Class[] {
            com/visa/cbp/sdk/facade/data/TokenKey
        });
        tokenkey = ((TokenKey) (((Method) (obj2)).invoke(obj1, new Object[] {
            tokenkey
        })));
        return (TokenData)tokenkey;
        tokenkey;
        throw tokenkey.getCause();
        tokenkey;
        throw tokenkey.getCause();
        try
        {
            tokenkey = SDKErrorType.TOKEN_KEY_INVALID;
        }
        // Misplaced declaration of an exception variable
        catch (TokenKey tokenkey)
        {
            throw tokenkey;
        }
        obj1 = com/visa/cbp/sdk/facade/error/SDKErrorType.getMethod(nuuuuu.b0417041704170417041704170417("\220\216\235v\216\234\234\212\220\216", '\312', '\363', '\001'), new Class[0]);
        tokenkey = ((TokenKey) (((Method) (obj1)).invoke(tokenkey, new Object[0])));
        tokenkey = (String)tokenkey;
        throw new TokenKeyInvalidException(tokenkey);
        tokenkey;
        throw tokenkey.getCause();
    }

    public TokenData getTokenData(String s)
    {
        int i = b042504250425042504250425;
        switch ((i * (b042504250425042504250425 + i)) % b041C041C041C041C041C041C)
        {
        default:
            Object obj = com/visa/cbp/sdk/facade/VisaPaymentSDKImpl.getMethod(nuuuuu.b0417041704170417041704170417("\uFE9E\u0258\uFE6C\uFE70\uFE6D\uFE7F\u0258\u0258\u0258\u0258", '\342', '\003'), new Class[0]);
            Method method;
            int j;
            int k;
            int l;
            try
            {
                obj = ((Method) (obj)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw s.getCause();
            }
            b042504250425042504250425 = ((Integer)obj).intValue();
            b042504250425042504250425 = 67;
            j = b042504250425042504250425;
            k = b042504250425042504250425;
            l = b042504250425042504250425;
            obj = com/visa/cbp/sdk/facade/VisaPaymentSDKImpl.getMethod(nuuuuu.b0417041704170417041704170417("\316\234\230\235\357\234\230\235\357\234\230\235\357\u04B0\u04B0\u04B0", '\254', '\002'), new Class[0]);
            try
            {
                obj = ((Method) (obj)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw s.getCause();
            }
            if ((l * (j + k)) % ((Integer)obj).intValue() != b042504250425042504250425)
            {
                b042504250425042504250425 = 55;
                b042504250425042504250425 = 91;
            }
            // fall through

        case 0: // '\0'
            obj = rrrrrr/pplpll.getMethod(nuuuuu.b0417041704170417041704170417("\uFE49\u0218\u0218\u0218\uFE17\uFE1B\uFE1A\uFE18\u0218\u0218", '\263', '\004'), new Class[] {
                java/lang/String
            });
            break;
        }
        obj = ((Method) (obj)).invoke(null, new Object[] {
            s
        });
        if (((Boolean)obj).booleanValue())
        {
            break MISSING_BLOCK_LABEL_260;
        }
        try
        {
            obj = tokenDao;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw s;
        }
        method = rrrrrr/ppplpl.getMethod(nuuuuu.b0417041704170417041704170417("\uFF6D\u0326\u0326\u0326\u0326\u0326\uFF3B\uFF3F\uFF3C\uFF4D", '\376', '\t', '\001'), new Class[] {
            java/lang/String
        });
        s = ((String) (method.invoke(obj, new Object[] {
            s
        })));
        return (TokenData)s;
_L2:
        1;
        JVM INSTR tableswitch 0 1: default 284
    //                   0 260
    //                   1 311;
           goto _L1 _L2 _L3
_L1:
        1;
        JVM INSTR tableswitch 0 1: default 308
    //                   0 260
    //                   1 311;
           goto _L1 _L2 _L3
_L3:
        s = SDKErrorType.INVALID_INPUT_FOR_SPECIFIC_FIELD;
        obj = com/visa/cbp/sdk/facade/error/SDKErrorType.getMethod(nuuuuu.b0417041704170417041704170417("\362\360\341\330\360\346\346\364\362\360", '\225', '\002'), new Class[] {
            java/lang/String
        });
        s = ((String) (((Method) (obj)).invoke(s, new Object[] {
            "cardRefId"
        })));
        s = (String)s;
        try
        {
            throw new InvalidInputException(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw s;
        }
        s;
        throw s.getCause();
        s;
        throw s.getCause();
        s;
        throw s.getCause();
    }

    public String getTokenStatus(TokenKey tokenkey)
    {
_L2:
        Object obj = java/lang/String.getMethod(nuuuuu.b0417041704170417041704170417("\uFF1D\uFF16\uFF1F\uFF18\uFF25\uFF19", 'l', '\343', '\0'), new Class[0]);
        obj = ((Method) (obj)).invoke(null, new Object[0]);
        ((Integer)obj).intValue();
        if (true) goto _L2; else goto _L1
_L1:
        Object obj1;
        Object obj2;
_L6:
        obj1 = ((Method) (obj2)).invoke(obj1, new Object[0]);
        obj1 = (String)obj1;
        if (tokenkey == null) goto _L4; else goto _L3
_L3:
        obj2 = com/visa/cbp/sdk/facade/data/TokenKey.getMethod(nuuuuu.b0417041704170417041704170417("\uFF1B\uFF19\uFF28\uFF08\uFF23\uFF1F\uFF19\uFF22\uFEFD\uFF18", '\246', '\003'), new Class[0]);
        obj2 = ((Method) (obj2)).invoke(tokenkey, new Object[0]);
        if (((Long)obj2).longValue() <= 0L) goto _L4; else goto _L5
_L5:
        obj2 = tokenDao;
        Object obj3 = rrrrrr/ppplpl.getMethod(nuuuuu.b0417041704170417041704170417("\uFF00\u02B9\uFECE\uFED2\uFECF\uFEE0\uFECE\uFED2\uFECF\uFEE0\uFECE\uFED2\uFECF\uFEE0\uFECE\uFED2\uFECF\uFEE0\u02B9", '\261', '\003'), new Class[] {
            com/visa/cbp/sdk/facade/data/TokenKey
        });
        tokenkey = ((TokenKey) (((Method) (obj3)).invoke(obj2, new Object[] {
            tokenkey
        })));
        obj2 = (TokenInfo)tokenkey;
        tokenkey = ((TokenKey) (obj1));
        if (obj2 == null)
        {
            break MISSING_BLOCK_LABEL_344;
        }
        tokenkey = com/visa/cbp/external/common/TokenInfo.getMethod(nuuuuu.b0417041704170417041704170417("wu\204d\177{u~c\204q\204\205\203", '\b', '\001'), new Class[0]);
        tokenkey = ((TokenKey) (tokenkey.invoke(obj2, new Object[0])));
        obj2 = (Status)tokenkey;
        tokenkey = ((TokenKey) (obj1));
        if (obj2 == null)
        {
            break MISSING_BLOCK_LABEL_344;
        }
        tokenkey = com/visa/cbp/external/common/Status.getMethod(nuuuuu.b0417041704170417041704170417("a_nMn[nom", '\002', '\004'), new Class[0]);
        obj3 = tokenkey.invoke(obj2, new Object[0]);
        tokenkey = ((TokenKey) (obj1));
        if ((String)obj3 == null)
        {
            break MISSING_BLOCK_LABEL_344;
        }
        tokenkey = com/visa/cbp/external/common/Status.getMethod(nuuuuu.b0417041704170417041704170417("\u018B\u0189\u0198\u0177\u0198\u0185\u0198\u0199\u0197", '\222', '\001'), new Class[0]);
        tokenkey = ((TokenKey) (tokenkey.invoke(obj2, new Object[0])));
        tokenkey = (String)tokenkey;
        return tokenkey;
        tokenkey;
        throw tokenkey.getCause();
        tokenkey;
        throw tokenkey.getCause();
        obj1;
        try
        {
            throw ((InvocationTargetException) (obj1)).getCause();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            obj1 = com/visa/cbp/sdk/facade/VisaPaymentSDKImpl.getMethod(nuuuuu.b0417041704170417041704170417("3\u044Dae`\022\u044D\u044D\u044D\u044D", 'Q', '\002'), new Class[0]);
            try
            {
                obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (TokenKey tokenkey)
            {
                throw tokenkey.getCause();
            }
            b042504250425042504250425 = ((Integer)obj1).intValue();
            try
            {
                obj1 = TokenStatus.NOT_FOUND;
            }
            // Misplaced declaration of an exception variable
            catch (TokenKey tokenkey)
            {
                throw tokenkey;
            }
            obj2 = com/visa/cbp/sdk/facade/data/TokenStatus.getMethod(nuuuuu.b0417041704170417041704170417("\u013F\u013D\u014C\u012E\u0139\u0144\u014D\u013D", 'H', '\006'), new Class[0]);
        }
        if (true) goto _L6; else goto _L4
        tokenkey;
        try
        {
            throw tokenkey.getCause();
        }
        // Misplaced declaration of an exception variable
        catch (TokenKey tokenkey)
        {
            throw tokenkey;
        }
        tokenkey;
        throw tokenkey.getCause();
_L4:
        tokenkey = SDKErrorType.TOKEN_KEY_INVALID;
        obj1 = com/visa/cbp/sdk/facade/error/SDKErrorType.getMethod(nuuuuu.b0417041704170417041704170417("86E\0366DD286", '/', '\0'), new Class[0]);
        tokenkey = ((TokenKey) (((Method) (obj1)).invoke(tokenkey, new Object[0])));
        tokenkey = (String)tokenkey;
        throw new TokenKeyInvalidException(tokenkey);
        tokenkey;
        throw tokenkey.getCause();
        tokenkey;
        throw tokenkey.getCause();
        tokenkey;
        throw tokenkey.getCause();
    }

    public List getTvlLog(TokenKey tokenkey)
    {
        if (tokenkey != null)
        {
            Object obj = com/visa/cbp/sdk/facade/data/TokenKey.getMethod(nuuuuu.b0417041704170417041704170417("\u032E\u032C\u033B\u031B\u0336\u0332\u032C\u0335\u0310\u032B", '\355', '\006'), new Class[0]);
            try
            {
                obj = ((Method) (obj)).invoke(tokenkey, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (TokenKey tokenkey)
            {
                throw tokenkey.getCause();
            }
            if (((Long)obj).longValue() > 0L)
            {
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
                Object obj1 = tvlDao;
                int i = b042504250425042504250425;
                Object obj2 = com/visa/cbp/sdk/facade/VisaPaymentSDKImpl.getMethod(nuuuuu.b0417041704170417041704170417("\u01B9\u0573\u0187\u018B\u0188\u019A\u0187\u018B\u0188\u019A\u0573\u0573\u0573", 'z', '\335', '\003'), new Class[0]);
                int j;
                int k;
                try
                {
                    obj2 = ((Method) (obj2)).invoke(null, new Object[0]);
                }
                // Misplaced declaration of an exception variable
                catch (TokenKey tokenkey)
                {
                    throw tokenkey.getCause();
                }
                j = ((Integer)obj2).intValue();
                obj2 = com/visa/cbp/sdk/facade/VisaPaymentSDKImpl.getMethod(nuuuuu.b0417041704170417041704170417("\uFF69\uFF37\uFF3B\uFF38\uFF4A\uFF37\uFF3B\uFF38\uFF4A\uFF37\uFF3B\uFF38\uFF4A\u0323\u0323\u0323", 'S', '\004'), new Class[0]);
                try
                {
                    obj2 = ((Method) (obj2)).invoke(null, new Object[0]);
                }
                // Misplaced declaration of an exception variable
                catch (TokenKey tokenkey)
                {
                    throw tokenkey.getCause();
                }
                k = ((Integer)obj2).intValue();
                if (((b042504250425042504250425 + b042504250425042504250425) * b042504250425042504250425) % b041C041C041C041C041C041C != b042504250425042504250425)
                {
                    Object obj3 = com/visa/cbp/sdk/facade/VisaPaymentSDKImpl.getMethod(nuuuuu.b0417041704170417041704170417("\244\u04DA\366\362\367\205\u04DA\u04DA\u04DA\u04DA", '\306', '\002'), new Class[0]);
                    try
                    {
                        obj3 = ((Method) (obj3)).invoke(null, new Object[0]);
                    }
                    // Misplaced declaration of an exception variable
                    catch (TokenKey tokenkey)
                    {
                        throw tokenkey.getCause();
                    }
                    b042504250425042504250425 = ((Integer)obj3).intValue();
                    b042504250425042504250425 = 65;
                }
                switch ((i * (j + i)) % k)
                {
                default:
                    obj3 = com/visa/cbp/sdk/facade/VisaPaymentSDKImpl.getMethod(nuuuuu.b0417041704170417041704170417("\u0183\u053D\u0151\u0155\u0152\u0164\u053D\u053D\u053D\u053D", 'j', '\267', '\003'), new Class[0]);
                    try
                    {
                        obj3 = ((Method) (obj3)).invoke(null, new Object[0]);
                    }
                    // Misplaced declaration of an exception variable
                    catch (TokenKey tokenkey)
                    {
                        throw tokenkey.getCause();
                    }
                    b042504250425042504250425 = ((Integer)obj3).intValue();
                    b042504250425042504250425 = 11;
                    // fall through

                case 0: // '\0'
                    obj3 = rrrrrr/llplpp.getMethod(nuuuuu.b0417041704170417041704170417("\u01F2\u05AF\u05AF\u01C0\u01C4\u01C1\u01D6\u05AF\u05AF\u01C0\u01C4\u01C1\u01D6", '\323', '\275', '\003'), new Class[] {
                        com/visa/cbp/sdk/facade/data/TokenKey
                    });
                    break;
                }
                try
                {
                    tokenkey = ((TokenKey) (((Method) (obj3)).invoke(obj1, new Object[] {
                        tokenkey
                    })));
                }
                // Misplaced declaration of an exception variable
                catch (TokenKey tokenkey)
                {
                    throw tokenkey.getCause();
                }
                return (List)tokenkey;
            }
        }
        tokenkey = SDKErrorType.TOKEN_KEY_INVALID;
        obj1 = com/visa/cbp/sdk/facade/error/SDKErrorType.getMethod(nuuuuu.b0417041704170417041704170417("\375\373\u010A\343\373\u0109\u0109\367\375\373", '2', '\006'), new Class[0]);
        try
        {
            tokenkey = ((TokenKey) (((Method) (obj1)).invoke(tokenkey, new Object[0])));
        }
        // Misplaced declaration of an exception variable
        catch (TokenKey tokenkey)
        {
            throw tokenkey.getCause();
        }
        throw new TokenKeyInvalidException((String)tokenkey);
    }

    public grrgrr getVcpcsProcessor()
    {
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
        int i = b042504250425042504250425;
        Object obj = com/visa/cbp/sdk/facade/VisaPaymentSDKImpl.getMethod(nuuuuu.b0417041704170417041704170417("\346\u04A0\264\270\265\307\264\270\265\307\u04A0\u04A0\u04A0", '3', '\267', '\001'), new Class[0]);
        int j;
        int k;
        int l;
        try
        {
            obj = ((Method) (obj)).invoke(null, new Object[0]);
        }
        catch (InvocationTargetException invocationtargetexception)
        {
            throw invocationtargetexception.getCause();
        }
        j = ((Integer)obj).intValue();
        k = b042504250425042504250425;
        l = b041C041C041C041C041C041C;
        obj = com/visa/cbp/sdk/facade/VisaPaymentSDKImpl.getMethod(nuuuuu.b0417041704170417041704170417("\326\244\250\245\267\244\250\245\267\u0490\u0490\u0490\u0490", 't', '\005'), new Class[0]);
        try
        {
            obj = ((Method) (obj)).invoke(null, new Object[0]);
        }
        catch (InvocationTargetException invocationtargetexception1)
        {
            throw invocationtargetexception1.getCause();
        }
        if (((j + i) * k) % l != ((Integer)obj).intValue())
        {
            Object obj1 = com/visa/cbp/sdk/facade/VisaPaymentSDKImpl.getMethod(nuuuuu.b0417041704170417041704170417("\031\u03D3\uFFE7\uFFEB\uFFE8\uFFFA\u03D3\u03D3\u03D3\u03D3", '\312', '\201', '\001'), new Class[0]);
            try
            {
                obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
            }
            catch (InvocationTargetException invocationtargetexception2)
            {
                throw invocationtargetexception2.getCause();
            }
            b042504250425042504250425 = ((Integer)obj1).intValue();
            b042504250425042504250425 = 7;
        }
        return vcpcsProcessor;
    }

    public boolean isCvmVerified()
    {
        Object obj;
        InvocationTargetException invocationtargetexception;
        Method method;
        try
        {
            obj = settingsDao;
        }
        catch (Exception exception)
        {
            throw exception;
        }
        method = rrrrrr/grrgrg.getMethod(nuuuuu.b0417041704170417041704170417("t&\"$!\u0431&\"$!\u0431\u0431\u0431", '\026', '\002'), new Class[0]);
        obj = method.invoke(obj, new Object[0]);
        return ((Boolean)obj).booleanValue();
        invocationtargetexception;
        throw invocationtargetexception.getCause();
    }

    public boolean isThmEnabled()
    {
        Object obj;
        Object obj1;
        Object obj2;
        int i;
        int j;
        int k;
        try
        {
            obj = settingsDao;
        }
        catch (Exception exception)
        {
            throw exception;
        }
        obj2 = com/visa/cbp/sdk/facade/VisaPaymentSDKImpl.getMethod(nuuuuu.b0417041704170417041704170417("\uFFEE\u03A8\uFFBC\uFFC0\uFFBD\uFFCF\u03A8\u03A8\u03A8\u03A8", 't', '\0'), new Class[0]);
        obj2 = ((Method) (obj2)).invoke(null, new Object[0]);
        i = ((Integer)obj2).intValue();
        j = b042504250425042504250425;
        if (((b042504250425042504250425 + b042504250425042504250425) * b042504250425042504250425) % b041C041C041C041C041C041C != b042504250425042504250425)
        {
            b042504250425042504250425 = 8;
            obj2 = com/visa/cbp/sdk/facade/VisaPaymentSDKImpl.getMethod(nuuuuu.b0417041704170417041704170417("\uFF72\u032C\uFF40\uFF44\uFF41\uFF53\u032C\u032C\u032C\u032C", 'P', '\004'), new Class[0]);
            try
            {
                obj2 = ((Method) (obj2)).invoke(null, new Object[0]);
            }
            catch (InvocationTargetException invocationtargetexception)
            {
                throw invocationtargetexception.getCause();
            }
            b042504250425042504250425 = ((Integer)obj2).intValue();
        }
        try
        {
            k = b041C041C041C041C041C041C;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            throw obj1;
        }
        ((i + j) * i) % k;
        JVM INSTR tableswitch 0 0: default 144
    //                   0 193;
           goto _L1 _L2
_L1:
        b042504250425042504250425 = 53;
        obj2 = com/visa/cbp/sdk/facade/VisaPaymentSDKImpl.getMethod(nuuuuu.b0417041704170417041704170417("\uFFA4\u035E\uFF72\uFF76\uFF73\uFF85\u035E\u035E\u035E\u035E", '\366', '8', '\001'), new Class[0]);
        obj2 = ((Method) (obj2)).invoke(null, new Object[0]);
        i = ((Integer)obj2).intValue();
        b042504250425042504250425 = i;
_L2:
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
        obj2 = rrrrrr/grrgrg.getMethod(nuuuuu.b0417041704170417041704170417("\u01BE\u018C\u0190\u018E\u0193\u0583\u018C\u0190\u018E\u0193\u018C\u0190\u018E\u0193\u0583\u0583", 't', '\006'), new Class[0]);
        obj = ((Method) (obj2)).invoke(obj, new Object[0]);
        return ((Boolean)obj).booleanValue();
        obj1;
        throw ((InvocationTargetException) (obj1)).getCause();
        obj1;
        throw ((InvocationTargetException) (obj1)).getCause();
        obj1;
        throw ((InvocationTargetException) (obj1)).getCause();
    }

    public ApduResponse processCommandApdu(byte abyte0[], Bundle bundle, boolean flag)
    {
        int i = 4;
        grrgrr grrgrr1;
        Method method;
        int j;
        try
        {
            grrgrr1 = vcpcsProcessor;
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new PaywaveException(abyte0.getMessage(), abyte0);
        }
        method = rrrrrr/grrgrr.getMethod(nuuuuu.b0417041704170417041704170417("yGKJMGKJM\u044DGKJM\u044D\u044D", '\275', '\324', '\001'), new Class[] {
            [B, android/os/Bundle, Boolean.TYPE
        });
        abyte0 = ((byte []) (method.invoke(grrgrr1, new Object[] {
            abyte0, bundle, Boolean.valueOf(flag)
        })));
        bundle = (byte[])abyte0;
        if (bundle.length != 2) goto _L2; else goto _L1
_L1:
        i /= 0;
        j = b042504250425042504250425;
        abyte0 = com/visa/cbp/sdk/facade/VisaPaymentSDKImpl.getMethod(nuuuuu.b0417041704170417041704170417("\b\u0476Z^[)Z^[)\u0476\u0476\u0476", 'j', '\002'), new Class[0]);
        try
        {
            abyte0 = ((byte []) (abyte0.invoke(null, new Object[0])));
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw abyte0.getCause();
        }
        switch (((((Integer)abyte0).intValue() + j) * j) % b041C041C041C041C041C041C)
        {
        case 0: // '\0'
            if (false)
            {
            }
            break;

        default:
            abyte0 = com/visa/cbp/sdk/facade/VisaPaymentSDKImpl.getMethod(nuuuuu.b0417041704170417041704170417("}\u0437KOL^\u0437\u0437\u0437\u0437", '\t', '\006'), new Class[0]);
            Object obj;
            Method method1;
            try
            {
                abyte0 = ((byte []) (abyte0.invoke(null, new Object[0])));
            }
            // Misplaced declaration of an exception variable
            catch (byte abyte0[])
            {
                throw abyte0.getCause();
            }
            b042504250425042504250425 = ((Integer)abyte0).intValue();
            b042504250425042504250425 = 14;
            break;
        }
        if (true) goto _L1; else goto _L3
_L3:
        abyte0;
        throw abyte0.getCause();
        abyte0;
        b042504250425042504250425 = 97;
        abyte0 = lpllpp.b044604460446044604460446;
        obj = com/visa/cbp/sdk/facade/VisaPaymentSDKImpl.getDeclaredMethod(nuuuuu.b0417041704170417041704170417("\u0175\u0186\u0186\u0175\u018D\u0157\u0183\u0181\u0184\u0175\u0186\u0179", '\311', 'K', '\003'), new Class[] {
            [B, Integer.TYPE, [B, Integer.TYPE, Integer.TYPE
        });
        try
        {
            abyte0 = ((byte []) (((Method) (obj)).invoke(null, new Object[] {
                bundle, Integer.valueOf(0), abyte0, Integer.valueOf(0), Integer.valueOf(2)
            })));
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw abyte0.getCause();
        }
        if (!((Boolean)abyte0).booleanValue()) goto _L2; else goto _L4
_L4:
        abyte0 = SDKErrorType.CVM_VERIFICATION_REQUIRED;
        obj = ReasonCode.VERIFICATION_ERROR;
        method1 = rrrrrr/lpplll.getMethod(nuuuuu.b0417041704170417041704170417("tBFFIBFFI\u0459BFFI\u0459BFFI", '\t', '\001'), new Class[] {
            com/visa/cbp/sdk/facade/error/SDKErrorType, com/visa/cbp/sdk/facade/error/ReasonCode
        });
        try
        {
            abyte0 = ((byte []) (method1.invoke(null, new Object[] {
                abyte0, obj
            })));
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw abyte0.getCause();
        }
        abyte0 = (CbpError)abyte0;
_L6:
        abyte0 = new ApduResponse(bundle, abyte0);
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
        return abyte0;
_L2:
        abyte0 = null;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public boolean processTransactionComplete(TokenKey tokenkey)
    {
        Object obj;
        int i;
        int j;
        int k;
        int l;
        int i1;
        boolean flag;
        try
        {
            i = b042504250425042504250425;
        }
        // Misplaced declaration of an exception variable
        catch (TokenKey tokenkey)
        {
            throw tokenkey;
        }
        obj = com/visa/cbp/sdk/facade/VisaPaymentSDKImpl.getMethod(nuuuuu.b0417041704170417041704170417("\uFF58\u0312\uFF26\uFF2A\uFF27\uFF39\uFF26\uFF2A\uFF27\uFF39\u0312\u0312\u0312", '\275', 'M', '\0'), new Class[0]);
        obj = ((Method) (obj)).invoke(null, new Object[0]);
        j = ((Integer)obj).intValue();
        k = b042504250425042504250425;
        l = b041C041C041C041C041C041C;
        i1 = b042504250425042504250425;
        if (((j + i) * k) % l == i1)
        {
            break MISSING_BLOCK_LABEL_124;
        }
        try
        {
            b042504250425042504250425 = 24;
        }
        // Misplaced declaration of an exception variable
        catch (TokenKey tokenkey)
        {
            throw tokenkey;
        }
        obj = com/visa/cbp/sdk/facade/VisaPaymentSDKImpl.getMethod(nuuuuu.b0417041704170417041704170417("\uFF71\u032B\uFF3F\uFF43\uFF40\uFF52\u032B\u032B\u032B\u032B", 'S', '\236', '\0'), new Class[0]);
        obj = ((Method) (obj)).invoke(null, new Object[0]);
        i = ((Integer)obj).intValue();
        b042504250425042504250425 = i;
        obj = rrrrrr/plllpp.getMethod(nuuuuu.b0417041704170417041704170417("\u01A5\u0173\u0177\u0174\u0178\u0173\u0177\u0174\u0178\u0558\u0173\u0177\u0174\u0178\u0558\u0558\u0558", 'I', '\372', '\003'), new Class[] {
            com/visa/cbp/sdk/facade/data/TokenKey
        });
        tokenkey = ((TokenKey) (((Method) (obj)).invoke(null, new Object[] {
            tokenkey
        })));
        flag = ((Boolean)tokenkey).booleanValue();
label0:
        do
        {
            switch (1)
            {
            default:
                while (true) 
                {
                    i = b042504250425042504250425;
                    tokenkey = com/visa/cbp/sdk/facade/VisaPaymentSDKImpl.getMethod(nuuuuu.b0417041704170417041704170417("\u021B\u05D5\u01E9\u01ED\u01EA\u01FC\u01E9\u01ED\u01EA\u01FC\u05D5\u05D5\u05D5", '\223', '\006'), new Class[0]);
                    try
                    {
                        tokenkey = ((TokenKey) (tokenkey.invoke(null, new Object[0])));
                    }
                    // Misplaced declaration of an exception variable
                    catch (TokenKey tokenkey)
                    {
                        throw tokenkey.getCause();
                    }
                    j = ((Integer)tokenkey).intValue();
                    k = b042504250425042504250425;
                    l = b041C041C041C041C041C041C;
                    tokenkey = com/visa/cbp/sdk/facade/VisaPaymentSDKImpl.getMethod(nuuuuu.b0417041704170417041704170417("\uFF30\uFEFE\uFF02\uFEFF\uFF11\uFEFE\uFF02\uFEFF\uFF11\u02EA\u02EA\u02EA\u02EA", 'z', '\270', '\0'), new Class[0]);
                    try
                    {
                        tokenkey = ((TokenKey) (tokenkey.invoke(null, new Object[0])));
                    }
                    // Misplaced declaration of an exception variable
                    catch (TokenKey tokenkey)
                    {
                        throw tokenkey.getCause();
                    }
                    if (((j + i) * k) % l != ((Integer)tokenkey).intValue())
                    {
                        b042504250425042504250425 = 77;
                        tokenkey = com/visa/cbp/sdk/facade/VisaPaymentSDKImpl.getMethod(nuuuuu.b0417041704170417041704170417("\uFDF5\u01AF\uFDC3\uFDC7\uFDC4\uFDD6\u01AF\u01AF\u01AF\u01AF", '\317', '\004'), new Class[0]);
                        try
                        {
                            tokenkey = ((TokenKey) (tokenkey.invoke(null, new Object[0])));
                        }
                        // Misplaced declaration of an exception variable
                        catch (TokenKey tokenkey)
                        {
                            throw tokenkey.getCause();
                        }
                        b042504250425042504250425 = ((Integer)tokenkey).intValue();
                    }
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
        return flag;
        tokenkey;
        throw tokenkey.getCause();
        tokenkey;
        throw tokenkey.getCause();
        tokenkey;
        throw tokenkey.getCause();
    }

    public void provisionToken(ResponseCallback responsecallback, TokenProvider tokenprovider)
    {
        if (environment == null)
        {
            ProvisionTokenParams provisiontokenparams = new ProvisionTokenParams(null, null);
            Method method = com/visa/cbp/sdk/facade/VisaPaymentSDKImpl.getMethod(nuuuuu.b0417041704170417041704170417("y{f\177`z`fg]fblg", '\t', '\002'), new Class[] {
                com/visa/cbp/sdk/facade/request/ProvisionTokenParams, com/visa/cbp/sdk/facade/provider/ResponseCallback, com/visa/cbp/sdk/facade/provider/TokenProvider
            });
            try
            {
                method.invoke(this, new Object[] {
                    provisiontokenparams, responsecallback, tokenprovider
                });
                return;
            }
            // Misplaced declaration of an exception variable
            catch (ResponseCallback responsecallback)
            {
                throw responsecallback.getCause();
            }
        } else
        {
            throw new SDKModeException("Network calls outside of Visa are only available in Flow 2.  Since the environment variable is set, Flow 2 is not enabled and Flow 1 is assumed.  This method (or this specific overloaded version of this method) should not be called while in Flow 1 mode since Visa is responsible for all network traffic from the SDK.: provisionToken(ResponseCallback<ProvisionTokenResponse, CbpError> enrollAndProvisionCallback,TokenProvider tokenProvider)");
        }
    }

    public void provisionToken(ProvisionTokenParams provisiontokenparams, ResponseCallback responsecallback)
    {
        Object obj;
        int i;
        int j;
        int k;
        int l;
        int i1;
        int j1;
        try
        {
            obj = environment;
        }
        // Misplaced declaration of an exception variable
        catch (ProvisionTokenParams provisiontokenparams)
        {
            throw provisiontokenparams;
        }
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_329;
        }
        i = b042504250425042504250425;
        j = b042504250425042504250425;
        k = b042504250425042504250425;
        l = b041C041C041C041C041C041C;
        obj = com/visa/cbp/sdk/facade/VisaPaymentSDKImpl.getMethod(nuuuuu.b0417041704170417041704170417("y+/*X+/*X\u0407\u0407\u0407\u0407", '\033', '\002'), new Class[0]);
        try
        {
            obj = ((Method) (obj)).invoke(null, new Object[0]);
        }
        // Misplaced declaration of an exception variable
        catch (ProvisionTokenParams provisiontokenparams)
        {
            throw provisiontokenparams.getCause();
        }
        i1 = ((Integer)obj).intValue();
        obj = com/visa/cbp/sdk/facade/VisaPaymentSDKImpl.getMethod(nuuuuu.b0417041704170417041704170417("\u010B\u04C5\331\335\332\354\u04C5\u04C5\u04C5\u04C5", '\251', '\005'), new Class[0]);
        try
        {
            obj = ((Method) (obj)).invoke(null, new Object[0]);
        }
        // Misplaced declaration of an exception variable
        catch (ProvisionTokenParams provisiontokenparams)
        {
            throw provisiontokenparams.getCause();
        }
        j1 = ((Integer)obj).intValue();
        switch ((j1 * (b042504250425042504250425 + j1)) % b041C041C041C041C041C041C)
        {
        default:
            Object obj1 = com/visa/cbp/sdk/facade/VisaPaymentSDKImpl.getMethod(nuuuuu.b0417041704170417041704170417("\231\u0453gkhz\u0453\u0453\u0453\u0453", '7', '\005'), new Class[0]);
            Method method;
            try
            {
                obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (ProvisionTokenParams provisiontokenparams)
            {
                throw provisiontokenparams.getCause();
            }
            b042504250425042504250425 = ((Integer)obj1).intValue();
            b042504250425042504250425 = 79;
            break;

        case 0: // '\0'
            break;
        }
        if (((i + j) * k) % l != i1)
        {
            b042504250425042504250425 = 52;
            obj1 = com/visa/cbp/sdk/facade/VisaPaymentSDKImpl.getMethod(nuuuuu.b0417041704170417041704170417("\255\u0467{\177|\216\u0467\u0467\u0467\u0467", 'K', '\005'), new Class[0]);
            try
            {
                obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (ProvisionTokenParams provisiontokenparams)
            {
                throw provisiontokenparams.getCause();
            }
            b042504250425042504250425 = ((Integer)obj1).intValue();
        }
        obj1 = new lpplpl();
        method = com/visa/cbp/sdk/facade/VisaPaymentSDKImpl.getMethod(nuuuuu.b0417041704170417041704170417("\256\254\261\250\267\255\267\261\260\212\261\265\273\260", '\336', '\002'), new Class[] {
            com/visa/cbp/sdk/facade/request/ProvisionTokenParams, com/visa/cbp/sdk/facade/provider/ResponseCallback, com/visa/cbp/sdk/facade/provider/TokenProvider
        });
        method.invoke(this, new Object[] {
            provisiontokenparams, responsecallback, obj1
        });
        return;
        provisiontokenparams;
        throw provisiontokenparams.getCause();
        try
        {
            throw new SDKModeException("Because your environment is not set (no network calls by the SDK to Visa will be made), you must call one of the other versions of this method where you pass in your own TokenProvider implementation.");
        }
        // Misplaced declaration of an exception variable
        catch (ProvisionTokenParams provisiontokenparams)
        {
            throw provisiontokenparams;
        }
    }

    public void provisionToken(ProvisionTokenParams provisiontokenparams, ResponseCallback responsecallback, TokenProvider tokenprovider)
    {
        Object obj = rrrrrr/pplpll.getMethod(nuuuuu.b0417041704170417041704170417("\347\u04B6\265\271\270\266\u04B6\265\271\270\266\u04B6\u04B6", '\205', '\005'), new Class[] {
            com/visa/cbp/sdk/facade/request/ProvisionTokenParams
        });
        try
        {
            obj = ((Method) (obj)).invoke(null, new Object[] {
                provisiontokenparams
            });
        }
        // Misplaced declaration of an exception variable
        catch (ProvisionTokenParams provisiontokenparams)
        {
            throw provisiontokenparams.getCause();
        }
        obj = (CbpError)obj;
        if (obj == null)
        {
            obj = rrrrrr/llpllp.getMethod(nuuuuu.b0417041704170417041704170417("\u0218\u01E6\u01EA\u01E8\u01E7\u05D7\u01E6\u01EA\u01E8\u01E7\u01E6\u01EA\u01E8\u01E7\u05D7\u01E6\u01EA\u01E8\u01E7\u05D7", '\222', '\006'), new Class[] {
                com/visa/cbp/sdk/facade/request/ProvisionTokenParams
            });
            try
            {
                provisiontokenparams = ((ProvisionTokenParams) (((Method) (obj)).invoke(null, new Object[] {
                    provisiontokenparams
                })));
            }
            // Misplaced declaration of an exception variable
            catch (ProvisionTokenParams provisiontokenparams)
            {
                throw provisiontokenparams.getCause();
            }
            provisiontokenparams = (EnrollProvisionRequestWrapper)provisiontokenparams;
            tokenprovider = new ggrrgg(appContext, tokenprovider, tokenDao);
            obj = rrrrrr/ggrrgg.getMethod(nuuuuu.b0417041704170417041704170417("\222\u047A\u047A`ddq`ddq\u047A`ddq", '0', '\005'), new Class[] {
                com/visa/cbp/sdk/facade/data/EnrollProvisionRequestWrapper, com/visa/cbp/sdk/facade/provider/ResponseCallback
            });
            try
            {
                ((Method) (obj)).invoke(tokenprovider, new Object[] {
                    provisiontokenparams, responsecallback
                });
                return;
            }
            // Misplaced declaration of an exception variable
            catch (ProvisionTokenParams provisiontokenparams)
            {
                throw provisiontokenparams.getCause();
            }
        }
        provisiontokenparams = com/visa/cbp/sdk/facade/provider/ResponseCallback.getMethod(nuuuuu.b0417041704170417041704170417("\u01BC\u01B7\u01BF\u01C2\u01CB\u01C8\u01BB", 'r', '\006'), new Class[] {
            com/visa/cbp/sdk/facade/error/CbpError
        });
        try
        {
            provisiontokenparams.invoke(responsecallback, new Object[] {
                obj
            });
            return;
        }
        // Misplaced declaration of an exception variable
        catch (ProvisionTokenParams provisiontokenparams)
        {
            throw provisiontokenparams.getCause();
        }
    }

    public void replenishDynamicData(ReplenishParams replenishparams, ResponseCallback responsecallback)
    {
        throw new Runtime("d2j fail translate: java.lang.IndexOutOfBoundsException: fromIndex < 0: -1\n\tat java.util.BitSet.nextSetBit(BitSet.java:701)\n\tat com.googlecode.dex2jar.ir.ts.array.FillArrayTransformer.makeSureAllElementAreAssigned(FillArrayTransformer.java:505)\n\tat com.googlecode.dex2jar.ir.ts.array.FillArrayTransformer.transformReportChanged(FillArrayTransformer.java:123)\n\tat com.googlecode.dex2jar.ir.ts.StatedTransformer.transform(StatedTransformer.java:10)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:149)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
    }

    public void replenishDynamicData(ReplenishParams replenishparams, ResponseCallback responsecallback, ReplenishmentProvider replenishmentprovider)
    {
        Object obj = com/visa/cbp/sdk/facade/request/ReplenishParams.getMethod(nuuuuu.b0417041704170417041704170417("\303\301\320\260\313\307\301\312\247\301\325", '\355', '\221', '\002'), new Class[0]);
        obj = ((Method) (obj)).invoke(replenishparams, new Object[0]);
        Method method;
        obj = (TokenKey)obj;
        method = rrrrrr/pplpll.getMethod(nuuuuu.b0417041704170417041704170417("\uFF4C\u031B\u031B\uFF1A\uFF1E\uFF1D\uFF1B\uFF1A\uFF1E\uFF1D\uFF1B\u031B\u031B", '\213', '\003'), new Class[] {
            com/visa/cbp/sdk/facade/data/TokenKey
        });
        obj = method.invoke(null, new Object[] {
            obj
        });
        if (!((Boolean)obj).booleanValue())
        {
            break MISSING_BLOCK_LABEL_455;
        }
        llplpp llplpp1;
        Method method1;
        int i;
        int j;
        int k;
        int l;
        int i1;
        try
        {
            i = b042504250425042504250425;
            j = b042504250425042504250425;
            k = b042504250425042504250425;
            l = b041C041C041C041C041C041C;
            i1 = b042504250425042504250425;
        }
        // Misplaced declaration of an exception variable
        catch (ReplenishParams replenishparams)
        {
            throw replenishparams;
        }
        if (((i + j) * k) % l == i1)
        {
            break MISSING_BLOCK_LABEL_192;
        }
        obj = com/visa/cbp/sdk/facade/VisaPaymentSDKImpl.getMethod(nuuuuu.b0417041704170417041704170417("\334\u0496\252\256\253\275\u0496\u0496\u0496\u0496", 'z', '\005'), new Class[0]);
        obj = ((Method) (obj)).invoke(null, new Object[0]);
        i = ((Integer)obj).intValue();
        try
        {
            b042504250425042504250425 = i;
        }
        // Misplaced declaration of an exception variable
        catch (ReplenishParams replenishparams)
        {
            throw replenishparams;
        }
        b042504250425042504250425 = 78;
        obj = tokenDao;
        llplpp1 = tvlDao;
        method1 = rrrrrr/llpllp.getMethod(nuuuuu.b0417041704170417041704170417("\u024A\u0609\u0218\u021C\u021A\u0219\u0218\u021C\u021A\u0219\u0218\u021C\u021A\u0219\u0609\u0218\u021C\u021A\u0219\u0609", '\364', '\001'), new Class[] {
            com/visa/cbp/sdk/facade/request/ReplenishParams, rrrrrr/ppplpl, rrrrrr/llplpp
        });
        replenishparams = ((ReplenishParams) (method1.invoke(null, new Object[] {
            replenishparams, obj, llplpp1
        })));
        replenishparams = (ReplenishRequest)replenishparams;
        replenishmentprovider = new ggrrgg(appContext, replenishmentprovider, tokenDao);
        obj = rrrrrr/ggrrgg.getMethod(nuuuuu.b0417041704170417041704170417("\u018E\u015C\u0160\u0160\u016D\u015C\u0160\u0160\u016D\u015C\u0160\u0160\u016D\u015C\u0160\u0160\u016D\u0576\u015C\u0160\u0160\u016D", 'R', '\332', '\003'), new Class[] {
            com/visa/cbp/external/aam/ReplenishRequest, com/visa/cbp/sdk/facade/provider/ResponseCallback
        });
        ((Method) (obj)).invoke(replenishmentprovider, new Object[] {
            replenishparams, responsecallback
        });
        i = b042504250425042504250425;
        switch ((i * (b042504250425042504250425 + i)) % b041C041C041C041C041C041C)
        {
        default:
            replenishparams = com/visa/cbp/sdk/facade/VisaPaymentSDKImpl.getMethod(nuuuuu.b0417041704170417041704170417("\u0114\u04CE\342\346\343\365\u04CE\u04CE\u04CE\u04CE", 't', '>', '\003'), new Class[0]);
            try
            {
                replenishparams = ((ReplenishParams) (replenishparams.invoke(null, new Object[0])));
            }
            // Misplaced declaration of an exception variable
            catch (ReplenishParams replenishparams)
            {
                throw replenishparams.getCause();
            }
            b042504250425042504250425 = ((Integer)replenishparams).intValue();
            b042504250425042504250425 = 93;
            // fall through

        case 0: // '\0'
            return;
        }
        replenishparams;
        try
        {
            throw replenishparams.getCause();
        }
        // Misplaced declaration of an exception variable
        catch (ReplenishParams replenishparams) { }
        throw replenishparams;
        replenishparams;
        throw replenishparams.getCause();
        replenishparams;
        throw replenishparams.getCause();
        replenishparams = SDKErrorType.TOKEN_KEY_INVALID;
        replenishmentprovider = ReasonCode.INVALID_INPUT_ERROR;
        obj = rrrrrr/lpplll.getMethod(nuuuuu.b0417041704170417041704170417("\u0152\u0120\u0124\u0124\u0127\u0120\u0124\u0124\u0127\u0537\u0120\u0124\u0124\u0127\u0537\u0120\u0124\u0124\u0127", '\274', '4', '\003'), new Class[] {
            com/visa/cbp/sdk/facade/error/SDKErrorType, com/visa/cbp/sdk/facade/error/ReasonCode
        });
        replenishparams = ((ReplenishParams) (((Method) (obj)).invoke(null, new Object[] {
            replenishparams, replenishmentprovider
        })));
        replenishparams = (CbpError)replenishparams;
        replenishmentprovider = com/visa/cbp/sdk/facade/provider/ResponseCallback.getMethod(nuuuuu.b0417041704170417041704170417("snvy\202\177r", '\r', '\005'), new Class[] {
            com/visa/cbp/sdk/facade/error/CbpError
        });
        replenishmentprovider.invoke(responsecallback, new Object[] {
            replenishparams
        });
        return;
        replenishparams;
        try
        {
            throw replenishparams.getCause();
        }
        // Misplaced declaration of an exception variable
        catch (ReplenishParams replenishparams) { }
        throw replenishparams;
        replenishparams;
        throw replenishparams.getCause();
        replenishparams;
        throw replenishparams.getCause();
        replenishparams;
        throw replenishparams.getCause();
    }

    public void resumeToken(LcmParams lcmparams, ResponseCallback responsecallback)
    {
        if (environment == null)
        {
            break MISSING_BLOCK_LABEL_243;
        }
        pllppp pllppp1;
        Method method;
        int i;
        int j;
        int k;
        int l;
        try
        {
            pllppp1 = new pllppp();
        }
        // Misplaced declaration of an exception variable
        catch (LcmParams lcmparams)
        {
            throw lcmparams;
        }
        method = com/visa/cbp/sdk/facade/VisaPaymentSDKImpl.getMethod(nuuuuu.b0417041704170417041704170417("\u0110\u0103\u0111\u0113\u010B\u0103\362\u010D\u0109\u0103\u010C", '2', 'l', '\003'), new Class[] {
            com/visa/cbp/sdk/facade/data/LcmParams, com/visa/cbp/sdk/facade/provider/ResponseCallback, com/visa/cbp/sdk/facade/provider/ResumeTokenProvider
        });
        method.invoke(this, new Object[] {
            lcmparams, responsecallback, pllppp1
        });
label0:
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
                        break label0;

                    case 1: // '\001'
                        continue label0;
                    }
                }
                break;

            case 0: // '\0'
                break label0;

            case 1: // '\001'
                break;
            }
        } while (true);
        try
        {
            i = b042504250425042504250425;
        }
        // Misplaced declaration of an exception variable
        catch (LcmParams lcmparams)
        {
            throw lcmparams;
        }
        lcmparams = com/visa/cbp/sdk/facade/VisaPaymentSDKImpl.getMethod(nuuuuu.b0417041704170417041704170417("y\u0433GKHZGKHZ\u0433\u0433\u0433", 'y', 'b', '\002'), new Class[0]);
        lcmparams = ((LcmParams) (lcmparams.invoke(null, new Object[0])));
        j = ((Integer)lcmparams).intValue();
        k = b042504250425042504250425;
        l = b041C041C041C041C041C041C;
        lcmparams = com/visa/cbp/sdk/facade/VisaPaymentSDKImpl.getMethod(nuuuuu.b0417041704170417041704170417("\uFFF3\uFFC1\uFFC5\uFFC2\uFFD4\uFFC1\uFFC5\uFFC2\uFFD4\u03AD\u03AD\u03AD\u03AD", 'o', '\0'), new Class[0]);
        lcmparams = ((LcmParams) (lcmparams.invoke(null, new Object[0])));
        if (((j + i) * k) % l == ((Integer)lcmparams).intValue())
        {
            break MISSING_BLOCK_LABEL_242;
        }
        b042504250425042504250425 = 18;
        b042504250425042504250425 = 18;
        return;
        lcmparams = com/visa/cbp/sdk/facade/VisaPaymentSDKImpl.getMethod(nuuuuu.b0417041704170417041704170417("3\u03ED\001\005\002\024\u03ED\u03ED\u03ED\u03ED", 'P', '\177', '\002'), new Class[0]);
        try
        {
            lcmparams = ((LcmParams) (lcmparams.invoke(null, new Object[0])));
        }
        // Misplaced declaration of an exception variable
        catch (LcmParams lcmparams)
        {
            throw lcmparams.getCause();
        }
        i = ((Integer)lcmparams).intValue();
        j = b042504250425042504250425;
        lcmparams = com/visa/cbp/sdk/facade/VisaPaymentSDKImpl.getMethod(nuuuuu.b0417041704170417041704170417("\u01FD\u05B7\u01CB\u01CF\u01CC\u01DE\u05B7\u05B7\u05B7\u05B7", '\211', '\006'), new Class[0]);
        try
        {
            lcmparams = ((LcmParams) (lcmparams.invoke(null, new Object[0])));
        }
        // Misplaced declaration of an exception variable
        catch (LcmParams lcmparams)
        {
            throw lcmparams.getCause();
        }
        if ((((Integer)lcmparams).intValue() * (j + i)) % b041C041C041C041C041C041C != b042504250425042504250425)
        {
            lcmparams = com/visa/cbp/sdk/facade/VisaPaymentSDKImpl.getMethod(nuuuuu.b0417041704170417041704170417("\350\u04A2\266\272\267\311\u04A2\u04A2\u04A2\u04A2", 'C', '\001'), new Class[0]);
            try
            {
                lcmparams = ((LcmParams) (lcmparams.invoke(null, new Object[0])));
            }
            // Misplaced declaration of an exception variable
            catch (LcmParams lcmparams)
            {
                throw lcmparams.getCause();
            }
            b042504250425042504250425 = ((Integer)lcmparams).intValue();
            lcmparams = com/visa/cbp/sdk/facade/VisaPaymentSDKImpl.getMethod(nuuuuu.b0417041704170417041704170417("\uFFE1\u039B\uFFAF\uFFB3\uFFB0\uFFC2\u039B\u039B\u039B\u039B", '+', '\004'), new Class[0]);
            try
            {
                lcmparams = ((LcmParams) (lcmparams.invoke(null, new Object[0])));
            }
            // Misplaced declaration of an exception variable
            catch (LcmParams lcmparams)
            {
                throw lcmparams.getCause();
            }
            b042504250425042504250425 = ((Integer)lcmparams).intValue();
        }
        throw new SDKModeException("Network calls to Visa are only available in Flow 1.  Since the environment variable is not set, Flow 1 is not enabled within the SDK and Flow2 is assumed.  This method (or this specific overloaded version of this method) should not be called while in Flow 2 mode since you are responsible for all network traffic.: resumeToken(LcmParams lcmParams, final ResponseCallback<TokenStatusResponse, TokenStatusError> resumeCallback)");
        lcmparams;
        throw lcmparams.getCause();
        lcmparams;
        throw lcmparams.getCause();
        lcmparams;
        throw lcmparams.getCause();
    }

    public void resumeToken(LcmParams lcmparams, ResponseCallback responsecallback, ResumeTokenProvider resumetokenprovider)
    {
        Object obj = rrrrrr/pplpll.getMethod(nuuuuu.b0417041704170417041704170417("\266\204\210\207\205\u0485\204\210\207\205\204\210\207\205\u0485\u0485", '*', '\001'), new Class[] {
            com/visa/cbp/sdk/facade/data/LcmParams
        });
        try
        {
            obj = ((Method) (obj)).invoke(null, new Object[] {
                lcmparams
            });
        }
        // Misplaced declaration of an exception variable
        catch (LcmParams lcmparams)
        {
            throw lcmparams.getCause();
        }
        obj = (TokenStatusError)obj;
        if (obj == null)
        {
            obj = tokenDao;
            Method method = rrrrrr/llpllp.getMethod(nuuuuu.b0417041704170417041704170417("\024\uFFE2\uFFE6\uFFE4\uFFE3\uFFE2\uFFE6\uFFE4\uFFE3\u03D3\u03D3\uFFE2\uFFE6\uFFE4\uFFE3\uFFE2\uFFE6\uFFE4\uFFE3\u03D3", 'N', '\0'), new Class[] {
                com/visa/cbp/sdk/facade/data/LcmParams, rrrrrr/ppplpl
            });
            int i;
            int j;
            int k;
            int l;
            try
            {
                lcmparams = ((LcmParams) (method.invoke(null, new Object[] {
                    lcmparams, obj
                })));
            }
            // Misplaced declaration of an exception variable
            catch (LcmParams lcmparams)
            {
                throw lcmparams.getCause();
            }
            lcmparams = (LcmTokenRequest)lcmparams;
            resumetokenprovider = new ggrrgg(appContext, resumetokenprovider, tokenDao);
            i = b042504250425042504250425;
            j = b042504250425042504250425;
            k = b042504250425042504250425;
            l = b041C041C041C041C041C041C;
            obj = com/visa/cbp/sdk/facade/VisaPaymentSDKImpl.getMethod(nuuuuu.b0417041704170417041704170417("\265\203\207\204\226\203\207\204\226\u046F\u046F\u046F\u046F", 'S', '\005'), new Class[0]);
            try
            {
                obj = ((Method) (obj)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (LcmParams lcmparams)
            {
                throw lcmparams.getCause();
            }
            if (((i + j) * k) % l != ((Integer)obj).intValue())
            {
                obj = com/visa/cbp/sdk/facade/VisaPaymentSDKImpl.getMethod(nuuuuu.b0417041704170417041704170417("\uFDD7\u0191\uFDA5\uFDA9\uFDA6\uFDB8\u0191\u0191\u0191\u0191", '\331', '\004'), new Class[0]);
                try
                {
                    obj = ((Method) (obj)).invoke(null, new Object[0]);
                }
                // Misplaced declaration of an exception variable
                catch (LcmParams lcmparams)
                {
                    throw lcmparams.getCause();
                }
                b042504250425042504250425 = ((Integer)obj).intValue();
                b042504250425042504250425 = 91;
            }
            obj = rrrrrr/ggrrgg.getMethod(nuuuuu.b0417041704170417041704170417("\u015E\u012C\u0130\u0130\u013D\u012C\u0130\u0130\u013D\u012C\u0130\u0130\u013D\u0546\u012C\u0130\u0130\u013D\u012C\u0130\u0130\u013D", '~', '\001'), new Class[] {
                com/visa/cbp/external/lcm/LcmTokenRequest, com/visa/cbp/sdk/facade/provider/ResponseCallback
            });
            try
            {
                ((Method) (obj)).invoke(resumetokenprovider, new Object[] {
                    lcmparams, responsecallback
                });
                return;
            }
            // Misplaced declaration of an exception variable
            catch (LcmParams lcmparams)
            {
                throw lcmparams.getCause();
            }
        }
        lcmparams = com/visa/cbp/sdk/facade/provider/ResponseCallback.getMethod(nuuuuu.b0417041704170417041704170417("snvy\202\177r", '\006', '\007', '\003'), new Class[] {
            com/visa/cbp/sdk/facade/error/CbpError
        });
        try
        {
            lcmparams.invoke(responsecallback, new Object[] {
                obj
            });
            return;
        }
        // Misplaced declaration of an exception variable
        catch (LcmParams lcmparams)
        {
            throw lcmparams.getCause();
        }
    }

    public void resumeToken(LcmParams alcmparams[], ResponseCallback responsecallback)
    {
        Object obj;
        Object obj1;
        int i;
        int j;
        int k;
        int l;
        try
        {
            obj = environment;
        }
        // Misplaced declaration of an exception variable
        catch (LcmParams alcmparams[])
        {
            throw alcmparams;
        }
        i = b042504250425042504250425;
        j = b042504250425042504250425;
        k = b042504250425042504250425;
        l = b041C041C041C041C041C041C;
        obj1 = com/visa/cbp/sdk/facade/VisaPaymentSDKImpl.getMethod(nuuuuu.b0417041704170417041704170417("\u022B\u01F9\u01FD\u01FA\u020C\u01F9\u01FD\u01FA\u020C\u05E5\u05E5\u05E5\u05E5", '\345', '\344', '\003'), new Class[0]);
        try
        {
            obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
        }
        // Misplaced declaration of an exception variable
        catch (LcmParams alcmparams[])
        {
            throw alcmparams.getCause();
        }
        if (((i + j) * k) % l != ((Integer)obj1).intValue())
        {
            Object obj2 = com/visa/cbp/sdk/facade/VisaPaymentSDKImpl.getMethod(nuuuuu.b0417041704170417041704170417("&\u03E0\uFFF4\uFFF8\uFFF5\007\u03E0\u03E0\u03E0\u03E0", '\024', '\004'), new Class[0]);
            try
            {
                obj2 = ((Method) (obj2)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (LcmParams alcmparams[])
            {
                throw alcmparams.getCause();
            }
            b042504250425042504250425 = ((Integer)obj2).intValue();
            b042504250425042504250425 = 33;
        }
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_307;
        }
        if (((b042504250425042504250425 + b042504250425042504250425) * b042504250425042504250425) % b041C041C041C041C041C041C != b042504250425042504250425)
        {
            obj = com/visa/cbp/sdk/facade/VisaPaymentSDKImpl.getMethod(nuuuuu.b0417041704170417041704170417("\u0166\u0520\u0134\u0138\u0135\u0147\u0520\u0520\u0520\u0520", 'z', '\212', '\003'), new Class[0]);
            try
            {
                obj = ((Method) (obj)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (LcmParams alcmparams[])
            {
                throw alcmparams.getCause();
            }
            b042504250425042504250425 = ((Integer)obj).intValue();
            obj = com/visa/cbp/sdk/facade/VisaPaymentSDKImpl.getMethod(nuuuuu.b0417041704170417041704170417("\b\u03C2\uFFD6\uFFDA\uFFD7\uFFE9\u03C2\u03C2\u03C2\u03C2", '-', '\003'), new Class[0]);
            try
            {
                obj = ((Method) (obj)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (LcmParams alcmparams[])
            {
                throw alcmparams.getCause();
            }
            b042504250425042504250425 = ((Integer)obj).intValue();
        }
        try
        {
            obj = new pllppp();
        }
        // Misplaced declaration of an exception variable
        catch (LcmParams alcmparams[])
        {
            throw alcmparams;
        }
        obj2 = com/visa/cbp/sdk/facade/VisaPaymentSDKImpl.getMethod(nuuuuu.b0417041704170417041704170417("\uFF5C\uFF4F\uFF5D\uFF5F\uFF57\uFF4F\uFF3E\uFF59\uFF55\uFF4F\uFF58", '\213', '\003'), new Class[] {
            [Lcom/visa/cbp/sdk/facade/data/LcmParams;, com/visa/cbp/sdk/facade/provider/ResponseCallback, com/visa/cbp/sdk/facade/provider/ResumeTokenProvider
        });
        ((Method) (obj2)).invoke(this, new Object[] {
            alcmparams, responsecallback, obj
        });
        return;
        alcmparams = new SDKModeException("Network calls to Visa are only available in Flow 1.  Since the environment variable is not set, Flow 1 is not enabled within the SDK and Flow2 is assumed.  This method (or this specific overloaded version of this method) should not be called while in Flow 2 mode since you are responsible for all network traffic.: resumeToken(LcmParams[] lcmParams, final ResponseCallback<TokenStatusResponse, TokenStatusError> resumeCallback)");
        throw alcmparams;
        alcmparams;
        throw alcmparams.getCause();
    }

    public void resumeToken(LcmParams alcmparams[], ResponseCallback responsecallback, ResumeTokenProvider resumetokenprovider)
    {
        if (resumetokenprovider == null || alcmparams == null) goto _L2; else goto _L1
_L1:
        int i;
        int j;
        try
        {
            i = alcmparams.length;
        }
        // Misplaced declaration of an exception variable
        catch (LcmParams alcmparams[])
        {
            throw alcmparams;
        }
        j = b042504250425042504250425;
        switch ((j * (b042504250425042504250425 + j)) % b041C041C041C041C041C041C)
        {
        default:
            b042504250425042504250425 = 18;
            Object obj = com/visa/cbp/sdk/facade/VisaPaymentSDKImpl.getMethod(nuuuuu.b0417041704170417041704170417("U\u042B\007\003\006t\u042B\u042B\u042B\u042B", '7', '\002'), new Class[0]);
            Method method;
            int k;
            int l;
            int i1;
            int j1;
            try
            {
                obj = ((Method) (obj)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (LcmParams alcmparams[])
            {
                throw alcmparams.getCause();
            }
            b042504250425042504250425 = ((Integer)obj).intValue();
            break;

        case 0: // '\0'
            break;
        }
        if (i <= 0) goto _L2; else goto _L3
_L3:
        i = b042504250425042504250425;
        k = b042504250425042504250425;
        l = b042504250425042504250425;
        i1 = b041C041C041C041C041C041C;
        j1 = b042504250425042504250425;
        if (((i + k) * l) % i1 == j1)
        {
            break MISSING_BLOCK_LABEL_238;
        }
        obj = com/visa/cbp/sdk/facade/VisaPaymentSDKImpl.getMethod(nuuuuu.b0417041704170417041704170417("U\u040F#'$6\u040F\u040F\u040F\u040F", '\005', '\022', '\002'), new Class[0]);
        obj = ((Method) (obj)).invoke(null, new Object[0]);
        i = ((Integer)obj).intValue();
        try
        {
            b042504250425042504250425 = i;
        }
        // Misplaced declaration of an exception variable
        catch (LcmParams alcmparams[])
        {
            throw alcmparams;
        }
        obj = com/visa/cbp/sdk/facade/VisaPaymentSDKImpl.getMethod(nuuuuu.b0417041704170417041704170417("\u014C\u0506\u011A\u011E\u011B\u012D\u0506\u0506\u0506\u0506", '\352', '\005'), new Class[0]);
        obj = ((Method) (obj)).invoke(null, new Object[0]);
        i = ((Integer)obj).intValue();
        b042504250425042504250425 = i;
        k = alcmparams.length;
        i = 0;
_L4:
        if (i >= k)
        {
            break; /* Loop/switch isn't completed */
        }
        obj = alcmparams[i];
        method = com/visa/cbp/sdk/facade/VisaPaymentSDKImpl.getMethod(nuuuuu.b0417041704170417041704170417("8+9;3+\03251+4", ':', '\0'), new Class[] {
            com/visa/cbp/sdk/facade/data/LcmParams, com/visa/cbp/sdk/facade/provider/ResponseCallback, com/visa/cbp/sdk/facade/provider/ResumeTokenProvider
        });
        method.invoke(this, new Object[] {
            obj, responsecallback, resumetokenprovider
        });
        i++;
        if (true) goto _L4; else goto _L2
        alcmparams;
        throw alcmparams.getCause();
        alcmparams;
        throw alcmparams.getCause();
        alcmparams;
        throw alcmparams.getCause();
_L2:
    }

    public void selectCard(TokenKey tokenkey)
    {
        Object obj;
        if (tokenkey == null)
        {
            break MISSING_BLOCK_LABEL_625;
        }
        obj = com/visa/cbp/sdk/facade/data/TokenKey.getMethod(nuuuuu.b0417041704170417041704170417("\uFFC8\uFFC6\uFFD5\uFFB5\uFFD0\uFFCC\uFFC6\uFFCF\uFFAA\uFFC5", '\364', 'U', '\001'), new Class[0]);
        obj = ((Method) (obj)).invoke(tokenkey, new Object[0]);
        if (((Long)obj).longValue() <= 0L)
        {
            break MISSING_BLOCK_LABEL_625;
        }
        Object obj1;
        Method method1;
        try
        {
            obj = tokenDao;
        }
        // Misplaced declaration of an exception variable
        catch (TokenKey tokenkey)
        {
            throw tokenkey;
        }
        obj1 = rrrrrr/ppplpl.getMethod(nuuuuu.b0417041704170417041704170417(">\u03F7\f\020\r\036\f\020\r\036\f\020\r\036\f\020\r\036\u03F7", '\034', '\b', '\0'), new Class[] {
            com/visa/cbp/sdk/facade/data/TokenKey
        });
        obj = ((Method) (obj1)).invoke(obj, new Object[] {
            tokenkey
        });
        if ((TokenInfo)obj == null)
        {
            break MISSING_BLOCK_LABEL_596;
        }
        obj = com/visa/cbp/sdk/facade/VisaPaymentSDKImpl.getMethod(nuuuuu.b0417041704170417041704170417("\336\334\315\355\326\322\334\327\352\315\330\315\314\312", '\271', '\002'), new Class[] {
            com/visa/cbp/sdk/facade/data/TokenKey
        });
        obj = ((Method) (obj)).invoke(this, new Object[] {
            tokenkey
        });
        obj = (String)obj;
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_443;
        }
        obj1 = TokenStatus.ACTIVE;
        method1 = com/visa/cbp/sdk/facade/data/TokenStatus.getMethod(nuuuuu.b0417041704170417041704170417("\005\003\022\uFFF4\uFFFF\n\023\003", 'b', '\0'), new Class[0]);
        obj1 = method1.invoke(obj1, new Object[0]);
        obj1 = (String)obj1;
        method1 = java/lang/String.getMethod(nuuuuu.b0417041704170417041704170417("\u0107\u0113\u0117\u0103\u010E\u0115\353\u0109\u0110\u0111\u0114\u0107\345\u0103\u0115\u0107", '6', '\006'), new Class[] {
            java/lang/String
        });
        obj1 = method1.invoke(obj, new Object[] {
            obj1
        });
        if (!((Boolean)obj1).booleanValue())
        {
            break MISSING_BLOCK_LABEL_443;
        }
        obj = settingsDao;
        obj1 = rrrrrr/grrgrg.getMethod(nuuuuu.b0417041704170417041704170417("\235kookkook\u047Bkookkookkook", '-', '\016', '\003'), new Class[] {
            com/visa/cbp/sdk/facade/data/TokenKey
        });
        obj = ((Method) (obj1)).invoke(obj, new Object[] {
            tokenkey
        });
        ((Boolean)obj).booleanValue();
        obj = com/visa/cbp/sdk/facade/VisaPaymentSDKImpl.getDeclaredMethod(nuuuuu.b0417041704170417041704170417("\305\307\320\345\307\332\326\320\306\306\346\320\331\320\326\301\320\321\366\324\307\321\341\332\336\320\333\374\333\323\332", '\265', '\002'), new Class[] {
            com/visa/cbp/sdk/facade/data/TokenKey
        });
        ((Method) (obj)).invoke(this, new Object[] {
            tokenkey
        });
        if (((b042504250425042504250425 + b042504250425042504250425) * b042504250425042504250425) % b041C041C041C041C041C041C != b042504250425042504250425)
        {
            tokenkey = com/visa/cbp/sdk/facade/VisaPaymentSDKImpl.getMethod(nuuuuu.b0417041704170417041704170417("\u01F0\u05AA\u01BE\u01C2\u01BF\u01D1\u05AA\u05AA\u05AA\u05AA", '\307', '\001'), new Class[0]);
            Method method;
            try
            {
                tokenkey = ((TokenKey) (tokenkey.invoke(null, new Object[0])));
            }
            // Misplaced declaration of an exception variable
            catch (TokenKey tokenkey)
            {
                throw tokenkey.getCause();
            }
            b042504250425042504250425 = ((Integer)tokenkey).intValue();
            tokenkey = com/visa/cbp/sdk/facade/VisaPaymentSDKImpl.getMethod(nuuuuu.b0417041704170417041704170417("\uFF90\u034A\uFF5E\uFF62\uFF5F\uFF71\u034A\u034A\u034A\u034A", 'F', '\004'), new Class[0]);
            try
            {
                tokenkey = ((TokenKey) (tokenkey.invoke(null, new Object[0])));
            }
            // Misplaced declaration of an exception variable
            catch (TokenKey tokenkey)
            {
                throw tokenkey.getCause();
            }
            b042504250425042504250425 = ((Integer)tokenkey).intValue();
        }
        return;
        tokenkey;
        throw tokenkey.getCause();
        tokenkey = new StringBuilder();
        method = java/lang/StringBuilder.getMethod(nuuuuu.b0417041704170417041704170417("\uFFC4\uFFD3\uFFD3\uFFC8\uFFD1\uFFC7", '\003', '\232', '\0'), new Class[] {
            java/lang/String
        });
        tokenkey = ((TokenKey) (method.invoke(tokenkey, new Object[] {
            "The token is in an invalid status: "
        })));
        tokenkey = (StringBuilder)tokenkey;
        method = java/lang/StringBuilder.getMethod(nuuuuu.b0417041704170417041704170417("\uFFBA\uFFC9\uFFC9\uFFBE\uFFC7\uFFBD", '\024', '\273', '\002'), new Class[] {
            java/lang/String
        });
        tokenkey = ((TokenKey) (method.invoke(tokenkey, new Object[] {
            obj
        })));
        tokenkey = (StringBuilder)tokenkey;
        obj = java/lang/StringBuilder.getMethod(nuuuuu.b0417041704170417041704170417("\314\307\253\314\312\301\306\277", '\327', '\177', '\002'), new Class[0]);
        tokenkey = ((TokenKey) (((Method) (obj)).invoke(tokenkey, new Object[0])));
        tokenkey = (String)tokenkey;
        try
        {
            throw new TokenInvalidException(tokenkey);
        }
        // Misplaced declaration of an exception variable
        catch (TokenKey tokenkey)
        {
            throw tokenkey;
        }
        throw new TokenInvalidException("There's no token for the provided tokenKey");
        tokenkey;
        throw tokenkey.getCause();
        tokenkey;
        throw tokenkey.getCause();
        tokenkey;
        throw tokenkey.getCause();
        tokenkey = SDKErrorType.TOKEN_KEY_INVALID;
        obj = com/visa/cbp/sdk/facade/error/SDKErrorType.getMethod(nuuuuu.b0417041704170417041704170417("\u0256\u0254\u0263\u023C\u0254\u0262\u0262\u0250\u0256\u0254", '\245', '\006'), new Class[0]);
        tokenkey = ((TokenKey) (((Method) (obj)).invoke(tokenkey, new Object[0])));
        tokenkey = (String)tokenkey;
        tokenkey = new TokenKeyInvalidException(tokenkey);
        if (((b042504250425042504250425 + b042504250425042504250425) * b042504250425042504250425) % b041C041C041C041C041C041C != b042504250425042504250425)
        {
            obj = com/visa/cbp/sdk/facade/VisaPaymentSDKImpl.getMethod(nuuuuu.b0417041704170417041704170417("\u02F3\u06AD\u02C1\u02C5\u02C2\u02D4\u06AD\u06AD\u06AD\u06AD", '\333', '\006'), new Class[0]);
            try
            {
                obj = ((Method) (obj)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (TokenKey tokenkey)
            {
                throw tokenkey.getCause();
            }
            b042504250425042504250425 = ((Integer)obj).intValue();
            b042504250425042504250425 = 37;
        }
        throw tokenkey;
        tokenkey;
        throw tokenkey.getCause();
        tokenkey;
        throw tokenkey.getCause();
        tokenkey;
        throw tokenkey.getCause();
        tokenkey;
        throw tokenkey.getCause();
        tokenkey;
        throw tokenkey.getCause();
        tokenkey;
        throw tokenkey.getCause();
        tokenkey;
        throw tokenkey.getCause();
    }

    public void setAccessTokenAdvancedWarningPercent(int i)
    {
        if (((b042504250425042504250425 + b042504250425042504250425) * b042504250425042504250425) % b041C041C041C041C041C041C != b042504250425042504250425)
        {
            Object obj = com/visa/cbp/sdk/facade/VisaPaymentSDKImpl.getMethod(nuuuuu.b0417041704170417041704170417("l\u0426:>;M\u0426\u0426\u0426\u0426", '+', '!', '\002'), new Class[0]);
            InvocationTargetException invocationtargetexception;
            Method method;
            try
            {
                obj = ((Method) (obj)).invoke(null, new Object[0]);
            }
            catch (InvocationTargetException invocationtargetexception2)
            {
                throw invocationtargetexception2.getCause();
            }
            b042504250425042504250425 = ((Integer)obj).intValue();
            obj = com/visa/cbp/sdk/facade/VisaPaymentSDKImpl.getMethod(nuuuuu.b0417041704170417041704170417("\u014B\u0505\u0119\u011D\u011A\u012C\u0505\u0505\u0505\u0505", '\233', 'N', '\003'), new Class[0]);
            try
            {
                obj = ((Method) (obj)).invoke(null, new Object[0]);
            }
            catch (InvocationTargetException invocationtargetexception1)
            {
                throw invocationtargetexception1.getCause();
            }
            b042504250425042504250425 = ((Integer)obj).intValue();
        }
        if (i < 0 || i > 50)
        {
            throw new InvalidInputException("Max advance warning percentage value should be between 0 and 50");
        }
        obj = settingsDao;
        method = rrrrrr/grrgrg.getMethod(nuuuuu.b0417041704170417041704170417("\u01CE\u019C\u01A0\u01A0\u019C\u019C\u01A0\u01A0\u019C\u019C\u01A0\u01A0\u019C\u05AC\u019C\u01A0\u01A0\u019C\u019C\u01A0\u01A0\u019C", '\212', '\342', '\003'), new Class[] {
            Integer.TYPE
        });
        try
        {
            method.invoke(obj, new Object[] {
                Integer.valueOf(i)
            });
            return;
        }
        // Misplaced declaration of an exception variable
        catch (InvocationTargetException invocationtargetexception)
        {
            throw invocationtargetexception.getCause();
        }
    }

    public void setCheckStatusPeriod(long l)
    {
        Object obj = com/visa/cbp/sdk/facade/VisaPaymentSDKImpl.getMethod(nuuuuu.b0417041704170417041704170417("\uFF81\u033B\uFF4F\uFF53\uFF50\uFF62\u033B\u033B\u033B\u033B", '\341', '\0'), new Class[0]);
        obj = ((Method) (obj)).invoke(null, new Object[0]);
        int i = ((Integer)obj).intValue();
        int k;
        int i1;
        int j1;
        int k1;
        try
        {
            k = b042504250425042504250425;
        }
        catch (Exception exception)
        {
            throw exception;
        }
        obj = com/visa/cbp/sdk/facade/VisaPaymentSDKImpl.getMethod(nuuuuu.b0417041704170417041704170417("<\u03F6\n\016\013\035\u03F6\u03F6\u03F6\u03F6", 'u', '\233', '\002'), new Class[0]);
        obj = ((Method) (obj)).invoke(null, new Object[0]);
        i1 = ((Integer)obj).intValue();
        j1 = b041C041C041C041C041C041C;
        k1 = b042504250425042504250425;
        if ((i1 * (k + i)) % j1 == k1)
        {
            break MISSING_BLOCK_LABEL_198;
        }
        obj = com/visa/cbp/sdk/facade/VisaPaymentSDKImpl.getMethod(nuuuuu.b0417041704170417041704170417(" \u03DA\uFFEE\uFFF2\uFFEF\001\u03DA\u03DA\u03DA\u03DA", '\026', '\004'), new Class[0]);
        obj = ((Method) (obj)).invoke(null, new Object[0]);
        i = ((Integer)obj).intValue();
        InvocationTargetException invocationtargetexception;
        Method method;
        int j;
        try
        {
            b042504250425042504250425 = i;
        }
        catch (Exception exception1)
        {
            throw exception1;
        }
        obj = com/visa/cbp/sdk/facade/VisaPaymentSDKImpl.getMethod(nuuuuu.b0417041704170417041704170417("\u01B4\u056E\u0182\u0186\u0183\u0195\u056E\u056E\u056E\u056E", '\251', '\001'), new Class[0]);
        obj = ((Method) (obj)).invoke(null, new Object[0]);
        i = ((Integer)obj).intValue();
        b042504250425042504250425 = i;
        if (l >= 3600L && l <= 0x1e13380L)
        {
            break MISSING_BLOCK_LABEL_240;
        }
        throw new InvalidInputException("Max checkstatus period value should be between 3600 and 31536000");
        invocationtargetexception;
        throw invocationtargetexception.getCause();
        invocationtargetexception;
        throw invocationtargetexception.getCause();
        invocationtargetexception = settingsDao;
        method = rrrrrr/grrgrg.getMethod(nuuuuu.b0417041704170417041704170417("\u0329\u0707\u02F7\u02FB\u02FB\u02F7\u02F7\u02FB\u02FB\u02F7\u02F7\u02FB\u02FB\u02F7\u02F7\u02FB\u02FB\u02F7\u02F7\u02FB\u02FB\u02F7", '\355', '\006'), new Class[] {
            Long.TYPE
        });
        method.invoke(invocationtargetexception, new Object[] {
            Long.valueOf(l)
        });
        j = b042504250425042504250425;
        switch ((j * (b042504250425042504250425 + j)) % b041C041C041C041C041C041C)
        {
        default:
            invocationtargetexception = com/visa/cbp/sdk/facade/VisaPaymentSDKImpl.getMethod(nuuuuu.b0417041704170417041704170417("\uFFFF\u03B9\uFFCD\uFFD1\uFFCE\uFFE0\u03B9\u03B9\u03B9\u03B9", '0', '3', '\0'), new Class[0]);
            InvocationTargetException invocationtargetexception1;
            try
            {
                invocationtargetexception = ((InvocationTargetException) (invocationtargetexception.invoke(null, new Object[0])));
            }
            catch (InvocationTargetException invocationtargetexception2)
            {
                throw invocationtargetexception2.getCause();
            }
            b042504250425042504250425 = ((Integer)invocationtargetexception).intValue();
            b042504250425042504250425 = 38;
            // fall through

        case 0: // '\0'
            invocationtargetexception = rrrrrr/rggggr.getMethod(nuuuuu.b0417041704170417041704170417("}KOOKKOOK\u045B\u045B\u045B\u045B", '\033', '\005'), new Class[] {
                Long.TYPE
            });
            break;
        }
        invocationtargetexception.invoke(null, new Object[] {
            Long.valueOf(l * 1000L)
        });
        return;
        invocationtargetexception;
        throw invocationtargetexception.getCause();
        invocationtargetexception;
        throw invocationtargetexception.getCause();
        invocationtargetexception;
        throw invocationtargetexception.getCause();
        invocationtargetexception1;
        throw invocationtargetexception1.getCause();
    }

    public void setCvmVerificationMode(CvmMode cvmmode)
    {
        throw new Runtime("d2j fail translate: java.lang.IndexOutOfBoundsException: fromIndex < 0: -1\n\tat java.util.BitSet.nextSetBit(BitSet.java:701)\n\tat com.googlecode.dex2jar.ir.ts.array.FillArrayTransformer.makeSureAllElementAreAssigned(FillArrayTransformer.java:505)\n\tat com.googlecode.dex2jar.ir.ts.array.FillArrayTransformer.transformReportChanged(FillArrayTransformer.java:123)\n\tat com.googlecode.dex2jar.ir.ts.StatedTransformer.transform(StatedTransformer.java:10)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:149)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
    }

    public void setCvmVerified(boolean flag)
    {
        Object obj;
        InvocationTargetException invocationtargetexception;
        Method method;
        int i;
        int j;
        int k;
        int l;
        int i1;
        try
        {
            obj = settingsDao;
        }
        catch (Exception exception)
        {
            throw exception;
        }
        method = rrrrrr/grrgrg.getMethod(nuuuuu.b0417041704170417041704170417("\uFFBD\u0382\uFF8B\uFF8F\uFF8D\uFF92\uFF8B\uFF8F\uFF8D\uFF92\u0382\u0382\u0382", '7', '\004'), new Class[] {
            Boolean.TYPE
        });
        method.invoke(obj, new Object[] {
            Boolean.valueOf(flag)
        });
        i = b042504250425042504250425;
        j = b042504250425042504250425;
        k = b042504250425042504250425;
        l = b041C041C041C041C041C041C;
        i1 = b042504250425042504250425;
        if (((i + j) * k) % l == i1)
        {
            break MISSING_BLOCK_LABEL_361;
        }
        obj = com/visa/cbp/sdk/facade/VisaPaymentSDKImpl.getMethod(nuuuuu.b0417041704170417041704170417("\u01C1\u057B\u018F\u0193\u0190\u01A2\u057B\u057B\u057B\u057B", 'u', '\006'), new Class[0]);
        try
        {
            obj = ((Method) (obj)).invoke(null, new Object[0]);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            throw ((InvocationTargetException) (obj1)).getCause();
        }
        i = ((Integer)obj).intValue();
        j = b042504250425042504250425;
        obj = com/visa/cbp/sdk/facade/VisaPaymentSDKImpl.getMethod(nuuuuu.b0417041704170417041704170417("\250\u0462vzw\211\u0462\u0462\u0462\u0462", 'F', '\005'), new Class[0]);
        try
        {
            obj = ((Method) (obj)).invoke(null, new Object[0]);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            throw ((InvocationTargetException) (obj1)).getCause();
        }
        if ((((Integer)obj).intValue() * (j + i)) % b041C041C041C041C041C041C != b042504250425042504250425)
        {
            obj = com/visa/cbp/sdk/facade/VisaPaymentSDKImpl.getMethod(nuuuuu.b0417041704170417041704170417("z\u0434HLI[\u0434\u0434\u0434\u0434", 'm', 'U', '\002'), new Class[0]);
            Object obj1;
            try
            {
                obj = ((Method) (obj)).invoke(null, new Object[0]);
            }
            catch (InvocationTargetException invocationtargetexception1)
            {
                throw invocationtargetexception1.getCause();
            }
            b042504250425042504250425 = ((Integer)obj).intValue();
            b042504250425042504250425 = 86;
        }
        obj = com/visa/cbp/sdk/facade/VisaPaymentSDKImpl.getMethod(nuuuuu.b0417041704170417041704170417("\uFF43\u02FD\uFF11\uFF15\uFF12\uFF24\u02FD\u02FD\u02FD\u02FD", ')', '\366', '\0'), new Class[0]);
        obj = ((Method) (obj)).invoke(null, new Object[0]);
        i = ((Integer)obj).intValue();
        b042504250425042504250425 = i;
        obj = com/visa/cbp/sdk/facade/VisaPaymentSDKImpl.getMethod(nuuuuu.b0417041704170417041704170417("\uFFC3\u037D\uFF91\uFF95\uFF92\uFFA4\u037D\u037D\u037D\u037D", '\237', '\0'), new Class[0]);
        obj = ((Method) (obj)).invoke(null, new Object[0]);
        i = ((Integer)obj).intValue();
        b042504250425042504250425 = i;
        return;
        invocationtargetexception;
        throw invocationtargetexception.getCause();
        obj1;
        throw ((InvocationTargetException) (obj1)).getCause();
        obj1;
        try
        {
            throw ((InvocationTargetException) (obj1)).getCause();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            throw obj1;
        }
    }

    public void setMaxTvlRecords(int i)
    {
label0:
        {
            if (i >= 0)
            {
                int j = b042504250425042504250425;
                switch ((j * (b042504250425042504250425 + j)) % b041C041C041C041C041C041C)
                {
                default:
                    int k = b042504250425042504250425;
                    switch ((k * (b042504250425042504250425 + k)) % b041C041C041C041C041C041C)
                    {
                    default:
                        b042504250425042504250425 = 97;
                        Object obj = com/visa/cbp/sdk/facade/VisaPaymentSDKImpl.getMethod(nuuuuu.b0417041704170417041704170417("\uFFF2\u03AC\uFFC0\uFFC4\uFFC1\uFFD3\u03AC\u03AC\u03AC\u03AC", '\301', 'Q', '\001'), new Class[0]);
                        InvocationTargetException invocationtargetexception;
                        Method method;
                        try
                        {
                            obj = ((Method) (obj)).invoke(null, new Object[0]);
                        }
                        catch (InvocationTargetException invocationtargetexception1)
                        {
                            throw invocationtargetexception1.getCause();
                        }
                        b042504250425042504250425 = ((Integer)obj).intValue();
                        // fall through

                    case 0: // '\0'
                        obj = com/visa/cbp/sdk/facade/VisaPaymentSDKImpl.getMethod(nuuuuu.b0417041704170417041704170417("n\u0428<@=O\u0428\u0428\u0428\u0428", '\004', '\006'), new Class[0]);
                        break;
                    }
                    try
                    {
                        obj = ((Method) (obj)).invoke(null, new Object[0]);
                    }
                    // Misplaced declaration of an exception variable
                    catch (InvocationTargetException invocationtargetexception)
                    {
                        throw invocationtargetexception.getCause();
                    }
                    b042504250425042504250425 = ((Integer)obj).intValue();
                    obj = com/visa/cbp/sdk/facade/VisaPaymentSDKImpl.getMethod(nuuuuu.b0417041704170417041704170417("\350\u04A2\266\272\267\311\u04A2\u04A2\u04A2\u04A2", 'C', '\001'), new Class[0]);
                    try
                    {
                        obj = ((Method) (obj)).invoke(null, new Object[0]);
                    }
                    // Misplaced declaration of an exception variable
                    catch (InvocationTargetException invocationtargetexception)
                    {
                        throw invocationtargetexception.getCause();
                    }
                    b042504250425042504250425 = ((Integer)obj).intValue();
                    break;

                case 0: // '\0'
                    break;
                }
                if (i <= 100)
                {
                    break label0;
                }
            }
            obj = new InvalidInputException("Max TVL value should be between 100 and 0");
label1:
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
            throw obj;
        }
label2:
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
                        continue label2;

                    case 1: // '\001'
                        break label2;
                    }
                }
                break;

            case 0: // '\0'
                break label2;

            case 1: // '\001'
                break;
            }
        } while (true);
        obj = settingsDao;
        method = rrrrrr/grrgrg.getMethod(nuuuuu.b0417041704170417041704170417("\\\u0419\u0419\u0419\016\n\f\t\u0419\u0419", '>', '\002'), new Class[] {
            Integer.TYPE
        });
        try
        {
            method.invoke(obj, new Object[] {
                Integer.valueOf(i)
            });
            return;
        }
        // Misplaced declaration of an exception variable
        catch (InvocationTargetException invocationtargetexception)
        {
            throw invocationtargetexception.getCause();
        }
    }

    public void setPasscode(String s)
    {
        Object obj = java/lang/String.getMethod(nuuuuu.b0417041704170417041704170417("LENGTH", '\020', '\003'), new Class[0]);
        obj = ((Method) (obj)).invoke(s, new Object[0]);
        if (((Integer)obj).intValue() < 4) goto _L2; else goto _L1
_L1:
        obj = java/lang/String.getMethod(nuuuuu.b0417041704170417041704170417("\u01B0\u01A9\u01B2\u01AB\u01B8\u01AC", 'l', '\006'), new Class[0]);
        obj = ((Method) (obj)).invoke(s, new Object[0]);
        if (((Integer)obj).intValue() <= 20) goto _L3; else goto _L2
_L2:
        int i = 0;
_L5:
        if (i == 0)
        {
            break MISSING_BLOCK_LABEL_466;
        }
        obj = rrrrrr/ggrrrr.getMethod(nuuuuu.b0417041704170417041704170417("\u012D\u0517\373\377\377\u010E\373\377\377\u010E\u0517\373\377\377\u010E\u0517", 'r', 'Y', '\003'), new Class[] {
            java/lang/String
        });
        s = ((String) (((Method) (obj)).invoke(null, new Object[] {
            s
        })));
        s = (String)s;
        grrgrg grrgrg1;
        try
        {
            grrgrg1 = settingsDao;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw s;
        }
label0:
        do
        {
            i = b042504250425042504250425;
            int j = b042504250425042504250425;
            int l = b042504250425042504250425;
            Object obj1 = com/visa/cbp/sdk/facade/VisaPaymentSDKImpl.getMethod(nuuuuu.b0417041704170417041704170417("\263\341\345\340\222\341\345\340\222\341\345\340\222\u04CD\u04CD\u04CD", '\321', '\002'), new Class[0]);
            try
            {
                obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw s.getCause();
            }
            if ((l * (i + j)) % ((Integer)obj1).intValue() != b042504250425042504250425)
            {
                Object obj2 = com/visa/cbp/sdk/facade/VisaPaymentSDKImpl.getMethod(nuuuuu.b0417041704170417041704170417("\230\u0452fjgy\u0452\u0452\u0452\u0452", '6', '\005'), new Class[0]);
                int k;
                int i1;
                int j1;
                int k1;
                try
                {
                    obj2 = ((Method) (obj2)).invoke(null, new Object[0]);
                }
                // Misplaced declaration of an exception variable
                catch (String s)
                {
                    throw s.getCause();
                }
                b042504250425042504250425 = ((Integer)obj2).intValue();
                b042504250425042504250425 = 39;
            }
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
        try
        {
            i = b042504250425042504250425;
            k = b042504250425042504250425;
            i1 = b042504250425042504250425;
            j1 = b041C041C041C041C041C041C;
            k1 = b042504250425042504250425;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw s;
        }
        if (((i + k) * i1) % j1 == k1)
        {
            break MISSING_BLOCK_LABEL_393;
        }
        obj2 = com/visa/cbp/sdk/facade/VisaPaymentSDKImpl.getMethod(nuuuuu.b0417041704170417041704170417("\uFF7D\u0337\uFF4B\uFF4F\uFF4C\uFF5E\u0337\u0337\u0337\u0337", '\345', '\0'), new Class[0]);
        obj2 = ((Method) (obj2)).invoke(null, new Object[0]);
        i = ((Integer)obj2).intValue();
        b042504250425042504250425 = i;
        b042504250425042504250425 = 80;
        obj2 = rrrrrr/grrgrg.getMethod(nuuuuu.b0417041704170417041704170417("\377\u04BA\255\251\257\252\u04BA\u04BA\u04BA\u04BA", '\235', '\002'), new Class[] {
            java/lang/String
        });
        ((Method) (obj2)).invoke(grrgrg1, new Object[] {
            s
        });
        return;
        s;
        throw s.getCause();
        s;
        throw s.getCause();
        s;
        throw s.getCause();
        s;
        throw s.getCause();
        throw new InvalidInputException("Passcode length should be between 4 and 20");
_L3:
        i = 1;
        if (true) goto _L5; else goto _L4
_L4:
        s;
        throw s.getCause();
    }

    public void suspendToken(LcmParams lcmparams, ResponseCallback responsecallback)
    {
        lllpll lllpll1;
        if (environment == null)
        {
            break MISSING_BLOCK_LABEL_76;
        }
        lllpll1 = new lllpll();
        Method method = com/visa/cbp/sdk/facade/VisaPaymentSDKImpl.getMethod(nuuuuu.b0417041704170417041704170417("\uFFF5\uFFF7\uFFF5\uFFF2\uFFE7\uFFF0\uFFE6\uFFD6\uFFF1\uFFED\uFFE7\uFFF0", '?', '\003'), new Class[] {
            com/visa/cbp/sdk/facade/data/LcmParams, com/visa/cbp/sdk/facade/provider/ResponseCallback, com/visa/cbp/sdk/facade/provider/SuspendTokenProvider
        });
        int i;
        try
        {
            method.invoke(this, new Object[] {
                lcmparams, responsecallback, lllpll1
            });
            return;
        }
        // Misplaced declaration of an exception variable
        catch (LcmParams lcmparams) { }
        // Misplaced declaration of an exception variable
        catch (LcmParams lcmparams)
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
            throw lcmparams;
        }
        break MISSING_BLOCK_LABEL_336;
        i = b042504250425042504250425;
        lcmparams = com/visa/cbp/sdk/facade/VisaPaymentSDKImpl.getMethod(nuuuuu.b0417041704170417041704170417("\uFF9E\u0358\uFF6C\uFF70\uFF6D\uFF7F\uFF6C\uFF70\uFF6D\uFF7F\u0358\u0358\u0358", '\017', '\323', '\002'), new Class[0]);
        try
        {
            lcmparams = ((LcmParams) (lcmparams.invoke(null, new Object[0])));
        }
        // Misplaced declaration of an exception variable
        catch (LcmParams lcmparams)
        {
            throw lcmparams.getCause();
        }
        if (((((Integer)lcmparams).intValue() + i) * b042504250425042504250425) % b041C041C041C041C041C041C != b042504250425042504250425)
        {
            b042504250425042504250425 = 6;
            lcmparams = com/visa/cbp/sdk/facade/VisaPaymentSDKImpl.getMethod(nuuuuu.b0417041704170417041704170417("\u0152\u050C\u0120\u0124\u0121\u0133\u050C\u050C\u050C\u050C", '\360', '\005'), new Class[0]);
            try
            {
                lcmparams = ((LcmParams) (lcmparams.invoke(null, new Object[0])));
            }
            // Misplaced declaration of an exception variable
            catch (LcmParams lcmparams)
            {
                throw lcmparams.getCause();
            }
            b042504250425042504250425 = ((Integer)lcmparams).intValue();
        }
        i = b042504250425042504250425;
        switch ((i * (b042504250425042504250425 + i)) % b041C041C041C041C041C041C)
        {
        default:
            lcmparams = com/visa/cbp/sdk/facade/VisaPaymentSDKImpl.getMethod(nuuuuu.b0417041704170417041704170417("\200\u043ANROa\u043A\u043A\u043A\u043A", '\017', '\001'), new Class[0]);
            try
            {
                lcmparams = ((LcmParams) (lcmparams.invoke(null, new Object[0])));
            }
            // Misplaced declaration of an exception variable
            catch (LcmParams lcmparams)
            {
                throw lcmparams.getCause();
            }
            b042504250425042504250425 = ((Integer)lcmparams).intValue();
            b042504250425042504250425 = 5;
            break;

        case 0: // '\0'
            break;
        }
        try
        {
            throw new SDKModeException("Network calls to Visa are only available in Flow 1.  Since the environment variable is not set, Flow 1 is not enabled within the SDK and Flow2 is assumed.  This method (or this specific overloaded version of this method) should not be called while in Flow 2 mode since you are responsible for all network traffic.: suspendToken(LcmParams lcmParams, final ResponseCallback<TokenStatusResponse, TokenStatusError> suspendCallback)");
        }
        // Misplaced declaration of an exception variable
        catch (LcmParams lcmparams)
        {
            throw lcmparams;
        }
        throw lcmparams.getCause();
    }

    public void suspendToken(LcmParams lcmparams, ResponseCallback responsecallback, SuspendTokenProvider suspendtokenprovider)
    {
        throw new Runtime("d2j fail translate: java.lang.IndexOutOfBoundsException: fromIndex < 0: -1\n\tat java.util.BitSet.nextSetBit(BitSet.java:701)\n\tat com.googlecode.dex2jar.ir.ts.array.FillArrayTransformer.makeSureAllElementAreAssigned(FillArrayTransformer.java:505)\n\tat com.googlecode.dex2jar.ir.ts.array.FillArrayTransformer.transformReportChanged(FillArrayTransformer.java:123)\n\tat com.googlecode.dex2jar.ir.ts.StatedTransformer.transform(StatedTransformer.java:10)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:149)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
    }

    public void suspendToken(LcmParams alcmparams[], ResponseCallback responsecallback)
    {
        if (environment != null)
        {
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
            lllpll lllpll1 = new lllpll();
            Method method = com/visa/cbp/sdk/facade/VisaPaymentSDKImpl.getMethod(nuuuuu.b0417041704170417041704170417("\uFF53\uFF55\uFF53\uFF50\uFF45\uFF4E\uFF44\uFF34\uFF4F\uFF4B\uFF45\uFF4E", '`', '\004'), new Class[] {
                [Lcom/visa/cbp/sdk/facade/data/LcmParams;, com/visa/cbp/sdk/facade/provider/ResponseCallback, com/visa/cbp/sdk/facade/provider/SuspendTokenProvider
            });
            int i;
            try
            {
                method.invoke(this, new Object[] {
                    alcmparams, responsecallback, lllpll1
                });
            }
            // Misplaced declaration of an exception variable
            catch (LcmParams alcmparams[])
            {
                throw alcmparams.getCause();
            }
            i = b042504250425042504250425;
            switch ((i * (b042504250425042504250425 + i)) % b041C041C041C041C041C041C)
            {
            default:
                alcmparams = com/visa/cbp/sdk/facade/VisaPaymentSDKImpl.getMethod(nuuuuu.b0417041704170417041704170417("\u010C\u04C6\332\336\333\355\u04C6\u04C6\u04C6\u04C6", '\210', '"', '\003'), new Class[0]);
                try
                {
                    alcmparams = ((LcmParams []) (alcmparams.invoke(null, new Object[0])));
                }
                // Misplaced declaration of an exception variable
                catch (LcmParams alcmparams[])
                {
                    throw alcmparams.getCause();
                }
                b042504250425042504250425 = ((Integer)alcmparams).intValue();
                alcmparams = com/visa/cbp/sdk/facade/VisaPaymentSDKImpl.getMethod(nuuuuu.b0417041704170417041704170417("\u014E\u0508\u011C\u0120\u011D\u012F\u0508\u0508\u0508\u0508", '\354', '\005'), new Class[0]);
                try
                {
                    alcmparams = ((LcmParams []) (alcmparams.invoke(null, new Object[0])));
                }
                // Misplaced declaration of an exception variable
                catch (LcmParams alcmparams[])
                {
                    throw alcmparams.getCause();
                }
                b042504250425042504250425 = ((Integer)alcmparams).intValue();
                // fall through

            case 0: // '\0'
                return;
            }
        } else
        {
            throw new SDKModeException("Network calls to Visa are only available in Flow 1.  Since the environment variable is not set, Flow 1 is not enabled within the SDK and Flow2 is assumed.  This method (or this specific overloaded version of this method) should not be called while in Flow 2 mode since you are responsible for all network traffic.: uspendToken(LcmParams[] lcmParams, final ResponseCallback<TokenStatusResponse, TokenStatusError> suspendCallback)");
        }
    }

    public void suspendToken(LcmParams alcmparams[], ResponseCallback responsecallback, SuspendTokenProvider suspendtokenprovider)
    {
        throw new Runtime("d2j fail translate: java.lang.IndexOutOfBoundsException: fromIndex < 0: -1\n\tat java.util.BitSet.nextSetBit(BitSet.java:701)\n\tat com.googlecode.dex2jar.ir.ts.array.FillArrayTransformer.makeSureAllElementAreAssigned(FillArrayTransformer.java:505)\n\tat com.googlecode.dex2jar.ir.ts.array.FillArrayTransformer.transformReportChanged(FillArrayTransformer.java:123)\n\tat com.googlecode.dex2jar.ir.ts.StatedTransformer.transform(StatedTransformer.java:10)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:149)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
    }

    public boolean tokensExist()
    {
        int i = b042504250425042504250425;
        switch ((i * (b042504250425042504250425 + i)) % b041C041C041C041C041C041C)
        {
        default:
            Object obj = com/visa/cbp/sdk/facade/VisaPaymentSDKImpl.getMethod(nuuuuu.b0417041704170417041704170417("\u01C4\u057E\u0192\u0196\u0193\u01A5\u057E\u057E\u057E\u057E", '\261', '\001'), new Class[0]);
            InvocationTargetException invocationtargetexception;
            Object obj1;
            int j;
            int k;
            int l;
            try
            {
                obj = ((Method) (obj)).invoke(null, new Object[0]);
            }
            catch (InvocationTargetException invocationtargetexception1)
            {
                throw invocationtargetexception1.getCause();
            }
            b042504250425042504250425 = ((Integer)obj).intValue();
            obj = com/visa/cbp/sdk/facade/VisaPaymentSDKImpl.getMethod(nuuuuu.b0417041704170417041704170417("j\u04248<9K\u0424\u0424\u0424\u0424", 'G', 'O', '\001'), new Class[0]);
            try
            {
                obj = ((Method) (obj)).invoke(null, new Object[0]);
            }
            catch (InvocationTargetException invocationtargetexception2)
            {
                throw invocationtargetexception2.getCause();
            }
            b042504250425042504250425 = ((Integer)obj).intValue();
            // fall through

        case 0: // '\0'
            obj = tokenDao;
            obj1 = rrrrrr/ppplpl.getMethod(nuuuuu.b0417041704170417041704170417("\u0184\u053D\u053D\u053D\u053D\u0152\u0156\u0153\u0164\u053D", 's', '\257', '\003'), new Class[0]);
            break;
        }
        try
        {
            obj = ((Method) (obj1)).invoke(obj, new Object[0]);
        }
        // Misplaced declaration of an exception variable
        catch (InvocationTargetException invocationtargetexception)
        {
            throw invocationtargetexception.getCause();
        }
        obj = (List)obj;
label0:
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
                        break label0;

                    case 1: // '\001'
                        continue label0;
                    }
                }
                break;

            case 0: // '\0'
                break label0;

            case 1: // '\001'
                break;
            }
        } while (true);
        if (obj != null)
        {
            j = b042504250425042504250425;
            k = b042504250425042504250425;
            l = b042504250425042504250425;
            obj1 = com/visa/cbp/sdk/facade/VisaPaymentSDKImpl.getMethod(nuuuuu.b0417041704170417041704170417("\u011A\350\354\351\373\350\354\351\373\350\354\351\373\u04D4\u04D4\u04D4", '\017', '\307', '\001'), new Class[0]);
            try
            {
                obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (InvocationTargetException invocationtargetexception)
            {
                throw invocationtargetexception.getCause();
            }
            if ((l * (j + k)) % ((Integer)obj1).intValue() != b042504250425042504250425)
            {
                obj1 = com/visa/cbp/sdk/facade/VisaPaymentSDKImpl.getMethod(nuuuuu.b0417041704170417041704170417("H\u0436\032\036\033i\u0436\u0436\u0436\u0436", '*', '\002'), new Class[0]);
                try
                {
                    obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
                }
                catch (InvocationTargetException invocationtargetexception3)
                {
                    throw invocationtargetexception3.getCause();
                }
                b042504250425042504250425 = ((Integer)obj1).intValue();
                b042504250425042504250425 = 76;
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
            obj1 = java/util/List.getMethod(nuuuuu.b0417041704170417041704170417("\306\334\317\320", '\265', '\002'), new Class[0]);
            try
            {
                obj = ((Method) (obj1)).invoke(obj, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (InvocationTargetException invocationtargetexception)
            {
                throw invocationtargetexception.getCause();
            }
            if (((Integer)obj).intValue() > 0)
            {
                return true;
            }
        }
        return false;
    }

    public boolean verifyPasscode(String s)
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
        Object obj;
        Method method;
        int i;
        int j;
        int k;
        try
        {
            i = b042504250425042504250425;
            j = b042504250425042504250425;
            k = b041C041C041C041C041C041C;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw s;
        }
        (i * (j + i)) % k;
        JVM INSTR tableswitch 0 0: default 96
    //                   0 190;
           goto _L1 _L2
_L1:
        try
        {
            b042504250425042504250425 = 63;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw s;
        }
        obj = com/visa/cbp/sdk/facade/VisaPaymentSDKImpl.getMethod(nuuuuu.b0417041704170417041704170417("\uFF6C\u0326\uFF3A\uFF3E\uFF3B\uFF4D\u0326\u0326\u0326\u0326", 'R', '\004'), new Class[0]);
        obj = ((Method) (obj)).invoke(null, new Object[0]);
        i = ((Integer)obj).intValue();
        b042504250425042504250425 = i;
        i = b042504250425042504250425;
        switch ((i * (b042504250425042504250425 + i)) % b041C041C041C041C041C041C)
        {
        default:
            b042504250425042504250425 = 73;
            b042504250425042504250425 = 6;
            break;

        case 0: // '\0'
            break;
        }
_L2:
        obj = rrrrrr/ggrrrr.getMethod(nuuuuu.b0417041704170417041704170417("\376\u04E8\314\320\320\337\314\320\320\337\u04E8\314\320\320\337\u04E8", '\234', '\005'), new Class[] {
            java/lang/String
        });
        s = ((String) (((Method) (obj)).invoke(null, new Object[] {
            s
        })));
        s = (String)s;
        obj = settingsDao;
        method = rrrrrr/grrgrg.getMethod(nuuuuu.b0417041704170417041704170417("\uFEA8\uFE76\uFE7A\uFE78\uFE7D\u026D\u026D\u026D\u026D\u026D", '\335', '\003'), new Class[0]);
        obj = method.invoke(obj, new Object[0]);
        obj = (String)obj;
        method = java/lang/String.getMethod(nuuuuu.b0417041704170417041704170417("\361\345\341\365\370\347", '\224', '\002'), new Class[] {
            java/lang/Object
        });
        s = ((String) (method.invoke(s, new Object[] {
            obj
        })));
        return ((Boolean)s).booleanValue();
        s;
        throw s.getCause();
        s;
        throw s.getCause();
        s;
        throw s.getCause();
        s;
        throw s.getCause();
    }

    static 
    {
        Object obj;
        Exception exception;
        Object obj2;
        int i;
        int j;
        try
        {
            i = b042504250425042504250425;
            j = b042504250425042504250425;
        }
        catch (Exception exception1)
        {
            throw exception1;
        }
        obj = com/visa/cbp/sdk/facade/VisaPaymentSDKImpl.getMethod(nuuuuu.b0417041704170417041704170417("\uFF2E\uFEFC\uFF00\uFEFD\uFF0F\uFEFC\uFF00\uFEFD\uFF0F\uFEFC\uFF00\uFEFD\uFF0F\u02E8\u02E8\u02E8", '\271', '{', '\0'), new Class[0]);
        obj = ((Method) (obj)).invoke(null, new Object[0]);
        switch (((j + i) * i) % ((Integer)obj).intValue())
        {
        default:
            try
            {
                b042504250425042504250425 = 91;
                b042504250425042504250425 = 94;
            }
            catch (Exception exception2)
            {
                throw exception2;
            }
            // fall through

        case 0: // '\0'
            obj = java/lang/Class.getMethod(nuuuuu.b0417041704170417041704170417("\033\031(\007\035!$ \031\002\025!\031", 'y', '\305', '\002'), new Class[0]);
            break;
        }
        obj = ((Method) (obj)).invoke(com/visa/cbp/sdk/facade/VisaPaymentSDKImpl, new Object[0]);
        obj = (String)obj;
        i = b042504250425042504250425;
        switch ((i * (b042504250425042504250425 + i)) % b041C041C041C041C041C041C)
        {
        default:
            obj2 = com/visa/cbp/sdk/facade/VisaPaymentSDKImpl.getMethod(nuuuuu.b0417041704170417041704170417("\uFFE2\u039C\uFFB0\uFFB4\uFFB1\uFFC3\u039C\u039C\u039C\u039C", '@', '\003'), new Class[0]);
            Object obj1;
            try
            {
                obj2 = ((Method) (obj2)).invoke(null, new Object[0]);
            }
            catch (InvocationTargetException invocationtargetexception)
            {
                throw invocationtargetexception.getCause();
            }
            b042504250425042504250425 = ((Integer)obj2).intValue();
            b042504250425042504250425 = 70;
            break;

        case 0: // '\0'
            break;
        }
        TAG = ((String) (obj));
        return;
        exception;
        throw exception;
        obj1;
        throw obj1;
        obj1;
        throw ((InvocationTargetException) (obj1)).getCause();
        obj1;
        throw ((InvocationTargetException) (obj1)).getCause();
    }

    private class _cls1
        implements CheckStatusCallback
    {

        public static int b043204320432043204320432 = 0;
        public static int b043204320432043204320432 = 1;
        public static int b043204320432043204320432 = 2;
        public static int b043204320432043204320432 = 18;
        final VisaPaymentSDKImpl this$0;
        final ResponseCallback val$checkStatusCallback;

        public static int b043204320432043204320432()
        {
            return 43;
        }

        public static int b043204320432043204320432()
        {
            return 2;
        }

        public static int b043204320432043204320432()
        {
            return 1;
        }

        public void failure(CbpError cbperror)
        {
            ResponseCallback responsecallback;
            Method method;
            int i;
            int j;
            int k;
            int l;
            int i1;
            try
            {
                responsecallback = checkStatusCallback;
            }
            // Misplaced declaration of an exception variable
            catch (CbpError cbperror)
            {
                throw cbperror;
            }
            method = com/visa/cbp/sdk/facade/provider/ResponseCallback.getMethod(nuuuuu.b0417041704170417041704170417("\003\uFFFE\006\t\022\017\002", '+', '\216', '\002'), new Class[] {
                com/visa/cbp/sdk/facade/error/CbpError
            });
            method.invoke(responsecallback, new Object[] {
                cbperror
            });
            i = b043204320432043204320432;
            cbperror = com/visa/cbp/sdk/facade/VisaPaymentSDKImpl$1.getMethod(nuuuuu.b0417041704170417041704170417("\204\u04D4\u04D4\u04D4\326\322\325\324\326\322\325\324\u04D4", '\346', '\002'), new Class[0]);
            cbperror = ((CbpError) (cbperror.invoke(null, new Object[0])));
            j = ((Integer)cbperror).intValue();
            k = b043204320432043204320432;
            l = b043204320432043204320432;
            i1 = b043204320432043204320432;
            if (((j + i) * k) % l == i1)
            {
                break MISSING_BLOCK_LABEL_170;
            }
            cbperror = com/visa/cbp/sdk/facade/VisaPaymentSDKImpl$1.getMethod(nuuuuu.b0417041704170417041704170417("\207UYXW\u0457UYXW\u0457UYXW\u0457", '\366', '\321', '\002'), new Class[0]);
            cbperror = ((CbpError) (cbperror.invoke(null, new Object[0])));
            i = ((Integer)cbperror).intValue();
            b043204320432043204320432 = i;
            b043204320432043204320432 = 9;
            return;
            cbperror;
            throw cbperror.getCause();
            cbperror;
            throw cbperror.getCause();
            cbperror;
            try
            {
                throw cbperror.getCause();
            }
            // Misplaced declaration of an exception variable
            catch (CbpError cbperror)
            {
                throw cbperror;
            }
        }

        public void success(CheckStatusResponse checkstatusresponse, List list, GenericResponse genericresponse)
        {
            checkstatusresponse = checkStatusCallback;
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
            if (((b043204320432043204320432 + b043204320432043204320432) * b043204320432043204320432) % b043204320432043204320432 != b043204320432043204320432)
            {
                b043204320432043204320432 = 66;
                list = com/visa/cbp/sdk/facade/VisaPaymentSDKImpl$1.getMethod(nuuuuu.b0417041704170417041704170417("\uFE84\uFE52\uFE56\uFE55\uFE54\u0254\uFE52\uFE56\uFE55\uFE54\u0254\uFE52\uFE56\uFE55\uFE54\u0254", '\357', '\003'), new Class[0]);
                try
                {
                    list = ((List) (list.invoke(null, new Object[0])));
                }
                // Misplaced declaration of an exception variable
                catch (CheckStatusResponse checkstatusresponse)
                {
                    throw checkstatusresponse.getCause();
                }
                b043204320432043204320432 = ((Integer)list).intValue();
            }
            list = com/visa/cbp/sdk/facade/provider/ResponseCallback.getMethod(nuuuuu.b0417041704170417041704170417("\uFFC0\uFFC2\uFFB0\uFFB0\uFFB2\uFFC0\uFFC0", '\227', '\034', '\0'), new Class[] {
                java/lang/Object, com/visa/cbp/sdk/facade/data/GenericResponse
            });
            try
            {
                list.invoke(checkstatusresponse, new Object[] {
                    null, genericresponse
                });
                return;
            }
            // Misplaced declaration of an exception variable
            catch (CheckStatusResponse checkstatusresponse)
            {
                throw checkstatusresponse.getCause();
            }
        }

        _cls1()
        {
            this$0 = VisaPaymentSDKImpl.this;
            checkStatusCallback = responsecallback;
            super();
        }
    }

}
