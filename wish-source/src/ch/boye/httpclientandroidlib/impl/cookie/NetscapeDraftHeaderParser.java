// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib.impl.cookie;

import ch.boye.httpclientandroidlib.HeaderElement;
import ch.boye.httpclientandroidlib.NameValuePair;
import ch.boye.httpclientandroidlib.ParseException;
import ch.boye.httpclientandroidlib.message.BasicHeaderElement;
import ch.boye.httpclientandroidlib.message.BasicNameValuePair;
import ch.boye.httpclientandroidlib.message.ParserCursor;
import ch.boye.httpclientandroidlib.protocol.HTTP;
import ch.boye.httpclientandroidlib.util.CharArrayBuffer;
import java.util.ArrayList;
import java.util.List;

public class NetscapeDraftHeaderParser
{

    public static final NetscapeDraftHeaderParser DEFAULT = new NetscapeDraftHeaderParser();

    public NetscapeDraftHeaderParser()
    {
    }

    private NameValuePair parseNameValuePair(CharArrayBuffer chararraybuffer, ParserCursor parsercursor)
    {
        int i;
        boolean flag;
        int k;
        int i1;
        flag = false;
        i = parsercursor.getPos();
        k = parsercursor.getPos();
        i1 = parsercursor.getUpperBound();
_L2:
        String s;
        int j;
        j = ((flag) ? 1 : 0);
        if (i < i1)
        {
            j = chararraybuffer.charAt(i);
            if (j == '=')
            {
                j = ((flag) ? 1 : 0);
            } else
            {
label0:
                {
                    if (j != ';')
                    {
                        break label0;
                    }
                    j = 1;
                }
            }
        }
        if (i == i1)
        {
            j = 1;
            s = chararraybuffer.substringTrimmed(k, i1);
        } else
        {
            s = chararraybuffer.substringTrimmed(k, i);
            i++;
        }
        if (j != 0)
        {
            parsercursor.updatePos(i);
            return new BasicNameValuePair(s, null);
        }
        break; /* Loop/switch isn't completed */
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        int l = i;
        char c;
label1:
        do
        {
label2:
            {
                c = j;
                if (i < i1)
                {
                    if (chararraybuffer.charAt(i) != ';')
                    {
                        break label2;
                    }
                    c = '\001';
                }
                j = i;
                do
                {
                    i1 = j;
                    if (l >= j)
                    {
                        break;
                    }
                    i1 = j;
                    if (!HTTP.isWhitespace(chararraybuffer.charAt(l)))
                    {
                        break;
                    }
                    l++;
                } while (true);
                break label1;
            }
            i++;
        } while (true);
        for (; i1 > l && HTTP.isWhitespace(chararraybuffer.charAt(i1 - 1)); i1--) { }
        chararraybuffer = chararraybuffer.substring(l, i1);
        j = i;
        if (c != 0)
        {
            j = i + 1;
        }
        parsercursor.updatePos(j);
        return new BasicNameValuePair(s, chararraybuffer);
    }

    public HeaderElement parseHeader(CharArrayBuffer chararraybuffer, ParserCursor parsercursor)
        throws ParseException
    {
        if (chararraybuffer == null)
        {
            throw new IllegalArgumentException("Char array buffer may not be null");
        }
        if (parsercursor == null)
        {
            throw new IllegalArgumentException("Parser cursor may not be null");
        }
        NameValuePair namevaluepair = parseNameValuePair(chararraybuffer, parsercursor);
        ArrayList arraylist = new ArrayList();
        for (; !parsercursor.atEnd(); arraylist.add(parseNameValuePair(chararraybuffer, parsercursor))) { }
        return new BasicHeaderElement(namevaluepair.getName(), namevaluepair.getValue(), (NameValuePair[])arraylist.toArray(new NameValuePair[arraylist.size()]));
    }

}
