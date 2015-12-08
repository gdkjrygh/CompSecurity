// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.util;

import android.database.Cursor;
import android.database.CursorWrapper;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CursorWithDelete extends CursorWrapper
{

    private final List positionsToIgnore = new ArrayList();

    public CursorWithDelete(Cursor cursor)
    {
        super(cursor);
    }

    private int getRealPosition(int i)
    {
        int j = Collections.binarySearch(positionsToIgnore, Integer.valueOf(i));
        if (j < 0)
        {
            j = -j - 1;
        } else
        {
            j++;
        }
        for (; j < positionsToIgnore.size() && i + j >= ((Integer)positionsToIgnore.get(j)).intValue(); j++) { }
        return i + j;
    }

    private int getVirtualPosition(int i)
    {
        if (isAtOrAfterLastNotDeletedElement(i))
        {
            return getCount();
        }
        int j = Collections.binarySearch(positionsToIgnore, Integer.valueOf(i));
        if (j < 0)
        {
            j = -j - 1;
        } else
        {
            j++;
        }
        return i - j;
    }

    private boolean isAtOrAfterLastNotDeletedElement(int i)
    {
        int j = super.getCount();
        if (i < j)
        {
            int k = Collections.binarySearch(positionsToIgnore, Integer.valueOf(i));
            if (k < 0)
            {
                return false;
            }
            if (positionsToIgnore.size() - k < j - i)
            {
                return false;
            }
        }
        return true;
    }

    public void deleteItem(int i)
    {
        i = getRealPosition(i);
        int j = Collections.binarySearch(positionsToIgnore, Integer.valueOf(i));
        positionsToIgnore.add(-j - 1, Integer.valueOf(i));
    }

    public int getCount()
    {
        return super.getCount() - positionsToIgnore.size();
    }

    public int getPosition()
    {
        return getVirtualPosition(super.getPosition());
    }

    public boolean isAfterLast()
    {
        int i = getCount();
        return i == 0 || getPosition() == i;
    }

    public boolean isBeforeFirst()
    {
        return getCount() == 0 || getPosition() == -1;
    }

    public boolean isFirst()
    {
        return getPosition() == 0 && getCount() != 0;
    }

    public boolean isLast()
    {
        int i = getCount();
        return i != 0 && getPosition() == i - 1;
    }

    public boolean move(int i)
    {
        return moveToPosition(getPosition() + i);
    }

    public boolean moveToFirst()
    {
        return moveToPosition(0);
    }

    public boolean moveToLast()
    {
        return moveToPosition(getCount() - 1);
    }

    public boolean moveToNext()
    {
        return moveToPosition(getPosition() + 1);
    }

    public boolean moveToPosition(int i)
    {
        return super.moveToPosition(getRealPosition(i));
    }

    public boolean moveToPrevious()
    {
        return moveToPosition(getPosition() - 1);
    }
}
