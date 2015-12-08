// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.base;


// Referenced classes of package com.google.common.base:
//            Objects, Preconditions

public static final class <init>
{
    private static final class ValueHolder
    {

        String name;
        ValueHolder next;
        Object value;

        private ValueHolder()
        {
        }

        ValueHolder(Objects._cls1 _pcls1)
        {
            this();
        }
    }


    private final String className;
    private ValueHolder holderHead;
    private ValueHolder holderTail;
    private boolean omitNullValues;

    private ValueHolder addHolder()
    {
        ValueHolder valueholder = new ValueHolder(null);
        holderTail.next = valueholder;
        holderTail = valueholder;
        return valueholder;
    }

    private holderTail addHolder(Object obj)
    {
        addHolder().value = obj;
        return this;
    }

    private ValueHolder.value addHolder(String s, Object obj)
    {
        ValueHolder valueholder = addHolder();
        valueholder.value = obj;
        valueholder.name = (String)Preconditions.checkNotNull(s);
        return this;
    }

    public ull add(String s, char c)
    {
        return addHolder(s, String.valueOf(c));
    }

    public addHolder add(String s, double d)
    {
        return addHolder(s, String.valueOf(d));
    }

    public addHolder add(String s, float f)
    {
        return addHolder(s, String.valueOf(f));
    }

    public addHolder add(String s, int i)
    {
        return addHolder(s, String.valueOf(i));
    }

    public addHolder add(String s, long l)
    {
        return addHolder(s, String.valueOf(l));
    }

    public addHolder add(String s, Object obj)
    {
        return addHolder(s, obj);
    }

    public addHolder add(String s, boolean flag)
    {
        return addHolder(s, String.valueOf(flag));
    }

    public addHolder addValue(char c)
    {
        return addHolder(String.valueOf(c));
    }

    public addHolder addValue(double d)
    {
        return addHolder(String.valueOf(d));
    }

    public addHolder addValue(float f)
    {
        return addHolder(String.valueOf(f));
    }

    public addHolder addValue(int i)
    {
        return addHolder(String.valueOf(i));
    }

    public addHolder addValue(long l)
    {
        return addHolder(String.valueOf(l));
    }

    public addHolder addValue(Object obj)
    {
        return addHolder(obj);
    }

    public addHolder addValue(boolean flag)
    {
        return addHolder(String.valueOf(flag));
    }

    public addHolder omitNullValues()
    {
        omitNullValues = true;
        return this;
    }

    public String toString()
    {
        boolean flag = omitNullValues;
        String s = "";
        StringBuilder stringbuilder = (new StringBuilder(32)).append(className).append('{');
        for (ValueHolder valueholder = holderHead.next; valueholder != null;)
        {
            String s1;
label0:
            {
                if (flag)
                {
                    s1 = s;
                    if (valueholder.value == null)
                    {
                        break label0;
                    }
                }
                stringbuilder.append(s);
                s1 = ", ";
                if (valueholder.name != null)
                {
                    stringbuilder.append(valueholder.name).append('=');
                }
                stringbuilder.append(valueholder.value);
            }
            valueholder = valueholder.next;
            s = s1;
        }

        return stringbuilder.append('}').toString();
    }

    private ValueHolder(String s)
    {
        holderHead = new ValueHolder(null);
        holderTail = holderHead;
        omitNullValues = false;
        className = (String)Preconditions.checkNotNull(s);
    }

    ull(String s, ull ull)
    {
        this(s);
    }
}
