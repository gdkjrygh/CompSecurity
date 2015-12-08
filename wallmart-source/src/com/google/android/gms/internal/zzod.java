// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.text.TextUtils;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public abstract class zzod
{

    public zzod()
    {
    }

    public static String zzA(Object obj)
    {
        return zza(obj, 0);
    }

    public static String zzF(Map map)
    {
        return zza(map, 1);
    }

    private static String zza(Object obj, int i)
    {
        if (i > 10)
        {
            return "ERROR: Recursive toString calls";
        }
        if (obj == null)
        {
            return "";
        }
        if (obj instanceof String)
        {
            if (TextUtils.isEmpty((String)obj))
            {
                return "";
            } else
            {
                return obj.toString();
            }
        }
        if (obj instanceof Integer)
        {
            if (((Integer)obj).intValue() == 0)
            {
                return "";
            } else
            {
                return obj.toString();
            }
        }
        if (obj instanceof Long)
        {
            if (((Long)obj).longValue() == 0L)
            {
                return "";
            } else
            {
                return obj.toString();
            }
        }
        if (obj instanceof Double)
        {
            if (((Double)obj).doubleValue() == 0.0D)
            {
                return "";
            } else
            {
                return obj.toString();
            }
        }
        if (obj instanceof Boolean)
        {
            if (!((Boolean)obj).booleanValue())
            {
                return "";
            } else
            {
                return obj.toString();
            }
        }
        if (obj instanceof List)
        {
            StringBuffer stringbuffer = new StringBuffer();
            if (i > 0)
            {
                stringbuffer.append("[");
            }
            obj = (List)obj;
            int j = stringbuffer.length();
            Object obj1;
            for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); stringbuffer.append(zza(obj1, i + 1)))
            {
                obj1 = ((Iterator) (obj)).next();
                if (stringbuffer.length() > j)
                {
                    stringbuffer.append(", ");
                }
            }

            if (i > 0)
            {
                stringbuffer.append("]");
            }
            return stringbuffer.toString();
        }
        if (obj instanceof Map)
        {
            StringBuffer stringbuffer1 = new StringBuffer();
            obj = (new TreeMap((Map)obj)).entrySet().iterator();
            int k = 0;
            boolean flag = false;
            do
            {
                if (!((Iterator) (obj)).hasNext())
                {
                    break;
                }
                java.util.Map.Entry entry = (java.util.Map.Entry)((Iterator) (obj)).next();
                String s = zza(entry.getValue(), i + 1);
                if (!TextUtils.isEmpty(s))
                {
                    int l = k;
                    boolean flag1 = flag;
                    if (i > 0)
                    {
                        l = k;
                        flag1 = flag;
                        if (!flag)
                        {
                            stringbuffer1.append("{");
                            flag1 = true;
                            l = stringbuffer1.length();
                        }
                    }
                    if (stringbuffer1.length() > l)
                    {
                        stringbuffer1.append(", ");
                    }
                    stringbuffer1.append((String)entry.getKey());
                    stringbuffer1.append('=');
                    stringbuffer1.append(s);
                    k = l;
                    flag = flag1;
                }
            } while (true);
            if (flag)
            {
                stringbuffer1.append("}");
            }
            return stringbuffer1.toString();
        } else
        {
            return obj.toString();
        }
    }

    public abstract void zza(zzod zzod1);
}
