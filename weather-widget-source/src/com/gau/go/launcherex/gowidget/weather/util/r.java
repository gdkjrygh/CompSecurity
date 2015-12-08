// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.util;

import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.text.format.DateFormat;
import android.text.format.Time;
import android.view.View;
import android.widget.Toast;
import com.gau.go.launcherex.gowidget.weather.model.ForecastBean;
import com.gtp.a.a.b.c;
import com.jiubang.playsdk.f.k;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

public class r
{

    public static float a(float f)
    {
        if (f < 10000F)
        {
            return f;
        } else
        {
            return -10000F;
        }
    }

    public static float a(float f, float f1, float f2)
    {
        return Math.max(Math.min(f, f2), f1);
    }

    public static int a(int i, float f)
    {
        return (int)((float)i * f);
    }

    public static int a(int i, boolean flag)
    {
        switch (i)
        {
        default:
            return 0;

        case 2: // '\002'
            return !flag ? 2 : 1;

        case 3: // '\003'
            return !flag ? 4 : 3;

        case 4: // '\004'
            return 5;

        case 5: // '\005'
            return 6;

        case 6: // '\006'
            return 7;

        case 7: // '\007'
            return 8;

        case 8: // '\b'
            return 9;
        }
    }

    public static int a(int i, int ai[])
    {
        if (ai == null || ai.length < 10) goto _L2; else goto _L1
_L1:
        i;
        JVM INSTR tableswitch 0 9: default 68
    //                   0 92
    //                   1 99
    //                   2 106
    //                   3 113
    //                   4 120
    //                   5 127
    //                   6 134
    //                   7 142
    //                   8 150
    //                   9 158;
           goto _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13
_L3:
        i = ai[0];
_L15:
        int j = i;
        if (i == 0)
        {
            j = i;
            if (ai[0] != 0)
            {
                j = ai[0];
            }
        }
        return j;
_L4:
        i = ai[0];
        continue; /* Loop/switch isn't completed */
_L5:
        i = ai[1];
        continue; /* Loop/switch isn't completed */
_L6:
        i = ai[2];
        continue; /* Loop/switch isn't completed */
_L7:
        i = ai[3];
        continue; /* Loop/switch isn't completed */
_L8:
        i = ai[4];
        continue; /* Loop/switch isn't completed */
_L9:
        i = ai[5];
        continue; /* Loop/switch isn't completed */
_L10:
        i = ai[6];
        continue; /* Loop/switch isn't completed */
_L11:
        i = ai[7];
        continue; /* Loop/switch isn't completed */
_L12:
        i = ai[8];
        continue; /* Loop/switch isn't completed */
_L13:
        i = ai[9];
        continue; /* Loop/switch isn't completed */
_L2:
        i = 0;
        if (true) goto _L15; else goto _L14
_L14:
    }

    public static int a(Context context)
    {
        context = context.getResources().getConfiguration().locale;
        return context.getCountry().indexOf("CN") == -1 || !context.getLanguage().equalsIgnoreCase("zh") ? 2 : 1;
    }

    public static int a(Bundle bundle, String s)
    {
        int i = 0;
        int j = Integer.parseInt(bundle.getString(s));
        i = j;
_L2:
        return i;
        bundle;
        if (com.gtp.a.a.b.c.a())
        {
            bundle.printStackTrace();
            return 0;
        }
        if (true) goto _L2; else goto _L1
_L1:
    }

    public static int a(boolean flag, String s)
    {
        int i;
        byte byte0;
        i = -1;
        byte0 = 6;
        if (!a(s)) goto _L2; else goto _L1
_L1:
        int j;
        int l;
        try
        {
            s = s.split(":");
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s = null;
        }
        if (s == null || s.length != 2) goto _L4; else goto _L3
_L3:
        j = Integer.parseInt(s[0]);
        l = Integer.parseInt(s[1]);
        i = l;
_L7:
        Exception exception;
        if (i > 0)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        i += j;
        if (i != 24) goto _L6; else goto _L5
_L5:
        i = 0;
_L10:
        return i;
        exception;
        l = -1;
_L13:
label0:
        {
            try
            {
                s[1] = s[1].toUpperCase();
                if (!s[1].contains("AM"))
                {
                    break label0;
                }
                i = Integer.parseInt(s[1].substring(0, s[1].indexOf("AM")).trim());
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                if (flag)
                {
                    i = 6;
                } else
                {
                    i = 18;
                }
                return i;
            }
            j = l;
        }
          goto _L7
        j = l;
        if (!s[1].contains("PM")) goto _L7; else goto _L8
_L8:
        i = Integer.parseInt(s[1].substring(0, s[1].indexOf("PM")).trim());
        j = l + 12;
          goto _L7
_L6:
        if (i <= 24)
        {
            break MISSING_BLOCK_LABEL_241;
        }
        i = byte0;
        if (flag) goto _L10; else goto _L9
_L9:
        return 18;
_L4:
        i = byte0;
        if (flag) goto _L10; else goto _L11
_L11:
        return 18;
_L2:
        i = byte0;
        if (flag) goto _L10; else goto _L12
_L12:
        return 18;
        Exception exception1;
        exception1;
        l = j;
          goto _L13
        return i;
    }

