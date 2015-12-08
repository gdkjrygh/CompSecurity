// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.service.item.deserializer;

import org.codehaus.jackson.map.ObjectMapper;

public class DefaultObjectMapper extends ObjectMapper
{
    private static class Holder
    {

        public static final ObjectMapper sInstance = new DefaultObjectMapper();


        private Holder()
        {
        }
    }


    private DefaultObjectMapper()
    {
        configure(org.codehaus.jackson.map.DeserializationConfig.Feature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        configure(org.codehaus.jackson.map.DeserializationConfig.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY, true);
    }


    public static ObjectMapper getInstance()
    {
        return Holder.sInstance;
    }
}
