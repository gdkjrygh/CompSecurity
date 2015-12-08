// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.mpmetrics;


// Referenced classes of package com.mixpanel.android.mpmetrics:
//            Tweaks

public static class <init>
{

    private final Object defaultValue;
    private final Number maximum;
    private final Number minimum;
    public final int type;
    private final Object value;

    public Boolean getBooleanValue()
    {
        Object obj1 = Boolean.valueOf(false);
        Object obj = obj1;
        if (defaultValue != null)
        {
            try
            {
                obj = (Boolean)defaultValue;
            }
            catch (ClassCastException classcastexception)
            {
                classcastexception = ((ClassCastException) (obj1));
            }
        }
        obj1 = obj;
        if (value != null)
        {
            try
            {
                obj1 = (Boolean)value;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj1)
            {
                return ((Boolean) (obj));
            }
        }
        return ((Boolean) (obj1));
    }

    public Number getNumberValue()
    {
        Object obj1 = Integer.valueOf(0);
        Object obj = obj1;
        if (defaultValue != null)
        {
            try
            {
                obj = (Number)defaultValue;
            }
            catch (ClassCastException classcastexception)
            {
                classcastexception = ((ClassCastException) (obj1));
            }
        }
        obj1 = obj;
        if (value != null)
        {
            try
            {
                obj1 = (Number)value;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj1)
            {
                return ((Number) (obj));
            }
        }
        return ((Number) (obj1));
    }

    public String getStringValue()
    {
        String s = null;
        String s1 = (String)defaultValue;
        s = s1;
_L2:
        String s2;
        try
        {
            s2 = (String)value;
        }
        catch (ClassCastException classcastexception)
        {
            return s;
        }
        return s2;
        ClassCastException classcastexception1;
        classcastexception1;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public value updateValue(Object obj)
    {
        return new <init>(type, defaultValue, minimum, maximum, obj);
    }

    private (int i, Object obj, Number number, Number number1, Object obj1)
    {
        type = i;
        defaultValue = obj;
        minimum = number;
        maximum = number1;
        value = obj1;
    }

    value(int i, Object obj, Number number, Number number1, Object obj1, value value1)
    {
        this(i, obj, number, number1, obj1);
    }
}
