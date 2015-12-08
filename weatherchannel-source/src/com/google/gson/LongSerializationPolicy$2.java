// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.gson;


// Referenced classes of package com.google.gson:
//            LongSerializationPolicy, JsonPrimitive, JsonElement

static final class nit> extends LongSerializationPolicy
{

    public JsonElement serialize(Long long1)
    {
        return new JsonPrimitive(String.valueOf(long1));
    }

    (String s, int i)
    {
        super(s, i, null);
    }
}
