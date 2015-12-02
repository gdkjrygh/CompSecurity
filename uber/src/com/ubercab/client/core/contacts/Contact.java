// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.contacts;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Patterns;
import com.ubercab.client.core.model.Invite;
import dtx;
import duj;
import gkk;
import ijg;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Contact
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        private static Contact a(Parcel parcel)
        {
            return new Contact(parcel, (byte)0);
        }

        private static Contact[] a(int i)
        {
            return new Contact[i];
        }

        public final Object createFromParcel(Parcel parcel)
        {
            return a(parcel);
        }

        public final Object[] newArray(int i)
        {
            return a(i);
        }

    };
    public static final String a[] = {
        "_id", "mimetype", "data1", "data3", "data2", "display_name", "photo_thumb_uri"
    };
    public static final String b[] = {
        "_id", "data1", "data2", "data3", "display_name", "photo_thumb_uri"
    };
    private String c;
    private String d;
    private String e;
    private String f;
    private Uri g;
    private int h;

    public Contact()
    {
    }

    private Contact(Parcel parcel)
    {
        h = parcel.readInt();
        e = parcel.readString();
        f = parcel.readString();
        g = (Uri)parcel.readParcelable(android/net/Uri.getClassLoader());
        c = parcel.readString();
        d = parcel.readString();
    }

    Contact(Parcel parcel, byte byte0)
    {
        this(parcel);
    }

    public static Contact a(Context context, String s)
    {
        Object obj;
        if (context == null)
        {
            return null;
        }
        obj = "data1 = ?";
        String as[] = new String[1];
        as[0] = s;
        if (android.os.Build.VERSION.SDK_INT < 16)
        {
            break MISSING_BLOCK_LABEL_64;
        }
        obj = (new StringBuilder()).append("data1 = ?").append(" OR data4 = ?").toString();
        as = new String[2];
        as[0] = s;
        as[1] = duj.c(s, null);
        obj = context.getContentResolver().query(android.provider.ContactsContract.CommonDataKinds.Phone.CONTENT_URI, b, ((String) (obj)), as, null);
        context = ((Context) (obj));
        int i = ((Cursor) (obj)).getCount();
        if (i == 0)
        {
            dtx.a(((Cursor) (obj)));
            return null;
        }
        context = ((Context) (obj));
        ((Cursor) (obj)).moveToFirst();
        context = ((Context) (obj));
        String s1 = ((Cursor) (obj)).getString(((Cursor) (obj)).getColumnIndex("data1"));
        context = ((Context) (obj));
        String s2 = ((Cursor) (obj)).getString(((Cursor) (obj)).getColumnIndex("display_name"));
        context = ((Context) (obj));
        String s3 = ((Cursor) (obj)).getString(((Cursor) (obj)).getColumnIndex("photo_thumb_uri"));
        context = ((Context) (obj));
        Contact contact = new Contact();
        context = ((Context) (obj));
        contact.f = s1;
        context = ((Context) (obj));
        contact.c = s2;
        context = ((Context) (obj));
        if (TextUtils.isEmpty(s3))
        {
            break MISSING_BLOCK_LABEL_214;
        }
        context = ((Context) (obj));
        contact.g = Uri.parse(s3);
        dtx.a(((Cursor) (obj)));
        return contact;
        Exception exception;
        exception;
        obj = null;
_L4:
        context = ((Context) (obj));
        ijg.d(exception, "Could not find contact with phone number %s", new Object[] {
            s
        });
        dtx.a(((Cursor) (obj)));
        return null;
        s;
        context = null;
_L2:
        dtx.a(context);
        throw s;
        s;
        if (true) goto _L2; else goto _L1
_L1:
        exception;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static Contact a(Cursor cursor)
    {
        if (cursor == null)
        {
            return null;
        } else
        {
            Contact contact = new Contact();
            contact.f = cursor.getString(cursor.getColumnIndex("data1"));
            contact.h = cursor.getInt(cursor.getColumnIndex("data2"));
            contact.e = cursor.getString(cursor.getColumnIndex("data3"));
            contact.c = cursor.getString(cursor.getColumnIndex("display_name"));
            a(contact, cursor);
            return contact;
        }
    }

    public static String a(Contact contact, String s)
    {
        contact.c = s;
        return s;
    }

    public static List a(Context context, List list)
    {
        Object obj;
        LinkedHashMap linkedhashmap;
        obj = null;
        linkedhashmap = new LinkedHashMap(list.size());
        Invite invite;
        for (list = list.iterator(); list.hasNext(); linkedhashmap.put(invite.getEmail(), invite))
        {
            invite = (Invite)list.next();
        }

        list = new HashMap();
        StringBuilder stringbuilder = new StringBuilder("data1=?");
        int i = 0;
_L2:
        if (i >= linkedhashmap.size())
        {
            break; /* Loop/switch isn't completed */
        }
        stringbuilder.append(" OR data1=?");
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        context = context.getContentResolver().query(android.provider.ContactsContract.CommonDataKinds.Email.CONTENT_URI, a, stringbuilder.toString(), (String[])linkedhashmap.keySet().toArray(new String[linkedhashmap.size()]), null);
        if (context.getCount() != 0)
        {
            break MISSING_BLOCK_LABEL_178;
        }
        linkedhashmap.clear();
        obj = Collections.emptyList();
        dtx.a(context);
        return ((List) (obj));
        for (; context.moveToNext(); list.put(((Contact) (obj)).d(), obj))
        {
            obj = b(context);
        }

          goto _L3
        obj;
_L9:
        dtx.a(context);
_L5:
        return a(((Map) (list)), ((Map) (linkedhashmap)));
_L3:
        dtx.a(context);
        if (true) goto _L5; else goto _L4
_L4:
        context;
        list = ((List) (obj));
_L7:
        dtx.a(list);
        throw context;
        Exception exception;
        exception;
        list = context;
        context = exception;
        if (true) goto _L7; else goto _L6
_L6:
        context;
        context = null;
        if (true) goto _L9; else goto _L8
_L8:
    }

    private static List a(Map map, Map map1)
    {
        for (Iterator iterator = map1.keySet().iterator(); iterator.hasNext();)
        {
            Object obj = (String)iterator.next();
            Contact contact = (Contact)map.get(obj);
            if (contact == null)
            {
                iterator.remove();
            } else
            {
                obj = (Invite)map1.get(obj);
                ((Invite) (obj)).setFullName(contact.a());
                ((Invite) (obj)).setAvatarUrl(contact.g());
            }
        }

        return gkk.a(map1.values());
    }

    private static void a(Contact contact, Cursor cursor)
    {
        contact.c = cursor.getString(cursor.getColumnIndex("display_name"));
        cursor = cursor.getString(cursor.getColumnIndex("photo_thumb_uri"));
        if (!TextUtils.isEmpty(cursor))
        {
            contact.g = Uri.parse(cursor);
        }
    }

    public static boolean a(String s)
    {
        return Patterns.EMAIL_ADDRESS.matcher(s).matches() || Patterns.PHONE.matcher(s).matches();
    }

    public static Contact b(Context context, String s)
    {
        Context context1;
        context1 = null;
        if (context == null)
        {
            return null;
        }
        context = context.getContentResolver().query(android.provider.ContactsContract.CommonDataKinds.Email.CONTENT_URI, a, "data1 = ?", new String[] {
            s
        }, "photo_thumb_uri DESC");
        context1 = context;
        context = context1;
        int i = context1.getCount();
        if (i == 0)
        {
            dtx.a(context1);
            return null;
        }
        context = context1;
        context1.moveToFirst();
        context = context1;
        Contact contact = b(((Cursor) (context1)));
        dtx.a(context1);
        return contact;
        Exception exception1;
        exception1;
        context1 = null;
_L4:
        context = context1;
        ijg.c(exception1, "Could not find contact with email %s", new Object[] {
            s
        });
        dtx.a(context1);
        return null;
        context;
        s = context1;
_L2:
        dtx.a(s);
        throw context;
        Exception exception;
        exception;
        s = context;
        context = exception;
        if (true) goto _L2; else goto _L1
_L1:
        exception1;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static Contact b(Cursor cursor)
    {
        if (cursor == null)
        {
            return null;
        } else
        {
            Contact contact = new Contact();
            contact.d = cursor.getString(cursor.getColumnIndex("data1"));
            contact.h = cursor.getInt(cursor.getColumnIndex("data2"));
            contact.e = cursor.getString(cursor.getColumnIndex("data3"));
            a(contact, cursor);
            return contact;
        }
    }

    public static String b(Contact contact, String s)
    {
        contact.d = s;
        return s;
    }

    public static String c(Contact contact, String s)
    {
        contact.f = s;
        return s;
    }

    private String e()
    {
        return e;
    }

    private int f()
    {
        return h;
    }

    private String g()
    {
        if (g == null)
        {
            return null;
        } else
        {
            return g.toString();
        }
    }

    public final String a()
    {
        return c;
    }

    public final String a(Context context)
    {
        if (f() == 0)
        {
            return e();
        }
        if (context == null)
        {
            return "";
        } else
        {
            return context.getString(android.provider.ContactsContract.CommonDataKinds.Phone.getTypeLabelResource(f()));
        }
    }

    public final String b()
    {
        return f;
    }

    public final Uri c()
    {
        return g;
    }

    public final String d()
    {
        return d;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (Contact)obj;
            if (h != ((Contact) (obj)).h)
            {
                return false;
            }
            if (d == null ? ((Contact) (obj)).d != null : !d.equals(((Contact) (obj)).d))
            {
                return false;
            }
            if (f == null ? ((Contact) (obj)).f != null : !f.equals(((Contact) (obj)).f))
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        int j = 0;
        int k = h;
        int i;
        if (f != null)
        {
            i = f.hashCode();
        } else
        {
            i = 0;
        }
        if (d != null)
        {
            j = d.hashCode();
        }
        return (i + k * 31) * 31 + j;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeInt(h);
        parcel.writeString(e);
        parcel.writeString(f);
        parcel.writeParcelable(g, i);
        parcel.writeString(c);
        parcel.writeString(d);
    }

}
