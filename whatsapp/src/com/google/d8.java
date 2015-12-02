// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google;

import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

// Referenced classes of package com.google:
//            d9, bt, aU, aH, 
//            cP, fR, c5, fz, 
//            ap, P, f5, ee, 
//            b4, eh, eL, z, 
//            fn, bR

public abstract class d8 extends d9
    implements Serializable
{

    protected static boolean d = false;
    private static final long serialVersionUID = 1L;
    private static final String z[];

    protected d8()
    {
    }

    protected d8(ee ee)
    {
    }

    public static bt a(P p, int i, Class class1, P p1)
    {
        return new bt(new aU(p, i), class1, p1, null);
    }

    public static bt a(Class class1, P p)
    {
        return new bt(null, class1, p, null);
    }

    private static Object a(Method method, Object obj, Object aobj[])
    {
        try
        {
            method = ((Method) (method.invoke(obj, aobj)));
        }
        // Misplaced declaration of an exception variable
        catch (Method method)
        {
            throw new RuntimeException(z[1], method);
        }
        // Misplaced declaration of an exception variable
        catch (Method method)
        {
            method = method.getCause();
            try
            {
                if (method instanceof RuntimeException)
                {
                    throw (RuntimeException)method;
                }
            }
            // Misplaced declaration of an exception variable
            catch (Method method)
            {
                throw method;
            }
            try
            {
                if (method instanceof Error)
                {
                    throw (Error)method;
                }
            }
            // Misplaced declaration of an exception variable
            catch (Method method)
            {
                throw method;
            }
            throw new RuntimeException(z[0], method);
        }
        return method;
    }

    private static Method a(Class class1, String s, Class aclass[])
    {
        try
        {
            aclass = class1.getMethod(s, aclass);
        }
        // Misplaced declaration of an exception variable
        catch (Class aclass[])
        {
            throw new RuntimeException((new StringBuilder()).append(z[4]).append(class1.getName()).append(z[6]).append(s).append(z[5]).toString(), aclass);
        }
        return aclass;
    }

    static Map a(d8 d8_1)
    {
        return d8_1.b();
    }

    static Object b(Method method, Object obj, Object aobj[])
    {
        return a(method, obj, aobj);
    }

    static Method b(Class class1, String s, Class aclass[])
    {
        return a(class1, s, aclass);
    }

    private Map b()
    {
        int i = d9.c;
        TreeMap treemap = new TreeMap();
        Iterator iterator = aH.a(e()).f().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            fR fr = (fR)iterator.next();
            if (fr.e())
            {
                List list = (List)a(fr);
                try
                {
                    if (!list.isEmpty())
                    {
                        treemap.put(fr, list);
                    }
                }
                catch (UnsupportedOperationException unsupportedoperationexception)
                {
                    throw unsupportedoperationexception;
                }
                if (i == 0)
                {
                    continue;
                }
            }
            try
            {
                if (b(fr))
                {
                    treemap.put(fr, a(fr));
                }
            }
            catch (UnsupportedOperationException unsupportedoperationexception1)
            {
                throw unsupportedoperationexception1;
            }
        } while (i == 0);
        return treemap;
    }

    static void c()
    {
        d = true;
    }

    public int a(fR fr)
    {
        return aH.a(e(), fr).a(this);
    }

    protected abstract eh a(b4 b4);

    public Object a(fR fr)
    {
        return aH.a(e(), fr).c(this);
    }

    public Object a(fR fr, int i)
    {
        return aH.a(e(), fr).a(this, i);
    }

    public Map a()
    {
        return Collections.unmodifiableMap(b());
    }

    protected boolean a(eL el, fz fz1, z z1, int i)
    {
        return fz1.a(i, el);
    }

    public cP b()
    {
        return aH.a(e());
    }

    public fn b()
    {
        throw new UnsupportedOperationException(z[3]);
    }

    public boolean b(fR fr)
    {
        return aH.a(e(), fr).b(this);
    }

    public bR c()
    {
        throw new UnsupportedOperationException(z[2]);
    }

    protected void d()
    {
    }

    public boolean d()
    {
        Iterator iterator;
        int i;
        i = d9.c;
        iterator = b().f().iterator();
_L2:
        fR fr;
        if (!iterator.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        fr = (fR)iterator.next();
        boolean flag;
        try
        {
            flag = fr.i();
        }
        catch (UnsupportedOperationException unsupportedoperationexception)
        {
            try
            {
                throw unsupportedoperationexception;
            }
            catch (UnsupportedOperationException unsupportedoperationexception1)
            {
                throw unsupportedoperationexception1;
            }
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_64;
        }
        if (!b(fr))
        {
            return false;
        }
        boolean flag1;
        try
        {
            if (fr.h() != ap.MESSAGE)
            {
                continue; /* Loop/switch isn't completed */
            }
            flag1 = fr.e();
        }
        catch (UnsupportedOperationException unsupportedoperationexception2)
        {
            throw unsupportedoperationexception2;
        }
        if (flag1)
        {
            Iterator iterator1 = ((List)a(fr)).iterator();
            do
            {
                if (!iterator1.hasNext())
                {
                    break;
                }
                P p = (P)iterator1.next();
                try
                {
                    flag1 = p.d();
                }
                catch (UnsupportedOperationException unsupportedoperationexception3)
                {
                    throw unsupportedoperationexception3;
                }
                if (!flag1)
                {
                    return false;
                }
            } while (i == 0);
            if (i == 0)
            {
                continue; /* Loop/switch isn't completed */
            }
        }
        try
        {
            flag1 = b(fr);
        }
        catch (UnsupportedOperationException unsupportedoperationexception4)
        {
            try
            {
                throw unsupportedoperationexception4;
            }
            catch (UnsupportedOperationException unsupportedoperationexception5)
            {
                throw unsupportedoperationexception5;
            }
        }
        if (!flag1)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (!((P)a(fr)).d())
        {
            return false;
        }
        if (i == 0) goto _L2; else goto _L1
_L1:
        return true;
    }

    protected abstract aH e();

    protected Object writeReplace()
    {
        return new f5(this);
    }

    static 
    {
        Object obj;
        int i;
        int j;
        obj = "/|OG\037\037q^Z\013ZwR\\\n\nfCP\001ZfBM\000\r|\n]\026ZuOQ\n\bs^Z\013ZsI\\\n\taEMO\027w^W\000\036<".toCharArray();
        j = obj.length;
        i = 0;
_L6:
        Object obj1;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        char ac[];
        char c1;
        if (j <= i)
        {
            obj = (new String(((char []) (obj)))).intern();
            obj1 = "9}_S\013\0245^\037\032\tw\nu\016\fs\nM\n\034~O\\\033\023}D\037\033\0252CR\037\026wGZ\001\0162ZM\000\016}IP\003Z\177OL\034\033uO\037\035\037tFZ\f\016{EQA".toCharArray();
            j = obj1.length;
            i = 0;
            break MISSING_BLOCK_LABEL_45;
        }
        c1 = obj[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 316
    //                   0 339
    //                   1 346
    //                   2 353
    //                   3 360;
           goto _L1 _L2 _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_360;
_L1:
        byte0 = 111;
_L7:
        obj[i] = (char)(byte0 ^ c1);
        i++;
          goto _L6
_L2:
        byte0 = 122;
          goto _L7
_L3:
        byte0 = 18;
          goto _L7
_L4:
        byte0 = 42;
          goto _L7
        byte0 = 63;
          goto _L7
_L13:
        byte byte0;
        if (j <= i)
        {
            obj1 = (new String(((char []) (obj1)))).intern();
            obj2 = ".zCLO\023a\nL\032\nbEL\n\0362^PO\030w\nP\031\037`XV\013\036wD\037\r\0032YJ\r\031~KL\034\037a\004".toCharArray();
            j = obj2.length;
            i = 0;
            break MISSING_BLOCK_LABEL_77;
        }
        c1 = obj1[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 408
    //                   0 431
    //                   1 438
    //                   2 445
    //                   3 452;
           goto _L8 _L9 _L10 _L11 _L12
_L12:
        break MISSING_BLOCK_LABEL_452;
_L8:
        byte1 = 111;
_L14:
        obj1[i] = (char)(byte1 ^ c1);
        i++;
          goto _L13
_L9:
        byte1 = 122;
          goto _L14
_L10:
        byte1 = 18;
          goto _L14
_L11:
        byte1 = 42;
          goto _L14
        byte1 = 63;
          goto _L14
_L20:
        byte byte1;
        if (j <= i)
        {
            obj2 = (new String(((char []) (obj2)))).intern();
            obj3 = ".zCLO\023a\nL\032\nbEL\n\0362^PO\030w\nP\031\037`XV\013\036wD\037\r\0032YJ\r\031~KL\034\037a\004".toCharArray();
            j = obj3.length;
            i = 0;
            break MISSING_BLOCK_LABEL_109;
        }
        c1 = obj2[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 500
    //                   0 523
    //                   1 530
    //                   2 537
    //                   3 544;
           goto _L15 _L16 _L17 _L18 _L19
_L19:
        break MISSING_BLOCK_LABEL_544;
_L15:
        byte2 = 111;
_L21:
        obj2[i] = (char)(byte2 ^ c1);
        i++;
          goto _L20
_L16:
        byte2 = 122;
          goto _L21
_L17:
        byte2 = 18;
          goto _L21
_L18:
        byte2 = 42;
          goto _L21
        byte2 = 63;
          goto _L21
_L27:
        byte byte2;
        if (j <= i)
        {
            obj3 = (new String(((char []) (obj3)))).intern();
            obj4 = "=wDZ\035\033fO[O\027wYL\016\035w\n\\\003\033aY\037M".toCharArray();
            j = obj4.length;
            i = 0;
            break MISSING_BLOCK_LABEL_143;
        }
        c1 = obj3[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 592
    //                   0 615
    //                   1 622
    //                   2 629
    //                   3 636;
           goto _L22 _L23 _L24 _L25 _L26
_L26:
        break MISSING_BLOCK_LABEL_636;
_L22:
        byte3 = 111;
_L28:
        obj3[i] = (char)(byte3 ^ c1);
        i++;
          goto _L27
_L23:
        byte3 = 122;
          goto _L28
_L24:
        byte3 = 18;
          goto _L28
_L25:
        byte3 = 42;
          goto _L28
        byte3 = 63;
          goto _L28
_L34:
        byte byte3;
        if (j <= i)
        {
            obj4 = (new String(((char []) (obj4)))).intern();
            obj5 = "X<".toCharArray();
            j = obj5.length;
            i = 0;
            break MISSING_BLOCK_LABEL_179;
        }
        c1 = obj4[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 684
    //                   0 708
    //                   1 715
    //                   2 722
    //                   3 729;
           goto _L29 _L30 _L31 _L32 _L33
_L33:
        break MISSING_BLOCK_LABEL_729;
_L29:
        byte4 = 111;
_L35:
        obj4[i] = (char)(byte4 ^ c1);
        i++;
          goto _L34
_L30:
        byte4 = 122;
          goto _L35
_L31:
        byte4 = 18;
          goto _L35
_L32:
        byte4 = 42;
          goto _L35
        byte4 = 63;
          goto _L35
_L41:
        byte byte4;
        if (j <= i)
        {
            obj5 = (new String(((char []) (obj5)))).intern();
            ac = "X2GV\034\t{DXO\027w^W\000\0362\b".toCharArray();
            j = ac.length;
            i = 0;
            break MISSING_BLOCK_LABEL_215;
        }
        c1 = obj5[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 776
    //                   0 800
    //                   1 807
    //                   2 814
    //                   3 821;
           goto _L36 _L37 _L38 _L39 _L40
_L40:
        break MISSING_BLOCK_LABEL_821;
_L36:
        byte5 = 111;
_L42:
        obj5[i] = (char)(byte5 ^ c1);
        i++;
          goto _L41
_L37:
        byte5 = 122;
          goto _L42
_L38:
        byte5 = 18;
          goto _L42
_L39:
        byte5 = 42;
          goto _L42
        byte5 = 63;
          goto _L42
_L49:
        byte byte5;
        if (j <= i)
        {
            z = (new String[] {
                obj, obj1, obj2, obj3, obj4, obj5, (new String(ac)).intern()
            });
            d = false;
            return;
        }
        c1 = ac[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 868
    //                   0 892
    //                   1 899
    //                   2 906
    //                   3 913;
           goto _L43 _L44 _L45 _L46 _L47
_L44:
        break; /* Loop/switch isn't completed */
_L47:
        break MISSING_BLOCK_LABEL_913;
_L43:
        byte byte6 = 111;
_L50:
        ac[i] = (char)(byte6 ^ c1);
        i++;
        if (true) goto _L49; else goto _L48
_L48:
        byte6 = 122;
          goto _L50
_L45:
        byte6 = 18;
          goto _L50
_L46:
        byte6 = 42;
          goto _L50
        byte6 = 63;
          goto _L50
    }
}
