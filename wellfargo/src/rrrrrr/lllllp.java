// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rrrrrr;

import com.squareup.okhttp.OkHttpClient;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.GeneralSecurityException;
import java.security.SecureRandom;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import retrofit.RequestInterceptor;
import retrofit.RestAdapter;
import retrofit.client.Client;
import retrofit.client.OkClient;
import uuuuuu.nuuuuu;

// Referenced classes of package rrrrrr:
//            ggrgrr, rrgggr, grrrrr, ppplpp

public abstract class lllllp extends ggrgrr
{

    public static int b043D043D043D043D043D043D = 90;
    public static int b043D043D043D043D043D043D = 1;
    public static int b043D043D043D043D043D043D = 2;
    public static int b043D043D043D043D043D043D;

    public lllllp()
    {
        try
        {
            super();
            return;
        }
        catch (Exception exception)
        {
            throw exception;
        }
    }

    public static int b0421042104210421042104210421()
    {
        return 1;
    }

    public static int b0421042104210421042104210421()
    {
        return 34;
    }

    public static int b0421042104210421042104210421()
    {
        return 0;
    }

    private static SSLSocketFactory b0421042104210421042104210421()
    {
        Object obj;
        int i;
        int j;
        int k;
        int l;
        int i1;
        try
        {
            i = b043D043D043D043D043D043D;
            j = b043D043D043D043D043D043D;
            k = b043D043D043D043D043D043D;
            l = b043D043D043D043D043D043D;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj2)
        {
            throw obj2;
        }
        try
        {
            i1 = b043D043D043D043D043D043D;
        }
        catch (Exception exception)
        {
            throw exception;
        }
        if (((i + j) * k) % l == i1)
        {
            break MISSING_BLOCK_LABEL_205;
        }
        i = b043D043D043D043D043D043D;
        obj = rrrrrr/lllllp.getMethod(nuuuuu.b0417041704170417041704170417("\uFE7D\uFE4B\uFE4F\uFE4D\uFE4C\uFE4B\uFE4F\uFE4D\uFE4C\uFE4B\uFE4F\uFE4D\uFE4C\u023C\uFE4B\uFE4F\uFE4D\uFE4C\u023C\u023C", '\352', '\373', '\0'), new Class[0]);
        try
        {
            obj = ((Method) (obj)).invoke(null, new Object[0]);
        }
        catch (InvocationTargetException invocationtargetexception)
        {
            throw invocationtargetexception.getCause();
        }
        j = ((Integer)obj).intValue();
        obj = rrrrrr/lllllp.getMethod(nuuuuu.b0417041704170417041704170417("[\u0418\u0418\u0418\t\r\013\b\t\r\013\b\u0418\u0418", '9', '\002'), new Class[0]);
        try
        {
            obj = ((Method) (obj)).invoke(null, new Object[0]);
        }
        catch (InvocationTargetException invocationtargetexception1)
        {
            throw invocationtargetexception1.getCause();
        }
        switch ((i * (j + i)) % ((Integer)obj).intValue())
        {
        default:
            b043D043D043D043D043D043D = 34;
            Object obj1 = rrrrrr/lllllp.getMethod(nuuuuu.b0417041704170417041704170417("\uFFF7\uFFC5\uFFC9\uFFC7\uFFC6\u03B6\uFFC5\uFFC9\uFFC7\uFFC6\u03B6\uFFC5\uFFC9\uFFC7\uFFC6\u03B6\u03B6", '\376', '\223', '\001'), new Class[0]);
            TrustManager atrustmanager[];
            Object obj2;
            Object obj3;
            Object obj4;
            Method method;
            try
            {
                obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
            }
            catch (InvocationTargetException invocationtargetexception2)
            {
                throw invocationtargetexception2.getCause();
            }
            b043D043D043D043D043D043D = ((Integer)obj1).intValue();
            break;

        case 0: // '\0'
            break;
        }
        b043D043D043D043D043D043D = 43;
        b043D043D043D043D043D043D = 24;
        obj1 = new rrgggr();
        obj3 = grrrrr.b044C044C044C044C044C044C("\uFF0C\uFF0C\uFF05", '\317', 'x', '\0');
        obj4 = javax/net/ssl/SSLContext.getMethod(nuuuuu.b0417041704170417041704170417("\uFF74\uFF72\uFF81\uFF56\uFF7B\uFF80\uFF81\uFF6E\uFF7B\uFF70\uFF72", '\357', '\004', '\0'), new Class[] {
            java/lang/String
        });
        obj3 = ((Method) (obj4)).invoke(null, new Object[] {
            obj3
        });
        obj3 = (SSLContext)obj3;
        obj4 = new SecureRandom();
        method = javax/net/ssl/SSLContext.getMethod(nuuuuu.b0417041704170417041704170417("\"'\"-", '\273', 't', '\001'), new Class[] {
            [Ljavax/net/ssl/KeyManager;, [Ljavax/net/ssl/TrustManager;, java/security/SecureRandom
        });
        atrustmanager = (new TrustManager[] {
            obj1
        });
        method.invoke(obj3, new Object[] {
            null, atrustmanager, obj4
        });
        atrustmanager = javax/net/ssl/SSLContext.getMethod(nuuuuu.b0417041704170417041704170417("\u015D\u015B\u016A\u0149\u0165\u0159\u0161\u015B\u016A\u013C\u0157\u0159\u016A\u0165\u0168\u016F", '\237', 'W', '\003'), new Class[0]);
        atrustmanager = ((TrustManager []) (atrustmanager.invoke(obj3, new Object[0])));
        return (SSLSocketFactory)atrustmanager;
        obj2;
        throw obj2;
        obj2;
        throw obj2;
        obj2;
        throw ((InvocationTargetException) (obj2)).getCause();
        obj2;
        throw new IllegalStateException(((GeneralSecurityException) (obj2)).getMessage());
        obj2;
        throw ((InvocationTargetException) (obj2)).getCause();
        obj2;
        throw ((InvocationTargetException) (obj2)).getCause();
    }

    public static int b0421042104210421042104210421()
    {
        return 2;
    }

    public RestAdapter b043604360436043604360436(String s, RequestInterceptor requestinterceptor)
    {
        Object obj = new OkHttpClient();
        Object obj1 = grrrrr.b044C044C044C044C044C044C("\uFEE3\uFEF6\uFF04\uFF05\uFED2\uFEF5\uFEF2\uFF01\uFF05\uFEF6\uFF03\uFEDE\uFEF2\uFEFF\uFEF2\uFEF8\uFEF6\uFF03\uFEBF\uFEDF\uFF00\uFEE4\uFEE4\uFEDD\uFED4\uFEF9\uFEF6\uFEF4\uFEFC", '\223', '\334', '\0');
        Object obj2 = grrrrr.b044C044C044C044C044C044C("\uFFBF\uFFEE\uFFE1\uFFDD\uFFF0\uFFE5\uFFEA\uFFE3\uFF9C\uFFEE\uFFE1\uFFEF\uFFF0\uFF9C\uFFDD\uFFE0\uFFDD\uFFEC\uFFF0\uFFE1\uFFEE\uFF9C\uFFF0\uFFE4\uFFDD\uFFF0\uFF9C\uFFE5\uFFE3\uFFEA\uFFEB\uFFEE\uFFE1\uFFEF\uFF9C\uFFCF\uFFCF\uFFC8\uFF9C\uFFBF\uFFE1\uFFEE\uFFF0\uFFE5\uFFE2\uFFE5\uFFDF\uFFDD\uFFF0\uFFE1\uFF9C\uFFBD\uFFF1\uFFF0\uFFE4\uFFEB\uFFEE\uFFE5\uFFF0\uFFF5\uFF9C\uFFDF\uFFE4\uFFE1\uFFDF\uFFE7\uFFEF\uFF9C\uFFA4\uFFD1\uFFCA\uFFCF\uFFBD\uFFC2\uFFC1\uFFA5", ',', '\004');
        Method method = rrrrrr/ppplpp.getMethod(nuuuuu.b0417041704170417041704170417("\210\u043B\u043BVZW[VZW[VZW[\u043BVZW[", '&', '\005'), new Class[] {
            java/lang/String, java/lang/String
        });
        try
        {
            method.invoke(null, new Object[] {
                obj1, obj2
            });
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw s.getCause();
        }
        obj1 = rrrrrr/lllllp.getDeclaredMethod(nuuuuu.b0417041704170417041704170417("\u01E8\u05A7\u01B6\u01BA\u01B8\u01B7\u01B6\u01BA\u01B8\u01B7\u05A7\u01B6\u01BA\u01B8\u01B7\u05A7\u05A7", '\303', '\001'), new Class[0]);
        try
        {
            obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw s.getCause();
        }
        obj1 = (SSLSocketFactory)obj1;
        obj2 = com/squareup/okhttp/OkHttpClient.getMethod(nuuuuu.b0417041704170417041704170417("\334\316\335\274\334\325\274\330\314\324\316\335\257\312\314\335\330\333\342", 'i', '\005'), new Class[] {
            javax/net/ssl/SSLSocketFactory
        });
        try
        {
            obj1 = ((Method) (obj2)).invoke(obj, new Object[] {
                obj1
            });
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw s.getCause();
        }
        obj1 = (OkHttpClient)obj1;
        obj1 = new retrofit.RestAdapter.Builder();
        if (requestinterceptor != null)
        {
            int i = b043D043D043D043D043D043D;
            switch ((i * (b043D043D043D043D043D043D + i)) % b043D043D043D043D043D043D)
            {
            default:
                Object obj3 = rrrrrr/lllllp.getMethod(nuuuuu.b0417041704170417041704170417("\uFDF2\uFDC0\uFDC4\uFDC2\uFDC1\u01B1\uFDC0\uFDC4\uFDC2\uFDC1\u01B1\uFDC0\uFDC4\uFDC2\uFDC1\u01B1\u01B1", '\320', '\004'), new Class[0]);
                int j;
                int k;
                int l;
                int i1;
                try
                {
                    obj3 = ((Method) (obj3)).invoke(null, new Object[0]);
                }
                // Misplaced declaration of an exception variable
                catch (String s)
                {
                    throw s.getCause();
                }
                b043D043D043D043D043D043D = ((Integer)obj3).intValue();
                b043D043D043D043D043D043D = 48;
                // fall through

            case 0: // '\0'
                obj3 = retrofit/RestAdapter$Builder.getMethod(nuuuuu.b0417041704170417041704170417("\023\005\024\uFFF2\005\021\025\005\023\024\uFFE9\016\024\005\022\003\005\020\024\017\022", ' ', '\004'), new Class[] {
                    retrofit/RequestInterceptor
                });
                break;
            }
            try
            {
                requestinterceptor = ((RequestInterceptor) (((Method) (obj3)).invoke(obj1, new Object[] {
                    requestinterceptor
                })));
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw s.getCause();
            }
            requestinterceptor = (retrofit.RestAdapter.Builder)requestinterceptor;
        }
        requestinterceptor = retrofit.RestAdapter.LogLevel.NONE;
        obj3 = retrofit/RestAdapter$Builder.getMethod(nuuuuu.b0417041704170417041704170417("\u0150\u0142\u0151\u0129\u014C\u0144\u0129\u0142\u0153\u0142\u0149", '0', '\255', '\003'), new Class[] {
            retrofit/RestAdapter$LogLevel
        });
        try
        {
            requestinterceptor = ((RequestInterceptor) (((Method) (obj3)).invoke(obj1, new Object[] {
                requestinterceptor
            })));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw s.getCause();
        }
        requestinterceptor = (retrofit.RestAdapter.Builder)requestinterceptor;
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
        requestinterceptor = retrofit/RestAdapter$Builder.getMethod(nuuuuu.b0417041704170417041704170417("H:I\032C9ED>CI", '+', '\0'), new Class[] {
            java/lang/String
        });
        try
        {
            s = ((String) (requestinterceptor.invoke(obj1, new Object[] {
                s
            })));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw s.getCause();
        }
        s = (retrofit.RestAdapter.Builder)s;
        j = b043D043D043D043D043D043D;
        k = b043D043D043D043D043D043D;
        l = b043D043D043D043D043D043D;
        i1 = b043D043D043D043D043D043D;
        requestinterceptor = rrrrrr/lllllp.getMethod(nuuuuu.b0417041704170417041704170417("f4865\u0425\u042548654865\u0425\u0425", '\004', '\005'), new Class[0]);
        try
        {
            requestinterceptor = ((RequestInterceptor) (requestinterceptor.invoke(null, new Object[0])));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw s.getCause();
        }
        if (((j + k) * l) % i1 != ((Integer)requestinterceptor).intValue())
        {
            b043D043D043D043D043D043D = 37;
            requestinterceptor = rrrrrr/lllllp.getMethod(nuuuuu.b0417041704170417041704170417("\u026F\u023D\u0241\u023F\u023E\u062E\u023D\u0241\u023F\u023E\u062E\u023D\u0241\u023F\u023E\u062E\u062E", '\257', '\006'), new Class[0]);
            try
            {
                requestinterceptor = ((RequestInterceptor) (requestinterceptor.invoke(null, new Object[0])));
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw s.getCause();
            }
            b043D043D043D043D043D043D = ((Integer)requestinterceptor).intValue();
        }
        requestinterceptor = new OkClient(((OkHttpClient) (obj)));
        obj = retrofit/RestAdapter$Builder.getMethod(nuuuuu.b0417041704170417041704170417("\uFF67\uFF59\uFF68\uFF37\uFF60\uFF5D\uFF59\uFF62\uFF68", 'I', '\303', '\0'), new Class[] {
            retrofit/client/Client
        });
        try
        {
            s = ((String) (((Method) (obj)).invoke(s, new Object[] {
                requestinterceptor
            })));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw s.getCause();
        }
        s = (retrofit.RestAdapter.Builder)s;
        requestinterceptor = retrofit/RestAdapter$Builder.getMethod(nuuuuu.b0417041704170417041704170417("\uFFB3\uFFC6\uFFBA\uFFBD\uFFB5", '\215', '"', '\0'), new Class[0]);
        try
        {
            s = ((String) (requestinterceptor.invoke(s, new Object[0])));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw s.getCause();
        }
        return (RestAdapter)s;
    }
}
