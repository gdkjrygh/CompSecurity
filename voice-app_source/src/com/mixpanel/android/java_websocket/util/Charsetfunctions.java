// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.java_websocket.util;

import com.mixpanel.android.java_websocket.exceptions.InvalidDataException;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CodingErrorAction;

public class Charsetfunctions
{

    public static CodingErrorAction codingErrorAction;

    public Charsetfunctions()
    {
    }

    public static byte[] asciiBytes(String s)
    {
        try
        {
            s = s.getBytes("ASCII");
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new RuntimeException(s);
        }
        return s;
    }

    public static void main(String args[])
        throws InvalidDataException
    {
        stringUtf8(utf8Bytes("\0"));
        stringAscii(asciiBytes("\0"));
    }

    public static String stringAscii(byte abyte0[])
    {
        return stringAscii(abyte0, 0, abyte0.length);
    }

    public static String stringAscii(byte abyte0[], int i, int j)
    {
        try
        {
            abyte0 = new String(abyte0, i, j, "ASCII");
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new RuntimeException(abyte0);
        }
        return abyte0;
    }

    public static String stringUtf8(ByteBuffer bytebuffer)
        throws InvalidDataException
    {
        Object obj = Charset.forName("UTF8").newDecoder();
        ((CharsetDecoder) (obj)).onMalformedInput(codingErrorAction);
        ((CharsetDecoder) (obj)).onUnmappableCharacter(codingErrorAction);
        try
        {
            bytebuffer.mark();
            obj = ((CharsetDecoder) (obj)).decode(bytebuffer).toString();
            bytebuffer.reset();
        }
        // Misplaced declaration of an exception variable
        catch (ByteBuffer bytebuffer)
        {
            throw new InvalidDataException(1007, bytebuffer);
        }
        return ((String) (obj));
    }

    public static String stringUtf8(byte abyte0[])
        throws InvalidDataException
    {
        return stringUtf8(ByteBuffer.wrap(abyte0));
    }

    public static byte[] utf8Bytes(String s)
    {
        try
        {
            s = s.getBytes("UTF8");
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new RuntimeException(s);
        }
        return s;
    }

    static 
    {
        codingErrorAction = CodingErrorAction.REPORT;
    }
}
