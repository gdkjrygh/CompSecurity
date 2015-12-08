// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vladium.util;

import java.io.File;
import java.util.Enumeration;
import java.util.Properties;

// Referenced classes of package com.vladium.util:
//            XProperties, Property

private static final class m_src extends XProperties
{

    private Properties m_contents;
    private final File m_src;

    private void faultContents()
    {
        this;
        JVM INSTR monitorenter ;
        Object obj1 = m_contents;
        Properties properties;
        properties = ((Properties) (obj1));
        if (obj1 != null)
        {
            break MISSING_BLOCK_LABEL_32;
        }
        File file = m_src;
        properties = ((Properties) (obj1));
        if (file == null)
        {
            break MISSING_BLOCK_LABEL_32;
        }
        properties = Property.getPropertiesFromFile(m_src);
        obj1 = properties;
        if (properties != null)
        {
            break MISSING_BLOCK_LABEL_46;
        }
        obj1 = new XProperties();
        m_contents = ((Properties) (obj1));
        this;
        JVM INSTR monitorexit ;
        return;
        Object obj;
        obj;
        throw obj;
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
        obj;
        throw new RuntimeException((new StringBuilder()).append("exception while processing properties file [").append(m_src.getAbsolutePath()).append("]: ").append(obj).toString());
    }

    public Object get(Object obj)
    {
        faultContents();
        return m_contents.get(obj);
    }

    public String getProperty(String s)
    {
        faultContents();
        return m_contents.getProperty(s);
    }

    public Enumeration keys()
    {
        faultContents();
        return m_contents.keys();
    }

    (File file)
    {
        m_src = file;
    }
}
