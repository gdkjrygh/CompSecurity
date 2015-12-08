// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib.message;

import ch.boye.httpclientandroidlib.Header;
import ch.boye.httpclientandroidlib.ProtocolVersion;
import ch.boye.httpclientandroidlib.RequestLine;
import ch.boye.httpclientandroidlib.StatusLine;
import ch.boye.httpclientandroidlib.util.CharArrayBuffer;

public interface LineFormatter
{

    public abstract CharArrayBuffer appendProtocolVersion(CharArrayBuffer chararraybuffer, ProtocolVersion protocolversion);

    public abstract CharArrayBuffer formatHeader(CharArrayBuffer chararraybuffer, Header header);

    public abstract CharArrayBuffer formatRequestLine(CharArrayBuffer chararraybuffer, RequestLine requestline);

    public abstract CharArrayBuffer formatStatusLine(CharArrayBuffer chararraybuffer, StatusLine statusline);
}
