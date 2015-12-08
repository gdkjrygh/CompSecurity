// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.util;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package com.gau.go.launcherex.gowidget.weather.util:
//            r

public class q
{

    public static final float a[] = {
        0.67F, 3.58F, 7.62F, 12.32F, 17.92F, 24.19F, 31.14F, 38.53F, 46.59F, 54.88F, 
        63.84F, 73.03F, 82.89F, 92.97F, 103.49F, 114.25F, 125.67F
    };
    private static final float b[] = {
        0.4F, 2.2F, 5.6F, 9.8F, 14.9F, 20.1F, 27.5F, 33.5F, 41.8F, 49.2F, 
        59.3F, 67.1F, 73.2F
    };

    public static int a(double d1)
    {
        char c1 = '\0';
        if (d1 < 0.0D)
        {
            c1 = '\uD8F0';
        } else
        if (d1 >= (double)a[0])
        {
            if (d1 < (double)a[1])
            {
                return 1;
            }
            if (d1 < (double)a[2])
            {
                return 2;
            }
            if (d1 < (double)a[3])
            {
                return 3;
            }
            if (d1 < (double)a[4])
            {
                return 4;
            }
            if (d1 < (double)a[5])
            {
                return 5;
            }
            if (d1 < (double)a[6])
            {
                return 6;
            }
            if (d1 < (double)a[7])
            {
                return 7;
            }
            if (d1 < (double)a[8])
            {
                return 8;
            }
            if (d1 < (double)a[9])
            {
                return 9;
            }
            if (d1 < (double)a[10])
            {
                return 10;
            }
            if (d1 < (double)a[11])
            {
                return 11;
            }
            if (d1 < (double)a[12])
            {
                return 12;
            }
            if (d1 < (double)a[13])
            {
                return 13;
            }
            if (d1 < (double)a[14])
            {
                return 14;
            }
            if (d1 < (double)a[15])
            {
                return 15;
            }
            return d1 >= (double)a[16] ? 17 : 16;
        }
        return c1;
    }

    public static int a(float f1)
    {
        return Math.round(f1);
    }

    public static int a(int i1)
    {
        return a((float)((double)i1 / 1.8D));
    }

    public static String a(float f1, int i1)
    {
        if (f1 <= -10000F)
        {
            return "--";
        } else
        {
            NumberFormat numberformat = DecimalFormat.getInstance();
            numberformat.setMaximumFractionDigits(i1);
            return numberformat.format(e(f1));
        }
    }

    public static String a(String s)
    {
        if (s == null)
        {
            return "--";
        }
        try
        {
            float f1 = Float.parseFloat(s.split(" ")[0]);
            s = NumberFormat.getNumberInstance();
            s.setMaximumFractionDigits(1);
            s.setMinimumFractionDigits(1);
            s = s.format((double)f1 * 1.6100000000000001D);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
            return "--";
        }
        return s;
    }

    public static String a(String s, int i1, int j1)
    {
        if (i1 == j1)
        {
            return s;
        }
        if (i1 == 1)
        {
            return n(s);
        } else
        {
            return m(s);
        }
    }

    public static float b(float f1)
    {
        return (float)Math.round(f1 * 10F) / 10F;
    }

    public static float b(float f1, int i1)
    {
        String s = a(f1, i1);
        if (s.equals("--"))
        {
            return -10000F;
        }
        try
        {
            f1 = DecimalFormat.getInstance().parse(s).floatValue();
        }
        catch (ParseException parseexception)
        {
            parseexception.printStackTrace();
            return -10000F;
        }
        return f1;
    }

    public static int b(int i1)
    {
        return a((float)((double)i1 * 1.8D));
    }

    public static String b(String s)
    {
        return a(s);
    }

    public static float c(float f1)
    {
        if (f1 == -10000F)
        {
            return -10000F;
        } else
        {
            return ((f1 - 32F) * 5F) / 9F;
        }
    }

