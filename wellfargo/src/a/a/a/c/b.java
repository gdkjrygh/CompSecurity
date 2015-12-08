// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a.a.a.c;

import android.content.ContentResolver;
import android.database.CharArrayBuffer;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.CursorWindow;
import android.database.DataSetObserver;
import android.net.Uri;
import android.os.Bundle;

public final class b
    implements Cursor
{

    private final CursorWindow a;
    private int b;
    private final int c;

    public b(CursorWindow cursorwindow)
    {
        a = cursorwindow;
        c = cursorwindow.getNumRows();
    }

    public void close()
    {
        throw new UnsupportedOperationException();
    }

    public void copyStringToBuffer(int i, CharArrayBuffer chararraybuffer)
    {
        throw new UnsupportedOperationException();
    }

    public void deactivate()
    {
        throw new UnsupportedOperationException();
    }

    public byte[] getBlob(int i)
    {
        return a.getBlob(b, i);
    }

    public int getColumnCount()
    {
        throw new UnsupportedOperationException();
    }

    public int getColumnIndex(String s)
    {
        throw new UnsupportedOperationException();
    }

    public int getColumnIndexOrThrow(String s)
    {
        throw new UnsupportedOperationException();
    }

    public String getColumnName(int i)
    {
        throw new UnsupportedOperationException();
    }

    public String[] getColumnNames()
    {
        throw new UnsupportedOperationException();
    }

    public int getCount()
    {
        return a.getNumRows();
    }

    public double getDouble(int i)
    {
        return a.getDouble(b, i);
    }

    public Bundle getExtras()
    {
        throw new UnsupportedOperationException();
    }

    public float getFloat(int i)
    {
        return a.getFloat(b, i);
    }

    public int getInt(int i)
    {
        return a.getInt(b, i);
    }

    public long getLong(int i)
    {
        return a.getLong(b, i);
    }

    public Uri getNotificationUri()
    {
        return null;
    }

    public int getPosition()
    {
        return b;
    }

    public short getShort(int i)
    {
        return a.getShort(b, i);
    }

    public String getString(int i)
    {
        return a.getString(b, i);
    }

    public int getType(int i)
    {
        throw new UnsupportedOperationException();
    }

    public boolean getWantsAllOnMoveCalls()
    {
        throw new UnsupportedOperationException();
    }

    public boolean isAfterLast()
    {
        throw new UnsupportedOperationException();
    }

    public boolean isBeforeFirst()
    {
        throw new UnsupportedOperationException();
    }

    public boolean isClosed()
    {
        throw new UnsupportedOperationException();
    }

    public boolean isFirst()
    {
        return b == 0;
    }

    public boolean isLast()
    {
        return b == c - 1;
    }

    public boolean isNull(int i)
    {
        return a.isNull(b, i);
    }

    public boolean move(int i)
    {
        return moveToPosition(b + i);
    }

    public boolean moveToFirst()
    {
        boolean flag = false;
        b = 0;
        if (c > 0)
        {
            flag = true;
        }
        return flag;
    }

    public boolean moveToLast()
    {
        if (c > 0)
        {
            b = c - 1;
            return true;
        } else
        {
            return false;
        }
    }

    public boolean moveToNext()
    {
        if (b < c - 1)
        {
            b = b + 1;
            return true;
        } else
        {
            return false;
        }
    }

    public boolean moveToPosition(int i)
    {
        if (i >= 0 && i < c)
        {
            b = i;
            return true;
        } else
        {
            return false;
        }
    }

    public boolean moveToPrevious()
    {
        if (b > 0)
        {
            b = b - 1;
            return true;
        } else
        {
            return false;
        }
    }

    public void registerContentObserver(ContentObserver contentobserver)
    {
        throw new UnsupportedOperationException();
    }

    public void registerDataSetObserver(DataSetObserver datasetobserver)
    {
        throw new UnsupportedOperationException();
    }

    public boolean requery()
    {
        throw new UnsupportedOperationException();
    }

    public Bundle respond(Bundle bundle)
    {
        throw new UnsupportedOperationException();
    }

    public void setNotificationUri(ContentResolver contentresolver, Uri uri)
    {
        throw new UnsupportedOperationException();
    }

    public void unregisterContentObserver(ContentObserver contentobserver)
    {
        throw new UnsupportedOperationException();
    }

    public void unregisterDataSetObserver(DataSetObserver datasetobserver)
    {
        throw new UnsupportedOperationException();
    }
}
