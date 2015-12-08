// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.util.encoders;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;

// Referenced classes of package org.bouncycastle.util.encoders:
//            Base64Encoder, Encoder, DecoderException, EncoderException

public class Base64
{

    private static final Encoder encoder = new Base64Encoder();

    public Base64()
    {
    }

    public static int decode(String s, OutputStream outputstream)
    {
        return encoder.decode(s, outputstream);
    }

    public static byte[] decode(String s)
    {
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream((s.length() / 4) * 3);
        try
        {
            encoder.decode(s, bytearrayoutputstream);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new DecoderException((new StringBuilder()).append("unable to decode base64 string: ").append(s.getMessage()).toString(), s);
        }
        return bytearrayoutputstream.toByteArray();
    }

    public static byte[] decode(byte abyte0[])
    {
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream((abyte0.length / 4) * 3);
        try
        {
            encoder.decode(abyte0, 0, abyte0.length, bytearrayoutputstream);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new DecoderException((new StringBuilder()).append("unable to decode base64 data: ").append(abyte0.getMessage()).toString(), abyte0);
        }
        return bytearrayoutputstream.toByteArray();
    }

    public static int encode(byte abyte0[], int i, int j, OutputStream outputstream)
    {
        return encoder.encode(abyte0, i, j, outputstream);
    }

    public static int encode(byte abyte0[], OutputStream outputstream)
    {
        return encoder.encode(abyte0, 0, abyte0.length, outputstream);
    }

    public static byte[] encode(byte abyte0[])
    {
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream(((abyte0.length + 2) / 3) * 4);
        try
        {
            encoder.encode(abyte0, 0, abyte0.length, bytearrayoutputstream);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new EncoderException((new StringBuilder()).append("exception encoding base64 string: ").append(abyte0.getMessage()).toString(), abyte0);
        }
        return bytearrayoutputstream.toByteArray();
    }

}