    public static float c(float f1, int i1)
    {
        f1 = (float)((double)f1 * 1.6100000000000001D);
        NumberFormat numberformat = NumberFormat.getInstance();
        numberformat.setMaximumFractionDigits(i1);
        String s = numberformat.format(f1);
        try
        {
            f1 = numberformat.parse(s).floatValue();
        }
        catch (ParseException parseexception)
        {
            parseexception.printStackTrace();
            return -10000F;
        }
        return f1;
    }

    public static float c(int i1)
    {
        return b[i1];
    }

    public static String c(String s)
    {
        if (s == null)
        {
            return "--";
        }
        try
        {
            float f1 = Float.parseFloat(s.split(" ")[0]);
            s = NumberFormat.getNumberInstance();
            s.setMaximumFractionDigits(1);
            s.setMinimumFractionDigits(1);
            s = s.format((double)f1 * 0.44640000000000002D);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
            return "--";
        }
        return s;
    }

    public static float d(float f1)
    {
        return (9F * f1) / 5F + 32F;
    }

    public static float d(float f1, int i1)
    {
        return c(f1, i1);
    }

    public static String d(String s)
    {
        if (s == null)
        {
            return "--";
        }
        try
        {
            int i1 = a(Float.parseFloat(s.split(" ")[0]));
            s = (new StringBuilder()).append(i1).append("").toString();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
            return "--";
        }
        return s;
    }

    private static float e(float f1)
    {
        return ((f1 - 32F) * 5F) / 9F;
    }

    public static float e(float f1, int i1)
    {
        f1 = (float)((double)f1 * 0.44640000000000002D);
        NumberFormat numberformat = DecimalFormat.getInstance();
        numberformat.setMaximumFractionDigits(i1);
        String s = numberformat.format(f1);
        try
        {
            f1 = numberformat.parse(s).floatValue();
        }
        catch (ParseException parseexception)
        {
            parseexception.printStackTrace();
            return -10000F;
        }
        return f1;
    }

    public static String e(String s)
    {
        if (s == null)
        {
            return "--";
        }
        try
        {
            float f1 = Float.parseFloat(s.split(" ")[0]);
            s = NumberFormat.getNumberInstance();
            s.setMaximumFractionDigits(1);
            s.setMinimumFractionDigits(1);
            s = s.format((double)f1 * 0.8679D);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
            return "--";
        }
        return s;
    }

    public static float f(float f1, int i1)
    {
        f1 = (float)((double)f1 * 0.8679D);
        NumberFormat numberformat = NumberFormat.getInstance();
        numberformat.setMaximumFractionDigits(i1);
        String s = numberformat.format(f1);
        try
        {
            f1 = numberformat.parse(s).floatValue();
        }
        catch (ParseException parseexception)
        {
            parseexception.printStackTrace();
            return -10000F;
        }
        return f1;
    }

    public static String f(String s)
    {
        Object obj = Pattern.compile("([+-]?(?:\\d+(?:\\.\\d*)?|\\.\\d+))\\s*[sS]").matcher(s);
        StringBuffer stringbuffer = new StringBuffer();
        MatchResult matchresult1;
        for (; ((Matcher) (obj)).find(); ((Matcher) (obj)).appendReplacement(stringbuffer, (new StringBuilder()).append(matchresult1.group(1)).append(" \260F").toString()))
        {
            matchresult1 = ((Matcher) (obj)).toMatchResult();
        }

        obj = Pattern.compile("([+-]?(?:\\d+(?:\\.\\d*)?|\\.\\d+))\\s*(?:\\xB0F|\\xB0|F)");
        if (!stringbuffer.toString().equals(""))
        {
            s = stringbuffer.toString();
        }
        s = ((Pattern) (obj)).matcher(s);
        stringbuffer = new StringBuffer();
        MatchResult matchresult;
        for (; s.find(); s.appendReplacement(stringbuffer, (new StringBuilder()).append(matchresult.group(1)).append(" \260F").toString()))
        {
            matchresult = s.toMatchResult();
        }

        s.appendTail(stringbuffer);
        return stringbuffer.toString();
    }

    public static String g(float f1, int i1)
    {
        if (f1 <= -10000F)
        {
            return "--";
        } else
        {
            NumberFormat numberformat = DecimalFormat.getInstance();
            numberformat.setMaximumFractionDigits(i1);
            return numberformat.format(c(f1));
        }
    }

