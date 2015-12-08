// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rrrrrr;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import uuuuuu.nuuuuu;

// Referenced classes of package rrrrrr:
//            grrrrr, ppplpp

public class rgrrrg
{

    private static String b041D041D041D041D041D041D_java_lang_String_static_fld;
    public static int b041D041D041D041D041D041D_int_static_fld = 2;
    private static final String b041D041D041D041D041D041D_java_lang_String_static_fld;
    public static int b041D041D041D041D041D041D_int_static_fld = 0;
    private static String b041D041D041D041D041D041D_java_lang_String_static_fld;
    public static int b041D041D041D041D041D041D_int_static_fld = 1;
    public static int b041D041D041D041D041D041D_int_static_fld = 55;

    public rgrrrg()
    {
_L2:
        Object obj = java/lang/String.getMethod(nuuuuu.b0417041704170417041704170417("\363\354\365\356\373\357", 'w', '\376', '\001'), new Class[0]);
        obj = ((Method) (obj)).invoke(null, new Object[0]);
        ((Integer)obj).intValue();
        if (true) goto _L2; else goto _L1
_L1:
        Object obj1;
        obj1;
        throw obj1;
        obj1;
        try
        {
            throw ((InvocationTargetException) (obj1)).getCause();
        }
        catch (Exception exception) { }
        super();
        return;
    }

