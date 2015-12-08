// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class ViewCompatEclairMr1
{

    public static final String TAG = "ViewCompat";
    private static Method sChildrenDrawingOrderMethod;

    ViewCompatEclairMr1()
    {
    }

    public static boolean isOpaque(View view)
    {
        return view.isOpaque();
    }

    public static void setChildrenDrawingOrderEnabled(ViewGroup viewgroup, boolean flag)
    {
        if (sChildrenDrawingOrderMethod == null)
        {
            try
            {
                sChildrenDrawingOrderMethod = android/view/ViewGroup.getDeclaredMethod("setChildrenDrawingOrderEnabled", new Class[] {
                    Boolean.TYPE
                });
            }
            catch (NoSuchMethodException nosuchmethodexception)
            {
                Log.e("ViewCompat", "Unable to find childrenDrawingOrderEnabled", nosuchmethodexception);
            }
            sChildrenDrawingOrderMethod.setAccessible(true);
        }
        try
        {
            sChildrenDrawingOrderMethod.invoke(viewgroup, new Object[] {
                Boolean.valueOf(flag)
            });
            return;
        }
        // Misplaced declaration of an exception variable
        catch (ViewGroup viewgroup)
        {
            Log.e("ViewCompat", "Unable to invoke childrenDrawingOrderEnabled", viewgroup);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (ViewGroup viewgroup)
        {
            Log.e("ViewCompat", "Unable to invoke childrenDrawingOrderEnabled", viewgroup);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (ViewGroup viewgroup)
        {
            Log.e("ViewCompat", "Unable to invoke childrenDrawingOrderEnabled", viewgroup);
        }
    }
}
