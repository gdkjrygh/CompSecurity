// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.converter.http;

import com.google.android.apps.youtube.core.converter.ConverterException;
import com.google.android.apps.youtube.core.converter.c;
import com.google.android.apps.youtube.datalib.legacy.model.SubtitleTrack;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.HttpGet;
import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

// Referenced classes of package com.google.android.apps.youtube.core.converter.http:
//            ay

public final class dg extends ay
    implements c
{

    public dg()
    {
    }

    private static List b(HttpEntity httpentity)
    {
        ArrayList arraylist = new ArrayList();
        if (httpentity.getContentLength() == 0L)
        {
            return arraylist;
        }
        String s;
        String s1;
        String s2;
        String s3;
        Object obj;
        int i;
        byte byte0;
        boolean flag;
        try
        {
            httpentity = httpentity.getContent();
            httpentity = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(httpentity).getElementsByTagName("track");
        }
        // Misplaced declaration of an exception variable
        catch (HttpEntity httpentity)
        {
            throw new ConverterException(httpentity);
        }
        // Misplaced declaration of an exception variable
        catch (HttpEntity httpentity)
        {
            throw new ConverterException(httpentity);
        }
        i = 0;
        if (i >= httpentity.getLength())
        {
            break; /* Loop/switch isn't completed */
        }
        obj = httpentity.item(i).getAttributes();
        s = ((NamedNodeMap) (obj)).getNamedItem("lang_code").getNodeValue();
        s1 = ((NamedNodeMap) (obj)).getNamedItem("lang_original").getNodeValue();
        s2 = ((NamedNodeMap) (obj)).getNamedItem("name").getNodeValue();
        s3 = ((NamedNodeMap) (obj)).getNamedItem("vss_id").getNodeValue();
        flag = true;
        obj = ((NamedNodeMap) (obj)).getNamedItem("formats");
        byte0 = flag;
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_192;
        }
        byte0 = flag;
        if (Arrays.asList(((Node) (obj)).getNodeValue().split(",")).contains("2"))
        {
            byte0 = 2;
        }
        arraylist.add(SubtitleTrack.createIncomplete(s, s1, s2, byte0, s3));
        i++;
        if (true) goto _L2; else goto _L1
_L2:
        break MISSING_BLOCK_LABEL_49;
_L1:
        return arraylist;
    }

    public final Object a(Object obj)
    {
        obj = (String)obj;
        com.google.android.apps.youtube.common.fromguava.c.a(((String) (obj)));
        return new HttpGet((new StringBuilder("http://video.google.com/timedtext?hl=en&v=")).append(((String) (obj))).append("&type=list&fmts=1&vssids=true").toString());
    }

    protected final Object a(HttpEntity httpentity)
    {
        return b(httpentity);
    }
}
