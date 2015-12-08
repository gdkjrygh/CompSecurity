// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.SimpleTimeZone;
import java.util.TimeZone;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Strings;

// Referenced classes of package org.bouncycastle.asn1:
//            ASN1Primitive, ASN1GeneralizedTime, ASN1TaggedObject, ASN1OctetString, 
//            ASN1OutputStream, StreamUtil

public class DERGeneralizedTime extends ASN1Primitive
{

    private byte time[];

    public DERGeneralizedTime(String s)
    {
        time = Strings.toByteArray(s);
        try
        {
            getDate();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("invalid date string: ").append(s.getMessage()).toString());
        }
    }

    public DERGeneralizedTime(Date date)
    {
        SimpleDateFormat simpledateformat = new SimpleDateFormat("yyyyMMddHHmmss'Z'");
        simpledateformat.setTimeZone(new SimpleTimeZone(0, "Z"));
        time = Strings.toByteArray(simpledateformat.format(date));
    }

    DERGeneralizedTime(byte abyte0[])
    {
        time = abyte0;
    }

    private String calculateGMTOffset()
    {
        String s;
        TimeZone timezone;
        int i;
        int l;
        s = "+";
        timezone = TimeZone.getDefault();
        i = timezone.getRawOffset();
        int j = i;
        if (i < 0)
        {
            s = "-";
            j = -i;
        }
        i = j / 0x36ee80;
        l = (j - i * 60 * 60 * 1000) / 60000;
        boolean flag;
        if (!timezone.useDaylightTime() || !timezone.inDaylightTime(getDate()))
        {
            break MISSING_BLOCK_LABEL_90;
        }
        flag = s.equals("+");
        int k;
        if (flag)
        {
            k = 1;
        } else
        {
            k = -1;
        }
        i = k + i;
_L2:
        return (new StringBuilder()).append("GMT").append(s).append(convert(i)).append(":").append(convert(l)).toString();
        ParseException parseexception;
        parseexception;
        if (true) goto _L2; else goto _L1
_L1:
    }

    private String convert(int i)
    {
        if (i < 10)
        {
            return (new StringBuilder()).append("0").append(i).toString();
        } else
        {
            return Integer.toString(i);
        }
    }

    public static ASN1GeneralizedTime getInstance(Object obj)
    {
        if (obj == null || (obj instanceof ASN1GeneralizedTime))
        {
            return (ASN1GeneralizedTime)obj;
        }
        if (obj instanceof DERGeneralizedTime)
        {
            return new ASN1GeneralizedTime(((DERGeneralizedTime)obj).time);
        }
        if (obj instanceof byte[])
        {
            try
            {
                obj = (ASN1GeneralizedTime)fromByteArray((byte[])(byte[])obj);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw new IllegalArgumentException((new StringBuilder()).append("encoding error in getInstance: ").append(((Exception) (obj)).toString()).toString());
            }
            return ((ASN1GeneralizedTime) (obj));
        } else
        {
            throw new IllegalArgumentException((new StringBuilder()).append("illegal object in getInstance: ").append(obj.getClass().getName()).toString());
        }
    }

    public static ASN1GeneralizedTime getInstance(ASN1TaggedObject asn1taggedobject, boolean flag)
    {
        asn1taggedobject = asn1taggedobject.getObject();
        if (flag || (asn1taggedobject instanceof DERGeneralizedTime))
        {
            return getInstance(asn1taggedobject);
        } else
        {
            return new ASN1GeneralizedTime(((ASN1OctetString)asn1taggedobject).getOctets());
        }
    }

    private boolean hasFractionalSeconds()
    {
        boolean flag1 = false;
        int i = 0;
        do
        {
label0:
            {
                boolean flag = flag1;
                if (i != time.length)
                {
                    if (time[i] != 46 || i != 14)
                    {
                        break label0;
                    }
                    flag = true;
                }
                return flag;
            }
            i++;
        } while (true);
    }

    boolean asn1Equals(ASN1Primitive asn1primitive)
    {
        if (!(asn1primitive instanceof DERGeneralizedTime))
        {
            return false;
        } else
        {
            return Arrays.areEqual(time, ((DERGeneralizedTime)asn1primitive).time);
        }
    }

    void encode(ASN1OutputStream asn1outputstream)
    {
        asn1outputstream.writeEncoded(24, time);
    }

    int encodedLength()
    {
        int i = time.length;
        return i + (StreamUtil.calculateBodyLength(i) + 1);
    }

    public Date getDate()
    {
        Object obj;
        Object obj1;
        String s;
        int i;
        obj1 = Strings.fromByteArray(time);
        Object obj2;
        if (((String) (obj1)).endsWith("Z"))
        {
            char c;
            if (hasFractionalSeconds())
            {
                obj = new SimpleDateFormat("yyyyMMddHHmmss.SSS'Z'");
            } else
            {
                obj = new SimpleDateFormat("yyyyMMddHHmmss'Z'");
            }
            ((SimpleDateFormat) (obj)).setTimeZone(new SimpleTimeZone(0, "Z"));
            obj2 = obj;
            obj = obj1;
        } else
        if (((String) (obj1)).indexOf('-') > 0 || ((String) (obj1)).indexOf('+') > 0)
        {
            obj1 = getTime();
            if (hasFractionalSeconds())
            {
                obj = new SimpleDateFormat("yyyyMMddHHmmss.SSSz");
            } else
            {
                obj = new SimpleDateFormat("yyyyMMddHHmmssz");
            }
            ((SimpleDateFormat) (obj)).setTimeZone(new SimpleTimeZone(0, "Z"));
            obj2 = obj;
            obj = obj1;
        } else
        {
            if (hasFractionalSeconds())
            {
                obj = new SimpleDateFormat("yyyyMMddHHmmss.SSS");
            } else
            {
                obj = new SimpleDateFormat("yyyyMMddHHmmss");
            }
            ((SimpleDateFormat) (obj)).setTimeZone(new SimpleTimeZone(0, TimeZone.getDefault().getID()));
            obj2 = obj;
            obj = obj1;
        }
        obj1 = obj;
        if (!hasFractionalSeconds()) goto _L2; else goto _L1
_L1:
        s = ((String) (obj)).substring(14);
        i = 1;
_L7:
        if (i >= s.length()) goto _L4; else goto _L3
_L3:
        c = s.charAt(i);
        if ('0' <= c && c <= '9') goto _L5; else goto _L4
_L4:
        if (i - 1 > 3)
        {
            obj1 = (new StringBuilder()).append(s.substring(0, 4)).append(s.substring(i)).toString();
            obj1 = (new StringBuilder()).append(((String) (obj)).substring(0, 14)).append(((String) (obj1))).toString();
        } else
        if (i - 1 == 1)
        {
            obj1 = (new StringBuilder()).append(s.substring(0, i)).append("00").append(s.substring(i)).toString();
            obj1 = (new StringBuilder()).append(((String) (obj)).substring(0, 14)).append(((String) (obj1))).toString();
        } else
        {
            obj1 = obj;
            if (i - 1 == 2)
            {
                obj1 = (new StringBuilder()).append(s.substring(0, i)).append("0").append(s.substring(i)).toString();
                obj1 = (new StringBuilder()).append(((String) (obj)).substring(0, 14)).append(((String) (obj1))).toString();
            }
        }
_L2:
        return ((SimpleDateFormat) (obj2)).parse(((String) (obj1)));
_L5:
        i++;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public String getTime()
    {
        String s = Strings.fromByteArray(time);
        if (s.charAt(s.length() - 1) == 'Z')
        {
            return (new StringBuilder()).append(s.substring(0, s.length() - 1)).append("GMT+00:00").toString();
        }
        int i = s.length() - 5;
        char c = s.charAt(i);
        if (c == '-' || c == '+')
        {
            return (new StringBuilder()).append(s.substring(0, i)).append("GMT").append(s.substring(i, i + 3)).append(":").append(s.substring(i + 3)).toString();
        }
        i = s.length() - 3;
        c = s.charAt(i);
        if (c == '-' || c == '+')
        {
            return (new StringBuilder()).append(s.substring(0, i)).append("GMT").append(s.substring(i)).append(":00").toString();
        } else
        {
            return (new StringBuilder()).append(s).append(calculateGMTOffset()).toString();
        }
    }

    public String getTimeString()
    {
        return Strings.fromByteArray(time);
    }

    public int hashCode()
    {
        return Arrays.hashCode(time);
    }

    boolean isConstructed()
    {
        return false;
    }
}
