// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vladium.util.args;

import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.vladium.util.args:
//            OptsParser

static final class 
{

    private static final KEYWORDS EMPTY_OPTDEF_ARRAY[] = new KEYWORDS[0];
    private static final Map KEYWORDS;
    private int m_currentChar;
    private Reader m_in;
    private List m_opts;
    private KEYWORDS m_token;

    private void consumeWS()
    {
        if (m_currentChar != -1)
        {
            while (Character.isWhitespace((char)m_currentChar)) 
            {
                nextChar();
            }
        }
    }

    private void nextChar()
    {
        try
        {
            m_currentChar = m_in.read();
            return;
        }
        catch (IOException ioexception)
        {
            throw new RuntimeException((new StringBuilder()).append("I/O error while parsing: ").append(ioexception).toString());
        }
    }

    m_in accept()
    {
        m_in m_in1 = m_token;
        nextToken();
        return m_in1;
    }

    nextToken accept(int i)
    {
        nextToken nexttoken = m_token;
        if (m_token.m_token() == i)
        {
            nextToken();
            return nexttoken;
        } else
        {
            throw new IllegalArgumentException((new StringBuilder()).append("parse error: invalid token [").append(m_token).append("], expected type [").append(i).append("]").toString());
        }
    }

    int[] cardinality()
    {
        m_token m_token1 = accept(9);
        if ("0".equals(m_token1.accept()))
        {
            return accept;
        }
        if ("1".equals(m_token1.accept()))
        {
            return accept;
        } else
        {
            return R_ONE;
        }
    }

    String[] namelist()
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(accept(1).accept());
        for (; m_token.m_token() == 4; arraylist.add(accept(1).accept()))
        {
            accept();
        }

        String as[] = new String[arraylist.size()];
        arraylist.toArray(as);
        return as;
    }

    void nextToken()
    {
        consumeWS();
        StringBuffer stringbuffer;
        switch (m_currentChar)
        {
        default:
            stringbuffer = new StringBuffer();
            for (; Character.isLetter((char)m_currentChar); nextChar())
            {
                stringbuffer.append((char)m_currentChar);
            }

            break;

        case -1: 
            m_token = m_token;
            return;

        case 58: // ':'
            nextChar();
            m_token = m_token;
            return;

        case 59: // ';'
            nextChar();
            m_token = ;
            return;

        case 44: // ','
            nextChar();
            m_token = m_token;
            return;

        case 123: // '{'
            nextChar();
            m_token = m_token;
            return;

        case 125: // '}'
            nextChar();
            m_token = m_token;
            return;

        case 48: // '0'
            nextChar();
            m_token = new m_token(9, "0");
            return;

        case 49: // '1'
            nextChar();
            m_token = new m_token(9, "1");
            return;

        case 63: // '?'
            nextChar();
            m_token = new m_token(9, "?");
            return;

        case 39: // '\''
            stringbuffer = new StringBuffer();
            nextChar();
            while (m_currentChar != 39) 
            {
                stringbuffer.append((char)m_currentChar);
                nextChar();
            }
            nextChar();
            m_token = new m_token(1, stringbuffer.toString());
            return;

        case 34: // '"'
            stringbuffer = new StringBuffer();
            nextChar();
            while (m_currentChar != 34) 
            {
                stringbuffer.append((char)m_currentChar);
                nextChar();
            }
            nextChar();
            m_token = new m_token(11, stringbuffer.toString());
            return;
        }
        accept accept1 = (m_token)KEYWORDS.get(stringbuffer.toString());
        if (accept1 == null)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("parse error: unrecognized keyword [").append(stringbuffer).append("]").toString());
        } else
        {
            m_token = accept1;
            return;
        }
    }

    m_token optdef()
    {
        m_token m_token1 = new m_token(false);
        m_token1.(optnamelist());
        accept(2);
        optmetadata(m_token1);
        accept(3);
        return m_token1;
    }

    void optmetadata(accept accept1)
    {
        m_token.m_token();
        JVM INSTR tableswitch 7 8: default 28
    //                   7 342
    //                   8 80;
           goto _L1 _L2 _L3
_L1:
        throw new IllegalArgumentException((new StringBuilder()).append("parse error: invalid token ").append(m_token).append(", expected ").append(m_token).append(" or ").append(m_token).toString());
_L3:
        accept();
        accept1.red(true);
_L5:
        accept(4);
        if (m_token.m_token() == 14)
        {
            accept();
            accept1.able(true);
            accept(4);
        }
        if (m_token.m_token() == 15)
        {
            accept();
            accept1.ledOnly(true);
            accept(4);
        }
        if (m_token.m_token() == 16)
        {
            accept();
            accept1.rn(true);
            accept(4);
        }
        accept(10);
        accept(2);
        accept1.Cardinality(cardinality());
        accept(4);
        if (m_token.m_token() == 1)
        {
            accept1.Mnemonic(m_token.m_token());
            accept();
            accept(4);
        }
        if (m_token.m_token() == 12)
        {
            accept();
            accept(5);
            accept1.resSet(namelist());
            accept(6);
            accept(4);
        }
        if (m_token.m_token() == 13)
        {
            accept();
            accept(5);
            accept1.desSet(namelist());
            accept(6);
            accept(4);
        }
        accept1.iption(accept(11).accept());
        return;
_L2:
        accept();
        accept1.red(false);
        if (true) goto _L5; else goto _L4
_L4:
    }

    String[] optnamelist()
    {
        return namelist();
    }

    namelist[] parse(Reader reader)
    {
        if (reader == null)
        {
            throw new IllegalArgumentException("null input: in");
        }
        m_in = reader;
        nextChar();
        nextToken();
        while (m_token != m_token) 
        {
            if (m_opts == null)
            {
                m_opts = new ArrayList();
            }
            m_opts.add(optdef());
        }
        if (m_opts == null || m_opts.size() == 0)
        {
            reader = EMPTY_OPTDEF_ARRAY;
        } else
        {
            reader = new EMPTY_OPTDEF_ARRAY[m_opts.size()];
            m_opts.toArray(reader);
        }
        m_in = null;
        m_opts = null;
        return reader;
    }

    static 
    {
        KEYWORDS = new HashMap(17);
        KEYWORDS.put(KEYWORDS.KEYWORDS(), KEYWORDS);
        KEYWORDS.put(KEYWORDS.KEYWORDS(), KEYWORDS);
        KEYWORDS.put(KEYWORDS.KEYWORDS(), KEYWORDS);
        KEYWORDS.put(KEYWORDS.KEYWORDS(), KEYWORDS);
        KEYWORDS.put(KEYWORDS.KEYWORDS(), KEYWORDS);
        KEYWORDS.put(.(), );
        KEYWORDS.put(NLY.NLY(), NLY);
        KEYWORDS.put(KEYWORDS.KEYWORDS(), KEYWORDS);
    }

    ()
    {
    }
}