    public static String g(String s)
    {
        Object obj = Pattern.compile("([+-]?(?:\\d+(?:\\.\\d*)?|\\.\\d+))\\s*[sS]").matcher(s);
        StringBuffer stringbuffer = new StringBuffer();
        String s2;
        for (; ((Matcher) (obj)).find(); ((Matcher) (obj)).appendReplacement(stringbuffer, (new StringBuilder()).append(s2).append(" \260C").toString()))
        {
            s2 = g(Float.parseFloat(((Matcher) (obj)).toMatchResult().group(1)), 1);
        }

        obj = Pattern.compile("([+-]?(?:\\d+(?:\\.\\d*)?|\\.\\d+))\\s*(?:\\xB0F|\\xB0|F)");
        if (!stringbuffer.toString().equals(""))
        {
            s = stringbuffer.toString();
        }
        s = ((Pattern) (obj)).matcher(s);
        stringbuffer = new StringBuffer();
        String s1;
        for (; s.find(); s.appendReplacement(stringbuffer, (new StringBuilder()).append(s1).append(" \260C").toString()))
        {
            s1 = g(Float.parseFloat(s.toMatchResult().group(1)), 1);
        }

        s.appendTail(stringbuffer);
        return stringbuffer.toString();
    }

    public static String h(float f1, int i1)
    {
        if (f1 <= -10000F)
        {
            return "--";
        } else
        {
            NumberFormat numberformat = DecimalFormat.getInstance();
            numberformat.setMaximumFractionDigits(i1);
            return numberformat.format(d(f1));
        }
    }

    public static String h(String s)
    {
        Object obj = Pattern.compile("(\\d+(?:\\.\\d*)?|\\.\\d+)\\s*to\\s*(\\d+(?:\\.\\d*)?|\\.\\d+)\\s*[mM][pP][hH]").matcher(s);
        StringBuffer stringbuffer = new StringBuffer();
        String s2;
        Object obj1;
        for (; ((Matcher) (obj)).find(); ((Matcher) (obj)).appendReplacement(stringbuffer, (new StringBuilder()).append(s2).append(" to ").append(((String) (obj1))).append(" kph").toString()))
        {
            obj1 = ((Matcher) (obj)).toMatchResult();
            s2 = a(((MatchResult) (obj1)).group(1));
            obj1 = a(((MatchResult) (obj1)).group(2));
        }

        obj = Pattern.compile("(\\d+(?:\\.\\d*)?|\\.\\d+)\\s*[mM][pP][hH]");
        if (!stringbuffer.toString().equals(""))
        {
            s = stringbuffer.toString();
        }
        s = ((Pattern) (obj)).matcher(s);
        stringbuffer = new StringBuffer();
        String s1;
        for (; s.find(); s.appendReplacement(stringbuffer, (new StringBuilder()).append(s1).append(" kph").toString()))
        {
            s1 = a(s.toMatchResult().group(1));
        }

        s.appendTail(stringbuffer);
        return stringbuffer.toString();
    }

    public static float i(float f1, int i1)
    {
        f1 = (float)((double)f1 * 1.6093440000000001D);
        NumberFormat numberformat = NumberFormat.getInstance();
        numberformat.setMaximumFractionDigits(i1);
        String s = numberformat.format(f1);
        try
        {
            f1 = numberformat.parse(s).floatValue();
        }
        catch (ParseException parseexception)
        {
            parseexception.printStackTrace();
            return -10000F;
        }
        return f1;
    }

