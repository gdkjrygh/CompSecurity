// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Environment;
import android.support.v4.util.LruCache;
import android.text.TextUtils;
import com.whatsapp.contact.ContactProvider;
import com.whatsapp.contact.e;
import com.whatsapp.util.Log;
import com.whatsapp.util.c;
import com.whatsapp.util.c1;
import com.whatsapp.util.q;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.whatsapp:
//            ov, dh, jy, App, 
//            akx, mk, k4, abl, 
//            k, oh, a1g, ij, 
//            ox

public class og extends ov
{

    public static String A;
    public static String D;
    public static String E;
    public static String F;
    public static String H;
    public static String I;
    public static String J;
    public static String K;
    public static String O;
    private static final String R[];
    public static String g;
    private static final HashMap h;
    public static String j;
    public static String k;
    public static String m;
    public static String o;
    public static String r;
    public static String s[];
    public static String v;
    public static String w;
    public static String x;
    public static String y;
    public Integer B;
    public transient boolean C;
    public jy G;
    public boolean L;
    public String M;
    public String N;
    public String P;
    public long Q;
    public String f;
    public long i;
    public String l;
    public String n;
    public String p;
    public int q;
    public boolean t;
    public int u;
    public dh z;

    private og(Cursor cursor)
    {
        String s1;
        long l1;
        boolean flag;
        flag = true;
        super(cursor.getString(1), cursor.getString(3), cursor.getLong(17));
        Q = -1L;
        z = null;
        B = null;
        L = false;
        p = null;
        C = true;
        Q = cursor.getLong(0);
        n = cursor.getString(6);
        B = Integer.valueOf(cursor.getInt(7));
        M = cursor.getString(8);
        s1 = cursor.getString(4);
        l1 = cursor.getLong(5);
        if (l1 <= 0L && l1 != -2L || s1 == null)
        {
            break MISSING_BLOCK_LABEL_183;
        }
        boolean flag1 = com.whatsapp.contact.e.a(s1);
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_183;
        }
        z = new dh(l1, s1);
        flag1 = com.whatsapp.ov.e;
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_192;
        }
        int i1;
        if (s1 != null)
        {
            try
            {
                p = s1;
            }
            // Misplaced declaration of an exception variable
            catch (Cursor cursor)
            {
                throw cursor;
            }
        }
        try
        {
            i1 = cursor.getInt(2);
        }
        // Misplaced declaration of an exception variable
        catch (Cursor cursor)
        {
            throw cursor;
        }
        if (i1 != 1)
        {
            flag = false;
        }
        t = flag;
        c = cursor.getInt(9);
        u = cursor.getInt(10);
        q = cursor.getInt(11);
        i = cursor.getLong(12);
        P = cursor.getString(13);
        l = cursor.getString(14);
        N = cursor.getString(15);
        f = cursor.getString(16);
        G = jy.fromText(cursor.getString(18));
        return;
        cursor;
        try
        {
            throw cursor;
        }
        // Misplaced declaration of an exception variable
        catch (Cursor cursor) { }
        throw cursor;
    }

    public og(e e1)
    {
        this(e1.a(), e1.f(), e1.c(), e1.g(), e1.d());
        f = e1.b();
    }

    public og(dh dh1, String s1, int i1, String s2)
    {
        Q = -1L;
        z = null;
        B = null;
        L = false;
        p = null;
        C = true;
        z = dh1;
        n = s1;
        B = Integer.valueOf(i1);
        M = s2;
    }

    public og(String s1)
    {
        super(s1);
        Q = -1L;
        z = null;
        B = null;
        L = false;
        p = null;
        C = true;
        t = true;
        z = null;
    }

    public og(String s1, long l1, String s2, int i1, String s3)
    {
        this(new dh(l1, s1), s2, i1, s3);
    }

    private og(String s1, boolean flag, String s2, long l1, String s3)
    {
        Q = -1L;
        z = null;
        B = null;
        L = false;
        p = null;
        C = true;
        a = s1;
        t = flag;
        n = s3;
        z = new dh(l1, s2);
    }

    public static Bitmap a(int i1)
    {
        Bitmap bitmap = (Bitmap)h.get(Integer.valueOf(i1));
        if (bitmap != null)
        {
            return bitmap;
        } else
        {
            Bitmap bitmap1 = a(i1, App.au.getResources().getDimensionPixelSize(0x7f0a0059), App.au.getResources().getDimension(0x7f0a0058));
            h.put(Integer.valueOf(i1), bitmap1);
            return bitmap1;
        }
    }

    public static Bitmap a(int i1, int j1, float f1)
    {
        Drawable drawable;
        Bitmap bitmap;
        Canvas canvas;
        Paint paint;
        RectF rectf;
        boolean flag;
        flag = com.whatsapp.ov.e;
        drawable = App.au.getResources().getDrawable(i1);
        bitmap = Bitmap.createBitmap(j1, j1, android.graphics.Bitmap.Config.ARGB_8888);
        canvas = new Canvas(bitmap);
        drawable.setBounds(0, 0, j1, j1);
        if (!(drawable instanceof BitmapDrawable))
        {
            break MISSING_BLOCK_LABEL_183;
        }
        paint = new Paint();
        rectf = new RectF(0.0F, 0.0F, j1, j1);
        paint.setAntiAlias(true);
        paint.setDither(true);
        paint.setFilterBitmap(true);
        canvas.drawARGB(0, 0, 0, 0);
        paint.setColor(-1);
        if (f1 >= 0.0F)
        {
            IllegalArgumentException illegalargumentexception;
            try
            {
                canvas.drawRoundRect(rectf, f1, f1, paint);
            }
            catch (IllegalArgumentException illegalargumentexception1)
            {
                throw illegalargumentexception1;
            }
            if (!flag)
            {
                break MISSING_BLOCK_LABEL_145;
            }
        }
        canvas.drawArc(rectf, 0.0F, 360F, true, paint);
        try
        {
            paint.setXfermode(new PorterDuffXfermode(android.graphics.PorterDuff.Mode.SRC_IN));
            canvas.drawBitmap(((BitmapDrawable)drawable).getBitmap(), null, rectf, paint);
        }
        catch (IllegalArgumentException illegalargumentexception2)
        {
            throw illegalargumentexception2;
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_189;
        }
        drawable.draw(canvas);
        return bitmap;
        illegalargumentexception;
        throw illegalargumentexception;
    }

    public static og a(Cursor cursor)
    {
        return new og(cursor);
    }

    public static File a(String s1)
    {
        File file = new File(App.aK, R[32]);
        if (!file.exists())
        {
            file.mkdirs();
            File file1 = new File(file, R[30]);
            int i1;
            try
            {
                file1.createNewFile();
            }
            catch (IOException ioexception) { }
        }
        i1 = s1.indexOf("@");
        if (i1 > 0)
        {
            try
            {
                s1 = new File(file, (new StringBuilder()).append(s1.substring(0, i1)).append(R[31]).toString());
            }
            // Misplaced declaration of an exception variable
            catch (String s1)
            {
                throw s1;
            }
            return s1;
        } else
        {
            return new File(file, (new StringBuilder()).append(s1).append(R[33]).toString());
        }
    }

    public static void a(Collection collection, String s1, String s2)
    {
        int i1;
        boolean flag;
        flag = com.whatsapp.ov.e;
        i1 = collection.size();
        int j1;
        try
        {
            Log.i((new StringBuilder()).append(s1).append(R[34]).append(i1).toString());
            j1 = App.l;
        }
        // Misplaced declaration of an exception variable
        catch (Collection collection)
        {
            throw collection;
        }
        break MISSING_BLOCK_LABEL_47;
_L2:
        return;
        if (j1 >= 1 && i1 < 5000)
        {
            collection = collection.iterator();
            do
            {
                if (!collection.hasNext())
                {
                    continue; /* Loop/switch isn't completed */
                }
                s1 = (og)collection.next();
            } while (!flag);
        }
          goto _L1
        if (true) goto _L2; else goto _L1
_L1:
    }

    public static boolean a(List list, akx akx1)
    {
        boolean flag1 = com.whatsapp.ov.e;
        if (list != null)
        {
            list = list.iterator();
            boolean flag = false;
            while (list.hasNext()) 
            {
                og og1 = (og)list.next();
                boolean flag2;
                try
                {
                    flag2 = akx1.a(og1);
                }
                // Misplaced declaration of an exception variable
                catch (List list)
                {
                    try
                    {
                        throw list;
                    }
                    // Misplaced declaration of an exception variable
                    catch (List list)
                    {
                        throw list;
                    }
                }
                if (flag2 || flag)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (flag1)
                {
                    return flag;
                }
            }
            return flag;
        } else
        {
            return false;
        }
    }

    public static og b(Cursor cursor)
    {
        boolean flag = true;
        Object obj;
        int i1;
        try
        {
            obj = cursor.getString(1);
            i1 = cursor.getInt(2);
        }
        // Misplaced declaration of an exception variable
        catch (Cursor cursor)
        {
            throw cursor;
        }
        if (i1 != 1)
        {
            flag = false;
        }
        obj = new og(((String) (obj)), flag, cursor.getString(3), cursor.getLong(4), cursor.getString(5));
        obj.Q = cursor.getLong(0);
        return ((og) (obj));
    }

    public static boolean b(String s1)
    {
        return R[50].equals(s1);
    }

    public static boolean c(String s1)
    {
        return s1.substring(s1.lastIndexOf("@") + 1, s1.length()).equals(R[7]);
    }

    public static boolean e(String s1)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (s1 != null)
        {
            boolean flag2;
            try
            {
                flag2 = s1.endsWith(R[0]);
            }
            // Misplaced declaration of an exception variable
            catch (String s1)
            {
                throw s1;
            }
            flag = flag1;
            if (flag2)
            {
                flag = true;
            }
        }
        return flag;
    }

    public static File f(String s1)
    {
        File file = new File(App.au.getFilesDir(), R[2]);
        try
        {
            if (!file.exists())
            {
                file.mkdirs();
            }
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            throw s1;
        }
        return new File(file, (new StringBuilder()).append(s1).append(R[1]).toString());
    }

    private String f()
    {
        Object obj = b(App.d);
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_90;
        }
        obj = App.d.query(((Uri) (obj)), null, null, null, null);
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_90;
        }
        String s1;
        if (!((Cursor) (obj)).moveToFirst())
        {
            break MISSING_BLOCK_LABEL_64;
        }
        s1 = ((Cursor) (obj)).getString(((Cursor) (obj)).getColumnIndex(R[64]));
        ((Cursor) (obj)).close();
        return s1;
        Exception exception;
        try
        {
            ((Cursor) (obj)).close();
        }
        catch (SQLiteException sqliteexception)
        {
            Log.a(sqliteexception);
        }
        break MISSING_BLOCK_LABEL_90;
        exception;
        ((Cursor) (obj)).close();
        throw exception;
        return null;
    }

    public static boolean g(String s1)
    {
        boolean flag;
        try
        {
            flag = e(s1);
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            try
            {
                throw s1;
            }
            // Misplaced declaration of an exception variable
            catch (String s1)
            {
                throw s1;
            }
        }
        if (flag)
        {
            break MISSING_BLOCK_LABEL_27;
        }
        if (!b(s1))
        {
            return false;
        }
        return true;
    }

    public Bitmap a(int i1, float f1)
    {
        return (Bitmap)App.Q.get(b(i1, f1));
    }

    public Bitmap a(int i1, float f1, boolean flag)
    {
        if (!flag) goto _L2; else goto _L1
_L1:
        Bitmap bitmap = (Bitmap)App.Q.get(b(i1, f1));
        if (bitmap == null) goto _L2; else goto _L3
_L3:
        return bitmap;
_L2:
        Bitmap bitmap1 = c(i1, f1);
        bitmap = bitmap1;
        if (flag)
        {
            bitmap = bitmap1;
            if (bitmap1 != null)
            {
                try
                {
                    App.Q.put(b(i1, f1), bitmap1);
                }
                catch (IllegalArgumentException illegalargumentexception)
                {
                    throw illegalargumentexception;
                }
                return bitmap1;
            }
        }
        if (true) goto _L3; else goto _L4
_L4:
    }

    public Uri a(ContentResolver contentresolver)
    {
        if (e() == null)
        {
            return null;
        } else
        {
            return android.provider.ContactsContract.RawContacts.getContactLookupUri(contentresolver, e());
        }
    }

    public InputStream a(ContentResolver contentresolver, boolean flag)
    {
        Uri uri;
        Object obj = null;
        uri = b(contentresolver);
        if (uri == null)
        {
            break MISSING_BLOCK_LABEL_99;
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_109;
        }
        int i1;
        try
        {
            i1 = android.os.Build.VERSION.SDK_INT;
        }
        // Misplaced declaration of an exception variable
        catch (ContentResolver contentresolver)
        {
            throw contentresolver;
        }
        if (i1 < 14)
        {
            break MISSING_BLOCK_LABEL_109;
        }
        obj = android/provider/ContactsContract$Contacts.getDeclaredMethod(R[21], new Class[] {
            android/content/ContentResolver, android/net/Uri, Boolean.TYPE
        });
        ((Method) (obj)).setAccessible(true);
        obj = (InputStream)((Method) (obj)).invoke(null, new Object[] {
            contentresolver, uri, Boolean.valueOf(true)
        });
        return ((InputStream) (obj));
        Object obj1;
        obj1;
        Log.a(((Throwable) (obj1)));
_L2:
        return android.provider.ContactsContract.Contacts.openContactPhotoInputStream(contentresolver, uri);
        obj1;
        Log.a(((Throwable) (obj1)));
        continue; /* Loop/switch isn't completed */
        obj1;
        Log.a(((Throwable) (obj1)));
        continue; /* Loop/switch isn't completed */
        obj1;
        Log.a(((Throwable) (obj1)));
        continue; /* Loop/switch isn't completed */
        obj1;
        Log.a(((Throwable) (obj1)));
        if (true) goto _L2; else goto _L1
_L1:
    }

    public InputStream a(boolean flag)
    {
        Object obj = null;
        File file;
        boolean flag1;
        try
        {
            flag1 = C;
        }
        catch (FileNotFoundException filenotfoundexception)
        {
            throw filenotfoundexception;
        }
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_233;
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_137;
        }
        file = c();
        obj = file;
        if (file.exists())
        {
            break MISSING_BLOCK_LABEL_217;
        }
        file = h();
        obj = file;
        if (u <= 0)
        {
            break MISSING_BLOCK_LABEL_217;
        }
        obj = Environment.getExternalStorageState();
        if (!((String) (obj)).equals(R[49]))
        {
            break MISSING_BLOCK_LABEL_129;
        }
        flag1 = ((String) (obj)).equals(R[45]);
        if (!flag1)
        {
            try
            {
                Log.e((new StringBuilder()).append(R[46]).append(a).append(R[44]).append(u).toString());
                u = 0;
            }
            catch (FileNotFoundException filenotfoundexception2)
            {
                throw filenotfoundexception2;
            }
        }
        obj = file;
        if (!com.whatsapp.ov.e)
        {
            break MISSING_BLOCK_LABEL_217;
        }
        file = h();
        obj = file;
        if (file.exists())
        {
            break MISSING_BLOCK_LABEL_217;
        }
        file = c();
        obj = file;
        FileNotFoundException filenotfoundexception1;
        try
        {
            if (q <= 0)
            {
                break MISSING_BLOCK_LABEL_217;
            }
            Log.e((new StringBuilder()).append(R[47]).append(a).append(R[48]).append(q).toString());
            q = 0;
        }
        catch (FileNotFoundException filenotfoundexception3)
        {
            throw filenotfoundexception3;
        }
        obj = file;
        if (!((File) (obj)).exists())
        {
            break MISSING_BLOCK_LABEL_254;
        }
        try
        {
            obj = new FileInputStream(((File) (obj)));
        }
        catch (FileNotFoundException filenotfoundexception4)
        {
            return b(flag);
        }
        return ((InputStream) (obj));
        filenotfoundexception1;
        throw filenotfoundexception1;
        return b(flag);
    }

    public CharSequence a(Resources resources)
    {
        Integer integer;
        int i1;
        try
        {
            integer = B;
        }
        // Misplaced declaration of an exception variable
        catch (Resources resources)
        {
            try
            {
                throw resources;
            }
            // Misplaced declaration of an exception variable
            catch (Resources resources) { }
            try
            {
                throw resources;
            }
            // Misplaced declaration of an exception variable
            catch (Resources resources)
            {
                throw resources;
            }
        }
        if (integer == null)
        {
            break MISSING_BLOCK_LABEL_59;
        }
        i1 = B.intValue();
        if (i1 != 0)
        {
            break MISSING_BLOCK_LABEL_44;
        }
        if (M == null)
        {
            break MISSING_BLOCK_LABEL_44;
        }
        resources = M;
        return resources;
        return resources.getString(android.provider.ContactsContract.CommonDataKinds.Phone.getTypeLabelResource(B.intValue()));
        return null;
    }

    public String a(Context context)
    {
label0:
        {
            try
            {
                if (!R[51].equals(a))
                {
                    break label0;
                }
                context = context.getString(0x7f0e0066);
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                throw context;
            }
            return context;
        }
label1:
        {
            try
            {
                if (TextUtils.isEmpty(n))
                {
                    break label1;
                }
                context = n;
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                throw context;
            }
            return context;
        }
label2:
        {
            try
            {
                if (!k())
                {
                    break label2;
                }
                context = context.getString(0x7f0e01f4);
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                throw context;
            }
            return context;
        }
        if (d())
        {
            int i1 = mk.a(a).g();
            return String.format(App.j.a(0x7f0d0005, i1), new Object[] {
                Integer.valueOf(i1)
            });
        } else
        {
            return (new StringBuilder()).append("\u202A").append(a()).append("\u202C").toString();
        }
    }

    public String a(SharedPreferences sharedpreferences)
    {
label0:
        {
            if (sharedpreferences.getBoolean(R[66], true))
            {
                try
                {
                    sharedpreferences = z;
                }
                // Misplaced declaration of an exception variable
                catch (SharedPreferences sharedpreferences)
                {
                    throw sharedpreferences;
                }
                if (sharedpreferences != null)
                {
                    break label0;
                }
            }
            return null;
        }
        return f();
    }

    public void a(int i1, int j1)
    {
        boolean flag;
        try
        {
            flag = a.equals(App.az.f().a);
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            try
            {
                throw illegalargumentexception;
            }
            catch (IllegalArgumentException illegalargumentexception1)
            {
                throw illegalargumentexception1;
            }
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_40;
        }
        App.az.f().a(i1, j1);
        if (!com.whatsapp.ov.e)
        {
            break MISSING_BLOCK_LABEL_71;
        }
        u = i1;
        q = j1;
        i = System.currentTimeMillis();
        App.az.n(this);
        return;
    }

    public void a(byte abyte0[], byte abyte1[])
    {
        if (abyte0 == null)
        {
            break MISSING_BLOCK_LABEL_12;
        }
        c1.a(abyte0, c());
        if (abyte1 == null)
        {
            break MISSING_BLOCK_LABEL_24;
        }
        c1.a(abyte1, h());
        return;
        abyte0;
        try
        {
            throw abyte0;
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            Log.a(R[63], abyte0);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            Log.a(R[62], abyte0);
        }
        break MISSING_BLOCK_LABEL_54;
        abyte0;
        throw abyte0;
    }

    public boolean a(e e1)
    {
        boolean flag;
label0:
        {
label1:
            {
                boolean flag2 = com.whatsapp.ov.e;
                flag = false;
                dh dh1 = new dh(e1.f(), e1.a());
                int i1;
                boolean flag1;
                boolean flag3;
                try
                {
                    if (z == null)
                    {
                        break label1;
                    }
                    flag1 = z.equals(dh1);
                }
                // Misplaced declaration of an exception variable
                catch (e e1)
                {
                    throw e1;
                }
                if (flag1)
                {
                    break label0;
                }
            }
            z = dh1;
            flag = true;
        }
label2:
        {
            flag1 = flag;
            try
            {
                if (TextUtils.isEmpty(e1.c()))
                {
                    break label2;
                }
                flag3 = TextUtils.equals(n, e1.c());
            }
            // Misplaced declaration of an exception variable
            catch (e e1)
            {
                throw e1;
            }
            flag1 = flag;
            if (!flag3)
            {
                n = e1.c();
                m();
                flag1 = true;
            }
        }
        if (B.intValue() == e1.g())
        {
            break MISSING_BLOCK_LABEL_168;
        }
        try
        {
            B = Integer.valueOf(e1.g());
            i1 = B.intValue();
        }
        // Misplaced declaration of an exception variable
        catch (e e1)
        {
            try
            {
                throw e1;
            }
            // Misplaced declaration of an exception variable
            catch (e e1) { }
            try
            {
                throw e1;
            }
            // Misplaced declaration of an exception variable
            catch (e e1) { }
            try
            {
                throw e1;
            }
            // Misplaced declaration of an exception variable
            catch (e e1)
            {
                throw e1;
            }
        }
        if (i1 == 0)
        {
            break MISSING_BLOCK_LABEL_152;
        }
        M = null;
        if (!flag2)
        {
            break MISSING_BLOCK_LABEL_212;
        }
        M = e1.d();
        if (!flag2)
        {
            break MISSING_BLOCK_LABEL_212;
        }
        flag1 = true;
        flag = flag1;
        if (B.intValue() != 0)
        {
            break MISSING_BLOCK_LABEL_215;
        }
        flag2 = TextUtils.equals(M, e1.d());
        flag = flag1;
        if (flag2)
        {
            break MISSING_BLOCK_LABEL_215;
        }
        M = e1.d();
        flag = true;
        try
        {
            if (TextUtils.isEmpty(e1.b()))
            {
                break MISSING_BLOCK_LABEL_274;
            }
            flag1 = TextUtils.equals(f, e1.b());
        }
        // Misplaced declaration of an exception variable
        catch (e e1)
        {
            throw e1;
        }
        if (!flag1)
        {
            f = e1.b();
            return true;
        }
        break MISSING_BLOCK_LABEL_274;
        return flag;
    }

    public Uri b(ContentResolver contentresolver)
    {
        Uri uri = null;
        Uri uri1 = a(contentresolver);
        if (uri1 != null)
        {
            try
            {
                uri = android.provider.ContactsContract.Contacts.lookupContact(contentresolver, uri1);
            }
            // Misplaced declaration of an exception variable
            catch (ContentResolver contentresolver)
            {
                Log.a(contentresolver);
                return null;
            }
            // Misplaced declaration of an exception variable
            catch (ContentResolver contentresolver)
            {
                Log.a(contentresolver);
                return null;
            }
            // Misplaced declaration of an exception variable
            catch (ContentResolver contentresolver)
            {
                throw contentresolver;
            }
        }
        return uri;
    }

    protected InputStream b(boolean flag)
    {
        Object obj;
label0:
        {
            boolean flag1 = com.whatsapp.ov.e;
            ContentResolver contentresolver = App.au.getContentResolver();
            InputStream inputstream = a(contentresolver, flag);
            obj = inputstream;
            if (inputstream != null)
            {
                break label0;
            }
            Iterator iterator = App.az.b(this).iterator();
            obj = inputstream;
            do
            {
                if (!iterator.hasNext())
                {
                    break label0;
                }
                obj = (Long)iterator.next();
                inputstream = (new og(z.a, ((Long) (obj)).longValue(), n, 0, null)).a(contentresolver, flag);
                if (inputstream != null)
                {
                    obj = inputstream;
                    if (!flag1)
                    {
                        break label0;
                    }
                }
                obj = inputstream;
            } while (!flag1);
            obj = inputstream;
        }
        return ((InputStream) (obj));
    }

    public String b()
    {
        String s1;
        for (s1 = a(App.au); s1 == null || App.aR();)
        {
            return s1;
        }

        return (new StringBuilder()).append(R[10]).append(s1).append("\u202C").toString();
    }

    public String b(int i1, float f1)
    {
        return (new StringBuilder()).append(q()).append("_").append(Integer.toString(i1)).append("_").append(Float.toString(f1)).toString();
    }

    public String b(SharedPreferences sharedpreferences)
    {
label0:
        {
            if (sharedpreferences.getBoolean(R[43], true))
            {
                try
                {
                    sharedpreferences = z;
                }
                // Misplaced declaration of an exception variable
                catch (SharedPreferences sharedpreferences)
                {
                    throw sharedpreferences;
                }
                if (sharedpreferences != null)
                {
                    break label0;
                }
            }
            return null;
        }
        return f();
    }

    public Bitmap c(int i1, float f1)
    {
        float f3;
        Object obj2;
        boolean flag;
        boolean flag1;
        flag = true;
        obj2 = null;
        flag1 = com.whatsapp.ov.e;
        f3 = i1;
        float f2 = a1g.a().g;
        Object obj;
        Object obj1;
        Object obj3;
        int j1;
        boolean flag2;
        if (f3 < f2 * 96F)
        {
            flag = false;
        }
        if (!C) goto _L2; else goto _L1
_L1:
        obj = a(flag);
_L31:
        if (a == null)
        {
            break MISSING_BLOCK_LABEL_157;
        }
        flag2 = k();
        if (!flag2)
        {
            break MISSING_BLOCK_LABEL_77;
        }
        flag2 = p();
        if (flag2)
        {
            break MISSING_BLOCK_LABEL_157;
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_122;
        }
        j1 = u;
        if (j1 == 0)
        {
            break MISSING_BLOCK_LABEL_105;
        }
        flag2 = c(true);
        if (!flag2)
        {
            break MISSING_BLOCK_LABEL_157;
        }
        App.a(a, u, 1);
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_157;
        }
        j1 = q;
        if (j1 == 0)
        {
            break MISSING_BLOCK_LABEL_145;
        }
        flag2 = c(false);
        if (!flag2)
        {
            break MISSING_BLOCK_LABEL_157;
        }
        App.a(a, q, 2);
        if (obj == null) goto _L4; else goto _L3
