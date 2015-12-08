// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rrrrrr;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import com.visa.cbp.external.aam.CheckStatusRequest;
import com.visa.cbp.external.aam.ReplenishAckRequest;
import com.visa.cbp.external.aam.ReplenishRequest;
import com.visa.cbp.external.aam.ReplenishResponse;
import com.visa.cbp.external.common.DynParams;
import com.visa.cbp.external.common.HCEData;
import com.visa.cbp.external.common.Status;
import com.visa.cbp.external.common.TokenInfo;
import com.visa.cbp.external.common.UpdateReason;
import com.visa.cbp.external.enp.EnrollAndProvisionResponse;
import com.visa.cbp.external.lcm.LcmTokenRequest;
import com.visa.cbp.external.ppv.UploadTxnsRequest;
import com.visa.cbp.sdk.facade.VisaPaymentSDK;
import com.visa.cbp.sdk.facade.VisaPaymentSDKImpl;
import com.visa.cbp.sdk.facade.activeaccountmanagement.CheckStatusCallback;
import com.visa.cbp.sdk.facade.activeaccountmanagement.ReplenishmentService;
import com.visa.cbp.sdk.facade.data.EnrollProvisionRequestWrapper;
import com.visa.cbp.sdk.facade.data.GenericResponse;
import com.visa.cbp.sdk.facade.data.LcmParams;
import com.visa.cbp.sdk.facade.data.NotificationAction;
import com.visa.cbp.sdk.facade.data.TokenData;
import com.visa.cbp.sdk.facade.data.TokenKey;
import com.visa.cbp.sdk.facade.data.TokenStatus;
import com.visa.cbp.sdk.facade.data.TvlEntry;
import com.visa.cbp.sdk.facade.error.CbpError;
import com.visa.cbp.sdk.facade.error.TokenStatusError;
import com.visa.cbp.sdk.facade.provider.CheckStatusProvider;
import com.visa.cbp.sdk.facade.provider.DeleteTokenProvider;
import com.visa.cbp.sdk.facade.provider.ReplenishmentProvider;
import com.visa.cbp.sdk.facade.provider.ResponseCallback;
import com.visa.cbp.sdk.facade.provider.ResumeTokenProvider;
import com.visa.cbp.sdk.facade.provider.SuspendTokenProvider;
import com.visa.cbp.sdk.facade.provider.TokenProvider;
import com.visa.cbp.sdk.facade.request.ReplenishParams;
import com.visa.cbp.sdk.facade.response.ProvisionTokenResponse;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import uuuuuu.nuuuuu;

// Referenced classes of package rrrrrr:
//            rggggr, ppplpl, grrrrr, ppplpp, 
//            llpllp, grgrgr, lppllp, grrgrg, 
//            pllppl, plpllp, rggrrr, rgrrgg, 
//            rggrgg, ggggrr, rrgrrr, grrggg, 
//            plllpl, rrgrrg, rrrgrg, ggrrrg, 
//            pplpll, gggrrg, llplpp, llpppl, 
//            ggrrgr, ggrggg, rggrrg, grgrrg

public class ggrrgg
{

    public static int b042604260426042604260426_int_static_fld = 2;
    public static int b042604260426042604260426_int_static_fld = 75;
    public static int b042604260426042604260426_int_static_fld = 1;
    public static int b042604260426042604260426_int_static_fld;
    private static final String b042604260426042604260426_java_lang_String_static_fld;
    private DeleteTokenProvider b042604260426042604260426_com_visa_cbp_sdk_facade_provider_DeleteTokenProvider_fld;
    private ReplenishmentProvider b042604260426042604260426_com_visa_cbp_sdk_facade_provider_ReplenishmentProvider_fld;
    private CheckStatusProvider b042604260426042604260426_com_visa_cbp_sdk_facade_provider_CheckStatusProvider_fld;
    private TokenProvider b042604260426042604260426_com_visa_cbp_sdk_facade_provider_TokenProvider_fld;
    private ResumeTokenProvider b042604260426042604260426_com_visa_cbp_sdk_facade_provider_ResumeTokenProvider_fld;
    private Context b042604260426042604260426_android_content_Context_fld;
    private ppplpl b042604260426042604260426_rrrrrr_ppplpl_fld;
    private SuspendTokenProvider b042604260426042604260426_com_visa_cbp_sdk_facade_provider_SuspendTokenProvider_fld;

