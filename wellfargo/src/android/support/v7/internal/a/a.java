// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.a;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v7.a.l;
import android.support.v7.internal.view.ContextThemeWrapper;
import android.support.v7.widget.p;
import android.support.v7.widget.q;
import android.support.v7.widget.r;
import android.support.v7.widget.s;
import android.support.v7.widget.t;
import android.support.v7.widget.u;
import android.support.v7.widget.v;
import android.support.v7.widget.w;
import android.support.v7.widget.x;
import android.support.v7.widget.y;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import java.lang.reflect.Constructor;
import java.util.Map;

public class a
{

    static final Class a[] = {
        android/content/Context, android/util/AttributeSet
    };
    private static final Map b = new android.support.v4.e.a();
    private final Object c[] = new Object[2];

    public a()
    {
    }

    private static Context a(Context context, AttributeSet attributeset, boolean flag, boolean flag1)
    {
label0:
        {
            attributeset = context.obtainStyledAttributes(attributeset, l.View, 0, 0);
            int i;
            int j;
            if (flag)
            {
                i = attributeset.getResourceId(l.View_android_theme, 0);
            } else
            {
                i = 0;
            }
            j = i;
            if (flag1)
            {
                j = i;
                if (i == 0)
                {
                    i = attributeset.getResourceId(l.View_theme, 0);
                    j = i;
                    if (i != 0)
                    {
                        Log.i("AppCompatViewInflater", "app:theme is now deprecated. Please move to using android:theme instead.");
                        j = i;
                    }
                }
            }
            attributeset.recycle();
            attributeset = context;
            if (j == 0)
            {
                break label0;
            }
            if (context instanceof ContextThemeWrapper)
            {
                attributeset = context;
                if (((ContextThemeWrapper)context).a() == j)
                {
                    break label0;
                }
            }
            attributeset = new ContextThemeWrapper(context, j);
        }
        return attributeset;
    }

    private View a(Context context, String s1, AttributeSet attributeset)
    {
        String s2;
        s2 = s1;
        if (s1.equals("view"))
        {
            s2 = attributeset.getAttributeValue(null, "class");
        }
        c[0] = context;
        c[1] = attributeset;
        if (-1 != s2.indexOf('.'))
        {
            break MISSING_BLOCK_LABEL_74;
        }
        context = a(context, s2, "android.widget.");
        c[0] = null;
        c[1] = null;
        return context;
        try
        {
            context = a(context, s2, ((String) (null)));
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            c[0] = null;
            c[1] = null;
            return null;
        }
        finally
        {
            c[0] = null;
        }
        c[0] = null;
        c[1] = null;
        return context;
        c[1] = null;
        throw context;
    }

    private View a(Context context, String s1, String s2)
    {
        Object obj;
        Constructor constructor;
        constructor = (Constructor)b.get(s1);
        obj = constructor;
        if (constructor != null) goto _L2; else goto _L1
_L1:
        try
        {
            obj = context.getClassLoader();
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return null;
        }
        if (s2 == null)
        {
            break MISSING_BLOCK_LABEL_104;
        }
        context = (new StringBuilder()).append(s2).append(s1).toString();
_L3:
        obj = ((ClassLoader) (obj)).loadClass(context).asSubclass(android/view/View).getConstructor(a);
        b.put(s1, obj);
_L2:
        ((Constructor) (obj)).setAccessible(true);
        context = (View)((Constructor) (obj)).newInstance(c);
        return context;
        context = s1;
          goto _L3
    }

    public final View a(View view, String s1, Context context, AttributeSet attributeset, boolean flag, boolean flag1, boolean flag2)
    {
label0:
        {
            Object obj;
            byte byte0;
            if (flag && view != null)
            {
                view = view.getContext();
            } else
            {
                view = context;
            }
            if (!flag1)
            {
                obj = view;
                if (!flag2)
                {
                    break label0;
                }
            }
            obj = a(((Context) (view)), attributeset, flag1, flag2);
        }
        byte0 = -1;
        s1.hashCode();
        JVM INSTR lookupswitch 10: default 136
    //                   -1946472170: 314
    //                   -1455429095: 268
    //                   -1346021293: 298
    //                   -938935918: 346
    //                   -339785223: 223
    //                   776382189: 253
    //                   1413872058: 283
    //                   1601505219: 238
    //                   1666676343: 208
    //                   2001146706: 330;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11
_L1:
        break; /* Loop/switch isn't completed */
_L5:
        break MISSING_BLOCK_LABEL_346;
_L12:
        switch (byte0)
        {
        default:
            if (context != obj)
            {
                return a(((Context) (obj)), s1, attributeset);
            } else
            {
                return null;
            }

        case 0: // '\0'
            return new t(((Context) (obj)), attributeset);

        case 1: // '\001'
            return new x(((Context) (obj)), attributeset);

        case 2: // '\002'
            return new r(((Context) (obj)), attributeset);

        case 3: // '\003'
            return new v(((Context) (obj)), attributeset);

        case 4: // '\004'
            return new s(((Context) (obj)), attributeset);

        case 5: // '\005'
            return new p(((Context) (obj)), attributeset);

        case 6: // '\006'
            return new u(((Context) (obj)), attributeset);

        case 7: // '\007'
            return new w(((Context) (obj)), attributeset);

        case 8: // '\b'
            return new q(((Context) (obj)), attributeset);

        case 9: // '\t'
            return new y(((Context) (obj)), attributeset);
        }
_L10:
        if (s1.equals("EditText"))
        {
            byte0 = 0;
        }
          goto _L12
_L6:
        if (s1.equals("Spinner"))
        {
            byte0 = 1;
        }
          goto _L12
_L9:
        if (s1.equals("CheckBox"))
        {
            byte0 = 2;
        }
          goto _L12
_L7:
        if (s1.equals("RadioButton"))
        {
            byte0 = 3;
        }
          goto _L12
_L3:
        if (s1.equals("CheckedTextView"))
        {
            byte0 = 4;
        }
          goto _L12
_L8:
        if (s1.equals("AutoCompleteTextView"))
        {
            byte0 = 5;
        }
          goto _L12
_L4:
        if (s1.equals("MultiAutoCompleteTextView"))
        {
            byte0 = 6;
        }
          goto _L12
_L2:
        if (s1.equals("RatingBar"))
        {
            byte0 = 7;
        }
          goto _L12
_L11:
        if (s1.equals("Button"))
        {
            byte0 = 8;
        }
          goto _L12
        if (s1.equals("TextView"))
        {
            byte0 = 9;
        }
          goto _L12
    }

}