    public static String i(String s)
    {
        Object obj = Pattern.compile("(\\d+(?:\\.\\d*)?|\\.\\d+)\\s*to\\s*(\\d+(?:\\.\\d*)?|\\.\\d+)\\s*[mM][pP][hH]").matcher(s);
        StringBuffer stringbuffer = new StringBuffer();
        String s2;
        Object obj1;
        for (; ((Matcher) (obj)).find(); ((Matcher) (obj)).appendReplacement(stringbuffer, (new StringBuilder()).append(s2).append(" to ").append(((String) (obj1))).append(" km/h").toString()))
        {
            obj1 = ((Matcher) (obj)).toMatchResult();
            s2 = b(((MatchResult) (obj1)).group(1));
            obj1 = b(((MatchResult) (obj1)).group(2));
        }

        obj = Pattern.compile("(\\d+(?:\\.\\d*)?|\\.\\d+)\\s*[mM][pP][hH]");
        if (!stringbuffer.toString().equals(""))
        {
            s = stringbuffer.toString();
        }
        s = ((Pattern) (obj)).matcher(s);
        stringbuffer = new StringBuffer();
        String s1;
        for (; s.find(); s.appendReplacement(stringbuffer, (new StringBuilder()).append(s1).append(" km/h").toString()))
        {
            s1 = b(s.toMatchResult().group(1));
        }

        s.appendTail(stringbuffer);
        return stringbuffer.toString();
    }

    public static float j(float f1, int i1)
    {
        NumberFormat numberformat = DecimalFormat.getInstance();
        numberformat.setMaximumFractionDigits(i1);
        String s = numberformat.format(0.4912F * f1);
        try
        {
            f1 = numberformat.parse(s).floatValue();
        }
        catch (ParseException parseexception)
        {
            parseexception.printStackTrace();
            return -10000F;
        }
        return f1;
    }

    public static String j(String s)
    {
        Object obj = Pattern.compile("(\\d+(?:\\.\\d*)?|\\.\\d+)\\s*to\\s*(\\d+(?:\\.\\d*)?|\\.\\d+)\\s*[mM][pP][hH]").matcher(s);
        StringBuffer stringbuffer = new StringBuffer();
        String s2;
        Object obj1;
        for (; ((Matcher) (obj)).find(); ((Matcher) (obj)).appendReplacement(stringbuffer, (new StringBuilder()).append(s2).append(" to ").append(((String) (obj1))).append(" m/s").toString()))
        {
            obj1 = ((Matcher) (obj)).toMatchResult();
            s2 = c(((MatchResult) (obj1)).group(1));
            obj1 = c(((MatchResult) (obj1)).group(2));
        }

        obj = Pattern.compile("(\\d+(?:\\.\\d*)?|\\.\\d+)\\s*[mM][pP][hH]");
        if (!stringbuffer.toString().equals(""))
        {
            s = stringbuffer.toString();
        }
        s = ((Pattern) (obj)).matcher(s);
        stringbuffer = new StringBuffer();
        String s1;
        for (; s.find(); s.appendReplacement(stringbuffer, (new StringBuilder()).append(s1).append(" m/s").toString()))
        {
            s1 = c(s.toMatchResult().group(1));
        }

        s.appendTail(stringbuffer);
        return stringbuffer.toString();
    }

    public static float k(float f1, int i1)
    {
        NumberFormat numberformat = DecimalFormat.getInstance();
        numberformat.setMaximumFractionDigits(i1);
        String s = numberformat.format(0.03386F * f1);
        try
        {
            f1 = numberformat.parse(s).floatValue();
        }
        catch (ParseException parseexception)
        {
            parseexception.printStackTrace();
            return -10000F;
        }
        return f1;
    }

    public static String k(String s)
    {
        Matcher matcher = Pattern.compile("(\\d+(?:\\.\\d*)?|\\.\\d+)\\s*to\\s*(\\d+(?:\\.\\d*)?|\\.\\d+)\\s*[mM][pP][hH]").matcher(s);
        Object obj1 = new StringBuffer();
        while (matcher.find()) 
        {
            Object obj2 = matcher.toMatchResult();
            String s1 = d(((MatchResult) (obj2)).group(1));
            obj2 = d(((MatchResult) (obj2)).group(2));
            if (s1.equals(obj2))
            {
                s1 = (new StringBuilder()).append("Lv. ").append(s1).toString();
            } else
            {
                s1 = (new StringBuilder()).append("Lv. ").append(s1).append(" to ").append(((String) (obj2))).toString();
            }
            matcher.appendReplacement(((StringBuffer) (obj1)), s1);
        }
        Object obj = Pattern.compile("(\\d+(?:\\.\\d*)?|\\.\\d+)\\s*[mM][pP][hH]");
        if (!((StringBuffer) (obj1)).toString().equals(""))
        {
            s = ((StringBuffer) (obj1)).toString();
        }
        s = ((Pattern) (obj)).matcher(s);
        obj = new StringBuffer();
        for (; s.find(); s.appendReplacement(((StringBuffer) (obj)), (new StringBuilder()).append("Lv. ").append(((String) (obj1))).toString()))
        {
            obj1 = d(s.toMatchResult().group(1));
        }

        s.appendTail(((StringBuffer) (obj)));
        return ((StringBuffer) (obj)).toString();
    }

