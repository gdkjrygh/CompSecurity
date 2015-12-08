// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package de.greenrobot.event.util;

import android.util.Log;
import de.greenrobot.event.EventBus;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class ExceptionToResourceMapping
{

    public final Map throwableToMsgIdMap = new HashMap();

    public ExceptionToResourceMapping()
    {
    }

    public ExceptionToResourceMapping addMapping(Class class1, int i)
    {
        throwableToMsgIdMap.put(class1, Integer.valueOf(i));
        return this;
    }

    public Integer mapThrowable(Throwable throwable)
    {
        Throwable throwable1 = throwable;
        int i = 20;
        Object obj;
        do
        {
            obj = mapThrowableFlat(throwable1);
            if (obj != null)
            {
                return ((Integer) (obj));
            }
            obj = throwable1.getCause();
            i--;
            if (i <= 0 || obj == throwable)
            {
                break;
            }
            throwable1 = ((Throwable) (obj));
        } while (obj != null);
        Log.d(EventBus.TAG, (new StringBuilder()).append("No specific message ressource ID found for ").append(throwable).toString());
        return null;
    }

    protected Integer mapThrowableFlat(Throwable throwable)
    {
        Class class1 = throwable.getClass();
        throwable = (Integer)throwableToMsgIdMap.get(class1);
        Object obj1 = throwable;
        if (throwable == null)
        {
            Object obj = null;
            Iterator iterator = throwableToMsgIdMap.entrySet().iterator();
            do
            {
                obj1 = throwable;
                if (!iterator.hasNext())
                {
                    break;
                }
                java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
                obj1 = (Class)entry.getKey();
                if (((Class) (obj1)).isAssignableFrom(class1) && (obj == null || ((Class) (obj)).isAssignableFrom(((Class) (obj1)))))
                {
                    obj = obj1;
                    throwable = (Integer)entry.getValue();
                }
            } while (true);
        }
        return ((Integer) (obj1));
    }
}
