// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.viewcrawler;

import android.util.Log;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class Caller
{

    private static final String LOGTAG = "MixpanelABTest.Caller";
    private final Object mMethodArgs[];
    private final String mMethodName;
    private final Class mMethodResultType;
    private final Class mTargetClass;
    private final Method mTargetMethod;

    public Caller(Class class1, String s, Object aobj[], Class class2)
        throws NoSuchMethodException
    {
        mMethodName = s;
        mMethodArgs = aobj;
        mMethodResultType = class2;
        mTargetMethod = pickMethod(class1);
        if (mTargetMethod == null)
        {
            throw new NoSuchMethodException((new StringBuilder("Method ")).append(class1.getName()).append(".").append(mMethodName).append(" doesn't exit").toString());
        } else
        {
            mTargetClass = mTargetMethod.getDeclaringClass();
            return;
        }
    }

    private static Class assignableArgType(Class class1)
    {
        Class class2;
        if (class1 == java/lang/Byte)
        {
            class2 = Byte.TYPE;
        } else
        {
            if (class1 == java/lang/Short)
            {
                return Short.TYPE;
            }
            if (class1 == java/lang/Integer)
            {
                return Integer.TYPE;
            }
            if (class1 == java/lang/Long)
            {
                return Long.TYPE;
            }
            if (class1 == java/lang/Float)
            {
                return Float.TYPE;
            }
            if (class1 == java/lang/Double)
            {
                return Double.TYPE;
            }
            if (class1 == java/lang/Boolean)
            {
                return Boolean.TYPE;
            }
            class2 = class1;
            if (class1 == java/lang/Character)
            {
                return Character.TYPE;
            }
        }
        return class2;
    }

    private Method pickMethod(Class class1)
    {
        Class aclass[];
        int i;
        aclass = new Class[mMethodArgs.length];
        i = 0;
_L5:
        if (i < mMethodArgs.length) goto _L2; else goto _L1
_L1:
        Method amethod[];
        int k;
        amethod = class1.getMethods();
        k = amethod.length;
        i = 0;
_L7:
        if (i < k) goto _L4; else goto _L3
_L3:
        class1 = null;
_L12:
        return class1;
_L2:
        aclass[i] = mMethodArgs[i].getClass();
        i++;
          goto _L5
_L4:
        Class aclass1[];
        String s;
        class1 = amethod[i];
        s = class1.getName();
        aclass1 = class1.getParameterTypes();
          goto _L6
_L9:
        i++;
          goto _L7
_L6:
        if (!s.equals(mMethodName) || aclass1.length != mMethodArgs.length || !assignableArgType(mMethodResultType).isAssignableFrom(assignableArgType(class1.getReturnType()))) goto _L9; else goto _L8
_L8:
        int j;
        boolean flag;
        flag = true;
        j = 0;
_L13:
        if (j < aclass1.length && flag) goto _L11; else goto _L10
_L10:
        if (flag) goto _L12; else goto _L9
_L11:
        Class class2 = assignableArgType(aclass[j]);
        flag = assignableArgType(aclass1[j]).isAssignableFrom(class2);
        j++;
          goto _L13
    }

    public Object applyMethod(View view)
    {
        return applyMethodWithArguments(view, mMethodArgs);
    }

    public Object applyMethodWithArguments(View view, Object aobj[])
    {
        Class class1 = view.getClass();
        if (!mTargetClass.isAssignableFrom(class1))
        {
            break MISSING_BLOCK_LABEL_63;
        }
        view = ((View) (mTargetMethod.invoke(view, aobj)));
        return view;
        view;
        Log.e("MixpanelABTest.Caller", (new StringBuilder("Method ")).append(mTargetMethod.getName()).append(" appears not to be public").toString(), view);
_L2:
        return null;
        view;
        Log.e("MixpanelABTest.Caller", (new StringBuilder("Method ")).append(mTargetMethod.getName()).append(" called with arguments of the wrong type").toString(), view);
        continue; /* Loop/switch isn't completed */
        view;
        Log.e("MixpanelABTest.Caller", (new StringBuilder("Method ")).append(mTargetMethod.getName()).append(" threw an exception").toString(), view);
        if (true) goto _L2; else goto _L1
_L1:
    }

    public boolean argsAreApplicable(Object aobj[])
    {
        Class aclass[] = mTargetMethod.getParameterTypes();
        if (aobj.length == aclass.length) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        int i = 0;
_L4:
        Class class1;
        if (i >= aobj.length)
        {
            return true;
        }
        class1 = assignableArgType(aclass[i]);
        if (aobj[i] != null)
        {
            break MISSING_BLOCK_LABEL_109;
        }
        if (class1 == Byte.TYPE || class1 == Short.TYPE || class1 == Integer.TYPE || class1 == Long.TYPE || class1 == Float.TYPE || class1 == Double.TYPE || class1 == Boolean.TYPE || class1 == Character.TYPE) goto _L1; else goto _L3
_L3:
        i++;
          goto _L4
        if (!class1.isAssignableFrom(assignableArgType(aobj[i].getClass())))
        {
            return false;
        }
          goto _L3
    }

    public Object[] getArgs()
    {
        return mMethodArgs;
    }

    public String toString()
    {
        return (new StringBuilder("[Caller ")).append(mMethodName).append("(").append(((Object) (mMethodArgs))).append(")").append("]").toString();
    }
}
