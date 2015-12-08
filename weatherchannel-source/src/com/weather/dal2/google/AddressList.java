// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.dal2.google;

import com.google.common.collect.ImmutableSet;
import java.util.Iterator;

public class AddressList
{

    private static final String ROOFTOP = "ROOFTOP";
    private static final ImmutableSet unacceptableTypes = ImmutableSet.of("country", "administrative_area_level_1", "street_number");
    private final Result results[] = null;
    private final String status = null;

    public AddressList()
    {
    }

    public Result getAddress(int i)
    {
        return results[i];
    }

    public int getCount()
    {
        if (!"OK".equals(status))
        {
            return 0;
        } else
        {
            return results.length;
        }
    }

    public String getFirstAcceptable()
    {
        int i = 0;
        for (int j = results.length; i < j; i++)
        {
    /* block-local class not found */
    class Result {}

            if (isAcceptableAddress(i))
            {
                return Result.access._mth200(results[i]);
            }
        }

        return null;
    }

    public String getFormattedAddress(int i)
    {
        return Result.access._mth200(results[i]);
    }

    public Double getLat(int i)
    {
    /* block-local class not found */
    class Result.Geometry {}

    /* block-local class not found */
    class Result.Geometry.LocationObject {}

        return Double.valueOf(Result.Geometry.LocationObject.access._mth500(Result.Geometry.access._mth400(Result.access._mth000(results[i]))));
    }

    public Double getLong(int i)
    {
        return Double.valueOf(Result.Geometry.LocationObject.access._mth600(Result.Geometry.access._mth400(Result.access._mth000(results[i]))));
    }

    public String getRoofTop()
    {
        Result aresult[] = results;
        int j = aresult.length;
        for (int i = 0; i < j; i++)
        {
            Result result = aresult[i];
            if (Result.Geometry.access._mth100(Result.access._mth000(result)).equals("ROOFTOP"))
            {
                return Result.access._mth200(result);
            }
        }

        return null;
    }

    public String getTypeString(int i, int j)
    {
        return Result.access._mth300(results[i])[j];
    }

    public int getTypeStringCount(int i)
    {
        return Result.access._mth300(results[i]).length;
    }

    public boolean isAcceptableAddress(int i)
    {
        String as[] = Result.access._mth300(results[i]);
        if (as.length != 1 || !as[0].equals("political")) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        com.google.common.collect.UnmodifiableIterator unmodifiableiterator = unacceptableTypes.iterator();
_L4:
        String s;
        int j;
        if (!unmodifiableiterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_86;
        }
        s = (String)unmodifiableiterator.next();
        j = as.length;
        i = 0;
_L6:
        if (i >= j) goto _L4; else goto _L3
_L3:
        if (as[i].equals(s)) goto _L1; else goto _L5
_L5:
        i++;
          goto _L6
        return true;
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder("[");
        String s = "";
        Result aresult[] = results;
        int j = aresult.length;
        for (int i = 0; i < j; i++)
        {
            Result result = aresult[i];
            stringbuilder.append(s);
            stringbuilder.append(Result.access._mth200(result));
            s = "| ";
        }

        stringbuilder.append(']');
        return stringbuilder.toString();
    }

}
