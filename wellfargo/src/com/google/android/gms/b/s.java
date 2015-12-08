// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.b;

import java.util.Map;

// Referenced classes of package com.google.android.gms.b:
//            k, i

public class s
{

    static Object b[];
    static int c;
    static Object d[];
    static int e;
    int f[];
    Object g[];
    int h;

    public s()
    {
        f = k.a;
        g = k.c;
        h = 0;
    }

    private static void a(int ai[], Object aobj[], int j)
    {
        if (ai.length != 8) goto _L2; else goto _L1
_L1:
        com/google/android/gms/b/i;
        JVM INSTR monitorenter ;
        if (e < 10)
        {
            aobj[0] = ((Object) (d));
            break MISSING_BLOCK_LABEL_24;
        }
          goto _L3
_L8:
        d = aobj;
        e++;
_L3:
        com/google/android/gms/b/i;
        JVM INSTR monitorexit ;
        return;
        ai;
        com/google/android/gms/b/i;
        JVM INSTR monitorexit ;
        throw ai;
_L2:
        if (ai.length != 4) goto _L5; else goto _L4
_L4:
        com/google/android/gms/b/i;
        JVM INSTR monitorenter ;
        if (c >= 10) goto _L7; else goto _L6
_L6:
        aobj[0] = ((Object) (b));
        aobj[1] = ai;
        j = (j << 1) - 1;
        break MISSING_BLOCK_LABEL_134;
_L9:
        b = aobj;
        c++;
_L7:
        com/google/android/gms/b/i;
        JVM INSTR monitorexit ;
        return;
        ai;
        com/google/android/gms/b/i;
        JVM INSTR monitorexit ;
        throw ai;
        aobj[1] = ai;
        j = (j << 1) - 1;
        while (j >= 2) 
        {
            aobj[j] = null;
            j--;
        }
          goto _L8
_L5:
        return;
        while (j >= 2) 
        {
            aobj[j] = null;
            j--;
        }
          goto _L9
    }

    private void e(int j)
    {
        if (j != 8) goto _L2; else goto _L1
_L1:
        com/google/android/gms/b/i;
        JVM INSTR monitorenter ;
        Object aobj[];
        if (d == null)
        {
            break MISSING_BLOCK_LABEL_69;
        }
        aobj = d;
        g = aobj;
        d = (Object[])(Object[])aobj[0];
        f = (int[])(int[])aobj[1];
        aobj[1] = null;
        aobj[0] = null;
        e--;
        com/google/android/gms/b/i;
        JVM INSTR monitorexit ;
        return;
        com/google/android/gms/b/i;
        JVM INSTR monitorexit ;
_L4:
        f = new int[j];
        g = new Object[j << 1];
        return;
        Exception exception;
        exception;
        com/google/android/gms/b/i;
        JVM INSTR monitorexit ;
        throw exception;
_L2:
        if (j != 4) goto _L4; else goto _L3
_L3:
        com/google/android/gms/b/i;
        JVM INSTR monitorenter ;
        if (b == null)
        {
            break MISSING_BLOCK_LABEL_170;
        }
        exception = ((Exception) (b));
        g = exception;
        b = (Object[])(Object[])exception[0];
        f = (int[])(int[])exception[1];
        exception[1] = null;
        exception[0] = null;
        c--;
        com/google/android/gms/b/i;
        JVM INSTR monitorexit ;
        return;
        exception;
        com/google/android/gms/b/i;
        JVM INSTR monitorexit ;
        throw exception;
        com/google/android/gms/b/i;
        JVM INSTR monitorexit ;
          goto _L4
    }

