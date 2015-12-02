// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google:
//            bM, fa, e0, fD, 
//            cR, a3, gq, fl, 
//            eL, d9, O, bv, 
//            ga, gO

final class dk
{

    private static final dk a;
    private static final String z[];
    private final bM b;
    private boolean c;
    private boolean d;

    private dk()
    {
        c = false;
        b = bM.a(16);
    }

    private dk(boolean flag)
    {
        c = false;
        b = bM.a(0);
        f();
    }

    private static int a(e0 e0_1, int k, Object obj)
    {
        int l = fa.a(k);
        k = l;
        if (e0_1 == e0.GROUP)
        {
            k = l * 2;
        }
        return k + a(e0_1, obj);
    }

    private static int a(e0 e0_1, Object obj)
    {
        int k;
        try
        {
            k = fD.b[e0_1.ordinal()];
        }
        // Misplaced declaration of an exception variable
        catch (e0 e0_1)
        {
            throw e0_1;
        }
        k;
        JVM INSTR tableswitch 1 18: default 96
    //                   1 110
    //                   2 126
    //                   3 137
    //                   4 148
    //                   5 159
    //                   6 170
    //                   7 181
    //                   8 192
    //                   9 203
    //                   10 219
    //                   11 227
    //                   12 238
    //                   13 249
    //                   14 260
    //                   15 271
    //                   16 211
    //                   17 282
    //                   18 310;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L17 _L18 _L19
_L1:
        throw new RuntimeException(z[6]);
_L2:
        k = fa.a(((Double)obj).doubleValue());
        return k;
_L3:
        return fa.a(((Float)obj).floatValue());
_L4:
        return fa.c(((Long)obj).longValue());
_L5:
        return fa.l(((Long)obj).longValue());
_L6:
        return fa.d(((Integer)obj).intValue());
_L7:
        return fa.j(((Long)obj).longValue());
_L8:
        return fa.k(((Integer)obj).intValue());
_L9:
        return fa.a(((Boolean)obj).booleanValue());
_L10:
        return fa.a((String)obj);
_L17:
        return fa.b((cR)obj);
_L11:
        return fa.b((a3)obj);
_L12:
        return fa.c(((Integer)obj).intValue());
_L13:
        return fa.p(((Integer)obj).intValue());
_L14:
        return fa.e(((Long)obj).longValue());
_L15:
        return fa.m(((Integer)obj).intValue());
_L16:
        return fa.i(((Long)obj).longValue());
_L18:
        if (!(obj instanceof gq)) goto _L21; else goto _L20
_L20:
        k = fa.a((gq)obj);
        return k;
        e0_1;
        throw e0_1;
_L21:
        return fa.a((cR)obj);
_L19:
        return fa.e(((fl)obj).getNumber());
    }

    static int a(e0 e0_1, boolean flag)
    {
        if (flag)
        {
            return 2;
        } else
        {
            return e0_1.getWireType();
        }
    }

    public static Object a(eL el, e0 e0_1)
    {
        double d1;
        int k;
        try
        {
            k = fD.b[e0_1.ordinal()];
        }
        // Misplaced declaration of an exception variable
        catch (eL el)
        {
            throw el;
        }
        k;
        JVM INSTR tableswitch 1 18: default 100
    //                   1 113
    //                   2 126
    //                   3 134
    //                   4 142
    //                   5 150
    //                   6 158
    //                   7 166
    //                   8 174
    //                   9 182
    //                   10 187
    //                   11 192
    //                   12 200
    //                   13 208
    //                   14 216
    //                   15 224
    //                   16 232
    //                   17 245
    //                   18 258;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L17 _L18 _L19
_L1:
        throw new RuntimeException(z[3]);
_L2:
        d1 = el.m();
        return Double.valueOf(d1);
_L3:
        return Float.valueOf(el.q());
_L4:
        return Long.valueOf(el.i());
_L5:
        return Long.valueOf(el.s());
_L6:
        return Integer.valueOf(el.c());
_L7:
        return Long.valueOf(el.k());
_L8:
        return Integer.valueOf(el.r());
_L9:
        return Boolean.valueOf(el.g());
_L10:
        return el.o();
_L11:
        return el.x();
_L12:
        return Integer.valueOf(el.a());
_L13:
        return Integer.valueOf(el.y());
_L14:
        return Long.valueOf(el.b());
_L15:
        return Integer.valueOf(el.z());
_L16:
        return Long.valueOf(el.j());
_L17:
        throw new IllegalArgumentException(z[5]);
_L18:
        throw new IllegalArgumentException(z[4]);
_L19:
        throw new IllegalArgumentException(z[2]);
    }

    public static void a(O o, Object obj, fa fa1)
    {
        e0 e0_1;
        int i1;
        int j1;
label0:
        {
label1:
            {
                i1 = d9.c;
                e0_1 = o.b();
                j1 = o.c();
                if (!o.e())
                {
                    break label0;
                }
                List list = (List)obj;
                if (o.d())
                {
                    fa1.f(j1, 2);
                    int k = 0;
                    o = list.iterator();
                    int l;
                    do
                    {
                        l = k;
                        if (!o.hasNext())
                        {
                            break;
                        }
                        l = k + a(e0_1, o.next());
                        k = l;
                    } while (i1 == 0);
                    fa1.j(l);
                    o = list.iterator();
                    do
                    {
                        if (!o.hasNext())
                        {
                            break;
                        }
                        a(fa1, e0_1, o.next());
                    } while (i1 == 0);
                    if (i1 == 0)
                    {
                        break label1;
                    }
                }
                o = list.iterator();
                do
                {
                    if (!o.hasNext())
                    {
                        break;
                    }
                    a(fa1, e0_1, j1, o.next());
                } while (i1 == 0);
            }
            if (i1 == 0)
            {
                break MISSING_BLOCK_LABEL_228;
            }
        }
        boolean flag = obj instanceof gq;
        if (flag)
        {
            try
            {
                a(fa1, e0_1, j1, ((gq)obj).c());
            }
            // Misplaced declaration of an exception variable
            catch (O o)
            {
                throw o;
            }
            if (i1 == 0)
            {
                break MISSING_BLOCK_LABEL_228;
            }
        }
        a(fa1, e0_1, j1, obj);
        return;
        o;
        throw o;
    }

