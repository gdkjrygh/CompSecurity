// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.text.TextUtils;
import android.view.View;
import com.ubercab.client.core.contacts.Contact;
import com.ubercab.client.core.contacts.ContactViewHolder;
import java.util.ArrayList;
import java.util.List;

public final class daf extends dad
{

    private final cgh g;

    public daf(Context context, cgh cgh)
    {
        super(context, true);
        g = cgh;
    }

    protected final ContactViewHolder a(View view)
    {
        return new ContactViewHolder(view, g, a, false, true);
    }

    protected final String a(Cursor cursor)
    {
        return cursor.getString(cursor.getColumnIndex("data1"));
    }

    protected final Contact b(Cursor cursor)
    {
        return Contact.b(cursor);
    }

    public final Cursor runQuery(CharSequence charsequence)
    {
        android.net.Uri uri = android.provider.ContactsContract.CommonDataKinds.Email.CONTENT_URI;
        StringBuilder stringbuilder = new StringBuilder();
        ArrayList arraylist = new ArrayList();
        stringbuilder.append("data1 not like ?");
        arraylist.add("%craigslist.org%");
        for (int i = 0; i < 10; i++)
        {
            stringbuilder.append(" and display_name not like ?");
            arraylist.add((new StringBuilder()).append(String.valueOf(i)).append("%").toString());
        }

        if (charsequence == null)
        {
            charsequence = null;
        } else
        {
            charsequence = charsequence.toString().trim();
        }
        if (!TextUtils.isEmpty(charsequence))
        {
            charsequence = (new StringBuilder()).append(charsequence).append("%").toString();
            stringbuilder.append(" and (display_name like ? or display_name like ? or data1 like ?)");
            arraylist.add(charsequence);
            arraylist.add((new StringBuilder("% ")).append(charsequence).toString());
            arraylist.add(charsequence);
        }
        return b.getContentResolver().query(uri, Contact.a, stringbuilder.toString(), (String[])arraylist.toArray(new String[arraylist.size()]), "display_name, data1");
    }
}