_L3:
        obj3 = new android.graphics.BitmapFactory.Options();
        obj3.inJustDecodeBounds = true;
        BitmapFactory.decodeStream(((InputStream) (obj)), null, ((android.graphics.BitmapFactory.Options) (obj3)));
        ((InputStream) (obj)).close();
        obj1 = a(flag);
        obj = obj1;
        if (obj != null) goto _L6; else goto _L5
_L5:
        Log.e((new StringBuilder()).append(R[37]).append(a).append(R[36]).toString());
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_256;
        }
        ((InputStream) (obj)).close();
        if (true) goto _L8; else goto _L7
_L7:
        try
        {
            throw new NullPointerException();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
          goto _L9
_L8:
        return null;
        obj;
        throw obj;
        obj2;
        obj = null;
        obj1 = null;
_L10:
        Log.e((new StringBuilder()).append(R[41]).append(((SQLiteException) (obj2)).toString()).toString());
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_323;
        }
        ((InputStream) (obj)).close();
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_333;
        }
        ((Bitmap) (obj1)).recycle();
_L22:
        return null;
        obj1;
        throw obj1;
        obj1;
        throw obj1;
        obj1;
        throw obj1;
        obj1;
        throw obj1;
        obj1;
        throw obj1;
        obj1;
        throw obj1;
        obj1;
        throw obj1;
        obj1;
        throw obj1;
        obj1;
        Object obj4;
        Object obj5;
        Paint paint;
        Canvas canvas;
        RectF rectf;
        try
        {
            throw obj1;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj2)
        {
            obj1 = null;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj2)
        {
            obj1 = null;
            obj3 = obj;
            obj = obj1;
            continue; /* Loop/switch isn't completed */
        }
        finally
        {
            continue; /* Loop/switch isn't completed */
        }
          goto _L10
        obj1;
        Log.e((new StringBuilder()).append(R[42]).append(a).append(R[39]).toString());
        Log.a(((Throwable) (obj1)));
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_441;
        }
        ((InputStream) (obj)).close();
        if (true) goto _L12; else goto _L11
