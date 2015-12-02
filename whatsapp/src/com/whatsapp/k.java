// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.telephony.PhoneNumberUtils;
import android.text.TextUtils;
import android.util.Pair;
import com.whatsapp.contact.b;
import com.whatsapp.contact.e;
import com.whatsapp.contact.i;
import com.whatsapp.contact.j;
import com.whatsapp.contact.n;
import com.whatsapp.util.Log;
import com.whatsapp.util.c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.whatsapp:
//            br, ov, App, s3, 
//            og, dh, it, Conversation, 
//            a, u5, aoz, oh

public class k
{

    private static oh b;
    private static final Map c;
    private static final String z[];
    private br a;

    public k(Context context)
    {
        a = new br(context);
    }

    static br a(k k1)
    {
        return k1.a;
    }

    private boolean a(Context context, Uri uri, og og1)
    {
        Object obj1;
        Object obj2;
        String s;
        boolean flag2;
        flag2 = com.whatsapp.ov.e;
        obj1 = z[22];
        obj2 = z[17];
        s = z[12];
        if (android.os.Build.VERSION.SDK_INT < 11) goto _L2; else goto _L1
_L1:
        Object obj;
        String s1;
        String s2;
        String s4;
        String s5;
        obj = z[10];
        s1 = z[19];
        s2 = z[11];
        s4 = z[9];
        s5 = z[15];
        if (!flag2) goto _L3; else goto _L2
_L2:
        obj = (new String[] {
            z[21], z[7], z[13], z[18]
        });
_L25:
        s1 = z[14];
        if (og1 != null) goto _L5; else goto _L4
_L4:
        boolean flag;
        Log.i(z[20]);
        flag = App.R();
        boolean flag1;
        if (flag)
        {
            try
            {
                uri = j.INTERACTIVE_DELTA;
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                throw context;
            }
        } else
        {
            uri = j.BACKGROUND_DELTA;
        }
        context = com.whatsapp.contact.b.b(context, uri);
        if (!context.isFailure())
        {
            break MISSING_BLOCK_LABEL_184;
        }
        App.ay.a(false);
        if (!flag2)
        {
            break MISSING_BLOCK_LABEL_202;
        }
        flag = context.isSuccess();
        if (flag)
        {
            try
            {
                App.ay.c(false);
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                throw context;
            }
        }
        flag1 = true;
_L7:
        return flag1;
        context;
        throw context;
        context;
        try
        {
            throw context;
        }
        // Misplaced declaration of an exception variable
        catch (Context context) { }
        throw context;
_L5:
        obj2 = App.d.query(uri, new String[] {
            obj1, obj2, s
        }, null, null, null);
        if (obj2 != null)
        {
            break; /* Loop/switch isn't completed */
        }
        flag1 = true;
        if (obj2 != null)
        {
            try
            {
                ((Cursor) (obj2)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                throw context;
            }
            return true;
        }
        if (true) goto _L7; else goto _L6
_L6:
        flag1 = false;
_L18:
        flag = flag1;
        if (!((Cursor) (obj2)).moveToNext())
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (((Cursor) (obj2)).getInt(2) != 1) goto _L9; else goto _L8
_L8:
        long l1;
        l1 = ((Cursor) (obj2)).getLong(0);
        context = ((Cursor) (obj2)).getString(1);
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_353;
        }
        int i1 = context.length();
        if (i1 != 0)
        {
            break MISSING_BLOCK_LABEL_361;
        }
        flag = true;
        if (!flag2)
        {
            break MISSING_BLOCK_LABEL_369;
        }
        flag = false;
        og1.n = context;
        context = Long.toString(l1);
        context = App.d.query(android.provider.ContactsContract.CommonDataKinds.Phone.CONTENT_URI, ((String []) (obj)), z[16], new String[] {
            context
        }, null);
        if (context == null) goto _L11; else goto _L10
_L10:
        uri = context;
        flag1 = context.moveToNext();
        if (!flag1)
        {
            break; /* Loop/switch isn't completed */
        }
        uri = context;
        og1.z = new dh(context.getLong(0), PhoneNumberUtils.stripSeparators(context.getString(1)));
        uri = context;
        og1.B = Integer.valueOf(context.getInt(2));
        uri = context;
        og1.M = context.getString(3);
        uri = context;
        if (context.getColumnCount() <= 4) goto _L13; else goto _L12
_L12:
        uri = context;
        obj1 = context.getString(4);
_L20:
        uri = context;
        og1.f = ((String) (obj1));
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_529;
        }
        uri = context;
        og1.n = og1.z.a;
        uri = context;
        if (og1.z.a == null) goto _L10; else goto _L14
_L14:
        uri = context;
        i1 = og1.z.a.length();
        if (i1 <= 0) goto _L10; else goto _L15
_L15:
        uri = context;
        if (com.whatsapp.contact.b.a())
        {
            break MISSING_BLOCK_LABEL_588;
        }
        uri = context;
        Log.a(z[8], null, new Object[] {
            og1
        });
        uri = context;
        a.l(og1);
        uri = context;
        (new it(this, og1)).start();
        if (!flag2) goto _L10; else goto _L11
_L11:
        if (context == null) goto _L9; else goto _L16
_L16:
        context.close();
_L9:
        flag1 = flag;
        if (!flag2) goto _L18; else goto _L17
_L17:
        flag1 = flag;
        if (obj2 != null)
        {
            try
            {
                ((Cursor) (obj2)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                throw context;
            }
            return flag;
        }
          goto _L7
        context;
        throw context;
        context;
        uri = ((Uri) (obj2));
_L21:
        if (uri != null)
        {
            try
            {
                uri.close();
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                throw context;
            }
        }
        throw context;
        obj1;
        uri = context;
        try
        {
            throw obj1;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1) { }
        finally { }
_L23:
        uri = context;
        Log.a(((Throwable) (obj1)));
        if (context == null) goto _L9; else goto _L19
_L19:
        context.close();
          goto _L9
        obj1;
        uri = context;
        throw obj1;
_L22:
        uri = null;
        if (uri == null)
        {
            break MISSING_BLOCK_LABEL_725;
        }
        uri.close();
        throw context;
_L13:
        obj1 = null;
          goto _L20
        obj1;
        uri = context;
        throw obj1;
        obj1;
        uri = context;
        throw obj1;
        context;
        throw context;
        context;
        throw context;
        context;
        uri = null;
          goto _L21
        context;
          goto _L22
        obj1;
        context = null;
          goto _L23
_L3:
        obj = (new String[] {
            obj, s1, s2, s4, s5
        });
        if (true) goto _L25; else goto _L24
_L24:
    }

