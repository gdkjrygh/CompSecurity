// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.kobjects.xmlrpc;

import java.io.FileReader;
import org.kobjects.xml.XmlReader;

// Referenced classes of package org.kobjects.xmlrpc:
//            XmlRpcParser

public class Driver
{

    public Driver()
    {
    }

    public static void main(String args[])
        throws Exception
    {
        (new XmlRpcParser(new XmlReader(new FileReader(args[0])))).parseResponse();
    }
}