    private static void a(fa fa1, e0 e0_1, int k, Object obj)
    {
        e0 e0_2;
        try
        {
            e0_2 = e0.GROUP;
        }
        // Misplaced declaration of an exception variable
        catch (fa fa1)
        {
            try
            {
                throw fa1;
            }
            // Misplaced declaration of an exception variable
            catch (fa fa1)
            {
                throw fa1;
            }
        }
        if (e0_1 != e0_2)
        {
            break MISSING_BLOCK_LABEL_26;
        }
        fa1.b(k, (cR)obj);
        if (d9.c == 0)
        {
            break MISSING_BLOCK_LABEL_49;
        }
        fa1.f(k, a(e0_1, false));
        a(fa1, e0_1, obj);
        return;
    }

    private static void a(fa fa1, e0 e0_1, Object obj)
    {
        int k = d9.c;
        int l = fD.b[e0_1.ordinal()];
        l;
        JVM INSTR tableswitch 1 18: default 104
    //                   1 105
    //                   2 120
    //                   3 135
    //                   4 150
    //                   5 165
    //                   6 180
    //                   7 195
    //                   8 210
    //                   9 225
    //                   10 261
    //                   11 273
    //                   12 288
    //                   13 303
    //                   14 318
    //                   15 333
    //                   16 237
    //                   17 249
    //                   18 348;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L17 _L18 _L19
_L1:
        return;
_L2:
        fa1.b(((Double)obj).doubleValue());
        if (k == 0) goto _L1; else goto _L3
_L3:
        fa1.b(((Float)obj).floatValue());
        if (k == 0) goto _L1; else goto _L4
_L4:
        fa1.d(((Long)obj).longValue());
        if (k == 0) goto _L1; else goto _L5
_L5:
        fa1.h(((Long)obj).longValue());
        if (k == 0) goto _L1; else goto _L6
_L6:
        fa1.g(((Integer)obj).intValue());
        if (k == 0) goto _L1; else goto _L7
_L7:
        fa1.a(((Long)obj).longValue());
        if (k == 0) goto _L1; else goto _L8
_L8:
        fa1.f(((Integer)obj).intValue());
        if (k == 0) goto _L1; else goto _L9
_L9:
        fa1.b(((Boolean)obj).booleanValue());
        if (k == 0) goto _L1; else goto _L10
_L10:
        fa1.b((String)obj);
        if (k == 0) goto _L1; else goto _L17
_L17:
        fa1.c((cR)obj);
        if (k == 0) goto _L1; else goto _L18
_L18:
        fa1.d((cR)obj);
        if (k == 0) goto _L1; else goto _L11
_L11:
        fa1.c((a3)obj);
        if (k == 0) goto _L1; else goto _L12
_L12:
        fa1.n(((Integer)obj).intValue());
        if (k == 0) goto _L1; else goto _L13
_L13:
        fa1.i(((Integer)obj).intValue());
        if (k == 0) goto _L1; else goto _L14
_L14:
        fa1.g(((Long)obj).longValue());
        if (k == 0) goto _L1; else goto _L15
_L15:
        fa1.l(((Integer)obj).intValue());
        if (k == 0) goto _L1; else goto _L16
_L16:
        try
        {
            fa1.m(((Long)obj).longValue());
        }
        // Misplaced declaration of an exception variable
        catch (fa fa1)
        {
            throw fa1;
        }
        if (k == 0) goto _L1; else goto _L19
_L19:
        fa1.r(((fl)obj).getNumber());
        return;
        fa1;
        try
        {
            throw fa1;
        }
        // Misplaced declaration of an exception variable
        catch (fa fa1) { }
        try
        {
            throw fa1;
        }
        // Misplaced declaration of an exception variable
        catch (fa fa1) { }
        try
        {
            throw fa1;
        }
        // Misplaced declaration of an exception variable
        catch (fa fa1) { }
        try
        {
            throw fa1;
        }
        // Misplaced declaration of an exception variable
        catch (fa fa1) { }
        try
        {
            throw fa1;
        }
        // Misplaced declaration of an exception variable
        catch (fa fa1) { }
        try
        {
            throw fa1;
        }
        // Misplaced declaration of an exception variable
        catch (fa fa1) { }
        try
        {
            throw fa1;
        }
        // Misplaced declaration of an exception variable
        catch (fa fa1) { }
        try
        {
            throw fa1;
        }
        // Misplaced declaration of an exception variable
        catch (fa fa1) { }
        try
        {
            throw fa1;
        }
        // Misplaced declaration of an exception variable
        catch (fa fa1) { }
        try
        {
            throw fa1;
        }
        // Misplaced declaration of an exception variable
        catch (fa fa1) { }
        try
        {
            throw fa1;
        }
        // Misplaced declaration of an exception variable
        catch (fa fa1) { }
        try
        {
            throw fa1;
        }
        // Misplaced declaration of an exception variable
        catch (fa fa1) { }
        try
        {
            throw fa1;
        }
        // Misplaced declaration of an exception variable
        catch (fa fa1) { }
        try
        {
            throw fa1;
        }
        // Misplaced declaration of an exception variable
        catch (fa fa1) { }
        try
        {
            throw fa1;
        }
        // Misplaced declaration of an exception variable
        catch (fa fa1) { }
        try
        {
            throw fa1;
        }
        // Misplaced declaration of an exception variable
        catch (fa fa1) { }
        throw fa1;
    }

