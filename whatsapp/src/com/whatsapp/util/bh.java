// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.util;

import android.util.AttributeSet;
import android.view.InflateException;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import java.io.InputStream;
import java.io.Reader;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

final class bh
    implements XmlPullParser
{

    private static final String z;
    final LayoutInflater a;
    final View b[];
    final String c;
    final AttributeSet d;

    bh(View aview[], LayoutInflater layoutinflater, String s, AttributeSet attributeset)
    {
        b = aview;
        a = layoutinflater;
        c = s;
        d = attributeset;
        super();
    }

    public void defineEntityReplacementText(String s, String s1)
    {
    }

    public int getAttributeCount()
    {
        return 0;
    }

    public String getAttributeName(int i)
    {
        return null;
    }

    public String getAttributeNamespace(int i)
    {
        return null;
    }

    public String getAttributePrefix(int i)
    {
        return null;
    }

    public String getAttributeType(int i)
    {
        return null;
    }

    public String getAttributeValue(int i)
    {
        return null;
    }

    public String getAttributeValue(String s, String s1)
    {
        return null;
    }

    public int getColumnNumber()
    {
        return 0;
    }

    public int getDepth()
    {
        return 0;
    }

    public int getEventType()
    {
        return 0;
    }

    public boolean getFeature(String s)
    {
        return false;
    }

    public String getInputEncoding()
    {
        return null;
    }

    public int getLineNumber()
    {
        return 0;
    }

    public String getName()
    {
        return null;
    }

    public String getNamespace()
    {
        return null;
    }

    public String getNamespace(String s)
    {
        return null;
    }

    public int getNamespaceCount(int i)
    {
        return 0;
    }

    public String getNamespacePrefix(int i)
    {
        return null;
    }

    public String getNamespaceUri(int i)
    {
        return null;
    }

    public String getPositionDescription()
    {
        return null;
    }

    public String getPrefix()
    {
        return null;
    }

    public Object getProperty(String s)
    {
        return null;
    }

    public String getText()
    {
        return null;
    }

    public char[] getTextCharacters(int ai[])
    {
        return null;
    }

    public boolean isAttributeDefault(int i)
    {
        return false;
    }

    public boolean isEmptyElementTag()
    {
        return false;
    }

    public boolean isWhitespace()
    {
        return false;
    }

    public int next()
    {
        try
        {
            b[0] = (TextView)a.createView(c, null, d);
        }
        catch (InflateException inflateexception) { }
        catch (ClassNotFoundException classnotfoundexception) { }
        throw new XmlPullParserException(z);
    }

    public int nextTag()
    {
        return 0;
    }

    public String nextText()
    {
        return null;
    }

    public int nextToken()
    {
        return 0;
    }

    public void require(int i, String s, String s1)
    {
    }

    public void setFeature(String s, boolean flag)
    {
    }

    public void setInput(InputStream inputstream, String s)
    {
    }

    public void setInput(Reader reader)
    {
    }

    public void setProperty(String s, Object obj)
    {
    }

    static 
    {
        char ac[];
        int i;
        int j;
        ac = "\000XW\017".toCharArray();
        j = ac.length;
        i = 0;
_L7:
        char c1;
        if (j <= i)
        {
            z = (new String(ac)).intern();
            return;
        }
        c1 = ac[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 68
    //                   0 86
    //                   1 92
    //                   2 98
    //                   3 104;
           goto _L1 _L2 _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_104;
_L2:
        break; /* Loop/switch isn't completed */
_L1:
        byte byte0 = 87;
_L8:
        ac[i] = (char)(byte0 ^ c1);
        i++;
        if (true) goto _L7; else goto _L6
_L6:
        byte0 = 101;
          goto _L8
_L3:
        byte0 = 32;
          goto _L8
_L4:
        byte0 = 62;
          goto _L8
        byte0 = 123;
          goto _L8
    }
}
