// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rrrrrr;

import com.visa.cbp.external.enp.EnrollAndProvisionRequest;
import com.visa.cbp.sdk.facade.api.CommonRestAdapter;
import com.visa.cbp.sdk.facade.data.EnrollProvisionRequestWrapper;
import com.visa.cbp.sdk.facade.data.GenericResponse;
import com.visa.cbp.sdk.facade.error.CbpError;
import com.visa.cbp.sdk.facade.provider.ResponseCallback;
import com.visa.cbp.sdk.facade.provider.TokenProvider;
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
//            lplplp, plplpl, llplll, grrrrr, 
//            ppplpp

public class lpplpl extends lplplp
    implements TokenProvider
{

    public static int b044B044B044B044B044B044B = 1;
    public static int b044B044B044B044B044B044B = 73;
    public static int b044B044B044B044B044B044B = 0;
    public static int b044B044B044B044B044B044B = 2;

    public lpplpl()
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
        super();
    }

    public static int b041B041B041B041B041B041B()
    {
        return 0;
    }

    public static int b041B041B041B041B041B041B()
    {
        return 1;
    }

    public static int b041B041B041B041B041B041B()
    {
        return 58;
    }

    public void b041B041B041B041B041B041B(EnrollProvisionRequestWrapper enrollprovisionrequestwrapper, ResponseCallback responsecallback)
    {
        Object obj = rrrrrr/lpplpl.getMethod(nuuuuu.b0417041704170417041704170417("\t[_X][_X][_X]\u045D[_X]\u045D", 'k', '\002'), new Class[0]);
        obj = ((Method) (obj)).invoke(this, new Object[0]);
        Method method;
        obj = (CommonRestAdapter)obj;
        method = com/visa/cbp/sdk/facade/data/EnrollProvisionRequestWrapper.getMethod(nuuuuu.b0417041704170417041704170417("[Yh9bfc``5bXDfcj]g]cbFYeiYgh", '\004', '\004'), new Class[0]);
        enrollprovisionrequestwrapper = ((EnrollProvisionRequestWrapper) (method.invoke(enrollprovisionrequestwrapper, new Object[0])));
        enrollprovisionrequestwrapper = (EnrollAndProvisionRequest)enrollprovisionrequestwrapper;
        Method method1;
        try
        {
            responsecallback = new plplpl(this, responsecallback);
        }
        // Misplaced declaration of an exception variable
        catch (EnrollProvisionRequestWrapper enrollprovisionrequestwrapper)
        {
            throw enrollprovisionrequestwrapper;
        }
        method1 = com/visa/cbp/sdk/facade/api/CommonRestAdapter.getMethod(nuuuuu.b0417041704170417041704170417("\374\u0105\u0109\u0106\u0103\u0103\347\u0109\u0106\u010D\u0100\u010A\u0100\u0106\u0105", '\032', '}', '\003'), new Class[] {
            com/visa/cbp/external/enp/EnrollAndProvisionRequest, retrofit/Callback
        });
        method1.invoke(obj, new Object[] {
            enrollprovisionrequestwrapper, responsecallback
        });
        return;
        enrollprovisionrequestwrapper;
        throw enrollprovisionrequestwrapper.getCause();
        enrollprovisionrequestwrapper;
        throw enrollprovisionrequestwrapper.getCause();
        enrollprovisionrequestwrapper;
        throw enrollprovisionrequestwrapper.getCause();
    }

    public Map b041B041B041B041B041B041B(List list)
    {
        HashMap hashmap;
        hashmap = new HashMap();
        Object obj = java/util/List.getMethod(nuuuuu.b0417041704170417041704170417("\u0309\u0314\u0305\u0312\u0301\u0314\u030F\u0312", '\340', '\006'), new Class[0]);
        Exception exception;
        Object obj3;
        Method method;
        int i;
        int j;
        int k;
        try
        {
            list = ((List) (((Method) (obj)).invoke(list, new Object[0])));
        }
        // Misplaced declaration of an exception variable
        catch (List list)
        {
            throw list.getCause();
        }
        list = (Iterator)list;
        i = 2;
_L5:
        obj = java/util/Iterator.getMethod(nuuuuu.b0417041704170417041704170417(">7I$;NJ", '*', '\0'), new Class[0]);
        try
        {
            obj = ((Method) (obj)).invoke(list, new Object[0]);
        }
        // Misplaced declaration of an exception variable
        catch (List list)
        {
            throw list.getCause();
        }
        if (!((Boolean)obj).booleanValue())
        {
            break MISSING_BLOCK_LABEL_564;
        }
        obj = java/util/Iterator.getMethod(nuuuuu.b0417041704170417041704170417("\243\232\255\251", '>', '\t', '\002'), new Class[0]);
        try
        {
            obj = ((Method) (obj)).invoke(list, new Object[0]);
        }
        // Misplaced declaration of an exception variable
        catch (List list)
        {
            throw list.getCause();
        }
        obj3 = (Header)(Object)obj;
        obj = retrofit/client/Header.getMethod(nuuuuu.b0417041704170417041704170417("ikz@ock", '\016', '\002'), new Class[0]);
        try
        {
            obj = ((Method) (obj)).invoke(obj3, new Object[0]);
        }
        // Misplaced declaration of an exception variable
        catch (List list)
        {
            throw list.getCause();
        }
        obj = (String)obj;
        method = retrofit/client/Header.getMethod(nuuuuu.b0417041704170417041704170417("\205\203\222t\177\212\223\203", '|', '\232', '\001'), new Class[0]);
        try
        {
            obj3 = method.invoke(obj3, new Object[0]);
        }
        // Misplaced declaration of an exception variable
        catch (List list)
        {
            throw list.getCause();
        }
        obj3 = (String)obj3;
        method = java/util/Map.getMethod(nuuuuu.b0417041704170417041704170417("\u0212\u0217\u0216", '\321', '\001'), new Class[] {
            java/lang/Object, java/lang/Object
        });
        try
        {
            obj = method.invoke(hashmap, new Object[] {
                obj, obj3
            });
        }
        // Misplaced declaration of an exception variable
        catch (List list)
        {
            throw list.getCause();
        }
        obj = (Object)obj;
_L1:
        obj = rrrrrr/lpplpl.getMethod(nuuuuu.b0417041704170417041704170417("\uFDB6\u016F\u016F\u016F\uFD84\uFD88\uFD85\uFD96\u016F\u016F", '\344', '\004'), new Class[0]);
        try
        {
            obj = ((Method) (obj)).invoke(null, new Object[0]);
        }
        // Misplaced declaration of an exception variable
        catch (List list)
        {
            throw list.getCause();
        }
        j = ((Integer)obj).intValue();
        k = b044B044B044B044B044B044B;
        obj = rrrrrr/lpplpl.getMethod(nuuuuu.b0417041704170417041704170417("\uFFB8\u0371\u0371\u0371\uFF86\uFF8A\uFF87\uFF98\u0371\u0371", '\252', '\0'), new Class[0]);
        try
        {
            obj = ((Method) (obj)).invoke(null, new Object[0]);
        }
        // Misplaced declaration of an exception variable
        catch (List list)
        {
            throw list.getCause();
        }
        if ((((Integer)obj).intValue() * (k + j)) % b044B044B044B044B044B044B != b044B044B044B044B044B044B)
        {
            obj = rrrrrr/lpplpl.getMethod(nuuuuu.b0417041704170417041704170417("\uFF33\u02EC\u02EC\u02EC\uFF01\uFF05\uFF02\uFF13\u02EC\u02EC", 'S', '\334', '\0'), new Class[0]);
            Object obj1;
            Object obj2;
            try
            {
                obj = ((Method) (obj)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (List list)
            {
                throw list.getCause();
            }
            b044B044B044B044B044B044B = ((Integer)obj).intValue();
            b044B044B044B044B044B044B = 21;
        }
        j = i / 0;
        i = j;
          goto _L1
        exception;
        b044B044B044B044B044B044B = 79;
_L3:
        exception = java/lang/String.getMethod(nuuuuu.b0417041704170417041704170417("\uFF91\uFF8A\uFF93\uFF8C\uFF99\uFF8D", 'I', '\004'), new Class[0]);
        exception = ((Exception) (exception.invoke(null, new Object[0])));
        ((Integer)exception).intValue();
        if (true) goto _L3; else goto _L2
_L2:
        obj2;
        try
        {
            throw ((InvocationTargetException) (obj2)).getCause();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            obj2 = rrrrrr/lpplpl.getMethod(nuuuuu.b0417041704170417041704170417("\232\u0453\u0453\u0453hliz\u0453\u0453", 'I', '\201', '\001'), new Class[0]);
            try
            {
                obj2 = ((Method) (obj2)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (List list)
            {
                throw list.getCause();
            }
            b044B044B044B044B044B044B = ((Integer)obj2).intValue();
        }
        continue; /* Loop/switch isn't completed */
        return hashmap;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public CommonRestAdapter b043604360436043604360436()
    {
        Object obj = rrrrrr/llplll.getMethod(nuuuuu.b0417041704170417041704170417("\uFFC8\u03AD\u03AD\uFF96\uFF9A\uFF9A\uFF9D\u03AD\u03AD\uFF96\uFF9A\uFF9A\uFF9D", 'M', '\003'), new Class[0]);
        int i;
        try
        {
            obj = ((Method) (obj)).invoke(null, new Object[0]);
        }
        catch (InvocationTargetException invocationtargetexception)
        {
            throw invocationtargetexception.getCause();
        }
        obj = ((llplll)obj).b043604360436043604360436();
        i = b044B044B044B044B044B044B;
        switch ((i * (b044B044B044B044B044B044B + i)) % b044B044B044B044B044B044B)
        {
        default:
            b044B044B044B044B044B044B = 63;
            Object obj1 = rrrrrr/lpplpl.getMethod(nuuuuu.b0417041704170417041704170417("\uFF6D\u0326\u0326\u0326\uFF3B\uFF3F\uFF3C\uFF4D\u0326\u0326", '\365', '\0'), new Class[0]);
            try
            {
                obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
            }
            catch (InvocationTargetException invocationtargetexception1)
            {
                throw invocationtargetexception1.getCause();
            }
            b044B044B044B044B044B044B = ((Integer)obj1).intValue();
            // fall through

        case 0: // '\0'
            return ((CommonRestAdapter) (obj));
        }
    }

    public GenericResponse b041B041B041B041B041B041B(int i, String s, Map map)
    {
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

    public void b042B042B042B042B042B042B(Object obj, ResponseCallback responsecallback)
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
        obj = (EnrollProvisionRequestWrapper)obj;
        int i = b044B044B044B044B044B044B;
        int k = b044B044B044B044B044B044B;
        int l = b044B044B044B044B044B044B;
        int i1 = b044B044B044B044B044B044B;
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
        if (((i + k) * l) % i1 != b044B044B044B044B044B044B)
        {
            Object obj1 = rrrrrr/lpplpl.getMethod(nuuuuu.b0417041704170417041704170417("\uFFEE\u03A7\u03A7\u03A7\uFFBC\uFFC0\uFFBD\uFFCE\u03A7\u03A7", '\245', '1', '\001'), new Class[0]);
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
            j = ((Integer)obj1).intValue();
            switch ((j * (b044B044B044B044B044B044B + j)) % b044B044B044B044B044B044B)
            {
            default:
                b044B044B044B044B044B044B = 14;
                b044B044B044B044B044B044B = 43;
                // fall through

            case 0: // '\0'
                b044B044B044B044B044B044B = 68;
                break;
            }
            obj1 = rrrrrr/lpplpl.getMethod(nuuuuu.b0417041704170417041704170417("\u015B\u0514\u0514\u0514\u0129\u012D\u012A\u013B\u0514\u0514", '\003', '\366', '\003'), new Class[0]);
            try
            {
                obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw ((InvocationTargetException) (obj)).getCause();
            }
            b044B044B044B044B044B044B = ((Integer)obj1).intValue();
        }
        obj1 = rrrrrr/lpplpl.getMethod(nuuuuu.b0417041704170417041704170417("\uFF7E\uFF4C\uFF50\uFF4D\uFF5E\uFF4C\uFF50\uFF4D\uFF5E\uFF4C\uFF50\uFF4D\uFF5E\u0337\u0337\u0337", 'L', '\004'), new Class[] {
            com/visa/cbp/sdk/facade/data/EnrollProvisionRequestWrapper, com/visa/cbp/sdk/facade/provider/ResponseCallback
        });
        try
        {
            ((Method) (obj1)).invoke(this, new Object[] {
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

    public void b042B042B042B042B042B042B(CbpError cbperror, ResponseCallback responsecallback)
    {
        Object obj;
        int i;
        try
        {
            obj = b044304430443044304430443;
        }
        // Misplaced declaration of an exception variable
        catch (CbpError cbperror)
        {
            throw cbperror;
        }
        i = b044B044B044B044B044B044B;
        switch ((i * (b044B044B044B044B044B044B + i)) % b044B044B044B044B044B044B)
        {
        default:
            Object obj1 = rrrrrr/lpplpl.getMethod(nuuuuu.b0417041704170417041704170417("\uFDBC\u0175\u0175\u0175\uFD8A\uFD8E\uFD8B\uFD9C\u0175\u0175", '\342', '\004'), new Class[0]);
            try
            {
                obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (CbpError cbperror)
            {
                throw cbperror.getCause();
            }
            b044B044B044B044B044B044B = ((Integer)obj1).intValue();
            obj1 = rrrrrr/lpplpl.getMethod(nuuuuu.b0417041704170417041704170417("\001\u03BA\u03BA\u03BA\uFFCF\uFFD3\uFFD0\uFFE1\u03BA\u03BA", '\'', '\210', '\002'), new Class[0]);
            try
            {
                obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (CbpError cbperror)
            {
                throw cbperror.getCause();
            }
            b044B044B044B044B044B044B = ((Integer)obj1).intValue();
            if (((b044B044B044B044B044B044B + b044B044B044B044B044B044B) * b044B044B044B044B044B044B) % b044B044B044B044B044B044B != b044B044B044B044B044B044B)
            {
                Object obj2 = rrrrrr/lpplpl.getMethod(nuuuuu.b0417041704170417041704170417("\u02CC\u0685\u0685\u0685\u029A\u029E\u029B\u02AC\u0685\u0685", '\316', '\006'), new Class[0]);
                Method method;
                try
                {
                    obj2 = ((Method) (obj2)).invoke(null, new Object[0]);
                }
                // Misplaced declaration of an exception variable
                catch (CbpError cbperror)
                {
                    throw cbperror.getCause();
                }
                b044B044B044B044B044B044B = ((Integer)obj2).intValue();
                b044B044B044B044B044B044B = 5;
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
            // fall through

        case 0: // '\0'
            try
            {
                obj2 = grrrrr.b044C044C044C044C044C044C("\u0169\u0188\u0162\u017B\u0188\u017E\u0186\u017F\u015F\u018C\u018C\u0189\u018C", '\215', '\001');
            }
            // Misplaced declaration of an exception variable
            catch (CbpError cbperror)
            {
                throw cbperror;
            }
            method = rrrrrr/ppplpp.getMethod(nuuuuu.b0417041704170417041704170417("\u01AD\u0560\u0560\u017B\u017F\u017C\u0180\u017B\u017F\u017C\u0180\u017B\u017F\u017C\u0180\u0560\u017B\u017F\u017C\u0180", 'M', '\376', '\003'), new Class[] {
                java/lang/String, java/lang/String
            });
            break;
        }
        method.invoke(null, new Object[] {
            obj, obj2
        });
        obj = com/visa/cbp/sdk/facade/provider/ResponseCallback.getMethod(nuuuuu.b0417041704170417041704170417("\u0285\u0280\u0288\u028B\u0294\u0291\u0284", '\265', '\006'), new Class[] {
            com/visa/cbp/sdk/facade/error/CbpError
        });
        ((Method) (obj)).invoke(responsecallback, new Object[] {
            cbperror
        });
        return;
        cbperror;
        throw cbperror.getCause();
        cbperror;
        throw cbperror.getCause();
    }
}
