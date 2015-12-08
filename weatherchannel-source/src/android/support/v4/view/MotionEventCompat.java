// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.view.MotionEvent;

// Referenced classes of package android.support.v4.view:
//            MotionEventCompatEclair, MotionEventCompatGingerbread, MotionEventCompatHoneycombMr1

public class MotionEventCompat
{
    static class BaseMotionEventVersionImpl
        implements MotionEventVersionImpl
    {

        public int findPointerIndex(MotionEvent motionevent, int i)
        {
            return i != 0 ? -1 : 0;
        }

        public float getAxisValue(MotionEvent motionevent, int i)
        {
            return 0.0F;
        }

        public float getAxisValue(MotionEvent motionevent, int i, int j)
        {
            return 0.0F;
        }

        public int getPointerCount(MotionEvent motionevent)
        {
            return 1;
        }

        public int getPointerId(MotionEvent motionevent, int i)
        {
            if (i == 0)
            {
                return 0;
            } else
            {
                throw new IndexOutOfBoundsException("Pre-Eclair does not support multiple pointers");
            }
        }

        public int getSource(MotionEvent motionevent)
        {
            return 0;
        }

        public float getX(MotionEvent motionevent, int i)
        {
            if (i == 0)
            {
                return motionevent.getX();
            } else
            {
                throw new IndexOutOfBoundsException("Pre-Eclair does not support multiple pointers");
            }
        }

        public float getY(MotionEvent motionevent, int i)
        {
            if (i == 0)
            {
                return motionevent.getY();
            } else
            {
                throw new IndexOutOfBoundsException("Pre-Eclair does not support multiple pointers");
            }
        }

        BaseMotionEventVersionImpl()
        {
        }
    }

    static class EclairMotionEventVersionImpl extends BaseMotionEventVersionImpl
    {

        public int findPointerIndex(MotionEvent motionevent, int i)
        {
            return MotionEventCompatEclair.findPointerIndex(motionevent, i);
        }

        public int getPointerCount(MotionEvent motionevent)
        {
            return MotionEventCompatEclair.getPointerCount(motionevent);
        }

        public int getPointerId(MotionEvent motionevent, int i)
        {
            return MotionEventCompatEclair.getPointerId(motionevent, i);
        }

        public float getX(MotionEvent motionevent, int i)
        {
            return MotionEventCompatEclair.getX(motionevent, i);
        }

        public float getY(MotionEvent motionevent, int i)
        {
            return MotionEventCompatEclair.getY(motionevent, i);
        }

        EclairMotionEventVersionImpl()
        {
        }
    }

    static class GingerbreadMotionEventVersionImpl extends EclairMotionEventVersionImpl
    {

        public int getSource(MotionEvent motionevent)
        {
            return MotionEventCompatGingerbread.getSource(motionevent);
        }

        GingerbreadMotionEventVersionImpl()
        {
        }
    }

    static class HoneycombMr1MotionEventVersionImpl extends GingerbreadMotionEventVersionImpl
    {

        public float getAxisValue(MotionEvent motionevent, int i)
        {
            return MotionEventCompatHoneycombMr1.getAxisValue(motionevent, i);
        }

        public float getAxisValue(MotionEvent motionevent, int i, int j)
        {
            return MotionEventCompatHoneycombMr1.getAxisValue(motionevent, i, j);
        }

        HoneycombMr1MotionEventVersionImpl()
        {
        }
    }

    static interface MotionEventVersionImpl
    {

        public abstract int findPointerIndex(MotionEvent motionevent, int i);

        public abstract float getAxisValue(MotionEvent motionevent, int i);

        public abstract float getAxisValue(MotionEvent motionevent, int i, int j);

        public abstract int getPointerCount(MotionEvent motionevent);

        public abstract int getPointerId(MotionEvent motionevent, int i);

        public abstract int getSource(MotionEvent motionevent);

        public abstract float getX(MotionEvent motionevent, int i);

        public abstract float getY(MotionEvent motionevent, int i);
    }