    public static float l(float f1, int i1)
    {
        NumberFormat numberformat = DecimalFormat.getInstance();
        numberformat.setMaximumFractionDigits(i1);
        String s = numberformat.format(25.4F * f1);
        try
        {
            f1 = numberformat.parse(s).floatValue();
        }
        catch (ParseException parseexception)
        {
            parseexception.printStackTrace();
            return -10000F;
        }
        return f1;
    }

    public static String l(String s)
    {
        Matcher matcher = Pattern.compile("(\\d+(?:\\.\\d*)?|\\.\\d+)\\s*to\\s*(\\d+(?:\\.\\d*)?|\\.\\d+)\\s*[mM][pP][hH]").matcher(s);
        Object obj1 = new StringBuffer();
        while (matcher.find()) 
        {
            Object obj2 = matcher.toMatchResult();
            String s1 = e(((MatchResult) (obj2)).group(1));
            obj2 = e(((MatchResult) (obj2)).group(2));
            if (s1.equals(obj2))
            {
                s1 = (new StringBuilder()).append(s1).append(" knots").toString();
            } else
            {
                s1 = (new StringBuilder()).append(s1).append(" to ").append(((String) (obj2))).append(" knots").toString();
            }
            matcher.appendReplacement(((StringBuffer) (obj1)), s1);
        }
        Object obj = Pattern.compile("(\\d+(?:\\.\\d*)?|\\.\\d+)\\s*[mM][pP][hH]");
        if (!((StringBuffer) (obj1)).toString().equals(""))
        {
            s = ((StringBuffer) (obj1)).toString();
        }
        s = ((Pattern) (obj)).matcher(s);
        obj = new StringBuffer();
        for (; s.find(); s.appendReplacement(((StringBuffer) (obj)), (new StringBuilder()).append(((String) (obj1))).append(" knots").toString()))
        {
            obj1 = e(s.toMatchResult().group(1));
        }

        s.appendTail(((StringBuffer) (obj)));
        return ((StringBuffer) (obj)).toString();
    }

    public static float m(float f1, int i1)
    {
        NumberFormat numberformat = DecimalFormat.getInstance();
        numberformat.setMaximumFractionDigits(i1);
        String s = numberformat.format(0.003386F * f1);
        try
        {
            f1 = numberformat.parse(s).floatValue();
        }
        catch (ParseException parseexception)
        {
            parseexception.printStackTrace();
            return -10000F;
        }
        return f1;
    }

    public static String m(String s)
    {
        if (!r.a(s))
        {
            return "--";
        }
        int i1;
        try
        {
            i1 = Integer.parseInt(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
            i1 = -10000;
        }
        if (i1 <= -10000)
        {
            return "--";
        } else
        {
            return g(i1, 0);
        }
    }

    public static float n(float f1, int i1)
    {
        NumberFormat numberformat = DecimalFormat.getInstance();
        numberformat.setMaximumFractionDigits(i1);
        String s = numberformat.format(33.86F * f1);
        try
        {
            f1 = numberformat.parse(s).floatValue();
        }
        catch (ParseException parseexception)
        {
            parseexception.printStackTrace();
            return -10000F;
        }
        return f1;
    }

    public static String n(String s)
    {
        int i1;
        if (!r.a(s))
        {
            return "--";
        }
        i1 = -10000;
        int j1 = Integer.parseInt(s);
        i1 = j1;
_L1:
        if (i1 >= 10000)
        {
            return "--";
        } else
        {
            return h(i1, 0);
        }
        s;
        s.printStackTrace();
          goto _L1
    }

}
