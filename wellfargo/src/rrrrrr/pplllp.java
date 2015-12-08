// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rrrrrr;

import android.content.Context;
import android.util.Base64;
import com.a.a.a;
import com.a.a.e;
import com.a.a.f;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.SecureRandom;
import uuuuuu.nuuuuu;

// Referenced classes of package rrrrrr:
//            grrrrr, grrrgg, ppplpp, grrgrg

public class pplllp
{

    public static int b043D043D043D043D043D043D_int_static_fld = 2;
    public static String b043D043D043D043D043D043D_java_lang_String_static_fld;
    public static int b043D043D043D043D043D043D_int_static_fld = 0;
    public static int b043D043D043D043D043D043D_int_static_fld = 1;
    public static int b043D043D043D043D043D043D_int_static_fld = 41;
    private e b043D043D043D043D043D043D_com_a_a_e_fld;
    private boolean b043D043D043D043D043D043D_boolean_fld;
    private final String b043D043D043D043D043D043D_java_lang_String_fld;

    public pplllp(grrgrg grrgrg)
    {
        throw new Runtime("d2j fail translate: java.lang.IndexOutOfBoundsException: fromIndex < 0: -1\n\tat java.util.BitSet.nextSetBit(BitSet.java:701)\n\tat com.googlecode.dex2jar.ir.ts.array.FillArrayTransformer.makeSureAllElementAreAssigned(FillArrayTransformer.java:505)\n\tat com.googlecode.dex2jar.ir.ts.array.FillArrayTransformer.transformReportChanged(FillArrayTransformer.java:123)\n\tat com.googlecode.dex2jar.ir.ts.StatedTransformer.transform(StatedTransformer.java:10)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:149)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
    }

    public static int b0421042104210421042104210421()
    {
        return 1;
    }

    public static int b0421042104210421042104210421()
    {
        return 0;
    }

    public static String b0421042104210421042104210421()
    {
        byte abyte0[];
        Object obj;
        InvocationTargetException invocationtargetexception;
        Object obj1;
        Object obj2;
        Method method;
        int i;
        int j;
        int k;
        try
        {
            obj1 = new SecureRandom();
            abyte0 = new byte[70];
        }
        catch (Exception exception)
        {
            throw exception;
        }
        obj2 = java/security/SecureRandom.getMethod(nuuuuu.b0417041704170417041704170417("\u0335\u032C\u033F\u033B\u0309\u0340\u033B\u032C\u033A", '\355', '\006'), new Class[] {
            [B
        });
        ((Method) (obj2)).invoke(obj1, new Object[] {
            abyte0
        });
        i = b043D043D043D043D043D043D_int_static_fld;
        switch ((i * (b043D043D043D043D043D043D_int_static_fld + i)) % b043D043D043D043D043D043D_int_static_fld)
        {
        default:
            b043D043D043D043D043D043D_int_static_fld = 25;
            b043D043D043D043D043D043D_int_static_fld = 87;
            // fall through

        case 0: // '\0'
            obj1 = android/util/Base64.getMethod(nuuuuu.b0417041704170417041704170417("\uFE28\uFE31\uFE26\uFE32\uFE27\uFE28\uFE17\uFE32\uFE16\uFE37\uFE35\uFE2C\uFE31\uFE2A", '\277', '\004'), new Class[] {
                [B, Integer.TYPE
            });
            break;
        }
        obj = ((Method) (obj1)).invoke(null, new Object[] {
            abyte0, Integer.valueOf(2)
        });
        obj = (String)obj;
        InvocationTargetException invocationtargetexception1;
        try
        {
            obj1 = grrrrr.b044C044C044C044C044C044C("\uFF37\uFF33", '\244', 'T', '\0');
        }
        catch (Exception exception1)
        {
            throw exception1;
        }
        obj2 = grrrrr.b044C044C044C044C044C044C("M", '\022', '\002');
        method = java/lang/String.getMethod(nuuuuu.b0417041704170417041704170417("pcnj_ac", '\001', '\003'), new Class[] {
            java/lang/CharSequence, java/lang/CharSequence
        });
        obj = method.invoke(obj, new Object[] {
            obj1, obj2
        });
        obj = (String)obj;
_L2:
        1;
        JVM INSTR tableswitch 0 1: default 248
    //                   0 225
    //                   1 275;
           goto _L1 _L2 _L3
_L1:
        0;
        JVM INSTR tableswitch 0 1: default 272
    //                   0 275
    //                   1 225;
           goto _L1 _L3 _L2
_L3:
        obj1 = grrrrr.b044C044C044C044C044C044C("\uFF08", 'g', '\004');
        obj2 = java/lang/String.getMethod(nuuuuu.b0417041704170417041704170417("\uFF9A\uFF8D\uFF98\uFF94\uFF89\uFF8B\uFF8D", '\205', 'S', '\0'), new Class[] {
            java/lang/CharSequence, java/lang/CharSequence
        });
        obj = ((Method) (obj2)).invoke(obj, new Object[] {
            obj1, ""
        });
        obj = (String)obj;
        i = b043D043D043D043D043D043D_int_static_fld;
        obj1 = rrrrrr/pplllp.getMethod(nuuuuu.b0417041704170417041704170417("\u01B2\u0180\u0184\u0182\u0181\u0180\u0184\u0182\u0181\u0180\u0184\u0182\u0181\u0571\u0571\u0180\u0184\u0182\u0181\u0571", '\250', '\001'), new Class[0]);
        obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
        j = ((Integer)obj1).intValue();
        k = b043D043D043D043D043D043D_int_static_fld;
        ((j + i) * i) % k;
        JVM INSTR tableswitch 0 0: default 416
    //                   0 501;
           goto _L4 _L5
_L4:
        obj1 = rrrrrr/pplllp.getMethod(nuuuuu.b0417041704170417041704170417("\254\u04EF\376\372\374\377\u04EF\u04EF\u04EF\376\372\374\377\u04EF", '\316', '\002'), new Class[0]);
        obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
        i = ((Integer)obj1).intValue();
        b043D043D043D043D043D043D_int_static_fld = i;
        obj1 = rrrrrr/pplllp.getMethod(nuuuuu.b0417041704170417041704170417("y\u043A+/)*\u043A\u043A\u043A+/)*\u043A", '\033', '\002'), new Class[0]);
        obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
        i = ((Integer)obj1).intValue();
        b043D043D043D043D043D043D_int_static_fld = i;
_L5:
        return ((String) (obj));
        invocationtargetexception;
        throw invocationtargetexception.getCause();
        invocationtargetexception1;
        throw invocationtargetexception1.getCause();
        invocationtargetexception1;
        throw invocationtargetexception1.getCause();
        invocationtargetexception1;
        throw invocationtargetexception1.getCause();
        invocationtargetexception1;
        throw invocationtargetexception1.getCause();
        InvocationTargetException invocationtargetexception2;
        invocationtargetexception2;
        throw invocationtargetexception2.getCause();
        invocationtargetexception2;
        throw invocationtargetexception2.getCause();
    }

    public static int b0421042104210421042104210421()
    {
        return 25;
    }

    private void b0421042104210421042104210421(Context context)
    {
        Object obj = b043D043D043D043D043D043D_com_a_a_e_fld;
        Object obj1 = com/a/a/e.getMethod(nuuuuu.b0417041704170417041704170417("\u01B1\u01A3\u01B2\u0192\u01A7\u01AB\u01A3\u01AD\u01B3\u01B2", '\237', '\001'), new Class[] {
            Integer.TYPE
        });
        InterruptedException interruptedexception;
        Object obj2;
        int i;
        int j;
        int k;
        int l;
        try
        {
            ((Method) (obj1)).invoke(obj, new Object[] {
                Integer.valueOf(10)
            });
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw context.getCause();
        }
        obj = b043D043D043D043D043D043D_com_a_a_e_fld;
        obj1 = b043D043D043D043D043D043D_java_lang_String_static_fld;
        obj2 = com/a/a/e.getMethod(nuuuuu.b0417041704170417041704170417("|n}\\n||rxwRM", 'j', 's', '\001'), new Class[] {
            java/lang/String
        });
        try
        {
            ((Method) (obj2)).invoke(obj, new Object[] {
                obj1
            });
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw context.getCause();
        }
        obj = b043D043D043D043D043D043D_com_a_a_e_fld;
        obj1 = new grrrgg(this);
        obj2 = com/a/a/e.getMethod(nuuuuu.b0417041704170417041704170417("\372\354\373\312\366\364\367\363\354\373\360\366\365\325\366\373\360\355\360\354\371", '\207', '\005'), new Class[] {
            com/a/a/a
        });
        ((Method) (obj2)).invoke(obj, new Object[] {
            obj1
        });
_L1:
        obj = b043D043D043D043D043D043D_com_a_a_e_fld;
        if (((b043D043D043D043D043D043D_int_static_fld + b043D043D043D043D043D043D_int_static_fld) * b043D043D043D043D043D043D_int_static_fld) % b043D043D043D043D043D043D_int_static_fld != b043D043D043D043D043D043D_int_static_fld)
        {
            obj1 = rrrrrr/pplllp.getMethod(nuuuuu.b0417041704170417041704170417("*\u03E9\uFFF8\uFFFC\uFFFA\uFFF9\u03E9\u03E9\u03E9\uFFF8\uFFFC\uFFFA\uFFF9\u03E9", '8', '\0'), new Class[0]);
            try
            {
                obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                throw context.getCause();
            }
            b043D043D043D043D043D043D_int_static_fld = ((Integer)obj1).intValue();
            b043D043D043D043D043D043D_int_static_fld = 98;
        }
        obj1 = grrrrr.b044C044C044C044C044C044C("\uFF9C\uFF9A\uFF69\uFF9B\uFF6A\uFFAD\uFF9B\uFFA3", 'j', 'a', '\0');
        i = b043D043D043D043D043D043D_int_static_fld;
        j = b043D043D043D043D043D043D_int_static_fld;
        k = b043D043D043D043D043D043D_int_static_fld;
        l = b043D043D043D043D043D043D_int_static_fld;
        obj2 = rrrrrr/pplllp.getMethod(nuuuuu.b0417041704170417041704170417("\uFF78\uFF46\uFF4A\uFF48\uFF47\u0337\uFF46\uFF4A\uFF48\uFF47\u0337\u0337\uFF46\uFF4A\uFF48\uFF47\u0337", 'N', '\004'), new Class[0]);
        try
        {
            obj2 = ((Method) (obj2)).invoke(null, new Object[0]);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw context.getCause();
        }
        if (((i + j) * k) % l != ((Integer)obj2).intValue())
        {
            b043D043D043D043D043D043D_int_static_fld = 34;
            obj2 = rrrrrr/pplllp.getMethod(nuuuuu.b0417041704170417041704170417("\uFEB9\u0278\uFE87\uFE8B\uFE89\uFE88\u0278\u0278\u0278\uFE87\uFE8B\uFE89\uFE88\u0278", '\254', '\375', '\0'), new Class[0]);
            InvocationTargetException invocationtargetexception;
            try
            {
                obj2 = ((Method) (obj2)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                throw context.getCause();
            }
            b043D043D043D043D043D043D_int_static_fld = ((Integer)obj2).intValue();
        }
        obj2 = com/a/a/e.getMethod(nuuuuu.b0417041704170417041704170417("r}^\200}twzs`s\177\203s\201\202", '\007', '\001'), new Class[] {
            android/content/Context, java/lang/String, java/lang/String
        });
        try
        {
            context = ((Context) (((Method) (obj2)).invoke(obj, new Object[] {
                context, obj1, null
            })));
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw context.getCause();
        }
        context = (f)context;
        return;
        invocationtargetexception;
        try
        {
            throw invocationtargetexception.getCause();
        }
        // Misplaced declaration of an exception variable
        catch (InterruptedException interruptedexception)
        {
            obj = b043D043D043D043D043D043D_java_lang_String_fld;
            interruptedexception = interruptedexception.getMessage();
            obj2 = rrrrrr/ppplpp.getMethod(nuuuuu.b0417041704170417041704170417("\uFFAB\u035E\uFF79\uFF7D\uFF7A\uFF7E\u035E\u035E\uFF79\uFF7D\uFF7A\uFF7E\u035E\uFF79\uFF7D\uFF7A\uFF7E", '<', '\363', '\002'), new Class[] {
                java/lang/String, java/lang/String
            });
            try
            {
                ((Method) (obj2)).invoke(null, new Object[] {
                    obj, interruptedexception
                });
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                throw context.getCause();
            }
        }
          goto _L1
    }

    public void b0421042104210421042104210421(Context context)
    {
        throw new Runtime("d2j fail translate: java.lang.IndexOutOfBoundsException: fromIndex < 0: -1\n\tat java.util.BitSet.nextSetBit(BitSet.java:701)\n\tat com.googlecode.dex2jar.ir.ts.array.FillArrayTransformer.makeSureAllElementAreAssigned(FillArrayTransformer.java:505)\n\tat com.googlecode.dex2jar.ir.ts.array.FillArrayTransformer.transformReportChanged(FillArrayTransformer.java:123)\n\tat com.googlecode.dex2jar.ir.ts.StatedTransformer.transform(StatedTransformer.java:10)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:149)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
    }

    public String b0421042104210421042104210421()
    {
        String s = b043D043D043D043D043D043D_java_lang_String_static_fld;
        int i = b043D043D043D043D043D043D_int_static_fld;
        switch ((i * (b043D043D043D043D043D043D_int_static_fld + i)) % b043D043D043D043D043D043D_int_static_fld)
        {
        default:
            b043D043D043D043D043D043D_int_static_fld = 80;
            Object obj = rrrrrr/pplllp.getMethod(nuuuuu.b0417041704170417041704170417("\uFFFE\u03BD\uFFCC\uFFD0\uFFCE\uFFCD\u03BD\u03BD\u03BD\uFFCC\uFFD0\uFFCE\uFFCD\u03BD", '2', '\003'), new Class[0]);
            try
            {
                obj = ((Method) (obj)).invoke(null, new Object[0]);
            }
            catch (InvocationTargetException invocationtargetexception)
            {
                throw invocationtargetexception.getCause();
            }
            b043D043D043D043D043D043D_int_static_fld = ((Integer)obj).intValue();
            // fall through

        case 0: // '\0'
            return s;
        }
    }
}
