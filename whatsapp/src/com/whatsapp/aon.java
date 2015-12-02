// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.ContentResolver;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.os.AsyncTask;
import android.telephony.PhoneNumberUtils;
import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.whatsapp:
//            App, ContactInfo, og, vk, 
//            dh, k, ov, pb, 
//            lb, t, c6, a80, 
//            mk, k4, abn

class aon extends AsyncTask
{

    private static final String z[];
    final ContactInfo a;

    aon(ContactInfo contactinfo)
    {
        a = contactinfo;
        super();
    }

    private void a()
    {
        int i1 = App.am;
        Object obj = a.getContentResolver();
        Object obj1 = android.provider.ContactsContract.Data.CONTENT_URI;
        String s = z[10];
        String s1 = z[2];
        String s2 = z[5];
        long l1 = ContactInfo.a(a).s();
        obj1 = ((ContentResolver) (obj)).query(((android.net.Uri) (obj1)), new String[] {
            s, s1
        }, s2, new String[] {
            String.valueOf(l1)
        }, null);
        if (obj1 != null)
        {
            Object obj2;
            ArrayList arraylist;
            Object obj4;
            String s3;
            String s4;
            String s5;
            String s6;
            String s7;
            int i;
            int j;
            int l;
            long l2;
            if (((Cursor) (obj1)).moveToNext())
            {
                obj = ((Cursor) (obj1)).getString(((Cursor) (obj1)).getColumnIndex(z[9]));
            } else
            {
                obj = null;
            }
            ((Cursor) (obj1)).close();
            obj2 = null;
            obj1 = obj;
            obj = obj2;
        } else
        {
            Object obj3 = null;
            obj = obj1;
            obj1 = obj3;
        }
        arraylist = new ArrayList();
        arraylist.add(new vk(a, ContactInfo.a(a)));
        if (obj1 != null)
        {
            obj = a.getContentResolver();
            obj2 = android.provider.ContactsContract.Data.CONTENT_URI;
            obj4 = z[7];
            s3 = z[1];
            s4 = z[15];
            s5 = z[11];
            s6 = z[3];
            s7 = z[4];
            obj = ((ContentResolver) (obj)).query(((android.net.Uri) (obj2)), new String[] {
                obj4, s3, s4, s5, s6
            }, s7, new String[] {
                obj1
            }, null);
        }
        if (obj == null) goto _L2; else goto _L1
_L1:
        i = 1;
_L6:
        if (!((Cursor) (obj)).moveToNext()) goto _L4; else goto _L3
_L3:
        obj4 = ((Cursor) (obj)).getString(((Cursor) (obj)).getColumnIndex(z[8]));
        if (obj4 == null && i1 == 0) goto _L6; else goto _L5
_L5:
        if (isCancelled() && i1 == 0) goto _L4; else goto _L7
_L7:
label0:
        {
            l2 = ((Cursor) (obj)).getLong(((Cursor) (obj)).getColumnIndex(z[6]));
            j = ((Cursor) (obj)).getInt(((Cursor) (obj)).getColumnIndex(z[13]));
            obj2 = ((Cursor) (obj)).getString(((Cursor) (obj)).getColumnIndex(z[12]));
            if (j == 0)
            {
                obj1 = obj2;
                if (obj2 != null)
                {
                    break label0;
                }
            }
            obj1 = a.getResources().getString(android.provider.ContactsContract.CommonDataKinds.Phone.getTypeLabelResource(j));
        }
        obj1 = new vk(a, ((String) (obj4)), ((String) (obj1)));
        obj2 = App.az.a(new dh(l2, PhoneNumberUtils.stripSeparators(((String) (obj4)))));
        if (obj2 != null && ((og) (obj2)).t)
        {
            vk.a(((vk) (obj1)), ((og) (obj2)).a);
            vk.a(((vk) (obj1)), ((og) (obj2)));
        }
        obj2 = ((String) (obj4)).replaceAll(z[16], "");
        obj4 = arraylist.iterator();
        j = 1;
_L11:
        if (!((Iterator) (obj4)).hasNext())
        {
            break MISSING_BLOCK_LABEL_792;
        }
        s3 = vk.a((vk)((Iterator) (obj4)).next()).toString().replaceAll(z[14], "");
        if (!((String) (obj2)).endsWith(s3) && !s3.endsWith(((String) (obj2))))
        {
            continue; /* Loop/switch isn't completed */
        }
        if (i1 == 0) goto _L9; else goto _L8
_L8:
        j = 0;
        if (i1 == 0) goto _L11; else goto _L10
_L10:
        l = j;
_L17:
label1:
        {
            j = i;
            if (l == 0)
            {
                break label1;
            }
            l = i;
            if (vk.d(((vk) (obj1))) != null)
            {
                arraylist.add(i, obj1);
                l = i + 1;
                j = l;
                if (i1 == 0)
                {
                    break label1;
                }
            }
            j = l;
            if (!App.aq())
            {
                arraylist.add(obj1);
                j = l;
            }
        }
        if (i1 == 0) goto _L12; else goto _L4
_L4:
        i = 1;
_L16:
        if (i >= arraylist.size()) goto _L14; else goto _L13
_L13:
label2:
        {
            obj1 = (vk)arraylist.get(i);
            if (vk.d(((vk) (obj1))) != null)
            {
                vk.b(((vk) (obj1)), ov.b(vk.d(((vk) (obj1)))));
                if (i1 == 0)
                {
                    break label2;
                }
            }
            if (!TextUtils.isEmpty(vk.a(((vk) (obj1)))) && vk.a(((vk) (obj1))).charAt(0) == '+')
            {
                vk.b(((vk) (obj1)), ov.a(vk.a(((vk) (obj1))).substring(1)));
            }
        }
        if (i1 == 0) goto _L15; else goto _L14
_L14:
        ((Cursor) (obj)).close();
_L2:
        if (!isCancelled())
        {
            a.runOnUiThread(new pb(this, arraylist));
        }
        return;
_L15:
        i++;
        if (true) goto _L16; else goto _L12
_L12:
        i = j;
          goto _L6
_L9:
        l = 0;
          goto _L17
        l = j;
          goto _L17
    }