    private void a(java.util.Map.Entry entry)
    {
        int k = d9.c;
        O o = (O)entry.getKey();
        entry = ((java.util.Map.Entry) (entry.getValue()));
        if (entry instanceof gq)
        {
            entry = ((gq)entry).c();
        }
        if (!o.e())
        {
            break MISSING_BLOCK_LABEL_100;
        }
        Object obj = c(o);
        if (obj == null)
        {
            bv bv1;
            try
            {
                b.a(o, new ArrayList((List)entry));
            }
            // Misplaced declaration of an exception variable
            catch (java.util.Map.Entry entry)
            {
                throw entry;
            }
            if (k == 0)
            {
                break MISSING_BLOCK_LABEL_95;
            }
        }
        ((List)obj).addAll((List)entry);
        if (k == 0)
        {
            break MISSING_BLOCK_LABEL_191;
        }
        try
        {
            obj = o.a();
            bv1 = bv.MESSAGE;
        }
        // Misplaced declaration of an exception variable
        catch (java.util.Map.Entry entry)
        {
            throw entry;
        }
        if (obj != bv1)
        {
            break MISSING_BLOCK_LABEL_181;
        }
        obj = c(o);
        if (obj == null)
        {
            try
            {
                b.a(o, entry);
            }
            // Misplaced declaration of an exception variable
            catch (java.util.Map.Entry entry)
            {
                throw entry;
            }
            if (k == 0)
            {
                break MISSING_BLOCK_LABEL_176;
            }
        }
        b.a(o, o.a(((cR)obj).c(), (cR)entry).a());
        if (k == 0)
        {
            break MISSING_BLOCK_LABEL_191;
        }
        b.a(o, entry);
        return;
        entry;
        throw entry;
    }

    private void a(java.util.Map.Entry entry, fa fa1)
    {
        O o = (O)entry.getKey();
        bv bv1;
        bv bv2;
        boolean flag;
        try
        {
            bv1 = o.a();
            bv2 = bv.MESSAGE;
        }
        // Misplaced declaration of an exception variable
        catch (java.util.Map.Entry entry)
        {
            try
            {
                throw entry;
            }
            // Misplaced declaration of an exception variable
            catch (java.util.Map.Entry entry) { }
            try
            {
                throw entry;
            }
            // Misplaced declaration of an exception variable
            catch (java.util.Map.Entry entry) { }
            try
            {
                throw entry;
            }
            // Misplaced declaration of an exception variable
            catch (java.util.Map.Entry entry)
            {
                throw entry;
            }
        }
        if (bv1 != bv2)
        {
            break MISSING_BLOCK_LABEL_89;
        }
        flag = o.e();
        if (flag)
        {
            break MISSING_BLOCK_LABEL_89;
        }
        flag = o.d();
        if (flag)
        {
            break MISSING_BLOCK_LABEL_89;
        }
        fa1.e(((O)entry.getKey()).c(), (cR)entry.getValue());
        if (d9.c == 0)
        {
            break MISSING_BLOCK_LABEL_100;
        }
        a(o, entry.getValue(), fa1);
    }

    private void a(Map map, java.util.Map.Entry entry)
    {
        O o = (O)entry.getKey();
        entry = ((java.util.Map.Entry) (entry.getValue()));
        boolean flag;
        try
        {
            flag = entry instanceof gq;
        }
        // Misplaced declaration of an exception variable
        catch (Map map)
        {
            try
            {
                throw map;
            }
            // Misplaced declaration of an exception variable
            catch (Map map)
            {
                throw map;
            }
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_49;
        }
        map.put(o, ((gq)entry).c());
        if (d9.c == 0)
        {
            break MISSING_BLOCK_LABEL_65;
        }
        map.put(o, entry);
        return;
    }

    public static int b(O o, Object obj)
    {
        e0 e0_1;
        int i1;
        int j1;
        int k1;
        i1 = 0;
        int k = 0;
        j1 = d9.c;
        e0_1 = o.b();
        k1 = o.c();
        boolean flag;
        try
        {
            if (!o.e())
            {
                break MISSING_BLOCK_LABEL_167;
            }
            flag = o.d();
        }
        // Misplaced declaration of an exception variable
        catch (O o)
        {
            throw o;
        }
        if (!flag) goto _L2; else goto _L1
_L1:
        o = ((List)obj).iterator();
        do
        {
            i1 = k;
            if (!o.hasNext())
            {
                break;
            }
            i1 = k + a(e0_1, o.next());
            k = i1;
        } while (j1 == 0);
        k = fa.a(k1);
        i1 = fa.b(i1) + (k + i1);
_L4:
        return i1;
_L2:
        int l;
        o = ((List)obj).iterator();
        l = i1;
_L6:
        i1 = l;
        if (!o.hasNext()) goto _L4; else goto _L3
_L3:
        i1 = l + a(e0_1, k1, o.next());
        l = i1;
        if (j1 == 0) goto _L6; else goto _L5
_L5:
        return i1;
        return a(e0_1, k1, obj);
    }

