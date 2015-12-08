// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rrrrrr;

import com.visa.cbp.external.ppv.UploadTxnsRequest;
import com.visa.cbp.sdk.facade.api.CommonRestAdapter;
import com.visa.cbp.sdk.facade.data.GenericResponse;
import com.visa.cbp.sdk.facade.provider.ResponseCallback;
import com.visa.cbp.sdk.facade.provider.UploadTransactionProvider;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import retrofit.Callback;
import retrofit.client.Header;
import uuuuuu.nuuuuu;

// Referenced classes of package rrrrrr:
//            plplll, llplll

public class plpppp
    implements UploadTransactionProvider
{

    public static int b041304130413041304130413 = 2;
    public static int b041304130413041304130413 = 0;
    public static int b041304130413041304130413 = 1;
    public static int b041304130413041304130413 = 10;

    public plpppp()
    {
    }

    public static int b0415041504150415041504150415()
    {
        return 2;
    }

    public static int b0415041504150415041504150415()
    {
        return 1;
    }

    public static int b0415041504150415041504150415()
    {
        return 81;
    }

    public void b0415041504150415041504150415(UploadTxnsRequest uploadtxnsrequest, ResponseCallback responsecallback)
    {
        Object obj = rrrrrr/plpppp.getMethod(nuuuuu.b0417041704170417041704170417("(z~y|z~y|z~y|\u047Cz~y|\u047C", 'J', '\002'), new Class[0]);
        int i;
        try
        {
            obj = ((Method) (obj)).invoke(this, new Object[0]);
        }
        // Misplaced declaration of an exception variable
        catch (UploadTxnsRequest uploadtxnsrequest)
        {
            throw uploadtxnsrequest.getCause();
        }
        obj = (CommonRestAdapter)obj;
        i = b041304130413041304130413;
        switch ((i * (b041304130413041304130413 + i)) % b041304130413041304130413)
        {
        default:
            Object obj1 = rrrrrr/plpppp.getMethod(nuuuuu.b0417041704170417041704170417("\u014E\u0501\u0501\u011C\u0120\u011D\u0121\u0501\u011C\u0120\u011D\u0121\u011C\u0120\u011D\u0121\u011C\u0120\u011D\u0121", 'v', '\001'), new Class[0]);
            try
            {
                obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (UploadTxnsRequest uploadtxnsrequest)
            {
                throw uploadtxnsrequest.getCause();
            }
            b041304130413041304130413 = ((Integer)obj1).intValue();
            b041304130413041304130413 = 85;
            // fall through

        case 0: // '\0'
            responsecallback = new plplll(this, responsecallback);
            obj1 = com/visa/cbp/sdk/facade/api/CommonRestAdapter.getMethod(nuuuuu.b0417041704170417041704170417("\311\314\320\323\335\330\350\316\335\322\317\335\337\310\325\323\322\317", '\274', '\002'), new Class[] {
                com/visa/cbp/external/ppv/UploadTxnsRequest, retrofit/Callback
            });
            break;
        }
        try
        {
            ((Method) (obj1)).invoke(obj, new Object[] {
                uploadtxnsrequest, responsecallback
            });
            return;
        }
        // Misplaced declaration of an exception variable
        catch (UploadTxnsRequest uploadtxnsrequest)
        {
            throw uploadtxnsrequest.getCause();
        }
    }

    public Map b041B041B041B041B041B041B(List list)
    {
        HashMap hashmap;
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
            hashmap = new HashMap();
        }
        // Misplaced declaration of an exception variable
        catch (List list)
        {
            throw list;
        }
        obj = java/util/List.getMethod(nuuuuu.b0417041704170417041704170417("\uFFF2\uFFFD\uFFEE\uFFFB\uFFEA\uFFFD\uFFF8\uFFFB", 'w', '\0'), new Class[0]);
        list = ((List) (((Method) (obj)).invoke(list, new Object[0])));
        list = (Iterator)list;
        i = b041304130413041304130413;
        j = b041304130413041304130413;
        k = b041304130413041304130413;
        l = b041304130413041304130413;
        i1 = b041304130413041304130413;
        if (((i + j) * k) % l == i1)
        {
            break MISSING_BLOCK_LABEL_129;
        }
        try
        {
            b041304130413041304130413 = 50;
        }
        // Misplaced declaration of an exception variable
        catch (List list)
        {
            throw list;
        }
        obj = rrrrrr/plpppp.getMethod(nuuuuu.b0417041704170417041704170417("\004\u03B7\u03B7\uFFD2\uFFD6\uFFD3\uFFD7\u03B7\uFFD2\uFFD6\uFFD3\uFFD7\uFFD2\uFFD6\uFFD3\uFFD7\uFFD2\uFFD6\uFFD3\uFFD7", '^', '\0'), new Class[0]);
        obj = ((Method) (obj)).invoke(null, new Object[0]);
        i = ((Integer)obj).intValue();
        b041304130413041304130413 = i;
_L2:
        switch (0)
        {
        case 1: // '\001'
            continue; /* Loop/switch isn't completed */

        default:
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
            // fall through

        case 0: // '\0'
            obj = java/util/Iterator.getMethod(nuuuuu.b0417041704170417041704170417("\003\uFFFC\016\uFFE9\000\023\017", 'V', '\273', '\002'), new Class[0]);
            break;
        }
        obj = ((Method) (obj)).invoke(list, new Object[0]);
        if (!((Boolean)obj).booleanValue())
        {
            break; /* Loop/switch isn't completed */
        }
        obj = java/util/Iterator.getMethod(nuuuuu.b0417041704170417041704170417("\uFFEB\uFFE2\uFFF5\uFFF1", '\242', '\037', '\001'), new Class[0]);
        obj = ((Method) (obj)).invoke(list, new Object[0]);
        obj = (Object)obj;
        obj = (Header)obj;
        if (((b041304130413041304130413 + b041304130413041304130413) * b041304130413041304130413) % b041304130413041304130413 != b041304130413041304130413)
        {
            b041304130413041304130413 = 43;
            obj1 = rrrrrr/plpppp.getMethod(nuuuuu.b0417041704170417041704170417("\uFEBE\u0271\u0271\uFE8C\uFE90\uFE8D\uFE91\u0271\uFE8C\uFE90\uFE8D\uFE91\uFE8C\uFE90\uFE8D\uFE91\uFE8C\uFE90\uFE8D\uFE91", '\214', '\004'), new Class[0]);
            try
            {
                obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (List list)
            {
                throw list.getCause();
            }
            b041304130413041304130413 = ((Integer)obj1).intValue();
        }
        obj1 = retrofit/client/Header.getMethod(nuuuuu.b0417041704170417041704170417("\256\254\273\225\250\264\254", '5', '|', '\001'), new Class[0]);
        obj1 = ((Method) (obj1)).invoke(obj, new Object[0]);
        obj1 = (String)obj1;
        method = retrofit/client/Header.getMethod(nuuuuu.b0417041704170417041704170417("\uFF81\uFF7F\uFF8E\uFF70\uFF7B\uFF86\uFF8F\uFF7F", '\005', '\341', '\0'), new Class[0]);
        obj = method.invoke(obj, new Object[0]);
        obj = (String)obj;
        method = java/util/Map.getMethod(nuuuuu.b0417041704170417041704170417("?DC", '\345', '\264', '\001'), new Class[] {
            java/lang/Object, java/lang/Object
        });
        obj = method.invoke(hashmap, new Object[] {
            obj1, obj
        });
        obj = (Object)obj;
        if (true) goto _L2; else goto _L1
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
_L1:
        return hashmap;
    }

    public CommonRestAdapter b043604360436043604360436()
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
        Object obj = rrrrrr/llplll.getMethod(nuuuuu.b0417041704170417041704170417("\uFFFA\u03DF\u03DF\uFFC8\uFFCC\uFFCC\uFFCF\u03DF\u03DF\uFFC8\uFFCC\uFFCC\uFFCF", 'h', '\0'), new Class[0]);
        Object obj1;
        int i;
        try
        {
            obj = ((Method) (obj)).invoke(null, new Object[0]);
        }
        catch (InvocationTargetException invocationtargetexception)
        {
            throw invocationtargetexception.getCause();
        }
        obj = (llplll)obj;
        i = b041304130413041304130413;
        obj1 = rrrrrr/plpppp.getMethod(nuuuuu.b0417041704170417041704170417("\u02C6\u0679\u0294\u0298\u0295\u0299\u0679\u0679\u0294\u0298\u0295\u0299\u0294\u0298\u0295\u0299\u0294\u0298\u0295\u0299", '\314', '\006'), new Class[0]);
        try
        {
            obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
        }
        catch (InvocationTargetException invocationtargetexception1)
        {
            throw invocationtargetexception1.getCause();
        }
        if (((((Integer)obj1).intValue() + i) * b041304130413041304130413) % b041304130413041304130413 != b041304130413041304130413)
        {
            int j = b041304130413041304130413;
            Object obj2;
            switch ((j * (b041304130413041304130413 + j)) % b041304130413041304130413)
            {
            default:
                b041304130413041304130413 = 7;
                b041304130413041304130413 = 1;
                // fall through

            case 0: // '\0'
                obj2 = rrrrrr/plpppp.getMethod(nuuuuu.b0417041704170417041704170417(",\u045B\u045B~z\177{\u045B~z\177{~z\177{~z\177{", 'N', '\002'), new Class[0]);
                break;
            }
            try
            {
                obj2 = ((Method) (obj2)).invoke(null, new Object[0]);
            }
            catch (InvocationTargetException invocationtargetexception2)
            {
                throw invocationtargetexception2.getCause();
            }
            b041304130413041304130413 = ((Integer)obj2).intValue();
            b041304130413041304130413 = 50;
        }
        return ((llplll) (obj)).b043604360436043604360436();
    }

    public GenericResponse b041B041B041B041B041B041B(int i, String s, Map map)
    {
        if (((b041304130413041304130413 + b041304130413041304130413) * b041304130413041304130413) % b041304130413041304130413 != b041304130413041304130413)
        {
            b041304130413041304130413 = 55;
            Object obj = rrrrrr/plpppp.getMethod(nuuuuu.b0417041704170417041704170417("\u02C0\u0673\u0673\u028E\u0292\u028F\u0293\u0673\u028E\u0292\u028F\u0293\u028E\u0292\u028F\u0293\u028E\u0292\u028F\u0293", '\312', '\006'), new Class[0]);
            try
            {
                obj = ((Method) (obj)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw s.getCause();
            }
            b041304130413041304130413 = ((Integer)obj).intValue();
        }
        try
        {
            s = new GenericResponse(i, s, map);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw s;
        }
        return s;
    }

    public void doRequest(Object obj, ResponseCallback responsecallback)
    {
        obj = (UploadTxnsRequest)obj;
        Method method = rrrrrr/plpppp.getMethod(nuuuuu.b0417041704170417041704170417("\216\\`]a\u0441\u0441\u0441\\`]a\\`]a\\`]a", ',', '\005'), new Class[] {
            com/visa/cbp/external/ppv/UploadTxnsRequest, com/visa/cbp/sdk/facade/provider/ResponseCallback
        });
        try
        {
            method.invoke(this, new Object[] {
                obj, responsecallback
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