    static void a(aon aon1, ArrayList arraylist)
    {
        aon1.a(arraylist);
    }

    private void a(ArrayList arraylist)
    {
        if (!isCancelled())
        {
            a.runOnUiThread(new lb(this, arraylist));
        }
    }

    private void b()
    {
        int i = a.getResources().getDimensionPixelSize(0x7f0a004b);
        float f = a.getResources().getDimension(0x7f0a004a);
        Bitmap bitmap1 = ContactInfo.a(a).a(i, f, false);
        Bitmap bitmap = bitmap1;
        if (bitmap1 == null)
        {
            Bitmap bitmap2 = ContactInfo.a(a).j();
            bitmap = bitmap2;
            if (bitmap2 != null)
            {
                bitmap = Bitmap.createScaledBitmap(bitmap2, i, i, true);
            }
        }
        if (!isCancelled())
        {
            a.runOnUiThread(new t(this, bitmap));
        }
    }

    private void c()
    {
        int i = ContactInfo.a(a, ContactInfo.a(a).a, new c6(this));
        if (i != 0 && !isCancelled())
        {
            a.runOnUiThread(new a80(this, i));
        }
    }

    private void d()
    {
        int i = App.am;
        Object obj = App.az.b();
        ArrayList arraylist = new ArrayList();
        obj = ((ArrayList) (obj)).iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            og og1 = (og)((Iterator) (obj)).next();
            if (isCancelled() && i == 0)
            {
                break;
            }
            if (og1.k() && !og1.p() && og1.n != null)
            {
                Set set = mk.a(og1.a).b();
                if (set != null && set.contains(ContactInfo.a(a).a))
                {
                    arraylist.add(og1);
                }
            }
        } while (i == 0);
        if (!isCancelled())
        {
            a.runOnUiThread(new abn(this, arraylist));
        }
    }

    public Void a(Void avoid[])
    {
        if (!isCancelled())
        {
            b();
        }
        if (!isCancelled())
        {
            c();
        }
        if (!isCancelled())
        {
            d();
        }
        if (!isCancelled())
        {
            a();
        }
        return null;
    }

    public void a(Void void1)
    {
        a.setSupportProgressBarIndeterminateVisibility(false);
        Log.i(z[0]);
    }

    public Object doInBackground(Object aobj[])
    {
        return a((Void[])aobj);
    }

    public void onPostExecute(Object obj)
    {
        a((Void)obj);
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[17];
        obj = "\021<+wy\021',m~\035|0s|\023' g";
        byte0 = -1;
        i = 0;
_L2:
        String as1[];
        int j;
        int l;
        as1 = as;
        obj = ((String) (obj)).toCharArray();
        l = obj.length;
        j = 0;
_L8:
label0:
        {
            if (l > j)
            {
                break label0;
            }
            obj = (new String(((char []) (obj)))).intern();
            switch (byte0)
            {
            default:
                as1[i] = ((String) (obj));
                obj = "\00022\\{\035=1b{\006\f,g";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "\021<+wy\021'\032j|";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "\02621b+";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                obj = "\021<+wy\021'\032j|OleBV6s(ju\027'<s}Ot3m|\\2+gj\035:!-{\007!6lj\\:1fu]#-lv\027\f31?";
                i = 4;
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                i = 5;
                obj = "\00022\\{\035=1b{\006\f,g%Ms\004M\\R>,n}\006*5f%U%+g6\023=!qw\0337k`m\000 *q6\033' n7\002;*m}-%w$";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i] = ((String) (obj));
                i = 6;
                obj = "\00022\\{\035=1b{\006\f,g";
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[i] = ((String) (obj));
                i = 7;
                obj = "-:!";
                byte0 = 6;
                break;

            case 6: // '\006'
                as1[i] = ((String) (obj));
                i = 8;
                obj = "\02621b)";
                byte0 = 7;
                break;

            case 7: // '\007'
                as1[i] = ((String) (obj));
                i = 9;
                obj = "\021<+wy\021'\032j|";
                byte0 = 8;
                break;

            case 8: // '\b'
                as1[i] = ((String) (obj));
                i = 10;
                obj = "-:!";
                byte0 = 9;
                break;

            case 9: // '\t'
                as1[i] = ((String) (obj));
                i = 11;
                obj = "\02621b*";
                byte0 = 10;
                break;

            case 10: // '\n'
                as1[i] = ((String) (obj));
                i = 12;
                obj = "\02621b+";
                byte0 = 11;
                break;

            case 11: // '\013'
                as1[i] = ((String) (obj));
                i = 13;
                obj = "\02621b*";
                byte0 = 12;
                break;

            case 12: // '\f'
                as1[i] = ((String) (obj));
                i = 14;
                obj = ".\027";
                byte0 = 13;
                break;

            case 13: // '\r'
                as1[i] = ((String) (obj));
                i = 15;
                obj = "\02621b)";
                byte0 = 14;
                break;

            case 14: // '\016'
                as1[i] = ((String) (obj));
                i = 16;
                obj = ".\027";
                byte0 = 15;
                break;

            case 15: // '\017'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c1 = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 456
    //                   0 479
    //                   1 486
    //                   2 493
    //                   3 500;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_500;
_L3:
        byte byte1 = 24;
_L9:
        obj[j] = (char)(byte1 ^ c1);
        j++;
          goto _L8
_L4:
        byte1 = 114;
          goto _L9
_L5:
        byte1 = 83;
          goto _L9
_L6:
        byte1 = 69;
          goto _L9
        byte1 = 3;
          goto _L9
    }
}
