// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.e;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Environment;
import android.util.Log;
import com.gau.go.launcherex.gowidget.c.g;
import com.gau.go.launcherex.gowidget.download.c;
import com.gau.go.launcherex.gowidget.download.e;
import com.gau.go.launcherex.gowidget.framework.GoWidgetApplication;
import com.go.weatherex.sidebar.shuffle.b;
import com.jiubang.commerce.utils.d;
import java.io.File;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

// Referenced classes of package com.go.weatherex.e:
//            b

public class a
{

    public static final String c = (new StringBuilder()).append(Environment.getExternalStorageDirectory()).append("/GOWeatherEX").append("/festivalpic/").toString();
    private static a d;
    public String a;
    public String b;
    private String e;
    private String f;

    public a()
    {
    }

    public static Bitmap a(Bitmap bitmap, int i, int j, boolean flag, int k)
    {
        int i1 = 0;
        if (bitmap != null)
        {
            int l = bitmap.getWidth();
            int j1 = bitmap.getHeight();
            if (l != i || j1 != j)
            {
                Matrix matrix = new Matrix();
                float f1;
                if (flag)
                {
                    float f2 = (float)i / (float)l;
                    f1 = f2;
                    if ((float)j1 * f2 < (float)j)
                    {
                        f1 = (float)j / (float)j1;
                    }
                } else
                {
                    float f3 = (float)j / (float)j1;
                    f1 = f3;
                    if ((float)l * f3 < (float)i)
                    {
                        f1 = (float)i / (float)l;
                    }
                }
                matrix.postScale(f1, f1);
                if ((float)l * f1 - (float)i > 0.0F || (float)j1 * f1 - (float)j > 0.0F)
                {
                    bitmap = Bitmap.createBitmap(bitmap, 0, 0, l, j1, matrix, true);
                    if ((float)l * f1 - (float)i > 0.0F)
                    {
                        l = (int)((float)l * f1 - (float)i) / 2;
                    } else
                    {
                        l = 0;
                    }
                    if ((float)j1 * f1 - (float)j > 0.0F)
                    {
                        i1 = (int)((float)j1 * f1 - (float)j) / 2;
                    }
                    return Bitmap.createBitmap(bitmap, l, i1, i, j - com.jiubang.commerce.utils.d.a(k));
                } else
                {
                    return Bitmap.createBitmap(bitmap, 0, 0, l, j1, matrix, true);
                }
            }
        }
        return bitmap;
    }

    public static a a()
    {
        com/go/weatherex/e/a;
        JVM INSTR monitorenter ;
        a a1;
        if (d == null)
        {
            d = new a();
        }
        a1 = d;
        com/go/weatherex/e/a;
        JVM INSTR monitorexit ;
        return a1;
        Exception exception;
        exception;
        throw exception;
    }

    static String a(a a1)
    {
        return a1.e;
    }

    static String b(a a1)
    {
        return a1.f;
    }

    public Bitmap a(String s, String s1, int i)
    {
        Object obj = null;
        if (e != null)
        {
            break MISSING_BLOCK_LABEL_129;
        }
        String s2 = s1;
        if (s1.length() > 2)
        {
            s2 = s1.substring(s1.lastIndexOf("/") + 1);
        }
        if (s2.length() > 2 && s2.contains(";"))
        {
            a = s2.substring(0, s2.indexOf(";"));
            b = s2.substring(s2.indexOf(";") + 1, s2.lastIndexOf("."));
        }
        e = (new StringBuilder()).append(a).append(";").append(b).toString();
        s1 = BitmapFactory.decodeFile((new StringBuilder()).append(c).append(e).append(File.separator).append(s).append(".png").toString());
        s = obj;
        if (s1 != null)
        {
            try
            {
                s = a(((Bitmap) (s1)), b.d, (b.d * s1.getHeight()) / s1.getWidth(), true, i);
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                return null;
            }
        }
        return s;
    }