_L11:
        try
        {
            throw new NullPointerException();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
          goto _L13
_L12:
        return null;
        obj;
        try
        {
            throw obj;
        }
        catch (IOException ioexception) { }
        if (true) goto _L12; else goto _L13
_L13:
        throw obj;
        obj;
        try
        {
            throw obj;
        }
        catch (IOException ioexception1) { }
          goto _L8
_L9:
        throw obj;
_L6:
        obj3.inSampleSize = Math.max(((android.graphics.BitmapFactory.Options) (obj3)).outWidth / i1, ((android.graphics.BitmapFactory.Options) (obj3)).outHeight / i1);
        obj3.inDither = true;
        obj3.inJustDecodeBounds = false;
        obj3.inScaled = false;
        obj3.inPreferredConfig = android.graphics.Bitmap.Config.ARGB_8888;
        obj1 = BitmapFactory.decodeStream(((InputStream) (obj)), null, ((android.graphics.BitmapFactory.Options) (obj3)));
        if (obj1 != null) goto _L15; else goto _L14
_L14:
        obj4 = obj;
        obj5 = obj1;
        Log.e((new StringBuilder()).append(R[38]).append(a).append(R[40]).toString());
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_594;
        }
        ((InputStream) (obj)).close();
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_604;
        }
        ((Bitmap) (obj1)).recycle();
