// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.util.ui;

import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

public final class MotionUtils
{

    private MotionUtils()
    {
    }

    public static String actionToString(MotionEvent motionevent)
    {
        int i = motionevent.getAction();
        switch (i)
        {
        case 5: // '\005'
        case 6: // '\006'
        default:
            int j = (0xff00 & i) >> 8;
            switch (i & 0xff)
            {
            default:
                return Integer.toString(i);

            case 5: // '\005'
                return (new StringBuilder()).append("ACTION_POINTER_DOWN(").append(motionevent.getPointerId(j)).append(')').toString();

            case 6: // '\006'
                return (new StringBuilder()).append("ACTION_POINTER_UP(").append(motionevent.getPointerId(j)).append(')').toString();
            }

        case 0: // '\0'
            return "ACTION_DOWN";

        case 1: // '\001'
            return "ACTION_UP";

        case 3: // '\003'
            return "ACTION_CANCEL";

        case 4: // '\004'
            return "ACTION_OUTSIDE";

        case 2: // '\002'
            return "ACTION_MOVE";

        case 7: // '\007'
            return "ACTION_HOVER_MOVE";

        case 8: // '\b'
            return "ACTION_SCROLL";

        case 9: // '\t'
            return "ACTION_HOVER_ENTER";

        case 10: // '\n'
            return "ACTION_HOVER_EXIT";
        }
    }

    public static void convertToRaw(int ai[], View view)
    {
        int ai1[] = new int[2];
        int[] _tmp = ai1;
        ai1[0] = 0;
        ai1[1] = 0;
        view.getLocationOnScreen(ai1);
        ai[0] = ai[0] + ai1[0];
        ai[1] = ai[1] + ai1[1];
    }

    public static void logSamples(MotionEvent motionevent, String s, boolean flag, View view)
    {
        int i1 = motionevent.getPointerCount();
        if (flag)
        {
            int j1 = motionevent.getHistorySize();
            for (int i = 0; i < j1; i++)
            {
                Log.d(s, String.format("At prior time %d:", new Object[] {
                    Long.valueOf(motionevent.getHistoricalEventTime(i))
                }));
                for (int k = 0; k < i1; k++)
                {
                    Log.d(s, String.format("... pointer %d: (%.1f,%.1f)", new Object[] {
                        Integer.valueOf(motionevent.getPointerId(k)), Float.valueOf(motionevent.getHistoricalX(k, i)), Float.valueOf(motionevent.getHistoricalY(k, i))
                    }));
                }

            }

        }
        Log.d(s, String.format("At event time %d:", new Object[] {
            Long.valueOf(motionevent.getEventTime())
        }));
        int ai[] = new int[2];
        int[] _tmp = ai;
        ai[0] = 0;
        ai[1] = 0;
        if (view != null)
        {
            view.getLocationOnScreen(ai);
        }
        Log.d(s, String.format("... pointer %d: (%.1f,%.1f), raw (%.1f,%.1f)", new Object[] {
            Integer.valueOf(motionevent.getPointerId(0)), Float.valueOf(motionevent.getX(0)), Float.valueOf(motionevent.getY(0)), Float.valueOf(motionevent.getRawX()), Float.valueOf(motionevent.getRawY())
        }));
        int j = 1;
        while (j < i1) 
        {
            float f = motionevent.getX(j);
            float f1 = motionevent.getY(j);
            int l = motionevent.getPointerId(j);
            if (view == null)
            {
                Log.d(s, String.format("... pointer %d: (%.1f,%.1f), raw (unknown, unknown)", new Object[] {
                    Integer.valueOf(l), Float.valueOf(f), Float.valueOf(f1)
                }));
            } else
            {
                Log.d(s, String.format("... pointer %d: (%.1f,%.1f), raw (%.1f,%.1f)", new Object[] {
                    Integer.valueOf(l), Float.valueOf(f), Float.valueOf(f1), Float.valueOf((float)ai[0] + f), Float.valueOf((float)ai[1] + f1)
                }));
            }
            j++;
        }
    }
}
