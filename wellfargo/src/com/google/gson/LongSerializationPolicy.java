// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.gson;


// Referenced classes of package com.google.gson:
//            JsonElement

public abstract class LongSerializationPolicy extends Enum
{

    private static final LongSerializationPolicy $VALUES[];
    public static final LongSerializationPolicy DEFAULT;
    public static final LongSerializationPolicy STRING;

    private LongSerializationPolicy(String s, int i)
    {
        super(s, i);
    }

    LongSerializationPolicy(String s, int i, _cls1 _pcls1)
    {
        this(s, i);
    }

    public static LongSerializationPolicy valueOf(String s)
    {
        return (LongSerializationPolicy)Enum.valueOf(com/google/gson/LongSerializationPolicy, s);
    }

    public static LongSerializationPolicy[] values()
    {
        return (LongSerializationPolicy[])$VALUES.clone();
    }

    public abstract JsonElement serialize(Long long1);

    static 
    {
        DEFAULT = new _cls1("DEFAULT", 0);
        STRING = new _cls2("STRING", 1);
        $VALUES = (new LongSerializationPolicy[] {
            DEFAULT, STRING
        });
    }

    private class _cls1 extends LongSerializationPolicy
    {

        public JsonElement serialize(Long long1)
        {
            return new JsonPrimitive(long1);
        }

        _cls1(String s, int i)
        {
            super(s, i, null);
        }
    }


    private class _cls2 extends LongSerializationPolicy
    {

        public JsonElement serialize(Long long1)
        {
            return new JsonPrimitive(String.valueOf(long1));
        }

        _cls2(String s, int i)
        {
            super(s, i, null);
        }
    }

}
