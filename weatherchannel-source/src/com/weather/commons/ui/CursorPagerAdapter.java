// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.ui;

import android.app.Fragment;
import android.app.FragmentManager;
import android.database.Cursor;
import android.os.Bundle;
import android.support.v13.app.FragmentStatePagerAdapter;
import com.google.common.base.Preconditions;
import com.google.common.base.Throwables;
import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class CursorPagerAdapter extends FragmentStatePagerAdapter
{

    private Cursor cursor;
    private final Class fragmentClass;
    private final List projection;

    public CursorPagerAdapter(FragmentManager fragmentmanager, Class class1, List list, Cursor cursor1)
    {
        super((FragmentManager)Preconditions.checkNotNull(fragmentmanager));
        fragmentClass = (Class)Preconditions.checkNotNull(class1);
        projection = ImmutableList.copyOf((Collection)Preconditions.checkNotNull(list));
        cursor = cursor1;
    }

    public int getCount()
    {
        if (cursor == null)
        {
            return 0;
        } else
        {
            return cursor.getCount();
        }
    }

    protected Cursor getCursor()
    {
        return cursor;
    }

    public Fragment getItem(int i)
    {
        if (cursor == null || i >= cursor.getCount())
        {
            return null;
        }
        cursor.moveToPosition(i);
        Object obj;
        Bundle bundle;
        try
        {
            obj = (Fragment)fragmentClass.newInstance();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw Throwables.propagate(((Throwable) (obj)));
        }
        bundle = new Bundle();
        i = 0;
        for (Iterator iterator = projection.iterator(); iterator.hasNext();)
        {
            bundle.putString((String)iterator.next(), cursor.getString(i));
            i++;
        }

        ((Fragment) (obj)).setArguments(bundle);
        return ((Fragment) (obj));
    }

    public void swapCursor(Cursor cursor1)
    {
        if (cursor == cursor1)
        {
            return;
        }
        if (cursor != null)
        {
            cursor.close();
        }
        cursor = cursor1;
        notifyDataSetChanged();
    }
}
