// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vladium.util.args;

import com.vladium.util.IConstants;
import com.vladium.util.ResourceLoader;
import java.io.CharArrayWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.Reader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.vladium.util.args:
//            IOptsParser

final class OptsParser
    implements IOptsParser
{
    static final class MetadataParser
    {

        private static final OptDef EMPTY_OPTDEF_ARRAY[] = new OptDef[0];
        private static final Map KEYWORDS;
        private int m_currentChar;
        private Reader m_in;
        private List m_opts;
        private Token m_token;

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

        Token accept()
        {
            Token token = m_token;
            nextToken();
            return token;
        }

        Token accept(int i)
        {
            Token token = m_token;
            if (m_token.getID() == i)
            {
                nextToken();
                return token;
            } else
            {
                throw new IllegalArgumentException((new StringBuilder()).append("parse error: invalid token [").append(m_token).append("], expected type [").append(i).append("]").toString());
            }
        }

        int[] cardinality()
        {
            Token token = accept(9);
            if ("0".equals(token.getValue()))
            {
                return OptDef.C_ZERO;
            }
            if ("1".equals(token.getValue()))
            {
                return OptDef.C_ONE;
            } else
            {
                return OptDef.C_ZERO_OR_ONE;
            }
        }

        String[] namelist()
        {
            ArrayList arraylist = new ArrayList();
            arraylist.add(accept(1).getValue());
            for (; m_token.getID() == 4; arraylist.add(accept(1).getValue()))
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
                m_token = Token.EOF;
                return;

            case 58: // ':'
                nextChar();
                m_token = Token.COLON;
                return;

            case 59: // ';'
                nextChar();
                m_token = Token.SEMICOLON;
                return;

            case 44: // ','
                nextChar();
                m_token = Token.COMMA;
                return;

            case 123: // '{'
                nextChar();
                m_token = Token.LBRACKET;
                return;

            case 125: // '}'
                nextChar();
                m_token = Token.RBRACKET;
                return;

            case 48: // '0'
                nextChar();
                m_token = new Token(9, "0");
                return;

            case 49: // '1'
                nextChar();
                m_token = new Token(9, "1");
                return;

            case 63: // '?'
                nextChar();
                m_token = new Token(9, "?");
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
                m_token = new Token(1, stringbuffer.toString());
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
                m_token = new Token(11, stringbuffer.toString());
                return;
            }
            Token token = (Token)KEYWORDS.get(stringbuffer.toString());
            if (token == null)
            {
                throw new IllegalArgumentException((new StringBuilder()).append("parse error: unrecognized keyword [").append(stringbuffer).append("]").toString());
            } else
            {
                m_token = token;
                return;
            }
        }

        OptDef optdef()
        {
            OptDef optdef1 = new OptDef(false);
            optdef1.setNames(optnamelist());
            accept(2);
            optmetadata(optdef1);
            accept(3);
            return optdef1;
        }

        void optmetadata(OptDef optdef1)
        {
            m_token.getID();
            JVM INSTR tableswitch 7 8: default 28
        //                       7 342
        //                       8 80;
               goto _L1 _L2 _L3
_L1:
            throw new IllegalArgumentException((new StringBuilder()).append("parse error: invalid token ").append(m_token).append(", expected ").append(Token.REQUIRED).append(" or ").append(Token.OPTIONAL).toString());
_L3:
            accept();
            optdef1.setRequired(true);
_L5:
            accept(4);
            if (m_token.getID() == 14)
            {
                accept();
                optdef1.setMergeable(true);
                accept(4);
            }
            if (m_token.getID() == 15)
            {
                accept();
                optdef1.setDetailedOnly(true);
                accept(4);
            }
            if (m_token.getID() == 16)
            {
                accept();
                optdef1.setPattern(true);
                accept(4);
            }
            accept(10);
            accept(2);
            optdef1.setValueCardinality(cardinality());
            accept(4);
            if (m_token.getID() == 1)
            {
                optdef1.setValueMnemonic(m_token.getValue());
                accept();
                accept(4);
            }
            if (m_token.getID() == 12)
            {
                accept();
                accept(5);
                optdef1.setRequiresSet(namelist());
                accept(6);
                accept(4);
            }
            if (m_token.getID() == 13)
            {
                accept();
                accept(5);
                optdef1.setExcludesSet(namelist());
                accept(6);
                accept(4);
            }
            optdef1.setDescription(accept(11).getValue());
            return;
_L2:
            accept();
            optdef1.setRequired(false);
            if (true) goto _L5; else goto _L4
_L4:
        }

        String[] optnamelist()
        {
            return namelist();
        }

        OptDef[] parse(Reader reader)
        {
            if (reader == null)
            {
                throw new IllegalArgumentException("null input: in");
            }
            m_in = reader;
            nextChar();
            nextToken();
            while (m_token != Token.EOF) 
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
                reader = new OptDef[m_opts.size()];
                m_opts.toArray(reader);
            }
            m_in = null;
            m_opts = null;
            return reader;
        }

        static 
        {
            KEYWORDS = new HashMap(17);
            KEYWORDS.put(Token.OPTIONAL.getValue(), Token.OPTIONAL);
            KEYWORDS.put(Token.REQUIRED.getValue(), Token.REQUIRED);
            KEYWORDS.put(Token.VALUES.getValue(), Token.VALUES);
            KEYWORDS.put(Token.REQUIRES.getValue(), Token.REQUIRES);
            KEYWORDS.put(Token.EXCLUDES.getValue(), Token.EXCLUDES);
            KEYWORDS.put(Token.MERGEABLE.getValue(), Token.MERGEABLE);
            KEYWORDS.put(Token.DETAILEDONLY.getValue(), Token.DETAILEDONLY);
            KEYWORDS.put(Token.PATTERN.getValue(), Token.PATTERN);
        }

        MetadataParser()
        {
        }
    }

    static final class Opt
        implements IOptsParser.IOpt
    {

        private final String m_canonicalName;
        private final String m_name;
        private final String m_patternPrefix;
        private ArrayList m_values;

        void addValue(String s)
        {
            if (s == null)
            {
                throw new IllegalArgumentException("null input: value");
            }
            if (m_values == null)
            {
                m_values = new ArrayList();
            }
            m_values.add(s);
        }

        public String getCanonicalName()
        {
            return m_canonicalName;
        }

        public String getFirstValue()
        {
            if (m_values == null)
            {
                return null;
            } else
            {
                return (String)m_values.get(0);
            }
        }

        public String getName()
        {
            return m_name;
        }

        public String getPatternPrefix()
        {
            return m_patternPrefix;
        }

        public int getValueCount()
        {
            if (m_values == null)
            {
                return 0;
            } else
            {
                return m_values.size();
            }
        }

        public String[] getValues()
        {
            if (m_values == null)
            {
                return IConstants.EMPTY_STRING_ARRAY;
            } else
            {
                String as[] = new String[m_values.size()];
                m_values.toArray(as);
                return as;
            }
        }

        public String toString()
        {
            StringBuffer stringbuffer = new StringBuffer(m_name);
            if (!m_canonicalName.equals(m_name))
            {
                stringbuffer.append((new StringBuilder()).append(" [").append(m_canonicalName).append("]").toString());
            }
            if (m_values != null)
            {
                stringbuffer.append(": ");
                stringbuffer.append(m_values);
            }
            return stringbuffer.toString();
        }

        Opt(String s, String s1, String s2)
        {
            m_name = s;
            m_canonicalName = s1;
            m_patternPrefix = s2;
        }
    }

    static final class OptDef
    {

        static final int C_ONE[] = {
            1, 1
        };
        static final int C_ONE_OR_MORE[] = {
            1, 0x7fffffff
        };
        static final int C_ZERO[] = {
            0, 0
        };
        static final int C_ZERO_OR_MORE[] = {
            0, 0x7fffffff
        };
        static final int C_ZERO_OR_ONE[] = {
            0, 1
        };
        private String m_description;
        private boolean m_detailedOnly;
        private String m_excludesSet[];
        private boolean m_mergeable;
        private String m_names[];
        private boolean m_pattern;
        private boolean m_required;
        private String m_requiresSet[];
        private final boolean m_usage;
        private int m_valueCardinality[];
        private String m_valueMnemonic;

        String getCanonicalName()
        {
            return m_names[0];
        }

        String getDescription()
        {
            return m_description;
        }

        String[] getExcludesSet()
        {
            return m_excludesSet;
        }

        String[] getNames()
        {
            return m_names;
        }

        String[] getRequiresSet()
        {
            return m_requiresSet;
        }

        int[] getValueCardinality()
        {
            return m_valueCardinality;
        }

        String getValueMnemonic()
        {
            return m_valueMnemonic;
        }

        boolean isDetailedOnly()
        {
            return m_detailedOnly;
        }

        boolean isMergeable()
        {
            return m_mergeable;
        }

        boolean isPattern()
        {
            return m_pattern;
        }

        boolean isRequired()
        {
            return m_required;
        }

        boolean isUsage()
        {
            return m_usage;
        }

        void setDescription(String s)
        {
            if (s == null)
            {
                throw new IllegalArgumentException("null input: description");
            } else
            {
                m_description = s;
                return;
            }
        }

        void setDetailedOnly(boolean flag)
        {
            m_detailedOnly = flag;
        }

        void setExcludesSet(String as[])
        {
            if (as == null)
            {
                throw new IllegalArgumentException("null input: names");
            }
            if (as.length <= 0)
            {
                as = null;
            }
            m_excludesSet = as;
        }

        void setMergeable(boolean flag)
        {
            m_mergeable = flag;
        }

        void setNames(String as[])
        {
            if (as == null)
            {
                throw new IllegalArgumentException("null input: names");
            } else
            {
                m_names = as;
                return;
            }
        }

        void setPattern(boolean flag)
        {
            m_pattern = flag;
        }

        void setRequired(boolean flag)
        {
            m_required = flag;
        }

        void setRequiresSet(String as[])
        {
            if (as == null)
            {
                throw new IllegalArgumentException("null input: names");
            }
            if (as.length <= 0)
            {
                as = null;
            }
            m_requiresSet = as;
        }

        void setValueCardinality(int ai[])
        {
            if (ai == null || ai.length != 2)
            {
                throw new IllegalArgumentException("null or invalid input: cardinality");
            } else
            {
                m_valueCardinality = ai;
                return;
            }
        }

        void setValueMnemonic(String s)
        {
            if (s == null)
            {
                throw new IllegalArgumentException("null input: mnemonic");
            } else
            {
                m_valueMnemonic = s;
                return;
            }
        }


        OptDef(boolean flag)
        {
            m_usage = flag;
        }
    }

    static final class OptDefMetadata
    {

        final Map m_optdefMap = new HashMap();
        final List m_optdefs = new ArrayList();
        final Map m_patternOptDefMap = new HashMap();
        final Set m_requiredOpts = new HashSet();
        private OptDef m_usageOptDef;

        void addOptDef(OptDef optdef)
        {
            if (optdef == null)
            {
                throw new IllegalArgumentException("null input: optdef");
            }
            Map map;
            String as[];
            if (optdef.isPattern())
            {
                map = m_patternOptDefMap;
            } else
            {
                map = m_optdefMap;
            }
            as = optdef.getNames();
            for (int i = 0; i < as.length; i++)
            {
                if (map.containsKey(as[i]))
                {
                    throw new IllegalArgumentException((new StringBuilder()).append("duplicate option name [").append(as[i]).append("]").toString());
                }
                map.put(as[i], optdef);
            }

            m_optdefs.add(optdef);
            if (optdef.isRequired())
            {
                m_requiredOpts.add(optdef.getCanonicalName());
            }
            if (optdef.isUsage())
            {
                if (m_usageOptDef != null)
                {
                    throw new IllegalArgumentException("usage optdef set already");
                }
                m_usageOptDef = optdef;
            }
        }

        OptDef getOptDef(String s, String as[])
        {
            Object obj;
label0:
            {
                if (s == null)
                {
                    throw new IllegalArgumentException("null input: name");
                }
                if (as != null)
                {
                    as[0] = null;
                }
                OptDef optdef = (OptDef)m_optdefMap.get(s);
                obj = optdef;
                if (optdef != null)
                {
                    break label0;
                }
                Iterator iterator = m_patternOptDefMap.entrySet().iterator();
                String s1;
                do
                {
                    obj = optdef;
                    if (!iterator.hasNext())
                    {
                        break label0;
                    }
                    obj = (java.util.Map.Entry)iterator.next();
                    s1 = (String)((java.util.Map.Entry) (obj)).getKey();
                } while (!s.startsWith(s1));
                if (as != null)
                {
                    as[0] = s1;
                }
                obj = (OptDef)((java.util.Map.Entry) (obj)).getValue();
            }
            return ((OptDef) (obj));
        }

        Iterator getOptDefs()
        {
            return m_optdefs.iterator();
        }

        OptDef getPatternOptDefs(String s)
        {
            if (s == null)
            {
                throw new IllegalArgumentException("null input: pattern");
            } else
            {
                return (OptDef)m_patternOptDefMap.get(s);
            }
        }

        Set getRequiredOpts()
        {
            return m_requiredOpts;
        }

        OptDef getUsageOptDef()
        {
            return m_usageOptDef;
        }

        OptDefMetadata()
        {
        }
    }

    static final class Opts
        implements IOptsParser.IOpts
    {

        private static final int DEFAULT_ERROR_WIDTH = 80;
        private static final IOptsParser.IOpt EMPTY_OPT_ARRAY[] = new IOptsParser.IOpt[0];
        private List m_errors;
        private String m_freeArgs[];
        private final Map m_nameMap = new HashMap();
        private final List m_opts = new ArrayList();
        private final Map m_patternMap = new HashMap();
        private int m_usageRequestLevel;

        void addError(String s)
        {
            if (s != null)
            {
                if (m_errors == null)
                {
                    m_errors = new ArrayList();
                }
                m_errors.add(s);
            }
        }

        void addOpt(Opt opt, OptDef optdef, String s)
        {
            if (opt == null)
            {
                throw new IllegalArgumentException("null input: opt");
            }
            if (optdef == null)
            {
                throw new IllegalArgumentException("null input: optdef");
            }
            if (s == null)
            {
                throw new IllegalArgumentException("null input: occuranceName");
            }
            m_opts.add(opt);
            String as[] = optdef.getNames();
            int i;
            if (opt.getPatternPrefix() != null)
            {
                i = 1;
            } else
            {
                i = 0;
            }
            if (i != 0)
            {
                s = s.substring(opt.getPatternPrefix().length());
                for (i = 0; i < as.length; i++)
                {
                    m_nameMap.put(as[i].concat(s), opt);
                }

                optdef = optdef.getCanonicalName();
                s = (List)m_patternMap.get(optdef);
                optdef = s;
                if (s == null)
                {
                    s = new ArrayList();
                    int j = 0;
                    do
                    {
                        optdef = s;
                        if (j >= as.length)
                        {
                            break;
                        }
                        m_patternMap.put(as[j], s);
                        j++;
                    } while (true);
                }
                optdef.add(opt);
            } else
            {
                int k = 0;
                while (k < as.length) 
                {
                    m_nameMap.put(as[k], opt);
                    k++;
                }
            }
        }

        public void error(PrintWriter printwriter, int i)
        {
            if (hasErrors())
            {
                for (Iterator iterator = m_errors.iterator(); iterator.hasNext(); printwriter.println(iterator.next())) { }
            }
        }

        String errorsToString()
        {
            if (!hasErrors())
            {
                return "<no errors>";
            } else
            {
                CharArrayWriter chararraywriter = new CharArrayWriter();
                PrintWriter printwriter = new PrintWriter(chararraywriter);
                error(printwriter, 80);
                printwriter.flush();
                return chararraywriter.toString();
            }
        }

        public String[] getFreeArgs()
        {
            if (hasErrors())
            {
                throw new IllegalStateException(errorsToString());
            } else
            {
                return m_freeArgs;
            }
        }

        Opt getOpt(String s)
        {
            if (s == null)
            {
                throw new IllegalArgumentException("null input: occuranceName");
            } else
            {
                return (Opt)m_nameMap.get(s);
            }
        }

        public IOptsParser.IOpt[] getOpts()
        {
            if (hasErrors())
            {
                return null;
            }
            if (m_opts.isEmpty())
            {
                return EMPTY_OPT_ARRAY;
            } else
            {
                IOptsParser.IOpt aiopt[] = new IOptsParser.IOpt[m_opts.size()];
                m_opts.toArray(aiopt);
                return aiopt;
            }
        }

        public IOptsParser.IOpt[] getOpts(String s)
        {
            if (hasErrors())
            {
                return null;
            }
            s = (List)m_patternMap.get(s);
            if (s == null || s.isEmpty())
            {
                return EMPTY_OPT_ARRAY;
            } else
            {
                IOptsParser.IOpt aiopt[] = new IOptsParser.IOpt[s.size()];
                s.toArray(aiopt);
                return aiopt;
            }
        }

        public boolean hasArg(String s)
        {
            if (hasErrors())
            {
                throw new IllegalStateException(errorsToString());
            } else
            {
                return m_nameMap.containsKey(s);
            }
        }

        boolean hasErrors()
        {
            return m_errors != null && !m_errors.isEmpty();
        }

        void setFreeArgs(String as[], int i)
        {
            if (as == null)
            {
                throw new IllegalArgumentException("null input: args");
            }
            if (i < 0 || i > as.length)
            {
                throw new IllegalArgumentException((new StringBuilder()).append("invalid start index: ").append(i).toString());
            } else
            {
                m_freeArgs = new String[as.length - i];
                System.arraycopy(as, i, m_freeArgs, 0, m_freeArgs.length);
                return;
            }
        }

        void setUsageRequested(int i)
        {
            m_usageRequestLevel = i;
        }

        public int usageRequestLevel()
        {
            return m_usageRequestLevel;
        }


        Opts()
        {
        }
    }

    private static final class Token
    {

        static final int CARD_ID = 9;
        static final Token COLON = new Token(2, ":");
        static final int COLON_ID = 2;
        static final Token COMMA = new Token(4, ",");
        static final int COMMA_ID = 4;
        static final Token DETAILEDONLY = new Token(15, "detailedonly");
        static final int DETAILEDONLY_ID = 15;
        static final Token EOF = new Token(0, "<EOF>");
        static final int EOF_ID = 0;
        static final Token EXCLUDES = new Token(13, "excludes");
        static final int EXCLUDES_ID = 13;
        static final Token LBRACKET = new Token(5, "{");
        static final int LBRACKET_ID = 5;
        static final Token MERGEABLE = new Token(14, "mergeable");
        static final int MERGEABLE_ID = 14;
        static final Token OPTIONAL = new Token(7, "optional");
        static final int OPTIONAL_ID = 7;
        static final Token PATTERN = new Token(16, "pattern");
        static final int PATTERN_ID = 16;
        static final Token RBRACKET = new Token(6, "}");
        static final int RBRACKET_ID = 6;
        static final Token REQUIRED = new Token(8, "required");
        static final int REQUIRED_ID = 8;
        static final Token REQUIRES = new Token(12, "requires");
        static final int REQUIRES_ID = 12;
        static final Token SEMICOLON = new Token(3, ";");
        static final int SEMICOLON_ID = 3;
        static final int STRING_ID = 1;
        static final int TEXT_ID = 11;
        static final Token VALUES = new Token(10, "values");
        static final int VALUES_ID = 10;
        private final int m_ID;
        private final String m_value;

        int getID()
        {
            return m_ID;
        }

        String getValue()
        {
            return m_value;
        }

        public String toString()
        {
            return (new StringBuilder()).append(m_ID).append(": [").append(m_value).append("]").toString();
        }


        Token(int i, String s)
        {
            if (s == null)
            {
                throw new IllegalArgumentException("null input: value");
            } else
            {
                m_ID = i;
                m_value = s;
                return;
            }
        }
    }


    private static final int CANONICAL_OPT_PREFIX = 1;
    private static final String OPT_PREFIXES[] = {
        "--", "-"
    };
    private static final char OPT_VALUE_SEPARATORS[] = {
        ':', '='
    };
    private static final int STATE_ERROR = 3;
    private static final int STATE_FREE_ARGS = 2;
    private static final int STATE_OPT = 0;
    private static final int STATE_OPT_VALUE = 1;
    private final OptDefMetadata m_metadata;
    private final String m_msgPrefix;

    OptsParser(String s, ClassLoader classloader, String s1, String as[])
    {
        if (s == null)
        {
            throw new IllegalArgumentException("null input: metadataResourceName");
        }
        m_msgPrefix = s1;
        s1 = null;
        InputStream inputstream = ResourceLoader.getResourceAsStream(s, classloader);
        if (inputstream != null)
        {
            break MISSING_BLOCK_LABEL_92;
        }
        s1 = inputstream;
        throw new IllegalArgumentException((new StringBuilder()).append("resource [").append(s).append("] could not be loaded via [").append(classloader).append("]").toString());
        s;
        if (s1 != null)
        {
            try
            {
                s1.close();
            }
            // Misplaced declaration of an exception variable
            catch (ClassLoader classloader) { }
        }
        throw s;
        s1 = inputstream;
        m_metadata = parseOptDefMetadata(new InputStreamReader(inputstream), as);
        if (inputstream == null)
        {
            break MISSING_BLOCK_LABEL_123;
        }
        inputstream.close();
        return;
        s;
    }

    OptsParser(String s, ClassLoader classloader, String as[])
    {
        this(s, classloader, null, as);
    }

    private String formatMessage(String s)
    {
        if (m_msgPrefix == null)
        {
            return s;
        } else
        {
            return m_msgPrefix.concat(s);
        }
    }

    private static String getOptCanonicalName(String s, OptDef optdef)
    {
        if (optdef.isPattern())
        {
            String s1 = optdef.getCanonicalName();
            optdef = optdef.getNames();
            for (int i = 0; i < optdef.length; i++)
            {
                String s2 = optdef[i];
                if (s.startsWith(s2))
                {
                    return s1.concat(s.substring(s2.length()));
                }
            }

            throw new IllegalStateException((new StringBuilder()).append("failed to detect pattern prefix for [").append(s).append("]").toString());
        } else
        {
            return optdef.getCanonicalName();
        }
    }

    private static void getOptNameAndValue(String s, String as[])
    {
        as[0] = null;
        as[1] = null;
        int i = 0;
        do
        {
label0:
            {
label1:
                {
                    if (i < OPT_PREFIXES.length)
                    {
                        if (!s.startsWith(OPT_PREFIXES[i]) || s.length() <= OPT_PREFIXES[i].length())
                        {
                            break label0;
                        }
                        s = s.substring(OPT_PREFIXES[i].length());
                        char c = '\0';
                        int j = 0x7fffffff;
                        for (i = 0; i < OPT_VALUE_SEPARATORS.length;)
                        {
                            int l = s.indexOf(OPT_VALUE_SEPARATORS[i]);
                            char c1 = c;
                            int k = j;
                            if (l > 0)
                            {
                                c1 = c;
                                k = j;
                                if (l < j)
                                {
                                    c1 = OPT_VALUE_SEPARATORS[i];
                                    k = l;
                                }
                            }
                            i++;
                            c = c1;
                            j = k;
                        }

                        if (c == 0)
                        {
                            break label1;
                        }
                        as[0] = s.substring(0, j);
                        as[1] = s.substring(j + 1);
                    }
                    return;
                }
                as[0] = s;
                return;
            }
            i++;
        } while (true);
    }

    private static boolean isOpt(String s, int i, OptDef optdef)
    {
        boolean flag = true;
        if (optdef == null || i >= optdef.getValueCardinality()[1])
        {
            i = 0;
            while (i < OPT_PREFIXES.length) 
            {
                if (s.startsWith(OPT_PREFIXES[i]))
                {
                    if (s.length() <= OPT_PREFIXES[i].length())
                    {
                        flag = false;
                    }
                    return flag;
                }
                i++;
            }
        }
        return false;
    }

    private static OptDefMetadata parseOptDefMetadata(Reader reader, String as[])
    {
        reader = (new MetadataParser()).parse(reader);
        OptDefMetadata optdefmetadata = new OptDefMetadata();
        for (int i = 0; i < reader.length; i++)
        {
            optdefmetadata.addOptDef(reader[i]);
        }

        if (as != null)
        {
            OptDef optdef = new OptDef(true);
            optdef.setNames(as);
            optdef.setDescription("display usage information");
            optdef.setValueCardinality(OptDef.C_ZERO);
            optdef.setRequired(false);
            optdef.setDetailedOnly(false);
            optdef.setMergeable(false);
            optdefmetadata.addOptDef(optdef);
        }
label0:
        for (int j = 0; j < reader.length; j++)
        {
            as = reader[j];
            String as1[] = as.getRequiresSet();
            if (as1 != null)
            {
                for (int k = 0; k < as1.length; k++)
                {
                    OptDef optdef1 = optdefmetadata.getOptDef(as1[k], null);
                    if (optdef1 == null)
                    {
                        throw new IllegalArgumentException((new StringBuilder()).append("option [").append(as.getCanonicalName()).append("] specifies an unknown option [").append(as1[k]).append("] in its 'requires' set").toString());
                    }
                    if (optdef1 == as)
                    {
                        throw new IllegalArgumentException((new StringBuilder()).append("option [").append(as.getCanonicalName()).append("] specifies itself in its 'requires' set").toString());
                    }
                }

            }
            as1 = as.getExcludesSet();
            if (as1 == null)
            {
                continue;
            }
            int l = 0;
            do
            {
                if (l >= as1.length)
                {
                    continue label0;
                }
                OptDef optdef2 = optdefmetadata.getOptDef(as1[l], null);
                if (optdef2 == null)
                {
                    throw new IllegalArgumentException((new StringBuilder()).append("option [").append(as.getCanonicalName()).append("] specifies an unknown option [").append(as1[l]).append("] in its 'excludes' set").toString());
                }
                if (optdef2.isRequired())
                {
                    throw new IllegalArgumentException((new StringBuilder()).append("option [").append(as.getCanonicalName()).append("] specifies a required option [").append(as1[l]).append("] in its 'excludes' set").toString());
                }
                if (optdef2 == as)
                {
                    throw new IllegalArgumentException((new StringBuilder()).append("option [").append(as.getCanonicalName()).append("] specifies itself in its 'excludes' set").toString());
                }
                l++;
            } while (true);
        }

        return optdefmetadata;
    }

    public IOptsParser.IOpts parse(String as[])
    {
        this;
        JVM INSTR monitorenter ;
        if (as != null)
        {
            break MISSING_BLOCK_LABEL_21;
        }
        throw new IllegalArgumentException("null input: args");
        as;
        this;
        JVM INSTR monitorexit ;
        throw as;
        Opts opts;
        String as2[];
        String as3[];
        opts = new Opts();
        as2 = new String[2];
        as3 = new String[1];
        Object obj;
        Object obj1;
        OptDef optdef;
        int i;
        int j;
        int k;
        i = 0;
        optdef = null;
        obj1 = null;
        obj = null;
        k = 0;
        j = 0;
_L7:
        if (j >= as.length) goto _L2; else goto _L1
_L1:
        Object obj2 = as[j];
        if (obj2 != null) goto _L4; else goto _L3
_L3:
        throw new IllegalArgumentException((new StringBuilder()).append("null input: args[").append(j).append("]").toString());
_L46:
        if (!isOpt(((String) (obj2)), k, optdef)) goto _L6; else goto _L5
_L5:
        k = 0;
        getOptNameAndValue(((String) (obj2)), as2);
        obj2 = as2[0];
        optdef = m_metadata.getOptDef(((String) (obj2)), as3);
        if (optdef != null)
        {
            break MISSING_BLOCK_LABEL_195;
        }
        opts.addError(formatMessage((new StringBuilder()).append("unknown option '").append(((String) (obj2))).append("'").toString()));
        i = 3;
          goto _L7
        String s1 = getOptCanonicalName(((String) (obj2)), optdef);
        String s2 = as3[0];
        obj1 = opts.getOpt(s1);
        if (!optdef.isMergeable()) goto _L9; else goto _L8
_L8:
        obj = obj1;
        if (obj1 != null) goto _L11; else goto _L10
_L10:
        obj = new Opt(((String) (obj2)), s1, s2);
        opts.addOpt(((Opt) (obj)), optdef, ((String) (obj2)));
          goto _L11
_L9:
        if (obj1 != null) goto _L13; else goto _L12
_L12:
        obj = new Opt(((String) (obj2)), s1, s2);
        opts.addOpt(((Opt) (obj)), optdef, ((String) (obj2)));
          goto _L11
_L13:
        opts.addError(formatMessage((new StringBuilder()).append("option '").append(((String) (obj2))).append("' cannot be specified more than once").toString()));
        obj = obj1;
          goto _L11
_L47:
        if (obj == null) goto _L15; else goto _L14
_L14:
        k = 1;
        if (optdef.getValueCardinality()[1] >= 1) goto _L17; else goto _L16
_L16:
        opts.addError(formatMessage((new StringBuilder()).append("option '").append(((Opt) (obj1)).getName()).append("' does not accept values: '").append(((String) (obj))).append("'").toString()));
        i = 3;
          goto _L18
_L17:
        j++;
        ((Opt) (obj1)).addValue(((String) (obj)));
          goto _L18
_L15:
        obj = as[j];
        int ai[] = optdef.getValueCardinality();
        if (!isOpt(((String) (obj)), k, optdef)) goto _L20; else goto _L19
_L19:
        if (k >= ai[0]) goto _L22; else goto _L21
_L21:
        opts.addError(formatMessage((new StringBuilder()).append("option '").append(((Opt) (obj1)).getName()).append("' does not accept fewer than ").append(ai[0]).append(" value(s)").toString()));
        i = 3;
          goto _L18
_L20:
        if (k >= ai[1]) goto _L24; else goto _L23
_L23:
        k++;
        j++;
        ((Opt) (obj1)).addValue(((String) (obj)));
          goto _L18
_L48:
        if (!isOpt(as[j], k, optdef))
        {
            break MISSING_BLOCK_LABEL_554;
        }
        i = 0;
          goto _L7
        opts.setFreeArgs(as, j);
_L2:
        if (j != as.length) goto _L26; else goto _L25
_L25:
        if (obj1 == null) goto _L28; else goto _L27
_L27:
        as = optdef.getValueCardinality();
        if (k >= as[0]) goto _L26; else goto _L29
_L29:
        opts.addError(formatMessage((new StringBuilder()).append("option '").append(((Opt) (obj1)).getName()).append("' does not accept fewer than ").append(as[0]).append(" value(s)").toString()));
_L26:
        as = opts.getOpts();
        if (as == null) goto _L31; else goto _L30
_L30:
        obj = new HashSet();
        ((Set) (obj)).addAll(m_metadata.getRequiredOpts());
        i = 0;
_L33:
        if (i >= as.length)
        {
            break; /* Loop/switch isn't completed */
        }
        ((Set) (obj)).remove(as[i].getCanonicalName());
        i++;
        if (true) goto _L33; else goto _L32
_L28:
        opts.setFreeArgs(as, j);
          goto _L26
_L32:
        if (!((Set) (obj)).isEmpty())
        {
            for (obj = ((Set) (obj)).iterator(); ((Iterator) (obj)).hasNext(); opts.addError(formatMessage((new StringBuilder()).append("missing required option '").append((String)((Iterator) (obj)).next()).append("'").toString()))) { }
        }
          goto _L34
_L45:
        if (i >= as.length) goto _L31; else goto _L35
_L35:
        obj = as[i];
        String as1[];
        obj1 = m_metadata.getOptDef(((IOptsParser.IOpt) (obj)).getCanonicalName(), null);
        as1 = ((OptDef) (obj1)).getRequiresSet();
        if (as1 == null) goto _L37; else goto _L36
_L36:
        j = 0;
_L49:
        if (j >= as1.length) goto _L37; else goto _L38
_L38:
        if (opts.getOpt(as1[j]) == null)
        {
            opts.addError(formatMessage((new StringBuilder()).append("option '").append(((IOptsParser.IOpt) (obj)).getName()).append("' requires option '").append(as1[j]).append("'").toString()));
        }
          goto _L39
_L37:
        as1 = ((OptDef) (obj1)).getExcludesSet();
        if (as1 == null) goto _L41; else goto _L40
_L40:
        j = 0;
_L50:
        if (j >= as1.length) goto _L41; else goto _L42
_L42:
        ai = opts.getOpt(as1[j]);
        if (ai == null) goto _L44; else goto _L43
_L43:
        opts.addError(formatMessage((new StringBuilder()).append("option '").append(((IOptsParser.IOpt) (obj)).getName()).append("' cannot be used with option '").append(ai.getName()).append("'").toString()));
          goto _L44
_L41:
        if (!((OptDef) (obj1)).isUsage())
        {
            break MISSING_BLOCK_LABEL_1033;
        }
        if (((IOptsParser.IOpt) (obj)).getName().equals(((IOptsParser.IOpt) (obj)).getCanonicalName()))
        {
            j = 1;
        } else
        {
            j = 2;
        }
        opts.setUsageRequested(j);
        i++;
          goto _L45
_L31:
        this;
        JVM INSTR monitorexit ;
        return opts;
_L4:
        i;
        JVM INSTR tableswitch 0 3: default 1084
    //                   0 109
    //                   1 331
    //                   2 534
    //                   3 562;
           goto _L7 _L46 _L47 _L48 _L2
_L11:
        String s = as2[1];
        i = j;
        if (s == null)
        {
            i = j + 1;
        }
        boolean flag = true;
        j = i;
        obj1 = obj;
        i = ((flag) ? 1 : 0);
        obj = s;
          goto _L7
_L6:
        i = 2;
          goto _L7
_L18:
        obj = null;
          goto _L7
_L22:
        i = 0;
          goto _L18
_L24:
        i = 2;
          goto _L18
_L34:
        i = 0;
          goto _L45
_L39:
        j++;
          goto _L49
_L44:
        j++;
          goto _L50
    }

    public void usage(PrintWriter printwriter, int i, int j)
    {
        this;
        JVM INSTR monitorenter ;
        Object obj;
        Iterator iterator;
        obj = OPT_PREFIXES[1];
        iterator = m_metadata.getOptDefs();
_L5:
        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        OptDef optdef = (OptDef)iterator.next();
        if (i >= 2) goto _L4; else goto _L3
_L3:
        if (optdef.isDetailedOnly()) goto _L5; else goto _L4
_L4:
        StringBuffer stringbuffer;
        String s;
        boolean flag;
        stringbuffer = new StringBuffer("  ");
        s = optdef.getCanonicalName();
        flag = optdef.isPattern();
        stringbuffer.append(((String) (obj)));
        stringbuffer.append(s);
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_108;
        }
        stringbuffer.append('*');
        String as[] = optdef.getNames();
        j = 0;
