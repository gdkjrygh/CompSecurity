// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.ksoap2.transport;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.ksoap2.SoapEnvelope;
import org.xmlpull.v1.XmlPullParserException;

// Referenced classes of package org.ksoap2.transport:
//            Transport, ServiceConnection, ServiceConnectionSE

public class HttpTransportSE extends Transport
{

    public HttpTransportSE(String s)
    {
        super(s);
    }

    public void call(String s, SoapEnvelope soapenvelope)
        throws IOException, XmlPullParserException
    {
        Object obj;
        byte abyte0[];
        int i;
        obj = s;
        if (s == null)
        {
            obj = "\"\"";
        }
        byte abyte1[] = createRequestData(soapenvelope);
        if (debug)
        {
            s = new String(abyte1);
        } else
        {
            s = null;
        }
        requestDump = s;
        responseDump = null;
        abyte0 = getServiceConnection();
        abyte0.setRequestProperty("User-Agent", "kSOAP/2.0");
        abyte0.setRequestProperty("SOAPAction", ((String) (obj)));
        abyte0.setRequestProperty("Content-Type", "text/xml");
        abyte0.setRequestProperty("Connection", "close");
        abyte0.setRequestProperty("Content-Length", (new StringBuilder()).append("").append(abyte1.length).toString());
        abyte0.setRequestMethod("POST");
        abyte0.connect();
        s = abyte0.openOutputStream();
        s.write(abyte1, 0, abyte1.length);
        s.flush();
        s.close();
        try
        {
            abyte0.connect();
            s = abyte0.openInputStream();
        }
        catch (IOException ioexception)
        {
            obj = abyte0.getErrorStream();
            s = ((String) (obj));
            if (obj == null)
            {
                abyte0.disconnect();
                throw ioexception;
            }
        }
        obj = s;
        if (!debug) goto _L2; else goto _L1
_L1:
        obj = new ByteArrayOutputStream();
        abyte0 = new byte[256];
_L6:
        i = s.read(abyte0, 0, 256);
        if (i != -1) goto _L4; else goto _L3
_L3:
        ((ByteArrayOutputStream) (obj)).flush();
        obj = ((ByteArrayOutputStream) (obj)).toByteArray();
        responseDump = new String(((byte []) (obj)));
        s.close();
        obj = new ByteArrayInputStream(((byte []) (obj)));
_L2:
        parseResponse(soapenvelope, ((InputStream) (obj)));
        return;
_L4:
        ((ByteArrayOutputStream) (obj)).write(abyte0, 0, i);
        if (true) goto _L6; else goto _L5
_L5:
    }

    protected ServiceConnection getServiceConnection()
        throws IOException
    {
        return new ServiceConnectionSE(url);
    }
}
