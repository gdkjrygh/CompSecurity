// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.view.MotionEvent;

public class MotionEventCompat
{

    static final MotionEventVersionImpl IMPL;

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

    public static int getPointerCount(MotionEvent motionevent)
    {
        return IMPL.getPointerCount(motionevent);
    }

    public static int getPointerId(MotionEvent motionevent, int i)
    {
        return IMPL.getPointerId(motionevent, i);
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
        if (android.os.Build.VERSION.SDK_INT >= 5)
        {
            IMPL = new EclairMotionEventVersionImpl();
        } else
        {
            IMPL = new BaseMotionEventVersionImpl();
        }
    }

    private class MotionEventVersionImpl
    {

        public abstract int findPointerIndex(MotionEvent motionevent, int i);

        public abstract int getPointerCount(MotionEvent motionevent);

        public abstract int getPointerId(MotionEvent motionevent, int i);

        public abstract float getX(MotionEvent motionevent, int i);

        public abstract float getY(MotionEvent motionevent, int i);
    }


    private class EclairMotionEventVersionImpl
        implements MotionEventVersionImpl
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


    private class BaseMotionEventVersionImpl
        implements MotionEventVersionImpl
    {

        private static final String z[];

        public int findPointerIndex(MotionEvent motionevent, int i)
        {
            return i != 0 ? -1 : 0;
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
                throw new IndexOutOfBoundsException(z[1]);
            }
        }

        public float getX(MotionEvent motionevent, int i)
        {
            if (i == 0)
            {
                float f;
                try
                {
                    f = motionevent.getX();
                }
                // Misplaced declaration of an exception variable
                catch (MotionEvent motionevent)
                {
                    throw motionevent;
                }
                return f;
            } else
            {
                throw new IndexOutOfBoundsException(z[2]);
            }
        }

        public float getY(MotionEvent motionevent, int i)
        {
            if (i == 0)
            {
                float f;
                try
                {
                    f = motionevent.getY();
                }
                // Misplaced declaration of an exception variable
                catch (MotionEvent motionevent)
                {
                    throw motionevent;
                }
                return f;
            } else
            {
                throw new IndexOutOfBoundsException(z[0]);
            }
        }

        static 
        {
            String as[];
            byte byte1;
            int i;
            as = new String[3];
            byte1 = -1;
            i = 0;
_L2:
            String as1[];
            Object obj;
            int j;
            int k;
            as1 = as;
            obj = "h'\021\007\026[9\025C!\0301\033O \030;\033^sK \004Z<J!TG&T!\035Z?]u\004E:V!\021X ".toCharArray();
            k = obj.length;
            j = 0;
_L8:
label0:
            {
                if (k > j)
                {
                    break label0;
                }
                obj = (new String(((char []) (obj)))).intern();
                switch (byte1)
                {
                default:
                    as1[i] = ((String) (obj));
                    i = 1;
                    byte1 = 0;
                    break;

                case 0: // '\0'
                    as1[i] = ((String) (obj));
                    i = 2;
                    byte1 = 1;
                    break;

                case 1: // '\001'
                    as1[i] = ((String) (obj));
                    z = as;
                    return;
                }
            }
            if (true) goto _L2; else goto _L1
_L1:
            char c = obj[j];
            j % 5;
            JVM INSTR tableswitch 0 3: default 148
        //                       0 169
        //                       1 175
        //                       2 181
        //                       3 187;
               goto _L3 _L4 _L5 _L6 _L7
_L7:
            break MISSING_BLOCK_LABEL_187;
_L3:
            byte byte0 = 83;
_L9:
            obj[j] = (char)(byte0 ^ c);
            j++;
              goto _L8
_L4:
            byte0 = 56;
              goto _L9
_L5:
            byte0 = 85;
              goto _L9
_L6:
            byte0 = 116;
              goto _L9
            byte0 = 42;
              goto _L9
        }

        BaseMotionEventVersionImpl()
        {
        }
    }

}
