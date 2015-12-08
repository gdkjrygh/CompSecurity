// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.urbanairship.richpush;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import com.urbanairship.UrbanAirshipProvider;
import com.urbanairship.UrbanAirshipResolver;
import com.urbanairship.util.UAStringUtil;
import java.util.Collection;
import java.util.Set;

class RichPushResolver extends UrbanAirshipResolver
{

    private static final String FALSE_VALUE = "0";
    private static final String NEWEST_FIRST = "timestamp DESC";
    private static final String TRUE_VALUE = "1";
    private static final String WHERE_CLAUSE_CHANGED = "unread <> unread_orig";
    private static final String WHERE_CLAUSE_MESSAGE_ID = "message_id = ?";
    private static final String WHERE_CLAUSE_READ = "unread = ?";

    public RichPushResolver(Context context)
    {
        super(context);
    }

    private Uri appendMessageIdToUri(String s)
    {
        return Uri.withAppendedPath(UrbanAirshipProvider.getRichPushContentUri(), s);
    }

    private Uri appendMessageIdsToUri(Collection collection)
    {
        return Uri.withAppendedPath(UrbanAirshipProvider.getRichPushContentUri(), UAStringUtil.join(collection, "|"));
    }

    int deleteMessage(String s)
    {
        return delete(appendMessageIdToUri(s), "message_id = ?", new String[] {
            s
        });
    }

    int deleteMessages(Set set)
    {
        int i = set.size();
        return delete(appendMessageIdsToUri(set), (new StringBuilder()).append("message_id IN ( ").append(UAStringUtil.repeat("?", i, ", ")).append(" )").toString(), (String[])set.toArray(new String[i]));
    }

    Cursor getAllMessages()
    {
        return query(UrbanAirshipProvider.getRichPushContentUri(), null, null, null, "timestamp DESC");
    }

    Cursor getDeletedMessages()
    {
        return query(UrbanAirshipProvider.getRichPushContentUri(), null, "deleted = ?", new String[] {
            "1"
        }, null);
    }

    Cursor getMessage(String s)
    {
        return query(UrbanAirshipProvider.getRichPushContentUri(), null, "message_id = ?", new String[] {
            s
        }, null);
    }

    Cursor getReadMessages()
    {
        return query(UrbanAirshipProvider.getRichPushContentUri(), null, "unread = ?", new String[] {
            "0"
        }, "timestamp DESC");
    }

    Cursor getReadUpdatedMessages()
    {
        return query(UrbanAirshipProvider.getRichPushContentUri(), null, "unread = ? AND unread <> unread_orig", new String[] {
            "0"
        }, null);
    }

    Cursor getUnreadMessages()
    {
        return query(UrbanAirshipProvider.getRichPushContentUri(), null, "unread = ?", new String[] {
            "1"
        }, "timestamp DESC");
    }

    int insertMessages(ContentValues acontentvalues[])
    {
        return bulkInsert(UrbanAirshipProvider.getRichPushContentUri(), acontentvalues);
    }

    int markMessageRead(String s)
    {
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("unread", Boolean.valueOf(false));
        return updateMessage(s, contentvalues);
    }

    int markMessagesDeleted(Set set)
    {
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("deleted", Boolean.valueOf(true));
        return updateMessages(set, contentvalues);
    }

    int markMessagesRead(Set set)
    {
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("unread", Boolean.valueOf(false));
        return updateMessages(set, contentvalues);
    }

    int markMessagesUnread(Set set)
    {
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("unread", Boolean.valueOf(true));
        return updateMessages(set, contentvalues);
    }

    int updateMessage(String s, ContentValues contentvalues)
    {
        return update(appendMessageIdToUri(s), contentvalues, "message_id = ?", new String[] {
            s
        });
    }

    int updateMessages(Set set, ContentValues contentvalues)
    {
        int i = set.size();
        return update(appendMessageIdsToUri(set), contentvalues, (new StringBuilder()).append("message_id IN ( ").append(UAStringUtil.repeat("?", i, ", ")).append(" )").toString(), (String[])set.toArray(new String[i]));
    }
}