    int a()
    {
        int j1 = h;
        if (j1 != 0) goto _L2; else goto _L1
_L1:
        int j = -1;
_L4:
        return j;
_L2:
        int i1;
        int l = k.a(f, j1, 0);
        j = l;
        if (l >= 0)
        {
            j = l;
            if (g[l << 1] != null)
            {
                for (i1 = l + 1; i1 < j1 && f[i1] == 0; i1++)
                {
                    if (g[i1 << 1] == null)
                    {
                        return i1;
                    }
                }

                l--;
label0:
                do
                {
label1:
                    {
                        if (l < 0 || f[l] != 0)
                        {
                            break label1;
                        }
                        j = l;
                        if (g[l << 1] == null)
                        {
                            break label0;
                        }
                        l--;
                    }
                } while (true);
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
        return ~i1;
    }

    int a(Object obj)
    {
        Object aobj[];
        int j;
        boolean flag;
        int l;
        j = 1;
        flag = true;
        l = h * 2;
        aobj = g;
        if (obj != null) goto _L2; else goto _L1
_L1:
        for (j = ((flag) ? 1 : 0); j < l; j += 2)
        {
            if (aobj[j] == null)
            {
                return j >> 1;
            }
        }

          goto _L3
_L4:
        j += 2;
_L2:
        if (j >= l)
        {
            break; /* Loop/switch isn't completed */
        }
        if (obj.equals(aobj[j]))
        {
            return j >> 1;
        }
        if (true) goto _L4; else goto _L3
_L3:
        return -1;
    }

    int a(Object obj, int j)
    {
        int k1 = h;
        if (k1 != 0) goto _L2; else goto _L1
_L1:
        int l = -1;
_L4:
        return l;
_L2:
        int j1;
        int i1 = k.a(f, k1, j);
        l = i1;
        if (i1 >= 0)
        {
            l = i1;
            if (!obj.equals(g[i1 << 1]))
            {
                for (j1 = i1 + 1; j1 < k1 && f[j1] == j; j1++)
                {
                    if (obj.equals(g[j1 << 1]))
                    {
                        return j1;
                    }
                }

                i1--;
label0:
                do
                {
label1:
                    {
                        if (i1 < 0 || f[i1] != j)
                        {
                            break label1;
                        }
                        l = i1;
                        if (obj.equals(g[i1 << 1]))
                        {
                            break label0;
                        }
                        i1--;
                    }
                } while (true);
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
        return ~j1;
    }

    public Object a(int j, Object obj)
    {
        j = (j << 1) + 1;
        Object obj1 = g[j];
        g[j] = obj;
        return obj1;
    }

    public void a(int j)
    {
        if (f.length < j)
        {
            int ai[] = f;
            Object aobj[] = g;
            e(j);
            if (h > 0)
            {
                System.arraycopy(ai, 0, f, 0, h);
                System.arraycopy(((Object) (aobj)), 0, ((Object) (g)), 0, h << 1);
            }
            a(ai, aobj, h);
        }
    }

    public Object b(int j)
    {
        return g[j << 1];
    }

    public Object c(int j)
    {
        return g[(j << 1) + 1];
    }

    public void clear()
    {
        if (h != 0)
        {
            a(f, g, h);
            f = k.a;
            g = k.c;
            h = 0;
        }
    }

    public boolean containsKey(Object obj)
    {
        if (obj != null) goto _L2; else goto _L1
_L1:
        if (a() < 0) goto _L4; else goto _L3
_L3:
        return true;
_L4:
        return false;
_L2:
        if (a(obj, obj.hashCode()) < 0)
        {
            return false;
        }
        if (true) goto _L3; else goto _L5
_L5:
    }

    public boolean containsValue(Object obj)
    {
        return a(obj) >= 0;
    }

    public Object d(int j)
    {
        int l = 8;
        Object obj = g[(j << 1) + 1];
        if (h <= 1)
        {
            a(f, g, h);
            f = k.a;
            g = k.c;
            h = 0;
        } else
        if (f.length > 8 && h < f.length / 3)
        {
            if (h > 8)
            {
                l = h + (h >> 1);
            }
            int ai[] = f;
            Object aobj[] = g;
            e(l);
            h = h - 1;
            if (j > 0)
            {
                System.arraycopy(ai, 0, f, 0, j);
                System.arraycopy(((Object) (aobj)), 0, ((Object) (g)), 0, j << 1);
            }
            if (j < h)
            {
                System.arraycopy(ai, j + 1, f, j, h - j);
                System.arraycopy(((Object) (aobj)), j + 1 << 1, ((Object) (g)), j << 1, h - j << 1);
                return obj;
            }
        } else
        {
            h = h - 1;
            if (j < h)
            {
                System.arraycopy(f, j + 1, f, j, h - j);
                System.arraycopy(((Object) (g)), j + 1 << 1, ((Object) (g)), j << 1, h - j << 1);
            }
            g[h << 1] = null;
            g[(h << 1) + 1] = null;
            return obj;
        }
        return obj;
    }

    public boolean equals(Object obj)
    {
        if (this != obj) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        int j;
        if (!(obj instanceof Map))
        {
            break MISSING_BLOCK_LABEL_121;
        }
        obj = (Map)obj;
        if (size() != ((Map) (obj)).size())
        {
            return false;
        }
        j = 0;
_L4:
        Object obj1;
        Object obj2;
        Object obj3;
        if (j >= h)
        {
            break; /* Loop/switch isn't completed */
        }
        obj1 = b(j);
        obj2 = c(j);
        obj3 = ((Map) (obj)).get(obj1);
        if (obj2 != null)
        {
            break MISSING_BLOCK_LABEL_91;
        }
        if (obj3 != null)
        {
            break MISSING_BLOCK_LABEL_123;
        }
        if (!((Map) (obj)).containsKey(obj1))
        {
            break MISSING_BLOCK_LABEL_123;
        }
        break MISSING_BLOCK_LABEL_106;
        boolean flag;
        try
        {
            flag = obj2.equals(obj3);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            return false;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            return false;
        }
        if (!flag)
        {
            return false;
        }
        j++;
        if (true) goto _L4; else goto _L3
_L3:
        if (true) goto _L1; else goto _L5
_L5:
        return false;
        return false;
    }

    public Object get(Object obj)
    {
        int j;
        if (obj == null)
        {
            j = a();
        } else
        {
            j = a(obj, obj.hashCode());
        }
        if (j >= 0)
        {
            return g[(j << 1) + 1];
        } else
        {
            return null;
        }
    }

    public int hashCode()
    {
        int ai[] = f;
        Object aobj[] = g;
        int k1 = h;
        int j = 1;
        int l = 0;
        int i1 = 0;
        while (l < k1) 
        {
            Object obj = aobj[j];
            int l1 = ai[l];
            int j1;
            if (obj == null)
            {
                j1 = 0;
            } else
            {
                j1 = obj.hashCode();
            }
            i1 += j1 ^ l1;
            l++;
            j += 2;
        }
        return i1;
    }

    public boolean isEmpty()
    {
        return h <= 0;
    }

    public Object put(Object obj, Object obj1)
    {
        int i1;
        byte byte0;
        int j1;
        byte0 = 8;
        int j;
        if (obj == null)
        {
            j = a();
            i1 = 0;
        } else
        {
            i1 = obj.hashCode();
            j = a(obj, i1);
        }
        if (j >= 0)
        {
            j = (j << 1) + 1;
            obj = g[j];
            g[j] = obj1;
            return obj;
        }
        j1 = ~j;
        if (h < f.length) goto _L2; else goto _L1
_L1:
        if (h < 8) goto _L4; else goto _L3
_L3:
        int l = h + (h >> 1);
_L6:
        int ai[] = f;
        Object aobj[] = g;
        e(l);
        if (f.length > 0)
        {
            System.arraycopy(ai, 0, f, 0, ai.length);
            System.arraycopy(((Object) (aobj)), 0, ((Object) (g)), 0, aobj.length);
        }
        a(ai, aobj, h);
_L2:
        if (j1 < h)
        {
            System.arraycopy(f, j1, f, j1 + 1, h - j1);
            System.arraycopy(((Object) (g)), j1 << 1, ((Object) (g)), j1 + 1 << 1, h - j1 << 1);
        }
        f[j1] = i1;
        g[j1 << 1] = obj;
        g[(j1 << 1) + 1] = obj1;
        h = h + 1;
        return null;
_L4:
        l = byte0;
        if (h < 4)
        {
            l = 4;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public Object remove(Object obj)
    {
        int j;
        if (obj == null)
        {
            j = a();
        } else
        {
            j = a(obj, obj.hashCode());
        }
        if (j >= 0)
        {
            return d(j);
        } else
        {
            return null;
        }
    }

    public int size()
    {
        return h;
    }

    public String toString()
    {
        if (isEmpty())
        {
            return "{}";
        }
        StringBuilder stringbuilder = new StringBuilder(h * 28);
        stringbuilder.append('{');
        int j = 0;
        while (j < h) 
        {
            if (j > 0)
            {
                stringbuilder.append(", ");
            }
            Object obj = b(j);
            if (obj != this)
            {
                stringbuilder.append(obj);
            } else
            {
                stringbuilder.append("(this Map)");
            }
            stringbuilder.append('=');
            obj = c(j);
            if (obj != this)
            {
                stringbuilder.append(obj);
            } else
            {
                stringbuilder.append("(this Map)");
            }
            j++;
        }
        stringbuilder.append('}');
        return stringbuilder.toString();
    }
}
