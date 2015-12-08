// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rrrrrr;

import android.content.Context;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import retrofit.RequestInterceptor;
import uuuuuu.nuuuuu;

// Referenced classes of package rrrrrr:
//            grgrgr, grrggg, grrrrr, ggrgrr, 
//            ppplpp

public class ggrgrg
    implements RequestInterceptor
{

    public static int b041504150415041504150415_int_static_fld = 0;
    public static int b041504150415041504150415_int_static_fld = 1;
    public static int b041504150415041504150415_int_static_fld = 2;
    public static int b041504150415041504150415_int_static_fld = 20;
    public final ggrgrr b041504150415041504150415_rrrrrr_ggrgrr_fld;

    public ggrgrg(ggrgrr ggrgrr1)
    {
        int i = b041504150415041504150415_int_static_fld;
        switch ((i * (b041504150415041504150415_int_static_fld + i)) % b041504150415041504150415_int_static_fld)
        {
        default:
            Object obj = rrrrrr/ggrgrg.getMethod(nuuuuu.b0417041704170417041704170417("\uFF96\uFF64\uFF68\uFF66\uFF6B\uFF64\uFF68\uFF66\uFF6B\uFF64\uFF68\uFF66\uFF6B\uFF64\uFF68\uFF66\uFF6B\uFF64\uFF68\uFF66\uFF6B\u035B", 'f', '\003'), new Class[0]);
            int j;
            try
            {
                obj = ((Method) (obj)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (ggrgrr ggrgrr1)
            {
                throw ggrgrr1.getCause();
            }
            b041504150415041504150415_int_static_fld = ((Integer)obj).intValue();
            obj = rrrrrr/ggrgrg.getMethod(nuuuuu.b0417041704170417041704170417("\uFF25\uFEF3\uFEF7\uFEF5\uFEFA\uFEF3\uFEF7\uFEF5\uFEFA\uFEF3\uFEF7\uFEF5\uFEFA\uFEF3\uFEF7\uFEF5\uFEFA\uFEF3\uFEF7\uFEF5\uFEFA\u02EA", '\312', 's', '\0'), new Class[0]);
            try
            {
                obj = ((Method) (obj)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (ggrgrr ggrgrr1)
            {
                throw ggrgrr1.getCause();
            }
            b041504150415041504150415_int_static_fld = ((Integer)obj).intValue();
            break;

        case 0: // '\0'
            break;
        }
        try
        {
            b041504150415041504150415_rrrrrr_ggrgrr_fld = ggrgrr1;
        }
        // Misplaced declaration of an exception variable
        catch (ggrgrr ggrgrr1)
        {
            throw ggrgrr1;
        }
        j = b041504150415041504150415_int_static_fld;
        switch ((j * (b041504150415041504150415_int_static_fld + j)) % b041504150415041504150415_int_static_fld)
        {
        default:
            b041504150415041504150415_int_static_fld = 1;
            ggrgrr1 = rrrrrr/ggrgrg.getMethod(nuuuuu.b0417041704170417041704170417("\u0126\364\370\366\373\364\370\366\373\364\370\366\373\364\370\366\373\364\370\366\373\u04EB", '\304', '\005'), new Class[0]);
            try
            {
                ggrgrr1 = ((ggrgrr) (ggrgrr1.invoke(null, new Object[0])));
            }
            // Misplaced declaration of an exception variable
            catch (ggrgrr ggrgrr1)
            {
                throw ggrgrr1.getCause();
            }
            b041504150415041504150415_int_static_fld = ((Integer)ggrgrr1).intValue();
            break;

        case 0: // '\0'
            break;
        }
        super();
        return;
    }

    public static int b042704270427042704270427()
    {
        return 17;
    }

    public void intercept(retrofit.RequestInterceptor.RequestFacade requestfacade)
    {
        Object obj = rrrrrr/grgrgr.getMethod(nuuuuu.b0417041704170417041704170417("\270\352\356\350\230\u04F1\u04F1\u04F1\u04F1\352\356\350\230", '\332', '\002'), new Class[0]);
        obj = ((Method) (obj)).invoke(null, new Object[0]);
        Method method;
        obj = (Context)obj;
        method = rrrrrr/grrggg.getMethod(nuuuuu.b0417041704170417041704170417("\uFE1C\u01D9\u01D9\uFDEA\uFDEE\uFDEB\uFE00\uFDEA\uFDEE\uFDEB\uFE00\uFDEA\uFDEE\uFDEB\uFE00\uFDEA\uFDEE\uFDEB\uFE00", '\302', '\004'), new Class[] {
            android/content/Context
        });
        obj = method.invoke(null, new Object[] {
            obj
        });
        obj = (String)obj;
        Object obj1;
        Object obj2;
        Method method1;
        int i;
        try
        {
            obj1 = b041504150415041504150415_rrrrrr_ggrgrr_fld;
            obj2 = grrrrr.b044C044C044C044C044C044C("\017\uFFE4\uFFFA\006\t\t\uFFFC\003\uFFF8\013\000\006\005\uFFE4\000\uFFFB", '\205', '<', '\001');
        }
        // Misplaced declaration of an exception variable
        catch (retrofit.RequestInterceptor.RequestFacade requestfacade)
        {
            throw requestfacade;
        }
        method1 = rrrrrr/ggrgrr.getMethod(nuuuuu.b0417041704170417041704170417("\u01B4\u0588\u0182\u0186\u0185\u0188\u0182\u0186\u0185\u0188\u0588\u0182\u0186\u0185\u0188\u0588", '\251', '\001'), new Class[] {
            retrofit/RequestInterceptor$RequestFacade, java/lang/String, java/lang/String
        });
        method1.invoke(obj1, new Object[] {
            requestfacade, obj2, obj
        });
        requestfacade = rrrrrr/ggrgrr.getMethod(nuuuuu.b0417041704170417041704170417("\252x|{~x|{~\u047Ex|{~x|{~\u047E", '\030', '\006'), new Class[0]);
        requestfacade = ((retrofit.RequestInterceptor.RequestFacade) (requestfacade.invoke(null, new Object[0])));
        requestfacade = (String)requestfacade;
        obj1 = new StringBuilder();
        if (((b041504150415041504150415_int_static_fld + b041504150415041504150415_int_static_fld) * b041504150415041504150415_int_static_fld) % b041504150415041504150415_int_static_fld != b041504150415041504150415_int_static_fld)
        {
            obj2 = rrrrrr/ggrgrg.getMethod(nuuuuu.b0417041704170417041704170417("\233\311\315\313\316\311\315\313\316\311\315\313\316\311\315\313\316\311\315\313\316\u04DE", '\371', '\002'), new Class[0]);
            try
            {
                obj2 = ((Method) (obj2)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (retrofit.RequestInterceptor.RequestFacade requestfacade)
            {
                throw requestfacade.getCause();
            }
            i = ((Integer)obj2).intValue();
            if (((b041504150415041504150415_int_static_fld + b041504150415041504150415_int_static_fld) * b041504150415041504150415_int_static_fld) % b041504150415041504150415_int_static_fld != b041504150415041504150415_int_static_fld)
            {
                b041504150415041504150415_int_static_fld = 53;
                b041504150415041504150415_int_static_fld = 16;
            }
            b041504150415041504150415_int_static_fld = i;
            obj2 = rrrrrr/ggrgrg.getMethod(nuuuuu.b0417041704170417041704170417("\uFFA5\uFF73\uFF77\uFF75\uFF7A\uFF73\uFF77\uFF75\uFF7A\uFF73\uFF77\uFF75\uFF7A\uFF73\uFF77\uFF75\uFF7A\uFF73\uFF77\uFF75\uFF7A\u036A", '\275', '\0'), new Class[0]);
            try
            {
                obj2 = ((Method) (obj2)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (retrofit.RequestInterceptor.RequestFacade requestfacade)
            {
                throw requestfacade.getCause();
            }
            b041504150415041504150415_int_static_fld = ((Integer)obj2).intValue();
        }
        try
        {
            obj2 = grrrrr.b044C044C044C044C044C044C("\uFED3\uFEC4\uFECB\uFEA0\uFEE1\uFEE4\uFEE4\uFEE9\uFEEE\uFEE7\uFEA0\uFEE3\uFEEF\uFEF2\uFEF2\uFEE5\uFEEC\uFEE1\uFEF4\uFEE9\uFEEF\uFEEE\uFEA0\uFEC9\uFEC4\uFEA0\uFEF4\uFEEF\uFEA0\uFEE8\uFEE5\uFEE1\uFEE4\uFEE5\uFEF2\uFEBA\uFEA0", '\300', '\003');
        }
        // Misplaced declaration of an exception variable
        catch (retrofit.RequestInterceptor.RequestFacade requestfacade)
        {
            throw requestfacade;
        }
        method1 = java/lang/StringBuilder.getMethod(nuuuuu.b0417041704170417041704170417("\uFDA0\uFDAF\uFDAF\uFDA4\uFDAD\uFDA3", '\353', '\004'), new Class[] {
            java/lang/String
        });
        obj1 = method1.invoke(obj1, new Object[] {
            obj2
        });
        obj1 = (StringBuilder)obj1;
        obj2 = java/lang/StringBuilder.getMethod(nuuuuu.b0417041704170417041704170417("\u011D\u012C\u012C\u0121\u012A\u0120", '\274', '\005'), new Class[] {
            java/lang/String
        });
        obj = ((Method) (obj2)).invoke(obj1, new Object[] {
            obj
        });
        obj = (StringBuilder)obj;
        obj1 = java/lang/StringBuilder.getMethod(nuuuuu.b0417041704170417041704170417("\u0126\u0121\u0105\u0126\u0124\u011B\u0120\u0119", '\262', '\005'), new Class[0]);
        obj = ((Method) (obj1)).invoke(obj, new Object[0]);
        obj = (String)obj;
        obj1 = rrrrrr/ppplpp.getMethod(nuuuuu.b0417041704170417041704170417("\u01E2\u0595\u0595\u01B0\u01B4\u01B1\u01B5\u01B0\u01B4\u01B1\u01B5\u01B0\u01B4\u01B1\u01B5\u0595\u01B0\u01B4\u01B1\u01B5", '\200', '\006'), new Class[] {
            java/lang/String, java/lang/String
        });
        ((Method) (obj1)).invoke(null, new Object[] {
            requestfacade, obj
        });
        return;
        requestfacade;
        throw requestfacade.getCause();
        requestfacade;
        throw requestfacade.getCause();
        requestfacade;
        throw requestfacade.getCause();
        requestfacade;
        throw requestfacade.getCause();
        requestfacade;
        throw requestfacade.getCause();
        requestfacade;
        throw requestfacade.getCause();
        requestfacade;
        throw requestfacade.getCause();
        requestfacade;
        throw requestfacade.getCause();
    }
}
