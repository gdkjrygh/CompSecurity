// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.messagecenter;

import android.database.Cursor;
import com.jiubang.b.a.a;

// Referenced classes of package com.go.weatherex.messagecenter:
//            a

public class k
{

    public static final String a;

    public static com.go.weatherex.messagecenter.a a(Cursor cursor)
    {
        com.go.weatherex.messagecenter.a a1 = new com.go.weatherex.messagecenter.a();
        a1.a(cursor.getLong(cursor.getColumnIndex("msg_id")));
        a1.b(cursor.getString(cursor.getColumnIndex("title")));
        a1.c(cursor.getString(cursor.getColumnIndex("desc")));
        a1.b(cursor.getInt(cursor.getColumnIndex("msg_action")));
        a1.a(cursor.getInt(cursor.getColumnIndex("msg_type")));
        a1.f(cursor.getString(cursor.getColumnIndex("msg_url")));
        a1.d(cursor.getString(cursor.getColumnIndex("msg_param")));
        a1.e(cursor.getString(cursor.getColumnIndex("msg_style")));
        a1.a(cursor.getString(cursor.getColumnIndex("published_time")));
        a1.a(com.jiubang.b.a.a.a(cursor.getInt(cursor.getColumnIndex("is_read"))));
        return a1;
    }

    static 
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("CREATE TABLE IF NOT EXISTS message_center_table");
        stringbuilder.append(" (_id INTEGER PRIMARY KEY, ");
        stringbuilder.append("msg_id LONG, ");
        stringbuilder.append("title TEXT, ");
        stringbuilder.append("desc TEXT, ");
        stringbuilder.append("msg_action INTEGER, ");
        stringbuilder.append("msg_param TEXT, ");
        stringbuilder.append("msg_type INTEGER, ");
        stringbuilder.append("msg_url TEXT, ");
        stringbuilder.append("msg_style TEXT, ");
        stringbuilder.append("published_time TEXT, ");
        stringbuilder.append("is_read INTEGER)");
        a = stringbuilder.toString();
    }
}
