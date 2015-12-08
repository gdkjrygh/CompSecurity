// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.hardware.display;

import android.content.Context;
import android.view.Display;
import android.view.WindowManager;
import java.util.WeakHashMap;

// Referenced classes of package android.support.v4.hardware.display:
//            DisplayManagerJellybeanMr1

public abstract class DisplayManagerCompat
{
    private static class JellybeanMr1Impl extends DisplayManagerCompat
    {

        private final Object mDisplayManagerObj;

        public Display getDisplay(int i)
        {
            return DisplayManagerJellybeanMr1.getDisplay(mDisplayManagerObj, i);
        }

        public Display[] getDisplays()
        {
            return DisplayManagerJellybeanMr1.getDisplays(mDisplayManagerObj);
        }

        public Display[] getDisplays(String s)
        {
            return DisplayManagerJellybeanMr1.getDisplays(mDisplayManagerObj, s);
        }

        public JellybeanMr1Impl(Context context)
        {
            mDisplayManagerObj = DisplayManagerJellybeanMr1.getDisplayManager(context);
        }
    }

    private static class LegacyImpl extends DisplayManagerCompat
    {

        private final WindowManager mWindowManager;

        public Display getDisplay(int i)
        {
            Display display = mWindowManager.getDefaultDisplay();
            if (display.getDisplayId() == i)
            {
                return display;
            } else
            {
                return null;
            }
        }

        public Display[] getDisplays()
        {
            return (new Display[] {
                mWindowManager.getDefaultDisplay()
            });
        }

        public Display[] getDisplays(String s)
        {
            if (s == null)
            {
                return getDisplays();
            } else
            {
                return new Display[0];
            }
        }

        public LegacyImpl(Context context)
        {
            mWindowManager = (WindowManager)context.getSystemService("window");
        }
    }


    public static final String DISPLAY_CATEGORY_PRESENTATION = "android.hardware.display.category.PRESENTATION";
    private static final WeakHashMap sInstances = new WeakHashMap();

    DisplayManagerCompat()
    {
    }

    public static DisplayManagerCompat getInstance(Context context)
    {
        WeakHashMap weakhashmap = sInstances;
        weakhashmap;
        JVM INSTR monitorenter ;
        DisplayManagerCompat displaymanagercompat = (DisplayManagerCompat)sInstances.get(context);
        Object obj = displaymanagercompat;
        if (displaymanagercompat != null) goto _L2; else goto _L1
_L1:
        if (android.os.Build.VERSION.SDK_INT < 17)
        {
            break MISSING_BLOCK_LABEL_53;
        }
        obj = new JellybeanMr1Impl(context);
_L3:
        sInstances.put(context, obj);
_L2:
        weakhashmap;
        JVM INSTR monitorexit ;
        return ((DisplayManagerCompat) (obj));
        obj = new LegacyImpl(context);
          goto _L3
        context;
        weakhashmap;
        JVM INSTR monitorexit ;
        throw context;
    }

    public abstract Display getDisplay(int i);

    public abstract Display[] getDisplays();

    public abstract Display[] getDisplays(String s);

}