    public static boolean b044004400440044004400440()
    {
        rrrrrr/rgrrrg;
        JVM INSTR monitorenter ;
        Object obj;
        Object obj2;
        obj = b041D041D041D041D041D041D_java_lang_String_static_fld;
        obj2 = grrrrr.b044C044C044C044C044C044C("*KRKZOTM\006*+1\024\024\024", '\032', '\0');
        Method method = rrrrrr/ppplpp.getMethod(nuuuuu.b0417041704170417041704170417("\u0104\u04B7\u04B7\322\326\323\327\322\326\323\327\322\326\323\327\u04B7\322\326\323\327", '\242', '\005'), new Class[] {
            java/lang/String, java/lang/String
        });
        method.invoke(null, new Object[] {
            obj, obj2
        });
        obj = new File(b041D041D041D041D041D041D_java_lang_String_static_fld);
        obj2 = java/io/File.getMethod(nuuuuu.b0417041704170417041704170417("\247\272\253\261\266\261", '\302', '\002'), new Class[0]);
        obj2 = ((Method) (obj2)).invoke(obj, new Object[0]);
        if (!((Boolean)obj2).booleanValue()) goto _L2; else goto _L1
_L1:
        obj2 = java/io/File.getMethod(nuuuuu.b0417041704170417041704170417("\uFE1E\uFE1F\uFE26\uFE1F\uFE2E\uFE1F", '\302', '\004'), new Class[0]);
        obj = ((Method) (obj2)).invoke(obj, new Object[0]);
        boolean flag = ((Boolean)obj).booleanValue();
_L4:
        rrrrrr/rgrrrg;
        JVM INSTR monitorexit ;
        return flag;
        Object obj1;
        obj1;
        throw ((InvocationTargetException) (obj1)).getCause();
        obj1;
        throw obj1;
        obj1;
        rrrrrr/rgrrrg;
        JVM INSTR monitorexit ;
        throw obj1;
        obj1;
        throw ((InvocationTargetException) (obj1)).getCause();
        obj1;
        throw ((InvocationTargetException) (obj1)).getCause();
_L2:
        flag = false;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static byte[] b044004400440044004400440(int i)
    {
        Object obj = java/nio/ByteBuffer.getMethod(nuuuuu.b0417041704170417041704170417("\u0280\u028B\u028B\u028E\u0282\u0280\u0293\u0284", '\265', '\006'), new Class[] {
            Integer.TYPE
        });
        obj = ((Method) (obj)).invoke(null, new Object[] {
            Integer.valueOf(4)
        });
        obj = (ByteBuffer)obj;
        int j = b041D041D041D041D041D041D_int_static_fld;
        int l = b041D041D041D041D041D041D_int_static_fld;
        int j1 = b041D041D041D041D041D041D_int_static_fld;
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
        if (((j + l) * j1) % b041D041D041D041D041D041D_int_static_fld != b041D041D041D041D041D041D_int_static_fld)
        {
            Object obj2 = rrrrrr/rgrrrg.getMethod(nuuuuu.b0417041704170417041704170417("\370\306\312\312\306\306\312\312\306\u04D6\u04D6\306\312\312\306\u04D6", '\226', '\005'), new Class[0]);
            int k;
            int i1;
            try
            {
                obj2 = ((Method) (obj2)).invoke(null, new Object[0]);
            }
            catch (InvocationTargetException invocationtargetexception)
            {
                throw invocationtargetexception.getCause();
            }
            b041D041D041D041D041D041D_int_static_fld = ((Integer)obj2).intValue();
            obj2 = rrrrrr/rgrrrg.getMethod(nuuuuu.b0417041704170417041704170417("\260~\202\202~~\202\202~\u048E\u048E~\202\202~\u048E", '\032', '\006'), new Class[0]);
            try
            {
                obj2 = ((Method) (obj2)).invoke(null, new Object[0]);
            }
            catch (InvocationTargetException invocationtargetexception1)
            {
                throw invocationtargetexception1.getCause();
            }
            b041D041D041D041D041D041D_int_static_fld = ((Integer)obj2).intValue();
            k = b041D041D041D041D041D041D_int_static_fld;
            obj2 = rrrrrr/rgrrrg.getMethod(nuuuuu.b0417041704170417041704170417("K\u0429\031\035\035\031\u0429\031\035\035\031\031\035\035\031\u0429", 'n', '\205', '\002'), new Class[0]);
            try
            {
                obj2 = ((Method) (obj2)).invoke(null, new Object[0]);
            }
            catch (InvocationTargetException invocationtargetexception2)
            {
                throw invocationtargetexception2.getCause();
            }
            i1 = ((Integer)obj2).intValue();
            obj2 = rrrrrr/rgrrrg.getMethod(nuuuuu.b0417041704170417041704170417("\uFF21\uFEEF\uFEF3\uFEF3\uFEEF\u02FF\uFEEF\uFEF3\uFEF3\uFEEF\u02FF\uFEEF\uFEF3\uFEF3\uFEEF\u02FF", 'k', '\004'), new Class[0]);
            try
            {
                obj2 = ((Method) (obj2)).invoke(null, new Object[0]);
            }
            catch (InvocationTargetException invocationtargetexception3)
            {
                throw invocationtargetexception3.getCause();
            }
            switch ((k * (i1 + k)) % ((Integer)obj2).intValue())
            {
            default:
                Object obj3 = rrrrrr/rgrrrg.getMethod(nuuuuu.b0417041704170417041704170417("\uFECF\uFE9D\uFEA1\uFEA1\uFE9D\uFE9D\uFEA1\uFEA1\uFE9D\u02AD\u02AD\uFE9D\uFEA1\uFEA1\uFE9D\u02AD", '\271', '\332', '\0'), new Class[0]);
                Object obj1;
                try
                {
                    obj3 = ((Method) (obj3)).invoke(null, new Object[0]);
                }
                catch (InvocationTargetException invocationtargetexception4)
                {
                    throw invocationtargetexception4.getCause();
                }
                b041D041D041D041D041D041D_int_static_fld = ((Integer)obj3).intValue();
                obj3 = rrrrrr/rgrrrg.getMethod(nuuuuu.b0417041704170417041704170417(")\uFFF7\uFFFB\uFFFB\uFFF7\uFFF7\uFFFB\uFFFB\uFFF7\u0407\u0407\uFFF7\uFFFB\uFFFB\uFFF7\u0407", '\023', '\004'), new Class[0]);
                try
                {
                    obj3 = ((Method) (obj3)).invoke(null, new Object[0]);
                }
                catch (InvocationTargetException invocationtargetexception5)
                {
                    throw invocationtargetexception5.getCause();
                }
                b041D041D041D041D041D041D_int_static_fld = ((Integer)obj3).intValue();
                break;

            case 0: // '\0'
                break;
            }
        }
        obj3 = java/nio/ByteBuffer.getMethod(nuuuuu.b0417041704170417041704170417("\004\t\b\uFFDD\002\b", '.', '\232', '\002'), new Class[] {
            Integer.TYPE
        });
        obj = ((Method) (obj3)).invoke(obj, new Object[] {
            Integer.valueOf(i)
        });
        obj = (ByteBuffer)obj;
        obj3 = java/nio/ByteBuffer.getMethod(nuuuuu.b0417041704170417041704170417("\uFF8C\uFF9D\uFF9D\uFF8C\uFFA4", '\325', '\0'), new Class[0]);
        obj = ((Method) (obj3)).invoke(obj, new Object[0]);
        return (byte[])obj;
        obj1;
        try
        {
            throw ((InvocationTargetException) (obj1)).getCause();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            throw obj1;
        }
        obj1;
        throw ((InvocationTargetException) (obj1)).getCause();
        obj1;
        throw ((InvocationTargetException) (obj1)).getCause();
    }

    public static int b044004400440044004400440()
    {
        return 96;
    }

    public static int b044004400440044004400440()
    {
        return 2;
    }

    public static byte[] b044004400440044004400440(String s, String s1)
    {
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_49;
        }
        s = java/lang/String.getMethod(nuuuuu.b0417041704170417041704170417("\uFF07\uFF05\uFF14\uFEE2\uFF19\uFF14\uFF05\uFF13", '\376', 'b', '\0'), new Class[0]);
        s = ((String) (s.invoke(s1, new Object[0])));
        return (byte[])s;
        s;
        try
        {
            throw s.getCause();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw s;
        }
        StringBuilder stringbuilder;
        s1 = b041D041D041D041D041D041D_java_lang_String_static_fld;
        stringbuilder = new StringBuilder();
        Method method = java/lang/StringBuilder.getMethod(nuuuuu.b0417041704170417041704170417("\310\327\327\314\325\313", '\220', '\367', '\001'), new Class[] {
            java/lang/String
        });
        s = ((String) (method.invoke(stringbuilder, new Object[] {
            s
        })));
        s = (StringBuilder)s;
        int i = b041D041D041D041D041D041D_int_static_fld;
        int j = b041D041D041D041D041D041D_int_static_fld;
        switch ((j * (b041D041D041D041D041D041D_int_static_fld + j)) % b041D041D041D041D041D041D_int_static_fld)
        {
        default:
            Object obj = rrrrrr/rgrrrg.getMethod(nuuuuu.b0417041704170417041704170417("\uFF26\uFEF4\uFEF8\uFEF8\uFEF4\uFEF4\uFEF8\uFEF8\uFEF4\u0304\u0304\uFEF4\uFEF8\uFEF8\uFEF4\u0304", ']', '\337', '\0'), new Class[0]);
            Method method1;
            try
            {
                obj = ((Method) (obj)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw s.getCause();
            }
            b041D041D041D041D041D041D_int_static_fld = ((Integer)obj).intValue();
            obj = rrrrrr/rgrrrg.getMethod(nuuuuu.b0417041704170417041704170417("\u0359\u0327\u032B\u032B\u0327\u0327\u032B\u032B\u0327\u0737\u0737\u0327\u032B\u032B\u0327\u0737", '\375', '\006'), new Class[0]);
            try
            {
                obj = ((Method) (obj)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw s.getCause();
            }
            b041D041D041D041D041D041D_int_static_fld = ((Integer)obj).intValue();
            // fall through

        case 0: // '\0'
            obj = rrrrrr/rgrrrg.getMethod(nuuuuu.b0417041704170417041704170417("\uFEA0\u027E\uFE6E\uFE72\uFE72\uFE6E\u027E\uFE6E\uFE72\uFE72\uFE6E\uFE6E\uFE72\uFE72\uFE6E\u027E", '\226', '\004'), new Class[0]);
            break;
        }
        try
        {
            obj = ((Method) (obj)).invoke(null, new Object[0]);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw s.getCause();
        }
        switch (((((Integer)obj).intValue() + i) * i) % b041D041D041D041D041D041D_int_static_fld)
        {
        default:
            b041D041D041D041D041D041D_int_static_fld = 79;
            b041D041D041D041D041D041D_int_static_fld = 52;
            break;

        case 0: // '\0'
            break;
        }
        switch (1)
        {
        default:
label0:
            do
            {
                switch (1)
                {
                case 0: // '\0'
                    break MISSING_BLOCK_LABEL_302;

                case 1: // '\001'
                    break label0;
                }
            } while (true);
            break;

        case 0: // '\0'
            break MISSING_BLOCK_LABEL_302;

        case 1: // '\001'
            break;
        }
        obj = grrrrr.b044C044C044C044C044C044C("s\306\273\302\310\277\267s\301\302\307s\265\270s\301\310\277\277\201", '\253', '\376', '\001');
        method1 = java/lang/StringBuilder.getMethod(nuuuuu.b0417041704170417041704170417("\u01E5\u01F4\u01F4\u01E9\u01F2\u01E8", '\302', '\001'), new Class[] {
            java/lang/String
        });
        s = ((String) (method1.invoke(s, new Object[] {
            obj
        })));
        s = (StringBuilder)s;
        obj = java/lang/StringBuilder.getMethod(nuuuuu.b0417041704170417041704170417("\u0119\u0114\370\u0119\u0117\u010E\u0113\u010C", '\226', '\017', '\003'), new Class[0]);
        s = ((String) (((Method) (obj)).invoke(s, new Object[0])));
        s = (String)s;
        obj = rrrrrr/ppplpp.getMethod(nuuuuu.b0417041704170417041704170417("\u0101\u04B4\317\323\320\324\u04B4\u04B4\317\323\320\324\u04B4\317\323\320\324", '\216', '\021', '\003'), new Class[] {
            java/lang/String, java/lang/String
        });
        ((Method) (obj)).invoke(null, new Object[] {
            s1, s
        });
        return new byte[0];
        s;
        throw s.getCause();
        s;
        throw s.getCause();
        s;
        throw s.getCause();
        s;
        try
        {
            throw s.getCause();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw s;
        }
    }

    public static boolean b044004400440044004400440()
    {
        rrrrrr/rgrrrg;
        JVM INSTR monitorenter ;
        Object obj;
        if (((b041D041D041D041D041D041D_int_static_fld + b041D041D041D041D041D041D_int_static_fld) * b041D041D041D041D041D041D_int_static_fld) % b041D041D041D041D041D041D_int_static_fld == b041D041D041D041D041D041D_int_static_fld)
        {
            break MISSING_BLOCK_LABEL_69;
        }
        obj = rrrrrr/rgrrrg.getMethod(nuuuuu.b0417041704170417041704170417("\u031D\u02EB\u02EF\u02EF\u02EB\u02EB\u02EF\u02EF\u02EB\u06FB\u06FB\u02EB\u02EF\u02EF\u02EB\u06FB", '\351', '\006'), new Class[0]);
        obj = ((Method) (obj)).invoke(null, new Object[0]);
        b041D041D041D041D041D041D_int_static_fld = ((Integer)obj).intValue();
        b041D041D041D041D041D041D_int_static_fld = 69;
        Method method;
        obj = new File(b041D041D041D041D041D041D_java_lang_String_static_fld);
        method = java/io/File.getMethod(nuuuuu.b0417041704170417041704170417("\uFF09\uFF1C\uFF0D\uFF17\uFF18\uFF17", '\373', 'a', '\0'), new Class[0]);
        obj = method.invoke(obj, new Object[0]);
        boolean flag = ((Boolean)obj).booleanValue();
        rrrrrr/rgrrrg;
        JVM INSTR monitorexit ;
        return flag;
        Object obj1;
        obj1;
        throw ((InvocationTargetException) (obj1)).getCause();
        obj1;
        rrrrrr/rgrrrg;
        JVM INSTR monitorexit ;
        throw obj1;
        obj1;
        throw ((InvocationTargetException) (obj1)).getCause();
    }

    public static int b044004400440044004400440()
    {
        return 1;
    }

    public static void b044004400440044004400440(byte abyte0[])
    {
        rrrrrr/rgrrrg;
        JVM INSTR monitorenter ;
        Object obj = new File(b041D041D041D041D041D041D_java_lang_String_static_fld);
        Object obj1 = java/io/File.getMethod(nuuuuu.b0417041704170417041704170417("\007\032\013\025\026\025", 'B', '\240', '\002'), new Class[0]);
        obj1 = ((Method) (obj1)).invoke(obj, new Object[0]);
        if (((Boolean)obj1).booleanValue())
        {
            break MISSING_BLOCK_LABEL_161;
        }
        obj1 = java/io/File.getMethod(nuuuuu.b0417041704170417041704170417("75.3<", '\276', '\210', '\001'), new Class[0]);
        obj = ((Method) (obj1)).invoke(obj, new Object[0]);
        boolean flag = ((Boolean)obj).booleanValue();
        if (flag)
        {
            break MISSING_BLOCK_LABEL_161;
        }
        throw new RuntimeException(grrrrr.b044C044C044C044C044C044C("\f8>5-\uFFE978=\uFFE9,;.*=.\uFFE9\r\016\024\uFFE9\r\022\033\016\f\035\030\033\"\uFFF7", '7', '\0'));
        abyte0;
        throw new RuntimeException(abyte0.getMessage());
        abyte0;
        rrrrrr/rgrrrg;
        JVM INSTR monitorexit ;
        throw abyte0;
        abyte0;
        throw abyte0.getCause();
        abyte0;
        throw new RuntimeException(abyte0.getMessage());
        abyte0;
        throw abyte0.getCause();
        obj = new File(b041D041D041D041D041D041D_java_lang_String_static_fld);
        obj1 = java/io/File.getMethod(nuuuuu.b0417041704170417041704170417("\355\u0100\361\373\374\373", 'D', '\001'), new Class[0]);
        obj1 = ((Method) (obj1)).invoke(obj, new Object[0]);
        if (((Boolean)obj1).booleanValue())
        {
            break MISSING_BLOCK_LABEL_277;
        }
        obj1 = java/io/File.getMethod(nuuuuu.b0417041704170417041704170417("\242\261\244\240\263\244\215\244\266\205\250\253\244", '?', '\005'), new Class[0]);
        obj1 = ((Method) (obj1)).invoke(obj, new Object[0]);
        flag = ((Boolean)obj1).booleanValue();
        if (flag)
        {
            break MISSING_BLOCK_LABEL_277;
        }
        throw new RuntimeException(grrrrr.b044C044C044C044C044C044C("\uFF91\uFFBD\uFFC3\uFFBA\uFFB2\uFF6E\uFFBC\uFFBD\uFFC2\uFF6E\uFFB1\uFFC0\uFFB3\uFFAF\uFFC2\uFFB3\uFF6E\uFF92\uFF93\uFF99\uFF6E\uFF94\uFF97\uFF9A\uFF93\uFF7C", '\017', '\243', '\0'));
        abyte0;
        throw abyte0.getCause();
        obj = new FileOutputStream(((File) (obj)));
        int i;
        int j;
        int k;
        int l;
        int i1;
        i = b041D041D041D041D041D041D_int_static_fld;
        j = b041D041D041D041D041D041D_int_static_fld;
        k = b041D041D041D041D041D041D_int_static_fld;
        l = b041D041D041D041D041D041D_int_static_fld;
        i1 = b041D041D041D041D041D041D_int_static_fld;
        obj1 = rrrrrr/rgrrrg.getMethod(nuuuuu.b0417041704170417041704170417("\256|\200\200|\u048C|\200\200|\u048C|\200\200|\u048C", 'c', '\257', '\001'), new Class[0]);
        obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
        ((i1 + l) * l) % ((Integer)obj1).intValue();
        JVM INSTR tableswitch 0 0: default 547
    //                   0 420;
           goto _L1 _L2
_L1:
        b041D041D041D041D041D041D_int_static_fld = 14;
        obj1 = rrrrrr/rgrrrg.getMethod(nuuuuu.b0417041704170417041704170417("\u0178\u0146\u014A\u014A\u0146\u0146\u014A\u014A\u0146\u0556\u0556\u0146\u014A\u014A\u0146\u0556", '\213', '\001'), new Class[0]);
        obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
        b041D041D041D041D041D041D_int_static_fld = ((Integer)obj1).intValue();
_L2:
        if ((k * (i + j)) % b041D041D041D041D041D041D_int_static_fld == b041D041D041D041D041D041D_int_static_fld)
        {
            break MISSING_BLOCK_LABEL_480;
        }
        obj1 = rrrrrr/rgrrrg.getMethod(nuuuuu.b0417041704170417041704170417("\uFF24\uFEF2\uFEF6\uFEF6\uFEF2\uFEF2\uFEF6\uFEF6\uFEF2\u0302\u0302\uFEF2\uFEF6\uFEF6\uFEF2\u0302", 'j', '\004'), new Class[0]);
        obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
        b041D041D041D041D041D041D_int_static_fld = ((Integer)obj1).intValue();
        b041D041D041D041D041D041D_int_static_fld = 81;
        ((FileOutputStream) (obj)).write(abyte0);
        abyte0 = java/io/FileOutputStream.getMethod(nuuuuu.b0417041704170417041704170417("ZUVJ\\", '9', '\002'), new Class[0]);
        abyte0.invoke(obj, new Object[0]);
        rrrrrr/rgrrrg;
        JVM INSTR monitorexit ;
        return;
        abyte0;
        throw abyte0.getCause();
        abyte0;
        throw abyte0.getCause();
        abyte0;
        throw abyte0.getCause();
        abyte0;
        throw abyte0.getCause();
        abyte0;
        throw abyte0.getCause();
    }

    public static byte[] b044004400440044004400440()
    {
        rrrrrr/rgrrrg;
        JVM INSTR monitorenter ;
        Object obj2 = new File(b041D041D041D041D041D041D_java_lang_String_static_fld);
        Object obj = java/io/File.getMethod(nuuuuu.b0417041704170417041704170417("\u0268\u0261\u026A\u0263\u0270\u0264", '\376', '\001'), new Class[0]);
        obj = ((Method) (obj)).invoke(obj2, new Object[0]);
        long l1 = ((Long)obj).longValue();
        int i = (int)l1;
        byte abyte0[] = new byte[i];
        obj2 = new BufferedInputStream(new FileInputStream(((File) (obj2))));
        i = abyte0.length;
        Object obj3 = java/io/BufferedInputStream.getMethod(nuuuuu.b0417041704170417041704170417("\u020C\u01FF\u01FB\u01FE", '\315', '\001'), new Class[] {
            [B, Integer.TYPE, Integer.TYPE
        });
        obj3 = ((Method) (obj3)).invoke(obj2, new Object[] {
            abyte0, Integer.valueOf(0), Integer.valueOf(i)
        });
        ((Integer)obj3).intValue();
        obj3 = java/io/BufferedInputStream.getMethod(nuuuuu.b0417041704170417041704170417("\u0132\u013B\u013E\u0142\u0134", '\317', '\005'), new Class[0]);
        ((Method) (obj3)).invoke(obj2, new Object[0]);
        int j;
        int k;
        i = b041D041D041D041D041D041D_int_static_fld;
        j = b041D041D041D041D041D041D_int_static_fld;
        k = b041D041D041D041D041D041D_int_static_fld;
        obj2 = rrrrrr/rgrrrg.getMethod(nuuuuu.b0417041704170417041704170417("\uFF71\uFF3F\uFF43\uFF43\uFF3F\u034F\uFF3F\uFF43\uFF43\uFF3F\u034F\uFF3F\uFF43\uFF43\uFF3F\u034F", '\361', '\0'), new Class[0]);
        obj2 = ((Method) (obj2)).invoke(null, new Object[0]);
        int l = ((Integer)obj2).intValue();
        int i1 = b041D041D041D041D041D041D_int_static_fld;
        if ((k * (i + j)) % l == i1)
        {
            break MISSING_BLOCK_LABEL_327;
        }
        b041D041D041D041D041D041D_int_static_fld = 8;
        if (((b041D041D041D041D041D041D_int_static_fld + b041D041D041D041D041D041D_int_static_fld) * b041D041D041D041D041D041D_int_static_fld) % b041D041D041D041D041D041D_int_static_fld == b041D041D041D041D041D041D_int_static_fld)
        {
            break MISSING_BLOCK_LABEL_322;
        }
        obj2 = rrrrrr/rgrrrg.getMethod(nuuuuu.b0417041704170417041704170417("\u0216\u01E4\u01E8\u01E8\u01E4\u01E4\u01E8\u01E8\u01E4\u05F4\u05F4\u01E4\u01E8\u01E8\u01E4\u05F4", '\332', '\001'), new Class[0]);
        obj2 = ((Method) (obj2)).invoke(null, new Object[0]);
        b041D041D041D041D041D041D_int_static_fld = ((Integer)obj2).intValue();
        b041D041D041D041D041D041D_int_static_fld = 31;
        b041D041D041D041D041D041D_int_static_fld = 64;
        rrrrrr/rgrrrg;
        JVM INSTR monitorexit ;
        return abyte0;
        Object obj1;
        obj1;
        obj1 = new RuntimeException(((FileNotFoundException) (obj1)).getMessage());
        throw obj1;
        obj1;
        throw obj1;
        obj1;
        throw obj1;
        obj1;
        rrrrrr/rgrrrg;
        JVM INSTR monitorexit ;
        throw obj1;
        obj1;
        throw new RuntimeException(((IOException) (obj1)).getMessage());
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
        obj1;
        throw obj1;
        obj1;
        throw ((InvocationTargetException) (obj1)).getCause();
    }

    static 
    {
        throw new Runtime("d2j fail translate: java.lang.IndexOutOfBoundsException: fromIndex < 0: -1\n\tat java.util.BitSet.nextSetBit(BitSet.java:701)\n\tat com.googlecode.dex2jar.ir.ts.array.FillArrayTransformer.makeSureAllElementAreAssigned(FillArrayTransformer.java:505)\n\tat com.googlecode.dex2jar.ir.ts.array.FillArrayTransformer.transformReportChanged(FillArrayTransformer.java:123)\n\tat com.googlecode.dex2jar.ir.ts.StatedTransformer.transform(StatedTransformer.java:10)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:149)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
    }
}