    public static int a(int ai[], int i, boolean flag)
    {
        int j = ai[0];
        switch (i)
        {
        default:
            return ai[0];

        case 2: // '\002'
            if (flag)
            {
                return ai[1];
            } else
            {
                return ai[2];
            }

        case 3: // '\003'
            if (flag)
            {
                return ai[3];
            } else
            {
                return ai[4];
            }

        case 4: // '\004'
            return ai[5];

        case 5: // '\005'
            return ai[6];

        case 6: // '\006'
            return ai[7];

        case 7: // '\007'
            return ai[8];

        case 8: // '\b'
            return ai[9];
        }
    }

    public static Intent a(Context context, String s, String s1)
    {
        Object obj;
        boolean flag;
        boolean flag1;
        flag1 = false;
        obj = null;
        flag = flag1;
        if (TextUtils.isEmpty(s))
        {
            break MISSING_BLOCK_LABEL_29;
        }
        context.getPackageManager().getPackageInfo(s, 0);
        flag = true;
_L2:
        context = obj;
        if (flag)
        {
            context = obj;
            if (!TextUtils.isEmpty(s1))
            {
                context = new Intent("android.intent.action.MAIN");
                context.addFlags(0x10000000);
                context.setComponent(new ComponentName(s, s1));
            }
        }
        return context;
        context;
        flag = flag1;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public static Bitmap a(Bitmap bitmap, float f)
    {
        Matrix matrix = new Matrix();
        matrix.postScale(f, f);
        return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
    }

    public static Bitmap a(Bitmap abitmap[], int i)
    {
        if (abitmap == null || abitmap.length == 0)
        {
            return null;
        }
        if (i >= abitmap.length)
        {
            return abitmap[0];
        } else
        {
            return abitmap[i];
        }
    }

    public static String a(int i)
    {
        Object obj = new Time();
        ((Time) (obj)).setToNow();
        if (i == 2)
        {
            obj = ((Time) (obj)).format("%m/%d/%Y");
            return obj + " ";
        }
        if (i == 3)
        {
            obj = ((Time) (obj)).format("%d/%m/%Y");
            return obj + " ";
        } else
        {
            obj = ((Time) (obj)).format("%Y/%m/%d");
            return obj + " ";
        }
    }

    public static String a(int i, int j, int l, boolean flag, int i1)
    {
        String s;
        String s1;
        if (j < 10)
        {
            s = (new StringBuilder()).append("0").append(j).toString();
        } else
        {
            s = String.valueOf(j);
        }
        if (l < 10)
        {
            s1 = (new StringBuilder()).append("0").append(l).toString();
        } else
        {
            s1 = String.valueOf(l);
        }
        switch (i1)
        {
        default:
            if (flag)
            {
                return "%Y/%m/%d".replaceFirst("%Y", String.valueOf(i)).replaceFirst("%m", s).replaceFirst("%d", s1);
            } else
            {
                return "%m/%d".replaceFirst("%m", s).replaceFirst("%d", s1);
            }

        case 2: // '\002'
            if (flag)
            {
                return "%m/%d/%Y".replaceFirst("%Y", String.valueOf(i)).replaceFirst("%m", s).replaceFirst("%d", s1);
            } else
            {
                return "%m/%d".replaceFirst("%m", s).replaceFirst("%d", s1);
            }

        case 3: // '\003'
            break;
        }
        if (flag)
        {
            return "%d/%m/%Y".replaceFirst("%Y", String.valueOf(i)).replaceFirst("%m", s).replaceFirst("%d", s1);
        } else
        {
            return "%d/%m".replaceFirst("%m", s).replaceFirst("%d", s1);
        }
    }

    public static String a(Context context, long l)
    {
        if (l == -10000L || l == 0L)
        {
            return "-10000";
        }
        long l1;
        long l2;
        l1 = Calendar.getInstance().getTimeInMillis() - l;
        l2 = l1 / 0x36ee80L;
        Object obj;
        SimpleDateFormat simpledateformat;
        if (b(context))
        {
            obj = "HH:mm";
        } else
        {
            obj = "hh:mm a";
        }
        simpledateformat = new SimpleDateFormat(((String) (obj)), Locale.ENGLISH);
        if (l2 < 0L)
        {
            break MISSING_BLOCK_LABEL_577;
        }
        if (l2 >= 24L)
        {
            break MISSING_BLOCK_LABEL_226;
        }
        if (l2 != 0L)
        {
            break MISSING_BLOCK_LABEL_163;
        }
        l = l1 / 60000L;
        if (l < 1L)
        {
            try
            {
                return context.getString(0x7f08029e);
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                context.printStackTrace();
            }
            break MISSING_BLOCK_LABEL_625;
        }
        if (l != 1L)
        {
            break MISSING_BLOCK_LABEL_134;
        }
        return context.getString(0x7f08029f, new Object[] {
            Long.valueOf(l), ""
        });
        return context.getString(0x7f08029f, new Object[] {
            Long.valueOf(l), context.getString(0x7f0802a4)
        });
        if (l2 != 1L)
        {
            break MISSING_BLOCK_LABEL_196;
        }
        return context.getString(0x7f0802a0, new Object[] {
            Long.valueOf(l2), ""
        });
        return context.getString(0x7f0802a0, new Object[] {
            Long.valueOf(l2), context.getString(0x7f0802a4)
        });
        if (l2 >= 48L)
        {
            break MISSING_BLOCK_LABEL_277;
        }
        obj = new Date(l);
        return (new StringBuilder()).append(context.getString(0x7f08029b)).append(simpledateformat.format(((Date) (obj))).toLowerCase()).toString();
        if (l2 >= 168L)
        {
            break MISSING_BLOCK_LABEL_349;
        }
        obj = new Date(l);
        l = l2 / 24L;
        return (new StringBuilder()).append(String.format(context.getString(0x7f0802a3), new Object[] {
            Long.valueOf(l)
        })).append(simpledateformat.format(((Date) (obj))).toLowerCase()).toString();
        if (l2 >= 720L)
        {
            break MISSING_BLOCK_LABEL_434;
        }
        l = l2 / 168L;
        if (l != 1L)
        {
            break MISSING_BLOCK_LABEL_399;
        }
        return String.format(context.getString(0x7f0802a2), new Object[] {
            Long.valueOf(l), ""
        });
        return String.format(context.getText(0x7f0802a2).toString(), new Object[] {
            Long.valueOf(l), context.getString(0x7f0802a4)
        });
        if (l2 >= 8760L)
        {
            break MISSING_BLOCK_LABEL_516;
        }
        l = l2 / 720L;
        if (l != 1L)
        {
            break MISSING_BLOCK_LABEL_484;
        }
        return String.format(context.getString(0x7f0802a1), new Object[] {
            Long.valueOf(l), ""
        });
        return String.format(context.getString(0x7f0802a1), new Object[] {
            Long.valueOf(l), context.getString(0x7f0802a4)
        });
        obj = new Date(l);
        return (new StringBuilder()).append(String.format(context.getString(0x7f0802a3), new Object[] {
            Long.valueOf(l2 / 24L)
        })).append(simpledateformat.format(((Date) (obj))).toLowerCase()).toString();
        context = new Date(l);
        simpledateformat.applyPattern((new StringBuilder()).append("yyyy/MM/dd ").append(((String) (obj))).toString());
        context = simpledateformat.format(context);
        return context;
        return "N/A";
    }

    public static ArrayList a(List list, Time time, boolean flag)
    {
        ArrayList arraylist = new ArrayList();
        byte byte0;
        if (!flag)
        {
            byte0 = 6;
        } else
        {
            byte0 = 10;
        }
        if (list != null)
        {
            Iterator iterator = list.iterator();
            boolean flag2;
            for (boolean flag1 = false; iterator.hasNext(); flag1 = flag2)
            {
                ForecastBean forecastbean = (ForecastBean)iterator.next();
                flag2 = flag1;
                if (forecastbean == null)
                {
                    continue;
                }
                flag2 = flag1;
                if (forecastbean.e() == -10000)
                {
                    continue;
                }
                flag2 = flag1;
                if (forecastbean.f() == -10000)
                {
                    continue;
                }
                flag2 = flag1;
                if (forecastbean.g() == -10000)
                {
                    continue;
                }
                if (a(forecastbean.e(), forecastbean.f(), forecastbean.g(), time))
                {
                    flag1 = true;
                }
                flag2 = flag1;
                if (!flag1)
                {
                    continue;
                }
                flag2 = flag1;
                if (arraylist.size() < byte0)
                {
                    arraylist.add(forecastbean);
                    flag2 = flag1;
                }
            }

        }
        if (arraylist.isEmpty())
        {
            Time time1 = new Time();
            if (list != null && list.size() > 0)
            {
                ForecastBean forecastbean1 = (ForecastBean)list.get(0);
                time1.set(forecastbean1.g(), forecastbean1.f() - 1, forecastbean1.e());
                if (time1.after(time))
                {
                    list = list.iterator();
                    do
                    {
                        if (!list.hasNext())
                        {
                            break;
                        }
                        time = (ForecastBean)list.next();
                        if (arraylist.size() < byte0)
                        {
                            arraylist.add(time);
                        }
                    } while (true);
                }
            }
        }
        return arraylist;
    }

    public static void a(Context context, boolean flag)
    {
        context = new k(context, "first_in_weather");
        context.b("is_first_in", flag);
        context.a();
    }

    public static void a(File file)
    {
        if (file != null && file.exists())
        {
            if (file.isFile())
            {
                file.delete();
            } else
            if (file.isDirectory())
            {
                File afile[] = file.listFiles();
                if (afile != null)
                {
                    for (int i = 0; i < afile.length; i++)
                    {
                        a(afile[i]);
                    }

                }
                file.delete();
                return;
            }
        }
    }

    public static boolean a(int i, int j, int l)
    {
        return i >= j && i < l;
    }

    public static boolean a(int i, int j, int l, Time time)
    {
        return time.year == i && time.month == j - 1 && time.monthDay == l;
    }

    public static boolean a(Context context, String s)
    {
        boolean flag = false;
        if (!TextUtils.isEmpty(s))
        {
            try
            {
                context.getPackageManager().getPackageInfo(s, 0);
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                return false;
            }
            flag = true;
        }
        return flag;
    }

    public static boolean a(Context context, String s, int i)
    {
        Object obj;
        Object obj1;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        boolean flag1;
        obj2 = null;
        obj3 = null;
        obj1 = null;
        obj4 = null;
        obj = null;
        flag1 = true;
        s = new File(context.getFilesDir(), s);
        if (!s.exists())
        {
            s.mkdirs();
        }
        obj5 = context.getResources().getResourceEntryName(i);
        obj5 = new File(s.getPath(), ((String) (obj5)));
        if (((File) (obj5)).exists())
        {
            ((File) (obj5)).delete();
        }
        context = context.getResources().openRawResource(i);
        obj = obj4;
        s = context;
        obj1 = new FileOutputStream(((File) (obj5)));
        s = new byte[8192];
_L3:
        i = context.read(s);
        if (i <= 0) goto _L2; else goto _L1
_L1:
        ((FileOutputStream) (obj1)).write(s, 0, i);
          goto _L3
        s;
_L10:
        if (com.gtp.a.a.b.c.a())
        {
            s.printStackTrace();
        }
        boolean flag;
        if (obj1 != null)
        {
            try
            {
                ((FileOutputStream) (obj1)).close();
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                if (com.gtp.a.a.b.c.a())
                {
                    s.printStackTrace();
                }
            }
        }
        if (context != null)
        {
            try
            {
                context.close();
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                if (com.gtp.a.a.b.c.a())
                {
                    context.printStackTrace();
                }
            }
        }
        flag = false;
_L5:
        return flag;
        obj1;
        context = null;
_L8:
        obj = obj2;
        s = context;
        if (!com.gtp.a.a.b.c.a())
        {
            break MISSING_BLOCK_LABEL_193;
        }
        obj = obj2;
        s = context;
        ((FileNotFoundException) (obj1)).printStackTrace();
        if (obj2 != null)
        {
            try
            {
                ((FileOutputStream) (obj2)).close();
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                if (com.gtp.a.a.b.c.a())
                {
                    s.printStackTrace();
                }
            }
        }
        if (context != null)
        {
            try
            {
                context.close();
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                if (com.gtp.a.a.b.c.a())
                {
                    context.printStackTrace();
                }
            }
        }
        return false;
        obj1;
        context = null;
        obj2 = obj3;
_L7:
        obj = obj2;
        s = context;
        if (!com.gtp.a.a.b.c.a())
        {
            break MISSING_BLOCK_LABEL_242;
        }
        obj = obj2;
        s = context;
        ((IOException) (obj1)).printStackTrace();
        if (obj2 != null)
        {
            try
            {
                ((FileOutputStream) (obj2)).close();
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                if (com.gtp.a.a.b.c.a())
                {
                    s.printStackTrace();
                }
            }
        }
        if (context != null)
        {
            try
            {
                context.close();
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                if (com.gtp.a.a.b.c.a())
                {
                    context.printStackTrace();
                }
            }
        }
        return false;
        s;
        context = null;
        obj = obj1;
        obj1 = s;
_L6:
        if (obj != null)
        {
            try
            {
                ((FileOutputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                if (com.gtp.a.a.b.c.a())
                {
                    s.printStackTrace();
                }
            }
        }
        if (context != null)
        {
            try
            {
                context.close();
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                if (com.gtp.a.a.b.c.a())
                {
                    context.printStackTrace();
                }
            }
        }
        throw obj1;
_L2:
        if (obj1 != null)
        {
            try
            {
                ((FileOutputStream) (obj1)).close();
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                if (com.gtp.a.a.b.c.a())
                {
                    s.printStackTrace();
                }
            }
        }
        flag = flag1;
        if (context == null) goto _L5; else goto _L4
_L4:
        context.close();
        return true;
        context;
        flag = flag1;
        if (com.gtp.a.a.b.c.a())
        {
            context.printStackTrace();
            return true;
        }
          goto _L5
        obj1;
        context = s;
          goto _L6
        s;
        obj = obj1;
        obj1 = s;
          goto _L6
        s;
        obj = obj1;
        obj1 = s;
          goto _L6
        obj1;
        obj2 = obj3;
          goto _L7
        s;
        obj2 = obj1;
        obj1 = s;
          goto _L7
        obj1;
          goto _L8
        s;
        obj2 = obj1;
        obj1 = s;
          goto _L8
        s;
        obj1 = null;
        context = ((Context) (obj));
        continue; /* Loop/switch isn't completed */
        s;
        obj1 = null;
        if (true) goto _L10; else goto _L9
_L9:
    }

    public static final boolean a(View view)
    {
        return a(view, 800);
    }

    public static final boolean a(View view, int i)
    {
        Object obj = view.getTag();
        long l;
        long l1;
        if (obj != null)
        {
            l = ((Long)obj).longValue();
        } else
        {
            l = 0L;
        }
        l1 = SystemClock.elapsedRealtime();
        if (l1 - l < (long)i && l1 > l)
        {
            return false;
        } else
        {
            view.setTag(Long.valueOf(l1));
            return true;
        }
    }

    public static boolean a(String s)
    {
        return s != null && !"".equals(s) && !"--".equals(s) && !s.contains("N/A") && !"-10000".equals(s);
    }

    public static boolean a(String s, String s1)
    {
        int i;
        int j;
        int l;
        int i1;
        Calendar calendar = Calendar.getInstance();
        i = calendar.get(1);
        j = calendar.get(2) + 1;
        l = calendar.get(5);
        i1 = calendar.get(11);
        if (a(s) && a(s1)) goto _L2; else goto _L1
_L1:
        if (i1 < 6 || i1 >= 18) goto _L4; else goto _L3
_L3:
        return true;
_L4:
        return false;
_L2:
        try
        {
            SimpleDateFormat simpledateformat = new SimpleDateFormat("yy:MM:dd:hh:mm");
            Date date = new Date();
            s = simpledateformat.parse((new StringBuilder()).append(i).append(":").append(j).append(":").append(l).append(":").append(s).toString());
            s1 = simpledateformat.parse((new StringBuilder()).append(i).append(":").append(j).append(":").append(l).append(":").append(s1).toString());
            if (date.compareTo(s) < 0)
            {
                break; /* Loop/switch isn't completed */
            }
            i = date.compareTo(s1);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
            return true;
        }
        if (i < 0) goto _L3; else goto _L5
_L5:
        return false;
    }

    public static boolean a(String s, String s1, Time time)
    {
        int i;
        int j;
        int l;
        int i1;
        i = time.year;
        j = time.month + 1;
        l = time.monthDay;
        i1 = time.hour;
        if (a(s) && a(s1)) goto _L2; else goto _L1
_L1:
        if (i1 < 6 || i1 >= 18) goto _L4; else goto _L3
_L3:
        return true;
_L4:
        return false;
_L2:
        try
        {
            SimpleDateFormat simpledateformat = new SimpleDateFormat("yy:MM:dd:hh:mm");
            Date date = new Date();
            date.setTime(time.toMillis(false));
            s = simpledateformat.parse((new StringBuilder()).append(i).append(":").append(j).append(":").append(l).append(":").append(s).toString());
            s1 = simpledateformat.parse((new StringBuilder()).append(i).append(":").append(j).append(":").append(l).append(":").append(s1).toString());
            if (date.compareTo(s) < 0)
            {
                break; /* Loop/switch isn't completed */
            }
            i = date.compareTo(s1);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
            return true;
        }
        if (i < 0) goto _L3; else goto _L5
_L5:
        return false;
    }

    public static boolean a(double ad[])
    {
        return ad != null && ad.length == 2 && ad[0] != -10000D && ad[1] != -10000D;
    }

    public static int b(int i)
    {
        switch (i)
        {
        default:
            return 1;

        case 0: // '\0'
            return 2;

        case 1: // '\001'
            return 3;

        case 2: // '\002'
            return 4;

        case 3: // '\003'
            return 7;

        case 4: // '\004'
            return 5;

        case 5: // '\005'
            return 6;
        }
    }

    public static int b(int i, int j, int l)
    {
        byte byte0 = 7;
        int i1 = byte0;
        if (i != -10000)
        {
            i1 = byte0;
            if (j != -10000)
            {
                i1 = byte0;
                if (l != -10000)
                {
                    Time time = new Time();
                    time.set(l, j - 1, i);
                    time.normalize(false);
                    i1 = time.weekDay;
                }
            }
        }
        return i1;
    }

    public static long b(File file)
    {
        long l = 0L;
        long l1;
        if (file.isDirectory())
        {
            file = file.listFiles();
            l1 = l;
            if (file != null)
            {
                int j = file.length;
                int i = 0;
                do
                {
                    l1 = l;
                    if (i >= j)
                    {
                        break;
                    }
                    l1 = b(file[i]);
                    i++;
                    l = l1 + l;
                } while (true);
            }
        } else
        {
            l1 = file.length();
        }
        return l1;
    }

    public static SQLiteDatabase b(Context context, String s, int i)
    {
        File file = new File(context.getFilesDir(), (new StringBuilder()).append(s).append(File.separator).append(context.getResources().getResourceEntryName(i)).toString());
        boolean flag;
        if (!file.exists())
        {
            flag = a(context, s, i);
        } else
        {
            flag = true;
        }
        if (!flag)
        {
            return null;
        } else
        {
            return SQLiteDatabase.openOrCreateDatabase(file, null);
        }
    }

    public static String b(String s)
    {
        Object obj = new SimpleDateFormat("yyyy/MM/dd HH:mm Z");
        int i;
        int j;
        long l;
        long l1;
        try
        {
            s = ((SimpleDateFormat) (obj)).parse(s);
            obj = Calendar.getInstance();
            i = ((Calendar) (obj)).get(15);
            j = ((Calendar) (obj)).get(16);
            l = s.getTime();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
            return "--";
        }
        l1 = (i + j) * 2;
        return String.valueOf(l - l1);
    }

    public static void b(Context context, String s, String s1)
    {
        s = new Intent("android.intent.action.VIEW", Uri.parse(s));
        s.setPackage("com.android.vending");
        s.setFlags(0x10000000);
        try
        {
            context.startActivity(s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s = new Intent("android.intent.action.VIEW", Uri.parse((new StringBuilder()).append("https://play.google.com/store/apps/details?id=").append(s1).toString()));
        }
        s.setFlags(0x10000000);
        try
        {
            context.startActivity(s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Toast.makeText(context, 0x7f0801e0, 0).show();
        }
    }

    public static boolean b(float f)
    {
        return f != -10000F;
    }

    public static boolean b(Context context)
    {
        return DateFormat.is24HourFormat(context);
    }

    public static int c(int i)
    {
        switch (i)
        {
        case 17: // '\021'
        default:
            return 1;

        case 0: // '\0'
            return 2;

        case 1: // '\001'
            return 7;

        case 2: // '\002'
            return 15;

        case 3: // '\003'
            return 11;

        case 4: // '\004'
            return 3;

        case 5: // '\005'
            return 5;

        case 6: // '\006'
            return 17;

        case 7: // '\007'
            return 9;

        case 8: // '\b'
            return 13;

        case 9: // '\t'
            return 8;

        case 10: // '\n'
            return 10;

        case 11: // '\013'
            return 6;

        case 12: // '\f'
            return 4;

        case 13: // '\r'
            return 14;

        case 14: // '\016'
            return 12;

        case 15: // '\017'
            return 16;

        case 16: // '\020'
            return 18;
        }
    }

    public static boolean c(int i, int j, int l)
    {
        return i >= j && i <= l;
    }

    public static boolean c(Context context)
    {
        return (new k(context, "first_in_weather")).a("is_first_in", true);
    }

    public static boolean c(String s)
    {
        SimpleDateFormat simpledateformat = new SimpleDateFormat("yyyy/MM/dd HH:mm Z");
        Object obj = null;
        try
        {
            s = simpledateformat.parse(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
            s = obj;
        }
        if (s != null)
        {
            return (new Date()).after(s);
        } else
        {
            return false;
        }
    }

    public static int d(int i)
    {
        byte byte0 = 6;
        switch (i)
        {
        default:
            byte0 = 1;
            // fall through

        case 10: // '\n'
        case 16: // '\020'
        case 21: // '\025'
            return byte0;

        case 0: // '\0'
            return 7;

        case 1: // '\001'
            return 15;

        case 2: // '\002'
            return 11;

        case 3: // '\003'
            return 3;

        case 4: // '\004'
            return 5;

        case 5: // '\005'
            return 17;

        case 6: // '\006'
            return 9;

        case 7: // '\007'
            return 13;

        case 8: // '\b'
            return 8;

        case 9: // '\t'
            return 10;

        case 11: // '\013'
            return 4;

        case 12: // '\f'
            return 14;

        case 13: // '\r'
            return 12;

        case 14: // '\016'
            return 16;

        case 15: // '\017'
            return 18;

        case 17: // '\021'
            return 4;

        case 18: // '\022'
            return 14;

        case 19: // '\023'
            return 16;

        case 20: // '\024'
            return 18;

        case 22: // '\026'
            return 4;

        case 23: // '\027'
            return 14;

        case 24: // '\030'
            return 16;

        case 25: // '\031'
            return 18;

        case 26: // '\032'
            return 10;

        case 27: // '\033'
            return 12;

        case 28: // '\034'
            return 9;

        case 29: // '\035'
            return 5;

        case 30: // '\036'
            return 13;

        case 31: // '\037'
            return 17;

        case 32: // ' '
            return 1;
        }
    }

    public static boolean d(String s)
    {
        SimpleDateFormat simpledateformat = new SimpleDateFormat("yyyy/MM/dd HH:mm Z");
        Date date = null;
        try
        {
            s = simpledateformat.parse(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
            s = date;
        }
        if (s != null)
        {
            date = new Date();
            s.setTime(s.getTime() + 0x5265c00L);
            return date.after(s);
        } else
        {
            return false;
        }
    }

    public static String e(int i)
    {
        StringBuffer stringbuffer = new StringBuffer();
        if (i >= 0 && i <= 9)
        {
            stringbuffer.append("0").append(i);
        } else
        {
            stringbuffer.append(i).append("");
        }
        return stringbuffer.toString();
    }

    public static String e(String s)
    {
        String s1 = s.replaceAll("\\.", "");
        if (!TextUtils.isEmpty(s1))
        {
            s = s1;
        }
        s1 = s.toUpperCase();
        if (!TextUtils.isEmpty(s1))
        {
            s = s1;
        }
        return s;
    }
}