_L17:
        return null;
        obj;
        try
        {
            throw obj;
        }
        catch (IOException ioexception2) { }
        if (true) goto _L17; else goto _L16
_L16:
        obj;
        throw obj;
_L15:
        obj4 = obj;
        obj5 = obj1;
        obj3 = Bitmap.createBitmap(i1, i1, android.graphics.Bitmap.Config.ARGB_8888);
        obj4 = obj;
        obj5 = obj1;
        canvas = new Canvas(((Bitmap) (obj3)));
        obj4 = obj;
        obj5 = obj1;
        paint = new Paint();
        obj4 = obj;
        obj5 = obj1;
        obj2 = new RectF(0.0F, 0.0F, i1, i1);
        obj4 = obj;
        obj5 = obj1;
        paint.setAntiAlias(true);
        obj4 = obj;
        obj5 = obj1;
        paint.setDither(true);
        obj4 = obj;
        obj5 = obj1;
        paint.setFilterBitmap(true);
        obj4 = obj;
        obj5 = obj1;
        canvas.drawARGB(0, 0, 0, 0);
        obj4 = obj;
        obj5 = obj1;
        paint.setColor(-1);
        if (f1 != 0.0F)
        {
            break MISSING_BLOCK_LABEL_794;
        }
        obj4 = obj;
        obj5 = obj1;
        canvas.drawRect(((RectF) (obj2)), paint);
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_846;
        }
        if (f1 <= 0.0F)
        {
            break MISSING_BLOCK_LABEL_824;
        }
        obj4 = obj;
        obj5 = obj1;
        canvas.drawRoundRect(((RectF) (obj2)), f1, f1, paint);
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_846;
        }
        obj4 = obj;
        obj5 = obj1;
        canvas.drawArc(((RectF) (obj2)), 0.0F, 360F, true, paint);
        obj4 = obj;
        obj5 = obj1;
        paint.setXfermode(new PorterDuffXfermode(android.graphics.PorterDuff.Mode.SRC_IN));
        obj4 = obj;
        obj5 = obj1;
        rectf = new RectF(0.0F, 0.0F, i1, i1);
        obj4 = obj;
        obj5 = obj1;
        i1 = (((Bitmap) (obj1)).getWidth() - ((Bitmap) (obj1)).getHeight()) / 2;
        if (i1 <= 0)
        {
            break MISSING_BLOCK_LABEL_955;
        }
        obj4 = obj;
        obj5 = obj1;
        obj2 = new Rect(i1, 0, ((Bitmap) (obj1)).getWidth() - i1, ((Bitmap) (obj1)).getHeight());
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_987;
        }
        obj4 = obj;
        obj5 = obj1;
        obj2 = new Rect(0, -i1, ((Bitmap) (obj1)).getWidth(), i1 + ((Bitmap) (obj1)).getHeight());
        obj4 = obj;
        obj5 = obj1;
        canvas.drawBitmap(((Bitmap) (obj1)), ((Rect) (obj2)), rectf, paint);
        obj4 = obj;
        obj5 = obj1;
        ((Bitmap) (obj1)).recycle();
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_1031;
        }
        ((InputStream) (obj)).close();
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_1041;
        }
        ((Bitmap) (obj1)).recycle();
_L18:
        return ((Bitmap) (obj3));
        obj2;
        obj4 = obj;
        obj5 = obj1;
        throw obj2;
        obj2;
        obj4 = obj;
        obj5 = obj1;
        throw obj2;
        obj2;
        obj4 = obj;
        obj5 = obj1;
        throw obj2;
        obj2;
        obj4 = obj;
        obj5 = obj1;
        throw obj2;
        obj2;
          goto _L10
        obj;
        try
        {
            throw obj;
        }
        catch (IOException ioexception3) { }
          goto _L18
        obj;
        throw obj;
_L4:
        C = false;
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_1126;
        }
        ((InputStream) (obj)).close();
        if (true) goto _L20; else goto _L19
_L19:
        try
        {
            throw new NullPointerException();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
          goto _L21
_L20:
        return null;
        obj;
        try
        {
            throw obj;
        }
        catch (IOException ioexception4) { }
        if (true) goto _L20; else goto _L21
_L21:
        throw obj;
        obj;
        try
        {
            throw obj;
        }
        catch (IOException ioexception5) { }
          goto _L22
        obj;
        throw obj;
        obj2;
        obj3 = null;
        obj = null;
_L29:
        obj4 = obj3;
        obj5 = obj;
        Log.e((new StringBuilder()).append(R[35]).append(((OutOfMemoryError) (obj2)).toString()).toString());
        if (obj3 == null)
        {
            break MISSING_BLOCK_LABEL_1216;
        }
        ((InputStream) (obj3)).close();
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_1226;
        }
        ((Bitmap) (obj)).recycle();
_L24:
        return null;
        obj;
        try
        {
            throw obj;
        }
        catch (IOException ioexception6) { }
        if (true) goto _L24; else goto _L23
_L23:
        obj;
        throw obj;
        obj1;
        obj = null;
_L27:
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_1253;
        }
        ((InputStream) (obj)).close();
        if (obj2 == null)
        {
            break MISSING_BLOCK_LABEL_1263;
        }
        ((Bitmap) (obj2)).recycle();
_L26:
        throw obj1;
        obj;
        try
        {
            throw obj;
        }
        catch (IOException ioexception7) { }
        if (true) goto _L26; else goto _L25
_L25:
        obj;
        throw obj;
        obj1;
        continue; /* Loop/switch isn't completed */
        obj1;
        obj2 = obj5;
        obj = obj4;
        continue; /* Loop/switch isn't completed */
        obj3;
        obj2 = obj1;
        obj1 = obj3;
        if (true) goto _L27; else goto _L10
        obj2;
        obj1 = null;
        obj3 = obj;
        obj = obj1;
        continue; /* Loop/switch isn't completed */
        obj2;
        obj3 = obj;
        obj = obj1;
        if (true) goto _L29; else goto _L28
_L28:
        obj2;
        obj1 = null;
          goto _L10
_L2:
        obj = null;
        if (true) goto _L31; else goto _L30
