// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vladium.jcd.lib;

import java.io.IOException;
import java.io.PushbackReader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.vladium.jcd.lib:
//            Types

private static class m_in
{

    private PushbackReader m_in;
    final List m_result = new ArrayList();
    private StringBuffer m_token;

    private void consume(char c)
        throws IOException
    {
        char c1 = (char)m_in.read();
        if (c1 != c)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("consumed '").append(c1).append("' while expecting '").append(c).append("'").toString());
        } else
        {
            return;
        }
    }

    private void newToken()
    {
        m_result.add(m_token.toString());
        m_token.setLength(0);
    }

    void arrayType()
        throws IOException
    {
        consume('[');
        m_token.append('[');
        componentType();
    }

    void baseType()
        throws IOException
    {
        char c = (char)m_in.read();
        switch (c)
        {
        default:
            throw new IllegalArgumentException((new StringBuilder()).append("unknown base type: ").append(c).toString());

        case 66: // 'B'
        case 67: // 'C'
        case 68: // 'D'
        case 70: // 'F'
        case 73: // 'I'
        case 74: // 'J'
        case 83: // 'S'
        case 90: // 'Z'
            m_token.append(c);
            break;
        }
    }

    void componentType()
        throws IOException
    {
        fieldType();
    }

    void fieldType()
        throws IOException
    {
        char c = (char)m_in.read();
        m_in.unread(c);
        switch (c)
        {
        default:
            baseType();
            return;

        case 76: // 'L'
            objectType();
            return;

        case 91: // '['
            arrayType();
            break;
        }
    }

    String[] getResult()
    {
        String as[] = new String[m_result.size()];
        m_result.toArray(as);
        return as;
    }

    void methodDescriptor()
        throws IOException
    {
        consume('(');
        do
        {
            char c = (char)m_in.read();
            if (c != ')')
            {
                m_in.unread(c);
                parameterDescriptor();
            } else
            {
                returnDescriptor();
                return;
            }
        } while (true);
    }

    void objectType()
        throws IOException
    {
        consume('L');
        m_token.append('L');
        do
        {
            char c = (char)m_in.read();
            if (c != ';')
            {
                m_token.append(c);
            } else
            {
                m_token.append(';');
                return;
            }
        } while (true);
    }

    void parameterDescriptor()
        throws IOException
    {
        fieldType();
        newToken();
    }

    void returnDescriptor()
        throws IOException
    {
        char c = (char)m_in.read();
        switch (c)
        {
        default:
            m_in.unread(c);
            fieldType();
            return;

        case 86: // 'V'
            m_token.append(c);
            break;
        }
    }

    (String s)
    {
        m_token = new StringBuffer();
        m_in = new PushbackReader(new StringReader(s));
    }
}
