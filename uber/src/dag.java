// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import com.ubercab.client.core.contacts.Contact;
import com.ubercab.client.core.contacts.ContactViewHolder;

public class dag extends dad
{

    private final cgh g;

    public dag(Context context, cgh cgh, boolean flag)
    {
        super(context, flag);
        g = cgh;
    }

    protected final ContactViewHolder a(View view)
    {
        return new ContactViewHolder(view, g, a, true, false);
    }

    protected final String a(Cursor cursor)
    {
        return cursor.getString(cursor.getColumnIndex("data1"));
    }

    protected final Contact b(Cursor cursor)
    {
        return Contact.a(cursor);
    }

    public Cursor runQuery(CharSequence charsequence)
    {
        Uri uri = android.provider.ContactsContract.CommonDataKinds.Phone.CONTENT_URI;
        if (!TextUtils.isEmpty(charsequence))
        {
            uri = android.provider.ContactsContract.CommonDataKinds.Phone.CONTENT_FILTER_URI.buildUpon().appendPath(charsequence.toString()).build();
        }
        return b.getContentResolver().query(uri, Contact.b, null, null, "display_name, data1");
    }
}
