// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.suggest;

import android.database.AbstractCursor;
import android.database.CursorIndexOutOfBoundsException;
import java.util.ArrayList;
import java.util.Iterator;

public final class c extends AbstractCursor
{

    private static String b[] = {
        "_id", "suggest_text_1", "suggest_text_2", "suggest_intent_query"
    };
    private ArrayList a;

    public c()
    {
        a = new ArrayList(10);
    }

    public final void a(Iterable iterable)
    {
        a.clear();
        String s;
        for (iterable = iterable.iterator(); iterable.hasNext(); a.add(s))
        {
            s = (String)iterable.next();
        }

    }

    public final String[] getColumnNames()
    {
        return b;
    }

    public final int getCount()
    {
        return a.size();
    }

    public final double getDouble(int i)
    {
        return Double.valueOf(getString(i)).doubleValue();
    }

    public final float getFloat(int i)
    {
        return Float.valueOf(getString(i)).floatValue();
    }

    public final int getInt(int i)
    {
        return Integer.valueOf(getString(i)).intValue();
    }

    public final long getLong(int i)
    {
        if (i == 0)
        {
            return (long)mPos;
        } else
        {
            return Long.valueOf(getString(i)).longValue();
        }
    }

    public final short getShort(int i)
    {
        return Short.valueOf(getString(i)).shortValue();
    }

    public final String getString(int i)
    {
        if (mPos < 0)
        {
            throw new CursorIndexOutOfBoundsException("Before first row.");
        }
        if (mPos >= a.size())
        {
            throw new CursorIndexOutOfBoundsException("After last row.");
        }
        if (i == 3 || i == 1)
        {
            return (String)a.get(mPos);
        } else
        {
            return null;
        }
    }

    public final boolean isNull(int i)
    {
        return getString(i) == null;
    }

}
