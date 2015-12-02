// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.view.MotionEvent;

class 
    implements 
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
    //                   0 169
    //                   1 175
    //                   2 181
    //                   3 187;
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

    ()
    {
    }
}
