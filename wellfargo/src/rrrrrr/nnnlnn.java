// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rrrrrr;

import com.visa.cbp.external.aam.CheckStatusRequest;
import com.visa.cbp.sdk.facade.api.CommonRestAdapter;
import com.visa.cbp.sdk.facade.data.GenericResponse;
import com.visa.cbp.sdk.facade.error.CbpError;
import com.visa.cbp.sdk.facade.provider.CheckStatusProvider;
import com.visa.cbp.sdk.facade.provider.ResponseCallback;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import retrofit.Callback;
import retrofit.client.Header;
import retrofit.client.Response;
import uuuuuu.nuuuuu;

// Referenced classes of package rrrrrr:
//            lplplp, llplll, llplpl

public class nnnlnn extends lplplp
    implements CheckStatusProvider
{

    public static int b044C044C044C044C044C044C = 2;
    public static int b044C044C044C044C044C044C = 87;
    public static int b044C044C044C044C044C044C = 1;
    public static int b044C044C044C044C044C044C;

    public nnnlnn()
    {
        if (((b044C044C044C044C044C044C + b044C044C044C044C044C044C) * b044C044C044C044C044C044C) % b044C044C044C044C044C044C != b044C044C044C044C044C044C)
        {
            Object obj = rrrrrr/nnnlnn.getMethod(nuuuuu.b0417041704170417041704170417("\uFF9C\u0380\u0380\uFF6A\uFF6E\uFF6E\uFF70\uFF6A\uFF6E\uFF6E\uFF70\u0380\u0380\u0380", 'a', 'e', '\0'), new Class[0]);
            Object obj1;
            int i;
            int j;
            int k;
            try
            {
                obj = ((Method) (obj)).invoke(null, new Object[0]);
            }
            catch (InvocationTargetException invocationtargetexception)
            {
                throw invocationtargetexception.getCause();
            }
            b044C044C044C044C044C044C = ((Integer)obj).intValue();
            b044C044C044C044C044C044C = 96;
        }
        try
        {
            super();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            try
            {
                throw obj1;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj1)
            {
                throw obj1;
            }
        }
        try
        {
            i = b044C044C044C044C044C044C;
            j = b044C044C044C044C044C044C;
            k = b044C044C044C044C044C044C;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            throw obj1;
        }
        (i * (j + i)) % k;
        JVM INSTR tableswitch 0 0: default 108
    //                   0 220;
           goto _L1 _L2
_L1:
        obj = rrrrrr/nnnlnn.getMethod(nuuuuu.b0417041704170417041704170417("\u01F3\u05D7\u05D7\u01C1\u01C5\u01C5\u01C7\u01C1\u01C5\u01C5\u01C7\u05D7\u05D7\u05D7", '\333', '\266', '\003'), new Class[0]);
        obj = ((Method) (obj)).invoke(null, new Object[0]);
        i = ((Integer)obj).intValue();
        b044C044C044C044C044C044C = i;
        obj = rrrrrr/nnnlnn.getMethod(nuuuuu.b0417041704170417041704170417("z\u045E\u045E(,,.(,,.\u045E\u045E\u045E", '\030', '\002'), new Class[0]);
        obj = ((Method) (obj)).invoke(null, new Object[0]);
        i = ((Integer)obj).intValue();
        b044C044C044C044C044C044C = i;
        return;
        obj1;
        throw ((InvocationTargetException) (obj1)).getCause();
        obj1;
        throw ((InvocationTargetException) (obj1)).getCause();
_L2:
    }

    private GenericResponse b0446044604460446044604460446(Response response)
    {
        HashMap hashmap;
        Object obj;
        Object obj1;
        Object obj2;
        Method method;
        int i;
        int j;
        try
        {
            hashmap = new HashMap();
        }
        // Misplaced declaration of an exception variable
        catch (Response response)
        {
            throw response;
        }
        obj = retrofit/client/Response.getMethod(nuuuuu.b0417041704170417041704170417("\uFDCA\uFDC8\uFDD7\uFDAB\uFDC8\uFDC4\uFDC7\uFDC8\uFDD5\uFDD6", '\337', '\004'), new Class[0]);
        obj = ((Method) (obj)).invoke(response, new Object[0]);
        obj = (List)obj;
        obj1 = java/util/List.getMethod(nuuuuu.b0417041704170417041704170417("\262\257\276\251\272\257\264\251", '\333', '\002'), new Class[0]);
        obj = ((Method) (obj1)).invoke(obj, new Object[0]);
        obj = (Iterator)obj;
        i = b044C044C044C044C044C044C;
        obj1 = rrrrrr/nnnlnn.getMethod(nuuuuu.b0417041704170417041704170417("\u01A0\u0584\u0584\u0584\u0584\u016E\u0172\u0172\u0174\u0584\u0584", '\237', '\001'), new Class[0]);
        try
        {
            obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
        }
        // Misplaced declaration of an exception variable
        catch (Response response)
        {
            throw response.getCause();
        }
        j = ((Integer)obj1).intValue();
        obj1 = rrrrrr/nnnlnn.getMethod(nuuuuu.b0417041704170417041704170417("\uFED2\u02B6\uFEA0\uFEA4\uFEA4\uFEA6\uFEA0\uFEA4\uFEA4\uFEA6\uFEA0\uFEA4\uFEA4\uFEA6\u02B6\u02B6\u02B6", '\310', '\003'), new Class[0]);
        try
        {
            obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
        }
        // Misplaced declaration of an exception variable
        catch (Response response)
        {
            throw response.getCause();
        }
        switch ((i * (j + i)) % ((Integer)obj1).intValue())
        {
        default:
            obj1 = rrrrrr/nnnlnn.getMethod(nuuuuu.b0417041704170417041704170417("\u01B6\u059A\u059A\u0184\u0188\u0188\u018A\u0184\u0188\u0188\u018A\u059A\u059A\u059A", 'b', '\362', '\003'), new Class[0]);
            try
            {
                obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (Response response)
            {
                throw response.getCause();
            }
            b044C044C044C044C044C044C = ((Integer)obj1).intValue();
            b044C044C044C044C044C044C = 16;
            break;

        case 0: // '\0'
            break;
        }
        obj1 = java/util/Iterator.getMethod(nuuuuu.b0417041704170417041704170417("\uFFAB\uFFA4\uFFB6\uFF91\uFFA8\uFFBB\uFFB7", '\241', '\034', '\0'), new Class[0]);
        obj1 = ((Method) (obj1)).invoke(obj, new Object[0]);
        if (!((Boolean)obj1).booleanValue())
        {
            break; /* Loop/switch isn't completed */
        }
        obj1 = java/util/Iterator.getMethod(nuuuuu.b0417041704170417041704170417("\uFDEF\uFDE6\uFDF9\uFDF5", '\325', '\004'), new Class[0]);
        obj1 = ((Method) (obj1)).invoke(obj, new Object[0]);
        obj1 = (Object)obj1;
        obj2 = (Header)obj1;
        obj1 = retrofit/client/Header.getMethod(nuuuuu.b0417041704170417041704170417("_]lFYe]", '\246', '\256', '\002'), new Class[0]);
        obj1 = ((Method) (obj1)).invoke(obj2, new Object[0]);
        obj1 = (String)obj1;
        method = retrofit/client/Header.getMethod(nuuuuu.b0417041704170417041704170417("\u012C\u012A\u0139\u011B\u0126\u0131\u013A\u012A", '\353', '&', '\002'), new Class[0]);
        obj2 = method.invoke(obj2, new Object[0]);
        obj2 = (String)obj2;
        method = java/util/Map.getMethod(nuuuuu.b0417041704170417041704170417("\uFF1A\uFF1F\uFF1E", '\373', '[', '\0'), new Class[] {
            java/lang/Object, java/lang/Object
        });
        obj1 = method.invoke(hashmap, new Object[] {
            obj1, obj2
        });
        obj1 = (Object)obj1;
        if (true) goto _L2; else goto _L1
_L2:
        break MISSING_BLOCK_LABEL_242;
_L1:
        obj = retrofit/client/Response.getMethod(nuuuuu.b0417041704170417041704170417("\uFF8F\uFF8D\uFF9C\uFF7B\uFF9C\uFF89\uFF9C\uFF9D\uFF9B", '\263', '%', '\0'), new Class[0]);
        obj = ((Method) (obj)).invoke(response, new Object[0]);
        i = ((Integer)obj).intValue();
        j = b044C044C044C044C044C044C;
        switch ((j * (b044C044C044C044C044C044C + j)) % b044C044C044C044C044C044C)
        {
        default:
            obj = rrrrrr/nnnlnn.getMethod(nuuuuu.b0417041704170417041704170417("\325\u04F1\u04F1\207\203\203\201\207\203\203\201\u04F1\u04F1\u04F1", '\267', '\002'), new Class[0]);
            try
            {
                obj = ((Method) (obj)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (Response response)
            {
                throw response.getCause();
            }
            b044C044C044C044C044C044C = ((Integer)obj).intValue();
            b044C044C044C044C044C044C = 91;
            // fall through

        case 0: // '\0'
            obj = retrofit/client/Response.getMethod(nuuuuu.b0417041704170417041704170417("\u0263\u0261\u0270\u024E\u0261\u025D\u026F\u026B\u026A", '\376', '\001'), new Class[0]);
            break;
        }
        response = ((Response) (((Method) (obj)).invoke(response, new Object[0])));
        response = (String)response;
        return new GenericResponse(i, response, hashmap);
        response;
        throw response.getCause();
        response;
        throw response.getCause();
        response;
        try
        {
            throw response.getCause();
        }
        // Misplaced declaration of an exception variable
        catch (Response response)
        {
            throw response;
        }
        response;
        throw response.getCause();
        response;
        throw response.getCause();
        response;
        throw response.getCause();
        response;
        throw response.getCause();
        response;
        throw response.getCause();
        response;
        throw response.getCause();
    }

    public static int b0446044604460446044604460446()
    {
        return 0;
    }

    public static int b0446044604460446044604460446()
    {
        return 2;
    }

    public static GenericResponse b0446044604460446044604460446(nnnlnn nnnlnn1, Response response)
    {
label0:
        do
        {
            switch (1)
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
                            switch (0)
                            {
                            default:
                                break;

                            case 0: // '\0'
                                break label2;

                            case 1: // '\001'
                                break label1;
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
                break;

            case 1: // '\001'
                break label0;
            }
        } while (true);
        Method method = rrrrrr/nnnlnn.getDeclaredMethod(nuuuuu.b0417041704170417041704170417("\uFECD\uFE9B\uFE9F\uFE9F\uFEA1\uFE9B\uFE9F\uFE9F\uFEA1\uFE9B\uFE9F\uFE9F\uFEA1\uFE9B\uFE9F\uFE9F\uFEA1\u02B1\u02B1\u02B1", '\207', '\004'), new Class[] {
            retrofit/client/Response
        });
        int i;
        int j;
        int k;
        try
        {
            nnnlnn1 = ((nnnlnn) (method.invoke(nnnlnn1, new Object[] {
                response
            })));
        }
        // Misplaced declaration of an exception variable
        catch (nnnlnn nnnlnn1)
        {
            throw nnnlnn1.getCause();
        }
        nnnlnn1 = (GenericResponse)nnnlnn1;
        i = b044C044C044C044C044C044C;
        j = b044C044C044C044C044C044C;
        k = b044C044C044C044C044C044C;
        switch ((k * (b044C044C044C044C044C044C + k)) % b044C044C044C044C044C044C)
        {
        default:
            b044C044C044C044C044C044C = 8;
            response = rrrrrr/nnnlnn.getMethod(nuuuuu.b0417041704170417041704170417("\201\u0465\u0465OSSUOSSU\u0465\u0465\u0465", '\037', '\005'), new Class[0]);
            try
            {
                response = ((Response) (response.invoke(null, new Object[0])));
            }
            // Misplaced declaration of an exception variable
            catch (nnnlnn nnnlnn1)
            {
                throw nnnlnn1.getCause();
            }
            b044C044C044C044C044C044C = ((Integer)response).intValue();
            break;

        case 0: // '\0'
            break;
        }
        if (((i + j) * b044C044C044C044C044C044C) % b044C044C044C044C044C044C != b044C044C044C044C044C044C)
        {
            response = rrrrrr/nnnlnn.getMethod(nuuuuu.b0417041704170417041704170417("\uFFF3\u03D7\u03D7\uFFC1\uFFC5\uFFC5\uFFC7\uFFC1\uFFC5\uFFC5\uFFC7\u03D7\u03D7\u03D7", '%', '\004'), new Class[0]);
            try
            {
                response = ((Response) (response.invoke(null, new Object[0])));
            }
            // Misplaced declaration of an exception variable
            catch (nnnlnn nnnlnn1)
            {
                throw nnnlnn1.getCause();
            }
            b044C044C044C044C044C044C = ((Integer)response).intValue();
            b044C044C044C044C044C044C = 87;
        }
        return nnnlnn1;
    }

    public static int b0446044604460446044604460446()
    {
        return 37;
    }

    public static int b0446044604460446044604460446()
    {
        return 1;
    }

    public void b0446044604460446044604460446(CheckStatusRequest checkstatusrequest, ResponseCallback responsecallback)
    {
        Object obj = rrrrrr/llplll.getMethod(nuuuuu.b0417041704170417041704170417("\uFFCD\u03B2\u03B2\uFF9B\uFF9F\uFF9F\uFFA2\u03B2\u03B2\uFF9B\uFF9F\uFF9F\uFFA2", '\225', '\0'), new Class[0]);
        obj = ((Method) (obj)).invoke(null, new Object[0]);
        obj = (llplll)obj;
        Method method;
        try
        {
            obj = ((llplll) (obj)).b043604360436043604360436();
        }
        // Misplaced declaration of an exception variable
        catch (CheckStatusRequest checkstatusrequest)
        {
            throw checkstatusrequest;
        }
        try
        {
            responsecallback = new llplpl(this, responsecallback);
        }
        // Misplaced declaration of an exception variable
        catch (CheckStatusRequest checkstatusrequest)
        {
            throw checkstatusrequest;
        }
        method = com/visa/cbp/sdk/facade/api/CommonRestAdapter.getMethod(nuuuuu.b0417041704170417041704170417("\uFEEF\uFEF4\uFEF1\uFEEF\uFEF7\uFEDF\uFF00\uFEED\uFF00\uFF01\uFEFF", '\272', '\003'), new Class[] {
            com/visa/cbp/external/aam/CheckStatusRequest, retrofit/Callback
        });
        method.invoke(obj, new Object[] {
            checkstatusrequest, responsecallback
        });
        return;
        checkstatusrequest;
        throw checkstatusrequest.getCause();
        checkstatusrequest;
        throw checkstatusrequest.getCause();
    }

    public void b042B042B042B042B042B042B(Object obj, ResponseCallback responsecallback)
    {
        obj = (CheckStatusRequest)obj;
        Method method = rrrrrr/nnnlnn.getMethod(nuuuuu.b0417041704170417041704170417("\uFFF2\uFFC0\uFFC4\uFFC4\uFFC6\u03D6\uFFC0\uFFC4\uFFC4\uFFC6\uFFC0\uFFC4\uFFC4\uFFC6\u03D6\u03D6\u03D6", 'p', '\0'), new Class[] {
            com/visa/cbp/external/aam/CheckStatusRequest, com/visa/cbp/sdk/facade/provider/ResponseCallback
        });
        int i;
        try
        {
            method.invoke(this, new Object[] {
                obj, responsecallback
            });
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw ((InvocationTargetException) (obj)).getCause();
        }
        i = b044C044C044C044C044C044C;
        switch ((i * (b044C044C044C044C044C044C + i)) % b044C044C044C044C044C044C)
        {
        default:
            b044C044C044C044C044C044C = 63;
            obj = rrrrrr/nnnlnn.getMethod(nuuuuu.b0417041704170417041704170417("\uFFEA\u03CE\u03CE\uFFB8\uFFBC\uFFBC\uFFBE\uFFB8\uFFBC\uFFBC\uFFBE\u03CE\u03CE\u03CE", '(', '\004'), new Class[0]);
            int j;
            int k;
            int l;
            int i1;
            try
            {
                obj = ((Method) (obj)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw ((InvocationTargetException) (obj)).getCause();
            }
            b044C044C044C044C044C044C = ((Integer)obj).intValue();
            // fall through

        case 0: // '\0'
            obj = rrrrrr/nnnlnn.getMethod(nuuuuu.b0417041704170417041704170417("\uFFE7\u03CB\u03CB\uFFB5\uFFB9\uFFB9\uFFBB\uFFB5\uFFB9\uFFB9\uFFBB\u03CB\u03CB\u03CB", ')', '\004'), new Class[0]);
            break;
        }
        try
        {
            obj = ((Method) (obj)).invoke(null, new Object[0]);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw ((InvocationTargetException) (obj)).getCause();
        }
        j = ((Integer)obj).intValue();
        k = b044C044C044C044C044C044C;
        obj = rrrrrr/nnnlnn.getMethod(nuuuuu.b0417041704170417041704170417("\uFF3A\u031E\u031E\uFF08\uFF0C\uFF0C\uFF0E\uFF08\uFF0C\uFF0C\uFF0E\u031E\u031E\u031E", '\224', '\003'), new Class[0]);
        try
        {
            obj = ((Method) (obj)).invoke(null, new Object[0]);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw ((InvocationTargetException) (obj)).getCause();
        }
        l = ((Integer)obj).intValue();
        i1 = b044C044C044C044C044C044C;
        obj = rrrrrr/nnnlnn.getMethod(nuuuuu.b0417041704170417041704170417("\227\305\301\301\303\u04B3\u04B3\u04B3\305\301\301\303\u04B3\u04B3", '\365', '\002'), new Class[0]);
        try
        {
            obj = ((Method) (obj)).invoke(null, new Object[0]);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw ((InvocationTargetException) (obj)).getCause();
        }
        if ((l * (k + j)) % i1 != ((Integer)obj).intValue())
        {
            obj = rrrrrr/nnnlnn.getMethod(nuuuuu.b0417041704170417041704170417("\u013D\u0521\u0521\u010B\u010F\u010F\u0111\u010B\u010F\u010F\u0111\u0521\u0521\u0521", 'I', '\006'), new Class[0]);
            try
            {
                obj = ((Method) (obj)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw ((InvocationTargetException) (obj)).getCause();
            }
            b044C044C044C044C044C044C = ((Integer)obj).intValue();
            b044C044C044C044C044C044C = 75;
        }
    }

    public void b042B042B042B042B042B042B(CbpError cbperror, ResponseCallback responsecallback)
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
        Object obj = rrrrrr/nnnlnn.getMethod(nuuuuu.b0417041704170417041704170417("\uFFC4\u03A8\u03A8\uFF92\uFF96\uFF96\uFF98\uFF92\uFF96\uFF96\uFF98\u03A8\u03A8\u03A8", '\236', '\0'), new Class[0]);
        int i;
        int j;
        int k;
        try
        {
            obj = ((Method) (obj)).invoke(null, new Object[0]);
        }
        // Misplaced declaration of an exception variable
        catch (CbpError cbperror)
        {
            throw cbperror.getCause();
        }
        i = ((Integer)obj).intValue();
        j = b044C044C044C044C044C044C;
        obj = rrrrrr/nnnlnn.getMethod(nuuuuu.b0417041704170417041704170417("\uFFFB\u03DF\u03DF\uFFC9\uFFCD\uFFCD\uFFCF\uFFC9\uFFCD\uFFCD\uFFCF\u03DF\u03DF\u03DF", '\367', '\220', '\001'), new Class[0]);
        try
        {
            obj = ((Method) (obj)).invoke(null, new Object[0]);
        }
        // Misplaced declaration of an exception variable
        catch (CbpError cbperror)
        {
            throw cbperror.getCause();
        }
        k = ((Integer)obj).intValue();
        obj = rrrrrr/nnnlnn.getMethod(nuuuuu.b0417041704170417041704170417("\223\u0477aeegaeegaeeg\u0477\u0477\u0477", '1', '\005'), new Class[0]);
        try
        {
            obj = ((Method) (obj)).invoke(null, new Object[0]);
        }
        // Misplaced declaration of an exception variable
        catch (CbpError cbperror)
        {
            throw cbperror.getCause();
        }
        if (((j + i) * k) % ((Integer)obj).intValue() != b044C044C044C044C044C044C)
        {
            b044C044C044C044C044C044C = 41;
            b044C044C044C044C044C044C = 49;
        }
        obj = com/visa/cbp/sdk/facade/provider/ResponseCallback.getMethod(nuuuuu.b0417041704170417041704170417("\374\373\363\366\357\350\377", '\232', '\002'), new Class[] {
            com/visa/cbp/sdk/facade/error/CbpError
        });
        try
        {
            ((Method) (obj)).invoke(responsecallback, new Object[] {
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
