// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rrrrrr;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;
import uuuuuu.nuuuuu;

public final class rrgggr
    implements X509TrustManager
{

    public static int b041A041A041A041A041A041A = 0;
    public static int b041A041A041A041A041A041A = 89;
    public static int b041A041A041A041A041A041A = 1;
    public static int b041A041A041A041A041A041A = 2;

    public rrgggr()
    {
        Object obj;
        InvocationTargetException invocationtargetexception;
        int i;
        int j;
        int k;
        try
        {
            i = b041A041A041A041A041A041A;
            j = b041A041A041A041A041A041A;
        }
        catch (Exception exception)
        {
            throw exception;
        }
        obj = rrrrrr/rrgggr.getMethod(nuuuuu.b0417041704170417041704170417("\uFFC8\u0391\u0391\uFF96\uFF9A\uFF98\uFFA8\uFF96\uFF9A\uFF98\uFFA8\uFF96\uFF9A\uFF98\uFFA8\uFF96\uFF9A\uFF98\uFFA8", '\232', '\0'), new Class[0]);
        obj = ((Method) (obj)).invoke(null, new Object[0]);
        ((j + i) * i) % ((Integer)obj).intValue();
        JVM INSTR tableswitch 0 0: default 68
    //                   0 148;
           goto _L1 _L2
_L2:
        break MISSING_BLOCK_LABEL_148;
_L1:
        obj = rrrrrr/rrgggr.getMethod(nuuuuu.b0417041704170417041704170417("\uFF0F\uFEDD\uFEE1\uFEDF\uFEEF\u02D8\uFEDD\uFEE1\uFEDF\uFEEF\uFEDD\uFEE1\uFEDF\uFEEF\uFEDD\uFEE1\uFEDF\uFEEF\uFEDD\uFEE1\uFEDF\uFEEF", 'q', '\004'), new Class[0]);
        obj = ((Method) (obj)).invoke(null, new Object[0]);
        i = ((Integer)obj).intValue();
        InvocationTargetException invocationtargetexception1;
        try
        {
            b041A041A041A041A041A041A = i;
        }
        catch (Exception exception1)
        {
            throw exception1;
        }
        obj = rrrrrr/rrgggr.getMethod(nuuuuu.b0417041704170417041704170417("\027\uFFE5\uFFE9\uFFE7\uFFF7\u03E0\uFFE5\uFFE9\uFFE7\uFFF7\uFFE5\uFFE9\uFFE7\uFFF7\uFFE5\uFFE9\uFFE7\uFFF7\uFFE5\uFFE9\uFFE7\uFFF7", '\031', '\004'), new Class[0]);
        obj = ((Method) (obj)).invoke(null, new Object[0]);
        i = ((Integer)obj).intValue();
        b041A041A041A041A041A041A = i;
        super();
        i = b041A041A041A041A041A041A;
        j = b041A041A041A041A041A041A;
        k = b041A041A041A041A041A041A;
        obj = rrrrrr/rrgggr.getMethod(nuuuuu.b0417041704170417041704170417("\u0120\u04E9\u04E9\356\362\360\u0100\356\362\360\u0100\356\362\360\u0100\356\362\360\u0100", '\276', '\005'), new Class[0]);
        try
        {
            obj = ((Method) (obj)).invoke(null, new Object[0]);
        }
        // Misplaced declaration of an exception variable
        catch (InvocationTargetException invocationtargetexception1)
        {
            throw invocationtargetexception1.getCause();
        }
        if ((k * (i + j)) % ((Integer)obj).intValue() != b041A041A041A041A041A041A)
        {
            b041A041A041A041A041A041A = 74;
            b041A041A041A041A041A041A = 21;
        }
        return;
        invocationtargetexception;
        throw invocationtargetexception.getCause();
        invocationtargetexception1;
        throw invocationtargetexception1.getCause();
        Object obj1;
        obj1;
        throw ((InvocationTargetException) (obj1)).getCause();
        obj1;
        throw obj1;
    }

    public static int b042B042B042B042B042B042B()
    {
        return 21;
    }

    public static int b042B042B042B042B042B042B()
    {
        return 1;
    }

    public static int b042B042B042B042B042B042B()
    {
        return 2;
    }

    public void checkClientTrusted(X509Certificate ax509certificate[], String s)
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
    }

    public void checkServerTrusted(X509Certificate ax509certificate[], String s)
    {
label0:
        do
        {
            int i = b041A041A041A041A041A041A;
            switch ((i * (b041A041A041A041A041A041A + i)) % b041A041A041A041A041A041A)
            {
            default:
                b041A041A041A041A041A041A = 33;
                b041A041A041A041A041A041A = 87;
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
    }

    public X509Certificate[] getAcceptedIssuers()
    {
        Object obj = rrrrrr/rrgggr.getMethod(nuuuuu.b0417041704170417041704170417("\uFFC1\uFF8F\uFF93\uFF91\uFFA1\u038A\uFF8F\uFF93\uFF91\uFFA1\uFF8F\uFF93\uFF91\uFFA1\uFF8F\uFF93\uFF91\uFFA1\uFF8F\uFF93\uFF91\uFFA1", '\241', '\0'), new Class[0]);
        int i;
        int j;
        int k;
        int l;
        int i1;
        try
        {
            obj = ((Method) (obj)).invoke(null, new Object[0]);
        }
        catch (InvocationTargetException invocationtargetexception)
        {
            throw invocationtargetexception.getCause();
        }
        i = ((Integer)obj).intValue();
        obj = rrrrrr/rrgggr.getMethod(nuuuuu.b0417041704170417041704170417("%\u03EE\uFFF3\uFFF7\uFFF5\005\uFFF3\uFFF7\uFFF5\005\uFFF3\uFFF7\uFFF5\005\uFFF3\uFFF7\uFFF5\005\uFFF3\uFFF7\uFFF5\005", '=', '\0'), new Class[0]);
        try
        {
            obj = ((Method) (obj)).invoke(null, new Object[0]);
        }
        catch (InvocationTargetException invocationtargetexception1)
        {
            throw invocationtargetexception1.getCause();
        }
        j = ((Integer)obj).intValue();
        obj = rrrrrr/rrgggr.getMethod(nuuuuu.b0417041704170417041704170417("\u0112\u04DB\u04DB\340\344\342\362\340\344\342\362\340\344\342\362\340\344\342\362", 'X', '\001'), new Class[0]);
        try
        {
            obj = ((Method) (obj)).invoke(null, new Object[0]);
        }
        catch (InvocationTargetException invocationtargetexception2)
        {
            throw invocationtargetexception2.getCause();
        }
        switch ((i * (j + i)) % ((Integer)obj).intValue())
        {
        default:
            b041A041A041A041A041A041A = 70;
            b041A041A041A041A041A041A = 73;
            break;

        case 0: // '\0'
            break;
        }
        InvocationTargetException invocationtargetexception3;
        try
        {
            i = b041A041A041A041A041A041A;
            j = b041A041A041A041A041A041A;
            k = b041A041A041A041A041A041A;
            l = b041A041A041A041A041A041A;
            i1 = b041A041A041A041A041A041A;
        }
        catch (Exception exception)
        {
            throw exception;
        }
        if (((i + j) * k) % l == i1)
        {
            break MISSING_BLOCK_LABEL_224;
        }
        obj = rrrrrr/rrgggr.getMethod(nuuuuu.b0417041704170417041704170417("\u0100\316\322\320\340\u04C9\316\322\320\340\316\322\320\340\316\322\320\340\316\322\320\340", '\236', '\005'), new Class[0]);
        obj = ((Method) (obj)).invoke(null, new Object[0]);
        i = ((Integer)obj).intValue();
        b041A041A041A041A041A041A = i;
        b041A041A041A041A041A041A = 2;
        return null;
        invocationtargetexception3;
        throw invocationtargetexception3.getCause();
    }
}
