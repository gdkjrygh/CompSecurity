// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.util;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.Display;
import android.view.InflateException;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import com.whatsapp.App;
import com.whatsapp.DialogToastActivity;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.whatsapp.util:
//            bj, Log, bh, bx, 
//            e

public class a5
{

    private static JSONObject a;
    public static File b;
    private static Map c;
    private static String d;
    private static String e;
    private static String f;
    private static JSONArray g;
    private static Map h;
    private static FileWriter i;
    private static int j;
    public static boolean k;
    private static Set l;
    private static Map m;
    private static String n;
    private static boolean o;
    private static final String z[];

    public static android.app.AlertDialog.Builder a(Activity activity)
    {
        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(activity);
        builder.setTitle(z[32]);
        builder.setMessage(z[33]);
        Object obj = activity.getLayoutInflater().inflate(0x7f0300a9, null);
        builder.setView(((View) (obj)));
        EditText edittext = (EditText)((View) (obj)).findViewById(0x7f0b02a0);
        CheckBox checkbox = (CheckBox)((View) (obj)).findViewById(0x7f0b02a1);
        obj = (CheckBox)((View) (obj)).findViewById(0x7f0b02a2);
        builder.setPositiveButton(z[34], new bj(edittext, checkbox, ((CheckBox) (obj)), activity));
        return builder;
    }

    static FileWriter a()
    {
        return i;
    }

    static String a(String s)
    {
        e = s;
        return s;
    }

