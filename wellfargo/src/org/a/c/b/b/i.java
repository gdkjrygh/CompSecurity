// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.a.c.b.b;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import org.a.c.b;
import org.a.c.b.b.a.e;
import org.a.c.b.b.a.j;
import org.a.c.b.b.a.l;
import org.a.c.b.b.b.a;

// Referenced classes of package org.a.c.b.b:
//            j, e

public class i
    implements j
{

    private static final Map gp;
    private static final Map gq;
    private static final Map gr;
    private static final Map gs;
    public final e a;
    public final a b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    private int go;
    public final byte h[];
    public byte i[];
    public final int j;

    public i(int k, int i1, int j1, int k1, int l1, byte abyte0[], int i2)
    {
        i = null;
        go = -1;
        c = k;
        d = i1;
        e = j1;
        f = k1;
        g = l1;
        h = abyte0;
        j = i2;
        b = b(j1);
        abyte0 = new Integer(k);
        abyte0 = (List)gr.get(abyte0);
        if (abyte0 == null)
        {
            abyte0 = bx_;
        } else
        {
            abyte0 = a(i1, abyte0);
        }
        a = abyte0;
    }

    private static final Map a(e ae[])
    {
        Hashtable hashtable = new Hashtable();
        int k = 0;
        do
        {
            if (k >= ae.length)
            {
                return hashtable;
            }
            e e1 = ae[k];
            Integer integer = new Integer(e1.b);
            List list = (List)hashtable.get(integer);
            Object obj = list;
            if (list == null)
            {
                obj = new ArrayList();
                hashtable.put(integer, obj);
            }
            ((List) (obj)).add(e1);
            k++;
        } while (true);
    }

    private static e a(int k, List list)
    {
        boolean flag = false;
        if (list.size() > 0) goto _L2; else goto _L1
_L1:
        e e1 = null;
_L9:
        return e1;
_L2:
        int i1 = 0;
_L17:
        if (i1 < list.size()) goto _L4; else goto _L3
_L3:
        i1 = 0;
_L20:
        if (i1 < list.size()) goto _L6; else goto _L5
_L5:
        k = ((flag) ? 1 : 0);
_L22:
        e e2;
        if (k >= list.size())
        {
            return bx_;
        }
        e2 = (e)list.get(k);
        e1 = e2;
          goto _L7
_L4:
        e2 = (e)list.get(i1);
        if (e2.e == gf)
        {
            break; /* Loop/switch isn't completed */
        }
        if (k != -2)
        {
            break; /* Loop/switch isn't completed */
        }
        e1 = e2;
        if (e2.e == gd) goto _L9; else goto _L8
_L8:
        if (k != -4)
        {
            break; /* Loop/switch isn't completed */
        }
        e1 = e2;
        if (e2.e == gb) goto _L9; else goto _L10
_L10:
        if (k != -3)
        {
            break; /* Loop/switch isn't completed */
        }
        e1 = e2;
        if (e2.e == ge) goto _L9; else goto _L11
_L11:
        if (k != -5)
        {
            break; /* Loop/switch isn't completed */
        }
        e1 = e2;
        if (e2.e == gc) goto _L9; else goto _L12
_L12:
        if (k != 0)
        {
            break; /* Loop/switch isn't completed */
        }
        e1 = e2;
        if (e2.e == fP) goto _L9; else goto _L13
_L13:
        if (k != 1)
        {
            break; /* Loop/switch isn't completed */
        }
        e1 = e2;
        if (e2.e == fS) goto _L9; else goto _L14
_L14:
        if (k != 2)
        {
            break; /* Loop/switch isn't completed */
        }
        e1 = e2;
        if (e2.e == fU) goto _L9; else goto _L15
_L15:
        if (k != 3)
        {
            break; /* Loop/switch isn't completed */
        }
        e1 = e2;
        if (e2.e == C_) goto _L9; else goto _L16
_L16:
        i1++;
          goto _L17
_L6:
        e2 = (e)list.get(i1);
        if (e2.e == gf)
        {
            break; /* Loop/switch isn't completed */
        }
        if (k < 0)
        {
            break; /* Loop/switch isn't completed */
        }
        e1 = e2;
        if (e2.e.a()) goto _L9; else goto _L18
_L18:
        if (k >= 0)
        {
            break; /* Loop/switch isn't completed */
        }
        e1 = e2;
        if (!e2.e.a()) goto _L9; else goto _L19
_L19:
        i1++;
          goto _L20
_L7:
        if (e2.e == gf) goto _L9; else goto _L21
_L21:
        k++;
          goto _L22
    }

    private static a b(int k)
    {
        int i1 = 0;
        do
        {
            if (i1 >= P_.length)
            {
                return O_;
            }
            a a1 = P_[i1];
            if (a1.b == k)
            {
                return a1;
            }
            i1++;
        } while (true);
    }

    private String e()
    {
        Object obj;
        StringBuffer stringbuffer;
        Object obj1;
        int k;
        int i1;
        boolean flag;
        boolean flag1;
        boolean flag2;
        boolean flag3;
        boolean flag4;
        i1 = 0;
        flag = false;
        flag1 = false;
        flag2 = false;
        flag3 = false;
        flag4 = false;
        k = 0;
        try
        {
            obj = c();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            return (new StringBuilder("Invalid value: ")).append(((b) (obj)).getMessage()).toString();
        }
        if (obj == null)
        {
            return null;
        }
        if (obj instanceof Number)
        {
            return obj.toString();
        }
        if (obj instanceof String)
        {
            return (new StringBuilder("'")).append(obj.toString().trim()).append("'").toString();
        }
        if (obj instanceof Date)
        {
            return (new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ")).format((Date)obj);
        }
        if (!(obj instanceof Object[]))
        {
            break MISSING_BLOCK_LABEL_261;
        }
        obj = ((Object) ((Object[])obj));
        stringbuffer = new StringBuffer();
_L3:
        if (k < obj.length) goto _L2; else goto _L1
_L1:
        return stringbuffer.toString();
_L2:
        obj1 = obj[k];
        if (k <= 50)
        {
            break MISSING_BLOCK_LABEL_218;
        }
        stringbuffer.append((new StringBuilder("... (")).append(obj.length).append(")").toString());
          goto _L1
        if (k <= 0)
        {
            break MISSING_BLOCK_LABEL_231;
        }
        stringbuffer.append(", ");
        stringbuffer.append((new StringBuilder()).append(obj1).toString());
        k++;
          goto _L3
        if (!(obj instanceof int[])) goto _L5; else goto _L4
_L4:
        obj = (int[])obj;
        stringbuffer = new StringBuffer();
        k = i1;
_L8:
        if (k < obj.length) goto _L7; else goto _L6
_L6:
        return stringbuffer.toString();
_L7:
        i1 = obj[k];
        if (k <= 50)
        {
            break MISSING_BLOCK_LABEL_349;
        }
        stringbuffer.append((new StringBuilder("... (")).append(obj.length).append(")").toString());
          goto _L6
        if (k <= 0)
        {
            break MISSING_BLOCK_LABEL_362;
        }
        stringbuffer.append(", ");
        stringbuffer.append((new StringBuilder()).append(i1).toString());
        k++;
        if (true) goto _L8; else goto _L5
_L5:
        if (!(obj instanceof long[])) goto _L10; else goto _L9
_L9:
        obj = (long[])obj;
        stringbuffer = new StringBuffer();
        k = ((flag) ? 1 : 0);
_L13:
        if (k < obj.length) goto _L12; else goto _L11
_L11:
        return stringbuffer.toString();
_L12:
        long l1;
        l1 = obj[k];
        if (k <= 50)
        {
            break MISSING_BLOCK_LABEL_480;
        }
        stringbuffer.append((new StringBuilder("... (")).append(obj.length).append(")").toString());
          goto _L11
        if (k <= 0)
        {
            break MISSING_BLOCK_LABEL_493;
        }
        stringbuffer.append(", ");
        stringbuffer.append((new StringBuilder()).append(l1).toString());
        k++;
        if (true) goto _L13; else goto _L10
_L10:
        if (!(obj instanceof double[])) goto _L15; else goto _L14
_L14:
        obj = (double[])obj;
        stringbuffer = new StringBuffer();
        k = ((flag1) ? 1 : 0);
_L18:
        if (k < obj.length) goto _L17; else goto _L16
_L16:
        return stringbuffer.toString();
_L17:
        double d1;
        d1 = obj[k];
        if (k <= 50)
        {
            break MISSING_BLOCK_LABEL_610;
        }
        stringbuffer.append((new StringBuilder("... (")).append(obj.length).append(")").toString());
          goto _L16
        if (k <= 0)
        {
            break MISSING_BLOCK_LABEL_623;
        }
        stringbuffer.append(", ");
        stringbuffer.append((new StringBuilder()).append(d1).toString());
        k++;
        if (true) goto _L18; else goto _L15
_L15:
        if (!(obj instanceof byte[])) goto _L20; else goto _L19
_L19:
        obj = (byte[])obj;
        stringbuffer = new StringBuffer();
        k = ((flag2) ? 1 : 0);
_L23:
        if (k < obj.length) goto _L22; else goto _L21
_L21:
        return stringbuffer.toString();
_L22:
        i1 = obj[k];
        if (k <= 50)
        {
            break MISSING_BLOCK_LABEL_740;
        }
        stringbuffer.append((new StringBuilder("... (")).append(obj.length).append(")").toString());
          goto _L21
        if (k <= 0)
        {
            break MISSING_BLOCK_LABEL_753;
        }
        stringbuffer.append(", ");
        stringbuffer.append((new StringBuilder()).append(i1).toString());
        k++;
        if (true) goto _L23; else goto _L20
_L20:
        if (!(obj instanceof char[])) goto _L25; else goto _L24
_L24:
        obj = (char[])obj;
        stringbuffer = new StringBuffer();
        k = ((flag3) ? 1 : 0);
_L28:
        if (k < obj.length) goto _L27; else goto _L26
_L26:
        return stringbuffer.toString();
_L27:
        char c1;
        c1 = obj[k];
        if (k <= 50)
        {
            break MISSING_BLOCK_LABEL_871;
        }
        stringbuffer.append((new StringBuilder("... (")).append(obj.length).append(")").toString());
          goto _L26
        if (k <= 0)
        {
            break MISSING_BLOCK_LABEL_884;
        }
        stringbuffer.append(", ");
        stringbuffer.append((new StringBuilder()).append(c1).toString());
        k++;
        if (true) goto _L28; else goto _L25
_L25:
        if (!(obj instanceof float[])) goto _L30; else goto _L29
_L29:
        obj = (float[])obj;
        stringbuffer = new StringBuffer();
        k = ((flag4) ? 1 : 0);
_L33:
        if (k < obj.length) goto _L32; else goto _L31
_L31:
        return stringbuffer.toString();
_L32:
        float f1;
        f1 = obj[k];
        if (k <= 50)
        {
            break MISSING_BLOCK_LABEL_1001;
        }
        stringbuffer.append((new StringBuilder("... (")).append(obj.length).append(")").toString());
          goto _L31
        if (k <= 0)
        {
            break MISSING_BLOCK_LABEL_1014;
        }
        stringbuffer.append(", ");
        stringbuffer.append((new StringBuilder()).append(f1).toString());
        k++;
        if (true) goto _L33; else goto _L30
_L30:
        obj = (new StringBuilder("Unknown: ")).append(obj.getClass().getName()).toString();
        return ((String) (obj));
    }

    public final org.a.c.b.b.e a()
    {
        if (b.a(this))
        {
            return null;
        } else
        {
            return new org.a.c.b.b.j(this, g, i.length);
        }
    }

    public final void a(int k)
    {
        go = k;
    }

    public final void a(org.a.c.a.a.a a1)
    {
        if (b.a(this))
        {
            return;
        } else
        {
            int k = b.c;
            int i1 = f;
            i = a1.b(g, k * i1);
            return;
        }
    }

    public final String b()
    {
        return (new StringBuilder(String.valueOf(c))).append(" (0x").append(Integer.toHexString(c)).append(": ").append(a.a).append("): ").toString();
    }

    public final Object c()
    {
        return a.a(this);
    }

    public final int[] d()
    {
        boolean flag = false;
        int k = 0;
        Object obj = c();
        if (obj instanceof Number)
        {
            return (new int[] {
                ((Number)obj).intValue()
            });
        }
        if (obj instanceof Number[])
        {
            obj = (Number[])obj;
            int ai[] = new int[obj.length];
            do
            {
                if (k >= obj.length)
                {
                    return ai;
                }
                ai[k] = obj[k].intValue();
                k++;
            } while (true);
        }
        if (obj instanceof int[])
        {
            obj = (int[])obj;
            int ai1[] = new int[obj.length];
            int i1 = ((flag) ? 1 : 0);
            do
            {
                if (i1 >= obj.length)
                {
                    return ai1;
                }
                ai1[i1] = obj[i1];
                i1++;
            } while (true);
        } else
        {
            throw new b((new StringBuilder("Unknown value: ")).append(obj).append(" for: ").append(a.a()).toString());
        }
    }

    public String toString()
    {
        StringBuffer stringbuffer = new StringBuffer();
        stringbuffer.append((new StringBuilder(String.valueOf(c))).append(" (0x").append(Integer.toHexString(c)).append(": ").append(a.a).append("): ").toString());
        stringbuffer.append((new StringBuilder(String.valueOf(e()))).append(" (").append(f).append(" ").append(b.d).append(")").toString());
        return stringbuffer.toString();
    }

    static 
    {
        gp = a(Q);
        gq = a(aJ);
        gr = a(fO);
        gs = a(k);
    }
}
