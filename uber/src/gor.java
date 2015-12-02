// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.os.AsyncTask;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONArray;

public final class gor
{

    private static WeakReference a;
    private static WeakReference b;

    static BitmapDrawable a(Context context, String s)
    {
        return b(context, s);
    }

    static List a(Context context)
    {
        return c(context);
    }

    static void a(Context context, gos gos)
    {
        gjz.a(context);
        gjz.a(gos);
        (new AsyncTask(context, new WeakReference(gos)) {

            final Context a;
            final WeakReference b;

            private transient Map a()
            {
                Object obj;
                Object obj1;
                String s;
                try
                {
                    obj1 = gor.a(a);
                }
                // Misplaced declaration of an exception variable
                catch (Object obj)
                {
                    return null;
                }
                if (obj1 == null)
                {
                    return null;
                }
                obj = new HashMap();
                for (obj1 = ((List) (obj1)).iterator(); ((Iterator) (obj1)).hasNext(); ((Map) (obj)).put(s, gor.a(a, s)))
                {
                    s = (String)((Iterator) (obj1)).next();
                }

                return ((Map) (obj));
            }

            private void a(Map map)
            {
                gos gos1 = (gos)b.get();
                if (gos1 != null)
                {
                    gos1.a(map);
                }
            }

            protected final Object doInBackground(Object aobj[])
            {
                return a();
            }

            protected final void onPostExecute(Object obj)
            {
                a((Map)obj);
            }

            
            {
                a = context;
                b = weakreference;
                super();
            }
        }).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new String[0]);
    }

    public static void a(Context context, Executor executor, String s, got got)
    {
        gjz.a(context);
        gjz.a(s);
        gjz.a(got);
        (new AsyncTask(context, s, new WeakReference(got)) {

            final Context a;
            final String b;
            final WeakReference c;

            private transient BitmapDrawable a()
            {
                return gor.a(a, b);
            }

            private void a(BitmapDrawable bitmapdrawable)
            {
                got got1 = (got)c.get();
                if (got1 != null)
                {
                    got1.a(bitmapdrawable, b);
                }
            }

            protected final Object doInBackground(Object aobj[])
            {
                return a();
            }

            protected final void onPostExecute(Object obj)
            {
                a((BitmapDrawable)obj);
            }

            
            {
                a = context;
                b = s;
                c = weakreference;
                super();
            }
        }).executeOnExecutor(executor, new String[0]);
    }

    private static Bitmap b(Context context)
    {
        if (a == null || a.get() == null)
        {
            android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
            options.inScaled = false;
            a = new WeakReference(BitmapFactory.decodeResource(context.getResources(), goi.ub__locale_flags, options));
        }
        return (Bitmap)a.get();
    }

    private static BitmapDrawable b(Context context, String s)
    {
        Bitmap bitmap;
        List list;
        int i;
        int j;
        try
        {
            bitmap = b(context);
            list = c(context);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return null;
        }
        if (list == null)
        {
            break MISSING_BLOCK_LABEL_116;
        }
        if (!list.contains(s.toLowerCase(Locale.US)))
        {
            break MISSING_BLOCK_LABEL_116;
        }
        i = bitmap.getWidth();
        j = (int)context.getResources().getDimension(goh.ub__locale_flag_size);
        s = Bitmap.createBitmap(bitmap, 0, list.indexOf(s.toLowerCase(Locale.US)) * i, i, i);
        if (j <= i)
        {
            break MISSING_BLOCK_LABEL_95;
        }
        s = Bitmap.createScaledBitmap(s, j, j, false);
        context = new BitmapDrawable(context.getResources(), s);
        return context;
        return null;
    }

    private static List c(Context context)
    {
        if (b != null && b.get() != null)
        {
            return (List)b.get();
        }
        context = context.getResources().openRawResource(gol.ub__locale_flag_index);
        JSONArray jsonarray;
        ArrayList arraylist;
        jsonarray = new JSONArray(gkq.c(context));
        arraylist = new ArrayList();
        int i = 0;
_L2:
        if (i >= jsonarray.length())
        {
            break; /* Loop/switch isn't completed */
        }
        arraylist.add(jsonarray.getString(i));
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        b = new WeakReference(arraylist);
        gkq.a(context);
        return arraylist;
        context;
        context = null;
_L6:
        gkq.a(context);
        return null;
        Object obj;
        obj;
        context = null;
_L4:
        gkq.a(context);
        throw obj;
        obj;
        if (true) goto _L4; else goto _L3
_L3:
        obj;
        if (true) goto _L6; else goto _L5
_L5:
    }
}
