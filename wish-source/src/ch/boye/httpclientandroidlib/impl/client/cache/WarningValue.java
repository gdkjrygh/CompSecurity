// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib.impl.client.cache;

import ch.boye.httpclientandroidlib.Header;
import ch.boye.httpclientandroidlib.impl.cookie.DateParseException;
import ch.boye.httpclientandroidlib.impl.cookie.DateUtils;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class WarningValue
{

    private static final String ASCTIME_DATE = "(Mon|Tue|Wed|Thu|Fri|Sat|Sun) ((Jan|Feb|Mar|Apr|May|Jun|Jul|Aug|Sep|Oct|Nov|Dec) ( |\\d)\\d) (\\d{2}:\\d{2}:\\d{2}) \\d{4}";
    private static final String DATE1 = "\\d{2} (Jan|Feb|Mar|Apr|May|Jun|Jul|Aug|Sep|Oct|Nov|Dec) \\d{4}";
    private static final String DATE2 = "\\d{2}-(Jan|Feb|Mar|Apr|May|Jun|Jul|Aug|Sep|Oct|Nov|Dec)-\\d{2}";
    private static final String DATE3 = "(Jan|Feb|Mar|Apr|May|Jun|Jul|Aug|Sep|Oct|Nov|Dec) ( |\\d)\\d";
    private static final String DOMAINLABEL = "\\p{Alnum}([\\p{Alnum}-]*\\p{Alnum})?";
    private static final String HOST = "((\\p{Alnum}([\\p{Alnum}-]*\\p{Alnum})?\\.)*\\p{Alpha}([\\p{Alnum}-]*\\p{Alnum})?\\.?)|(\\d+\\.\\d+\\.\\d+\\.\\d+)";
    private static final String HOSTNAME = "(\\p{Alnum}([\\p{Alnum}-]*\\p{Alnum})?\\.)*\\p{Alpha}([\\p{Alnum}-]*\\p{Alnum})?\\.?";
    private static final String HOSTPORT = "(((\\p{Alnum}([\\p{Alnum}-]*\\p{Alnum})?\\.)*\\p{Alpha}([\\p{Alnum}-]*\\p{Alnum})?\\.?)|(\\d+\\.\\d+\\.\\d+\\.\\d+))(\\:\\d*)?";
    private static final Pattern HOSTPORT_PATTERN = Pattern.compile("(((\\p{Alnum}([\\p{Alnum}-]*\\p{Alnum})?\\.)*\\p{Alpha}([\\p{Alnum}-]*\\p{Alnum})?\\.?)|(\\d+\\.\\d+\\.\\d+\\.\\d+))(\\:\\d*)?");
    private static final String HTTP_DATE = "((Mon|Tue|Wed|Thu|Fri|Sat|Sun), (\\d{2} (Jan|Feb|Mar|Apr|May|Jun|Jul|Aug|Sep|Oct|Nov|Dec) \\d{4}) (\\d{2}:\\d{2}:\\d{2}) GMT)|((Monday|Tuesday|Wednesday|Thursday|Friday|Saturday|Sunday), (\\d{2}-(Jan|Feb|Mar|Apr|May|Jun|Jul|Aug|Sep|Oct|Nov|Dec)-\\d{2}) (\\d{2}:\\d{2}:\\d{2}) GMT)|((Mon|Tue|Wed|Thu|Fri|Sat|Sun) ((Jan|Feb|Mar|Apr|May|Jun|Jul|Aug|Sep|Oct|Nov|Dec) ( |\\d)\\d) (\\d{2}:\\d{2}:\\d{2}) \\d{4})";
    private static final String IPV4ADDRESS = "\\d+\\.\\d+\\.\\d+\\.\\d+";
    private static final String MONTH = "Jan|Feb|Mar|Apr|May|Jun|Jul|Aug|Sep|Oct|Nov|Dec";
    private static final String PORT = "\\d*";
    private static final String RFC1123_DATE = "(Mon|Tue|Wed|Thu|Fri|Sat|Sun), (\\d{2} (Jan|Feb|Mar|Apr|May|Jun|Jul|Aug|Sep|Oct|Nov|Dec) \\d{4}) (\\d{2}:\\d{2}:\\d{2}) GMT";
    private static final String RFC850_DATE = "(Monday|Tuesday|Wednesday|Thursday|Friday|Saturday|Sunday), (\\d{2}-(Jan|Feb|Mar|Apr|May|Jun|Jul|Aug|Sep|Oct|Nov|Dec)-\\d{2}) (\\d{2}:\\d{2}:\\d{2}) GMT";
    private static final String TIME = "\\d{2}:\\d{2}:\\d{2}";
    private static final String TOPLABEL = "\\p{Alpha}([\\p{Alnum}-]*\\p{Alnum})?";
    private static final String WARN_DATE = "\"(((Mon|Tue|Wed|Thu|Fri|Sat|Sun), (\\d{2} (Jan|Feb|Mar|Apr|May|Jun|Jul|Aug|Sep|Oct|Nov|Dec) \\d{4}) (\\d{2}:\\d{2}:\\d{2}) GMT)|((Monday|Tuesday|Wednesday|Thursday|Friday|Saturday|Sunday), (\\d{2}-(Jan|Feb|Mar|Apr|May|Jun|Jul|Aug|Sep|Oct|Nov|Dec)-\\d{2}) (\\d{2}:\\d{2}:\\d{2}) GMT)|((Mon|Tue|Wed|Thu|Fri|Sat|Sun) ((Jan|Feb|Mar|Apr|May|Jun|Jul|Aug|Sep|Oct|Nov|Dec) ( |\\d)\\d) (\\d{2}:\\d{2}:\\d{2}) \\d{4}))\"";
    private static final Pattern WARN_DATE_PATTERN = Pattern.compile("\"(((Mon|Tue|Wed|Thu|Fri|Sat|Sun), (\\d{2} (Jan|Feb|Mar|Apr|May|Jun|Jul|Aug|Sep|Oct|Nov|Dec) \\d{4}) (\\d{2}:\\d{2}:\\d{2}) GMT)|((Monday|Tuesday|Wednesday|Thursday|Friday|Saturday|Sunday), (\\d{2}-(Jan|Feb|Mar|Apr|May|Jun|Jul|Aug|Sep|Oct|Nov|Dec)-\\d{2}) (\\d{2}:\\d{2}:\\d{2}) GMT)|((Mon|Tue|Wed|Thu|Fri|Sat|Sun) ((Jan|Feb|Mar|Apr|May|Jun|Jul|Aug|Sep|Oct|Nov|Dec) ( |\\d)\\d) (\\d{2}:\\d{2}:\\d{2}) \\d{4}))\"");
    private static final String WEEKDAY = "Monday|Tuesday|Wednesday|Thursday|Friday|Saturday|Sunday";
    private static final String WKDAY = "Mon|Tue|Wed|Thu|Fri|Sat|Sun";
    private int init_offs;
    private int offs;
    private String src;
    private String warnAgent;
    private int warnCode;
    private Date warnDate;
    private String warnText;

    WarningValue(String s)
    {
        this(s, 0);
    }

    WarningValue(String s, int i)
    {
        init_offs = i;
        offs = i;
        src = s;
        consumeWarnValue();
    }

    public static WarningValue[] getWarningValues(Header header)
    {
        ArrayList arraylist;
        int i;
        arraylist = new ArrayList();
        header = header.getValue();
        i = 0;
_L2:
        if (i >= header.length())
        {
            break MISSING_BLOCK_LABEL_69;
        }
        int j;
        WarningValue warningvalue = new WarningValue(header, i);
        arraylist.add(warningvalue);
        j = warningvalue.offs;
        i = j;
        continue; /* Loop/switch isn't completed */
        IllegalArgumentException illegalargumentexception;
        illegalargumentexception;
        i = header.indexOf(',', i);
        if (i != -1)
        {
            break MISSING_BLOCK_LABEL_83;
        }
        return (WarningValue[])arraylist.toArray(new WarningValue[0]);
        i++;
        if (true) goto _L2; else goto _L1
_L1:
    }

    private boolean isChar(char c)
    {
        return c >= 0 && c <= '\177';
    }

    private boolean isControl(char c)
    {
        return c == '\177' || c >= 0 && c <= '\037';
    }

    private boolean isSeparator(char c)
    {
        return c == '(' || c == ')' || c == '<' || c == '>' || c == '@' || c == ',' || c == ';' || c == ':' || c == '\\' || c == '"' || c == '/' || c == '[' || c == ']' || c == '?' || c == '=' || c == '{' || c == '}' || c == ' ' || c == '\t';
    }

    private boolean isTokenChar(char c)
    {
        return isChar(c) && !isControl(c) && !isSeparator(c);
    }

    private void parseError()
    {
        String s = src.substring(init_offs);
        throw new IllegalArgumentException((new StringBuilder()).append("Bad warn code \"").append(s).append("\"").toString());
    }

    protected void consumeCharacter(char c)
    {
        if (offs + 1 > src.length() || c != src.charAt(offs))
        {
            parseError();
        }
        offs = offs + 1;
    }

    protected void consumeHostPort()
    {
        Matcher matcher = HOSTPORT_PATTERN.matcher(src.substring(offs));
        if (!matcher.find())
        {
            parseError();
        }
        if (matcher.start() != 0)
        {
            parseError();
        }
        offs = offs + matcher.end();
    }

    protected void consumeLinearWhitespace()
    {
_L6:
        if (offs >= src.length()) goto _L2; else goto _L1
_L1:
        src.charAt(offs);
        JVM INSTR lookupswitch 3: default 60
    //                   9: 141
    //                   13: 61
    //                   32: 141;
           goto _L2 _L3 _L4 _L3
_L2:
        return;
_L4:
        if (offs + 2 >= src.length() || src.charAt(offs + 1) != '\n' || src.charAt(offs + 2) != ' ' && src.charAt(offs + 2) != '\t')
        {
            continue; /* Loop/switch isn't completed */
        }
        offs = offs + 2;
        break; /* Loop/switch isn't completed */
        if (true) goto _L2; else goto _L3
_L3:
        offs = offs + 1;
        if (true) goto _L6; else goto _L5
_L5:
    }

    protected void consumeQuotedString()
    {
        if (src.charAt(offs) != '"')
        {
            parseError();
        }
        offs = offs + 1;
        boolean flag;
        for (flag = false; offs < src.length() && !flag;)
        {
            char c = src.charAt(offs);
            if (offs + 1 < src.length() && c == '\\' && isChar(src.charAt(offs + 1)))
            {
                offs = offs + 2;
            } else
            if (c == '"')
            {
                flag = true;
                offs = offs + 1;
            } else
            if (c != '"' && !isControl(c))
            {
                offs = offs + 1;
            } else
            {
                parseError();
            }
        }

        if (!flag)
        {
            parseError();
        }
    }

    protected void consumeToken()
    {
        if (!isTokenChar(src.charAt(offs)))
        {
            parseError();
        }
        do
        {
            if (offs >= src.length() || !isTokenChar(src.charAt(offs)))
            {
                return;
            }
            offs = offs + 1;
        } while (true);
    }

    protected void consumeWarnAgent()
    {
        int i = offs;
        try
        {
            consumeHostPort();
            warnAgent = src.substring(i, offs);
            consumeCharacter(' ');
            return;
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            offs = i;
        }
        consumeToken();
        warnAgent = src.substring(i, offs);
        consumeCharacter(' ');
    }

    protected void consumeWarnCode()
    {
        if (offs + 4 > src.length() || !Character.isDigit(src.charAt(offs)) || !Character.isDigit(src.charAt(offs + 1)) || !Character.isDigit(src.charAt(offs + 2)) || src.charAt(offs + 3) != ' ')
        {
            parseError();
        }
        warnCode = Integer.parseInt(src.substring(offs, offs + 3));
        offs = offs + 4;
    }

    protected void consumeWarnDate()
    {
        int i = offs;
        Matcher matcher = WARN_DATE_PATTERN.matcher(src.substring(offs));
        if (!matcher.lookingAt())
        {
            parseError();
        }
        offs = offs + matcher.end();
        try
        {
            warnDate = DateUtils.parseDate(src.substring(i + 1, offs - 1));
            return;
        }
        catch (DateParseException dateparseexception)
        {
            throw new IllegalStateException("couldn't parse a parseable date");
        }
    }

    protected void consumeWarnText()
    {
        int i = offs;
        consumeQuotedString();
        warnText = src.substring(i, offs);
    }

    protected void consumeWarnValue()
    {
        consumeLinearWhitespace();
        consumeWarnCode();
        consumeWarnAgent();
        consumeWarnText();
        if (offs + 1 < src.length() && src.charAt(offs) == ' ' && src.charAt(offs + 1) == '"')
        {
            consumeCharacter(' ');
            consumeWarnDate();
        }
        consumeLinearWhitespace();
        if (offs != src.length())
        {
            consumeCharacter(',');
        }
    }

    public String getWarnAgent()
    {
        return warnAgent;
    }

    public int getWarnCode()
    {
        return warnCode;
    }

    public Date getWarnDate()
    {
        return warnDate;
    }

    public String getWarnText()
    {
        return warnText;
    }

    public String toString()
    {
        if (warnDate != null)
        {
            return String.format("%d %s %s \"%s\"", new Object[] {
                Integer.valueOf(warnCode), warnAgent, warnText, DateUtils.formatDate(warnDate)
            });
        } else
        {
            return String.format("%d %s %s", new Object[] {
                Integer.valueOf(warnCode), warnAgent, warnText
            });
        }
    }

}
