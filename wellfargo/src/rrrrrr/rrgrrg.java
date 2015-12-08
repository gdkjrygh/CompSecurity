// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rrrrrr;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.visa.cbp.external.aam.ReplenishAckRequest;
import com.visa.cbp.external.aam.ReplenishRequest;
import com.visa.cbp.external.aam.ReplenishResponse;
import com.visa.cbp.external.common.Status;
import com.visa.cbp.external.common.TokenInfo;
import com.visa.cbp.sdk.facade.activeaccountmanagement.CheckStatusService;
import com.visa.cbp.sdk.facade.data.GenericResponse;
import com.visa.cbp.sdk.facade.data.TokenKey;
import com.visa.cbp.sdk.facade.data.TokenStatus;
import com.visa.cbp.sdk.facade.error.CbpError;
import com.visa.cbp.sdk.facade.error.ReasonCode;
import com.visa.cbp.sdk.facade.error.SDKErrorType;
import com.visa.cbp.sdk.facade.provider.ReplenishmentProvider;
import com.visa.cbp.sdk.facade.provider.ResponseCallback;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import uuuuuu.nuuuuu;

// Referenced classes of package rrrrrr:
//            ggrrgg, ppplpl, pplplp, lpplll, 
//            llllpp

public class rrgrrg
    implements ResponseCallback
{

    public static int b041D041D041D041D041D041D_int_static_fld = 1;
    public static int b041D041D041D041D041D041D_int_static_fld = 76;
    public static int b041D041D041D041D041D041D_int_static_fld = 0;
    public static int b041D041D041D041D041D041D_int_static_fld = 2;
    public final ResponseCallback b041D041D041D041D041D041D_com_visa_cbp_sdk_facade_provider_ResponseCallback_fld;
    public final ReplenishRequest b041D041D041D041D041D041D_com_visa_cbp_external_aam_ReplenishRequest_fld;
    public final ggrrgg b041D041D041D041D041D041D_rrrrrr_ggrrgg_fld;

    public rrgrrg(ggrrgg ggrrgg1, ReplenishRequest replenishrequest, ResponseCallback responsecallback)
    {
        int i;
        int j;
        int k;
        int l;
        int i1;
        try
        {
            b041D041D041D041D041D041D_rrrrrr_ggrrgg_fld = ggrrgg1;
        }
        // Misplaced declaration of an exception variable
        catch (ggrrgg ggrrgg1)
        {
            throw ggrrgg1;
        }
        try
        {
            b041D041D041D041D041D041D_com_visa_cbp_external_aam_ReplenishRequest_fld = replenishrequest;
        }
        // Misplaced declaration of an exception variable
        catch (ggrrgg ggrrgg1)
        {
            throw ggrrgg1;
        }
        switch (1)
        {
        default:
            do
            {
                ggrrgg1 = rrrrrr/rrgrrg.getMethod(nuuuuu.b0417041704170417041704170417("\uFF6D\uFF3B\uFF3F\uFF3F\uFF3B\u034B\u034B\u034B\u034B\uFF3B\uFF3F\uFF3F\uFF3B", '\365', '\0'), new Class[0]);
                try
                {
                    ggrrgg1 = ((ggrrgg) (ggrrgg1.invoke(null, new Object[0])));
                }
                // Misplaced declaration of an exception variable
                catch (ggrrgg ggrrgg1)
                {
                    throw ggrrgg1.getCause();
                }
                i = ((Integer)ggrrgg1).intValue();
                j = b041D041D041D041D041D041D_int_static_fld;
                ggrrgg1 = rrrrrr/rrgrrg.getMethod(nuuuuu.b0417041704170417041704170417("\206TXXT\u0464\u0464\u0464\u0464TXXT", '\022', '\001'), new Class[0]);
                try
                {
                    ggrrgg1 = ((ggrrgg) (ggrrgg1.invoke(null, new Object[0])));
                }
                // Misplaced declaration of an exception variable
                catch (ggrrgg ggrrgg1)
                {
                    throw ggrrgg1.getCause();
                }
                k = ((Integer)ggrrgg1).intValue();
                ggrrgg1 = rrrrrr/rrgrrg.getMethod(nuuuuu.b0417041704170417041704170417("\uFE0D\u01EB\uFDDB\uFDDF\uFDDF\uFDDB\u01EB\u01EB\u01EB\uFDDB\uFDDF\uFDDF\uFDDB", '\307', '\004'), new Class[0]);
                try
                {
                    ggrrgg1 = ((ggrrgg) (ggrrgg1.invoke(null, new Object[0])));
                }
                // Misplaced declaration of an exception variable
                catch (ggrrgg ggrrgg1)
                {
                    throw ggrrgg1.getCause();
                }
                if (((j + i) * k) % ((Integer)ggrrgg1).intValue() != b041D041D041D041D041D041D_int_static_fld)
                {
                    ggrrgg1 = rrrrrr/rrgrrg.getMethod(nuuuuu.b0417041704170417041704170417("\u014F\u011D\u0121\u0121\u011D\u052D\u052D\u052D\u052D\u011D\u0121\u0121\u011D", '\355', '\005'), new Class[0]);
                    try
                    {
                        ggrrgg1 = ((ggrrgg) (ggrrgg1.invoke(null, new Object[0])));
                    }
                    // Misplaced declaration of an exception variable
                    catch (ggrrgg ggrrgg1)
                    {
                        throw ggrrgg1.getCause();
                    }
                    b041D041D041D041D041D041D_int_static_fld = ((Integer)ggrrgg1).intValue();
                    b041D041D041D041D041D041D_int_static_fld = 74;
                }
                switch (0)
                {
                case 0: // '\0'
                    break MISSING_BLOCK_LABEL_235;

                case 1: // '\001'
                    break MISSING_BLOCK_LABEL_10;
                }
            } while (true);

        case 0: // '\0'
            break MISSING_BLOCK_LABEL_10;

        case 1: // '\001'
            break MISSING_BLOCK_LABEL_235;
        }
        b041D041D041D041D041D041D_com_visa_cbp_sdk_facade_provider_ResponseCallback_fld = responsecallback;
        i = b041D041D041D041D041D041D_int_static_fld;
        j = b041D041D041D041D041D041D_int_static_fld;
        k = b041D041D041D041D041D041D_int_static_fld;
        l = b041D041D041D041D041D041D_int_static_fld;
        i1 = b041D041D041D041D041D041D_int_static_fld;
        if (((i + j) * k) % l == i1)
        {
            break MISSING_BLOCK_LABEL_368;
        }
        ggrrgg1 = rrrrrr/rrgrrg.getMethod(nuuuuu.b0417041704170417041704170417("\uFFF3\uFFC1\uFFC5\uFFC5\uFFC1\u03D1\u03D1\u03D1\u03D1\uFFC1\uFFC5\uFFC5\uFFC1", 'N', '!', '\0'), new Class[0]);
        ggrrgg1 = ((ggrrgg) (ggrrgg1.invoke(null, new Object[0])));
        i = ((Integer)ggrrgg1).intValue();
        b041D041D041D041D041D041D_int_static_fld = i;
        ggrrgg1 = rrrrrr/rrgrrg.getMethod(nuuuuu.b0417041704170417041704170417("\uFD98\uFD66\uFD6A\uFD6A\uFD66\u0176\u0176\u0176\u0176\uFD66\uFD6A\uFD6A\uFD66", '\356', '\004'), new Class[0]);
        ggrrgg1 = ((ggrrgg) (ggrrgg1.invoke(null, new Object[0])));
        i = ((Integer)ggrrgg1).intValue();
        b041D041D041D041D041D041D_int_static_fld = i;
        super();
        return;
        ggrrgg1;
        throw ggrrgg1.getCause();
        ggrrgg1;
        throw ggrrgg1.getCause();
    }

    public static int b044004400440044004400440()
    {
        return 13;
    }

    public static int b044004400440044004400440()
    {
        return 2;
    }

    public static int b044004400440044004400440()
    {
        return 1;
    }

    public void b044004400440044004400440(ReplenishResponse replenishresponse, GenericResponse genericresponse)
    {
        Object obj;
        Object obj1;
        int i;
        try
        {
            genericresponse = b041D041D041D041D041D041D_rrrrrr_ggrrgg_fld;
            obj = b041D041D041D041D041D041D_com_visa_cbp_external_aam_ReplenishRequest_fld.getTokenInfo();
        }
        // Misplaced declaration of an exception variable
        catch (ReplenishResponse replenishresponse)
        {
            throw replenishresponse;
        }
        i = b041D041D041D041D041D041D_int_static_fld;
        obj1 = rrrrrr/rrgrrg.getMethod(nuuuuu.b0417041704170417041704170417("<\u041A\u041A\n\016\016\n\u041A\u041A\n\016\016\n", '\276', '\344', '\002'), new Class[0]);
        try
        {
            obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
        }
        // Misplaced declaration of an exception variable
        catch (ReplenishResponse replenishresponse)
        {
            throw replenishresponse.getCause();
        }
        switch (((((Integer)obj1).intValue() + i) * i) % b041D041D041D041D041D041D_int_static_fld)
        {
        default:
            b041D041D041D041D041D041D_int_static_fld = 12;
            Object obj2 = rrrrrr/rrgrrg.getMethod(nuuuuu.b0417041704170417041704170417("\u0260\u022E\u0232\u0232\u022E\u063E\u063E\u063E\u063E\u022E\u0232\u0232\u022E", '\252', '\006'), new Class[0]);
            int j;
            boolean flag;
            boolean flag1;
            try
            {
                obj2 = ((Method) (obj2)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (ReplenishResponse replenishresponse)
            {
                throw replenishresponse.getCause();
            }
            b041D041D041D041D041D041D_int_static_fld = ((Integer)obj2).intValue();
            // fall through

        case 0: // '\0'
            obj2 = rrrrrr/ggrrgg.getMethod(nuuuuu.b0417041704170417041704170417("\uFFF4\u03DC\uFFC2\uFFC6\uFFC6\uFFD3\u03DC\u03DC\uFFC2\uFFC6\uFFC6\uFFD3\uFFC2\uFFC6\uFFC6\uFFD3", '7', '\003'), new Class[] {
                com/visa/cbp/external/common/TokenInfo
            });
            break;
        }
        genericresponse = ((GenericResponse) (((Method) (obj2)).invoke(genericresponse, new Object[] {
            obj
        })));
        genericresponse = (TokenKey)genericresponse;
        obj = b041D041D041D041D041D041D_rrrrrr_ggrrgg_fld;
        obj2 = rrrrrr/ggrrgg.getMethod(nuuuuu.b0417041704170417041704170417("\uFFD5\u0392\u0392\uFFA3\uFFA7\uFFA4\uFFB9\u0392\uFFA3\uFFA7\uFFA4\uFFB9\u0392", '/', '\004'), new Class[] {
            rrrrrr/ggrrgg, com/visa/cbp/sdk/facade/data/TokenKey, com/visa/cbp/external/aam/ReplenishResponse
        });
        obj = ((Method) (obj2)).invoke(null, new Object[] {
            obj, genericresponse, replenishresponse
        });
        flag = ((Boolean)obj).booleanValue();
        obj = b041D041D041D041D041D041D_rrrrrr_ggrrgg_fld;
        obj2 = rrrrrr/ggrrgg.getMethod(nuuuuu.b0417041704170417041704170417("\u01FD\u01CB\u01CF\u01CC\u01E1\u05BA\u01CB\u01CF\u01CC\u01E1\u05BA\u01CB\u01CF\u01CC\u01E1\u05BA", '\211', '\006'), new Class[] {
            rrrrrr/ggrrgg, com/visa/cbp/sdk/facade/data/TokenKey, com/visa/cbp/external/aam/ReplenishResponse
        });
        replenishresponse = ((ReplenishResponse) (((Method) (obj2)).invoke(null, new Object[] {
            obj, genericresponse, replenishresponse
        })));
        flag1 = ((Boolean)replenishresponse).booleanValue();
        replenishresponse = b041D041D041D041D041D041D_rrrrrr_ggrrgg_fld;
        obj = rrrrrr/ggrrgg.getMethod(nuuuuu.b0417041704170417041704170417("D\u0401\022\026\023(\022\026\023(\u0401\022\026\023(\u0401", '\036', '\0'), new Class[] {
            rrrrrr/ggrrgg
        });
        replenishresponse = ((ReplenishResponse) (((Method) (obj)).invoke(null, new Object[] {
            replenishresponse
        })));
        replenishresponse = (ppplpl)replenishresponse;
        obj = rrrrrr/ppplpl.getMethod(nuuuuu.b0417041704170417041704170417("\uFFC8\uFF96\uFF9A\uFF97\uFFA8\u0381\uFF96\uFF9A\uFF97\uFFA8\u0381\uFF96\uFF9A\uFF97\uFFA8\u0381", '\232', '\0'), new Class[] {
            com/visa/cbp/sdk/facade/data/TokenKey
        });
        replenishresponse = ((ReplenishResponse) (((Method) (obj)).invoke(replenishresponse, new Object[] {
            genericresponse
        })));
        ((Integer)replenishresponse).intValue();
        replenishresponse = b041D041D041D041D041D041D_rrrrrr_ggrrgg_fld;
        obj = rrrrrr/ggrrgg.getMethod(nuuuuu.b0417041704170417041704170417("\u0220\u05DD\u01EE\u01F2\u01EF\u0204\u01EE\u01F2\u01EF\u0204\u05DD\u01EE\u01F2\u01EF\u0204\u05DD", '\337', '\001'), new Class[] {
            rrrrrr/ggrrgg
        });
        replenishresponse = ((ReplenishResponse) (((Method) (obj)).invoke(null, new Object[] {
            replenishresponse
        })));
        replenishresponse = (ppplpl)replenishresponse;
        obj = rrrrrr/ppplpl.getMethod(nuuuuu.b0417041704170417041704170417("\uFF84\uFF52\uFF56\uFF53\uFF64\uFF52\uFF56\uFF53\uFF64\uFF52\uFF56\uFF53\uFF64\u033D\uFF52\uFF56\uFF53\uFF64\u033D", '\311', '\025', '\0'), new Class[] {
            com/visa/cbp/sdk/facade/data/TokenKey
        });
        replenishresponse = ((ReplenishResponse) (((Method) (obj)).invoke(replenishresponse, new Object[] {
            genericresponse
        })));
        ((Boolean)replenishresponse).booleanValue();
        replenishresponse = new Status();
        try
        {
            obj = TokenStatus.ACTIVE;
        }
        // Misplaced declaration of an exception variable
        catch (ReplenishResponse replenishresponse)
        {
            throw replenishresponse;
        }
        obj2 = com/visa/cbp/sdk/facade/data/TokenStatus.getMethod(nuuuuu.b0417041704170417041704170417("\uFFC3\uFFC1\uFFD0\uFFB2\uFFBD\uFFC8\uFFD1\uFFC1", '\244', '\0'), new Class[0]);
        obj = ((Method) (obj2)).invoke(obj, new Object[0]);
        obj = (String)obj;
        obj2 = com/visa/cbp/external/common/Status.getMethod(nuuuuu.b0417041704170417041704170417("\uFF6F\uFF61\uFF70\uFF4F\uFF70\uFF5D\uFF70\uFF71\uFF6F", '\202', '\003'), new Class[] {
            java/lang/String
        });
        ((Method) (obj2)).invoke(replenishresponse, new Object[] {
            obj
        });
        obj = b041D041D041D041D041D041D_rrrrrr_ggrrgg_fld;
        obj2 = rrrrrr/ggrrgg.getMethod(nuuuuu.b0417041704170417041704170417("\uFF9E\uFF6C\uFF70\uFF6D\uFF82\uFF6C\uFF70\uFF6D\uFF82\uFF6C\uFF70\uFF6D\uFF82\u035B\uFF6C\uFF70\uFF6D\uFF82\u035B", 'b', '\003'), new Class[] {
            rrrrrr/ggrrgg, com/visa/cbp/sdk/facade/data/TokenKey, com/visa/cbp/external/common/Status
        });
        replenishresponse = ((ReplenishResponse) (((Method) (obj2)).invoke(null, new Object[] {
            obj, genericresponse, replenishresponse
        })));
        ((Boolean)replenishresponse).booleanValue();
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_1021;
        }
        j = b041D041D041D041D041D041D_int_static_fld;
        replenishresponse = rrrrrr/rrgrrg.getMethod(nuuuuu.b0417041704170417041704170417("\226\u0474\u0474dhhd\u0474\u0474dhhd", '4', '\005'), new Class[0]);
        try
        {
            replenishresponse = ((ReplenishResponse) (replenishresponse.invoke(null, new Object[0])));
        }
        // Misplaced declaration of an exception variable
        catch (ReplenishResponse replenishresponse)
        {
            throw replenishresponse.getCause();
        }
        switch (((((Integer)replenishresponse).intValue() + j) * j) % b041D041D041D041D041D041D_int_static_fld)
        {
        default:
            b041D041D041D041D041D041D_int_static_fld = 56;
            replenishresponse = rrrrrr/rrgrrg.getMethod(nuuuuu.b0417041704170417041704170417("\u01A2\u0170\u0174\u0174\u0170\u0580\u0580\u0580\u0580\u0170\u0174\u0174\u0170", '\267', '\211', '\003'), new Class[0]);
            try
            {
                replenishresponse = ((ReplenishResponse) (replenishresponse.invoke(null, new Object[0])));
            }
            // Misplaced declaration of an exception variable
            catch (ReplenishResponse replenishresponse)
            {
                throw replenishresponse.getCause();
            }
            b041D041D041D041D041D041D_int_static_fld = ((Integer)replenishresponse).intValue();
            break;

        case 0: // '\0'
            break;
        }
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_1021;
        }
        replenishresponse = b041D041D041D041D041D041D_rrrrrr_ggrrgg_fld;
        obj = rrrrrr/ggrrgg.getMethod(nuuuuu.b0417041704170417041704170417("@\u0428\u0428\u0428\u0428\016\022\022\037\016\022\022\037", 'n', 'L', '\001'), new Class[] {
            com/visa/cbp/sdk/facade/data/TokenKey
        });
        replenishresponse = ((ReplenishResponse) (((Method) (obj)).invoke(replenishresponse, new Object[] {
            genericresponse
        })));
        replenishresponse = (ReplenishAckRequest)replenishresponse;
        obj = b041D041D041D041D041D041D_rrrrrr_ggrrgg_fld;
        obj2 = rrrrrr/ggrrgg.getMethod(nuuuuu.b0417041704170417041704170417("\211W[Xm\u0446\u0446W[XmW[Xm\u0446", 'P', 'w', '\001'), new Class[] {
            rrrrrr/ggrrgg
        });
        obj = ((Method) (obj2)).invoke(null, new Object[] {
            obj
        });
        obj = (ReplenishmentProvider)obj;
        genericresponse = new pplplp(this, genericresponse);
        obj2 = com/visa/cbp/sdk/facade/provider/ReplenishmentProvider.getMethod(nuuuuu.b0417041704170417041704170417("\uFFE7\uFFF2\uFFC4\uFFE6\uFFEE\uFFF1\uFFF2\uFFFA\uFFEF\uFFE8\uFFE7\uFFEA\uFFE8", '}', '\0'), new Class[] {
            com/visa/cbp/external/aam/ReplenishAckRequest, com/visa/cbp/sdk/facade/provider/ResponseCallback
        });
        ((Method) (obj2)).invoke(obj, new Object[] {
            replenishresponse, genericresponse
        });
        return;
        replenishresponse;
        throw replenishresponse.getCause();
        replenishresponse;
        throw replenishresponse.getCause();
        replenishresponse;
        throw replenishresponse.getCause();
        replenishresponse;
        throw replenishresponse.getCause();
        replenishresponse;
        throw replenishresponse.getCause();
        replenishresponse;
        throw replenishresponse.getCause();
        replenishresponse;
        throw replenishresponse.getCause();
        replenishresponse;
        throw replenishresponse.getCause();
        replenishresponse;
        throw replenishresponse.getCause();
        replenishresponse = b041D041D041D041D041D041D_com_visa_cbp_sdk_facade_provider_ResponseCallback_fld;
        genericresponse = SDKErrorType.ERROR_ON_PERSISTENCE;
        obj = ReasonCode.DB_OPERATION_ERRORS;
        obj2 = rrrrrr/lpplll.getMethod(nuuuuu.b0417041704170417041704170417("\uFF67\uFF35\uFF39\uFF39\uFF3C\uFF35\uFF39\uFF39\uFF3C\u034C\uFF35\uFF39\uFF39\uFF3C\u034C\uFF35\uFF39\uFF39\uFF3C", '\373', '\0'), new Class[] {
            com/visa/cbp/sdk/facade/error/SDKErrorType, com/visa/cbp/sdk/facade/error/ReasonCode
        });
        genericresponse = ((GenericResponse) (((Method) (obj2)).invoke(null, new Object[] {
            genericresponse, obj
        })));
        genericresponse = (CbpError)genericresponse;
        obj = com/visa/cbp/sdk/facade/provider/ResponseCallback.getMethod(nuuuuu.b0417041704170417041704170417("\u027C\u0277\u027F\u0282\u028B\u0288\u027B", '\262', '\006'), new Class[] {
            com/visa/cbp/sdk/facade/error/CbpError
        });
        ((Method) (obj)).invoke(replenishresponse, new Object[] {
            genericresponse
        });
        return;
        replenishresponse;
        throw replenishresponse.getCause();
        replenishresponse;
        throw replenishresponse.getCause();
        replenishresponse;
        throw replenishresponse.getCause();
        replenishresponse;
        throw replenishresponse.getCause();
        replenishresponse;
        throw replenishresponse.getCause();
        replenishresponse;
        throw replenishresponse.getCause();
    }

    public void failure(CbpError cbperror)
    {
        Object obj = com/visa/cbp/sdk/facade/error/CbpError.getMethod(nuuuuu.b0417041704170417041704170417("\uFE71\uFE6F\uFE7E\uFE4F\uFE7C\uFE7C\uFE79\uFE7C\uFE4D\uFE79\uFE6E\uFE6F", '\373', '\003'), new Class[0]);
        obj = ((Method) (obj)).invoke(cbperror, new Object[0]);
        int i = ((Integer)obj).intValue();
        obj = llllpp.b043504350435043504350435;
        Method method = rrrrrr/llllpp.getMethod(nuuuuu.b0417041704170417041704170417("\366\u04B5\u04B5\304\310\306\305\304\310\306\305\304\310\306\305\u04B5\304\310\306\305", '\365', 'a', '\002'), new Class[0]);
        obj = method.invoke(obj, new Object[0]);
        if (i != ((Integer)obj).intValue())
        {
            break MISSING_BLOCK_LABEL_484;
        }
        i = b041D041D041D041D041D041D_int_static_fld;
        switch ((i * (b041D041D041D041D041D041D_int_static_fld + i)) % b041D041D041D041D041D041D_int_static_fld)
        {
        default:
            Object obj1 = rrrrrr/rrgrrg.getMethod(nuuuuu.b0417041704170417041704170417("\343\261\265\265\261\u04C1\u04C1\u04C1\u04C1\261\265\265\261", '\201', '\005'), new Class[0]);
            Object obj2;
            Object obj3;
            int j;
            int k;
            int l;
            int i1;
            int j1;
            try
            {
                obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (CbpError cbperror)
            {
                throw cbperror.getCause();
            }
            b041D041D041D041D041D041D_int_static_fld = ((Integer)obj1).intValue();
            obj1 = rrrrrr/rrgrrg.getMethod(nuuuuu.b0417041704170417041704170417("`.22.\u043E\u043E\u043E\u043E.22.", '\001', '\003'), new Class[0]);
            try
            {
                obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (CbpError cbperror)
            {
                throw cbperror.getCause();
            }
            b041D041D041D041D041D041D_int_static_fld = ((Integer)obj1).intValue();
            break;

        case 0: // '\0'
            break;
        }
        obj1 = b041D041D041D041D041D041D_rrrrrr_ggrrgg_fld;
        obj2 = rrrrrr/ggrrgg.getMethod(nuuuuu.b0417041704170417041704170417("\uFF27\u02E4\u02E4\u02E4\uFEF5\uFEF9\uFEF6\uFF0B\uFEF5\uFEF9\uFEF6\uFF0B\u02E4", 'i', '\004'), new Class[] {
            rrrrrr/ggrrgg
        });
        obj1 = ((Method) (obj2)).invoke(null, new Object[] {
            obj1
        });
        obj1 = (Context)obj1;
        obj1 = new Intent(((Context) (obj1)), com/visa/cbp/sdk/facade/activeaccountmanagement/CheckStatusService);
        obj2 = b041D041D041D041D041D041D_rrrrrr_ggrrgg_fld;
        try
        {
            j = b041D041D041D041D041D041D_int_static_fld;
            k = b041D041D041D041D041D041D_int_static_fld;
            l = b041D041D041D041D041D041D_int_static_fld;
            i1 = b041D041D041D041D041D041D_int_static_fld;
            j1 = b041D041D041D041D041D041D_int_static_fld;
        }
        // Misplaced declaration of an exception variable
        catch (CbpError cbperror)
        {
            throw cbperror;
        }
        if (((j + k) * l) % i1 == j1)
        {
            break MISSING_BLOCK_LABEL_393;
        }
        obj3 = rrrrrr/rrgrrg.getMethod(nuuuuu.b0417041704170417041704170417("\uFF73\uFF41\uFF45\uFF45\uFF41\u0351\u0351\u0351\u0351\uFF41\uFF45\uFF45\uFF41", '\357', '\0'), new Class[0]);
        obj3 = ((Method) (obj3)).invoke(null, new Object[0]);
        j = ((Integer)obj3).intValue();
        b041D041D041D041D041D041D_int_static_fld = j;
        obj3 = rrrrrr/rrgrrg.getMethod(nuuuuu.b0417041704170417041704170417("\u0132\u0100\u0104\u0104\u0100\u0510\u0510\u0510\u0510\u0100\u0104\u0104\u0100", 'h', '\001'), new Class[0]);
        obj3 = ((Method) (obj3)).invoke(null, new Object[0]);
        j = ((Integer)obj3).intValue();
        b041D041D041D041D041D041D_int_static_fld = j;
        obj3 = rrrrrr/ggrrgg.getMethod(nuuuuu.b0417041704170417041704170417("\u0156\u0513\u0513\u0513\u0124\u0128\u0125\u013A\u0124\u0128\u0125\u013A\u0513", 'z', '\001'), new Class[] {
            rrrrrr/ggrrgg
        });
        obj2 = ((Method) (obj3)).invoke(null, new Object[] {
            obj2
        });
        obj2 = (Context)obj2;
        obj3 = android/content/Context.getMethod(nuuuuu.b0417041704170417041704170417("\246\247\224\245\247\206\230\245\251\234\226\230", '\223', '`', '\002'), new Class[] {
            android/content/Intent
        });
        obj1 = ((Method) (obj3)).invoke(obj2, new Object[] {
            obj1
        });
        obj1 = (ComponentName)obj1;
        obj1 = b041D041D041D041D041D041D_com_visa_cbp_sdk_facade_provider_ResponseCallback_fld;
        obj2 = com/visa/cbp/sdk/facade/provider/ResponseCallback.getMethod(nuuuuu.b0417041704170417041704170417("\uFF78\uFF73\uFF7B\uFF7E\uFF87\uFF84\uFF77", '\356', '\0'), new Class[] {
            com/visa/cbp/sdk/facade/error/CbpError
        });
        ((Method) (obj2)).invoke(obj1, new Object[] {
            cbperror
        });
        return;
        cbperror;
        try
        {
            throw cbperror.getCause();
        }
        // Misplaced declaration of an exception variable
        catch (CbpError cbperror) { }
        try
        {
            throw cbperror;
        }
        // Misplaced declaration of an exception variable
        catch (CbpError cbperror)
        {
            throw cbperror;
        }
        cbperror;
        throw cbperror.getCause();
        cbperror;
        try
        {
            throw cbperror.getCause();
        }
        // Misplaced declaration of an exception variable
        catch (CbpError cbperror) { }
        throw cbperror;
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

    public void success(Object obj, GenericResponse genericresponse)
    {
        Object obj1;
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
        obj1 = rrrrrr/rrgrrg.getMethod(nuuuuu.b0417041704170417041704170417("\uFF95\uFF63\uFF67\uFF67\uFF63\u0373\u0373\u0373\u0373\uFF63\uFF67\uFF67\uFF63", '\345', '\030', '\001'), new Class[0]);
        obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
        int i = ((Integer)obj1).intValue();
        int j;
        int k;
        try
        {
            j = b041D041D041D041D041D041D_int_static_fld;
            k = b041D041D041D041D041D041D_int_static_fld;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw obj;
        }
        (i * (j + i)) % k;
        JVM INSTR tableswitch 0 0: default 132
    //                   0 320;
           goto _L1 _L2
_L1:
        if (((b041D041D041D041D041D041D_int_static_fld + b041D041D041D041D041D041D_int_static_fld) * b041D041D041D041D041D041D_int_static_fld) % b041D041D041D041D041D041D_int_static_fld != b041D041D041D041D041D041D_int_static_fld)
        {
            obj1 = rrrrrr/rrgrrg.getMethod(nuuuuu.b0417041704170417041704170417("\022\uFFE0\uFFE4\uFFE4\uFFE0\u03F0\u03F0\u03F0\u03F0\uFFE0\uFFE4\uFFE4\uFFE0", 'P', '\0'), new Class[0]);
            try
            {
                obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw ((InvocationTargetException) (obj)).getCause();
            }
            b041D041D041D041D041D041D_int_static_fld = ((Integer)obj1).intValue();
            obj1 = rrrrrr/rrgrrg.getMethod(nuuuuu.b0417041704170417041704170417("\uFED7\uFEA5\uFEA9\uFEA9\uFEA5\u02B5\u02B5\u02B5\u02B5\uFEA5\uFEA9\uFEA9\uFEA5", '\337', '\254', '\0'), new Class[0]);
            try
            {
                obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw ((InvocationTargetException) (obj)).getCause();
            }
            b041D041D041D041D041D041D_int_static_fld = ((Integer)obj1).intValue();
        }
        obj1 = rrrrrr/rrgrrg.getMethod(nuuuuu.b0417041704170417041704170417("\uFFCA\uFF98\uFF9C\uFF9C\uFF98\u03A8\u03A8\u03A8\u03A8\uFF98\uFF9C\uFF9C\uFF98", '\230', '\0'), new Class[0]);
        obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
        i = ((Integer)obj1).intValue();
        try
        {
            b041D041D041D041D041D041D_int_static_fld = i;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw obj;
        }
        obj1 = rrrrrr/rrgrrg.getMethod(nuuuuu.b0417041704170417041704170417("\uFF75\uFF43\uFF47\uFF47\uFF43\u0353\u0353\u0353\u0353\uFF43\uFF47\uFF47\uFF43", 'v', 'w', '\0'), new Class[0]);
        obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
        i = ((Integer)obj1).intValue();
        b041D041D041D041D041D041D_int_static_fld = i;
_L2:
        obj = (ReplenishResponse)obj;
        obj1 = rrrrrr/rrgrrg.getMethod(nuuuuu.b0417041704170417041704170417("\uFDAD\uFD7B\uFD7F\uFD7F\uFD7B\uFD7B\uFD7F\uFD7F\uFD7B\u018B\u018B\u018B\uFD7B\uFD7F\uFD7F\uFD7B", '\347', '\004'), new Class[] {
            com/visa/cbp/external/aam/ReplenishResponse, com/visa/cbp/sdk/facade/data/GenericResponse
        });
        ((Method) (obj1)).invoke(this, new Object[] {
            obj, genericresponse
        });
        return;
        obj;
        throw ((InvocationTargetException) (obj)).getCause();
        obj;
        throw ((InvocationTargetException) (obj)).getCause();
        obj;
        throw ((InvocationTargetException) (obj)).getCause();
        obj;
        throw ((InvocationTargetException) (obj)).getCause();
    }
}