_L30:
    }

    public File c()
    {
label0:
        {
            File file;
            try
            {
                if (!a.equals(App.az.f().a))
                {
                    break label0;
                }
                file = App.az.f().c();
            }
            catch (IllegalArgumentException illegalargumentexception)
            {
                throw illegalargumentexception;
            }
            return file;
        }
        return a(a);
    }

    public boolean c(boolean flag)
    {
label0:
        {
            try
            {
                if (!a.equals(App.az.f().a))
                {
                    break label0;
                }
                flag = App.az.f().c(flag);
            }
            catch (IllegalArgumentException illegalargumentexception)
            {
                throw illegalargumentexception;
            }
            return flag;
        }
        long l1;
        long l2;
        try
        {
            l1 = i;
            l2 = System.currentTimeMillis();
        }
        catch (IllegalArgumentException illegalargumentexception1)
        {
            throw illegalargumentexception1;
        }
        return l1 + 0x240c8400L < l2;
    }

    public boolean d()
    {
        return e(a);
    }

    public boolean d(String s1)
    {
        boolean flag;
        boolean flag1;
        flag1 = false;
        flag = com.whatsapp.ov.e;
        boolean flag2;
        try
        {
            flag2 = TextUtils.isEmpty(s1);
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            throw s1;
        }
        if (!flag2) goto _L2; else goto _L1
_L1:
        flag = true;
_L4:
        return flag;
_L2:
label0:
        {
            String s2;
            if (!TextUtils.isEmpty(n))
            {
                s2 = com.whatsapp.util.c.a(n);
                if (!flag)
                {
                    break label0;
                }
            }
            boolean flag3;
            try
            {
                flag3 = d();
            }
            // Misplaced declaration of an exception variable
            catch (String s1)
            {
                throw s1;
            }
            if (flag3)
            {
                s2 = mk.b(a);
                if (!flag)
                {
                    break label0;
                }
            }
            s2 = a();
        }
        flag = flag1;
        if (s2 == null) goto _L4; else goto _L3
_L3:
        s2 = s2.toLowerCase();
        flag = s2.startsWith(s1);
        if (flag)
        {
            break; /* Loop/switch isn't completed */
        }
        try
        {
            flag3 = s2.contains((new StringBuilder()).append(" ").append(s1).toString());
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            throw s1;
        }
        flag = flag1;
        if (!flag3) goto _L4; else goto _L5
_L5:
        return true;
        s1;
        throw s1;
    }

    public Uri e()
    {
        dh dh1 = z;
        if (dh1 == null)
        {
            break MISSING_BLOCK_LABEL_39;
        }
        long l1 = z.b;
        if (l1 != -2L)
        {
            IllegalArgumentException illegalargumentexception;
            long l2;
            try
            {
                l2 = z.b;
            }
            catch (IllegalArgumentException illegalargumentexception1)
            {
                throw illegalargumentexception1;
            }
            if (l2 >= 0L)
            {
                break MISSING_BLOCK_LABEL_50;
            }
        }
        return null;
        illegalargumentexception;
        throw illegalargumentexception;
        illegalargumentexception;
        throw illegalargumentexception;
        return ContentUris.withAppendedId(android.provider.ContactsContract.RawContacts.CONTENT_URI, z.b);
    }

    public boolean equals(Object obj)
    {
        if (this != obj) goto _L2; else goto _L1
_L1:
        return true;
_L2:
label0:
        {
            if (obj != null)
            {
                Class class1;
                Class class2;
                try
                {
                    class1 = obj.getClass();
                    class2 = getClass();
                }
                // Misplaced declaration of an exception variable
                catch (Object obj)
                {
                    throw obj;
                }
                if (class1 == class2)
                {
                    break label0;
                }
            }
            return false;
        }
        obj = (og)obj;
        boolean flag;
        try
        {
            flag = TextUtils.equals(a, ((og) (obj)).a);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw obj;
        }
        if (!flag)
        {
            return false;
        }
        dh dh1;
        try
        {
            dh1 = z;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            try
            {
                throw obj;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw obj;
            }
        }
        if (dh1 != null)
        {
            break MISSING_BLOCK_LABEL_83;
        }
        if (((og) (obj)).z == null) goto _L1; else goto _L3
_L3:
        return false;
        return z.equals(((og) (obj)).z);
    }

    public void g()
    {
        c().delete();
        h().delete();
    }

    public File h()
    {
label0:
        {
            File file;
            try
            {
                if (!a.equals(App.az.f().a))
                {
                    break label0;
                }
                file = App.az.f().c();
            }
            catch (IllegalArgumentException illegalargumentexception)
            {
                throw illegalargumentexception;
            }
            return file;
        }
        return f(a);
    }

    public int hashCode()
    {
label0:
        {
            int i1;
            try
            {
                if (z == null)
                {
                    break label0;
                }
                i1 = z.hashCode();
            }
            catch (IllegalArgumentException illegalargumentexception)
            {
                throw illegalargumentexception;
            }
            return i1;
        }
        return a.hashCode();
    }

    public File i()
    {
        Object obj1 = null;
        Object obj = new File(App.au.getFilesDir(), R[8]);
        File file;
        boolean flag;
        try
        {
            if (!((File) (obj)).exists())
            {
                ((File) (obj)).mkdirs();
            }
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw obj;
        }
        ((File) (obj)).setExecutable(true, false);
        file = new File(((File) (obj)), (new StringBuilder()).append(a).append(R[9]).toString());
        try
        {
            flag = file.exists();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw obj;
        }
        if (flag)
        {
            obj = file;
        } else
        {
            FileOutputStream fileoutputstream;
            Bitmap bitmap;
            try
            {
                fileoutputstream = new FileOutputStream(file);
            }
            catch (IOException ioexception)
            {
                fileoutputstream = null;
            }
            bitmap = a(512, App.au.getResources().getDimension(0x7f0a0058), false);
            obj = obj1;
            if (fileoutputstream != null)
            {
                obj = obj1;
                if (bitmap != null)
                {
                    bitmap.compress(android.graphics.Bitmap.CompressFormat.JPEG, 100, fileoutputstream);
                    return file;
                }
            }
        }
        return ((File) (obj));
    }

    public Bitmap j()
    {
        return a(o());
    }

    public boolean k()
    {
        StringBuilder stringbuilder;
        if (a != null)
        {
            break MISSING_BLOCK_LABEL_227;
        }
        stringbuilder = new StringBuilder();
        StringBuilder stringbuilder1;
        stringbuilder.append(R[22]).append(Q);
        stringbuilder1 = stringbuilder.append(R[23]);
        if (a != null) goto _L2; else goto _L1
_L1:
        Object obj = R[24];
_L4:
        try
        {
            stringbuilder1.append(((String) (obj)));
            stringbuilder.append(R[25]);
            obj = z;
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            try
            {
                throw illegalargumentexception;
            }
            catch (IllegalArgumentException illegalargumentexception1)
            {
                throw illegalargumentexception1;
            }
        }
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_101;
        }
        stringbuilder.append(R[28]);
        if (!com.whatsapp.ov.e)
        {
            break MISSING_BLOCK_LABEL_129;
        }
        stringbuilder.append(z.b).append("-").append(z.a);
        try
        {
            stringbuilder.append(R[26]).append(B);
            stringbuilder.append(R[29]).append(t);
            if (Q != -1L)
            {
                Log.e((new StringBuilder()).append(R[27]).append(stringbuilder.toString()).toString());
            }
        }
        catch (IllegalArgumentException illegalargumentexception2)
        {
            throw illegalargumentexception2;
        }
        return false;
        obj;
        throw obj;
_L2:
        obj = a;
        if (true) goto _L4; else goto _L3
