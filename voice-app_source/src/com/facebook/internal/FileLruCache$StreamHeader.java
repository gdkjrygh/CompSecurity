// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.internal;

import com.facebook.LoggingBehavior;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

// Referenced classes of package com.facebook.internal:
//            FileLruCache, Logger

private static final class 
{

    private static final int HEADER_VERSION = 0;

    static JSONObject readHeader(InputStream inputstream)
        throws IOException
    {
        int i;
        int j;
        if (inputstream.read() != 0)
        {
            return null;
        }
        j = 0;
        i = 0;
_L8:
        if (i < 3) goto _L2; else goto _L1
_L1:
        byte abyte0[];
        abyte0 = new byte[j];
        i = 0;
_L6:
        if (i < abyte0.length) goto _L4; else goto _L3
_L3:
        inputstream = new JSONTokener(new String(abyte0));
        inputstream = ((InputStream) (inputstream.nextValue()));
        if (inputstream instanceof JSONObject)
        {
            break; /* Loop/switch isn't completed */
        }
        Logger.log(LoggingBehavior.CACHE, FileLruCache.TAG, (new StringBuilder("readHeader: expected JSONObject, got ")).append(inputstream.getClass().getCanonicalName()).toString());
        return null;
_L2:
        int l = inputstream.read();
        if (l == -1)
        {
            Logger.log(LoggingBehavior.CACHE, FileLruCache.TAG, "readHeader: stream.read returned -1 while reading header size");
            return null;
        }
        j = (j << 8) + (l & 0xff);
        i++;
        continue; /* Loop/switch isn't completed */
_L4:
        int k = inputstream.read(abyte0, i, abyte0.length - i);
        if (k < 1)
        {
            Logger.log(LoggingBehavior.CACHE, FileLruCache.TAG, (new StringBuilder("readHeader: stream.read stopped at ")).append(Integer.valueOf(i)).append(" when expected ").append(abyte0.length).toString());
            return null;
        }
        i += k;
        if (true) goto _L6; else goto _L5
_L5:
        inputstream = (JSONObject)inputstream;
        return inputstream;
        inputstream;
        throw new IOException(inputstream.getMessage());
        if (true) goto _L8; else goto _L7
_L7:
    }

    static void writeHeader(OutputStream outputstream, JSONObject jsonobject)
        throws IOException
    {
        jsonobject = jsonobject.toString().getBytes();
        outputstream.write(0);
        outputstream.write(jsonobject.length >> 16 & 0xff);
        outputstream.write(jsonobject.length >> 8 & 0xff);
        outputstream.write(jsonobject.length >> 0 & 0xff);
        outputstream.write(jsonobject);
    }

    private ()
    {
    }
}