    public void a(String s)
    {
        Object obj;
        String s1;
        Object obj1;
        StringBuilder stringbuilder;
        boolean flag;
        if (s.length() > 2)
        {
            obj = s.substring(s.lastIndexOf("/") + 1);
        } else
        {
            obj = s;
        }
        if (((String) (obj)).length() > 2 && ((String) (obj)).contains(";"))
        {
            a = ((String) (obj)).substring(0, ((String) (obj)).indexOf(";"));
            b = ((String) (obj)).substring(((String) (obj)).indexOf(";") + 1, ((String) (obj)).lastIndexOf("."));
        }
        flag = s.equals("http://goappdl.goforandroid.com/dynamic/ValueAddedService151102/2014.1.1;2014.12.1.zip");
        if (flag)
        {
            e = (new StringBuilder()).append(a).append(";").append(b).toString();
        } else
        {
            f = (new StringBuilder()).append(a).append(";").append(b).toString();
        }
        s1 = (new StringBuilder()).append(e).append(".tmp").toString();
        obj1 = (new StringBuilder()).append(c);
        if (flag)
        {
            obj = e;
        } else
        {
            obj = f;
        }
        obj1 = ((StringBuilder) (obj1)).append(((String) (obj))).append(File.separator).append(".tmp").toString();
        stringbuilder = (new StringBuilder()).append(c);
        if (flag)
        {
            obj = e;
        } else
        {
            obj = f;
        }
        obj = new File(stringbuilder.append(((String) (obj))).append(File.separator).toString());
        if (((File) (obj)).exists() && ((File) (obj)).listFiles().length > 3 && g.b(GoWidgetApplication.b()))
        {
            Log.i("lky", "exists unzip file");
        } else
        {
            c c1 = com.gau.go.launcherex.gowidget.download.c.a(GoWidgetApplication.b());
            e e1 = null;
            if (0x8000000000000000L != 0x8000000000000000L)
            {
                e1 = c1.d(0x8000000000000000L);
            }
            if (e1 == null)
            {
                s = new e(0x8000000000000000L, s, s1, 0L, 0, ((String) (obj1)), "");
                s.a(new com.go.weatherex.e.b(this, flag));
                c1.a(s);
                return;
            }
            if (e1.h() == 7 || e1.h() == 4)
            {
                e1.b(s1);
                e1.a(s);
                c1.b(e1);
                return;
            }
        }
    }

    public Drawable b(String s)
    {
        Object obj = null;
        Drawable drawable = obj;
        if (b())
        {
            drawable = obj;
            if (f != null)
            {
                drawable = Drawable.createFromPath((new StringBuilder()).append(c).append(f).append(File.separator).append(s).append(".png").toString());
            }
        }
        return drawable;
    }

    public boolean b()
    {
        Object obj;
        if (a == null || b == null)
        {
            String s = "http://goappdl.goforandroid.com/dynamic/Thanksgiving2015/2015.11.25;2015.11.27.zip";
            if ("http://goappdl.goforandroid.com/dynamic/Thanksgiving2015/2015.11.25;2015.11.27.zip".length() > 2)
            {
                s = "http://goappdl.goforandroid.com/dynamic/Thanksgiving2015/2015.11.25;2015.11.27.zip".substring("http://goappdl.goforandroid.com/dynamic/Thanksgiving2015/2015.11.25;2015.11.27.zip".lastIndexOf("/") + 1);
            }
            if (s.length() > 2 && s.contains(";"))
            {
                a = s.substring(0, s.indexOf(";"));
                b = s.substring(s.indexOf(";") + 1, s.lastIndexOf("."));
            }
            f = (new StringBuilder()).append(a).append(";").append(b).toString();
        }
        obj = new SimpleDateFormat("yyyy.MM.dd");
        ((DateFormat) (obj)).setTimeZone(TimeZone.getTimeZone("GMT+8"));
        boolean flag;
        Date date = ((DateFormat) (obj)).parse(a);
        Date date1 = ((DateFormat) (obj)).parse(((DateFormat) (obj)).format(new Date()));
        obj = ((DateFormat) (obj)).parse(b);
        if (date1.before(((Date) (obj))) && date1.after(date) || date1.equals(obj))
        {
            break MISSING_BLOCK_LABEL_217;
        }
        flag = date1.equals(date);
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_224;
        }
        return true;
        ParseException parseexception;
        parseexception;
        parseexception.printStackTrace();
        return false;
    }

    public Bitmap c(String s)
    {
        if (b() && f != null)
        {
            Drawable drawable1 = Drawable.createFromPath((new StringBuilder()).append(c).append(f).append(File.separator).append(s).append(".png").toString());
            Drawable drawable = drawable1;
            if (drawable1 == null)
            {
                drawable = Drawable.createFromPath((new StringBuilder()).append(c).append(f).append(File.separator).append(s).append(".jpg").toString());
            }
            if (drawable != null)
            {
                return ((BitmapDrawable)drawable).getBitmap();
            }
        }
        return null;
    }

    public boolean d(String s)
    {
        boolean flag1 = false;
        if (a == null || b == null)
        {
            String s1 = s;
            if (s.length() > 2)
            {
                s1 = s.substring(s.lastIndexOf("/") + 1);
            }
            if (s1.length() > 2 && s1.contains(";"))
            {
                a = s1.substring(0, s1.indexOf(";"));
                b = s1.substring(s1.indexOf(";") + 1, s1.lastIndexOf("."));
            }
            e = (new StringBuilder()).append(a).append(";").append(b).toString();
        }
        s = new File((new StringBuilder()).append(c).append(e).append(File.separator).toString());
        boolean flag = flag1;
        if (s.exists())
        {
            flag = flag1;
            if (s.listFiles().length > 4)
            {
                Log.i("lky", "exists unzip file");
                flag = true;
            }
        }
        return flag;
    }

}
