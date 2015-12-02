// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.tagmanager:
//            dh, DataLayer, bh

class di
{

    private static final Object auc = null;
    private static Long aud = new Long(0L);
    private static Double aue = new Double(0.0D);
    private static dh auf = dh.z(0L);
    private static String aug;
    private static Boolean auh = new Boolean(false);
    private static List aui = new ArrayList(0);
    private static Map auj = new HashMap();
    private static com.google.android.gms.internal.d.a auk;

    private static Boolean dd(String s)
    {
        if ("true".equalsIgnoreCase(s))
        {
            return Boolean.TRUE;
        }
        if ("false".equalsIgnoreCase(s))
        {
            return Boolean.FALSE;
        } else
        {
            return auh;
        }
    }

    public static String j(com.google.android.gms.internal.d.a a)
    {
        return p(o(a));
    }

    public static Boolean n(com.google.android.gms.internal.d.a a)
    {
        return t(o(a));
    }

    public static Object o(com.google.android.gms.internal.d.a a)
    {
        boolean flag = false;
        int i1 = 0;
        int i = 0;
        boolean flag1 = DataLayer.a;
        if (a == null)
        {
            return auc;
        }
        switch (a.type)
        {
        default:
            bh.T((new StringBuilder()).append("Failed to convert a value of type: ").append(a.type).toString());
            return auc;

        case 1: // '\001'
            return a.gv;

        case 2: // '\002'
            ArrayList arraylist = new ArrayList(a.gw.length);
            a = a.gw;
            i1 = a.length;
            do
            {
                if (i >= i1)
                {
                    break;
                }
                Object obj = o(a[i]);
                if (obj == auc)
                {
                    return auc;
                }
                arraylist.add(obj);
                i++;
            } while (!flag1);
            return arraylist;

        case 3: // '\003'
            if (a.gx.length != a.gy.length)
            {
                bh.T((new StringBuilder()).append("Converting an invalid value to object: ").append(a.toString()).toString());
                return auc;
            }
            HashMap hashmap = new HashMap(a.gy.length);
            int k = ((flag) ? 1 : 0);
            do
            {
                if (k >= a.gx.length)
                {
                    break;
                }
                Object obj1 = o(a.gx[k]);
                Object obj2 = o(a.gy[k]);
                if (obj1 == auc || obj2 == auc)
                {
                    return auc;
                }
                hashmap.put(obj1, obj2);
                k++;
            } while (!flag1);
            return hashmap;

        case 4: // '\004'
            bh.T("Trying to convert a macro reference to object");
            return auc;

        case 5: // '\005'
            bh.T("Trying to convert a function id to object");
            return auc;

        case 6: // '\006'
            return Long.valueOf(a.gB);

        case 7: // '\007'
            StringBuffer stringbuffer = new StringBuffer();
            a = a.gD;
            int j1 = a.length;
            int l = i1;
            do
            {
                if (l >= j1)
                {
                    break;
                }
                String s = j(a[l]);
                if (s == aug)
                {
                    return auc;
                }
                stringbuffer.append(s);
                l++;
            } while (!flag1);
            return stringbuffer.toString();

        case 8: // '\b'
            return Boolean.valueOf(a.gC);
        }
    }

    public static String p(Object obj)
    {
        if (obj == null)
        {
            return aug;
        } else
        {
            return obj.toString();
        }
    }

    public static com.google.android.gms.internal.d.a rb()
    {
        return auk;
    }

    public static Boolean t(Object obj)
    {
        if (obj instanceof Boolean)
        {
            return (Boolean)obj;
        } else
        {
            return dd(p(obj));
        }
    }

    public static com.google.android.gms.internal.d.a u(Object obj)
    {
        com.google.android.gms.internal.d.a a;
        boolean flag;
        flag = false;
        a = new com.google.android.gms.internal.d.a();
        if (obj instanceof com.google.android.gms.internal.d.a)
        {
            return (com.google.android.gms.internal.d.a)obj;
        }
        if (!(obj instanceof String)) goto _L2; else goto _L1
_L1:
        a.type = 1;
        a.gv = (String)obj;
_L4:
        a.gF = flag;
        return a;
_L2:
        if (obj instanceof List)
        {
            a.type = 2;
            Object obj1 = (List)obj;
            obj = new ArrayList(((List) (obj1)).size());
            obj1 = ((List) (obj1)).iterator();
            flag = false;
            while (((Iterator) (obj1)).hasNext()) 
            {
                com.google.android.gms.internal.d.a a1 = u(((Iterator) (obj1)).next());
                if (a1 == auk)
                {
                    return auk;
                }
                if (flag || a1.gF)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                ((List) (obj)).add(a1);
            }
            a.gw = (com.google.android.gms.internal.d.a[])((List) (obj)).toArray(new com.google.android.gms.internal.d.a[0]);
            continue; /* Loop/switch isn't completed */
        }
        if (obj instanceof Map)
        {
            a.type = 3;
            Object obj2 = ((Map)obj).entrySet();
            obj = new ArrayList(((Set) (obj2)).size());
            ArrayList arraylist = new ArrayList(((Set) (obj2)).size());
            obj2 = ((Set) (obj2)).iterator();
            flag = false;
            while (((Iterator) (obj2)).hasNext()) 
            {
                Object obj3 = (java.util.Map.Entry)((Iterator) (obj2)).next();
                com.google.android.gms.internal.d.a a2 = u(((java.util.Map.Entry) (obj3)).getKey());
                obj3 = u(((java.util.Map.Entry) (obj3)).getValue());
                if (a2 == auk || obj3 == auk)
                {
                    return auk;
                }
                if (flag || a2.gF || ((com.google.android.gms.internal.d.a) (obj3)).gF)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                ((List) (obj)).add(a2);
                arraylist.add(obj3);
            }
            a.gx = (com.google.android.gms.internal.d.a[])((List) (obj)).toArray(new com.google.android.gms.internal.d.a[0]);
            a.gy = (com.google.android.gms.internal.d.a[])arraylist.toArray(new com.google.android.gms.internal.d.a[0]);
            continue; /* Loop/switch isn't completed */
        }
        if (v(obj))
        {
            a.type = 1;
            a.gv = obj.toString();
            continue; /* Loop/switch isn't completed */
        }
        if (w(obj))
        {
            a.type = 6;
            a.gB = x(obj);
            continue; /* Loop/switch isn't completed */
        }
        if (!(obj instanceof Boolean))
        {
            break; /* Loop/switch isn't completed */
        }
        a.type = 8;
        a.gC = ((Boolean)obj).booleanValue();
        if (true) goto _L4; else goto _L3
_L3:
        StringBuilder stringbuilder = (new StringBuilder()).append("Converting to Value from unknown object type: ");
        if (obj == null)
        {
            obj = "null";
        } else
        {
            obj = obj.getClass().toString();
        }
        bh.T(stringbuilder.append(((String) (obj))).toString());
        return auk;
    }

    private static boolean v(Object obj)
    {
        return (obj instanceof Double) || (obj instanceof Float) || (obj instanceof dh) && ((dh)obj).qQ();
    }

    private static boolean w(Object obj)
    {
        return (obj instanceof Byte) || (obj instanceof Short) || (obj instanceof Integer) || (obj instanceof Long) || (obj instanceof dh) && ((dh)obj).qR();
    }

    private static long x(Object obj)
    {
        if (obj instanceof Number)
        {
            return ((Number)obj).longValue();
        } else
        {
            bh.T("getInt64 received non-Number");
            return 0L;
        }
    }

    static 
    {
        aug = new String("");
        auk = u(aug);
    }
}