    private static void b(e0 e0_1, Object obj)
    {
        int k;
        boolean flag1;
        flag1 = false;
        k = d9.c;
        if (obj == null)
        {
            try
            {
                throw new NullPointerException();
            }
            // Misplaced declaration of an exception variable
            catch (e0 e0_1)
            {
                throw e0_1;
            }
        }
        fD.a[e0_1.getJavaType().ordinal()];
        JVM INSTR tableswitch 1 9: default 84
    //                   1 108
    //                   2 117
    //                   3 126
    //                   4 135
    //                   5 144
    //                   6 153
    //                   7 162
    //                   8 171
    //                   9 180;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10
_L1:
        boolean flag = flag1;
_L14:
        if (!flag)
        {
            try
            {
                throw new IllegalArgumentException(z[9]);
            }
            // Misplaced declaration of an exception variable
            catch (e0 e0_1)
            {
                throw e0_1;
            }
        } else
        {
            return;
        }
_L2:
        flag = obj instanceof Integer;
        if (k == 0)
        {
            continue; /* Loop/switch isn't completed */
        }
_L3:
        flag = obj instanceof Long;
        if (k == 0)
        {
            continue; /* Loop/switch isn't completed */
        }
_L4:
        flag = obj instanceof Float;
        if (k == 0)
        {
            continue; /* Loop/switch isn't completed */
        }
_L5:
        flag = obj instanceof Double;
        if (k == 0)
        {
            continue; /* Loop/switch isn't completed */
        }
_L6:
        flag = obj instanceof Boolean;
        if (k == 0)
        {
            continue; /* Loop/switch isn't completed */
        }
_L7:
        flag = obj instanceof String;
        if (k == 0)
        {
            continue; /* Loop/switch isn't completed */
        }
_L8:
        flag = obj instanceof a3;
        if (k == 0)
        {
            continue; /* Loop/switch isn't completed */
        }
_L9:
        flag = obj instanceof fl;
        if (k == 0)
        {
            continue; /* Loop/switch isn't completed */
        }
_L10:
        try
        {
            flag = obj instanceof cR;
        }
        // Misplaced declaration of an exception variable
        catch (e0 e0_1)
        {
            try
            {
                throw e0_1;
            }
            // Misplaced declaration of an exception variable
            catch (e0 e0_1)
            {
                throw e0_1;
            }
        }
        if (flag) goto _L12; else goto _L11
_L11:
        flag = flag1;
        if (!(obj instanceof gq))
        {
            continue; /* Loop/switch isn't completed */
        }
_L12:
        flag = true;
        if (true) goto _L14; else goto _L13
_L13:
    }

