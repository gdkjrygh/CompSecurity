// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib.message;

import ch.boye.httpclientandroidlib.HeaderElement;
import ch.boye.httpclientandroidlib.NameValuePair;
import ch.boye.httpclientandroidlib.util.CharArrayBuffer;

// Referenced classes of package ch.boye.httpclientandroidlib.message:
//            HeaderValueFormatter

public class BasicHeaderValueFormatter
    implements HeaderValueFormatter
{

    public static final BasicHeaderValueFormatter DEFAULT = new BasicHeaderValueFormatter();
    public static final String SEPARATORS = " ;,:@()<>\\\"/[]?={}\t";
    public static final String UNSAFE_CHARS = "\"\\";

    public BasicHeaderValueFormatter()
    {
    }

    public static final String formatElements(HeaderElement aheaderelement[], boolean flag, HeaderValueFormatter headervalueformatter)
    {
        Object obj = headervalueformatter;
        if (headervalueformatter == null)
        {
            obj = DEFAULT;
        }
        return ((HeaderValueFormatter) (obj)).formatElements(null, aheaderelement, flag).toString();
    }

    public static final String formatHeaderElement(HeaderElement headerelement, boolean flag, HeaderValueFormatter headervalueformatter)
    {
        Object obj = headervalueformatter;
        if (headervalueformatter == null)
        {
            obj = DEFAULT;
        }
        return ((HeaderValueFormatter) (obj)).formatHeaderElement(null, headerelement, flag).toString();
    }

    public static final String formatNameValuePair(NameValuePair namevaluepair, boolean flag, HeaderValueFormatter headervalueformatter)
    {
        Object obj = headervalueformatter;
        if (headervalueformatter == null)
        {
            obj = DEFAULT;
        }
        return ((HeaderValueFormatter) (obj)).formatNameValuePair(null, namevaluepair, flag).toString();
    }

    public static final String formatParameters(NameValuePair anamevaluepair[], boolean flag, HeaderValueFormatter headervalueformatter)
    {
        Object obj = headervalueformatter;
        if (headervalueformatter == null)
        {
            obj = DEFAULT;
        }
        return ((HeaderValueFormatter) (obj)).formatParameters(null, anamevaluepair, flag).toString();
    }

    protected void doFormatValue(CharArrayBuffer chararraybuffer, String s, boolean flag)
    {
        boolean flag1 = flag;
        if (!flag)
        {
            int i = 0;
            do
            {
                flag1 = flag;
                if (i >= s.length())
                {
                    break;
                }
                flag1 = flag;
                if (flag)
                {
                    break;
                }
                flag = isSeparator(s.charAt(i));
                i++;
            } while (true);
        }
        if (flag1)
        {
            chararraybuffer.append('"');
        }
        for (int j = 0; j < s.length(); j++)
        {
            char c = s.charAt(j);
            if (isUnsafe(c))
            {
                chararraybuffer.append('\\');
            }
            chararraybuffer.append(c);
        }

        if (flag1)
        {
            chararraybuffer.append('"');
        }
    }

    protected int estimateElementsLen(HeaderElement aheaderelement[])
    {
        if (aheaderelement != null && aheaderelement.length >= 1) goto _L2; else goto _L1
_L1:
        int k = 0;
_L4:
        return k;
_L2:
        int i = (aheaderelement.length - 1) * 2;
        int j = 0;
        do
        {
            k = i;
            if (j >= aheaderelement.length)
            {
                continue;
            }
            i += estimateHeaderElementLen(aheaderelement[j]);
            j++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    protected int estimateHeaderElementLen(HeaderElement headerelement)
    {
        if (headerelement != null) goto _L2; else goto _L1
_L1:
        int j = 0;
_L4:
        return j;
_L2:
        j = headerelement.getName().length();
        String s = headerelement.getValue();
        int i = j;
        if (s != null)
        {
            i = j + (s.length() + 3);
        }
        int l = headerelement.getParameterCount();
        j = i;
        if (l <= 0)
        {
            continue;
        }
        int k = 0;
        do
        {
            j = i;
            if (k >= l)
            {
                continue;
            }
            i += estimateNameValuePairLen(headerelement.getParameter(k)) + 2;
            k++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    protected int estimateNameValuePairLen(NameValuePair namevaluepair)
    {
        int i;
        if (namevaluepair == null)
        {
            i = 0;
        } else
        {
            int j = namevaluepair.getName().length();
            namevaluepair = namevaluepair.getValue();
            i = j;
            if (namevaluepair != null)
            {
                return j + (namevaluepair.length() + 3);
            }
        }
        return i;
    }

    protected int estimateParametersLen(NameValuePair anamevaluepair[])
    {
        if (anamevaluepair != null && anamevaluepair.length >= 1) goto _L2; else goto _L1
_L1:
        int k = 0;
_L4:
        return k;
_L2:
        int i = (anamevaluepair.length - 1) * 2;
        int j = 0;
        do
        {
            k = i;
            if (j >= anamevaluepair.length)
            {
                continue;
            }
            i += estimateNameValuePairLen(anamevaluepair[j]);
            j++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public CharArrayBuffer formatElements(CharArrayBuffer chararraybuffer, HeaderElement aheaderelement[], boolean flag)
    {
        if (aheaderelement == null)
        {
            throw new IllegalArgumentException("Header element array must not be null.");
        }
        int i = estimateElementsLen(aheaderelement);
        if (chararraybuffer == null)
        {
            chararraybuffer = new CharArrayBuffer(i);
        } else
        {
            chararraybuffer.ensureCapacity(i);
        }
        for (i = 0; i < aheaderelement.length; i++)
        {
            if (i > 0)
            {
                chararraybuffer.append(", ");
            }
            formatHeaderElement(chararraybuffer, aheaderelement[i], flag);
        }

        return chararraybuffer;
    }

    public CharArrayBuffer formatHeaderElement(CharArrayBuffer chararraybuffer, HeaderElement headerelement, boolean flag)
    {
        if (headerelement == null)
        {
            throw new IllegalArgumentException("Header element must not be null.");
        }
        int i = estimateHeaderElementLen(headerelement);
        String s;
        int j;
        if (chararraybuffer == null)
        {
            chararraybuffer = new CharArrayBuffer(i);
        } else
        {
            chararraybuffer.ensureCapacity(i);
        }
        chararraybuffer.append(headerelement.getName());
        s = headerelement.getValue();
        if (s != null)
        {
            chararraybuffer.append('=');
            doFormatValue(chararraybuffer, s, flag);
        }
        j = headerelement.getParameterCount();
        if (j > 0)
        {
            for (i = 0; i < j; i++)
            {
                chararraybuffer.append("; ");
                formatNameValuePair(chararraybuffer, headerelement.getParameter(i), flag);
            }

        }
        return chararraybuffer;
    }

    public CharArrayBuffer formatNameValuePair(CharArrayBuffer chararraybuffer, NameValuePair namevaluepair, boolean flag)
    {
        if (namevaluepair == null)
        {
            throw new IllegalArgumentException("NameValuePair must not be null.");
        }
        int i = estimateNameValuePairLen(namevaluepair);
        if (chararraybuffer == null)
        {
            chararraybuffer = new CharArrayBuffer(i);
        } else
        {
            chararraybuffer.ensureCapacity(i);
        }
        chararraybuffer.append(namevaluepair.getName());
        namevaluepair = namevaluepair.getValue();
        if (namevaluepair != null)
        {
            chararraybuffer.append('=');
            doFormatValue(chararraybuffer, namevaluepair, flag);
        }
        return chararraybuffer;
    }

    public CharArrayBuffer formatParameters(CharArrayBuffer chararraybuffer, NameValuePair anamevaluepair[], boolean flag)
    {
        if (anamevaluepair == null)
        {
            throw new IllegalArgumentException("Parameters must not be null.");
        }
        int i = estimateParametersLen(anamevaluepair);
        if (chararraybuffer == null)
        {
            chararraybuffer = new CharArrayBuffer(i);
        } else
        {
            chararraybuffer.ensureCapacity(i);
        }
        for (i = 0; i < anamevaluepair.length; i++)
        {
            if (i > 0)
            {
                chararraybuffer.append("; ");
            }
            formatNameValuePair(chararraybuffer, anamevaluepair[i], flag);
        }

        return chararraybuffer;
    }

    protected boolean isSeparator(char c)
    {
        return " ;,:@()<>\\\"/[]?={}\t".indexOf(c) >= 0;
    }

    protected boolean isUnsafe(char c)
    {
        return "\"\\".indexOf(c) >= 0;
    }

}
