// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.codec.language;

import org.apache.commons.codec.EncoderException;
import org.apache.commons.codec.StringEncoder;

public class Metaphone
    implements StringEncoder
{

    private String frontv;
    private int maxCodeLen;
    private String varson;
    private String vowels;

    public Metaphone()
    {
        vowels = "AEIOU";
        frontv = "EIY";
        varson = "CSPTG";
        maxCodeLen = 4;
    }

    private boolean isLastChar(int i, int j)
    {
        return j + 1 == i;
    }

    private boolean isNextChar(StringBuffer stringbuffer, int i, char c)
    {
label0:
        {
            boolean flag1 = false;
            boolean flag = flag1;
            if (i >= 0)
            {
                flag = flag1;
                if (i < stringbuffer.length() - 1)
                {
                    if (stringbuffer.charAt(i + 1) != c)
                    {
                        break label0;
                    }
                    flag = true;
                }
            }
            return flag;
        }
        return false;
    }

    private boolean isPreviousChar(StringBuffer stringbuffer, int i, char c)
    {
label0:
        {
            boolean flag1 = false;
            boolean flag = flag1;
            if (i > 0)
            {
                flag = flag1;
                if (i < stringbuffer.length())
                {
                    if (stringbuffer.charAt(i - 1) != c)
                    {
                        break label0;
                    }
                    flag = true;
                }
            }
            return flag;
        }
        return false;
    }

    private boolean isVowel(StringBuffer stringbuffer, int i)
    {
        return vowels.indexOf(stringbuffer.charAt(i)) >= 0;
    }

    private boolean regionMatch(StringBuffer stringbuffer, int i, String s)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (i >= 0)
        {
            flag = flag1;
            if ((s.length() + i) - 1 < stringbuffer.length())
            {
                flag = stringbuffer.substring(i, s.length() + i).equals(s);
            }
        }
        return flag;
    }

    public Object encode(Object obj)
        throws EncoderException
    {
        if (!(obj instanceof String))
        {
            throw new EncoderException("Parameter supplied to Metaphone encode is not of type java.lang.String");
        } else
        {
            return metaphone((String)obj);
        }
    }

    public String encode(String s)
    {
        return metaphone(s);
    }

    public int getMaxCodeLen()
    {
        return maxCodeLen;
    }

    public boolean isMetaphoneEqual(String s, String s1)
    {
        return metaphone(s).equals(metaphone(s1));
    }

    public String metaphone(String s)
    {
        StringBuffer stringbuffer;
        StringBuffer stringbuffer1;
        if (s == null || s.length() == 0)
        {
            return "";
        }
        if (s.length() == 1)
        {
            return s.toUpperCase();
        }
        s = s.toUpperCase().toCharArray();
        stringbuffer = new StringBuffer(40);
        stringbuffer1 = new StringBuffer(10);
        s[0];
        JVM INSTR lookupswitch 6: default 116
    //                   65: 243
    //                   71: 212
    //                   75: 212
    //                   80: 212
    //                   87: 274
    //                   88: 334;
           goto _L1 _L2 _L3 _L3 _L3 _L4 _L5
_L1:
        stringbuffer.append(s);
_L9:
        int k;
        k = stringbuffer.length();
_L8:
        char c;
        int i;
        for (i = 0; stringbuffer1.length() >= getMaxCodeLen() || i >= k;)
        {
            break MISSING_BLOCK_LABEL_1497;
        }

        c = stringbuffer.charAt(i);
        if (c == 'C' || !isPreviousChar(stringbuffer, i, c)) goto _L7; else goto _L6
_L6:
        int j = i + 1;
_L27:
        i = j;
        if (stringbuffer1.length() > getMaxCodeLen())
        {
            stringbuffer1.setLength(getMaxCodeLen());
            i = j;
        }
          goto _L8
_L3:
        if (s[1] == 'N')
        {
            stringbuffer.append(s, 1, s.length - 1);
        } else
        {
            stringbuffer.append(s);
        }
          goto _L9
_L2:
        if (s[1] == 'E')
        {
            stringbuffer.append(s, 1, s.length - 1);
        } else
        {
            stringbuffer.append(s);
        }
          goto _L9
_L4:
        if (s[1] == 'R')
        {
            stringbuffer.append(s, 1, s.length - 1);
        } else
        if (s[1] == 'H')
        {
            stringbuffer.append(s, 1, s.length - 1);
            stringbuffer.setCharAt(0, 'W');
        } else
        {
            stringbuffer.append(s);
        }
          goto _L9
_L5:
        s[0] = 'S';
        stringbuffer.append(s);
          goto _L9
_L7:
        c;
        JVM INSTR tableswitch 65 90: default 468
    //                   65 481
    //                   66 504
    //                   67 545
    //                   68 777
    //                   69 481
    //                   70 1117
    //                   71 852
    //                   72 1044
    //                   73 481
    //                   74 1117
    //                   75 1131
    //                   76 1117
    //                   77 1117
    //                   78 1117
    //                   79 481
    //                   80 1180
    //                   81 1221
    //                   82 1117
    //                   83 1236
    //                   84 1302
    //                   85 481
    //                   86 1399
    //                   87 1414
    //                   88 1459
    //                   89 1414
    //                   90 1482;
           goto _L10 _L11 _L12 _L13 _L14 _L11 _L15 _L16 _L17 _L11 _L15 _L18 _L15 _L15 _L15 _L11 _L19 _L20 _L15 _L21 _L22 _L11 _L23 _L24 _L25 _L24 _L26
_L26:
        break MISSING_BLOCK_LABEL_1482;
_L10:
        j = i;
_L28:
        j++;
          goto _L27
_L11:
        j = i;
        if (i == 0)
        {
            stringbuffer1.append(c);
            j = i;
        }
          goto _L28
_L12:
        if (!isPreviousChar(stringbuffer, i, 'M')) goto _L30; else goto _L29
_L29:
        j = i;
        if (isLastChar(k, i)) goto _L28; else goto _L30
_L30:
        stringbuffer1.append(c);
        j = i;
          goto _L28
_L13:
        if (!isPreviousChar(stringbuffer, i, 'S') || isLastChar(k, i)) goto _L32; else goto _L31
_L31:
        j = i;
        if (frontv.indexOf(stringbuffer.charAt(i + 1)) >= 0) goto _L28; else goto _L32
_L32:
        if (regionMatch(stringbuffer, i, "CIA"))
        {
            stringbuffer1.append('X');
            j = i;
        } else
        if (!isLastChar(k, i) && frontv.indexOf(stringbuffer.charAt(i + 1)) >= 0)
        {
            stringbuffer1.append('S');
            j = i;
        } else
        if (isPreviousChar(stringbuffer, i, 'S') && isNextChar(stringbuffer, i, 'H'))
        {
            stringbuffer1.append('K');
            j = i;
        } else
        if (isNextChar(stringbuffer, i, 'H'))
        {
            if (i == 0 && k >= 3 && isVowel(stringbuffer, 2))
            {
                stringbuffer1.append('K');
                j = i;
            } else
            {
                stringbuffer1.append('X');
                j = i;
            }
        } else
        {
            stringbuffer1.append('K');
            j = i;
        }
          goto _L28
_L14:
        if (!isLastChar(k, i + 1) && isNextChar(stringbuffer, i, 'G') && frontv.indexOf(stringbuffer.charAt(i + 2)) >= 0)
        {
            stringbuffer1.append('J');
            j = i + 2;
        } else
        {
            stringbuffer1.append('T');
            j = i;
        }
          goto _L28
_L16:
        if (!isLastChar(k, i + 1)) goto _L34; else goto _L33
_L33:
        j = i;
        if (isNextChar(stringbuffer, i, 'H')) goto _L28; else goto _L34
_L34:
        if (isLastChar(k, i + 1) || !isNextChar(stringbuffer, i, 'H')) goto _L36; else goto _L35
_L35:
        j = i;
        if (!isVowel(stringbuffer, i + 2)) goto _L28; else goto _L36
_L36:
        if (i <= 0) goto _L38; else goto _L37
_L37:
        j = i;
        if (regionMatch(stringbuffer, i, "GN")) goto _L28; else goto _L39
_L39:
        j = i;
        if (regionMatch(stringbuffer, i, "GNED")) goto _L28; else goto _L38
_L38:
        if (isPreviousChar(stringbuffer, i, 'G'))
        {
            j = 1;
        } else
        {
            j = 0;
        }
        if (!isLastChar(k, i) && frontv.indexOf(stringbuffer.charAt(i + 1)) >= 0 && j == 0)
        {
            stringbuffer1.append('J');
            j = i;
        } else
        {
            stringbuffer1.append('K');
            j = i;
        }
          goto _L28
_L17:
        j = i;
        if (isLastChar(k, i)) goto _L28; else goto _L40
_L40:
        if (i <= 0) goto _L42; else goto _L41
_L41:
        j = i;
        if (varson.indexOf(stringbuffer.charAt(i - 1)) >= 0) goto _L28; else goto _L42
_L42:
        j = i;
        if (isVowel(stringbuffer, i + 1))
        {
            stringbuffer1.append('H');
            j = i;
        }
          goto _L28
_L15:
        stringbuffer1.append(c);
        j = i;
          goto _L28
_L18:
        if (i > 0)
        {
            j = i;
            if (!isPreviousChar(stringbuffer, i, 'C'))
            {
                stringbuffer1.append(c);
                j = i;
            }
        } else
        {
            stringbuffer1.append(c);
            j = i;
        }
          goto _L28
_L19:
        if (isNextChar(stringbuffer, i, 'H'))
        {
            stringbuffer1.append('F');
            j = i;
        } else
        {
            stringbuffer1.append(c);
            j = i;
        }
          goto _L28
_L20:
        stringbuffer1.append('K');
        j = i;
          goto _L28
_L21:
        if (regionMatch(stringbuffer, i, "SH") || regionMatch(stringbuffer, i, "SIO") || regionMatch(stringbuffer, i, "SIA"))
        {
            stringbuffer1.append('X');
            j = i;
        } else
        {
            stringbuffer1.append('S');
            j = i;
        }
          goto _L28
_L22:
        if (regionMatch(stringbuffer, i, "TIA") || regionMatch(stringbuffer, i, "TIO"))
        {
            stringbuffer1.append('X');
            j = i;
        } else
        {
            j = i;
            if (!regionMatch(stringbuffer, i, "TCH"))
            {
                if (regionMatch(stringbuffer, i, "TH"))
                {
                    stringbuffer1.append('0');
                    j = i;
                } else
                {
                    stringbuffer1.append('T');
                    j = i;
                }
            }
        }
          goto _L28
_L23:
        stringbuffer1.append('F');
        j = i;
          goto _L28
_L24:
        j = i;
        if (!isLastChar(k, i))
        {
            j = i;
            if (isVowel(stringbuffer, i + 1))
            {
                stringbuffer1.append(c);
                j = i;
            }
        }
          goto _L28
_L25:
        stringbuffer1.append('K');
        stringbuffer1.append('S');
        j = i;
          goto _L28
        stringbuffer1.append('S');
        j = i;
          goto _L28
        return stringbuffer1.toString();
          goto _L8
    }

    public void setMaxCodeLen(int i)
    {
        maxCodeLen = i;
    }
}