    public static final int ACTION_HOVER_ENTER = 9;
    public static final int ACTION_HOVER_EXIT = 10;
    public static final int ACTION_HOVER_MOVE = 7;
    public static final int ACTION_MASK = 255;
    public static final int ACTION_POINTER_DOWN = 5;
    public static final int ACTION_POINTER_INDEX_MASK = 65280;
    public static final int ACTION_POINTER_INDEX_SHIFT = 8;
    public static final int ACTION_POINTER_UP = 6;
    public static final int ACTION_SCROLL = 8;
    public static final int AXIS_BRAKE = 23;
    public static final int AXIS_DISTANCE = 24;
    public static final int AXIS_GAS = 22;
    public static final int AXIS_GENERIC_1 = 32;
    public static final int AXIS_GENERIC_10 = 41;
    public static final int AXIS_GENERIC_11 = 42;
    public static final int AXIS_GENERIC_12 = 43;
    public static final int AXIS_GENERIC_13 = 44;
    public static final int AXIS_GENERIC_14 = 45;
    public static final int AXIS_GENERIC_15 = 46;
    public static final int AXIS_GENERIC_16 = 47;
    public static final int AXIS_GENERIC_2 = 33;
    public static final int AXIS_GENERIC_3 = 34;
    public static final int AXIS_GENERIC_4 = 35;
    public static final int AXIS_GENERIC_5 = 36;
    public static final int AXIS_GENERIC_6 = 37;
    public static final int AXIS_GENERIC_7 = 38;
    public static final int AXIS_GENERIC_8 = 39;
    public static final int AXIS_GENERIC_9 = 40;
    public static final int AXIS_HAT_X = 15;
    public static final int AXIS_HAT_Y = 16;
    public static final int AXIS_HSCROLL = 10;
    public static final int AXIS_LTRIGGER = 17;
    public static final int AXIS_ORIENTATION = 8;
    public static final int AXIS_PRESSURE = 2;
    public static final int AXIS_RTRIGGER = 18;
    public static final int AXIS_RUDDER = 20;
    public static final int AXIS_RX = 12;
    public static final int AXIS_RY = 13;
    public static final int AXIS_RZ = 14;
    public static final int AXIS_SIZE = 3;
    public static final int AXIS_THROTTLE = 19;
    public static final int AXIS_TILT = 25;
    public static final int AXIS_TOOL_MAJOR = 6;
    public static final int AXIS_TOOL_MINOR = 7;
    public static final int AXIS_TOUCH_MAJOR = 4;
    public static final int AXIS_TOUCH_MINOR = 5;
    public static final int AXIS_VSCROLL = 9;
    public static final int AXIS_WHEEL = 21;
    public static final int AXIS_X = 0;
    public static final int AXIS_Y = 1;
    public static final int AXIS_Z = 11;
    static final MotionEventVersionImpl IMPL;

    public MotionEventCompat()
    {
    }

    public static int findPointerIndex(MotionEvent motionevent, int i)
    {
        return IMPL.findPointerIndex(motionevent, i);
    }

    public static int getActionIndex(MotionEvent motionevent)
    {
        return (motionevent.getAction() & 0xff00) >> 8;
    }

    public static int getActionMasked(MotionEvent motionevent)
    {
        return motionevent.getAction() & 0xff;
    }

    public static float getAxisValue(MotionEvent motionevent, int i)
    {
        return IMPL.getAxisValue(motionevent, i);
    }

    public static float getAxisValue(MotionEvent motionevent, int i, int j)
    {
        return IMPL.getAxisValue(motionevent, i, j);
    }

    public static int getPointerCount(MotionEvent motionevent)
    {
        return IMPL.getPointerCount(motionevent);
    }

    public static int getPointerId(MotionEvent motionevent, int i)
    {
        return IMPL.getPointerId(motionevent, i);
    }

    public static int getSource(MotionEvent motionevent)
    {
        return IMPL.getSource(motionevent);
    }

    public static float getX(MotionEvent motionevent, int i)
    {
        return IMPL.getX(motionevent, i);
    }

    public static float getY(MotionEvent motionevent, int i)
    {
        return IMPL.getY(motionevent, i);
    }

    static 
    {
        if (android.os.Build.VERSION.SDK_INT >= 12)
        {
            IMPL = new HoneycombMr1MotionEventVersionImpl();
        } else
        if (android.os.Build.VERSION.SDK_INT >= 9)
        {
            IMPL = new GingerbreadMotionEventVersionImpl();
        } else
        if (android.os.Build.VERSION.SDK_INT >= 5)
        {
            IMPL = new EclairMotionEventVersionImpl();
        } else
        {
            IMPL = new BaseMotionEventVersionImpl();
        }
    }
}
