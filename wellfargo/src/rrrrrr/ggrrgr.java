// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rrrrrr;

import com.visa.cbp.external.aam.ReplenishAckRequest;
import com.visa.cbp.external.aam.ReplenishRequest;
import com.visa.cbp.sdk.facade.api.CommonRestAdapter;
import com.visa.cbp.sdk.facade.data.GenericResponse;
import com.visa.cbp.sdk.facade.error.CbpError;
import com.visa.cbp.sdk.facade.provider.ReplenishmentProvider;
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
//            lplplp, llplll, pppplp, plpplp

public class ggrrgr extends lplplp
    implements ReplenishmentProvider
{

    public static int b041A041A041A041A041A041A = 27;
    public static int b041A041A041A041A041A041A = 1;
    public static int b041A041A041A041A041A041A = 2;
    public static int b041A041A041A041A041A041A;

    public ggrrgr()
    {
        Object obj = rrrrrr/ggrrgr.getMethod(nuuuuu.b0417041704170417041704170417("\uFE72\u023B\u023B\u023B\u023B\uFE40\uFE44\uFE42\uFE52\u023B", '\370', '\003'), new Class[0]);
        int i;
        try
        {
            obj = ((Method) (obj)).invoke(null, new Object[0]);
        }
        catch (InvocationTargetException invocationtargetexception)
        {
            throw invocationtargetexception.getCause();
        }
        i = ((Integer)obj).intValue();
        switch ((i * (b041A041A041A041A041A041A + i)) % b041A041A041A041A041A041A)
        {
        default:
            Object obj1 = rrrrrr/ggrrgr.getMethod(nuuuuu.b0417041704170417041704170417("\uFF52\u031B\u031B\u031B\u031B\uFF20\uFF24\uFF22\uFF32\u031B", '\210', '\003'), new Class[0]);
            Object obj2;
            try
            {
                obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
            }
            catch (InvocationTargetException invocationtargetexception1)
            {
                throw invocationtargetexception1.getCause();
            }
            b041A041A041A041A041A041A = ((Integer)obj1).intValue();
            b041A041A041A041A041A041A = 47;
            break;

        case 0: // '\0'
            break;
        }
        if (((b041A041A041A041A041A041A + b041A041A041A041A041A041A) * b041A041A041A041A041A041A) % b041A041A041A041A041A041A != b041A041A041A041A041A041A)
        {
            obj1 = rrrrrr/ggrrgr.getMethod(nuuuuu.b0417041704170417041704170417("\uFF98\u0361\u0361\u0361\u0361\uFF66\uFF6A\uFF68\uFF78\u0361", '\312', '\0'), new Class[0]);
            try
            {
                obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj2)
            {
                throw ((InvocationTargetException) (obj2)).getCause();
            }
            b041A041A041A041A041A041A = ((Integer)obj1).intValue();
            b041A041A041A041A041A041A = 44;
        }
        try
        {
            super();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj2)
        {
            throw obj2;
        }
    }

    public static int b042B042B042B042B042B042B()
    {
        return 1;
    }

    public static int b042B042B042B042B042B042B()
    {
        return 0;
    }

    public static int b042B042B042B042B042B042B()
    {
        return 2;
    }

    private GenericResponse b042B042B042B042B042B042B(Response response)
    {
        HashMap hashmap;
        hashmap = new HashMap();
        int i = b041A041A041A041A041A041A;
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
        switch ((i * (b041A041A041A041A041A041A + i)) % b041A041A041A041A041A041A)
        {
        default:
            Object obj = rrrrrr/ggrrgr.getMethod(nuuuuu.b0417041704170417041704170417("F\u040F\u040F\u040F\u040F\024\030\026&\u040F", '\034', '\0'), new Class[0]);
            Object obj2;
            Object obj3;
            Method method;
            try
            {
                obj = ((Method) (obj)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (Response response)
            {
                throw response.getCause();
            }
            b041A041A041A041A041A041A = ((Integer)obj).intValue();
            b041A041A041A041A041A041A = 76;
            // fall through

        case 0: // '\0'
            obj = retrofit/client/Response.getMethod(nuuuuu.b0417041704170417041704170417("ln\177Cnjonyx", '\013', '\002'), new Class[0]);
            break;
        }
        try
        {
            obj = ((Method) (obj)).invoke(response, new Object[0]);
        }
        // Misplaced declaration of an exception variable
        catch (Response response)
        {
            throw response.getCause();
        }
        obj = (List)obj;
        obj2 = java/util/List.getMethod(nuuuuu.b0417041704170417041704170417("\u013F\u014A\u013B\u0148\u0137\u014A\u0145\u0148", '\215', 'I', '\003'), new Class[0]);
        try
        {
            obj = ((Method) (obj2)).invoke(obj, new Object[0]);
        }
        // Misplaced declaration of an exception variable
        catch (Response response)
        {
            throw response.getCause();
        }
        obj = (Iterator)obj;
_L3:
        obj2 = java/util/Iterator.getMethod(nuuuuu.b0417041704170417041704170417("\uFFC8\uFFC1\uFFD3\uFFAE\uFFC5\uFFD8\uFFD4", 'P', '\003'), new Class[0]);
        try
        {
            obj2 = ((Method) (obj2)).invoke(obj, new Object[0]);
        }
        // Misplaced declaration of an exception variable
        catch (Response response)
        {
            throw response.getCause();
        }
        if (!((Boolean)obj2).booleanValue()) goto _L2; else goto _L1
_L1:
        obj2 = java/util/Iterator.getMethod(nuuuuu.b0417041704170417041704170417("yp\203\177", '\013', '\005'), new Class[0]);
        try
        {
            obj2 = ((Method) (obj2)).invoke(obj, new Object[0]);
        }
        // Misplaced declaration of an exception variable
        catch (Response response)
        {
            throw response.getCause();
        }
        obj3 = (Header)(Object)obj2;
        obj2 = retrofit/client/Header.getMethod(nuuuuu.b0417041704170417041704170417("\260\262\243\231\266\272\262", '\327', '\002'), new Class[0]);
        try
        {
            obj2 = ((Method) (obj2)).invoke(obj3, new Object[0]);
        }
        // Misplaced declaration of an exception variable
        catch (Response response)
        {
            throw response.getCause();
        }
        obj2 = (String)obj2;
        method = retrofit/client/Header.getMethod(nuuuuu.b0417041704170417041704170417("\uFFC8\uFFC6\uFFD5\uFFB7\uFFC2\uFFCD\uFFD6\uFFC6", '5', '\004'), new Class[0]);
        try
        {
            obj3 = method.invoke(obj3, new Object[0]);
        }
        // Misplaced declaration of an exception variable
        catch (Response response)
        {
            throw response.getCause();
        }
        obj3 = (String)obj3;
        method = java/util/Map.getMethod(nuuuuu.b0417041704170417041704170417("|\201\200", '\210', '|', '\002'), new Class[] {
            java/lang/Object, java/lang/Object
        });
        try
        {
            obj2 = method.invoke(hashmap, new Object[] {
                obj2, obj3
            });
        }
        // Misplaced declaration of an exception variable
        catch (Response response)
        {
            throw response.getCause();
        }
        obj2 = (Object)obj2;
        if (((b041A041A041A041A041A041A + b041A041A041A041A041A041A) * b041A041A041A041A041A041A) % b041A041A041A041A041A041A != b041A041A041A041A041A041A)
        {
            obj2 = rrrrrr/ggrrgr.getMethod(nuuuuu.b0417041704170417041704170417("\uFFA5\u036E\u036E\u036E\u036E\uFF73\uFF77\uFF75\uFF85\u036E", '\355', '0', '\001'), new Class[0]);
            Object obj1;
            int j;
            try
            {
                obj2 = ((Method) (obj2)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (Response response)
            {
                throw response.getCause();
            }
            b041A041A041A041A041A041A = ((Integer)obj2).intValue();
            obj2 = rrrrrr/ggrrgr.getMethod(nuuuuu.b0417041704170417041704170417("\uFFE9\u03B2\u03B2\u03B2\u03B2\uFFB7\uFFBB\uFFB9\uFFC9\u03B2", '\030', '\221', '\002'), new Class[0]);
            try
            {
                obj2 = ((Method) (obj2)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (Response response)
            {
                throw response.getCause();
            }
            b041A041A041A041A041A041A = ((Integer)obj2).intValue();
        }
        if (true) goto _L3; else goto _L2
_L2:
        obj1 = retrofit/client/Response.getMethod(nuuuuu.b0417041704170417041704170417("HFU4UBUVT", '\037', '\0'), new Class[0]);
        try
        {
            obj1 = ((Method) (obj1)).invoke(response, new Object[0]);
        }
        // Misplaced declaration of an exception variable
        catch (Response response)
        {
            throw response.getCause();
        }
        j = ((Integer)obj1).intValue();
        obj1 = retrofit/client/Response.getMethod(nuuuuu.b0417041704170417041704170417("yw\206dws\205\201\200", '\006', '\006'), new Class[0]);
        try
        {
            response = ((Response) (((Method) (obj1)).invoke(response, new Object[0])));
        }
        // Misplaced declaration of an exception variable
        catch (Response response)
        {
            throw response.getCause();
        }
        return new GenericResponse(j, (String)response, hashmap);
    }

    public static GenericResponse b042B042B042B042B042B042B(ggrrgr ggrrgr1, Response response)
    {
        int i = b041A041A041A041A041A041A;
        switch ((i * (b041A041A041A041A041A041A + i)) % b041A041A041A041A041A041A)
        {
        default:
            Object obj = rrrrrr/ggrrgr.getMethod(nuuuuu.b0417041704170417041704170417("\uFF0E\u02D7\u02D7\u02D7\u02D7\uFEDC\uFEE0\uFEDE\uFEEE\u02D7", '\252', '\003'), new Class[0]);
            int j;
            int k;
            try
            {
                obj = ((Method) (obj)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (ggrrgr ggrrgr1)
            {
                throw ggrrgr1.getCause();
            }
            j = ((Integer)obj).intValue();
            k = b041A041A041A041A041A041A;
            switch ((k * (b041A041A041A041A041A041A + k)) % b041A041A041A041A041A041A)
            {
            default:
                b041A041A041A041A041A041A = 23;
                Object obj1 = rrrrrr/ggrrgr.getMethod(nuuuuu.b0417041704170417041704170417("\u0250\u0619\u0619\u0619\u0619\u021E\u0222\u0220\u0230\u0619", '\367', '\001'), new Class[0]);
                try
                {
                    obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
                }
                // Misplaced declaration of an exception variable
                catch (ggrrgr ggrrgr1)
                {
                    throw ggrrgr1.getCause();
                }
                b041A041A041A041A041A041A = ((Integer)obj1).intValue();
                // fall through

            case 0: // '\0'
                b041A041A041A041A041A041A = j;
                b041A041A041A041A041A041A = 59;
                break;
            }
            // fall through

        case 0: // '\0'
            obj1 = rrrrrr/ggrrgr.getDeclaredMethod(nuuuuu.b0417041704170417041704170417("\uFFFF\u03C8\uFFCD\uFFD1\uFFCF\uFFDF\uFFCD\uFFD1\uFFCF\uFFDF\u03C8\uFFCD\uFFD1\uFFCF\uFFDF\u03C8", 'c', '\0'), new Class[] {
                retrofit/client/Response
            });
            break;
        }
        ggrrgr1 = ((ggrrgr) (((Method) (obj1)).invoke(ggrrgr1, new Object[] {
            response
        })));
        return (GenericResponse)ggrrgr1;
        ggrrgr1;
        try
        {
            throw ggrrgr1.getCause();
        }
        // Misplaced declaration of an exception variable
        catch (ggrrgr ggrrgr1)
        {
            throw ggrrgr1;
        }
    }

    public static int b042B042B042B042B042B042B()
    {
        return 28;
    }

    public void b042B042B042B042B042B042B(ReplenishRequest replenishrequest, ResponseCallback responsecallback)
    {
        Object obj = rrrrrr/llplll.getMethod(nuuuuu.b0417041704170417041704170417("\233\u0480\u0480immp\u0480\u0480immp", '9', '\005'), new Class[0]);
        obj = ((Method) (obj)).invoke(null, new Object[0]);
        obj = (llplll)obj;
        int i;
        int k;
        int i1;
        try
        {
            obj = ((llplll) (obj)).b043604360436043604360436();
        }
        // Misplaced declaration of an exception variable
        catch (ReplenishRequest replenishrequest)
        {
            throw replenishrequest;
        }
        i = b041A041A041A041A041A041A;
        k = b041A041A041A041A041A041A;
        i1 = b041A041A041A041A041A041A;
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
        switch ((i * (k + i)) % i1)
        {
        default:
            Object obj1 = rrrrrr/ggrrgr.getMethod(nuuuuu.b0417041704170417041704170417("`\u0429\u0429\u0429\u0429.20@\u0429", '\362', '\360', '\001'), new Class[0]);
            int j;
            int l;
            int j1;
            int k1;
            try
            {
                obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (ReplenishRequest replenishrequest)
            {
                throw replenishrequest.getCause();
            }
            b041A041A041A041A041A041A = ((Integer)obj1).intValue();
            j = b041A041A041A041A041A041A;
            l = b041A041A041A041A041A041A;
            j1 = b041A041A041A041A041A041A;
            k1 = b041A041A041A041A041A041A;
            obj1 = rrrrrr/ggrrgr.getMethod(nuuuuu.b0417041704170417041704170417("\u01EC\u01BA\u01BE\u01BC\u01CC\u01BA\u01BE\u01BC\u01CC\u05B5\u05B5\u01BA\u01BE\u01BC\u01CC\u05B5", '\305', '\001'), new Class[0]);
            try
            {
                obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (ReplenishRequest replenishrequest)
            {
                throw replenishrequest.getCause();
            }
            if (((j + l) * j1) % k1 != ((Integer)obj1).intValue())
            {
                b041A041A041A041A041A041A = 85;
                b041A041A041A041A041A041A = 90;
            }
            obj1 = rrrrrr/ggrrgr.getMethod(nuuuuu.b0417041704170417041704170417("\u0290\u0659\u0659\u0659\u0659\u025E\u0262\u0260\u0270\u0659", '\272', '\006'), new Class[0]);
            try
            {
                obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (ReplenishRequest replenishrequest)
            {
                throw replenishrequest.getCause();
            }
            b041A041A041A041A041A041A = ((Integer)obj1).intValue();
            break;

        case 0: // '\0'
            break;
        }
        responsecallback = new pppplp(this, responsecallback);
        obj1 = com/visa/cbp/sdk/facade/api/CommonRestAdapter.getMethod(nuuuuu.b0417041704170417041704170417("\223\206\221\215\206\217\212\224\211", ')', '\b', '\002'), new Class[] {
            com/visa/cbp/external/aam/ReplenishRequest, retrofit/Callback
        });
        ((Method) (obj1)).invoke(obj, new Object[] {
            replenishrequest, responsecallback
        });
        return;
        replenishrequest;
        throw replenishrequest.getCause();
        replenishrequest;
        throw replenishrequest.getCause();
    }

    public void b042B042B042B042B042B042B(Object obj, ResponseCallback responsecallback)
    {
        obj = (ReplenishRequest)obj;
        if (((b041A041A041A041A041A041A + b041A041A041A041A041A041A) * b041A041A041A041A041A041A) % b041A041A041A041A041A041A != b041A041A041A041A041A041A)
        {
            b041A041A041A041A041A041A = 86;
            b041A041A041A041A041A041A = 3;
        }
        Method method = rrrrrr/ggrrgr.getMethod(nuuuuu.b0417041704170417041704170417("\u01CB\u0199\u019D\u019B\u01AB\u0594\u0594\u0594\u0199\u019D\u019B\u01AB\u0594", '\234', '\315', '\003'), new Class[] {
            com/visa/cbp/external/aam/ReplenishRequest, com/visa/cbp/sdk/facade/provider/ResponseCallback
        });
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
    }

    public void b042B042B042B042B042B042B(CbpError cbperror, ResponseCallback responsecallback)
    {
        Method method = com/visa/cbp/sdk/facade/provider/ResponseCallback.getMethod(nuuuuu.b0417041704170417041704170417("\255\250\260\263\274\271\254", 'G', '\005'), new Class[] {
            com/visa/cbp/sdk/facade/error/CbpError
        });
        try
        {
            method.invoke(responsecallback, new Object[] {
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
        throw cbperror.getCause();
    }

    public void doAcknowledge(ReplenishAckRequest replenishackrequest, ResponseCallback responsecallback)
    {
        Object obj = rrrrrr/llplll.getMethod(nuuuuu.b0417041704170417041704170417("\266\u049B\u049B\204\210\210\213\u049B\u049B\204\210\210\213", 'G', '\233', '\001'), new Class[0]);
        int i;
        try
        {
            obj = ((Method) (obj)).invoke(null, new Object[0]);
        }
        // Misplaced declaration of an exception variable
        catch (ReplenishAckRequest replenishackrequest)
        {
            throw replenishackrequest.getCause();
        }
        obj = ((llplll)obj).b043604360436043604360436();
        i = b041A041A041A041A041A041A;
        switch ((i * (b041A041A041A041A041A041A + i)) % b041A041A041A041A041A041A)
        {
        default:
            b041A041A041A041A041A041A = 43;
            b041A041A041A041A041A041A = 41;
            break;

        case 0: // '\0'
            break;
        }
label0:
        do
        {
            int j = b041A041A041A041A041A041A;
            Object obj1 = rrrrrr/ggrrgr.getMethod(nuuuuu.b0417041704170417041704170417("\uFF30\uFEFE\uFF02\uFF00\uFF10\uFEFE\uFF02\uFF00\uFF10\uFEFE\uFF02\uFF00\uFF10\u02F9\uFEFE\uFF02\uFF00\uFF10\u02F9", '\257', '\203', '\0'), new Class[0]);
            try
            {
                obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (ReplenishAckRequest replenishackrequest)
            {
                throw replenishackrequest.getCause();
            }
            switch (((((Integer)obj1).intValue() + j) * j) % b041A041A041A041A041A041A)
            {
            default:
                b041A041A041A041A041A041A = 93;
                Object obj2 = rrrrrr/ggrrgr.getMethod(nuuuuu.b0417041704170417041704170417("\224\u045D\u045D\u045D\u045Dbfdt\u045D", '\314', '\376', '\001'), new Class[0]);
                try
                {
                    obj2 = ((Method) (obj2)).invoke(null, new Object[0]);
                }
                // Misplaced declaration of an exception variable
                catch (ReplenishAckRequest replenishackrequest)
                {
                    throw replenishackrequest.getCause();
                }
                b041A041A041A041A041A041A = ((Integer)obj2).intValue();
                // fall through

            case 0: // '\0'
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
                break;
            }
        } while (true);
        responsecallback = new plpplp(this, responsecallback);
        obj2 = com/visa/cbp/sdk/facade/api/CommonRestAdapter.getMethod(nuuuuu.b0417041704170417041704170417("\uFFCA\uFFCC\uFFD4\uFFD7\uFFD8\uFFE0\uFFD5\uFFCE\uFFCD\uFFD0\uFFCE", ' ', 'w', '\0'), new Class[] {
            com/visa/cbp/external/aam/ReplenishAckRequest, retrofit/Callback
        });
        try
        {
            ((Method) (obj2)).invoke(obj, new Object[] {
                replenishackrequest, responsecallback
            });
        }
        // Misplaced declaration of an exception variable
        catch (ReplenishAckRequest replenishackrequest)
        {
            throw replenishackrequest.getCause();
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
    }
}
