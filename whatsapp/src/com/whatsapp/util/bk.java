// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.util;

import android.os.Bundle;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.whatsapp.util:
//            Log

public class bk
{

    public static boolean a(Object aobj[], Object obj)
    {
        boolean flag1 = false;
        int j = aobj.length;
        int i = 0;
        do
        {
label0:
            {
                boolean flag = flag1;
                if (i < j)
                {
                    Object obj1 = aobj[i];
                    if (obj1 != obj && (obj == null || obj1 == null || !obj.equals(obj1)))
                    {
                        break label0;
                    }
                    flag = true;
                }
                return flag;
            }
            i++;
        } while (true);
    }

    public static Object[] a(Collection collection, Object aobj[])
    {
        int i;
        boolean flag;
        i = 0;
        flag = Log.f;
        if (!(collection instanceof List)) goto _L2; else goto _L1
_L1:
        collection = ((Collection) (((List)collection).toArray(aobj)));
_L4:
        return collection;
_L2:
        Iterator iterator;
        if (aobj.length < collection.size())
        {
            break MISSING_BLOCK_LABEL_81;
        }
        iterator = collection.iterator();
        i = 0;
_L6:
        collection = ((Collection) (aobj));
        if (!iterator.hasNext()) goto _L4; else goto _L3
_L3:
        aobj[i] = iterator.next();
        collection = ((Collection) (aobj));
        if (flag) goto _L4; else goto _L5
_L5:
        i++;
          goto _L6
        aobj = (Object[])(Object[])Array.newInstance(((Object) (aobj)).getClass().getComponentType(), collection.size());
        collection = collection.iterator();
        do
        {
label0:
            {
                if (collection.hasNext())
                {
                    aobj[i] = collection.next();
                    if (!flag)
                    {
                        break label0;
                    }
                }
                return aobj;
            }
            i++;
        } while (true);
    }

    public static byte[][] a(Bundle bundle, String s)
    {
        if (bundle == null || s == null)
        {
            return (byte[][])null;
        } else
        {
            return a((Object[])(Object[])bundle.getSerializable(s));
        }
    }

    public static byte[][] a(Object aobj[])
    {
        boolean flag = Log.f;
        if (aobj == null)
        {
            return (byte[][])null;
        }
        byte abyte0[][] = new byte[aobj.length][];
        int i = 0;
        do
        {
label0:
            {
                if (i < aobj.length)
                {
                    abyte0[i] = (byte[])(byte[])aobj[i];
                    if (!flag)
                    {
                        break label0;
                    }
                }
                return abyte0;
            }
            i++;
        } while (true);
    }
}
