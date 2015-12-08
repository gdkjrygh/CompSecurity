// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rrrrrr;

import com.visa.cbp.external.lcm.LcmTokenRequest;
import com.visa.cbp.sdk.facade.api.CommonRestAdapter;
import com.visa.cbp.sdk.facade.error.CbpError;
import com.visa.cbp.sdk.facade.error.TokenStatusError;
import com.visa.cbp.sdk.facade.provider.InnerCallback;
import com.visa.cbp.sdk.facade.provider.ResponseCallback;
import com.visa.cbp.sdk.facade.provider.ResumeTokenProvider;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import uuuuuu.nuuuuu;

// Referenced classes of package rrrrrr:
//            lplplp, llplll, lpplll

public class pllppp extends lplplp
    implements ResumeTokenProvider
{

    public static int b041304130413041304130413 = 1;
    public static int b041304130413041304130413 = 49;
    public static int b041304130413041304130413 = 0;
    public static int b041304130413041304130413 = 2;

    public pllppp()
    {
        Object obj;
        InvocationTargetException invocationtargetexception;
        int i;
        int j;
        int k;
        int l;
        int i1;
        try
        {
            i = b041304130413041304130413;
            j = b041304130413041304130413;
            k = b041304130413041304130413;
            l = b041304130413041304130413;
            i1 = b041304130413041304130413;
        }
        catch (Exception exception)
        {
            throw exception;
        }
        if (((i + j) * k) % l == i1)
        {
            break MISSING_BLOCK_LABEL_120;
        }
        obj = rrrrrr/pllppp.getMethod(nuuuuu.b0417041704170417041704170417("\uFDB9\u016C\uFD87\uFD8B\uFD88\uFD8C\u016C\u016C\u016C\uFD87\uFD8B\uFD88\uFD8C\uFD87\uFD8B\uFD88\uFD8C", '\343', '\004'), new Class[0]);
        obj = ((Method) (obj)).invoke(null, new Object[0]);
        i = ((Integer)obj).intValue();
        b041304130413041304130413 = i;
        obj = rrrrrr/pllppp.getMethod(nuuuuu.b0417041704170417041704170417("\363\u04A6\301\305\302\306\u04A6\u04A6\u04A6\301\305\302\306\301\305\302\306", '9', 'X', '\003'), new Class[0]);
        obj = ((Method) (obj)).invoke(null, new Object[0]);
        i = ((Integer)obj).intValue();
        b041304130413041304130413 = i;
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
        if (((b041304130413041304130413 + b041304130413041304130413) * b041304130413041304130413) % b041304130413041304130413 != b041304130413041304130413)
        {
            b041304130413041304130413 = 88;
            obj = rrrrrr/pllppp.getMethod(nuuuuu.b0417041704170417041704170417("\370\u04AB\306\312\307\313\u04AB\u04AB\u04AB\306\312\307\313\306\312\307\313", '\243', '\r', '\002'), new Class[0]);
            Object obj1;
            try
            {
                obj = ((Method) (obj)).invoke(null, new Object[0]);
            }
            catch (InvocationTargetException invocationtargetexception1)
            {
                throw invocationtargetexception1.getCause();
            }
            b041304130413041304130413 = ((Integer)obj).intValue();
        }
        try
        {
            super();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            throw obj1;
        }
        invocationtargetexception;
        throw invocationtargetexception.getCause();
        obj1;
        throw ((InvocationTargetException) (obj1)).getCause();
    }

    public static int b0415041504150415041504150415()
    {
        return 0;
    }

    public static int b0415041504150415041504150415()
    {
        return 18;
    }

    public static int b0415041504150415041504150415()
    {
        return 1;
    }

    public void b044704470447044704470447(LcmTokenRequest lcmtokenrequest, ResponseCallback responsecallback)
    {
        Object obj = rrrrrr/llplll.getMethod(nuuuuu.b0417041704170417041704170417("\uFF89\u036E\u036E\uFF57\uFF5B\uFF5B\uFF5E\u036E\u036E\uFF57\uFF5B\uFF5B\uFF5E", '\231', '@', '\0'), new Class[0]);
        obj = ((Method) (obj)).invoke(null, new Object[0]);
        obj = (llplll)obj;
        obj = ((llplll) (obj)).b043604360436043604360436();
        Method method;
        try
        {
            responsecallback = new InnerCallback(responsecallback);
        }
        // Misplaced declaration of an exception variable
        catch (LcmTokenRequest lcmtokenrequest)
        {
            throw lcmtokenrequest;
        }
        method = com/visa/cbp/sdk/facade/api/CommonRestAdapter.getMethod(nuuuuu.b0417041704170417041704170417("\uFF92\uFF85\uFF93\uFF95\uFF8D\uFF85", 'p', '\003'), new Class[] {
            com/visa/cbp/external/lcm/LcmTokenRequest, com/visa/cbp/sdk/facade/provider/InnerCallback
        });
        method.invoke(obj, new Object[] {
            lcmtokenrequest, responsecallback
        });
        if (((b041304130413041304130413 + b041304130413041304130413) * b041304130413041304130413) % b041304130413041304130413 != b041304130413041304130413)
        {
            lcmtokenrequest = rrrrrr/pllppp.getMethod(nuuuuu.b0417041704170417041704170417("\u01B6\u0569\u0184\u0188\u0185\u0189\u0569\u0569\u0569\u0184\u0188\u0185\u0189\u0184\u0188\u0185\u0189", 'V', '\376', '\003'), new Class[0]);
            try
            {
                lcmtokenrequest = ((LcmTokenRequest) (lcmtokenrequest.invoke(null, new Object[0])));
            }
            // Misplaced declaration of an exception variable
            catch (LcmTokenRequest lcmtokenrequest)
            {
                throw lcmtokenrequest.getCause();
            }
            b041304130413041304130413 = ((Integer)lcmtokenrequest).intValue();
            lcmtokenrequest = rrrrrr/pllppp.getMethod(nuuuuu.b0417041704170417041704170417("\uFEEA\u029D\uFEB8\uFEBC\uFEB9\uFEBD\u029D\u029D\u029D\uFEB8\uFEBC\uFEB9\uFEBD\uFEB8\uFEBC\uFEB9\uFEBD", '\274', '\003'), new Class[0]);
            try
            {
                lcmtokenrequest = ((LcmTokenRequest) (lcmtokenrequest.invoke(null, new Object[0])));
            }
            // Misplaced declaration of an exception variable
            catch (LcmTokenRequest lcmtokenrequest)
            {
                throw lcmtokenrequest.getCause();
            }
            b041304130413041304130413 = ((Integer)lcmtokenrequest).intValue();
            if (((b041304130413041304130413 + b041304130413041304130413) * b041304130413041304130413) % b041304130413041304130413 != b041304130413041304130413)
            {
                lcmtokenrequest = rrrrrr/pllppp.getMethod(nuuuuu.b0417041704170417041704170417("\uFFAF\u0362\uFF7D\uFF81\uFF7E\uFF82\u0362\u0362\u0362\uFF7D\uFF81\uFF7E\uFF82\uFF7D\uFF81\uFF7E\uFF82", '\263', '\0'), new Class[0]);
                try
                {
                    lcmtokenrequest = ((LcmTokenRequest) (lcmtokenrequest.invoke(null, new Object[0])));
                }
                // Misplaced declaration of an exception variable
                catch (LcmTokenRequest lcmtokenrequest)
                {
                    throw lcmtokenrequest.getCause();
                }
                b041304130413041304130413 = ((Integer)lcmtokenrequest).intValue();
                b041304130413041304130413 = 45;
            }
        }
        return;
        lcmtokenrequest;
        try
        {
            throw lcmtokenrequest.getCause();
        }
        // Misplaced declaration of an exception variable
        catch (LcmTokenRequest lcmtokenrequest) { }
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
        throw lcmtokenrequest;
        lcmtokenrequest;
        throw lcmtokenrequest.getCause();
    }

    public void b042B042B042B042B042B042B(Object obj, ResponseCallback responsecallback)
    {
        Method method;
        try
        {
            obj = (LcmTokenRequest)obj;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw obj;
        }
        method = rrrrrr/pllppp.getMethod(nuuuuu.b0417041704170417041704170417("\uFF49\uFF17\uFF1B\uFF1B\uFF1E\uFF17\uFF1B\uFF1B\uFF1E\uFF17\uFF1B\uFF1B\uFF1E\u032E\uFF17\uFF1B\uFF1B\uFF1E\uFF17\uFF1B\uFF1B\uFF1E", '\205', '\224', '\0'), new Class[] {
            com/visa/cbp/external/lcm/LcmTokenRequest, com/visa/cbp/sdk/facade/provider/ResponseCallback
        });
        try
        {
            method.invoke(this, new Object[] {
                obj, responsecallback
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
    }

    public void b042B042B042B042B042B042B(CbpError cbperror, ResponseCallback responsecallback)
    {
        int i = b041304130413041304130413;
        int k = b041304130413041304130413;
        int l = b041304130413041304130413;
        int i1 = b041304130413041304130413;
        Object obj = rrrrrr/pllppp.getMethod(nuuuuu.b0417041704170417041704170417("\272\210\214\211\215\210\214\211\215\u046D\u046D\u046D\210\214\211\215\210\214\211\215", '\254', 'T', '\002'), new Class[0]);
        try
        {
            obj = ((Method) (obj)).invoke(null, new Object[0]);
        }
        // Misplaced declaration of an exception variable
        catch (CbpError cbperror)
        {
            throw cbperror.getCause();
        }
        if (((i + k) * l) % i1 != ((Integer)obj).intValue())
        {
            Object obj1 = rrrrrr/pllppp.getMethod(nuuuuu.b0417041704170417041704170417("\uFE70\u0223\uFE3E\uFE42\uFE3F\uFE43\u0223\u0223\u0223\uFE3E\uFE42\uFE3F\uFE43\uFE3E\uFE42\uFE3F\uFE43", '\371', '\003'), new Class[0]);
            int j;
            try
            {
                obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (CbpError cbperror)
            {
                throw cbperror.getCause();
            }
            b041304130413041304130413 = ((Integer)obj1).intValue();
            b041304130413041304130413 = 12;
        }
label0:
        do
        {
            j = b041304130413041304130413;
            switch ((j * (b041304130413041304130413 + j)) % b041304130413041304130413)
            {
            default:
                b041304130413041304130413 = 37;
                obj1 = rrrrrr/pllppp.getMethod(nuuuuu.b0417041704170417041704170417("\u0239\u05EC\u0207\u020B\u0208\u020C\u05EC\u05EC\u05EC\u0207\u020B\u0208\u020C\u0207\u020B\u0208\u020C", '\235', '\006'), new Class[0]);
                try
                {
                    obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
                }
                // Misplaced declaration of an exception variable
                catch (CbpError cbperror)
                {
                    throw cbperror.getCause();
                }
                b041304130413041304130413 = ((Integer)obj1).intValue();
                // fall through

            case 0: // '\0'
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
                break;
            }
        } while (true);
        obj1 = rrrrrr/lpplll.getMethod(nuuuuu.b0417041704170417041704170417("a/336/336/336/336\u0446/336", '\001', '\0'), new Class[] {
            com/visa/cbp/sdk/facade/error/CbpError
        });
        try
        {
            cbperror = ((CbpError) (((Method) (obj1)).invoke(null, new Object[] {
                cbperror
            })));
        }
        // Misplaced declaration of an exception variable
        catch (CbpError cbperror)
        {
            throw cbperror.getCause();
        }
        cbperror = (TokenStatusError)cbperror;
        obj1 = com/visa/cbp/sdk/facade/provider/ResponseCallback.getMethod(nuuuuu.b0417041704170417041704170417("\u015B\u0156\u015E\u0161\u016A\u0167\u015A", 'q', '\204', '\003'), new Class[] {
            com/visa/cbp/sdk/facade/error/CbpError
        });
        try
        {
            ((Method) (obj1)).invoke(responsecallback, new Object[] {
                cbperror
            });
            return;
        }
        // Misplaced declaration of an exception variable
        catch (CbpError cbperror)
        {
            throw cbperror.getCause();
        }
    }
}
