// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CursorAdapter;
import android.widget.Filter;
import android.widget.FilterQueryProvider;
import com.ubercab.client.core.contacts.Contact;
import com.ubercab.client.feature.faresplit.master.FareSplitContactViewHolder;
import com.ubercab.rider.realtime.model.FareSplit;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public final class ebq extends CursorAdapter
    implements FilterQueryProvider
{

    private static final String a[] = {
        "_id", "data1", "data2", "data3", "display_name", "photo_thumb_uri"
    };
    private final Context b;
    private final cgh c;
    private dac d;
    private Collection e;
    private Collection f;
    private boolean g;
    private boolean h;
    private int i;

    public ebq(Context context, cgh cgh, int j)
    {
        super(context, null, false);
        g = false;
        h = false;
        e = new HashSet();
        f = new HashSet();
        b = context;
        c = cgh;
        i = j;
        d = new dac(context);
        setFilterQueryProvider(this);
        getFilter().filter(null);
    }

    public final void a()
    {
        getFilter().filter(null);
    }

    public final void a(FareSplit faresplit)
    {
        f = dty.a(faresplit);
        notifyDataSetChanged();
    }

    public final void a(Collection collection)
    {
        HashSet hashset = new HashSet();
        for (collection = collection.iterator(); collection.hasNext(); hashset.add(((com.ubercab.client.core.ui.ChipEditText.Chip)collection.next()).c())) { }
        e = hashset;
        notifyDataSetChanged();
    }

    public final void bindView(View view, Context context, Cursor cursor)
    {
        context = cursor.getString(cursor.getColumnIndex("data1"));
        String s = duj.c(context, null);
        boolean flag;
        if (f.contains(s) || e.contains(context))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ((FareSplitContactViewHolder)view.getTag()).a(Contact.a(cursor), flag, g, h);
    }

    public final CharSequence convertToString(Cursor cursor)
    {
        return cursor.getString(cursor.getColumnIndex("data1"));
    }

    public final boolean isEnabled(int j)
    {
        Object obj = (Cursor)getItem(j);
        obj = duj.c(((Cursor) (obj)).getString(((Cursor) (obj)).getColumnIndex("data1")), null);
        return !f.contains(obj);
    }

    public final View newView(Context context, Cursor cursor, ViewGroup viewgroup)
    {
        context = d.a(viewgroup);
        context.setTag(new FareSplitContactViewHolder(context, c, h));
        return context;
    }

    public final Cursor runQuery(CharSequence charsequence)
    {
        try
        {
            g = true;
            h = true;
            Uri uri = android.provider.ContactsContract.CommonDataKinds.Phone.CONTENT_URI;
            if (!TextUtils.isEmpty(charsequence))
            {
                uri = android.provider.ContactsContract.CommonDataKinds.Phone.CONTENT_FILTER_URI.buildUpon().appendPath(charsequence.toString()).build();
            }
            charsequence = b.getContentResolver().query(uri, a, null, null, "display_name, data1");
        }
        // Misplaced declaration of an exception variable
        catch (CharSequence charsequence)
        {
            g = false;
            h = false;
            if (i == 1)
            {
                charsequence = b.getString(0x7f0700af).replaceAll("\n", " ");
                MatrixCursor matrixcursor = new MatrixCursor(a);
                matrixcursor.addRow(new Object[] {
                    "0", b.getString(0x7f0703e4), Integer.valueOf(0), "", charsequence, ""
                });
                matrixcursor.moveToFirst();
                return matrixcursor;
            } else
            {
                return null;
            }
        }
        return charsequence;
    }

}