_L3:
        return mk.h(a);
    }

    public boolean l()
    {
        boolean flag;
        try
        {
            flag = g(a);
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            try
            {
                throw illegalargumentexception;
            }
            catch (IllegalArgumentException illegalargumentexception1)
            {
                throw illegalargumentexception1;
            }
        }
        if (flag)
        {
            break MISSING_BLOCK_LABEL_30;
        }
        if (TextUtils.isEmpty(n))
        {
            return true;
        }
        return false;
    }

    public void m()
    {
        boolean flag = com.whatsapp.ov.e;
        if (z == null)
        {
            break MISSING_BLOCK_LABEL_326;
        }
        Object obj = R[14];
        String s1 = R[15];
        String s2 = R[19];
        String s3 = R[17];
        ContentResolver contentresolver = App.d;
        Uri uri = android.provider.ContactsContract.Data.CONTENT_URI;
        String s4 = R[11];
        String s5 = Long.toString(z.b);
        String s6 = R[16];
        obj = contentresolver.query(uri, new String[] {
            obj, s1, s2, s3
        }, s4, new String[] {
            s5, s6
        }, null);
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_326;
        }
        int i1;
        boolean flag1;
        try
        {
            if (!((Cursor) (obj)).moveToNext())
            {
                break MISSING_BLOCK_LABEL_320;
            }
            P = ((Cursor) (obj)).getString(((Cursor) (obj)).getColumnIndex(R[18]));
            l = ((Cursor) (obj)).getString(((Cursor) (obj)).getColumnIndex(R[12]));
            i1 = android.os.Build.VERSION.SDK_INT;
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            throw illegalargumentexception;
        }
        if (i1 >= 11)
        {
            break MISSING_BLOCK_LABEL_320;
        }
        s1 = ((Cursor) (obj)).getString(((Cursor) (obj)).getColumnIndex(R[20]));
        s2 = ((Cursor) (obj)).getString(((Cursor) (obj)).getColumnIndex(R[13]));
        flag1 = TextUtils.isEmpty(s2);
        if (flag1)
        {
            break MISSING_BLOCK_LABEL_287;
        }
        flag1 = TextUtils.isEmpty(s1);
        if (flag1)
        {
            break MISSING_BLOCK_LABEL_287;
        }
        f = (new StringBuilder()).append(s2).append(" ").append(s1).toString();
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_320;
        }
        flag1 = TextUtils.isEmpty(s2);
        if (flag1)
        {
            break MISSING_BLOCK_LABEL_308;
        }
        f = s2;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_320;
        }
        try
        {
            if (!TextUtils.isEmpty(s1))
            {
                f = s1;
            }
        }
        catch (IllegalArgumentException illegalargumentexception2)
        {
            throw illegalargumentexception2;
        }
        ((Cursor) (obj)).close();
        IllegalArgumentException illegalargumentexception1;
        try
        {
            if (P == null)
            {
                P = "";
            }
        }
        catch (IllegalArgumentException illegalargumentexception3)
        {
            throw illegalargumentexception3;
        }
        try
        {
            if (l == null)
            {
                l = "";
            }
            return;
        }
        catch (IllegalArgumentException illegalargumentexception4)
        {
            throw illegalargumentexception4;
        }
        illegalargumentexception1;
        throw illegalargumentexception1;
        illegalargumentexception1;
        throw illegalargumentexception1;
        illegalargumentexception1;
        throw illegalargumentexception1;
        illegalargumentexception1;
        throw illegalargumentexception1;
        illegalargumentexception1;
        throw illegalargumentexception1;
    }

    public boolean n()
    {
        Bitmap bitmap;
        try
        {
            bitmap = a(App.au.getResources().getDimensionPixelSize(0x7f0a0059), App.au.getResources().getDimension(0x7f0a0058));
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            throw illegalargumentexception;
        }
        return bitmap != null;
    }

    public int o()
    {
        boolean flag;
        try
        {
            flag = g(a);
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            throw illegalargumentexception;
        }
        if (flag)
        {
            return 0x7f020095;
        }
        try
        {
            flag = mk.h(a);
        }
        catch (IllegalArgumentException illegalargumentexception1)
        {
            try
            {
                throw illegalargumentexception1;
            }
            catch (IllegalArgumentException illegalargumentexception2)
            {
                throw illegalargumentexception2;
            }
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_61;
        }
        return !a.contains(R[65]) ? 0x7f020097 : 0x7f020098;
        return 0x7f020096;
    }

    public boolean p()
    {
        return a.substring(a.lastIndexOf("@") + 1, a.length()).equals(R[4]);
    }

    public String q()
    {
label0:
        {
            String s1;
            try
            {
                if (z == null)
                {
                    break label0;
                }
                s1 = z.toString();
            }
            catch (IllegalArgumentException illegalargumentexception)
            {
                throw illegalargumentexception;
            }
            return s1;
        }
        return a;
    }

    public Uri r()
    {
        return ContentUris.withAppendedId(ContactProvider.e, Q);
    }

    public long s()
    {
        dh dh1;
        try
        {
            dh1 = z;
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            throw illegalargumentexception;
        }
        if (dh1 == null)
        {
            return 0L;
        } else
        {
            return z.b;
        }
    }

    public void t()
    {
        boolean flag = com.whatsapp.ov.e;
        Iterator iterator = App.Q.snapshot().keySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            String s1 = (String)iterator.next();
            try
            {
                if (s1.startsWith(q()))
                {
                    App.Q.remove(s1);
                }
            }
            catch (IllegalArgumentException illegalargumentexception)
            {
                throw illegalargumentexception;
            }
        } while (!flag);
        C = true;
    }

    public String toString()
    {
        StringBuilder stringbuilder;
        boolean flag;
        flag = com.whatsapp.ov.e;
        stringbuilder = new StringBuilder();
        StringBuilder stringbuilder1;
        stringbuilder.append(R[52]).append(Q);
        stringbuilder1 = stringbuilder.append(R[61]);
        if (a != null) goto _L2; else goto _L1
_L1:
        Object obj = R[59];
_L4:
        stringbuilder1.append(((String) (obj)));
        stringbuilder.append(R[53]);
        obj = z;
        if (obj == null)
        {
            IllegalArgumentException illegalargumentexception;
            boolean flag1;
            try
            {
                stringbuilder.append(R[55]);
            }
            catch (IllegalArgumentException illegalargumentexception1)
            {
                throw illegalargumentexception1;
            }
            if (!flag)
            {
                break MISSING_BLOCK_LABEL_126;
            }
        }
        stringbuilder.append(z.b).append("-").append(z.a);
        stringbuilder.append(R[54]).append(B);
        stringbuilder.append(R[58]).append(t);
        flag1 = k();
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_217;
        }
        stringbuilder.append(R[56]).append(a(App.au));
        stringbuilder.append(R[60]).append(d);
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_242;
        }
        IllegalArgumentException illegalargumentexception2;
        try
        {
            if (App.l >= 1)
            {
                stringbuilder.append(R[57]).append(n);
            }
        }
        catch (IllegalArgumentException illegalargumentexception3)
        {
            throw illegalargumentexception3;
        }
        return stringbuilder.toString();
        obj;
        throw obj;
_L2:
        obj = a;
        if (true) goto _L4; else goto _L3
_L3:
        illegalargumentexception;
        throw illegalargumentexception;
        illegalargumentexception2;
        throw illegalargumentexception2;
        illegalargumentexception2;
        throw illegalargumentexception2;
    }

    public String u()
    {
        boolean flag = mk.h(a);
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_71;
        }
        IllegalArgumentException illegalargumentexception;
        try
        {
            if (p != null)
            {
                return p;
            }
        }
        catch (IllegalArgumentException illegalargumentexception1)
        {
            throw illegalargumentexception1;
        }
        break MISSING_BLOCK_LABEL_30;
        illegalargumentexception;
        throw illegalargumentexception;
        return (new StringBuilder()).append(a.substring(0, a.indexOf("-"))).append(R[6]).toString();
