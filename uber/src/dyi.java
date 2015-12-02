// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import com.ubercab.rider.realtime.model.Fragment;
import com.ubercab.rider.realtime.object.ObjectContact;
import com.ubercab.rider.realtime.object.ObjectFragment;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class dyi
{

    static final String a[] = {
        "_id", "data1", "mimetype", "contact_id"
    };

    public dyi()
    {
    }

    private static Cursor a(Context context)
    {
        return context.getContentResolver().query(android.provider.ContactsContract.Data.CONTENT_URI, a, "data1 NOT LIKE '' AND mimetype IN ( ? , ? ) AND _id >= ?", new String[] {
            "vnd.android.cursor.item/phone_v2", "vnd.android.cursor.item/email_v2", "0"
        }, "_id ASC");
    }

    private static Fragment a(Cursor cursor)
    {
        String s;
        byte byte0;
        s = cursor.getString(cursor.getColumnIndex("mimetype"));
        cursor = cursor.getString(cursor.getColumnIndex("data1"));
        byte0 = -1;
        s.hashCode();
        JVM INSTR lookupswitch 2: default 64
    //                   -1569536764: 104
    //                   684173810: 90;
           goto _L1 _L2 _L3
_L1:
        byte0;
        JVM INSTR tableswitch 0 1: default 88
    //                   0 118
    //                   1 150;
           goto _L4 _L5 _L6
_L4:
        return null;
_L3:
        if (s.equals("vnd.android.cursor.item/phone_v2"))
        {
            byte0 = 0;
        }
          goto _L1
_L2:
        if (s.equals("vnd.android.cursor.item/email_v2"))
        {
            byte0 = 1;
        }
          goto _L1
_L5:
        if (!dyj.b(cursor)) goto _L4; else goto _L7
_L7:
        cursor = duj.c(cursor, null);
        s = "MOBILE";
_L9:
        ObjectFragment objectfragment = ObjectFragment.create();
        objectfragment.setText(cursor);
        objectfragment.setType(s);
        return objectfragment;
_L6:
        if (!dyj.a(cursor)) goto _L4; else goto _L8
_L8:
        cursor = cursor.toLowerCase();
        s = "EMAIL";
          goto _L9
    }

    public static dym a(Context context, int i)
    {
        Object obj = a(context);
        context = ((Context) (obj));
        Object obj1 = a(((Cursor) (obj)), i);
        dtx.a(((Cursor) (obj)));
        return ((dym) (obj1));
        Object obj2;
        obj2;
        obj = null;
_L4:
        context = ((Context) (obj));
        ijg.d("Error getting contacts record from db", new Object[] {
            obj2
        });
        dtx.a(((Cursor) (obj)));
        return null;
        context;
        obj2 = null;
        obj = context;
_L2:
        dtx.a(((Cursor) (obj2)));
        throw obj;
        obj;
        obj2 = context;
        if (true) goto _L2; else goto _L1
_L1:
        obj2;
        if (true) goto _L4; else goto _L3
_L3:
    }

    private static dym a(Cursor cursor, int i)
    {
        if (cursor == null)
        {
            return null;
        }
        HashMap hashmap = new HashMap();
        if (!cursor.moveToFirst())
        {
            return dym.a(new ArrayList(), 0, 0);
        }
        int k = 0;
        int j = 0;
        do
        {
            int i1 = k + 1;
            Fragment fragment = a(cursor);
            String s = cursor.getString(cursor.getColumnIndex("contact_id"));
            int l;
            boolean flag;
            if (j < i)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            l = j;
            if (a(((Map) (hashmap)), s, fragment, flag))
            {
                l = j + 1;
            }
            k = i1;
            j = l;
        } while (cursor.moveToNext());
        return dym.a(new ArrayList(hashmap.values()), i1, l);
    }

    private static boolean a(Map map, String s, Fragment fragment, boolean flag)
    {
        if (s == null || fragment == null)
        {
            return false;
        }
        ObjectContact objectcontact1 = (ObjectContact)map.get(s);
        ObjectContact objectcontact = objectcontact1;
        if (objectcontact1 == null)
        {
            if (!flag)
            {
                return true;
            }
            objectcontact = ObjectContact.create();
            objectcontact.setFragments(new ArrayList());
            map.put(s, objectcontact);
        }
        map = objectcontact.getFragments();
        if (map != null && !map.contains(fragment))
        {
            if (flag)
            {
                map.add(fragment);
            }
            return true;
        } else
        {
            return false;
        }
    }

}
