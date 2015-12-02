// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.support.v4.content.AsyncTaskLoader;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import java.util.Iterator;
import java.util.Set;

public final class flm extends AsyncTaskLoader
{

    private final ContentResolver a;

    public flm(Context context)
    {
        super(context);
        a = context.getContentResolver();
    }

    private flk a()
    {
        flk flk1 = new flk();
        try
        {
            a(flk1);
            b(flk1);
            c(flk1);
            if (!flk1.e().isEmpty() && flk1.d().isEmpty())
            {
                for (gkn gkn = gke.a(flk1.e()).a(); gkn.hasNext(); a((String)gkn.next(), flk1)) { }
            }
        }
        catch (SecurityException securityexception) { }
        return flk1;
    }

    private static String a(String s)
    {
        String s1;
        if (s == null)
        {
            s1 = null;
        } else
        {
            if (s.trim().length() == 0)
            {
                return null;
            }
            if (s.contains("@"))
            {
                return null;
            }
            s1 = s;
            if (TextUtils.isDigitsOnly(s))
            {
                return null;
            }
        }
        return s1;
    }

    private static void a(Cursor cursor, flk flk1)
    {
_L8:
        String s;
        byte byte0;
        if (!cursor.moveToNext())
        {
            break; /* Loop/switch isn't completed */
        }
        s = cursor.getString(cursor.getColumnIndex("mimetype"));
        byte0 = -1;
        s.hashCode();
        JVM INSTR lookupswitch 4: default 72
    //                   -1569536764: 128
    //                   -1079224304: 143
    //                   684173810: 158
    //                   1828520899: 173;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        break; /* Loop/switch isn't completed */
_L5:
        break MISSING_BLOCK_LABEL_173;
_L6:
        switch (byte0)
        {
        case 0: // '\0'
            flk1.a(cursor.getString(cursor.getColumnIndex("data1")));
            break;

        case 1: // '\001'
            flk1.a(a(cursor.getString(cursor.getColumnIndex("data2"))), a(cursor.getString(cursor.getColumnIndex("data3"))));
            break;

        case 2: // '\002'
            flk1.b(cursor.getString(cursor.getColumnIndex("data1")));
            break;

        case 3: // '\003'
            String s1 = cursor.getString(cursor.getColumnIndex("data2"));
            String s2 = cursor.getString(cursor.getColumnIndex("account_name"));
            if (s1.equals("com.google"))
            {
                flk1.a(s2);
            }
            break;
        }
        continue; /* Loop/switch isn't completed */
_L2:
        if (s.equals("vnd.android.cursor.item/email_v2"))
        {
            byte0 = 0;
        }
          goto _L6
_L3:
        if (s.equals("vnd.android.cursor.item/name"))
        {
            byte0 = 1;
        }
          goto _L6
_L4:
        if (s.equals("vnd.android.cursor.item/phone_v2"))
        {
            byte0 = 2;
        }
          goto _L6
        if (s.equals("vnd.android.cursor.item/identity"))
        {
            byte0 = 3;
        }
          goto _L6
        if (true) goto _L8; else goto _L7
_L7:
    }

    private void a(flk flk1)
    {
        TelephonyManager telephonymanager = (TelephonyManager)getContext().getSystemService("phone");
        if (!TextUtils.isEmpty(telephonymanager.getLine1Number()))
        {
            flk1.b(duj.b(telephonymanager.getLine1Number(), telephonymanager.getSimCountryIso()), telephonymanager.getSimCountryIso());
        }
    }

    private void a(String s, flk flk1)
    {
        Cursor cursor;
        Cursor cursor1;
        cursor = null;
        cursor1 = null;
        s = Uri.withAppendedPath(android.provider.ContactsContract.Contacts.CONTENT_FILTER_URI, s);
        s = a.query(s, null, null, null, null);
        if (!s.moveToFirst()) goto _L2; else goto _L1
_L1:
        int i = s.getInt(s.getColumnIndex("_id"));
_L9:
        dtx.a(s);
_L4:
        if (i < 0)
        {
            break MISSING_BLOCK_LABEL_108;
        }
        s = cursor1;
        try
        {
            cursor1 = a.query(android.provider.ContactsContract.Data.CONTENT_URI, null, "contact_id = ? ", new String[] {
                String.valueOf(i)
            }, null);
        }
        // Misplaced declaration of an exception variable
        catch (flk flk1)
        {
            dtx.a(s);
            return;
        }
        finally
        {
            dtx.a(cursor);
        }
        s = cursor1;
        cursor = cursor1;
        a(cursor1, flk1);
        dtx.a(cursor1);
        return;
        s;
        s = null;
_L7:
        dtx.a(s);
        i = -1;
        if (true) goto _L4; else goto _L3
_L3:
        flk1;
        s = null;
_L6:
        dtx.a(s);
        throw flk1;
        throw s;
        flk1;
        if (true) goto _L6; else goto _L5
_L5:
        Exception exception;
        exception;
          goto _L7
_L2:
        i = -1;
        if (true) goto _L9; else goto _L8
_L8:
    }

    private void b(flk flk1)
    {
        Account aaccount[] = ((AccountManager)getContext().getSystemService("account")).getAccountsByType("com.google");
        int j = aaccount.length;
        for (int i = 0; i < j; i++)
        {
            flk1.a(aaccount[i].name);
        }

    }

    private void c(flk flk1)
    {
        Object obj = Uri.withAppendedPath(android.provider.ContactsContract.Profile.CONTENT_URI, "data");
        Cursor cursor = a.query(((Uri) (obj)), null, null, null, "is_primary DESC");
        obj = cursor;
        a(cursor, flk1);
        dtx.a(cursor);
        return;
        flk1;
        cursor = null;
_L4:
        obj = cursor;
        ijg.d("Error loading profile", new Object[] {
            flk1
        });
        dtx.a(cursor);
        return;
        flk1;
        obj = null;
_L2:
        dtx.a(((Cursor) (obj)));
        throw flk1;
        flk1;
        if (true) goto _L2; else goto _L1
_L1:
        flk1;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final Object loadInBackground()
    {
        return a();
    }

    protected final void onStartLoading()
    {
        super.onStartLoading();
        forceLoad();
    }
}
