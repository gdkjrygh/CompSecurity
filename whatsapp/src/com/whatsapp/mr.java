// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.database.Cursor;
import android.database.CursorWrapper;
import android.database.sqlite.SQLiteDatabaseCorruptException;

// Referenced classes of package com.whatsapp:
//            App, aoz, r3

class mr extends CursorWrapper
{

    private r3 a;

    public mr(Cursor cursor, r3 r3_1)
    {
        super(cursor);
        a = r3_1;
    }

    public void deactivate()
    {
        super.deactivate();
    }

    public int getCount()
    {
        int i;
        try
        {
            i = super.getCount();
        }
        catch (SQLiteDatabaseCorruptException sqlitedatabasecorruptexception)
        {
            App.ah.r();
            throw sqlitedatabasecorruptexception;
        }
        return i;
    }

    public boolean requery()
    {
        boolean flag;
        try
        {
            if (a != null)
            {
                a.b();
            }
        }
        catch (SQLiteDatabaseCorruptException sqlitedatabasecorruptexception)
        {
            throw sqlitedatabasecorruptexception;
        }
        flag = super.requery();
        try
        {
            if (a != null)
            {
                a.a();
            }
        }
        catch (SQLiteDatabaseCorruptException sqlitedatabasecorruptexception1)
        {
            throw sqlitedatabasecorruptexception1;
        }
        return Boolean.valueOf(flag).booleanValue();
    }
}
