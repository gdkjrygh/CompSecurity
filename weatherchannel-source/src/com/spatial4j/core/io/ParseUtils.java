// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spatial4j.core.io;

import com.spatial4j.core.exception.InvalidShapeException;

public class ParseUtils
{

    private ParseUtils()
    {
    }

    public static final double[] parseLatitudeLongitude(String s)
        throws InvalidShapeException
    {
        return parseLatitudeLongitude(null, s);
    }

    public static final double[] parseLatitudeLongitude(double ad[], String s)
        throws InvalidShapeException
    {
        ad = parsePointDouble(ad, s, 2);
        if (ad[0] < -90D || ad[0] > 90D)
        {
            throw new InvalidShapeException((new StringBuilder("Invalid latitude: latitudes are range -90 to 90: provided lat: [")).append(ad[0]).append("]").toString());
        }
        if (ad[1] < -180D || ad[1] > 180D)
        {
            throw new InvalidShapeException((new StringBuilder("Invalid longitude: longitudes are range -180 to 180: provided lon: [")).append(ad[1]).append("]").toString());
        } else
        {
            return ad;
        }
    }

    public static String[] parsePoint(String as[], String s, int i)
        throws InvalidShapeException
    {
        String as1[];
        int j;
        boolean flag;
        int l;
label0:
        {
            flag = true;
            l = 0;
            if (as != null)
            {
                as1 = as;
                if (as.length == i)
                {
                    break label0;
                }
            }
            as1 = new String[i];
        }
        j = s.indexOf(',');
        if (j != -1 || i != 1 || s.length() <= 0) goto _L2; else goto _L1
_L1:
        as1[0] = s.trim();
        j = ((flag) ? 1 : 0);
_L4:
        if (j != i)
        {
            throw new InvalidShapeException((new StringBuilder("incompatible dimension (")).append(i).append(") and values (").append(s).append(").  Only ").append(j).append(" values specified").toString());
        } else
        {
            return as1;
        }
_L2:
        if (j > 0)
        {
            int k = j;
            boolean flag1 = false;
            int i1 = j;
            j = ((flag1) ? 1 : 0);
            do
            {
                if (j >= i)
                {
                    continue; /* Loop/switch isn't completed */
                }
                int j1;
                do
                {
                    j1 = k;
                    if (l >= k)
                    {
                        break;
                    }
                    j1 = k;
                    if (s.charAt(l) != ' ')
                    {
                        break;
                    }
                    l++;
                } while (true);
                for (; j1 > l && s.charAt(j1 - 1) == ' '; j1--) { }
                if (l == j1)
                {
                    continue; /* Loop/switch isn't completed */
                }
                as1[j] = s.substring(l, j1);
                l = i1 + 1;
                i1 = s.indexOf(',', l);
                if (i1 == -1)
                {
                    k = s.length();
                } else
                {
                    k = i1;
                }
                j++;
            } while (true);
        }
        j = 0;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static double[] parsePointDouble(double ad[], String s, int i)
        throws InvalidShapeException
    {
        double ad1[];
        int j;
        boolean flag;
        int l;
label0:
        {
            flag = true;
            l = 0;
            if (ad != null)
            {
                ad1 = ad;
                if (ad.length == i)
                {
                    break label0;
                }
            }
            ad1 = new double[i];
        }
        j = s.indexOf(',');
        if (j != -1 || i != 1 || s.length() <= 0) goto _L2; else goto _L1
_L1:
        ad1[0] = Double.parseDouble(s.trim());
        j = ((flag) ? 1 : 0);
_L4:
        if (j != i)
        {
            throw new InvalidShapeException((new StringBuilder("incompatible dimension (")).append(i).append(") and values (").append(s).append(").  Only ").append(j).append(" values specified").toString());
        } else
        {
            return ad1;
        }
_L2:
        if (j > 0)
        {
            int k = j;
            boolean flag1 = false;
            int i1 = j;
            j = ((flag1) ? 1 : 0);
            do
            {
                if (j >= i)
                {
                    continue; /* Loop/switch isn't completed */
                }
                int j1;
                do
                {
                    j1 = k;
                    if (l >= k)
                    {
                        break;
                    }
                    j1 = k;
                    if (s.charAt(l) != ' ')
                    {
                        break;
                    }
                    l++;
                } while (true);
                for (; j1 > l && s.charAt(j1 - 1) == ' '; j1--) { }
                if (l == j1)
                {
                    continue; /* Loop/switch isn't completed */
                }
                ad1[j] = Double.parseDouble(s.substring(l, j1));
                l = i1 + 1;
                i1 = s.indexOf(',', l);
                if (i1 == -1)
                {
                    k = s.length();
                } else
                {
                    k = i1;
                }
                j++;
            } while (true);
        }
        j = 0;
        if (true) goto _L4; else goto _L3
_L3:
    }
}
