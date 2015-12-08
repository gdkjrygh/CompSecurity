// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.messagecenter;

import android.content.ContentResolver;
import android.database.Cursor;
import java.util.Vector;

// Referenced classes of package com.go.weatherex.messagecenter:
//            k, o

class j extends com.jiubang.core.c.j
{

    public j(ContentResolver contentresolver)
    {
        super(contentresolver);
    }

    protected void a(int i, Object obj, Cursor cursor)
    {
        super.a(i, obj, cursor);
        if (i != 1) goto _L2; else goto _L1
_L1:
        Vector vector;
        vector = new Vector();
        if (cursor == null || cursor.getCount() == 0)
        {
            break MISSING_BLOCK_LABEL_64;
        }
        cursor.moveToFirst();
        boolean flag;
        do
        {
            vector.add(k.a(cursor));
            flag = cursor.moveToNext();
        } while (flag);
_L4:
        if (cursor != null)
        {
            cursor.close();
        }
        ((o)obj).a(vector);
_L2:
        return;
        Exception exception;
        exception;
        exception.printStackTrace();
        if (true) goto _L4; else goto _L3
_L3:
    }
}
