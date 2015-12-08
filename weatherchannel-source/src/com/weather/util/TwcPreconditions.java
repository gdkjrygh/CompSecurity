// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.util;

import android.os.Looper;
import com.google.common.base.Preconditions;
import java.util.Collection;
import java.util.Iterator;

public final class TwcPreconditions
{

    private TwcPreconditions()
    {
    }

    public static Object checkAllowed(Object obj, Collection collection)
    {
        if (!collection.contains(obj))
        {
            throw new IllegalArgumentException((new StringBuilder()).append("value=").append(obj).toString());
        } else
        {
            return obj;
        }
    }

    public static Object checkAllowed(Object obj, Collection collection, Object obj1)
    {
        if (!collection.contains(obj))
        {
            throw new IllegalArgumentException(String.valueOf(obj1));
        } else
        {
            return obj;
        }
    }

    public static transient Object checkAllowed(Object obj, Collection collection, String s, Object aobj[])
    {
        if (!collection.contains(obj))
        {
            throw new IllegalArgumentException(format(s, aobj));
        } else
        {
            return obj;
        }
    }

    public static Iterable checkContainsNoNullElements(Iterable iterable)
    {
        for (Iterator iterator = ((Iterable)Preconditions.checkNotNull(iterable)).iterator(); iterator.hasNext(); Preconditions.checkNotNull(iterator.next())) { }
        return iterable;
    }

    public static int checkNonNegative(int i)
    {
        if (i < 0)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("value=").append(i).toString());
        } else
        {
            return i;
        }
    }

    public static int checkNonNegative(int i, Object obj)
    {
        if (i < 0)
        {
            throw new IllegalArgumentException(String.valueOf(obj));
        } else
        {
            return i;
        }
    }

    public static transient int checkNonNegative(int i, String s, Object aobj[])
    {
        if (i < 0)
        {
            throw new IllegalArgumentException(format(s, aobj));
        } else
        {
            return i;
        }
    }

    public static String checkNotBlank(String s)
    {
        Preconditions.checkNotNull(s);
        if (s.trim().isEmpty())
        {
            throw new IllegalArgumentException("String is empty");
        } else
        {
            return s;
        }
    }

    public static String checkNotBlank(String s, Object obj)
    {
        Preconditions.checkNotNull(s);
        if (s.trim().isEmpty())
        {
            throw new IllegalArgumentException(String.valueOf(obj));
        } else
        {
            return s;
        }
    }

    public static transient String checkNotBlank(String s, String s1, Object aobj[])
    {
        Preconditions.checkNotNull(s);
        if (s.trim().isEmpty())
        {
            throw new IllegalArgumentException(format(s1, aobj));
        } else
        {
            return s;
        }
    }

    public static Collection checkNotEmpty(Collection collection)
    {
        if (collection.isEmpty())
        {
            throw new IllegalArgumentException("Collection is empty");
        } else
        {
            return collection;
        }
    }

    public static Collection checkNotEmpty(Collection collection, Object obj)
    {
        if (collection.isEmpty())
        {
            throw new IllegalArgumentException(String.valueOf(obj));
        } else
        {
            return collection;
        }
    }

    public static transient Collection checkNotEmpty(Collection collection, String s, Object aobj[])
    {
        if (collection.isEmpty())
        {
            throw new IllegalArgumentException(format(s, aobj));
        } else
        {
            return collection;
        }
    }

    public static void checkNotOnMainThread()
    {
        checkNotOnMainThread("Method may not be called on the main thread");
    }

    public static void checkNotOnMainThread(Object obj)
    {
        if (isOnMainThread())
        {
            throw new IllegalStateException(String.valueOf(obj));
        } else
        {
            return;
        }
    }

    public static transient void checkNotOnMainThread(String s, Object aobj[])
    {
        if (isOnMainThread())
        {
            throw new IllegalStateException(format(s, aobj));
        } else
        {
            return;
        }
    }

    public static void checkOnMainThread()
    {
        checkOnMainThread("Method must be called on the main thread.  Current thread is %s", new Object[] {
            Thread.currentThread().getName()
        });
    }

    public static void checkOnMainThread(Object obj)
    {
        if (!isOnMainThread())
        {
            throw new IllegalStateException(String.valueOf(obj));
        } else
        {
            return;
        }
    }

    public static transient void checkOnMainThread(String s, Object aobj[])
    {
        if (!isOnMainThread())
        {
            throw new IllegalStateException(format(s, aobj));
        } else
        {
            return;
        }
    }

    private static transient String format(String s, Object aobj[])
    {
        StringBuilder stringbuilder;
label0:
        {
            int i;
            int j;
            int k;
            if (aobj == null)
            {
                i = 0;
            } else
            {
                i = aobj.length;
            }
            s = String.valueOf(s);
            stringbuilder = new StringBuilder(s.length() + i * 16);
            k = 0;
            j = 0;
label1:
            do
            {
                int l;
label2:
                {
                    if (j < i)
                    {
                        l = s.indexOf("%s", k);
                        if (l != -1)
                        {
                            break label2;
                        }
                    }
                    stringbuilder.append(s.substring(k));
                    if (j >= i)
                    {
                        break label0;
                    }
                    stringbuilder.append(" [");
                    i = j + 1;
                    stringbuilder.append(aobj[j]);
                    for (; i < aobj.length; i++)
                    {
                        stringbuilder.append(", ");
                        stringbuilder.append(aobj[i]);
                    }

                    break label1;
                }
                stringbuilder.append(s.substring(k, l));
                stringbuilder.append(aobj[j]);
                k = l + 2;
                j++;
            } while (true);
            stringbuilder.append(']');
        }
        return stringbuilder.toString();
    }

    private static boolean isOnMainThread()
    {
        return Looper.getMainLooper() == Looper.myLooper();
    }
}
