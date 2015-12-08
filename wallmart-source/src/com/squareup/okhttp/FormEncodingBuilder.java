// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp;

import com.squareup.okhttp.internal.Util;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

// Referenced classes of package com.squareup.okhttp:
//            MediaType, RequestBody

public final class FormEncodingBuilder
{

    private static final MediaType CONTENT_TYPE = MediaType.parse("application/x-www-form-urlencoded");
    private final StringBuilder content = new StringBuilder();

    public FormEncodingBuilder()
    {
    }

    public FormEncodingBuilder add(String s, String s1)
    {
        if (content.length() > 0)
        {
            content.append('&');
        }
        try
        {
            content.append(URLEncoder.encode(s, "UTF-8")).append('=').append(URLEncoder.encode(s1, "UTF-8"));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new AssertionError(s);
        }
        return this;
    }

    public RequestBody build()
    {
        if (content.length() == 0)
        {
            throw new IllegalStateException("Form encoded body must have at least one part.");
        } else
        {
            byte abyte0[] = content.toString().getBytes(Util.UTF_8);
            return RequestBody.create(CONTENT_TYPE, abyte0);
        }
    }

}