    static void h(String s)
    {
        c.remove(s);
    }

    static boolean j(og og1)
    {
        return c.put(og1.a, og1) == null;
    }

    static void l(og og1)
    {
        h(og1.a);
    }

    public int a()
    {
        Object obj;
        boolean flag;
        flag = com.whatsapp.ov.e;
        System.currentTimeMillis();
        obj = z[3];
        Object obj1 = App.d.query(android.provider.ContactsContract.RawContacts.CONTENT_URI, new String[] {
            obj
        }, null, null, null);
        if (obj1 == null) goto _L2; else goto _L1
_L1:
        int i1 = 0;
_L4:
        obj = obj1;
        boolean flag1 = ((Cursor) (obj1)).moveToNext();
        int j1;
        j1 = i1;
        if (!flag1)
        {
            break; /* Loop/switch isn't completed */
        }
        obj = obj1;
        j1 = ((Cursor) (obj1)).getInt(0);
        j1 = i1 + j1;
        i1 = j1;
        if (!flag) goto _L4; else goto _L3
_L3:
        Exception exception1;
        if (obj1 != null)
        {
            try
            {
                ((Cursor) (obj1)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw obj;
            }
        }
        return j1;
        exception1;
        obj = obj1;
        throw exception1;
        exception1;
_L10:
        obj = obj1;
        Log.a(exception1);
        if (obj1 != null)
        {
            ((Cursor) (obj1)).close();
        }
_L6:
        return 0;
_L2:
        if (obj1 != null)
        {
            try
            {
                ((Cursor) (obj1)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw obj;
            }
        }
        if (true) goto _L6; else goto _L5
_L5:
        obj1;
        obj = null;
_L8:
        if (obj != null)
        {
            try
            {
                ((Cursor) (obj)).close();
            }
            catch (Exception exception)
            {
                throw exception;
            }
        }
        throw obj1;
        obj1;
        if (true) goto _L8; else goto _L7
_L7:
        exception1;
        obj1 = null;
        if (true) goto _L10; else goto _L9
_L9:
    }

    public Intent a(og og1, boolean flag)
    {
        Intent intent;
label0:
        {
            Object obj;
label1:
            {
                obj = com.whatsapp.util.c.b(og1.a(App.au));
                Object obj1 = new Intent(App.au.getApplicationContext(), com/whatsapp/Conversation);
                ((Intent) (obj1)).setAction(z[28]);
                ((Intent) (obj1)).addFlags(0x10000000);
                ((Intent) (obj1)).addFlags(0x4000000);
                ((Intent) (obj1)).putExtra(z[30], og1.a);
                ((Intent) (obj1)).putExtra(z[31], ((String) (obj)));
                intent = new Intent();
                intent.putExtra(z[27], ((android.os.Parcelable) (obj1)));
                intent.putExtra(z[26], false);
                intent.putExtra(z[29], ((String) (obj)));
                if (!flag)
                {
                    break label0;
                }
                int i1 = App.au.getResources().getDimensionPixelSize(0x7f0a0057);
                obj1 = og1.a(i1, App.au.getResources().getDimension(0x7f0a0058), false);
                obj = obj1;
                if (obj1 != null)
                {
                    break label1;
                }
                og1 = og1.j();
                obj = og1;
                if (og1 == null)
                {
                    break label1;
                }
                if (og1.getWidth() == i1)
                {
                    obj = og1;
                    if (og1.getHeight() == i1)
                    {
                        break label1;
                    }
                }
                obj = Bitmap.createScaledBitmap(og1, i1, i1, true);
            }
            intent.putExtra(z[25], ((android.os.Parcelable) (obj)));
        }
        return intent;
    }

    public og a(Uri uri)
    {
        boolean flag = com.whatsapp.ov.e;
        Map map = c;
        map;
        JVM INSTR monitorenter ;
        Iterator iterator = c.values().iterator();
_L4:
        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        og og1 = (og)iterator.next();
        if (uri.equals(og1.r()))
        {
            return og1;
        }
          goto _L3
_L2:
        map;
        JVM INSTR monitorexit ;
        return a.a(uri);
        uri;
        map;
        JVM INSTR monitorexit ;
        throw uri;
_L3:
        if (!flag) goto _L4; else goto _L2
    }

    public og a(dh dh1)
    {
        boolean flag = com.whatsapp.ov.e;
        Map map = c;
        map;
        JVM INSTR monitorenter ;
        Iterator iterator = c.values().iterator();
_L4:
        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        og og1 = (og)iterator.next();
        if (dh1.equals(og1.z))
        {
            return og1;
        }
          goto _L3
_L2:
        map;
        JVM INSTR monitorexit ;
        return a.a(dh1);
        dh1;
        map;
        JVM INSTR monitorexit ;
        throw dh1;
_L3:
        if (!flag) goto _L4; else goto _L2
    }

    public og a(og og1, String s, String s1, long l1)
    {
        a.a(og1, s, s1, l1);
        return e(s);
    }

    public void a(Uri uri, og og1)
    {
        Context context = App.au.getApplicationContext();
        if (a(context, uri, og1))
        {
            com.whatsapp.App.b(context, 0x7f0e0023, 0);
        }
    }

    public void a(og og1)
    {
        App.au.getApplicationContext().sendBroadcast(a(og1, false).setAction(z[24]));
    }

    public void a(String s)
    {
        s = com.whatsapp.contact.i.a(s);
        if (s != null && !TextUtils.isEmpty(s.a()))
        {
            s = new og(s);
            if (!com.whatsapp.contact.b.a())
            {
                Log.w(z[23]);
            }
            (new a(this, s)).start();
        }
    }

    public void a(String s, long l1, String s1)
    {
        a.a(s, l1, s1);
    }

    public void a(String s, String s1, String s2)
    {
        s = e(s);
        s.n = s2;
        if (s1 != null && !s1.startsWith(App.k()))
        {
            s.c = ((og) (s)).c + 1;
        }
        a.f(s);
    }

    public void a(String s, String s1, String s2, long l1)
    {
        og og2 = a.c(s);
        og og1 = og2;
        if (og2 == null)
        {
            og1 = new og(s);
            a.g(og1);
        }
        og1.n = s2;
        og1.M = Long.toString(l1);
        og1.p = s1;
        a.f(og1);
    }

    public void a(ArrayList arraylist)
    {
        a.d(arraylist);
    }

    public void a(ArrayList arraylist, Set set)
    {
        a.a(arraylist, set);
    }

    public void a(Collection collection)
    {
        if (collection.size() > 0)
        {
            HashMap hashmap = new HashMap();
            a.a(collection, hashmap);
            c.putAll(hashmap);
        }
    }

    public ArrayList b()
    {
        return a.d();
    }

    public ArrayList b(og og1)
    {
        return a.k(og1);
    }

    public ArrayList b(String s)
    {
        return a.a(s);
    }

    public void b(ArrayList arraylist)
    {
        a.c(arraylist);
    }

    public void b(Collection collection)
    {
        a.c(collection);
        com.whatsapp.App.b(new ArrayList(collection));
    }

    public og c(String s)
    {
        og og1 = (og)c.get(s);
        if (og1 != null)
        {
            return og1;
        } else
        {
            return a.c(s);
        }
    }

    public void c()
    {
        a.i();
    }

    public void c(og og1)
    {
        a.h(og1);
    }

    public void c(ArrayList arraylist)
    {
        boolean flag = com.whatsapp.ov.e;
        a.b(arraylist);
        arraylist = arraylist.iterator();
        do
        {
            if (!arraylist.hasNext())
            {
                break;
            }
            og og1 = (og)arraylist.next();
            og1.g();
            og1.t();
            l(og1);
        } while (!flag);
    }

    public void c(Collection collection)
    {
        a.a(collection);
        com.whatsapp.App.b(new ArrayList(collection));
    }

    public void d()
    {
        a.a();
    }

    public void d(og og1)
    {
        e e1 = com.whatsapp.contact.i.a(og1.a(App.au));
        if (e1 != null && !TextUtils.isEmpty(e1.a()))
        {
            og1.z = new dh(e1.f(), e1.a());
            og1.B = Integer.valueOf(e1.g());
            og1.M = e1.d();
            og1.f = e1.b();
            if (!TextUtils.isEmpty(e1.c()))
            {
                og1.n = e1.c();
            }
            if (!com.whatsapp.contact.b.a())
            {
                Log.w(z[33]);
            }
            a.l(og1);
            (new it(this, og1)).start();
        }
    }

    public void d(ArrayList arraylist)
    {
        a.a(arraylist);
    }

    public void d(Collection collection)
    {
        boolean flag = com.whatsapp.ov.e;
        a.b(collection);
        collection = collection.iterator();
        do
        {
            if (!collection.hasNext())
            {
                break;
            }
            h((String)((Pair)collection.next()).first);
        } while (!flag);
    }

    public boolean d(String s)
    {
        oh oh1;
        if (s != null)
        {
            if ((oh1 = f()) != null && s.equals(((og) (oh1)).a))
            {
                return true;
            }
        }
        return false;
    }

    public og e(String s)
    {
        og og1 = f(s);
        if (og1 != null)
        {
            return og1;
        } else
        {
            s = new og(s);
            a.g(s);
            return s;
        }
    }

    public Map e()
    {
        return a.b();
    }

    public void e(og og1)
    {
        a.a(og1);
    }

    public void e(ArrayList arraylist)
    {
        a.e(arraylist);
    }

    public void e(Collection collection)
    {
        boolean flag = com.whatsapp.ov.e;
        og.a(collection, z[1], z[2]);
        ArrayList arraylist = new ArrayList();
        collection = collection.iterator();
label0:
        do
        {
            og og1;
            do
            {
                if (!collection.hasNext())
                {
                    break label0;
                }
                og1 = (og)collection.next();
                if (og1 == null)
                {
                    continue label0;
                }
            } while (og1.a != null && og1.a.equals(z[0]) || og1.k() && !flag);
            if (og1.t && !a.c(og1))
            {
                if (com.whatsapp.u5.b(og1.a) || App.ah.l(og1.a))
                {
                    if (og1.z == null)
                    {
                        continue;
                    }
                    a.b(og1);
                    if (!flag)
                    {
                        continue;
                    }
                }
                arraylist.add(og1);
                if (!flag)
                {
                    continue;
                }
            }
            arraylist.add(og1);
        } while (!flag);
        if (arraylist.size() > 0)
        {
            c(arraylist);
        }
    }

    public og f(String s)
    {
        Object obj;
        if (App.k() != null && s.equals((new StringBuilder()).append(App.k()).append(z[32]).toString()))
        {
            obj = f();
        } else
        {
            og og1 = (og)c.get(s);
            obj = og1;
            if (og1 == null)
            {
                return a.c(s);
            }
        }
        return ((og) (obj));
    }

    public oh f()
    {
        if (App.k() == null)
        {
            return null;
        }
        if (b == null || !b.a.equals((new StringBuilder()).append(App.k()).append(z[5]).toString()))
        {
            b = new oh();
        }
        return b;
    }

    public void f(og og1)
    {
        a.m(og1);
    }

    public void g()
    {
        c.clear();
    }

    public void g(og og1)
    {
        App.au.getApplicationContext().sendBroadcast(a(og1, true).setAction(z[6]));
    }

    public void g(String s)
    {
        a.a(s, 0L, null);
    }

    public void h(og og1)
    {
        App.az.d(og1);
    }

    public boolean h()
    {
        return a.c();
    }

    public ArrayList i()
    {
        return a.h();
    }

    public ArrayList i(String s)
    {
        return a.d(s);
    }

    public void i(og og1)
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(og1);
        c(arraylist);
    }

    public ArrayList j()
    {
        return a.f();
    }

    public ArrayList k()
    {
        return a.e();
    }

    public void k(og og1)
    {
        a.j(og1);
    }

    public int l()
    {
        int i1 = a.g();
        Log.i((new StringBuilder()).append(z[4]).append(i1).toString());
        return i1;
    }

    public void m(og og1)
    {
        a.g(og1);
    }

    public void n(og og1)
    {
        a.d(og1);
    }

    public void o(og og1)
    {
        a.f(og1);
        App.S.sendEmptyMessage(0);
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i1;
        as = new String[34];
        obj = "\005\r5D\026$(4\034\004>\t3A\022&\030i\\\026\"";
        byte0 = -1;
        i1 = 0;
_L2:
        String as1[];
        int j1;
        int k1;
        as1 = as;
        obj = ((String) (obj)).toCharArray();
        k1 = obj.length;
        j1 = 0;
_L8:
label0:
        {
            if (k1 > j1)
            {
                break label0;
            }
            obj = (new String(((char []) (obj)))).intern();
            switch (byte0)
            {
            default:
                as1[i1] = ((String) (obj));
                obj = "2\n.\\\0259G*S\0357\017\"@\\2\r+W\0073+(\\\0077\0133A";
                i1 = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i1] = ((String) (obj));
                obj = "2\r+";
                i1 = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i1] = ((String) (obj));
                obj = " \r5A\0329\006";
                i1 = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i1] = ((String) (obj));
                obj = "?\006#[\0055\0072\\\007y\013(G\035\"H";
                i1 = 4;
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i1] = ((String) (obj));
                i1 = 5;
                obj = "\026\033iE\0337\0344S\003&F)W\007";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i1] = ((String) (obj));
                i1 = 6;
                obj = "5\007*\034\0228\f5]\0322F+S\0068\013/W\001x\t$F\0329\006i{=\005<\006~?\t;\017}!\002+\022f";
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[i1] = ((String) (obj));
                i1 = 7;
                obj = "2\t3SB";
                byte0 = 6;
                break;

            case 6: // '\006'
                as1[i1] = ((String) (obj));
                i1 = 8;
                obj = "5\007)F\0225\034*S\0357\017\"@\\#\030#S\00737/]\0372\0072F,5\007)F\0225\034\030S\0352\032([\027\t\001)T\034lHbA";
                byte0 = 7;
                break;

            case 7: // '\007'
                as1[i1] = ((String) (obj));
                i1 = 9;
                obj = "2\t3S@";
                byte0 = 8;
                break;

            case 8: // '\b'
                as1[i1] = ((String) (obj));
                i1 = 10;
                obj = "$\t0m\0209\0063S\020\"7.V";
                byte0 = 9;
                break;

            case 9: // '\t'
                as1[i1] = ((String) (obj));
                i1 = 11;
                obj = "2\t3SA";
                byte0 = 10;
                break;

            case 10: // '\n'
                as1[i1] = ((String) (obj));
                i1 = 12;
                obj = "?\006\030D\032%\001%^\026\t\0175]\006&";
                byte0 = 11;
                break;

            case 11: // '\013'
                as1[i1] = ((String) (obj));
                i1 = 13;
                obj = "2\t3SA";
                byte0 = 12;
                break;

            case 12: // '\f'
                as1[i1] = ((String) (obj));
                i1 = 14;
                obj = "5\007)F\0225\034\030[\027kW";
                byte0 = 13;
                break;

            case 13: // '\r'
                as1[i1] = ((String) (obj));
                i1 = 15;
                obj = "%\0075F,=\r>";
                byte0 = 14;
                break;

            case 14: // '\016'
                as1[i1] = ((String) (obj));
                i1 = 16;
                obj = "5\007)F\0225\034\030[\027kW";
                byte0 = 15;
                break;

            case 15: // '\017'
                as1[i1] = ((String) (obj));
                i1 = 17;
                obj = "2\0014B\0377\021\030\\\022;\r";
                byte0 = 16;
                break;

            case 16: // '\020'
                as1[i1] = ((String) (obj));
                i1 = 18;
                obj = "2\t3S@";
                byte0 = 17;
                break;

            case 17: // '\021'
                as1[i1] = ((String) (obj));
                i1 = 19;
                obj = "2\t3SB";
                byte0 = 18;
                break;

            case 18: // '\022'
                as1[i1] = ((String) (obj));
                i1 = 20;
                obj = "#\030#S\0073 (^\027\031\0353q\0348\034&Q\007y\017\"F,8\035+^,!\t$]\035\"\t$F";
                byte0 = 19;
                break;

            case 19: // '\023'
                as1[i1] = ((String) (obj));
                i1 = 21;
                obj = "$\t0m\0209\0063S\020\"7.V";
                byte0 = 20;
                break;

            case 20: // '\024'
                as1[i1] = ((String) (obj));
                i1 = 22;
                obj = "\t\001#";
                byte0 = 21;
                break;

            case 21: // '\025'
                as1[i1] = ((String) (obj));
                i1 = 23;
                obj = "5\007)F\0225\034*S\0357\017\"@\\5\000\"Q\030\t\t)V,7\f#m\0209\0063S\020\"G4K\03557&^\0013\t#K,?\006\030B\0019\0175W\000%";
                byte0 = 22;
                break;

            case 22: // '\026'
                as1[i1] = ((String) (obj));
                i1 = 24;
                obj = "5\007*\034\0228\f5]\0322F+S\0068\013/W\001x\t$F\0329\006ig=\037&\024f2\032$\030a;\031:\023q&\002";
                byte0 = 23;
                break;

            case 23: // '\027'
                as1[i1] = ((String) (obj));
                i1 = 25;
                obj = "7\006#@\034?\fi[\035\"\r)F]3\0203@\022x\033/]\001\"\0132F]\037+\b|";
                byte0 = 24;
                break;

            case 24: // '\030'
                as1[i1] = ((String) (obj));
                i1 = 26;
                obj = "2\0357^\0325\t3W";
                byte0 = 25;
                break;

            case 25: // '\031'
                as1[i1] = ((String) (obj));
                i1 = 27;
                obj = "7\006#@\034?\fi[\035\"\r)F]3\0203@\022x\033/]\001\"\0132F]\037&\023w=\002";
                byte0 = 26;
                break;

            case 26: // '\032'
                as1[i1] = ((String) (obj));
                i1 = 28;
                obj = "7\006#@\034?\fi[\035\"\r)F]7\0133[\0348F\ns:\030";
                byte0 = 27;
                break;

            case 27: // '\033'
                as1[i1] = ((String) (obj));
                i1 = 29;
                obj = "7\006#@\034?\fi[\035\"\r)F]3\0203@\022x\033/]\001\"\0132F]\030)\nw";
                byte0 = 28;
                break;

            case 28: // '\034'
                as1[i1] = ((String) (obj));
                i1 = 30;
                obj = "<\001#";
                byte0 = 29;
                break;

            case 29: // '\035'
                as1[i1] = ((String) (obj));
                i1 = 31;
                obj = "2\0014B\0377\021)S\0363";
                byte0 = 30;
                break;

            case 30: // '\036'
                as1[i1] = ((String) (obj));
                i1 = 32;
                obj = "\026\033iE\0337\0344S\003&F)W\007";
                byte0 = 31;
                break;

            case 31: // '\037'
                as1[i1] = ((String) (obj));
                i1 = 33;
                obj = "5\007)F\0225\034*S\0357\017\"@\\#\030#S\00737/]\03727(G\007\t\013(\\\0077\0133\035\000/\006$m\022:\032\"S\027/7.\\,&\032(U\0013\0334";
                byte0 = 32;
                break;

            case 32: // ' '
                as1[i1] = ((String) (obj));
                z = as;
                c = Collections.synchronizedMap(new HashMap());
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c1 = obj[j1];
        j1 % 5;
        JVM INSTR tableswitch 0 3: default 844
    //                   0 867
    //                   1 874
    //                   2 881
    //                   3 888;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_888;
_L3:
        byte byte1 = 115;
_L9:
        obj[j1] = (char)(byte1 ^ c1);
        j1++;
          goto _L8
_L4:
        byte1 = 86;
          goto _L9
_L5:
        byte1 = 104;
          goto _L9
_L6:
        byte1 = 71;
          goto _L9
        byte1 = 50;
          goto _L9
    }
}
