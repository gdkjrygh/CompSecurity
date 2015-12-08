// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rrrrrr;

import android.database.sqlite.SQLiteConstraintException;
import com.visa.cbp.external.common.DynParams;
import com.visa.cbp.external.common.HCEData;
import com.visa.cbp.external.common.Status;
import com.visa.cbp.external.common.TokenInfo;
import com.visa.cbp.external.enp.EnrollAndProvisionResponse;
import com.visa.cbp.sdk.facade.VisaPaymentSDKImpl;
import com.visa.cbp.sdk.facade.data.EnrollProvisionRequestWrapper;
import com.visa.cbp.sdk.facade.data.GenericResponse;
import com.visa.cbp.sdk.facade.data.TokenKey;
import com.visa.cbp.sdk.facade.error.CbpError;
import com.visa.cbp.sdk.facade.error.ReasonCode;
import com.visa.cbp.sdk.facade.error.SDKErrorType;
import com.visa.cbp.sdk.facade.provider.ResponseCallback;
import com.visa.cbp.sdk.facade.response.ProvisionTokenResponse;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import uuuuuu.nuuuuu;

// Referenced classes of package rrrrrr:
//            pllppl, plpllp, ggrrgg, ppplpl, 
//            ppllpl, rgrrgg, ggggrr, grrgrr, 
//            lpplll, ppplpp, grrggg