    public static void a(Activity activity, ViewGroup viewgroup)
    {
        Iterator iterator;
        boolean flag;
        flag = Log.f;
        Log.i(z[10]);
        ArrayList arraylist = new ArrayList();
        a(((View) (viewgroup)), ((List) (arraylist)));
        iterator = arraylist.iterator();
_L2:
        TextView textview;
        long l1;
label0:
        {
            if (iterator.hasNext())
            {
                textview = (TextView)iterator.next();
                int i1;
                try
                {
                    i1 = textview.getText().length();
                }
                // Misplaced declaration of an exception variable
                catch (Activity activity)
                {
                    throw activity;
                }
                if (i1 > 0)
                {
                    break label0;
                }
            }
            return;
        }
        viewgroup = textview.getRootView();
        l.add(viewgroup);
        l1 = (long)(viewgroup.getHeight() * viewgroup.getWidth()) + ((long)viewgroup.hashCode() + viewgroup.getDrawingTime());
        try
        {
            Log.i((new StringBuilder()).append(z[11]).append(l1).toString());
            a(((View) (textview)), l1, true, activity);
            viewgroup = c;
        }
        // Misplaced declaration of an exception variable
        catch (Activity activity)
        {
            try
            {
                throw activity;
            }
            // Misplaced declaration of an exception variable
            catch (Activity activity)
            {
                throw activity;
            }
        }
        if (viewgroup == null)
        {
            break MISSING_BLOCK_LABEL_180;
        }
        if (c.containsKey(Long.valueOf(l1)))
        {
            break MISSING_BLOCK_LABEL_196;
        }
        Log.i(z[12]);
        return;
        float f1;
        float f2;
        Object obj;
        int j1;
        TextPaint textpaint;
label1:
        {
            j1 = ((Integer)c.get(Long.valueOf(l1))).intValue();
            Log.i((new StringBuilder()).append(z[14]).append(j1).toString());
            viewgroup = textview.getLayout();
            textpaint = textview.getPaint();
            obj = textview.getText();
            Log.i((new StringBuilder()).append(z[13]).append(obj).toString());
            int k1 = textview.getLineCount();
            if (k1 > 0)
            {
                viewgroup = ((CharSequence) (obj)).subSequence(viewgroup.getLineStart(k1 - 1), viewgroup.getLineEnd(k1 - 1));
                if (!flag)
                {
                    break label1;
                }
            }
            viewgroup = ((ViewGroup) (obj));
        }
        obj = ((CharSequence) (obj)).toString();
        f1 = textview.getWidth() - textview.getCompoundPaddingLeft() - textview.getCompoundPaddingRight();
        f2 = textpaint.measureText(viewgroup, 0, viewgroup.length());
        if (f1 <= 0.0F)
        {
            continue; /* Loop/switch isn't completed */
        }
        boolean flag1 = b(textview);
        if (!flag1)
        {
            continue; /* Loop/switch isn't completed */
        }
        JSONArray jsonarray;
        try
        {
            if (TextUtils.isEmpty(((CharSequence) (obj))))
            {
                continue; /* Loop/switch isn't completed */
            }
            viewgroup = i;
        }
        // Misplaced declaration of an exception variable
        catch (Activity activity)
        {
            throw activity;
        }
        if (viewgroup == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        jsonarray = new JSONArray();
        if (j1 < 10)
        {
            try
            {
                viewgroup = (new StringBuilder()).append("0").append(j1).toString();
            }
            // Misplaced declaration of an exception variable
            catch (Activity activity)
            {
                throw activity;
            }
        } else
        {
            viewgroup = String.valueOf(j1);
        }
        jsonarray.put((new StringBuilder()).append(f).append("-").append(viewgroup).toString());
        jsonarray.put(obj);
        jsonarray.put(Double.valueOf(f1));
        jsonarray.put(Double.valueOf(f2));
        if (f2 > f1)
        {
            try
            {
                jsonarray.put(true);
            }
            // Misplaced declaration of an exception variable
            catch (Activity activity)
            {
                throw activity;
            }
            if (!flag)
            {
                break MISSING_BLOCK_LABEL_536;
            }
        }
        jsonarray.put(false);
        g.put(jsonarray);
        if (!flag) goto _L2; else goto _L1
_L1:
        return;
        activity;
        throw activity;
        activity;
        throw activity;
    }

    public static void a(Activity activity, boolean flag)
    {
        a((ViewGroup)activity.findViewById(0x1020002).getRootView(), activity, flag);
    }

    private static void a(View view, long l1, boolean flag, Activity activity)
    {
        Object obj;
        int k1;
        int i2;
        boolean flag2;
        flag2 = Log.f;
        Display display = ((WindowManager)activity.getSystemService(z[40])).getDefaultDisplay();
        k1 = display.getHeight();
        i2 = display.getWidth();
        obj = view.getRootView();
        if (obj != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        Bitmap bitmap;
        ((View) (obj)).setDrawingCacheEnabled(true);
        bitmap = ((View) (obj)).getDrawingCache();
        if (bitmap == null) goto _L1; else goto _L3
_L3:
        int i1 = bitmap.getHeight();
        if (flag && i1 >= k1 - 25)
        {
            try
            {
                Log.i((new StringBuilder()).append(z[49]).append(i1).toString());
                return;
            }
            // Misplaced declaration of an exception variable
            catch (View view)
            {
                throw view;
            }
        }
        try
        {
            if (c == null)
            {
                c = new HashMap();
            }
        }
        // Misplaced declaration of an exception variable
        catch (View view)
        {
            throw view;
        }
        try
        {
            if (m == null)
            {
                m = new HashMap();
            }
        }
        // Misplaced declaration of an exception variable
        catch (View view)
        {
            throw view;
        }
        try
        {
            if (f == null)
            {
                Log.i(z[43]);
                return;
            }
        }
        // Misplaced declaration of an exception variable
        catch (View view)
        {
            throw view;
        }
        if (!c.containsKey(Long.valueOf(l1))) goto _L5; else goto _L4
_L4:
        int j1;
        j1 = ((Integer)c.get(Long.valueOf(l1))).intValue();
        Log.i((new StringBuilder()).append(z[46]).append(j1).toString());
        if (!flag2) goto _L6; else goto _L5
_L5:
        boolean flag1;
        j1 = j + 1;
        j = j1;
        Log.i((new StringBuilder()).append(z[51]).append(j1).toString());
        flag1 = true;
_L23:
        if (!flag) goto _L8; else goto _L7
_L7:
        Log.i(z[42]);
        view = Bitmap.createBitmap(i2, k1, android.graphics.Bitmap.Config.RGB_565);
_L18:
        Canvas canvas = new Canvas(view);
        activity.findViewById(0x1020002).getRootView().draw(canvas);
        activity = new int[2];
        ((View) (obj)).getLocationOnScreen(activity);
        canvas.drawBitmap(bitmap, activity[0], activity[1], null);
        if (!flag2) goto _L9; else goto _L8
_L8:
        Log.i(z[44]);
        view = bitmap;
_L9:
        k1 = 0;
        activity = new HashSet();
        obj = m.keySet().iterator();
_L20:
        Bitmap bitmap2;
        if (!((Iterator) (obj)).hasNext())
        {
            break MISSING_BLOCK_LABEL_1021;
        }
        bitmap2 = (Bitmap)((Iterator) (obj)).next();
        i2 = ((Integer)m.get(bitmap2)).intValue();
        if (!flag) goto _L11; else goto _L10
_L10:
        boolean flag3 = bitmap2.sameAs(view);
        if (flag3) goto _L13; else goto _L12
_L12:
        flag3 = bitmap2.sameAs(bitmap);
        if (!flag3) goto _L11; else goto _L13
_L13:
        Log.i((new StringBuilder()).append(z[41]).append(bitmap2.sameAs(view)).append(z[53]).append(bitmap2.sameAs(bitmap)).toString());
        int k2;
        k2 = 1;
        j1 = 1;
        if (!flag2) goto _L15; else goto _L14
_L14:
        k1 = i2;
_L21:
        k2 = j;
        if (k2 - i2 <= 3)
        {
            break MISSING_BLOCK_LABEL_572;
        }
        activity.add(bitmap2);
        if (!flag2) goto _L17; else goto _L16
_L16:
        activity = activity.iterator();
        do
        {
            if (!activity.hasNext())
            {
                break;
            }
            Bitmap bitmap1 = (Bitmap)activity.next();
            m.remove(bitmap1);
        } while (!flag2);
        if (j1 == 0 || !flag1)
        {
            break MISSING_BLOCK_LABEL_670;
        }
        j--;
        Log.i((new StringBuilder()).append(z[48]).append(j).toString());
        if (k1 >= 10)
        {
            break MISSING_BLOCK_LABEL_970;
        }
        activity = (new StringBuilder()).append("0").append(k1).toString();
_L19:
        activity = new FileOutputStream(new File(b, (new StringBuilder()).append(n).append(e).append("-").append(f).append("-").append(activity).append(z[52]).toString()));
        view.compress(android.graphics.Bitmap.CompressFormat.PNG, 100, activity);
        c.put(Long.valueOf(l1), Integer.valueOf(k1));
        m.put(bitmap, Integer.valueOf(k1));
        m.put(view, Integer.valueOf(k1));
        activity.flush();
        activity.close();
        Log.i((new StringBuilder()).append(z[45]).append(k1).toString());
        return;
        view;
        System.gc();
        view = Bitmap.createBitmap(i2, k1, android.graphics.Bitmap.Config.ARGB_4444);
          goto _L18
        view;
        throw view;
        view;
        try
        {
            throw view;
        }
        // Misplaced declaration of an exception variable
        catch (View view)
        {
            Log.e((new StringBuilder()).append(z[50]).append(view.toString()).toString());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (View view)
        {
            Log.e((new StringBuilder()).append(z[47]).append(view.toString()).toString());
        }
        return;
        view;
        throw view;
        view;
        throw view;
        view;
        throw view;
        view;
        throw view;
        activity = String.valueOf(k1);
          goto _L19
_L17:
        i2 = k1;
        k1 = j1;
        j1 = i2;
          goto _L20
_L15:
        k1 = i2;
        j1 = k2;
          goto _L16
_L11:
        int l2 = j1;
        j1 = k1;
        k1 = l2;
          goto _L21
        int j2 = j1;
        j1 = k1;
        k1 = j2;
          goto _L16
_L6:
        flag1 = false;
        if (true) goto _L23; else goto _L22
_L22:
    }

    private static void a(View view, List list)
    {
        boolean flag = Log.f;
        if (!(view instanceof ViewGroup)) goto _L2; else goto _L1
_L1:
        int i1;
        int j1;
        j1 = ((ViewGroup)view).getChildCount();
        i1 = 0;
_L8:
        if (i1 >= j1) goto _L4; else goto _L3
_L3:
        a(((ViewGroup)view).getChildAt(i1), list);
        if (!flag) goto _L5; else goto _L4
_L4:
        if (!flag) goto _L6; else goto _L2
_L2:
        if (view instanceof TextView)
        {
            list.add((TextView)view);
        }
_L6:
        return;
        view;
        throw view;
_L5:
        i1++;
        if (true) goto _L8; else goto _L7
_L7:
    }

    public static void a(ViewGroup viewgroup, Activity activity, boolean flag)
    {
        boolean flag1;
        flag1 = Log.f;
        String s;
        try
        {
            s = f;
        }
        // Misplaced declaration of an exception variable
        catch (ViewGroup viewgroup)
        {
            throw viewgroup;
        }
        if (s != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        long l1;
        Log.i(z[37]);
        l1 = (long)(viewgroup.getHeight() * viewgroup.getWidth()) + ((long)viewgroup.hashCode() + viewgroup.getDrawingTime());
        try
        {
            Log.i((new StringBuilder()).append(z[35]).append(l1).toString());
            a(((View) (viewgroup)), l1, flag, activity);
            activity = c;
        }
        // Misplaced declaration of an exception variable
        catch (ViewGroup viewgroup)
        {
            try
            {
                throw viewgroup;
            }
            // Misplaced declaration of an exception variable
            catch (ViewGroup viewgroup)
            {
                throw viewgroup;
            }
        }
        if (activity == null)
        {
            break MISSING_BLOCK_LABEL_110;
        }
        if (c.containsKey(Long.valueOf(l1)))
        {
            break MISSING_BLOCK_LABEL_126;
        }
        Log.i(z[36]);
        return;
        Iterator iterator;
        int i1;
        i1 = ((Integer)c.get(Long.valueOf(l1))).intValue();
        Log.i((new StringBuilder()).append(z[39]).append(i1).toString());
        activity = new ArrayList();
        a(((View) (viewgroup)), ((List) (activity)));
        iterator = activity.iterator();
_L5:
        if (!iterator.hasNext()) goto _L1; else goto _L3
_L3:
label0:
        {
            Object obj = (TextView)iterator.next();
            viewgroup = ((TextView) (obj)).getLayout();
            TextPaint textpaint = ((TextView) (obj)).getPaint();
            activity = ((TextView) (obj)).getText();
            float f1;
            float f2;
            int j1;
            try
            {
                if (o)
                {
                    ((TextView) (obj)).setTextColor(0xff00ff00);
                }
            }
            // Misplaced declaration of an exception variable
            catch (ViewGroup viewgroup)
            {
                throw viewgroup;
            }
            j1 = ((TextView) (obj)).getLineCount();
            if (j1 > 0)
            {
                viewgroup = activity.subSequence(viewgroup.getLineStart(j1 - 1), viewgroup.getLineEnd(j1 - 1));
                if (!flag1)
                {
                    break label0;
                }
            }
            viewgroup = activity;
        }
        f1 = textpaint.measureText(viewgroup, 0, viewgroup.length());
        f2 = ((TextView) (obj)).getWidth() - ((TextView) (obj)).getCompoundPaddingLeft() - ((TextView) (obj)).getCompoundPaddingRight();
        activity = activity.toString();
        Log.i((new StringBuilder()).append(z[38]).append(activity).toString());
        if (f2 <= 0.0F)
        {
            continue; /* Loop/switch isn't completed */
        }
        flag = b(((View) (obj)));
        if (!flag)
        {
            continue; /* Loop/switch isn't completed */
        }
        try
        {
            if (TextUtils.isEmpty(activity))
            {
                continue; /* Loop/switch isn't completed */
            }
            viewgroup = i;
        }
        // Misplaced declaration of an exception variable
        catch (ViewGroup viewgroup)
        {
            throw viewgroup;
        }
        if (viewgroup == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        obj = new JSONArray();
        if (i1 < 10)
        {
            try
            {
                viewgroup = (new StringBuilder()).append("0").append(i1).toString();
            }
            // Misplaced declaration of an exception variable
            catch (ViewGroup viewgroup)
            {
                throw viewgroup;
            }
        } else
        {
            viewgroup = String.valueOf(i1);
        }
        ((JSONArray) (obj)).put((new StringBuilder()).append(f).append("-").append(viewgroup).toString());
        ((JSONArray) (obj)).put(activity);
        ((JSONArray) (obj)).put(Double.valueOf(f2));
        ((JSONArray) (obj)).put(Double.valueOf(f1));
        if (f1 > f2)
        {
            try
            {
                ((JSONArray) (obj)).put(true);
            }
            // Misplaced declaration of an exception variable
            catch (ViewGroup viewgroup)
            {
                throw viewgroup;
            }
            if (!flag1)
            {
                break MISSING_BLOCK_LABEL_517;
            }
        }
        ((JSONArray) (obj)).put(false);
        g.put(obj);
        if (!flag1) goto _L5; else goto _L4
_L4:
        return;
        viewgroup;
        try
        {
            throw viewgroup;
        }
        // Misplaced declaration of an exception variable
        catch (ViewGroup viewgroup) { }
        throw viewgroup;
        viewgroup;
        throw viewgroup;
    }

    private static void a(CharSequence charsequence, Activity activity)
    {
        boolean flag = Log.f;
        String s = charsequence.toString().replace(' ', '_');
        charsequence = z[27];
        charsequence = z[19];
        Object obj = Locale.getDefault().getLanguage();
        String s1 = Locale.getDefault().getCountry();
        charsequence = ((CharSequence) (obj));
        if (((String) (obj)).equalsIgnoreCase(z[22]))
        {
            obj = z[30];
            charsequence = ((CharSequence) (obj));
            if (!flag)
            {
                break MISSING_BLOCK_LABEL_229;
            }
            charsequence = ((CharSequence) (obj));
        }
        boolean flag1;
        try
        {
            flag1 = charsequence.equalsIgnoreCase(z[28]);
        }
        // Misplaced declaration of an exception variable
        catch (CharSequence charsequence)
        {
            throw charsequence;
        }
        if (flag1)
        {
            obj = z[21];
            charsequence = ((CharSequence) (obj));
            if (!flag)
            {
                break MISSING_BLOCK_LABEL_229;
            }
            charsequence = ((CharSequence) (obj));
        }
        try
        {
            flag1 = charsequence.equalsIgnoreCase(z[16]);
        }
        // Misplaced declaration of an exception variable
        catch (CharSequence charsequence)
        {
            throw charsequence;
        }
        obj = charsequence;
        if (flag1)
        {
            obj = (new StringBuilder()).append(charsequence).append("_").append(s1).toString();
            charsequence = ((CharSequence) (obj));
            if (!flag)
            {
                break MISSING_BLOCK_LABEL_229;
            }
        }
        flag1 = ((String) (obj)).equalsIgnoreCase(z[29]);
        charsequence = ((CharSequence) (obj));
        if (flag1)
        {
            try
            {
                flag1 = z[26].equalsIgnoreCase(s1);
            }
            // Misplaced declaration of an exception variable
            catch (CharSequence charsequence)
            {
                throw charsequence;
            }
            charsequence = ((CharSequence) (obj));
            if (flag1)
            {
                charsequence = (new StringBuilder()).append(((String) (obj))).append("_").append(s1).toString();
            }
        }
        try
        {
            if (!charsequence.equalsIgnoreCase(d))
            {
                h.clear();
            }
        }
        // Misplaced declaration of an exception variable
        catch (CharSequence charsequence)
        {
            throw charsequence;
        }
        obj = new File(App.aK, z[18]);
        try
        {
            if (!((File) (obj)).exists())
            {
                ((File) (obj)).mkdir();
                Log.i(z[20]);
            }
        }
        // Misplaced declaration of an exception variable
        catch (CharSequence charsequence)
        {
            throw charsequence;
        }
        obj = new File(((File) (obj)), charsequence);
        try
        {
            if (!((File) (obj)).exists())
            {
                ((File) (obj)).mkdir();
                h.clear();
                Log.i((new StringBuilder()).append(z[17]).append(charsequence).append(z[25]).toString());
            }
        }
        // Misplaced declaration of an exception variable
        catch (CharSequence charsequence)
        {
            throw charsequence;
        }
        b = ((File) (obj));
        obj = new File(b, (new StringBuilder()).append(z[23]).append(charsequence).append(z[24]).toString());
        f = s;
        if (!h.containsKey(f))
        {
            break MISSING_BLOCK_LABEL_440;
        }
        j = ((Integer)h.get(f)).intValue();
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_444;
        }
        try
        {
            j = 0;
        }
        // Misplaced declaration of an exception variable
        catch (CharSequence charsequence)
        {
            throw charsequence;
        }
        if (!((File) (obj)).exists())
        {
            ((File) (obj)).createNewFile();
        }
        IOException ioexception;
        try
        {
            i = new FileWriter(((File) (obj)).getAbsoluteFile(), true);
        }
        catch (IOException ioexception1)
        {
            Log.e((new StringBuilder()).append(z[31]).append(ioexception1.toString()).toString());
        }
        d = charsequence;
        c = new HashMap();
        m = new HashMap();
        a = new JSONObject();
        g = new JSONArray();
        Log.i((new StringBuilder()).append(z[15]).append(f).toString());
        activity.finish();
        activity.startActivity(activity.getIntent());
        return;
        charsequence;
        throw charsequence;
        charsequence;
        throw charsequence;
        ioexception;
        throw ioexception;
    }

    private static void a(String s, AttributeSet attributeset, LayoutInflater layoutinflater, View aview[])
    {
        try
        {
            layoutinflater.inflate(new bh(aview, layoutinflater, s, attributeset), null, false);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return;
        }
    }

    static boolean a(View view)
    {
        return b(view);
    }

    static boolean a(boolean flag)
    {
        o = flag;
        return flag;
    }

    static JSONArray b()
    {
        return g;
    }

    public static void b(Activity activity)
    {
        try
        {
            if (App.u != 3)
            {
                throw new UnsupportedOperationException();
            }
        }
        // Misplaced declaration of an exception variable
        catch (Activity activity)
        {
            throw activity;
        }
        Object obj;
        try
        {
            Log.i(z[8]);
            obj = f;
        }
        // Misplaced declaration of an exception variable
        catch (Activity activity)
        {
            throw activity;
        }
        if (obj == null)
        {
            return;
        }
        obj = activity.getLayoutInflater();
        try
        {
            if (((LayoutInflater) (obj)).getFactory() != null)
            {
                Log.i(z[9]);
                return;
            }
        }
        // Misplaced declaration of an exception variable
        catch (Activity activity)
        {
            throw activity;
        }
        ((LayoutInflater) (obj)).setFactory(new bx(activity));
    }

    static void b(View view, long l1, boolean flag, Activity activity)
    {
        a(view, l1, flag, activity);
    }

    static void b(CharSequence charsequence, Activity activity)
    {
        a(charsequence, activity);
    }

    static void b(String s, AttributeSet attributeset, LayoutInflater layoutinflater, View aview[])
    {
        a(s, attributeset, layoutinflater, aview);
    }

    private static boolean b(View view)
    {
        View view1 = view.getRootView();
        do
        {
            if (view == view1)
            {
                return true;
            }
            int i1;
            try
            {
                i1 = view.getVisibility();
            }
            // Misplaced declaration of an exception variable
            catch (View view)
            {
                throw view;
            }
            if (i1 != 0)
            {
                return false;
            }
            view = view.getParent();
            if (view == null)
            {
                return false;
            }
            boolean flag;
            try
            {
                flag = view instanceof View;
            }
            // Misplaced declaration of an exception variable
            catch (View view)
            {
                throw view;
            }
            if (!flag)
            {
                return true;
            }
            view = (View)view;
        } while (view != null);
        return false;
    }

    public static void c()
    {
        boolean flag = Log.f;
        if (i != null)
        {
            a.put(z[2], z[1]);
            a.put(z[7], d);
            a.put(z[5], g);
            i.write((new StringBuilder()).append(a.toString()).append("\n").toString());
            i.flush();
            i.close();
        }
_L1:
        int i1;
        h.put(f, Integer.valueOf(j));
        i1 = j + 1;
_L2:
        Object obj;
        boolean flag1;
        if (i1 < 10)
        {
            obj = (new StringBuilder()).append("0").append(i1).toString();
        } else
        {
            obj = String.valueOf(i1);
        }
        obj = new File(b, (new StringBuilder()).append(n).append(e).append("-").append(f).append("-").append(((String) (obj))).append(z[3]).toString());
        flag1 = ((File) (obj)).exists();
        if (flag1 || flag)
        {
            IOException ioexception;
            try
            {
                ((File) (obj)).delete();
            }
            catch (IOException ioexception1)
            {
                throw ioexception1;
            }
            if (!flag)
            {
                break MISSING_BLOCK_LABEL_389;
            }
        }
        try
        {
            i = null;
            f = null;
            j = 0;
            a = null;
            g = null;
            c = null;
            m = null;
            b = null;
            Log.i(z[0]);
            i1 = DialogToastActivity.g;
        }
        catch (IOException ioexception2)
        {
            try
            {
                throw ioexception2;
            }
            catch (IOException ioexception3)
            {
                throw ioexception3;
            }
        }
        if (i1 != 0)
        {
            if (flag)
            {
                flag = false;
            } else
            {
                flag = true;
            }
            Log.f = flag;
        }
        return;
        obj;
        try
        {
            throw obj;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            Log.e((new StringBuilder()).append(z[6]).append(((IOException) (obj)).toString()).toString());
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            Log.e((new StringBuilder()).append(z[4]).append(((JSONException) (obj)).toString()).toString());
        }
          goto _L1
        ioexception;
        throw ioexception;
        i1++;
          goto _L2
    }

    public static void c(Activity activity)
    {
        LayoutInflater.from(activity).setFactory(new e(activity));
    }

    static Set d()
    {
        return l;
    }

    static String e()
    {
        return f;
    }

    static Map f()
    {
        return c;
    }

    static 
    {
        char ac[];
        String as[];
        byte byte0;
        int i1;
        as = new String[54];
        ac = "\026pC5u\003v_4x7v_7eMd_5w\016kL>6\001m[+z\007vS";
        byte0 = -1;
        i1 = 0;
_L65:
        String as1[];
        int k1;
        int l1;
        as1 = as;
        ac = ac.toCharArray();
        l1 = ac.length;
        k1 = 0;
_L63:
        if (l1 > k1) goto _L2; else goto _L1
_L1:
        ac = (new String(ac)).intern();
        byte0;
        JVM INSTR tableswitch 0 52: default 276
    //                   0 292
    //                   1 308
    //                   2 324
    //                   3 340
    //                   4 356
    //                   5 373
    //                   6 391
    //                   7 409
    //                   8 427
    //                   9 445
    //                   10 463
    //                   11 481
    //                   12 499
    //                   13 517
    //                   14 535
    //                   15 553
    //                   16 571
    //                   17 589
    //                   18 607
    //                   19 625
    //                   20 643
    //                   21 661
    //                   22 679
    //                   23 697
    //                   24 715
    //                   25 733
    //                   26 751
    //                   27 769
    //                   28 787
    //                   29 805
    //                   30 823
    //                   31 841
    //                   32 859
    //                   33 877
    //                   34 895
    //                   35 913
    //                   36 931
    //                   37 949
    //                   38 967
    //                   39 985
    //                   40 1003
    //                   41 1021
    //                   42 1039
    //                   43 1057
    //                   44 1075
    //                   45 1093
    //                   46 1111
    //                   47 1129
    //                   48 1147
    //                   49 1165
    //                   50 1183
    //                   51 1201
    //                   52 1219;
           goto _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L17 _L18 _L19 _L20 _L21 _L22 _L23 _L24 _L25 _L26 _L27 _L28 _L29 _L30 _L31 _L32 _L33 _L34 _L35 _L36 _L37 _L38 _L39 _L40 _L41 _L42 _L43 _L44 _L45 _L46 _L47 _L48 _L49 _L50 _L51 _L52 _L53 _L54 _L55 _L56
_L3:
        as1[i1] = ac;
        i1 = 1;
        ac = "#lR)y\013f";
        byte0 = 0;
        break; /* Loop/switch isn't completed */
_L4:
        as1[i1] = ac;
        ac = "\022nW/p\rp[";
        byte0 = 1;
        i1 = 2;
        break; /* Loop/switch isn't completed */
_L5:
        as1[i1] = ac;
        i1 = 3;
        ac = "LrX<";
        byte0 = 2;
        break; /* Loop/switch isn't completed */
_L6:
        as1[i1] = ac;
        i1 = 4;
        ac = "\026pC5u\003v_4x7v_7eMd_5w\016kL>6(Qy\0256\007zU>f\026kY56";
        byte0 = 3;
        break; /* Loop/switch isn't completed */
_L7:
        as1[i1] = ac;
        i1 = 5;
        ac = "\021vD2x\005q";
        byte0 = 4;
        break; /* Loop/switch isn't completed */
_L8:
        as1[i1] = ac;
        i1 = 6;
        ac = "\026pC5u\003v_4x7v_7eMd_5w\016kL>6\007zU>f\026kY56\001nY(\177\fe\026/d\027lU:b\013mX(6\004kZ>6";
        byte0 = 5;
        break; /* Loop/switch isn't completed */
_L9:
        as1[i1] = ac;
        i1 = 7;
        ac = "\016mU:z\007";
        byte0 = 6;
        break; /* Loop/switch isn't completed */
_L10:
        as1[i1] = ac;
        i1 = 8;
        ac = "\026pC5u\003v_4x7v_7eMd_5r/gX.B\020wX8w\026kY5e";
        byte0 = 7;
        break; /* Loop/switch isn't completed */
_L11:
        as1[i1] = ac;
        i1 = 9;
        ac = "\026pC5u\003v_4x7v_7eMd_5r/gX.B\020wX8w\026kY5eBdW8b\rpO{w\016pS:r\033\"S#\177\021vE";
        byte0 = 8;
        break; /* Loop/switch isn't completed */
_L12:
        as1[i1] = ac;
        i1 = 10;
        ac = "\026pC5u\003v_4x7v_7eMd_5r,gA\032x\006pY2r";
        byte0 = 9;
        break; /* Loop/switch isn't completed */
_L13:
        as1[i1] = ac;
        i1 = 11;
        ac = "\026pC5u\003v_4x7v_7eMd_5r,gA\032x\006pY2rBiS\",B";
        byte0 = 10;
        break; /* Loop/switch isn't completed */
_L14:
        as1[i1] = ac;
        i1 = 12;
        ac = "\026pC5u\003v_4x7v_7eMd_5r,gA\032x\006pY2rBq]2f\022gR";
        byte0 = 11;
        break; /* Loop/switch isn't completed */
_L15:
        as1[i1] = ac;
        i1 = 13;
        ac = "\026pC5u\003v_4x7v_7eMd_5r,gA\032x\006pY2rBvS#bX\"";
        byte0 = 12;
        break; /* Loop/switch isn't completed */
_L16:
        as1[i1] = ac;
        i1 = 14;
        ac = "\026pC5u\003v_4x7v_7eMd_5r,gA\032x\006pY2rBq_?,B";
        byte0 = 13;
        break; /* Loop/switch isn't completed */
_L17:
        as1[i1] = ac;
        i1 = 15;
        ac = "\026pC5u\003v_4x7v_7eMqS/c\022\"U4{\022nS/sX\"";
        byte0 = 14;
        break; /* Loop/switch isn't completed */
_L18:
        as1[i1] = ac;
        i1 = 16;
        ac = "\030j";
        byte0 = 15;
        break; /* Loop/switch isn't completed */
_L19:
        as1[i1] = ac;
        i1 = 17;
        ac = "\026pC5u\003v_4x7v_7eMqS/C\022\"[:r\007\"";
        byte0 = 16;
        break; /* Loop/switch isn't completed */
_L20:
        as1[i1] = ac;
        i1 = 18;
        ac = "1aD>s\fq^4b\021";
        byte0 = 17;
        break; /* Loop/switch isn't completed */
_L21:
        as1[i1] = ac;
        i1 = 19;
        ac = "LhE4x";
        byte0 = 18;
        break; /* Loop/switch isn't completed */
_L22:
        as1[i1] = ac;
        i1 = 20;
        ac = "\026pC5u\003v_4x7v_7eMqS/C\022\"[:r\007\"e8d\007gX(~\rvE{r\013pS8b\rpO";
        byte0 = 19;
        break; /* Loop/switch isn't completed */
_L23:
        as1[i1] = ac;
        i1 = 21;
        ac = "\ng";
        byte0 = 20;
        break; /* Loop/switch isn't completed */
_L24:
        as1[i1] = ac;
        ac = "\013l";
        byte0 = 21;
        i1 = 22;
        break; /* Loop/switch isn't completed */
_L25:
        as1[i1] = ac;
        i1 = 23;
        ac = "\026pC5u\003v_4x\021/";
        byte0 = 22;
        break; /* Loop/switch isn't completed */
_L26:
        as1[i1] = ac;
        i1 = 24;
        ac = "LhE4x";
        byte0 = 23;
        break; /* Loop/switch isn't completed */
_L27:
        as1[i1] = ac;
        i1 = 25;
        ac = "Bf_)s\001vY)o";
        byte0 = 24;
        break; /* Loop/switch isn't completed */
_L28:
        as1[i1] = ac;
        i1 = 26;
        ac = " P";
        byte0 = 25;
        break; /* Loop/switch isn't completed */
_L29:
        as1[i1] = ac;
        i1 = 27;
        ac = "\026pC5u\003v_4x\021";
        byte0 = 26;
        break; /* Loop/switch isn't completed */
_L30:
        as1[i1] = ac;
        i1 = 28;
        ac = "\013u";
        byte0 = 27;
        break; /* Loop/switch isn't completed */
_L31:
        as1[i1] = ac;
        i1 = 29;
        ac = "\022v";
        byte0 = 28;
        break; /* Loop/switch isn't completed */
_L32:
        as1[i1] = ac;
        i1 = 30;
        ac = "\013f";
        byte0 = 29;
        break; /* Loop/switch isn't completed */
_L33:
        as1[i1] = ac;
        i1 = 31;
        ac = "\026pC5u\003v_4x7v_7eMqS/C\022\"U)s\003v_5qBvD.x\001cB2y\fq\026=\177\016g\026>n\001gF/\177\rl\026";
        byte0 = 30;
        break; /* Loop/switch isn't completed */
_L34:
        as1[i1] = ac;
        i1 = 32;
        ac = ",gA{E\007p_>e";
        byte0 = 31;
        break; /* Loop/switch isn't completed */
_L35:
        as1[i1] = ac;
        i1 = 33;
        ac = "Jg\030<8BA~\032B1+";
        byte0 = 32;
        break; /* Loop/switch isn't completed */
_L36:
        as1[i1] = ac;
        i1 = 34;
        ac = " gQ2xBQS)\177\007q";
        byte0 = 33;
        break; /* Loop/switch isn't completed */
_L37:
        as1[i1] = ac;
        i1 = 35;
        ac = "\026pC5u\003v_4x7v_7eMd_5r6pC5u\003v_4x\021\"]>oX\"";
        byte0 = 34;
        break; /* Loop/switch isn't completed */
_L38:
        as1[i1] = ac;
        i1 = 36;
        ac = "\026pC5u\003v_4x7v_7eMd_5r6pC5u\003v_4x\021\"E0\177\022rS?";
        byte0 = 35;
        break; /* Loop/switch isn't completed */
_L39:
        as1[i1] = ac;
        i1 = 37;
        ac = "\026pC5u\003v_4x7v_7eMd_5r6pC5u\003v_4x\021";
        byte0 = 36;
        break; /* Loop/switch isn't completed */
_L40:
        as1[i1] = ac;
        i1 = 38;
        ac = "\026pC5u\003v_4x7v_7eMd_5r6pC5u\003v_4x\021\"B>n\0268\026";
        byte0 = 37;
        break; /* Loop/switch isn't completed */
_L41:
        as1[i1] = ac;
        i1 = 39;
        ac = "\026pC5u\003v_4x7v_7eMd_5r6pC5u\003v_4x\021\"E2rX\"";
        byte0 = 38;
        break; /* Loop/switch isn't completed */
_L42:
        as1[i1] = ac;
        i1 = 40;
        ac = "\025kX?y\025";
        byte0 = 39;
        break; /* Loop/switch isn't completed */
_L43:
        as1[i1] = ac;
        i1 = 41;
        ac = "\026pC5u\003v_4x7v_7eMvW0s1aD>s\fq^4bB`_/{\003r\026(w\017g\r{b\r]A)\177\026g\f{";
        byte0 = 40;
        break; /* Loop/switch isn't completed */
_L44:
        as1[i1] = ac;
        i1 = 42;
        ac = "\026pC5u\003v_4x7v_7eMvW0s1aD>s\fq^4bBcB/s\017rB{e\001pS>x\021jY/6\rd\0266s\fw";
        byte0 = 41;
        break; /* Loop/switch isn't completed */
_L45:
        as1[i1] = ac;
        i1 = 43;
        ac = "\026pC5u\003v_4x7v_7eMvW0s1aD>s\fq^4bBqS)\177\007q\0262eBlC7z";
        byte0 = 42;
        break; /* Loop/switch isn't completed */
_L46:
        as1[i1] = ac;
        i1 = 44;
        ac = "\026pC5u\003v_4x7v_7eMvW0s1aD>s\fq^4bBcB/s\017rB{e\001pS>x\021jY/6\rd\026=c\016n\026:u\026k@2b\033";
        byte0 = 43;
        break; /* Loop/switch isn't completed */
_L47:
        as1[i1] = ac;
        i1 = 45;
        ac = "\026pC5u\003v_4x7v_7eMvW0s1aD>s\fq^4bBqU)s\007lE3y\026\"E.u\001gE(6\025kB36\021kR{";
        byte0 = 44;
        break; /* Loop/switch isn't completed */
_L48:
        as1[i1] = ac;
        i1 = 46;
        ac = "\026pC5u\003v_4x7v_7eMvW0s1aD>s\fq^4bBq_?6_\"D4y\026VY\b_&,Q>bJiS\"?Y\"E2rBkE{";
        byte0 = 45;
        break; /* Loop/switch isn't completed */
_L49:
        as1[i1] = ac;
        i1 = 47;
        ac = "\026pC5u\003v_4x7v_7eMvW0s1aD>s\fq^4bBkY{s\032aS+b\013mX";
        byte0 = 46;
        break; /* Loop/switch isn't completed */
_L50:
        as1[i1] = ac;
        i1 = 48;
        ac = "\026pC5u\003v_4x7v_7eMvW0s1aD>s\fq^4bB/\033/d\027lU:b\013mX(E\001pS>x\021jY/_&9";
        byte0 = 47;
        break; /* Loop/switch isn't completed */
_L51:
        as1[i1] = ac;
        i1 = 49;
        ac = "\026pC5u\003v_4x7v_7eMvW0s1aD>s\fq^4bBjS2q\nv\026/y\r\"Z:d\005g\026v(Bn_0s\016{\0265y\026\"W{{\007lC`6\000oi3s\013e^/6_\"";
        byte0 = 48;
        break; /* Loop/switch isn't completed */
_L52:
        as1[i1] = ac;
        i1 = 50;
        ac = "\026pC5u\003v_4x7v_7eMvW0s1aD>s\fq^4bBgN8s\022v_4xBaD>w\026kX<6\004kZ>6";
        byte0 = 49;
        break; /* Loop/switch isn't completed */
_L53:
        as1[i1] = ac;
        i1 = 51;
        ac = "\026pC5u\003v_4x7v_7eMvW0s1aD>s\fq^4bBkX8d\007oS5b\007fe\022R\013q\026/d\027g\r{e\013f\0262eB";
        byte0 = 50;
        break; /* Loop/switch isn't completed */
_L54:
        as1[i1] = ac;
        i1 = 52;
        ac = "LrX<";
        byte0 = 51;
        break; /* Loop/switch isn't completed */
_L55:
        as1[i1] = ac;
        i1 = 53;
        ac = "BpY4bX\"";
        byte0 = 52;
        break; /* Loop/switch isn't completed */
_L56:
        int j1;
        as1[i1] = ac;
        z = as;
        i = null;
        f = null;
        ac = "\003lR)y\013f\033".toCharArray();
        j1 = ac.length;
        i1 = 0;
          goto _L57
_L2:
        c1 = ac[k1];
        k1 % 5;
        JVM INSTR tableswitch 0 3: default 1372
    //                   0 1395
    //                   1 1402
    //                   2 1408
    //                   3 1415;
           goto _L58 _L59 _L60 _L61 _L62
_L62:
        break MISSING_BLOCK_LABEL_1415;
_L58:
        j1 = 22;
_L64:
        ac[k1] = (char)(j1 ^ c1);
        k1++;
          goto _L63
_L59:
        j1 = 98;
          goto _L64
_L60:
        j1 = 2;
          goto _L64
_L61:
        j1 = 54;
          goto _L64
        j1 = 91;
          goto _L64
        if (true) goto _L65; else goto _L2
_L57:
        char c1;
        if (j1 <= i1)
        {
            n = (new String(ac)).intern();
            e = null;
            j = -1;
            a = null;
            g = null;
            k = false;
            l = new HashSet();
            c = null;
            m = null;
            h = new HashMap();
            o = false;
            d = "";
            b = null;
            return;
        }
        k1 = ac[i1];
        i1 % 5;
        JVM INSTR tableswitch 0 3: default 1464
    //                   0 1485
    //                   1 1491
    //                   2 1496
    //                   3 1502;
           goto _L66 _L67 _L68 _L69 _L70
_L70:
        break MISSING_BLOCK_LABEL_1502;
_L67:
        break; /* Loop/switch isn't completed */
_L66:
        byte0 = 22;
_L72:
        ac[i1] = (char)(byte0 ^ k1);
        i1++;
        if (true) goto _L57; else goto _L71
_L71:
        byte0 = 98;
          goto _L72
_L68:
        byte0 = 2;
          goto _L72
_L69:
        byte0 = 54;
          goto _L72
        byte0 = 91;
          goto _L72
    }
}