    public ggrrgg(Context context, CheckStatusProvider checkstatusprovider, ppplpl ppplpl1)
    {
        int i = b042604260426042604260426_int_static_fld;
        switch ((i * (b042604260426042604260426_int_static_fld + i)) % b042604260426042604260426_int_static_fld)
        {
        default:
            b042604260426042604260426_int_static_fld = 9;
            Object obj = rrrrrr/ggrrgg.getMethod(nuuuuu.b0417041704170417041704170417("\uFFE6\uFFB4\uFFB8\uFFB8\uFFC5\u03CE\u03CE\uFFB4\uFFB8\uFFB8\uFFC5\u03CE\uFFB4\uFFB8\uFFB8\uFFC5", '^', '\036', '\0'), new Class[0]);
            int j;
            int k;
            int l;
            try
            {
                obj = ((Method) (obj)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                throw context.getCause();
            }
            b042604260426042604260426_int_static_fld = ((Integer)obj).intValue();
            break;

        case 0: // '\0'
            break;
        }
        this(context, ppplpl1);
        try
        {
            j = b042604260426042604260426_int_static_fld;
            k = b042604260426042604260426_int_static_fld;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw context;
        }
        try
        {
            l = b042604260426042604260426_int_static_fld;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw context;
        }
        (j * (k + j)) % l;
        JVM INSTR tableswitch 0 0: default 136
    //                   0 184;
           goto _L1 _L2
_L1:
        context = rrrrrr/ggrrgg.getMethod(nuuuuu.b0417041704170417041704170417("\uFF86\uFF54\uFF58\uFF58\uFF65\u036E\u036E\uFF54\uFF58\uFF58\uFF65\u036E\uFF54\uFF58\uFF58\uFF65", '\334', '\0'), new Class[0]);
        context = ((Context) (context.invoke(null, new Object[0])));
        j = ((Integer)context).intValue();
        b042604260426042604260426_int_static_fld = j;
        b042604260426042604260426_int_static_fld = 15;
_L2:
        try
        {
            b042604260426042604260426_com_visa_cbp_sdk_facade_provider_CheckStatusProvider_fld = checkstatusprovider;
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context) { }
        break; /* Loop/switch isn't completed */
        context;
        throw context;
        throw context;
        context;
        throw context.getCause();
    }

    public ggrrgg(Context context, DeleteTokenProvider deletetokenprovider, ppplpl ppplpl1)
    {
        int i = b042604260426042604260426_int_static_fld;
        switch ((i * (b042604260426042604260426_int_static_fld + i)) % b042604260426042604260426_int_static_fld)
        {
        default:
            Object obj = rrrrrr/ggrrgg.getMethod(nuuuuu.b0417041704170417041704170417("zHLLY\u0462\u0462HLLY\u0462HLLY", 'c', '{', '\001'), new Class[0]);
            int j;
            try
            {
                obj = ((Method) (obj)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                throw context.getCause();
            }
            b042604260426042604260426_int_static_fld = ((Integer)obj).intValue();
            b042604260426042604260426_int_static_fld = 59;
            break;

        case 0: // '\0'
            break;
        }
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
        this(context, ppplpl1);
        b042604260426042604260426_com_visa_cbp_sdk_facade_provider_DeleteTokenProvider_fld = deletetokenprovider;
        j = b042604260426042604260426_int_static_fld;
        switch ((j * (b042604260426042604260426_int_static_fld + j)) % b042604260426042604260426_int_static_fld)
        {
        default:
            b042604260426042604260426_int_static_fld = 70;
            context = rrrrrr/ggrrgg.getMethod(nuuuuu.b0417041704170417041704170417("\005WSS&\u042D\u042DWSS&\u042DWSS&", 'g', '\002'), new Class[0]);
            try
            {
                context = ((Context) (context.invoke(null, new Object[0])));
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                throw context.getCause();
            }
            b042604260426042604260426_int_static_fld = ((Integer)context).intValue();
            // fall through

        case 0: // '\0'
            return;
        }
    }

    public ggrrgg(Context context, ReplenishmentProvider replenishmentprovider, ppplpl ppplpl1)
    {
        int i = b042604260426042604260426_int_static_fld;
        switch ((i * (b042604260426042604260426_int_static_fld + i)) % b042604260426042604260426_int_static_fld)
        {
        default:
            Object obj = rrrrrr/ggrrgg.getMethod(nuuuuu.b0417041704170417041704170417("\272\210\214\214\231\u04A2\u04A2\210\214\214\231\u04A2\210\214\214\231", '\002', 'Z', '\001'), new Class[0]);
            try
            {
                obj = ((Method) (obj)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                throw context.getCause();
            }
            b042604260426042604260426_int_static_fld = ((Integer)obj).intValue();
            obj = rrrrrr/ggrrgg.getMethod(nuuuuu.b0417041704170417041704170417("\u02A2\u0270\u0274\u0274\u0281\u068A\u068A\u0270\u0274\u0274\u0281\u068A\u0270\u0274\u0274\u0281", '\300', '\006'), new Class[0]);
            try
            {
                obj = ((Method) (obj)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                throw context.getCause();
            }
            b042604260426042604260426_int_static_fld = ((Integer)obj).intValue();
            break;

        case 0: // '\0'
            break;
        }
        try
        {
            this(context, ppplpl1);
            b042604260426042604260426_com_visa_cbp_sdk_facade_provider_ReplenishmentProvider_fld = replenishmentprovider;
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw context;
        }
    }

    public ggrrgg(Context context, ResumeTokenProvider resumetokenprovider, ppplpl ppplpl1)
    {
        this(context, ppplpl1);
        b042604260426042604260426_com_visa_cbp_sdk_facade_provider_ResumeTokenProvider_fld = resumetokenprovider;
    }

    public ggrrgg(Context context, SuspendTokenProvider suspendtokenprovider, ppplpl ppplpl1)
    {
        int i = b042604260426042604260426_int_static_fld;
        switch ((i * (b042604260426042604260426_int_static_fld + i)) % b042604260426042604260426_int_static_fld)
        {
        default:
            b042604260426042604260426_int_static_fld = 23;
            b042604260426042604260426_int_static_fld = 45;
            // fall through

        case 0: // '\0'
            i = b042604260426042604260426_int_static_fld;
            break;
        }
        switch ((i * (b042604260426042604260426_int_static_fld + i)) % b042604260426042604260426_int_static_fld)
        {
        default:
            b042604260426042604260426_int_static_fld = 39;
            Object obj = rrrrrr/ggrrgg.getMethod(nuuuuu.b0417041704170417041704170417("\202PTTa\u046A\u046APTTa\u046APTTa", '\240', '\200', '\002'), new Class[0]);
            try
            {
                obj = ((Method) (obj)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                throw context.getCause();
            }
            b042604260426042604260426_int_static_fld = ((Integer)obj).intValue();
            break;

        case 0: // '\0'
            break;
        }
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
        this(context, ppplpl1);
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
        b042604260426042604260426_com_visa_cbp_sdk_facade_provider_SuspendTokenProvider_fld = suspendtokenprovider;
    }

    public ggrrgg(Context context, TokenProvider tokenprovider, ppplpl ppplpl1)
    {
label0:
        {
            Object obj;
            int i;
            int j;
            int k;
            try
            {
                i = b042604260426042604260426_int_static_fld;
                j = b042604260426042604260426_int_static_fld;
                k = b042604260426042604260426_int_static_fld;
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                throw context;
            }
            try
            {
                if (((i + j) * k) % b042604260426042604260426_int_static_fld == b042604260426042604260426_int_static_fld)
                {
                    break label0;
                }
                b042604260426042604260426_int_static_fld = 95;
                b042604260426042604260426_int_static_fld = 14;
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                throw context;
            }
            obj = rrrrrr/ggrrgg.getMethod(nuuuuu.b0417041704170417041704170417("\u0128\366\372\372\u0107\u0510\u0510\366\372\372\u0107\u0510\366\372\372\u0107", '\214', ':', '\003'), new Class[0]);
            try
            {
                obj = ((Method) (obj)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                throw context.getCause();
            }
            i = ((Integer)obj).intValue();
            j = b042604260426042604260426_int_static_fld;
            obj = rrrrrr/ggrrgg.getMethod(nuuuuu.b0417041704170417041704170417("\u0113\341\345\345\362\u04FB\u04FB\341\345\345\362\u04FB\341\345\345\362", ' ', '\321', '\001'), new Class[0]);
            try
            {
                obj = ((Method) (obj)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                throw context.getCause();
            }
            if ((((Integer)obj).intValue() * (j + i)) % b042604260426042604260426_int_static_fld != b042604260426042604260426_int_static_fld)
            {
                Object obj1 = rrrrrr/ggrrgg.getMethod(nuuuuu.b0417041704170417041704170417("D\022\026\026#\u042C\u042C\022\026\026#\u042C\022\026\026#", '\002', '\034', '\0'), new Class[0]);
                try
                {
                    obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
                }
                // Misplaced declaration of an exception variable
                catch (Context context)
                {
                    throw context.getCause();
                }
                b042604260426042604260426_int_static_fld = ((Integer)obj1).intValue();
                b042604260426042604260426_int_static_fld = 51;
            }
        }
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
        this(context, ppplpl1);
        b042604260426042604260426_com_visa_cbp_sdk_facade_provider_TokenProvider_fld = tokenprovider;
        return;
    }

    private ggrrgg(Context context, ppplpl ppplpl1)
    {
        b042604260426042604260426_android_content_Context_fld = context;
        int i = b042604260426042604260426_int_static_fld;
        switch ((i * (b042604260426042604260426_int_static_fld + i)) % b042604260426042604260426_int_static_fld)
        {
        default:
            context = rrrrrr/ggrrgg.getMethod(nuuuuu.b0417041704170417041704170417("\u013C\u010A\u010E\u010E\u011B\u0524\u0524\u010A\u010E\u010E\u011B\u0524\u010A\u010E\u010E\u011B", 'm', '\001'), new Class[0]);
            int j;
            try
            {
                context = ((Context) (context.invoke(null, new Object[0])));
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                throw context.getCause();
            }
            b042604260426042604260426_int_static_fld = ((Integer)context).intValue();
            j = b042604260426042604260426_int_static_fld;
            switch ((j * (b042604260426042604260426_int_static_fld + j)) % b042604260426042604260426_int_static_fld)
            {
            default:
                b042604260426042604260426_int_static_fld = 70;
                b042604260426042604260426_int_static_fld = 68;
                // fall through

            case 0: // '\0'
                b042604260426042604260426_int_static_fld = 45;
                break;
            }
            break;

        case 0: // '\0'
            break;
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
        b042604260426042604260426_rrrrrr_ppplpl_fld = ppplpl1;
label1:
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
                        continue label1;

                    case 1: // '\001'
                        break label1;
                    }
                }
                break;

            case 0: // '\0'
                break;

            case 1: // '\001'
                break label1;
            }
        } while (true);
    }

    public static byte[] b041F041F041F041F041F041F(ggrrgg ggrrgg1, EnrollAndProvisionResponse enrollandprovisionresponse)
    {
        Method method;
        int i = b042604260426042604260426_int_static_fld;
        switch ((i * (b042604260426042604260426_int_static_fld + i)) % b042604260426042604260426_int_static_fld)
        {
        default:
            b042604260426042604260426_int_static_fld = 97;
            b042604260426042604260426_int_static_fld = 17;
            // fall through

        case 0: // '\0'
            method = rrrrrr/ggrrgg.getDeclaredMethod(nuuuuu.b0417041704170417041704170417("\340\u04C8\256\262\262\277\256\262\262\277\256\262\262\277\u04C8\256\262\262\277", '*', '\006'), new Class[] {
                com/visa/cbp/external/enp/EnrollAndProvisionResponse
            });
            break;
        }
        ggrrgg1 = ((ggrrgg) (method.invoke(ggrrgg1, new Object[] {
            enrollandprovisionresponse
        })));
        return (byte[])ggrrgg1;
        ggrrgg1;
        try
        {
            throw ggrrgg1.getCause();
        }
        // Misplaced declaration of an exception variable
        catch (ggrrgg ggrrgg1)
        {
            throw ggrrgg1;
        }
    }

    public static boolean b041F041F041F041F041F041F(ggrrgg ggrrgg1, TokenKey tokenkey, Status status)
    {
        int i = b042604260426042604260426_int_static_fld;
        Object obj = rrrrrr/ggrrgg.getMethod(nuuuuu.b0417041704170417041704170417("\u020E\u01DC\u01E0\u01E0\u01ED\u05F6\u01DC\u01E0\u01E0\u01ED\u01DC\u01E0\u01E0\u01ED\u05F6\u01DC\u01E0\u01E0\u01ED", '\326', '\001'), new Class[0]);
        int k;
        try
        {
            obj = ((Method) (obj)).invoke(null, new Object[0]);
        }
        // Misplaced declaration of an exception variable
        catch (ggrrgg ggrrgg1)
        {
            throw ggrrgg1.getCause();
        }
        k = ((Integer)obj).intValue();
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
        if (((k + i) * b042604260426042604260426_int_static_fld) % b042604260426042604260426_int_static_fld != b042604260426042604260426_int_static_fld)
        {
            int j = b042604260426042604260426_int_static_fld;
            switch ((j * (b042604260426042604260426_int_static_fld + j)) % b042604260426042604260426_int_static_fld)
            {
            default:
                Object obj1 = rrrrrr/ggrrgg.getMethod(nuuuuu.b0417041704170417041704170417("\uFFE9\uFFB7\uFFBB\uFFBB\uFFC8\u03D1\u03D1\uFFB7\uFFBB\uFFBB\uFFC8\u03D1\uFFB7\uFFBB\uFFBB\uFFC8", 'y', '\0'), new Class[0]);
                try
                {
                    obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
                }
                // Misplaced declaration of an exception variable
                catch (ggrrgg ggrrgg1)
                {
                    throw ggrrgg1.getCause();
                }
                b042604260426042604260426_int_static_fld = ((Integer)obj1).intValue();
                obj1 = rrrrrr/ggrrgg.getMethod(nuuuuu.b0417041704170417041704170417("\370\306\312\312\327\u04E0\u04E0\306\312\312\327\u04E0\306\312\312\327", 'n', '(', '\003'), new Class[0]);
                try
                {
                    obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
                }
                // Misplaced declaration of an exception variable
                catch (ggrrgg ggrrgg1)
                {
                    throw ggrrgg1.getCause();
                }
                b042604260426042604260426_int_static_fld = ((Integer)obj1).intValue();
                // fall through

            case 0: // '\0'
                obj1 = rrrrrr/ggrrgg.getMethod(nuuuuu.b0417041704170417041704170417("\u0221\u01EF\u01F3\u01F3\u0200\u0609\u0609\u01EF\u01F3\u01F3\u0200\u0609\u01EF\u01F3\u01F3\u0200", '\225', '\006'), new Class[0]);
                break;
            }
            try
            {
                obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (ggrrgg ggrrgg1)
            {
                throw ggrrgg1.getCause();
            }
            b042604260426042604260426_int_static_fld = ((Integer)obj1).intValue();
            b042604260426042604260426_int_static_fld = 31;
        }
        obj1 = rrrrrr/ggrrgg.getDeclaredMethod(nuuuuu.b0417041704170417041704170417("\u01C7\u0195\u0199\u0196\u01AB\u0584\u0584\u0584\u0584\u0584", 'w', '\006'), new Class[] {
            com/visa/cbp/sdk/facade/data/TokenKey, com/visa/cbp/external/common/Status
        });
        ggrrgg1 = ((ggrrgg) (((Method) (obj1)).invoke(ggrrgg1, new Object[] {
            tokenkey, status
        })));
        return ((Boolean)ggrrgg1).booleanValue();
        ggrrgg1;
        try
        {
            throw ggrrgg1.getCause();
        }
        // Misplaced declaration of an exception variable
        catch (ggrrgg ggrrgg1)
        {
            throw ggrrgg1;
        }
    }

    public static void b041F041F041F041F041F041F(ggrrgg ggrrgg1, LcmTokenRequest lcmtokenrequest, TokenStatus tokenstatus, UpdateReason updatereason, GenericResponse genericresponse, ResponseCallback responsecallback)
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
        int i = b042604260426042604260426_int_static_fld;
        int j = b042604260426042604260426_int_static_fld;
        int k = b042604260426042604260426_int_static_fld;
        int l = b042604260426042604260426_int_static_fld;
        Object obj = rrrrrr/ggrrgg.getMethod(nuuuuu.b0417041704170417041704170417("I\027\033\033(\u0431\u0431\027\033\033(\u0431\027\033\033(", '\314', '\345', '\002'), new Class[0]);
        int i1;
        try
        {
            obj = ((Method) (obj)).invoke(null, new Object[0]);
        }
        // Misplaced declaration of an exception variable
        catch (ggrrgg ggrrgg1)
        {
            throw ggrrgg1.getCause();
        }
        i1 = ((Integer)obj).intValue();
        switch ((i1 * (b042604260426042604260426_int_static_fld + i1)) % b042604260426042604260426_int_static_fld)
        {
        default:
            b042604260426042604260426_int_static_fld = 45;
            b042604260426042604260426_int_static_fld = 83;
            break;

        case 0: // '\0'
            break;
        }
        if (((i + j) * k) % l != b042604260426042604260426_int_static_fld)
        {
            Object obj1 = rrrrrr/ggrrgg.getMethod(nuuuuu.b0417041704170417041704170417("N\034  -\u0436\u0436\034  -\u0436\034  -", '\024', '\0'), new Class[0]);
            try
            {
                obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (ggrrgg ggrrgg1)
            {
                throw ggrrgg1.getCause();
            }
            b042604260426042604260426_int_static_fld = ((Integer)obj1).intValue();
            b042604260426042604260426_int_static_fld = 45;
        }
        obj1 = rrrrrr/ggrrgg.getDeclaredMethod(nuuuuu.b0417041704170417041704170417("\u0137\u0105\u0109\u0109\u0116\u0105\u0109\u0109\u0116\u051F\u0105\u0109\u0109\u0116\u0105\u0109\u0109\u0116\u0105\u0109\u0109\u0116", '\247', '.', '\003'), new Class[] {
            com/visa/cbp/external/lcm/LcmTokenRequest, com/visa/cbp/sdk/facade/data/TokenStatus, com/visa/cbp/external/common/UpdateReason, com/visa/cbp/sdk/facade/data/GenericResponse, com/visa/cbp/sdk/facade/provider/ResponseCallback
        });
        try
        {
            ((Method) (obj1)).invoke(ggrrgg1, new Object[] {
                lcmtokenrequest, tokenstatus, updatereason, genericresponse, responsecallback
            });
            return;
        }
        // Misplaced declaration of an exception variable
        catch (ggrrgg ggrrgg1)
        {
            throw ggrrgg1.getCause();
        }
    }

    private void b041F041F041F041F041F041F()
    {
_L2:
        Object obj = java/lang/String.getMethod(nuuuuu.b0417041704170417041704170417("\uFF2A\uFF23\uFF2C\uFF25\uFF32\uFF26", '\241', '\003'), new Class[0]);
        obj = ((Method) (obj)).invoke(null, new Object[0]);
        ((Integer)obj).intValue();
        int i = b042604260426042604260426_int_static_fld;
        int j = b042604260426042604260426_int_static_fld;
        int k = b042604260426042604260426_int_static_fld;
        obj = rrrrrr/ggrrgg.getMethod(nuuuuu.b0417041704170417041704170417("\321\237\243\243\260\237\243\243\260\u04B9\237\243\243\260\u04B9\237\243\243\260", 'o', '\005'), new Class[0]);
        try
        {
            obj = ((Method) (obj)).invoke(null, new Object[0]);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj2)
        {
            throw ((InvocationTargetException) (obj2)).getCause();
        }
        if ((k * (i + j)) % ((Integer)obj).intValue() != b042604260426042604260426_int_static_fld)
        {
            Object obj1 = rrrrrr/ggrrgg.getMethod(nuuuuu.b0417041704170417041704170417("\247\365\361\361\204\u048F\u048F\365\361\361\204\u048F\365\361\361\204", '\305', '\002'), new Class[0]);
            Object obj2;
            try
            {
                obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
            }
            catch (InvocationTargetException invocationtargetexception)
            {
                throw invocationtargetexception.getCause();
            }
            b042604260426042604260426_int_static_fld = ((Integer)obj1).intValue();
            obj1 = rrrrrr/ggrrgg.getMethod(nuuuuu.b0417041704170417041704170417("\376\314\320\320\335\u04E6\u04E6\314\320\320\335\u04E6\314\320\320\335", '\234', '\005'), new Class[0]);
            try
            {
                obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
            }
            catch (InvocationTargetException invocationtargetexception1)
            {
                throw invocationtargetexception1.getCause();
            }
            b042604260426042604260426_int_static_fld = ((Integer)obj1).intValue();
        }
        if (true) goto _L2; else goto _L1
_L1:
        obj2;
        try
        {
            throw ((InvocationTargetException) (obj2)).getCause();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj2)
        {
            obj2 = rrrrrr/ggrrgg.getMethod(nuuuuu.b0417041704170417041704170417("\336\254\260\260\275\u04C6\u04C6\254\260\260\275\u04C6\254\260\260\275", '>', '\001'), new Class[0]);
        }
        try
        {
            obj2 = ((Method) (obj2)).invoke(null, new Object[0]);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj2)
        {
            throw ((InvocationTargetException) (obj2)).getCause();
        }
        b042604260426042604260426_int_static_fld = ((Integer)obj2).intValue();
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
        obj2 = rrrrrr/rggggr.getMethod(nuuuuu.b0417041704170417041704170417("\u0326\u02F4\u02F8\u02F8\u02F4\u0704\u02F4\u02F8\u02F8\u02F4\u0704\u0704\u0704", '\354', '\006'), new Class[0]);
        try
        {
            ((Method) (obj2)).invoke(null, new Object[0]);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj2)
        {
            throw ((InvocationTargetException) (obj2)).getCause();
        }
    }

    public static void b041F041F041F041F041F041F(ggrrgg ggrrgg1)
    {
        Object obj;
        int i;
        int j;
        int k;
        int l;
        int i1;
        try
        {
            i = b042604260426042604260426_int_static_fld;
        }
        // Misplaced declaration of an exception variable
        catch (ggrrgg ggrrgg1)
        {
            throw ggrrgg1;
        }
        obj = rrrrrr/ggrrgg.getMethod(nuuuuu.b0417041704170417041704170417("\245sww\204\u048Dsww\204sww\204\u048Dsww\204", 'C', '\005'), new Class[0]);
        obj = ((Method) (obj)).invoke(null, new Object[0]);
        j = ((Integer)obj).intValue();
        k = b042604260426042604260426_int_static_fld;
        l = b042604260426042604260426_int_static_fld;
        try
        {
            i1 = b042604260426042604260426_int_static_fld;
        }
        // Misplaced declaration of an exception variable
        catch (ggrrgg ggrrgg1)
        {
            throw ggrrgg1;
        }
        if (((j + i) * k) % l == i1)
        {
            break MISSING_BLOCK_LABEL_231;
        }
        obj = rrrrrr/ggrrgg.getMethod(nuuuuu.b0417041704170417041704170417("\260\342\346\346\223\u0498\u0498\342\346\346\223\u0498\342\346\346\223", '\322', '\002'), new Class[0]);
        obj = ((Method) (obj)).invoke(null, new Object[0]);
        i = ((Integer)obj).intValue();
        b042604260426042604260426_int_static_fld = i;
        obj = rrrrrr/ggrrgg.getMethod(nuuuuu.b0417041704170417041704170417("\u0178\u0146\u014A\u014A\u0157\u0560\u0560\u0146\u014A\u014A\u0157\u0560\u0146\u014A\u014A\u0157", '\213', '\001'), new Class[0]);
        obj = ((Method) (obj)).invoke(null, new Object[0]);
        i = ((Integer)obj).intValue();
        b042604260426042604260426_int_static_fld = i;
        i = b042604260426042604260426_int_static_fld;
        switch ((i * (b042604260426042604260426_int_static_fld + i)) % b042604260426042604260426_int_static_fld)
        {
        default:
            obj = rrrrrr/ggrrgg.getMethod(nuuuuu.b0417041704170417041704170417("\215[__l\u0475\u0475[__l\u0475[__l", '\212', '\265', '\001'), new Class[0]);
            try
            {
                obj = ((Method) (obj)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (ggrrgg ggrrgg1)
            {
                throw ggrrgg1.getCause();
            }
            b042604260426042604260426_int_static_fld = ((Integer)obj).intValue();
            b042604260426042604260426_int_static_fld = 18;
            break;

        case 0: // '\0'
            break;
        }
        obj = rrrrrr/ggrrgg.getDeclaredMethod(nuuuuu.b0417041704170417041704170417("\u01C8\u0196\u019A\u0197\u01AC\u0196\u019A\u0197\u01AC\u0585\u0196\u019A\u0197\u01AC\u0585\u0585", '\263', '\001'), new Class[0]);
        ((Method) (obj)).invoke(ggrrgg1, new Object[0]);
        return;
        ggrrgg1;
        throw ggrrgg1.getCause();
        ggrrgg1;
        try
        {
            throw ggrrgg1.getCause();
        }
        // Misplaced declaration of an exception variable
        catch (ggrrgg ggrrgg1) { }
        throw ggrrgg1;
        ggrrgg1;
        throw ggrrgg1.getCause();
        ggrrgg1;
        throw ggrrgg1.getCause();
    }

    public static boolean b041F041F041F041F041F041F(ggrrgg ggrrgg1, TokenKey tokenkey, ReplenishResponse replenishresponse)
    {
        if (((b042604260426042604260426_int_static_fld + b042604260426042604260426_int_static_fld) * b042604260426042604260426_int_static_fld) % b042604260426042604260426_int_static_fld != b042604260426042604260426_int_static_fld)
        {
            int i = b042604260426042604260426_int_static_fld;
            int j = b042604260426042604260426_int_static_fld;
            int k = b042604260426042604260426_int_static_fld;
            int l = b042604260426042604260426_int_static_fld;
            Object obj = rrrrrr/ggrrgg.getMethod(nuuuuu.b0417041704170417041704170417("\u0101\u04E9\317\323\323\340\u04E9\317\323\323\340\u04E9\317\323\323\340", '\017', '\220', '\003'), new Class[0]);
            try
            {
                obj = ((Method) (obj)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (ggrrgg ggrrgg1)
            {
                throw ggrrgg1.getCause();
            }
            if (((i + j) * k) % l != ((Integer)obj).intValue())
            {
                b042604260426042604260426_int_static_fld = 74;
                b042604260426042604260426_int_static_fld = 22;
            }
            obj = rrrrrr/ggrrgg.getMethod(nuuuuu.b0417041704170417041704170417("\uFF71\uFF3F\uFF43\uFF43\uFF50\u0359\u0359\uFF3F\uFF43\uFF43\uFF50\u0359\uFF3F\uFF43\uFF43\uFF50", '\361', '\0'), new Class[0]);
            try
            {
                obj = ((Method) (obj)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (ggrrgg ggrrgg1)
            {
                throw ggrrgg1.getCause();
            }
            b042604260426042604260426_int_static_fld = ((Integer)obj).intValue();
            obj = rrrrrr/ggrrgg.getMethod(nuuuuu.b0417041704170417041704170417("\u0246\u0214\u0218\u0218\u0225\u062E\u062E\u0214\u0218\u0218\u0225\u062E\u0214\u0218\u0218\u0225", '\362', '\001'), new Class[0]);
            try
            {
                obj = ((Method) (obj)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (ggrrgg ggrrgg1)
            {
                throw ggrrgg1.getCause();
            }
            b042604260426042604260426_int_static_fld = ((Integer)obj).intValue();
        }
        obj = rrrrrr/ggrrgg.getDeclaredMethod(nuuuuu.b0417041704170417041704170417("\uFFE9\u03A6\uFFB7\uFFBB\uFFB8\uFFCD\uFFB7\uFFBB\uFFB8\uFFCD\u03A6\u03A6\u03A6", '\027', '\220', '\002'), new Class[] {
            com/visa/cbp/sdk/facade/data/TokenKey, com/visa/cbp/external/aam/ReplenishResponse
        });
        ggrrgg1 = ((ggrrgg) (((Method) (obj)).invoke(ggrrgg1, new Object[] {
            tokenkey, replenishresponse
        })));
        return ((Boolean)ggrrgg1).booleanValue();
        ggrrgg1;
        throw ggrrgg1;
        ggrrgg1;
        throw ggrrgg1.getCause();
    }

    private boolean b041F041F041F041F041F041F(TokenKey tokenkey, ReplenishResponse replenishresponse)
    {
        ppplpl ppplpl1 = b042604260426042604260426_rrrrrr_ppplpl_fld;
        int i = b042604260426042604260426_int_static_fld;
        Object obj = rrrrrr/ggrrgg.getMethod(nuuuuu.b0417041704170417041704170417("\u018F\u015D\u0161\u0161\u016E\u0577\u015D\u0161\u0161\u016E\u015D\u0161\u0161\u016E\u0577\u015D\u0161\u0161\u016E", '\273', 'r', '\003'), new Class[0]);
        try
        {
            obj = ((Method) (obj)).invoke(null, new Object[0]);
        }
        // Misplaced declaration of an exception variable
        catch (TokenKey tokenkey)
        {
            throw tokenkey.getCause();
        }
        if (((((Integer)obj).intValue() + i) * b042604260426042604260426_int_static_fld) % b042604260426042604260426_int_static_fld != b042604260426042604260426_int_static_fld)
        {
            b042604260426042604260426_int_static_fld = 54;
            Object obj1 = rrrrrr/ggrrgg.getMethod(nuuuuu.b0417041704170417041704170417("\203QUUb\u046B\u046BQUUb\u046BQUUb", '!', '\005'), new Class[0]);
            try
            {
                obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (TokenKey tokenkey)
            {
                throw tokenkey.getCause();
            }
            b042604260426042604260426_int_static_fld = ((Integer)obj1).intValue();
        }
        obj1 = rrrrrr/ggrrgg.getMethod(nuuuuu.b0417041704170417041704170417("\uFEFD\uFECB\uFECF\uFECC\uFEE1\uFECB\uFECF\uFECC\uFEE1\uFECB\uFECF\uFECC\uFEE1\u02BA\u02BA\u02BA", 'w', '\004'), new Class[] {
            com/visa/cbp/external/aam/ReplenishResponse
        });
        try
        {
            replenishresponse = ((ReplenishResponse) (((Method) (obj1)).invoke(this, new Object[] {
                replenishresponse
            })));
        }
        // Misplaced declaration of an exception variable
        catch (TokenKey tokenkey)
        {
            throw tokenkey.getCause();
        }
        replenishresponse = (DynParams)replenishresponse;
        if (((b042604260426042604260426_int_static_fld + b042604260426042604260426_int_static_fld) * b042604260426042604260426_int_static_fld) % b042604260426042604260426_int_static_fld != b042604260426042604260426_int_static_fld)
        {
            obj1 = rrrrrr/ggrrgg.getMethod(nuuuuu.b0417041704170417041704170417("\uFFF3\uFFC1\uFFC5\uFFC5\uFFD2\u03DB\u03DB\uFFC1\uFFC5\uFFC5\uFFD2\u03DB\uFFC1\uFFC5\uFFC5\uFFD2", 'o', '\0'), new Class[0]);
            try
            {
                obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (TokenKey tokenkey)
            {
                throw tokenkey.getCause();
            }
            b042604260426042604260426_int_static_fld = ((Integer)obj1).intValue();
            obj1 = rrrrrr/ggrrgg.getMethod(nuuuuu.b0417041704170417041704170417("\u01B8\u0186\u018A\u018A\u0197\u05A0\u05A0\u0186\u018A\u018A\u0197\u05A0\u0186\u018A\u018A\u0197", 'r', '\006'), new Class[0]);
            try
            {
                obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (TokenKey tokenkey)
            {
                throw tokenkey.getCause();
            }
            b042604260426042604260426_int_static_fld = ((Integer)obj1).intValue();
        }
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
        obj1 = rrrrrr/ppplpl.getMethod(nuuuuu.b0417041704170417041704170417("\uFFCB\uFF99\uFF9D\uFF9A\uFFAB\u0384\u0384\u0384\uFF99\uFF9D\uFF9A\uFFAB\u0384", 'R', '\351', '\002'), new Class[] {
            com/visa/cbp/sdk/facade/data/TokenKey, com/visa/cbp/external/common/DynParams
        });
        try
        {
            tokenkey = ((TokenKey) (((Method) (obj1)).invoke(ppplpl1, new Object[] {
                tokenkey, replenishresponse
            })));
        }
        // Misplaced declaration of an exception variable
        catch (TokenKey tokenkey)
        {
            throw tokenkey.getCause();
        }
        return ((Boolean)tokenkey).booleanValue();
    }

    public static ReplenishmentProvider b041F041F041F041F041F041F(ggrrgg ggrrgg1)
    {
        int i = b042604260426042604260426_int_static_fld;
        int k = b042604260426042604260426_int_static_fld;
        int i1 = b042604260426042604260426_int_static_fld;
        int k1 = b042604260426042604260426_int_static_fld;
        Object obj = rrrrrr/ggrrgg.getMethod(nuuuuu.b0417041704170417041704170417("\uFFE0\u03C8\uFFAE\uFFB2\uFFB2\uFFBF\u03C8\uFFAE\uFFB2\uFFB2\uFFBF\u03C8\uFFAE\uFFB2\uFFB2\uFFBF", '\202', '\0'), new Class[0]);
        try
        {
            obj = ((Method) (obj)).invoke(null, new Object[0]);
        }
        // Misplaced declaration of an exception variable
        catch (ggrrgg ggrrgg1)
        {
            throw ggrrgg1.getCause();
        }
        if (((i + k) * i1) % k1 != ((Integer)obj).intValue())
        {
            b042604260426042604260426_int_static_fld = 98;
            Object obj1 = rrrrrr/ggrrgg.getMethod(nuuuuu.b0417041704170417041704170417("\uFFA7\uFF75\uFF79\uFF79\uFF86\u038F\u038F\uFF75\uFF79\uFF79\uFF86\u038F\uFF75\uFF79\uFF79\uFF86", '\355', '2', '\001'), new Class[0]);
            int j;
            int l;
            int j1;
            try
            {
                obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (ggrrgg ggrrgg1)
            {
                throw ggrrgg1.getCause();
            }
            b042604260426042604260426_int_static_fld = ((Integer)obj1).intValue();
        }
        try
        {
            j = b042604260426042604260426_int_static_fld;
        }
        // Misplaced declaration of an exception variable
        catch (ggrrgg ggrrgg1)
        {
            throw ggrrgg1;
        }
        obj1 = rrrrrr/ggrrgg.getMethod(nuuuuu.b0417041704170417041704170417("@\016\022\022\037\u0428\016\022\022\037\016\022\022\037\u0428\016\022\022\037", '\025', '7', '\002'), new Class[0]);
        obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
        l = ((Integer)obj1).intValue();
        j1 = b042604260426042604260426_int_static_fld;
        ((l + j) * j) % j1;
        JVM INSTR tableswitch 0 0: default 184
    //                   0 230;
           goto _L1 _L2
_L2:
        break MISSING_BLOCK_LABEL_230;
_L1:
        obj1 = rrrrrr/ggrrgg.getMethod(nuuuuu.b0417041704170417041704170417("p>BBO\u0458\u0458>BBO\u0458>BBO", '\016', '\005'), new Class[0]);
        obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
        j = ((Integer)obj1).intValue();
        b042604260426042604260426_int_static_fld = j;
        b042604260426042604260426_int_static_fld = 77;
        ggrrgg1 = ggrrgg1.b042604260426042604260426_com_visa_cbp_sdk_facade_provider_ReplenishmentProvider_fld;
        return ggrrgg1;
        ggrrgg1;
        throw ggrrgg1.getCause();
        ggrrgg1;
        throw ggrrgg1.getCause();
        ggrrgg1;
        throw ggrrgg1;
    }

    public static String b041F041F041F041F041F041F()
    {
        return b042604260426042604260426_java_lang_String_static_fld;
    }

    private boolean b041F041F041F041F041F041F(TokenKey tokenkey, Status status)
    {
        boolean flag;
        Object obj = com/visa/cbp/external/common/Status.getMethod(nuuuuu.b0417041704170417041704170417("><K*K8KLJ", '\321', '\250', '\001'), new Class[0]);
        Object obj1;
        Method method;
        try
        {
            obj = ((Method) (obj)).invoke(status, new Object[0]);
        }
        // Misplaced declaration of an exception variable
        catch (TokenKey tokenkey)
        {
            throw tokenkey.getCause();
        }
        obj = (String)obj;
        obj1 = com/visa/cbp/sdk/facade/data/TokenStatus.getMethod(nuuuuu.b0417041704170417041704170417("\u0157\u0155\u0164\u0144\u015F\u015B\u0155\u015E\u0143\u0164\u0151\u0164\u0165\u0163", 'L', '\244', '\003'), new Class[] {
            java/lang/String
        });
        try
        {
            obj = ((Method) (obj1)).invoke(null, new Object[] {
                obj
            });
        }
        // Misplaced declaration of an exception variable
        catch (TokenKey tokenkey)
        {
            throw tokenkey.getCause();
        }
        obj = (TokenStatus)obj;
        if (obj != TokenStatus.DELETED && obj != TokenStatus.NOT_FOUND) goto _L2; else goto _L1
_L1:
        status = b042604260426042604260426_rrrrrr_ppplpl_fld;
        obj = rrrrrr/ppplpl.getMethod(nuuuuu.b0417041704170417041704170417("4\u03ED\002\006\003\024\u03ED\002\006\003\024\002\006\003\024\u03ED", '\027', '\003'), new Class[] {
            com/visa/cbp/sdk/facade/data/TokenKey
        });
        status = ((Status) (((Method) (obj)).invoke(status, new Object[] {
            tokenkey
        })));
        flag = ((Boolean)status).booleanValue();
        if (((b042604260426042604260426_int_static_fld + b042604260426042604260426_int_static_fld) * b042604260426042604260426_int_static_fld) % b042604260426042604260426_int_static_fld != b042604260426042604260426_int_static_fld)
        {
            b042604260426042604260426_int_static_fld = 68;
            status = rrrrrr/ggrrgg.getMethod(nuuuuu.b0417041704170417041704170417("\u01B6\u0184\u0188\u0188\u0195\u059E\u059E\u0184\u0188\u0188\u0195\u059E\u0184\u0188\u0188\u0195", '\252', '\001'), new Class[0]);
            try
            {
                status = ((Status) (status.invoke(null, new Object[0])));
            }
            // Misplaced declaration of an exception variable
            catch (TokenKey tokenkey)
            {
                throw tokenkey.getCause();
            }
            b042604260426042604260426_int_static_fld = ((Integer)status).intValue();
        }
_L4:
        {
            if (!flag)
            {
                break MISSING_BLOCK_LABEL_518;
            }
            status = b042604260426042604260426_java_lang_String_static_fld;
            obj = new StringBuilder();
            obj1 = grrrrr.b044C044C044C044C044C044C("\u016F\u0171\u015F\u015F\u0161\u016F\u016F\u0162\u0171\u0168\u011C\u0171\u016C\u0160\u015D\u0170\u0161\u011C\u0170\u016B\u0167\u0161\u016A\u011C\u016F\u0170\u015D\u0170\u0171\u016F\u011C\u0173\u0165\u0170\u0164\u011C\u0170\u016B\u0167\u0161\u016A\u011C\u0145\u0140\u0136\u011C", '\374', '\005');
            method = java/lang/StringBuilder.getMethod(nuuuuu.b0417041704170417041704170417("\u010A\u0119\u0119\u010E\u0117\u010D", 'F', '\357', '\001'), new Class[] {
                java/lang/String
            });
            try
            {
                obj = method.invoke(obj, new Object[] {
                    obj1
                });
            }
            // Misplaced declaration of an exception variable
            catch (TokenKey tokenkey)
            {
                throw tokenkey.getCause();
            }
            obj = (StringBuilder)obj;
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
            obj1 = java/lang/StringBuilder.getMethod(nuuuuu.b0417041704170417041704170417("\u010D\u011C\u011C\u0111\u011A\u0110", 'V', '\001'), new Class[] {
                java/lang/Object
            });
            try
            {
                tokenkey = ((TokenKey) (((Method) (obj1)).invoke(obj, new Object[] {
                    tokenkey
                })));
            }
            // Misplaced declaration of an exception variable
            catch (TokenKey tokenkey)
            {
                throw tokenkey.getCause();
            }
            tokenkey = (StringBuilder)tokenkey;
            obj = java/lang/StringBuilder.getMethod(nuuuuu.b0417041704170417041704170417("\200{_\200~uzs", '\f', '\005'), new Class[0]);
            try
            {
                tokenkey = ((TokenKey) (((Method) (obj)).invoke(tokenkey, new Object[0])));
            }
            // Misplaced declaration of an exception variable
            catch (TokenKey tokenkey)
            {
                throw tokenkey.getCause();
            }
            tokenkey = (String)tokenkey;
            obj = rrrrrr/ppplpp.getMethod(nuuuuu.b0417041704170417041704170417("\uFFC5\uFF93\uFF97\uFF94\uFF98\u0378\uFF93\uFF97\uFF94\uFF98\u0378\uFF93\uFF97\uFF94\uFF98\u0378\uFF93\uFF97\uFF94\uFF98", '\235', '\0'), new Class[] {
                java/lang/String, java/lang/String
            });
            try
            {
                ((Method) (obj)).invoke(null, new Object[] {
                    status, tokenkey
                });
            }
            // Misplaced declaration of an exception variable
            catch (TokenKey tokenkey)
            {
                throw tokenkey.getCause();
            }
        }
        tokenkey = java/lang/String.getMethod(nuuuuu.b0417041704170417041704170417("\uFF4E\uFF47\uFF50\uFF49\uFF56\uFF4A", '\217', '\003'), new Class[0]);
        tokenkey = ((TokenKey) (tokenkey.invoke(null, new Object[0])));
        ((Integer)tokenkey).intValue();
        if (true)
        {
            break MISSING_BLOCK_LABEL_477;
        }
        status = b042604260426042604260426_java_lang_String_static_fld;
        obj = new StringBuilder();
        obj1 = grrrrr.b044C044C044C044C044C044C("\332\327\202\231\204\202\224\224\222\204\204\221\202\233\326\326\327\202\207\223\226\203\222\327\203\230\234\222\231\327\204\203\226\203\202\204\327\200\236\203\237\327\203\230\234\222\231\327\276\263\315\327", '\367', '\002');
        method = java/lang/StringBuilder.getMethod(nuuuuu.b0417041704170417041704170417("\u01F3\u0202\u0202\u01F7\u0200\u01F6", '\206', '\006'), new Class[] {
            java/lang/String
        });
        try
        {
            obj = method.invoke(obj, new Object[] {
                obj1
            });
        }
        // Misplaced declaration of an exception variable
        catch (TokenKey tokenkey)
        {
            throw tokenkey.getCause();
        }
        obj = (StringBuilder)obj;
        obj1 = java/lang/StringBuilder.getMethod(nuuuuu.b0417041704170417041704170417("\u0103\u0112\u0112\u0107\u0110\u0106", '\207', '\033', '\003'), new Class[] {
            java/lang/Object
        });
        try
        {
            tokenkey = ((TokenKey) (((Method) (obj1)).invoke(obj, new Object[] {
                tokenkey
            })));
        }
        // Misplaced declaration of an exception variable
        catch (TokenKey tokenkey)
        {
            throw tokenkey.getCause();
        }
        tokenkey = (StringBuilder)tokenkey;
        obj = java/lang/StringBuilder.getMethod(nuuuuu.b0417041704170417041704170417("72\02675,1*", '=', '\0'), new Class[0]);
        try
        {
            tokenkey = ((TokenKey) (((Method) (obj)).invoke(tokenkey, new Object[0])));
        }
        // Misplaced declaration of an exception variable
        catch (TokenKey tokenkey)
        {
            throw tokenkey.getCause();
        }
        tokenkey = (String)tokenkey;
        obj = rrrrrr/ppplpp.getMethod(nuuuuu.b0417041704170417041704170417("\uFF85\uFF53\uFF57\uFF54\uFF58\u0338\u0338\uFF53\uFF57\uFF54\uFF58\uFF53\uFF57\uFF54\uFF58\u0338\uFF53\uFF57\uFF54\uFF58", '\335', '\0'), new Class[] {
            java/lang/String, java/lang/String
        });
        try
        {
            ((Method) (obj)).invoke(null, new Object[] {
                status, tokenkey
            });
        }
        // Misplaced declaration of an exception variable
        catch (TokenKey tokenkey)
        {
            throw tokenkey.getCause();
        }
        return flag;
        status;
        throw status.getCause();
_L2:
        obj = b042604260426042604260426_rrrrrr_ppplpl_fld;
        obj1 = rrrrrr/ppplpl.getMethod(nuuuuu.b0417041704170417041704170417("\uFF6D\uFF3B\uFF3F\uFF3C\uFF4D\uFF3B\uFF3F\uFF3C\uFF4D\u0326\u0326\uFF3B\uFF3F\uFF3C\uFF4D\u0326", '\207', 'n', '\0'), new Class[] {
            com/visa/cbp/sdk/facade/data/TokenKey, com/visa/cbp/external/common/Status
        });
        status = ((Status) (((Method) (obj1)).invoke(obj, new Object[] {
            tokenkey, status
        })));
        flag = ((Boolean)status).booleanValue();
        continue; /* Loop/switch isn't completed */
        status;
        try
        {
            throw status.getCause();
        }
        // Misplaced declaration of an exception variable
        catch (Status status) { }
        break MISSING_BLOCK_LABEL_893;
        tokenkey;
        try
        {
            throw tokenkey.getCause();
        }
        // Misplaced declaration of an exception variable
        catch (TokenKey tokenkey)
        {
            b042604260426042604260426_int_static_fld = 55;
            return flag;
        }
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
        flag = false;
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void b044A044A044A044A044A044A(LcmTokenRequest lcmtokenrequest, TokenStatus tokenstatus, UpdateReason updatereason, GenericResponse genericresponse, ResponseCallback responsecallback)
    {
        throw new Runtime("d2j fail translate: java.lang.IndexOutOfBoundsException: fromIndex < 0: -1\n\tat java.util.BitSet.nextSetBit(BitSet.java:701)\n\tat com.googlecode.dex2jar.ir.ts.array.FillArrayTransformer.makeSureAllElementAreAssigned(FillArrayTransformer.java:505)\n\tat com.googlecode.dex2jar.ir.ts.array.FillArrayTransformer.transformReportChanged(FillArrayTransformer.java:123)\n\tat com.googlecode.dex2jar.ir.ts.StatedTransformer.transform(StatedTransformer.java:10)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:149)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
    }

    public static int b044A044A044A044A044A044A()
    {
        return 2;
    }

    private LcmParams b044A044A044A044A044A044A(LcmTokenRequest lcmtokenrequest)
    {
        Object obj = rrrrrr/llpllp.getMethod(nuuuuu.b0417041704170417041704170417("\uFDF2\u01B1\u01B1\uFDC0\uFDC4\uFDC2\uFDC1\u01B1\uFDC0\uFDC4\uFDC2\uFDC1\uFDC0\uFDC4\uFDC2\uFDC1\u01B1", '\320', '\004'), new Class[] {
            com/visa/cbp/external/lcm/LcmTokenRequest
        });
        Method method;
        try
        {
            obj = ((Method) (obj)).invoke(null, new Object[] {
                lcmtokenrequest
            });
        }
        // Misplaced declaration of an exception variable
        catch (LcmTokenRequest lcmtokenrequest)
        {
            throw lcmtokenrequest.getCause();
        }
        obj = (LcmParams)obj;
        method = com/visa/cbp/external/lcm/LcmTokenRequest.getMethod(nuuuuu.b0417041704170417041704170417("\uFFD7\uFFD5\uFFE4\uFFC4\uFFDF\uFFDB\uFFD5\uFFDE\uFFB9\uFFDE\uFFD6\uFFDF", '\220', '\0'), new Class[0]);
        try
        {
            lcmtokenrequest = ((LcmTokenRequest) (method.invoke(lcmtokenrequest, new Object[0])));
        }
        // Misplaced declaration of an exception variable
        catch (LcmTokenRequest lcmtokenrequest)
        {
            throw lcmtokenrequest.getCause();
        }
        lcmtokenrequest = (TokenInfo)lcmtokenrequest;
        method = rrrrrr/ggrrgg.getMethod(nuuuuu.b0417041704170417041704170417("\uFFC7\u03AF\uFF95\uFF99\uFF99\uFFA6\u03AF\u03AF\uFF95\uFF99\uFF99\uFFA6\uFF95\uFF99\uFF99\uFFA6", '+', '\306', '\002'), new Class[] {
            com/visa/cbp/external/common/TokenInfo
        });
        try
        {
            lcmtokenrequest = ((LcmTokenRequest) (method.invoke(this, new Object[] {
                lcmtokenrequest
            })));
        }
        // Misplaced declaration of an exception variable
        catch (LcmTokenRequest lcmtokenrequest)
        {
            throw lcmtokenrequest.getCause();
        }
        lcmtokenrequest = (TokenKey)lcmtokenrequest;
        method = com/visa/cbp/sdk/facade/data/LcmParams.getMethod(nuuuuu.b0417041704170417041704170417("\uFE4B\uFE3D\uFE4C\uFE2C\uFE47\uFE43\uFE3D\uFE46\uFE23\uFE3D\uFE51", '\270', '\004'), new Class[] {
            com/visa/cbp/sdk/facade/data/TokenKey
        });
        try
        {
            method.invoke(obj, new Object[] {
                lcmtokenrequest
            });
        }
        // Misplaced declaration of an exception variable
        catch (LcmTokenRequest lcmtokenrequest)
        {
            throw lcmtokenrequest.getCause();
        }
        return ((LcmParams) (obj));
    }

    public static int b044A044A044A044A044A044A()
    {
        return 1;
    }

    private boolean b044A044A044A044A044A044A(TokenKey tokenkey, List list, Status status)
    {
        if (list == null || status == null) goto _L2; else goto _L1
_L1:
        Object obj = java/util/List.getMethod(nuuuuu.b0417041704170417041704170417("\222\235\216\233\212\235\230\233", ')', '\005'), new Class[0]);
        list = ((List) (((Method) (obj)).invoke(list, new Object[0])));
        list = (Iterator)list;
_L3:
        obj = java/util/Iterator.getMethod(nuuuuu.b0417041704170417041704170417("\223\214\236y\220\243\237", '}', '\250', '\001'), new Class[0]);
        obj = ((Method) (obj)).invoke(list, new Object[0]);
        if (!((Boolean)obj).booleanValue())
        {
            break; /* Loop/switch isn't completed */
        }
        obj = java/util/Iterator.getMethod(nuuuuu.b0417041704170417041704170417("\u013F\u0136\u0149\u0145", '\321', '\005'), new Class[0]);
        obj = ((Method) (obj)).invoke(list, new Object[0]);
        obj = (Object)obj;
        obj = (TokenData)obj;
        Object obj1 = com/visa/cbp/sdk/facade/data/TokenData.getMethod(nuuuuu.b0417041704170417041704170417("\204\206\227\267\214\210\206\215\250\206\232", '\343', '\002'), new Class[0]);
        obj1 = ((Method) (obj1)).invoke(obj, new Object[0]);
        obj1 = (TokenKey)obj1;
        if (((b042604260426042604260426_int_static_fld + b042604260426042604260426_int_static_fld) * b042604260426042604260426_int_static_fld) % b042604260426042604260426_int_static_fld == b042604260426042604260426_int_static_fld)
        {
            break MISSING_BLOCK_LABEL_255;
        }
        b042604260426042604260426_int_static_fld = 17;
        Object obj2 = rrrrrr/ggrrgg.getMethod(nuuuuu.b0417041704170417041704170417("\260~\202\202\217\u0498\u0498~\202\202\217\u0498~\202\202\217", 'N', '\005'), new Class[0]);
        obj2 = ((Method) (obj2)).invoke(null, new Object[0]);
        int i = ((Integer)obj2).intValue();
        try
        {
            b042604260426042604260426_int_static_fld = i;
        }
        // Misplaced declaration of an exception variable
        catch (TokenKey tokenkey)
        {
            throw tokenkey;
        }
        obj2 = com/visa/cbp/sdk/facade/data/TokenKey.getMethod(nuuuuu.b0417041704170417041704170417("\uFF8C\uFF98\uFF9C\uFF88\uFF93\uFF9A", '\207', 'R', '\0'), new Class[] {
            java/lang/Object
        });
        obj1 = ((Method) (obj2)).invoke(tokenkey, new Object[] {
            obj1
        });
        if (!((Boolean)obj1).booleanValue())
        {
            break MISSING_BLOCK_LABEL_487;
        }
        obj1 = com/visa/cbp/sdk/facade/data/TokenData.getMethod(nuuuuu.b0417041704170417041704170417("\uFFEE\uFFEC\uFFFB\uFFDB\uFFF6\uFFF2\uFFEC\uFFF5\uFFDA\uFFFB\uFFE8\uFFFB\uFFFC\uFFFA", 'y', '\0'), new Class[0]);
        obj = ((Method) (obj1)).invoke(obj, new Object[0]);
        obj = (Status)obj;
        obj1 = com/visa/cbp/external/common/Status.getMethod(nuuuuu.b0417041704170417041704170417("53B!B/BCA", '2', '\0'), new Class[0]);
        obj = ((Method) (obj1)).invoke(obj, new Object[0]);
        obj = (String)obj;
        obj1 = com/visa/cbp/external/common/Status.getMethod(nuuuuu.b0417041704170417041704170417("\345\343\362\321\362\337\362\363\361", '?', '\001'), new Class[0]);
        obj1 = ((Method) (obj1)).invoke(status, new Object[0]);
        obj1 = (String)obj1;
        obj2 = java/lang/String.getMethod(nuuuuu.b0417041704170417041704170417("\u0105\u0111\u0115\u0101\u010C\u0113\351\u0107\u010E\u010F\u0112\u0105\343\u0101\u0113\u0105", 'P', '\001'), new Class[] {
            java/lang/String
        });
        obj = ((Method) (obj2)).invoke(obj, new Object[] {
            obj1
        });
        if (!((Boolean)obj).booleanValue())
        {
            return true;
        }
        if (((b042604260426042604260426_int_static_fld + b042604260426042604260426_int_static_fld) * b042604260426042604260426_int_static_fld) % b042604260426042604260426_int_static_fld != b042604260426042604260426_int_static_fld)
        {
            b042604260426042604260426_int_static_fld = 88;
            obj = rrrrrr/ggrrgg.getMethod(nuuuuu.b0417041704170417041704170417("\234jnn{\u0484\u0484jnn{\u0484jnn{", '\035', '\001'), new Class[0]);
            try
            {
                obj = ((Method) (obj)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (TokenKey tokenkey)
            {
                throw tokenkey.getCause();
            }
            b042604260426042604260426_int_static_fld = ((Integer)obj).intValue();
        }
        if (true) goto _L3; else goto _L2
        tokenkey;
        try
        {
            throw tokenkey.getCause();
        }
        // Misplaced declaration of an exception variable
        catch (TokenKey tokenkey) { }
        throw tokenkey;
        tokenkey;
        throw tokenkey.getCause();
        tokenkey;
        throw tokenkey.getCause();
_L5:
        throw tokenkey;
        tokenkey;
        try
        {
            throw tokenkey.getCause();
        }
        // Misplaced declaration of an exception variable
        catch (TokenKey tokenkey) { }
        if (true) goto _L5; else goto _L4
_L4:
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
_L2:
        return false;
    }

    public static int b044A044A044A044A044A044A()
    {
        return 74;
    }

    public static ppplpl b041F041F041F041F041F041F(ggrrgg ggrrgg1)
    {
        int i = b042604260426042604260426_int_static_fld;
        int j = b042604260426042604260426_int_static_fld;
        int k = b042604260426042604260426_int_static_fld;
        int i1 = b042604260426042604260426_int_static_fld;
        int k1 = b042604260426042604260426_int_static_fld;
        Object obj = rrrrrr/ggrrgg.getMethod(nuuuuu.b0417041704170417041704170417("\u0142\u0110\u0114\u0114\u0121\u0110\u0114\u0114\u0121\u052A\u0110\u0114\u0114\u0121\u052A\u0110\u0114\u0114\u0121", '\340', '\005'), new Class[0]);
        try
        {
            obj = ((Method) (obj)).invoke(null, new Object[0]);
        }
        // Misplaced declaration of an exception variable
        catch (ggrrgg ggrrgg1)
        {
            throw ggrrgg1.getCause();
        }
        if ((k1 * (k + i1)) % ((Integer)obj).intValue() != b042604260426042604260426_int_static_fld)
        {
            Object obj1 = rrrrrr/ggrrgg.getMethod(nuuuuu.b0417041704170417041704170417("\205SWWd\u046D\u046DSWWd\u046DSWWd", '\227', 't', '\002'), new Class[0]);
            int l;
            int j1;
            try
            {
                obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (ggrrgg ggrrgg1)
            {
                throw ggrrgg1.getCause();
            }
            b042604260426042604260426_int_static_fld = ((Integer)obj1).intValue();
            b042604260426042604260426_int_static_fld = 16;
        }
        l = b042604260426042604260426_int_static_fld;
        j1 = b042604260426042604260426_int_static_fld;
        obj1 = rrrrrr/ggrrgg.getMethod(nuuuuu.b0417041704170417041704170417("\uFFD6\u03BE\uFFA4\uFFA8\uFFA8\uFFB5\u03BE\uFFA4\uFFA8\uFFA8\uFFB5\u03BE\uFFA4\uFFA8\uFFA8\uFFB5", '\021', '\235', '\002'), new Class[0]);
        try
        {
            obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
        }
        // Misplaced declaration of an exception variable
        catch (ggrrgg ggrrgg1)
        {
            throw ggrrgg1.getCause();
        }
        if ((l * (j + i)) % j1 != ((Integer)obj1).intValue())
        {
            obj1 = rrrrrr/ggrrgg.getMethod(nuuuuu.b0417041704170417041704170417("\uFEE1\uFEAF\uFEB3\uFEB3\uFEC0\u02C9\u02C9\uFEAF\uFEB3\uFEB3\uFEC0\u02C9\uFEAF\uFEB3\uFEB3\uFEC0", '\375', '\204', '\0'), new Class[0]);
            try
            {
                obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (ggrrgg ggrrgg1)
            {
                throw ggrrgg1.getCause();
            }
            b042604260426042604260426_int_static_fld = ((Integer)obj1).intValue();
            b042604260426042604260426_int_static_fld = 99;
        }
        try
        {
            ggrrgg1 = ggrrgg1.b042604260426042604260426_rrrrrr_ppplpl_fld;
        }
        // Misplaced declaration of an exception variable
        catch (ggrrgg ggrrgg1)
        {
            throw ggrrgg1;
        }
        return ggrrgg1;
    }

    private boolean b041F041F041F041F041F041F(TokenKey tokenkey, ReplenishResponse replenishresponse)
    {
        int i = b042604260426042604260426_int_static_fld;
        Object obj = rrrrrr/ggrrgg.getMethod(nuuuuu.b0417041704170417041704170417("\uFFBA\uFF88\uFF8C\uFF8C\uFF99\u03A2\uFF88\uFF8C\uFF8C\uFF99\uFF88\uFF8C\uFF8C\uFF99\u03A2\uFF88\uFF8C\uFF8C\uFF99", '8', '\004'), new Class[0]);
        try
        {
            obj = ((Method) (obj)).invoke(null, new Object[0]);
        }
        // Misplaced declaration of an exception variable
        catch (TokenKey tokenkey)
        {
            throw tokenkey.getCause();
        }
        if (((((Integer)obj).intValue() + i) * b042604260426042604260426_int_static_fld) % b042604260426042604260426_int_static_fld != b042604260426042604260426_int_static_fld)
        {
            Object obj1 = rrrrrr/ggrrgg.getMethod(nuuuuu.b0417041704170417041704170417("w%!!T\u045F\u045F%!!T\u045F%!!T", '\025', '\002'), new Class[0]);
            Method method;
            boolean flag;
            try
            {
                obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (TokenKey tokenkey)
            {
                throw tokenkey.getCause();
            }
            b042604260426042604260426_int_static_fld = ((Integer)obj1).intValue();
            b042604260426042604260426_int_static_fld = 40;
        }
        obj1 = b042604260426042604260426_rrrrrr_ppplpl_fld;
        method = rrrrrr/ggrrgg.getMethod(nuuuuu.b0417041704170417041704170417("0\uFFFE\002\uFFFF\024\uFFFE\002\uFFFF\024\uFFFE\002\uFFFF\024\u03ED\u03ED\u03ED", '\031', '\003'), new Class[] {
            com/visa/cbp/external/aam/ReplenishResponse
        });
        try
        {
            replenishresponse = ((ReplenishResponse) (method.invoke(this, new Object[] {
                replenishresponse
            })));
        }
        // Misplaced declaration of an exception variable
        catch (TokenKey tokenkey)
        {
            throw tokenkey.getCause();
        }
        replenishresponse = (DynParams)replenishresponse;
        method = rrrrrr/ppplpl.getMethod(nuuuuu.b0417041704170417041704170417("\uFF5C\u0315\uFF2A\uFF2E\uFF2B\uFF3C\u0315\u0315\uFF2A\uFF2E\uFF2B\uFF3C\u0315", '\203', '\003'), new Class[] {
            com/visa/cbp/sdk/facade/data/TokenKey, com/visa/cbp/external/common/DynParams
        });
        try
        {
            tokenkey = ((TokenKey) (method.invoke(obj1, new Object[] {
                tokenkey, replenishresponse
            })));
        }
        // Misplaced declaration of an exception variable
        catch (TokenKey tokenkey)
        {
            throw tokenkey.getCause();
        }
        flag = ((Boolean)tokenkey).booleanValue();
        if (((b042604260426042604260426_int_static_fld + b042604260426042604260426_int_static_fld) * b042604260426042604260426_int_static_fld) % b042604260426042604260426_int_static_fld != b042604260426042604260426_int_static_fld)
        {
            tokenkey = rrrrrr/ggrrgg.getMethod(nuuuuu.b0417041704170417041704170417("\uFECA\uFE98\uFE9C\uFE9C\uFEA9\u02B2\u02B2\uFE98\uFE9C\uFE9C\uFEA9\u02B2\uFE98\uFE9C\uFE9C\uFEA9", '\256', '\352', '\0'), new Class[0]);
            try
            {
                tokenkey = ((TokenKey) (tokenkey.invoke(null, new Object[0])));
            }
            // Misplaced declaration of an exception variable
            catch (TokenKey tokenkey)
            {
                throw tokenkey.getCause();
            }
            b042604260426042604260426_int_static_fld = ((Integer)tokenkey).intValue();
            b042604260426042604260426_int_static_fld = 13;
        }
        return flag;
    }

    public static boolean b041F041F041F041F041F041F(ggrrgg ggrrgg1, TokenKey tokenkey, List list, Status status)
    {
        int i = b042604260426042604260426_int_static_fld;
        int j = b042604260426042604260426_int_static_fld;
        int k = b042604260426042604260426_int_static_fld;
        int l = b042604260426042604260426_int_static_fld;
        switch ((l * (b042604260426042604260426_int_static_fld + l)) % b042604260426042604260426_int_static_fld)
        {
        default:
            Object obj = rrrrrr/ggrrgg.getMethod(nuuuuu.b0417041704170417041704170417("a/33@\u0449\u0449/33@\u0449/33@", '\244', '\243', '\001'), new Class[0]);
            try
            {
                obj = ((Method) (obj)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (ggrrgg ggrrgg1)
            {
                throw ggrrgg1.getCause();
            }
            b042604260426042604260426_int_static_fld = ((Integer)obj).intValue();
            b042604260426042604260426_int_static_fld = 49;
            // fall through

        case 0: // '\0'
            obj = rrrrrr/ggrrgg.getMethod(nuuuuu.b0417041704170417041704170417("\uFFE3\uFFB1\uFFB5\uFFB5\uFFC2\uFFB1\uFFB5\uFFB5\uFFC2\u03CB\uFFB1\uFFB5\uFFB5\uFFC2\u03CB\uFFB1\uFFB5\uFFB5\uFFC2", '\201', '\002', '\001'), new Class[0]);
            break;
        }
        try
        {
            obj = ((Method) (obj)).invoke(null, new Object[0]);
        }
        // Misplaced declaration of an exception variable
        catch (ggrrgg ggrrgg1)
        {
            throw ggrrgg1.getCause();
        }
        if ((k * (i + j)) % ((Integer)obj).intValue() != b042604260426042604260426_int_static_fld)
        {
            obj = rrrrrr/ggrrgg.getMethod(nuuuuu.b0417041704170417041704170417("\255{\177\177\214\u0495\u0495{\177\177\214\u0495{\177\177\214", 'z', '/', '\002'), new Class[0]);
            try
            {
                obj = ((Method) (obj)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (ggrrgg ggrrgg1)
            {
                throw ggrrgg1.getCause();
            }
            b042604260426042604260426_int_static_fld = ((Integer)obj).intValue();
            b042604260426042604260426_int_static_fld = 78;
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
        obj = rrrrrr/ggrrgg.getDeclaredMethod(nuuuuu.b0417041704170417041704170417("\u0151\u011F\u0123\u0123\u0130\u0539\u011F\u0123\u0123\u0130\u0539\u011F\u0123\u0123\u0130\u011F\u0123\u0123\u0130", '\357', '\005'), new Class[] {
            com/visa/cbp/sdk/facade/data/TokenKey, java/util/List, com/visa/cbp/external/common/Status
        });
        try
        {
            ggrrgg1 = ((ggrrgg) (((Method) (obj)).invoke(ggrrgg1, new Object[] {
                tokenkey, list, status
            })));
        }
        // Misplaced declaration of an exception variable
        catch (ggrrgg ggrrgg1)
        {
            throw ggrrgg1.getCause();
        }
        return ((Boolean)ggrrgg1).booleanValue();
    }

    private void b041F041F041F041F041F041F()
    {
        Object obj = rrrrrr/grgrgr.getMethod(nuuuuu.b0417041704170417041704170417("\222`dbr\u045B\u045B\u045B\u045B`dbr", '\360', '\300', '\002'), new Class[0]);
        obj = ((Method) (obj)).invoke(null, new Object[0]);
        obj = (Context)obj;
        InvocationTargetException invocationtargetexception;
        Object obj1;
        int i;
        int j;
        int k;
        long l;
        try
        {
            obj = new lppllp(((Context) (obj)));
            i = b042604260426042604260426_int_static_fld;
            j = b042604260426042604260426_int_static_fld;
            k = b042604260426042604260426_int_static_fld;
        }
        catch (Exception exception)
        {
            throw exception;
        }
        (i * (j + i)) % k;
        JVM INSTR tableswitch 0 0: default 88
    //                   0 175;
           goto _L1 _L2
_L1:
        obj1 = rrrrrr/ggrrgg.getMethod(nuuuuu.b0417041704170417041704170417("\320\202\206\206\363\u04F8\u04F8\202\206\206\363\u04F8\202\206\206\363", '\262', '\002'), new Class[0]);
        obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
        i = ((Integer)obj1).intValue();
        InvocationTargetException invocationtargetexception1;
        try
        {
            b042604260426042604260426_int_static_fld = i;
        }
        catch (Exception exception1)
        {
            throw exception1;
        }
        obj1 = rrrrrr/ggrrgg.getMethod(nuuuuu.b0417041704170417041704170417("\uFEE7\uFEB5\uFEB9\uFEB9\uFEC6\u02CF\u02CF\uFEB5\uFEB9\uFEB9\uFEC6\u02CF\uFEB5\uFEB9\uFEB9\uFEC6", '\325', '\246', '\0'), new Class[0]);
        obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
        i = ((Integer)obj1).intValue();
        b042604260426042604260426_int_static_fld = i;
_L2:
        obj1 = rrrrrr/grrgrg.getMethod(nuuuuu.b0417041704170417041704170417("\uFF6E\uFF3C\uFF40\uFF40\uFF3C\u034C\uFF3C\uFF40\uFF40\uFF3C\uFF3C\uFF40\uFF40\uFF3C\uFF3C\uFF40\uFF40\uFF3C\uFF3C\uFF40\uFF40\uFF3C", 'k', '\211', '\0'), new Class[0]);
        obj = ((Method) (obj1)).invoke(obj, new Object[0]);
        l = ((Long)obj).longValue();
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
        if (((b042604260426042604260426_int_static_fld + b042604260426042604260426_int_static_fld) * b042604260426042604260426_int_static_fld) % b042604260426042604260426_int_static_fld != b042604260426042604260426_int_static_fld)
        {
            b042604260426042604260426_int_static_fld = 15;
            obj = rrrrrr/ggrrgg.getMethod(nuuuuu.b0417041704170417041704170417("\uFF71\uFF3F\uFF43\uFF43\uFF50\u0359\u0359\uFF3F\uFF43\uFF43\uFF50\u0359\uFF3F\uFF43\uFF43\uFF50", '\361', '\0'), new Class[0]);
            InvocationTargetException invocationtargetexception2;
            try
            {
                obj = ((Method) (obj)).invoke(null, new Object[0]);
            }
            catch (InvocationTargetException invocationtargetexception3)
            {
                throw invocationtargetexception3.getCause();
            }
            b042604260426042604260426_int_static_fld = ((Integer)obj).intValue();
        }
        obj = rrrrrr/rggggr.getMethod(nuuuuu.b0417041704170417041704170417("\u018D\u015B\u015F\u015F\u015B\u015B\u015F\u015F\u015B\u056B\u056B\u056B\u056B", '\210', '\243', '\003'), new Class[] {
            Long.TYPE
        });
        ((Method) (obj)).invoke(null, new Object[] {
            Long.valueOf(1000L * l)
        });
        return;
        invocationtargetexception;
        throw invocationtargetexception.getCause();
        invocationtargetexception1;
        throw invocationtargetexception1.getCause();
        invocationtargetexception1;
        throw invocationtargetexception1.getCause();
        invocationtargetexception1;
        throw invocationtargetexception1.getCause();
        invocationtargetexception2;
        throw invocationtargetexception2.getCause();
    }

    public static void b041F041F041F041F041F041F(ggrrgg ggrrgg1)
    {
        int i = b042604260426042604260426_int_static_fld;
        switch ((i * (b042604260426042604260426_int_static_fld + i)) % b042604260426042604260426_int_static_fld)
        {
        default:
            b042604260426042604260426_int_static_fld = 38;
            Object obj = rrrrrr/ggrrgg.getMethod(nuuuuu.b0417041704170417041704170417("\214Z^^k\u0474\u0474Z^^k\u0474Z^^k", '\025', '\001'), new Class[0]);
            int j;
            int k;
            int l;
            try
            {
                obj = ((Method) (obj)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (ggrrgg ggrrgg1)
            {
                throw ggrrgg1.getCause();
            }
            b042604260426042604260426_int_static_fld = ((Integer)obj).intValue();
            // fall through

        case 0: // '\0'
            obj = rrrrrr/ggrrgg.getDeclaredMethod(nuuuuu.b0417041704170417041704170417("\uFFC7\u0384\uFF95\uFF99\uFF96\uFFAB\u0384\uFF95\uFF99\uFF96\uFFAB\u0384\u0384", '\204', '\027', '\0'), new Class[0]);
            break;
        }
        ((Method) (obj)).invoke(ggrrgg1, new Object[0]);
        j = b042604260426042604260426_int_static_fld;
        k = b042604260426042604260426_int_static_fld;
        l = b042604260426042604260426_int_static_fld;
        ggrrgg1 = rrrrrr/ggrrgg.getMethod(nuuuuu.b0417041704170417041704170417("\uFFE3\uFFB1\uFFB5\uFFB5\uFFC2\uFFB1\uFFB5\uFFB5\uFFC2\u03CB\uFFB1\uFFB5\uFFB5\uFFC2\u03CB\uFFB1\uFFB5\uFFB5\uFFC2", 'R', '\321', '\002'), new Class[0]);
        try
        {
            ggrrgg1 = ((ggrrgg) (ggrrgg1.invoke(null, new Object[0])));
        }
        // Misplaced declaration of an exception variable
        catch (ggrrgg ggrrgg1)
        {
            throw ggrrgg1.getCause();
        }
        if ((l * (j + k)) % ((Integer)ggrrgg1).intValue() != b042604260426042604260426_int_static_fld)
        {
            ggrrgg1 = rrrrrr/ggrrgg.getMethod(nuuuuu.b0417041704170417041704170417("\uFF58\uFF26\uFF2A\uFF2A\uFF37\u0340\u0340\uFF26\uFF2A\uFF2A\uFF37\u0340\uFF26\uFF2A\uFF2A\uFF37", 'v', '\224', '\0'), new Class[0]);
            try
            {
                ggrrgg1 = ((ggrrgg) (ggrrgg1.invoke(null, new Object[0])));
            }
            // Misplaced declaration of an exception variable
            catch (ggrrgg ggrrgg1)
            {
                throw ggrrgg1.getCause();
            }
            b042604260426042604260426_int_static_fld = ((Integer)ggrrgg1).intValue();
            b042604260426042604260426_int_static_fld = 49;
        }
        return;
        ggrrgg1;
        try
        {
            throw ggrrgg1.getCause();
        }
        // Misplaced declaration of an exception variable
        catch (ggrrgg ggrrgg1)
        {
            throw ggrrgg1;
        }
    }

    public static LcmParams b041F041F041F041F041F041F(ggrrgg ggrrgg1, LcmTokenRequest lcmtokenrequest)
    {
        int i = b042604260426042604260426_int_static_fld;
        Object obj = rrrrrr/ggrrgg.getMethod(nuuuuu.b0417041704170417041704170417("\206\324\320\320\245\u04AE\324\320\320\245\324\320\320\245\u04AE\324\320\320\245", '\344', '\002'), new Class[0]);
        int j;
        int k;
        int l;
        int i1;
        try
        {
            obj = ((Method) (obj)).invoke(null, new Object[0]);
        }
        // Misplaced declaration of an exception variable
        catch (ggrrgg ggrrgg1)
        {
            throw ggrrgg1.getCause();
        }
        j = ((Integer)obj).intValue();
        k = b042604260426042604260426_int_static_fld;
        l = b042604260426042604260426_int_static_fld;
        i1 = b042604260426042604260426_int_static_fld;
        obj = rrrrrr/ggrrgg.getMethod(nuuuuu.b0417041704170417041704170417("\uFFED\uFFBB\uFFBF\uFFBF\uFFCC\uFFBB\uFFBF\uFFBF\uFFCC\u03D5\uFFBB\uFFBF\uFFBF\uFFCC\u03D5\uFFBB\uFFBF\uFFBF\uFFCC", '\'', '\004'), new Class[0]);
        try
        {
            obj = ((Method) (obj)).invoke(null, new Object[0]);
        }
        // Misplaced declaration of an exception variable
        catch (ggrrgg ggrrgg1)
        {
            throw ggrrgg1.getCause();
        }
        switch (((i1 + l) * l) % ((Integer)obj).intValue())
        {
        default:
            b042604260426042604260426_int_static_fld = 3;
            Object obj1 = rrrrrr/ggrrgg.getMethod(nuuuuu.b0417041704170417041704170417("8jnn\033\u0410\u0410jnn\033\u0410jnn\033", 'Z', '\002'), new Class[0]);
            try
            {
                obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (ggrrgg ggrrgg1)
            {
                throw ggrrgg1.getCause();
            }
            b042604260426042604260426_int_static_fld = ((Integer)obj1).intValue();
            // fall through

        case 0: // '\0'
            switch (((j + i) * i) % k)
            {
            default:
                b042604260426042604260426_int_static_fld = 66;
                obj1 = rrrrrr/ggrrgg.getMethod(nuuuuu.b0417041704170417041704170417("\224bffs\u047C\u047Cbffs\u047Cbffs", '\031', '\001'), new Class[0]);
                try
                {
                    obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
                }
                // Misplaced declaration of an exception variable
                catch (ggrrgg ggrrgg1)
                {
                    throw ggrrgg1.getCause();
                }
                b042604260426042604260426_int_static_fld = ((Integer)obj1).intValue();
                break;

            case 0: // '\0'
                break;
            }
            break;
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
                    switch (0)
                    {
                    case 1: // '\001'
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

                    case 0: // '\0'
                        switch (0)
                        {
                        default:
                            break;

                        case 0: // '\0'
                            break label0;

                        case 1: // '\001'
                            continue label0;
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
        obj1 = rrrrrr/ggrrgg.getDeclaredMethod(nuuuuu.b0417041704170417041704170417("\uFF66\uFF34\uFF38\uFF38\uFF45\u034E\uFF34\uFF38\uFF38\uFF45\uFF34\uFF38\uFF38\uFF45\uFF34\uFF38\uFF38\uFF45\uFF34\uFF38\uFF38\uFF45", '\266', 'F', '\0'), new Class[] {
            com/visa/cbp/external/lcm/LcmTokenRequest
        });
        try
        {
            ggrrgg1 = ((ggrrgg) (((Method) (obj1)).invoke(ggrrgg1, new Object[] {
                lcmtokenrequest
            })));
        }
        // Misplaced declaration of an exception variable
        catch (ggrrgg ggrrgg1)
        {
            throw ggrrgg1.getCause();
        }
        return (LcmParams)ggrrgg1;
    }

    public static boolean b041F041F041F041F041F041F(ggrrgg ggrrgg1, TokenKey tokenkey, ReplenishResponse replenishresponse)
    {
        int i = b042604260426042604260426_int_static_fld;
        (i * (b042604260426042604260426_int_static_fld + i)) % b042604260426042604260426_int_static_fld;
        JVM INSTR tableswitch 0 0: default 36
    //                   0 304;
           goto _L1 _L2
_L1:
        Object obj = rrrrrr/ggrrgg.getMethod(nuuuuu.b0417041704170417041704170417("\uFF16\uFEE4\uFEE8\uFEE8\uFEF5\u02FE\u02FE\uFEE4\uFEE8\uFEE8\uFEF5\u02FE\uFEE4\uFEE8\uFEE8\uFEF5", '\360', '\\', '\0'), new Class[0]);
        Exception exception;
        try
        {
            obj = ((Method) (obj)).invoke(null, new Object[0]);
        }
        // Misplaced declaration of an exception variable
        catch (ggrrgg ggrrgg1)
        {
            throw ggrrgg1.getCause();
        }
        b042604260426042604260426_int_static_fld = ((Integer)obj).intValue();
        obj = rrrrrr/ggrrgg.getMethod(nuuuuu.b0417041704170417041704170417("\uFEB8\uFE86\uFE8A\uFE8A\uFE97\u02A0\u02A0\uFE86\uFE8A\uFE8A\uFE97\u02A0\uFE86\uFE8A\uFE8A\uFE97", '\325', '\003'), new Class[0]);
        try
        {
            obj = ((Method) (obj)).invoke(null, new Object[0]);
        }
        // Misplaced declaration of an exception variable
        catch (ggrrgg ggrrgg1)
        {
            throw ggrrgg1.getCause();
        }
        b042604260426042604260426_int_static_fld = ((Integer)obj).intValue();
        i = 0;
_L4:
        switch (0)
        {
        default:
label0:
            while (true) 
            {
                switch (1)
                {
                default:
                    break;

                case 0: // '\0'
                    continue; /* Loop/switch isn't completed */

                case 1: // '\001'
                    break label0;
                }
            }
            break;

        case 1: // '\001'
            continue; /* Loop/switch isn't completed */

        case 0: // '\0'
            break;
        }
        try
        {
            i /= 0;
            continue; /* Loop/switch isn't completed */
        }
        // Misplaced declaration of an exception variable
        catch (Exception exception)
        {
            exception = rrrrrr/ggrrgg.getMethod(nuuuuu.b0417041704170417041704170417("\uFF2E\uFEFC\uFF00\uFF00\uFF0D\u0316\u0316\uFEFC\uFF00\uFF00\uFF0D\u0316\uFEFC\uFF00\uFF00\uFF0D", '\232', '\003'), new Class[0]);
            try
            {
                exception = ((Exception) (exception.invoke(null, new Object[0])));
            }
            // Misplaced declaration of an exception variable
            catch (ggrrgg ggrrgg1)
            {
                throw ggrrgg1.getCause();
            }
            b042604260426042604260426_int_static_fld = ((Integer)exception).intValue();
            exception = rrrrrr/ggrrgg.getDeclaredMethod(nuuuuu.b0417041704170417041704170417("\357\275\301\276\323\u04AC\275\301\276\323\u04AC\u04AC\u04AC", '/', '\006'), new Class[] {
                com/visa/cbp/sdk/facade/data/TokenKey, com/visa/cbp/external/aam/ReplenishResponse
            });
        }
        ggrrgg1 = ((ggrrgg) (exception.invoke(ggrrgg1, new Object[] {
            tokenkey, replenishresponse
        })));
        return ((Boolean)ggrrgg1).booleanValue();
        ggrrgg1;
        try
        {
            throw ggrrgg1.getCause();
        }
        // Misplaced declaration of an exception variable
        catch (ggrrgg ggrrgg1)
        {
            throw ggrrgg1;
        }
_L2:
        i = 0;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static Context b041F041F041F041F041F041F(ggrrgg ggrrgg1)
    {
        ggrrgg1 = ggrrgg1.b042604260426042604260426_android_content_Context_fld;
        if (((b042604260426042604260426_int_static_fld + b042604260426042604260426_int_static_fld) * b042604260426042604260426_int_static_fld) % b042604260426042604260426_int_static_fld != b042604260426042604260426_int_static_fld)
        {
            Object obj = rrrrrr/ggrrgg.getMethod(nuuuuu.b0417041704170417041704170417(":\b\f\f\031\u0422\u0422\b\f\f\031\u0422\b\f\f\031", '\024', '\003'), new Class[0]);
            try
            {
                obj = ((Method) (obj)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (ggrrgg ggrrgg1)
            {
                throw ggrrgg1.getCause();
            }
            b042604260426042604260426_int_static_fld = ((Integer)obj).intValue();
            obj = rrrrrr/ggrrgg.getMethod(nuuuuu.b0417041704170417041704170417(".\uFFFC\000\000\r\u0416\u0416\uFFFC\000\000\r\u0416\uFFFC\000\000\r", '\032', '\003'), new Class[0]);
            try
            {
                obj = ((Method) (obj)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (ggrrgg ggrrgg1)
            {
                throw ggrrgg1.getCause();
            }
            b042604260426042604260426_int_static_fld = ((Integer)obj).intValue();
            if (((b042604260426042604260426_int_static_fld + b042604260426042604260426_int_static_fld) * b042604260426042604260426_int_static_fld) % b042604260426042604260426_int_static_fld != b042604260426042604260426_int_static_fld)
            {
                b042604260426042604260426_int_static_fld = 87;
                Object obj1 = rrrrrr/ggrrgg.getMethod(nuuuuu.b0417041704170417041704170417("\u02DE\u02AC\u02B0\u02B0\u02BD\u06C6\u06C6\u02AC\u02B0\u02B0\u02BD\u06C6\u02AC\u02B0\u02B0\u02BD", '\324', '\006'), new Class[0]);
                try
                {
                    obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
                }
                // Misplaced declaration of an exception variable
                catch (ggrrgg ggrrgg1)
                {
                    throw ggrrgg1.getCause();
                }
                b042604260426042604260426_int_static_fld = ((Integer)obj1).intValue();
            }
        }
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
        return ggrrgg1;
    }

    private void b041F041F041F041F041F041F(EnrollAndProvisionResponse enrollandprovisionresponse)
    {
        Status status;
        int i;
        try
        {
            status = new Status();
        }
        // Misplaced declaration of an exception variable
        catch (EnrollAndProvisionResponse enrollandprovisionresponse)
        {
            throw enrollandprovisionresponse;
        }
        i = b042604260426042604260426_int_static_fld;
        switch ((i * (b042604260426042604260426_int_static_fld + i)) % b042604260426042604260426_int_static_fld)
        {
        default:
            Object obj = rrrrrr/ggrrgg.getMethod(nuuuuu.b0417041704170417041704170417("\371\307\313\313\330\u04E1\u04E1\307\313\313\330\u04E1\307\313\313\330", '\227', '\005'), new Class[0]);
            int j;
            try
            {
                obj = ((Method) (obj)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (EnrollAndProvisionResponse enrollandprovisionresponse)
            {
                throw enrollandprovisionresponse.getCause();
            }
            j = ((Integer)obj).intValue();
            switch ((j * (b042604260426042604260426_int_static_fld + j)) % b042604260426042604260426_int_static_fld)
            {
            default:
                b042604260426042604260426_int_static_fld = 43;
                Object obj1 = rrrrrr/ggrrgg.getMethod(nuuuuu.b0417041704170417041704170417("\222`ddq\u047A\u047A`ddq\u047A`ddq", '0', '\005'), new Class[0]);
                Method method;
                try
                {
                    obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
                }
                // Misplaced declaration of an exception variable
                catch (EnrollAndProvisionResponse enrollandprovisionresponse)
                {
                    throw enrollandprovisionresponse.getCause();
                }
                b042604260426042604260426_int_static_fld = ((Integer)obj1).intValue();
                // fall through

            case 0: // '\0'
                b042604260426042604260426_int_static_fld = 92;
                b042604260426042604260426_int_static_fld = 33;
                break;
            }
            break;

        case 0: // '\0'
            break;
        }
        obj1 = TokenStatus.ACTIVE;
        method = com/visa/cbp/sdk/facade/data/TokenStatus.getMethod(nuuuuu.b0417041704170417041704170417("\u0229\u0227\u0236\u0218\u0223\u022E\u0237\u0227", '\341', '\001'), new Class[0]);
        obj1 = method.invoke(obj1, new Object[0]);
        obj1 = (String)obj1;
        method = com/visa/cbp/external/common/Status.getMethod(nuuuuu.b0417041704170417041704170417("=/>\035>+>?=", '\022', '\004'), new Class[] {
            java/lang/String
        });
        method.invoke(status, new Object[] {
            obj1
        });
        obj1 = com/visa/cbp/external/enp/EnrollAndProvisionResponse.getMethod(nuuuuu.b0417041704170417041704170417("\u0174\u0172\u0181\u0161\u017C\u0178\u0172\u017B\u0156\u017B\u0173\u017C", 'H', '\305', '\003'), new Class[0]);
        enrollandprovisionresponse = ((EnrollAndProvisionResponse) (((Method) (obj1)).invoke(enrollandprovisionresponse, new Object[0])));
        enrollandprovisionresponse = (TokenInfo)enrollandprovisionresponse;
        obj1 = com/visa/cbp/external/common/TokenInfo.getMethod(nuuuuu.b0417041704170417041704170417("\u01EA\u01DC\u01EB\u01CB\u01E6\u01E2\u01DC\u01E5\u01CA\u01EB\u01D8\u01EB\u01EC\u01EA", '}', '\006'), new Class[] {
            com/visa/cbp/external/common/Status
        });
        try
        {
            ((Method) (obj1)).invoke(enrollandprovisionresponse, new Object[] {
                status
            });
            return;
        }
        // Misplaced declaration of an exception variable
        catch (EnrollAndProvisionResponse enrollandprovisionresponse) { }
        // Misplaced declaration of an exception variable
        catch (EnrollAndProvisionResponse enrollandprovisionresponse)
        {
            throw enrollandprovisionresponse;
        }
        break MISSING_BLOCK_LABEL_354;
        enrollandprovisionresponse;
        throw enrollandprovisionresponse.getCause();
        enrollandprovisionresponse;
        throw enrollandprovisionresponse.getCause();
        enrollandprovisionresponse;
        throw enrollandprovisionresponse.getCause();
        throw enrollandprovisionresponse.getCause();
    }

    public static void b041F041F041F041F041F041F(ggrrgg ggrrgg1, EnrollAndProvisionResponse enrollandprovisionresponse)
    {
        int i = b042604260426042604260426_int_static_fld;
        switch ((i * (b042604260426042604260426_int_static_fld + i)) % b042604260426042604260426_int_static_fld)
        {
        default:
            b042604260426042604260426_int_static_fld = 71;
            b042604260426042604260426_int_static_fld = 75;
            break;

        case 0: // '\0'
            break;
        }
        Object obj;
        int j;
        int k;
        try
        {
            i = b042604260426042604260426_int_static_fld;
            j = b042604260426042604260426_int_static_fld;
            k = b042604260426042604260426_int_static_fld;
        }
        // Misplaced declaration of an exception variable
        catch (ggrrgg ggrrgg1)
        {
            throw ggrrgg1;
        }
        (i * (j + i)) % k;
        JVM INSTR tableswitch 0 0: default 84
    //                   0 166;
           goto _L1 _L2
_L1:
        obj = rrrrrr/ggrrgg.getMethod(nuuuuu.b0417041704170417041704170417("\uFFC2\uFF90\uFF94\uFF94\uFFA1\u03AA\u03AA\uFF90\uFF94\uFF94\uFFA1\u03AA\uFF90\uFF94\uFF94\uFFA1", 'P', '\003'), new Class[0]);
        obj = ((Method) (obj)).invoke(null, new Object[0]);
        i = ((Integer)obj).intValue();
        b042604260426042604260426_int_static_fld = i;
        obj = rrrrrr/ggrrgg.getMethod(nuuuuu.b0417041704170417041704170417("\uFF7C\uFF4A\uFF4E\uFF4E\uFF5B\u0364\u0364\uFF4A\uFF4E\uFF4E\uFF5B\u0364\uFF4A\uFF4E\uFF4E\uFF5B", 's', '\003'), new Class[0]);
        obj = ((Method) (obj)).invoke(null, new Object[0]);
        i = ((Integer)obj).intValue();
        try
        {
            b042604260426042604260426_int_static_fld = i;
        }
        // Misplaced declaration of an exception variable
        catch (ggrrgg ggrrgg1)
        {
            throw ggrrgg1;
        }
_L2:
        obj = rrrrrr/ggrrgg.getDeclaredMethod(nuuuuu.b0417041704170417041704170417("\u0240\u05FD\u05FD\u05FD\u020E\u0212\u020F\u0224\u05FD\u05FD", '\357', '\001'), new Class[] {
            com/visa/cbp/external/enp/EnrollAndProvisionResponse
        });
        ((Method) (obj)).invoke(ggrrgg1, new Object[] {
            enrollandprovisionresponse
        });
        return;
        ggrrgg1;
        try
        {
            throw ggrrgg1.getCause();
        }
        // Misplaced declaration of an exception variable
        catch (ggrrgg ggrrgg1) { }
        throw ggrrgg1;
        ggrrgg1;
        throw ggrrgg1.getCause();
        ggrrgg1;
        throw ggrrgg1.getCause();
    }

    private void b044A044A044A044A044A044A(TokenKey tokenkey)
    {
        Object obj = rrrrrr/grgrgr.getMethod(nuuuuu.b0417041704170417041704170417("\362\300\304\302\322\u04BB\u04BB\u04BB\u04BB\300\304\302\322", '\220', '\005'), new Class[0]);
        obj = ((Method) (obj)).invoke(null, new Object[0]);
        obj = (Context)obj;
        Object obj1;
        Object obj2;
        int i;
        int j;
        int k;
        int l;
        int i1;
        long l1;
        try
        {
            obj = new lppllp(((Context) (obj)));
        }
        // Misplaced declaration of an exception variable
        catch (TokenKey tokenkey)
        {
            throw tokenkey;
        }
        obj1 = rrrrrr/grrgrg.getMethod(nuuuuu.b0417041704170417041704170417("\uFF6C\u034A\u034A\uFF3A\uFF3E\uFF3E\uFF3A\uFF3A\uFF3E\uFF3E\uFF3A\uFF3A\uFF3E\uFF3E\uFF3A\uFF3A\uFF3E\uFF3E\uFF3A", '{', '\003'), new Class[0]);
        obj1 = ((Method) (obj1)).invoke(obj, new Object[0]);
        obj1 = (TokenKey)obj1;
        try
        {
            i = b042604260426042604260426_int_static_fld;
            j = b042604260426042604260426_int_static_fld;
            k = b042604260426042604260426_int_static_fld;
            l = b042604260426042604260426_int_static_fld;
            i1 = b042604260426042604260426_int_static_fld;
        }
        // Misplaced declaration of an exception variable
        catch (TokenKey tokenkey)
        {
            throw tokenkey;
        }
        if (((i + j) * k) % l == i1)
        {
            break MISSING_BLOCK_LABEL_219;
        }
        obj2 = rrrrrr/ggrrgg.getMethod(nuuuuu.b0417041704170417041704170417("\u034D\u031B\u031F\u031F\u032C\u0735\u0735\u031B\u031F\u031F\u032C\u0735\u031B\u031F\u031F\u032C", '\371', '\006'), new Class[0]);
        obj2 = ((Method) (obj2)).invoke(null, new Object[0]);
        i = ((Integer)obj2).intValue();
        b042604260426042604260426_int_static_fld = i;
        obj2 = rrrrrr/ggrrgg.getMethod(nuuuuu.b0417041704170417041704170417("\247uyy\206\u048F\u048Fuyy\206\u048Fuyy\206", 'c', '\036', '\002'), new Class[0]);
        obj2 = ((Method) (obj2)).invoke(null, new Object[0]);
        i = ((Integer)obj2).intValue();
        b042604260426042604260426_int_static_fld = i;
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_482;
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
        obj2 = com/visa/cbp/sdk/facade/data/TokenKey.getMethod(nuuuuu.b0417041704170417041704170417("b`oOjf`iD_", '\005', '\0'), new Class[0]);
        obj1 = ((Method) (obj2)).invoke(obj1, new Object[0]);
        l1 = ((Long)obj1).longValue();
        obj1 = com/visa/cbp/sdk/facade/data/TokenKey.getMethod(nuuuuu.b0417041704170417041704170417("\u0155\u0153\u0162\u0142\u015D\u0159\u0153\u015C\u0137\u0152", '\356', '\005'), new Class[0]);
        tokenkey = ((TokenKey) (((Method) (obj1)).invoke(tokenkey, new Object[0])));
        if (l1 != ((Long)tokenkey).longValue())
        {
            break MISSING_BLOCK_LABEL_482;
        }
        if (((b042604260426042604260426_int_static_fld + b042604260426042604260426_int_static_fld) * b042604260426042604260426_int_static_fld) % b042604260426042604260426_int_static_fld != b042604260426042604260426_int_static_fld)
        {
            b042604260426042604260426_int_static_fld = 94;
            tokenkey = rrrrrr/ggrrgg.getMethod(nuuuuu.b0417041704170417041704170417("\uFFE3\uFFB1\uFFB5\uFFB5\uFFC2\u03CB\u03CB\uFFB1\uFFB5\uFFB5\uFFC2\u03CB\uFFB1\uFFB5\uFFB5\uFFC2", '\177', '\0'), new Class[0]);
            try
            {
                tokenkey = ((TokenKey) (tokenkey.invoke(null, new Object[0])));
            }
            // Misplaced declaration of an exception variable
            catch (TokenKey tokenkey)
            {
                throw tokenkey.getCause();
            }
            b042604260426042604260426_int_static_fld = ((Integer)tokenkey).intValue();
        }
        tokenkey = new TokenKey(-1L);
        obj1 = rrrrrr/grrgrg.getMethod(nuuuuu.b0417041704170417041704170417("\241ossoosso\u047Fossoossoosso", 'O', '\020', '\002'), new Class[] {
            com/visa/cbp/sdk/facade/data/TokenKey
        });
        tokenkey = ((TokenKey) (((Method) (obj1)).invoke(obj, new Object[] {
            tokenkey
        })));
        ((Boolean)tokenkey).booleanValue();
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
    }

    private byte[] b044A044A044A044A044A044A(EnrollAndProvisionResponse enrollandprovisionresponse)
    {
        Object obj = rrrrrr/pllppl.getMethod(nuuuuu.b0417041704170417041704170417("\uFF30\uFEFE\uFF02\uFEFF\uFF10\u02E9\u02E9\u02E9\uFEFE\uFF02\uFEFF\uFF10\uFEFE\uFF02\uFEFF\uFF10", 'f', '\004'), new Class[0]);
        obj = ((Method) (obj)).invoke(null, new Object[0]);
        obj = (plpllp)obj;
        byte abyte0[];
        Method method;
        byte abyte1[];
        int i;
        int j;
        try
        {
            enrollandprovisionresponse = new rggrrr(enrollandprovisionresponse);
        }
        // Misplaced declaration of an exception variable
        catch (EnrollAndProvisionResponse enrollandprovisionresponse)
        {
            throw enrollandprovisionresponse;
        }
        method = rrrrrr/rggrrr.getMethod(nuuuuu.b0417041704170417041704170417("\uFE9A\uFE68\uFE6C\uFE6B\uFE6E\u026E\u026E\u026E\u026E\u026E", '\344', '\003'), new Class[0]);
        enrollandprovisionresponse = ((EnrollAndProvisionResponse) (method.invoke(enrollandprovisionresponse, new Object[0])));
        abyte1 = (byte[])enrollandprovisionresponse;
        enrollandprovisionresponse = rrrrrr/plpllp.getMethod(nuuuuu.b0417041704170417041704170417("\u013E\u04F7\u010C\u0110\u010D\u011E\u010C\u0110\u010D\u011E\u04F7\u010C\u0110\u010D\u011E\u010C\u0110\u010D\u011E", '\334', '\005'), new Class[] {
            [B
        });
        enrollandprovisionresponse = ((EnrollAndProvisionResponse) (enrollandprovisionresponse.invoke(obj, new Object[] {
            abyte1
        })));
        enrollandprovisionresponse = (byte[])enrollandprovisionresponse;
        obj = rrrrrr/rgrrgg.getMethod(nuuuuu.b0417041704170417041704170417("\u0136\u0104\u0108\u0108\u0115\u0104\u0108\u0108\u0115\u0104\u0108\u0108\u0115\u051E\u051E\u0104\u0108\u0108\u0115", '\324', '\005'), new Class[] {
            [B
        });
        obj = ((Method) (obj)).invoke(null, new Object[] {
            abyte1
        });
        abyte0 = (byte[])obj;
        abyte0 = rrrrrr/ggrrgg.getMethod(nuuuuu.b0417041704170417041704170417("I\027\033\033(\u0431\u0431\027\033\033(\u0431\027\033\033(", '\333', '\302', '\001'), new Class[0]);
        try
        {
            abyte0 = ((byte []) (abyte0.invoke(null, new Object[0])));
        }
        // Misplaced declaration of an exception variable
        catch (EnrollAndProvisionResponse enrollandprovisionresponse)
        {
            throw enrollandprovisionresponse.getCause();
        }
        i = ((Integer)abyte0).intValue();
        j = b042604260426042604260426_int_static_fld;
        if (((b042604260426042604260426_int_static_fld + b042604260426042604260426_int_static_fld) * b042604260426042604260426_int_static_fld) % b042604260426042604260426_int_static_fld != b042604260426042604260426_int_static_fld)
        {
            b042604260426042604260426_int_static_fld = 2;
            b042604260426042604260426_int_static_fld = 74;
        }
        switch ((i * (j + i)) % b042604260426042604260426_int_static_fld)
        {
        default:
            abyte0 = rrrrrr/ggrrgg.getMethod(nuuuuu.b0417041704170417041704170417("\uFF73\uFF41\uFF45\uFF45\uFF52\u035B\u035B\uFF41\uFF45\uFF45\uFF52\u035B\uFF41\uFF45\uFF45\uFF52", '\357', '\0'), new Class[0]);
            try
            {
                abyte0 = ((byte []) (abyte0.invoke(null, new Object[0])));
            }
            // Misplaced declaration of an exception variable
            catch (EnrollAndProvisionResponse enrollandprovisionresponse)
            {
                throw enrollandprovisionresponse.getCause();
            }
            b042604260426042604260426_int_static_fld = ((Integer)abyte0).intValue();
            b042604260426042604260426_int_static_fld = 77;
            // fall through

        case 0: // '\0'
            return enrollandprovisionresponse;
        }
        enrollandprovisionresponse;
        throw enrollandprovisionresponse.getCause();
        enrollandprovisionresponse;
        throw enrollandprovisionresponse.getCause();
        enrollandprovisionresponse;
        try
        {
            throw enrollandprovisionresponse.getCause();
        }
        // Misplaced declaration of an exception variable
        catch (EnrollAndProvisionResponse enrollandprovisionresponse)
        {
            throw enrollandprovisionresponse;
        }
        enrollandprovisionresponse;
        throw enrollandprovisionresponse.getCause();
    }

    public static int b044A044A044A044A044A044A()
    {
        return 0;
    }

    private void b044A044A044A044A044A044A(List list)
    {
        Object obj;
        Object obj2;
        Object obj1;
        Object obj3;
        Object obj5;
        Object obj7;
        Method method2;
        int i;
        int j;
        int k;
        int l;
        try
        {
            obj = new ArrayList();
        }
        // Misplaced declaration of an exception variable
        catch (List list)
        {
            throw list;
        }
        obj1 = rrrrrr/grgrgr.getMethod(nuuuuu.b0417041704170417041704170417("\uFEAF\uFE7D\uFE81\uFE7F\uFE8F\u0278\u0278\u0278\u0278\uFE7D\uFE81\uFE7F\uFE8F", '\221', '\004'), new Class[0]);
        obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
        obj1 = (Context)obj1;
        obj1 = new rggrgg(((Context) (obj1)));
        obj2 = java/util/List.getMethod(nuuuuu.b0417041704170417041704170417("\u015E\u0169\u015A\u0167\u0156\u0169\u0164\u0167", 'h', '\215', '\003'), new Class[0]);
        list = ((List) (((Method) (obj2)).invoke(list, new Object[0])));
        list = (Iterator)list;
_L9:
        obj2 = java/util/Iterator.getMethod(nuuuuu.b0417041704170417041704170417("\u0338\u0331\u0343\u031E\u0335\u0348\u0344", '\360', '\006'), new Class[0]);
        obj2 = ((Method) (obj2)).invoke(list, new Object[0]);
        if (!((Boolean)obj2).booleanValue()) goto _L2; else goto _L1
_L1:
        obj2 = java/util/Iterator.getMethod(nuuuuu.b0417041704170417041704170417("\uFFD0\uFFC7\uFFDA\uFFD6", 's', '+', '\0'), new Class[0]);
        obj2 = ((Method) (obj2)).invoke(list, new Object[0]);
        obj2 = (Object)obj2;
        obj3 = (TokenKey)obj2;
        obj2 = b042604260426042604260426_rrrrrr_ppplpl_fld;
        obj5 = rrrrrr/ppplpl.getMethod(nuuuuu.b0417041704170417041704170417("\uFFA1\u035A\uFF6F\uFF73\uFF70\uFF81\uFF6F\uFF73\uFF70\uFF81\uFF6F\uFF73\uFF70\uFF81\u035A\u035A", '\301', '\0'), new Class[] {
            com/visa/cbp/sdk/facade/data/TokenKey
        });
        obj2 = ((Method) (obj5)).invoke(obj2, new Object[] {
            obj3
        });
        obj2 = (ggggrr)obj2;
        Method method;
        try
        {
            obj5 = b042604260426042604260426_rrrrrr_ppplpl_fld;
            i = b042604260426042604260426_int_static_fld;
        }
        // Misplaced declaration of an exception variable
        catch (List list)
        {
            throw list;
        }
        j = b042604260426042604260426_int_static_fld;
        k = b042604260426042604260426_int_static_fld;
        l = b042604260426042604260426_int_static_fld;
        obj7 = rrrrrr/ggrrgg.getMethod(nuuuuu.b0417041704170417041704170417("\370\u04E0\306\312\312\327\u04E0\306\312\312\327\u04E0\306\312\312\327", 'k', '+', '\003'), new Class[0]);
        obj7 = ((Method) (obj7)).invoke(null, new Object[0]);
        if (((i + j) * k) % l == ((Integer)obj7).intValue())
        {
            break MISSING_BLOCK_LABEL_422;
        }
        obj7 = rrrrrr/ggrrgg.getMethod(nuuuuu.b0417041704170417041704170417("\uFFE8\uFFB6\uFFBA\uFFBA\uFFC7\u03D0\u03D0\uFFB6\uFFBA\uFFBA\uFFC7\u03D0\uFFB6\uFFBA\uFFBA\uFFC7", '=', '\003'), new Class[0]);
        obj7 = ((Method) (obj7)).invoke(null, new Object[0]);
        i = ((Integer)obj7).intValue();
        b042604260426042604260426_int_static_fld = i;
        obj7 = rrrrrr/ggrrgg.getMethod(nuuuuu.b0417041704170417041704170417("\u0256\u0224\u0228\u0228\u0235\u063E\u063E\u0224\u0228\u0228\u0235\u063E\u0224\u0228\u0228\u0235", '\372', '\001'), new Class[0]);
        obj7 = ((Method) (obj7)).invoke(null, new Object[0]);
        i = ((Integer)obj7).intValue();
        b042604260426042604260426_int_static_fld = i;
        obj7 = rrrrrr/rrgrrr.getMethod(nuuuuu.b0417041704170417041704170417(")\u0407\u0407\u0407\u0407\u0407{\177\177\b", 'K', '\002'), new Class[] {
            rrrrrr/ggggrr, rrrrrr/ppplpl
        });
        obj2 = ((Method) (obj7)).invoke(null, new Object[] {
            obj2, obj5
        });
        obj2 = (TokenInfo)obj2;
        obj5 = rrrrrr/rggrgg.getMethod(nuuuuu.b0417041704170417041704170417("\035\u03DA\u03DA\uFFEB\uFFEF\uFFEC\001\u03DA\u03DA\uFFEB\uFFEF\uFFEC\001", '\027', '\004'), new Class[] {
            com/visa/cbp/sdk/facade/data/TokenKey
        });
        obj3 = ((Method) (obj5)).invoke(obj1, new Object[] {
            obj3
        });
        obj5 = (List)obj3;
        obj3 = rrrrrr/grrggg.getMethod(nuuuuu.b0417041704170417041704170417("\u017C\u0539\u014A\u014E\u014B\u0160\u014A\u014E\u014B\u0160\u014A\u014E\u014B\u0160\u014A\u014E\u014B\u0160\u014A\u014E\u014B\u0160", '\215', '\001'), new Class[] {
            java/util/List
        });
        obj3 = ((Method) (obj3)).invoke(null, new Object[] {
            obj5
        });
        if (!((Boolean)obj3).booleanValue()) goto _L4; else goto _L3
_L3:
        i = b042604260426042604260426_int_static_fld;
        switch ((i * (b042604260426042604260426_int_static_fld + i)) % b042604260426042604260426_int_static_fld)
        {
        default:
            obj3 = rrrrrr/ggrrgg.getMethod(nuuuuu.b0417041704170417041704170417("\226dhhu\u047E\u047Edhhu\u047Edhhu", '4', '\005'), new Class[0]);
            Object obj4;
            Object obj6;
            Method method1;
            try
            {
                obj3 = ((Method) (obj3)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (List list)
            {
                throw list.getCause();
            }
            b042604260426042604260426_int_static_fld = ((Integer)obj3).intValue();
            b042604260426042604260426_int_static_fld = 17;
            break;

        case 0: // '\0'
            break;
        }
        obj4 = new ArrayList();
        obj7 = java/util/List.getMethod(nuuuuu.b0417041704170417041704170417("\u0105\u0110\u0101\u010E\375\u0110\u010B\u010E", 'm', '/', '\003'), new Class[0]);
        obj5 = ((Method) (obj7)).invoke(obj5, new Object[0]);
        obj5 = (Iterator)obj5;
_L6:
        obj7 = java/util/Iterator.getMethod(nuuuuu.b0417041704170417041704170417("\uFF4C\uFF45\uFF57\uFF32\uFF49\uFF5C\uFF58", '\216', '\003'), new Class[0]);
        obj7 = ((Method) (obj7)).invoke(obj5, new Object[0]);
        if (!((Boolean)obj7).booleanValue())
        {
            break; /* Loop/switch isn't completed */
        }
        obj7 = java/util/Iterator.getMethod(nuuuuu.b0417041704170417041704170417("\uFFB8\uFFAF\uFFC2\uFFBE", '[', '\003'), new Class[0]);
        obj7 = ((Method) (obj7)).invoke(obj5, new Object[0]);
        obj7 = (Object)obj7;
        obj7 = (TvlEntry)obj7;
        method2 = com/visa/cbp/sdk/facade/data/TvlEntry.getMethod(nuuuuu.b0417041704170417041704170417("OM\\<^T4WO;\\ZQVO", 'b', 'z', '\002'), new Class[0]);
        obj7 = method2.invoke(obj7, new Object[0]);
        obj7 = (String)obj7;
        method2 = java/util/List.getMethod(nuuuuu.b0417041704170417041704170417("\330\335\335", '\271', '\002'), new Class[] {
            java/lang/Object
        });
        obj7 = method2.invoke(obj4, new Object[] {
            obj7
        });
        ((Boolean)obj7).booleanValue();
        if (true) goto _L6; else goto _L5
        list;
        throw list.getCause();
        list;
        throw list.getCause();
        list;
        throw list.getCause();
        list;
        throw list.getCause();
        list;
        throw list.getCause();
        list;
        throw list.getCause();
        list;
        throw list.getCause();
        list;
        throw list.getCause();
        list;
        throw list.getCause();
        list;
        throw list.getCause();
        list;
        throw list.getCause();
        list;
        throw list.getCause();
_L2:
        list = rrrrrr/llpllp.getMethod(nuuuuu.b0417041704170417041704170417("E\u0406\027\023\025\026\u0406\u0406\027\023\025\026\027\023\025\026\u0406", '\'', '\002'), new Class[] {
            java/util/List
        });
        list = ((List) (list.invoke(null, new Object[] {
            obj
        })));
        obj = (UploadTxnsRequest)list;
        list = new Handler();
        obj = new plllpl(b042604260426042604260426_android_content_Context_fld, list, ((UploadTxnsRequest) (obj)));
        method = android/os/Handler.getMethod(nuuuuu.b0417041704170417041704170417("\u0102\u0101\u0105\u0106", '\311', '7', '\002'), new Class[] {
            java/lang/Runnable
        });
        list = ((List) (method.invoke(list, new Object[] {
            obj
        })));
        ((Boolean)list).booleanValue();
        return;
_L7:
        0;
        JVM INSTR tableswitch 0 1: default 1136
    //                   0 1327
    //                   1 1301;
           goto _L7 _L8 _L4
        list;
        throw list.getCause();
        list;
        throw list.getCause();
        list;
        throw list.getCause();
        list;
        throw list.getCause();
        list;
        throw list.getCause();
_L5:
        obj6 = com/visa/cbp/external/common/TokenInfo.getMethod(nuuuuu.b0417041704170417041704170417("\uFDFD\uFDFB\uFE0A\uFDDE\uFDF9\uFDFB\uFDDA\uFDF7\uFE0A\uFDF7", '\316', '\004'), new Class[0]);
        obj6 = ((Method) (obj6)).invoke(obj2, new Object[0]);
        obj6 = (HCEData)obj6;
        method1 = com/visa/cbp/external/common/HCEData.getMethod(nuuuuu.b0417041704170417041704170417("NL[+`U7HYHTZ", '\031', '\0'), new Class[0]);
        obj6 = method1.invoke(obj6, new Object[0]);
        obj6 = (DynParams)obj6;
        method1 = com/visa/cbp/external/common/DynParams.getMethod(nuuuuu.b0417041704170417041704170417("\u0114\u0106\u0115\365\u0117\u010D\u0114", 'Y', '\372', '\001'), new Class[] {
            java/util/List
        });
        method1.invoke(obj6, new Object[] {
            obj4
        });
_L4:
        0;
        JVM INSTR tableswitch 0 1: default 1324
    //                   0 1327
    //                   1 1301;
           goto _L7 _L8 _L4
_L8:
        obj4 = java/util/List.getMethod(nuuuuu.b0417041704170417041704170417("\035  ", '\f', 'P', '\002'), new Class[] {
            java/lang/Object
        });
        obj2 = ((Method) (obj4)).invoke(obj, new Object[] {
            obj2
        });
        ((Boolean)obj2).booleanValue();
          goto _L9
        list;
        throw list.getCause();
        list;
        throw list.getCause();
        list;
        throw list.getCause();
        list;
        throw list.getCause();
        list;
        throw list.getCause();
          goto _L9
    }

    public DynParams b041F041F041F041F041F041F(ReplenishResponse replenishresponse)
    {
        int i;
        int j;
        try
        {
            i = b042604260426042604260426_int_static_fld;
        }
        // Misplaced declaration of an exception variable
        catch (ReplenishResponse replenishresponse)
        {
            throw replenishresponse;
        }
        j = b042604260426042604260426_int_static_fld;
        switch ((j * (b042604260426042604260426_int_static_fld + j)) % b042604260426042604260426_int_static_fld)
        {
        default:
            Object obj = rrrrrr/ggrrgg.getMethod(nuuuuu.b0417041704170417041704170417("k9==J\u0453\u04539==J\u04539==J", '\003', '\006', '\003'), new Class[0]);
            int k;
            int l;
            try
            {
                obj = ((Method) (obj)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (ReplenishResponse replenishresponse)
            {
                throw replenishresponse.getCause();
            }
            b042604260426042604260426_int_static_fld = ((Integer)obj).intValue();
            obj = rrrrrr/ggrrgg.getMethod(nuuuuu.b0417041704170417041704170417("\u011A\350\354\354\371\u0502\u0502\350\354\354\371\u0502\350\354\354\371", '\205', '3', '\003'), new Class[0]);
            try
            {
                obj = ((Method) (obj)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (ReplenishResponse replenishresponse)
            {
                throw replenishresponse.getCause();
            }
            b042604260426042604260426_int_static_fld = ((Integer)obj).intValue();
            break;

        case 0: // '\0'
            break;
        }
        try
        {
            k = b042604260426042604260426_int_static_fld;
            l = b042604260426042604260426_int_static_fld;
        }
        // Misplaced declaration of an exception variable
        catch (ReplenishResponse replenishresponse)
        {
            throw replenishresponse;
        }
        ((k + i) * i) % l;
        JVM INSTR tableswitch 0 0: default 160
    //                   0 206;
           goto _L1 _L2
_L1:
        obj = rrrrrr/ggrrgg.getMethod(nuuuuu.b0417041704170417041704170417("\uFE82\uFE50\uFE54\uFE54\uFE61\u026A\u026A\uFE50\uFE54\uFE54\uFE61\u026A\uFE50\uFE54\uFE54\uFE61", '\360', '\003'), new Class[0]);
        obj = ((Method) (obj)).invoke(null, new Object[0]);
        i = ((Integer)obj).intValue();
        b042604260426042604260426_int_static_fld = i;
        b042604260426042604260426_int_static_fld = 4;
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
        obj = com/visa/cbp/external/aam/ReplenishResponse.getMethod(nuuuuu.b0417041704170417041704170417("\u0113\u0111\u0120\u0100\u011B\u0117\u0111\u011A\365\u011A\u0112\u011B", 'V', '\001'), new Class[0]);
        replenishresponse = ((ReplenishResponse) (((Method) (obj)).invoke(replenishresponse, new Object[0])));
        replenishresponse = (TokenInfo)replenishresponse;
        obj = com/visa/cbp/external/common/TokenInfo.getMethod(nuuuuu.b0417041704170417041704170417("\u0109\u0107\u0116\352\u0105\u0107\346\u0103\u0116\u0103", '\f', '\256', '\001'), new Class[0]);
        replenishresponse = ((ReplenishResponse) (((Method) (obj)).invoke(replenishresponse, new Object[0])));
        replenishresponse = (HCEData)replenishresponse;
        obj = com/visa/cbp/external/common/HCEData.getMethod(nuuuuu.b0417041704170417041704170417(")'6\006;0\022#4#/5", '>', '\0'), new Class[0]);
        replenishresponse = ((ReplenishResponse) (((Method) (obj)).invoke(replenishresponse, new Object[0])));
        return (DynParams)replenishresponse;
        replenishresponse;
        throw replenishresponse.getCause();
        replenishresponse;
        throw replenishresponse.getCause();
        replenishresponse;
        throw replenishresponse.getCause();
        replenishresponse;
        throw replenishresponse.getCause();
    }

    public Status b041F041F041F041F041F041F(TokenStatus tokenstatus, String s, String s1)
    {
        Status status = new Status();
        Method method = com/visa/cbp/sdk/facade/data/TokenStatus.getMethod(nuuuuu.b0417041704170417041704170417("\u0301\u02FF\u030E\u02F0\u02FB\u0306\u030F\u02FF", '\336', '\006'), new Class[0]);
        int i;
        try
        {
            tokenstatus = ((TokenStatus) (method.invoke(tokenstatus, new Object[0])));
        }
        // Misplaced declaration of an exception variable
        catch (TokenStatus tokenstatus)
        {
            throw tokenstatus.getCause();
        }
        tokenstatus = (String)tokenstatus;
        method = com/visa/cbp/external/common/Status.getMethod(nuuuuu.b0417041704170417041704170417("\uFF8C\uFF7E\uFF8D\uFF6C\uFF8D\uFF7A\uFF8D\uFF8E\uFF8C", '\347', '\0'), new Class[] {
            java/lang/String
        });
        try
        {
            method.invoke(status, new Object[] {
                tokenstatus
            });
        }
        // Misplaced declaration of an exception variable
        catch (TokenStatus tokenstatus)
        {
            throw tokenstatus.getCause();
        }
        i = b042604260426042604260426_int_static_fld;
        switch ((i * (b042604260426042604260426_int_static_fld + i)) % b042604260426042604260426_int_static_fld)
        {
        default:
            tokenstatus = rrrrrr/ggrrgg.getMethod(nuuuuu.b0417041704170417041704170417("k9==H\u0443\u04439==H\u04439==H", '\t', '\002'), new Class[0]);
            try
            {
                tokenstatus = ((TokenStatus) (tokenstatus.invoke(null, new Object[0])));
            }
            // Misplaced declaration of an exception variable
            catch (TokenStatus tokenstatus)
            {
                throw tokenstatus.getCause();
            }
            b042604260426042604260426_int_static_fld = ((Integer)tokenstatus).intValue();
            b042604260426042604260426_int_static_fld = 71;
            // fall through

        case 0: // '\0'
            tokenstatus = com/visa/cbp/external/common/Status.getMethod(nuuuuu.b0417041704170417041704170417("\uFE8A\uFE7C\uFE8B\uFE69\uFE7C\uFE78\uFE8A\uFE86\uFE85\uFE5A\uFE86\uFE7B\uFE7C", '\243', '\004'), new Class[] {
                java/lang/String
            });
            break;
        }
        try
        {
            tokenstatus.invoke(status, new Object[] {
                s
            });
        }
        // Misplaced declaration of an exception variable
        catch (TokenStatus tokenstatus)
        {
            throw tokenstatus.getCause();
        }
        if (((b042604260426042604260426_int_static_fld + b042604260426042604260426_int_static_fld) * b042604260426042604260426_int_static_fld) % b042604260426042604260426_int_static_fld != b042604260426042604260426_int_static_fld)
        {
            tokenstatus = rrrrrr/ggrrgg.getMethod(nuuuuu.b0417041704170417041704170417("^,00=\u0446\u0446,00=\u0446,00=", '\004', '\0'), new Class[0]);
            try
            {
                tokenstatus = ((TokenStatus) (tokenstatus.invoke(null, new Object[0])));
            }
            // Misplaced declaration of an exception variable
            catch (TokenStatus tokenstatus)
            {
                throw tokenstatus.getCause();
            }
            b042604260426042604260426_int_static_fld = ((Integer)tokenstatus).intValue();
            b042604260426042604260426_int_static_fld = 32;
        }
        tokenstatus = com/visa/cbp/external/common/Status.getMethod(nuuuuu.b0417041704170417041704170417("RDS1D@RNM#DRB", 'M', 'n', '\002'), new Class[] {
            java/lang/String
        });
        try
        {
            tokenstatus.invoke(status, new Object[] {
                s1
            });
        }
        // Misplaced declaration of an exception variable
        catch (TokenStatus tokenstatus)
        {
            throw tokenstatus.getCause();
        }
        return status;
    }

    public ProvisionTokenResponse b041F041F041F041F041F041F(TokenKey tokenkey)
    {
        Object obj;
        int i;
        int j;
        int k;
        int l;
        int i1;
        try
        {
            i = b042604260426042604260426_int_static_fld;
            j = b042604260426042604260426_int_static_fld;
            k = b042604260426042604260426_int_static_fld;
            l = b042604260426042604260426_int_static_fld;
            i1 = b042604260426042604260426_int_static_fld;
        }
        // Misplaced declaration of an exception variable
        catch (TokenKey tokenkey)
        {
            throw tokenkey;
        }
        if (((i + j) * k) % l == i1)
        {
            break MISSING_BLOCK_LABEL_164;
        }
        obj = rrrrrr/ggrrgg.getMethod(nuuuuu.b0417041704170417041704170417("\353\271\275\275\312\u04D3\u04D3\271\275\275\312\u04D3\271\275\275\312", 'd', '\355', '\001'), new Class[0]);
        try
        {
            obj = ((Method) (obj)).invoke(null, new Object[0]);
        }
        // Misplaced declaration of an exception variable
        catch (TokenKey tokenkey)
        {
            throw tokenkey.getCause();
        }
        i = ((Integer)obj).intValue();
        obj = rrrrrr/ggrrgg.getMethod(nuuuuu.b0417041704170417041704170417("\u01B6\u0184\u0188\u0188\u0195\u059E\u0184\u0188\u0188\u0195\u0184\u0188\u0188\u0195\u059E\u0184\u0188\u0188\u0195", 'c', '\361', '\003'), new Class[0]);
        try
        {
            obj = ((Method) (obj)).invoke(null, new Object[0]);
        }
        // Misplaced declaration of an exception variable
        catch (TokenKey tokenkey)
        {
            throw tokenkey.getCause();
        }
        switch (((((Integer)obj).intValue() + i) * i) % b042604260426042604260426_int_static_fld)
        {
        default:
            b042604260426042604260426_int_static_fld = 34;
            b042604260426042604260426_int_static_fld = 47;
            break;

        case 0: // '\0'
            break;
        }
        b042604260426042604260426_int_static_fld = 59;
        b042604260426042604260426_int_static_fld = 75;
        tokenkey = new ProvisionTokenResponse(tokenkey);
        return tokenkey;
        tokenkey;
        throw tokenkey;
    }

    public ggggrr b041F041F041F041F041F041F(String s, String s1, EnrollAndProvisionResponse enrollandprovisionresponse)
    {
        return new ggggrr(s, s1, enrollandprovisionresponse);
    }

    public void b044A044A044A044A044A044A(ReplenishRequest replenishrequest, ResponseCallback responsecallback)
    {
        ReplenishmentProvider replenishmentprovider;
        Object obj;
        int i;
        int k;
        int i1;
        int k1;
        try
        {
            replenishmentprovider = b042604260426042604260426_com_visa_cbp_sdk_facade_provider_ReplenishmentProvider_fld;
        }
        // Misplaced declaration of an exception variable
        catch (ReplenishRequest replenishrequest)
        {
            throw replenishrequest;
        }
        i = b042604260426042604260426_int_static_fld;
        obj = rrrrrr/ggrrgg.getMethod(nuuuuu.b0417041704170417041704170417("[)--:\u0443)--:)--:\u0443)--:", '\006', '\r', '\002'), new Class[0]);
        try
        {
            obj = ((Method) (obj)).invoke(null, new Object[0]);
        }
        // Misplaced declaration of an exception variable
        catch (ReplenishRequest replenishrequest)
        {
            throw replenishrequest.getCause();
        }
        k = ((Integer)obj).intValue();
        i1 = b042604260426042604260426_int_static_fld;
        k1 = b042604260426042604260426_int_static_fld;
        obj = rrrrrr/ggrrgg.getMethod(nuuuuu.b0417041704170417041704170417("\037\u0437MII<\u0437MII<\u0437MII<", '}', '\002'), new Class[0]);
        try
        {
            obj = ((Method) (obj)).invoke(null, new Object[0]);
        }
        // Misplaced declaration of an exception variable
        catch (ReplenishRequest replenishrequest)
        {
            throw replenishrequest.getCause();
        }
        if (((k + i) * i1) % k1 != ((Integer)obj).intValue())
        {
            Object obj1 = rrrrrr/ggrrgg.getMethod(nuuuuu.b0417041704170417041704170417("\275\213\217\217\234\u04A5\u04A5\213\217\217\234\u04A5\213\217\217\234", '[', '\005'), new Class[0]);
            int j;
            int l;
            int j1;
            try
            {
                obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (ReplenishRequest replenishrequest)
            {
                throw replenishrequest.getCause();
            }
            b042604260426042604260426_int_static_fld = ((Integer)obj1).intValue();
            b042604260426042604260426_int_static_fld = 85;
        }
        j = b042604260426042604260426_int_static_fld;
        l = b042604260426042604260426_int_static_fld;
        j1 = b042604260426042604260426_int_static_fld;
        (j * (l + j)) % j1;
        JVM INSTR tableswitch 0 0: default 212
    //                   0 268;
           goto _L1 _L2
_L2:
        break MISSING_BLOCK_LABEL_268;
_L1:
        try
        {
            b042604260426042604260426_int_static_fld = 63;
        }
        // Misplaced declaration of an exception variable
        catch (ReplenishRequest replenishrequest)
        {
            throw replenishrequest;
        }
        obj1 = rrrrrr/ggrrgg.getMethod(nuuuuu.b0417041704170417041704170417("\uFE84\uFE52\uFE56\uFE56\uFE63\u026C\u026C\uFE52\uFE56\uFE56\uFE63\u026C\uFE52\uFE56\uFE56\uFE63", '\344', '\372', '\0'), new Class[0]);
        obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
        j = ((Integer)obj1).intValue();
        b042604260426042604260426_int_static_fld = j;
        replenishmentprovider.doRequest(replenishrequest, new rrgrrg(this, replenishrequest, responsecallback));
        return;
        replenishrequest;
        throw replenishrequest.getCause();
    }

    public void b044A044A044A044A044A044A(LcmTokenRequest lcmtokenrequest, ResponseCallback responsecallback)
    {
label0:
        do
        {
            switch (1)
            {
            default:
                while (true) 
                {
                    int i = b042604260426042604260426_int_static_fld;
                    Object obj = rrrrrr/ggrrgg.getMethod(nuuuuu.b0417041704170417041704170417("\uFFAD\uFF7B\uFF7F\uFF7F\uFF8C\u0395\uFF7B\uFF7F\uFF7F\uFF8C\uFF7B\uFF7F\uFF7F\uFF8C\u0395\uFF7B\uFF7F\uFF7F\uFF8C", '\265', '\0'), new Class[0]);
                    try
                    {
                        obj = ((Method) (obj)).invoke(null, new Object[0]);
                    }
                    // Misplaced declaration of an exception variable
                    catch (LcmTokenRequest lcmtokenrequest)
                    {
                        throw lcmtokenrequest.getCause();
                    }
                    if (((((Integer)obj).intValue() + i) * b042604260426042604260426_int_static_fld) % b042604260426042604260426_int_static_fld != b042604260426042604260426_int_static_fld)
                    {
                        b042604260426042604260426_int_static_fld = 73;
                        Object obj1 = rrrrrr/ggrrgg.getMethod(nuuuuu.b0417041704170417041704170417("\u0176\u0144\u0148\u0148\u0155\u055E\u055E\u0144\u0148\u0148\u0155\u055E\u0144\u0148\u0148\u0155", '\212', '\001'), new Class[0]);
                        Method method;
                        int j;
                        try
                        {
                            obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
                        }
                        // Misplaced declaration of an exception variable
                        catch (LcmTokenRequest lcmtokenrequest)
                        {
                            throw lcmtokenrequest.getCause();
                        }
                        b042604260426042604260426_int_static_fld = ((Integer)obj1).intValue();
                    }
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
        obj1 = rrrrrr/ggrrgg.getMethod(nuuuuu.b0417041704170417041704170417("G\u042F\u042F\u042F\025\031\031&\025\031\031&\025\031\031&", '\033', '\0'), new Class[] {
            com/visa/cbp/external/lcm/LcmTokenRequest
        });
        try
        {
            obj1 = ((Method) (obj1)).invoke(this, new Object[] {
                lcmtokenrequest
            });
        }
        // Misplaced declaration of an exception variable
        catch (LcmTokenRequest lcmtokenrequest)
        {
            throw lcmtokenrequest.getCause();
        }
        obj1 = (TokenStatusError)obj1;
        if (obj1 == null)
        {
            b042604260426042604260426_com_visa_cbp_sdk_facade_provider_ResumeTokenProvider_fld.doRequest(lcmtokenrequest, new rrrgrg(this, lcmtokenrequest, responsecallback));
            j = b042604260426042604260426_int_static_fld;
            switch ((j * (b042604260426042604260426_int_static_fld + j)) % b042604260426042604260426_int_static_fld)
            {
            default:
                b042604260426042604260426_int_static_fld = 99;
                b042604260426042604260426_int_static_fld = 7;
                // fall through

            case 0: // '\0'
                return;
            }
        }
label1:
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
                        continue label1;

                    case 1: // '\001'
                        break label1;
                    }
                }
                break;

            case 0: // '\0'
                break;

            case 1: // '\001'
                break label1;
            }
        } while (true);
        method = rrrrrr/llpllp.getMethod(nuuuuu.b0417041704170417041704170417("\u0115\u04D4\u04D4\343\347\345\344\u04D4\343\347\345\344\343\347\345\344\u04D4", '<', '\357', '\001'), new Class[] {
            com/visa/cbp/external/lcm/LcmTokenRequest
        });
        try
        {
            lcmtokenrequest = ((LcmTokenRequest) (method.invoke(null, new Object[] {
                lcmtokenrequest
            })));
        }
        // Misplaced declaration of an exception variable
        catch (LcmTokenRequest lcmtokenrequest)
        {
            throw lcmtokenrequest.getCause();
        }
        lcmtokenrequest = (LcmParams)lcmtokenrequest;
        method = com/visa/cbp/sdk/facade/error/TokenStatusError.getMethod(nuuuuu.b0417041704170417041704170417("\250\232\251\201\230\242\205\226\247\226\242\250", '\363', '\276', '\002'), new Class[] {
            com/visa/cbp/sdk/facade/data/LcmParams
        });
        try
        {
            method.invoke(obj1, new Object[] {
                lcmtokenrequest
            });
        }
        // Misplaced declaration of an exception variable
        catch (LcmTokenRequest lcmtokenrequest)
        {
            throw lcmtokenrequest.getCause();
        }
        lcmtokenrequest = TokenStatus.RESUME;
        method = com/visa/cbp/sdk/facade/error/TokenStatusError.getMethod(nuuuuu.b0417041704170417041704170417("\uFF8E\uFF80\uFF8F\uFF6F\uFF8A\uFF86\uFF80\uFF89\uFF6E\uFF8F\uFF7C\uFF8F\uFF90\uFF8E", '$', '\301', '\0'), new Class[] {
            com/visa/cbp/sdk/facade/data/TokenStatus
        });
        try
        {
            method.invoke(obj1, new Object[] {
                lcmtokenrequest
            });
        }
        // Misplaced declaration of an exception variable
        catch (LcmTokenRequest lcmtokenrequest)
        {
            throw lcmtokenrequest.getCause();
        }
        lcmtokenrequest = com/visa/cbp/sdk/facade/provider/ResponseCallback.getMethod(nuuuuu.b0417041704170417041704170417("\323\316\326\331\342\337\322", '4', '9', '\003'), new Class[] {
            com/visa/cbp/sdk/facade/error/CbpError
        });
        try
        {
            lcmtokenrequest.invoke(responsecallback, new Object[] {
                obj1
            });
            return;
        }
        // Misplaced declaration of an exception variable
        catch (LcmTokenRequest lcmtokenrequest)
        {
            throw lcmtokenrequest.getCause();
        }
    }

    public void b044A044A044A044A044A044A(CheckStatusRequest checkstatusrequest, CheckStatusCallback checkstatuscallback)
    {
        CheckStatusProvider checkstatusprovider;
        Object obj;
        int i;
        try
        {
            checkstatusprovider = b042604260426042604260426_com_visa_cbp_sdk_facade_provider_CheckStatusProvider_fld;
        }
        // Misplaced declaration of an exception variable
        catch (CheckStatusRequest checkstatusrequest)
        {
            throw checkstatusrequest;
        }
        if (((b042604260426042604260426_int_static_fld + b042604260426042604260426_int_static_fld) * b042604260426042604260426_int_static_fld) % b042604260426042604260426_int_static_fld != b042604260426042604260426_int_static_fld)
        {
            b042604260426042604260426_int_static_fld = 11;
            b042604260426042604260426_int_static_fld = 63;
        }
        switch (1)
        {
        default:
label0:
            do
            {
                switch (0)
                {
                case 0: // '\0'
                    break label0;

                case 1: // '\001'
                    break MISSING_BLOCK_LABEL_5;
                }
            } while (true);
            break;

        case 0: // '\0'
            break MISSING_BLOCK_LABEL_5;

        case 1: // '\001'
            break;
        }
        i = b042604260426042604260426_int_static_fld;
        (i * (b042604260426042604260426_int_static_fld + i)) % b042604260426042604260426_int_static_fld;
        JVM INSTR tableswitch 0 0: default 205
    //                   0 176;
           goto _L1 _L2
_L2:
        break MISSING_BLOCK_LABEL_176;
_L1:
        b042604260426042604260426_int_static_fld = 89;
        obj = rrrrrr/ggrrgg.getMethod(nuuuuu.b0417041704170417041704170417("\uFFEE\uFFBC\uFFC0\uFFC0\uFFCD\u03D6\u03D6\uFFBC\uFFC0\uFFC0\uFFCD\u03D6\uFFBC\uFFC0\uFFC0\uFFCD", ':', '\003'), new Class[0]);
        obj = ((Method) (obj)).invoke(null, new Object[0]);
        int j = ((Integer)obj).intValue();
        try
        {
            b042604260426042604260426_int_static_fld = j;
        }
        // Misplaced declaration of an exception variable
        catch (CheckStatusRequest checkstatusrequest)
        {
            throw checkstatusrequest;
        }
        checkstatusprovider.doRequest(checkstatusrequest, new ggrrrg(this, checkstatuscallback));
        return;
        checkstatusrequest;
        throw checkstatusrequest.getCause();
    }

    public void b044A044A044A044A044A044A(LcmTokenRequest lcmtokenrequest, ResponseCallback responsecallback)
    {
        int i = b042604260426042604260426_int_static_fld;
        Object obj = rrrrrr/ggrrgg.getMethod(nuuuuu.b0417041704170417041704170417("\u025E\u022C\u0230\u0230\u023D\u0646\u022C\u0230\u0230\u023D\u022C\u0230\u0230\u023D\u0646\u022C\u0230\u0230\u023D", '\376', '\001'), new Class[0]);
        try
        {
            obj = ((Method) (obj)).invoke(null, new Object[0]);
        }
        // Misplaced declaration of an exception variable
        catch (LcmTokenRequest lcmtokenrequest)
        {
            throw lcmtokenrequest.getCause();
        }
        switch (((((Integer)obj).intValue() + i) * i) % b042604260426042604260426_int_static_fld)
        {
        default:
            b042604260426042604260426_int_static_fld = 15;
            Object obj1 = rrrrrr/ggrrgg.getMethod(nuuuuu.b0417041704170417041704170417("\366\244\240\240\325\u04DE\u04DE\244\240\240\325\u04DE\244\240\240\325", '\224', '\002'), new Class[0]);
            Object obj2;
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
            catch (LcmTokenRequest lcmtokenrequest)
            {
                throw lcmtokenrequest.getCause();
            }
            b042604260426042604260426_int_static_fld = ((Integer)obj1).intValue();
            // fall through

        case 0: // '\0'
            obj1 = rrrrrr/pplpll.getMethod(nuuuuu.b0417041704170417041704170417("\277\215\221\220\216\215\221\220\216\u048E\215\221\220\216\u048E\u048E", ']', '\005'), new Class[] {
                com/visa/cbp/external/lcm/LcmTokenRequest
            });
            break;
        }
        obj1 = ((Method) (obj1)).invoke(null, new Object[] {
            lcmtokenrequest
        });
        obj1 = (TokenStatusError)obj1;
        if (obj1 != null)
        {
            break MISSING_BLOCK_LABEL_344;
        }
        obj1 = b042604260426042604260426_com_visa_cbp_sdk_facade_provider_SuspendTokenProvider_fld;
        try
        {
            j = b042604260426042604260426_int_static_fld;
            k = b042604260426042604260426_int_static_fld;
            l = b042604260426042604260426_int_static_fld;
            i1 = b042604260426042604260426_int_static_fld;
            j1 = b042604260426042604260426_int_static_fld;
        }
        // Misplaced declaration of an exception variable
        catch (LcmTokenRequest lcmtokenrequest)
        {
            throw lcmtokenrequest;
        }
        if (((j + k) * l) % i1 == j1)
        {
            break MISSING_BLOCK_LABEL_306;
        }
        obj2 = rrrrrr/ggrrgg.getMethod(nuuuuu.b0417041704170417041704170417("+\uFFF9\uFFFD\uFFFD\n\u0413\u0413\uFFF9\uFFFD\uFFFD\n\u0413\uFFF9\uFFFD\uFFFD\n", '7', '\0'), new Class[0]);
        obj2 = ((Method) (obj2)).invoke(null, new Object[0]);
        j = ((Integer)obj2).intValue();
        try
        {
            b042604260426042604260426_int_static_fld = j;
        }
        // Misplaced declaration of an exception variable
        catch (LcmTokenRequest lcmtokenrequest)
        {
            throw lcmtokenrequest;
        }
        obj2 = rrrrrr/ggrrgg.getMethod(nuuuuu.b0417041704170417041704170417("\u021E\u01EC\u01F0\u01F0\u01FD\u0606\u0606\u01EC\u01F0\u01F0\u01FD\u0606\u01EC\u01F0\u01F0\u01FD", '\336', '\001'), new Class[0]);
        obj2 = ((Method) (obj2)).invoke(null, new Object[0]);
        j = ((Integer)obj2).intValue();
        b042604260426042604260426_int_static_fld = j;
        responsecallback = new gggrrg(this, lcmtokenrequest, responsecallback);
        try
        {
            ((SuspendTokenProvider) (obj1)).doRequest(lcmtokenrequest, responsecallback);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (LcmTokenRequest lcmtokenrequest) { }
        break MISSING_BLOCK_LABEL_339;
        lcmtokenrequest;
        throw lcmtokenrequest.getCause();
        throw lcmtokenrequest;
        obj2 = rrrrrr/llpllp.getMethod(nuuuuu.b0417041704170417041704170417("\u0238\u05F7\u05F7\u0206\u020A\u0208\u0207\u05F7\u0206\u020A\u0208\u0207\u0206\u020A\u0208\u0207\u05F7", '\353', '\001'), new Class[] {
            com/visa/cbp/external/lcm/LcmTokenRequest
        });
        lcmtokenrequest = ((LcmTokenRequest) (((Method) (obj2)).invoke(null, new Object[] {
            lcmtokenrequest
        })));
        lcmtokenrequest = (LcmParams)lcmtokenrequest;
        obj2 = com/visa/cbp/sdk/facade/error/TokenStatusError.getMethod(nuuuuu.b0417041704170417041704170417("QCR*AK.?P?KQ", '\321', '\363', '\002'), new Class[] {
            com/visa/cbp/sdk/facade/data/LcmParams
        });
        ((Method) (obj2)).invoke(obj1, new Object[] {
            lcmtokenrequest
        });
        lcmtokenrequest = TokenStatus.SUSPENDED;
        obj2 = com/visa/cbp/sdk/facade/error/TokenStatusError.getMethod(nuuuuu.b0417041704170417041704170417("\uFFD0\uFFC2\uFFD1\uFFB1\uFFCC\uFFC8\uFFC2\uFFCB\uFFB0\uFFD1\uFFBE\uFFD1\uFFD2\uFFD0", '\243', '\0'), new Class[] {
            com/visa/cbp/sdk/facade/data/TokenStatus
        });
        ((Method) (obj2)).invoke(obj1, new Object[] {
            lcmtokenrequest
        });
        lcmtokenrequest = com/visa/cbp/sdk/facade/provider/ResponseCallback.getMethod(nuuuuu.b0417041704170417041704170417("\uFF0C\uFF07\uFF0F\uFF12\uFF1B\uFF18\uFF0B", '\255', '\003'), new Class[] {
            com/visa/cbp/sdk/facade/error/CbpError
        });
        lcmtokenrequest.invoke(responsecallback, new Object[] {
            obj1
        });
        return;
        lcmtokenrequest;
        try
        {
            throw lcmtokenrequest.getCause();
        }
        // Misplaced declaration of an exception variable
        catch (LcmTokenRequest lcmtokenrequest) { }
        throw lcmtokenrequest;
        lcmtokenrequest;
        throw lcmtokenrequest.getCause();
        lcmtokenrequest;
        throw lcmtokenrequest.getCause();
        lcmtokenrequest;
        throw lcmtokenrequest.getCause();
        lcmtokenrequest;
        throw lcmtokenrequest.getCause();
        lcmtokenrequest;
        throw lcmtokenrequest.getCause();
    }

    public ReplenishRequest b044A044A044A044A044A044A(TokenKey tokenkey)
    {
        tokenkey = new ReplenishParams(tokenkey);
        Object obj = rrrrrr/grgrgr.getMethod(nuuuuu.b0417041704170417041704170417("0bf`\020\u0479\u0479\u0479\u0479bf`\020", 'R', '\002'), new Class[0]);
        ppplpl ppplpl1;
        Method method;
        try
        {
            obj = ((Method) (obj)).invoke(null, new Object[0]);
        }
        // Misplaced declaration of an exception variable
        catch (TokenKey tokenkey)
        {
            throw tokenkey.getCause();
        }
        obj = new rggrgg((Context)obj);
        ppplpl1 = b042604260426042604260426_rrrrrr_ppplpl_fld;
        if (((b042604260426042604260426_int_static_fld + b042604260426042604260426_int_static_fld) * b042604260426042604260426_int_static_fld) % b042604260426042604260426_int_static_fld != b042604260426042604260426_int_static_fld)
        {
            b042604260426042604260426_int_static_fld = 13;
            b042604260426042604260426_int_static_fld = 53;
        }
        method = rrrrrr/llpllp.getMethod(nuuuuu.b0417041704170417041704170417("\u012B\u04EA\371\375\373\372\371\375\373\372\371\375\373\372\u04EA\371\375\373\372\u04EA", 'C', '\006'), new Class[] {
            com/visa/cbp/sdk/facade/request/ReplenishParams, rrrrrr/ppplpl, rrrrrr/llplpp
        });
        try
        {
            tokenkey = ((TokenKey) (method.invoke(null, new Object[] {
                tokenkey, ppplpl1, obj
            })));
        }
        // Misplaced declaration of an exception variable
        catch (TokenKey tokenkey)
        {
            throw tokenkey.getCause();
        }
        return (ReplenishRequest)tokenkey;
    }

    public VisaPaymentSDKImpl b041F041F041F041F041F041F()
    {
        Object obj = rrrrrr/ggrrgg.getMethod(nuuuuu.b0417041704170417041704170417("\u019D\u016B\u016F\u016F\u017C\u0585\u0585\u016B\u016F\u016F\u017C\u0585\u016B\u016F\u016F\u017C", 'i', '\006'), new Class[0]);
        obj = ((Method) (obj)).invoke(null, new Object[0]);
        int i = ((Integer)obj).intValue();
        InvocationTargetException invocationtargetexception;
        Object obj2;
        int j;
        int k;
        int l;
        try
        {
            j = b042604260426042604260426_int_static_fld;
        }
        catch (Exception exception)
        {
            throw exception;
        }
        obj = rrrrrr/ggrrgg.getMethod(nuuuuu.b0417041704170417041704170417("\uFF9D\uFF6B\uFF6F\uFF6F\uFF7C\u0385\u0385\uFF6B\uFF6F\uFF6F\uFF7C\u0385\uFF6B\uFF6F\uFF6F\uFF7C", '\237', '&', '\0'), new Class[0]);
        obj = ((Method) (obj)).invoke(null, new Object[0]);
        k = ((Integer)obj).intValue();
        l = b042604260426042604260426_int_static_fld;
        obj = rrrrrr/ggrrgg.getMethod(nuuuuu.b0417041704170417041704170417("\u0182\u056A\u0150\u0154\u0154\u0161\u056A\u0150\u0154\u0154\u0161\u056A\u0150\u0154\u0154\u0161", 'l', '\264', '\003'), new Class[0]);
        obj = ((Method) (obj)).invoke(null, new Object[0]);
        if ((k * (j + i)) % l == ((Integer)obj).intValue())
        {
            break MISSING_BLOCK_LABEL_224;
        }
        obj = rrrrrr/ggrrgg.getMethod(nuuuuu.b0417041704170417041704170417("\033\uFFE9\uFFED\uFFED\uFFFA\u0403\u0403\uFFE9\uFFED\uFFED\uFFFA\u0403\uFFE9\uFFED\uFFED\uFFFA", 'G', '\0'), new Class[0]);
        obj = ((Method) (obj)).invoke(null, new Object[0]);
        i = ((Integer)obj).intValue();
        Object obj1;
        try
        {
            b042604260426042604260426_int_static_fld = i;
        }
        catch (Exception exception1)
        {
            throw exception1;
        }
        obj = rrrrrr/ggrrgg.getMethod(nuuuuu.b0417041704170417041704170417("\uFFA5\uFF73\uFF77\uFF77\uFF84\u038D\u038D\uFF73\uFF77\uFF77\uFF84\u038D\uFF73\uFF77\uFF77\uFF84", '\275', '\0'), new Class[0]);
        obj = ((Method) (obj)).invoke(null, new Object[0]);
        i = ((Integer)obj).intValue();
        b042604260426042604260426_int_static_fld = i;
        obj = com/visa/cbp/sdk/facade/VisaPaymentSDKImpl.getMethod(nuuuuu.b0417041704170417041704170417("\uFFDF\uFFDD\uFFEC\uFFC1\uFFE6\uFFEB\uFFEC\uFFD9\uFFE6\uFFDB\uFFDD", '\210', '\0'), new Class[0]);
        obj = ((Method) (obj)).invoke(null, new Object[0]);
        obj = (VisaPaymentSDK)obj;
        i = b042604260426042604260426_int_static_fld;
        switch ((i * (b042604260426042604260426_int_static_fld + i)) % b042604260426042604260426_int_static_fld)
        {
        default:
            obj2 = rrrrrr/ggrrgg.getMethod(nuuuuu.b0417041704170417041704170417("!sww\002\u0409\u0409sww\002\u0409sww\002", 'C', '\002'), new Class[0]);
            InvocationTargetException invocationtargetexception1;
            try
            {
                obj2 = ((Method) (obj2)).invoke(null, new Object[0]);
            }
            catch (InvocationTargetException invocationtargetexception2)
            {
                throw invocationtargetexception2.getCause();
            }
            b042604260426042604260426_int_static_fld = ((Integer)obj2).intValue();
            b042604260426042604260426_int_static_fld = 5;
            break;

        case 0: // '\0'
            break;
        }
        obj = (VisaPaymentSDKImpl)obj;
        return ((VisaPaymentSDKImpl) (obj));
        invocationtargetexception;
        throw invocationtargetexception.getCause();
        obj1;
        throw ((InvocationTargetException) (obj1)).getCause();
        obj1;
        throw ((InvocationTargetException) (obj1)).getCause();
        obj1;
        throw obj1;
        obj1;
        throw ((InvocationTargetException) (obj1)).getCause();
        obj1;
        throw ((InvocationTargetException) (obj1)).getCause();
        invocationtargetexception1;
        throw invocationtargetexception1.getCause();
    }

    public Status b041F041F041F041F041F041F(TokenStatus tokenstatus, UpdateReason updatereason)
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
        Object obj = rrrrrr/ggrrgg.getMethod(nuuuuu.b0417041704170417041704170417("A\017\023\023 \u0429\u0429\017\023\023 \u0429\017\023\023 ", '\013', '\004'), new Class[0]);
        int i;
        int j;
        try
        {
            obj = ((Method) (obj)).invoke(null, new Object[0]);
        }
        // Misplaced declaration of an exception variable
        catch (TokenStatus tokenstatus)
        {
            throw tokenstatus.getCause();
        }
        i = ((Integer)obj).intValue();
        j = b042604260426042604260426_int_static_fld;
        obj = rrrrrr/ggrrgg.getMethod(nuuuuu.b0417041704170417041704170417("\263\341\345\345\220\u049B\u049B\341\345\345\220\u049B\341\345\345\220", '\321', '\002'), new Class[0]);
        try
        {
            obj = ((Method) (obj)).invoke(null, new Object[0]);
        }
        // Misplaced declaration of an exception variable
        catch (TokenStatus tokenstatus)
        {
            throw tokenstatus.getCause();
        }
        if ((((Integer)obj).intValue() * (j + i)) % b042604260426042604260426_int_static_fld != b042604260426042604260426_int_static_fld)
        {
            Object obj1 = rrrrrr/ggrrgg.getMethod(nuuuuu.b0417041704170417041704170417("\u0124\362\366\366\u0103\u050C\u050C\362\366\366\u0103\u050C\362\366\366\u0103", '\r', '\265', '\003'), new Class[0]);
            Method method;
            try
            {
                obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (TokenStatus tokenstatus)
            {
                throw tokenstatus.getCause();
            }
            b042604260426042604260426_int_static_fld = ((Integer)obj1).intValue();
            b042604260426042604260426_int_static_fld = 15;
        }
        obj1 = com/visa/cbp/external/common/UpdateReason.getMethod(nuuuuu.b0417041704170417041704170417("\243\241\260\226\241\245\267\253\252\207\253\240\241", '\304', '\002'), new Class[0]);
        try
        {
            obj1 = ((Method) (obj1)).invoke(updatereason, new Object[0]);
        }
        // Misplaced declaration of an exception variable
        catch (TokenStatus tokenstatus)
        {
            throw tokenstatus.getCause();
        }
        obj1 = (String)obj1;
        method = com/visa/cbp/external/common/UpdateReason.getMethod(nuuuuu.b0417041704170417041704170417("\b\006\025\uFFF3\006\002\024\020\017\uFFE5\006\024\004", '\212', '+', '\001'), new Class[0]);
        try
        {
            updatereason = ((UpdateReason) (method.invoke(updatereason, new Object[0])));
        }
        // Misplaced declaration of an exception variable
        catch (TokenStatus tokenstatus)
        {
            throw tokenstatus.getCause();
        }
        updatereason = (String)updatereason;
        method = rrrrrr/ggrrgg.getMethod(nuuuuu.b0417041704170417041704170417("\u01BA\u0188\u018C\u0189\u019E\u0188\u018C\u0189\u019E\u0577\u0577\u0577\u0577", '\254', '\001'), new Class[] {
            com/visa/cbp/sdk/facade/data/TokenStatus, java/lang/String, java/lang/String
        });
        try
        {
            tokenstatus = ((TokenStatus) (method.invoke(this, new Object[] {
                tokenstatus, obj1, updatereason
            })));
        }
        // Misplaced declaration of an exception variable
        catch (TokenStatus tokenstatus)
        {
            throw tokenstatus.getCause();
        }
        return (Status)tokenstatus;
    }

    public ppplpl b041F041F041F041F041F041F()
    {
        Object obj = rrrrrr/ggrrgg.getMethod(nuuuuu.b0417041704170417041704170417("\uFE7E\uFE4C\uFE50\uFE50\uFE5D\u0266\u0266\uFE4C\uFE50\uFE50\uFE5D\u0266\uFE4C\uFE50\uFE50\uFE5D", '\376', '\346', '\0'), new Class[0]);
        int i;
        int k;
        try
        {
            obj = ((Method) (obj)).invoke(null, new Object[0]);
        }
        catch (InvocationTargetException invocationtargetexception)
        {
            throw invocationtargetexception.getCause();
        }
        i = ((Integer)obj).intValue();
        k = b042604260426042604260426_int_static_fld;
        obj = rrrrrr/ggrrgg.getMethod(nuuuuu.b0417041704170417041704170417("\350\266\272\272\307\266\272\272\307\u04D0\266\272\272\307\u04D0\266\272\272\307", '\025', 'q', '\003'), new Class[0]);
        try
        {
            obj = ((Method) (obj)).invoke(null, new Object[0]);
        }
        catch (InvocationTargetException invocationtargetexception1)
        {
            throw invocationtargetexception1.getCause();
        }
        switch (((k + i) * i) % ((Integer)obj).intValue())
        {
        default:
            Object obj1 = rrrrrr/ggrrgg.getMethod(nuuuuu.b0417041704170417041704170417("\u0142\u0110\u0114\u0114\u0121\u052A\u052A\u0110\u0114\u0114\u0121\u052A\u0110\u0114\u0114\u0121", 'p', '\001'), new Class[0]);
            InvocationTargetException invocationtargetexception2;
            int j;
            try
            {
                obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
            }
            catch (InvocationTargetException invocationtargetexception3)
            {
                throw invocationtargetexception3.getCause();
            }
            b042604260426042604260426_int_static_fld = ((Integer)obj1).intValue();
            obj1 = rrrrrr/ggrrgg.getMethod(nuuuuu.b0417041704170417041704170417("\uFEE2\uFEB0\uFEB4\uFEB4\uFEC1\u02CA\u02CA\uFEB0\uFEB4\uFEB4\uFEC1\u02CA\uFEB0\uFEB4\uFEB4\uFEC1", '\200', '\004'), new Class[0]);
            try
            {
                obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
            }
            catch (InvocationTargetException invocationtargetexception4)
            {
                throw invocationtargetexception4.getCause();
            }
            b042604260426042604260426_int_static_fld = ((Integer)obj1).intValue();
            // fall through

        case 0: // '\0'
            obj1 = rrrrrr/ggrrgg.getMethod(nuuuuu.b0417041704170417041704170417("\u0189\u0157\u015B\u015B\u0168\u0571\u0571\u0157\u015B\u015B\u0168\u0571\u0157\u015B\u015B\u0168", '\315', 'Z', '\003'), new Class[0]);
            break;
        }
        try
        {
            obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
        }
        catch (InvocationTargetException invocationtargetexception5)
        {
            throw invocationtargetexception5.getCause();
        }
        j = ((Integer)obj1).intValue();
        switch ((j * (b042604260426042604260426_int_static_fld + j)) % b042604260426042604260426_int_static_fld)
        {
        default:
            obj1 = rrrrrr/ggrrgg.getMethod(nuuuuu.b0417041704170417041704170417("\uFD65\uFD33\uFD37\uFD37\uFD44\u014D\u014D\uFD33\uFD37\uFD37\uFD44\u014D\uFD33\uFD37\uFD37\uFD44", '\377', '\004'), new Class[0]);
            try
            {
                obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
            }
            catch (InvocationTargetException invocationtargetexception6)
            {
                throw invocationtargetexception6.getCause();
            }
            b042604260426042604260426_int_static_fld = ((Integer)obj1).intValue();
            obj1 = rrrrrr/ggrrgg.getMethod(nuuuuu.b0417041704170417041704170417("F\024\020\020e\u046E\u046E\024\020\020e\u046E\024\020\020e", '$', '\002'), new Class[0]);
            try
            {
                obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
            }
            catch (InvocationTargetException invocationtargetexception7)
            {
                throw invocationtargetexception7.getCause();
            }
            b042604260426042604260426_int_static_fld = ((Integer)obj1).intValue();
            // fall through

        case 0: // '\0'
            obj1 = rrrrrr/grgrgr.getMethod(nuuuuu.b0417041704170417041704170417("\u0311\u02DF\u02E3\u02E1\u02F1\u06DA\u06DA\u06DA\u06DA\u02DF\u02E3\u02E1\u02F1", '\345', '\006'), new Class[0]);
            break;
        }
        try
        {
            obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
        }
        // Misplaced declaration of an exception variable
        catch (InvocationTargetException invocationtargetexception2)
        {
            throw invocationtargetexception2.getCause();
        }
        return new llpppl((Context)obj1);
    }

    public ReplenishmentProvider b041F041F041F041F041F041F()
    {
        int i = b042604260426042604260426_int_static_fld;
        switch ((i * (b042604260426042604260426_int_static_fld + i)) % b042604260426042604260426_int_static_fld)
        {
        default:
            Object obj = rrrrrr/ggrrgg.getMethod(nuuuuu.b0417041704170417041704170417("\022@DD1\u043A\u043A@DD1\u043A@DD1", 'p', '\002'), new Class[0]);
            InvocationTargetException invocationtargetexception;
            try
            {
                obj = ((Method) (obj)).invoke(null, new Object[0]);
            }
            catch (InvocationTargetException invocationtargetexception1)
            {
                throw invocationtargetexception1.getCause();
            }
            b042604260426042604260426_int_static_fld = ((Integer)obj).intValue();
            obj = rrrrrr/ggrrgg.getMethod(nuuuuu.b0417041704170417041704170417("\uFE84\uFE52\uFE56\uFE56\uFE63\u026C\u026C\uFE52\uFE56\uFE56\uFE63\u026C\uFE52\uFE56\uFE56\uFE63", '\357', '\003'), new Class[0]);
            try
            {
                obj = ((Method) (obj)).invoke(null, new Object[0]);
            }
            catch (InvocationTargetException invocationtargetexception2)
            {
                throw invocationtargetexception2.getCause();
            }
            b042604260426042604260426_int_static_fld = ((Integer)obj).intValue();
            break;

        case 0: // '\0'
            break;
        }
        if (((b042604260426042604260426_int_static_fld + b042604260426042604260426_int_static_fld) * b042604260426042604260426_int_static_fld) % b042604260426042604260426_int_static_fld != b042604260426042604260426_int_static_fld)
        {
            b042604260426042604260426_int_static_fld = 87;
            obj = rrrrrr/ggrrgg.getMethod(nuuuuu.b0417041704170417041704170417("\uFDE3\uFDB1\uFDB5\uFDB5\uFDC2\u01CB\u01CB\uFDB1\uFDB5\uFDB5\uFDC2\u01CB\uFDB1\uFDB5\uFDB5\uFDC2", '\325', '\004'), new Class[0]);
            try
            {
                obj = ((Method) (obj)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (InvocationTargetException invocationtargetexception)
            {
                throw invocationtargetexception.getCause();
            }
            b042604260426042604260426_int_static_fld = ((Integer)obj).intValue();
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
        }
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
        return new ggrrgr();
    }

    public ggrggg b044A044A044A044A044A044A()
    {
        int i = b042604260426042604260426_int_static_fld;
        switch ((i * (b042604260426042604260426_int_static_fld + i)) % b042604260426042604260426_int_static_fld)
        {
        default:
            b042604260426042604260426_int_static_fld = 2;
            b042604260426042604260426_int_static_fld = 88;
            // fall through

        case 0: // '\0'
            return new ggrggg(b042604260426042604260426_rrrrrr_ppplpl_fld);
        }
    }

    public void b044A044A044A044A044A044A(LcmTokenRequest lcmtokenrequest, ResponseCallback responsecallback)
    {
        Object obj = rrrrrr/pplpll.getMethod(nuuuuu.b0417041704170417041704170417("\uFF2B\uFEF9\uFEFD\uFEFC\uFEFA\uFEF9\uFEFD\uFEFC\uFEFA\u02FA\uFEF9\uFEFD\uFEFC\uFEFA\u02FA\u02FA", 'H', '\357', '\0'), new Class[] {
            com/visa/cbp/external/lcm/LcmTokenRequest
        });
        try
        {
            obj = ((Method) (obj)).invoke(null, new Object[] {
                lcmtokenrequest
            });
        }
        // Misplaced declaration of an exception variable
        catch (LcmTokenRequest lcmtokenrequest)
        {
            throw lcmtokenrequest.getCause();
        }
        obj = (TokenStatusError)obj;
        if (obj == null)
        {
            obj = b042604260426042604260426_com_visa_cbp_sdk_facade_provider_DeleteTokenProvider_fld;
            if (((b042604260426042604260426_int_static_fld + b042604260426042604260426_int_static_fld) * b042604260426042604260426_int_static_fld) % b042604260426042604260426_int_static_fld != b042604260426042604260426_int_static_fld)
            {
                b042604260426042604260426_int_static_fld = 74;
                Object obj1 = rrrrrr/ggrrgg.getMethod(nuuuuu.b0417041704170417041704170417("\uFF63\uFF31\uFF35\uFF35\uFF42\u034B\u034B\uFF31\uFF35\uFF35\uFF42\u034B\uFF31\uFF35\uFF35\uFF42", '\002', '\375', '\0'), new Class[0]);
                int i;
                int j;
                int k;
                try
                {
                    obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
                }
                // Misplaced declaration of an exception variable
                catch (LcmTokenRequest lcmtokenrequest)
                {
                    throw lcmtokenrequest.getCause();
                }
                b042604260426042604260426_int_static_fld = ((Integer)obj1).intValue();
            }
            i = b042604260426042604260426_int_static_fld;
            obj1 = rrrrrr/ggrrgg.getMethod(nuuuuu.b0417041704170417041704170417("\022\uFFE0\uFFE4\uFFE4\uFFF1\u03FA\uFFE0\uFFE4\uFFE4\uFFF1\uFFE0\uFFE4\uFFE4\uFFF1\u03FA\uFFE0\uFFE4\uFFE4\uFFF1", ' ', 'p', '\002'), new Class[0]);
            try
            {
                obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (LcmTokenRequest lcmtokenrequest)
            {
                throw lcmtokenrequest.getCause();
            }
            j = ((Integer)obj1).intValue();
            k = b042604260426042604260426_int_static_fld;
            obj1 = rrrrrr/ggrrgg.getMethod(nuuuuu.b0417041704170417041704170417("\uFF68\uFF36\uFF3A\uFF3A\uFF47\uFF36\uFF3A\uFF3A\uFF47\u0350\uFF36\uFF3A\uFF3A\uFF47\u0350\uFF36\uFF3A\uFF3A\uFF47", '\272', '@', '\0'), new Class[0]);
            try
            {
                obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (LcmTokenRequest lcmtokenrequest)
            {
                throw lcmtokenrequest.getCause();
            }
            if ((k * (j + i)) % ((Integer)obj1).intValue() != b042604260426042604260426_int_static_fld)
            {
                obj1 = rrrrrr/ggrrgg.getMethod(nuuuuu.b0417041704170417041704170417("\uFF83\uFF51\uFF55\uFF55\uFF62\u036B\u036B\uFF51\uFF55\uFF55\uFF62\u036B\uFF51\uFF55\uFF55\uFF62", '\337', '\0'), new Class[0]);
                try
                {
                    obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
                }
                // Misplaced declaration of an exception variable
                catch (LcmTokenRequest lcmtokenrequest)
                {
                    throw lcmtokenrequest.getCause();
                }
                b042604260426042604260426_int_static_fld = ((Integer)obj1).intValue();
                b042604260426042604260426_int_static_fld = 48;
            }
            responsecallback = new rggrrg(this, lcmtokenrequest, responsecallback);
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
            ((DeleteTokenProvider) (obj)).doRequest(lcmtokenrequest, responsecallback);
            return;
        }
        obj1 = rrrrrr/ggrrgg.getDeclaredMethod(nuuuuu.b0417041704170417041704170417("\uFFF3\uFFC1\uFFC5\uFFC5\uFFD2\u03DB\uFFC1\uFFC5\uFFC5\uFFD2\uFFC1\uFFC5\uFFC5\uFFD2\uFFC1\uFFC5\uFFC5\uFFD2\uFFC1\uFFC5\uFFC5\uFFD2", 'e', '\n', '\0'), new Class[] {
            com/visa/cbp/external/lcm/LcmTokenRequest
        });
        try
        {
            lcmtokenrequest = ((LcmTokenRequest) (((Method) (obj1)).invoke(this, new Object[] {
                lcmtokenrequest
            })));
        }
        // Misplaced declaration of an exception variable
        catch (LcmTokenRequest lcmtokenrequest)
        {
            throw lcmtokenrequest.getCause();
        }
        lcmtokenrequest = (LcmParams)lcmtokenrequest;
        obj1 = com/visa/cbp/sdk/facade/error/TokenStatusError.getMethod(nuuuuu.b0417041704170417041704170417("\u01A7\u0199\u01A8\u0180\u0197\u01A1\u0184\u0195\u01A6\u0195\u01A1\u01A7", '\232', '\001'), new Class[] {
            com/visa/cbp/sdk/facade/data/LcmParams
        });
        try
        {
            ((Method) (obj1)).invoke(obj, new Object[] {
                lcmtokenrequest
            });
        }
        // Misplaced declaration of an exception variable
        catch (LcmTokenRequest lcmtokenrequest)
        {
            throw lcmtokenrequest.getCause();
        }
        lcmtokenrequest = TokenStatus.DELETED;
        obj1 = com/visa/cbp/sdk/facade/error/TokenStatusError.getMethod(nuuuuu.b0417041704170417041704170417("\uFF28\uFF1A\uFF29\uFF09\uFF24\uFF20\uFF1A\uFF23\uFF08\uFF29\uFF16\uFF29\uFF2A\uFF28", '\351', 'b', '\0'), new Class[] {
            com/visa/cbp/sdk/facade/data/TokenStatus
        });
        try
        {
            ((Method) (obj1)).invoke(obj, new Object[] {
                lcmtokenrequest
            });
        }
        // Misplaced declaration of an exception variable
        catch (LcmTokenRequest lcmtokenrequest)
        {
            throw lcmtokenrequest.getCause();
        }
        lcmtokenrequest = com/visa/cbp/sdk/facade/provider/ResponseCallback.getMethod(nuuuuu.b0417041704170417041704170417("\222\225\235\230\201\206\221", '\364', '\002'), new Class[] {
            com/visa/cbp/sdk/facade/error/CbpError
        });
        try
        {
            lcmtokenrequest.invoke(responsecallback, new Object[] {
                obj
            });
            return;
        }
        // Misplaced declaration of an exception variable
        catch (LcmTokenRequest lcmtokenrequest)
        {
            throw lcmtokenrequest.getCause();
        }
    }

    public TokenKey b044A044A044A044A044A044A(TokenInfo tokeninfo)
    {
        Object obj;
        Object obj1;
        Method method;
        int i;
        int j;
        int k;
        try
        {
            i = b042604260426042604260426_int_static_fld;
        }
        // Misplaced declaration of an exception variable
        catch (TokenInfo tokeninfo)
        {
            throw tokeninfo;
        }
        obj = rrrrrr/ggrrgg.getMethod(nuuuuu.b0417041704170417041704170417("/\uFFFD\001\001\016\u0417\uFFFD\001\001\016\uFFFD\001\001\016\u0417\uFFFD\001\001\016", '\021', '\004'), new Class[0]);
        obj = ((Method) (obj)).invoke(null, new Object[0]);
        j = ((Integer)obj).intValue();
        k = b042604260426042604260426_int_static_fld;
        ((j + i) * i) % k;
        JVM INSTR tableswitch 0 0: default 76
    //                   0 174;
           goto _L1 _L2
_L2:
        break MISSING_BLOCK_LABEL_174;
_L1:
        i = b042604260426042604260426_int_static_fld;
        switch ((i * (b042604260426042604260426_int_static_fld + i)) % b042604260426042604260426_int_static_fld)
        {
        default:
            b042604260426042604260426_int_static_fld = 15;
            b042604260426042604260426_int_static_fld = 83;
            // fall through

        case 0: // '\0'
            obj = rrrrrr/ggrrgg.getMethod(nuuuuu.b0417041704170417041704170417("\u023F\u020D\u0211\u0211\u021E\u0627\u0627\u020D\u0211\u0211\u021E\u0627\u020D\u0211\u0211\u021E", '\340', '\375', '\003'), new Class[0]);
            break;
        }
        obj = ((Method) (obj)).invoke(null, new Object[0]);
        i = ((Integer)obj).intValue();
        try
        {
            b042604260426042604260426_int_static_fld = i;
            b042604260426042604260426_int_static_fld = 92;
        }
        // Misplaced declaration of an exception variable
        catch (TokenInfo tokeninfo)
        {
            throw tokeninfo;
        }
        obj = b042604260426042604260426_rrrrrr_ppplpl_fld;
        obj1 = com/visa/cbp/external/common/TokenInfo.getMethod(nuuuuu.b0417041704170417041704170417("\uFF76\uFF74\uFF83\uFF63\uFF7E\uFF7A\uFF74\uFF7D\uFF61\uFF74\uFF80\uFF84\uFF74\uFF82\uFF83\uFF7E\uFF81\uFF58\uFF53", '\361', '\0'), new Class[0]);
        obj1 = ((Method) (obj1)).invoke(tokeninfo, new Object[0]);
        obj1 = (String)obj1;
        method = com/visa/cbp/external/common/TokenInfo.getMethod(nuuuuu.b0417041704170417041704170417("\u0251\u024F\u025E\u023E\u0259\u0255\u024F\u0258\u023C\u024F\u0250\u024F\u025C\u024F\u0258\u024D\u024F\u0233\u022E", '\365', '\001'), new Class[0]);
        tokeninfo = ((TokenInfo) (method.invoke(tokeninfo, new Object[0])));
        tokeninfo = (String)tokeninfo;
        method = rrrrrr/ppplpl.getMethod(nuuuuu.b0417041704170417041704170417("2\000\004\001\022\000\004\001\022\000\004\001\022\000\004\001\022\u03EB\u03EB", '\366', '\306', '\001'), new Class[] {
            java/lang/String, java/lang/String
        });
        tokeninfo = ((TokenInfo) (method.invoke(obj, new Object[] {
            obj1, tokeninfo
        })));
        return (TokenKey)tokeninfo;
_L4:
        throw tokeninfo;
_L5:
        throw tokeninfo;
        tokeninfo;
        throw tokeninfo.getCause();
        tokeninfo;
        try
        {
            throw tokeninfo.getCause();
        }
        // Misplaced declaration of an exception variable
        catch (TokenInfo tokeninfo) { }
        if (true) goto _L4; else goto _L3
_L3:
        tokeninfo;
        throw tokeninfo.getCause();
        tokeninfo;
        try
        {
            throw tokeninfo.getCause();
        }
        // Misplaced declaration of an exception variable
        catch (TokenInfo tokeninfo) { }
          goto _L5
        tokeninfo;
        throw tokeninfo.getCause();
    }

    public boolean b044A044A044A044A044A044A(TokenKey tokenkey, Status status)
    {
        boolean flag;
        if (status != null)
        {
            Object obj = com/visa/cbp/external/common/Status.getMethod(nuuuuu.b0417041704170417041704170417("\uFFC8\uFFC6\uFFD5\uFFB4\uFFD5\uFFC2\uFFD5\uFFD6\uFFD4", '5', '\004'), new Class[0]);
            Method method;
            try
            {
                obj = ((Method) (obj)).invoke(status, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (TokenKey tokenkey)
            {
                throw tokenkey.getCause();
            }
            obj = (String)obj;
            method = com/visa/cbp/sdk/facade/data/TokenStatus.getMethod(nuuuuu.b0417041704170417041704170417("\252\250\267\227\262\256\250\261\226\267\244\267\270\266", 'C', '\005'), new Class[] {
                java/lang/String
            });
            try
            {
                obj = method.invoke(null, new Object[] {
                    obj
                });
            }
            // Misplaced declaration of an exception variable
            catch (TokenKey tokenkey)
            {
                throw tokenkey.getCause();
            }
            obj = (TokenStatus)obj;
            if (obj == TokenStatus.RESUME)
            {
                status = new ArrayList();
                obj = java/util/ArrayList.getMethod(nuuuuu.b0417041704170417041704170417("\uFF29\uFF2C\uFF2C", 's', '\305', '\0'), new Class[] {
                    java/lang/Object
                });
                try
                {
                    tokenkey = ((TokenKey) (((Method) (obj)).invoke(status, new Object[] {
                        tokenkey
                    })));
                }
                // Misplaced declaration of an exception variable
                catch (TokenKey tokenkey)
                {
                    throw tokenkey.getCause();
                }
                ((Boolean)tokenkey).booleanValue();
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
                if (VisaPaymentSDKImpl.environment == null)
                {
                    tokenkey = new Intent(grrrrr.b044C044C044C044C044C044C("\u01AA\u01B6\u01B4\u0175\u01BD\u01B0\u01BA\u01A8\u0175\u01AA\u01A9\u01B7\u0175\u01A8\u01AA\u01BB\u01B0\u01B6\u01B5\u0175\u019D\u0190\u019A\u0188\u01A6\u019A\u018B\u0192\u01A6\u0195\u0196\u019B\u0190\u018D\u0190\u018A\u0188\u019B\u0190\u0196\u0195", 'q', '\326', '\003'));
                    obj = grrrrr.b044C044C044C044C044C044C("ius4|oyg4ihv4gizout4\\OYGeYJQeTUZOLOIGZOUTeGIZOUT", '\006', '\005');
                    Object obj1 = NotificationAction.ACTION_REPLENISH;
                    Method method2 = com/visa/cbp/sdk/facade/data/NotificationAction.getMethod(nuuuuu.b0417041704170417041704170417("\uFF91\uFF8F\uFF9E\uFF6D\uFF99\uFF8E\uFF8F", '\326', '\0'), new Class[0]);
                    int i;
                    int j;
                    int k;
                    int l;
                    int i1;
                    try
                    {
                        obj1 = method2.invoke(obj1, new Object[0]);
                    }
                    // Misplaced declaration of an exception variable
                    catch (TokenKey tokenkey)
                    {
                        throw tokenkey.getCause();
                    }
                    i = ((Integer)obj1).intValue();
                    obj1 = android/content/Intent.getMethod(nuuuuu.b0417041704170417041704170417("\246\253\252{\256\252\250\227", '\022', '\006'), new Class[] {
                        java/lang/String, Integer.TYPE
                    });
                    try
                    {
                        obj = ((Method) (obj1)).invoke(tokenkey, new Object[] {
                            obj, Integer.valueOf(i)
                        });
                    }
                    // Misplaced declaration of an exception variable
                    catch (TokenKey tokenkey)
                    {
                        throw tokenkey.getCause();
                    }
                    obj = (Intent)obj;
                    i = b042604260426042604260426_int_static_fld;
                    j = b042604260426042604260426_int_static_fld;
                    k = b042604260426042604260426_int_static_fld;
                    l = b042604260426042604260426_int_static_fld;
                    i1 = b042604260426042604260426_int_static_fld;
                    obj = rrrrrr/ggrrgg.getMethod(nuuuuu.b0417041704170417041704170417(">\f\020\020\035\u0426\f\020\020\035\f\020\020\035\u0426\f\020\020\035", '\022', '\003'), new Class[0]);
                    try
                    {
                        obj = ((Method) (obj)).invoke(null, new Object[0]);
                    }
                    // Misplaced declaration of an exception variable
                    catch (TokenKey tokenkey)
                    {
                        throw tokenkey.getCause();
                    }
                    switch (((((Integer)obj).intValue() + i1) * i1) % b042604260426042604260426_int_static_fld)
                    {
                    default:
                        obj = rrrrrr/ggrrgg.getMethod(nuuuuu.b0417041704170417041704170417("\277\355\351\351\234\u0497\u0497\355\351\351\234\u0497\355\351\351\234", '\335', '\002'), new Class[0]);
                        Method method1;
                        try
                        {
                            obj = ((Method) (obj)).invoke(null, new Object[0]);
                        }
                        // Misplaced declaration of an exception variable
                        catch (TokenKey tokenkey)
                        {
                            throw tokenkey.getCause();
                        }
                        b042604260426042604260426_int_static_fld = ((Integer)obj).intValue();
                        obj = rrrrrr/ggrrgg.getMethod(nuuuuu.b0417041704170417041704170417("/\uFFFD\001\001\016\u0417\u0417\uFFFD\001\001\016\u0417\uFFFD\001\001\016", '3', '\0'), new Class[0]);
                        try
                        {
                            obj = ((Method) (obj)).invoke(null, new Object[0]);
                        }
                        // Misplaced declaration of an exception variable
                        catch (TokenKey tokenkey)
                        {
                            throw tokenkey.getCause();
                        }
                        b042604260426042604260426_int_static_fld = ((Integer)obj).intValue();
                        break;

                    case 0: // '\0'
                        break;
                    }
                    if (((i + j) * k) % l != b042604260426042604260426_int_static_fld)
                    {
                        b042604260426042604260426_int_static_fld = 39;
                        obj = rrrrrr/ggrrgg.getMethod(nuuuuu.b0417041704170417041704170417("\uFFE5\uFFB3\uFFB7\uFFB7\uFFC4\u03CD\u03CD\uFFB3\uFFB7\uFFB7\uFFC4\u03CD\uFFB3\uFFB7\uFFB7\uFFC4", '\224', '\027', '\001'), new Class[0]);
                        try
                        {
                            obj = ((Method) (obj)).invoke(null, new Object[0]);
                        }
                        // Misplaced declaration of an exception variable
                        catch (TokenKey tokenkey)
                        {
                            throw tokenkey.getCause();
                        }
                        b042604260426042604260426_int_static_fld = ((Integer)obj).intValue();
                    }
                    obj = grrrrr.b044C044C044C044C044C044C("\u0234\u022F\u022B\u0225\u022E\u0233", '\360', '\001');
                    method1 = android/content/Intent.getMethod(nuuuuu.b0417041704170417041704170417("\310\315\314\235\320\314\312\271", '\200', '\330', '\001'), new Class[] {
                        java/lang/String, java/io/Serializable
                    });
                    try
                    {
                        status = ((Status) (method1.invoke(tokenkey, new Object[] {
                            obj, status
                        })));
                    }
                    // Misplaced declaration of an exception variable
                    catch (TokenKey tokenkey)
                    {
                        throw tokenkey.getCause();
                    }
                    status = (Intent)status;
                    status = b042604260426042604260426_android_content_Context_fld;
                    obj = android/content/Context.getMethod(nuuuuu.b0417041704170417041704170417("\u0159\u0157\u0166\u0142\u0153\u0155\u015D\u0153\u0159\u0157\u0140\u0153\u015F\u0157", '\300', '2', '\003'), new Class[0]);
                    try
                    {
                        status = ((Status) (((Method) (obj)).invoke(status, new Object[0])));
                    }
                    // Misplaced declaration of an exception variable
                    catch (TokenKey tokenkey)
                    {
                        throw tokenkey.getCause();
                    }
                    status = (String)status;
                    obj = android/content/Intent.getMethod(nuuuuu.b0417041704170417041704170417("\u02C5\u02B7\u02C6\u02A2\u02B3\u02B5\u02BD\u02B3\u02B9\u02B7", '\306', '\006'), new Class[] {
                        java/lang/String
                    });
                    try
                    {
                        status = ((Status) (((Method) (obj)).invoke(tokenkey, new Object[] {
                            status
                        })));
                    }
                    // Misplaced declaration of an exception variable
                    catch (TokenKey tokenkey)
                    {
                        throw tokenkey.getCause();
                    }
                    status = (Intent)status;
                    status = b042604260426042604260426_android_content_Context_fld;
                    obj = android/content/Context.getMethod(nuuuuu.b0417041704170417041704170417("\u0142\u0143\u0130\u0141\u0143\u0122\u0134\u0141\u0145\u0138\u0132\u0134", 'E', '\006'), new Class[] {
                        android/content/Intent
                    });
                    try
                    {
                        tokenkey = ((TokenKey) (((Method) (obj)).invoke(status, new Object[] {
                            tokenkey
                        })));
                    }
                    // Misplaced declaration of an exception variable
                    catch (TokenKey tokenkey)
                    {
                        throw tokenkey.getCause();
                    }
                    tokenkey = (ComponentName)tokenkey;
                } else
                {
                    tokenkey = new Intent(b042604260426042604260426_android_content_Context_fld, com/visa/cbp/sdk/facade/activeaccountmanagement/ReplenishmentService);
                    obj = grrrrr.b044C044C044C044C044C044C("\uFEEE\uFEE9\uFEE5\uFEDF\uFEE8\uFEED", '\263', '\003');
                    method1 = android/content/Intent.getMethod(nuuuuu.b0417041704170417041704170417("\332\337\336\357\322\336\330\313", '\252', '\002'), new Class[] {
                        java/lang/String, java/io/Serializable
                    });
                    try
                    {
                        status = ((Status) (method1.invoke(tokenkey, new Object[] {
                            obj, status
                        })));
                    }
                    // Misplaced declaration of an exception variable
                    catch (TokenKey tokenkey)
                    {
                        throw tokenkey.getCause();
                    }
                    status = (Intent)status;
                    status = b042604260426042604260426_android_content_Context_fld;
                    obj = android/content/Context.getMethod(nuuuuu.b0417041704170417041704170417("\uFDAC\uFDAD\uFD9A\uFDAB\uFDAD\uFD8C\uFD9E\uFDAB\uFDAF\uFDA2\uFD9C\uFD9E", '\355', '\004'), new Class[] {
                        android/content/Intent
                    });
                    try
                    {
                        tokenkey = ((TokenKey) (((Method) (obj)).invoke(status, new Object[] {
                            tokenkey
                        })));
                    }
                    // Misplaced declaration of an exception variable
                    catch (TokenKey tokenkey)
                    {
                        throw tokenkey.getCause();
                    }
                    tokenkey = (ComponentName)tokenkey;
                }
                return true;
            }
        } else
        {
            tokenkey = java/lang/Class.getMethod(nuuuuu.b0417041704170417041704170417("\u0105\u0103\u0112\354\377\u010B\u0103", '\340', 'B', '\002'), new Class[0]);
            try
            {
                tokenkey = ((TokenKey) (tokenkey.invoke(rrrrrr/ggrrgg, new Object[0])));
            }
            // Misplaced declaration of an exception variable
            catch (TokenKey tokenkey)
            {
                throw tokenkey.getCause();
            }
            tokenkey = (String)tokenkey;
            status = grrrrr.b044C044C044C044C044C044C("\u0113\u0134\u0121\u0134\u0135\u0133\340\u0123\u0121\u012E\u012E\u012F\u0134\340\u0122\u0125\340\u012E\u0135\u012C\u012C", '`', '\001');
            obj = rrrrrr/ppplpp.getMethod(nuuuuu.b0417041704170417041704170417("\u01C4\u0577\u0192\u0196\u0193\u0197\u0577\u0577\u0192\u0196\u0193\u0197\u0577\u0192\u0196\u0193\u0197", '\216', '\324', '\003'), new Class[] {
                java/lang/String, java/lang/String
            });
            try
            {
                ((Method) (obj)).invoke(null, new Object[] {
                    tokenkey, status
                });
            }
            // Misplaced declaration of an exception variable
            catch (TokenKey tokenkey)
            {
                throw tokenkey.getCause();
            }
            return false;
        }
        method1 = rrrrrr/ggrrgg.getDeclaredMethod(nuuuuu.b0417041704170417041704170417("\uFF91\uFF5F\uFF63\uFF60\uFF75\u034E\u034E\u034E\u034E\u034E", '\321', '\0'), new Class[] {
            com/visa/cbp/sdk/facade/data/TokenKey, com/visa/cbp/external/common/Status
        });
        try
        {
            status = ((Status) (method1.invoke(this, new Object[] {
                tokenkey, status
            })));
        }
        // Misplaced declaration of an exception variable
        catch (TokenKey tokenkey)
        {
            throw tokenkey.getCause();
        }
        flag = ((Boolean)status).booleanValue();
        if (obj != TokenStatus.ACTIVE)
        {
            status = rrrrrr/ggrrgg.getDeclaredMethod(nuuuuu.b0417041704170417041704170417("\uFF99\u0381\uFF67\uFF6B\uFF6B\uFF78\uFF67\uFF6B\uFF6B\uFF78\uFF67\uFF6B\uFF6B\uFF78\uFF67\uFF6B\uFF6B\uFF78\uFF67\uFF6B\uFF6B\uFF78", '-', '\234', '\0'), new Class[] {
                com/visa/cbp/sdk/facade/data/TokenKey
            });
            try
            {
                status.invoke(this, new Object[] {
                    tokenkey
                });
            }
            // Misplaced declaration of an exception variable
            catch (TokenKey tokenkey)
            {
                throw tokenkey.getCause();
            }
            return flag;
        } else
        {
            return flag;
        }
    }

    public void b044A044A044A044A044A044A(EnrollProvisionRequestWrapper enrollprovisionrequestwrapper, ResponseCallback responsecallback)
    {
        TokenProvider tokenprovider;
        Object obj;
        int i;
        try
        {
            tokenprovider = b042604260426042604260426_com_visa_cbp_sdk_facade_provider_TokenProvider_fld;
        }
        // Misplaced declaration of an exception variable
        catch (EnrollProvisionRequestWrapper enrollprovisionrequestwrapper)
        {
            throw enrollprovisionrequestwrapper;
        }
        switch (1)
        {
        default:
label0:
            do
            {
                if (((b042604260426042604260426_int_static_fld + b042604260426042604260426_int_static_fld) * b042604260426042604260426_int_static_fld) % b042604260426042604260426_int_static_fld != b042604260426042604260426_int_static_fld)
                {
                    b042604260426042604260426_int_static_fld = 82;
                    b042604260426042604260426_int_static_fld = 55;
                }
                switch (0)
                {
                case 0: // '\0'
                    break label0;

                case 1: // '\001'
                    break MISSING_BLOCK_LABEL_5;
                }
            } while (true);
            break;

        case 0: // '\0'
            break MISSING_BLOCK_LABEL_5;

        case 1: // '\001'
            break;
        }
        responsecallback = new grgrrg(this, enrollprovisionrequestwrapper, responsecallback);
        i = b042604260426042604260426_int_static_fld;
        obj = rrrrrr/ggrrgg.getMethod(nuuuuu.b0417041704170417041704170417("\uFF18\uFEE6\uFEEA\uFEEA\uFEF7\u0300\uFEE6\uFEEA\uFEEA\uFEF7\uFEE6\uFEEA\uFEEA\uFEF7\u0300\uFEE6\uFEEA\uFEEA\uFEF7", '\245', '\003'), new Class[0]);
        obj = ((Method) (obj)).invoke(null, new Object[0]);
        int j = ((Integer)obj).intValue();
        int k;
        try
        {
            k = b042604260426042604260426_int_static_fld;
        }
        // Misplaced declaration of an exception variable
        catch (EnrollProvisionRequestWrapper enrollprovisionrequestwrapper)
        {
            throw enrollprovisionrequestwrapper;
        }
        ((j + i) * i) % k;
        JVM INSTR tableswitch 0 0: default 180
    //                   0 233;
           goto _L1 _L2
_L2:
        break MISSING_BLOCK_LABEL_233;
_L1:
        obj = rrrrrr/ggrrgg.getMethod(nuuuuu.b0417041704170417041704170417("\uFD9B\uFD69\uFD6D\uFD6D\uFD7A\u0183\u0183\uFD69\uFD6D\uFD6D\uFD7A\u0183\uFD69\uFD6D\uFD6D\uFD7A", '\355', '\004'), new Class[0]);
        obj = ((Method) (obj)).invoke(null, new Object[0]);
        i = ((Integer)obj).intValue();
        b042604260426042604260426_int_static_fld = i;
        b042604260426042604260426_int_static_fld = 89;
        tokenprovider.doRequest(enrollprovisionrequestwrapper, responsecallback);
        return;
        enrollprovisionrequestwrapper;
        throw enrollprovisionrequestwrapper.getCause();
        enrollprovisionrequestwrapper;
        throw enrollprovisionrequestwrapper.getCause();
    }

    public TokenStatusError b044A044A044A044A044A044A(LcmTokenRequest lcmtokenrequest)
    {
        Method method = rrrrrr/pplpll.getMethod(nuuuuu.b0417041704170417041704170417("\uFF1A\uFEE8\uFEEC\uFEEB\uFEE9\uFEE8\uFEEC\uFEEB\uFEE9\u02E9\uFEE8\uFEEC\uFEEB\uFEE9\u02E9\u02E9", '\244', '\003'), new Class[] {
            com/visa/cbp/external/lcm/LcmTokenRequest
        });
        try
        {
            lcmtokenrequest = ((LcmTokenRequest) (method.invoke(null, new Object[] {
                lcmtokenrequest
            })));
        }
        // Misplaced declaration of an exception variable
        catch (LcmTokenRequest lcmtokenrequest)
        {
            throw lcmtokenrequest.getCause();
        }
        lcmtokenrequest = (TokenStatusError)lcmtokenrequest;
        if (((b042604260426042604260426_int_static_fld + b042604260426042604260426_int_static_fld) * b042604260426042604260426_int_static_fld) % b042604260426042604260426_int_static_fld != b042604260426042604260426_int_static_fld)
        {
            Object obj = rrrrrr/ggrrgg.getMethod(nuuuuu.b0417041704170417041704170417("\u0165\u0133\u0137\u0137\u0144\u054D\u054D\u0133\u0137\u0137\u0144\u054D\u0133\u0137\u0137\u0144", '\006', '\375', '\003'), new Class[0]);
            try
            {
                obj = ((Method) (obj)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (LcmTokenRequest lcmtokenrequest)
            {
                throw lcmtokenrequest.getCause();
            }
            b042604260426042604260426_int_static_fld = ((Integer)obj).intValue();
            b042604260426042604260426_int_static_fld = 93;
        }
        return lcmtokenrequest;
    }

    public ReplenishAckRequest b044A044A044A044A044A044A(TokenKey tokenkey)
    {
        Object obj;
        Object obj1;
        Method method;
        int i;
        int j;
        int k;
        int l;
        int i1;
        try
        {
            tokenkey = new ReplenishParams(tokenkey);
        }
        // Misplaced declaration of an exception variable
        catch (TokenKey tokenkey)
        {
            throw tokenkey;
        }
        obj = rrrrrr/grgrgr.getMethod(nuuuuu.b0417041704170417041704170417("\u01F7\u01C5\u01C9\u01C7\u01D7\u05C0\u05C0\u05C0\u05C0\u01C5\u01C9\u01C7\u01D7", '\344', '\261', '\003'), new Class[0]);
        obj = ((Method) (obj)).invoke(null, new Object[0]);
        obj = (Context)obj;
        try
        {
            obj = new lppllp(((Context) (obj)));
        }
        // Misplaced declaration of an exception variable
        catch (TokenKey tokenkey)
        {
            throw tokenkey;
        }
        obj1 = rrrrrr/ggrrgg.getMethod(nuuuuu.b0417041704170417041704170417("\u01DB\u01A9\u01AD\u01AD\u01BA\u05C3\u05C3\u01A9\u01AD\u01AD\u01BA\u05C3\u01A9\u01AD\u01AD\u01BA", '\343', '\226', '\003'), new Class[0]);
        try
        {
            obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
        }
        // Misplaced declaration of an exception variable
        catch (TokenKey tokenkey)
        {
            throw tokenkey.getCause();
        }
        i = ((Integer)obj1).intValue();
        j = b042604260426042604260426_int_static_fld;
        obj1 = rrrrrr/ggrrgg.getMethod(nuuuuu.b0417041704170417041704170417("\322\240\244\244\261\240\244\244\261\u04BA\240\244\244\261\u04BA\240\244\244\261", '\006', 'v', '\001'), new Class[0]);
        try
        {
            obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
        }
        // Misplaced declaration of an exception variable
        catch (TokenKey tokenkey)
        {
            throw tokenkey.getCause();
        }
        switch (((j + i) * i) % ((Integer)obj1).intValue())
        {
        default:
            obj1 = rrrrrr/ggrrgg.getMethod(nuuuuu.b0417041704170417041704170417("\uFFB9\uFF87\uFF8B\uFF8B\uFF98\u03A1\u03A1\uFF87\uFF8B\uFF8B\uFF98\u03A1\uFF87\uFF8B\uFF8B\uFF98", 'z', '/', '\0'), new Class[0]);
            try
            {
                obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (TokenKey tokenkey)
            {
                throw tokenkey.getCause();
            }
            b042604260426042604260426_int_static_fld = ((Integer)obj1).intValue();
            b042604260426042604260426_int_static_fld = 69;
            break;

        case 0: // '\0'
            break;
        }
        i = b042604260426042604260426_int_static_fld;
        j = b042604260426042604260426_int_static_fld;
        k = b042604260426042604260426_int_static_fld;
        l = b042604260426042604260426_int_static_fld;
        i1 = b042604260426042604260426_int_static_fld;
        if (((i + j) * k) % l == i1)
        {
            break MISSING_BLOCK_LABEL_303;
        }
        obj1 = rrrrrr/ggrrgg.getMethod(nuuuuu.b0417041704170417041704170417("l:>>K\u0454\u0454:>>K\u0454:>>K", '\n', '\005'), new Class[0]);
        obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
        i = ((Integer)obj1).intValue();
        b042604260426042604260426_int_static_fld = i;
        b042604260426042604260426_int_static_fld = 57;
        obj1 = b042604260426042604260426_rrrrrr_ppplpl_fld;
        method = rrrrrr/llpllp.getMethod(nuuuuu.b0417041704170417041704170417("\u0190\u054F\u054F\u054F\u054F\u015E\u0162\u0160\u015F\u015E\u0162\u0160\u015F\u054F", '\252', '\204', '\003'), new Class[] {
            com/visa/cbp/sdk/facade/request/ReplenishParams, rrrrrr/ppplpl, rrrrrr/grrgrg
        });
        tokenkey = ((TokenKey) (method.invoke(null, new Object[] {
            tokenkey, obj1, obj
        })));
        tokenkey = (ReplenishAckRequest)tokenkey;
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
        return tokenkey;
        tokenkey;
        throw tokenkey.getCause();
        tokenkey;
        throw tokenkey.getCause();
        tokenkey;
        throw tokenkey.getCause();
    }

    static 
    {
label0:
        do
        {
            switch (0)
            {
            default:
                while (true) 
                {
                    int i = b042604260426042604260426_int_static_fld;
                    switch ((i * (b042604260426042604260426_int_static_fld + i)) % b042604260426042604260426_int_static_fld)
                    {
                    default:
                        Object obj = rrrrrr/ggrrgg.getMethod(nuuuuu.b0417041704170417041704170417("\uFF04\uFED2\uFED6\uFED6\uFEE3\u02EC\u02EC\uFED2\uFED6\uFED6\uFEE3\u02EC\uFED2\uFED6\uFED6\uFEE3", '\202', '\334', '\0'), new Class[0]);
                        Object obj1;
                        int j;
                        int k;
                        int l;
                        int i1;
                        int j1;
                        try
                        {
                            obj = ((Method) (obj)).invoke(null, new Object[0]);
                        }
                        catch (InvocationTargetException invocationtargetexception)
                        {
                            throw invocationtargetexception.getCause();
                        }
                        b042604260426042604260426_int_static_fld = ((Integer)obj).intValue();
                        obj = rrrrrr/ggrrgg.getMethod(nuuuuu.b0417041704170417041704170417("\227eiiv\u047F\u047Feiiv\u047Feiiv", '\204', 'O', '\002'), new Class[0]);
                        try
                        {
                            obj = ((Method) (obj)).invoke(null, new Object[0]);
                        }
                        catch (InvocationTargetException invocationtargetexception1)
                        {
                            throw invocationtargetexception1.getCause();
                        }
                        b042604260426042604260426_int_static_fld = ((Integer)obj).intValue();
                        // fall through

                    case 0: // '\0'
                        switch (0)
                        {
                        default:
                            break;

                        case 0: // '\0'
                            break label0;

                        case 1: // '\001'
                            continue label0;
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
        try
        {
            j = b042604260426042604260426_int_static_fld;
            k = b042604260426042604260426_int_static_fld;
            l = b042604260426042604260426_int_static_fld;
            i1 = b042604260426042604260426_int_static_fld;
            j1 = b042604260426042604260426_int_static_fld;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            throw obj1;
        }
        if (((j + k) * l) % i1 == j1)
        {
            break MISSING_BLOCK_LABEL_249;
        }
        try
        {
            b042604260426042604260426_int_static_fld = 32;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            throw obj1;
        }
        obj = rrrrrr/ggrrgg.getMethod(nuuuuu.b0417041704170417041704170417("\u0266\u0234\u0238\u0238\u0245\u064E\u064E\u0234\u0238\u0238\u0245\u064E\u0234\u0238\u0238\u0245", '\254', '\006'), new Class[0]);
        obj = ((Method) (obj)).invoke(null, new Object[0]);
        j = ((Integer)obj).intValue();
        b042604260426042604260426_int_static_fld = j;
        obj = java/lang/Class.getMethod(nuuuuu.b0417041704170417041704170417("\321\317\336\270\313\327\317", '5', '\001'), new Class[0]);
        obj = ((Method) (obj)).invoke(rrrrrr/ggrrgg, new Object[0]);
        obj = (String)obj;
        b042604260426042604260426_java_lang_String_static_fld = ((String) (obj));
        return;
        obj1;
        throw ((InvocationTargetException) (obj1)).getCause();
        obj1;
        throw ((InvocationTargetException) (obj1)).getCause();
    }
}
