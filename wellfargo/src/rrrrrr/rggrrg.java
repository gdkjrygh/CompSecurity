// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rrrrrr;

import com.visa.cbp.external.common.UpdateReason;
import com.visa.cbp.external.lcm.LcmTokenRequest;
import com.visa.cbp.sdk.facade.data.GenericResponse;
import com.visa.cbp.sdk.facade.data.LcmParams;
import com.visa.cbp.sdk.facade.data.TokenKey;
import com.visa.cbp.sdk.facade.data.TokenStatus;
import com.visa.cbp.sdk.facade.error.CbpError;
import com.visa.cbp.sdk.facade.error.TokenStatusError;
import com.visa.cbp.sdk.facade.provider.ResponseCallback;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import uuuuuu.nuuuuu;

// Referenced classes of package rrrrrr:
//            ggrrgg, grrrrr, ppplpp, grrggg

public class rggrrg
    implements ResponseCallback
{

    public static int b041D041D041D041D041D041D_int_static_fld = 83;
    public static int b041D041D041D041D041D041D_int_static_fld = 2;
    public static int b041D041D041D041D041D041D_int_static_fld = 0;
    public static int b041D041D041D041D041D041D_int_static_fld = 1;
    public final ResponseCallback b041D041D041D041D041D041D_com_visa_cbp_sdk_facade_provider_ResponseCallback_fld;
    public final ggrrgg b041D041D041D041D041D041D_rrrrrr_ggrrgg_fld;
    public final LcmTokenRequest b041D041D041D041D041D041D_com_visa_cbp_external_lcm_LcmTokenRequest_fld;

    public rggrrg(ggrrgg ggrrgg1, LcmTokenRequest lcmtokenrequest, ResponseCallback responsecallback)
    {
        try
        {
            b041D041D041D041D041D041D_rrrrrr_ggrrgg_fld = ggrrgg1;
            b041D041D041D041D041D041D_com_visa_cbp_external_lcm_LcmTokenRequest_fld = lcmtokenrequest;
        }
        // Misplaced declaration of an exception variable
        catch (ggrrgg ggrrgg1)
        {
            throw ggrrgg1;
        }
        if (((b041D041D041D041D041D041D_int_static_fld + b041D041D041D041D041D041D_int_static_fld) * b041D041D041D041D041D041D_int_static_fld) % b041D041D041D041D041D041D_int_static_fld != b041D041D041D041D041D041D_int_static_fld)
        {
            ggrrgg1 = rrrrrr/rggrrg.getMethod(nuuuuu.b0417041704170417041704170417("\uFE70\uFE3E\uFE42\uFE42\uFE3E\u024E\u024E\uFE3E\uFE42\uFE42\uFE3E\u024E\uFE3E\uFE42\uFE42\uFE3E", '\246', '\004'), new Class[0]);
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
            ggrrgg1 = rrrrrr/rggrrg.getMethod(nuuuuu.b0417041704170417041704170417(">\f\020\020\f\u041C\u041C\f\020\020\f\u041C\f\020\020\f", '$', '\0'), new Class[0]);
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
        }
        b041D041D041D041D041D041D_com_visa_cbp_sdk_facade_provider_ResponseCallback_fld = responsecallback;
        super();
        return;
    }

    public static int b044004400440044004400440()
    {
        return 0;
    }

    public static int b044004400440044004400440()
    {
        return 2;
    }

    public static int b044004400440044004400440()
    {
        return 28;
    }

    public static int b044004400440044004400440()
    {
        return 1;
    }

    public void b042B042B042B042B042B042B(Void void1, GenericResponse genericresponse)
    {
        Object obj;
        Object obj1;
        LcmTokenRequest lcmtokenrequest;
        ResponseCallback responsecallback;
        Method method;
        int i;
        int j;
        int k;
        int l;
        try
        {
            void1 = b041D041D041D041D041D041D_com_visa_cbp_external_lcm_LcmTokenRequest_fld;
        }
        // Misplaced declaration of an exception variable
        catch (Void void1)
        {
            throw void1;
        }
        obj = com/visa/cbp/external/lcm/LcmTokenRequest.getMethod(nuuuuu.b0417041704170417041704170417("\u022B\u0229\u0238\u0219\u0234\u0228\u0225\u0238\u0229\u0216\u0229\u0225\u0237\u0233\u0232", '\342', '\001'), new Class[0]);
        void1 = ((Void) (((Method) (obj)).invoke(void1, new Object[0])));
        void1 = (UpdateReason)void1;
        obj = TokenStatus.DELETED;
        i = b041D041D041D041D041D041D_int_static_fld;
        j = b041D041D041D041D041D041D_int_static_fld;
        k = b041D041D041D041D041D041D_int_static_fld;
        l = b041D041D041D041D041D041D_int_static_fld;
        obj1 = rrrrrr/rggrrg.getMethod(nuuuuu.b0417041704170417041704170417("\u0103\321\325\325\321\321\325\325\321\u04E1\321\325\325\321\u04E1\321\325\325\321", '\241', '\005'), new Class[0]);
        try
        {
            obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
        }
        // Misplaced declaration of an exception variable
        catch (Void void1)
        {
            throw void1.getCause();
        }
        if (((i + j) * k) % l != ((Integer)obj1).intValue())
        {
            b041D041D041D041D041D041D_int_static_fld = 29;
            obj1 = rrrrrr/rggrrg.getMethod(nuuuuu.b0417041704170417041704170417("\336\254\260\260\254\u04BC\u04BC\254\260\260\254\u04BC\254\260\260\254", '|', '\005'), new Class[0]);
            try
            {
                obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (Void void1)
            {
                throw void1.getCause();
            }
            b041D041D041D041D041D041D_int_static_fld = ((Integer)obj1).intValue();
        }
        i = b041D041D041D041D041D041D_int_static_fld;
        obj1 = rrrrrr/rggrrg.getMethod(nuuuuu.b0417041704170417041704170417("\u0105\u04E3\323\327\327\323\u04E3\323\327\327\323\u04E3\323\327\327\323", '"', '\201', '\003'), new Class[0]);
        try
        {
            obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
        }
        // Misplaced declaration of an exception variable
        catch (Void void1)
        {
            throw void1.getCause();
        }
        switch (((((Integer)obj1).intValue() + i) * i) % b041D041D041D041D041D041D_int_static_fld)
        {
        default:
            obj1 = rrrrrr/rggrrg.getMethod(nuuuuu.b0417041704170417041704170417("6d``d\u0414\u0414d``d\u0414d``d", 'T', '\002'), new Class[0]);
            try
            {
                obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (Void void1)
            {
                throw void1.getCause();
            }
            b041D041D041D041D041D041D_int_static_fld = ((Integer)obj1).intValue();
            b041D041D041D041D041D041D_int_static_fld = 68;
            break;

        case 0: // '\0'
            break;
        }
        obj1 = b041D041D041D041D041D041D_rrrrrr_ggrrgg_fld;
        lcmtokenrequest = b041D041D041D041D041D041D_com_visa_cbp_external_lcm_LcmTokenRequest_fld;
        try
        {
            responsecallback = b041D041D041D041D041D041D_com_visa_cbp_sdk_facade_provider_ResponseCallback_fld;
        }
        // Misplaced declaration of an exception variable
        catch (Void void1)
        {
            throw void1;
        }
        method = rrrrrr/ggrrgg.getMethod(nuuuuu.b0417041704170417041704170417("\uFFFA\uFFC8\uFFCC\uFFC9\uFFDE\uFFC8\uFFCC\uFFC9\uFFDE\u03B7\uFFC8\uFFCC\uFFC9\uFFDE\uFFC8\uFFCC\uFFC9\uFFDE\u03B7", 'J', '\262', '\002'), new Class[] {
            rrrrrr/ggrrgg, com/visa/cbp/external/lcm/LcmTokenRequest, com/visa/cbp/sdk/facade/data/TokenStatus, com/visa/cbp/external/common/UpdateReason, com/visa/cbp/sdk/facade/data/GenericResponse, com/visa/cbp/sdk/facade/provider/ResponseCallback
        });
        method.invoke(null, new Object[] {
            obj1, lcmtokenrequest, obj, void1, genericresponse, responsecallback
        });
        return;
        void1;
        throw void1.getCause();
        void1;
        throw void1.getCause();
    }

    public void b044004400440044004400440(TokenStatusError tokenstatuserror)
    {
        Object obj;
        Object obj3;
        obj = b041D041D041D041D041D041D_rrrrrr_ggrrgg_fld;
        obj3 = b041D041D041D041D041D041D_com_visa_cbp_external_lcm_LcmTokenRequest_fld;
        Method method = rrrrrr/ggrrgg.getMethod(nuuuuu.b0417041704170417041704170417("\uFF42\u02FF\u02FF\uFF10\uFF14\uFF11\uFF26\uFF10\uFF14\uFF11\uFF26\uFF10\uFF14\uFF11\uFF26\u02FF", '|', '\244', '\0'), new Class[] {
            rrrrrr/ggrrgg, com/visa/cbp/external/lcm/LcmTokenRequest
        });
        obj = method.invoke(null, new Object[] {
            obj, obj3
        });
        obj = (LcmParams)obj;
        obj3 = com/visa/cbp/sdk/facade/error/TokenStatusError.getMethod(nuuuuu.b0417041704170417041704170417("\uFFD7\uFFC9\uFFD8\uFFB0\uFFC7\uFFD1\uFFB4\uFFC5\uFFD6\uFFC5\uFFD1\uFFD7", 'N', '\003'), new Class[] {
            com/visa/cbp/sdk/facade/data/LcmParams
        });
        ((Method) (obj3)).invoke(tokenstatuserror, new Object[] {
            obj
        });
        int i = b041D041D041D041D041D041D_int_static_fld;
        Object obj1 = rrrrrr/rggrrg.getMethod(nuuuuu.b0417041704170417041704170417("\u01FA\u05D8\u01C8\u01CC\u01CC\u01C8\u05D8\u01C8\u01CC\u01CC\u01C8\u05D8\u01C8\u01CC\u01CC\u01C8", '\314', '\001'), new Class[0]);
        try
        {
            obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
        }
        // Misplaced declaration of an exception variable
        catch (TokenStatusError tokenstatuserror)
        {
            throw tokenstatuserror.getCause();
        }
        switch (((((Integer)obj1).intValue() + i) * i) % b041D041D041D041D041D041D_int_static_fld)
        {
        default:
            Object obj2 = rrrrrr/rggrrg.getMethod(nuuuuu.b0417041704170417041704170417("\264\202\206\206\202\u0492\u0492\202\206\206\202\u0492\202\206\206\202", 'R', '\005'), new Class[0]);
            Object obj4;
            Object obj5;
            Method method1;
            int j;
            int k;
            try
            {
                obj2 = ((Method) (obj2)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (TokenStatusError tokenstatuserror)
            {
                throw tokenstatuserror.getCause();
            }
            b041D041D041D041D041D041D_int_static_fld = ((Integer)obj2).intValue();
            obj2 = rrrrrr/rggrrg.getMethod(nuuuuu.b0417041704170417041704170417("\uFF15\uFEE3\uFEE7\uFEE7\uFEE3\u02F3\u02F3\uFEE3\uFEE7\uFEE7\uFEE3\u02F3\uFEE3\uFEE7\uFEE7\uFEE3", 'o', '\004'), new Class[0]);
            try
            {
                obj2 = ((Method) (obj2)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (TokenStatusError tokenstatuserror)
            {
                throw tokenstatuserror.getCause();
            }
            b041D041D041D041D041D041D_int_static_fld = ((Integer)obj2).intValue();
            break;

        case 0: // '\0'
            break;
        }
        obj2 = TokenStatus.DELETED;
        obj4 = com/visa/cbp/sdk/facade/error/TokenStatusError.getMethod(nuuuuu.b0417041704170417041704170417("\236\220\237\177\232\226\220\231~\237\214\237\240\236", '+', '\005'), new Class[] {
            com/visa/cbp/sdk/facade/data/TokenStatus
        });
        ((Method) (obj4)).invoke(tokenstatuserror, new Object[] {
            obj2
        });
        obj2 = rrrrrr/ggrrgg.getMethod(nuuuuu.b0417041704170417041704170417("\u0105\323\327\324\351\u04C2\u04C2\u04C2\323\327\324\351\u04C2", '$', '\177', '\003'), new Class[0]);
        obj2 = ((Method) (obj2)).invoke(null, new Object[0]);
        obj2 = (String)obj2;
        obj4 = new StringBuilder();
        obj5 = grrrrr.b044C044C044C044C044C044C("\uFEC6\uFEC1\uFEC9\uFECC\uFED5\uFED2\uFEC5\uFE80\uFED5\uFED0\uFEC4\uFEC1\uFED4\uFEC5\uFE80\uFED4\uFECF\uFECB\uFEC5\uFECE\uFE80\uFED3\uFED4\uFEC1\uFED4\uFED5\uFED3\uFE80\uFED7\uFEC9\uFED4\uFEC8\uFE80\uFED4\uFECF\uFECB\uFEC5\uFECE\uFE80\uFEA9\uFEA4\uFE9A\uFE80", '\354', '\264', '\0');
        method1 = java/lang/StringBuilder.getMethod(nuuuuu.b0417041704170417041704170417("$33(1'", 'p', '3', '\001'), new Class[] {
            java/lang/String
        });
        obj4 = method1.invoke(obj4, new Object[] {
            obj5
        });
        obj4 = (StringBuilder)obj4;
        obj5 = com/visa/cbp/sdk/facade/error/TokenStatusError.getMethod(nuuuuu.b0417041704170417041704170417("\uFFD6\uFFD4\uFFE3\uFFBB\uFFD2\uFFDC\uFFBF\uFFD0\uFFE1\uFFD0\uFFDC\uFFE2", '\321', '@', '\001'), new Class[0]);
        obj5 = ((Method) (obj5)).invoke(tokenstatuserror, new Object[0]);
        obj5 = (LcmParams)obj5;
        method1 = com/visa/cbp/sdk/facade/data/LcmParams.getMethod(nuuuuu.b0417041704170417041704170417(" \036-\r($\036'\004\0362", '#', '$', '\0'), new Class[0]);
        obj5 = method1.invoke(obj5, new Object[0]);
        obj5 = (TokenKey)obj5;
        method1 = java/lang/StringBuilder.getMethod(nuuuuu.b0417041704170417041704170417("\270\307\307\274\305\273", '\372', '\243', '\002'), new Class[] {
            java/lang/Object
        });
        obj4 = method1.invoke(obj4, new Object[] {
            obj5
        });
        obj4 = (StringBuilder)obj4;
        obj5 = java/lang/StringBuilder.getMethod(nuuuuu.b0417041704170417041704170417("\254\247\213\254\252\241\246\237", '\036', '\032', '\003'), new Class[0]);
        obj4 = ((Method) (obj5)).invoke(obj4, new Object[0]);
        obj4 = (String)obj4;
        obj5 = rrrrrr/ppplpp.getMethod(nuuuuu.b0417041704170417041704170417("\027\uFFE5\uFFE9\uFFE6\uFFEA\u03CA\uFFE5\uFFE9\uFFE6\uFFEA\u03CA\uFFE5\uFFE9\uFFE6\uFFEA\u03CA\uFFE5\uFFE9\uFFE6\uFFEA", 'K', '\0'), new Class[] {
            java/lang/String, java/lang/String
        });
        ((Method) (obj5)).invoke(null, new Object[] {
            obj2, obj4
        });
        obj2 = rrrrrr/grrggg.getMethod(nuuuuu.b0417041704170417041704170417("\u017F\u014D\u0151\u014E\u0163\u053C\u053C\u014D\u0151\u014E\u0163\u014D\u0151\u014E\u0163\u014D\u0151\u014E\u0163", '_', '\006'), new Class[] {
            com/visa/cbp/sdk/facade/error/CbpError
        });
        ((Method) (obj2)).invoke(null, new Object[] {
            tokenstatuserror
        });
        try
        {
            j = b041D041D041D041D041D041D_int_static_fld;
            k = b041D041D041D041D041D041D_int_static_fld;
        }
        // Misplaced declaration of an exception variable
        catch (TokenStatusError tokenstatuserror)
        {
            throw tokenstatuserror;
        }
        obj2 = rrrrrr/rggrrg.getMethod(nuuuuu.b0417041704170417041704170417("\u0114\342\346\346\342\u04F2\342\346\346\342\342\346\346\342\u04F2\342\346\346\342", 'Y', '\001'), new Class[0]);
        obj2 = ((Method) (obj2)).invoke(null, new Object[0]);
        ((k + j) * j) % ((Integer)obj2).intValue();
        JVM INSTR tableswitch 0 0: default 720
    //                   0 806;
           goto _L1 _L2
_L2:
        break MISSING_BLOCK_LABEL_806;
_L1:
        obj2 = rrrrrr/rggrrg.getMethod(nuuuuu.b0417041704170417041704170417("\263\201\205\205\201\u0491\u0491\201\205\205\201\u0491\201\205\205\201", '\033', '\006'), new Class[0]);
        obj2 = ((Method) (obj2)).invoke(null, new Object[0]);
        j = ((Integer)obj2).intValue();
        try
        {
            b041D041D041D041D041D041D_int_static_fld = j;
        }
        // Misplaced declaration of an exception variable
        catch (TokenStatusError tokenstatuserror)
        {
            throw tokenstatuserror;
        }
        obj2 = rrrrrr/rggrrg.getMethod(nuuuuu.b0417041704170417041704170417("\u0206\u01D4\u01D8\u01D8\u01D4\u05E4\u05E4\u01D4\u01D8\u01D8\u01D4\u05E4\u01D4\u01D8\u01D8\u01D4", '\322', '\001'), new Class[0]);
        obj2 = ((Method) (obj2)).invoke(null, new Object[0]);
        j = ((Integer)obj2).intValue();
        b041D041D041D041D041D041D_int_static_fld = j;
        obj2 = b041D041D041D041D041D041D_com_visa_cbp_sdk_facade_provider_ResponseCallback_fld;
        obj4 = com/visa/cbp/sdk/facade/provider/ResponseCallback.getMethod(nuuuuu.b0417041704170417041704170417("\uFF62\uFF5D\uFF65\uFF68\uFF71\uFF6E\uFF61", '\202', '\003'), new Class[] {
            com/visa/cbp/sdk/facade/error/CbpError
        });
        ((Method) (obj4)).invoke(obj2, new Object[] {
            tokenstatuserror
        });
        return;
        tokenstatuserror;
        try
        {
            throw tokenstatuserror.getCause();
        }
        // Misplaced declaration of an exception variable
        catch (TokenStatusError tokenstatuserror) { }
        throw tokenstatuserror;
        tokenstatuserror;
        throw tokenstatuserror.getCause();
        tokenstatuserror;
        throw tokenstatuserror.getCause();
        tokenstatuserror;
        throw tokenstatuserror.getCause();
        tokenstatuserror;
        throw tokenstatuserror.getCause();
        tokenstatuserror;
        throw tokenstatuserror.getCause();
        tokenstatuserror;
        throw tokenstatuserror.getCause();
        tokenstatuserror;
        throw tokenstatuserror.getCause();
        tokenstatuserror;
        throw tokenstatuserror.getCause();
        tokenstatuserror;
        throw tokenstatuserror.getCause();
        tokenstatuserror;
        throw tokenstatuserror.getCause();
        tokenstatuserror;
        throw tokenstatuserror.getCause();
        tokenstatuserror;
        try
        {
            throw tokenstatuserror.getCause();
        }
        // Misplaced declaration of an exception variable
        catch (TokenStatusError tokenstatuserror) { }
        throw tokenstatuserror;
        tokenstatuserror;
        throw tokenstatuserror.getCause();
        tokenstatuserror;
        throw tokenstatuserror.getCause();
    }

    public void failure(CbpError cbperror)
    {
        cbperror = (TokenStatusError)cbperror;
        Method method = rrrrrr/rggrrg.getMethod(nuuuuu.b0417041704170417041704170417("\u02CF\u06AD\u06AD\u029D\u02A1\u02A1\u029D\u029D\u02A1\u02A1\u029D\u06AD\u029D\u02A1\u02A1\u029D", '\317', '\006'), new Class[] {
            com/visa/cbp/sdk/facade/error/TokenStatusError
        });
        int i;
        try
        {
            method.invoke(this, new Object[] {
                cbperror
            });
        }
        // Misplaced declaration of an exception variable
        catch (CbpError cbperror)
        {
            throw cbperror.getCause();
        }
        i = b041D041D041D041D041D041D_int_static_fld;
        switch ((i * (b041D041D041D041D041D041D_int_static_fld + i)) % b041D041D041D041D041D041D_int_static_fld)
        {
        default:
            cbperror = rrrrrr/rggrrg.getMethod(nuuuuu.b0417041704170417041704170417("\u0106\324\330\330\324\u04E4\u04E4\324\330\330\324\u04E4\324\330\330\324", 'R', '\001'), new Class[0]);
            try
            {
                cbperror = ((CbpError) (cbperror.invoke(null, new Object[0])));
            }
            // Misplaced declaration of an exception variable
            catch (CbpError cbperror)
            {
                throw cbperror.getCause();
            }
            b041D041D041D041D041D041D_int_static_fld = ((Integer)cbperror).intValue();
            b041D041D041D041D041D041D_int_static_fld = 75;
            // fall through

        case 0: // '\0'
            return;
        }
    }

    public void success(Object obj, GenericResponse genericresponse)
    {
_L2:
        Object obj1 = java/lang/String.getMethod(nuuuuu.b0417041704170417041704170417("\uFE98\uFE91\uFE9A\uFE93\uFEA0\uFE94", '\352', '\003'), new Class[0]);
        obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
        ((Integer)obj1).intValue();
        if (((b041D041D041D041D041D041D_int_static_fld + b041D041D041D041D041D041D_int_static_fld) * b041D041D041D041D041D041D_int_static_fld) % b041D041D041D041D041D041D_int_static_fld != b041D041D041D041D041D041D_int_static_fld)
        {
            Object obj2 = rrrrrr/rggrrg.getMethod(nuuuuu.b0417041704170417041704170417("\202PTTP\u0460\u0460PTTP\u0460PTTP", 'm', '\215', '\001'), new Class[0]);
            Object obj3;
            try
            {
                obj2 = ((Method) (obj2)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw ((InvocationTargetException) (obj)).getCause();
            }
            b041D041D041D041D041D041D_int_static_fld = ((Integer)obj2).intValue();
            b041D041D041D041D041D041D_int_static_fld = 79;
        }
        if (true) goto _L2; else goto _L1
_L1:
        obj3;
        try
        {
            throw ((InvocationTargetException) (obj3)).getCause();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj3)
        {
            obj3 = rrrrrr/rggrrg.getMethod(nuuuuu.b0417041704170417041704170417("\360\276\302\302\276\u04CE\u04CE\276\302\302\276\u04CE\276\302\302\276", 'G', '\001'), new Class[0]);
        }
        try
        {
            obj3 = ((Method) (obj3)).invoke(null, new Object[0]);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw ((InvocationTargetException) (obj)).getCause();
        }
        b041D041D041D041D041D041D_int_static_fld = ((Integer)obj3).intValue();
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
        obj = (Void)obj;
        obj3 = rrrrrr/rggrrg.getMethod(nuuuuu.b0417041704170417041704170417("\u0141\u050A\u010F\u0113\u0111\u0121\u010F\u0113\u0111\u0121\u010F\u0113\u0111\u0121\u050A\u010F\u0113\u0111\u0121", '\337', '\005'), new Class[] {
            java/lang/Void, com/visa/cbp/sdk/facade/data/GenericResponse
        });
        try
        {
            ((Method) (obj3)).invoke(this, new Object[] {
                obj, genericresponse
            });
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw ((InvocationTargetException) (obj)).getCause();
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
        return;
    }
}