public class grgrrg
    implements ResponseCallback
{

    public static int b041D041D041D041D041D041D_int_static_fld = 1;
    public static int b041D041D041D041D041D041D_int_static_fld = 0;
    public static int b041D041D041D041D041D041D_int_static_fld = 2;
    public static int b041D041D041D041D041D041D_int_static_fld = 72;
    public final ggrrgg b041D041D041D041D041D041D_rrrrrr_ggrrgg_fld;
    public final EnrollProvisionRequestWrapper b041D041D041D041D041D041D_com_visa_cbp_sdk_facade_data_EnrollProvisionRequestWrapper_fld;
    public final ResponseCallback b041D041D041D041D041D041D_com_visa_cbp_sdk_facade_provider_ResponseCallback_fld;

    public grgrrg(ggrrgg ggrrgg1, EnrollProvisionRequestWrapper enrollprovisionrequestwrapper, ResponseCallback responsecallback)
    {
        int i;
        try
        {
            b041D041D041D041D041D041D_rrrrrr_ggrrgg_fld = ggrrgg1;
            b041D041D041D041D041D041D_com_visa_cbp_sdk_facade_data_EnrollProvisionRequestWrapper_fld = enrollprovisionrequestwrapper;
        }
        // Misplaced declaration of an exception variable
        catch (ggrrgg ggrrgg1)
        {
            throw ggrrgg1;
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
        i = b041D041D041D041D041D041D_int_static_fld;
        ggrrgg1 = rrrrrr/grgrrg.getMethod(nuuuuu.b0417041704170417041704170417("\uFFB2\uFF80\uFF84\uFF84\uFF80\u0390\uFF80\uFF84\uFF84\uFF80\u0390\u0390\uFF80\uFF84\uFF84\uFF80", '3', '\343', '\002'), new Class[0]);
        try
        {
            ggrrgg1 = ((ggrrgg) (ggrrgg1.invoke(null, new Object[0])));
        }
        // Misplaced declaration of an exception variable
        catch (ggrrgg ggrrgg1)
        {
            throw ggrrgg1.getCause();
        }
        if (((((Integer)ggrrgg1).intValue() + i) * b041D041D041D041D041D041D_int_static_fld) % b041D041D041D041D041D041D_int_static_fld != b041D041D041D041D041D041D_int_static_fld)
        {
            ggrrgg1 = rrrrrr/grgrrg.getMethod(nuuuuu.b0417041704170417041704170417("\u0122\u0500\360\364\364\360\360\364\364\360\u0500\u0500\360\364\364\360", '\300', '\005'), new Class[0]);
            int j;
            int k;
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
            ggrrgg1 = rrrrrr/grgrrg.getMethod(nuuuuu.b0417041704170417041704170417("2\u0410\000\004\004\000\000\004\004\000\u0410\u0410\000\004\004\0", '0', '\0'), new Class[0]);
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
        j = b041D041D041D041D041D041D_int_static_fld;
        k = b041D041D041D041D041D041D_int_static_fld;
        ggrrgg1 = rrrrrr/grgrrg.getMethod(nuuuuu.b0417041704170417041704170417("\uFFB9\uFF87\uFF8B\uFF8B\uFF87\uFF87\uFF8B\uFF8B\uFF87\uFF87\uFF8B\uFF8B\uFF87\u0397\u0397\uFF87\uFF8B\uFF8B\uFF87", '\251', '\0'), new Class[0]);
        try
        {
            ggrrgg1 = ((ggrrgg) (ggrrgg1.invoke(null, new Object[0])));
        }
        // Misplaced declaration of an exception variable
        catch (ggrrgg ggrrgg1)
        {
            throw ggrrgg1.getCause();
        }
        switch (((k + j) * j) % ((Integer)ggrrgg1).intValue())
        {
        default:
            b041D041D041D041D041D041D_int_static_fld = 49;
            ggrrgg1 = rrrrrr/grgrrg.getMethod(nuuuuu.b0417041704170417041704170417("\uFE6E\u024C\uFE3C\uFE40\uFE40\uFE3C\uFE3C\uFE40\uFE40\uFE3C\u024C\u024C\uFE3C\uFE40\uFE40\uFE3C", '\372', '\003'), new Class[0]);
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
            break;

        case 0: // '\0'
            break;
        }
        try
        {
            super();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (ggrrgg ggrrgg1)
        {
            throw ggrrgg1;
        }
    }

    public static int b044004400440044004400440()
    {
        return 2;
    }

    public static int b044004400440044004400440()
    {
        return 1;
    }

    public static int b044004400440044004400440()
    {
        return 1;
    }

    public void b044004400440044004400440(EnrollAndProvisionResponse enrollandprovisionresponse, GenericResponse genericresponse)
    {
        Object obj = rrrrrr/pllppl.getMethod(nuuuuu.b0417041704170417041704170417("\uFF69\uFF37\uFF3B\uFF38\uFF49\u0322\u0322\u0322\uFF37\uFF3B\uFF38\uFF49\uFF37\uFF3B\uFF38\uFF49", 'C', '\266', '\0'), new Class[0]);
        obj = ((Method) (obj)).invoke(null, new Object[0]);
        Object obj2 = (plpllp)obj;
        obj = b041D041D041D041D041D041D_rrrrrr_ggrrgg_fld;
        Object obj1 = rrrrrr/ggrrgg.getMethod(nuuuuu.b0417041704170417041704170417("\uFF69\u0326\u0326\uFF37\uFF3B\uFF38\uFF4D\uFF37\uFF3B\uFF38\uFF4D\u0326\u0326", '\234', ']', '\0'), new Class[0]);
        obj = ((Method) (obj1)).invoke(obj, new Object[0]);
        obj = (ppplpl)obj;
        obj1 = b041D041D041D041D041D041D_rrrrrr_ggrrgg_fld;
        Object obj3 = rrrrrr/ggrrgg.getMethod(nuuuuu.b0417041704170417041704170417("\uFFDB\uFFA9\uFFAD\uFFAA\uFFBF\uFFA9\uFFAD\uFFAA\uFFBF\uFFA9\uFFAD\uFFAA\uFFBF\uFFA9\uFFAD\uFFAA\uFFBF\u0398\u0398", 'A', 'F', '\0'), new Class[] {
            rrrrrr/ggrrgg, com/visa/cbp/external/enp/EnrollAndProvisionResponse
        });
        obj1 = ((Method) (obj3)).invoke(null, new Object[] {
            obj1, enrollandprovisionresponse
        });
        byte abyte0[];
        abyte0 = (byte[])obj1;
        obj3 = com/visa/cbp/external/enp/EnrollAndProvisionResponse.getMethod(nuuuuu.b0417041704170417041704170417("\u01C0\u01BE\u01CD\u01AD\u01C8\u01C4\u01BE\u01C7\u01A2\u01C7\u01BF\u01C8", 's', '\006'), new Class[0]);
        obj3 = ((Method) (obj3)).invoke(enrollandprovisionresponse, new Object[0]);
        Object obj4;
        obj3 = (TokenInfo)obj3;
        obj4 = com/visa/cbp/external/common/TokenInfo.getMethod(nuuuuu.b0417041704170417041704170417("\uFF1B\uFF19\uFF28\uFEFC\uFF17\uFF19\uFEF8\uFF15\uFF28\uFF15", '\246', '\003'), new Class[0]);
        obj3 = ((Method) (obj4)).invoke(obj3, new Object[0]);
        obj3 = (HCEData)obj3;
        obj4 = com/visa/cbp/external/common/HCEData.getMethod(nuuuuu.b0417041704170417041704170417("\306\304\325\345\330\317\361\300\323\300\314\322", '\241', '\002'), new Class[0]);
        obj3 = ((Method) (obj4)).invoke(obj3, new Object[0]);
        obj3 = (DynParams)obj3;
        obj4 = com/visa/cbp/external/common/DynParams.getMethod(nuuuuu.b0417041704170417041704170417("\r\013\032\uFFF1\013\037", '-', '\003'), new Class[0]);
        obj3 = ((Method) (obj4)).invoke(obj3, new Object[0]);
        obj3 = (String)obj3;
        obj4 = rrrrrr/plpllp.getMethod(nuuuuu.b0417041704170417041704170417("\u0314\u02E2\u02E6\u02E3\u02F4\u06CD\u06CD\u02E2\u02E6\u02E3\u02F4\u02E2\u02E6\u02E3\u02F4\u02E2\u02E6\u02E3\u02F4", '\346', '\006'), new Class[] {
            java/lang/String
        });
        obj2 = ((Method) (obj4)).invoke(obj2, new Object[] {
            obj3
        });
        obj2 = (ppllpl)obj2;
        obj3 = rrrrrr/rgrrgg.getMethod(nuuuuu.b0417041704170417041704170417("l\u0444\u0444\u0444>::O\u0444>::O", '\016', '\002'), new Class[] {
            com/visa/cbp/external/enp/EnrollAndProvisionResponse
        });
        ((Method) (obj3)).invoke(null, new Object[] {
            enrollandprovisionresponse
        });
        obj3 = b041D041D041D041D041D041D_rrrrrr_ggrrgg_fld;
        obj4 = b041D041D041D041D041D041D_com_visa_cbp_sdk_facade_data_EnrollProvisionRequestWrapper_fld;
        Object obj7 = com/visa/cbp/sdk/facade/data/EnrollProvisionRequestWrapper.getMethod(nuuuuu.b0417041704170417041704170417("\uFFC3\uFFC1\uFFD0\uFF9F\uFFBD\uFFCE\uFFC0\uFFAE\uFFC1\uFFC2\uFFA5\uFFC0", 'R', '\003'), new Class[0]);
        obj4 = ((Method) (obj7)).invoke(obj4, new Object[0]);
        obj4 = (String)obj4;
        obj7 = b041D041D041D041D041D041D_com_visa_cbp_sdk_facade_data_EnrollProvisionRequestWrapper_fld;
        Method method1 = com/visa/cbp/sdk/facade/data/EnrollProvisionRequestWrapper.getMethod(nuuuuu.b0417041704170417041704170417("\u01C8\u01C6\u01D5\u01A4\u01C2\u01D3\u01C5\u01A2\u01D3\u01D5\u01B6\u01D3\u01CA", '\220', '\321', '\003'), new Class[0]);
        obj7 = method1.invoke(obj7, new Object[0]);
        obj7 = (String)obj7;
        method1 = rrrrrr/ggrrgg.getMethod(nuuuuu.b0417041704170417041704170417("zHLI^\u0437\u0437HLI^\u0437\u0437", '\030', '\005'), new Class[] {
            java/lang/String, java/lang/String, com/visa/cbp/external/enp/EnrollAndProvisionResponse
        });
        obj3 = method1.invoke(obj3, new Object[] {
            obj4, obj7, enrollandprovisionresponse
        });
        obj3 = (ggggrr)obj3;
        obj4 = com/visa/cbp/external/enp/EnrollAndProvisionResponse.getMethod(nuuuuu.b0417041704170417041704170417("NL]}FBLG`GOF", ')', '\002'), new Class[0]);
        obj4 = ((Method) (obj4)).invoke(enrollandprovisionresponse, new Object[0]);
        obj4 = (TokenInfo)obj4;
        obj7 = com/visa/cbp/external/common/TokenInfo.getMethod(nuuuuu.b0417041704170417041704170417("\uFE8B\uFE89\uFE98\uFE78\uFE93\uFE8F\uFE89\uFE92\uFE77\uFE98\uFE85\uFE98\uFE99\uFE97", '\356', '\003'), new Class[0]);
        obj4 = ((Method) (obj7)).invoke(obj4, new Object[0]);
        obj4 = (Status)obj4;
        if (obj4 == null)
        {
            break MISSING_BLOCK_LABEL_688;
        }
        obj7 = com/visa/cbp/external/common/Status.getMethod(nuuuuu.b0417041704170417041704170417("B@O.O<OPN", '\361', '\314', '\001'), new Class[0]);
        obj4 = ((Method) (obj7)).invoke(obj4, new Object[0]);
        if ((String)obj4 != null)
        {
            break MISSING_BLOCK_LABEL_744;
        }
        obj4 = b041D041D041D041D041D041D_rrrrrr_ggrrgg_fld;
        obj7 = rrrrrr/ggrrgg.getMethod(nuuuuu.b0417041704170417041704170417("\u01D8\u0595\u0595\u0595\u0595\u01A6\u01AA\u01A7\u01BC\u0595", '\273', '\001'), new Class[] {
            rrrrrr/ggrrgg, com/visa/cbp/external/enp/EnrollAndProvisionResponse
        });
        ((Method) (obj7)).invoke(null, new Object[] {
            obj4, enrollandprovisionresponse
        });
_L2:
        1;
        JVM INSTR tableswitch 0 1: default 768
    //                   0 744
    //                   1 795;
           goto _L1 _L2 _L3
_L1:
        1;
        JVM INSTR tableswitch 0 1: default 792
    //                   0 744
    //                   1 795;
           goto _L1 _L2 _L3
_L3:
        obj4 = rrrrrr/ppplpl.getMethod(nuuuuu.b0417041704170417041704170417("~,(-^\u0407,(-^,(-^\u0407\u0407", '\034', '\002'), new Class[] {
            rrrrrr/ggggrr, [B, rrrrrr/ppllpl
        });
        obj = ((Method) (obj4)).invoke(obj, new Object[] {
            obj3, abyte0, obj2
        });
        abyte0 = (TokenKey)obj;
        obj = rrrrrr/ppllpl.getMethod(nuuuuu.b0417041704170417041704170417("\215[_^\\\u045C[_^\\[_^\\[_^\\[_^\\", '\022', '\031', '\003'), new Class[0]);
        ((Method) (obj)).invoke(obj2, new Object[0]);
        obj = b041D041D041D041D041D041D_rrrrrr_ggrrgg_fld;
        obj2 = rrrrrr/ggrrgg.getMethod(nuuuuu.b0417041704170417041704170417("\uFFC8\uFF96\uFF9A\uFF97\uFFAC\u0385\uFF96\uFF9A\uFF97\uFFAC\uFF96\uFF9A\uFF97\uFFAC\u0385\u0385", 'M', '\003'), new Class[] {
            com/visa/cbp/sdk/facade/data/TokenKey
        });
        obj = ((Method) (obj2)).invoke(obj, new Object[] {
            abyte0
        });
        obj = (ProvisionTokenResponse)obj;
        obj2 = b041D041D041D041D041D041D_rrrrrr_ggrrgg_fld;
        obj3 = rrrrrr/ggrrgg.getMethod(nuuuuu.b0417041704170417041704170417("\033\u03D8\uFFE9\uFFED\uFFEA\uFFFF\uFFE9\uFFED\uFFEA\uFFFF\uFFE9\uFFED\uFFEA\uFFFF\u03D8\u03D8", ',', '\033', '\0'), new Class[0]);
        obj2 = ((Method) (obj3)).invoke(obj2, new Object[0]);
        obj2 = (VisaPaymentSDKImpl)obj2;
        obj3 = com/visa/cbp/sdk/facade/VisaPaymentSDKImpl.getMethod(nuuuuu.b0417041704170417041704170417("\u017E\u017C\u018B\u016D\u017A\u0187\u017A\u018A\u0167\u0189\u0186\u017A\u017C\u018A\u018A\u0186\u0189", ']', '\006'), new Class[0]);
        obj2 = ((Method) (obj3)).invoke(obj2, new Object[0]);
        obj2 = (grrgrr)obj2;
        obj3 = com/visa/cbp/external/enp/EnrollAndProvisionResponse.getMethod(nuuuuu.b0417041704170417041704170417("\u024D\u024B\u025A\u023A\u0255\u0251\u024B\u0254\u022F\u0254\u024C\u0255", '\242', '\006'), new Class[0]);
        enrollandprovisionresponse = ((EnrollAndProvisionResponse) (((Method) (obj3)).invoke(enrollandprovisionresponse, new Object[0])));
        enrollandprovisionresponse = (TokenInfo)enrollandprovisionresponse;
        obj3 = rrrrrr/grrgrr.getMethod(nuuuuu.b0417041704170417041704170417("\u018E\u0562\u0562\u015C\u0160\u015F\u0162\u015C\u0160\u015F\u0162\u0562\u0562", '\226', '\001'), new Class[] {
            com/visa/cbp/sdk/facade/data/TokenKey, com/visa/cbp/external/common/TokenInfo
        });
        ((Method) (obj3)).invoke(obj2, new Object[] {
            abyte0, enrollandprovisionresponse
        });
        Method method;
        int i;
        int j;
        int k;
        try
        {
            enrollandprovisionresponse = b041D041D041D041D041D041D_rrrrrr_ggrrgg_fld;
        }
        // Misplaced declaration of an exception variable
        catch (EnrollAndProvisionResponse enrollandprovisionresponse)
        {
            throw enrollandprovisionresponse;
        }
        method = rrrrrr/ggrrgg.getMethod(nuuuuu.b0417041704170417041704170417("\370\u04B5\306\312\307\334\u04B5\u04B5\306\312\307\334\u04B5", '2', '\006'), new Class[] {
            rrrrrr/ggrrgg
        });
        method.invoke(null, new Object[] {
            enrollandprovisionresponse
        });
        enrollandprovisionresponse = b041D041D041D041D041D041D_rrrrrr_ggrrgg_fld;
        method = rrrrrr/ggrrgg.getMethod(nuuuuu.b0417041704170417041704170417("\u0197\u0165\u0169\u0166\u017B\u0165\u0169\u0166\u017B\u0554\u0554\u0165\u0169\u0166\u017B\u0554", 'l', '\311', '\003'), new Class[] {
            rrrrrr/ggrrgg
        });
        method.invoke(null, new Object[] {
            enrollandprovisionresponse
        });
        enrollandprovisionresponse = b041D041D041D041D041D041D_com_visa_cbp_sdk_facade_provider_ResponseCallback_fld;
        method = com/visa/cbp/sdk/facade/provider/ResponseCallback.getMethod(nuuuuu.b0417041704170417041704170417("\033\035\013\013\r\033\033", '\231', '\361', '\002'), new Class[] {
            java/lang/Object, com/visa/cbp/sdk/facade/data/GenericResponse
        });
        method.invoke(enrollandprovisionresponse, new Object[] {
            obj, genericresponse
        });
        enrollandprovisionresponse = rrrrrr/grgrrg.getMethod(nuuuuu.b0417041704170417041704170417("\030\u03F6\uFFE6\uFFEA\uFFEA\uFFE6\uFFE6\uFFEA\uFFEA\uFFE6\u03F6\u03F6\uFFE6\uFFEA\uFFEA\uFFE6", '%', '\003'), new Class[0]);
        try
        {
            enrollandprovisionresponse = ((EnrollAndProvisionResponse) (enrollandprovisionresponse.invoke(null, new Object[0])));
        }
        // Misplaced declaration of an exception variable
        catch (EnrollAndProvisionResponse enrollandprovisionresponse)
        {
            throw enrollandprovisionresponse.getCause();
        }
        i = ((Integer)enrollandprovisionresponse).intValue();
        switch ((i * (b041D041D041D041D041D041D_int_static_fld + i)) % b041D041D041D041D041D041D_int_static_fld)
        {
        default:
            enrollandprovisionresponse = rrrrrr/grgrrg.getMethod(nuuuuu.b0417041704170417041704170417("\uFF8C\u036A\uFF5A\uFF5E\uFF5E\uFF5A\uFF5A\uFF5E\uFF5E\uFF5A\u036A\u036A\uFF5A\uFF5E\uFF5E\uFF5A", 'k', '\003'), new Class[0]);
            Object obj5;
            Object obj6;
            Object obj8;
            Method method2;
            try
            {
                enrollandprovisionresponse = ((EnrollAndProvisionResponse) (enrollandprovisionresponse.invoke(null, new Object[0])));
            }
            // Misplaced declaration of an exception variable
            catch (EnrollAndProvisionResponse enrollandprovisionresponse)
            {
                throw enrollandprovisionresponse.getCause();
            }
            b041D041D041D041D041D041D_int_static_fld = ((Integer)enrollandprovisionresponse).intValue();
            enrollandprovisionresponse = rrrrrr/grgrrg.getMethod(nuuuuu.b0417041704170417041704170417("\uFFDA\u03B8\uFFA8\uFFAC\uFFAC\uFFA8\uFFA8\uFFAC\uFFAC\uFFA8\u03B8\u03B8\uFFA8\uFFAC\uFFAC\uFFA8", 'D', '\003'), new Class[0]);
            try
            {
                enrollandprovisionresponse = ((EnrollAndProvisionResponse) (enrollandprovisionresponse.invoke(null, new Object[0])));
            }
            // Misplaced declaration of an exception variable
            catch (EnrollAndProvisionResponse enrollandprovisionresponse)
            {
                throw enrollandprovisionresponse.getCause();
            }
            b041D041D041D041D041D041D_int_static_fld = ((Integer)enrollandprovisionresponse).intValue();
            break;

        case 0: // '\0'
            break;
        }
_L5:
        return;
        enrollandprovisionresponse;
        throw enrollandprovisionresponse.getCause();
        enrollandprovisionresponse;
        try
        {
            enrollandprovisionresponse = b041D041D041D041D041D041D_com_visa_cbp_sdk_facade_provider_ResponseCallback_fld;
            genericresponse = SDKErrorType.SQL_CONSTRAINT_EXCEPTION;
            obj = ReasonCode.DB_OPERATION_ERRORS;
        }
        // Misplaced declaration of an exception variable
        catch (EnrollAndProvisionResponse enrollandprovisionresponse)
        {
            throw enrollandprovisionresponse;
        }
        method = rrrrrr/lpplll.getMethod(nuuuuu.b0417041704170417041704170417("\uFF5A\uFF28\uFF2C\uFF2C\uFF2F\uFF28\uFF2C\uFF2C\uFF2F\u033F\uFF28\uFF2C\uFF2C\uFF2F\u033F\uFF28\uFF2C\uFF2C\uFF2F", 'X', '\004'), new Class[] {
            com/visa/cbp/sdk/facade/error/SDKErrorType, com/visa/cbp/sdk/facade/error/ReasonCode
        });
        genericresponse = ((GenericResponse) (method.invoke(null, new Object[] {
            genericresponse, obj
        })));
        genericresponse = (CbpError)genericresponse;
        obj = com/visa/cbp/sdk/facade/provider/ResponseCallback.getMethod(nuuuuu.b0417041704170417041704170417("\uFDC9\uFDC4\uFDCC\uFDCF\uFDD8\uFDD5\uFDC8", '\337', '\004'), new Class[] {
            com/visa/cbp/sdk/facade/error/CbpError
        });
        ((Method) (obj)).invoke(enrollandprovisionresponse, new Object[] {
            genericresponse
        });
        i = b041D041D041D041D041D041D_int_static_fld;
        j = b041D041D041D041D041D041D_int_static_fld;
        k = b041D041D041D041D041D041D_int_static_fld;
        (i * (j + i)) % k;
        JVM INSTR tableswitch 0 0: default 1568
    //                   0 1412;
           goto _L4 _L5
_L4:
        b041D041D041D041D041D041D_int_static_fld = 80;
        enrollandprovisionresponse = rrrrrr/grgrrg.getMethod(nuuuuu.b0417041704170417041704170417("\uFE8B\u0269\uFE59\uFE5D\uFE5D\uFE59\uFE59\uFE5D\uFE5D\uFE59\u0269\u0269\uFE59\uFE5D\uFE5D\uFE59", '\235', '\004'), new Class[0]);
        enrollandprovisionresponse = ((EnrollAndProvisionResponse) (enrollandprovisionresponse.invoke(null, new Object[0])));
        i = ((Integer)enrollandprovisionresponse).intValue();
        b041D041D041D041D041D041D_int_static_fld = i;
        return;
        enrollandprovisionresponse;
        throw enrollandprovisionresponse.getCause();
        enrollandprovisionresponse;
        throw enrollandprovisionresponse.getCause();
        enrollandprovisionresponse;
        throw enrollandprovisionresponse.getCause();
        enrollandprovisionresponse;
        throw enrollandprovisionresponse.getCause();
        enrollandprovisionresponse;
        throw enrollandprovisionresponse.getCause();
        enrollandprovisionresponse;
        throw enrollandprovisionresponse.getCause();
        enrollandprovisionresponse;
        throw enrollandprovisionresponse.getCause();
        enrollandprovisionresponse;
        throw enrollandprovisionresponse.getCause();
        enrollandprovisionresponse;
        throw enrollandprovisionresponse.getCause();
        enrollandprovisionresponse;
        throw enrollandprovisionresponse.getCause();
        enrollandprovisionresponse;
        throw enrollandprovisionresponse.getCause();
        enrollandprovisionresponse;
        throw enrollandprovisionresponse.getCause();
        obj5;
        obj8 = rrrrrr/ggrrgg.getMethod(nuuuuu.b0417041704170417041704170417("\u0154\u0122\u0126\u0123\u0138\u0511\u0511\u0511\u0122\u0126\u0123\u0138\u0511", '\363', '\001', '\002'), new Class[0]);
        obj8 = ((Method) (obj8)).invoke(null, new Object[0]);
        obj8 = (String)obj8;
        obj6 = ((NullPointerException) (obj5)).getMessage();
        method2 = rrrrrr/ppplpp.getMethod(nuuuuu.b0417041704170417041704170417("\u0203\u05B6\u01D1\u01D5\u01D2\u01D6\u05B6\u05B6\u01D1\u01D5\u01D2\u01D6\u05B6\u01D1\u01D5\u01D2\u01D6", '\314', '\325', '\003'), new Class[] {
            java/lang/String, java/lang/String
        });
        method2.invoke(null, new Object[] {
            obj8, obj6
        });
        obj6 = b041D041D041D041D041D041D_rrrrrr_ggrrgg_fld;
        obj8 = rrrrrr/ggrrgg.getMethod(nuuuuu.b0417041704170417041704170417("\b\u03C5\u03C5\u03C5\u03C5\uFFD6\uFFDA\uFFD7\uFFEC\u03C5", '\020', 'j', '\002'), new Class[] {
            rrrrrr/ggrrgg, com/visa/cbp/external/enp/EnrollAndProvisionResponse
        });
        ((Method) (obj8)).invoke(null, new Object[] {
            obj6, enrollandprovisionresponse
        });
          goto _L2
        enrollandprovisionresponse;
        throw enrollandprovisionresponse.getCause();
        enrollandprovisionresponse;
        throw enrollandprovisionresponse.getCause();
        enrollandprovisionresponse;
        throw enrollandprovisionresponse.getCause();
        enrollandprovisionresponse;
        throw enrollandprovisionresponse.getCause();
        obj6;
        throw ((InvocationTargetException) (obj6)).getCause();
        obj6;
        throw ((InvocationTargetException) (obj6)).getCause();
        enrollandprovisionresponse;
        throw enrollandprovisionresponse.getCause();
        enrollandprovisionresponse;
        throw enrollandprovisionresponse.getCause();
        enrollandprovisionresponse;
        throw enrollandprovisionresponse.getCause();
        enrollandprovisionresponse;
        throw enrollandprovisionresponse.getCause();
        obj6;
        throw ((InvocationTargetException) (obj6)).getCause();
        enrollandprovisionresponse;
        throw enrollandprovisionresponse.getCause();
        enrollandprovisionresponse;
        throw enrollandprovisionresponse.getCause();
        enrollandprovisionresponse;
        throw enrollandprovisionresponse.getCause();
        enrollandprovisionresponse;
        throw enrollandprovisionresponse.getCause();
        enrollandprovisionresponse;
        throw enrollandprovisionresponse.getCause();
        enrollandprovisionresponse;
        throw enrollandprovisionresponse.getCause();
        obj6;
        throw ((InvocationTargetException) (obj6)).getCause();
        enrollandprovisionresponse;
        throw enrollandprovisionresponse.getCause();
    }

    public void failure(CbpError cbperror)
    {
        Object obj;
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
        obj = rrrrrr/grrggg.getMethod(nuuuuu.b0417041704170417041704170417("\uFDF5\uFDC3\uFDC7\uFDC4\uFDD9\u01B2\u01B2\uFDC3\uFDC7\uFDC4\uFDD9\uFDC3\uFDC7\uFDC4\uFDD9\uFDC3\uFDC7\uFDC4\uFDD9", '\317', '\004'), new Class[] {
            com/visa/cbp/sdk/facade/error/CbpError
        });
        ((Method) (obj)).invoke(null, new Object[] {
            cbperror
        });
        int i = b041D041D041D041D041D041D_int_static_fld;
        if (((i + b041D041D041D041D041D041D_int_static_fld) * b041D041D041D041D041D041D_int_static_fld) % b041D041D041D041D041D041D_int_static_fld == b041D041D041D041D041D041D_int_static_fld)
        {
            break MISSING_BLOCK_LABEL_210;
        }
        b041D041D041D041D041D041D_int_static_fld = 66;
        obj = rrrrrr/grgrrg.getMethod(nuuuuu.b0417041704170417041704170417("\uFF08\u02E6\uFED6\uFEDA\uFEDA\uFED6\uFED6\uFEDA\uFEDA\uFED6\u02E6\u02E6\uFED6\uFEDA\uFEDA\uFED6", '\277', '\233', '\0'), new Class[0]);
        obj = ((Method) (obj)).invoke(null, new Object[0]);
        int j = ((Integer)obj).intValue();
        Method method;
        try
        {
            b041D041D041D041D041D041D_int_static_fld = j;
        }
        // Misplaced declaration of an exception variable
        catch (CbpError cbperror)
        {
            throw cbperror;
        }
        j = b041D041D041D041D041D041D_int_static_fld;
        switch ((j * (b041D041D041D041D041D041D_int_static_fld + j)) % b041D041D041D041D041D041D_int_static_fld)
        {
        default:
            b041D041D041D041D041D041D_int_static_fld = 42;
            b041D041D041D041D041D041D_int_static_fld = 8;
            break;

        case 0: // '\0'
            break;
        }
        obj = b041D041D041D041D041D041D_com_visa_cbp_sdk_facade_provider_ResponseCallback_fld;
        method = com/visa/cbp/sdk/facade/provider/ResponseCallback.getMethod(nuuuuu.b0417041704170417041704170417("\u030C\u0307\u030F\u0312\u031B\u0318\u030B", '\342', '\006'), new Class[] {
            com/visa/cbp/sdk/facade/error/CbpError
        });
        try
        {
            method.invoke(obj, new Object[] {
                cbperror
            });
            return;
        }
        // Misplaced declaration of an exception variable
        catch (CbpError cbperror) { }
        // Misplaced declaration of an exception variable
        catch (CbpError cbperror)
        {
            throw cbperror;
        }
        break MISSING_BLOCK_LABEL_265;
        cbperror;
        throw cbperror.getCause();
        throw cbperror.getCause();
        cbperror;
        throw cbperror.getCause();
    }

    public void success(Object obj, GenericResponse genericresponse)
    {
        int i = b041D041D041D041D041D041D_int_static_fld;
        Object obj1 = rrrrrr/grgrrg.getMethod(nuuuuu.b0417041704170417041704170417("\uFFB8\uFF86\uFF8A\uFF8A\uFF86\u0396\uFF86\uFF8A\uFF8A\uFF86\u0396\u0396\uFF86\uFF8A\uFF8A\uFF86", '\252', '\0'), new Class[0]);
        int j;
        try
        {
            obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw ((InvocationTargetException) (obj)).getCause();
        }
        switch (((((Integer)obj1).intValue() + i) * i) % b041D041D041D041D041D041D_int_static_fld)
        {
        default:
            b041D041D041D041D041D041D_int_static_fld = 6;
            b041D041D041D041D041D041D_int_static_fld = 30;
            break;

        case 0: // '\0'
            break;
        }
        0;
        JVM INSTR tableswitch 0 1: default 100
    //                   0 127
    //                   1 78;
           goto _L1 _L2 _L3
_L3:
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
_L2:
        1;
        JVM INSTR tableswitch 0 1: default 152
    //                   0 78
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
        break MISSING_BLOCK_LABEL_78;
_L7:
        obj1 = rrrrrr/grgrrg.getMethod(nuuuuu.b0417041704170417041704170417("\u0104\u04E2\322\326\326\322\322\326\326\322\u04E2\u04E2\322\326\326\322", 's', '/', '\003'), new Class[0]);
        try
        {
            obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw ((InvocationTargetException) (obj)).getCause();
        }
        i = ((Integer)obj1).intValue();
        j = b041D041D041D041D041D041D_int_static_fld;
        obj1 = rrrrrr/grgrrg.getMethod(nuuuuu.b0417041704170417041704170417("\uFFC5\u03A3\uFF93\uFF97\uFF97\uFF93\uFF93\uFF97\uFF97\uFF93\u03A3\u03A3\uFF93\uFF97\uFF97\uFF93", '\235', '\0'), new Class[0]);
        try
        {
            obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw ((InvocationTargetException) (obj)).getCause();
        }
        if ((((Integer)obj1).intValue() * (j + i)) % b041D041D041D041D041D041D_int_static_fld != b041D041D041D041D041D041D_int_static_fld)
        {
            obj1 = rrrrrr/grgrrg.getMethod(nuuuuu.b0417041704170417041704170417("\u014A\u0528\u0118\u011C\u011C\u0118\u0118\u011C\u011C\u0118\u0528\u0528\u0118\u011C\u011C\u0118", '\350', '\005'), new Class[0]);
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
            obj1 = rrrrrr/grgrrg.getMethod(nuuuuu.b0417041704170417041704170417("\uFFFE\u03DC\uFFCC\uFFD0\uFFD0\uFFCC\uFFCC\uFFD0\uFFD0\uFFCC\u03DC\u03DC\uFFCC\uFFD0\uFFD0\uFFCC", '\035', 'G', '\0'), new Class[0]);
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
        obj = (EnrollAndProvisionResponse)obj;
        obj1 = rrrrrr/grgrrg.getMethod(nuuuuu.b0417041704170417041704170417("\231\u0477\u0477\u0477gkkg\u0477gkkg", '^', '\'', '\002'), new Class[] {
            com/visa/cbp/external/enp/EnrollAndProvisionResponse, com/visa/cbp/sdk/facade/data/GenericResponse
        });
        try
        {
            ((Method) (obj1)).invoke(this, new Object[] {
                obj, genericresponse
            });
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw ((InvocationTargetException) (obj)).getCause();
        }
    }
}