label0:
        {
            String s1;
            try
            {
                if (!d())
                {
                    break label0;
                }
                s1 = (new StringBuilder()).append(App.k()).append(R[5]).toString();
            }
            catch (IllegalArgumentException illegalargumentexception2)
            {
                throw illegalargumentexception2;
            }
            return s1;
        }
        return null;
    }

    public String v()
    {
        String s1 = w();
        if (s1 != null)
        {
            return s1;
        }
        long l1 = App.o.a(a);
        if (l1 == 0L)
        {
            return "";
        }
        if (l1 == 1L)
        {
            String s2;
            try
            {
                s2 = App.au.getString(0x7f0e00ef);
            }
            catch (IllegalArgumentException illegalargumentexception)
            {
                throw illegalargumentexception;
            }
            return s2;
        } else
        {
            return (new StringBuilder()).append(App.au.getString(0x7f0e00f3)).append(" ").append(com.whatsapp.util.q.d(App.au, com.whatsapp.App.c(l1))).toString();
        }
    }

    public String w()
    {
        boolean flag;
        try
        {
            flag = d();
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            throw illegalargumentexception;
        }
        if (!flag) goto _L2; else goto _L1
_L1:
        return null;
_L2:
        Object obj;
        og og1;
label0:
        {
            if (!k())
            {
                break; /* Loop/switch isn't completed */
            }
            obj = App.o.e(a);
            if (obj == null)
            {
                continue; /* Loop/switch isn't completed */
            }
            og1 = App.az.e(((ox) (obj)).a);
            try
            {
                if (((ox) (obj)).b != 0)
                {
                    break label0;
                }
                obj = App.au.getString(0x7f0e00f5, new Object[] {
                    og1.z()
                });
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw obj;
            }
            return ((String) (obj));
        }
        try
        {
            if (((ox) (obj)).b != 1)
            {
                continue; /* Loop/switch isn't completed */
            }
            obj = App.au.getString(0x7f0e00f6, new Object[] {
                og1.z()
            });
        }
        catch (IllegalArgumentException illegalargumentexception1)
        {
            throw illegalargumentexception1;
        }
        return ((String) (obj));
        if (!com.whatsapp.ov.e) goto _L1; else goto _L3
_L3:
        int i1 = App.o.b(a, null);
        if (i1 == 0)
        {
            String s1;
            try
            {
                s1 = App.au.getString(0x7f0e00f1);
            }
            catch (IllegalArgumentException illegalargumentexception2)
            {
                throw illegalargumentexception2;
            }
            return s1;
        }
        if (i1 == 1)
        {
            String s2;
            try
            {
                s2 = App.au.getString(0x7f0e00f2);
            }
            catch (IllegalArgumentException illegalargumentexception3)
            {
                throw illegalargumentexception3;
            }
            return s2;
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    public String x()
    {
        if (mk.h(a))
        {
            return (new StringBuilder()).append(a.substring(0, a.indexOf("-"))).append(R[3]).toString();
        } else
        {
            return null;
        }
    }

    public String y()
    {
label0:
        {
            String s1;
            try
            {
                if (G != null)
                {
                    break label0;
                }
                s1 = jy.getDefault().getText();
            }
            catch (IllegalArgumentException illegalargumentexception)
            {
                throw illegalargumentexception;
            }
            return s1;
        }
        return G.getText();
    }

    public String z()
    {
        Object obj = z;
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_44;
        }
        IllegalArgumentException illegalargumentexception;
        try
        {
            obj = P;
        }
        catch (IllegalArgumentException illegalargumentexception1)
        {
            try
            {
                throw illegalargumentexception1;
            }
            catch (IllegalArgumentException illegalargumentexception2)
            {
                throw illegalargumentexception2;
            }
        }
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_44;
        }
        if (P.length() == 0)
        {
            break MISSING_BLOCK_LABEL_44;
        }
        obj = P;
        return ((String) (obj));
        illegalargumentexception;
        throw illegalargumentexception;
        return a(App.au);
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i1;
        as = new String[67];
        obj = "\003te\013W'uv\027B";
        byte0 = -1;
        i1 = 0;
_L70:
        String as1[];
        int k1;
        int l1;
        as1 = as;
        obj = ((String) (obj)).toCharArray();
        l1 = obj.length;
        k1 = 0;
_L98:
        if (l1 > k1) goto _L2; else goto _L1
_L1:
        obj = (new String(((char []) (obj)))).intern();
        byte0;
        JVM INSTR tableswitch 0 65: default 328
    //                   0 344
    //                   1 360
    //                   2 376
    //                   3 392
    //                   4 408
    //                   5 425
    //                   6 443
    //                   7 461
    //                   8 479
    //                   9 497
    //                   10 515
    //                   11 533
    //                   12 551
    //                   13 569
    //                   14 587
    //                   15 605
    //                   16 623
    //                   17 641
    //                   18 659
    //                   19 677
    //                   20 695
    //                   21 713
    //                   22 731
    //                   23 749
    //                   24 767
    //                   25 785
    //                   26 803
    //                   27 821
    //                   28 839
    //                   29 857
    //                   30 875
    //                   31 893
    //                   32 911
    //                   33 929
    //                   34 947
    //                   35 965
    //                   36 983
    //                   37 1001
    //                   38 1019
    //                   39 1037
    //                   40 1055
    //                   41 1073
    //                   42 1091
    //                   43 1109
    //                   44 1127
    //                   45 1145
    //                   46 1163
    //                   47 1181
    //                   48 1199
    //                   49 1217
    //                   50 1235
    //                   51 1253
    //                   52 1271
    //                   53 1289
    //                   54 1307
    //                   55 1325
    //                   56 1343
    //                   57 1361
    //                   58 1379
    //                   59 1397
    //                   60 1415
    //                   61 1433
    //                   62 1451
    //                   63 1469
    //                   64 1487
    //                   65 1505;
           goto _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L17 _L18 _L19 _L20 _L21 _L22 _L23 _L24 _L25 _L26 _L27 _L28 _L29 _L30 _L31 _L32 _L33 _L34 _L35 _L36 _L37 _L38 _L39 _L40 _L41 _L42 _L43 _L44 _L45 _L46 _L47 _L48 _L49 _L50 _L51 _L52 _L53 _L54 _L55 _L56 _L57 _L58 _L59 _L60 _L61 _L62 _L63 _L64 _L65 _L66 _L67 _L68 _L69
_L3:
        as1[i1] = ((String) (obj));
        obj = "m|";
        i1 = 1;
        byte0 = 0;
          goto _L70
_L4:
        as1[i1] = ((String) (obj));
        obj = "\002`v\020W1e";
        i1 = 2;
        byte0 = 1;
          goto _L70
_L5:
        as1[i1] = ((String) (obj));
        obj = "\003e9\023^\"bd\005F38y\001B";
        i1 = 3;
        byte0 = 2;
          goto _L70
_L6:
        as1[i1] = ((String) (obj));
        obj = "7sz\024";
        i1 = 4;
        byte0 = 3;
          goto _L70
_L7:
        as1[i1] = ((String) (obj));
        i1 = 5;
        obj = "\003e9\023^\"bd\005F38y\001B";
        byte0 = 4;
          goto _L70
_L8:
        as1[i1] = ((String) (obj));
        i1 = 6;
        obj = "\003e9\023^\"bd\005F38y\001B";
        byte0 = 5;
          goto _L70
_L9:
        as1[i1] = ((String) (obj));
        i1 = 7;
        obj = "7sz\024";
        byte0 = 6;
          goto _L70
_L10:
        as1[i1] = ((String) (obj));
        i1 = 8;
        obj = "\002{v\036Y-^x\tS\024\177s\003S7Wa\005B\"dd";
        byte0 = 7;
          goto _L70
_L11:
        as1[i1] = ((String) (obj));
        i1 = 9;
        obj = "m|";
        byte0 = 8;
          goto _L70
_L12:
        as1[i1] = ((String) (obj));
        i1 = 10;
        obj = "\u206D\u203C";
        byte0 = 9;
          goto _L70
_L13:
        as1[i1] = ((String) (obj));
        i1 = 11;
        obj = "1w`;U,xc\005U7I~\000\026~6(Dw\rR7\t_.sc\035F&+(";
        byte0 = 10;
          goto _L70
_L14:
        as1[i1] = ((String) (obj));
        i1 = 12;
        obj = "'wc\005\005";
        byte0 = 11;
          goto _L70
_L15:
        as1[i1] = ((String) (obj));
        i1 = 13;
        obj = "'wc\005\017";
        byte0 = 12;
          goto _L70
_L16:
        as1[i1] = ((String) (obj));
        i1 = 14;
        obj = "'wc\005\004";
        byte0 = 13;
          goto _L70
_L17:
        as1[i1] = ((String) (obj));
        i1 = 15;
        obj = "'wc\005\005";
        byte0 = 14;
          goto _L70
_L18:
        as1[i1] = ((String) (obj));
        i1 = 16;
        obj = "5xsJW-re\013_'8t\021D0yeJ_7szKX\"{r";
        byte0 = 15;
          goto _L70
_L19:
        as1[i1] = ((String) (obj));
        i1 = 17;
        obj = "'wc\005\017";
        byte0 = 16;
          goto _L70
_L20:
        as1[i1] = ((String) (obj));
        i1 = 18;
        obj = "'wc\005\004";
        byte0 = 17;
          goto _L70
_L21:
        as1[i1] = ((String) (obj));
        i1 = 19;
        obj = "'wc\005\001";
        byte0 = 18;
          goto _L70
_L22:
        as1[i1] = ((String) (obj));
        i1 = 20;
        obj = "'wc\005\001";
        byte0 = 19;
          goto _L70
_L23:
        as1[i1] = ((String) (obj));
        i1 = 21;
        obj = ",fr\nu,xc\005U7F\177\013B,_y\024C7Ec\026S\"{";
        byte0 = 20;
          goto _L70
_L24:
        as1[i1] = ((String) (obj));
        i1 = 22;
        obj = "1y`;_'+";
        byte0 = 21;
          goto _L70
_L25:
        as1[i1] = ((String) (obj));
        i1 = 23;
        obj = "c|~\000\013";
        byte0 = 22;
          goto _L70
_L26:
        as1[i1] = ((String) (obj));
        i1 = 24;
        obj = "kxb\bZj";
        byte0 = 23;
          goto _L70
_L27:
        as1[i1] = ((String) (obj));
        i1 = 25;
        obj = "c}r\035\013";
        byte0 = 24;
          goto _L70
_L28:
        as1[i1] = ((String) (obj));
        i1 = 26;
        obj = "cf\177\013X&+";
        byte0 = 25;
          goto _L70
_L29:
        as1[i1] = ((String) (obj));
        i1 = 27;
        obj = "3dx\006Z&{v\020_ 6t\013X7wt\020\f";
        byte0 = 26;
          goto _L70
_L30:
        as1[i1] = ((String) (obj));
        i1 = 28;
        obj = "kxb\bZj";
        byte0 = 27;
          goto _L70
_L31:
        as1[i1] = ((String) (obj));
        i1 = 29;
        obj = "c\177d\023W~";
        byte0 = 28;
          goto _L70
_L32:
        as1[i1] = ((String) (obj));
        i1 = 30;
        obj = "mxx\tS'\177v";
        byte0 = 29;
          goto _L70
_L33:
        as1[i1] = ((String) (obj));
        i1 = 31;
        obj = "m|g\003";
        byte0 = 30;
          goto _L70
_L34:
        as1[i1] = ((String) (obj));
        i1 = 32;
        obj = "\023dx\002_/s74_ bb\026S0";
        byte0 = 31;
          goto _L70
_L35:
        as1[i1] = ((String) (obj));
        i1 = 33;
        obj = "m|g\003";
        byte0 = 32;
          goto _L70
_L36:
        as1[i1] = ((String) (obj));
        i1 = 34;
        obj = "lux\021X76";
        byte0 = 33;
          goto _L70
_L37:
        as1[i1] = ((String) (obj));
        i1 = 35;
        obj = "4wt\013X7wt\020\031$sc\024^,bx\002W0b8\013C7;x\002\033.sz\013D:6";
        byte0 = 34;
          goto _L70
_L38:
        as1[i1] = ((String) (obj));
        i1 = 36;
        obj = "cec\026S\"{7\rEcxb\bZ";
        byte0 = 35;
          goto _L70
_L39:
        as1[i1] = ((String) (obj));
        i1 = 37;
        obj = "4wt\013X7wt\020\031$sc\024^,bx\002W0b8";
        byte0 = 36;
          goto _L70
_L40:
        as1[i1] = ((String) (obj));
        i1 = 38;
        obj = "4wt\013X7wt\020\031$sc\024^,bx\002W0b8";
        byte0 = 37;
          goto _L70
_L41:
        as1[i1] = ((String) (obj));
        i1 = 39;
        obj = "cse\026Y16t\bY0\177y\003\0260be\001W.";
        byte0 = 38;
          goto _L70
_L42:
        as1[i1] = ((String) (obj));
        i1 = 40;
        obj = "crr\007Y'sD\020D&wzDD&bb\026X06y\021Z/";
        byte0 = 39;
          goto _L70
_L43:
        as1[i1] = ((String) (obj));
        i1 = 41;
        obj = "4wt\013X7wt\020\031$sc\024^,bx\002W0b8\001D1yeD";
        byte0 = 40;
          goto _L70
_L44:
        as1[i1] = ((String) (obj));
        i1 = 42;
        obj = "4wt\013X7wt\020\031$sc\024^,bx\002W0b8";
        byte0 = 41;
          goto _L70
_L45:
        as1[i1] = ((String) (obj));
        i1 = 43;
        obj = " w{\bi cd\020Y.Ie\rX$bx\nS";
        byte0 = 42;
          goto _L70
_L46:
        as1[i1] = ((String) (obj));
        i1 = 44;
        obj = "cpb\bZcp~\bSc{~\027E*xpD_',";
        byte0 = 43;
          goto _L70
_L47:
        as1[i1] = ((String) (obj));
        i1 = 45;
        obj = ".yb\nB&rH\026Y";
        byte0 = 44;
          goto _L70
_L48:
        as1[i1] = ((String) (obj));
        i1 = 46;
        obj = "4wt\013X7wt\020\031$sc\024^,bx\027B1sv\t\031";
        byte0 = 45;
          goto _L70
_L49:
        as1[i1] = ((String) (obj));
        i1 = 47;
        obj = "4wt\013X7wt\020\031$sc\024^,bx\027B1sv\t\031";
        byte0 = 46;
          goto _L70
_L50:
        as1[i1] = ((String) (obj));
        i1 = 48;
        obj = "cb\177\021[!6q\rZ&6z\rE0\177y\003\026*r-";
        byte0 = 47;
          goto _L70
_L51:
        as1[i1] = ((String) (obj));
        i1 = 49;
        obj = ".yb\nB&r";
        byte0 = 48;
          goto _L70
_L52:
        as1[i1] = ((String) (obj));
        i1 = 50;
        obj = "!dx\005R wd\020";
        byte0 = 49;
          goto _L70
_L53:
        as1[i1] = ((String) (obj));
        i1 = 51;
        obj = "!dx\005R wd\020";
        byte0 = 50;
          goto _L70
_L54:
        as1[i1] = ((String) (obj));
        i1 = 52;
        obj = "1y`;_'+";
        byte0 = 51;
          goto _L70
_L55:
        as1[i1] = ((String) (obj));
        i1 = 53;
        obj = "c}r\035\013";
        byte0 = 52;
          goto _L70
_L56:
        as1[i1] = ((String) (obj));
        i1 = 54;
        obj = "cf\177\013X&+";
        byte0 = 53;
          goto _L70
_L57:
        as1[i1] = ((String) (obj));
        i1 = 55;
        obj = "kxb\bZj";
        byte0 = 54;
          goto _L70
_L58:
        as1[i1] = ((String) (obj));
        i1 = 56;
        obj = "cxv\tS~";
        byte0 = 55;
          goto _L70
_L59:
        as1[i1] = ((String) (obj));
        i1 = 57;
        obj = "cxv\tS~";
        byte0 = 56;
          goto _L70
_L60:
        as1[i1] = ((String) (obj));
        i1 = 58;
        obj = "c\177d\023W~";
        byte0 = 57;
          goto _L70
_L61:
        as1[i1] = ((String) (obj));
        i1 = 59;
        obj = "kxb\bZj";
        byte0 = 58;
          goto _L70
_L62:
        as1[i1] = ((String) (obj));
        i1 = 60;
        obj = "cec\005B6e*";
        byte0 = 59;
          goto _L70
_L63:
        as1[i1] = ((String) (obj));
        i1 = 61;
        obj = "c|~\000\013";
        byte0 = 60;
          goto _L70
_L64:
        as1[i1] = ((String) (obj));
        i1 = 62;
        obj = "6fs\005B&F\177\013B,P~\bS0";
        byte0 = 61;
          goto _L70
_L65:
        as1[i1] = ((String) (obj));
        i1 = 63;
        obj = "6fs\005B&F\177\013B,P~\bS0";
        byte0 = 62;
          goto _L70
_L66:
        as1[i1] = ((String) (obj));
        i1 = 64;
        obj = " cd\020Y.Ie\rX$bx\nS";
        byte0 = 63;
          goto _L70
_L67:
        as1[i1] = ((String) (obj));
        i1 = 65;
        obj = "7sz\024";
        byte0 = 64;
          goto _L70
_L68:
        as1[i1] = ((String) (obj));
        i1 = 66;
        obj = " cd\020Y.Ie\rX$bx\nS";
        byte0 = 65;
          goto _L70
_L69:
        as1[i1] = ((String) (obj));
        R = as;
        obj = "\034\177s";
        byte0 = -1;
_L92:
        int j1;
        obj = ((String) (obj)).toCharArray();
        k1 = obj.length;
        j1 = 0;
_L105:
        if (k1 > j1) goto _L72; else goto _L71
_L71:
        obj = (new String(((char []) (obj)))).intern();
        byte0;
        JVM INSTR tableswitch 0 17: default 1636
    //                   0 1831
    //                   1 1843
    //                   2 1855
    //                   3 1867
    //                   4 1879
    //                   5 1891
    //                   6 1904
    //                   7 1917
    //                   8 1930
    //                   9 1943
    //                   10 1956
    //                   11 1969
    //                   12 1982
    //                   13 1995
    //                   14 2008
    //                   15 2021
    //                   16 2034
    //                   17 2047;
           goto _L73 _L74 _L75 _L76 _L77 _L78 _L79 _L80 _L81 _L82 _L83 _L84 _L85 _L86 _L87 _L88 _L89 _L90 _L91
_L73:
        m = ((String) (obj));
        obj = ")\177s";
        byte0 = 0;
          goto _L92
_L2:
        char c2 = obj[k1];
        k1 % 5;
        JVM INSTR tableswitch 0 3: default 1688
    //                   0 1711
    //                   1 1718
    //                   2 1725
    //                   3 1732;
           goto _L93 _L94 _L95 _L96 _L97
_L93:
        j1 = 54;
_L99:
        obj[k1] = (char)(j1 ^ c2);
        k1++;
          goto _L98
_L94:
        j1 = 67;
          goto _L99
_L95:
        j1 = 22;
          goto _L99
_L96:
        j1 = 23;
          goto _L99
_L97:
        j1 = 100;
          goto _L99
_L72:
        l1 = obj[j1];
        j1 % 5;
        JVM INSTR tableswitch 0 3: default 1780
    //                   0 1803
    //                   1 1810
    //                   2 1817
    //                   3 1824;
           goto _L100 _L101 _L102 _L103 _L104
_L100:
        i1 = 54;
_L106:
        obj[j1] = (char)(i1 ^ l1);
        j1++;
          goto _L105
_L101:
        i1 = 67;
          goto _L106
_L102:
        i1 = 22;
          goto _L106
_L103:
        i1 = 23;
          goto _L106
_L104:
        i1 = 100;
          goto _L106
_L74:
        J = ((String) (obj));
        obj = "*eH\023^\"bd\005F3Ib\027S1";
        byte0 = 1;
          goto _L92
_L75:
        w = ((String) (obj));
        obj = "0bv\020C0";
        byte0 = 2;
          goto _L92
_L76:
        D = ((String) (obj));
        obj = "-cz\006S1";
        byte0 = 3;
          goto _L92
_L77:
        o = ((String) (obj));
        obj = "1w`;U,xc\005U7I~\0";
        byte0 = 4;
          goto _L92
_L78:
        j = ((String) (obj));
        obj = "'\177d\024Z\"oH\nW.s";
        byte0 = 5;
          goto _L92
_L79:
        H = ((String) (obj));
        obj = "3~x\nS\034bn\024S";
        byte0 = 6;
          goto _L92
_L80:
        O = ((String) (obj));
        obj = "3~x\nS\034zv\006S/";
        byte0 = 7;
          goto _L92
_L81:
        v = ((String) (obj));
        obj = "6xd\001S-Iz\027Q\034ux\021X7";
        byte0 = 8;
          goto _L92
_L82:
        F = ((String) (obj));
        obj = "3~x\020Y\034bd";
        byte0 = 9;
          goto _L92
_L83:
        E = ((String) (obj));
        obj = "7~b\tT\034bd";
        byte0 = 10;
          goto _L92
_L84:
        y = ((String) (obj));
        obj = "3~x\020Y\034\177s;B*{r\027B\"{g";
        byte0 = 11;
          goto _L92
_L85:
        g = ((String) (obj));
        obj = "$\177a\001X\034xv\tS";
        byte0 = 12;
          goto _L92
_L86:
        A = ((String) (obj));
        obj = "%wz\rZ:Iy\005[&";
        byte0 = 13;
          goto _L92
_L87:
        k = ((String) (obj));
        obj = "4wH\nW.s";
        byte0 = 14;
          goto _L92
_L88:
        K = ((String) (obj));
        obj = "0ye\020i-wz\001";
        byte0 = 15;
          goto _L92
_L89:
        x = ((String) (obj));
        obj = "0bv\020C0Ic\r[&ec\005[3";
        byte0 = 16;
          goto _L92
_L90:
        I = ((String) (obj));
        obj = " w{\bW!\177{\rB:";
        byte0 = 17;
          goto _L92
_L91:
        r = ((String) (obj));
        s = (new String[] {
            m, J, w, D, o, j, H, O, v, F, 
            E, y, g, A, k, K, x, I, r
        });
        h = new HashMap();
        if (true) goto _L70; else goto _L107
_L107:
    }
}
