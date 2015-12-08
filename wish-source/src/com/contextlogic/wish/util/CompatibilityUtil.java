// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.util;

import android.app.Activity;
import android.graphics.Paint;
import android.hardware.Camera;
import android.net.Uri;
import android.view.View;
import android.widget.DatePicker;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class CompatibilityUtil
{

    private static Method getNumberOfCamerasMethod = getMethod(android/hardware/Camera, "getNumberOfCameras", new Class[0]);
    private static Method getReferrerMethod = getMethod(android/app/Activity, "getReferrer", new Class[0]);
    private static Method openCameraMethod;
    private static Method setLayerTypeMethod;
    private static Method setLayoutDirectionMethod;
    private static Method setMaxDateMethod;
    private static Method setMinDateMethod;

    public CompatibilityUtil()
    {
    }

    public static void disableHardwareAcceleration(View view)
    {
        try
        {
            if (setLayerTypeMethod != null)
            {
                setLayerTypeMethod.invoke(view, new Object[] {
                    Integer.valueOf(1), null
                });
            }
            return;
        }
        // Misplaced declaration of an exception variable
        catch (View view)
        {
            return;
        }
    }

    public static int getCameraRotation(int i, int j, boolean flag)
    {
        if (j == -1)
        {
            return 180;
        }
        Class class1;
        Object obj1;
        obj1 = Class.forName("android.hardware.Camera");
        class1 = Class.forName("android.hardware.Camera$CameraInfo");
        Object obj;
        Field field;
        Field field1;
        obj = null;
        field = null;
        field1 = null;
        if (class1 == null)
        {
            break MISSING_BLOCK_LABEL_42;
        }
        obj = class1.newInstance();
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_68;
        }
        field = obj.getClass().getField("facing");
        field1 = obj.getClass().getField("orientation");
        int k;
        obj1 = ((Class) (obj1)).getMethod("getCameraInfo", new Class[] {
            Integer.TYPE, class1
        });
        break MISSING_BLOCK_LABEL_92;
_L2:
        return (k + j) % 360;
        if (obj1 != null && class1 != null && field != null && field1 != null)
        {
            try
            {
                ((Method) (obj1)).invoke(null, new Object[] {
                    Integer.valueOf(i), obj
                });
                i = field.getInt(obj);
                k = field1.getInt(obj);
                break MISSING_BLOCK_LABEL_149;
            }
            catch (Throwable throwable) { }
        }
        return 180;
        if (flag)
        {
            if (i == 1)
            {
                return (360 - (k + j) % 360) % 360;
            } else
            {
                return ((k - j) + 360) % 360;
            }
        }
        if (i == 1)
        {
            return ((k - j) + 360) % 360;
        }
        if (true) goto _L2; else goto _L1
_L1:
    }

    private static transient Method getMethod(Class class1, String s, Class aclass[])
    {
        try
        {
            class1 = class1.getMethod(s, aclass);
        }
        // Misplaced declaration of an exception variable
        catch (Class class1)
        {
            return null;
        }
        return class1;
    }

    public static int getNumberOfCameras()
    {
        int i;
        if (getNumberOfCamerasMethod == null)
        {
            break MISSING_BLOCK_LABEL_27;
        }
        i = ((Integer)getNumberOfCamerasMethod.invoke(null, new Object[0])).intValue();
        return i;
        Throwable throwable;
        throwable;
        return 1;
    }

    public static Uri getReferrer(Activity activity)
    {
label0:
        {
            try
            {
                if (getReferrerMethod == null)
                {
                    break label0;
                }
                activity = (Uri)getReferrerMethod.invoke(activity, new Object[] {
                    (Object)null
                });
            }
            // Misplaced declaration of an exception variable
            catch (Activity activity)
            {
                return null;
            }
            return activity;
        }
        return null;
    }

    public static Camera openCamera(int i)
    {
        Camera camera;
        try
        {
            if (openCameraMethod != null)
            {
                return (Camera)openCameraMethod.invoke(null, new Object[] {
                    Integer.valueOf(i)
                });
            }
            camera = Camera.open();
        }
        catch (Throwable throwable)
        {
            return null;
        }
        return camera;
    }

    public static void optimizeLayoutDirection(View view)
    {
        try
        {
            if (setLayoutDirectionMethod != null)
            {
                setLayoutDirectionMethod.invoke(view, new Object[] {
                    Integer.valueOf(0)
                });
            }
            return;
        }
        // Misplaced declaration of an exception variable
        catch (View view)
        {
            return;
        }
    }

    public static void setDatePickerMaxDateMethod(DatePicker datepicker, long l)
    {
        try
        {
            if (setMaxDateMethod != null)
            {
                setMaxDateMethod.invoke(datepicker, new Object[] {
                    Long.valueOf(l)
                });
            }
            return;
        }
        // Misplaced declaration of an exception variable
        catch (DatePicker datepicker)
        {
            return;
        }
    }

    public static void setDatePickerMinDateMethod(DatePicker datepicker, long l)
    {
        try
        {
            if (setMinDateMethod != null)
            {
                setMinDateMethod.invoke(datepicker, new Object[] {
                    Long.valueOf(l)
                });
            }
            return;
        }
        // Misplaced declaration of an exception variable
        catch (DatePicker datepicker)
        {
            return;
        }
    }

    static 
    {
        setLayerTypeMethod = getMethod(android/view/View, "setLayerType", new Class[] {
            Integer.TYPE, android/graphics/Paint
        });
        setLayoutDirectionMethod = getMethod(android/view/View, "setLayoutDirection", new Class[] {
            Integer.TYPE
        });
        openCameraMethod = getMethod(android/hardware/Camera, "open", new Class[] {
            Integer.TYPE
        });
        setMinDateMethod = getMethod(android/widget/DatePicker, "setMinDate", new Class[] {
            Long.TYPE
        });
        setMaxDateMethod = getMethod(android/widget/DatePicker, "setMaxDate", new Class[] {
            Long.TYPE
        });
    }
}
