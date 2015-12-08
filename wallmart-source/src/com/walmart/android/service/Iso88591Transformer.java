// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.service;

import com.walmartlabs.kangaroo.service.Transformer;
import com.walmartlabs.utils.WLog;
import java.io.IOException;
import java.nio.charset.Charset;
import org.codehaus.jackson.map.ObjectMapper;

public class Iso88591Transformer
    implements Transformer
{

    private static final String TAG = com/walmart/android/service/Iso88591Transformer.getSimpleName();
    private final Class mClass;
    private final ObjectMapper mObjectMapper;

    public Iso88591Transformer(Class class1, ObjectMapper objectmapper)
    {
        mClass = class1;
        mObjectMapper = objectmapper;
    }

    public volatile Object transform(Object obj)
    {
        return transform((byte[])obj);
    }

    public Object transform(byte abyte0[])
    {
        abyte0 = new String(abyte0, Charset.forName("ISO-8859-1"));
        abyte0 = ((byte []) (mObjectMapper.readValue(abyte0, mClass)));
        return abyte0;
        abyte0;
_L2:
        WLog.e(TAG, "could not transform response", abyte0);
        return null;
        abyte0;
        continue; /* Loop/switch isn't completed */
        abyte0;
        if (true) goto _L2; else goto _L1
_L1:
    }

}