_L15:
        if (j >= as.length) goto _L7; else goto _L6
_L6:
        String s1 = as[j];
        if (s1.equals(s)) goto _L9; else goto _L8
_L8:
        stringbuffer.append(", ");
        stringbuffer.append(((String) (obj)));
        stringbuffer.append(s1);
        if (!flag) goto _L9; else goto _L10
_L10:
        stringbuffer.append('*');
          goto _L9
_L7:
        s = optdef.getValueMnemonic();
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_209;
        }
        stringbuffer.append(' ');
        stringbuffer.append(s);
        int k = 16 - stringbuffer.length();
        if (k >= 2)
        {
            break MISSING_BLOCK_LABEL_410;
        }
        printwriter.println(stringbuffer);
        stringbuffer.setLength(0);
        j = 0;
_L12:
        if (j >= 16)
        {
            break; /* Loop/switch isn't completed */
        }
        stringbuffer.append(' ');
        j++;
        if (true) goto _L12; else goto _L11
_L14:
        if (j >= k) goto _L11; else goto _L13
_L13:
        stringbuffer.append(' ');
        j++;
          goto _L14
_L11:
        if (optdef.isRequired())
        {
            stringbuffer.append("{required} ");
        }
        stringbuffer.append(optdef.getDescription());
        printwriter.println(stringbuffer);
          goto _L5
        printwriter;
        throw printwriter;
_L2:
        if (i >= 2)
        {
            break MISSING_BLOCK_LABEL_400;
        }
        obj = m_metadata.getUsageOptDef();
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_400;
        }
        if (((OptDef) (obj)).getNames() != null && ((OptDef) (obj)).getNames().length > 1)
        {
            printwriter.println();
            printwriter.println((new StringBuilder()).append("  {use '").append(((OptDef) (obj)).getNames()[1]).append("' option to see detailed usage help}").toString());
        }
        this;
        JVM INSTR monitorexit ;
        return;
_L9:
        j++;
          goto _L15
        j = 0;
          goto _L14
    }

}