    private boolean b(java.util.Map.Entry entry)
    {
        int k = d9.c;
        O o = (O)entry.getKey();
        boolean flag;
        try
        {
            if (o.a() != bv.MESSAGE)
            {
                break MISSING_BLOCK_LABEL_173;
            }
            flag = o.e();
        }
        // Misplaced declaration of an exception variable
        catch (java.util.Map.Entry entry)
        {
            throw entry;
        }
        if (flag)
        {
            Iterator iterator = ((List)entry.getValue()).iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                cR cr = (cR)iterator.next();
                try
                {
                    flag = cr.d();
                }
                // Misplaced declaration of an exception variable
                catch (java.util.Map.Entry entry)
                {
                    throw entry;
                }
                if (!flag)
                {
                    return false;
                }
            } while (k == 0);
            if (k == 0)
            {
                break MISSING_BLOCK_LABEL_173;
            }
        }
        entry = ((java.util.Map.Entry) (entry.getValue()));
        try
        {
            flag = entry instanceof cR;
        }
        // Misplaced declaration of an exception variable
        catch (java.util.Map.Entry entry)
        {
            try
            {
                throw entry;
            }
            // Misplaced declaration of an exception variable
            catch (java.util.Map.Entry entry)
            {
                throw entry;
            }
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_143;
        }
        if (!((cR)entry).d())
        {
            return false;
        }
        break MISSING_BLOCK_LABEL_173;
        boolean flag1;
        try
        {
            flag1 = entry instanceof gq;
        }
        // Misplaced declaration of an exception variable
        catch (java.util.Map.Entry entry)
        {
            throw entry;
        }
        if (flag1)
        {
            return true;
        } else
        {
            throw new IllegalArgumentException(z[8]);
        }
        return true;
    }

    private int c(java.util.Map.Entry entry)
    {
        O o;
        Object obj;
        o = (O)entry.getKey();
        obj = entry.getValue();
        bv bv1;
        bv bv2;
        int k;
        boolean flag;
        try
        {
            bv1 = o.a();
            bv2 = bv.MESSAGE;
        }
        // Misplaced declaration of an exception variable
        catch (java.util.Map.Entry entry)
        {
            try
            {
                throw entry;
            }
            // Misplaced declaration of an exception variable
            catch (java.util.Map.Entry entry) { }
            try
            {
                throw entry;
            }
            // Misplaced declaration of an exception variable
            catch (java.util.Map.Entry entry) { }
            try
            {
                throw entry;
            }
            // Misplaced declaration of an exception variable
            catch (java.util.Map.Entry entry)
            {
                throw entry;
            }
        }
        if (bv1 != bv2)
        {
            break MISSING_BLOCK_LABEL_130;
        }
        flag = o.e();
        if (flag)
        {
            break MISSING_BLOCK_LABEL_130;
        }
        flag = o.d();
        if (flag)
        {
            break MISSING_BLOCK_LABEL_130;
        }
        if (!(obj instanceof gq))
        {
            break MISSING_BLOCK_LABEL_108;
        }
        k = fa.b(((O)entry.getKey()).c(), (gq)obj);
        return k;
        return fa.a(((O)entry.getKey()).c(), (cR)obj);
        return b(o, obj);
    }

    public static dk c()
    {
        return a;
    }

    public static dk g()
    {
        return new dk();
    }

    public Object a(O o, int k)
    {
        try
        {
            if (!o.e())
            {
                throw new IllegalArgumentException(z[1]);
            }
        }
        // Misplaced declaration of an exception variable
        catch (O o)
        {
            throw o;
        }
        o = ((O) (c(o)));
        if (o == null)
        {
            try
            {
                throw new IndexOutOfBoundsException();
            }
            // Misplaced declaration of an exception variable
            catch (O o)
            {
                throw o;
            }
        } else
        {
            return ((List)o).get(k);
        }
    }

    public Map a()
    {
label0:
        {
            int l = d9.c;
            if (c)
            {
                bM bm = bM.a(16);
                int k = 0;
                do
                {
                    if (k >= b.f())
                    {
                        break;
                    }
                    a(((Map) (bm)), b.c(k));
                    k++;
                } while (l == 0);
                Iterator iterator = b.c().iterator();
                do
                {
                    if (!iterator.hasNext())
                    {
                        break;
                    }
                    a(((Map) (bm)), (java.util.Map.Entry)iterator.next());
                } while (l == 0);
                try
                {
                    if (b.g())
                    {
                        bm.d();
                    }
                }
                catch (IllegalArgumentException illegalargumentexception)
                {
                    throw illegalargumentexception;
                }
                return bm;
            }
            bM bm1;
            try
            {
                if (!b.g())
                {
                    break label0;
                }
                bm1 = b;
            }
            catch (IllegalArgumentException illegalargumentexception1)
            {
                throw illegalargumentexception1;
            }
            return bm1;
        }
        return Collections.unmodifiableMap(b);
    }

    public void a(O o, Object obj)
    {
        Object obj1;
        try
        {
            if (!o.e())
            {
                throw new IllegalArgumentException(z[7]);
            }
        }
        // Misplaced declaration of an exception variable
        catch (O o)
        {
            throw o;
        }
        b(o.b(), obj);
        obj1 = c(o);
        if (obj1 != null) goto _L2; else goto _L1
_L1:
        ArrayList arraylist;
        arraylist = new ArrayList();
        b.a(o, arraylist);
        if (d9.c == 0) goto _L3; else goto _L2
_L2:
        o = (List)obj1;
_L5:
        o.add(obj);
        return;
_L3:
        o = arraylist;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public void a(dk dk1)
    {
        int l = d9.c;
        int k = 0;
        do
        {
            if (k >= dk1.b.f())
            {
                break;
            }
            a(dk1.b.c(k));
            k++;
        } while (l == 0);
        dk1 = dk1.b.c().iterator();
        do
        {
            if (!dk1.hasNext())
            {
                break;
            }
            a((java.util.Map.Entry)dk1.next());
        } while (l == 0);
    }

    public void a(fa fa1)
    {
        int l = d9.c;
        int k = 0;
        do
        {
            if (k >= b.f())
            {
                break;
            }
            a(b.c(k), fa1);
            k++;
        } while (l == 0);
        Iterator iterator = b.c().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            a((java.util.Map.Entry)iterator.next(), fa1);
        } while (l == 0);
    }

    public boolean a(O o)
    {
        try
        {
            if (o.e())
            {
                throw new IllegalArgumentException(z[11]);
            }
        }
        // Misplaced declaration of an exception variable
        catch (O o)
        {
            throw o;
        }
        try
        {
            o = ((O) (b.get(o)));
        }
        // Misplaced declaration of an exception variable
        catch (O o)
        {
            throw o;
        }
        return o != null;
    }

    public int b(O o)
    {
        try
        {
            if (!o.e())
            {
                throw new IllegalArgumentException(z[10]);
            }
        }
        // Misplaced declaration of an exception variable
        catch (O o)
        {
            throw o;
        }
        o = ((O) (c(o)));
        if (o == null)
        {
            return 0;
        } else
        {
            return ((List)o).size();
        }
    }

    public void b(fa fa1)
    {
        int l = d9.c;
        int k = 0;
        do
        {
label0:
            {
                if (k < b.f())
                {
                    java.util.Map.Entry entry = b.c(k);
                    a((O)entry.getKey(), entry.getValue(), fa1);
                    if (l == 0)
                    {
                        break label0;
                    }
                }
                Iterator iterator = b.c().iterator();
                do
                {
                    if (!iterator.hasNext())
                    {
                        break;
                    }
                    java.util.Map.Entry entry1 = (java.util.Map.Entry)iterator.next();
                    a((O)entry1.getKey(), entry1.getValue(), fa1);
                } while (l == 0);
                return;
            }
            k++;
        } while (true);
    }

    public boolean b()
    {
        int k;
        int l;
        l = d9.c;
        k = 0;
_L4:
        if (k >= b.f())
        {
            break; /* Loop/switch isn't completed */
        }
        boolean flag;
        try
        {
            flag = b(b.c(k));
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            throw illegalargumentexception;
        }
        if (flag) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        k++;
        if (l == 0) goto _L4; else goto _L3
_L3:
        Iterator iterator = b.c().iterator();
_L7:
        if (!iterator.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
        boolean flag1;
        try
        {
            flag1 = b(entry);
        }
        catch (IllegalArgumentException illegalargumentexception1)
        {
            throw illegalargumentexception1;
        }
        if (!flag1) goto _L1; else goto _L5
_L5:
        if (l == 0) goto _L7; else goto _L6
_L6:
        return true;
    }

    public Object c(O o)
    {
        Object obj = b.get(o);
        o = ((O) (obj));
        try
        {
            if (obj instanceof gq)
            {
                o = ((gq)obj).c();
            }
        }
        // Misplaced declaration of an exception variable
        catch (O o)
        {
            throw o;
        }
        return o;
    }

    public void c(O o, Object obj)
    {
        int k = d9.c;
        boolean flag = o.e();
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_112;
        }
        try
        {
            if (!(obj instanceof List))
            {
                throw new IllegalArgumentException(z[0]);
            }
        }
        // Misplaced declaration of an exception variable
        catch (O o)
        {
            throw o;
        }
        break MISSING_BLOCK_LABEL_44;
        o;
        throw o;
        ArrayList arraylist = new ArrayList();
        arraylist.addAll((List)obj);
        obj = arraylist.iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            Object obj1 = ((Iterator) (obj)).next();
            b(o.b(), obj1);
        } while (k == 0);
        obj = arraylist;
        if (k == 0)
        {
            break MISSING_BLOCK_LABEL_122;
        }
        obj = arraylist;
        try
        {
            b(o.b(), obj);
        }
        // Misplaced declaration of an exception variable
        catch (O o)
        {
            throw o;
        }
        try
        {
            if (obj instanceof gq)
            {
                c = true;
            }
        }
        // Misplaced declaration of an exception variable
        catch (O o)
        {
            throw o;
        }
        b.a(o, obj);
        return;
    }

    public Object clone()
    {
        return h();
    }

    public int d()
    {
        int j1 = d9.c;
        int i1 = 0;
        int k = 0;
        do
        {
label0:
            {
                int l = k;
                if (i1 < b.f())
                {
                    java.util.Map.Entry entry = b.c(i1);
                    k += b((O)entry.getKey(), entry.getValue());
                    if (j1 == 0)
                    {
                        break label0;
                    }
                    l = k;
                }
                Iterator iterator = b.c().iterator();
                do
                {
                    k = l;
                    if (!iterator.hasNext())
                    {
                        break;
                    }
                    java.util.Map.Entry entry1 = (java.util.Map.Entry)iterator.next();
                    k = l + b((O)entry1.getKey(), entry1.getValue());
                    l = k;
                } while (j1 == 0);
                return k;
            }
            i1++;
        } while (true);
    }

    public boolean e()
    {
        return d;
    }

    public void f()
    {
        boolean flag;
        try
        {
            flag = d;
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            throw illegalargumentexception;
        }
        if (flag)
        {
            return;
        } else
        {
            b.d();
            d = true;
            return;
        }
    }

    public dk h()
    {
        int l = d9.c;
        dk dk1 = g();
        int k = 0;
        do
        {
label0:
            {
                if (k < b.f())
                {
                    java.util.Map.Entry entry = b.c(k);
                    dk1.c((O)entry.getKey(), entry.getValue());
                    if (l == 0)
                    {
                        break label0;
                    }
                }
                Iterator iterator = b.c().iterator();
                do
                {
                    if (!iterator.hasNext())
                    {
                        break;
                    }
                    java.util.Map.Entry entry1 = (java.util.Map.Entry)iterator.next();
                    dk1.c((O)entry1.getKey(), entry1.getValue());
                } while (l == 0);
                dk1.c = c;
                return dk1;
            }
            k++;
        } while (true);
    }

    public int i()
    {
        int i1 = 0;
        int j1 = d9.c;
        int k = 0;
        int l;
        do
        {
            l = k;
            if (i1 >= b.f())
            {
                break;
            }
            l = k + c(b.c(i1));
            i1++;
            k = l;
        } while (j1 == 0);
        Iterator iterator = b.c().iterator();
        do
        {
            k = l;
            if (!iterator.hasNext())
            {
                break;
            }
            k = l + c((java.util.Map.Entry)iterator.next());
            l = k;
        } while (j1 == 0);
        return k;
    }

    public Iterator j()
    {
label0:
        {
            gO go;
            try
            {
                if (!c)
                {
                    break label0;
                }
                go = new gO(b.entrySet().iterator());
            }
            catch (IllegalArgumentException illegalargumentexception)
            {
                throw illegalargumentexception;
            }
            return go;
        }
        return b.entrySet().iterator();
    }

    static 
    {
        Object obj;
        int k;
        int l;
        obj = "9qAi-NlLm/\rw\016s3\036f\016r9\013g\016p#\032k\016w8\001wAd%\002#Cb9\035bIbj\034fHk/\rwGh$@".toCharArray();
        l = obj.length;
        k = 0;
_L6:
        Object obj1;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        Object obj8;
        Object obj9;
        Object obj10;
        char ac[];
        char c1;
        if (l <= k)
        {
            obj = (new String(((char []) (obj)))).intern();
            obj1 = "\tfZU/\036fOs/\nEGb&\n+\007')\017m\016h$\002z\016e/N`Ok&\013g\016h$NqKw/\017wKcj\bjKk.\035-".toCharArray();
            l = obj1.length;
            k = 0;
            break MISSING_BLOCK_LABEL_45;
        }
        c1 = obj[k];
        k % 5;
        JVM INSTR tableswitch 0 3: default 536
    //                   0 559
    //                   1 566
    //                   2 572
    //                   3 579;
           goto _L1 _L2 _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_579;
_L1:
        byte0 = 74;
_L7:
        obj[k] = (char)(byte0 ^ c1);
        k++;
          goto _L6
_L2:
        byte0 = 110;
          goto _L7
_L3:
        byte0 = 3;
          goto _L7
_L4:
        byte0 = 46;
          goto _L7
        byte0 = 7;
          goto _L7
_L13:
        byte byte0;
        if (l <= k)
        {
            obj1 = (new String(((char []) (obj1)))).intern();
            obj2 = "\034fOc\032\034jCn>\007uKA#\013oJ/cN`Oi$\001w\016o+\000gBbj\013m[j9@".toCharArray();
            l = obj2.length;
            k = 0;
            break MISSING_BLOCK_LABEL_77;
        }
        c1 = obj1[k];
        k % 5;
        JVM INSTR tableswitch 0 3: default 628
    //                   0 651
    //                   1 658
    //                   2 664
    //                   3 671;
           goto _L8 _L9 _L10 _L11 _L12
_L12:
        break MISSING_BLOCK_LABEL_671;
_L8:
        byte1 = 74;
_L14:
        obj1[k] = (char)(byte1 ^ c1);
        k++;
          goto _L13
_L9:
        byte1 = 110;
          goto _L14
_L10:
        byte1 = 3;
          goto _L14
_L11:
        byte1 = 46;
          goto _L14
        byte1 = 7;
          goto _L14
_L20:
        byte byte1;
        if (l <= k)
        {
            obj2 = (new String(((char []) (obj2)))).intern();
            obj3 = ":kKu/Nj]'$\001#Yf3NwA'-\013w\016o/\034f\002'(\033w\016s\"\013#Mh'\036jBb8NwFn$\005p\016h>\006f\\p#\035f\0".toCharArray();
            l = obj3.length;
            k = 0;
            break MISSING_BLOCK_LABEL_109;
        }
        c1 = obj2[k];
        k % 5;
        JVM INSTR tableswitch 0 3: default 720
    //                   0 743
    //                   1 750
    //                   2 756
    //                   3 763;
           goto _L15 _L16 _L17 _L18 _L19
_L19:
        break MISSING_BLOCK_LABEL_763;
_L15:
        byte2 = 74;
_L21:
        obj2[k] = (char)(byte2 ^ c1);
        k++;
          goto _L20
_L16:
        byte2 = 110;
          goto _L21
_L17:
        byte2 = 3;
          goto _L21
_L18:
        byte2 = 46;
          goto _L21
        byte2 = 7;
          goto _L21
_L27:
        byte byte2;
        if (l <= k)
        {
            obj3 = (new String(((char []) (obj3)))).intern();
            obj4 = "\034fOc\032\034jCn>\007uKA#\013oJ/cN`Oi$\001w\016o+\000gBbj\013nLb.\nfJ''\013p]f-\013p\0".toCharArray();
            l = obj4.length;
            k = 0;
            break MISSING_BLOCK_LABEL_143;
        }
        c1 = obj3[k];
        k % 5;
        JVM INSTR tableswitch 0 3: default 812
    //                   0 835
    //                   1 842
    //                   2 848
    //                   3 855;
           goto _L22 _L23 _L24 _L25 _L26
_L26:
        break MISSING_BLOCK_LABEL_855;
_L22:
        byte3 = 74;
_L28:
        obj3[k] = (char)(byte3 ^ c1);
        k++;
          goto _L27
_L23:
        byte3 = 110;
          goto _L28
_L24:
        byte3 = 3;
          goto _L28
_L25:
        byte3 = 46;
          goto _L28
        byte3 = 7;
          goto _L28
_L34:
        byte byte3;
        if (l <= k)
        {
            obj4 = (new String(((char []) (obj4)))).intern();
            obj5 = "\034fOc\032\034jCn>\007uKA#\013oJ/cN`Oi$\001w\016o+\000gBbj\000f]s/\n#Iu%\033s])".toCharArray();
            l = obj5.length;
            k = 0;
            break MISSING_BLOCK_LABEL_179;
        }
        c1 = obj4[k];
        k % 5;
        JVM INSTR tableswitch 0 3: default 904
    //                   0 928
    //                   1 935
    //                   2 941
    //                   3 948;
           goto _L29 _L30 _L31 _L32 _L33
_L33:
        break MISSING_BLOCK_LABEL_948;
_L29:
        byte4 = 74;
_L35:
        obj4[k] = (char)(byte4 ^ c1);
        k++;
          goto _L34
_L30:
        byte4 = 110;
          goto _L35
_L31:
        byte4 = 3;
          goto _L35
_L32:
        byte4 = 46;
          goto _L35
        byte4 = 7;
          goto _L35
_L41:
        byte byte4;
        if (l <= k)
        {
            obj5 = (new String(((char []) (obj5)))).intern();
            obj6 = ":kKu/Nj]'$\001#Yf3NwA'-\013w\016o/\034f\002'(\033w\016s\"\013#Mh'\036jBb8NwFn$\005p\016h>\006f\\p#\035f\0".toCharArray();
            l = obj6.length;
            k = 0;
            break MISSING_BLOCK_LABEL_215;
        }
        c1 = obj5[k];
        k % 5;
        JVM INSTR tableswitch 0 3: default 996
    //                   0 1020
    //                   1 1027
    //                   2 1033
    //                   3 1040;
           goto _L36 _L37 _L38 _L39 _L40
_L40:
        break MISSING_BLOCK_LABEL_1040;
_L36:
        byte5 = 74;
_L42:
        obj5[k] = (char)(byte5 ^ c1);
        k++;
          goto _L41
_L37:
        byte5 = 110;
          goto _L42
_L38:
        byte5 = 3;
          goto _L42
_L39:
        byte5 = 46;
          goto _L42
        byte5 = 7;
          goto _L42
_L48:
        byte byte5;
        if (l <= k)
        {
            obj6 = (new String(((char []) (obj6)))).intern();
            obj7 = "\017gJU/\036fOs/\nEGb&\n+\007')\017m\016h$\002z\016e/N`Ok&\013g\016h$NqKw/\017wKcj\bjKk.\035-".toCharArray();
            l = obj7.length;
            k = 0;
            break MISSING_BLOCK_LABEL_251;
        }
        c1 = obj6[k];
        k % 5;
        JVM INSTR tableswitch 0 3: default 1088
    //                   0 1112
    //                   1 1119
    //                   2 1125
    //                   3 1132;
           goto _L43 _L44 _L45 _L46 _L47
_L47:
        break MISSING_BLOCK_LABEL_1132;
_L43:
        byte6 = 74;
_L49:
        obj6[k] = (char)(byte6 ^ c1);
        k++;
          goto _L48
_L44:
        byte6 = 110;
          goto _L49
_L45:
        byte6 = 3;
          goto _L49
_L46:
        byte6 = 46;
          goto _L49
        byte6 = 7;
          goto _L49
_L55:
        byte byte6;
        if (l <= k)
        {
            obj7 = (new String(((char []) (obj7)))).intern();
            obj8 = "9qAi-NlLm/\rw\016s3\036f\016r9\013g\016p#\032k\016w8\001wAd%\002#Cb9\035bIbj\034fHk/\rwGh$@".toCharArray();
            l = obj8.length;
            k = 0;
            break MISSING_BLOCK_LABEL_287;
        }
        c1 = obj7[k];
        k % 5;
        JVM INSTR tableswitch 0 3: default 1180
    //                   0 1204
    //                   1 1211
    //                   2 1217
    //                   3 1224;
           goto _L50 _L51 _L52 _L53 _L54
_L54:
        break MISSING_BLOCK_LABEL_1224;
_L50:
        byte7 = 74;
_L56:
        obj7[k] = (char)(byte7 ^ c1);
        k++;
          goto _L55
_L51:
        byte7 = 110;
          goto _L56
_L52:
        byte7 = 3;
          goto _L56
_L53:
        byte7 = 46;
          goto _L56
        byte7 = 7;
          goto _L56
_L62:
        byte byte7;
        if (l <= k)
        {
            obj8 = (new String(((char []) (obj8)))).intern();
            obj9 = "9qAi-NlLm/\rw\016s3\036f\016r9\013g\016p#\032k\016w8\001wAd%\002#Cb9\035bIbj\034fHk/\rwGh$@".toCharArray();
            l = obj9.length;
            k = 0;
            break MISSING_BLOCK_LABEL_323;
        }
        c1 = obj8[k];
        k % 5;
        JVM INSTR tableswitch 0 3: default 1272
    //                   0 1296
    //                   1 1303
    //                   2 1309
    //                   3 1316;
           goto _L57 _L58 _L59 _L60 _L61
_L61:
        break MISSING_BLOCK_LABEL_1316;
_L57:
        byte8 = 74;
_L63:
        obj8[k] = (char)(byte8 ^ c1);
        k++;
          goto _L62
_L58:
        byte8 = 110;
          goto _L63
_L59:
        byte8 = 3;
          goto _L63
_L60:
        byte8 = 46;
          goto _L63
        byte8 = 7;
          goto _L63
_L69:
        byte byte8;
        if (l <= k)
        {
            obj9 = (new String(((char []) (obj9)))).intern();
            obj10 = "\tfZU/\036fOs/\nEGb&\n+\007')\017m\016h$\002z\016e/N`Ok&\013g\016h$NqKw/\017wKcj\bjKk.\035-".toCharArray();
            l = obj10.length;
            k = 0;
            break MISSING_BLOCK_LABEL_359;
        }
        c1 = obj9[k];
        k % 5;
        JVM INSTR tableswitch 0 3: default 1364
    //                   0 1388
    //                   1 1395
    //                   2 1401
    //                   3 1408;
           goto _L64 _L65 _L66 _L67 _L68
_L68:
        break MISSING_BLOCK_LABEL_1408;
_L64:
        byte9 = 74;
_L70:
        obj9[k] = (char)(byte9 ^ c1);
        k++;
          goto _L69
_L65:
        byte9 = 110;
          goto _L70
_L66:
        byte9 = 3;
          goto _L70
_L67:
        byte9 = 46;
          goto _L70
        byte9 = 7;
          goto _L70
_L76:
        byte byte9;
        if (l <= k)
        {
            obj10 = (new String(((char []) (obj10)))).intern();
            ac = "\006b]A#\013oJ/cN`Oij\001mB~j\ff\016d+\002oKcj\001m\016i%\000.\\b:\013bZb.NeGb&\np\0".toCharArray();
            l = ac.length;
            k = 0;
            break MISSING_BLOCK_LABEL_395;
        }
        c1 = obj10[k];
        k % 5;
        JVM INSTR tableswitch 0 3: default 1456
    //                   0 1480
    //                   1 1487
    //                   2 1493
    //                   3 1500;
           goto _L71 _L72 _L73 _L74 _L75
_L75:
        break MISSING_BLOCK_LABEL_1500;
_L71:
        byte10 = 74;
_L77:
        obj10[k] = (char)(byte10 ^ c1);
        k++;
          goto _L76
_L72:
        byte10 = 110;
          goto _L77
_L73:
        byte10 = 3;
          goto _L77
_L74:
        byte10 = 46;
          goto _L77
        byte10 = 7;
          goto _L77
_L84:
        byte byte10;
        if (l <= k)
        {
            z = (new String[] {
                obj, obj1, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, 
                obj10, (new String(ac)).intern()
            });
            a = new dk(true);
            return;
        }
        c1 = ac[k];
        k % 5;
        JVM INSTR tableswitch 0 3: default 1548
    //                   0 1572
    //                   1 1579
    //                   2 1585
    //                   3 1592;
           goto _L78 _L79 _L80 _L81 _L82
_L79:
        break; /* Loop/switch isn't completed */
_L82:
        break MISSING_BLOCK_LABEL_1592;
_L78:
        byte byte11 = 74;
_L85:
        ac[k] = (char)(byte11 ^ c1);
        k++;
        if (true) goto _L84; else goto _L83
_L83:
        byte11 = 110;
          goto _L85
_L80:
        byte11 = 3;
          goto _L85
_L81:
        byte11 = 46;
          goto _L85
        byte11 = 7;
          goto _L85
    }
}
