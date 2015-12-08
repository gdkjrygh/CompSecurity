// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package retrofit.mime;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URLEncoder;

// Referenced classes of package retrofit.mime:
//            TypedOutput

public final class FormUrlEncodedTypedOutput
    implements TypedOutput
{

    final ByteArrayOutputStream content = new ByteArrayOutputStream();

    public FormUrlEncodedTypedOutput()
    {
    }

    public void addField(String s, String s1)
    {
        if (s == null)
        {
            throw new NullPointerException("name");
        }
        if (s1 == null)
        {
            throw new NullPointerException("value");
        }
        if (content.size() > 0)
        {
            content.write(38);
        }
        try
        {
            s = URLEncoder.encode(s, "UTF-8");
            s1 = URLEncoder.encode(s1, "UTF-8");
            content.write(s.getBytes("UTF-8"));
            content.write(61);
            content.write(s1.getBytes("UTF-8"));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new RuntimeException(s);
        }
    }

    public String fileName()
    {
        return null;
    }

    public long length()
    {
        return (long)content.size();
    }

    public String mimeType()
    {
        return "application/x-www-form-urlencoded; charset=UTF-8";
    }

    public void writeTo(OutputStream outputstream)
    {
        outputstream.write(content.toByteArray());
    }
}
